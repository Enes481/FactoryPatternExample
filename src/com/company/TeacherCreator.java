package com.company;

public class TeacherCreator implements ICreator{

    @Override
    public IObject getInstance() {
        return new Teacher();
    }
}
