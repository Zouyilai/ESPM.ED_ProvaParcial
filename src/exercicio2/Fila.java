package exercicio2;

public class Fila {

	No inicio, fim;
	
	// método para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// método para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		if(inicio == null){//não tem elemento
			System.out.println("Erro!");
		} else if(inicio == fim){ //unicio elemento
			inicio = null;
			fim = null;
		} else {//2 ou mais elementos
			No aux = inicio;
			aux.dir.esq = null;
			inicio = aux.dir;
			aux.dir = null;
		}
	}
	
	// método para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No aux = inicio;
		while(aux != null) {
			System.out.println("Nome: " + aux.motorista.getNome() + ", Placa: " + aux.motorista.getPlaca());
			aux = aux.dir;
		}
	}
}
