package entity;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long idUsuario;
	private String userName;
	private String senha;
	private String nome;
	
	public Usuario() {
		super();
	}

	public Usuario(Long idUsuario, String userName, String senha, String nome) {
		super();
		this.idUsuario = idUsuario;
		this.userName = userName;
		this.senha = senha;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", userName=" + userName + ", senha=" + senha + ", nome=" + nome
				+ "]";
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
