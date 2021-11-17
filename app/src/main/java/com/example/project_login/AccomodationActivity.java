package com.example.project_login;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AccomodationActivity extends AppCompatActivity {
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);

        LinearLayout it1 = findViewById(R.id.itemOne);
        it1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Thank you for showing interest", Toast.LENGTH_SHORT);
                toast.show();

                AlertDialog alertDialog = new AlertDialog.Builder(AccomodationActivity.this).create();
                alertDialog.setTitle("The Royal Height");
                alertDialog.setMessage("Location: Scarborough\n\nDescription: Average sized apartment with basic amenities included\n\nFloor: 5\n\nOwner Name: Mary Jane\n\nClick below to connect via call");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Call",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:9134290909"));
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });
        LinearLayout it2 = findViewById(R.id.itemTwo);
        it2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Thank you for showing interest", Toast.LENGTH_SHORT);
                toast.show();

                AlertDialog alertDialog = new AlertDialog.Builder(AccomodationActivity.this).create();
                alertDialog.setTitle("Victoria Avenue");
                alertDialog.setMessage("Location: North York\n\nDescription: Luxurious house, fully furnished\n\nOwner Name: Mark Wood\n\nClick below to connect via call");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Call",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:4579071058"));
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });
        LinearLayout it3 = findViewById(R.id.itemThree);
        it3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Thank you for showing interest", Toast.LENGTH_SHORT);
                toast.show();

                AlertDialog alertDialog = new AlertDialog.Builder(AccomodationActivity.this).create();
                alertDialog.setTitle("The Royal Height");
                alertDialog.setMessage("Location: Brampton\n\nDescription: Small Apartment, not fully furnished and utilities excluded\n\nFloor: 9\n\nOwner Name: Chris Don\n\nClick below to connect via call");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Call",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                intent.setData(Uri.parse("tel:9137620980"));
                                startActivity(intent);
                            }
                        });
                alertDialog.show();
            }
        });
    }
}
