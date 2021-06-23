package Kadai01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  input = br.readLine();
        GerLastChar get_last_char = new GerLastChar();
        get_last_char.print(input);
    }
}
