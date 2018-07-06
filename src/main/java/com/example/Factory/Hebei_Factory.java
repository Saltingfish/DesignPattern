package com.example.Factory;

/**
 * Created  by kzp on 2018/7/6
 */
public class Hebei_Factory  implements abstract_Factory{


    @Override
    public Food creatBread() {
        return new Hebei_bread();
    }

    @Override
    public Food creatChicken() {
        return new Hebei_chicken();
    }
}
