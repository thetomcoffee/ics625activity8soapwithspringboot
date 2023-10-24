/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metrostate.edu.ics625.mathapplication.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 *
 * @author Tom Coffee
 */
@EnableWs
@Configuration
public class WsConfig extends WsConfigurerAdapter {
    
    @Bean 
    public ServletRegistrationBean<MessageDispatcherServlet> 
        messageDispatcherServlet(@Autowired ApplicationContext ctx) {
            MessageDispatcherServlet s = new MessageDispatcherServlet();
            s.setApplicationContext(ctx);
            s.setTransformWsdlLocations(true);
            ServletRegistrationBean<MessageDispatcherServlet> sb = 
                    new ServletRegistrationBean<>(s, "/ws/*");
            return sb;
        }
        
    @Bean(name="math")  //name of the WSDL file, math.wsdl
    public DefaultWsdl11Definition defaultWsdl11(@Autowired XsdSchema xsd) {
        DefaultWsdl11Definition def = new DefaultWsdl11Definition();
        def.setPortTypeName("AddPort");
        def.setLocationUri("/ws");
        def.setTargetNamespace(AddEndpoint.NS);
        def.setSchema(xsd);
        return def;
    }
    
    @Bean
    public XsdSchema xsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("math.xsd"));
    }
}
