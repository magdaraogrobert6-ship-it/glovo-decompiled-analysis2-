package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvContentsMenuEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvContentsMenuEK5gGoQ zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    public final String IconCompatParcelizer() {
        return this.zzd;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.zze;
    }

    static {
        getTvContentsMenuEK5gGoQ gettvcontentsmenuek5ggoq = new getTvContentsMenuEK5gGoQ();
        zzf = gettvcontentsmenuek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvContentsMenuEK5gGoQ.class, gettvcontentsmenuek5ggoq);
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
            return new getTvContentsMenuEK5gGoQ();
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
