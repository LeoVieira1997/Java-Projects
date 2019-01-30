package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
	    ITelephone leosPhone;
	    leosPhone = new DeskPhone(123456);
	    leosPhone.powerOn();
	    leosPhone.callPhone(123456);
	    leosPhone.answer();

	    leosPhone = new MobilePhone(24565);
	    leosPhone.powerOn();
	    leosPhone.callPhone(24565);
	    leosPhone.answer();
    }
}
