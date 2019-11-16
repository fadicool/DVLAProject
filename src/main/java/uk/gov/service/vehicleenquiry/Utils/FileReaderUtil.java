package uk.gov.service.vehicleenquiry.Utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class FileReaderUtil {

    private static String rootDir = System.getProperty("user.dir") + "/src/test/resources/data/";
    String vReg ="";
    String vmake ="";
    String vColour ="";

    public String getVehicheReg(String file) {

        String filePath = rootDir + file;

        BufferedReader br = null;
        String line = "";
        String cvsSpiltBy = ",";

        try {
            br = new BufferedReader(new java.io.FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] vehicleData = line.split(cvsSpiltBy);
                vReg = vehicleData[0];

                System.out.println(file + " - Vehicles REGISTRATION: " +  vehicleData[0] );
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
        return vReg;
    }


    public String getMake(String file) {

        String filePath = rootDir + file;

        BufferedReader br = null;
        String line = "";
        String cvsSpiltBy = ",";

        try {
            br = new BufferedReader(new java.io.FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] vehicleData = line.split(cvsSpiltBy);
                vmake = vehicleData[1];

                System.out.println(file + " - Vehicles MAKE: " +  vehicleData[1] );
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
        return vmake;
    }


    public String getColoue(String file) {

        String filePath = rootDir + file;

        BufferedReader br = null;
        String line = "";
        String cvsSpiltBy = ",";

        try {
            br = new BufferedReader(new java.io.FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] vehicleData = line.split(cvsSpiltBy);
                vColour = vehicleData[2];

                System.out.println(file + " - Vehicles COLOUR: " +  vehicleData[2] );
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
        return vColour;
    }

    public ArrayList<String> getVehicheDetails(String file) {

        String filePath = rootDir + file;

        ArrayList<String> vDetails = new ArrayList<>();

        BufferedReader br = null;
        String line = "";
        String cvsSpiltBy = ",";

        try {
            br = new BufferedReader(new java.io.FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] vehicleData = line.split(cvsSpiltBy);
                vDetails.add(vehicleData[0]);
                vDetails.add(vehicleData[1]);
                vDetails.add(vehicleData[2]);

                System.out.println(file + " - Vehicles REGISTRATION: " +  vehicleData[0] + " - Vehicles MAKE: " + vehicleData[1] + " - Vehicles COLOUR: " +  vehicleData[2] );
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
        return vDetails;
    }


}
