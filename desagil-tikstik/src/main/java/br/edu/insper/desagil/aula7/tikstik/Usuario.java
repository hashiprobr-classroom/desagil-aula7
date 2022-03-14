package br.edu.insper.desagil.aula7.tikstik;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;

	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void adicionaVideo(Video video) {
		videos.add(video);
	}

	public double mediaAvaliacoes() {
		if (videos.isEmpty()) {
			return 0;
		}
		int s = 0;
		for (Video video : videos) {
			s += video.mediaAvaliacoes();
		}
		return (double) s / videos.size();
	}
}
