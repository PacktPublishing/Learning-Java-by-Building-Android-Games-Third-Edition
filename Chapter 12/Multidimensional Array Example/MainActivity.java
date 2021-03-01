package com.packtpub.dynamicarrayexample.dynamicarrayexample;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Random object for generating question numbers
        Random randInt = new Random();
// a variable to hold the random value generated
        int questionNumber;// Declare and allocate in separate stages for clarity
// but we don't have to
        String[][] countriesAndCities;
// Now we have a 2-dimensional array

        countriesAndCities = new String[5][2];
// 5 arrays with 2 elements each
// Perfect for 5 "What's the capital city" questions

// Now we load the questions and answers into our arrays
// You could do this with less questions to save typing
// But don't do more or you will get an exception
        countriesAndCities [0][0] = "United Kingdom";
        countriesAndCities [0][1] = "London";

        countriesAndCities [1][0] = "USA";
        countriesAndCities [1][1] = "Washington";

        countriesAndCities [2][0] = "India";
        countriesAndCities [2][1] = "New Delhi";

        countriesAndCities [3][0] = "Brazil";
        countriesAndCities [3][1] = "Brasilia";

        countriesAndCities [4][0] = "Kenya";
        countriesAndCities [4][1] = "Nairobi";
  /*
	Now we know that the country is stored at element 0
	The matching capital at element 1
	Here are two variables that reflect this
*/
        final int COUNTRY = 0;
        final int CAPITAL = 1;

// A quick for loop to ask 3 questions
        for(int i = 0; i < 3; i++){
            // get a random question number between 0 and 4
            questionNumber = randInt.nextInt(5);

            // and ask the question and in this case just
            // give the answer for the sake of brevity
            Log.d("info", "The capital of "
                    +countriesAndCities[questionNumber][COUNTRY]);

            Log.d("info", "is "
                    +countriesAndCities[questionNumber][CAPITAL]);

        } // end of for loop


    }
}
