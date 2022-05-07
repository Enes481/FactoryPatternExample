package com.company;

public class CreatorFactory {


    public static ICreator getStudentCreator()
    {
        return new StudentCreator();
    }
    public static ICreator getTeacherCreator()
    {
        return new TeacherCreator();
    }
    public static ICreator getAdminCreator()
    {
        return new AdminCreator();
    }

}
