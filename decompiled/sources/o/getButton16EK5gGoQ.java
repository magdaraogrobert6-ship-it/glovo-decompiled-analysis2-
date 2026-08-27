package o;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzc;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.ArrayList;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton16EK5gGoQ implements Runnable, getF3EK5gGoQ {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ getButton6EK5gGoQ write;

    public /* synthetic */ getButton16EK5gGoQ(getButton6EK5gGoQ getbutton6ek5ggoq, int i) {
        this.serializer = i;
        this.write = getbutton6ek5ggoq;
    }

    @Override // o.getF3EK5gGoQ
    public void IconCompatParcelizer(getF5EK5gGoQ getf5ek5ggoq) {
        Status status = getf5ek5ggoq.read;
        Status status2 = Status.IconCompatParcelizer;
        getButton6EK5gGoQ getbutton6ek5ggoq = this.write;
        if (status != status2) {
            getButton6EK5gGoQ.IconCompatParcelizer(getbutton6ek5ggoq, getbutton6ek5ggoq.MediaSessionCompatToken.IconCompatParcelizer(600000L, CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) + 3600000);
            return;
        }
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite3, -1921293486)).booleanValue();
        getbutton6ek5ggoq.MediaMetadataCompat.execute(new zzc(getbutton6ek5ggoq, getf5ek5ggoq, false, 9));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        if (i == 0) {
            getButton6EK5gGoQ getbutton6ek5ggoq = this.write;
            if (getbutton6ek5ggoq.ParcelableVolumeInfo == 2) {
                getButton7EK5gGoQ.write(getbutton6ek5ggoq.PlaybackStateCompatCustomAction.serializer);
                if (getCameraEK5gGoQ.write == null) {
                    getCameraEK5gGoQ.write = new getCameraEK5gGoQ();
                }
                getCameraEK5gGoQ.write.write();
                return;
            }
            return;
        }
        if (i != 1) {
            getButton6EK5gGoQ getbutton6ek5ggoq2 = this.write;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getbutton6ek5ggoq2.ParcelableVolumeInfo == 2);
            getCalendarEK5gGoQ getcalendarek5ggoqIconCompatParcelizer = getCalendarEK5gGoQ.IconCompatParcelizer();
            String str = getbutton6ek5ggoq2.read;
            if (getcalendarek5ggoqIconCompatParcelizer.serializer == 2 && getcalendarek5ggoqIconCompatParcelizer.write.equals(str)) {
                return;
            }
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            getbutton6ek5ggoq2.MediaSessionCompatQueueItem.read(getbutton6ek5ggoq2.read, getbutton6ek5ggoq2.RemoteActionCompatParcelizer, getbutton6ek5ggoq2.serializer, arrayList, this, getbutton6ek5ggoq2.MediaSessionCompatToken);
            return;
        }
        getButton6EK5gGoQ getbutton6ek5ggoq3 = this.write;
        getbutton6ek5ggoq3.ParcelableVolumeInfo = 3;
        getButtonThumbLeftEK5gGoQ.serializer("Container " + getbutton6ek5ggoq3.read + " loading failed.");
        ArrayList<getButton3EK5gGoQ> arrayList2 = getbutton6ek5ggoq3.PlaybackStateCompat;
        if (arrayList2 != null) {
            for (getButton3EK5gGoQ getbutton3ek5ggoq : arrayList2) {
                if (getbutton3ek5ggoq.MediaMetadataCompat) {
                    try {
                        getbutton6ek5ggoq3.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getbutton3ek5ggoq.RemoteActionCompatParcelizer.getTime(), getbutton3ek5ggoq.write, "app", getbutton3ek5ggoq.serializer);
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    } catch (RemoteException e) {
                        getButton5EK5gGoQ.IconCompatParcelizer("Error logging event with measurement proxy:", e, this.write.IconCompatParcelizer);
                    }
                } else {
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                }
            }
            this.write.PlaybackStateCompat = null;
        }
    }
}
