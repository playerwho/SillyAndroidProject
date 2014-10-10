package ctec.sillyandroidproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity 
{
	
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList;
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		//gives you access to a button or any View object
		appButton = (Button) findViewById(R.id.firstbutton);
		appText = (TextView) findViewById(R.id.sillyTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		setupListeners();
		
	}
	
	public void fillTheColorList()
	{
		colorList.add(R.color.green);
		colorList.add(R.color.red);
		colorList.add(R.color.white);
		colorList.add(R.color.otherBlack);
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				
				int randomPosition = (int) (Math.random()*colorList.size());
				appLayout.setBackgroundResource(colorList.get(randomPosition));
				appText.setTextColor(colorList.get(randomPosition));				
			}
		});
		
	}
}
