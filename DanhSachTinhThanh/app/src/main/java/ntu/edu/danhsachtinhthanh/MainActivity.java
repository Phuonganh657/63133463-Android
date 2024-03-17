package ntu.edu.danhsachtinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;//khai bao
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //Hiển thị dữ liệu lên ListView
        //B1+: Cần có dữ liệu
        //bài này, chúng ta hard-code dữ liệu trực tiếp
        //cần biến phù hợp
        //đã chuyển khai báo
        dsTenTinhThanhVN = new ArrayList<String>();//tạo
        //thêm dữ liệu ở dây
        //nhưng ta hard-code(cho sẵn
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        //b2: tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        //b3: gắn vào điều khiển hiển thị ListView
        //3.1 tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 lắng nghe và xử lý sự kiện user tương tác
        // gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);


    }
    //tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào một biến
    //vd: BoLangNghevaXL
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            //code xử lý ở đây
            // i là vị trí phần tử vừa được click
            //ví dụ khác, thay vì hiện vị trí, ta hiện giá trị
            //lay giá trị của phần tử thứ i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: "+String.valueOf(i),Toast.LENGTH_LONG ).show();

        }
    };
}