package com.sogeti.wildcardimports;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.*; // NO GOOD - a wildcard only matches class names, not "file.Files"
// import java.nio.*.*; // NO GOOD - you can only have one wildcard.
import java.nio.file.Paths.*; // NO GOOD - you can not import methods, only class names

public class WildCardImports {
    public static void main(String[] args) {

    }

    public void readFile(Files files) {
        Paths.get("name");

    }
}
