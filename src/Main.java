import beans.*;
import controllers.*;

public class Main {

	public static void main(String[] args) {
		Usuario janilton = new Usuario();
		DAOUsuario u1 = new DAOUsuario();
		
		janilton.setEmail("janilton.do.grau@gmail.com");
		janilton.setSenha("janiltonado");
		janilton.setSerie(1);
		
		
		u1.criarUsuario(janilton);
		
		
	}

}
