package com.bridgelabz.utility;

import com.bridgelabz.model.CSVUser;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String SAMPLE_CSV_FILE_PATH = "./user.csv";

    public static void main(String[] args) throws IOException,
            CsvDataTypeMismatchException,
            CsvRequiredFieldEmptyException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH))
        ) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();
            List<CSVUser> csvUsers = new ArrayList<>();
            csvUsers.add(new CSVUser("Sandip Singh", "sandipsingh@gmail.com", "+1-1111111111"));
            csvUsers.add(new CSVUser("Satya Nadella", "satya@gmail.com", "+1-111111111111"));
            beanToCsv.write(csvUsers);
        }
    }
}

