package ${package}.${rootArtifactId}.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.scr.AbstractCamelRunner;
import org.apache.camel.spi.ComponentResolver;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.apache.felix.scr.annotations.ReferencePolicyOption;
import org.apache.felix.scr.annotations.References;
import org.apache.felix.scr.annotations.Service;

@Service(SampleRouteRunner.class)
@Component(metatype=true, immediate=true)
@Properties({
  @Property(name = "camelContextId", value = "${rootArtifactId}-context"),
  @Property(name = "active", value = "true", propertyPrivate=true)
})
@References({
  @Reference(name = "camelComponent",referenceInterface = ComponentResolver.class,
    cardinality = ReferenceCardinality.MANDATORY_MULTIPLE, policy = ReferencePolicy.DYNAMIC,
    policyOption = ReferencePolicyOption.GREEDY, bind = "gotCamelComponent", unbind = "lostCamelComponent"),
})
public class SampleRouteRunner extends AbstractCamelRunner {
    @Override
	protected List<RoutesBuilder> getRouteBuilders() {
        return Arrays.asList(new SampleRouteBuilder());
    }

}
