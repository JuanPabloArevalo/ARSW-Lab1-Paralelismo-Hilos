/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import java.io.IOException;


/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) {
    	
    	try {
    		//1 Solo hilo
			System.out.println(bytesToHex(PiDigits.getDigits(1, 100000, 1)));
			//Tantos hilos como nucleos
//			int nucleos = Runtime.getRuntime().availableProcessors();
//			System.out.println(bytesToHex(PiDigits.getDigits(1, 100000, nucleos)));
			//El doble de nucleos
//			System.out.println(bytesToHex(PiDigits.getDigits(1, 100000, (nucleos*2))));
			//200 Hilos
//			System.out.println(bytesToHex(PiDigits.getDigits(1, 100000, 200)));
			//500 Hilos
//			System.out.println(bytesToHex(PiDigits.getDigits(1, 100000, 700)));
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<hexChars.length;i=i+2){
            //sb.append(hexChars[i]);
            sb.append(hexChars[i+1]);            
        }
        return sb.toString();
    }

}
