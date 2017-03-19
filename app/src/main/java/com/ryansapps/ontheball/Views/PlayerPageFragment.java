package com.ryansapps.ontheball.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ryansapps.ontheball.Interface.PlayerApi;
import com.ryansapps.ontheball.Model.Players;
import com.ryansapps.ontheball.R;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author ryan
 */

public class PlayerPageFragment extends Fragment {

    @BindView(R.id.player_name_view) TextView nameView;
    @BindView(R.id.player_number_view) TextView numberView;
    @BindView(R.id.player_team_view) TextView teamView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_player_page, container, false);
        ButterKnife.bind(this, view);
        Players playerData = (Players)getArguments().getSerializable("playerInfo");
        initViews(playerData);
        return view;
    }

    private void initViews(Players playerData) {
        nameView.setText(playerData.getDisplayName().toUpperCase());
        numberView.setText(String.format("#%s", playerData.getPlayerId()));
        teamView.setText(playerData.getTeam());
    }
}
