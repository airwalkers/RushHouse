package la.airwalkers.service;

import la.airwalkers.base.BaseRusher;

/**
 * Created by liupf on 2017/5/13.
 */
public class TestRusher extends BaseRusher {

    public TestRusher(String baseUrl) {
        super(baseUrl);
    }

    public static void main(String[] args) {
        TestRusher rusher = new TestRusher("https://baidu.com");
        rusher.open();

    }
}
