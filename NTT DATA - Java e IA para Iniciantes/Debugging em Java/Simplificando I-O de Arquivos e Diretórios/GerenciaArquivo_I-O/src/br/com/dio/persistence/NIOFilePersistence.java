package br.com.dio.persistence;

import java.io.*;
import java.nio.ByteBuffer;

public class NIOFilePersistence implements FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/NIO/"; //Antes era o IO que foi colocado o NIO
    private final String filename;

    public NIOFilePersistence(String filename) throws IOException {
        this.filename = filename;

        var file = new File(currentDir + storedDir);
        if(!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");

        clearFile();
    }

    @Override
    public String write(final String data) { //Escrita
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
    public String findAll() { //Leitura
        var content = new StringBuilder();
        try(var file = new RandomAccessFile(new File(currentDir + storedDir + filename), "r");
        var channel = file.getChannel();
        ){
            var buffer = ByteBuffer.allocate(256);
            var bytesReader = channel.read(buffer);
            while(bytesReader != -1){
                buffer.flip();
                while (buffer.hasRemaining()){
                    content.append((char) buffer.get());
                }
                buffer.clear();
                bytesReader = channel.read(buffer);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public String findBy(String sentence) {
        var content = new StringBuilder();

        try(var file = new RandomAccessFile(new File(currentDir + storedDir + filename), "r");
            var channel = file.getChannel();
        ){
            var buffer = ByteBuffer.allocate(256);
            var bytesReader = channel.read(buffer);
            while(bytesReader != -1){
                buffer.flip();
                while (buffer.hasRemaining()){
                    while (!content.toString().endsWith(System.lineSeparator())){
                        content.append((char) buffer.get());
                    }
                    if(content.toString().contains(sentence)){
                     break;
                    }else{
                        content.setLength(0);
                    }
                    if(!content.isEmpty())break;
                }
                buffer.clear();
                bytesReader = channel.read(buffer);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return content.toString();
    }

    private void clearFile(){
        try(OutputStream outputStream = new FileOutputStream(currentDir + storedDir + filename) ) {
            // System.out.printf("inicializando recursos (%s) \n", currentDir + storedDir + filename);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
