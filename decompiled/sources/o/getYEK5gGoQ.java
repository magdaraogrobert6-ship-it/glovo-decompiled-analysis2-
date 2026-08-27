package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getYEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getYEK5gGoQ zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    public final String IconCompatParcelizer() {
        return this.zze;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.zzb & 8) != 0;
    }

    public final float MediaDescriptionCompat() {
        return this.zzh;
    }

    public final long MediaMetadataCompat() {
        return this.zzg;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return (this.zzb & 16) != 0;
    }

    public final boolean PlaybackStateCompat() {
        return (this.zzb & 32) != 0;
    }

    public final double PlaybackStateCompatCustomAction() {
        return this.zzi;
    }

    public final String RatingCompat() {
        return this.zzf;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.zzd;
    }

    public final boolean read() {
        return (this.zzb & 4) != 0;
    }

    public final boolean serializer() {
        return (this.zzb & 1) != 0;
    }

    static {
        getYEK5gGoQ getyek5ggoq = new getYEK5gGoQ();
        zzj = getyek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getYEK5gGoQ.class, getyek5ggoq);
    }

    public static getXEK5gGoQ write() {
        return (getXEK5gGoQ) zzj.ComponentDialog();
    }

    public final /* synthetic */ void read(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void write(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void MediaSessionCompatResultReceiverWrapper() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    public final /* synthetic */ void MediaSessionCompatToken() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void ParcelableVolumeInfo() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void serializer(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void write(double d) {
        this.zzb |= 32;
        this.zzi = d;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new getYEK5gGoQ();
        }
        if (i2 == 4) {
            return new getXEK5gGoQ(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
