package o;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class component10 {
    public static boolean RemoteActionCompatParcelizer(io.sentry.rrweb.MediaDescriptionCompat mediaDescriptionCompat, String str, getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        if (!str.equals("source")) {
            return false;
        }
        io.sentry.rrweb.MediaMetadataCompat mediaMetadataCompat = (io.sentry.rrweb.MediaMetadataCompat) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(7));
        setNativeShader.read(mediaMetadataCompat, "");
        mediaDescriptionCompat.RemoteActionCompatParcelizer = mediaMetadataCompat;
        return true;
    }

    public static void write(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
