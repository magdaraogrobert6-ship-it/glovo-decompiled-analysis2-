package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvInputVga1EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvInputVga1EK5gGoQ zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    public static getTvInputVga1EK5gGoQ IconCompatParcelizer() {
        return zzk;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.zzi;
    }

    public final boolean MediaDescriptionCompat() {
        return this.zzj;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.zzh;
    }

    public final boolean RatingCompat() {
        return this.zzg;
    }

    public final boolean read() {
        return this.zzf;
    }

    public final boolean serializer() {
        return this.zzd;
    }

    public final boolean write() {
        return this.zze;
    }

    static {
        getTvInputVga1EK5gGoQ gettvinputvga1ek5ggoq = new getTvInputVga1EK5gGoQ();
        zzk = gettvinputvga1ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvInputVga1EK5gGoQ.class, gettvinputvga1ek5ggoq);
    }

    public static getTvInputComposite1EK5gGoQ RemoteActionCompatParcelizer() {
        return (getTvInputComposite1EK5gGoQ) zzk.ComponentDialog();
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z) {
        this.zzb |= 4;
        this.zzf = z;
    }

    public final /* synthetic */ void MediaBrowserCompatMediaItem(boolean z) {
        this.zzb |= 64;
        this.zzj = z;
    }

    public final /* synthetic */ void MediaSessionCompatQueueItem(boolean z) {
        this.zzb |= 32;
        this.zzi = z;
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void read(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void serializer(boolean z) {
        this.zzb |= 16;
        this.zzh = z;
    }

    public final /* synthetic */ void write(boolean z) {
        this.zzb |= 1;
        this.zzd = z;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new getTvInputVga1EK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvInputComposite1EK5gGoQ(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
