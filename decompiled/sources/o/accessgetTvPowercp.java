package o;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvPowercp extends getBackEK5gGoQ {
    public final /* synthetic */ GoogleApiAvailability IconCompatParcelizer;
    public final Context write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetTvPowercp(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.IconCompatParcelizer = googleApiAvailability;
        this.write = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            SentryLogcatAdapter.IconCompatParcelizer("GoogleApiAvailability", sb.toString());
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.IconCompatParcelizer;
        Context context = this.write;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            googleApiAvailability.showErrorNotification(context, iIsGooglePlayServicesAvailable);
        }
    }
}
