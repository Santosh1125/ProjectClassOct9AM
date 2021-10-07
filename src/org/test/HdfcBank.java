package org.test;

public class HdfcBank implements RbiBank,WorldBank {

	@Override
	public void savings() {
		System.out.println("5%");}

	@Override
	public void fixed() {
		System.out.println("6%");}

	@Override
	public void deposit() {
		System.out.println("7%");}
	
	public static void main(String[] args) {
		HdfcBank h = new HdfcBank();
		h.deposit();
		h.fixed();
		h.savings();
	}
}