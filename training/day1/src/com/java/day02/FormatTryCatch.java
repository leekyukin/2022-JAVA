package com.java.day02;

public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";

        try {
            int a = Integer.parseInt(sNum);
            System.out.println(a);
        } catch(NumberFormatException e) {
            System.out.println("int 인지 확인 ㄱ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("잘 넣거라");
        } finally {
            System.out.println("나 수행 좀 하자 ");
        }


    }
}
