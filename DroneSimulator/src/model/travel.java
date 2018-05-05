package model;

import java.util.HashMap;

import controller.Constants;

import java.util.ArrayList;

public class travel {
	public int Destino;
	public int Origen;
	
	
	
	public travel( int origen, int destino) {
		
		if(origen!=destino) {
			this.Origen=origen;
			this.Destino=destino;
		}
		else {
			if(destino+1 == Constants.STATIONS_NUMBER) {
				this.Origen=origen;
				this.Destino=destino-1;
			}
			else {
					this.Origen=origen;
					this.Destino=destino+1;
			}
			
		}
			
		
	}



	public int getDestino() {
		return Destino;
	}
	public void setDestino(int destino) {
		Destino = destino;
	}
	public int getOrigen() {
		return Origen;
	}
	public void setOrigen(int origen) {
		Origen = origen;
	}
	
	
	
	
}
