
public class PilhaSequencial {

	String elementos[] = new String[100];
	int topo = -1;

	public boolean estaVazia() {
		return (topo == -1);
	}

	public boolean estaCheia() {
		return (topo == elementos.length - 1);
	}

	public int quantidadeElementos() {
		return (topo + 1);
	}

	public String top() {
		if (estaVazia()) {
			return null;
		} else {
			return elementos[topo];
		}
	}

	public void push(String valor) {
		if (estaCheia()) {
			System.out.println("A pilha já está cheia!");
			return;
		} else {
			topo++;
			elementos[topo] = valor;
		}
	}
	
	public String pop() {
		if (estaVazia()) {
			System.out.println("A pilha já está vazia!");
			return null;
		} else {
			String valor = elementos[topo];
			elementos[topo] = null;
			topo--;
			return valor;
		}
	}
	
	public void exibirElementos() {
		System.out.println("\n Elementos da pilha: ");
		for(int i = 0; i <= topo; i++) {
			System.out.println(i + 1 + "º elemento: " + elementos[i]);
		}
	}

}
