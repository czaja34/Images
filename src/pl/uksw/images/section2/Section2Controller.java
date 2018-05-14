package pl.uksw.images.section2;

import pl.uksw.images.section2.tasks.Task1;
import pl.uksw.images.tiff.TiffFile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Section2Controller {

    public void exercise1(int par) throws IOException {
        File inputFileGrey = new File("resources/fileGrey1.tif");
        File outputTask1 = new File("resources/outputTask1.bmp");

        BufferedImage inputBites;
        TiffFile tiffFile = new TiffFile();

        inputBites = tiffFile.readFile(inputFileGrey);

        Task1 task1 = new Task1();
        task1.task1(inputBites, par);
        tiffFile.saveFile(outputTask1, inputBites);
    }

}
