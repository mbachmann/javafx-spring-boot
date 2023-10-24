open module com.example.javafxweaverexample {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    requires spring.context;
    requires spring.core;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.beans;
    requires spring.data.commons;

    requires org.slf4j;
    requires jakarta.persistence;
    requires java.logging;
    requires java.sql;
    requires spring.data.jpa;
    requires org.hibernate.orm.core;
    requires jakarta.annotation;

    exports com.example.javafxspringboot;
    exports com.example.javafxspringboot.entity;

}
