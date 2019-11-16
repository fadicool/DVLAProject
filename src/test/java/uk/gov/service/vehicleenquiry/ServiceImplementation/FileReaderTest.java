package uk.gov.service.vehicleenquiry.ServiceImplementation;


import uk.gov.service.vehicleenquiry.Utils.FileReader;
import org.junit.Test;
import uk.gov.service.vehicleenquiry.Utils.FileReaderUtil;

import java.io.File;


/**
 * Created by Johannes Adu on 11/8/2018.
 */
public class FileReaderTest {

    private FileReader fileReader;
    private FileReaderUtil fileReaderUtil;


    @Test
    public void testGetAllFilesFromDirectroy() throws Exception {
        fileReader = new FileReader();
        File[] fileList = fileReader.getAllFiles();
        System.out.println("Number of files in root Directory: " + fileList.length);

        for (File file : fileList){
            System.out.println(file.getName());
        }
    }

    @Test
    public void testGetSingleFile(){
        fileReader = new FileReader();
        File file = fileReader.getSingleFile("file2.csv");
        System.out.println(file.getName());
    }


    @Test
    public void testDisplayeFileInformation() throws Exception {
        fileReader = new FileReader();
        fileReader.displayeFileInformation();
    }

    @Test
    public void testDisplayVehicleDetails() throws Exception {
        fileReader = new FileReader();
        fileReader.displayVehicleDetails();
    }

    @Test
    public void testGetVehicheReg() throws Exception {
        fileReaderUtil = new FileReaderUtil();
        fileReaderUtil.getVehicheReg("file3.csv");
    }

    @Test
    public void testGetMake() throws Exception {
        fileReaderUtil = new FileReaderUtil();
        fileReaderUtil.getMake("file3.csv");
    }

    @Test
    public void testFetColoue() throws Exception {
        fileReaderUtil = new FileReaderUtil();
        fileReaderUtil.getColoue("file3.csv");
    }

    @Test
    public void testGetVehicheDetails() throws Exception {
        fileReaderUtil = new FileReaderUtil();
        fileReaderUtil.getVehicheDetails("file3.csv");
    }


}
