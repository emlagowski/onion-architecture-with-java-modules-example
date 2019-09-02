module api {
    requires domain;

    requires spring.web;
    requires reactor.core;
    requires spring.context;

    opens io.github.emlagowski.personion.api.people;
}