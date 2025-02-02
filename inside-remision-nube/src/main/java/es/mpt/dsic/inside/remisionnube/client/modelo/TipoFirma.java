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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoFirma.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoFirma">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TF01"/>
 *     &lt;enumeration value="TF02"/>
 *     &lt;enumeration value="TF03"/>
 *     &lt;enumeration value="TF04"/>
 *     &lt;enumeration value="TF05"/>
 *     &lt;enumeration value="TF06"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoFirma", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
@XmlEnum
public enum TipoFirma {

    @XmlEnumValue("TF01")
    TF_01("TF01"),
    @XmlEnumValue("TF02")
    TF_02("TF02"),
    @XmlEnumValue("TF03")
    TF_03("TF03"),
    @XmlEnumValue("TF04")
    TF_04("TF04"),
    @XmlEnumValue("TF05")
    TF_05("TF05"),
    @XmlEnumValue("TF06")
    TF_06("TF06");
    private final String value;

    TipoFirma(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoFirma fromValue(String v) {
        for (TipoFirma c: TipoFirma.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
