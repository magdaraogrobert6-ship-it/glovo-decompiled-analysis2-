package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTEK5gGoQ zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private onPostFlingRZ2iAVYsuspendImpl zzg = setScopeui.read;

    public static getTEK5gGoQ IconCompatParcelizer() {
        return zzh;
    }

    public final onPostFlingRZ2iAVYsuspendImpl MediaBrowserCompatMediaItem() {
        return this.zzg;
    }

    public final boolean MediaDescriptionCompat() {
        return this.zzf;
    }

    public final int MediaMetadataCompat() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.zzb & 4) != 0;
    }

    public final String read() {
        return this.zze;
    }

    public final boolean serializer() {
        return (this.zzb & 1) != 0;
    }

    public final boolean write() {
        return (this.zzb & 2) != 0;
    }

    static {
        getTEK5gGoQ gettek5ggoq = new getTEK5gGoQ();
        zzh = gettek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTEK5gGoQ.class, gettek5ggoq);
    }

    public final int RatingCompat() {
        return this.zzg.size();
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.IconCompatParcelizer, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new getTEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
