package o;

import android.app.ActivityManager;
import android.content.Context;
import coil3.Extras$Key;

/* JADX INFO: loaded from: classes.dex */
public final class configurePaint2qPWKa0 {
    public final float IconCompatParcelizer;
    public final Context RemoteActionCompatParcelizer;
    public final Extras$Key read;
    public final ActivityManager serializer;

    public configurePaint2qPWKa0(Context context) {
        this.IconCompatParcelizer = 1.0f;
        this.RemoteActionCompatParcelizer = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.serializer = activityManager;
        this.read = new Extras$Key(14, context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.IconCompatParcelizer = 0.0f;
        }
    }
}
