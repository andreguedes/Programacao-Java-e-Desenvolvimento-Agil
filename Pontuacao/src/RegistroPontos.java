
public class RegistroPontos {
	
	private CalculadoraBonus calculadoraBonus;
	
	public RegistroPontos(CalculadoraBonus calculadoraBonus) {
		this.calculadoraBonus = calculadoraBonus;
	}

	public void fazerUmComentario(Usuario usuario) {
		usuario.pontos += 3 * calculadoraBonus.bonusDoUsuario(usuario);
	}
	
	public void criarUmTopico(Usuario usuario) {
		usuario.pontos += 5 * calculadoraBonus.bonusDoUsuario(usuario);
	}
	
	public void darUmLike(Usuario usuario) {
		usuario.pontos += 1 * calculadoraBonus.bonusDoUsuario(usuario);
	}
	
}