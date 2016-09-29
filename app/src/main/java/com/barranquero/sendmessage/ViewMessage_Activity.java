package com.barranquero.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by José Barranquero on 23/09/16.
 */

/**
 * Class that shows the message received from the previous Activity
 * @author José Antonio Barranquero
 * @version 1.0
 */
public class ViewMessage_Activity extends AppCompatActivity {

    private TextView txvMessage;

    /**
     * Method which shows the message from the previous Activity in a TextView
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        txvMessage = (TextView)findViewById(R.id.txvMessage);

        // We set the Bundle from the Intent created in the previous Activity
        Bundle mBundle = this.getIntent().getExtras();

        // We set the TextView text to the message written in the previous Activity, which has to be searched as "message" in the Bundle we have just created
        txvMessage.setText(mBundle.getString("message"));
    }

}
