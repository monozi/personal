public class multidimensional {
    public static void main(String[] args) throws Exception {

        // // mano mano hahahahahaha
        // String[][] movieReservation = {
        //         { "Available", "Available", "Available", "Available", "Available", "Available", "Available" },
        //         { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
        //         { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
        //         { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
        //         { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
        //         { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
        //         { "Available", "Available", "Available", "Available", "Available", "Selected", "Selected" }
        // };

        // // Access element that is selected
        // System.out.println(movieReservation[6][0]);

        // // Access element that is selected
        // System.out.println(movieReservation[6][2]);

            // nested for loop
        String[][] movieReservation = {
            { "Available", "Available", "Available", "Available", "Available", "Available", "Available" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Booked", "Booked", "Booked", "Booked", "Booked", "Booked", "Booked" },
            { "Available", "Available", "Available", "Available", "Available", "Selected", "Selected" }
    };
        // outer loop, ang loop na ito ay para sa ROWS
    for (int row = 0; row < movieReservation.length; row++) {

        // inner loop, ang loop na ito ay para sa COLUMN
        for (int column = 0; column < movieReservation.length; column++) {
            System.out.println("movieReservation[" + row + "][" + column + "] = " + movieReservation[row][column]);
        }
    }


    }
}
