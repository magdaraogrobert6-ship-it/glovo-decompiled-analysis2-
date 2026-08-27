package o;

import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class computeVerticalScrollOffset {
    public final v4 IconCompatParcelizer;
    public final v9 MediaBrowserCompatMediaItem;
    public final setTransactionSuccessful MediaMetadataCompat;
    public final vg MediaSessionCompatQueueItem;
    public final va RatingCompat;
    public final GetWorkNowOpportunity RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final CanRequestLocationUpdatesImpl serializer;
    public final subscribeToBannersUpdateslambda2 write;

    public computeVerticalScrollOffset(GetWorkNowOpportunity getWorkNowOpportunity, setTransactionSuccessful settransactionsuccessful, v9 v9Var, vg vgVar, va vaVar, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, v4 v4Var, getActionList getactionlist, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2) {
        this.RemoteActionCompatParcelizer = getWorkNowOpportunity;
        this.MediaMetadataCompat = settransactionsuccessful;
        this.MediaBrowserCompatMediaItem = v9Var;
        this.MediaSessionCompatQueueItem = vgVar;
        this.RatingCompat = vaVar;
        this.serializer = canRequestLocationUpdatesImpl;
        this.IconCompatParcelizer = v4Var;
        this.write = subscribetobannersupdateslambda2;
        this.read = new isAdapterPositionOnScreen(new vgExternalSyntheticLambda7(getactionlist, 1));
    }
}
