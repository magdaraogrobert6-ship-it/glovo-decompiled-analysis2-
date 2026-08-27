package o;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfa;

/* JADX INFO: loaded from: classes4.dex */
public final class getShiftRightEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ zzfa RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Activity write;

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        int i = this.read;
        if (i == 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = ((getSoftRightEK5gGoQ) this.RemoteActionCompatParcelizer.IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.onActivityStartedByScionActivityInfo(zzdf.IconCompatParcelizer(this.write), this.MediaMetadataCompat);
            return;
        }
        if (i == 1) {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = ((getSoftRightEK5gGoQ) this.RemoteActionCompatParcelizer.IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.onActivityResumedByScionActivityInfo(zzdf.IconCompatParcelizer(this.write), this.MediaMetadataCompat);
        } else if (i == 2) {
            getProgramRedEK5gGoQ getprogramredek5ggoq3 = ((getSoftRightEK5gGoQ) this.RemoteActionCompatParcelizer.IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq3);
            getprogramredek5ggoq3.onActivityPausedByScionActivityInfo(zzdf.IconCompatParcelizer(this.write), this.MediaMetadataCompat);
        } else if (i != 3) {
            getProgramRedEK5gGoQ getprogramredek5ggoq4 = ((getSoftRightEK5gGoQ) this.RemoteActionCompatParcelizer.IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq4);
            getprogramredek5ggoq4.onActivityDestroyedByScionActivityInfo(zzdf.IconCompatParcelizer(this.write), this.MediaMetadataCompat);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq5 = ((getSoftRightEK5gGoQ) this.RemoteActionCompatParcelizer.IconCompatParcelizer).MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq5);
            getprogramredek5ggoq5.onActivityStoppedByScionActivityInfo(zzdf.IconCompatParcelizer(this.write), this.MediaMetadataCompat);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getShiftRightEK5gGoQ(zzfa zzfaVar, Activity activity, int i) {
        super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
        this.read = i;
        if (i == 1) {
            this.write = activity;
            this.RemoteActionCompatParcelizer = zzfaVar;
            super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
            return;
        }
        if (i == 2) {
            this.write = activity;
            this.RemoteActionCompatParcelizer = zzfaVar;
            super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
        } else if (i == 3) {
            this.write = activity;
            this.RemoteActionCompatParcelizer = zzfaVar;
            super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
        } else if (i != 4) {
            this.write = activity;
            this.RemoteActionCompatParcelizer = zzfaVar;
        } else {
            this.write = activity;
            this.RemoteActionCompatParcelizer = zzfaVar;
            super((getSoftRightEK5gGoQ) zzfaVar.IconCompatParcelizer, true);
        }
    }
}
