package o;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPad1EK5gGoQ extends zzv {
    public final getNavigateInEK5gGoQ write;

    @Override // com.google.android.gms.location.zzw
    public final void zzd(LocationResult locationResult) {
        this.write.write().write(new coil3.memory.MemoryCacheService(locationResult));
    }

    @Override // com.google.android.gms.location.zzw
    public final void zze(LocationAvailability locationAvailability) {
        this.write.write().write(new PinnableContainerKtLocalPinnableContainer1(3, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzf() {
        this.write.write().write(new PinnableContainerKtLocalPinnableContainer1(4, this));
    }

    public getNumPad1EK5gGoQ(getNavigateInEK5gGoQ getnavigateinek5ggoq) {
        this.write = getnavigateinek5ggoq;
    }
}
