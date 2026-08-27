package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getTvInputHdmi3EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvInputHdmi3EK5gGoQ zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        getTvInputHdmi3EK5gGoQ gettvinputhdmi3ek5ggoq = new getTvInputHdmi3EK5gGoQ();
        zzk = gettvinputhdmi3ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvInputHdmi3EK5gGoQ.class, gettvinputhdmi3ek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new getTvInputHdmi3EK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
