module restapi {
    requires spring.web;
    requires reactor.core;

    opens io.github.emlagowski.springbootwithmodules.api.rest;
}