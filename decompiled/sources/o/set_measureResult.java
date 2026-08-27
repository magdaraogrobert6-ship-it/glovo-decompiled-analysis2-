package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: loaded from: classes2.dex */
public final class set_measureResult {
    public final CrashlyticsCore serializer;

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        CrashlyticsCore crashlyticsCore = this.serializer;
        crashlyticsCore.RatingCompat.read.serializer(new accessgetAlpha8cp(crashlyticsCore, str, str2, 5));
    }

    public set_measureResult(CrashlyticsCore crashlyticsCore) {
        this.serializer = crashlyticsCore;
    }

    public static set_measureResult read() {
        set_measureResult set_measureresult = (set_measureResult) FirebaseApp.write().write(set_measureResult.class);
        if (set_measureresult != null) {
            return set_measureresult;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("FirebaseCrashlytics component is not present.");
        return null;
    }
}
