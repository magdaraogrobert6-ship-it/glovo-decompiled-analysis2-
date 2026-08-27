package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getSpacebarEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getSpacebarEK5gGoQ zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private onPostFlingRZ2iAVYsuspendImpl zzf = setScopeui.read;
    private boolean zzg;
    private getStem3EK5gGoQ zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public final boolean IconCompatParcelizer() {
        return (this.zzb & 1) != 0;
    }

    public final boolean MediaDescriptionCompat() {
        return this.zzi;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.zzj;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.zzk;
    }

    public final boolean ParcelableVolumeInfo() {
        return (this.zzb & 64) != 0;
    }

    public final boolean RatingCompat() {
        return (this.zzb & 8) != 0;
    }

    public final List RemoteActionCompatParcelizer() {
        return this.zzf;
    }

    public final String read() {
        return this.zze;
    }

    public final int write() {
        return this.zzd;
    }

    static {
        getSpacebarEK5gGoQ getspacebarek5ggoq = new getSpacebarEK5gGoQ();
        zzl = getspacebarek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getSpacebarEK5gGoQ.class, getspacebarek5ggoq);
    }

    public static getSoftSleepEK5gGoQ serializer() {
        return (getSoftSleepEK5gGoQ) zzl.ComponentDialog();
    }

    public final getSystemHomeEK5gGoQ IconCompatParcelizer(int i) {
        return (getSystemHomeEK5gGoQ) this.zzf.get(i);
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.zzf.size();
    }

    public final void serializer(int i, getSystemHomeEK5gGoQ getsystemhomeek5ggoq) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzf;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zzf = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        this.zzf.set(i, getsystemhomeek5ggoq);
    }

    public final getStem3EK5gGoQ MediaMetadataCompat() {
        getStem3EK5gGoQ getstem3ek5ggoq = this.zzh;
        return getstem3ek5ggoq == null ? getStem3EK5gGoQ.read() : getstem3ek5ggoq;
    }

    public final /* synthetic */ void read(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", getSystemHomeEK5gGoQ.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new getSpacebarEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSoftSleepEK5gGoQ(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
