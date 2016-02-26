package in.srain.cube.views.ptr.demo.ui.classic;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import in.srain.cube.mints.base.TitleBaseFragment;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrUIHandler;
import in.srain.cube.views.ptr.demo.R;
import in.srain.cube.views.ptr.indicator.PtrIndicator;

public class EvenOnlyATextView extends TitleBaseFragment {

    private View header;

    public View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setHeaderTitle(R.string.ptr_demo_block_only_text_view);

        final View contentView = inflater.inflate(R.layout.fragment_classic_header_with_textview, container, false);

        final PtrClassicFrameLayout ptrFrame = (PtrClassicFrameLayout) contentView.findViewById(R.id.fragment_rotate_header_with_text_view_frame);
        ptrFrame.setLastUpdateTimeRelateObject(this);
//             header =  View.inflate(getActivity(),R.layout.pull_to_refresh_header_vertical,null);
        LayoutInflater inflater1=(LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         header=inflater1.inflate(R.layout.pull_to_refresh_header_vertical,ptrFrame,true);
        ptrFrame.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ptrFrame.refreshComplete();
                    }
                }, 3000);
            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return true;
            }
        });


        return contentView;
    }

    public class MyHeader implements PtrUIHandler {

        @Override
        public void onUIReset(PtrFrameLayout frame) {
            frame.addView(header);
        }

        @Override
        public void onUIRefreshPrepare(PtrFrameLayout frame) {
            frame.addView(header);
        }

        @Override
        public void onUIRefreshBegin(PtrFrameLayout frame) {
            frame.addView(header);
        }

        @Override
        public void onUIRefreshComplete(PtrFrameLayout frame) {
            frame.addView(header);
        }

        @Override
        public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {
            frame.addView(header);
        }
    }

}
