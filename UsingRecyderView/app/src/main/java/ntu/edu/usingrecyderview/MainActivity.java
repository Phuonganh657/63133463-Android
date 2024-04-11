package ntu.edu.usingrecyderview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recylerViewDatas;
    RecyclerView recyclerViewLandspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3
        recylerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLandspace = findViewById(R.id.recyclerland);
        //5 hiện theo chieu đứng
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//        recyclerViewLandspace.setLayoutManager(layoutLinear);
        //chiều ngang
//        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerViewLandspace.setLayoutManager(layoutLinearHorizonal);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLandspace.setLayoutManager(layoutGrid);
        //6
        landScapeAdapter = new LandScapeAdapter(this,recylerViewDatas);
        //7
        recyclerViewLandspace.setAdapter(landScapeAdapter);

    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("hoguom","Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("danang","Toàn cảnh TP"));
        dsDuLieu.add(new LandScape("trangan","Ninh Bình"));
        dsDuLieu.add(new LandScape("thap eiffet","Pháp"));
        return dsDuLieu;
    }
}