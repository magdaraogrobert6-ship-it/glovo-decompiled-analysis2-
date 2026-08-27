package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetTransparentcp {
    public static getNetworkModule serializer(String str) {
        if (str.equals("SHA-256")) {
            return TranslationsENABLEDCompanion.read;
        }
        if (str.equals("SHA-512")) {
            return TranslationsENABLEDCompanion.serializer;
        }
        if (str.equals("SHAKE128")) {
            return TranslationsENABLEDCompanion.MediaDescriptionCompat;
        }
        if (str.equals("SHAKE256")) {
            return TranslationsENABLEDCompanion.MediaMetadataCompat;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unrecognized digest: ".concat(str));
        return null;
    }

    public static final long RemoteActionCompatParcelizer() {
        return Thread.currentThread().getId();
    }
}
