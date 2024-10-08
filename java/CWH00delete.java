import java.io.File;

public class CWH00delete {

    public static void main(String[] args) {
        // Specify the folder path
        String folderPath = "C:\\Users\\Shubham Pathak\\OneDrive\\Desktop\\java";

        // Call the method to delete .exe files
        deleteExeFiles(folderPath);
    }

    public static void deleteExeFiles(String folderPath) {
        // Create a File object for the folder
        File folder = new File(folderPath);

        // List all files in the folder
        File[] files = folder.listFiles();

        // Check if the folder contains files
        if (files != null) {
            // Iterate through the files
            for (File file : files) {
                // Check if the file is an executable (.exe) file
                if (file.isFile() && file.getName().endsWith(".exe")) {
                    // Attempt to delete the file
                    if (file.delete()) {
                        System.out.println("Deleted: " + file.getName());
                    } else {
                        System.out.println("Error deleting: " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("The specified folder does not exist or is not a directory.");
        }
    }
}
