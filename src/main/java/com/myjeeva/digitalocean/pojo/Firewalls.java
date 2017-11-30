package com.myjeeva.digitalocean.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/**
 * Represents Droplets attributes
 *
 * @author Homyak V.
 * @since
 */
public class Firewalls extends Base {

    private static final long serialVersionUID = 4978182514405618102L;

    private List<Firewall> firewalls;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    /**
     * @return the firewalls
     */
    public List<Firewall> getFirewalls() {
        return firewalls;
    }

    /**
     * @param firewalls the firewalls to set
     */
    public void setFirewalls(List<Firewall> firewalls) {
        this.firewalls = firewalls;
    }
}