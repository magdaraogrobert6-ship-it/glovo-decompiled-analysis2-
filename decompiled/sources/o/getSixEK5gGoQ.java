package o;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfa;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getSixEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ getProgramBlueEK5gGoQ RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSixEK5gGoQ(zzfa zzfaVar, Activity activity, getProgramBlueEK5gGoQ getprogramblueek5ggoq) {
        super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
        this.read = activity;
        this.RemoteActionCompatParcelizer = getprogramblueek5ggoq;
        this.serializer = zzfaVar;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        if (this.IconCompatParcelizer != 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = ((getSoftRightEK5gGoQ) ((zzfa) this.serializer).IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.onActivitySaveInstanceStateByScionActivityInfo(zzdf.IconCompatParcelizer((Activity) this.read), this.RemoteActionCompatParcelizer, this.MediaMetadataCompat);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = ((getSoftRightEK5gGoQ) this.serializer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.getMaxUserProperties((String) this.read, this.RemoteActionCompatParcelizer);
        }
    }

    @Override // o.getSleepEK5gGoQ
    public void IconCompatParcelizer() {
        if (this.IconCompatParcelizer != 0) {
            return;
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Bundle) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSixEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str, getProgramBlueEK5gGoQ getprogramblueek5ggoq) {
        super(getsoftrightek5ggoq, true);
        this.read = str;
        this.RemoteActionCompatParcelizer = getprogramblueek5ggoq;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.serializer = getsoftrightek5ggoq;
    }
}
