
public class Principal {

	public static void main(String[] args) {

		PilhaSequencial pilha = new PilhaSequencial();
		System.out.println("A pilha est� vazia? : " + pilha.estaVazia());
		System.out.println("A pilha est� cheia? : " + pilha.estaCheia());
		pilha.push("Ana");
		pilha.push("Bruna");
		pilha.push("Carla");
		pilha.push("Daniel");
		pilha.exibirElementos();
		System.out.println("Total de elementos: " + pilha.quantidadeElementos());

		String elementoremovido = pilha.pop();
		System.out.println("O elemento removido foi: " + elementoremovido);
		System.out.println("Elemento que est� no topo: " + pilha.top());

		pilha.exibirElementos();

		System.out.println("Total de elementos: " + pilha.quantidadeElementos());

	}
}
