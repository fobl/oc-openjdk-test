package no.openjdk_test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.post;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class SecureRest {

    public static void main(String[] args) throws Exception {
        get("/", (req, res) -> "Hello World");
    }
}