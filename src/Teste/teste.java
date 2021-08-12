package Teste;

import Buffer.Buffer;
import Multithread.Consumidor;
import Multithread.Produtor;

public class teste {
	public static void main(String[] args) {
	    Buffer buffer = new Buffer();
	    Produtor produtor1 = new Produtor(1, buffer, 2);
	    Produtor produtor2 = new Produtor(2, buffer, 2);
	    Consumidor consumidor1 = new Consumidor(1, buffer, 2);
	    Consumidor consumidor2 = new Consumidor(2, buffer, 2);
	 
	    produtor1.start();
	    consumidor1.start();
	    produtor2.start();
	    consumidor2.start();
	}
}
