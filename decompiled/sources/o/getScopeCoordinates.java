package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.net.zza;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getScopeCoordinates implements ServiceConnection {
    public final /* synthetic */ localLookaheadPositionOfFgt4K4Q serializer;
    public final String write;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        getLookaheadDelegate getlookaheaddelegate = this.serializer.RemoteActionCompatParcelizer.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Install Referrer Service disconnected");
    }

    public getScopeCoordinates(localLookaheadPositionOfFgt4K4Q locallookaheadpositionoffgt4k4q, String str) {
        Objects.requireNonNull(locallookaheadpositionoffgt4k4q);
        this.serializer = locallookaheadpositionoffgt4k4q;
        this.write = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        localLookaheadPositionOfFgt4K4Q locallookaheadpositionoffgt4k4q = this.serializer;
        if (iBinder == null) {
            getLookaheadDelegate getlookaheaddelegate = locallookaheadpositionoffgt4k4q.RemoteActionCompatParcelizer.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = getPowerEK5gGoQ.read;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            getPeriodEK5gGoQ getpoundek5ggoq = iInterfaceQueryLocalInterface instanceof getPeriodEK5gGoQ ? (getPeriodEK5gGoQ) iInterfaceQueryLocalInterface : new getPoundEK5gGoQ(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = locallookaheadpositionoffgt4k4q.RemoteActionCompatParcelizer;
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Install Referrer Service connected");
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new zza(this, getpoundek5ggoq, this));
        } catch (RuntimeException e) {
            getLookaheadDelegate getlookaheaddelegate3 = locallookaheadpositionoffgt4k4q.RemoteActionCompatParcelizer.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.MediaSessionCompatQueueItem.serializer(e, "Exception occurred while calling Install Referrer API");
        }
    }
}
