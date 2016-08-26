
public class CalculadoraBonus {

	public int bonusDoDia = 1;
	
	public int bonusDoUsuario(Usuario usuario) {
		int multiplicador = bonusDoDia;
		if (usuario.vip)
			multiplicador *= 5;
		return multiplicador;
	}

	
}
