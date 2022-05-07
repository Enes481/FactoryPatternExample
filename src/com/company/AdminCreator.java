package com.company;

public class AdminCreator implements ICreator{

    @Override
    public IObject getInstance() {
        return new Admin();
    }
}
