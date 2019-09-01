module data {
    requires domain;

    //requires spring.data.mongodb;

    requires reactor.core;
    requires spring.context;

    opens io.github.emlagowski.springbootwithmodules.data;
}