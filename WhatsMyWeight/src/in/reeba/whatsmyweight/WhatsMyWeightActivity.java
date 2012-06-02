package in.reeba.whatsmyweight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class WhatsMyWeightActivity extends Activity {
    /** Called when the activity is first created. */
	
    // Create a listener for the submit button
    private OnClickListener buttonSubmitListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			EditText textAskWeight = (EditText) findViewById(R.id.textWeight);
			Log.d( "WhatsMyWeight", textAskWeight.getText().toString());
			
		}
	};

	//Create a listener for the help button
	private OnClickListener helpButtonListner = new OnClickListener() {
	
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(WhatsMyWeightActivity.this, HelpActivity.class);
			startActivity(intent);
		}
	};
	
	
	
	
	// Main activity
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView textAskWeight = (TextView) findViewById(R.id.textAskWeight);
        textAskWeight.setText(R.string.askforWeight);
        
        Button button = (Button) findViewById(R.id.buttonSubmit);
        button.setOnClickListener(buttonSubmitListener);
        
        Button helpButton = (Button) findViewById(R.id.buttonHelp);
        helpButton.setOnClickListener(helpButtonListner);
        
    }	
}