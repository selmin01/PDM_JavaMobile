
package data;

import java.io.Serializable;

public class Pergunta implements Serializable{
	
	private int id_pergunta;
	private int nivel;
	private String pergunta;
	private String alternativa_A;
	private String alternativa_B;
	private String alternativa_C;
	private String alternativa_D;
	private String respostaCerta;
	private int pontuacao;
	
	public int getId_pergunta() {
		return id_pergunta;
	}
	public void setId_pergunta(int id_pergunta) {
		this.id_pergunta = id_pergunta;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getAlternativa_A() {
		return alternativa_A;
	}
	public void setAlternativa_A(String alternativa_A) {
		this.alternativa_A = alternativa_A;
	}
	public String getAlternativa_B() {
		return alternativa_B;
	}
	public void setAlternativa_B(String alternativa_B) {
		this.alternativa_B = alternativa_B;
	}
	public String getAlternativa_C() {
		return alternativa_C;
	}
	public void setAlternativa_C(String alternativa_C) {
		this.alternativa_C = alternativa_C;
	}
	public String getAlternativa_D() {
		return alternativa_D;
	}
	public void setAlternativa_D(String alternativa_D) {
		this.alternativa_D = alternativa_D;
	}
	public String getRespostaCerta() {
		return respostaCerta;
	}
	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
	public int getPontuancao() {
		return pontuacao;
	}
	public void setPontuancao(int pontuancao) {
		this.pontuacao = pontuancao;
	}
	@Override
	public String toString() {
		return "Pergunta [id_pergunta=" + id_pergunta + ", nivel=" + nivel + ", pergunta=" + pergunta + ", alternativa_A="
				+ alternativa_A + ", alternativa_B=" + alternativa_B + ", alternativa_C=" + alternativa_C
				+ ", alternativa_D=" + alternativa_D + ", respostaCerta=" + respostaCerta + ", pontuancao=" + pontuacao
				+ "]";
	}

}
