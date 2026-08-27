package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getTvTeletextEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvTeletextEK5gGoQ zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private getTvInputHdmi3EK5gGoQ zzf;

    static {
        getTvTeletextEK5gGoQ gettvteletextek5ggoq = new getTvTeletextEK5gGoQ();
        zzg = gettvteletextek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvTeletextEK5gGoQ.class, gettvteletextek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new getTvTeletextEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
