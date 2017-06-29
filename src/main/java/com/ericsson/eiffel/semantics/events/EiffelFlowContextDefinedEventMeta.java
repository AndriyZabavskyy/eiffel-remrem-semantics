
package com.ericsson.eiffel.semantics.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EiffelFlowContextDefinedEventMeta implements Meta
{

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private EiffelFlowContextDefinedEventMeta.Type type;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("version")
    @Expose
    private EiffelFlowContextDefinedEventMeta.Version version = EiffelFlowContextDefinedEventMeta.Version.fromValue("1.0.0");
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("source")
    @Expose
    private Source source;

    /**
     * 
     * (Required)
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    public EiffelFlowContextDefinedEventMeta.Type getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setType(EiffelFlowContextDefinedEventMeta.Type type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     */
    public EiffelFlowContextDefinedEventMeta.Version getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVersion(EiffelFlowContextDefinedEventMeta.Version version) {
        this.version = version;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Long getTime() {
        return time;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTime(Long time) {
        this.time = time;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Source getSource() {
        return source;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSource(Source source) {
        this.source = source;
    }

    public enum Type {

        @SerializedName("eiffelflowcontextdefined")
        EIFFELFLOWCONTEXTDEFINED("eiffelflowcontextdefined");
        private final String value;
        private final static Map<String, EiffelFlowContextDefinedEventMeta.Type> CONSTANTS = new HashMap<String, EiffelFlowContextDefinedEventMeta.Type>();

        static {
            for (EiffelFlowContextDefinedEventMeta.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static EiffelFlowContextDefinedEventMeta.Type fromValue(String value) {
            EiffelFlowContextDefinedEventMeta.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Version {

        @SerializedName("1.0.0")
        _1_0_0("1.0.0");
        private final String value;
        private final static Map<String, EiffelFlowContextDefinedEventMeta.Version> CONSTANTS = new HashMap<String, EiffelFlowContextDefinedEventMeta.Version>();

        static {
            for (EiffelFlowContextDefinedEventMeta.Version c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Version(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static EiffelFlowContextDefinedEventMeta.Version fromValue(String value) {
            EiffelFlowContextDefinedEventMeta.Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}