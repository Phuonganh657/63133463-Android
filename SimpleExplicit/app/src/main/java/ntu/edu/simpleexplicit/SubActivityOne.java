package ntu.edu.simpleexplicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);

    }
    //Hàm đáp ứng sự kiện nhấn lên nút "Quay lại trang chủ"
    //Xử lý chuyển về màn hình trang chủ
    public void QuayVe(View v){
        //Tạo một đối tượng Intent
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thực hiện chuyển
        startActivity(iManHinhCHINH);
    }
}
