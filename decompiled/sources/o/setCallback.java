package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class setCallback implements ServiceConnection, accessgetRocp, accessgetRightBracketcp {
    public volatile current IconCompatParcelizer;
    public volatile boolean read;
    public final /* synthetic */ setViewportBounds serializer;

    @Override // o.accessgetRocp
    public final void RemoteActionCompatParcelizer() {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatQueueItem();
        synchronized (this) {
            boolean z = false;
            try {
                accessgetSystemNavigationDowncp.IconCompatParcelizer(this.IconCompatParcelizer);
                isComplete iscomplete = (isComplete) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
                lookaheadScopeKtLookaheadScope5.write((Runnable) new zzc(this, iscomplete, z, 16));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.IconCompatParcelizer = null;
                this.read = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatQueueItem();
        synchronized (this) {
            boolean z = false;
            if (iBinder == null) {
                this.read = false;
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Service connected with null binder");
                return;
            }
            Object layoutNodeSubcompositionsStateprecomposePaused1 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    layoutNodeSubcompositionsStateprecomposePaused1 = iInterfaceQueryLocalInterface instanceof isComplete ? (isComplete) iInterfaceQueryLocalInterface : new LayoutNodeSubcompositionsStateprecomposePaused1(iBinder);
                    getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Bound to IMeasurementService interface");
                } else {
                    getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.serializer.serializer(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                getlookaheaddelegate4.serializer.RemoteActionCompatParcelizer("Service connect failed to get IMeasurementService");
            }
            if (layoutNodeSubcompositionsStateprecomposePaused1 == null) {
                this.read = false;
                try {
                    accessgetTvAudioDescriptionMixingVolumeUpcp accessgettvaudiodescriptionmixingvolumeupcpRemoteActionCompatParcelizer = accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer();
                    setViewportBounds setviewportbounds = this.serializer;
                    accessgettvaudiodescriptionmixingvolumeupcpRemoteActionCompatParcelizer.IconCompatParcelizer(((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat, setviewportbounds.serializer);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
                lookaheadScopeKtLookaheadScope5.write((Runnable) new zza(this, layoutNodeSubcompositionsStateprecomposePaused1, z, 19));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatQueueItem();
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Service disconnected");
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        lookaheadScopeKtLookaheadScope5.write((Runnable) new zza(this, componentName, false, 20));
    }

    @Override // o.accessgetRightBracketcp
    public final void read(ConnectionResult connectionResult) {
        boolean z;
        setViewportBounds setviewportbounds = this.serializer;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatQueueItem();
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        if (getlookaheaddelegate == null || !getlookaheaddelegate.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            getlookaheaddelegate = null;
        }
        if (getlookaheaddelegate != null) {
            getlookaheaddelegate.PlaybackStateCompat.serializer(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            z = false;
            this.read = false;
            this.IconCompatParcelizer = null;
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        lookaheadScopeKtLookaheadScope5.write((Runnable) new zza(this, connectionResult, z, 21));
    }

    @Override // o.accessgetRocp
    public final void serializer(int i) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatQueueItem();
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Service connection suspended");
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        lookaheadScopeKtLookaheadScope5.write((Runnable) new com.google.android.gms.stats.zza(20, this));
    }

    public setCallback(setViewportBounds setviewportbounds) {
        this.serializer = setviewportbounds;
    }
}
