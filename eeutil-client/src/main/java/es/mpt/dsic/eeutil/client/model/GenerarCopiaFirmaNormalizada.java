/* Copyright (C) 2016 MINHAP, Gobierno de España
   This program is licensed and may be used, modified and redistributed under the terms
   of the European Public License (EUPL), either version 1.1 or (at your
   option) any later version as soon as they are approved by the European Commission.
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
   or implied. See the License for the specific language governing permissions and
   more details.
   You should have received a copy of the EUPL1.1 license
   along with this program; if not, you may find it at
   http://joinup.ec.europa.eu/software/page/eupl/licence-eupl */


package es.mpt.dsic.eeutil.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generarCopiaFirmaNormalizada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generarCopiaFirmaNormalizada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aplicacionInfo" type="{http://service.ws.inside.dsic.mpt.es/}applicationLogin"/>
 *         &lt;element name="copiaInfo" type="{http://service.ws.inside.dsic.mpt.es/}CopiaInfo"/>
 *         &lt;element name="firmaInfo" type="{http://service.ws.inside.dsic.mpt.es/}ListaFirmaInfo"/>
 *         &lt;element name="simpleFormat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarCopiaFirmaNormalizada", propOrder = {
    "aplicacionInfo",
    "copiaInfo",
    "firmaInfo",
    "simpleFormat"
})
public class GenerarCopiaFirmaNormalizada {

    @XmlElement(required = true)
    protected ApplicationLogin aplicacionInfo;
    @XmlElement(required = true)
    protected CopiaInfo copiaInfo;
    @XmlElement(required = true)
    protected ListaFirmaInfo firmaInfo;
    protected boolean simpleFormat;

    /**
     * Obtiene el valor de la propiedad aplicacionInfo.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLogin }
     *     
     */
    public ApplicationLogin getAplicacionInfo() {
        return aplicacionInfo;
    }

    /**
     * Define el valor de la propiedad aplicacionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLogin }
     *     
     */
    public void setAplicacionInfo(ApplicationLogin value) {
        this.aplicacionInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad copiaInfo.
     * 
     * @return
     *     possible object is
     *     {@link CopiaInfo }
     *     
     */
    public CopiaInfo getCopiaInfo() {
        return copiaInfo;
    }

    /**
     * Define el valor de la propiedad copiaInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CopiaInfo }
     *     
     */
    public void setCopiaInfo(CopiaInfo value) {
        this.copiaInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad firmaInfo.
     * 
     * @return
     *     possible object is
     *     {@link ListaFirmaInfo }
     *     
     */
    public ListaFirmaInfo getFirmaInfo() {
        return firmaInfo;
    }

    /**
     * Define el valor de la propiedad firmaInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaFirmaInfo }
     *     
     */
    public void setFirmaInfo(ListaFirmaInfo value) {
        this.firmaInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad simpleFormat.
     * 
     */
    public boolean isSimpleFormat() {
        return simpleFormat;
    }

    /**
     * Define el valor de la propiedad simpleFormat.
     * 
     */
    public void setSimpleFormat(boolean value) {
        this.simpleFormat = value;
    }

}
