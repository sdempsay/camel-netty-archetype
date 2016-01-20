package ${package}.${rootArtifactId}.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class SampleRouteBuilder extends RouteBuilder {

  @Override
      public void configure() throws Exception {
        CamelContext camelContext = this.getContext();
        camelContext.setAllowUseOriginalMessage(false);

	// TODO: Add route logic here
      }
}
