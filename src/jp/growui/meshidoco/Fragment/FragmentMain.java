package jp.growui.meshidoco.Fragment;

import jp.growui.meshidoco.R;
import jp.growui.meshidoco.SelectOneActivity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kokies on 2014/06/14.
 */
public class FragmentMain extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View v = inflater.inflate(R.layout.fragment_main, container, false);
    	Button startBtn = (Button)v.findViewById(R.id.main_btn_start);
    	startBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(), SelectOneActivity.class);
				startActivity(intent);
			}
		});
        return v;
    }
}
