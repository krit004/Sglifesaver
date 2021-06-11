package com.example.videocallapp

import android.webkit.JavascriptInterface
import com.example.SgLifeSaver.CallActivity

class JavascriptInterface(val callActivity: CallActivity) {

    @JavascriptInterface
    public fun onPeerConnected() {
        callActivity.onPeerConnected()
    }

}