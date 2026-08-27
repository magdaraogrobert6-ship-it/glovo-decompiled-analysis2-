package o;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.zzd;

/* JADX INFO: loaded from: classes2.dex */
public final class getChannelDownEK5gGoQ extends zzd implements onUnplaced {
    public final /* synthetic */ getContactsEK5gGoQ read;

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) getDirectionCenterEK5gGoQ.serializer(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
        write(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getChannelDownEK5gGoQ(getContactsEK5gGoQ getcontactsek5ggoq) {
        super("com.google.android.gms.tagmanager.IMeasurementInterceptor");
        this.read = getcontactsek5ggoq;
    }

    @Override // o.onUnplaced
    public final void write(long j, Bundle bundle, String str, String str2) {
        this.read.MediaBrowserCompatMediaItem.execute(new getCaptionsEK5gGoQ(this, str2, bundle, String.valueOf(str).concat("+gtm"), j, str, 0));
    }
}
