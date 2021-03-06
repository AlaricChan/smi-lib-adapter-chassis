//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MacAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Presence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BMC_MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIC1_MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NIC2_MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MacAddress", propOrder = {
    "name",
    "presence",
    "bmcmacAddress",
    "nic1MACAddress",
    "nic2MACAddress"
})
public class MacAddress {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Presence")
    protected String presence;
    @XmlElement(name = "BMC_MAC_Address")
    protected String bmcmacAddress;
    @XmlElement(name = "NIC1_MAC_Address")
    protected String nic1MACAddress;
    @XmlElement(name = "NIC2_MAC_Address")
    protected String nic2MACAddress;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the presence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresence() {
        return presence;
    }

    /**
     * Sets the value of the presence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresence(String value) {
        this.presence = value;
    }

    /**
     * Gets the value of the bmcmacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMCMACAddress() {
        return bmcmacAddress;
    }

    /**
     * Sets the value of the bmcmacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMCMACAddress(String value) {
        this.bmcmacAddress = value;
    }

    /**
     * Gets the value of the nic1MACAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIC1MACAddress() {
        return nic1MACAddress;
    }

    /**
     * Sets the value of the nic1MACAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIC1MACAddress(String value) {
        this.nic1MACAddress = value;
    }

    /**
     * Gets the value of the nic2MACAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIC2MACAddress() {
        return nic2MACAddress;
    }

    /**
     * Sets the value of the nic2MACAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIC2MACAddress(String value) {
        this.nic2MACAddress = value;
    }

}
