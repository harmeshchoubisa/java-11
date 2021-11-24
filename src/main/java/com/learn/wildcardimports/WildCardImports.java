package com.learn.wildcardimports;

import java.nio.file.Paths;
import java.nio.file.Files;
// import java.nio.*.*; // NO GOOD - you can only have one wildcard.


public class WildCardImports {
    public static void main(String[] args) {

    }

    public void readFile(Files files) {
        Paths.get("name");

    }
}
