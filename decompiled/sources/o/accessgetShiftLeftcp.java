package o;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetShiftLeftcp extends accessgetNumPad7cp implements accessgetSoftLeftcp {
    public static final accessgetNumLockcp IconCompatParcelizer = new accessgetNumLockcp("ClientNotification.API", new onSizeChanged(4), new io.sentry.hints.PlaybackStateCompatCustomAction(8));

    public accessgetShiftLeftcp(Context context) {
        super(context, null, IconCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }

    public final zzw RemoteActionCompatParcelizer(zab zabVar) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zad.RemoteActionCompatParcelizer};
        taskApiCall$BuilderIconCompatParcelizer.IconCompatParcelizer = true;
        taskApiCall$BuilderIconCompatParcelizer.serializer = false;
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new getExponentimpl(22, zabVar);
        return read(2, taskApiCall$BuilderIconCompatParcelizer.read());
    }
}
