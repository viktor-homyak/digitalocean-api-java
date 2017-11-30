package com.myjeeva.digitalocean.pojo;

/**
 * Created by vhomyak on 29.11.2017.
 */
public class FirewallInboundRule extends Base {

    private static final long serialVersionUID = -7508212661745330300L;

    private String protocol;
    private String ports;
    private Source sources;

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

    public Source getSources() {
        return sources;
    }

    public void setSources(Source sources) {
        this.sources = sources;
    }
}
