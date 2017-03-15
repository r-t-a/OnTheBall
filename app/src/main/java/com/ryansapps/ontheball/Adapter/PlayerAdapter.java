package com.ryansapps.ontheball.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ryansapps.ontheball.Model.Players;
import com.ryansapps.ontheball.R;
import java.util.List;

/**
 * @author ryan
 */
public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Players> playerList;
    private int rowLayout;
    private Context context;

    public static class PlayerViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout playersLayout;
        ImageView playerIcon;
        TextView playerName;
        TextView team;

        public PlayerViewHolder(View v) {
            super(v);
            playersLayout = (RelativeLayout) v.findViewById(R.id.player_layout);
            playerIcon = (ImageView) v.findViewById(R.id.player_image);
            playerName = (TextView) v.findViewById(R.id.name);
            team = (TextView) v.findViewById(R.id.team);
        }
    }

    public PlayerAdapter(List<Players> playerList, int rowLayout, Context context) {
        this.playerList = playerList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public PlayerAdapter.PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_list_row, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {
        holder.playerName.setText(playerList.get(position).getDisplayName());
        holder.team.setText("(" + playerList.get(position).getTeam() + ")");
        holder.playerIcon.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }
}
