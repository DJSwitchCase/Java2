package com.mirea.practice12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
@Component
public class FileWork {
    private String File1Name, File2Name;
    private String File1Contents = null;
    int c;
    private File File1, File2;
    private FileWriter Fwer, Fwer2;
    private FileReader Frer;

    @PostConstruct
    public void setNames() throws IOException {
        this.File1Name = "1.txt";
        this.File2Name = "2.txt";
        FileCreate();
    }
    private void FileCreate() throws IOException {
        //Создаем и заполняем 1 файл
        File1 = new File(File1Name);
        Fwer = new FileWriter(File1);
        Fwer.write("sangjkaengluj2h51o4c1y459oy673");
        Fwer.close();
        //Получаем информацию с 1 файла и корректируем null
        Frer = new FileReader(File1);
        while((c=Frer.read())!=-1) {
            File1Contents += (char) c;
        }
        File1Contents = File1Contents.replace("null","");
        Frer.close();
        //Хешируем содержимое 1 файла и заполняем 2 файл
        File2 = new File(File2Name);
        Fwer2 = new FileWriter(File2);
        Fwer2.write(((Integer)File1Contents.hashCode()).toString());
        Fwer2.close();
    }
    @PreDestroy
    private void File1destroy()
    {
        File1 = new File(File1Name);
        File1.delete();
    }


}
