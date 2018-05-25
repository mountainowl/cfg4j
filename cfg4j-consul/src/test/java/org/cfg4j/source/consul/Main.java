package org.cfg4j.source.consul;

import org.cfg4j.provider.ConfigurationProviderBuilder;
import org.cfg4j.source.ConfigurationSource;
import org.cfg4j.source.context.environment.ImmutableEnvironment;

public class Main {

  public static void main(String[] args) {
    ConfigurationSource source = new ConsulConfigurationSourceBuilder()
      .withHost("127.0.0.1")
      .withPort(8500)
      .build();

    new ConfigurationProviderBuilder()
      .withConfigurationSource(source)
      .withEnvironment(new ImmutableEnvironment("us-west-1"))
      .build();

  }
}
