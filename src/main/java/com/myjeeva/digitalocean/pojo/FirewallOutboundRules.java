package com.myjeeva.digitalocean.pojo;

/**
 * Created by vhomyak on 29.11.2017.
 */
public class FirewallOutboundRules extends Base {

    private static final long serialVersionUID = 8440422000704269377L;

    private String protocol;
    private String ports;
    private Destination destinations;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public Destination getDestinations() {
        return destinations;
    }

    public void setDestinations(Destination destinations) {
        this.destinations = destinations;
    }
}
