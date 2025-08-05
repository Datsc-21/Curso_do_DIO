package br.com.dio.persistence;

import java.io.*;

public class NIOFilePersistence implements FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/NIO/";
    private final String filename;

    public NIOFilePersistence(String filename) throws IOException {
        this.filename = filename;

        var file = new File(currentDir + storedDir);
        if(!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");

        clearFile();
    }

    @Override
    public String write(final String data) {
        try(
                var file = new RandomAccessFile(new File(currentDir + storedDir + filename), "rw")){
            file.seek(file.length());
            file.writeBytes(data);
            file.writeBytes(System.lineSeparator());
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return data;
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
            // System.out.printf("inicializando recursos (%s) \n", currentDir + storedDir + filename);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
