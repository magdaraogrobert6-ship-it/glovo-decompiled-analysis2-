package o;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setJob implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ setViewportBounds RemoteActionCompatParcelizer;

    public /* synthetic */ setJob(setViewportBounds setviewportbounds, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = setviewportbounds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        setViewportBounds setviewportbounds = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            setviewportbounds.MediaSessionCompatQueueItem();
            return;
        }
        if (i != 1) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            isComplete iscomplete = setviewportbounds.write;
            if (iscomplete == null) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to send storage consent settings to service");
                return;
            }
            try {
                iscomplete.RatingCompat(setviewportbounds.RemoteActionCompatParcelizer(false));
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            } catch (RemoteException e) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Failed to send storage consent settings to the service");
                return;
            }
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        isComplete iscomplete2 = setviewportbounds.write;
        if (iscomplete2 == null) {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.serializer.RemoteActionCompatParcelizer("Failed to send Dma consent settings to service");
            return;
        }
        try {
            iscomplete2.MediaDescriptionCompat(setviewportbounds.RemoteActionCompatParcelizer(false));
            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } catch (RemoteException e2) {
            getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
            getlookaheaddelegate4.serializer.serializer(e2, "Failed to send Dma consent settings to the service");
        }
    }
}
