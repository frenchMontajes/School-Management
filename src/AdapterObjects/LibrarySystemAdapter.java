package AdapterObjects;

import SchoolManagementApp.SchoolManagementApp;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private final LibrarySystem librarySystem;

    public LibrarySystemAdapter (LibrarySystem librarySystem){
        this.librarySystem = librarySystem;
    }
    @Override
    public void integrateSystem() {
         librarySystem.manageBooks();
    }
}
