package reservation;

import java.util.ArrayList;

public class FilmModel {

    String showDate;
    String showTime;
    String filmTitle;
    String ScreenDesignation;
    String SeatDesignation;

    public FilmModel(String showDate, String showTime, String filmTitle, String screenDesignation, String seatDesignation) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.filmTitle = filmTitle;
        ScreenDesignation = screenDesignation;
        SeatDesignation = seatDesignation;
    }

    //Arraylist storing film showings
    ArrayList<FilmModel> filmShowings = new ArrayList<>();

    public void generateFilmShowings() {

        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "1A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "2A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "3A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "4A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "5A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "6A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "7A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "8A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "9A"));
        filmShowings.add(new FilmModel("01/12/2021", "12:00", "Lord of the rings: Return of the King", "Main", "10A"));


    }
}
