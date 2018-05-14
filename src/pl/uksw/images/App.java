package pl.uksw.images;

import pl.uksw.images.section2.Section2Controller;

import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException {

        Section2Controller section2Controller = new Section2Controller();
        section2Controller.exercise1(30);
    }
}
