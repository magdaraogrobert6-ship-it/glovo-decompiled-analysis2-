package o;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzb;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getNavigateOutEK5gGoQ extends zzb {
    public final /* synthetic */ ParentDataModifierDefaultImpls serializer;

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) getMinusEK5gGoQ.read(parcel, Status.CREATOR);
        Location location = (Location) getMinusEK5gGoQ.read(parcel, Location.CREATOR);
        getMinusEK5gGoQ.serializer(parcel);
        LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(status, location, this.serializer);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNavigateOutEK5gGoQ(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
        this.serializer = parentDataModifierDefaultImpls;
    }
}
