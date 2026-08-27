package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getTvTerrestrialAnalogEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvTerrestrialAnalogEK5gGoQ zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        getTvTerrestrialAnalogEK5gGoQ gettvterrestrialanalogek5ggoq = new getTvTerrestrialAnalogEK5gGoQ();
        zzf = gettvterrestrialanalogek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvTerrestrialAnalogEK5gGoQ.class, gettvterrestrialanalogek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new getTvTerrestrialAnalogEK5gGoQ();
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
