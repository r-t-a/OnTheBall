package com.ryansapps.ontheball.Listeners;

import android.view.View;

/**
 * @author ryan
 */
public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
