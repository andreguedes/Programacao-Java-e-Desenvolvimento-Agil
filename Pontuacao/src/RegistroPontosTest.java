import static org.junit.Assert.*;

import org.junit.Test;


public class RegistroPontosTest {

	@Test
	public void pontosCriarTopico() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guedes";

		CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
	
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(usuario.pontos, 5);
	}
	
	@Test
	public void pontosCriarTopicoVip() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guedes";
		usuario.vip = true;

		CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
	
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(usuario.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guedes";

		CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
		calculadoraBonus.bonusDoDia = 3;
	
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(usuario.pontos, 15);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDiaVip() {
		Usuario usuario = new Usuario();
		usuario.nome = "Guedes";
		usuario.vip = true;

		CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
		calculadoraBonus.bonusDoDia = 2;
	
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);
		
		assertEquals(usuario.pontos, 50);
	}

}