package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getZoomInEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getZoomInEK5gGoQ zzf;
    private int zzb;
    private String zzd = "";
    private onPostFlingRZ2iAVYsuspendImpl zze = setScopeui.read;

    public final String RemoteActionCompatParcelizer() {
        return this.zzd;
    }

    public final List write() {
        return this.zze;
    }

    static {
        getZoomInEK5gGoQ getzoominek5ggoq = new getZoomInEK5gGoQ();
        zzf = getzoominek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getZoomInEK5gGoQ.class, getzoominek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", getZEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getZoomInEK5gGoQ();
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
