package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.signin.internal.SignInClientImpl;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class onSizeChanged extends coil3.util.UtilsKt {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    @Override // coil3.util.UtilsKt
    public accessgetScp IconCompatParcelizer(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, Object obj, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp) {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            if (i == 2) {
                return new getAssistEK5gGoQ(context, looper, metricsBatchProcessor, (accessgetMusiccp) obj, (zabk) accessgetnumpad4cp, (zabk) accessgetnumpaddeletecp);
            }
            if (i == 3) {
                return new zbe(context, looper, metricsBatchProcessor, (GoogleSignInOptions) obj, (zabk) accessgetnumpad4cp, (zabk) accessgetnumpaddeletecp);
            }
            if (i == 8) {
                return new OnPlacedNode(context, looper, 185, metricsBatchProcessor, accessgetnumpad4cp, accessgetnumpaddeletecp, 0);
            }
            if (i != 9) {
                return super.IconCompatParcelizer(context, looper, metricsBatchProcessor, obj, accessgetnumpad4cp, accessgetnumpaddeletecp);
            }
            throw c8$$ExternalSyntheticOutline0.m(obj);
        }
        metricsBatchProcessor.getClass();
        Integer num = (Integer) metricsBatchProcessor.IconCompatParcelizer;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new SignInClientImpl(context, looper, metricsBatchProcessor, bundle, accessgetnumpad4cp, accessgetnumpaddeletecp);
    }

    @Override // coil3.util.UtilsKt
    public accessgetScp RemoteActionCompatParcelizer(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, Object obj, zabk zabkVar, zabk zabkVar2) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            return new accessgetZenkakuHankarucp(context, looper, 126, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        }
        if (i == 4) {
            return new accessgetShiftRightcp(context, looper, 449, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        }
        if (i == 5) {
            return new accessgetSoftSleepcp(context, looper, metricsBatchProcessor, (accessgetSevencp) obj, zabkVar, zabkVar2);
        }
        if (i == 6) {
            return new accessgetTvContentsMenucp(context, looper, 308, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        }
        if (i != 7) {
            return super.RemoteActionCompatParcelizer(context, looper, metricsBatchProcessor, obj, zabkVar, zabkVar2);
        }
        return new getNumPadAddEK5gGoQ(context, looper, 23, metricsBatchProcessor, zabkVar, zabkVar2, 0);
    }
}
