package o;

import android.content.Context;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class StringUtils extends r8lambdamu6J4Yd9XJP2687am3_xsruOrj4 {
    public final Rstyleable serializer;
    public Context write;

    @Override // o.r8lambdamu6J4Yd9XJP2687am3_xsruOrj4
    public final coil3.util.UtilsKt serializer() {
        return this.serializer;
    }

    @Override // o.r8lambdamu6J4Yd9XJP2687am3_xsruOrj4, coil3.util.UtilsKt
    public final wouldPushPermissionPromptDisplaylambda2 read() {
        return new r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo(this.serializer.read(), this.write);
    }

    public StringUtils(Rstyleable rstyleable) {
        this.serializer = rstyleable;
    }

    static {
        try {
            try {
                ((wouldPushPermissionPromptDisplaylambda5) r8lambda1h84ZU_cAR0h79mqUcr2O580IzE.class.asSubclass(wouldPushPermissionPromptDisplaylambda5.class).getConstructor(null).newInstance(null)).getClass();
            } catch (Exception e) {
                SentryLogcatAdapter.write("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
            }
        } catch (ClassCastException e2) {
            SentryLogcatAdapter.write("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
        }
    }
}
