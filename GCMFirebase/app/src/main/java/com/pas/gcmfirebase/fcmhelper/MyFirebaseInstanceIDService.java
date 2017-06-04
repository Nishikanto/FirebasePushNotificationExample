package com.pas.gcmfirebase.fcmhelper;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by nishikanto on 6/3/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    String TAG = "simul";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
        //send refreshedToken to server
    }
}
