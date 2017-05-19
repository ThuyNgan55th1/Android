package com.example.app;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listViewSinhVien);
        
        ArrayList <SinhVien> mangSinhVien = new ArrayList<SinhVien>();
        mangSinhVien.add(new SinhVien("Nguyen Van Teo", 1987));
        mangSinhVien.add(new SinhVien("Nguyen Van Ti", 1990));
        mangSinhVien.add(new SinhVien("Nguyen Van Tun", 1992));
        mangSinhVien.add(new SinhVien("Nguyen Van Tum", 1991));
        mangSinhVien.add(new SinhVien("Nguyen Van Teo", 1988));
        mangSinhVien.add(new SinhVien("Nguyen Van Ti", 1995));
        mangSinhVien.add(new SinhVien("Nguyen Van Tun", 1997));
        
        ListAdapter adapter = new ListAdapter(
        	MainActivity.this,
        	R.layout.activity_dong_sinh_vien,
        	mangSinhVien
        );
        lv.setAdapter(adapter);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
