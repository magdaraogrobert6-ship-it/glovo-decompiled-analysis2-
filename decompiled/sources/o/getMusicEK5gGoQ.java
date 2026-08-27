package o;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class getMusicEK5gGoQ extends accessgetNumPad7cp implements SettingsClient {
    public getMusicEK5gGoQ(Activity activity) {
        super(activity, activity, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }

    @Override // com.google.android.gms.location.SettingsClient
    public final Task isGoogleLocationAccuracyEnabled() {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = com.huawei.hmf.tasks.a.j.read;
        taskApiCall$BuilderIconCompatParcelizer.write = 2444;
        taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zzo.zzm};
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    @Override // com.google.android.gms.location.SettingsClient
    public final Task checkLocationSettings(LocationSettingsRequest locationSettingsRequest) {
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new PinnableContainerKtLocalPinnableContainer1(1, locationSettingsRequest);
        taskApiCall$BuilderIconCompatParcelizer.write = 2426;
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    public getMusicEK5gGoQ(Context context) {
        super(context, null, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }
}
