package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvInputComponent1EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvInputComponent1EK5gGoQ zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        getTvInputComponent1EK5gGoQ gettvinputcomponent1ek5ggoq = new getTvInputComponent1EK5gGoQ();
        zzf = gettvinputcomponent1ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvInputComponent1EK5gGoQ.class, gettvinputcomponent1ek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new getTvInputComponent1EK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
