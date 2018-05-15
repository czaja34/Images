package pl.uksw.images.section2;

import pl.uksw.images.section2.tasks.Task1;
import pl.uksw.images.tiff.TiffFile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Section2Controller {

    public void exercise1(int par) throws IOException {
        File inputFileGrey = new File("resources/fileGrey1.tif");
        File outputTask1A = new File("resources/outputTask1A.bmp");

        File inputFile1 = new File("resources/kuba.tif");
        File outputTaskB1 = new File("resources/outputTask1B.bmp");


        BufferedImage inputBitesA;
        BufferedImage inputBitesB;

        TiffFile tiffFile = new TiffFile();

        inputBitesA = tiffFile.readFile(inputFileGrey);
        inputBitesB = tiffFile.readFile(inputFile1);


        Task1 task1 = new Task1();
        task1.task1a(inputBitesA, par);
        tiffFile.saveFile(outputTask1A, inputBitesA);


        tiffFile.saveFile(outputTaskB1, task1.task1b(inputBitesA, inputBitesB));
    }

}
