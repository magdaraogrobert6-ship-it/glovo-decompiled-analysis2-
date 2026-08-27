package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvPowerEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvPowerEK5gGoQ zzf;
    private int zzb;
    private int zzd;
    private int zze;

    public final int IconCompatParcelizer() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
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
        getTvPowerEK5gGoQ gettvpowerek5ggoq = new getTvPowerEK5gGoQ();
        zzf = gettvpowerek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvPowerEK5gGoQ.class, gettvpowerek5ggoq);
    }

    public static getTvInputHdmi4EK5gGoQ read() {
        return (getTvInputHdmi4EK5gGoQ) zzf.ComponentDialog();
    }

    public final /* synthetic */ void IconCompatParcelizer(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void serializer(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.ParcelableVolumeInfo, "zze", getSwitchCharsetEK5gGoQ.MediaSessionCompatToken});
        }
        if (i2 == 3) {
            return new getTvPowerEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvInputHdmi4EK5gGoQ(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
