package com.example.se114buoi4;

import java.sql.Date;

public class SinhVien {
    private String name;
    private String date;
    private String classs;
    SinhVien(String name1, String date1, String classs1)
    {
        this.name = name1;
        this.date = date1;
        this.classs = classs1;
    }

    public SinhVien GetSinhVien()
    {
        return this;
    }

    public void SetSinhVien(String name1, String date1, String classs1)
    {
        this.name = name1;
        this.date = date1;
        this.classs = classs1;
    }


}
