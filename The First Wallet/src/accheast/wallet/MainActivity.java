package accheast.wallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView viewOpen;	
	Boolean walletStatus = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewOpen = (ImageView) findViewById(R.id.imageView1);
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
