package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSystemHomeEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getSystemHomeEK5gGoQ zzh;
    private int zzb;
    private getTEK5gGoQ zzd;
    private getStem3EK5gGoQ zze;
    private boolean zzf;
    private String zzg = "";

    public static getSystemHomeEK5gGoQ IconCompatParcelizer() {
        return zzh;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.zzf;
    }

    public final boolean MediaMetadataCompat() {
        return (this.zzb & 8) != 0;
    }

    public final String MediaSessionCompatQueueItem() {
        return this.zzg;
    }

    public final boolean RatingCompat() {
        return (this.zzb & 4) != 0;
    }

    public final boolean read() {
        return (this.zzb & 2) != 0;
    }

    public final boolean serializer() {
        return (this.zzb & 1) != 0;
    }

    static {
        getSystemHomeEK5gGoQ getsystemhomeek5ggoq = new getSystemHomeEK5gGoQ();
        zzh = getsystemhomeek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getSystemHomeEK5gGoQ.class, getsystemhomeek5ggoq);
    }

    public final getTEK5gGoQ RemoteActionCompatParcelizer() {
        getTEK5gGoQ gettek5ggoq = this.zzd;
        return gettek5ggoq == null ? getTEK5gGoQ.IconCompatParcelizer() : gettek5ggoq;
    }

    public final getStem3EK5gGoQ write() {
        getStem3EK5gGoQ getstem3ek5ggoq = this.zze;
        return getstem3ek5ggoq == null ? getStem3EK5gGoQ.read() : getstem3ek5ggoq;
    }

    public final /* synthetic */ void write(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new getSystemHomeEK5gGoQ();
        }
        if (i2 == 4) {
            return new getStemPrimaryEK5gGoQ(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
