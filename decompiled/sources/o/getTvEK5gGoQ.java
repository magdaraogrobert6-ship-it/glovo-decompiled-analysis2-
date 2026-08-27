package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getTvEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvEK5gGoQ zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        getTvEK5gGoQ gettvek5ggoq = new getTvEK5gGoQ();
        zzi = gettvek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvEK5gGoQ.class, gettvek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new getTvEK5gGoQ();
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
