package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Pres2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(new File("config.txt"));
		
		String daoClassName=scanner.nextLine();
		Class<?> cDao=Class.forName(daoClassName);
		IDao dao=(IDao)cDao.getDeclaredConstructor().newInstance();
		
		String metierClassName=scanner.nextLine();
		Class<?> cMetier=Class.forName(metierClassName);
		IMetier metier=(IMetier)cMetier.getDeclaredConstructor(IDao.class).newInstance(dao);
		System.out.println("res=>"+metier.calcul());
		
		
	}

}
