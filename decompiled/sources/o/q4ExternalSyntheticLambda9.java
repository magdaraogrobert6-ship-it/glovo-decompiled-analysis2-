package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.login.presentation.router.RouterActivity;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public interface q4ExternalSyntheticLambda9 {
    static /* synthetic */ Intent write(q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, Context context, q7 q7Var, boolean z, int i) {
        int i2 = 2 % 2;
        Boolean bool = Boolean.TRUE;
        if ((i & 4) != 0) {
            bool = null;
        }
        return ((q3) q4externalsyntheticlambda9).serializer(context, q7Var, bool, null, z);
    }

    static void RemoteActionCompatParcelizer(q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, final Context context, Boolean bool, Uri uri, int i) {
        int i2 = 2 % 2;
        final Boolean bool2 = (i & 4) != 0 ? null : bool;
        final Uri uri2 = (i & 8) != 0 ? null : uri;
        final boolean z = (i & 16) == 0;
        final q3 q3Var = (q3) q4externalsyntheticlambda9;
        q3Var.getClass();
        context.getClass();
        ((TraceTimeMeasurementWithPerformanceKit) q3Var.IconCompatParcelizer).read("MainNavigator.openMainActivity", new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.q8
            private static int MediaBrowserCompatMediaItem = 0;
            private static int MediaDescriptionCompat = 1;

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = MediaDescriptionCompat + 97;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                boolean z2 = z;
                q3 q3Var2 = q3Var;
                Context context2 = context;
                if (!z2 || ((pageUp) q3Var2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer()) {
                    Timber.RemoteActionCompatParcelizer.getClass();
                    context2.startActivity(q3Var2.serializer(context2, null, bool2, uri2, false));
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Opening the router activity as the session is empty.", new Object[0]);
                    context2.getClass();
                    Intent intent = new Intent(context2, (Class<?>) RouterActivity.class);
                    intent.addFlags(268468224);
                    context2.startActivity(intent);
                    int i6 = MediaBrowserCompatMediaItem + 105;
                    MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                return createFromParcel.INSTANCE;
            }
        });
    }
}
