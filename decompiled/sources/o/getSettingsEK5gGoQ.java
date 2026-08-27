package o;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzdi;
import com.google.android.gms.net.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class getSettingsEK5gGoQ extends zzbm implements getRightBracketEK5gGoQ {
    public final /* synthetic */ zza RemoteActionCompatParcelizer;

    @Override // o.getRightBracketEK5gGoQ
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.run();
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        IconCompatParcelizer();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSettingsEK5gGoQ(zzdi zzdiVar, zza zzaVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.RemoteActionCompatParcelizer = zzaVar;
    }
}
