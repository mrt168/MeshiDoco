package jp.growui.meshidoco.Fragment;

import java.util.ArrayList;

import jp.growui.meshidoco.R;
import android.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by kokies on 2014/06/14.
 */
public class FragmentSelects extends Fragment {

	protected void makeFoodList(LinearLayout leftLayout,
			LinearLayout rightLayout, ArrayList<ImageView> images) {
		for (int i = 0; i < images.size(); i++) {
			if (i % 2 == 0) {
				leftLayout.addView(images.get(i));
			}else{
				rightLayout.addView(images.get(i));
			}
		}
	}

}
