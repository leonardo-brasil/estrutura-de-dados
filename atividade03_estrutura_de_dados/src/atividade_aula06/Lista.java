package atividade_aula06;

public class Lista<T> {

	private No<T> inicio;
	private No<T> fim;
	private int tamanho;

	public Lista() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

	public No<T> getFim() {
		return fim;
	}

	public void setFim(No<T> fim) {
		this.fim = fim;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void inserirNoInicio(T elemento) {

		if (elemento == null)
			return;
		No<T> noAux = new No<>();
		noAux.setElemento(elemento);
		if (this.inicio == null) {
			this.inicio = noAux;
			this.fim = noAux;
		} else {
			noAux.setProximo(this.inicio);
			this.inicio = noAux;
		}

		this.tamanho++;

	}

	public void inserirNoFim(T elemento) {

		if (elemento == null)
			return;
		No<T> noAux = new No<>();
		noAux.setElemento(elemento);
		if (this.inicio == null) {
			this.inicio = noAux;
			this.fim = noAux;
		} else {
			this.fim.setProximo(noAux);
			this.fim = noAux;
		}

		this.tamanho++;

	}

	public void inserirEm(int posicao, T elemento) {

		if (elemento == null)
			return;
		if (posicao < 1)
			return;
		if (posicao > this.tamanho)
			return;
		if(this.estaVazia()) {
			this.inserirNoInicio(elemento);
			return;
		}
		if (posicao == 1) {
			this.inserirNoInicio(elemento);
			return;
		}

		No<T> noAux = new No<>();
		noAux.setElemento(elemento);

		No<T> indice = this.inicio;
		for (int c = 1; c < (posicao - 1); c++) {
			indice = indice.getProximo();
		}

		noAux.setProximo(indice.getProximo());
		indice.setProximo(noAux);

		this.tamanho++;

	}

	public void removerNoInicio() {

		if (this.estaVazia())
			return;

		No<T> noAux = this.inicio;
		this.inicio = this.inicio.getProximo();
		noAux.setProximo(null);

		this.tamanho--;

	}

	public void removerNoFim() {

		if (this.estaVazia())
			return;

		No<T> indice = this.inicio;
		for (int c = 1; c < (this.tamanho - 1); c++) {
			indice = indice.getProximo();
		}

		this.fim = indice;
		this.fim.setProximo(null);
		this.tamanho--;
	}

	public void removerEm(int posicao) {

		if (posicao < 1)
			return;
		if (posicao > this.tamanho)
			return;
		if (posicao == 1) {
			this.removerNoInicio();
			return;
		}
		if (posicao == this.tamanho) {
			this.removerNoFim();
			return;
		}

		No<T> indice = this.inicio;
		for (int c = 1; c < (posicao - 1); c++) {
			indice = indice.getProximo();
		}

		No<T> noAux = indice.getProximo();

		indice.setProximo(noAux.getProximo());
		noAux.setProximo(null);

		this.tamanho--;

	}
	
	public void imprimir() {
		if(this.estaVazia()) return;
		this.imprimir(this.inicio);
	}
	
	private void imprimir(No<T> no) {
		
		System.out.println(no.getElemento());
		if(no.getProximo() != null) this.imprimir(no.getProximo());
		
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean estaVazia() {
		if (this.tamanho == 0)
			return true;

		return false;
	}
	
}
