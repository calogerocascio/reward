package com.redhat.jboss.hr.rewards;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(b326e74593d90a0d7a042edfa9b87935)
 */
@org.kie.api.definition.type.Label(value = "Employee")
public class Employee extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "AcquistionDate")
    @org.kie.api.definition.type.Position(value = 3)
    private java.util.Date acquistionDate;
    
    @org.kie.api.definition.type.Label(value = "Award")
    @org.kie.api.definition.type.Position(value = 2)
    private com.redhat.jboss.hr.rewards.Award award;
    
    @org.kie.api.definition.type.Label(value = "CustomerCode")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String customerCode;
    
    @org.kie.api.definition.type.Label(value = "CustomerType")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String customerType;
    
    @org.kie.api.definition.type.Label(value = "Market Segment")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String mSegment;
    
    @org.kie.api.definition.type.Label(value = "Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;

    public Employee() {
    }

    public Employee(java.lang.String name, java.lang.String customerCode, com.redhat.jboss.hr.rewards.Award award, java.util.Date acquistionDate, java.lang.String customerType, java.lang.String mSegment) {
        this.name = name;
        this.customerCode = customerCode;
        this.award = award;
        this.acquistionDate = acquistionDate;
        this.customerType = customerType;
        this.mSegment = mSegment;
    }


    
    public java.util.Date getAcquistionDate() {
        return this.acquistionDate;
    }

    public void setAcquistionDate(java.util.Date acquistionDate) {
        this.acquistionDate = acquistionDate;
    }
    
    public com.redhat.jboss.hr.rewards.Award getAward() {
        return this.award;
    }

    public void setAward(com.redhat.jboss.hr.rewards.Award award) {
        this.award = award;
    }
    
    public java.lang.String getCustomerCode() {
        return this.customerCode;
    }

    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }
    
    public java.lang.String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(java.lang.String customerType) {
        this.customerType = customerType;
    }
    
    public java.lang.String getmSegment() {
        return this.mSegment;
    }

    public void setmSegment(java.lang.String mSegment) {
        this.mSegment = mSegment;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}