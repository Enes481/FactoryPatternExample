package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ICreator creator = CreatorFactory.getStudentCreator();
        IObject object = creator.getInstance();
        System.out.println(object.objectCreator());
    }
}
