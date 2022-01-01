package com.msanad.basics.switchtest;

public class SwitchExpresssionTest {
    public static void main(String[] args) {
        var x = 0;
        var y = switch (x){
            case 0 -> {
                System.out.println("0");
                yield 0;
            }
            case 1 ->  {
                System.out.println("1");
                yield 1;
            }
            default -> 2;
        };
        System.out.println(x);


        var z = switch (x){
            case 0 :yield 0;
            case 1 :yield 1;
            default : yield  2;
        };
        System.out.println(z);
    }
}
