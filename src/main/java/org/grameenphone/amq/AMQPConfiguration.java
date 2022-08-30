package org.grameenphone.amq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration parameters filled in from application.properties and overridden using env variables on Openshift.
 */
@Configuration
@ConfigurationProperties(prefix = "amq-camel")
public class AMQPConfiguration {

    /**
     * AMQ service name
     */
    private String serviceName;

    /**
     * AMQ service port
     */
    private String port;

    /**
     * AMQ username
     */
    private String username;

    /**
     * AMQ password
     */
    private String password;

    /**
     * AMQ parameters
     */
    private String parameters;

   
    /**
     * AMQ protocol (amqp or amqps)
     */
    private String protocol;

    public AMQPConfiguration() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "AMQPConfiguration{" +
                "serviceName='" + serviceName + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", protocol='" + protocol + '\'' +
                '}';
    }
}
