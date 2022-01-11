package com.learn.wildcardimports;

import java.nio.file.Paths;
import java.nio.file.Files;
// import java.nio.*.*; // NO GOOD - you can only have one wildcard.

//import java.nio.*;         // NO GOOD - a wildcard only matches
                             // class names, not "file.Files"

//import java.nio.file.Paths.*; // NO GOOD - you cannot import methods
                                // only class names
                                // unless static imports are used


public class WildCardImports {
    public static void main(String[] args) {

    }

    public void readFile(Files files) {
        Paths.get("name");

    }
}
