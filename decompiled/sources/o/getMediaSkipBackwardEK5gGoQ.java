package o;

import android.app.PendingIntent;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaSkipBackwardEK5gGoQ extends getMediaRecordEK5gGoQ {
    public final /* synthetic */ Object MediaSessionCompatToken;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getMediaSkipBackwardEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, Object obj, int i) {
        super(accessgetnumpad6cp);
        this.write = i;
        this.MediaSessionCompatToken = obj;
    }

    @Override // o.accessgetNumPadDotcp
    public final /* synthetic */ void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        int i = this.write;
        Object obj = this.MediaSessionCompatToken;
        if (i == 0) {
            ((zzdz) accessgetscp).read((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{(LocationListener) obj, "LocationListener"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), true, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
            return;
        }
        if (i == 1) {
            ((zzdz) accessgetscp).write((PendingIntent) obj, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
            return;
        }
        if (i != 2) {
            ((zzdz) accessgetscp).serializer((Location) obj, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
            return;
        }
        ((zzdz) accessgetscp).serializer((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{(LocationCallback) obj, "LocationCallback"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), true, getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
    }
}
