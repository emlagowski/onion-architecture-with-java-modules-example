module restapi {
    requires domain;

    requires spring.web;
    requires reactor.core;

    opens io.github.emlagowski.springbootwithmodules.api.rest;
}