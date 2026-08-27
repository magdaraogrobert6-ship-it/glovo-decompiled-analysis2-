package o;

import android.app.PendingIntent;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaSkipForwardEK5gGoQ extends getMediaRecordEK5gGoQ {
    public final /* synthetic */ LocationRequest MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getMediaSkipForwardEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, Object obj, LocationRequest locationRequest, int i) {
        super(accessgetnumpad6cp);
        this.write = i;
        this.ParcelableVolumeInfo = obj;
        this.MediaSessionCompatResultReceiverWrapper = locationRequest;
    }

    @Override // o.accessgetNumPadDotcp
    public final /* synthetic */ void RemoteActionCompatParcelizer(accessgetScp accessgetscp) {
        int i = this.write;
        LocationRequest locationRequest = this.MediaSessionCompatResultReceiverWrapper;
        Object obj = this.ParcelableVolumeInfo;
        if (i == 0) {
            ((zzdz) accessgetscp).serializer(new getMediaPreviousEK5gGoQ((scale0AR0LA0default) obj, 0), locationRequest, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
        } else if (i != 1) {
            ((zzdz) accessgetscp).read((PendingIntent) obj, locationRequest, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
        } else {
            ((zzdz) accessgetscp).read(new getMediaPreviousEK5gGoQ((scale0AR0LA0default) obj, 0), locationRequest, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
        }
    }
}
