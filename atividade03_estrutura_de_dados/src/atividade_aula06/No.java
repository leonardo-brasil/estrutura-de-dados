package atividade_aula06;

public class No<T> {
	
	private T elemento;
	private No<T> proximo;
	
	public No() {}
	
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
}
