package com.example.mymusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mymusic.R;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton,clearButton;
    private EditText nameEditText,messageEditText;
    private AutoCompleteTextView autoCompleteTextView;
    private String[] countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //for feedback
        sendButton = findViewById(R.id.sendButtonId);
        clearButton = findViewById(R.id.clearButtonId);
        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
        nameEditText = findViewById(R.id.nameEditTextId);
        messageEditText = findViewById(R.id.messageEditTextId);

        //for autocomplete Text
        countryName = getResources().getStringArray(R.array.countryName);
        autoCompleteTextView = findViewById(R.id.autoCompleteId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countryName);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
    }

    //for feedback

    @Override
    public void onClick(View v) {
        try {
            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();

            if (v.getId() == R.id.sendButtonId)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(intent.EXTRA_EMAIL,new String[]{"mi6076323@gmail.com"});
                intent.putExtra(intent.EXTRA_SUBJECT,"Feedback from App");
                intent.putExtra(intent.EXTRA_TEXT,"Name : " + name +"\n Message : "+ message);
                startActivity(Intent.createChooser(intent,"Feedback with"));

            }else if (v.getId() == R.id.clearButtonId)
            {
                nameEditText.setText("");
                messageEditText.setText("");
            }

        }catch (Exception e){

            Toast.makeText(getApplicationContext(),"Exception : " + e ,Toast.LENGTH_SHORT).show();
        }

    }
}
