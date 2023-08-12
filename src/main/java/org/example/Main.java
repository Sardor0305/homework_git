package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.model.Money;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {

        URL url = new URL("https://cbu.uz/uz/arkhiv-kursov-valyut/json/");
        Gson gson =new Gson();
        BufferedReader reader = new BufferedReader(new FileReader("/home/sharipov/IdeaProjects/valyuta_kurs/src/main/resources"));
        List<Money> monies = gson.fromJson(reader, new TypeToken<List<Money>>(){}.getType());




    }
}