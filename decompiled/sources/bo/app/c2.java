package bo.app;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final Double a(c2 c2Var, Location location) {
        c2Var.getClass();
        if (location.hasVerticalAccuracy()) {
            return Double.valueOf(location.getVerticalAccuracyMeters());
        }
        return null;
    }
}
