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

package es.mpt.dsic.eeutil.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import es.mpt.dsic.eeutil.client.model.InSideException;
import es.mpt.dsic.eeutil.client.model.ObjectFactory;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-08-23T12:44:27.243+02:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://service.ws.inside.dsic.mpt.es/", name = "EeUtilService")
@XmlSeeAlso({ObjectFactory.class})
public interface EeUtilService {

    
    @WebResult(name = "salidaVisualizar", targetNamespace = "")
    @RequestWrapper(localName = "visualizar", targetNamespace = "http://service.ws.inside.dsic.mpt.es/", className = "es.mpt.dsic.eeutil.client.model.Visualizar")
    @WebMethod(action = "urn:visualizar")
    @ResponseWrapper(localName = "visualizarResponse", targetNamespace = "http://service.ws.inside.dsic.mpt.es/", className = "es.mpt.dsic.eeutil.client.model.VisualizarResponse")
    public es.mpt.dsic.eeutil.client.model.SalidaVisualizacion visualizar(
        @WebParam(name = "aplicacionInfo", targetNamespace = "")
        es.mpt.dsic.eeutil.client.model.ApplicationLogin aplicacionInfo,
        @WebParam(name = "item", targetNamespace = "")
        es.mpt.dsic.eeutil.client.model.Item item,
        @WebParam(name = "opcionesVisualizacion", targetNamespace = "")
        es.mpt.dsic.eeutil.client.model.OpcionesVisualizacion opcionesVisualizacion
    ) throws InSideException;
    
    @WebResult(name = "salidaVisualizar", targetNamespace = "")
    @RequestWrapper(localName = "visualizarContenidoOriginal", targetNamespace = "http://service.ws.inside.dsic.mpt.es/", className = "es.mpt.dsic.eeutil.client.model.VisualizarContenidoOriginal")
    @WebMethod(action = "urn:visualizarContenidoOriginal")
    @ResponseWrapper(localName = "visualizarContenidoOriginalResponse", targetNamespace = "http://service.ws.inside.dsic.mpt.es/", className = "es.mpt.dsic.eeutil.client.model.VisualizarContenidoOriginalResponse")
    public es.mpt.dsic.eeutil.client.model.SalidaVisualizacion visualizarContenidoOriginal(
        @WebParam(name = "aplicacionInfo", targetNamespace = "")
        es.mpt.dsic.eeutil.client.model.ApplicationLogin aplicacionInfo,
        @WebParam(name = "item", targetNamespace = "")
        es.mpt.dsic.eeutil.client.model.Item item
    ) throws InSideException;
   
}
