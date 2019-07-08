package br.com.Kelvim.radioFm;

import br.com.Kelvim.interfaceFormatter.InterfaceFormatter;

public class RadioFm extends RadioFmDisplay implements RadioFmFormater{
    	    
	private String estacao;
	
	public String getEstacao() {
		return estacao;
	}

	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}

	@Override
	public void formatter(Object estacao) {
		System.out.println("Radio FM\nEstação:"+this.getEstacao());
	    System.out.println();		
	}

	

	}

		
		
	
	


