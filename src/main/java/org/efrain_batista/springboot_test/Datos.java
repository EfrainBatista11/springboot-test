package org.efrain_batista.springboot_test;

import org.efrain_batista.springboot_test.models.Banco;
import org.efrain_batista.springboot_test.models.Cuenta;

import java.math.BigDecimal;

public class Datos {

   // public static final Cuenta CUENTA_001 = new Cuenta(1L, "Efraín Batista", new BigDecimal("1000"));
   // public static final Cuenta CUENTA_002 = new Cuenta(2L, "Yeilin Corella", new BigDecimal("2000"));
   // public static final Banco BANCO = new Banco(1L, "Banco Nacional", 0);

    public static Cuenta crearCuenta001(){
        return new Cuenta(1L, "Efraín Batista", new BigDecimal("1000"));
    }

    public static Cuenta crearCuenta002(){
        return new Cuenta(2L, "Yeilin Corella", new BigDecimal("2000"));
    }

    public static Banco crearBanco(){
        return new Banco(1L, "Banco Nacional", 0);
    }
}
