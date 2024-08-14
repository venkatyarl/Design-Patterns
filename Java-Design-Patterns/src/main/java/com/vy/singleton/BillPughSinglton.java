package com.vy.singleton;

public class BillPughSinglton {

    private BillPughSinglton() {}

    private static class BillPughSingltonHolder {
        private static final BillPughSinglton INSTANCE = new BillPughSinglton();
    }

    public static BillPughSinglton getInstance() {
        return BillPughSingltonHolder.INSTANCE;
    }
}
