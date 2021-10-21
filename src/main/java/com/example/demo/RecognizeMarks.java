package com.example.demo;

import com.aspose.omr.OmrEngine;
import com.aspose.omr.RecognitionResult;
import com.aspose.omr.TemplateProcessor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Locale;

public class RecognizeMarks {
    RecognizeMarks(){};

    public void Recognize() throws FileNotFoundException {

        String sourcePath = "src/main/resources/";
        String UserImage = sourcePath + "Sheet1.jpg";
        String UserImageNoExt = sourcePath + "exampleTemplate";
        //String[] UserImages = new String[]{"/home/artemisoft/Desktop/test/exampleTemplate.png"};
        //String[] UserImagesNoExt = new String[]{"Sheet1", "Sheet2"};

        String outputDirectory = sourcePath;

        String templatePath = sourcePath + "Sheet.omr";

        // initialize engine and get template processor providing path to the .omr file
        OmrEngine engine = new OmrEngine();
        TemplateProcessor templateProcessor = engine.getTemplateProcessor(templatePath);


// images loop
        // for (int i = 0; i < UserImages.length; i++) {
        // path to the image to be recognized
        //String imagePath = UserImages[i];
        String imagePath = UserImage;
        System.out.println("Processing image: " + imagePath);

        // recognize image and receive result
        RecognitionResult result = templateProcessor.recognizeImage(imagePath);
        System.out.println("result get " + result.getCsv().toLowerCase());
        // export results as csv string
        String csvResult = result.getCsv();

        String json = result.getJson();


        // save csv to the output folder
        // PrintWriter wr = new PrintWriter(new FileOutputStream(UserImagesNoExt[i] + ".csv"), true);
        PrintWriter wr = new PrintWriter(new FileOutputStream(UserImageNoExt + ".csv"), true);

        wr.println(csvResult);
        //}
    }

}