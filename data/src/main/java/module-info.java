module data {
    requires domain;

    requires spring.data.mongodb;

    requires mongodb.driver.reactivestreams;

    requires reactor.core;
    requires spring.context;

    opens io.github.emlagowski.personion.data;
}