/**
 *
 * Name: John Smith (( Update with your name here ))
 * Student ID: s45045012  (( Update with your ID))
 *
 * [OPTIONAL: add any notes or comments here about the code]
 */

package au.edu.rmit.ct;

import com.wmw.examples.mockito.library.Book;
import com.wmw.examples.mockito.library.LendingManagerImpl;
import com.wmw.examples.mockito.library.LibraryRecord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RMITLibraryRecordsDAOTestSave {

    //examples only.
    Book book = new Book();
    RMITLibraryItem rmitLibraryItem = new RMITLibraryItem(1L,"0123");
    Date date = new Date(2000,2,2);
    LibraryRecord libraryRecord = new LibraryRecord();
    LendingManagerImpl lendingManager = new LendingManagerImpl();
    RMITLibraryRecordsDAO rmitLibraryRecordsDAO = new RMITLibraryRecordsDAO();
    @Test
    @DisplayName("Example")
    void findByBook() {
        fail("not implemented yet. Just an example test method.");
    }

    @Test
    @DisplayName("Example2")

    void save() {
        libraryRecord.setBook(book);

        rmitLibraryRecordsDAO.setRecordLimit(1);
        assertTrue(rmitLibraryRecordsDAO.save(libraryRecord));
        libraryRecord.setBook(rmitLibraryItem);
        assertFalse(rmitLibraryRecordsDAO.save(libraryRecord));
        fail("not implemented yet. Just an example test method.");
    }
}