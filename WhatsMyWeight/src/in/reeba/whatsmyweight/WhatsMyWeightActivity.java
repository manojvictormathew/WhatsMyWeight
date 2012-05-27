package in.reeba.whatsmyweight;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class WhatsMyWeightActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView textAskWeight = (TextView) findViewById(R.id.textAskWeight);
        textAskWeight.setText(R.string.askforWeight);
        
    }
}