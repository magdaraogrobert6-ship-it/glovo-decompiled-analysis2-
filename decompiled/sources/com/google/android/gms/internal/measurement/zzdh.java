package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import o.accessgetSystemNavigationDowncp;
import o.getProgramRedEK5gGoQ;
import o.getSleepEK5gGoQ;
import o.getSoftRightEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdh extends getSleepEK5gGoQ {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ getSoftRightEK5gGoQ write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str, String str2, Object obj, boolean z) {
        super(getsoftrightek5ggoq, true);
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = z;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.write = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        getProgramRedEK5gGoQ getprogramredek5ggoq = this.write.MediaDescriptionCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
        getprogramredek5ggoq.setUserProperty(this.IconCompatParcelizer, this.read, new ObjectWrapper(this.serializer), this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem);
    }
}
