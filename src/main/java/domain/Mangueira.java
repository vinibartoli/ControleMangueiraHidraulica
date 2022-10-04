package domain;

import java.util.Date;
import java.util.Objects;

public class Mangueira {
	
	private Integer id;
	private String mangueira;
	private String marcaMangueira;
	private String terminal;
	private String capa;
	private String niple;
	private Date DataSaida;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMangueira() {
		return mangueira;
	}
	public void setMangueira(String mangueira) {
		this.mangueira = mangueira;
	}
	public String getMarcaMangueira() {
		return marcaMangueira;
	}
	public void setMarcaMangueira(String marcaMangueira) {
		this.marcaMangueira = marcaMangueira;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public String getNiple() {
		return niple;
	}
	public void setNiple(String niple) {
		this.niple = niple;
	}
	public Date getDataSaida() {
		return DataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		DataSaida = dataSaida;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mangueira other = (Mangueira) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Mangueira [id=" + id + ", mangueira=" + mangueira + ", marcaMangueira=" + marcaMangueira + ", terminal="
				+ terminal + ", capa=" + capa + ", niple=" + niple + ", DataSaida=" + DataSaida + "]";
	}
	public Mangueira(Integer id, String mangueira, String marcaMangueira, String terminal, String capa, String niple,
			Date dataSaida) {
		super();
		this.id = id;
		this.mangueira = mangueira;
		this.marcaMangueira = marcaMangueira;
		this.terminal = terminal;
		this.capa = capa;
		this.niple = niple;
		DataSaida = dataSaida;
	}
	public Mangueira() {
		super();
	}
	

	
}
