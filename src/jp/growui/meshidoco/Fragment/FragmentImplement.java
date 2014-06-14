package jp.growui.meshidoco.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ImageView;

/**
 * Created by kokies on 2014/06/14.
 */
abstract class FragmentImplement extends Fragment {
    /*
	 * ImageView繧剃ｽ懈�
	 */
    public ImageView makeImage(int drawable,Context context) {
        ImageView img = new ImageView(context);
        img.setAdjustViewBounds(true);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
        img.setImageDrawable(context.getResources().getDrawable(drawable));
        return img;
    }

}
