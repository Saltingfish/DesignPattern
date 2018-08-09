package com.example.Test;

import java.io.IOException;

public class deom {
    boolean i = true;
    String a;

    public deom(boolean i) {
        this.i = i;
        if (i) {
            throw new RuntimeException("s");
        }
        a = "2";
    }

    public static void main(String[] args) {
        deom deom = new deom(true);
    }
}
