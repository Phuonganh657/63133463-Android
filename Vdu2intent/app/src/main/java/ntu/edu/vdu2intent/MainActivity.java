package ntu.edu.vdu2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Hàm đáp ứng sự kiện OnClick lên nút "Mở màn hình nhập liệu"
    public void NhapLieu(View v){
        //Tạo mới một Intent
        Intent iNhap = new Intent(this, NhapLieuActivity.class);
        //Chuyển sang màn hình nhập liệu
        startActivityForResult(iNhap,8000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==8000)
            if(resultCode==RESULT_OK){
                //Lấy dữ liệu gửi về
                //Ở đây, ta chú ý, dữ liệu được gửi về theo cặp Key(Name)
                //Ta bóc dữ liệu ra theo key
                String hotenNhanDuoc = data.getStringExtra("HT"); // HT là key ta đặt ở Activity nhập liệu
                int namsinhNhanDuoc = data.getIntExtra("NS", 2020);
                //Đưa lên điều khiển ta muốn hiện kết quả nhận được
                TextView tvHT = (TextView) findViewById(R.id.edHoTen);
                TextView tvNS = (TextView) findViewById(R.id.edNamSinh);
                tvHT.setText(hotenNhanDuoc);
                tvNS.setText(String.valueOf(namsinhNhanDuoc));
            }
        else
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT);
        else
            super.onActivityResult(requestCode, resultCode, data);


    }
}