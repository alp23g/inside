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
 * <p>Clase Java para TipoDocumentoEniFileInside complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumentoEniFileInside">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentoEniBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumentoEniFileInside", namespace = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/documento-e/documentoEniFile", propOrder = {
    "documentoEniBytes"
})
public class TipoDocumentoEniFileInside {

    @XmlElement(required = true)
    protected byte[] documentoEniBytes;

    /**
     * Obtiene el valor de la propiedad documentoEniBytes.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumentoEniBytes() {
        return documentoEniBytes;
    }

    /**
     * Define el valor de la propiedad documentoEniBytes.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumentoEniBytes(byte[] value) {
        this.documentoEniBytes = value;
    }

}
