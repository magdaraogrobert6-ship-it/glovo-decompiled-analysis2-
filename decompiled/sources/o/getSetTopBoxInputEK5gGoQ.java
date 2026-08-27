package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class getSetTopBoxInputEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ getSoftRightEK5gGoQ read;
    public final /* synthetic */ getProgramBlueEK5gGoQ serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getSetTopBoxInputEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, getProgramBlueEK5gGoQ getprogramblueek5ggoq, int i) {
        super(getsoftrightek5ggoq, true);
        this.write = i;
        this.serializer = getprogramblueek5ggoq;
        this.read = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void IconCompatParcelizer() {
        int i = this.write;
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = this.serializer;
        if (i == 0) {
            getprogramblueek5ggoq.RemoteActionCompatParcelizer((Bundle) null);
            return;
        }
        if (i == 1) {
            getprogramblueek5ggoq.RemoteActionCompatParcelizer((Bundle) null);
            return;
        }
        if (i == 2) {
            getprogramblueek5ggoq.RemoteActionCompatParcelizer((Bundle) null);
        } else if (i != 3) {
            getprogramblueek5ggoq.RemoteActionCompatParcelizer((Bundle) null);
        } else {
            getprogramblueek5ggoq.RemoteActionCompatParcelizer((Bundle) null);
        }
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        int i = this.write;
        if (i == 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.getGmpAppId(this.serializer);
            return;
        }
        if (i == 1) {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.getCachedAppInstanceId(this.serializer);
        } else if (i == 2) {
            getProgramRedEK5gGoQ getprogramredek5ggoq3 = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq3);
            getprogramredek5ggoq3.generateEventId(this.serializer);
        } else if (i != 3) {
            getProgramRedEK5gGoQ getprogramredek5ggoq4 = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq4);
            getprogramredek5ggoq4.getCurrentScreenClass(this.serializer);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq5 = this.read.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq5);
            getprogramredek5ggoq5.getCurrentScreenName(this.serializer);
        }
    }
}
