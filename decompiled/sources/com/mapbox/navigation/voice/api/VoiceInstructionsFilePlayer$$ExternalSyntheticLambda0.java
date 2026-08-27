package com.mapbox.navigation.voice.api;

import android.media.MediaPlayer;
import android.os.SystemClock;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0 implements MediaPlayer.OnErrorListener {
    public static int IconCompatParcelizer;
    public static int read;

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        LoggerProviderKt.logE("MediaPlayer error: " + i + " - extra: " + i2, "VoiceInstructionsFilePlayer");
        return false;
    }

    public static int IconCompatParcelizer() {
        int i = read;
        int i2 = i % 9413255;
        read = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        IconCompatParcelizer = iUptimeMillis;
        return iUptimeMillis;
    }
}
