package o;

import android.os.Bundle;
import android.os.Parcel;
import coil3.Extras$Key;
import com.google.android.gms.internal.measurement.zzbm;

/* JADX INFO: loaded from: classes2.dex */
public final class getSlashEK5gGoQ extends zzbm implements getProgramYellowEK5gGoQ {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSlashEK5gGoQ(int i, Object obj) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.getProgramYellowEK5gGoQ
    public final int IconCompatParcelizer() {
        return this.read != 0 ? System.identityHashCode((minWidth) this.IconCompatParcelizer) : System.identityHashCode((Extras$Key) this.IconCompatParcelizer);
    }

    @Override // o.getProgramYellowEK5gGoQ
    public final void serializer(long j, Bundle bundle, String str, String str2) {
        if (this.read != 0) {
            ((minWidth) this.IconCompatParcelizer).write(j, bundle, str, str2);
        } else {
            ((Extras$Key) this.IconCompatParcelizer).RemoteActionCompatParcelizer(j, bundle, str, str2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIconCompatParcelizer = IconCompatParcelizer();
            parcel2.writeNoException();
            parcel2.writeInt(iIconCompatParcelizer);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        getPageDownEK5gGoQ.read(parcel);
        serializer(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }
}
