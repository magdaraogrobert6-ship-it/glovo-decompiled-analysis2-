package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class getHasAppliedWindowInsets extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("time-zone");
        try {
            DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
        } catch (IllegalArgumentException e) {
            SentryLogcatAdapter.read("joda-time-android", "Could not recognize timezone id \"" + stringExtra + "\"", e);
        }
    }
}
