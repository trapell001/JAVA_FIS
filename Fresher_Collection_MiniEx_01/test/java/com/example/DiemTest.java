package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiemTest {

    @Test
    void tongDiem() {
        Diem diem = new Diem(new MonHoc("ly",1,2),8);
        System.out.println(diem.tongDiem());
    }
}