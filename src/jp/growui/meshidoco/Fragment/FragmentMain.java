package jp.growui.meshidoco.Fragment;

import jp.growui.meshidoco.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kokies on 2014/06/14.
 */
public class FragmentMain extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	View v = inflater.inflate(R.layout.fragment_main, container, false);
        return v;
    }
}
