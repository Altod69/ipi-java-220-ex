package com.ipiecoles.java.java220;

import org.joda.time.*;

public class Entreprise {

    //SALAIRE_BASE de type Double et de valeur 1480.27
    //NB_CONGES_BASE de type Integer et de valeur 25
    //INDICE_MANAGER de type Double et de valeur 1.3
    //PRIME_MANAGER_PAR_TECHNICIEN de type Double et de valeur 250
    //PRIME_ANCIENNETE de type Double et de valeur 100

    public static final Double SALAIRE_BASE = 1480.27;
    public static final Integer NB_CONGES_BASE = 25;
    public static final Integer NB_RTT_BASE = 12;
    public static final Double INDICE_MANAGER = 1.3;
    public static final Double PRIME_MANAGER_PAR_TECHNICIEN = 250.0;
    public static final Double PRIME_ANCIENNETE = 100.0;

    public static Double primeAnnuelleBase(){
        return LocalDate.now().getYear()/2.0;
    }
}
