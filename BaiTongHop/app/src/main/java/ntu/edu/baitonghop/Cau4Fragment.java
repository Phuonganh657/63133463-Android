package ntu.edu.baitonghop;

import static ntu.edu.baitonghop.R.id.lvTenSach;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Cau4Fragment extends Fragment {




    public Cau4Fragment() {
        // Required empty public constructor
    }


    public static Cau4Fragment newInstance(String param1, String param2) {
        Cau4Fragment fragment = new Cau4Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", Context.MODE_PRIVATE, null);
        //chạy
        // B1. Tạo bảng
        // câu lêệnh tạo bảng
        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Books;";

        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                "BookName text, " +
                "Page integer, " +
                "Price Float, " + "Description text);";
        // thực hiện lệnh sql

        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'sách về java');";
        String sqlThem2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
        String sqlThem3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');";
        String sqlThem4 = "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
        String sqlThem5 = "INSERT INTO Books VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        // Để quan sát trực quan file .db ? ==> Dùng ứng dụng DB Browser for SQLite
        // Để mở được, ta file save file từ điện thoại ra đĩa cứng

        // Ta đóng lại để check
        db.close();

        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", Context.MODE_PRIVATE, null);
        //B2. Thực thi câu lệnh select
        String sqlSelect = "Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect, null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên

        // B3: Đổ vào biến nào đó để xử lý
        // 3.1. Xây dựng model/class cho bảng Books, vi dụ: Book.java
        // 3.2. Tạo biến ArrayList<Book> dsSach;
        ArrayList<book> dsTenSach = new ArrayList<book>();
        //3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int idSach = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            // Tạo một đối tượng sách và thêm vào danh sách
            book b = new book(idSach, tenSach, soTrang, gia, mota);
            dsSach.add(b);
        }
        //B4, Hiện lên listview, recylerview,..
        ArrayList<String> dsSach = new ArrayList<String>();
        for (int i = 0; i < dsSach.size(); i++)
            dsTenSach.add(dsSach.get(i).getBookName());


    ArrayList<book> getDataForRY() {
        //B1. Mở CSDL
        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", Context.MODE_PRIVATE, null);
        //B2. Thực thi câu lệnh select
        String sqlSelect ="Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hàng đầu tiên
        // B3: Đổ vào biến nào đó để xử lý
        // 3.1. Xây dựng model/class cho bảng Books, vi dụ: Book.java
        // 3.2. Tạo biến ArrayList<Book> dsSach;
        ArrayList<book> dsSach = new ArrayList<book>();
        //3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int idSach = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenSach = cs.getString(1);int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            // Tạo một đối tượng sách và thêm vào danh sách
            book b = new book(idSach,tenSach,soTrang,gia,mota);
            dsSach.add(b);
        }
            ArrayList<String> dsSach = new ArrayList<String>();
            for (int i = 0; i < dsSach.size(); i++)
                dsTenSach.add(dsSach.get(i).getBookName());


        View viewCau4 = inflater.inflate(R.layout.fragment_cau4, container, false);
            ListView listViewTenSach = viewCau4.findViewById(lvTenSach);
            ArrayAdapter<String> adapterTenSach = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, dsTenSach);
            listViewTenSach.setAdapter(adapterTenSach);
            //lắng nghe và xử lý

        return viewCau4;

    }
}