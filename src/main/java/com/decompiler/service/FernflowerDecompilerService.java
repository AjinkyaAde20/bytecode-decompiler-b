package com.decompiler.service;

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;
import java.io.File;

public class FernflowerDecompilerService {

    private final String inputPath;
    private final String outputPath;

    public FernflowerDecompilerService(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public void decompile() {
        ConsoleDecompiler.main(new String[]{inputPath, outputPath});
    }
}