package ntu.edu.simpleexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Hàm đáp ứng sự kiện nhấn lên nút "Sang màn hình khác
    //Xử lý chuyển màn hình
    public void ChuyenManHinh(View v){
        //Tạo một đối tượng Intent
        Intent iManHinhKhac = new Intent(this, SubActivityOne.class);
        // thực hiện chuyển
        startActivity(iManHinhKhac);
    }
}