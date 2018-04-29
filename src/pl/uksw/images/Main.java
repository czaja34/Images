package pl.uksw.images;

import pl.uksw.images.tiff.TiffFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException{

        String inputFilePath = "C:\\Users\\aleksander\\IdeaProjects\\images\\resources\\file1.tif";
        String outputFilePath = "C:\\Users\\aleksander\\IdeaProjects\\images\\resources\\file2.tif";

        File inputFile =  new File(inputFilePath.replace("\\", "/"));
        File outputFile =  new File(outputFilePath.replace("\\", "/"));

        // Info, jak otwierać i zapisywać pliki
        BufferedImage testImage;
        TiffFile test=new TiffFile();
        testImage =test.readFile(inputFile);
        test.saveFile(outputFile,testImage);

    }
}
