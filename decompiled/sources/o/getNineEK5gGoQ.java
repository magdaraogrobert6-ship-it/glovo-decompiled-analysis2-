package o;

import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getNineEK5gGoQ extends LocationCallback {
    public final /* synthetic */ zzdz IconCompatParcelizer;
    public final /* synthetic */ ParentDataModifierDefaultImpls serializer;

    public getNineEK5gGoQ(zzdz zzdzVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.serializer = parentDataModifierDefaultImpls;
        this.IconCompatParcelizer = zzdzVar;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.serializer.write(locationResult.getLastLocation());
        try {
            this.IconCompatParcelizer.serializer((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{this, "GetCurrentLocation"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), false, new ParentDataModifierDefaultImpls());
        } catch (RemoteException unused) {
        }
    }
}
