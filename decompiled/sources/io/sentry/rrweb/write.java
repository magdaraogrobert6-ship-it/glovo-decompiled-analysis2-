package io.sentry.rrweb;

import android.view.DisplayCutout;
import java.util.List;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.getSecondArg;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public abstract class write {
    public static int IconCompatParcelizer(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static List RemoteActionCompatParcelizer(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int read(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int serializer(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int write(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static boolean read(IconCompatParcelizer iconCompatParcelizer, String str, getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        int i = 0;
        if (str.equals("type")) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new RatingCompat(i));
            setNativeShader.read(remoteActionCompatParcelizer, "");
            iconCompatParcelizer.PlaybackStateCompat = remoteActionCompatParcelizer;
            return true;
        }
        if (!str.equals("timestamp")) {
            return false;
        }
        iconCompatParcelizer.PlaybackStateCompatCustomAction = getsecondarg.MediaSessionCompatToken();
        return true;
    }
}
