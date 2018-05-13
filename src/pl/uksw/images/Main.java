package pl.uksw.images;

import pl.uksw.images.section2.Section2;
import pl.uksw.images.tiff.TiffFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException{

        String inputFilePath = "C:\\Users\\aleksander\\IdeaProjects\\images\\resources\\file1.tif";
        String outputFilePath = "C:\\Users\\aleksander\\IdeaProjects\\images\\resources\\file2.bmp";

        String inputFilePathGrey = "C:\\Users\\aleksander\\IdeaProjects\\images\\resources\\fileGrey1.tif";
        String outputFilePathGrey = "C:\\Users\\aleksander\\IdeaProjects\\images\\resources\\fileGrey2.bmp";

        File inputFile =  new File(inputFilePath.replace("\\", "/"));
        File outputFile =  new File(outputFilePath.replace("\\", "/"));

        File inputFileGrey =  new File(inputFilePathGrey.replace("\\", "/"));
        File outputFileGrey =  new File(outputFilePathGrey.replace("\\", "/"));

        // Info, jak otwierać i zapisywać pliki
        BufferedImage testImage;
        TiffFile test = new TiffFile();
        testImage = test.readFile(inputFile);
        test.saveFile(outputFile,testImage);

        //zad 2
        BufferedImage inzad2;
        TiffFile zad2 = new TiffFile();
        inzad2 = zad2.readFile(inputFileGrey);

        Section2 sec2= new Section2();
        sec2.sumPar(inzad2,150);

        zad2.saveFile(outputFileGrey,inzad2);

    }
}
