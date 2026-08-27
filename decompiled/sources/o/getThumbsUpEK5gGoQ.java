package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getThumbsUpEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getThumbsUpEK5gGoQ zzi;
    private int zzb;
    private onPostFlingRZ2iAVYsuspendImpl zzd;
    private onPostFlingRZ2iAVYsuspendImpl zze;
    private onPostFlingRZ2iAVYsuspendImpl zzf;
    private boolean zzg;
    private onPostFlingRZ2iAVYsuspendImpl zzh;

    public static getThumbsUpEK5gGoQ RemoteActionCompatParcelizer() {
        return zzi;
    }

    public final boolean IconCompatParcelizer() {
        return (this.zzb & 1) != 0;
    }

    public final onPostFlingRZ2iAVYsuspendImpl MediaDescriptionCompat() {
        return this.zzh;
    }

    public final boolean RatingCompat() {
        return this.zzg;
    }

    public final List read() {
        return this.zzd;
    }

    public final List serializer() {
        return this.zze;
    }

    public final List write() {
        return this.zzf;
    }

    static {
        getThumbsUpEK5gGoQ getthumbsupek5ggoq = new getThumbsUpEK5gGoQ();
        zzi = getthumbsupek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getThumbsUpEK5gGoQ.class, getthumbsupek5ggoq);
    }

    public getThumbsUpEK5gGoQ() {
        setScopeui setscopeui = setScopeui.read;
        this.zzd = setscopeui;
        this.zze = setscopeui;
        this.zzf = setscopeui;
        this.zzh = setscopeui;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", getSystemNavigationDownEK5gGoQ.class, "zze", getSystemNavigationRightEK5gGoQ.class, "zzf", getToggle2D3DEK5gGoQ.class, "zzg", "zzh", getSystemNavigationDownEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getThumbsUpEK5gGoQ();
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
