package com.kids21.sharephoto.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.kids21.sharephoto.R;

public class UserInfo extends Activity {

	private Button editer;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
      setContentView(R.layout.user_info);
      
    //初始话视图控件
    		this.initView();
        
    }

    private void initView(){
    	editer = (Button)findViewById(R.id.user_info_editer);
    	editer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				CharSequence[] items = {
						getString(R.string.img_from_album),
						getString(R.string.img_from_camera)
				};
				
			}
		});
    }
   
}
