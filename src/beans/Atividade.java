package beans;
import java.sql.Timestamp;

public class Atividade {
	
	private String materia;
	private String categoria;
	private Timestamp prazo;
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Timestamp getPrazo() {
		return prazo;
	}
	public void setPrazo(Timestamp prazo) {
		this.prazo = prazo;
	}
};
