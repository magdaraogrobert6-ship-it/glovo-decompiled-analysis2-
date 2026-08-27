package o;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getRoEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ getSoftRightEK5gGoQ read;
    public final /* synthetic */ int serializer = 2;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRoEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, zzdf zzdfVar, String str, String str2) {
        super(getsoftrightek5ggoq, true);
        this.RemoteActionCompatParcelizer = zzdfVar;
        this.write = str;
        this.IconCompatParcelizer = str2;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.read = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        int i = this.serializer;
        if (i == 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.clearConditionalUserProperty(this.write, this.IconCompatParcelizer, (Bundle) this.RemoteActionCompatParcelizer);
        } else if (i != 1) {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.setCurrentScreenByScionActivityInfo((zzdf) this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq3 = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq3);
            getprogramredek5ggoq3.getConditionalUserProperties(this.write, this.IconCompatParcelizer, (getProgramBlueEK5gGoQ) this.RemoteActionCompatParcelizer);
        }
    }

    @Override // o.getSleepEK5gGoQ
    public void IconCompatParcelizer() {
        if (this.serializer != 1) {
            return;
        }
        ((getProgramBlueEK5gGoQ) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer((Bundle) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRoEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str, String str2, Bundle bundle) {
        super(getsoftrightek5ggoq, true);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = bundle;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.read = getsoftrightek5ggoq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRoEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str, String str2, getProgramBlueEK5gGoQ getprogramblueek5ggoq) {
        super(getsoftrightek5ggoq, true);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = getprogramblueek5ggoq;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.read = getsoftrightek5ggoq;
    }
}
