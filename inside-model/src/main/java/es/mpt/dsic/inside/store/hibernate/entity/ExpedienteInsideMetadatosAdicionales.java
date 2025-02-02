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

package es.mpt.dsic.inside.store.hibernate.entity;

// Generated 28-ago-2012 18:17:29 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ExpedienteInsideMetadatosAdicionales generated by hbm2java
 */
@Entity
//@Table(name = "ExpedienteInsideMetadatosAdicionales", catalog = "insidews")
@Table(name = "ExpedienteInsideMetAdic")
public class ExpedienteInsideMetadatosAdicionales implements
		java.io.Serializable {

	private Integer id;
	private ExpedienteInside expedienteInside;
	private String nombre;
	private String valor;

	public ExpedienteInsideMetadatosAdicionales() {
	}

	public ExpedienteInsideMetadatosAdicionales(
			ExpedienteInside expedienteInside, String nombre, String valor) {
		this.expedienteInside = expedienteInside;
		this.nombre = nombre;
		this.valor = valor;
	}

	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@TableGenerator(name = "GeneradorPk_ExpedienteInsideMetAdic",
    		table = "GeneradorClaves",
    		pkColumnName = "GenName",
    		valueColumnName = "GenValue",
    		pkColumnValue = "GEN_ExpedienteInsideMetAdic",
    		allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_ExpedienteInsideMetAdic")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_expediente")
	public ExpedienteInside getExpedienteInside() {
		return this.expedienteInside;
	}

	public void setExpedienteInside(ExpedienteInside expedienteInside) {
		this.expedienteInside = expedienteInside;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "valor")
	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString () {
		StringBuffer sb = new StringBuffer ("Entity ExpedienteInsideMetadatosAdicionales=[");
		String coma = ", ";
		
		sb.append("id=" + id + coma);
		sb.append("nombre=" + nombre + coma);
		sb.append("valor=" + valor + coma);
		
		sb.append("]");
		return sb.toString();
	}

}
