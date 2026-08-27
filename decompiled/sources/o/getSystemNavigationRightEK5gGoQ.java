package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSystemNavigationRightEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getSystemNavigationRightEK5gGoQ zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        getSystemNavigationRightEK5gGoQ getsystemnavigationrightek5ggoq = new getSystemNavigationRightEK5gGoQ();
        zzf = getsystemnavigationrightek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getSystemNavigationRightEK5gGoQ.class, getsystemnavigationrightek5ggoq);
    }

    public final int IconCompatParcelizer() {
        int iRemoteActionCompatParcelizer = getThumbsDownEK5gGoQ.RemoteActionCompatParcelizer(this.zzd);
        if (iRemoteActionCompatParcelizer == 0) {
            return 1;
        }
        return iRemoteActionCompatParcelizer;
    }

    public final int read() {
        int iRemoteActionCompatParcelizer = getThumbsDownEK5gGoQ.RemoteActionCompatParcelizer(this.zze);
        if (iRemoteActionCompatParcelizer == 0) {
            return 1;
        }
        return iRemoteActionCompatParcelizer;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            getSwitchCharsetEK5gGoQ getswitchcharsetek5ggoq = getSwitchCharsetEK5gGoQ.RatingCompat;
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", getswitchcharsetek5ggoq, "zze", getswitchcharsetek5ggoq});
        }
        if (i2 == 3) {
            return new getSystemNavigationRightEK5gGoQ();
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
