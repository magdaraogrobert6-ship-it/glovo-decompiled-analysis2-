package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetStem2cp implements DialogInterface.OnClickListener {
    public abstract void read();

    public static accessgetStem3cp serializer(Intent intent, accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp) {
        return new accessgetStem3cp(intent, accessgetnumpadleftparenthesiscp);
    }

    public static accessgetSleepcp read(androidx.fragment.app.Fragment fragment, Intent intent, int i) {
        return new accessgetSleepcp(intent, fragment, i, 1);
    }

    public static accessgetSleepcp serializer(Activity activity, Intent intent, int i) {
        return new accessgetSleepcp(intent, activity, i, 0);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                read();
            } catch (ActivityNotFoundException e) {
                SentryLogcatAdapter.read("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
