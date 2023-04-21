package com.generation.model;

public class Course
{
    private final String code;
    private final String name;
    private final int credits;
    private final Module module;
    private double grade; //added new class


    public Course( String code, String name, int credits, Module module )
    {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.module = module;
        grade = 0; //set default grade as zero
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public int getCredits()
    {
        return credits;
    }

    public Module getModule() {return module;}


    public String toString()
    {
        return "Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
                + module + '}';
    }
}
