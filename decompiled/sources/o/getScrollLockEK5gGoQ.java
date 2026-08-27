package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getScrollLockEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ getSoftRightEK5gGoQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int write = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getScrollLockEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str) {
        super(getsoftrightek5ggoq, true);
        this.IconCompatParcelizer = str;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.RemoteActionCompatParcelizer = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        if (this.write != 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = this.RemoteActionCompatParcelizer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.registerOnMeasurementEventListener((getSlashEK5gGoQ) this.IconCompatParcelizer);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = this.RemoteActionCompatParcelizer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.setUserId((String) this.IconCompatParcelizer, this.MediaSessionCompatQueueItem);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getScrollLockEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, getSlashEK5gGoQ getslashek5ggoq) {
        super(getsoftrightek5ggoq, true);
        this.IconCompatParcelizer = getslashek5ggoq;
        Objects.requireNonNull(getsoftrightek5ggoq);
        this.RemoteActionCompatParcelizer = getsoftrightek5ggoq;
    }
}
