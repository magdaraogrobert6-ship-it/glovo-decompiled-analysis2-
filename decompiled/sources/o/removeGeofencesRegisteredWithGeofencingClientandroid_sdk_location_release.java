package o;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release {
    public static ReportedVideoQualityNotSupportedQuirk IconCompatParcelizer() {
        if (getDefaultViewModelCreationExtras.IconCompatParcelizer != null) {
            return getDefaultViewModelCreationExtras.IconCompatParcelizer;
        }
        synchronized (getDefaultViewModelCreationExtras.class) {
            if (getDefaultViewModelCreationExtras.IconCompatParcelizer == null) {
                getDefaultViewModelCreationExtras.IconCompatParcelizer = new ReportedVideoQualityNotSupportedQuirk(new Handler(Looper.getMainLooper()));
            }
        }
        return getDefaultViewModelCreationExtras.IconCompatParcelizer;
    }

    public static minHeight RemoteActionCompatParcelizer() {
        if (minHeight.IconCompatParcelizer != null) {
            return minHeight.IconCompatParcelizer;
        }
        synchronized (minHeight.class) {
            if (minHeight.IconCompatParcelizer == null) {
                minHeight.IconCompatParcelizer = new minHeight(1);
            }
        }
        return minHeight.IconCompatParcelizer;
    }

    public static accessgetSubCompositionViewjd read() {
        if (accessgetSubCompositionViewjd.IconCompatParcelizer != null) {
            return accessgetSubCompositionViewjd.IconCompatParcelizer;
        }
        synchronized (accessgetSubCompositionViewjd.class) {
            if (accessgetSubCompositionViewjd.IconCompatParcelizer == null) {
                accessgetSubCompositionViewjd.IconCompatParcelizer = new accessgetSubCompositionViewjd(1);
            }
        }
        return accessgetSubCompositionViewjd.IconCompatParcelizer;
    }

    public static getInternalPopup write() {
        if (getInternalPopup.write != null) {
            return getInternalPopup.write;
        }
        synchronized (getInternalPopup.class) {
            if (getInternalPopup.write == null) {
                getInternalPopup.write = new getInternalPopup(2);
            }
        }
        return getInternalPopup.write;
    }

    public static final Float read(com.sentiance.sdk.util.c cVar, String str) {
        if (cVar.write(str)) {
            return Float.valueOf(cVar.read(-1.0f, str));
        }
        return null;
    }
}
