import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class MovieTheaterTest {


    @Test
    void addMovieThatDoesNotExist(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        assertEquals("Up", Bowl.addMovie("Up"));
    }

    @Test
    void addMovieThatExists(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        Bowl.addMovie("Up");
        assertNotEquals("Up", Bowl.addMovie("Up"));
    }

    @Test
    void getExistingMovie(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        Bowl.addMovie("Shrek");
        assertEquals("Shrek", Bowl.getMovie("Shrek"));
    }

    @Test
    void getNoneExistingMovie(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        assertNotEquals("Shrek", Bowl.getMovie("Shrek"));
    }

    @Test
    void addEmployee(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        assertEquals("Sarah", Bowl.addEmployee("Sarah"));
    }

    @Test
    void addEmployeeButNoSpace(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        for (int i = 0; i < 36; i++) {
            Bowl.addEmployee("David" + i);
        }
        assertEquals("No available vacancies", Bowl.addEmployee("Sarah"));
    }

    @Test
    void getNumberOfEmployees(){
        ArrayList<String> a = new ArrayList<>(3);
        MovieTheater Bowl = new MovieTheater("Bowl", a, 4, new ArrayList<>());
        assertEquals(a.size(), Bowl.getNumberOfEmployees());
    }


    @Test
    void numberOfEmployeeAfterAdd(){
        ArrayList<String> a = new ArrayList<>(3);
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        Bowl.addEmployee("Sarah");
        assertEquals(a.size()+1, Bowl.getNumberOfEmployees());
    }

    @Test
    void removeEmployee(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        Bowl.addEmployee("Sarah");
        assertEquals("Sarah", Bowl.removeEmployee("Sarah"));
    }

    @Test
    void removeNoneEmployee(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        assertEquals("No Such Employee", Bowl.removeEmployee("Sarah"));
    }

    @Test
    void numberOfEmployeeAfterRemove(){
        ArrayList<String> a = new ArrayList<>(3);
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        Bowl.addEmployee("Suren");
        Bowl.removeEmployee("Suren");
        assertEquals(a.size(), Bowl.getNumberOfEmployees());
    }

    @Test
    void getExistingEmployee(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        Bowl.addEmployee("Suren");
        assertEquals("Suren", Bowl.getEmployee("Suren"));
    }

    @Test
    void getNoneExistingEmployee(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 4, new ArrayList<>());
        assertEquals("No such employee", Bowl.getEmployee("Suren"));
    }

    @Test
    void reservingRoom(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 3, new ArrayList<>());
        assertEquals(true, Bowl.reserveRoom());
    }

    @Test
    void reservingRoomButNoSpace(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 3, new ArrayList<>());
        for (int i = 0; i < 3; i++) {
            Bowl.reserveRoom();
        }
        assertEquals(false, Bowl.reserveRoom());
    }

    @Test
    void showingTheMovie(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 3, new ArrayList<>());
        Bowl.addMovie("Tarzan");
        assertEquals("Enjoy the Movie", Bowl.showMovie("Tarzan"));
    }

    @Test
    void showingNoneAvailableMovie(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 3, new ArrayList<>());
        assertEquals("Not Available", Bowl.showMovie("Tarzan"));
    }


    @Test
    void showingMovieThatPassedTheLimit(){
        MovieTheater Bowl = new MovieTheater("Bowl", new ArrayList<>(), 3, new ArrayList<>());
        Bowl.addMovie("Conjuring");
        for (int i = 0; i < 100; i++) {
            Bowl.showMovie("Conjuring");
        }
        assertEquals("Not Available", Bowl.showMovie("Conjuring"));
    }


















}
