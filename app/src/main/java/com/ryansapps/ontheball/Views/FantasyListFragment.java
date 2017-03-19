package com.ryansapps.ontheball.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ryansapps.ontheball.Adapter.PlayerAdapter;
import com.ryansapps.ontheball.Listeners.ClickListener;
import com.ryansapps.ontheball.Listeners.RecyclerTouchListener;
import com.ryansapps.ontheball.Model.Players;
import com.ryansapps.ontheball.Model.Projections;
import com.ryansapps.ontheball.R;
import com.ryansapps.ontheball.Rest;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author ryan
 */
public class FantasyListFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    List<Players> players = new ArrayList<>();
    private ClickListener clickListener;
    private static String TAG = "FantasyListFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_fantasy_list, container, false);
        initViews();
        loadJson();
        return view;
    }

    private void initViews() {
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(view.getContext(), recyclerView, clickListener = new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Players player = players.get(position);
                initFragment(player);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    private void loadJson() {

        Rest.INSTANCE.api().getDraftProjections(getSelection()).enqueue(new Callback<Projections>() {
            @Override public void onResponse(Call<Projections> call, Response<Projections> response) {
                if(response.isSuccess()) {
                    players = response.body().getResults();
                    recyclerView.setAdapter(new PlayerAdapter(players, R.layout.player_list_row, view.getContext()));
                } else {
                    int statusCode = response.code();
                    Log.i(TAG, "" + statusCode);
                }
            }

            @Override public void onFailure(Call<Projections> call, Throwable t) {
                Log.i(TAG, "" + call.toString() + " " + t.toString());
            }
        });
    }

    private String getSelection() {
        return String.valueOf(SelectionFragment.myBundle.get("user_selection"));
    }

    private void initFragment(Players player) {
        Bundle bundle = new Bundle();
        PlayerPageFragment playerPageFragment = new PlayerPageFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        bundle.putSerializable("playerInfo", player);
        playerPageFragment.setArguments(bundle);
        transaction.addToBackStack(TAG);
        transaction.replace(R.id.content_main, playerPageFragment).commit();
    }


}
