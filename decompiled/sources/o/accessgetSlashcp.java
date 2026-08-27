package o;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSlashcp extends accessgetNumPad7cp {
    public static final accessgetNumLockcp IconCompatParcelizer = new accessgetNumLockcp("ClientTelemetry.API", new onSizeChanged(5), new io.sentry.hints.PlaybackStateCompatCustomAction(8));

    public final zzw serializer(TelemetryData telemetryData) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zad.serializer};
        taskApiCall$BuilderIconCompatParcelizer.IconCompatParcelizer = true;
        taskApiCall$BuilderIconCompatParcelizer.serializer = false;
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new getExponentimpl(23, telemetryData);
        return read(2, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    public accessgetSlashcp(Context context, Activity activity, accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, accessgetNumPad8cp accessgetnumpad8cp) {
        super(context, activity, accessgetnumlockcp, accessgetnumpad2cp, accessgetnumpad8cp);
    }
}
