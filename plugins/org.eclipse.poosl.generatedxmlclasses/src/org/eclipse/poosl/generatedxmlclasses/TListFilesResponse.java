//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.16 at 11:04:04 AM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for t_list_files_response complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_list_files_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="file">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="handle" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_list_files_response", propOrder = { "file" })
public class TListFilesResponse {

    protected List<TListFilesResponse.File> file;

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TListFilesResponse.File }
     * 
     * 
     */
    public List<TListFilesResponse.File> getFile() {
        if (file == null) {
            file = new ArrayList<TListFilesResponse.File>();
        }
        return this.file;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="handle" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class File {

        @XmlValue
        protected String value;

        @XmlAttribute(name = "handle")
        protected BigInteger handle;

        /**
         * Gets the value of the value property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the handle property.
         * 
         * @return possible object is {@link BigInteger }
         * 
         */
        public BigInteger getHandle() {
            return handle;
        }

        /**
         * Sets the value of the handle property.
         * 
         * @param value
         *            allowed object is {@link BigInteger }
         * 
         */
        public void setHandle(BigInteger value) {
            this.handle = value;
        }

    }

}