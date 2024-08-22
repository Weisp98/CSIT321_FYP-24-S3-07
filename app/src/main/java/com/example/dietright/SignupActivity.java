package com.example.dietright;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize the EditText and Button
        nameEditText = findViewById(R.id.editTextText);
        confirmButton = findViewById(R.id.confirmNamebutton);

        // Set an OnClickListener for the button
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the text from the EditText
                String name = nameEditText.getText().toString().trim();

                // Check if the name is empty
                if (name.isEmpty()) {
                    // Show a message if the name is empty
                    Toast.makeText(SignupActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                } else {
                    // Proceed to the next activity if the name is not empty
                    //Intent intent = new Intent(NamePage.this, GoalPage.class);
                    //startActivity(intent);
                }
            }
        });
    }
}