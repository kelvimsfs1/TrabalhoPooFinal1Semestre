package br.com.Kelvim.painel;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.Kelvim.calendario.Calendario;
import br.com.Kelvim.radioFm.RadioFm;
import br.com.Kelvim.radioRelogio.RadioRelogio;
import br.com.Kelvim.temperatura.Temperatura;

public class Painel {

	public static void main(String[] args) {

		RadioFm estacao = new RadioFm();
		estacao.setEstacao("FM 107.5 Mhz");

		Calendario data = new Calendario();
		data.getData();

		RadioRelogio hora = new RadioRelogio();
		hora.getHora();
		
		Temperatura temperatura = new Temperatura();
		temperatura.setTemperatura("35.5°C");

		estacao.formatter(estacao);
		hora.formatter(hora);
		data.formatter(data);
		temperatura.formatter(temperatura);
	}

}
