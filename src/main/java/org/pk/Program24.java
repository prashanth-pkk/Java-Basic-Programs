package org.pk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program24 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i=0;i< arr.length; i++){
            arr[i] = i/2;
            arr[i]++;
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
