package br.com.fiap.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Consumo;
import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Hospedagem;
import br.com.fiap.bean.Produto_Servico;
import br.com.fiap.bo.ConsumoBO;
import br.com.fiap.bo.FuncionarioBO;
import br.com.fiap.bo.HospedagemBO;
import br.com.fiap.bo.Produto_ServicoBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

/**
 * Classe de testes para o ConsumoBO.
 * 
 * @author Raphael de Melo Silva
 * @author Ricardo Antonelli
 *  
 */

public class TesteConsumoBO {

	/**
	 * Método registrar.
	 * 
	 * @param Connection con
	 * @throws Excecao
	 * @throws SQLException
	 */
	
	static void registrar(Connection con) throws Excecao, SQLException {
		Consumo consumo = new Consumo();
		con.setAutoCommit(false);
		int quant = 1;
		int codigoFunc = 7;
		long cpfCliente = 45658795818L;
		String descricaoProd_Serv = "Jantar";
		consumo.setQuantidade(quant);
		Funcionario funcionario = new Funcionario();
		funcionario = FuncionarioBO.pesquisarFuncionario(con, codigoFunc);
		consumo.setFuncionario(funcionario);
		Hospedagem hosp = new Hospedagem();
		hosp.setCodigo(HospedagemBO.pesquisarCodHospedagem(con, cpfCliente));
		consumo.setHospedagem(hosp);
		Produto_Servico prod_serv = new Produto_Servico();
		prod_serv = Produto_ServicoBO.pesquisarProd_Serv(con,
				descricaoProd_Serv.toUpperCase());
		consumo.setProduto_Servico(prod_serv);
		System.out.println(ConsumoBO.registrar(con, consumo));
		con.setAutoCommit(true);
		con.commit();
	}

	/**
	 * Método listar
	 * 
	 * @param Connection con
	 * @throws Excecao
	 * @throws SQLException
	 *
	 */
	
	public static void listar(Connection con) throws Excecao, SQLException {
		try {
			con.setAutoCommit(false);
			long cpfCliente = 45658795818L;
			Hospedagem hosp = new Hospedagem();
			hosp.setCodigo(HospedagemBO.pesquisarCodHospedagem(con, cpfCliente));
			List<Consumo> listaConsumo = ConsumoBO.listarConsumo(con,
					hosp.getCodigo());
			System.out.print("Código de consumo: \t");
			System.out.print("Código da hospedagem: \t");
			System.out.print("Código do funcionario: \t");
			System.out.print("Quantidade consumida: \t");
			System.out.print("Produto-Serviço: \t");
			System.out.print("Data de consumo: \t");
			System.out.print("Funcionário :");
			System.out.println();
			for (Consumo c : listaConsumo) {
				System.out.print(c.getCodigo() + "\t\t\t");
				System.out.print(c.getHospedagem().getCodigo() + "\t\t\t");
				System.out.print(c.getFuncionario().getCodigo() + "\t\t\t");
				System.out.print(c.getQuantidade() + "\t\t\t");
				System.out.print(c.getProduto_Servico().getDescricao()
						+ "\t\t\t");
				System.out.print(c.getDt_Consumo().getTime() + "\t\t\t");
				System.out.print(c.getFuncionario().getNome());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método excluir
	 * 
	 * @param Connection con
	 * @param int cod_Consumo
	 * @return String mensagem
	 * @throws Excecao
	 * @throws SQLException
	 *
	 */
	
	static String excluir(Connection con, int cod_Consumo) throws SQLException, Excecao{
		String mensagem = ConsumoBO.excluirConsumo(con, cod_Consumo);
		return mensagem;
	}
	
	/**
	 * Método atualizar
	 * 
	 * @param Connection con
	 * @param int cod_Consumo
	 * @return String mensagem
	 * @throws Excecao
	 * @throws SQLException
	 *
	 */
	
	static String atualizar(Connection con, int codigoConsumo) throws SQLException, Excecao{
		Consumo consumo = new Consumo();
		con.setAutoCommit(false);
		int quant = 1;
		int codigoFunc = 7;
		long cpfCliente = 45658795818L;
		String descricaoProd_Serv = "Jantar";
		consumo.setQuantidade(quant);
		Funcionario funcionario = new Funcionario();
		funcionario = FuncionarioBO.pesquisarFuncionario(con, codigoFunc);
		consumo.setFuncionario(funcionario);
		Hospedagem hosp = new Hospedagem();
		hosp.setCodigo(HospedagemBO.pesquisarCodHospedagem(con, cpfCliente));
		consumo.setHospedagem(hosp);
		Produto_Servico prod_serv = new Produto_Servico();
		prod_serv = Produto_ServicoBO.pesquisarProd_Serv(con,
				descricaoProd_Serv.toUpperCase());
		consumo.setProduto_Servico(prod_serv);
		String mensagem = ConsumoBO.atualizarConsumo(con, codigoConsumo, consumo);
		con.setAutoCommit(true);
		con.commit();
		return mensagem;
	}

	/**
	 * Método main.
	 *
	 * @param String[] args
	 * 
	 */
	
	public static void main(String[] args) throws Exception {
		String usuario = "OPS$RM75321";
		String senha = "050897";
		Connection con = null;
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			listar(con);
			int codigoConsumo = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o codigo do consumo"));
			excluir(con, codigoConsumo);
			// atualizar(con, codigoConsumo);
			listar(con);
		} catch (Excecao e) {
			throw new Excecao("Falha", e);
		}

	}

}
