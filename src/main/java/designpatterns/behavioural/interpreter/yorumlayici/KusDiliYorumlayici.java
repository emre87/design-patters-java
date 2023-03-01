package main.java.designpatterns.behavioural.interpreter.yorumlayici;

import main.java.designpatterns.behavioural.interpreter.dil.KusDili;


public class KusDiliYorumlayici implements Yorumlayici {

    @Override
    public String yorumla(String soz) {
        KusDili kusDili = new KusDili();
        String turkce = kusDili.turkceyeCevir(soz);

        return turkce;
    }
}
