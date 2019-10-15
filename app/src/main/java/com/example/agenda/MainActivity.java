package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNombre = findViewById(R.id.editText);
        EditText editTextApellidos = findViewById(R.id.editText2);
        EditText editTextTelefono = findViewById(R.id.editText3);
        EditText editTextCorreo = findViewById(R.id.editText4);

        editTextNombre.setOnFocusChangeListener( new View.OnFocusChangeListener() {
            @Override
            public  void onFocusChange(View v, boolean hasFocus) {
                onFocusChangeParaTodos(hasFocus, (ImageView) findViewById(R.id.imageView7));
            }
        });
        editTextApellidos.setOnFocusChangeListener( new View.OnFocusChangeListener() {
            @Override
            public  void onFocusChange(View v, boolean hasFocus) {
                onFocusChangeParaTodos(hasFocus, (ImageView) findViewById(R.id.imageView11));
            }
        });
        editTextTelefono.setOnFocusChangeListener( new View.OnFocusChangeListener() {
            @Override
            public  void onFocusChange(View v, boolean hasFocus) {
                onFocusChangeParaTodos(hasFocus, (ImageView) findViewById(R.id.imageView12));
            }
        });
        editTextCorreo.setOnFocusChangeListener( new View.OnFocusChangeListener() {
            @Override
            public  void onFocusChange(View v, boolean hasFocus) {
                onFocusChangeParaTodos(hasFocus, (ImageView) findViewById(R.id.imageView9));
            }
        });
    }
    public void onFocusChangeParaTodos(boolean hasFocus, ImageView img) {
        ImageView ic = img;
        Drawable d = ic.getDrawable();
        d= DrawableCompat.wrap(d);
        if(hasFocus)
            DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.design_default_color_primary));
        else
            DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.design_default_color_primary_dark));
    }
}
