package o;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastViewport implements Runnable {
    public final /* synthetic */ zzr IconCompatParcelizer;
    public final /* synthetic */ setViewportBounds read;
    public final /* synthetic */ int write;

    public getLastViewport(setViewportBounds setviewportbounds, zzr zzrVar) {
        this.write = 3;
        this.IconCompatParcelizer = zzrVar;
        Objects.requireNonNull(setviewportbounds);
        this.read = setviewportbounds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        zzr zzrVar = this.IconCompatParcelizer;
        setViewportBounds setviewportbounds = this.read;
        if (i == 0) {
            isComplete iscomplete = setviewportbounds.write;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (iscomplete == null) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to reset data on the service: not connected to service");
                return;
            } else {
                try {
                    iscomplete.IconCompatParcelizer(zzrVar);
                } catch (RemoteException e) {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer(e, "Failed to reset data on the service: remote exception");
                }
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            }
        }
        if (i == 1) {
            isComplete iscomplete2 = setviewportbounds.write;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (iscomplete2 == null) {
                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Failed to send app backgrounded");
                return;
            }
            try {
                iscomplete2.write(zzrVar);
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            } catch (RemoteException e2) {
                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                getlookaheaddelegate4.serializer.serializer(e2, "Failed to send app backgrounded to the service");
                return;
            }
        }
        if (i != 2) {
            isComplete iscomplete3 = setviewportbounds.write;
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (iscomplete3 == null) {
                getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                getlookaheaddelegate5.serializer.RemoteActionCompatParcelizer("Failed to send consent settings to service");
                return;
            }
            try {
                iscomplete3.MediaSessionCompatQueueItem(zzrVar);
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            } catch (RemoteException e3) {
                getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                getlookaheaddelegate6.serializer.serializer(e3, "Failed to send consent settings to the service");
                return;
            }
        }
        isComplete iscomplete4 = setviewportbounds.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (iscomplete4 == null) {
            getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
            getlookaheaddelegate7.serializer.RemoteActionCompatParcelizer("Failed to send measurementEnabled to service");
            return;
        }
        try {
            iscomplete4.RemoteActionCompatParcelizer(zzrVar);
            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } catch (RemoteException e4) {
            getLookaheadDelegate getlookaheaddelegate8 = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
            getlookaheaddelegate8.serializer.serializer(e4, "Failed to send measurementEnabled to the service");
        }
    }

    public /* synthetic */ getLastViewport(setViewportBounds setviewportbounds, zzr zzrVar, int i) {
        this.write = i;
        this.IconCompatParcelizer = zzrVar;
        this.read = setviewportbounds;
    }
}
