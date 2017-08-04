package no.openjdk_test;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class OcApplication extends Application<OcConfiguration> {

    public static void main(String ... args) throws Exception {
        new OcApplication().run(args);
    }

    @Override
    public void run(OcConfiguration ocConfiguration, Environment environment) throws Exception {
        OcResource oc = new OcResource();
        environment.jersey().register(oc);
    }
}
