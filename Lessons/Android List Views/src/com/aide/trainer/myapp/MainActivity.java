package com.aide.trainer.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        
        // Set main.xml as user interface layout
        setContentView(R.layout.main);
        
        String[] companies = new String[] { "Google", "Apple", "Facebook",
        	"Blackberry", "Samsung", "Twitter", "Intel", "HTC", "Asus" };
        	
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple list item1, companies);
        
    }
}
