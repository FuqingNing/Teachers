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

import static org.junit.jupiter.api.Assertions.fail;

class LendingManagerImplTestCheckRI {

    Book book = new Book();
    RMITLibraryItem rmitLibraryItem = new RMITLibraryItem(1L,"0123");
    Date date = new Date(2000,2,2);
    LibraryRecord libraryRecord = new LibraryRecord();
    LendingManagerImpl lendingManager = new LendingManagerImpl();
    RMITLibraryRecordsDAO rmitLibraryRecordsDAO = new RMITLibraryRecordsDAO();

    @Test
    @DisplayName("Example Display name ")
    void checkRecordIntegrity() {
        libraryRecord.setBook(rmitLibraryItem);
        libraryRecord.setBorrowingDate(date);
        rmitLibraryRecordsDAO.save(libraryRecord);
        



        fail("not implemented yet. Just an example test method.");
    }
}