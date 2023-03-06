package com.rc.tech;

public class Amdocs_Exception_Que {
    public static void main(String[] args) throws InterruptedException {
        Amdocs_Exception_Que t = new Amdocs_Exception_Que();
        t = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("main end");
    }

    @Override
    protected void finalize() {
        System.out.println("Finalized called");
        System.out.println(10/0);
    }
}
