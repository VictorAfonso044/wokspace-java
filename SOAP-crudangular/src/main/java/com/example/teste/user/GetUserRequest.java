//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.01 às 06:37:08 PM BRT 
//


package com.example.teste.user;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomebeneficiario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idbeneficiario" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idprontuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numcarteira" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datanascimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="datainclusao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nomebeneficiario",
    "idbeneficiario",
    "idprontuario",
    "numcarteira",
    "datanascimento",
    "datainclusao"
})
@XmlRootElement(name = "getUserRequest")
public class GetUserRequest {

    @XmlElement(required = true)
    protected String nomebeneficiario;
    protected long idbeneficiario;
    protected long idprontuario;
    protected int numcarteira;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date datanascimento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date datainclusao;

    /**
     * Obtém o valor da propriedade nomebeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomebeneficiario() {
        return nomebeneficiario;
    }

    /**
     * Define o valor da propriedade nomebeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomebeneficiario(String value) {
        this.nomebeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade idbeneficiario.
     * 
     */
    public long getIdbeneficiario() {
        return idbeneficiario;
    }

    /**
     * Define o valor da propriedade idbeneficiario.
     * 
     */
    public void setIdbeneficiario(long value) {
        this.idbeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade idprontuario.
     * 
     */
    public long getIdprontuario() {
        return idprontuario;
    }

    /**
     * Define o valor da propriedade idprontuario.
     * 
     */
    public void setIdprontuario(long value) {
        this.idprontuario = value;
    }

    /**
     * Obtém o valor da propriedade numcarteira.
     * 
     */
    public int getNumcarteira() {
        return numcarteira;
    }

    /**
     * Define o valor da propriedade numcarteira.
     * 
     */
    public void setNumcarteira(int value) {
        this.numcarteira = value;
    }

    /**
     * Obtém o valor da propriedade datanascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDatanascimento() {
        return datanascimento;
    }

    /**
     * Define o valor da propriedade datanascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatanascimento(Date value) {
        this.datanascimento = value;
    }

    /**
     * Obtém o valor da propriedade datainclusao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDatainclusao() {
        return datainclusao;
    }

    /**
     * Define o valor da propriedade datainclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatainclusao(Date value) {
        this.datainclusao = value;
    }

}
