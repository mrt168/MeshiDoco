package jp.growui.meshidoco.Fragment;

import java.util.ArrayList;

import jp.growui.meshidoco.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by kokies on 2014/06/14.
 */
public class FragmentSelectOne extends FragmentSelects {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_select_one, container,
				false);
		LinearLayout leftLayout = (LinearLayout) v
				.findViewById(R.id.select_one_food_left_list);
		LinearLayout rightLayout = (LinearLayout) v
				.findViewById(R.id.select_one_food_right_list);
		makeFoodList(leftLayout, rightLayout, testImages());
		return v;
	}

	private ArrayList<ImageView> testImages() {
		ArrayList<ImageView> images = new ArrayList<ImageView>();
		for (int i = 0; i < 10; i++) {
			ImageView image = new ImageView(getActivity());
			if (i == 1 || i == 4 || i == 7) {
				image.setImageResource(R.drawable.kagemaru);
			} else {
				image.setImageResource(R.drawable.curry);
			}
			images.add(image);
		}
		return images;
	}
}
