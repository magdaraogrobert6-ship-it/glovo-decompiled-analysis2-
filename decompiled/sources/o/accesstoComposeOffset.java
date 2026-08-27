package o;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class accesstoComposeOffset {
    public static int read;
    public static int write;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;

    public accesstoComposeOffset(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new subscribeToContentCardsUpdateslambda30(isopeninternalroom_runtime, application, 6));
    }

    public static int serializer() {
        int i = read;
        int i2 = i % 9030788;
        read = i + 1;
        if (i2 != 0) {
            return write;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        write = i3;
        return i3;
    }
}
