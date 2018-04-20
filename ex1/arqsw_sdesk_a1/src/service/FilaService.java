package service;

import java.io.IOException;
import java.util.ArrayList;

import dao.FilaDAO;
import entity.Fila;

/**
 * 
 * @author Accel Gustavo Araújo Rocha - RA:81616654 - SIN3AN-MCA
 *
 */
public class FilaService {
	private FilaDAO dao;
	
	public FilaService() {
		dao = new FilaDAO();
	}
	
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}

}
