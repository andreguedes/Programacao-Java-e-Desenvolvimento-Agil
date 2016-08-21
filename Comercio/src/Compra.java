
public class Compra {

	int valorTotal;
	int numeroDeParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroDeParcelas = 1;
	}
	
	// parcelado
	public Compra(int numParcelas, int valorParcela) {
		numeroDeParcelas = numParcelas;
		valorTotal = valorParcela * numParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal / numeroDeParcelas;
	}
}