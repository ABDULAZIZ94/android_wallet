package accheast.wallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {
	Animation blink;
	ImageView viewOpen;	
	Boolean walletStatus = false;
	private ListView mDrawerList;
	private ArrayAdapter<String> mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sidebar);
		
		mDrawerList = (ListView)findViewById(R.id.navList);
		blink = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.blink);
		//viewOpen = (ImageView) findViewById(R.id.imageView1);
		//viewOpen.setAnimation(blink);
		addDrawerItems();
	}
	
	
	public void openWallet(View v){
		if(walletStatus){
			//viewOpen.setImageResource(R.drawable.closed);
			//viewOpen.setAnimation(blink);
			//walletStatus = false;
		}else{
			//viewOpen.setImageResource(R.drawable.open);	
			//viewOpen.setAnimation(null);
			//walletStatus = true;
		}
	}

	private void addDrawerItems() {
		
	    String[] osArray = { "Android", "iOS", "Windows", "OS X", "Linux" };
	    mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
	    mDrawerList.setAdapter(mAdapter);
	}
}
