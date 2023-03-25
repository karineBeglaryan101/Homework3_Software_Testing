import java.util.ArrayList;

public class MovieTheater {
    private String name;
    private ArrayList<String> employees;
    private int numberOfAvailableRooms;
    private ArrayList<String> currentMovies;
    private int numberOfShowing;


    public MovieTheater(String name,  ArrayList<String> employees, int numberOfRooms, ArrayList<String> currentMovies){
        this.name = name;
        this.currentMovies = currentMovies;
        this.employees = employees;
        this.numberOfAvailableRooms = numberOfRooms;
        this.numberOfShowing = 0;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public String addMovie(String movie){
        if(currentMovies.contains(movie)){
            return "Already in the list!";
        }
        currentMovies.add(movie);
        return movie;
    }


    public String getMovie(String movie){
        if(!currentMovies.isEmpty() && currentMovies.contains(movie)){
            return movie;
        }
        return "Not Available";
    }

    public String addEmployee(String employee){
        if(getNumberOfEmployees() > 35){
            return "No available vacancies";
        }
        employees.add(employee);
        return employee;
    }

    public String removeEmployee(String employee){
        if(employees.contains(employee)){
            employees.remove(employee);
            return employee;
        }
       return  "No Such Employee";
    }

    public String getEmployee(String employee){
        if(employees.contains(employee)){
            return employee;
        }
        return "No such employee";
    }

    public boolean reserveRoom(){
        if(numberOfAvailableRooms > 0){
            numberOfAvailableRooms--;
            return true;
        }
        return false;
    }

    public String showMovie(String movie){
        if(currentMovies.contains(movie) && numberOfShowing < 100){
            numberOfShowing++;
            return "Enjoy the Movie";
        }
        return "Not Available";
    }

}
