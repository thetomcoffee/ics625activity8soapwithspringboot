//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.25 at 08:43:39 AM CDT 
//


package edu.metro.ics625.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "n1",
    "n2"
})
@XmlRootElement(name = "multiplyRequest", namespace = "http://metrostate.edu/ics625")
public class MultiplyRequest {

    @XmlElement(namespace = "http://metrostate.edu/ics625")
    protected int n1;
    @XmlElement(namespace = "http://metrostate.edu/ics625")
    protected int n2;

    /**
     * Gets the value of the n1 property.
     * 
     */
    public int getN1() {
        return n1;
    }

    /**
     * Sets the value of the n1 property.
     * 
     */
    public void setN1(int value) {
        this.n1 = value;
    }

    /**
     * Gets the value of the n2 property.
     * 
     */
    public int getN2() {
        return n2;
    }

    /**
     * Sets the value of the n2 property.
     * 
     */
    public void setN2(int value) {
        this.n2 = value;
    }

}