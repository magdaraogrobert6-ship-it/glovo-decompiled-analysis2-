package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getYenEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getYenEK5gGoQ zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    public static getYenEK5gGoQ serializer() {
        return zzg;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r3
  0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int read() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int write() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    static {
        getYenEK5gGoQ getyenek5ggoq = new getYenEK5gGoQ();
        zzg = getyenek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getYenEK5gGoQ.class, getyenek5ggoq);
    }

    public static getVolumeMuteEK5gGoQ IconCompatParcelizer() {
        return (getVolumeMuteEK5gGoQ) zzg.ComponentDialog();
    }

    public final /* synthetic */ void IconCompatParcelizer(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final getWindowEK5gGoQ RemoteActionCompatParcelizer() {
        getWindowEK5gGoQ getwindowek5ggoqZzb = getWindowEK5gGoQ.zzb(this.zze);
        return getwindowek5ggoqZzb == null ? getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : getwindowek5ggoqZzb;
    }

    public final /* synthetic */ void read(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }

    public final /* synthetic */ void IconCompatParcelizer(getWindowEK5gGoQ getwindowek5ggoq) {
        this.zze = getwindowek5ggoq.zza();
        this.zzb |= 2;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.RemoteActionCompatParcelizer, "zze", getSwitchCharsetEK5gGoQ.write, "zzf", getSwitchCharsetEK5gGoQ.serializer});
        }
        if (i2 == 3) {
            return new getYenEK5gGoQ();
        }
        if (i2 == 4) {
            return new getVolumeMuteEK5gGoQ(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
