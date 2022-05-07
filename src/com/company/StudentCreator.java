package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class StudentCreator implements ICreator{

    @Override
    public IObject getInstance() {
        return new Student();
    }
}
