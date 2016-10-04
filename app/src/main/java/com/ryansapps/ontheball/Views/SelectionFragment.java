package com.ryansapps.ontheball.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ryansapps.ontheball.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author ryan
 */
public class SelectionFragment extends Fragment {

    @BindView(R.id.qb_btn) Button qb_btn;
    @BindView(R.id.rb_btn) Button rb_btn;
    @BindView(R.id.wr_btn) Button wr_btn;
    @BindView(R.id.te_btn) Button te_btn;
    @BindView(R.id.def_btn) Button def_btn;
    @BindView(R.id.k_btn) Button k_btn;
    private View view;
    private static String TAG = "SelectionFragment";
    public static Bundle myBundle = new Bundle();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_selection, container, false);
        ButterKnife.bind(this, view);
        initControls();
        return view;
    }

    private void initControls() {
        qb_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectionFragment.myBundle.putString("user_selection", String.valueOf(qb_btn.getText()));
                initFragment();
            }
        });
        rb_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectionFragment.myBundle.putString("user_selection", String.valueOf(rb_btn.getText()));
                initFragment();
            }
        });
        wr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectionFragment.myBundle.putString("user_selection", String.valueOf(wr_btn.getText()));
                initFragment();
            }
        });
        te_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectionFragment.myBundle.putString("user_selection", String.valueOf(te_btn.getText()));
                initFragment();
            }
        });
        def_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectionFragment.myBundle.putString("user_selection", String.valueOf(def_btn.getText()));
                initFragment();
            }
        });
        //todo Kicker endpoint?
        k_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SelectionFragment.myBundle.putString("user_selection", String.valueOf(k_btn.getText()));
                //initFragment();
            }
        });
    }

    private void initFragment() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        FantasyListFragment fragment = new FantasyListFragment();
        transaction.addToBackStack(TAG);
        transaction.replace(R.id.contentMain, fragment).commit();
    }
}
