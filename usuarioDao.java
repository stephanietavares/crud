package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Usuario;

public class UsuarioDao extends Dao {

	
	public void create (Usuario u) throws Exception {
		open();
		stmt = con.prepareStatement(
				"insert into usuario values (null,?,criptografia(?),?)"
				);
		
		stmt.setString(1, u.getUserName());
		stmt.setString(2,  u.getSenha());
		stmt.setString(3, u.getNome());
		stmt.execute();
		close();
	}
	
	public List <Usuario> findAll() throws Exception {
		open();
		stmt = con.prepareStatement("select * from usuario");
		
		List<Usuario> lista = new ArrayList <Usuario>();
		rs = stmt.executeQuery();
		while (rs.next()) {
			Usuario u = new Usuario ();
			u.setIdUsuario(rs.getLong(1));
			u.setUserName(rs.getString(2));
			u.setSenha(rs.getString(3));
			u.setNome(rs.getString(4));
		}
		close();
		return lista;
	}
	
public static void main (String[]args) {
	try {
		new UsuarioDao().create(new Usuario (null,
				"stephanietavares@yahoo.com","123","steph"));
		System.out.println("Dados gravados com sucesso");
	}
	catch (Exception ex) {
		ex.printStackTrace();
	}
	
	System.out.println("Continua");
}

}


