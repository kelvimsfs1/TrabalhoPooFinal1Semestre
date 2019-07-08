package br.com.Kelvim.radioFm;

import br.com.Kelvim.interfaceFormatter.InterfaceFormatter;

public interface RadioFmFormater<RadioFmDisplay> extends InterfaceFormatter{
	
	public abstract void formatter (RadioFmDisplay s);
	
}