package com.example.demo;


import com.aspose.omr.GenerationResult;
import com.aspose.omr.OmrEngine;

public class GenerateOMRTemplate {

    GenerateOMRTemplate(){};

    public void GenerateTemplate() {
        String sourceDirectory = "src/main/resources/";
        String GenerationMarkup = sourceDirectory + "markup.txt";
        String GenerationMarkupNoExt = "markup";
        //String[] GenerationMarkups = new String[]{"markup.txt"};
        //String[] GenerationMarkupsNoExt = new String[]{"markup"};

        OmrEngine engine = new OmrEngine();

        // for(int i = 0; i < GenerationMarkups.length ; i++)
        {
            // call template generation providing path to the txt file with markup
            //GenerationResult res = engine.generateTemplate(GenerationMarkups[i]);
            GenerationResult res = engine.generateTemplate(GenerationMarkup);

            // check in case of errors
            if (res.getErrorCode() != 0) {
                System.out.println("ERROR CODE: " + res.getErrorCode());
            }

            // save generation result: image and .omr template
            // res.save("/home/artemisoft/Desktop/test/", GenerationMarkupsNoExt[i]);
            res.save(sourceDirectory, GenerationMarkupNoExt);
        }
    }
}