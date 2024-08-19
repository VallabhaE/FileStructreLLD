import java.util.ArrayList;
import java.util.List;

class Dir {
    String folderName; // Corrected spelling from "foldwerName" to "folderName"
    List<Object> objList = new ArrayList<>();

    public void add(Object obj) {
        objList.add(obj);
    }

    public void ls() {
        System.out.println(folderName);
        for (Object obj : objList) {
            if (obj instanceof Dir) {
                // Print the directory name
                System.out.println("Directory: " + ((Dir) obj).folderName);

                // List contents of this directory
                ((Dir) obj).ls(); // Recursive call for nested directories
            } else if (obj instanceof File) {
                // Print the file name
                System.out.println("File: " + ((File) obj).FileName);
            }
        }
    }
}


