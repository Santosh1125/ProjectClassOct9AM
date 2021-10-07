package org.test;

public class SouthIndians extends Indians{

	@Override
	public void breakFast() {
		System.out.println("idly, Dosa, upma");}

	public static void main(String[] args) {
		SouthIndians s = new SouthIndians();
		s.breakFast();
		s.voterId();
		s.panCard();
		
	}

	}

