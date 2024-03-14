package com.crud.loader;

import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine.Command;

@Slf4j
@Command(name = "java-crud-loader", usageHelpAutoWidth = true, description = "A generic CRUD loader to load data from sql and csv files, generate fake data and generate random Insert, Update and Delete events.")
public class LoaderMain extends LoaderApp {

    public static void main(String[] args) {
        log.info("Initializing CRUD Loader Application.");
        System.exit(new LoaderMain().execute(args));
    }

}