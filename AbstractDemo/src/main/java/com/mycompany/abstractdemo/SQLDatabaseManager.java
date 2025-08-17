package com.mycompany.abstractdemo;
public class SQLDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veri getirildi : SQL");
    }
}
