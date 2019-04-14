//2. Напишите программу, которая примет на вход два текстовых файла, 
//а вернет один. Содержимым этого файла должны быть слова, которые одновременно есть и в первом и
//во втором файле.

package com.yandex.kbelyako;

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		try (PrintWriter a = new PrintWriter("test1.txt")) {

			a.println("White table");
			a.println("Black Rabbit");
			a.println("Green Lamp");
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

		try (PrintWriter a = new PrintWriter("test2.txt")) {

			a.println("Hello Space");
			a.println("White phone");
			a.println("Brown Rabbit");
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}

		File test1 = new File("test1.txt");
		File test2 = new File("test2.txt");

		FileOperation.twoFilesToOne(test1, test2);

	}
}
