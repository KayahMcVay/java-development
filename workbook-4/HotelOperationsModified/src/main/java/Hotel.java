public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfBasicRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfBasicRooms){

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfBasicRooms, int bookedSuites, int bookedBasicRooms){

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;

    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfBasicRooms() {
        return numberOfBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites(){

        return (numberOfSuites - bookedSuites);

        /*String userMessage = ("There are: " + numberOfAvailableSuites + " suite(s) currently available!" );


        if (numberOfAvailableSuites > 0){

            return userMessage;

        } else if (numberOfAvailableSuites == 0){

            return "No available suites at this time, please check back later!";
        }

         */

    }

    public int getAvailableBasicRooms(){

        return (numberOfBasicRooms - bookedBasicRooms);

       /* String userMessage = ("There are: " + numberOfAvailableBasicRooms + " room(s) currently available!" );


        if (numberOfAvailableBasicRooms > 0){

            return userMessage;

        } else if (numberOfAvailableBasicRooms == 0){

            return "No available rooms at this time, please check back later!";
        }

        */

    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){


    }


}
