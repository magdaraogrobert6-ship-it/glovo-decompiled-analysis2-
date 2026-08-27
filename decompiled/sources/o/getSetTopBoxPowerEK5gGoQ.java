package o;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getSetTopBoxPowerEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ getProgramBlueEK5gGoQ RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ getSoftRightEK5gGoQ serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSetTopBoxPowerEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str, String str2, boolean z, getProgramBlueEK5gGoQ getprogramblueek5ggoq) {
        super(getsoftrightek5ggoq, true);
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = getprogramblueek5ggoq;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.serializer = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        getProgramRedEK5gGoQ getprogramredek5ggoq = this.serializer.MediaDescriptionCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
        getprogramredek5ggoq.getUserProperties(this.write, this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    @Override // o.getSleepEK5gGoQ
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Bundle) null);
    }
}
