package o;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class reportFullyDrawn {
    public static OnBackInvokedDispatcher T_(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static void serializer(Object obj, Object obj2) {
        getTrackDrawable.al_(obj).unregisterOnBackInvokedCallback(getTrackDrawable.ak_(obj2));
    }

    public static OnBackInvokedCallback U_(Object obj, startActivityForResult startactivityforresult) {
        Objects.requireNonNull(startactivityforresult);
        getAutoSizeTextAvailableSizes getautosizetextavailablesizes = new getAutoSizeTextAvailableSizes(1, startactivityforresult);
        getTrackDrawable.al_(obj).registerOnBackInvokedCallback(1000000, getautosizetextavailablesizes);
        return getautosizetextavailablesizes;
    }
}
