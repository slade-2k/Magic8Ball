package de.iks.hotischeck.magic8ball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Magic8Ball {

	public static void main(String args[]) throws IOException {
		Magic8Ball magic = new Magic8Ball();
		magic.askQuestion();
	}
	
	public void askQuestion() throws IOException {
		System.out.println("What's your question?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		this.getRandomAnswer();
	}
	
	public void getRandomAnswer() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(4);

		switch(randomNumber) {
		case 0:
			System.out.println("Yes.");
			break;
		case 1:
			System.out.println("No.");
			break;
		case 2:
			System.out.println("Maybe.");
			break;
		case 3:
			System.out.println("Ask again later.");
			break;
		};
	}

}
