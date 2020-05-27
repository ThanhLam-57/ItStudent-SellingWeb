package com.bksoftware;

import com.bksoftware.controller.ProductController;
import com.bksoftware.model.Product;
import com.bksoftware.service_impl.ProductServiceImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("                 ,----,                                                                                         \n" +
                "               ,/   .`|                                                                                         \n" +
                "   ,---,     ,`   .'  :   .--.--.        ___                                                            ___     \n" +
                ",`--.' |   ;    ;     /  /  /    '.    ,--.'|_                        ,---,                           ,--.'|_   \n" +
                "|   :  : .'___,/    ,'  |  :  /`. /    |  | :,'           ,--,      ,---.'|                  ,---,    |  | :,'  \n" +
                ":   |  ' |    :     |   ;  |  |--`     :  : ' :         ,'_ /|      |   | :              ,-+-. /  |   :  : ' :  \n" +
                "|   :  | ;    |.';  ;   |  :  ;_     .;__,'  /     .--. |  | :      |   | |    ,---.    ,--.'|'   | .;__,'  /   \n" +
                "'   '  ; `----'  |  |    \\  \\    `.  |  |   |    ,'_ /| :  . |    ,--.__| |   /     \\  |   |  ,\"' | |  |   |    \n" +
                "|   |  |     '   :  ;     `----.   \\ :__,'| :    |  ' | |  . .   /   ,'   |  /    /  | |   | /  | | :__,'| :    \n" +
                "'   :  ;     |   |  '     __ \\  \\  |   '  : |__  |  | ' |  | |  .   '  /  | .    ' / | |   | |  | |   '  : |__  \n" +
                "|   |  '     '   :  |    /  /`--'  /   |  | '.'| :  | : ;  ; |  '   ; |:  | '   ;   /| |   | |  |/    |  | '.'| \n" +
                "'   :  |     ;   |.'    '--'.     /    ;  :    ; '  :  `--'   \\ |   | '/  ' '   |  / | |   | |--'     ;  :    ; \n" +
                ";   |.'      '---'        `--'---'     |  ,   /  :  ,      .-./ |   :    :| |   :    | |   |/         |  ,   /  \n" +
                "'---'                                   ---`-'    `--`----'      \\   \\  /    \\   \\  /  '---'           ---`-'   \n" +
                "                                                                  `----'      `----'                            \n" +
                "                                                                                                                ");
        new ProductController().start();
     //   new ProductServiceImpl().update(new Product(0, "Iphone 12", "Bphone", 1, 1000));

    }
}
