package uk.gov.service.vehicleenquiry.Utils;


import javax.activation.MimetypesFileTypeMap;
import java.io.*;


/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class FileReader {

    private static String rootDir = System.getProperty("user.dir")+"/src/test/resources/data/";



    public File[] getAllFiles() {
        File[] files = new File(rootDir).listFiles();
        return files;
    }


    public File getSingleFile(String fileName) {
        File[] files = new File(rootDir).listFiles();
        File file = null;

        for (File fileYY : files) {
            if (fileYY.getName().equalsIgnoreCase(fileName)) {
                file = fileYY;
                break;
            }else {
                System.err.println("File NOT found !!");
            }
        }
        return file;
    }

    public void displayeFileInformation() {

        File[] files = new File(rootDir).listFiles();

        for (File fileY : files)
            if (fileY.isDirectory()) {
                System.out.println("Directory: " + fileY.getName());
                displayeFileInformation();
            } else {
                double byteSize = fileY.length();
                String fileName = fileY.getName();
                String extension = "";
                String mimeType = "";

                int i = fileName.lastIndexOf('.');
                if (i > 0) {
                    extension = fileName.substring(i + 1);
                }

                File file = new File(fileName);
                MimetypesFileTypeMap fileTypeMap = new MimetypesFileTypeMap();
                mimeType = fileTypeMap.getContentType(file.getName());

                System.out.println("File NAME:      " + fileName.replaceFirst("[.][^.]+$", ""));
                System.out.println("File SIZE:      " + (byteSize / 1024));
                System.out.println("File extension: " + extension);
                System.out.println("File MIME type: " + mimeType);
                System.out.println("");

            }

    }


    public void displayVehicleDetails() {

        File[] files = new File(rootDir).listFiles();

        for (File fileY : files)
            if (fileY.isDirectory()) {
                System.out.println("Directory: " + fileY.getName());
                displayVehicleDetails();
            }
            else {
                String fileName = fileY.getName();
                String filePath = rootDir + fileName;

                BufferedReader br = null;
                String line = "";
                String cvsSpiltBy = ",";

                try {
                    br = new BufferedReader(new java.io.FileReader(filePath));
                    while ((line = br.readLine()) != null) {
                        String[] vehicleData = line.split(cvsSpiltBy);

                        System.out.println(fileName + " - Vehicle Details: " + vehicleData[0] + " " + vehicleData[1] + " " + vehicleData[2]);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (br != null) {
                        try {
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

    }



}

