package service;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import entity.Usuario;
import persistence.UsuarioDao;


@Path("/usuario")
public class ServiceUsuario {

	public String listar() {
		try {

			return new Gson().toJson(new UsuarioDao().findAll());

		} catch (Exception ex) {
			return "Dados Invalidos";
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)

	public String gravar(String usuario) {

		Usuario usu = new Gson().fromJson(usuario, Usuario.class);
		try {

			if (usu.getNome().equalsIgnoreCase("belem")) {
				throw new Exception("Nome Invalido");
			}
			new UsuarioDao().create(usu);
			return new Gson().toJson(usu);
		} catch (Exception ex) {
			String error = "{'msg':'" + ex.getMessage() + "'}";
			return new Gson().toJson(error);
		}

	}

}
