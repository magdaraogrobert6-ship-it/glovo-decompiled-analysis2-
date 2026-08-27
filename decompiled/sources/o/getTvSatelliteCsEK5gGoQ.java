package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvSatelliteCsEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvSatelliteCsEK5gGoQ zzf;
    private int zzb;
    private int zzd;
    private long zze;

    public final long IconCompatParcelizer() {
        return this.zze;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.zzb & 2) != 0;
    }

    public final int read() {
        return this.zzd;
    }

    public final boolean serializer() {
        return (this.zzb & 1) != 0;
    }

    static {
        getTvSatelliteCsEK5gGoQ gettvsatellitecsek5ggoq = new getTvSatelliteCsEK5gGoQ();
        zzf = gettvsatellitecsek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvSatelliteCsEK5gGoQ.class, gettvsatellitecsek5ggoq);
    }

    public static getTvSatelliteEK5gGoQ write() {
        return (getTvSatelliteEK5gGoQ) zzf.ComponentDialog();
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final /* synthetic */ void read(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new getTvSatelliteCsEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvSatelliteEK5gGoQ(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
