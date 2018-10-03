package controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import beans.Usuario;
import beans.ConexaoBD;                  

public class DAOUsuario {
	
	private ConexaoBD conexao;

	public DAOUsuario() {
		// cria o objeto para conexão com banco, porém não o inicializa
		// a conexão deve ser aberta e, consequentemente, fechada durante o envio de
		// comandos ao banco
		this.conexao = new ConexaoBD();
	}
	
	public void criarUsuario(Usuario p) {
		// abrindo a conexão com o BD
		conexao.conectar();

		try {
			// usando um PreparedStatement com valores externos como parâmetros
			// (representados pelo '?')
			PreparedStatement pst = conexao.getConexao().prepareStatement(
					"INSERT INTO beans.usuario(email, senha, serie) VALUES(?,?,?,?,?,?);");
			// os métodos set devem ser escolhidos de acordo com os tipos dos atributos da
			// entidade que está
			// sendo acessada. A sequência é determinada por índices, iniciando do valor 1.

			
			pst.setString(1, p.getEmail());
			pst.setString(2, p.getSenha());
			pst.setInt(3, p.getSerie());
			

			// solicitação da execução da query, após seu preparo
			pst.execute();
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			// o banco deve ser desconectado, mesmo quando a exceção é lançada
			conexao.desconectar();
		}

	}

}
