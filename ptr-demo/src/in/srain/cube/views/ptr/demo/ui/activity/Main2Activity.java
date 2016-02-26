package in.srain.cube.views.ptr.demo.ui.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import in.srain.cube.util.LocalDisplay;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.demo.R;
import in.srain.cube.views.ptr.demo.ui.header.LiaopenghuiDefaultHeader;
import in.srain.cube.views.ptr.demo.ui.header.RentalsSunHeaderView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final PtrFrameLayout frame1 = (PtrFrameLayout) findViewById(R.id.fragment_rotate_header_with_text_view_frame1);
        final LiaopenghuiDefaultHeader header = new LiaopenghuiDefaultHeader(this);



        frame1.setLoadingMinTime(1000);
        frame1.setDurationToCloseHeader(1500);
        frame1.setHeaderView(header);
        frame1.addPtrUIHandler(header);
        frame1.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                frame.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        frame1.refreshComplete();
                    }
                }, 3000);
            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return true;
            }
        });

    }}