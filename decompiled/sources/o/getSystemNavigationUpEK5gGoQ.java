package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSystemNavigationUpEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getSystemNavigationUpEK5gGoQ zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private getSystemHomeEK5gGoQ zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public final String IconCompatParcelizer() {
        return this.zze;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.zzi;
    }

    public final boolean MediaDescriptionCompat() {
        return (this.zzb & 32) != 0;
    }

    public final boolean MediaMetadataCompat() {
        return this.zzg;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.zzh;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.zzd;
    }

    public final boolean serializer() {
        return (this.zzb & 1) != 0;
    }

    static {
        getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq = new getSystemNavigationUpEK5gGoQ();
        zzj = getsystemnavigationupek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getSystemNavigationUpEK5gGoQ.class, getsystemnavigationupek5ggoq);
    }

    public static getSystemNavigationLeftEK5gGoQ write() {
        return (getSystemNavigationLeftEK5gGoQ) zzj.ComponentDialog();
    }

    public final getSystemHomeEK5gGoQ read() {
        getSystemHomeEK5gGoQ getsystemhomeek5ggoq = this.zzf;
        return getsystemhomeek5ggoq == null ? getSystemHomeEK5gGoQ.IconCompatParcelizer() : getsystemhomeek5ggoq;
    }

    public final /* synthetic */ void write(String str) {
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
            return new NestedScrollDispatcherdispatchPostFling1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new getSystemNavigationUpEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSystemNavigationLeftEK5gGoQ(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
