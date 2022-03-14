package br.edu.insper.desagil.aula7.tikstik;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private Produto produto;
	private Map<String, Integer> avaliacoes;

	public Video(Produto produto) {
		this.avaliacoes = new HashMap<>();
	}

	public Produto getProduto() {
		return produto;
	}

	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		avaliacoes.put(usuario.getNome(), avaliacao);
	}

	public int mediaAvaliacoes() {
		if (avaliacoes.isEmpty()) {
			return 0;
		}
		double s = 0;
		for (int avaliacao : avaliacoes.values()) {
			s += avaliacao;
		}
		return (int) Math.round(s / avaliacoes.size());
	}
}
