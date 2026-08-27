package o;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetPendingVerticalScrollEventsp implements boundsInScreen {
    public final Bundle write;

    @Override // o.boundsInScreen
    public final Object updateSettings(ShortNewsContentCardView shortNewsContentCardView) {
        return createFromParcel.INSTANCE;
    }

    public accessgetPendingVerticalScrollEventsp(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), androidx.compose.ui.graphics.Fields.SpotShadowColor).metaData;
        this.write = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // o.boundsInScreen
    public final Double IconCompatParcelizer() {
        Bundle bundle = this.write;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // o.boundsInScreen
    public final BrazeInAppMessageManagerExternalSyntheticLambda2 RemoteActionCompatParcelizer() {
        Bundle bundle = this.write;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new BrazeInAppMessageManagerExternalSyntheticLambda2(coil3.UriKt.RemoteActionCompatParcelizer(bundle.getInt("firebase_sessions_sessions_restart_timeout"), setUnregisteredInAppMessage.SECONDS));
        }
        return null;
    }

    @Override // o.boundsInScreen
    public final Boolean write() {
        Bundle bundle = this.write;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }
}
