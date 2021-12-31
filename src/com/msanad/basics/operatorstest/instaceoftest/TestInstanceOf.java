package com.msanad.basics.operatorstest.instaceoftest;

import com.msanad.common.Child;
import com.msanad.common.MyInterface;
import com.msanad.common.Parent;

public class TestInstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("Parent is instance of objec "+ (parent instanceof Object));
        System.out.println("Parent is instance of parent "+ (parent instanceof Parent));
        System.out.println("Child is instance of child "+ (child instanceof Child));
        System.out.println("Parent is instance of myinterface "+ (parent instanceof MyInterface));
        System.out.println("Child is instance of myinterface "+ (child instanceof MyInterface));
    }
}
