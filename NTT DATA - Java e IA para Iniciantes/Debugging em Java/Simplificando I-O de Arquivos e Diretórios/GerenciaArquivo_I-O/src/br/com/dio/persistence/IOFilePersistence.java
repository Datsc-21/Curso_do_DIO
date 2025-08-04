package br.com.dio.persistence;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.File;

public class IOFilePersistence implements  FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/IO/";
    private final String filename;

    public IOFilePersistence(String filename) {
        this.filename = filename;
        var file = new File(currentDir + storedDir);
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
}
