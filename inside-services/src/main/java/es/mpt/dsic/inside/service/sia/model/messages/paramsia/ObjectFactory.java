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


package es.mpt.dsic.inside.service.sia.model.messages.paramsia;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.map.sgca.consultar.messages.paramsia package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.map.sgca.consultar.messages.paramsia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParamSIA }
     * 
     */
    public ParamSIA createParamSIA() {
        return new ParamSIA();
    }

    /**
     * Create an instance of {@link ParamSIA.Filtro }
     * 
     */
    public ParamSIA.Filtro createParamSIAFiltro() {
        return new ParamSIA.Filtro();
    }

    /**
     * Create an instance of {@link ParamSIA.Filtro.FechasModificacion }
     * 
     */
    public ParamSIA.Filtro.FechasModificacion createParamSIAFiltroFechasModificacion() {
        return new ParamSIA.Filtro.FechasModificacion();
    }

    /**
     * Create an instance of {@link ParamSIA.Filtro.Organismo }
     * 
     */
    public ParamSIA.Filtro.Organismo createParamSIAFiltroOrganismo() {
        return new ParamSIA.Filtro.Organismo();
    }

}
