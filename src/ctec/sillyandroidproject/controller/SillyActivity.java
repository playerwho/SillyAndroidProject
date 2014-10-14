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

/**
 * Activity/ model of the sillyAndroidProject app
 * @author Austin Widmeier
 * @version 1.2 10/14/2014
 */
public class SillyActivity extends Activity 
{
	/**
	 * defines Button as appButton
	 */
	private Button appButton;
	
	/**
	 * defines text view as appText
	 */
	private TextView appText;
	
	/**
	 * defines Relativelayout as appLayout
	 */
	private RelativeLayout appLayout;
	
	/**
	 * defines ArrayList as colorList
	 */
	private ArrayList<Integer> colorList;
	
	/**
	 * when created, gives use of objects
	 */
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
	
	/**
	 * adds created colors to colorList
	 */
	public void fillTheColorList()
	{
		colorList.add(R.color.green);
		colorList.add(R.color.red);
		colorList.add(R.color.white);
		colorList.add(R.color.otherBlack);
	}
	
	/**
	 * Listener for button clicks
	 */
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
