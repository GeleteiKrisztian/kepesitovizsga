package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || isNullOrEmpty(output)) {
            throw new IllegalArgumentException("Parameter can't be null or empty");
        }
        Path path = Path.of(output);
        try(BufferedWriter writer = Files.newBufferedWriter(path)) {
            for(Map.Entry<String, String> item : contacts.entrySet()) {
                String line = item.getKey() + ": " + item.getValue();
                writer.write(line + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't write the file.");
        }
    }

    private boolean isNullOrEmpty(String s) {
        if (s == null || s.isBlank()) {
            return true;
        }
        return false;
    }
}
