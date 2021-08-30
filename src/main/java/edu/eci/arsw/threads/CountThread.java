/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
	private int numeroInicial, numeroFinal;
	
	public CountThread(int numA, int numB){
		numeroInicial = numA;
		numeroFinal = numB;
	}
	
	
	public void run(){  
		for(int i=numeroInicial; i<=numeroFinal; i++){
			System.out.println(i);
		}
	} 
    
}
