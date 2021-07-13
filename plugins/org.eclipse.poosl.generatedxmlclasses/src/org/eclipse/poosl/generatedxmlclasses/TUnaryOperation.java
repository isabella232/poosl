//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.16 at 11:04:04 AM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_unary_operation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_unary_operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{uri:poosl}t_expression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{uri:poosl}t_unary_operator" />
 *       &lt;attribute name="stmt_handle" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_unary_operation", propOrder = { "operand" })
public class TUnaryOperation {

    @XmlElement(required = true)
    protected TExpression operand;

    @XmlAttribute(name = "operator")
    protected TUnaryOperator operator;

    @XmlAttribute(name = "stmt_handle")
    protected Integer stmtHandle;

    /**
     * Gets the value of the operand property.
     * 
     * @return possible object is {@link TExpression }
     * 
     */
    public TExpression getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *            allowed object is {@link TExpression }
     * 
     */
    public void setOperand(TExpression value) {
        this.operand = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return possible object is {@link TUnaryOperator }
     * 
     */
    public TUnaryOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *            allowed object is {@link TUnaryOperator }
     * 
     */
    public void setOperator(TUnaryOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the stmtHandle property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getStmtHandle() {
        return stmtHandle;
    }

    /**
     * Sets the value of the stmtHandle property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setStmtHandle(Integer value) {
        this.stmtHandle = value;
    }

}