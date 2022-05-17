package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.example.resources.InventoryResource;

public class App extends Application<AppConfig> {

    public static void main(final String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "Inventory";
    }

    @Override
    public void initialize(final Bootstrap<AppConfig> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final AppConfig configuration,
                    final Environment environment) {
        final InventoryResource resource = new InventoryResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }

}
