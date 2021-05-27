package ss.APPwithoutLayoutFile;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import ss.APPwithoutLayoutFile.MainActivity;

public class MainActivity extends Activity {
	LinearLayout layout;
	Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

		layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setGravity(Gravity.CENTER);
		layout.setPadding(25, 25, 25, 25);

		button = new Button(this);
		button.setText("Hello World !");
		button.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View view) {
					Toast.makeText(
						MainActivity.this,
						"You Clicked : " + ((Button)view).getText().toString(),
						Toast.LENGTH_SHORT
					).show();
				}
			});

		layout.addView(button);
		setContentView(layout);
	}
}
// © https://github.com/ShivaShirsath
