package test;

import java.io.IOException;
import java.util.ArrayList;

import entity.Fila;
import service.FilaService;

/**
 * 
 * @author Accel Gustavo Araújo Rocha - RA:81616654 - SIN3AN-MCA
 *
 */
public class TestFila {

	public static void main(String[] args) {
		FilaService service = new FilaService();
		try {
			ArrayList<Fila> filas = service.listarFilas();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
