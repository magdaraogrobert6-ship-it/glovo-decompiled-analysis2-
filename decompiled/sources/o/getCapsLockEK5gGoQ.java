package o;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzd;

/* JADX INFO: loaded from: classes2.dex */
public final class getCapsLockEK5gGoQ extends zzd implements onVisibilityChangedNodedefault {
    public final /* synthetic */ getContactsEK5gGoQ read;

    @Override // o.onVisibilityChangedNodedefault
    public final void IconCompatParcelizer(long j, Bundle bundle, String str, String str2) {
        if (str.endsWith("+gtm")) {
            return;
        }
        this.read.MediaBrowserCompatMediaItem.execute(new getCaptionsEK5gGoQ(this, str2, bundle, str.concat("+gtm"), j, str, 1));
    }

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) getDirectionCenterEK5gGoQ.serializer(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
        IconCompatParcelizer(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCapsLockEK5gGoQ(getContactsEK5gGoQ getcontactsek5ggoq) {
        super("com.google.android.gms.tagmanager.IMeasurementEventListener");
        this.read = getcontactsek5ggoq;
    }
}
