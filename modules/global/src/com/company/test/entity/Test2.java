package com.company.test.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.Entity;

@Entity(name = "test_Test2")
@Extends(Test.class)
public class Test2 extends Test {
    private static final long serialVersionUID = 4009089102651859791L;
}