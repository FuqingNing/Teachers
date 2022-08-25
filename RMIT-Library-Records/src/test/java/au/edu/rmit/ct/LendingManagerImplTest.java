/**
 *
 * Name: John Smith (( Update with your name here ))
 * Student ID: s45045012  (( Update with your ID))
 *
 * [OPTIONAL: add any notes or comments here about the code]
 */

package au.edu.rmit.ct;

import com.wmw.examples.mockito.library.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LendingManagerImplTest {
    Book book = new Book();
    RMITLibraryItem rmitLibraryItem = new RMITLibraryItem(1L,"0123");
    Date date = new Date(2000,2,2);
    LibraryRecord libraryRecord = new LibraryRecord();
    LendingManagerImpl lendingManager = new LendingManagerImpl();
    RMITLibraryRecordsDAO rmitLibraryRecordsDAO = new RMITLibraryRecordsDAO();




    @Test
    @DisplayName("Borrow Book")
    void borrowBook1() {
        //success
        book.setName("RMIT");
        libraryRecord.setBook(book);
        rmitLibraryRecordsDAO.save(libraryRecord);
        //store
        lendingManager.setLibraryRecordDAO(rmitLibraryRecordsDAO);
        LibraryRecord record = lendingManager.borrowBook(rmitLibraryItem);
        assertEquals(1L,record.getBook().getId());


        //fail exception
        assertThrows(Exception.class,()->lendingManager.borrowBook(rmitLibraryItem));
        /*assertEquals(Exception,()->lendingManager.borrowBook(book));*/
        /*fail("not implemented yet. Just an example test method.");*/
    }

    @Test
    @DisplayName("return Book")
    void returnBook1() {
        book.setName("RMIT");
        libraryRecord.setBook(book);
        rmitLibraryRecordsDAO.save(libraryRecord);
        //store
        lendingManager.setLibraryRecordDAO(rmitLibraryRecordsDAO);
        //borrow
        lendingManager.borrowBook(rmitLibraryItem);
        //success
        LibraryRecord record = lendingManager.returnBook(rmitLibraryItem);
        assertEquals(1L,record.getBook().getId());

        //fail ->exception
        assertThrows(Exception.class,()->lendingManager.returnBook(rmitLibraryItem));



        /*fail("not implemented yet. Just an example test method.");*/
    }

}