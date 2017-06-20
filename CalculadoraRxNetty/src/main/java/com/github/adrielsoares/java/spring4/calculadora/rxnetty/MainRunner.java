package com.github.adrielsoares.java.spring4.calculadora.rxnetty;

import com.github.adrielsoares.java.spring4.calculadora.rxnetty.Configuracao.ConfiguracaoAPP;
import netflix.adminresources.resources.KaryonWebAdminModule;
import netflix.karyon.Karyon;
import netflix.karyon.ShutdownModule;
import netflix.karyon.archaius.ArchaiusBootstrapModule;
import netflix.karyon.servo.KaryonServoModule;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Adriel on 21/05/2017.
 */

        public class MainRunner {
            public static void main(String [] args){
                ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfiguracaoAPP.class);
                ResourceCalculo resourceCalculo = (ResourceCalculo) applicationContext.getBean("resourceCalculo");

                System.setProperty("java.awt.headless","true");
                System.setProperty("archaius.deployment.environment","dev");

                Karyon.forRequestHandler(8888,
                        new RxNettyHandler("/calcula", resourceCalculo),
                        new ArchaiusBootstrapModule("calculadora-rxnetty"),
                        Karyon.toBootstrapModule(KaryonWebAdminModule.class),
                        ShutdownModule.asBootstrapModule(),
                        KaryonServoModule.asBootstrapModule()
                ).startAndWaitTillShutdown();

            }




        //        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfiguracaoAPP.class);
//        Calculo calculador = (Calculo) applicationContext.getBean("calculo");
//
//        System.out.println(calculador.calculo(5, 5, "+"));
//        System.out.println(calculador.calculo(10, 5, "-"));
//        System.out.println(calculador.calculo(20, 4, "/"));
//        System.out.println(calculador.calculo(20, 0, "/"));
//        System.out.println(calculador.calculo(10, 2, "*"));
//        System.out.println(calculador.calculo(7, 2, "^"));
//        System.out.println(calculador.calculo(8, 5, "+"));
//
//        System.out.println(calculador.getHistoricoMap().getMapHistorico());
//
//        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}


