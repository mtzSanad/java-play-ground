package com.msanad.basics;

import java.util.List;

public class RecordClassTest {

    public record LbaelValue(String label, String value){};

    public record TryList(List<String> x){};

    public static void main(String[] args) {


        LbaelValue lbaelValue = new LbaelValue("Moataz","Sanad");

        List<String> stringList = List.of("asdfa","gdsafgds");
        TryList tryList = new TryList(stringList);
//        stringList.add("fdgsfd");

        System.out.println(lbaelValue);
        System.out.println(tryList);
    }
}
