package com.barranquero.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Class that sends a message to another Activity
 * @author José Antonio Barranquero
 * @version 1.0
 */
public class SendMessage_Activity extends AppCompatActivity {

    private static final String TAG ="com.barranquero";

    private EditText edtMessage;
    private Button btnSend;

    /**
     * Method which creates the Activity
     * @param savedInstanceState jk
     */

    //TODO My first Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText)findViewById(R.id.edtMessage);
        btnSend = (Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1: We create the Bundle object
                Bundle mBundle = new Bundle();
                mBundle.putString("message", edtMessage.getText().toString());
                //2: We create the Intent object from the previously created Bundle
                Intent mIntent = new Intent(SendMessage_Activity.this, ViewMessage_Activity.class);
                mIntent.putExtras(mBundle);
                //3: We start the Activity
                startActivity(mIntent);
            }
        });
        Log.d(TAG, "onCreate(): The Activity has been created");
    }

/**//**
     * Method which reacts to clicking events
     * @param view The clicked view
     *//*
    public void getEventOnClick(View view){
        switch (view.getId()) {
            case R.id.btnSend:
                //1: We create the Bundle object
                Bundle mBundle = new Bundle();
                mBundle.putString("message", edtMessage.getText().toString());

                //2: We create the Intent object from the previously created Bundle
                Intent mIntent = new Intent(SendMessage_Activity.this, ViewMessage_Activity.class);
                mIntent.putExtras(mBundle);

                //3: We start the Activity
                startActivity(mIntent);
        }
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): The Activity has started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): The Activity is visible");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): The Activity is not visible");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): The Activity has been terminated");
    }
}
