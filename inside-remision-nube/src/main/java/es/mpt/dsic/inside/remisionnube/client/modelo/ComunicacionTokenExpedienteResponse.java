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


package es.mpt.dsic.inside.remisionnube.client.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comunicacionTokenExpedienteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comunicacionTokenExpedienteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaComunicacionTokenExpedienteType" type="{https://ssweb.seap.minhap.es/Inside/XSD/v1.0/remisionNube}RespuestaComunicacionTokenExpedienteType" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comunicacionTokenExpedienteResponse", namespace = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService", propOrder = {
    "respuestaComunicacionTokenExpedienteType"
})
public class ComunicacionTokenExpedienteResponse {

    @XmlElement(name = "RespuestaComunicacionTokenExpedienteType")
    protected RespuestaComunicacionTokenExpedienteType respuestaComunicacionTokenExpedienteType;

    /**
     * Obtiene el valor de la propiedad respuestaComunicacionTokenExpedienteType.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaComunicacionTokenExpedienteType }
     *     
     */
    public RespuestaComunicacionTokenExpedienteType getRespuestaComunicacionTokenExpedienteType() {
        return respuestaComunicacionTokenExpedienteType;
    }

    /**
     * Define el valor de la propiedad respuestaComunicacionTokenExpedienteType.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaComunicacionTokenExpedienteType }
     *     
     */
    public void setRespuestaComunicacionTokenExpedienteType(RespuestaComunicacionTokenExpedienteType value) {
        this.respuestaComunicacionTokenExpedienteType = value;
    }

}
