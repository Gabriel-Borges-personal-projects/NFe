//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.01.12 �s 07:40:42 PM BRT 
//


package br.inf.portalfiscal.nfe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig_.SignatureType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNFe", propOrder = {
    "infNFe",
    "infNFeSupl",
    "signature"
})
public class TNFe {

    @XmlElement(required = true)
    protected TNFe.InfNFe infNFe;
    protected TNFe.InfNFeSupl infNFeSupl;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obt�m o valor da propriedade infNFe.
     * 
     * @return
     *     possible object is
     *     {@link TNFe.InfNFe }
     *     
     */
    public TNFe.InfNFe getInfNFe() {
        return infNFe;
    }

    /**
     * Define o valor da propriedade infNFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TNFe.InfNFe }
     *     
     */
    public void setInfNFe(TNFe.InfNFe value) {
        this.infNFe = value;
    }

    /**
     * Obt�m o valor da propriedade infNFeSupl.
     * 
     * @return
     *     possible object is
     *     {@link TNFe.InfNFeSupl }
     *     
     */
    public TNFe.InfNFeSupl getInfNFeSupl() {
        return infNFeSupl;
    }

    /**
     * Define o valor da propriedade infNFeSupl.
     * 
     * @param value
     *     allowed object is
     *     {@link TNFe.InfNFeSupl }
     *     
     */
    public void setInfNFeSupl(TNFe.InfNFeSupl value) {
        this.infNFeSupl = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ide",
        "emit",
        "avulsa",
        "dest",
        "retirada",
        "entrega",
        "autXML",
        "det",
        "total",
        "transp",
        "cobr",
        "pag",
        "infIntermed",
        "infAdic",
        "exporta",
        "compra",
        "cana",
        "infRespTec"
    })
    public static class InfNFe {

        @XmlElement(required = true)
        protected TNFe.InfNFe.Ide ide;
        @XmlElement(required = true)
        protected TNFe.InfNFe.Emit emit;
        protected TNFe.InfNFe.Avulsa avulsa;
        protected TNFe.InfNFe.Dest dest;
        protected TLocal retirada;
        protected TLocal entrega;
        protected List<TNFe.InfNFe.AutXML> autXML;
        @XmlElement(required = true)
        protected List<TNFe.InfNFe.Det> det;
        @XmlElement(required = true)
        protected TNFe.InfNFe.Total total;
        @XmlElement(required = true)
        protected TNFe.InfNFe.Transp transp;
        protected TNFe.InfNFe.Cobr cobr;
        @XmlElement(required = true)
        protected TNFe.InfNFe.Pag pag;
        protected TNFe.InfNFe.InfIntermed infIntermed;
        protected TNFe.InfNFe.InfAdic infAdic;
        protected TNFe.InfNFe.Exporta exporta;
        protected TNFe.InfNFe.Compra compra;
        protected TNFe.InfNFe.Cana cana;
        protected TInfRespTec infRespTec;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obt�m o valor da propriedade ide.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Ide }
         *     
         */
        public TNFe.InfNFe.Ide getIde() {
            return ide;
        }

        /**
         * Define o valor da propriedade ide.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Ide }
         *     
         */
        public void setIde(TNFe.InfNFe.Ide value) {
            this.ide = value;
        }

        /**
         * Obt�m o valor da propriedade emit.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Emit }
         *     
         */
        public TNFe.InfNFe.Emit getEmit() {
            return emit;
        }

        /**
         * Define o valor da propriedade emit.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Emit }
         *     
         */
        public void setEmit(TNFe.InfNFe.Emit value) {
            this.emit = value;
        }

        /**
         * Obt�m o valor da propriedade avulsa.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Avulsa }
         *     
         */
        public TNFe.InfNFe.Avulsa getAvulsa() {
            return avulsa;
        }

        /**
         * Define o valor da propriedade avulsa.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Avulsa }
         *     
         */
        public void setAvulsa(TNFe.InfNFe.Avulsa value) {
            this.avulsa = value;
        }

        /**
         * Obt�m o valor da propriedade dest.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Dest }
         *     
         */
        public TNFe.InfNFe.Dest getDest() {
            return dest;
        }

        /**
         * Define o valor da propriedade dest.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Dest }
         *     
         */
        public void setDest(TNFe.InfNFe.Dest value) {
            this.dest = value;
        }

        /**
         * Obt�m o valor da propriedade retirada.
         * 
         * @return
         *     possible object is
         *     {@link TLocal }
         *     
         */
        public TLocal getRetirada() {
            return retirada;
        }

        /**
         * Define o valor da propriedade retirada.
         * 
         * @param value
         *     allowed object is
         *     {@link TLocal }
         *     
         */
        public void setRetirada(TLocal value) {
            this.retirada = value;
        }

        /**
         * Obt�m o valor da propriedade entrega.
         * 
         * @return
         *     possible object is
         *     {@link TLocal }
         *     
         */
        public TLocal getEntrega() {
            return entrega;
        }

        /**
         * Define o valor da propriedade entrega.
         * 
         * @param value
         *     allowed object is
         *     {@link TLocal }
         *     
         */
        public void setEntrega(TLocal value) {
            this.entrega = value;
        }

        /**
         * Gets the value of the autXML property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autXML property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutXML().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TNFe.InfNFe.AutXML }
         * 
         * 
         */
        public List<TNFe.InfNFe.AutXML> getAutXML() {
            if (autXML == null) {
                autXML = new ArrayList<TNFe.InfNFe.AutXML>();
            }
            return this.autXML;
        }

        /**
         * Gets the value of the det property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the det property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TNFe.InfNFe.Det }
         * 
         * 
         */
        public List<TNFe.InfNFe.Det> getDet() {
            if (det == null) {
                det = new ArrayList<TNFe.InfNFe.Det>();
            }
            return this.det;
        }

        /**
         * Obt�m o valor da propriedade total.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Total }
         *     
         */
        public TNFe.InfNFe.Total getTotal() {
            return total;
        }

        /**
         * Define o valor da propriedade total.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Total }
         *     
         */
        public void setTotal(TNFe.InfNFe.Total value) {
            this.total = value;
        }

        /**
         * Obt�m o valor da propriedade transp.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Transp }
         *     
         */
        public TNFe.InfNFe.Transp getTransp() {
            return transp;
        }

        /**
         * Define o valor da propriedade transp.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Transp }
         *     
         */
        public void setTransp(TNFe.InfNFe.Transp value) {
            this.transp = value;
        }

        /**
         * Obt�m o valor da propriedade cobr.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Cobr }
         *     
         */
        public TNFe.InfNFe.Cobr getCobr() {
            return cobr;
        }

        /**
         * Define o valor da propriedade cobr.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Cobr }
         *     
         */
        public void setCobr(TNFe.InfNFe.Cobr value) {
            this.cobr = value;
        }

        /**
         * Obt�m o valor da propriedade pag.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Pag }
         *     
         */
        public TNFe.InfNFe.Pag getPag() {
            return pag;
        }

        /**
         * Define o valor da propriedade pag.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Pag }
         *     
         */
        public void setPag(TNFe.InfNFe.Pag value) {
            this.pag = value;
        }

        /**
         * Obt�m o valor da propriedade infIntermed.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.InfIntermed }
         *     
         */
        public TNFe.InfNFe.InfIntermed getInfIntermed() {
            return infIntermed;
        }

        /**
         * Define o valor da propriedade infIntermed.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.InfIntermed }
         *     
         */
        public void setInfIntermed(TNFe.InfNFe.InfIntermed value) {
            this.infIntermed = value;
        }

        /**
         * Obt�m o valor da propriedade infAdic.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.InfAdic }
         *     
         */
        public TNFe.InfNFe.InfAdic getInfAdic() {
            return infAdic;
        }

        /**
         * Define o valor da propriedade infAdic.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.InfAdic }
         *     
         */
        public void setInfAdic(TNFe.InfNFe.InfAdic value) {
            this.infAdic = value;
        }

        /**
         * Obt�m o valor da propriedade exporta.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Exporta }
         *     
         */
        public TNFe.InfNFe.Exporta getExporta() {
            return exporta;
        }

        /**
         * Define o valor da propriedade exporta.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Exporta }
         *     
         */
        public void setExporta(TNFe.InfNFe.Exporta value) {
            this.exporta = value;
        }

        /**
         * Obt�m o valor da propriedade compra.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Compra }
         *     
         */
        public TNFe.InfNFe.Compra getCompra() {
            return compra;
        }

        /**
         * Define o valor da propriedade compra.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Compra }
         *     
         */
        public void setCompra(TNFe.InfNFe.Compra value) {
            this.compra = value;
        }

        /**
         * Obt�m o valor da propriedade cana.
         * 
         * @return
         *     possible object is
         *     {@link TNFe.InfNFe.Cana }
         *     
         */
        public TNFe.InfNFe.Cana getCana() {
            return cana;
        }

        /**
         * Define o valor da propriedade cana.
         * 
         * @param value
         *     allowed object is
         *     {@link TNFe.InfNFe.Cana }
         *     
         */
        public void setCana(TNFe.InfNFe.Cana value) {
            this.cana = value;
        }

        /**
         * Obt�m o valor da propriedade infRespTec.
         * 
         * @return
         *     possible object is
         *     {@link TInfRespTec }
         *     
         */
        public TInfRespTec getInfRespTec() {
            return infRespTec;
        }

        /**
         * Define o valor da propriedade infRespTec.
         * 
         * @param value
         *     allowed object is
         *     {@link TInfRespTec }
         *     
         */
        public void setInfRespTec(TInfRespTec value) {
            this.infRespTec = value;
        }

        /**
         * Obt�m o valor da propriedade versao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Define o valor da propriedade versao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersao(String value) {
            this.versao = value;
        }

        /**
         * Obt�m o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *         &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpj",
            "cpf"
        })
        public static class AutXML {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;

            /**
             * Obt�m o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obt�m o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpj",
            "xOrgao",
            "matr",
            "xAgente",
            "fone",
            "uf",
            "ndar",
            "dEmi",
            "vdar",
            "repEmi",
            "dPag"
        })
        public static class Avulsa {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            @XmlElement(required = true)
            protected String xOrgao;
            @XmlElement(required = true)
            protected String matr;
            @XmlElement(required = true)
            protected String xAgente;
            protected String fone;
            @XmlElement(name = "UF", required = true)
            @XmlSchemaType(name = "string")
            protected TUfEmi uf;
            @XmlElement(name = "nDAR")
            protected String ndar;
            protected String dEmi;
            @XmlElement(name = "vDAR")
            protected String vdar;
            @XmlElement(required = true)
            protected String repEmi;
            protected String dPag;

            /**
             * Obt�m o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obt�m o valor da propriedade xOrgao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXOrgao() {
                return xOrgao;
            }

            /**
             * Define o valor da propriedade xOrgao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXOrgao(String value) {
                this.xOrgao = value;
            }

            /**
             * Obt�m o valor da propriedade matr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatr() {
                return matr;
            }

            /**
             * Define o valor da propriedade matr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatr(String value) {
                this.matr = value;
            }

            /**
             * Obt�m o valor da propriedade xAgente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXAgente() {
                return xAgente;
            }

            /**
             * Define o valor da propriedade xAgente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXAgente(String value) {
                this.xAgente = value;
            }

            /**
             * Obt�m o valor da propriedade fone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFone() {
                return fone;
            }

            /**
             * Define o valor da propriedade fone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFone(String value) {
                this.fone = value;
            }

            /**
             * Obt�m o valor da propriedade uf.
             * 
             * @return
             *     possible object is
             *     {@link TUfEmi }
             *     
             */
            public TUfEmi getUF() {
                return uf;
            }

            /**
             * Define o valor da propriedade uf.
             * 
             * @param value
             *     allowed object is
             *     {@link TUfEmi }
             *     
             */
            public void setUF(TUfEmi value) {
                this.uf = value;
            }

            /**
             * Obt�m o valor da propriedade ndar.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNDAR() {
                return ndar;
            }

            /**
             * Define o valor da propriedade ndar.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNDAR(String value) {
                this.ndar = value;
            }

            /**
             * Obt�m o valor da propriedade dEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDEmi() {
                return dEmi;
            }

            /**
             * Define o valor da propriedade dEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDEmi(String value) {
                this.dEmi = value;
            }

            /**
             * Obt�m o valor da propriedade vdar.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVDAR() {
                return vdar;
            }

            /**
             * Define o valor da propriedade vdar.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVDAR(String value) {
                this.vdar = value;
            }

            /**
             * Obt�m o valor da propriedade repEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRepEmi() {
                return repEmi;
            }

            /**
             * Define o valor da propriedade repEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRepEmi(String value) {
                this.repEmi = value;
            }

            /**
             * Obt�m o valor da propriedade dPag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDPag() {
                return dPag;
            }

            /**
             * Define o valor da propriedade dPag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDPag(String value) {
                this.dPag = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "safra",
            "ref",
            "forDia",
            "qTotMes",
            "qTotAnt",
            "qTotGer",
            "deduc",
            "vFor",
            "vTotDed",
            "vLiqFor"
        })
        public static class Cana {

            @XmlElement(required = true)
            protected String safra;
            @XmlElement(required = true)
            protected String ref;
            @XmlElement(required = true)
            protected List<TNFe.InfNFe.Cana.ForDia> forDia;
            @XmlElement(required = true)
            protected String qTotMes;
            @XmlElement(required = true)
            protected String qTotAnt;
            @XmlElement(required = true)
            protected String qTotGer;
            protected List<TNFe.InfNFe.Cana.Deduc> deduc;
            @XmlElement(required = true)
            protected String vFor;
            @XmlElement(required = true)
            protected String vTotDed;
            @XmlElement(required = true)
            protected String vLiqFor;

            /**
             * Obt�m o valor da propriedade safra.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSafra() {
                return safra;
            }

            /**
             * Define o valor da propriedade safra.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSafra(String value) {
                this.safra = value;
            }

            /**
             * Obt�m o valor da propriedade ref.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRef() {
                return ref;
            }

            /**
             * Define o valor da propriedade ref.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRef(String value) {
                this.ref = value;
            }

            /**
             * Gets the value of the forDia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the forDia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getForDia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.Cana.ForDia }
             * 
             * 
             */
            public List<TNFe.InfNFe.Cana.ForDia> getForDia() {
                if (forDia == null) {
                    forDia = new ArrayList<TNFe.InfNFe.Cana.ForDia>();
                }
                return this.forDia;
            }

            /**
             * Obt�m o valor da propriedade qTotMes.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQTotMes() {
                return qTotMes;
            }

            /**
             * Define o valor da propriedade qTotMes.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQTotMes(String value) {
                this.qTotMes = value;
            }

            /**
             * Obt�m o valor da propriedade qTotAnt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQTotAnt() {
                return qTotAnt;
            }

            /**
             * Define o valor da propriedade qTotAnt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQTotAnt(String value) {
                this.qTotAnt = value;
            }

            /**
             * Obt�m o valor da propriedade qTotGer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQTotGer() {
                return qTotGer;
            }

            /**
             * Define o valor da propriedade qTotGer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQTotGer(String value) {
                this.qTotGer = value;
            }

            /**
             * Gets the value of the deduc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the deduc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDeduc().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.Cana.Deduc }
             * 
             * 
             */
            public List<TNFe.InfNFe.Cana.Deduc> getDeduc() {
                if (deduc == null) {
                    deduc = new ArrayList<TNFe.InfNFe.Cana.Deduc>();
                }
                return this.deduc;
            }

            /**
             * Obt�m o valor da propriedade vFor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVFor() {
                return vFor;
            }

            /**
             * Define o valor da propriedade vFor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVFor(String value) {
                this.vFor = value;
            }

            /**
             * Obt�m o valor da propriedade vTotDed.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTotDed() {
                return vTotDed;
            }

            /**
             * Define o valor da propriedade vTotDed.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTotDed(String value) {
                this.vTotDed = value;
            }

            /**
             * Obt�m o valor da propriedade vLiqFor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVLiqFor() {
                return vLiqFor;
            }

            /**
             * Define o valor da propriedade vLiqFor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVLiqFor(String value) {
                this.vLiqFor = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xDed">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vDed" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                "xDed",
                "vDed"
            })
            public static class Deduc {

                @XmlElement(required = true)
                protected String xDed;
                @XmlElement(required = true)
                protected String vDed;

                /**
                 * Obt�m o valor da propriedade xDed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXDed() {
                    return xDed;
                }

                /**
                 * Define o valor da propriedade xDed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXDed(String value) {
                    this.xDed = value;
                }

                /**
                 * Obt�m o valor da propriedade vDed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDed() {
                    return vDed;
                }

                /**
                 * Define o valor da propriedade vDed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDed(String value) {
                    this.vDed = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="qtde" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
             *       &lt;/sequence>
             *       &lt;attribute name="dia" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="preserve"/>
             *             &lt;pattern value="[1-9]|[1][0-9]|[2][0-9]|[3][0-1]"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "qtde"
            })
            public static class ForDia {

                @XmlElement(required = true)
                protected String qtde;
                @XmlAttribute(name = "dia", required = true)
                protected String dia;

                /**
                 * Obt�m o valor da propriedade qtde.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQtde() {
                    return qtde;
                }

                /**
                 * Define o valor da propriedade qtde.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQtde(String value) {
                    this.qtde = value;
                }

                /**
                 * Obt�m o valor da propriedade dia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDia() {
                    return dia;
                }

                /**
                 * Define o valor da propriedade dia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDia(String value) {
                    this.dia = value;
                }

            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fat",
            "dup"
        })
        public static class Cobr {

            protected TNFe.InfNFe.Cobr.Fat fat;
            protected List<TNFe.InfNFe.Cobr.Dup> dup;

            /**
             * Obt�m o valor da propriedade fat.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Cobr.Fat }
             *     
             */
            public TNFe.InfNFe.Cobr.Fat getFat() {
                return fat;
            }

            /**
             * Define o valor da propriedade fat.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Cobr.Fat }
             *     
             */
            public void setFat(TNFe.InfNFe.Cobr.Fat value) {
                this.fat = value;
            }
            
            public List<TNFe.InfNFe.Cobr.Dup> getDup() {
                if (dup == null) {
                    dup = new ArrayList<TNFe.InfNFe.Cobr.Dup>();
                }
                return this.dup;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nDup",
                "dVenc",
                "vDup"
            })
            public static class Dup {

                protected String nDup;
                protected String dVenc;
                @XmlElement(required = true)
                protected String vDup;

                /**
                 * Obt�m o valor da propriedade nDup.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNDup() {
                    return nDup;
                }

                /**
                 * Define o valor da propriedade nDup.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNDup(String value) {
                    this.nDup = value;
                }

                /**
                 * Obt�m o valor da propriedade dVenc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDVenc() {
                    return dVenc;
                }

                /**
                 * Define o valor da propriedade dVenc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDVenc(String value) {
                    this.dVenc = value;
                }

                /**
                 * Obt�m o valor da propriedade vDup.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDup() {
                    return vDup;
                }

                /**
                 * Define o valor da propriedade vDup.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDup(String value) {
                    this.vDup = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nFat" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
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
                "nFat",
                "vOrig",
                "vDesc",
                "vLiq"
            })
            public static class Fat {

                protected String nFat;
                protected String vOrig;
                protected String vDesc;
                protected String vLiq;

                /**
                 * Obt�m o valor da propriedade nFat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNFat() {
                    return nFat;
                }

                /**
                 * Define o valor da propriedade nFat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNFat(String value) {
                    this.nFat = value;
                }

                /**
                 * Obt�m o valor da propriedade vOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVOrig() {
                    return vOrig;
                }

                /**
                 * Define o valor da propriedade vOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVOrig(String value) {
                    this.vOrig = value;
                }

                /**
                 * Obt�m o valor da propriedade vDesc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDesc() {
                    return vDesc;
                }

                /**
                 * Define o valor da propriedade vDesc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDesc(String value) {
                    this.vDesc = value;
                }

                /**
                 * Obt�m o valor da propriedade vLiq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVLiq() {
                    return vLiq;
                }

                /**
                 * Define o valor da propriedade vLiq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVLiq(String value) {
                    this.vLiq = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="xNEmp" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="22"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xPed" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xCont" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "xnEmp",
            "xPed",
            "xCont"
        })
        public static class Compra {

            @XmlElement(name = "xNEmp")
            protected String xnEmp;
            protected String xPed;
            protected String xCont;

            /**
             * Obt�m o valor da propriedade xnEmp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNEmp() {
                return xnEmp;
            }

            /**
             * Define o valor da propriedade xnEmp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNEmp(String value) {
                this.xnEmp = value;
            }

            /**
             * Obt�m o valor da propriedade xPed.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXPed() {
                return xPed;
            }

            /**
             * Define o valor da propriedade xPed.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXPed(String value) {
                this.xPed = value;
            }

            /**
             * Obt�m o valor da propriedade xCont.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCont() {
                return xCont;
            }

            /**
             * Define o valor da propriedade xCont.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCont(String value) {
                this.xCont = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpj",
            "cpf",
            "idEstrangeiro",
            "xNome",
            "enderDest",
            "indIEDest",
            "ie",
            "isuf",
            "im",
            "email"
        })
        public static class Dest {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            protected String idEstrangeiro;
            protected String xNome;
            protected TEndereco enderDest;
            @XmlElement(required = true)
            protected String indIEDest;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(name = "ISUF")
            protected String isuf;
            @XmlElement(name = "IM")
            protected String im;
            protected String email;

            /**
             * Obt�m o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obt�m o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Obt�m o valor da propriedade idEstrangeiro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdEstrangeiro() {
                return idEstrangeiro;
            }

            /**
             * Define o valor da propriedade idEstrangeiro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdEstrangeiro(String value) {
                this.idEstrangeiro = value;
            }

            /**
             * Obt�m o valor da propriedade xNome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obt�m o valor da propriedade enderDest.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderDest() {
                return enderDest;
            }

            /**
             * Define o valor da propriedade enderDest.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderDest(TEndereco value) {
                this.enderDest = value;
            }

            /**
             * Obt�m o valor da propriedade indIEDest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndIEDest() {
                return indIEDest;
            }

            /**
             * Define o valor da propriedade indIEDest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndIEDest(String value) {
                this.indIEDest = value;
            }

            /**
             * Obt�m o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obt�m o valor da propriedade isuf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISUF() {
                return isuf;
            }

            /**
             * Define o valor da propriedade isuf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISUF(String value) {
                this.isuf = value;
            }

            /**
             * Obt�m o valor da propriedade im.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIM() {
                return im;
            }

            /**
             * Define o valor da propriedade im.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIM(String value) {
                this.im = value;
            }

            /**
             * Obt�m o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "prod",
            "imposto",
            "impostoDevol",
            "infAdProd"
        })
        public static class Det {

            @XmlElement(required = true)
            protected TNFe.InfNFe.Det.Prod prod;
            @XmlElement(required = true)
            protected TNFe.InfNFe.Det.Imposto imposto;
            protected TNFe.InfNFe.Det.ImpostoDevol impostoDevol;
            protected String infAdProd;
            @XmlAttribute(name = "nItem", required = true)
            protected String nItem;

            /**
             * Obt�m o valor da propriedade prod.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Det.Prod }
             *     
             */
            public TNFe.InfNFe.Det.Prod getProd() {
                return prod;
            }

            /**
             * Define o valor da propriedade prod.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Det.Prod }
             *     
             */
            public void setProd(TNFe.InfNFe.Det.Prod value) {
                this.prod = value;
            }

            /**
             * Obt�m o valor da propriedade imposto.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Det.Imposto }
             *     
             */
            public TNFe.InfNFe.Det.Imposto getImposto() {
                return imposto;
            }

            /**
             * Define o valor da propriedade imposto.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Det.Imposto }
             *     
             */
            public void setImposto(TNFe.InfNFe.Det.Imposto value) {
                this.imposto = value;
            }

            /**
             * Obt�m o valor da propriedade impostoDevol.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Det.ImpostoDevol }
             *     
             */
            public TNFe.InfNFe.Det.ImpostoDevol getImpostoDevol() {
                return impostoDevol;
            }

            /**
             * Define o valor da propriedade impostoDevol.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Det.ImpostoDevol }
             *     
             */
            public void setImpostoDevol(TNFe.InfNFe.Det.ImpostoDevol value) {
                this.impostoDevol = value;
            }

            /**
             * Obt�m o valor da propriedade infAdProd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfAdProd() {
                return infAdProd;
            }

            /**
             * Define o valor da propriedade infAdProd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfAdProd(String value) {
                this.infAdProd = value;
            }

            /**
             * Obt�m o valor da propriedade nItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNItem() {
                return nItem;
            }

            /**
             * Define o valor da propriedade nItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNItem(String value) {
                this.nItem = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Imposto {

                @XmlElementRefs({
                    @XmlElementRef(name = "PIS", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "II", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "PISST", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "COFINS", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "ICMSUFDest", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "IPI", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "ICMS", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "vTotTrib", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "ISSQN", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "COFINSST", namespace = "http://www.portalfiscal.inf.br/nfe", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<?>> content;

                public List<JAXBElement<?>> getContent() {
                    if (content == null) {
                        content = new ArrayList<JAXBElement<?>>();
                    }
                    return this.content;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cofinsAliq",
                    "cofinsQtde",
                    "cofinsnt",
                    "cofinsOutr"
                })
                public static class COFINS {

                    @XmlElement(name = "COFINSAliq")
                    protected TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq cofinsAliq;
                    @XmlElement(name = "COFINSQtde")
                    protected TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde cofinsQtde;
                    @XmlElement(name = "COFINSNT")
                    protected TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT cofinsnt;
                    @XmlElement(name = "COFINSOutr")
                    protected TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr cofinsOutr;

                    /**
                     * Obt�m o valor da propriedade cofinsAliq.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq getCOFINSAliq() {
                        return cofinsAliq;
                    }

                    /**
                     * Define o valor da propriedade cofinsAliq.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq }
                     *     
                     */
                    public void setCOFINSAliq(TNFe.InfNFe.Det.Imposto.COFINS.COFINSAliq value) {
                        this.cofinsAliq = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cofinsQtde.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde getCOFINSQtde() {
                        return cofinsQtde;
                    }

                    /**
                     * Define o valor da propriedade cofinsQtde.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde }
                     *     
                     */
                    public void setCOFINSQtde(TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde value) {
                        this.cofinsQtde = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cofinsnt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT getCOFINSNT() {
                        return cofinsnt;
                    }

                    /**
                     * Define o valor da propriedade cofinsnt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT }
                     *     
                     */
                    public void setCOFINSNT(TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT value) {
                        this.cofinsnt = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cofinsOutr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr getCOFINSOutr() {
                        return cofinsOutr;
                    }

                    /**
                     * Define o valor da propriedade cofinsOutr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr }
                     *     
                     */
                    public void setCOFINSOutr(TNFe.InfNFe.Det.Imposto.COFINS.COFINSOutr value) {
                        this.cofinsOutr = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="01"/>
                     *               &lt;enumeration value="02"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "cst",
                        "vbc",
                        "pcofins",
                        "vcofins"
                    })
                    public static class COFINSAliq {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "pCOFINS", required = true)
                        protected String pcofins;
                        @XmlElement(name = "vCOFINS", required = true)
                        protected String vcofins;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPCOFINS() {
                            return pcofins;
                        }

                        /**
                         * Define o valor da propriedade pcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPCOFINS(String value) {
                            this.pcofins = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINS() {
                            return vcofins;
                        }

                        /**
                         * Define o valor da propriedade vcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINS(String value) {
                            this.vcofins = value;
                        }

                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cst"
                    })
                    public static class COFINSNT {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cst",
                        "vbc",
                        "pcofins",
                        "qbcProd",
                        "vAliqProd",
                        "vcofins"
                    })
                    public static class COFINSOutr {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBC")
                        protected String vbc;
                        @XmlElement(name = "pCOFINS")
                        protected String pcofins;
                        @XmlElement(name = "qBCProd")
                        protected String qbcProd;
                        protected String vAliqProd;
                        @XmlElement(name = "vCOFINS", required = true)
                        protected String vcofins;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPCOFINS() {
                            return pcofins;
                        }

                        /**
                         * Define o valor da propriedade pcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPCOFINS(String value) {
                            this.pcofins = value;
                        }

                        /**
                         * Obt�m o valor da propriedade qbcProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQBCProd() {
                            return qbcProd;
                        }

                        /**
                         * Define o valor da propriedade qbcProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQBCProd(String value) {
                            this.qbcProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vAliqProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVAliqProd() {
                            return vAliqProd;
                        }

                        /**
                         * Define o valor da propriedade vAliqProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVAliqProd(String value) {
                            this.vAliqProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINS() {
                            return vcofins;
                        }

                        /**
                         * Define o valor da propriedade vcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINS(String value) {
                            this.vcofins = value;
                        }

                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cst",
                        "qbcProd",
                        "vAliqProd",
                        "vcofins"
                    })
                    public static class COFINSQtde {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "qBCProd", required = true)
                        protected String qbcProd;
                        @XmlElement(required = true)
                        protected String vAliqProd;
                        @XmlElement(name = "vCOFINS", required = true)
                        protected String vcofins;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade qbcProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQBCProd() {
                            return qbcProd;
                        }

                        /**
                         * Define o valor da propriedade qbcProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQBCProd(String value) {
                            this.qbcProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vAliqProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVAliqProd() {
                            return vAliqProd;
                        }

                        /**
                         * Define o valor da propriedade vAliqProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVAliqProd(String value) {
                            this.vAliqProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINS() {
                            return vcofins;
                        }

                        /**
                         * Define o valor da propriedade vcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINS(String value) {
                            this.vcofins = value;
                        }

                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "vbc",
                    "pcofins",
                    "qbcProd",
                    "vAliqProd",
                    "vcofins",
                    "indSomaCOFINSST"
                })
                public static class COFINSST {

                    @XmlElement(name = "vBC")
                    protected String vbc;
                    @XmlElement(name = "pCOFINS")
                    protected String pcofins;
                    @XmlElement(name = "qBCProd")
                    protected String qbcProd;
                    protected String vAliqProd;
                    @XmlElement(name = "vCOFINS", required = true)
                    protected String vcofins;
                    protected String indSomaCOFINSST;

                    /**
                     * Obt�m o valor da propriedade vbc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVBC() {
                        return vbc;
                    }

                    /**
                     * Define o valor da propriedade vbc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVBC(String value) {
                        this.vbc = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pcofins.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPCOFINS() {
                        return pcofins;
                    }

                    /**
                     * Define o valor da propriedade pcofins.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPCOFINS(String value) {
                        this.pcofins = value;
                    }

                    /**
                     * Obt�m o valor da propriedade qbcProd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQBCProd() {
                        return qbcProd;
                    }

                    /**
                     * Define o valor da propriedade qbcProd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQBCProd(String value) {
                        this.qbcProd = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vAliqProd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVAliqProd() {
                        return vAliqProd;
                    }

                    /**
                     * Define o valor da propriedade vAliqProd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVAliqProd(String value) {
                        this.vAliqProd = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vcofins.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVCOFINS() {
                        return vcofins;
                    }

                    /**
                     * Define o valor da propriedade vcofins.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVCOFINS(String value) {
                        this.vcofins = value;
                    }

                    /**
                     * Obt�m o valor da propriedade indSomaCOFINSST.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndSomaCOFINSST() {
                        return indSomaCOFINSST;
                    }

                    /**
                     * Define o valor da propriedade indSomaCOFINSST.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndSomaCOFINSST(String value) {
                        this.indSomaCOFINSST = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "icms00",
                    "icms10",
                    "icms20",
                    "icms30",
                    "icms40",
                    "icms51",
                    "icms60",
                    "icms70",
                    "icms90",
                    "icmsPart",
                    "icmsst",
                    "icmssn101",
                    "icmssn102",
                    "icmssn201",
                    "icmssn202",
                    "icmssn500",
                    "icmssn900"
                })
                public static class ICMS {

                    @XmlElement(name = "ICMS00")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 icms00;
                    @XmlElement(name = "ICMS10")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 icms10;
                    @XmlElement(name = "ICMS20")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 icms20;
                    @XmlElement(name = "ICMS30")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 icms30;
                    @XmlElement(name = "ICMS40")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 icms40;
                    @XmlElement(name = "ICMS51")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 icms51;
                    @XmlElement(name = "ICMS60")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 icms60;
                    @XmlElement(name = "ICMS70")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 icms70;
                    @XmlElement(name = "ICMS90")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 icms90;
                    @XmlElement(name = "ICMSPart")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart icmsPart;
                    @XmlElement(name = "ICMSST")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSST icmsst;
                    @XmlElement(name = "ICMSSN101")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 icmssn101;
                    @XmlElement(name = "ICMSSN102")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 icmssn102;
                    @XmlElement(name = "ICMSSN201")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 icmssn201;
                    @XmlElement(name = "ICMSSN202")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 icmssn202;
                    @XmlElement(name = "ICMSSN500")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 icmssn500;
                    @XmlElement(name = "ICMSSN900")
                    protected TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 icmssn900;

                    /**
                     * Obt�m o valor da propriedade icms00.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 getICMS00() {
                        return icms00;
                    }

                    /**
                     * Define o valor da propriedade icms00.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 }
                     *     
                     */
                    public void setICMS00(TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 value) {
                        this.icms00 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms10.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 getICMS10() {
                        return icms10;
                    }

                    /**
                     * Define o valor da propriedade icms10.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 }
                     *     
                     */
                    public void setICMS10(TNFe.InfNFe.Det.Imposto.ICMS.ICMS10 value) {
                        this.icms10 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms20.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 getICMS20() {
                        return icms20;
                    }

                    /**
                     * Define o valor da propriedade icms20.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 }
                     *     
                     */
                    public void setICMS20(TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 value) {
                        this.icms20 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms30.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 getICMS30() {
                        return icms30;
                    }

                    /**
                     * Define o valor da propriedade icms30.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 }
                     *     
                     */
                    public void setICMS30(TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 value) {
                        this.icms30 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms40.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 getICMS40() {
                        return icms40;
                    }

                    /**
                     * Define o valor da propriedade icms40.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 }
                     *     
                     */
                    public void setICMS40(TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 value) {
                        this.icms40 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms51.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 getICMS51() {
                        return icms51;
                    }

                    /**
                     * Define o valor da propriedade icms51.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 }
                     *     
                     */
                    public void setICMS51(TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 value) {
                        this.icms51 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms60.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 getICMS60() {
                        return icms60;
                    }

                    /**
                     * Define o valor da propriedade icms60.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 }
                     *     
                     */
                    public void setICMS60(TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 value) {
                        this.icms60 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms70.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 getICMS70() {
                        return icms70;
                    }

                    /**
                     * Define o valor da propriedade icms70.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 }
                     *     
                     */
                    public void setICMS70(TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 value) {
                        this.icms70 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icms90.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 getICMS90() {
                        return icms90;
                    }

                    /**
                     * Define o valor da propriedade icms90.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 }
                     *     
                     */
                    public void setICMS90(TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 value) {
                        this.icms90 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmsPart.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart getICMSPart() {
                        return icmsPart;
                    }

                    /**
                     * Define o valor da propriedade icmsPart.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart }
                     *     
                     */
                    public void setICMSPart(TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart value) {
                        this.icmsPart = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmsst.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSST }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSST getICMSST() {
                        return icmsst;
                    }

                    /**
                     * Define o valor da propriedade icmsst.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSST }
                     *     
                     */
                    public void setICMSST(TNFe.InfNFe.Det.Imposto.ICMS.ICMSST value) {
                        this.icmsst = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmssn101.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 getICMSSN101() {
                        return icmssn101;
                    }

                    /**
                     * Define o valor da propriedade icmssn101.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 }
                     *     
                     */
                    public void setICMSSN101(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 value) {
                        this.icmssn101 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmssn102.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 getICMSSN102() {
                        return icmssn102;
                    }

                    /**
                     * Define o valor da propriedade icmssn102.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 }
                     *     
                     */
                    public void setICMSSN102(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN102 value) {
                        this.icmssn102 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmssn201.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 getICMSSN201() {
                        return icmssn201;
                    }

                    /**
                     * Define o valor da propriedade icmssn201.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 }
                     *     
                     */
                    public void setICMSSN201(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 value) {
                        this.icmssn201 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmssn202.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 getICMSSN202() {
                        return icmssn202;
                    }

                    /**
                     * Define o valor da propriedade icmssn202.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 }
                     *     
                     */
                    public void setICMSSN202(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 value) {
                        this.icmssn202 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmssn500.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 getICMSSN500() {
                        return icmssn500;
                    }

                    /**
                     * Define o valor da propriedade icmssn500.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 }
                     *     
                     */
                    public void setICMSSN500(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 value) {
                        this.icmssn500 = value;
                    }

                    /**
                     * Obt�m o valor da propriedade icmssn900.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 getICMSSN900() {
                        return icmssn900;
                    }

                    /**
                     * Define o valor da propriedade icmssn900.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 }
                     *     
                     */
                    public void setICMSSN900(TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 value) {
                        this.icmssn900 = value;
                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "orig",
                        "cst",
                        "modBC",
                        "vbc",
                        "picms",
                        "vicms",
                        "pfcp",
                        "vfcp"
                    })
                    public static class ICMS00 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBC;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "pICMS", required = true)
                        protected String picms;
                        @XmlElement(name = "vICMS", required = true)
                        protected String vicms;
                        @XmlElement(name = "pFCP")
                        protected String pfcp;
                        @XmlElement(name = "vFCP")
                        protected String vfcp;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCP() {
                            return pfcp;
                        }

                        /**
                         * Define o valor da propriedade pfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCP(String value) {
                            this.pfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCP() {
                            return vfcp;
                        }

                        /**
                         * Define o valor da propriedade vfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCP(String value) {
                            this.vfcp = value;
                        }

                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "orig",
                        "cst",
                        "modBC",
                        "vbc",
                        "picms",
                        "vicms",
                        "vbcfcp",
                        "pfcp",
                        "vfcp",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst",
                        "vicmsstDeson",
                        "motDesICMSST"
                    })
                    public static class ICMS10 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBC;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "pICMS", required = true)
                        protected String picms;
                        @XmlElement(name = "vICMS", required = true)
                        protected String vicms;
                        @XmlElement(name = "vBCFCP")
                        protected String vbcfcp;
                        @XmlElement(name = "pFCP")
                        protected String pfcp;
                        @XmlElement(name = "vFCP")
                        protected String vfcp;
                        @XmlElement(required = true)
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST", required = true)
                        protected String vbcst;
                        @XmlElement(name = "pICMSST", required = true)
                        protected String picmsst;
                        @XmlElement(name = "vICMSST", required = true)
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;
                        @XmlElement(name = "vICMSSTDeson")
                        protected String vicmsstDeson;
                        protected String motDesICMSST;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCP() {
                            return vbcfcp;
                        }

                        /**
                         * Define o valor da propriedade vbcfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCP(String value) {
                            this.vbcfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCP() {
                            return pfcp;
                        }

                        /**
                         * Define o valor da propriedade pfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCP(String value) {
                            this.pfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCP() {
                            return vfcp;
                        }

                        /**
                         * Define o valor da propriedade vfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCP(String value) {
                            this.vfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTDeson() {
                            return vicmsstDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsstDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTDeson(String value) {
                            this.vicmsstDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMSST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMSST() {
                            return motDesICMSST;
                        }

                        /**
                         * Define o valor da propriedade motDesICMSST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMSST(String value) {
                            this.motDesICMSST = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="20"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBC">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMS">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="9"/>
                     *                 &lt;enumeration value="12"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "modBC",
                        "pRedBC",
                        "vbc",
                        "picms",
                        "vicms",
                        "vbcfcp",
                        "pfcp",
                        "vfcp",
                        "vicmsDeson",
                        "motDesICMS"
                    })
                    public static class ICMS20 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBC;
                        @XmlElement(required = true)
                        protected String pRedBC;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "pICMS", required = true)
                        protected String picms;
                        @XmlElement(name = "vICMS", required = true)
                        protected String vicms;
                        @XmlElement(name = "vBCFCP")
                        protected String vbcfcp;
                        @XmlElement(name = "pFCP")
                        protected String pfcp;
                        @XmlElement(name = "vFCP")
                        protected String vfcp;
                        @XmlElement(name = "vICMSDeson")
                        protected String vicmsDeson;
                        protected String motDesICMS;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBC() {
                            return pRedBC;
                        }

                        /**
                         * Define o valor da propriedade pRedBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBC(String value) {
                            this.pRedBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCP() {
                            return vbcfcp;
                        }

                        /**
                         * Define o valor da propriedade vbcfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCP(String value) {
                            this.vbcfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCP() {
                            return pfcp;
                        }

                        /**
                         * Define o valor da propriedade pfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCP(String value) {
                            this.pfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCP() {
                            return vfcp;
                        }

                        /**
                         * Define o valor da propriedade vfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCP(String value) {
                            this.vfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSDeson() {
                            return vicmsDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSDeson(String value) {
                            this.vicmsDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMS() {
                            return motDesICMS;
                        }

                        /**
                         * Define o valor da propriedade motDesICMS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMS(String value) {
                            this.motDesICMS = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="30"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBCST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *               &lt;enumeration value="4"/>
                     *               &lt;enumeration value="5"/>
                     *               &lt;enumeration value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMS">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="6"/>
                     *                 &lt;enumeration value="7"/>
                     *                 &lt;enumeration value="9"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst",
                        "vicmsDeson",
                        "motDesICMS"
                    })
                    public static class ICMS30 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST", required = true)
                        protected String vbcst;
                        @XmlElement(name = "pICMSST", required = true)
                        protected String picmsst;
                        @XmlElement(name = "vICMSST", required = true)
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;
                        @XmlElement(name = "vICMSDeson")
                        protected String vicmsDeson;
                        protected String motDesICMS;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSDeson() {
                            return vicmsDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSDeson(String value) {
                            this.vicmsDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMS() {
                            return motDesICMS;
                        }

                        /**
                         * Define o valor da propriedade motDesICMS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMS(String value) {
                            this.motDesICMS = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="40"/>
                     *               &lt;enumeration value="41"/>
                     *               &lt;enumeration value="50"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMS">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="1"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="4"/>
                     *                 &lt;enumeration value="5"/>
                     *                 &lt;enumeration value="6"/>
                     *                 &lt;enumeration value="7"/>
                     *                 &lt;enumeration value="8"/>
                     *                 &lt;enumeration value="9"/>
                     *                 &lt;enumeration value="10"/>
                     *                 &lt;enumeration value="11"/>
                     *                 &lt;enumeration value="16"/>
                     *                 &lt;enumeration value="90"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "vicmsDeson",
                        "motDesICMS"
                    })
                    public static class ICMS40 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vICMSDeson")
                        protected String vicmsDeson;
                        protected String motDesICMS;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSDeson() {
                            return vicmsDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSDeson(String value) {
                            this.vicmsDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMS() {
                            return motDesICMS;
                        }

                        /**
                         * Define o valor da propriedade motDesICMS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMS(String value) {
                            this.motDesICMS = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="51"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBC" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
                     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
                     *         &lt;element name="vICMSOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *         &lt;element name="pDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
                     *         &lt;element name="vICMSDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="pFCPDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="vFCPDif" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *           &lt;element name="vFCPEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "modBC",
                        "pRedBC",
                        "vbc",
                        "picms",
                        "vicmsOp",
                        "pDif",
                        "vicmsDif",
                        "vicms",
                        "vbcfcp",
                        "pfcp",
                        "vfcp",
                        "pfcpDif",
                        "vfcpDif",
                        "vfcpEfet"
                    })
                    public static class ICMS51 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        protected String modBC;
                        protected String pRedBC;
                        @XmlElement(name = "vBC")
                        protected String vbc;
                        @XmlElement(name = "pICMS")
                        protected String picms;
                        @XmlElement(name = "vICMSOp")
                        protected String vicmsOp;
                        protected String pDif;
                        @XmlElement(name = "vICMSDif")
                        protected String vicmsDif;
                        @XmlElement(name = "vICMS")
                        protected String vicms;
                        @XmlElement(name = "vBCFCP")
                        protected String vbcfcp;
                        @XmlElement(name = "pFCP")
                        protected String pfcp;
                        @XmlElement(name = "vFCP")
                        protected String vfcp;
                        @XmlElement(name = "pFCPDif")
                        protected String pfcpDif;
                        @XmlElement(name = "vFCPDif")
                        protected String vfcpDif;
                        @XmlElement(name = "vFCPEfet")
                        protected String vfcpEfet;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBC() {
                            return pRedBC;
                        }

                        /**
                         * Define o valor da propriedade pRedBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBC(String value) {
                            this.pRedBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsOp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSOp() {
                            return vicmsOp;
                        }

                        /**
                         * Define o valor da propriedade vicmsOp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSOp(String value) {
                            this.vicmsOp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pDif.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPDif() {
                            return pDif;
                        }

                        /**
                         * Define o valor da propriedade pDif.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPDif(String value) {
                            this.pDif = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsDif.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSDif() {
                            return vicmsDif;
                        }

                        /**
                         * Define o valor da propriedade vicmsDif.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSDif(String value) {
                            this.vicmsDif = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCP() {
                            return vbcfcp;
                        }

                        /**
                         * Define o valor da propriedade vbcfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCP(String value) {
                            this.vbcfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCP() {
                            return pfcp;
                        }

                        /**
                         * Define o valor da propriedade pfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCP(String value) {
                            this.pfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCP() {
                            return vfcp;
                        }

                        /**
                         * Define o valor da propriedade vfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCP(String value) {
                            this.vfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpDif.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPDif() {
                            return pfcpDif;
                        }

                        /**
                         * Define o valor da propriedade pfcpDif.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPDif(String value) {
                            this.pfcpDif = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpDif.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPDif() {
                            return vfcpDif;
                        }

                        /**
                         * Define o valor da propriedade vfcpDif.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPDif(String value) {
                            this.vfcpDif = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPEfet() {
                            return vfcpEfet;
                        }

                        /**
                         * Define o valor da propriedade vfcpEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPEfet(String value) {
                            this.vfcpEfet = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vICMSSubstituto" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *           &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="pRedBCEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vBCEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pICMSEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vICMSEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "vbcstRet",
                        "pst",
                        "vicmsSubstituto",
                        "vicmsstRet",
                        "vbcfcpstRet",
                        "pfcpstRet",
                        "vfcpstRet",
                        "pRedBCEfet",
                        "vbcEfet",
                        "picmsEfet",
                        "vicmsEfet"
                    })
                    public static class ICMS60 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBCSTRet")
                        protected String vbcstRet;
                        @XmlElement(name = "pST")
                        protected String pst;
                        @XmlElement(name = "vICMSSubstituto")
                        protected String vicmsSubstituto;
                        @XmlElement(name = "vICMSSTRet")
                        protected String vicmsstRet;
                        @XmlElement(name = "vBCFCPSTRet")
                        protected String vbcfcpstRet;
                        @XmlElement(name = "pFCPSTRet")
                        protected String pfcpstRet;
                        @XmlElement(name = "vFCPSTRet")
                        protected String vfcpstRet;
                        protected String pRedBCEfet;
                        @XmlElement(name = "vBCEfet")
                        protected String vbcEfet;
                        @XmlElement(name = "pICMSEfet")
                        protected String picmsEfet;
                        @XmlElement(name = "vICMSEfet")
                        protected String vicmsEfet;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCSTRet() {
                            return vbcstRet;
                        }

                        /**
                         * Define o valor da propriedade vbcstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCSTRet(String value) {
                            this.vbcstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPST() {
                            return pst;
                        }

                        /**
                         * Define o valor da propriedade pst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPST(String value) {
                            this.pst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsSubstituto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSubstituto() {
                            return vicmsSubstituto;
                        }

                        /**
                         * Define o valor da propriedade vicmsSubstituto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSubstituto(String value) {
                            this.vicmsSubstituto = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTRet() {
                            return vicmsstRet;
                        }

                        /**
                         * Define o valor da propriedade vicmsstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTRet(String value) {
                            this.vicmsstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPSTRet() {
                            return vbcfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPSTRet(String value) {
                            this.vbcfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPSTRet() {
                            return pfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade pfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPSTRet(String value) {
                            this.pfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPSTRet() {
                            return vfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade vfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPSTRet(String value) {
                            this.vfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCEfet() {
                            return pRedBCEfet;
                        }

                        /**
                         * Define o valor da propriedade pRedBCEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCEfet(String value) {
                            this.pRedBCEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCEfet() {
                            return vbcEfet;
                        }

                        /**
                         * Define o valor da propriedade vbcEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCEfet(String value) {
                            this.vbcEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSEfet() {
                            return picmsEfet;
                        }

                        /**
                         * Define o valor da propriedade picmsEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSEfet(String value) {
                            this.picmsEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSEfet() {
                            return vicmsEfet;
                        }

                        /**
                         * Define o valor da propriedade vicmsEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSEfet(String value) {
                            this.vicmsEfet = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="70"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBC">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;element name="modBCST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *               &lt;enumeration value="4"/>
                     *               &lt;enumeration value="5"/>
                     *               &lt;enumeration value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMS">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="9"/>
                     *                 &lt;enumeration value="12"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSSTDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMSST">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="9"/>
                     *                 &lt;enumeration value="12"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "modBC",
                        "pRedBC",
                        "vbc",
                        "picms",
                        "vicms",
                        "vbcfcp",
                        "pfcp",
                        "vfcp",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst",
                        "vicmsDeson",
                        "motDesICMS",
                        "vicmsstDeson",
                        "motDesICMSST"
                    })
                    public static class ICMS70 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBC;
                        @XmlElement(required = true)
                        protected String pRedBC;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "pICMS", required = true)
                        protected String picms;
                        @XmlElement(name = "vICMS", required = true)
                        protected String vicms;
                        @XmlElement(name = "vBCFCP")
                        protected String vbcfcp;
                        @XmlElement(name = "pFCP")
                        protected String pfcp;
                        @XmlElement(name = "vFCP")
                        protected String vfcp;
                        @XmlElement(required = true)
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST", required = true)
                        protected String vbcst;
                        @XmlElement(name = "pICMSST", required = true)
                        protected String picmsst;
                        @XmlElement(name = "vICMSST", required = true)
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;
                        @XmlElement(name = "vICMSDeson")
                        protected String vicmsDeson;
                        protected String motDesICMS;
                        @XmlElement(name = "vICMSSTDeson")
                        protected String vicmsstDeson;
                        protected String motDesICMSST;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBC() {
                            return pRedBC;
                        }

                        /**
                         * Define o valor da propriedade pRedBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBC(String value) {
                            this.pRedBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCP() {
                            return vbcfcp;
                        }

                        /**
                         * Define o valor da propriedade vbcfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCP(String value) {
                            this.vbcfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCP() {
                            return pfcp;
                        }

                        /**
                         * Define o valor da propriedade pfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCP(String value) {
                            this.pfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCP() {
                            return vfcp;
                        }

                        /**
                         * Define o valor da propriedade vfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCP(String value) {
                            this.vfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSDeson() {
                            return vicmsDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSDeson(String value) {
                            this.vicmsDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMS() {
                            return motDesICMS;
                        }

                        /**
                         * Define o valor da propriedade motDesICMS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMS(String value) {
                            this.motDesICMS = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTDeson() {
                            return vicmsstDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsstDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTDeson(String value) {
                            this.vicmsstDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMSST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMSST() {
                            return motDesICMSST;
                        }

                        /**
                         * Define o valor da propriedade motDesICMSST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMSST(String value) {
                            this.motDesICMSST = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="90"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="modBC">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="0"/>
                     *                 &lt;enumeration value="1"/>
                     *                 &lt;enumeration value="2"/>
                     *                 &lt;enumeration value="3"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;sequence minOccurs="0">
                     *             &lt;element name="vBCFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *             &lt;element name="pFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *             &lt;element name="vFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;/sequence>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="modBCST">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="0"/>
                     *                 &lt;enumeration value="1"/>
                     *                 &lt;enumeration value="2"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="4"/>
                     *                 &lt;enumeration value="5"/>
                     *                 &lt;enumeration value="6"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;sequence minOccurs="0">
                     *             &lt;element name="vBCFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *             &lt;element name="pFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *             &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;/sequence>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMS">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="9"/>
                     *                 &lt;enumeration value="12"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vICMSSTDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="motDesICMSST">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="9"/>
                     *                 &lt;enumeration value="12"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "modBC",
                        "vbc",
                        "pRedBC",
                        "picms",
                        "vicms",
                        "vbcfcp",
                        "pfcp",
                        "vfcp",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst",
                        "vicmsDeson",
                        "motDesICMS",
                        "vicmsstDeson",
                        "motDesICMSST"
                    })
                    public static class ICMS90 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        protected String modBC;
                        @XmlElement(name = "vBC")
                        protected String vbc;
                        protected String pRedBC;
                        @XmlElement(name = "pICMS")
                        protected String picms;
                        @XmlElement(name = "vICMS")
                        protected String vicms;
                        @XmlElement(name = "vBCFCP")
                        protected String vbcfcp;
                        @XmlElement(name = "pFCP")
                        protected String pfcp;
                        @XmlElement(name = "vFCP")
                        protected String vfcp;
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST")
                        protected String vbcst;
                        @XmlElement(name = "pICMSST")
                        protected String picmsst;
                        @XmlElement(name = "vICMSST")
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;
                        @XmlElement(name = "vICMSDeson")
                        protected String vicmsDeson;
                        protected String motDesICMS;
                        @XmlElement(name = "vICMSSTDeson")
                        protected String vicmsstDeson;
                        protected String motDesICMSST;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBC() {
                            return pRedBC;
                        }

                        /**
                         * Define o valor da propriedade pRedBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBC(String value) {
                            this.pRedBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCP() {
                            return vbcfcp;
                        }

                        /**
                         * Define o valor da propriedade vbcfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCP(String value) {
                            this.vbcfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCP() {
                            return pfcp;
                        }

                        /**
                         * Define o valor da propriedade pfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCP(String value) {
                            this.pfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCP() {
                            return vfcp;
                        }

                        /**
                         * Define o valor da propriedade vfcp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCP(String value) {
                            this.vfcp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSDeson() {
                            return vicmsDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSDeson(String value) {
                            this.vicmsDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMS() {
                            return motDesICMS;
                        }

                        /**
                         * Define o valor da propriedade motDesICMS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMS(String value) {
                            this.motDesICMS = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstDeson.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTDeson() {
                            return vicmsstDeson;
                        }

                        /**
                         * Define o valor da propriedade vicmsstDeson.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTDeson(String value) {
                            this.vicmsstDeson = value;
                        }

                        /**
                         * Obt�m o valor da propriedade motDesICMSST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMotDesICMSST() {
                            return motDesICMSST;
                        }

                        /**
                         * Define o valor da propriedade motDesICMSST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMotDesICMSST(String value) {
                            this.motDesICMSST = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="10"/>
                     *               &lt;enumeration value="90"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBC">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="modBCST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *               &lt;enumeration value="4"/>
                     *               &lt;enumeration value="5"/>
                     *               &lt;enumeration value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pBCOp" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *         &lt;element name="UFST" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
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
                        "orig",
                        "cst",
                        "modBC",
                        "vbc",
                        "pRedBC",
                        "picms",
                        "vicms",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "pbcOp",
                        "ufst"
                    })
                    public static class ICMSPart {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBC;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        protected String pRedBC;
                        @XmlElement(name = "pICMS", required = true)
                        protected String picms;
                        @XmlElement(name = "vICMS", required = true)
                        protected String vicms;
                        @XmlElement(required = true)
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST", required = true)
                        protected String vbcst;
                        @XmlElement(name = "pICMSST", required = true)
                        protected String picmsst;
                        @XmlElement(name = "vICMSST", required = true)
                        protected String vicmsst;
                        @XmlElement(name = "pBCOp", required = true)
                        protected String pbcOp;
                        @XmlElement(name = "UFST", required = true)
                        @XmlSchemaType(name = "string")
                        protected TUf ufst;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBC() {
                            return pRedBC;
                        }

                        /**
                         * Define o valor da propriedade pRedBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBC(String value) {
                            this.pRedBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pbcOp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPBCOp() {
                            return pbcOp;
                        }

                        /**
                         * Define o valor da propriedade pbcOp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPBCOp(String value) {
                            this.pbcOp = value;
                        }

                        /**
                         * Obt�m o valor da propriedade ufst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TUf }
                         *     
                         */
                        public TUf getUFST() {
                            return ufst;
                        }

                        /**
                         * Define o valor da propriedade ufst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TUf }
                         *     
                         */
                        public void setUFST(TUf value) {
                            this.ufst = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CSOSN">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="101"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "orig",
                        "csosn",
                        "pCredSN",
                        "vCredICMSSN"
                    })
                    public static class ICMSSN101 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CSOSN", required = true)
                        protected String csosn;
                        @XmlElement(required = true)
                        protected String pCredSN;
                        @XmlElement(required = true)
                        protected String vCredICMSSN;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade csosn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCSOSN() {
                            return csosn;
                        }

                        /**
                         * Define o valor da propriedade csosn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCSOSN(String value) {
                            this.csosn = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pCredSN.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPCredSN() {
                            return pCredSN;
                        }

                        /**
                         * Define o valor da propriedade pCredSN.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPCredSN(String value) {
                            this.pCredSN = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vCredICMSSN.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCredICMSSN() {
                            return vCredICMSSN;
                        }

                        /**
                         * Define o valor da propriedade vCredICMSSN.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCredICMSSN(String value) {
                            this.vCredICMSSN = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CSOSN">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="102"/>
                     *               &lt;enumeration value="103"/>
                     *               &lt;enumeration value="300"/>
                     *               &lt;enumeration value="400"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
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
                    @XmlType(name = "", propOrder = {
                        "orig",
                        "csosn"
                    })
                    public static class ICMSSN102 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CSOSN", required = true)
                        protected String csosn;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade csosn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCSOSN() {
                            return csosn;
                        }

                        /**
                         * Define o valor da propriedade csosn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCSOSN(String value) {
                            this.csosn = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CSOSN">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="201"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBCST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *               &lt;enumeration value="4"/>
                     *               &lt;enumeration value="5"/>
                     *               &lt;enumeration value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "orig",
                        "csosn",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst",
                        "pCredSN",
                        "vCredICMSSN"
                    })
                    public static class ICMSSN201 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CSOSN", required = true)
                        protected String csosn;
                        @XmlElement(required = true)
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST", required = true)
                        protected String vbcst;
                        @XmlElement(name = "pICMSST", required = true)
                        protected String picmsst;
                        @XmlElement(name = "vICMSST", required = true)
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;
                        @XmlElement(required = true)
                        protected String pCredSN;
                        @XmlElement(required = true)
                        protected String vCredICMSSN;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade csosn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCSOSN() {
                            return csosn;
                        }

                        /**
                         * Define o valor da propriedade csosn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCSOSN(String value) {
                            this.csosn = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pCredSN.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPCredSN() {
                            return pCredSN;
                        }

                        /**
                         * Define o valor da propriedade pCredSN.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPCredSN(String value) {
                            this.pCredSN = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vCredICMSSN.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCredICMSSN() {
                            return vCredICMSSN;
                        }

                        /**
                         * Define o valor da propriedade vCredICMSSN.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCredICMSSN(String value) {
                            this.vCredICMSSN = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CSOSN">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="202"/>
                     *               &lt;enumeration value="203"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="modBCST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="0"/>
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="3"/>
                     *               &lt;enumeration value="4"/>
                     *               &lt;enumeration value="5"/>
                     *               &lt;enumeration value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
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
                        "orig",
                        "csosn",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst"
                    })
                    public static class ICMSSN202 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CSOSN", required = true)
                        protected String csosn;
                        @XmlElement(required = true)
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST", required = true)
                        protected String vbcst;
                        @XmlElement(name = "pICMSST", required = true)
                        protected String picmsst;
                        @XmlElement(name = "vICMSST", required = true)
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade csosn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCSOSN() {
                            return csosn;
                        }

                        /**
                         * Define o valor da propriedade csosn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCSOSN(String value) {
                            this.csosn = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CSOSN">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="500"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vICMSSubstituto" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *           &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="pRedBCEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vBCEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pICMSEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vICMSEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
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
                        "orig",
                        "csosn",
                        "vbcstRet",
                        "pst",
                        "vicmsSubstituto",
                        "vicmsstRet",
                        "vbcfcpstRet",
                        "pfcpstRet",
                        "vfcpstRet",
                        "pRedBCEfet",
                        "vbcEfet",
                        "picmsEfet",
                        "vicmsEfet"
                    })
                    public static class ICMSSN500 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CSOSN", required = true)
                        protected String csosn;
                        @XmlElement(name = "vBCSTRet")
                        protected String vbcstRet;
                        @XmlElement(name = "pST")
                        protected String pst;
                        @XmlElement(name = "vICMSSubstituto")
                        protected String vicmsSubstituto;
                        @XmlElement(name = "vICMSSTRet")
                        protected String vicmsstRet;
                        @XmlElement(name = "vBCFCPSTRet")
                        protected String vbcfcpstRet;
                        @XmlElement(name = "pFCPSTRet")
                        protected String pfcpstRet;
                        @XmlElement(name = "vFCPSTRet")
                        protected String vfcpstRet;
                        protected String pRedBCEfet;
                        @XmlElement(name = "vBCEfet")
                        protected String vbcEfet;
                        @XmlElement(name = "pICMSEfet")
                        protected String picmsEfet;
                        @XmlElement(name = "vICMSEfet")
                        protected String vicmsEfet;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade csosn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCSOSN() {
                            return csosn;
                        }

                        /**
                         * Define o valor da propriedade csosn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCSOSN(String value) {
                            this.csosn = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCSTRet() {
                            return vbcstRet;
                        }

                        /**
                         * Define o valor da propriedade vbcstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCSTRet(String value) {
                            this.vbcstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPST() {
                            return pst;
                        }

                        /**
                         * Define o valor da propriedade pst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPST(String value) {
                            this.pst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsSubstituto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSubstituto() {
                            return vicmsSubstituto;
                        }

                        /**
                         * Define o valor da propriedade vicmsSubstituto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSubstituto(String value) {
                            this.vicmsSubstituto = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTRet() {
                            return vicmsstRet;
                        }

                        /**
                         * Define o valor da propriedade vicmsstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTRet(String value) {
                            this.vicmsstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPSTRet() {
                            return vbcfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPSTRet(String value) {
                            this.vbcfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPSTRet() {
                            return pfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade pfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPSTRet(String value) {
                            this.pfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPSTRet() {
                            return vfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade vfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPSTRet(String value) {
                            this.vfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCEfet() {
                            return pRedBCEfet;
                        }

                        /**
                         * Define o valor da propriedade pRedBCEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCEfet(String value) {
                            this.pRedBCEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCEfet() {
                            return vbcEfet;
                        }

                        /**
                         * Define o valor da propriedade vbcEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCEfet(String value) {
                            this.vbcEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSEfet() {
                            return picmsEfet;
                        }

                        /**
                         * Define o valor da propriedade picmsEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSEfet(String value) {
                            this.picmsEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSEfet() {
                            return vicmsEfet;
                        }

                        /**
                         * Define o valor da propriedade vicmsEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSEfet(String value) {
                            this.vicmsEfet = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CSOSN">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="900"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="modBC">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="0"/>
                     *                 &lt;enumeration value="1"/>
                     *                 &lt;enumeration value="2"/>
                     *                 &lt;enumeration value="3"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *           &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *           &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="modBCST">
                     *             &lt;simpleType>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                 &lt;whiteSpace value="preserve"/>
                     *                 &lt;enumeration value="0"/>
                     *                 &lt;enumeration value="1"/>
                     *                 &lt;enumeration value="2"/>
                     *                 &lt;enumeration value="3"/>
                     *                 &lt;enumeration value="4"/>
                     *                 &lt;enumeration value="5"/>
                     *                 &lt;enumeration value="6"/>
                     *               &lt;/restriction>
                     *             &lt;/simpleType>
                     *           &lt;/element>
                     *           &lt;element name="pMVAST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="pRedBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *           &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *           &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;sequence minOccurs="0">
                     *             &lt;element name="vBCFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *             &lt;element name="pFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *             &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;/sequence>
                     *         &lt;/sequence>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="pCredSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *           &lt;element name="vCredICMSSN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
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
                        "orig",
                        "csosn",
                        "modBC",
                        "vbc",
                        "pRedBC",
                        "picms",
                        "vicms",
                        "modBCST",
                        "pmvast",
                        "pRedBCST",
                        "vbcst",
                        "picmsst",
                        "vicmsst",
                        "vbcfcpst",
                        "pfcpst",
                        "vfcpst",
                        "pCredSN",
                        "vCredICMSSN"
                    })
                    public static class ICMSSN900 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CSOSN", required = true)
                        protected String csosn;
                        protected String modBC;
                        @XmlElement(name = "vBC")
                        protected String vbc;
                        protected String pRedBC;
                        @XmlElement(name = "pICMS")
                        protected String picms;
                        @XmlElement(name = "vICMS")
                        protected String vicms;
                        protected String modBCST;
                        @XmlElement(name = "pMVAST")
                        protected String pmvast;
                        protected String pRedBCST;
                        @XmlElement(name = "vBCST")
                        protected String vbcst;
                        @XmlElement(name = "pICMSST")
                        protected String picmsst;
                        @XmlElement(name = "vICMSST")
                        protected String vicmsst;
                        @XmlElement(name = "vBCFCPST")
                        protected String vbcfcpst;
                        @XmlElement(name = "pFCPST")
                        protected String pfcpst;
                        @XmlElement(name = "vFCPST")
                        protected String vfcpst;
                        protected String pCredSN;
                        protected String vCredICMSSN;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade csosn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCSOSN() {
                            return csosn;
                        }

                        /**
                         * Define o valor da propriedade csosn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCSOSN(String value) {
                            this.csosn = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBC() {
                            return pRedBC;
                        }

                        /**
                         * Define o valor da propriedade pRedBC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBC(String value) {
                            this.pRedBC = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMS(String value) {
                            this.picms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obt�m o valor da propriedade modBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getModBCST() {
                            return modBCST;
                        }

                        /**
                         * Define o valor da propriedade modBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setModBCST(String value) {
                            this.modBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pmvast.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPMVAST() {
                            return pmvast;
                        }

                        /**
                         * Define o valor da propriedade pmvast.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPMVAST(String value) {
                            this.pmvast = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCST.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCST() {
                            return pRedBCST;
                        }

                        /**
                         * Define o valor da propriedade pRedBCST.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCST(String value) {
                            this.pRedBCST = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCST() {
                            return vbcst;
                        }

                        /**
                         * Define o valor da propriedade vbcst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCST(String value) {
                            this.vbcst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSST() {
                            return picmsst;
                        }

                        /**
                         * Define o valor da propriedade picmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSST(String value) {
                            this.picmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSST() {
                            return vicmsst;
                        }

                        /**
                         * Define o valor da propriedade vicmsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSST(String value) {
                            this.vicmsst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPST() {
                            return vbcfcpst;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPST(String value) {
                            this.vbcfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPST() {
                            return pfcpst;
                        }

                        /**
                         * Define o valor da propriedade pfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPST(String value) {
                            this.pfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPST() {
                            return vfcpst;
                        }

                        /**
                         * Define o valor da propriedade vfcpst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPST(String value) {
                            this.vfcpst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pCredSN.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPCredSN() {
                            return pCredSN;
                        }

                        /**
                         * Define o valor da propriedade pCredSN.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPCredSN(String value) {
                            this.pCredSN = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vCredICMSSN.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCredICMSSN() {
                            return vCredICMSSN;
                        }

                        /**
                         * Define o valor da propriedade vCredICMSSN.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCredICMSSN(String value) {
                            this.vCredICMSSN = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="orig" type="{http://www.portalfiscal.inf.br/nfe}Torig"/>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="41"/>
                     *               &lt;enumeration value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pST" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc" minOccurs="0"/>
                     *         &lt;element name="vICMSSubstituto" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                     *         &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="vBCFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
                     *         &lt;element name="vBCSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="vICMSSTDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;sequence minOccurs="0">
                     *           &lt;element name="pRedBCEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vBCEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *           &lt;element name="pICMSEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Opc"/>
                     *           &lt;element name="vICMSEfet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;/sequence>
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
                        "orig",
                        "cst",
                        "vbcstRet",
                        "pst",
                        "vicmsSubstituto",
                        "vicmsstRet",
                        "vbcfcpstRet",
                        "pfcpstRet",
                        "vfcpstRet",
                        "vbcstDest",
                        "vicmsstDest",
                        "pRedBCEfet",
                        "vbcEfet",
                        "picmsEfet",
                        "vicmsEfet"
                    })
                    public static class ICMSST {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBCSTRet", required = true)
                        protected String vbcstRet;
                        @XmlElement(name = "pST")
                        protected String pst;
                        @XmlElement(name = "vICMSSubstituto")
                        protected String vicmsSubstituto;
                        @XmlElement(name = "vICMSSTRet", required = true)
                        protected String vicmsstRet;
                        @XmlElement(name = "vBCFCPSTRet")
                        protected String vbcfcpstRet;
                        @XmlElement(name = "pFCPSTRet")
                        protected String pfcpstRet;
                        @XmlElement(name = "vFCPSTRet")
                        protected String vfcpstRet;
                        @XmlElement(name = "vBCSTDest", required = true)
                        protected String vbcstDest;
                        @XmlElement(name = "vICMSSTDest", required = true)
                        protected String vicmsstDest;
                        protected String pRedBCEfet;
                        @XmlElement(name = "vBCEfet")
                        protected String vbcEfet;
                        @XmlElement(name = "pICMSEfet")
                        protected String picmsEfet;
                        @XmlElement(name = "vICMSEfet")
                        protected String vicmsEfet;

                        /**
                         * Obt�m o valor da propriedade orig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCSTRet() {
                            return vbcstRet;
                        }

                        /**
                         * Define o valor da propriedade vbcstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCSTRet(String value) {
                            this.vbcstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPST() {
                            return pst;
                        }

                        /**
                         * Define o valor da propriedade pst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPST(String value) {
                            this.pst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsSubstituto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSubstituto() {
                            return vicmsSubstituto;
                        }

                        /**
                         * Define o valor da propriedade vicmsSubstituto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSubstituto(String value) {
                            this.vicmsSubstituto = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTRet() {
                            return vicmsstRet;
                        }

                        /**
                         * Define o valor da propriedade vicmsstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTRet(String value) {
                            this.vicmsstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCFCPSTRet() {
                            return vbcfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade vbcfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCFCPSTRet(String value) {
                            this.vbcfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPFCPSTRet() {
                            return pfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade pfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPFCPSTRet(String value) {
                            this.pfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vfcpstRet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVFCPSTRet() {
                            return vfcpstRet;
                        }

                        /**
                         * Define o valor da propriedade vfcpstRet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVFCPSTRet(String value) {
                            this.vfcpstRet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcstDest.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCSTDest() {
                            return vbcstDest;
                        }

                        /**
                         * Define o valor da propriedade vbcstDest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCSTDest(String value) {
                            this.vbcstDest = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsstDest.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSSTDest() {
                            return vicmsstDest;
                        }

                        /**
                         * Define o valor da propriedade vicmsstDest.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSSTDest(String value) {
                            this.vicmsstDest = value;
                        }

                        /**
                         * Obt�m o valor da propriedade pRedBCEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRedBCEfet() {
                            return pRedBCEfet;
                        }

                        /**
                         * Define o valor da propriedade pRedBCEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRedBCEfet(String value) {
                            this.pRedBCEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbcEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBCEfet() {
                            return vbcEfet;
                        }

                        /**
                         * Define o valor da propriedade vbcEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBCEfet(String value) {
                            this.vbcEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade picmsEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPICMSEfet() {
                            return picmsEfet;
                        }

                        /**
                         * Define o valor da propriedade picmsEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPICMSEfet(String value) {
                            this.picmsEfet = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vicmsEfet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMSEfet() {
                            return vicmsEfet;
                        }

                        /**
                         * Define o valor da propriedade vicmsEfet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMSEfet(String value) {
                            this.vicmsEfet = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="vBCUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="vBCFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                 *         &lt;element name="pFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04" minOccurs="0"/>
                 *         &lt;element name="pICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                 *         &lt;element name="pICMSInter">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="4.00"/>
                 *               &lt;enumeration value="7.00"/>
                 *               &lt;enumeration value="12.00"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pICMSInterPart" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                 *         &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                 *         &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                    "vbcufDest",
                    "vbcfcpufDest",
                    "pfcpufDest",
                    "picmsufDest",
                    "picmsInter",
                    "picmsInterPart",
                    "vfcpufDest",
                    "vicmsufDest",
                    "vicmsufRemet"
                })
                public static class ICMSUFDest {

                    @XmlElement(name = "vBCUFDest", required = true)
                    protected String vbcufDest;
                    @XmlElement(name = "vBCFCPUFDest")
                    protected String vbcfcpufDest;
                    @XmlElement(name = "pFCPUFDest")
                    protected String pfcpufDest;
                    @XmlElement(name = "pICMSUFDest", required = true)
                    protected String picmsufDest;
                    @XmlElement(name = "pICMSInter", required = true)
                    protected String picmsInter;
                    @XmlElement(name = "pICMSInterPart", required = true)
                    protected String picmsInterPart;
                    @XmlElement(name = "vFCPUFDest")
                    protected String vfcpufDest;
                    @XmlElement(name = "vICMSUFDest", required = true)
                    protected String vicmsufDest;
                    @XmlElement(name = "vICMSUFRemet", required = true)
                    protected String vicmsufRemet;

                    /**
                     * Obt�m o valor da propriedade vbcufDest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVBCUFDest() {
                        return vbcufDest;
                    }

                    /**
                     * Define o valor da propriedade vbcufDest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVBCUFDest(String value) {
                        this.vbcufDest = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vbcfcpufDest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVBCFCPUFDest() {
                        return vbcfcpufDest;
                    }

                    /**
                     * Define o valor da propriedade vbcfcpufDest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVBCFCPUFDest(String value) {
                        this.vbcfcpufDest = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pfcpufDest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPFCPUFDest() {
                        return pfcpufDest;
                    }

                    /**
                     * Define o valor da propriedade pfcpufDest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPFCPUFDest(String value) {
                        this.pfcpufDest = value;
                    }

                    /**
                     * Obt�m o valor da propriedade picmsufDest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPICMSUFDest() {
                        return picmsufDest;
                    }

                    /**
                     * Define o valor da propriedade picmsufDest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPICMSUFDest(String value) {
                        this.picmsufDest = value;
                    }

                    /**
                     * Obt�m o valor da propriedade picmsInter.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPICMSInter() {
                        return picmsInter;
                    }

                    /**
                     * Define o valor da propriedade picmsInter.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPICMSInter(String value) {
                        this.picmsInter = value;
                    }

                    /**
                     * Obt�m o valor da propriedade picmsInterPart.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPICMSInterPart() {
                        return picmsInterPart;
                    }

                    /**
                     * Define o valor da propriedade picmsInterPart.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPICMSInterPart(String value) {
                        this.picmsInterPart = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vfcpufDest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVFCPUFDest() {
                        return vfcpufDest;
                    }

                    /**
                     * Define o valor da propriedade vfcpufDest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVFCPUFDest(String value) {
                        this.vfcpufDest = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vicmsufDest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVICMSUFDest() {
                        return vicmsufDest;
                    }

                    /**
                     * Define o valor da propriedade vicmsufDest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVICMSUFDest(String value) {
                        this.vicmsufDest = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vicmsufRemet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVICMSUFRemet() {
                        return vicmsufRemet;
                    }

                    /**
                     * Define o valor da propriedade vicmsufRemet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVICMSUFRemet(String value) {
                        this.vicmsufRemet = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="vDespAdu" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="vIOF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                    "vbc",
                    "vDespAdu",
                    "vii",
                    "viof"
                })
                public static class II {

                    @XmlElement(name = "vBC", required = true)
                    protected String vbc;
                    @XmlElement(required = true)
                    protected String vDespAdu;
                    @XmlElement(name = "vII", required = true)
                    protected String vii;
                    @XmlElement(name = "vIOF", required = true)
                    protected String viof;

                    /**
                     * Obt�m o valor da propriedade vbc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVBC() {
                        return vbc;
                    }

                    /**
                     * Define o valor da propriedade vbc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVBC(String value) {
                        this.vbc = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vDespAdu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVDespAdu() {
                        return vDespAdu;
                    }

                    /**
                     * Define o valor da propriedade vDespAdu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVDespAdu(String value) {
                        this.vDespAdu = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vii.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVII() {
                        return vii;
                    }

                    /**
                     * Define o valor da propriedade vii.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVII(String value) {
                        this.vii = value;
                    }

                    /**
                     * Obt�m o valor da propriedade viof.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVIOF() {
                        return viof;
                    }

                    /**
                     * Define o valor da propriedade viof.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVIOF(String value) {
                        this.viof = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="vAliq" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                 *         &lt;element name="vISSQN" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
                 *         &lt;element name="cListServ" type="{http://www.portalfiscal.inf.br/nfe}TCListServ"/>
                 *         &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="indISS">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="4"/>
                 *               &lt;enumeration value="5"/>
                 *               &lt;enumeration value="6"/>
                 *               &lt;enumeration value="7"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cServico" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cMun" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE" minOccurs="0"/>
                 *         &lt;element name="cPais" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,4}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nProcesso" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="indIncentivo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "vbc",
                    "vAliq",
                    "vissqn",
                    "cMunFG",
                    "cListServ",
                    "vDeducao",
                    "vOutro",
                    "vDescIncond",
                    "vDescCond",
                    "vissRet",
                    "indISS",
                    "cServico",
                    "cMun",
                    "cPais",
                    "nProcesso",
                    "indIncentivo"
                })
                public static class ISSQN {

                    @XmlElement(name = "vBC", required = true)
                    protected String vbc;
                    @XmlElement(required = true)
                    protected String vAliq;
                    @XmlElement(name = "vISSQN", required = true)
                    protected String vissqn;
                    @XmlElement(required = true)
                    protected String cMunFG;
                    @XmlElement(required = true)
                    protected String cListServ;
                    protected String vDeducao;
                    protected String vOutro;
                    protected String vDescIncond;
                    protected String vDescCond;
                    @XmlElement(name = "vISSRet")
                    protected String vissRet;
                    @XmlElement(required = true)
                    protected String indISS;
                    protected String cServico;
                    protected String cMun;
                    protected String cPais;
                    protected String nProcesso;
                    @XmlElement(required = true)
                    protected String indIncentivo;

                    /**
                     * Obt�m o valor da propriedade vbc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVBC() {
                        return vbc;
                    }

                    /**
                     * Define o valor da propriedade vbc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVBC(String value) {
                        this.vbc = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vAliq.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVAliq() {
                        return vAliq;
                    }

                    /**
                     * Define o valor da propriedade vAliq.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVAliq(String value) {
                        this.vAliq = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vissqn.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVISSQN() {
                        return vissqn;
                    }

                    /**
                     * Define o valor da propriedade vissqn.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVISSQN(String value) {
                        this.vissqn = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cMunFG.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCMunFG() {
                        return cMunFG;
                    }

                    /**
                     * Define o valor da propriedade cMunFG.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCMunFG(String value) {
                        this.cMunFG = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cListServ.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCListServ() {
                        return cListServ;
                    }

                    /**
                     * Define o valor da propriedade cListServ.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCListServ(String value) {
                        this.cListServ = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vDeducao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVDeducao() {
                        return vDeducao;
                    }

                    /**
                     * Define o valor da propriedade vDeducao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVDeducao(String value) {
                        this.vDeducao = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vOutro.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVOutro() {
                        return vOutro;
                    }

                    /**
                     * Define o valor da propriedade vOutro.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVOutro(String value) {
                        this.vOutro = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vDescIncond.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVDescIncond() {
                        return vDescIncond;
                    }

                    /**
                     * Define o valor da propriedade vDescIncond.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVDescIncond(String value) {
                        this.vDescIncond = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vDescCond.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVDescCond() {
                        return vDescCond;
                    }

                    /**
                     * Define o valor da propriedade vDescCond.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVDescCond(String value) {
                        this.vDescCond = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vissRet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVISSRet() {
                        return vissRet;
                    }

                    /**
                     * Define o valor da propriedade vissRet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVISSRet(String value) {
                        this.vissRet = value;
                    }

                    /**
                     * Obt�m o valor da propriedade indISS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndISS() {
                        return indISS;
                    }

                    /**
                     * Define o valor da propriedade indISS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndISS(String value) {
                        this.indISS = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cServico.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCServico() {
                        return cServico;
                    }

                    /**
                     * Define o valor da propriedade cServico.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCServico(String value) {
                        this.cServico = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cMun.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCMun() {
                        return cMun;
                    }

                    /**
                     * Define o valor da propriedade cMun.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCMun(String value) {
                        this.cMun = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cPais.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCPais() {
                        return cPais;
                    }

                    /**
                     * Define o valor da propriedade cPais.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCPais(String value) {
                        this.cPais = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nProcesso.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNProcesso() {
                        return nProcesso;
                    }

                    /**
                     * Define o valor da propriedade nProcesso.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNProcesso(String value) {
                        this.nProcesso = value;
                    }

                    /**
                     * Obt�m o valor da propriedade indIncentivo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndIncentivo() {
                        return indIncentivo;
                    }

                    /**
                     * Define o valor da propriedade indIncentivo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndIncentivo(String value) {
                        this.indIncentivo = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="PISAliq">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;enumeration value="01"/>
                 *                         &lt;enumeration value="02"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *                   &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PISQtde">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;enumeration value="03"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
                 *                   &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
                 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PISNT">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;enumeration value="04"/>
                 *                         &lt;enumeration value="05"/>
                 *                         &lt;enumeration value="06"/>
                 *                         &lt;enumeration value="07"/>
                 *                         &lt;enumeration value="08"/>
                 *                         &lt;enumeration value="09"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PISOutr">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;enumeration value="49"/>
                 *                         &lt;enumeration value="50"/>
                 *                         &lt;enumeration value="51"/>
                 *                         &lt;enumeration value="52"/>
                 *                         &lt;enumeration value="53"/>
                 *                         &lt;enumeration value="54"/>
                 *                         &lt;enumeration value="55"/>
                 *                         &lt;enumeration value="56"/>
                 *                         &lt;enumeration value="60"/>
                 *                         &lt;enumeration value="61"/>
                 *                         &lt;enumeration value="62"/>
                 *                         &lt;enumeration value="63"/>
                 *                         &lt;enumeration value="64"/>
                 *                         &lt;enumeration value="65"/>
                 *                         &lt;enumeration value="66"/>
                 *                         &lt;enumeration value="67"/>
                 *                         &lt;enumeration value="70"/>
                 *                         &lt;enumeration value="71"/>
                 *                         &lt;enumeration value="72"/>
                 *                         &lt;enumeration value="73"/>
                 *                         &lt;enumeration value="74"/>
                 *                         &lt;enumeration value="75"/>
                 *                         &lt;enumeration value="98"/>
                 *                         &lt;enumeration value="99"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;choice>
                 *                     &lt;sequence>
                 *                       &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *                       &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                 *                     &lt;/sequence>
                 *                     &lt;sequence>
                 *                       &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
                 *                       &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
                 *                     &lt;/sequence>
                 *                   &lt;/choice>
                 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "pisAliq",
                    "pisQtde",
                    "pisnt",
                    "pisOutr"
                })
                public static class PIS {

                    @XmlElement(name = "PISAliq")
                    protected TNFe.InfNFe.Det.Imposto.PIS.PISAliq pisAliq;
                    @XmlElement(name = "PISQtde")
                    protected TNFe.InfNFe.Det.Imposto.PIS.PISQtde pisQtde;
                    @XmlElement(name = "PISNT")
                    protected TNFe.InfNFe.Det.Imposto.PIS.PISNT pisnt;
                    @XmlElement(name = "PISOutr")
                    protected TNFe.InfNFe.Det.Imposto.PIS.PISOutr pisOutr;

                    /**
                     * Obt�m o valor da propriedade pisAliq.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISAliq }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.PIS.PISAliq getPISAliq() {
                        return pisAliq;
                    }

                    /**
                     * Define o valor da propriedade pisAliq.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISAliq }
                     *     
                     */
                    public void setPISAliq(TNFe.InfNFe.Det.Imposto.PIS.PISAliq value) {
                        this.pisAliq = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pisQtde.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISQtde }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.PIS.PISQtde getPISQtde() {
                        return pisQtde;
                    }

                    /**
                     * Define o valor da propriedade pisQtde.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISQtde }
                     *     
                     */
                    public void setPISQtde(TNFe.InfNFe.Det.Imposto.PIS.PISQtde value) {
                        this.pisQtde = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pisnt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISNT }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.PIS.PISNT getPISNT() {
                        return pisnt;
                    }

                    /**
                     * Define o valor da propriedade pisnt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISNT }
                     *     
                     */
                    public void setPISNT(TNFe.InfNFe.Det.Imposto.PIS.PISNT value) {
                        this.pisnt = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pisOutr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISOutr }
                     *     
                     */
                    public TNFe.InfNFe.Det.Imposto.PIS.PISOutr getPISOutr() {
                        return pisOutr;
                    }

                    /**
                     * Define o valor da propriedade pisOutr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Imposto.PIS.PISOutr }
                     *     
                     */
                    public void setPISOutr(TNFe.InfNFe.Det.Imposto.PIS.PISOutr value) {
                        this.pisOutr = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="01"/>
                     *               &lt;enumeration value="02"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *         &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "cst",
                        "vbc",
                        "ppis",
                        "vpis"
                    })
                    public static class PISAliq {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "pPIS", required = true)
                        protected String ppis;
                        @XmlElement(name = "vPIS", required = true)
                        protected String vpis;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade ppis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPPIS() {
                            return ppis;
                        }

                        /**
                         * Define o valor da propriedade ppis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPPIS(String value) {
                            this.ppis = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vpis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPIS() {
                            return vpis;
                        }

                        /**
                         * Define o valor da propriedade vpis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPIS(String value) {
                            this.vpis = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="04"/>
                     *               &lt;enumeration value="05"/>
                     *               &lt;enumeration value="06"/>
                     *               &lt;enumeration value="07"/>
                     *               &lt;enumeration value="08"/>
                     *               &lt;enumeration value="09"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
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
                    @XmlType(name = "", propOrder = {
                        "cst"
                    })
                    public static class PISNT {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="49"/>
                     *               &lt;enumeration value="50"/>
                     *               &lt;enumeration value="51"/>
                     *               &lt;enumeration value="52"/>
                     *               &lt;enumeration value="53"/>
                     *               &lt;enumeration value="54"/>
                     *               &lt;enumeration value="55"/>
                     *               &lt;enumeration value="56"/>
                     *               &lt;enumeration value="60"/>
                     *               &lt;enumeration value="61"/>
                     *               &lt;enumeration value="62"/>
                     *               &lt;enumeration value="63"/>
                     *               &lt;enumeration value="64"/>
                     *               &lt;enumeration value="65"/>
                     *               &lt;enumeration value="66"/>
                     *               &lt;enumeration value="67"/>
                     *               &lt;enumeration value="70"/>
                     *               &lt;enumeration value="71"/>
                     *               &lt;enumeration value="72"/>
                     *               &lt;enumeration value="73"/>
                     *               &lt;enumeration value="74"/>
                     *               &lt;enumeration value="75"/>
                     *               &lt;enumeration value="98"/>
                     *               &lt;enumeration value="99"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;choice>
                     *           &lt;sequence>
                     *             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                     *             &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                     *           &lt;/sequence>
                     *           &lt;sequence>
                     *             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
                     *             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
                     *           &lt;/sequence>
                     *         &lt;/choice>
                     *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "cst",
                        "vbc",
                        "ppis",
                        "qbcProd",
                        "vAliqProd",
                        "vpis"
                    })
                    public static class PISOutr {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBC")
                        protected String vbc;
                        @XmlElement(name = "pPIS")
                        protected String ppis;
                        @XmlElement(name = "qBCProd")
                        protected String qbcProd;
                        protected String vAliqProd;
                        @XmlElement(name = "vPIS", required = true)
                        protected String vpis;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obt�m o valor da propriedade ppis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPPIS() {
                            return ppis;
                        }

                        /**
                         * Define o valor da propriedade ppis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPPIS(String value) {
                            this.ppis = value;
                        }

                        /**
                         * Obt�m o valor da propriedade qbcProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQBCProd() {
                            return qbcProd;
                        }

                        /**
                         * Define o valor da propriedade qbcProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQBCProd(String value) {
                            this.qbcProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vAliqProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVAliqProd() {
                            return vAliqProd;
                        }

                        /**
                         * Define o valor da propriedade vAliqProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVAliqProd(String value) {
                            this.vAliqProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vpis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPIS() {
                            return vpis;
                        }

                        /**
                         * Define o valor da propriedade vpis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPIS(String value) {
                            this.vpis = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;enumeration value="03"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
                     *         &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
                     *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "cst",
                        "qbcProd",
                        "vAliqProd",
                        "vpis"
                    })
                    public static class PISQtde {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "qBCProd", required = true)
                        protected String qbcProd;
                        @XmlElement(required = true)
                        protected String vAliqProd;
                        @XmlElement(name = "vPIS", required = true)
                        protected String vpis;

                        /**
                         * Obt�m o valor da propriedade cst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obt�m o valor da propriedade qbcProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQBCProd() {
                            return qbcProd;
                        }

                        /**
                         * Define o valor da propriedade qbcProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQBCProd(String value) {
                            this.qbcProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vAliqProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVAliqProd() {
                            return vAliqProd;
                        }

                        /**
                         * Define o valor da propriedade vAliqProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVAliqProd(String value) {
                            this.vAliqProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vpis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPIS() {
                            return vpis;
                        }

                        /**
                         * Define o valor da propriedade vpis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPIS(String value) {
                            this.vpis = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;choice>
                 *           &lt;sequence>
                 *             &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc"/>
                 *             &lt;element name="pPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
                 *           &lt;/sequence>
                 *           &lt;sequence>
                 *             &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204"/>
                 *             &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
                 *           &lt;/sequence>
                 *         &lt;/choice>
                 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *         &lt;element name="indSomaPISST" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "vbc",
                    "ppis",
                    "qbcProd",
                    "vAliqProd",
                    "vpis",
                    "indSomaPISST"
                })
                public static class PISST {

                    @XmlElement(name = "vBC")
                    protected String vbc;
                    @XmlElement(name = "pPIS")
                    protected String ppis;
                    @XmlElement(name = "qBCProd")
                    protected String qbcProd;
                    protected String vAliqProd;
                    @XmlElement(name = "vPIS", required = true)
                    protected String vpis;
                    protected String indSomaPISST;

                    /**
                     * Obt�m o valor da propriedade vbc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVBC() {
                        return vbc;
                    }

                    /**
                     * Define o valor da propriedade vbc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVBC(String value) {
                        this.vbc = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ppis.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPPIS() {
                        return ppis;
                    }

                    /**
                     * Define o valor da propriedade ppis.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPPIS(String value) {
                        this.ppis = value;
                    }

                    /**
                     * Obt�m o valor da propriedade qbcProd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQBCProd() {
                        return qbcProd;
                    }

                    /**
                     * Define o valor da propriedade qbcProd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQBCProd(String value) {
                        this.qbcProd = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vAliqProd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVAliqProd() {
                        return vAliqProd;
                    }

                    /**
                     * Define o valor da propriedade vAliqProd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVAliqProd(String value) {
                        this.vAliqProd = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vpis.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVPIS() {
                        return vpis;
                    }

                    /**
                     * Define o valor da propriedade vpis.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVPIS(String value) {
                        this.vpis = value;
                    }

                    /**
                     * Obt�m o valor da propriedade indSomaPISST.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndSomaPISST() {
                        return indSomaPISST;
                    }

                    /**
                     * Define o valor da propriedade indSomaPISST.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndSomaPISST(String value) {
                        this.indSomaPISST = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="pDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302Max100"/>
             *         &lt;element name="IPI">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
            @XmlType(name = "", propOrder = {
                "pDevol",
                "ipi"
            })
            public static class ImpostoDevol {

                @XmlElement(required = true)
                protected String pDevol;
                @XmlElement(name = "IPI", required = true)
                protected TNFe.InfNFe.Det.ImpostoDevol.IPI ipi;

                /**
                 * Obt�m o valor da propriedade pDevol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPDevol() {
                    return pDevol;
                }

                /**
                 * Define o valor da propriedade pDevol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPDevol(String value) {
                    this.pDevol = value;
                }

                /**
                 * Obt�m o valor da propriedade ipi.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Det.ImpostoDevol.IPI }
                 *     
                 */
                public TNFe.InfNFe.Det.ImpostoDevol.IPI getIPI() {
                    return ipi;
                }

                /**
                 * Define o valor da propriedade ipi.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Det.ImpostoDevol.IPI }
                 *     
                 */
                public void setIPI(TNFe.InfNFe.Det.ImpostoDevol.IPI value) {
                    this.ipi = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                    "vipiDevol"
                })
                public static class IPI {

                    @XmlElement(name = "vIPIDevol", required = true)
                    protected String vipiDevol;

                    /**
                     * Obt�m o valor da propriedade vipiDevol.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVIPIDevol() {
                        return vipiDevol;
                    }

                    /**
                     * Define o valor da propriedade vipiDevol.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVIPIDevol(String value) {
                        this.vipiDevol = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="cProd">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="60"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cEAN">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="SEM GTIN|[0-9]{0}|[0-9]{8}|[0-9]{12,14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cBarra" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="30"/>
             *               &lt;minLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xProd">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="120"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NCM">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[0-9]{2}|[0-9]{8}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="NVE" maxOccurs="8" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[A-Z]{2}[0-9]{4}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;sequence minOccurs="0">
             *           &lt;element name="CEST">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                 &lt;whiteSpace value="preserve"/>
             *                 &lt;pattern value="[0-9]{7}"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="indEscala" minOccurs="0">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                 &lt;enumeration value="S"/>
             *                 &lt;enumeration value="N"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="CNPJFab" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
             *         &lt;/sequence>
             *         &lt;element name="cBenef" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="([!-�]{8}|[!-�]{10}|SEM CBENEF)?"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EXTIPI" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[0-9]{2,3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="CFOP">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[1,2,3,5,6,7]{1}[0-9]{3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="uCom">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="6"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qCom" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
             *         &lt;element name="vUnCom" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
             *         &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="cEANTrib">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="SEM GTIN|[0-9]{0}|[0-9]{8}|[0-9]{12,14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cBarraTrib" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="30"/>
             *               &lt;minLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="uTrib">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="6"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
             *         &lt;element name="vUnTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
             *         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vSeg" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="indTot">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DI" maxOccurs="100" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nDI">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dDI" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
             *                   &lt;element name="xLocDesemb">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="UFDesemb" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
             *                   &lt;element name="dDesemb" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
             *                   &lt;element name="tpViaTransp">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                         &lt;enumeration value="3"/>
             *                         &lt;enumeration value="4"/>
             *                         &lt;enumeration value="5"/>
             *                         &lt;enumeration value="6"/>
             *                         &lt;enumeration value="7"/>
             *                         &lt;enumeration value="8"/>
             *                         &lt;enumeration value="9"/>
             *                         &lt;enumeration value="10"/>
             *                         &lt;enumeration value="11"/>
             *                         &lt;enumeration value="12"/>
             *                         &lt;enumeration value="13"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vAFRMM" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *                   &lt;element name="tpIntermedio">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                         &lt;enumeration value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
             *                   &lt;element name="UFTerceiro" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi" minOccurs="0"/>
             *                   &lt;element name="cExportador">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="adi" maxOccurs="999">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="nAdicao" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;whiteSpace value="preserve"/>
             *                                   &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nSeqAdic">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;whiteSpace value="preserve"/>
             *                                   &lt;pattern value="[1-9]{1}[0-9]{0,4}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cFabricante">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vDescDI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *                             &lt;element name="nDraw" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="20"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="detExport" maxOccurs="500" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nDraw" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;pattern value="[0-9]{0,20}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="exportInd" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="nRE">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;whiteSpace value="preserve"/>
             *                                   &lt;pattern value="[0-9]{0,12}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
             *                             &lt;element name="qExport" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="xPed" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nItemPed" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[0-9]{1,6}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nFCI" type="{http://www.portalfiscal.inf.br/nfe}TGuid" minOccurs="0"/>
             *         &lt;element name="rastro" maxOccurs="500" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nLote">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="qLote" type="{http://www.portalfiscal.inf.br/nfe}TDec_0803v"/>
             *                   &lt;element name="dFab" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
             *                   &lt;element name="dVal" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
             *                   &lt;element name="cAgreg" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;pattern value="[0-9]{1,20}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;choice minOccurs="0">
             *           &lt;element name="veicProd">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpOp">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="chassi">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;length value="17"/>
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[A-Z0-9]+"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="cCor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="xCor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="40"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="pot">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="cilin">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="pesoL">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="9"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="pesoB">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="9"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nSerie">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="9"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpComb">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="2"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nMotor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="21"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="CMT">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="9"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dist">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="anoMod">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{4}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="anoFab">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{4}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpPint">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;length value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpVeic">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{1,2}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="espVeic">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{1}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="VIN">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;length value="1"/>
             *                           &lt;enumeration value="R"/>
             *                           &lt;enumeration value="N"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="condVeic">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="cMod">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{1,6}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="cCorDENATRAN">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="2"/>
             *                           &lt;pattern value="[0-9]{1,2}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="lota">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="3"/>
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{1,3}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpRest">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                           &lt;enumeration value="4"/>
             *                           &lt;enumeration value="9"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="med">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="cProdANVISA">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;pattern value="[0-9]{13}|ISENTO"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="xMotivoIsencao" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="255"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="vPMC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="arma" maxOccurs="500">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpArma">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nSerie">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="15"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nCano">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="15"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="descr">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                           &lt;minLength value="1"/>
             *                           &lt;maxLength value="256"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="comb">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="cProdANP">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{9}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="descANP">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;minLength value="2"/>
             *                           &lt;maxLength value="95"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="pGLP" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
             *                     &lt;element name="pGNn" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
             *                     &lt;element name="pGNi" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
             *                     &lt;element name="vPart" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *                     &lt;element name="CODIF" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;pattern value="[0-9]{1,21}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="qTemp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204temperatura" minOccurs="0"/>
             *                     &lt;element name="UFCons" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
             *                     &lt;element name="CIDE" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
             *                               &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
             *                               &lt;element name="vCIDE" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="encerrante" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="nBico">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;whiteSpace value="preserve"/>
             *                                     &lt;pattern value="[0-9]{1,3}"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="nBomba" minOccurs="0">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;whiteSpace value="preserve"/>
             *                                     &lt;pattern value="[0-9]{1,3}"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="nTanque">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;whiteSpace value="preserve"/>
             *                                     &lt;pattern value="[0-9]{1,3}"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="vEncIni" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
             *                               &lt;element name="vEncFin" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="nRECOPI">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                 &lt;whiteSpace value="preserve"/>
             *                 &lt;maxLength value="20"/>
             *                 &lt;pattern value="[0-9]{20}"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *         &lt;/choice>
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
                "cProd",
                "cean",
                "cBarra",
                "xProd",
                "ncm",
                "nve",
                "cest",
                "indEscala",
                "cnpjFab",
                "cBenef",
                "extipi",
                "cfop",
                "uCom",
                "qCom",
                "vUnCom",
                "vProd",
                "ceanTrib",
                "cBarraTrib",
                "uTrib",
                "qTrib",
                "vUnTrib",
                "vFrete",
                "vSeg",
                "vDesc",
                "vOutro",
                "indTot",
                "di",
                "detExport",
                "xPed",
                "nItemPed",
                "nfci",
                "rastro",
                "veicProd",
                "med",
                "arma",
                "comb",
                "nrecopi"
            })
            public static class Prod {

                @XmlElement(required = true)
                protected String cProd;
                @XmlElement(name = "cEAN", required = true)
                protected String cean;
                protected String cBarra;
                @XmlElement(required = true)
                protected String xProd;
                @XmlElement(name = "NCM", required = true)
                protected String ncm;
                @XmlElement(name = "NVE")
                protected List<String> nve;
                @XmlElement(name = "CEST")
                protected String cest;
                protected String indEscala;
                @XmlElement(name = "CNPJFab")
                protected String cnpjFab;
                protected String cBenef;
                @XmlElement(name = "EXTIPI")
                protected String extipi;
                @XmlElement(name = "CFOP", required = true)
                protected String cfop;
                @XmlElement(required = true)
                protected String uCom;
                @XmlElement(required = true)
                protected String qCom;
                @XmlElement(required = true)
                protected String vUnCom;
                @XmlElement(required = true)
                protected String vProd;
                @XmlElement(name = "cEANTrib", required = true)
                protected String ceanTrib;
                protected String cBarraTrib;
                @XmlElement(required = true)
                protected String uTrib;
                @XmlElement(required = true)
                protected String qTrib;
                @XmlElement(required = true)
                protected String vUnTrib;
                protected String vFrete;
                protected String vSeg;
                protected String vDesc;
                protected String vOutro;
                @XmlElement(required = true)
                protected String indTot;
                @XmlElement(name = "DI")
                protected List<TNFe.InfNFe.Det.Prod.DI> di;
                protected List<TNFe.InfNFe.Det.Prod.DetExport> detExport;
                protected String xPed;
                protected String nItemPed;
                @XmlElement(name = "nFCI")
                protected String nfci;
                protected List<TNFe.InfNFe.Det.Prod.Rastro> rastro;
                protected TNFe.InfNFe.Det.Prod.VeicProd veicProd;
                protected TNFe.InfNFe.Det.Prod.Med med;
                protected List<TNFe.InfNFe.Det.Prod.Arma> arma;
                protected TNFe.InfNFe.Det.Prod.Comb comb;
                @XmlElement(name = "nRECOPI")
                protected String nrecopi;

                /**
                 * Obt�m o valor da propriedade cProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCProd() {
                    return cProd;
                }

                /**
                 * Define o valor da propriedade cProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCProd(String value) {
                    this.cProd = value;
                }

                /**
                 * Obt�m o valor da propriedade cean.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCEAN() {
                    return cean;
                }

                /**
                 * Define o valor da propriedade cean.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCEAN(String value) {
                    this.cean = value;
                }

                /**
                 * Obt�m o valor da propriedade cBarra.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBarra() {
                    return cBarra;
                }

                /**
                 * Define o valor da propriedade cBarra.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBarra(String value) {
                    this.cBarra = value;
                }

                /**
                 * Obt�m o valor da propriedade xProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXProd() {
                    return xProd;
                }

                /**
                 * Define o valor da propriedade xProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXProd(String value) {
                    this.xProd = value;
                }

                /**
                 * Obt�m o valor da propriedade ncm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNCM() {
                    return ncm;
                }

                /**
                 * Define o valor da propriedade ncm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNCM(String value) {
                    this.ncm = value;
                }

                /**
                 * Gets the value of the nve property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nve property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNVE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getNVE() {
                    if (nve == null) {
                        nve = new ArrayList<String>();
                    }
                    return this.nve;
                }

                /**
                 * Obt�m o valor da propriedade cest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCEST() {
                    return cest;
                }

                /**
                 * Define o valor da propriedade cest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCEST(String value) {
                    this.cest = value;
                }

                /**
                 * Obt�m o valor da propriedade indEscala.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndEscala() {
                    return indEscala;
                }

                /**
                 * Define o valor da propriedade indEscala.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndEscala(String value) {
                    this.indEscala = value;
                }

                /**
                 * Obt�m o valor da propriedade cnpjFab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNPJFab() {
                    return cnpjFab;
                }

                /**
                 * Define o valor da propriedade cnpjFab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNPJFab(String value) {
                    this.cnpjFab = value;
                }

                /**
                 * Obt�m o valor da propriedade cBenef.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBenef() {
                    return cBenef;
                }

                /**
                 * Define o valor da propriedade cBenef.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBenef(String value) {
                    this.cBenef = value;
                }

                /**
                 * Obt�m o valor da propriedade extipi.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEXTIPI() {
                    return extipi;
                }

                /**
                 * Define o valor da propriedade extipi.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEXTIPI(String value) {
                    this.extipi = value;
                }

                /**
                 * Obt�m o valor da propriedade cfop.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCFOP() {
                    return cfop;
                }

                /**
                 * Define o valor da propriedade cfop.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCFOP(String value) {
                    this.cfop = value;
                }

                /**
                 * Obt�m o valor da propriedade uCom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUCom() {
                    return uCom;
                }

                /**
                 * Define o valor da propriedade uCom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUCom(String value) {
                    this.uCom = value;
                }

                /**
                 * Obt�m o valor da propriedade qCom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQCom() {
                    return qCom;
                }

                /**
                 * Define o valor da propriedade qCom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQCom(String value) {
                    this.qCom = value;
                }

                /**
                 * Obt�m o valor da propriedade vUnCom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVUnCom() {
                    return vUnCom;
                }

                /**
                 * Define o valor da propriedade vUnCom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVUnCom(String value) {
                    this.vUnCom = value;
                }

                /**
                 * Obt�m o valor da propriedade vProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVProd() {
                    return vProd;
                }

                /**
                 * Define o valor da propriedade vProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVProd(String value) {
                    this.vProd = value;
                }

                /**
                 * Obt�m o valor da propriedade ceanTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCEANTrib() {
                    return ceanTrib;
                }

                /**
                 * Define o valor da propriedade ceanTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCEANTrib(String value) {
                    this.ceanTrib = value;
                }

                /**
                 * Obt�m o valor da propriedade cBarraTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBarraTrib() {
                    return cBarraTrib;
                }

                /**
                 * Define o valor da propriedade cBarraTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBarraTrib(String value) {
                    this.cBarraTrib = value;
                }

                /**
                 * Obt�m o valor da propriedade uTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUTrib() {
                    return uTrib;
                }

                /**
                 * Define o valor da propriedade uTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUTrib(String value) {
                    this.uTrib = value;
                }

                /**
                 * Obt�m o valor da propriedade qTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQTrib() {
                    return qTrib;
                }

                /**
                 * Define o valor da propriedade qTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQTrib(String value) {
                    this.qTrib = value;
                }

                /**
                 * Obt�m o valor da propriedade vUnTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVUnTrib() {
                    return vUnTrib;
                }

                /**
                 * Define o valor da propriedade vUnTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVUnTrib(String value) {
                    this.vUnTrib = value;
                }

                /**
                 * Obt�m o valor da propriedade vFrete.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFrete() {
                    return vFrete;
                }

                /**
                 * Define o valor da propriedade vFrete.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFrete(String value) {
                    this.vFrete = value;
                }

                /**
                 * Obt�m o valor da propriedade vSeg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVSeg() {
                    return vSeg;
                }

                /**
                 * Define o valor da propriedade vSeg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVSeg(String value) {
                    this.vSeg = value;
                }

                /**
                 * Obt�m o valor da propriedade vDesc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDesc() {
                    return vDesc;
                }

                /**
                 * Define o valor da propriedade vDesc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDesc(String value) {
                    this.vDesc = value;
                }

                /**
                 * Obt�m o valor da propriedade vOutro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVOutro() {
                    return vOutro;
                }

                /**
                 * Define o valor da propriedade vOutro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVOutro(String value) {
                    this.vOutro = value;
                }

                /**
                 * Obt�m o valor da propriedade indTot.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndTot() {
                    return indTot;
                }

                /**
                 * Define o valor da propriedade indTot.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndTot(String value) {
                    this.indTot = value;
                }

                /**
                 * Gets the value of the di property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the di property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDI().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TNFe.InfNFe.Det.Prod.DI }
                 * 
                 * 
                 */
                public List<TNFe.InfNFe.Det.Prod.DI> getDI() {
                    if (di == null) {
                        di = new ArrayList<TNFe.InfNFe.Det.Prod.DI>();
                    }
                    return this.di;
                }

                /**
                 * Gets the value of the detExport property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the detExport property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDetExport().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TNFe.InfNFe.Det.Prod.DetExport }
                 * 
                 * 
                 */
                public List<TNFe.InfNFe.Det.Prod.DetExport> getDetExport() {
                    if (detExport == null) {
                        detExport = new ArrayList<TNFe.InfNFe.Det.Prod.DetExport>();
                    }
                    return this.detExport;
                }

                /**
                 * Obt�m o valor da propriedade xPed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXPed() {
                    return xPed;
                }

                /**
                 * Define o valor da propriedade xPed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXPed(String value) {
                    this.xPed = value;
                }

                /**
                 * Obt�m o valor da propriedade nItemPed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNItemPed() {
                    return nItemPed;
                }

                /**
                 * Define o valor da propriedade nItemPed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNItemPed(String value) {
                    this.nItemPed = value;
                }

                /**
                 * Obt�m o valor da propriedade nfci.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNFCI() {
                    return nfci;
                }

                /**
                 * Define o valor da propriedade nfci.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNFCI(String value) {
                    this.nfci = value;
                }

                /**
                 * Gets the value of the rastro property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rastro property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRastro().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TNFe.InfNFe.Det.Prod.Rastro }
                 * 
                 * 
                 */
                public List<TNFe.InfNFe.Det.Prod.Rastro> getRastro() {
                    if (rastro == null) {
                        rastro = new ArrayList<TNFe.InfNFe.Det.Prod.Rastro>();
                    }
                    return this.rastro;
                }

                /**
                 * Obt�m o valor da propriedade veicProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Det.Prod.VeicProd }
                 *     
                 */
                public TNFe.InfNFe.Det.Prod.VeicProd getVeicProd() {
                    return veicProd;
                }

                /**
                 * Define o valor da propriedade veicProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Det.Prod.VeicProd }
                 *     
                 */
                public void setVeicProd(TNFe.InfNFe.Det.Prod.VeicProd value) {
                    this.veicProd = value;
                }

                /**
                 * Obt�m o valor da propriedade med.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Det.Prod.Med }
                 *     
                 */
                public TNFe.InfNFe.Det.Prod.Med getMed() {
                    return med;
                }

                /**
                 * Define o valor da propriedade med.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Det.Prod.Med }
                 *     
                 */
                public void setMed(TNFe.InfNFe.Det.Prod.Med value) {
                    this.med = value;
                }

                /**
                 * Gets the value of the arma property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the arma property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getArma().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TNFe.InfNFe.Det.Prod.Arma }
                 * 
                 * 
                 */
                public List<TNFe.InfNFe.Det.Prod.Arma> getArma() {
                    if (arma == null) {
                        arma = new ArrayList<TNFe.InfNFe.Det.Prod.Arma>();
                    }
                    return this.arma;
                }

                /**
                 * Obt�m o valor da propriedade comb.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Det.Prod.Comb }
                 *     
                 */
                public TNFe.InfNFe.Det.Prod.Comb getComb() {
                    return comb;
                }

                /**
                 * Define o valor da propriedade comb.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Det.Prod.Comb }
                 *     
                 */
                public void setComb(TNFe.InfNFe.Det.Prod.Comb value) {
                    this.comb = value;
                }

                /**
                 * Obt�m o valor da propriedade nrecopi.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNRECOPI() {
                    return nrecopi;
                }

                /**
                 * Define o valor da propriedade nrecopi.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNRECOPI(String value) {
                    this.nrecopi = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpArma">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nSerie">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="15"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nCano">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="15"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descr">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="256"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "tpArma",
                    "nSerie",
                    "nCano",
                    "descr"
                })
                public static class Arma {

                    @XmlElement(required = true)
                    protected String tpArma;
                    @XmlElement(required = true)
                    protected String nSerie;
                    @XmlElement(required = true)
                    protected String nCano;
                    @XmlElement(required = true)
                    protected String descr;

                    /**
                     * Obt�m o valor da propriedade tpArma.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpArma() {
                        return tpArma;
                    }

                    /**
                     * Define o valor da propriedade tpArma.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpArma(String value) {
                        this.tpArma = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nSerie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNSerie() {
                        return nSerie;
                    }

                    /**
                     * Define o valor da propriedade nSerie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNSerie(String value) {
                        this.nSerie = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nCano.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNCano() {
                        return nCano;
                    }

                    /**
                     * Define o valor da propriedade nCano.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNCano(String value) {
                        this.nCano = value;
                    }

                    /**
                     * Obt�m o valor da propriedade descr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescr() {
                        return descr;
                    }

                    /**
                     * Define o valor da propriedade descr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescr(String value) {
                        this.descr = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="cProdANP">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{9}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="descANP">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="95"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pGLP" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
                 *         &lt;element name="pGNn" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
                 *         &lt;element name="pGNi" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04Max100" minOccurs="0"/>
                 *         &lt;element name="vPart" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                 *         &lt;element name="CODIF" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,21}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="qTemp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204temperatura" minOccurs="0"/>
                 *         &lt;element name="UFCons" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
                 *         &lt;element name="CIDE" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
                 *                   &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
                 *                   &lt;element name="vCIDE" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="encerrante" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nBico">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[0-9]{1,3}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nBomba" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[0-9]{1,3}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nTanque">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[0-9]{1,3}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vEncIni" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
                 *                   &lt;element name="vEncFin" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
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
                @XmlType(name = "", propOrder = {
                    "cProdANP",
                    "descANP",
                    "pglp",
                    "pgNn",
                    "pgNi",
                    "vPart",
                    "codif",
                    "qTemp",
                    "ufCons",
                    "cide",
                    "encerrante"
                })
                public static class Comb {

                    @XmlElement(required = true)
                    protected String cProdANP;
                    @XmlElement(required = true)
                    protected String descANP;
                    @XmlElement(name = "pGLP")
                    protected String pglp;
                    @XmlElement(name = "pGNn")
                    protected String pgNn;
                    @XmlElement(name = "pGNi")
                    protected String pgNi;
                    protected String vPart;
                    @XmlElement(name = "CODIF")
                    protected String codif;
                    protected String qTemp;
                    @XmlElement(name = "UFCons", required = true)
                    @XmlSchemaType(name = "string")
                    protected TUf ufCons;
                    @XmlElement(name = "CIDE")
                    protected TNFe.InfNFe.Det.Prod.Comb.CIDE cide;
                    protected TNFe.InfNFe.Det.Prod.Comb.Encerrante encerrante;

                    /**
                     * Obt�m o valor da propriedade cProdANP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCProdANP() {
                        return cProdANP;
                    }

                    /**
                     * Define o valor da propriedade cProdANP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCProdANP(String value) {
                        this.cProdANP = value;
                    }

                    /**
                     * Obt�m o valor da propriedade descANP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescANP() {
                        return descANP;
                    }

                    /**
                     * Define o valor da propriedade descANP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescANP(String value) {
                        this.descANP = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pglp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPGLP() {
                        return pglp;
                    }

                    /**
                     * Define o valor da propriedade pglp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPGLP(String value) {
                        this.pglp = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pgNn.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPGNn() {
                        return pgNn;
                    }

                    /**
                     * Define o valor da propriedade pgNn.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPGNn(String value) {
                        this.pgNn = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pgNi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPGNi() {
                        return pgNi;
                    }

                    /**
                     * Define o valor da propriedade pgNi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPGNi(String value) {
                        this.pgNi = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vPart.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVPart() {
                        return vPart;
                    }

                    /**
                     * Define o valor da propriedade vPart.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVPart(String value) {
                        this.vPart = value;
                    }

                    /**
                     * Obt�m o valor da propriedade codif.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCODIF() {
                        return codif;
                    }

                    /**
                     * Define o valor da propriedade codif.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCODIF(String value) {
                        this.codif = value;
                    }

                    /**
                     * Obt�m o valor da propriedade qTemp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQTemp() {
                        return qTemp;
                    }

                    /**
                     * Define o valor da propriedade qTemp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQTemp(String value) {
                        this.qTemp = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ufCons.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TUf }
                     *     
                     */
                    public TUf getUFCons() {
                        return ufCons;
                    }

                    /**
                     * Define o valor da propriedade ufCons.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TUf }
                     *     
                     */
                    public void setUFCons(TUf value) {
                        this.ufCons = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cide.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Prod.Comb.CIDE }
                     *     
                     */
                    public TNFe.InfNFe.Det.Prod.Comb.CIDE getCIDE() {
                        return cide;
                    }

                    /**
                     * Define o valor da propriedade cide.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Prod.Comb.CIDE }
                     *     
                     */
                    public void setCIDE(TNFe.InfNFe.Det.Prod.Comb.CIDE value) {
                        this.cide = value;
                    }

                    /**
                     * Obt�m o valor da propriedade encerrante.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Prod.Comb.Encerrante }
                     *     
                     */
                    public TNFe.InfNFe.Det.Prod.Comb.Encerrante getEncerrante() {
                        return encerrante;
                    }

                    /**
                     * Define o valor da propriedade encerrante.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Prod.Comb.Encerrante }
                     *     
                     */
                    public void setEncerrante(TNFe.InfNFe.Det.Prod.Comb.Encerrante value) {
                        this.encerrante = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
                     *         &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
                     *         &lt;element name="vCIDE" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                        "qbcProd",
                        "vAliqProd",
                        "vcide"
                    })
                    public static class CIDE {

                        @XmlElement(name = "qBCProd", required = true)
                        protected String qbcProd;
                        @XmlElement(required = true)
                        protected String vAliqProd;
                        @XmlElement(name = "vCIDE", required = true)
                        protected String vcide;

                        /**
                         * Obt�m o valor da propriedade qbcProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQBCProd() {
                            return qbcProd;
                        }

                        /**
                         * Define o valor da propriedade qbcProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQBCProd(String value) {
                            this.qbcProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vAliqProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVAliqProd() {
                            return vAliqProd;
                        }

                        /**
                         * Define o valor da propriedade vAliqProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVAliqProd(String value) {
                            this.vAliqProd = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vcide.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCIDE() {
                            return vcide;
                        }

                        /**
                         * Define o valor da propriedade vcide.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCIDE(String value) {
                            this.vcide = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="nBico">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[0-9]{1,3}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nBomba" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[0-9]{1,3}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nTanque">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[0-9]{1,3}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vEncIni" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
                     *         &lt;element name="vEncFin" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
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
                        "nBico",
                        "nBomba",
                        "nTanque",
                        "vEncIni",
                        "vEncFin"
                    })
                    public static class Encerrante {

                        @XmlElement(required = true)
                        protected String nBico;
                        protected String nBomba;
                        @XmlElement(required = true)
                        protected String nTanque;
                        @XmlElement(required = true)
                        protected String vEncIni;
                        @XmlElement(required = true)
                        protected String vEncFin;

                        /**
                         * Obt�m o valor da propriedade nBico.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNBico() {
                            return nBico;
                        }

                        /**
                         * Define o valor da propriedade nBico.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNBico(String value) {
                            this.nBico = value;
                        }

                        /**
                         * Obt�m o valor da propriedade nBomba.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNBomba() {
                            return nBomba;
                        }

                        /**
                         * Define o valor da propriedade nBomba.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNBomba(String value) {
                            this.nBomba = value;
                        }

                        /**
                         * Obt�m o valor da propriedade nTanque.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNTanque() {
                            return nTanque;
                        }

                        /**
                         * Define o valor da propriedade nTanque.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNTanque(String value) {
                            this.nTanque = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vEncIni.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVEncIni() {
                            return vEncIni;
                        }

                        /**
                         * Define o valor da propriedade vEncIni.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVEncIni(String value) {
                            this.vEncIni = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vEncFin.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVEncFin() {
                            return vEncFin;
                        }

                        /**
                         * Define o valor da propriedade vEncFin.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVEncFin(String value) {
                            this.vEncFin = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="nDI">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="15"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dDI" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
                 *         &lt;element name="xLocDesemb">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="UFDesemb" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
                 *         &lt;element name="dDesemb" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
                 *         &lt;element name="tpViaTransp">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="4"/>
                 *               &lt;enumeration value="5"/>
                 *               &lt;enumeration value="6"/>
                 *               &lt;enumeration value="7"/>
                 *               &lt;enumeration value="8"/>
                 *               &lt;enumeration value="9"/>
                 *               &lt;enumeration value="10"/>
                 *               &lt;enumeration value="11"/>
                 *               &lt;enumeration value="12"/>
                 *               &lt;enumeration value="13"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vAFRMM" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
                 *         &lt;element name="tpIntermedio">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
                 *         &lt;element name="UFTerceiro" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi" minOccurs="0"/>
                 *         &lt;element name="cExportador">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="adi" maxOccurs="999">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nAdicao" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nSeqAdic">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[1-9]{1}[0-9]{0,4}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cFabricante">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vDescDI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                 *                   &lt;element name="nDraw" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="20"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
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
                @XmlType(name = "", propOrder = {
                    "ndi",
                    "ddi",
                    "xLocDesemb",
                    "ufDesemb",
                    "dDesemb",
                    "tpViaTransp",
                    "vafrmm",
                    "tpIntermedio",
                    "cnpj",
                    "ufTerceiro",
                    "cExportador",
                    "adi"
                })
                public static class DI {

                    @XmlElement(name = "nDI", required = true)
                    protected String ndi;
                    @XmlElement(name = "dDI", required = true)
                    protected String ddi;
                    @XmlElement(required = true)
                    protected String xLocDesemb;
                    @XmlElement(name = "UFDesemb", required = true)
                    @XmlSchemaType(name = "string")
                    protected TUfEmi ufDesemb;
                    @XmlElement(required = true)
                    protected String dDesemb;
                    @XmlElement(required = true)
                    protected String tpViaTransp;
                    @XmlElement(name = "vAFRMM")
                    protected String vafrmm;
                    @XmlElement(required = true)
                    protected String tpIntermedio;
                    @XmlElement(name = "CNPJ")
                    protected String cnpj;
                    @XmlElement(name = "UFTerceiro")
                    @XmlSchemaType(name = "string")
                    protected TUfEmi ufTerceiro;
                    @XmlElement(required = true)
                    protected String cExportador;
                    @XmlElement(required = true)
                    protected List<TNFe.InfNFe.Det.Prod.DI.Adi> adi;

                    /**
                     * Obt�m o valor da propriedade ndi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNDI() {
                        return ndi;
                    }

                    /**
                     * Define o valor da propriedade ndi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNDI(String value) {
                        this.ndi = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ddi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDDI() {
                        return ddi;
                    }

                    /**
                     * Define o valor da propriedade ddi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDDI(String value) {
                        this.ddi = value;
                    }

                    /**
                     * Obt�m o valor da propriedade xLocDesemb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXLocDesemb() {
                        return xLocDesemb;
                    }

                    /**
                     * Define o valor da propriedade xLocDesemb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXLocDesemb(String value) {
                        this.xLocDesemb = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ufDesemb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TUfEmi }
                     *     
                     */
                    public TUfEmi getUFDesemb() {
                        return ufDesemb;
                    }

                    /**
                     * Define o valor da propriedade ufDesemb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TUfEmi }
                     *     
                     */
                    public void setUFDesemb(TUfEmi value) {
                        this.ufDesemb = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dDesemb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDDesemb() {
                        return dDesemb;
                    }

                    /**
                     * Define o valor da propriedade dDesemb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDDesemb(String value) {
                        this.dDesemb = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpViaTransp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpViaTransp() {
                        return tpViaTransp;
                    }

                    /**
                     * Define o valor da propriedade tpViaTransp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpViaTransp(String value) {
                        this.tpViaTransp = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vafrmm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVAFRMM() {
                        return vafrmm;
                    }

                    /**
                     * Define o valor da propriedade vafrmm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVAFRMM(String value) {
                        this.vafrmm = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpIntermedio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpIntermedio() {
                        return tpIntermedio;
                    }

                    /**
                     * Define o valor da propriedade tpIntermedio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpIntermedio(String value) {
                        this.tpIntermedio = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ufTerceiro.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TUfEmi }
                     *     
                     */
                    public TUfEmi getUFTerceiro() {
                        return ufTerceiro;
                    }

                    /**
                     * Define o valor da propriedade ufTerceiro.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TUfEmi }
                     *     
                     */
                    public void setUFTerceiro(TUfEmi value) {
                        this.ufTerceiro = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cExportador.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCExportador() {
                        return cExportador;
                    }

                    /**
                     * Define o valor da propriedade cExportador.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCExportador(String value) {
                        this.cExportador = value;
                    }

                    /**
                     * Gets the value of the adi property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the adi property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAdi().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TNFe.InfNFe.Det.Prod.DI.Adi }
                     * 
                     * 
                     */
                    public List<TNFe.InfNFe.Det.Prod.DI.Adi> getAdi() {
                        if (adi == null) {
                            adi = new ArrayList<TNFe.InfNFe.Det.Prod.DI.Adi>();
                        }
                        return this.adi;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="nAdicao" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nSeqAdic">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[1-9]{1}[0-9]{0,4}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cFabricante">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vDescDI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
                     *         &lt;element name="nDraw" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="20"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
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
                    @XmlType(name = "", propOrder = {
                        "nAdicao",
                        "nSeqAdic",
                        "cFabricante",
                        "vDescDI",
                        "nDraw"
                    })
                    public static class Adi {

                        protected String nAdicao;
                        @XmlElement(required = true)
                        protected String nSeqAdic;
                        @XmlElement(required = true)
                        protected String cFabricante;
                        protected String vDescDI;
                        protected String nDraw;

                        /**
                         * Obt�m o valor da propriedade nAdicao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNAdicao() {
                            return nAdicao;
                        }

                        /**
                         * Define o valor da propriedade nAdicao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNAdicao(String value) {
                            this.nAdicao = value;
                        }

                        /**
                         * Obt�m o valor da propriedade nSeqAdic.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNSeqAdic() {
                            return nSeqAdic;
                        }

                        /**
                         * Define o valor da propriedade nSeqAdic.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNSeqAdic(String value) {
                            this.nSeqAdic = value;
                        }

                        /**
                         * Obt�m o valor da propriedade cFabricante.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCFabricante() {
                            return cFabricante;
                        }

                        /**
                         * Define o valor da propriedade cFabricante.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCFabricante(String value) {
                            this.cFabricante = value;
                        }

                        /**
                         * Obt�m o valor da propriedade vDescDI.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVDescDI() {
                            return vDescDI;
                        }

                        /**
                         * Define o valor da propriedade vDescDI.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVDescDI(String value) {
                            this.vDescDI = value;
                        }

                        /**
                         * Obt�m o valor da propriedade nDraw.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNDraw() {
                            return nDraw;
                        }

                        /**
                         * Define o valor da propriedade nDraw.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNDraw(String value) {
                            this.nDraw = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="nDraw" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{0,20}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="exportInd" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nRE">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[0-9]{0,12}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
                 *                   &lt;element name="qExport" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
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
                @XmlType(name = "", propOrder = {
                    "nDraw",
                    "exportInd"
                })
                public static class DetExport {

                    protected String nDraw;
                    protected TNFe.InfNFe.Det.Prod.DetExport.ExportInd exportInd;

                    /**
                     * Obt�m o valor da propriedade nDraw.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNDraw() {
                        return nDraw;
                    }

                    /**
                     * Define o valor da propriedade nDraw.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNDraw(String value) {
                        this.nDraw = value;
                    }

                    /**
                     * Obt�m o valor da propriedade exportInd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TNFe.InfNFe.Det.Prod.DetExport.ExportInd }
                     *     
                     */
                    public TNFe.InfNFe.Det.Prod.DetExport.ExportInd getExportInd() {
                        return exportInd;
                    }

                    /**
                     * Define o valor da propriedade exportInd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TNFe.InfNFe.Det.Prod.DetExport.ExportInd }
                     *     
                     */
                    public void setExportInd(TNFe.InfNFe.Det.Prod.DetExport.ExportInd value) {
                        this.exportInd = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="nRE">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[0-9]{0,12}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
                     *         &lt;element name="qExport" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
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
                        "nre",
                        "chNFe",
                        "qExport"
                    })
                    public static class ExportInd {

                        @XmlElement(name = "nRE", required = true)
                        protected String nre;
                        @XmlElement(required = true)
                        protected String chNFe;
                        @XmlElement(required = true)
                        protected String qExport;

                        /**
                         * Obt�m o valor da propriedade nre.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNRE() {
                            return nre;
                        }

                        /**
                         * Define o valor da propriedade nre.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNRE(String value) {
                            this.nre = value;
                        }

                        /**
                         * Obt�m o valor da propriedade chNFe.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getChNFe() {
                            return chNFe;
                        }

                        /**
                         * Define o valor da propriedade chNFe.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setChNFe(String value) {
                            this.chNFe = value;
                        }

                        /**
                         * Obt�m o valor da propriedade qExport.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQExport() {
                            return qExport;
                        }

                        /**
                         * Define o valor da propriedade qExport.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQExport(String value) {
                            this.qExport = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="cProdANVISA">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;pattern value="[0-9]{13}|ISENTO"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xMotivoIsencao" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="255"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vPMC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
                    "cProdANVISA",
                    "xMotivoIsencao",
                    "vpmc"
                })
                public static class Med {

                    @XmlElement(required = true)
                    protected String cProdANVISA;
                    protected String xMotivoIsencao;
                    @XmlElement(name = "vPMC", required = true)
                    protected String vpmc;

                    /**
                     * Obt�m o valor da propriedade cProdANVISA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCProdANVISA() {
                        return cProdANVISA;
                    }

                    /**
                     * Define o valor da propriedade cProdANVISA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCProdANVISA(String value) {
                        this.cProdANVISA = value;
                    }

                    /**
                     * Obt�m o valor da propriedade xMotivoIsencao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXMotivoIsencao() {
                        return xMotivoIsencao;
                    }

                    /**
                     * Define o valor da propriedade xMotivoIsencao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXMotivoIsencao(String value) {
                        this.xMotivoIsencao = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vpmc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVPMC() {
                        return vpmc;
                    }

                    /**
                     * Define o valor da propriedade vpmc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVPMC(String value) {
                        this.vpmc = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="nLote">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="qLote" type="{http://www.portalfiscal.inf.br/nfe}TDec_0803v"/>
                 *         &lt;element name="dFab" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
                 *         &lt;element name="dVal" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
                 *         &lt;element name="cAgreg" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,20}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "nLote",
                    "qLote",
                    "dFab",
                    "dVal",
                    "cAgreg"
                })
                public static class Rastro {

                    @XmlElement(required = true)
                    protected String nLote;
                    @XmlElement(required = true)
                    protected String qLote;
                    @XmlElement(required = true)
                    protected String dFab;
                    @XmlElement(required = true)
                    protected String dVal;
                    protected String cAgreg;

                    /**
                     * Obt�m o valor da propriedade nLote.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNLote() {
                        return nLote;
                    }

                    /**
                     * Define o valor da propriedade nLote.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNLote(String value) {
                        this.nLote = value;
                    }

                    /**
                     * Obt�m o valor da propriedade qLote.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQLote() {
                        return qLote;
                    }

                    /**
                     * Define o valor da propriedade qLote.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQLote(String value) {
                        this.qLote = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dFab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDFab() {
                        return dFab;
                    }

                    /**
                     * Define o valor da propriedade dFab.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDFab(String value) {
                        this.dFab = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dVal.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDVal() {
                        return dVal;
                    }

                    /**
                     * Define o valor da propriedade dVal.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDVal(String value) {
                        this.dVal = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cAgreg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCAgreg() {
                        return cAgreg;
                    }

                    /**
                     * Define o valor da propriedade cAgreg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCAgreg(String value) {
                        this.cAgreg = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpOp">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="chassi">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="17"/>
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[A-Z0-9]+"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cCor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xCor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="40"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pot">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cilin">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pesoL">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="9"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pesoB">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="9"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nSerie">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="9"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpComb">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nMotor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="21"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="CMT">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="9"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dist">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="anoMod">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{4}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="anoFab">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{4}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpPint">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;length value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpVeic">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="espVeic">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="VIN">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;length value="1"/>
                 *               &lt;enumeration value="R"/>
                 *               &lt;enumeration value="N"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="condVeic">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cMod">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,6}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cCorDENATRAN">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="2"/>
                 *               &lt;pattern value="[0-9]{1,2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="lota">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="3"/>
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,3}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpRest">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="4"/>
                 *               &lt;enumeration value="9"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "tpOp",
                    "chassi",
                    "cCor",
                    "xCor",
                    "pot",
                    "cilin",
                    "pesoL",
                    "pesoB",
                    "nSerie",
                    "tpComb",
                    "nMotor",
                    "cmt",
                    "dist",
                    "anoMod",
                    "anoFab",
                    "tpPint",
                    "tpVeic",
                    "espVeic",
                    "vin",
                    "condVeic",
                    "cMod",
                    "cCorDENATRAN",
                    "lota",
                    "tpRest"
                })
                public static class VeicProd {

                    @XmlElement(required = true)
                    protected String tpOp;
                    @XmlElement(required = true)
                    protected String chassi;
                    @XmlElement(required = true)
                    protected String cCor;
                    @XmlElement(required = true)
                    protected String xCor;
                    @XmlElement(required = true)
                    protected String pot;
                    @XmlElement(required = true)
                    protected String cilin;
                    @XmlElement(required = true)
                    protected String pesoL;
                    @XmlElement(required = true)
                    protected String pesoB;
                    @XmlElement(required = true)
                    protected String nSerie;
                    @XmlElement(required = true)
                    protected String tpComb;
                    @XmlElement(required = true)
                    protected String nMotor;
                    @XmlElement(name = "CMT", required = true)
                    protected String cmt;
                    @XmlElement(required = true)
                    protected String dist;
                    @XmlElement(required = true)
                    protected String anoMod;
                    @XmlElement(required = true)
                    protected String anoFab;
                    @XmlElement(required = true)
                    protected String tpPint;
                    @XmlElement(required = true)
                    protected String tpVeic;
                    @XmlElement(required = true)
                    protected String espVeic;
                    @XmlElement(name = "VIN", required = true)
                    protected String vin;
                    @XmlElement(required = true)
                    protected String condVeic;
                    @XmlElement(required = true)
                    protected String cMod;
                    @XmlElement(required = true)
                    protected String cCorDENATRAN;
                    @XmlElement(required = true)
                    protected String lota;
                    @XmlElement(required = true)
                    protected String tpRest;

                    /**
                     * Obt�m o valor da propriedade tpOp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpOp() {
                        return tpOp;
                    }

                    /**
                     * Define o valor da propriedade tpOp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpOp(String value) {
                        this.tpOp = value;
                    }

                    /**
                     * Obt�m o valor da propriedade chassi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChassi() {
                        return chassi;
                    }

                    /**
                     * Define o valor da propriedade chassi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChassi(String value) {
                        this.chassi = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cCor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCCor() {
                        return cCor;
                    }

                    /**
                     * Define o valor da propriedade cCor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCCor(String value) {
                        this.cCor = value;
                    }

                    /**
                     * Obt�m o valor da propriedade xCor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXCor() {
                        return xCor;
                    }

                    /**
                     * Define o valor da propriedade xCor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXCor(String value) {
                        this.xCor = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pot.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPot() {
                        return pot;
                    }

                    /**
                     * Define o valor da propriedade pot.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPot(String value) {
                        this.pot = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cilin.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCilin() {
                        return cilin;
                    }

                    /**
                     * Define o valor da propriedade cilin.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCilin(String value) {
                        this.cilin = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pesoL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPesoL() {
                        return pesoL;
                    }

                    /**
                     * Define o valor da propriedade pesoL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPesoL(String value) {
                        this.pesoL = value;
                    }

                    /**
                     * Obt�m o valor da propriedade pesoB.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPesoB() {
                        return pesoB;
                    }

                    /**
                     * Define o valor da propriedade pesoB.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPesoB(String value) {
                        this.pesoB = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nSerie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNSerie() {
                        return nSerie;
                    }

                    /**
                     * Define o valor da propriedade nSerie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNSerie(String value) {
                        this.nSerie = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpComb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpComb() {
                        return tpComb;
                    }

                    /**
                     * Define o valor da propriedade tpComb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpComb(String value) {
                        this.tpComb = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nMotor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNMotor() {
                        return nMotor;
                    }

                    /**
                     * Define o valor da propriedade nMotor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNMotor(String value) {
                        this.nMotor = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cmt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCMT() {
                        return cmt;
                    }

                    /**
                     * Define o valor da propriedade cmt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCMT(String value) {
                        this.cmt = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dist.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDist() {
                        return dist;
                    }

                    /**
                     * Define o valor da propriedade dist.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDist(String value) {
                        this.dist = value;
                    }

                    /**
                     * Obt�m o valor da propriedade anoMod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnoMod() {
                        return anoMod;
                    }

                    /**
                     * Define o valor da propriedade anoMod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnoMod(String value) {
                        this.anoMod = value;
                    }

                    /**
                     * Obt�m o valor da propriedade anoFab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnoFab() {
                        return anoFab;
                    }

                    /**
                     * Define o valor da propriedade anoFab.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnoFab(String value) {
                        this.anoFab = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpPint.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpPint() {
                        return tpPint;
                    }

                    /**
                     * Define o valor da propriedade tpPint.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpPint(String value) {
                        this.tpPint = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpVeic.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpVeic() {
                        return tpVeic;
                    }

                    /**
                     * Define o valor da propriedade tpVeic.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpVeic(String value) {
                        this.tpVeic = value;
                    }

                    /**
                     * Obt�m o valor da propriedade espVeic.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEspVeic() {
                        return espVeic;
                    }

                    /**
                     * Define o valor da propriedade espVeic.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEspVeic(String value) {
                        this.espVeic = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vin.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVIN() {
                        return vin;
                    }

                    /**
                     * Define o valor da propriedade vin.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVIN(String value) {
                        this.vin = value;
                    }

                    /**
                     * Obt�m o valor da propriedade condVeic.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCondVeic() {
                        return condVeic;
                    }

                    /**
                     * Define o valor da propriedade condVeic.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCondVeic(String value) {
                        this.condVeic = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cMod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCMod() {
                        return cMod;
                    }

                    /**
                     * Define o valor da propriedade cMod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCMod(String value) {
                        this.cMod = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cCorDENATRAN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCCorDENATRAN() {
                        return cCorDENATRAN;
                    }

                    /**
                     * Define o valor da propriedade cCorDENATRAN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCCorDENATRAN(String value) {
                        this.cCorDENATRAN = value;
                    }

                    /**
                     * Obt�m o valor da propriedade lota.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLota() {
                        return lota;
                    }

                    /**
                     * Define o valor da propriedade lota.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLota(String value) {
                        this.lota = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpRest.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpRest() {
                        return tpRest;
                    }

                    /**
                     * Define o valor da propriedade tpRest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpRest(String value) {
                        this.tpRest = value;
                    }

                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xFant" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/nfe}TEnderEmi"/>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIe"/>
         *         &lt;element name="IEST" type="{http://www.portalfiscal.inf.br/nfe}TIeST" minOccurs="0"/>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="IM">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                 &lt;minLength value="1"/>
         *                 &lt;maxLength value="15"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="CNAE" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;whiteSpace value="preserve"/>
         *                 &lt;pattern value="[0-9]{7}"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
         *         &lt;element name="CRT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "cnpj",
            "cpf",
            "xNome",
            "xFant",
            "enderEmit",
            "ie",
            "iest",
            "im",
            "cnae",
            "crt"
        })
        public static class Emit {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(required = true)
            protected String xNome;
            protected String xFant;
            @XmlElement(required = true)
            protected TEnderEmi enderEmit;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(name = "IEST")
            protected String iest;
            @XmlElement(name = "IM")
            protected String im;
            @XmlElement(name = "CNAE")
            protected String cnae;
            @XmlElement(name = "CRT", required = true)
            protected String crt;

            /**
             * Obt�m o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obt�m o valor da propriedade cpf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPF() {
                return cpf;
            }

            /**
             * Define o valor da propriedade cpf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPF(String value) {
                this.cpf = value;
            }

            /**
             * Obt�m o valor da propriedade xNome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obt�m o valor da propriedade xFant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obt�m o valor da propriedade enderEmit.
             * 
             * @return
             *     possible object is
             *     {@link TEnderEmi }
             *     
             */
            public TEnderEmi getEnderEmit() {
                return enderEmit;
            }

            /**
             * Define o valor da propriedade enderEmit.
             * 
             * @param value
             *     allowed object is
             *     {@link TEnderEmi }
             *     
             */
            public void setEnderEmit(TEnderEmi value) {
                this.enderEmit = value;
            }

            /**
             * Obt�m o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obt�m o valor da propriedade iest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIEST() {
                return iest;
            }

            /**
             * Define o valor da propriedade iest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIEST(String value) {
                this.iest = value;
            }

            /**
             * Obt�m o valor da propriedade im.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIM() {
                return im;
            }

            /**
             * Define o valor da propriedade im.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIM(String value) {
                this.im = value;
            }

            /**
             * Obt�m o valor da propriedade cnae.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNAE() {
                return cnae;
            }

            /**
             * Define o valor da propriedade cnae.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNAE(String value) {
                this.cnae = value;
            }

            /**
             * Obt�m o valor da propriedade crt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRT() {
                return crt;
            }

            /**
             * Define o valor da propriedade crt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRT(String value) {
                this.crt = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="UFSaidaPais" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
         *         &lt;element name="xLocExporta">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xLocDespacho" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "ufSaidaPais",
            "xLocExporta",
            "xLocDespacho"
        })
        public static class Exporta {

            @XmlElement(name = "UFSaidaPais", required = true)
            @XmlSchemaType(name = "string")
            protected TUfEmi ufSaidaPais;
            @XmlElement(required = true)
            protected String xLocExporta;
            protected String xLocDespacho;

            /**
             * Obt�m o valor da propriedade ufSaidaPais.
             * 
             * @return
             *     possible object is
             *     {@link TUfEmi }
             *     
             */
            public TUfEmi getUFSaidaPais() {
                return ufSaidaPais;
            }

            /**
             * Define o valor da propriedade ufSaidaPais.
             * 
             * @param value
             *     allowed object is
             *     {@link TUfEmi }
             *     
             */
            public void setUFSaidaPais(TUfEmi value) {
                this.ufSaidaPais = value;
            }

            /**
             * Obt�m o valor da propriedade xLocExporta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXLocExporta() {
                return xLocExporta;
            }

            /**
             * Define o valor da propriedade xLocExporta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXLocExporta(String value) {
                this.xLocExporta = value;
            }

            /**
             * Obt�m o valor da propriedade xLocDespacho.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXLocDespacho() {
                return xLocDespacho;
            }

            /**
             * Define o valor da propriedade xLocDespacho.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXLocDespacho(String value) {
                this.xLocDespacho = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
         *         &lt;element name="cNF">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="natOp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/nfe}TMod"/>
         *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
         *         &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
         *         &lt;element name="dhEmi" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/>
         *         &lt;element name="dhSaiEnt" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC" minOccurs="0"/>
         *         &lt;element name="tpNF">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="idDest">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
         *         &lt;element name="tpImp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpEmis">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="6"/>
         *               &lt;enumeration value="7"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cDV">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{1}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
         *         &lt;element name="finNFe" type="{http://www.portalfiscal.inf.br/nfe}TFinNFe"/>
         *         &lt;element name="indFinal">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indPres">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indIntermed" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/nfe}TProcEmi"/>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="dhCont" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/>
         *           &lt;element name="xJust">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                 &lt;minLength value="15"/>
         *                 &lt;maxLength value="256"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
         *         &lt;element name="NFref" maxOccurs="500" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
         *                   &lt;element name="refNF">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
         *                             &lt;element name="AAMM">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *                             &lt;element name="mod">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="02"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
         *                             &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="refNFP">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
         *                             &lt;element name="AAMM">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;choice>
         *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *                             &lt;/choice>
         *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest"/>
         *                             &lt;element name="mod">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="04"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
         *                             &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="refCTe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
         *                   &lt;element name="refECF">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="mod">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="2B"/>
         *                                   &lt;enumeration value="2C"/>
         *                                   &lt;enumeration value="2D"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nECF">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;pattern value="[0-9]{1,3}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nCOO">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;pattern value="[0-9]{1,6}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "cuf",
            "cnf",
            "natOp",
            "mod",
            "serie",
            "nnf",
            "dhEmi",
            "dhSaiEnt",
            "tpNF",
            "idDest",
            "cMunFG",
            "tpImp",
            "tpEmis",
            "cdv",
            "tpAmb",
            "finNFe",
            "indFinal",
            "indPres",
            "indIntermed",
            "procEmi",
            "verProc",
            "dhCont",
            "xJust",
            "nFref"
        })
        public static class Ide {

            @XmlElement(name = "cUF", required = true)
            protected String cuf;
            @XmlElement(name = "cNF", required = true)
            protected String cnf;
            @XmlElement(required = true)
            protected String natOp;
            @XmlElement(required = true)
            protected String mod;
            @XmlElement(required = true)
            protected String serie;
            @XmlElement(name = "nNF", required = true)
            protected String nnf;
            @XmlElement(required = true)
            protected String dhEmi;
            protected String dhSaiEnt;
            @XmlElement(required = true)
            protected String tpNF;
            @XmlElement(required = true)
            protected String idDest;
            @XmlElement(required = true)
            protected String cMunFG;
            @XmlElement(required = true)
            protected String tpImp;
            @XmlElement(required = true)
            protected String tpEmis;
            @XmlElement(name = "cDV", required = true)
            protected String cdv;
            @XmlElement(required = true)
            protected String tpAmb;
            @XmlElement(required = true)
            protected String finNFe;
            @XmlElement(required = true)
            protected String indFinal;
            @XmlElement(required = true)
            protected String indPres;
            protected String indIntermed;
            @XmlElement(required = true)
            protected String procEmi;
            @XmlElement(required = true)
            protected String verProc;
            protected String dhCont;
            protected String xJust;
            @XmlElement(name = "NFref")
            protected List<TNFe.InfNFe.Ide.NFref> nFref;

            /**
             * Obt�m o valor da propriedade cuf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Define o valor da propriedade cuf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

            /**
             * Obt�m o valor da propriedade cnf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNF() {
                return cnf;
            }

            /**
             * Define o valor da propriedade cnf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNF(String value) {
                this.cnf = value;
            }

            /**
             * Obt�m o valor da propriedade natOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatOp() {
                return natOp;
            }

            /**
             * Define o valor da propriedade natOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatOp(String value) {
                this.natOp = value;
            }

            /**
             * Obt�m o valor da propriedade mod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMod() {
                return mod;
            }

            /**
             * Define o valor da propriedade mod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMod(String value) {
                this.mod = value;
            }

            /**
             * Obt�m o valor da propriedade serie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerie() {
                return serie;
            }

            /**
             * Define o valor da propriedade serie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerie(String value) {
                this.serie = value;
            }

            /**
             * Obt�m o valor da propriedade nnf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNNF() {
                return nnf;
            }

            /**
             * Define o valor da propriedade nnf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNNF(String value) {
                this.nnf = value;
            }

            /**
             * Obt�m o valor da propriedade dhEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhEmi() {
                return dhEmi;
            }

            /**
             * Define o valor da propriedade dhEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhEmi(String value) {
                this.dhEmi = value;
            }

            /**
             * Obt�m o valor da propriedade dhSaiEnt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhSaiEnt() {
                return dhSaiEnt;
            }

            /**
             * Define o valor da propriedade dhSaiEnt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhSaiEnt(String value) {
                this.dhSaiEnt = value;
            }

            /**
             * Obt�m o valor da propriedade tpNF.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpNF() {
                return tpNF;
            }

            /**
             * Define o valor da propriedade tpNF.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpNF(String value) {
                this.tpNF = value;
            }

            /**
             * Obt�m o valor da propriedade idDest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdDest() {
                return idDest;
            }

            /**
             * Define o valor da propriedade idDest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdDest(String value) {
                this.idDest = value;
            }

            /**
             * Obt�m o valor da propriedade cMunFG.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunFG() {
                return cMunFG;
            }

            /**
             * Define o valor da propriedade cMunFG.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunFG(String value) {
                this.cMunFG = value;
            }

            /**
             * Obt�m o valor da propriedade tpImp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpImp() {
                return tpImp;
            }

            /**
             * Define o valor da propriedade tpImp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpImp(String value) {
                this.tpImp = value;
            }

            /**
             * Obt�m o valor da propriedade tpEmis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpEmis() {
                return tpEmis;
            }

            /**
             * Define o valor da propriedade tpEmis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpEmis(String value) {
                this.tpEmis = value;
            }

            /**
             * Obt�m o valor da propriedade cdv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDV() {
                return cdv;
            }

            /**
             * Define o valor da propriedade cdv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDV(String value) {
                this.cdv = value;
            }

            /**
             * Obt�m o valor da propriedade tpAmb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpAmb(String value) {
                this.tpAmb = value;
            }

            /**
             * Obt�m o valor da propriedade finNFe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinNFe() {
                return finNFe;
            }

            /**
             * Define o valor da propriedade finNFe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinNFe(String value) {
                this.finNFe = value;
            }

            /**
             * Obt�m o valor da propriedade indFinal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndFinal() {
                return indFinal;
            }

            /**
             * Define o valor da propriedade indFinal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndFinal(String value) {
                this.indFinal = value;
            }

            /**
             * Obt�m o valor da propriedade indPres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndPres() {
                return indPres;
            }

            /**
             * Define o valor da propriedade indPres.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndPres(String value) {
                this.indPres = value;
            }

            /**
             * Obt�m o valor da propriedade indIntermed.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndIntermed() {
                return indIntermed;
            }

            /**
             * Define o valor da propriedade indIntermed.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndIntermed(String value) {
                this.indIntermed = value;
            }

            /**
             * Obt�m o valor da propriedade procEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcEmi(String value) {
                this.procEmi = value;
            }

            /**
             * Obt�m o valor da propriedade verProc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

            /**
             * Obt�m o valor da propriedade dhCont.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhCont() {
                return dhCont;
            }

            /**
             * Define o valor da propriedade dhCont.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhCont(String value) {
                this.dhCont = value;
            }

            /**
             * Obt�m o valor da propriedade xJust.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXJust() {
                return xJust;
            }

            /**
             * Define o valor da propriedade xJust.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXJust(String value) {
                this.xJust = value;
            }

            /**
             * Gets the value of the nFref property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nFref property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNFref().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.Ide.NFref }
             * 
             * 
             */
            public List<TNFe.InfNFe.Ide.NFref> getNFref() {
                if (nFref == null) {
                    nFref = new ArrayList<TNFe.InfNFe.Ide.NFref>();
                }
                return this.nFref;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
             *         &lt;element name="refNF">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
             *                   &lt;element name="AAMM">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
             *                   &lt;element name="mod">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="01"/>
             *                         &lt;enumeration value="02"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
             *                   &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="refNFP">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
             *                   &lt;element name="AAMM">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;choice>
             *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
             *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
             *                   &lt;/choice>
             *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest"/>
             *                   &lt;element name="mod">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="01"/>
             *                         &lt;enumeration value="04"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
             *                   &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="refCTe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
             *         &lt;element name="refECF">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="mod">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="2B"/>
             *                         &lt;enumeration value="2C"/>
             *                         &lt;enumeration value="2D"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nECF">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;pattern value="[0-9]{1,3}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nCOO">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;pattern value="[0-9]{1,6}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "refNFe",
                "refNF",
                "refNFP",
                "refCTe",
                "refECF"
            })
            public static class NFref {

                protected String refNFe;
                protected TNFe.InfNFe.Ide.NFref.RefNF refNF;
                protected TNFe.InfNFe.Ide.NFref.RefNFP refNFP;
                protected String refCTe;
                protected TNFe.InfNFe.Ide.NFref.RefECF refECF;

                /**
                 * Obt�m o valor da propriedade refNFe.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefNFe() {
                    return refNFe;
                }

                /**
                 * Define o valor da propriedade refNFe.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefNFe(String value) {
                    this.refNFe = value;
                }

                /**
                 * Obt�m o valor da propriedade refNF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Ide.NFref.RefNF }
                 *     
                 */
                public TNFe.InfNFe.Ide.NFref.RefNF getRefNF() {
                    return refNF;
                }

                /**
                 * Define o valor da propriedade refNF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Ide.NFref.RefNF }
                 *     
                 */
                public void setRefNF(TNFe.InfNFe.Ide.NFref.RefNF value) {
                    this.refNF = value;
                }

                /**
                 * Obt�m o valor da propriedade refNFP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Ide.NFref.RefNFP }
                 *     
                 */
                public TNFe.InfNFe.Ide.NFref.RefNFP getRefNFP() {
                    return refNFP;
                }

                /**
                 * Define o valor da propriedade refNFP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Ide.NFref.RefNFP }
                 *     
                 */
                public void setRefNFP(TNFe.InfNFe.Ide.NFref.RefNFP value) {
                    this.refNFP = value;
                }

                /**
                 * Obt�m o valor da propriedade refCTe.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefCTe() {
                    return refCTe;
                }

                /**
                 * Define o valor da propriedade refCTe.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefCTe(String value) {
                    this.refCTe = value;
                }

                /**
                 * Obt�m o valor da propriedade refECF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Ide.NFref.RefECF }
                 *     
                 */
                public TNFe.InfNFe.Ide.NFref.RefECF getRefECF() {
                    return refECF;
                }

                /**
                 * Define o valor da propriedade refECF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Ide.NFref.RefECF }
                 *     
                 */
                public void setRefECF(TNFe.InfNFe.Ide.NFref.RefECF value) {
                    this.refECF = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="mod">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="2B"/>
                 *               &lt;enumeration value="2C"/>
                 *               &lt;enumeration value="2D"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nECF">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,3}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nCOO">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{1,6}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "mod",
                    "necf",
                    "ncoo"
                })
                public static class RefECF {

                    @XmlElement(required = true)
                    protected String mod;
                    @XmlElement(name = "nECF", required = true)
                    protected String necf;
                    @XmlElement(name = "nCOO", required = true)
                    protected String ncoo;

                    /**
                     * Obt�m o valor da propriedade mod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMod() {
                        return mod;
                    }

                    /**
                     * Define o valor da propriedade mod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMod(String value) {
                        this.mod = value;
                    }

                    /**
                     * Obt�m o valor da propriedade necf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNECF() {
                        return necf;
                    }

                    /**
                     * Define o valor da propriedade necf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNECF(String value) {
                        this.necf = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ncoo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNCOO() {
                        return ncoo;
                    }

                    /**
                     * Define o valor da propriedade ncoo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNCOO(String value) {
                        this.ncoo = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
                 *         &lt;element name="AAMM">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
                 *         &lt;element name="mod">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="01"/>
                 *               &lt;enumeration value="02"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
                 *         &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
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
                    "cuf",
                    "aamm",
                    "cnpj",
                    "mod",
                    "serie",
                    "nnf"
                })
                public static class RefNF {

                    @XmlElement(name = "cUF", required = true)
                    protected String cuf;
                    @XmlElement(name = "AAMM", required = true)
                    protected String aamm;
                    @XmlElement(name = "CNPJ", required = true)
                    protected String cnpj;
                    @XmlElement(required = true)
                    protected String mod;
                    @XmlElement(required = true)
                    protected String serie;
                    @XmlElement(name = "nNF", required = true)
                    protected String nnf;

                    /**
                     * Obt�m o valor da propriedade cuf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCUF() {
                        return cuf;
                    }

                    /**
                     * Define o valor da propriedade cuf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCUF(String value) {
                        this.cuf = value;
                    }

                    /**
                     * Obt�m o valor da propriedade aamm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAAMM() {
                        return aamm;
                    }

                    /**
                     * Define o valor da propriedade aamm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAAMM(String value) {
                        this.aamm = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obt�m o valor da propriedade mod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMod() {
                        return mod;
                    }

                    /**
                     * Define o valor da propriedade mod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMod(String value) {
                        this.mod = value;
                    }

                    /**
                     * Obt�m o valor da propriedade serie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSerie() {
                        return serie;
                    }

                    /**
                     * Define o valor da propriedade serie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSerie(String value) {
                        this.serie = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nnf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNNF() {
                        return nnf;
                    }

                    /**
                     * Define o valor da propriedade nnf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNNF(String value) {
                        this.nnf = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
                 *         &lt;element name="AAMM">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;choice>
                 *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
                 *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
                 *         &lt;/choice>
                 *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest"/>
                 *         &lt;element name="mod">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="01"/>
                 *               &lt;enumeration value="04"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
                 *         &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
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
                    "cuf",
                    "aamm",
                    "cnpj",
                    "cpf",
                    "ie",
                    "mod",
                    "serie",
                    "nnf"
                })
                public static class RefNFP {

                    @XmlElement(name = "cUF", required = true)
                    protected String cuf;
                    @XmlElement(name = "AAMM", required = true)
                    protected String aamm;
                    @XmlElement(name = "CNPJ")
                    protected String cnpj;
                    @XmlElement(name = "CPF")
                    protected String cpf;
                    @XmlElement(name = "IE", required = true)
                    protected String ie;
                    @XmlElement(required = true)
                    protected String mod;
                    @XmlElement(required = true)
                    protected String serie;
                    @XmlElement(name = "nNF", required = true)
                    protected String nnf;

                    /**
                     * Obt�m o valor da propriedade cuf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCUF() {
                        return cuf;
                    }

                    /**
                     * Define o valor da propriedade cuf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCUF(String value) {
                        this.cuf = value;
                    }

                    /**
                     * Obt�m o valor da propriedade aamm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAAMM() {
                        return aamm;
                    }

                    /**
                     * Define o valor da propriedade aamm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAAMM(String value) {
                        this.aamm = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cpf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCPF() {
                        return cpf;
                    }

                    /**
                     * Define o valor da propriedade cpf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCPF(String value) {
                        this.cpf = value;
                    }

                    /**
                     * Obt�m o valor da propriedade ie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIE() {
                        return ie;
                    }

                    /**
                     * Define o valor da propriedade ie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIE(String value) {
                        this.ie = value;
                    }

                    /**
                     * Obt�m o valor da propriedade mod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMod() {
                        return mod;
                    }

                    /**
                     * Define o valor da propriedade mod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMod(String value) {
                        this.mod = value;
                    }

                    /**
                     * Obt�m o valor da propriedade serie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSerie() {
                        return serie;
                    }

                    /**
                     * Define o valor da propriedade serie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSerie(String value) {
                        this.serie = value;
                    }

                    /**
                     * Obt�m o valor da propriedade nnf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNNF() {
                        return nnf;
                    }

                    /**
                     * Define o valor da propriedade nnf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNNF(String value) {
                        this.nnf = value;
                    }

                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="infAdFisco" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;maxLength value="2000"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infCpl" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;maxLength value="5000"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="obsCont" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xTexto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="xCampo" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xTexto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="xCampo" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="procRef" maxOccurs="100" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nProc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="indProc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="9"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "infAdFisco",
            "infCpl",
            "obsCont",
            "obsFisco",
            "procRef"
        })
        public static class InfAdic {

            protected String infAdFisco;
            protected String infCpl;
            protected List<TNFe.InfNFe.InfAdic.ObsCont> obsCont;
            protected List<TNFe.InfNFe.InfAdic.ObsFisco> obsFisco;
            protected List<TNFe.InfNFe.InfAdic.ProcRef> procRef;

            /**
             * Obt�m o valor da propriedade infAdFisco.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfAdFisco() {
                return infAdFisco;
            }

            /**
             * Define o valor da propriedade infAdFisco.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfAdFisco(String value) {
                this.infAdFisco = value;
            }

            /**
             * Obt�m o valor da propriedade infCpl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfCpl() {
                return infCpl;
            }

            /**
             * Define o valor da propriedade infCpl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfCpl(String value) {
                this.infCpl = value;
            }

            /**
             * Gets the value of the obsCont property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the obsCont property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObsCont().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.InfAdic.ObsCont }
             * 
             * 
             */
            public List<TNFe.InfNFe.InfAdic.ObsCont> getObsCont() {
                if (obsCont == null) {
                    obsCont = new ArrayList<TNFe.InfNFe.InfAdic.ObsCont>();
                }
                return this.obsCont;
            }

            /**
             * Gets the value of the obsFisco property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the obsFisco property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObsFisco().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.InfAdic.ObsFisco }
             * 
             * 
             */
            public List<TNFe.InfNFe.InfAdic.ObsFisco> getObsFisco() {
                if (obsFisco == null) {
                    obsFisco = new ArrayList<TNFe.InfNFe.InfAdic.ObsFisco>();
                }
                return this.obsFisco;
            }

            /**
             * Gets the value of the procRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the procRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProcRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.InfAdic.ProcRef }
             * 
             * 
             */
            public List<TNFe.InfNFe.InfAdic.ProcRef> getProcRef() {
                if (procRef == null) {
                    procRef = new ArrayList<TNFe.InfNFe.InfAdic.ProcRef>();
                }
                return this.procRef;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xTexto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="xCampo" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xTexto"
            })
            public static class ObsCont {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obt�m o valor da propriedade xTexto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obt�m o valor da propriedade xCampo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xTexto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="xCampo" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xTexto"
            })
            public static class ObsFisco {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obt�m o valor da propriedade xTexto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obt�m o valor da propriedade xCampo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nProc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="indProc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="9"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
            @XmlType(name = "", propOrder = {
                "nProc",
                "indProc"
            })
            public static class ProcRef {

                @XmlElement(required = true)
                protected String nProc;
                @XmlElement(required = true)
                protected String indProc;

                /**
                 * Obt�m o valor da propriedade nProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNProc() {
                    return nProc;
                }

                /**
                 * Define o valor da propriedade nProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNProc(String value) {
                    this.nProc = value;
                }

                /**
                 * Obt�m o valor da propriedade indProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndProc() {
                    return indProc;
                }

                /**
                 * Define o valor da propriedade indProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndProc(String value) {
                    this.indProc = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *         &lt;element name="idCadIntTran">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "cnpj",
            "idCadIntTran"
        })
        public static class InfIntermed {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            @XmlElement(required = true)
            protected String idCadIntTran;

            /**
             * Obt�m o valor da propriedade cnpj.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obt�m o valor da propriedade idCadIntTran.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdCadIntTran() {
                return idCadIntTran;
            }

            /**
             * Define o valor da propriedade idCadIntTran.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdCadIntTran(String value) {
                this.idCadIntTran = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="detPag" maxOccurs="100">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="indPag" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="tPag">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="01"/>
         *                         &lt;enumeration value="02"/>
         *                         &lt;enumeration value="03"/>
         *                         &lt;enumeration value="04"/>
         *                         &lt;enumeration value="05"/>
         *                         &lt;enumeration value="10"/>
         *                         &lt;enumeration value="11"/>
         *                         &lt;enumeration value="12"/>
         *                         &lt;enumeration value="13"/>
         *                         &lt;enumeration value="14"/>
         *                         &lt;enumeration value="15"/>
         *                         &lt;enumeration value="16"/>
         *                         &lt;enumeration value="17"/>
         *                         &lt;enumeration value="18"/>
         *                         &lt;enumeration value="19"/>
         *                         &lt;enumeration value="90"/>
         *                         &lt;enumeration value="99"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vPag" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="card" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpIntegra">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
         *                             &lt;element name="tBand" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="02"/>
         *                                   &lt;enumeration value="03"/>
         *                                   &lt;enumeration value="04"/>
         *                                   &lt;enumeration value="05"/>
         *                                   &lt;enumeration value="06"/>
         *                                   &lt;enumeration value="07"/>
         *                                   &lt;enumeration value="08"/>
         *                                   &lt;enumeration value="09"/>
         *                                   &lt;enumeration value="99"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cAut" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="vTroco" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
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
            "detPag",
            "vTroco"
        })
        public static class Pag {

            @XmlElement(required = true)
            protected List<TNFe.InfNFe.Pag.DetPag> detPag;
            protected String vTroco;

            /**
             * Gets the value of the detPag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detPag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetPag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.Pag.DetPag }
             * 
             * 
             */
            public List<TNFe.InfNFe.Pag.DetPag> getDetPag() {
                if (detPag == null) {
                    detPag = new ArrayList<TNFe.InfNFe.Pag.DetPag>();
                }
                return this.detPag;
            }

            /**
             * Obt�m o valor da propriedade vTroco.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTroco() {
                return vTroco;
            }

            /**
             * Define o valor da propriedade vTroco.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTroco(String value) {
                this.vTroco = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="indPag" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tPag">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="01"/>
             *               &lt;enumeration value="02"/>
             *               &lt;enumeration value="03"/>
             *               &lt;enumeration value="04"/>
             *               &lt;enumeration value="05"/>
             *               &lt;enumeration value="10"/>
             *               &lt;enumeration value="11"/>
             *               &lt;enumeration value="12"/>
             *               &lt;enumeration value="13"/>
             *               &lt;enumeration value="14"/>
             *               &lt;enumeration value="15"/>
             *               &lt;enumeration value="16"/>
             *               &lt;enumeration value="17"/>
             *               &lt;enumeration value="18"/>
             *               &lt;enumeration value="19"/>
             *               &lt;enumeration value="90"/>
             *               &lt;enumeration value="99"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vPag" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="card" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpIntegra">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
             *                   &lt;element name="tBand" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;enumeration value="01"/>
             *                         &lt;enumeration value="02"/>
             *                         &lt;enumeration value="03"/>
             *                         &lt;enumeration value="04"/>
             *                         &lt;enumeration value="05"/>
             *                         &lt;enumeration value="06"/>
             *                         &lt;enumeration value="07"/>
             *                         &lt;enumeration value="08"/>
             *                         &lt;enumeration value="09"/>
             *                         &lt;enumeration value="99"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cAut" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
            @XmlType(name = "", propOrder = {
                "indPag",
                "tPag",
                "vPag",
                "card"
            })
            public static class DetPag {

                protected String indPag;
                @XmlElement(required = true)
                protected String tPag;
                @XmlElement(required = true)
                protected String vPag;
                protected TNFe.InfNFe.Pag.DetPag.Card card;

                /**
                 * Obt�m o valor da propriedade indPag.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndPag() {
                    return indPag;
                }

                /**
                 * Define o valor da propriedade indPag.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndPag(String value) {
                    this.indPag = value;
                }

                /**
                 * Obt�m o valor da propriedade tPag.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTPag() {
                    return tPag;
                }

                /**
                 * Define o valor da propriedade tPag.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTPag(String value) {
                    this.tPag = value;
                }

                /**
                 * Obt�m o valor da propriedade vPag.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVPag() {
                    return vPag;
                }

                /**
                 * Define o valor da propriedade vPag.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVPag(String value) {
                    this.vPag = value;
                }

                /**
                 * Obt�m o valor da propriedade card.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNFe.InfNFe.Pag.DetPag.Card }
                 *     
                 */
                public TNFe.InfNFe.Pag.DetPag.Card getCard() {
                    return card;
                }

                /**
                 * Define o valor da propriedade card.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNFe.InfNFe.Pag.DetPag.Card }
                 *     
                 */
                public void setCard(TNFe.InfNFe.Pag.DetPag.Card value) {
                    this.card = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpIntegra">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
                 *         &lt;element name="tBand" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="01"/>
                 *               &lt;enumeration value="02"/>
                 *               &lt;enumeration value="03"/>
                 *               &lt;enumeration value="04"/>
                 *               &lt;enumeration value="05"/>
                 *               &lt;enumeration value="06"/>
                 *               &lt;enumeration value="07"/>
                 *               &lt;enumeration value="08"/>
                 *               &lt;enumeration value="09"/>
                 *               &lt;enumeration value="99"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cAut" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "tpIntegra",
                    "cnpj",
                    "tBand",
                    "cAut"
                })
                public static class Card {

                    @XmlElement(required = true)
                    protected String tpIntegra;
                    @XmlElement(name = "CNPJ")
                    protected String cnpj;
                    protected String tBand;
                    protected String cAut;

                    /**
                     * Obt�m o valor da propriedade tpIntegra.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpIntegra() {
                        return tpIntegra;
                    }

                    /**
                     * Define o valor da propriedade tpIntegra.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpIntegra(String value) {
                        this.tpIntegra = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tBand.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTBand() {
                        return tBand;
                    }

                    /**
                     * Define o valor da propriedade tBand.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTBand(String value) {
                        this.tBand = value;
                    }

                    /**
                     * Obt�m o valor da propriedade cAut.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCAut() {
                        return cAut;
                    }

                    /**
                     * Define o valor da propriedade cAut.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCAut(String value) {
                        this.cAut = value;
                    }

                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ICMSTot">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="vFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vSeg" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ISSQNtot" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vISS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="dCompet" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
         *                   &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="cRegTrib" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                         &lt;enumeration value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="retTrib" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vRetPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vRetCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vRetCSLL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vBCIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vBCRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;element name="vRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "icmsTot",
            "issqNtot",
            "retTrib"
        })
        public static class Total {

            @XmlElement(name = "ICMSTot", required = true)
            protected TNFe.InfNFe.Total.ICMSTot icmsTot;
            @XmlElement(name = "ISSQNtot")
            protected TNFe.InfNFe.Total.ISSQNtot issqNtot;
            protected TNFe.InfNFe.Total.RetTrib retTrib;

            /**
             * Obt�m o valor da propriedade icmsTot.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Total.ICMSTot }
             *     
             */
            public TNFe.InfNFe.Total.ICMSTot getICMSTot() {
                return icmsTot;
            }

            /**
             * Define o valor da propriedade icmsTot.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Total.ICMSTot }
             *     
             */
            public void setICMSTot(TNFe.InfNFe.Total.ICMSTot value) {
                this.icmsTot = value;
            }

            /**
             * Obt�m o valor da propriedade issqNtot.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Total.ISSQNtot }
             *     
             */
            public TNFe.InfNFe.Total.ISSQNtot getISSQNtot() {
                return issqNtot;
            }

            /**
             * Define o valor da propriedade issqNtot.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Total.ISSQNtot }
             *     
             */
            public void setISSQNtot(TNFe.InfNFe.Total.ISSQNtot value) {
                this.issqNtot = value;
            }

            /**
             * Obt�m o valor da propriedade retTrib.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Total.RetTrib }
             *     
             */
            public TNFe.InfNFe.Total.RetTrib getRetTrib() {
                return retTrib;
            }

            /**
             * Define o valor da propriedade retTrib.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Total.RetTrib }
             *     
             */
            public void setRetTrib(TNFe.InfNFe.Total.RetTrib value) {
                this.retTrib = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
             *         &lt;element name="vFCP" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vFCPST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vFCPSTRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vSeg" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
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
                "vbc",
                "vicms",
                "vicmsDeson",
                "vfcpufDest",
                "vicmsufDest",
                "vicmsufRemet",
                "vfcp",
                "vbcst",
                "vst",
                "vfcpst",
                "vfcpstRet",
                "vProd",
                "vFrete",
                "vSeg",
                "vDesc",
                "vii",
                "vipi",
                "vipiDevol",
                "vpis",
                "vcofins",
                "vOutro",
                "vnf",
                "vTotTrib"
            })
            public static class ICMSTot {

                @XmlElement(name = "vBC", required = true)
                protected String vbc;
                @XmlElement(name = "vICMS", required = true)
                protected String vicms;
                @XmlElement(name = "vICMSDeson", required = true)
                protected String vicmsDeson;
                @XmlElement(name = "vFCPUFDest")
                protected String vfcpufDest;
                @XmlElement(name = "vICMSUFDest")
                protected String vicmsufDest;
                @XmlElement(name = "vICMSUFRemet")
                protected String vicmsufRemet;
                @XmlElement(name = "vFCP", required = true)
                protected String vfcp;
                @XmlElement(name = "vBCST", required = true)
                protected String vbcst;
                @XmlElement(name = "vST", required = true)
                protected String vst;
                @XmlElement(name = "vFCPST", required = true)
                protected String vfcpst;
                @XmlElement(name = "vFCPSTRet", required = true)
                protected String vfcpstRet;
                @XmlElement(required = true)
                protected String vProd;
                @XmlElement(required = true)
                protected String vFrete;
                @XmlElement(required = true)
                protected String vSeg;
                @XmlElement(required = true)
                protected String vDesc;
                @XmlElement(name = "vII", required = true)
                protected String vii;
                @XmlElement(name = "vIPI", required = true)
                protected String vipi;
                @XmlElement(name = "vIPIDevol", required = true)
                protected String vipiDevol;
                @XmlElement(name = "vPIS", required = true)
                protected String vpis;
                @XmlElement(name = "vCOFINS", required = true)
                protected String vcofins;
                @XmlElement(required = true)
                protected String vOutro;
                @XmlElement(name = "vNF", required = true)
                protected String vnf;
                protected String vTotTrib;

                /**
                 * Obt�m o valor da propriedade vbc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBC() {
                    return vbc;
                }

                /**
                 * Define o valor da propriedade vbc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBC(String value) {
                    this.vbc = value;
                }

                /**
                 * Obt�m o valor da propriedade vicms.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMS() {
                    return vicms;
                }

                /**
                 * Define o valor da propriedade vicms.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMS(String value) {
                    this.vicms = value;
                }

                /**
                 * Obt�m o valor da propriedade vicmsDeson.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMSDeson() {
                    return vicmsDeson;
                }

                /**
                 * Define o valor da propriedade vicmsDeson.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMSDeson(String value) {
                    this.vicmsDeson = value;
                }

                /**
                 * Obt�m o valor da propriedade vfcpufDest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFCPUFDest() {
                    return vfcpufDest;
                }

                /**
                 * Define o valor da propriedade vfcpufDest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFCPUFDest(String value) {
                    this.vfcpufDest = value;
                }

                /**
                 * Obt�m o valor da propriedade vicmsufDest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMSUFDest() {
                    return vicmsufDest;
                }

                /**
                 * Define o valor da propriedade vicmsufDest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMSUFDest(String value) {
                    this.vicmsufDest = value;
                }

                /**
                 * Obt�m o valor da propriedade vicmsufRemet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMSUFRemet() {
                    return vicmsufRemet;
                }

                /**
                 * Define o valor da propriedade vicmsufRemet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMSUFRemet(String value) {
                    this.vicmsufRemet = value;
                }

                /**
                 * Obt�m o valor da propriedade vfcp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFCP() {
                    return vfcp;
                }

                /**
                 * Define o valor da propriedade vfcp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFCP(String value) {
                    this.vfcp = value;
                }

                /**
                 * Obt�m o valor da propriedade vbcst.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBCST() {
                    return vbcst;
                }

                /**
                 * Define o valor da propriedade vbcst.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBCST(String value) {
                    this.vbcst = value;
                }

                /**
                 * Obt�m o valor da propriedade vst.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVST() {
                    return vst;
                }

                /**
                 * Define o valor da propriedade vst.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVST(String value) {
                    this.vst = value;
                }

                /**
                 * Obt�m o valor da propriedade vfcpst.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFCPST() {
                    return vfcpst;
                }

                /**
                 * Define o valor da propriedade vfcpst.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFCPST(String value) {
                    this.vfcpst = value;
                }

                /**
                 * Obt�m o valor da propriedade vfcpstRet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFCPSTRet() {
                    return vfcpstRet;
                }

                /**
                 * Define o valor da propriedade vfcpstRet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFCPSTRet(String value) {
                    this.vfcpstRet = value;
                }

                /**
                 * Obt�m o valor da propriedade vProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVProd() {
                    return vProd;
                }

                /**
                 * Define o valor da propriedade vProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVProd(String value) {
                    this.vProd = value;
                }

                /**
                 * Obt�m o valor da propriedade vFrete.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFrete() {
                    return vFrete;
                }

                /**
                 * Define o valor da propriedade vFrete.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFrete(String value) {
                    this.vFrete = value;
                }

                /**
                 * Obt�m o valor da propriedade vSeg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVSeg() {
                    return vSeg;
                }

                /**
                 * Define o valor da propriedade vSeg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVSeg(String value) {
                    this.vSeg = value;
                }

                /**
                 * Obt�m o valor da propriedade vDesc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDesc() {
                    return vDesc;
                }

                /**
                 * Define o valor da propriedade vDesc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDesc(String value) {
                    this.vDesc = value;
                }

                /**
                 * Obt�m o valor da propriedade vii.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVII() {
                    return vii;
                }

                /**
                 * Define o valor da propriedade vii.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVII(String value) {
                    this.vii = value;
                }

                /**
                 * Obt�m o valor da propriedade vipi.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVIPI() {
                    return vipi;
                }

                /**
                 * Define o valor da propriedade vipi.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVIPI(String value) {
                    this.vipi = value;
                }

                /**
                 * Obt�m o valor da propriedade vipiDevol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVIPIDevol() {
                    return vipiDevol;
                }

                /**
                 * Define o valor da propriedade vipiDevol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVIPIDevol(String value) {
                    this.vipiDevol = value;
                }

                /**
                 * Obt�m o valor da propriedade vpis.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVPIS() {
                    return vpis;
                }

                /**
                 * Define o valor da propriedade vpis.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVPIS(String value) {
                    this.vpis = value;
                }

                /**
                 * Obt�m o valor da propriedade vcofins.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVCOFINS() {
                    return vcofins;
                }

                /**
                 * Define o valor da propriedade vcofins.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVCOFINS(String value) {
                    this.vcofins = value;
                }

                /**
                 * Obt�m o valor da propriedade vOutro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVOutro() {
                    return vOutro;
                }

                /**
                 * Define o valor da propriedade vOutro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVOutro(String value) {
                    this.vOutro = value;
                }

                /**
                 * Obt�m o valor da propriedade vnf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVNF() {
                    return vnf;
                }

                /**
                 * Define o valor da propriedade vnf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVNF(String value) {
                    this.vnf = value;
                }

                /**
                 * Obt�m o valor da propriedade vTotTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVTotTrib() {
                    return vTotTrib;
                }

                /**
                 * Define o valor da propriedade vTotTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVTotTrib(String value) {
                    this.vTotTrib = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vISS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="dCompet" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
             *         &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="cRegTrib" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *               &lt;enumeration value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
            @XmlType(name = "", propOrder = {
                "vServ",
                "vbc",
                "viss",
                "vpis",
                "vcofins",
                "dCompet",
                "vDeducao",
                "vOutro",
                "vDescIncond",
                "vDescCond",
                "vissRet",
                "cRegTrib"
            })
            public static class ISSQNtot {

                protected String vServ;
                @XmlElement(name = "vBC")
                protected String vbc;
                @XmlElement(name = "vISS")
                protected String viss;
                @XmlElement(name = "vPIS")
                protected String vpis;
                @XmlElement(name = "vCOFINS")
                protected String vcofins;
                @XmlElement(required = true)
                protected String dCompet;
                protected String vDeducao;
                protected String vOutro;
                protected String vDescIncond;
                protected String vDescCond;
                @XmlElement(name = "vISSRet")
                protected String vissRet;
                protected String cRegTrib;

                /**
                 * Obt�m o valor da propriedade vServ.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVServ() {
                    return vServ;
                }

                /**
                 * Define o valor da propriedade vServ.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVServ(String value) {
                    this.vServ = value;
                }

                /**
                 * Obt�m o valor da propriedade vbc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBC() {
                    return vbc;
                }

                /**
                 * Define o valor da propriedade vbc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBC(String value) {
                    this.vbc = value;
                }

                /**
                 * Obt�m o valor da propriedade viss.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVISS() {
                    return viss;
                }

                /**
                 * Define o valor da propriedade viss.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVISS(String value) {
                    this.viss = value;
                }

                /**
                 * Obt�m o valor da propriedade vpis.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVPIS() {
                    return vpis;
                }

                /**
                 * Define o valor da propriedade vpis.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVPIS(String value) {
                    this.vpis = value;
                }

                /**
                 * Obt�m o valor da propriedade vcofins.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVCOFINS() {
                    return vcofins;
                }

                /**
                 * Define o valor da propriedade vcofins.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVCOFINS(String value) {
                    this.vcofins = value;
                }

                /**
                 * Obt�m o valor da propriedade dCompet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDCompet() {
                    return dCompet;
                }

                /**
                 * Define o valor da propriedade dCompet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDCompet(String value) {
                    this.dCompet = value;
                }

                /**
                 * Obt�m o valor da propriedade vDeducao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDeducao() {
                    return vDeducao;
                }

                /**
                 * Define o valor da propriedade vDeducao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDeducao(String value) {
                    this.vDeducao = value;
                }

                /**
                 * Obt�m o valor da propriedade vOutro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVOutro() {
                    return vOutro;
                }

                /**
                 * Define o valor da propriedade vOutro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVOutro(String value) {
                    this.vOutro = value;
                }

                /**
                 * Obt�m o valor da propriedade vDescIncond.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDescIncond() {
                    return vDescIncond;
                }

                /**
                 * Define o valor da propriedade vDescIncond.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDescIncond(String value) {
                    this.vDescIncond = value;
                }

                /**
                 * Obt�m o valor da propriedade vDescCond.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDescCond() {
                    return vDescCond;
                }

                /**
                 * Define o valor da propriedade vDescCond.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDescCond(String value) {
                    this.vDescCond = value;
                }

                /**
                 * Obt�m o valor da propriedade vissRet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVISSRet() {
                    return vissRet;
                }

                /**
                 * Define o valor da propriedade vissRet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVISSRet(String value) {
                    this.vissRet = value;
                }

                /**
                 * Obt�m o valor da propriedade cRegTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCRegTrib() {
                    return cRegTrib;
                }

                /**
                 * Define o valor da propriedade cRegTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCRegTrib(String value) {
                    this.cRegTrib = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vRetPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vRetCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vRetCSLL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vBCIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vBCRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
             *         &lt;element name="vRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
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
                "vRetPIS",
                "vRetCOFINS",
                "vRetCSLL",
                "vbcirrf",
                "virrf",
                "vbcRetPrev",
                "vRetPrev"
            })
            public static class RetTrib {

                protected String vRetPIS;
                protected String vRetCOFINS;
                protected String vRetCSLL;
                @XmlElement(name = "vBCIRRF")
                protected String vbcirrf;
                @XmlElement(name = "vIRRF")
                protected String virrf;
                @XmlElement(name = "vBCRetPrev")
                protected String vbcRetPrev;
                protected String vRetPrev;

                /**
                 * Obt�m o valor da propriedade vRetPIS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVRetPIS() {
                    return vRetPIS;
                }

                /**
                 * Define o valor da propriedade vRetPIS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVRetPIS(String value) {
                    this.vRetPIS = value;
                }

                /**
                 * Obt�m o valor da propriedade vRetCOFINS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVRetCOFINS() {
                    return vRetCOFINS;
                }

                /**
                 * Define o valor da propriedade vRetCOFINS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVRetCOFINS(String value) {
                    this.vRetCOFINS = value;
                }

                /**
                 * Obt�m o valor da propriedade vRetCSLL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVRetCSLL() {
                    return vRetCSLL;
                }

                /**
                 * Define o valor da propriedade vRetCSLL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVRetCSLL(String value) {
                    this.vRetCSLL = value;
                }

                /**
                 * Obt�m o valor da propriedade vbcirrf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBCIRRF() {
                    return vbcirrf;
                }

                /**
                 * Define o valor da propriedade vbcirrf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBCIRRF(String value) {
                    this.vbcirrf = value;
                }

                /**
                 * Obt�m o valor da propriedade virrf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVIRRF() {
                    return virrf;
                }

                /**
                 * Define o valor da propriedade virrf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVIRRF(String value) {
                    this.virrf = value;
                }

                /**
                 * Obt�m o valor da propriedade vbcRetPrev.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBCRetPrev() {
                    return vbcRetPrev;
                }

                /**
                 * Define o valor da propriedade vbcRetPrev.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBCRetPrev(String value) {
                    this.vbcRetPrev = value;
                }

                /**
                 * Obt�m o valor da propriedade vRetPrev.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVRetPrev() {
                    return vRetPrev;
                }

                /**
                 * Define o valor da propriedade vRetPrev.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVRetPrev(String value) {
                    this.vRetPrev = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="modFrete">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="transporta" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice minOccurs="0">
         *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
         *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
         *                   &lt;/choice>
         *                   &lt;element name="xNome" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;maxLength value="60"/>
         *                         &lt;minLength value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest" minOccurs="0"/>
         *                   &lt;element name="xEnder" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xMun" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;maxLength value="60"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="retTransp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="vBCRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="pICMSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
         *                   &lt;element name="vICMSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
         *                   &lt;element name="CFOP">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;pattern value="[1,2,3,5,6,7]{1}[0-9]{3}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;sequence minOccurs="0">
         *             &lt;element name="veicTransp" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo" minOccurs="0"/>
         *             &lt;element name="reboque" type="{http://www.portalfiscal.inf.br/nfe}TVeiculo" maxOccurs="5" minOccurs="0"/>
         *           &lt;/sequence>
         *           &lt;element name="vagao" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                 &lt;minLength value="1"/>
         *                 &lt;maxLength value="20"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="balsa" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                 &lt;minLength value="1"/>
         *                 &lt;maxLength value="20"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/choice>
         *         &lt;element name="vol" maxOccurs="5000" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="qVol" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;pattern value="[0-9]{1,15}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="esp" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="marca" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nVol" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="pesoL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203" minOccurs="0"/>
         *                   &lt;element name="pesoB" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203" minOccurs="0"/>
         *                   &lt;element name="lacres" maxOccurs="5000" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nLacre">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "modFrete",
            "transporta",
            "retTransp",
            "veicTransp",
            "reboque",
            "vagao",
            "balsa",
            "vol"
        })
        public static class Transp {

            @XmlElement(required = true)
            protected String modFrete;
            protected TNFe.InfNFe.Transp.Transporta transporta;
            protected TNFe.InfNFe.Transp.RetTransp retTransp;
            protected TVeiculo veicTransp;
            protected List<TVeiculo> reboque;
            protected String vagao;
            protected String balsa;
            protected List<TNFe.InfNFe.Transp.Vol> vol;

            /**
             * Obt�m o valor da propriedade modFrete.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModFrete() {
                return modFrete;
            }

            /**
             * Define o valor da propriedade modFrete.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModFrete(String value) {
                this.modFrete = value;
            }

            /**
             * Obt�m o valor da propriedade transporta.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Transp.Transporta }
             *     
             */
            public TNFe.InfNFe.Transp.Transporta getTransporta() {
                return transporta;
            }

            /**
             * Define o valor da propriedade transporta.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Transp.Transporta }
             *     
             */
            public void setTransporta(TNFe.InfNFe.Transp.Transporta value) {
                this.transporta = value;
            }

            /**
             * Obt�m o valor da propriedade retTransp.
             * 
             * @return
             *     possible object is
             *     {@link TNFe.InfNFe.Transp.RetTransp }
             *     
             */
            public TNFe.InfNFe.Transp.RetTransp getRetTransp() {
                return retTransp;
            }

            /**
             * Define o valor da propriedade retTransp.
             * 
             * @param value
             *     allowed object is
             *     {@link TNFe.InfNFe.Transp.RetTransp }
             *     
             */
            public void setRetTransp(TNFe.InfNFe.Transp.RetTransp value) {
                this.retTransp = value;
            }

            /**
             * Obt�m o valor da propriedade veicTransp.
             * 
             * @return
             *     possible object is
             *     {@link TVeiculo }
             *     
             */
            public TVeiculo getVeicTransp() {
                return veicTransp;
            }

            /**
             * Define o valor da propriedade veicTransp.
             * 
             * @param value
             *     allowed object is
             *     {@link TVeiculo }
             *     
             */
            public void setVeicTransp(TVeiculo value) {
                this.veicTransp = value;
            }

            /**
             * Gets the value of the reboque property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reboque property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReboque().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TVeiculo }
             * 
             * 
             */
            public List<TVeiculo> getReboque() {
                if (reboque == null) {
                    reboque = new ArrayList<TVeiculo>();
                }
                return this.reboque;
            }

            /**
             * Obt�m o valor da propriedade vagao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVagao() {
                return vagao;
            }

            /**
             * Define o valor da propriedade vagao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVagao(String value) {
                this.vagao = value;
            }

            /**
             * Obt�m o valor da propriedade balsa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBalsa() {
                return balsa;
            }

            /**
             * Define o valor da propriedade balsa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBalsa(String value) {
                this.balsa = value;
            }

            /**
             * Gets the value of the vol property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the vol property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVol().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TNFe.InfNFe.Transp.Vol }
             * 
             * 
             */
            public List<TNFe.InfNFe.Transp.Vol> getVol() {
                if (vol == null) {
                    vol = new ArrayList<TNFe.InfNFe.Transp.Vol>();
                }
                return this.vol;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="vBCRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="pICMSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
             *         &lt;element name="vICMSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
             *         &lt;element name="CFOP">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[1,2,3,5,6,7]{1}[0-9]{3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
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
                "vServ",
                "vbcRet",
                "picmsRet",
                "vicmsRet",
                "cfop",
                "cMunFG"
            })
            public static class RetTransp {

                @XmlElement(required = true)
                protected String vServ;
                @XmlElement(name = "vBCRet", required = true)
                protected String vbcRet;
                @XmlElement(name = "pICMSRet", required = true)
                protected String picmsRet;
                @XmlElement(name = "vICMSRet", required = true)
                protected String vicmsRet;
                @XmlElement(name = "CFOP", required = true)
                protected String cfop;
                @XmlElement(required = true)
                protected String cMunFG;

                /**
                 * Obt�m o valor da propriedade vServ.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVServ() {
                    return vServ;
                }

                /**
                 * Define o valor da propriedade vServ.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVServ(String value) {
                    this.vServ = value;
                }

                /**
                 * Obt�m o valor da propriedade vbcRet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBCRet() {
                    return vbcRet;
                }

                /**
                 * Define o valor da propriedade vbcRet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBCRet(String value) {
                    this.vbcRet = value;
                }

                /**
                 * Obt�m o valor da propriedade picmsRet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPICMSRet() {
                    return picmsRet;
                }

                /**
                 * Define o valor da propriedade picmsRet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPICMSRet(String value) {
                    this.picmsRet = value;
                }

                /**
                 * Obt�m o valor da propriedade vicmsRet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMSRet() {
                    return vicmsRet;
                }

                /**
                 * Define o valor da propriedade vicmsRet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMSRet(String value) {
                    this.vicmsRet = value;
                }

                /**
                 * Obt�m o valor da propriedade cfop.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCFOP() {
                    return cfop;
                }

                /**
                 * Define o valor da propriedade cfop.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCFOP(String value) {
                    this.cfop = value;
                }

                /**
                 * Obt�m o valor da propriedade cMunFG.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCMunFG() {
                    return cMunFG;
                }

                /**
                 * Define o valor da propriedade cMunFG.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCMunFG(String value) {
                    this.cMunFG = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice minOccurs="0">
             *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
             *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
             *         &lt;/choice>
             *         &lt;element name="xNome" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="60"/>
             *               &lt;minLength value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest" minOccurs="0"/>
             *         &lt;element name="xEnder" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xMun" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;maxLength value="60"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf" minOccurs="0"/>
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
                "cnpj",
                "cpf",
                "xNome",
                "ie",
                "xEnder",
                "xMun",
                "uf"
            })
            public static class Transporta {

                @XmlElement(name = "CNPJ")
                protected String cnpj;
                @XmlElement(name = "CPF")
                protected String cpf;
                protected String xNome;
                @XmlElement(name = "IE")
                protected String ie;
                protected String xEnder;
                protected String xMun;
                @XmlElement(name = "UF")
                @XmlSchemaType(name = "string")
                protected TUf uf;

                /**
                 * Obt�m o valor da propriedade cnpj.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNPJ() {
                    return cnpj;
                }

                /**
                 * Define o valor da propriedade cnpj.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNPJ(String value) {
                    this.cnpj = value;
                }

                /**
                 * Obt�m o valor da propriedade cpf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCPF() {
                    return cpf;
                }

                /**
                 * Define o valor da propriedade cpf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCPF(String value) {
                    this.cpf = value;
                }

                /**
                 * Obt�m o valor da propriedade xNome.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXNome() {
                    return xNome;
                }

                /**
                 * Define o valor da propriedade xNome.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXNome(String value) {
                    this.xNome = value;
                }

                /**
                 * Obt�m o valor da propriedade ie.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIE() {
                    return ie;
                }

                /**
                 * Define o valor da propriedade ie.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIE(String value) {
                    this.ie = value;
                }

                /**
                 * Obt�m o valor da propriedade xEnder.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXEnder() {
                    return xEnder;
                }

                /**
                 * Define o valor da propriedade xEnder.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXEnder(String value) {
                    this.xEnder = value;
                }

                /**
                 * Obt�m o valor da propriedade xMun.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXMun() {
                    return xMun;
                }

                /**
                 * Define o valor da propriedade xMun.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXMun(String value) {
                    this.xMun = value;
                }

                /**
                 * Obt�m o valor da propriedade uf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TUf }
                 *     
                 */
                public TUf getUF() {
                    return uf;
                }

                /**
                 * Define o valor da propriedade uf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TUf }
                 *     
                 */
                public void setUF(TUf value) {
                    this.uf = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="qVol" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[0-9]{1,15}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="esp" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="marca" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nVol" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="pesoL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203" minOccurs="0"/>
             *         &lt;element name="pesoB" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203" minOccurs="0"/>
             *         &lt;element name="lacres" maxOccurs="5000" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nLacre">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
            @XmlType(name = "", propOrder = {
                "qVol",
                "esp",
                "marca",
                "nVol",
                "pesoL",
                "pesoB",
                "lacres"
            })
            public static class Vol {

                protected String qVol;
                protected String esp;
                protected String marca;
                protected String nVol;
                protected String pesoL;
                protected String pesoB;
                protected List<TNFe.InfNFe.Transp.Vol.Lacres> lacres;

                /**
                 * Obt�m o valor da propriedade qVol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQVol() {
                    return qVol;
                }

                /**
                 * Define o valor da propriedade qVol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQVol(String value) {
                    this.qVol = value;
                }

                /**
                 * Obt�m o valor da propriedade esp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEsp() {
                    return esp;
                }

                /**
                 * Define o valor da propriedade esp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEsp(String value) {
                    this.esp = value;
                }

                /**
                 * Obt�m o valor da propriedade marca.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarca() {
                    return marca;
                }

                /**
                 * Define o valor da propriedade marca.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarca(String value) {
                    this.marca = value;
                }

                /**
                 * Obt�m o valor da propriedade nVol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNVol() {
                    return nVol;
                }

                /**
                 * Define o valor da propriedade nVol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNVol(String value) {
                    this.nVol = value;
                }

                /**
                 * Obt�m o valor da propriedade pesoL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPesoL() {
                    return pesoL;
                }

                /**
                 * Define o valor da propriedade pesoL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPesoL(String value) {
                    this.pesoL = value;
                }

                /**
                 * Obt�m o valor da propriedade pesoB.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPesoB() {
                    return pesoB;
                }

                /**
                 * Define o valor da propriedade pesoB.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPesoB(String value) {
                    this.pesoB = value;
                }

                /**
                 * Gets the value of the lacres property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the lacres property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLacres().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TNFe.InfNFe.Transp.Vol.Lacres }
                 * 
                 * 
                 */
                public List<TNFe.InfNFe.Transp.Vol.Lacres> getLacres() {
                    if (lacres == null) {
                        lacres = new ArrayList<TNFe.InfNFe.Transp.Vol.Lacres>();
                    }
                    return this.lacres;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="nLacre">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                @XmlType(name = "", propOrder = {
                    "nLacre"
                })
                public static class Lacres {

                    @XmlElement(required = true)
                    protected String nLacre;

                    /**
                     * Obt�m o valor da propriedade nLacre.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNLacre() {
                        return nLacre;
                    }

                    /**
                     * Define o valor da propriedade nLacre.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNLacre(String value) {
                        this.nLacre = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="qrCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="100"/>
     *               &lt;maxLength value="600"/>
     *               &lt;pattern value="(((HTTPS?|https?)://.*\?chNFe=[0-9]{44}&amp;nVersao=100&amp;tpAmb=[1-2](&amp;cDest=([A-Za-z0-9.:+-/)(]{0}|[A-Za-z0-9.:+-/)(]{5,20})?)?&amp;dhEmi=[A-Fa-f0-9]{50}&amp;vNF=(0|0\.[0-9]{2}|[1-9]{1}[0-9]{0,12}(\.[0-9]{2})?)&amp;vICMS=(0|0\.[0-9]{2}|[1-9]{1}[0-9]{0,12}(\.[0-9]{2})?)&amp;digVal=[A-Fa-f0-9]{56}&amp;cIdToken=[0-9]{6}&amp;cHashQRCode=[A-Fa-f0-9]{40})|((HTTPS?|https?)://.*\?p=([0-9]{34}(1|4)[0-9]{9})\|[2]\|[1-2]\|(0|[1-9]{1}([0-9]{1,5})?)\|[A-Fa-f0-9]{40})|((HTTPS?|https?)://.*\?p=([0-9]{34}9[0-9]{9})\|[2]\|[1-2]\|([0]{1}[1-9]{1}|[1-2]{1}[0-9]{1}|[3]{1}[0-1]{1})\|(0|0\.[0-9]{2}|[1-9]{1}[0-9]{0,12}(\.[0-9]{2})?)\|[A-Fa-f0-9]{56}\|(0|[1-9]{1}([0-9]{1,5})?)\|[A-Fa-f0-9]{40}))"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="urlChave">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="21"/>
     *               &lt;maxLength value="85"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "qrCode",
        "urlChave"
    })
    public static class InfNFeSupl {

        @XmlElement(required = true)
        protected String qrCode;
        @XmlElement(required = true)
        protected String urlChave;

        /**
         * Obt�m o valor da propriedade qrCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrCode() {
            return qrCode;
        }

        /**
         * Define o valor da propriedade qrCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrCode(String value) {
            this.qrCode = value;
        }

        /**
         * Obt�m o valor da propriedade urlChave.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrlChave() {
            return urlChave;
        }

        /**
         * Define o valor da propriedade urlChave.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrlChave(String value) {
            this.urlChave = value;
        }

    }

}