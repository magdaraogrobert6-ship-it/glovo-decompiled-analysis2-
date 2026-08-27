package o;

import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzd;

/* JADX INFO: loaded from: classes2.dex */
public final class getCopyEK5gGoQ extends zzd implements getButtonR1EK5gGoQ {
    public final /* synthetic */ getContactsEK5gGoQ read;

    @Override // o.getButtonR1EK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, boolean z) {
        this.read.MediaBrowserCompatMediaItem.execute(new r8lambdazF_Ju88jR4UFCfWeJLOqMReNdA(this, z, str));
    }

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        boolean z = getDirectionCenterEK5gGoQ.read(parcel);
        String string = parcel.readString();
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
        RemoteActionCompatParcelizer(string, z);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCopyEK5gGoQ(getContactsEK5gGoQ getcontactsek5ggoq) {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
        this.read = getcontactsek5ggoq;
    }
}
