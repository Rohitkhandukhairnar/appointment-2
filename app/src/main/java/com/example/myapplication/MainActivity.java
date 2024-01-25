package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

// MainActivity.java - Main activity for appointment booking
//package com.example.appointmentbooking;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.DatePicker;
        import android.widget.EditText;
        import android.widget.TimePicker;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI elements
        Button bookAppointmentButton = findViewById(R.id.bookAppointmentButton);
        EditText patientNameEditText = findViewById(R.id.patientNameEditText);
        DatePicker datePicker = findViewById(R.id.datePicker);
        TimePicker timePicker = findViewById(R.id.timePicker);
        EditText searchDoctorEditText = findViewById(R.id.searchDoctorEditText);
        EditText areaSearchEditText = findViewById(R.id.areaSearchEditText);

        // Button click listener for booking appointment
        bookAppointmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected date and time
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1; // Month is 0-based
                int year = datePicker.getYear();

                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                // Get patient name
                String patientName = patientNameEditText.getText().toString();

                // Get search details
                String searchDoctor = searchDoctorEditText.getText().toString();
                String areaSearch = areaSearchEditText.getText().toString();

                // Appointment booking logic
                String appointmentDetails = "Appointment booked for " +
                        patientName + " on " +
                        day + "/" + month + "/" + year +
                        " at " + hour + ":" + minute +
                        "\nSearch Doctor: " + searchDoctor +
                        "\nArea Search: " + areaSearch;

                // Display a toast message with appointment details
                Toast.makeText(MainActivity.this, appointmentDetails, Toast.LENGTH_SHORT).show();
            }
//        });
//    }
});}}