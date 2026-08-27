package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.net.zza;
import java.util.Objects;
import o.accessgetSystemNavigationDowncp;
import o.getProgramRedEK5gGoQ;
import o.getSettingsEK5gGoQ;
import o.getSlashEK5gGoQ;
import o.getSleepEK5gGoQ;
import o.getSoftRightEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdi extends getSleepEK5gGoQ {
    public final /* synthetic */ Object read;
    public final /* synthetic */ getSoftRightEK5gGoQ serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(getSoftRightEK5gGoQ getsoftrightek5ggoq, Bundle bundle) {
        super(getsoftrightek5ggoq, true);
        this.write = 0;
        this.read = bundle;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.serializer = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        int i = this.write;
        if (i == 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = this.serializer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.setConditionalUserProperty((Bundle) this.read, this.MediaSessionCompatQueueItem);
            return;
        }
        if (i == 1) {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = this.serializer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.retrieveAndUploadBatches(new getSettingsEK5gGoQ(this, (zza) this.read));
        } else if (i == 2) {
            getProgramRedEK5gGoQ getprogramredek5ggoq3 = this.serializer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq3);
            getprogramredek5ggoq3.logHealthData(5, "Error with data collection. Data lost.", new ObjectWrapper((Exception) this.read), new ObjectWrapper(null), new ObjectWrapper(null));
        } else if (i != 3) {
            getProgramRedEK5gGoQ getprogramredek5ggoq4 = this.serializer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq4);
            getprogramredek5ggoq4.setSgtmDebugInfo((Intent) this.read);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq5 = this.serializer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq5);
            getprogramredek5ggoq5.setEventInterceptor((getSlashEK5gGoQ) this.read);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzdi(getSoftRightEK5gGoQ getsoftrightek5ggoq, Object obj, int i) {
        super(getsoftrightek5ggoq, true);
        this.write = i;
        this.read = obj;
        this.serializer = getsoftrightek5ggoq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(getSoftRightEK5gGoQ getsoftrightek5ggoq, Exception exc) {
        super(getsoftrightek5ggoq, false);
        this.write = 2;
        this.read = exc;
        this.serializer = getsoftrightek5ggoq;
    }
}
