package Lesson3;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Создать пустой файл 1.txt
Записать туда фразу «Hello, world!»
Прочитать эту фразу из файла и вывести на экран
 */
public class Met {
    public static void main (String[] args) throws IOException
    {
        File file = new File("D:\\1.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Hello Sasha!");

        writer.flush();
        writer.close();

        FileReader fileReader = new FileReader(file);
        char[] textFormFile = new char[100];

        fileReader.read(textFormFile);

        for (int i=0; i<textFormFile.length; i++)
        {
            System.out.print(textFormFile[i]);
        }

        fileReader.close();

    }
}