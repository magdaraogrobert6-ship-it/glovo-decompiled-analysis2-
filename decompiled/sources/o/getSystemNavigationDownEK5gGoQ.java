package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSystemNavigationDownEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getSystemNavigationDownEK5gGoQ zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    public final int serializer() {
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
        int i2 = this.zzf;
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

    static {
        getSystemNavigationDownEK5gGoQ getsystemnavigationdownek5ggoq = new getSystemNavigationDownEK5gGoQ();
        zzg = getsystemnavigationdownek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getSystemNavigationDownEK5gGoQ.class, getsystemnavigationdownek5ggoq);
    }

    public final int IconCompatParcelizer() {
        int iRemoteActionCompatParcelizer = getThumbsDownEK5gGoQ.RemoteActionCompatParcelizer(this.zzd);
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
            return new NestedScrollDispatcherdispatchPostFling1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.RatingCompat, "zze", getSwitchCharsetEK5gGoQ.MediaMetadataCompat, "zzf", getSwitchCharsetEK5gGoQ.MediaDescriptionCompat});
        }
        if (i2 == 3) {
            return new getSystemNavigationDownEK5gGoQ();
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
