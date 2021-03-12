package com.frostdev.frostmessenger.ActivityHierarchy;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.frostdev.frostmessenger.FrostMessenger;

@SuppressLint("Registered")
public class LoggedFrostActivity extends FrostActivity {
    private FrostMessenger application;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (FrostMessenger) getApplication();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // application.updateUserStatus(ONLINE);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // application.disconnectUserDelayed();
        // application.storeUserInfo();
    }
}
