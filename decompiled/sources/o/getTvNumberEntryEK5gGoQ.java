package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvNumberEntryEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvNumberEntryEK5gGoQ zzh;
    private int zzb;
    private int zzd;
    private getWEK5gGoQ zze;
    private getWEK5gGoQ zzf;
    private boolean zzg;

    public final boolean IconCompatParcelizer() {
        return (this.zzb & 1) != 0;
    }

    public final boolean MediaDescriptionCompat() {
        return (this.zzb & 8) != 0;
    }

    public final boolean RatingCompat() {
        return this.zzg;
    }

    public final int read() {
        return this.zzd;
    }

    public final boolean serializer() {
        return (this.zzb & 4) != 0;
    }

    static {
        getTvNumberEntryEK5gGoQ gettvnumberentryek5ggoq = new getTvNumberEntryEK5gGoQ();
        zzh = gettvnumberentryek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvNumberEntryEK5gGoQ.class, gettvnumberentryek5ggoq);
    }

    public static getTvMediaContextMenuEK5gGoQ RemoteActionCompatParcelizer() {
        return (getTvMediaContextMenuEK5gGoQ) zzh.ComponentDialog();
    }

    public final /* synthetic */ void serializer(getWEK5gGoQ getwek5ggoq) {
        this.zze = getwek5ggoq;
        this.zzb |= 2;
    }

    public final /* synthetic */ void write(getWEK5gGoQ getwek5ggoq) {
        this.zzf = getwek5ggoq;
        this.zzb |= 4;
    }

    public final /* synthetic */ void IconCompatParcelizer(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final getWEK5gGoQ MediaMetadataCompat() {
        getWEK5gGoQ getwek5ggoq = this.zzf;
        return getwek5ggoq == null ? getWEK5gGoQ.RemoteActionCompatParcelizer() : getwek5ggoq;
    }

    public final /* synthetic */ void serializer(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final getWEK5gGoQ write() {
        getWEK5gGoQ getwek5ggoq = this.zze;
        return getwek5ggoq == null ? getWEK5gGoQ.RemoteActionCompatParcelizer() : getwek5ggoq;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new getTvNumberEntryEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvMediaContextMenuEK5gGoQ(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
