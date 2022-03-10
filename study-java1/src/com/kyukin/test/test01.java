package com.kyukin.test;



public class test01 {
    static int key = 83;
    static int[] list = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
    static int index;
    /*static boolean binarySearch(int start, int end) {

        int mid;
        if (start <= end) {
            mid = (start + end) / 2;
            index = mid + 1;
            if (key == list[mid]) return true;
            else if (key < list[mid]) return binarySearch(start, mid - 1);
            else if (key > list[mid]) return binarySearch(mid + 1, end);
        }
        return false;
    }*/
    public static boolean loop(int start, int end) {
        int mid;
        for(int i = start; i <= end; i++)
        {
            if(start <= end) {
                mid = (start + end) / 2 ;
                index = mid + 1;
                if(list[mid] == key) return true;
                else if (list[mid] > key) end = index;
                else if (list[mid] < key) start = index;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        boolean find = loop(0,9);

        if(find) {

            System.out.println("찾는 수가 "+ index +"번째 있습니다.");
        }
        else	System.out.println("찾는 수가 없습니다.");
    }
}
