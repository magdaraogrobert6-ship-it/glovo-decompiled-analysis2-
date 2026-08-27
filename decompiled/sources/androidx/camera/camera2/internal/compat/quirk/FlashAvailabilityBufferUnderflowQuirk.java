package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements CameraUpdateException {
    public static final HashSet write;

    static {
        HashSet hashSet = new HashSet();
        write = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
