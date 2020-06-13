package accheast.wallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	Animation blink;
	ImageView viewOpen;	
	Boolean walletStatus = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		blink = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.blink);
		viewOpen = (ImageView) findViewById(R.id.imageView1);
		viewOpen.setAnimation(blink);
	}
	
	
	public void openWallet(View v){
		if(walletStatus){
			viewOpen.setImageResource(R.drawable.closed);	
			walletStatus = false;
		}else{
			viewOpen.setImageResource(R.drawable.open);	
			walletStatus = true;
		}
	}
}
