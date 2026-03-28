package com.decompiler.service;

public interface DecompilerService {
    // Define methods that all decompiler implementations must provide.
    String decompile(String source);
}