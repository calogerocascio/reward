package com.redhat.jboss.hr.rewards;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(88e1479cac98e5ac89f89312ec352248)
 */
@org.kie.api.definition.type.Label(value = "Award")
public class Award extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "address")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String address;
    
    @org.kie.api.definition.type.Label(value = "City")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String city;

    public Award() {
    }

    public Award(java.lang.String address, java.lang.String city) {
        this.address = address;
        this.city = city;
    }


    
    public java.lang.String getAddress() {
        return this.address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }
    
    public java.lang.String getCity() {
        return this.city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }
}