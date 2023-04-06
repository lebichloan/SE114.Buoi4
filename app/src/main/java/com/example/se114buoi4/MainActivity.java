package com.example.se114buoi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.sql.Date;
import java.util.Scanner;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;
import com.example.se114buoi4.SinhVien;

public class MainActivity extends AppCompatActivity {

    private ListView lv1;
    private SinhVien lst_array[]={};

    public SinhVien InputSinhVien()
    {
        String name1;
        String date1;
        String classs1;
        Scanner sc = new Scanner(System.in);
        name1 = sc.next();
        date1 = sc.next();
        classs1 = sc.next();
        SinhVien sv =new SinhVien(name1, date1, classs1);
        return sv;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView) findViewById(R.id.lv);
        for (int i=0; i<=3; i++)
        {
            lst_array[i] = InputSinhVien();
        }
        lv1.setAdapter(new ArrayAdapter<SinhVien>(this, android.R.layout.simple_list_item_1,lst_array));

    }
}

