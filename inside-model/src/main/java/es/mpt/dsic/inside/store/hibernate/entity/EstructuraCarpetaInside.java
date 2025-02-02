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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * ExpedienteInsideIndice generated by hbm2java
 */
@Entity
@Table(name = "EstructuraCarpetaInside")
public class EstructuraCarpetaInside implements java.io.Serializable {

	private Integer id;
	private String identificadorEstructura;
	private UnidadOrganica unidad;
	private NumeroProcedimiento numeroProcedimiento;
	private ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada;

	public EstructuraCarpetaInside() {
	}

	public EstructuraCarpetaInside(String identificadorEstructura, UnidadOrganica unidad,
			ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada) {
		this.identificadorEstructura = identificadorEstructura;
		this.unidad = unidad;
		this.expedienteInsideIndiceCarpetaIndizada = expedienteInsideIndiceCarpetaIndizada;
	}

	@Id
	// @GeneratedValue(strategy = IDENTITY)
	@TableGenerator(name = "GeneradorPk_EstructuraCarpetaInside", table = "GeneradorClaves", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "GEN_EstructuraCarpetaInside", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_EstructuraCarpetaInside")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "identificador_estructura")
	public String getIdentificadorEstructura() {
		return identificadorEstructura;
	}

	public void setIdentificadorEstructura(String identificadorEstructura) {
		this.identificadorEstructura = identificadorEstructura;
	}

	@Column(name = "id_unidad")
	public UnidadOrganica getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadOrganica unidad) {
		this.unidad = unidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_carpeta_estructura")
	public ExpedienteInsideIndiceCarpetaIndizada getExpedienteInsideIndiceCarpetaIndizada() {
		return this.expedienteInsideIndiceCarpetaIndizada;
	}

	public void setExpedienteInsideIndiceCarpetaIndizada(
			ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada) {
		this.expedienteInsideIndiceCarpetaIndizada = expedienteInsideIndiceCarpetaIndizada;
	}

	@Column(name = "id_procedimiento")
	public NumeroProcedimiento getNumeroProcedimiento() {
		return numeroProcedimiento;
	}

	public void setNumeroProcedimiento(NumeroProcedimiento numeroProcedimiento) {
		this.numeroProcedimiento = numeroProcedimiento;
	}
}
