package o;

import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getMoveHomeEK5gGoQ extends zzb {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMoveHomeEK5gGoQ(int i, Object obj) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        this.serializer = i;
        this.write = obj;
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) getMinusEK5gGoQ.read(parcel, LocationSettingsResult.CREATOR);
        getMinusEK5gGoQ.serializer(parcel);
        int i3 = this.serializer;
        Object obj = this.write;
        if (i3 != 0) {
            ((getNEK5gGoQ) obj).write(locationSettingsResult);
        } else {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(locationSettingsResult.getStatus(), new LocationSettingsResponse(locationSettingsResult), (ParentDataModifierDefaultImpls) obj);
        }
        return true;
    }
}
