package br.com.dio.persistence;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOFilePersistence implements  FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/IO/";
    private final String filename;

    public IOFilePersistence(String filename) throws IOException {
        this.filename = filename;
        var file = new File(currentDir + storedDir);
        if(!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");

        clearFile();
    }


    @Override
    public String write(String data) {
        return "";
    }

    @Override
    public boolean remover(String sentence) {
        return false;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        return "";
    }

    @Override
    public String findAll() {
        return "";
    }

    @Override
    public String findBy(String sentence) {
        return "";
    }

    private void clearFile(){
        try(OutputStream outputStream = new FileOutputStream(currentDir + storedDir + filename) ) {
           System.out.printf("inicializando recursos (%s) \n", currentDir + storedDir + filename);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }



}
