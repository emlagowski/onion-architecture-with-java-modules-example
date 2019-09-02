module app {
    requires api;
    requires data;
    requires domain;

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires reactor.core;

    requires com.fasterxml.classmate;

    opens io.github.emlagowski.personion.app;
    opens io.github.emlagowski.personion.app.person;
}