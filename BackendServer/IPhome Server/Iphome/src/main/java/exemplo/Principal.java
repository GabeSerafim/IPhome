package exemplo;

import java.util.ArrayList;
import java.util.List;

import exemplo.model.Comentario;
import exemplo.model.Ingrediente;
import exemplo.model.Receita;
import exemplo.model.Usuario;
import exemplo.model.UsuarioComida;
import exemplo.repository.ComentarioDAO;
import exemplo.repository.IngredienteDAO;
import exemplo.repository.ReceitaDAO;
import exemplo.repository.UsuarioDAO;
import exemplo.repository.UsuarioIngredienteDAO;
import exemplo.repository.UsuarioReceitaDAO;

public class Principal {
	public static void main(String[] args) {
	
	Usuario usuario = new Usuario();
//	usuario.setEmail("lula@gmail.cndm");
//	usuario.setNomeUsuario("lula");
//	usuario.setSenha("senhnad1");
//	usuario.setFotoUsuario("aaadnafaaaaaaaaaaaaaa");
	
	UsuarioDAO uDAO = new UsuarioDAO();
//	uDAO.cadastrar(usuario);
	
		
		
		

		
	Comentario comentario= new Comentario();
//	comentario.setTexto("jsdskjdksdjnafndaajsdkssjkajsdk");
//	comentario.setNota(4);
//	comentario.setData("23/10/2018");
	Receita receita = new Receita();
//	ReceitaDAO rDAO = new ReceitaDAO();
//	System.out.println(rDAO.buscarPorId(1).toString());

//	comentario.setIdReceita(3);
//	comentario.setUsuario(uDAO.buscarPorId(10));
	ComentarioDAO cDAO = new ComentarioDAO();
//	cDAO.cadastrar(comentario);
	
//	List<Comentario> comentarios = cDAO.buscarTodosPorIdReceita(2);
//	for(int i=0;i<comentarios.size();i++){
//		System.out.println(comentarios.get(i).getTexto());
//	}
//	
	
	
	
	
	
	
	/*List<Receita> receitas = rDAO.buscarTodos();
	for(int i=0;i<receitas.size();i++){
		System.out.println(receitas.get(i).getNomeReceita());
	}*/
	
	
	
	
	
	
	
	Ingrediente ingrediente = new Ingrediente();
//	IngredienteDAO iDAO = new IngredienteDAO();
//	
//	List<Ingrediente> ingredientes = iDAO.buscarTodosPorCategoria("frutas");
//	for(int i=0;i<ingredientes.size();i++){
//		System.out.print(ingredientes.get(i).getCategoria()+" ");
//		System.out.println(ingredientes.get(i).getNome());
//	}
//	iDAO.buscarTodos();
//	System.out.println(iDAO.buscarPorId(3).toString());
//	System.out.println(iDAO.buscarPorNomeECategoria("morango", "frutas").getNomeIngrediente());
//	}
	
	
	
	
	
	
	
	
	
	
	
//	UsuarioComida usuarioComida = new UsuarioComida();
	UsuarioReceitaDAO urDAO = new UsuarioReceitaDAO();
//	List<UsuarioComida> listaReceitasFav = urDAO.buscarTodosFavPorUsuario(3);
//	for(int i=0;i<listaReceitasFav.size();i++){
//		System.out.println(listaReceitasFav.get(i).getIdComida());
//	}
//	
//	urDAO.excluir(1);
	
//	urDAO.cadastrar(rDAO.buscarPorId(4),uDAO.buscarPorId(3),usuarioComida);
	

	
	
	
	
	
	
	
	
	
	UsuarioComida usuarioComida = new UsuarioComida();
	UsuarioIngredienteDAO uiDAO = new UsuarioIngredienteDAO();
//	List<UsuarioComida> listaIngredientesFav = uiDAO.buscarTodosFavPorUsuario(1);
//	for(int i=0;i<listaIngredientesFav.size();i++){
//		System.out.println(listaIngredientesFav.get(i).getIdComida());
//	}
	
//	uiDAO.excluir(4);
	
//	uiDAO.cadastrar(iDAO.buscarPorId(15),uDAO.buscarPorId(1),usuarioComida);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//---------------------------------------------------------------O MÉTODO------------------------------------------------------------------------
//	 List<Receita> receitas = new ArrayList<Receita>();
//	 ArrayList<Long> ingredientes = new ArrayList<Long>();
//	 IngredienteDAO iDAO = new IngredienteDAO();
//	 ReceitaDAO rDAO = new ReceitaDAO();
//	 ingredientes.add(iDAO.buscarPorId(57).getId());
//	 ingredientes.add(iDAO.buscarPorId(32).getId());
//	 receitas = rDAO.buscarTodosPorIdIngrediente(ingredientes);
//	 for(int i=0;i<receitas.size();i++) {
//	  System.out.println(receitas.get(i).getNome());
//	 }
	

}
}

