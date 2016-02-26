package in.srain.cube.views.ptr.demo.ui.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrUIHandler;
import in.srain.cube.views.ptr.demo.R;
import in.srain.cube.views.ptr.indicator.PtrIndicator;

/**
 * Created by Pony on 2016/2/26.
 */
public class LiaopenghuiDefaultHeader extends FrameLayout implements PtrUIHandler {


    private ImageView imageView;
    private ImageView imageView1;

    public LiaopenghuiDefaultHeader(Context context) {
        super(context);
        initViews(null);
    }

    public LiaopenghuiDefaultHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LiaopenghuiDefaultHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void initViews(AttributeSet attrs) {
        TypedArray arr = getContext().obtainStyledAttributes(attrs, in.srain.cube.views.ptr.R.styleable.PtrClassicHeader, 0, 0);

        View header = LayoutInflater.from(getContext()).inflate(R.layout.pull_to_refresh_header_vertical, this);
         imageView = (ImageView) header.findViewById(R.id.pull_to_refresh_image);
         imageView1 = (ImageView) header.findViewById(R.id.pull_to_refresh_image1);

    }



    @Override
    public void onUIReset(PtrFrameLayout frame) {
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame) {
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.VISIBLE);
    }
}
