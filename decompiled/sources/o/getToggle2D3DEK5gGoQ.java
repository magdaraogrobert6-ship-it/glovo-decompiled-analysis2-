package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getToggle2D3DEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getToggle2D3DEK5gGoQ zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    public final String read() {
        return this.zzd;
    }

    static {
        getToggle2D3DEK5gGoQ gettoggle2d3dek5ggoq = new getToggle2D3DEK5gGoQ();
        zzf = gettoggle2d3dek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getToggle2D3DEK5gGoQ.class, gettoggle2d3dek5ggoq);
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
            return new getToggle2D3DEK5gGoQ();
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
