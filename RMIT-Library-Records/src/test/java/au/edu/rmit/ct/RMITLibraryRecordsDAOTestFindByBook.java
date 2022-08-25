/**
 *
 * Name: John Smith (( Update with your name here ))
 * Student ID: s45045012  (( Update with your ID))
 *
 * [OPTIONAL: add any notes or comments here about the code]
 */

package au.edu.rmit.ct;

import com.sun.source.tree.AssertTree;
import com.wmw.examples.mockito.library.Book;
import com.wmw.examples.mockito.library.LendingManagerImpl;
import com.wmw.examples.mockito.library.LibraryRecord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class RMITLibraryRecordsDAOTestFindByBook {

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
        //success
        book.setName("RMIT");
        libraryRecord.setBook(book);
        libraryRecord.setBorrowingDate(date);
        rmitLibraryRecordsDAO.save(libraryRecord);
        //store
        //import list package to accept return values
        lendingManager.setLibraryRecordDAO(rmitLibraryRecordsDAO);
        List<LibraryRecord> record = rmitLibraryRecordsDAO.findByBook(rmitLibraryItem);
        LibraryRecord re = record.get(0);
        assertEquals(date,re.getBorrowingDate());
        //fail
        book.setName("RMIT");
        libraryRecord.setBook(book);
        rmitLibraryRecordsDAO.save(libraryRecord);
        //store
        lendingManager.setLibraryRecordDAO(rmitLibraryRecordsDAO);

        fail("not implemented yet. Just an example test method.");
    }

    @Test
    @Order(1)
    @DisplayName("Example2")
    void save() {
        //success
        book.setName("RMIT");
        libraryRecord.setBook(book);
        rmitLibraryRecordsDAO.save(libraryRecord);
        //store
        lendingManager.setLibraryRecordDAO(rmitLibraryRecordsDAO);
        assertTrue(rmitLibraryRecordsDAO.save(libraryRecord));

        //false


        fail("not implemented yet. Just an example test method.");
    }
}
