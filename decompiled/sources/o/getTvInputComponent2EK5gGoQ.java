package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvInputComponent2EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvInputComponent2EK5gGoQ zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    public static getTvInputComponent2EK5gGoQ IconCompatParcelizer() {
        return zzi;
    }

    public final int read() {
        return this.zzg;
    }

    public final String serializer() {
        return this.zzh;
    }

    static {
        getTvInputComponent2EK5gGoQ gettvinputcomponent2ek5ggoq = new getTvInputComponent2EK5gGoQ();
        zzi = gettvinputcomponent2ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvInputComponent2EK5gGoQ.class, gettvinputcomponent2ek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new getTvInputComponent2EK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
