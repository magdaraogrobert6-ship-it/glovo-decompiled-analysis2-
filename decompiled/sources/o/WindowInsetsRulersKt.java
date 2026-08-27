package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.appupdate.internal.zzx;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowInsetsRulersKt extends WindowInsetsRulersImpl {
    public final /* synthetic */ IBinder RemoteActionCompatParcelizer;
    public final /* synthetic */ findDisplayCutouts write;

    public WindowInsetsRulersKt(findDisplayCutouts finddisplaycutouts, IBinder iBinder) {
        this.write = finddisplaycutouts;
        this.RemoteActionCompatParcelizer = iBinder;
    }

    @Override // o.WindowInsetsRulersImpl
    public final void RemoteActionCompatParcelizer() {
        getStatusBars getsystembars;
        zzx zzxVar = this.write.serializer;
        int i = getTappableElement.serializer;
        IBinder iBinder = this.RemoteActionCompatParcelizer;
        if (iBinder == null) {
            getsystembars = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            getsystembars = iInterfaceQueryLocalInterface instanceof getStatusBars ? (getStatusBars) iInterfaceQueryLocalInterface : new getSystemBars(iBinder);
        }
        zzxVar.PlaybackStateCompat = getsystembars;
        zzxVar.write.write("linkToDeath", new Object[0]);
        try {
            zzxVar.PlaybackStateCompat.asBinder().linkToDeath(zzxVar.MediaSessionCompatResultReceiverWrapper, 0);
        } catch (RemoteException e) {
            lightingOWjLjI lightingowjlji = zzxVar.write;
            Object[] objArr = new Object[0];
            lightingowjlji.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                SentryLogcatAdapter.read("PlayCore", lightingOWjLjI.IconCompatParcelizer(lightingowjlji.write, "linkToDeath failed", objArr), e);
            }
        }
        zzxVar.MediaSessionCompatQueueItem = false;
        Iterator it = zzxVar.read.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzxVar.read.clear();
    }
}
