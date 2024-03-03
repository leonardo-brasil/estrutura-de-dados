package atividade_aula05.fila;

public class No<T> {
	
	private T elemento;
	private No<T> proximo;
	
	public No() {
		this.elemento = null;
		this.proximo = null;
	}
	
	public T getElemento() {
		return this.elemento;
	}
	
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	
	public No<T> getProximo() {
		return this.proximo;
	}
	
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
}
