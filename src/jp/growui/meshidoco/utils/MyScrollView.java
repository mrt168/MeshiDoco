package jp.growui.meshidoco.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView {
	

    public interface ScrollToBottomListener {
        void onScrollToBottom(MyScrollView scrollView);
    }
    private ScrollToBottomListener scrollToBottomListener;
    public interface ScrollToDownListener {
    	void onScrollToDown(MyScrollView scrollView,int loadCount,boolean isUpSide);
    }
    private ScrollToDownListener scrollToDownListener;
    private int scrollBottomMargin = 0;

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defs) {
        super(context, attrs, defs);
    }

    public void setScrollToBottomListener(ScrollToBottomListener listener) {
        this.scrollToBottomListener = listener;
    }
    
    public void setScrollToDownListener(ScrollToDownListener listener) {
        this.scrollToDownListener = listener;
    }

    public void setScrollBottomMargin(int value) {
        this.scrollBottomMargin = value;
    }
    int loadCount = 0;
    int gifHeight = 0;
    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
//        LinearLayout content = (LinearLayout) getChildAt(0);
//        if (scrollToBottomListener == null) return;
//        if (content == null) return;
//        if (y + this.getHeight() >= content.getHeight() - scrollBottomMargin) {
//            scrollToBottomListener.onScrollToBottom(this);
//        }
//        if(content.getChildCount()==0)return;
//        if(gifHeight==0){
//        	gifHeight = content.getChildAt(0).getHeight();
//        }
//        if(scrollToDownListener == null)return;
//        if(y>=gifHeight*(CommonUtils.SCROLL_SWITCH+CommonUtils.VIEW_GIF_MAX*loadCount)){
//        	scrollToDownListener.onScrollToDown(this,loadCount,true);
//        	loadCount++;
//        	Log.d("scrollLog", "type:down,loadCount:"+loadCount);
//        }
//        if(loadCount==0)return;
//        if(y<=gifHeight*(CommonUtils.SCROLL_SWITCH+CommonUtils.VIEW_GIF_MAX*(loadCount-1))){
//        	scrollToDownListener.onScrollToDown(this, loadCount,false);
//        	loadCount--;
//        	Log.d("scrollLog", "type:up,loadCount:"+loadCount);
//        }
    }
    
}