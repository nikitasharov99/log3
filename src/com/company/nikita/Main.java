package com.company.nikita;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File src = new File("C:\\Users\\Валя\\Desktop\\Games\\src");
        if (src.mkdir()) {
            System.out.println(sb.append("Каталог src создан \n"));
        }
        File res = new File("C:\\Users\\Валя\\Desktop\\Games\\res");
        if (res.mkdir()) {
            System.out.println(sb.append("Каталог res создан \n"));
        }
        File savegames = new File("C:\\Users\\Валя\\Desktop\\Games\\savegames");
        if (savegames.mkdir()) {
            System.out.println(sb.append("Каталог savegames создан \n"));
        }
        File temp = new File("C:\\Users\\Валя\\Desktop\\Games\\temp");
        if (temp.mkdir()) {
            System.out.println(sb.append("Каталог temp создан \n"));
        }

        File main = new File(src, "main");
        if (main.mkdir()) {
            System.out.println(sb.append("Каталог main создан \n"));
        }
        File test = new File(src, "test");
        if (test.mkdir()) {
            System.out.println(sb.append("Каталог test создан \n"));
        }

        File mainFiles = new File(main, "Main.java");
        try {
            if (mainFiles.createNewFile())
                System.out.println(sb.append("Файл mainFiles был создан \n"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilFiles = new File(main, "Utils.java");
        try {
            if (utilFiles.createNewFile())
                System.out.println(sb.append("Файл utilFiles был создан \n"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File(res, "drawables");
        if (main.mkdir()) {
            System.out.println(sb.append("Каталог drawables создан \n"));
        }

        File vectors = new File(res, "vectors");
        if (main.mkdir()) {
            System.out.println(sb.append("Каталог vectors создан \n"));
        }
        File icons = new File(res, "icons");
        if (main.mkdir()) {
            System.out.println(sb.append("Каталог icons создан \n"));
        }

        File tempFiles = new File(temp, "temp.txt");
        try {
            if (tempFiles.createNewFile())
                System.out.println(sb.append("Файл tempFiles был создан \n"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter("C:\\Users\\Валя\\Desktop\\Games\\temp\\temp.txt", false)) {
            writer.append(sb);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
