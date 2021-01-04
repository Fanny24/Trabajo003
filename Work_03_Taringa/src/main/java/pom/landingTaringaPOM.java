package pom;

import driver.driver;
import pages.landingTaringaPage;

public class landingTaringaPOM {
    driver controlador= null;


    public void testTitle(driver dr)throws InterruptedException{
        controlador =dr;

        landingTaringaPage ltp = new landingTaringaPage(controlador);
        ltp.runexample("Fanny_024","Angel2408");
    }

    public void testTitle02(driver dr)throws InterruptedException{
        controlador =dr;

        landingTaringaPage ltp = new landingTaringaPage(controlador);
        ltp.runexample02("Fanny_024","Angel2408","PRUEBA 033", "Cuentos relacionados con las costumbres\n" +
                "Son aquellos cuentos que se manifiestan en todo el proceso, pues se practican\n" +
                "hace mucho tiempo por la comunidad en su conjunto y en este caso crean\n" +
                "consciencia de que son obligatorias, aunque no haya ley que así lo disponga.\n" +
                "Estos cuentos si bien nacieron espontáneamente y no están escritos se pasan\n" +
                "de generación en generación.\n" +
                "- Cuentos relacionados con los mitos\n" +
                "Son aquellos cuentos que se manifiestan como parte del sistema religioso de\n" +
                "una cultura, la cual los considera historias verdaderas. Su función es otorgar\n" +
                "unos respaldos narrativos a la creencia fundamentales de la comunidad, el mito\n" +
                "es una historia sagrada que narra un acontecimiento sucedió durante un tiempo,\n" +
                "en el cual el mundo no tenía aun su forma actual.\n" +
                "- Cuentos relacionados con las deidades\n" +
                "Son aquellos cuentos donde todos los seres animados e inanimados tienen vida\n" +
                "y conservan su medio de acuerdo a su contexto por lo tanto tienen sentimientos\n" +
                "así como los seres humanos además dentro de estos cuentos se origina la\n" +
                "mitología andina tomando en cuenta los lugares sagrados y encantados de la\n" +
                "naturaleza, donde participan activamente los fenómeno de la naturaleza (lluvia,\n" +
                "helada, granizo, tempestad).");
    }
}



