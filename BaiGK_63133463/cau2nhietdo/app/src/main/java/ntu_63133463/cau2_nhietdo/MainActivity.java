package ntu_63133463.cau2_nhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Khai bao bien giao dien
    EditText edtF, edtC;
    Button btnCF, btnFC, btnclear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtC = findViewById(R.id.edtC);
        edtF = findViewById(R.id.edtF);
        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);
        btnclear = findViewById(R.id.btnclear);
        //xu ly click
        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int C = Integer.parseInt(edtC.getText().toString());
                Double F = C*1.8 + 32;
                edtF.setText(F+"");

            }

        });
        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int C = Integer.parseInt(edtC.getText().toString());
                Double F = C*1.8 + 32;
                edtF.setText(F+"");

            }

        });
        


    }
}