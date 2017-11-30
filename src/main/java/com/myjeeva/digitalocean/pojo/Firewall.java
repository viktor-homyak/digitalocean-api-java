package com.myjeeva.digitalocean.pojo;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/**
 * Created by vhomyak on 29.11.2017.
 */
public class Firewall extends RateLimitBase {


    private static final long serialVersionUID = -4227246585766172518L;

    private String id;
    private String status;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("pending_changes")
    private List<Object> pendingChanges;
    private String name;
    @SerializedName("inbound_rules")
    private List<FirewallInboundRule> inboundRules;
    @SerializedName("outbound_rules")
    private List<FirewallOutboundRules> outboundRules;
    @SerializedName("droplet_ids")
    private List<Integer> dropletIds;
    private List<String> tags;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<Object> getPendingChanges() {
        return pendingChanges;
    }

    public void setPendingChanges(List<Object> pendingChanges) {
        this.pendingChanges = pendingChanges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FirewallInboundRule> getInboundRules() {
        return inboundRules;
    }

    public void setInboundRules(List<FirewallInboundRule> inboundRules) {
        this.inboundRules = inboundRules;
    }

    public List<FirewallOutboundRules> getOutboundRules() {
        return outboundRules;
    }

    public void setOutboundRules(List<FirewallOutboundRules> outboundRules) {
        this.outboundRules = outboundRules;
    }

    public List<Integer> getDropletIds() {
        return dropletIds;
    }

    public void setDropletIds(List<Integer> dropletIds) {
        this.dropletIds = dropletIds;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
