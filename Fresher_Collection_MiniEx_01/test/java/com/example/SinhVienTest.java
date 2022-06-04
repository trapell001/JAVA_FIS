package com.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienTest {

    @Test
    void tinhDiemTrungBinh() {
        Diem diem1 = new Diem(new MonHoc("CTDL",3,1),8);
        Diem diem2 = new Diem(new MonHoc("OOP",2,1),7);
        Diem diem3 = new Diem(new MonHoc("Anh Văn",2,1),8);
        Set<Diem> dsDiem = new HashSet<>();
        dsDiem.add(diem1);
        dsDiem.add(diem2);
        dsDiem.add(diem3);
        SinhVien sv = new SinhVien("ABC123","Nguyen Kien", dsDiem);
        System.out.println(sv.tinhDiemTrungBinh());
    }
}