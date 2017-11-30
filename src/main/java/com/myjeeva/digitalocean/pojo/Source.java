package com.myjeeva.digitalocean.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vhomyak on 29.11.2017.
 */
public class Source extends Base {

    private static final long serialVersionUID = 6269551990659227215L;

    private List<String> addresses;
    @SerializedName("droplet_ids")
    private List<Integer> dropletIds;
    @SerializedName("load_balancer_uids")
    private List<LoadBalancer> loadBalancerUIDs;
    private List<String> tags;

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public List<Integer> getDropletIds() {
        return dropletIds;
    }

    public void setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
    }

    public List<LoadBalancer> getLoadBalancerUIDs() {
        return loadBalancerUIDs;
    }

    public void setLoadBalancerUIDs(List<LoadBalancer> loadBalancerUIDs) {
        this.loadBalancerUIDs = loadBalancerUIDs;
    }


    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
