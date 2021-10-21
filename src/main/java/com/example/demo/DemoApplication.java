package com.example.demo;

import com.aspose.omr.License;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
        // Initialize license object
        License omrLicense = new License();
        omrLicense.setLicense("src/main/java/com/example/demo/Aspose.OMR.Java.lic");//Aspose.OMR.lic

        //TEMPLATE GENERATON
        //GenerateOMRTemplate omr = new GenerateOMRTemplate();
        //omr.GenerateTemplate();
        
        //PHOTO RECOGNIZER
        RecognizeMarks r = new RecognizeMarks();
        r.Recognize();

    }

}

