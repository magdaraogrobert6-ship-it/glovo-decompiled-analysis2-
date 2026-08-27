package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getZoomOutEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getZoomOutEK5gGoQ zzf;
    private int zzb;
    private onPostFlingRZ2iAVYsuspendImpl zzd = setScopeui.read;
    private getWakeUpEK5gGoQ zze;

    public final List read() {
        return this.zzd;
    }

    static {
        getZoomOutEK5gGoQ getzoomoutek5ggoq = new getZoomOutEK5gGoQ();
        zzf = getzoomoutek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getZoomOutEK5gGoQ.class, getzoomoutek5ggoq);
    }

    public final getWakeUpEK5gGoQ RemoteActionCompatParcelizer() {
        getWakeUpEK5gGoQ getwakeupek5ggoq = this.zze;
        return getwakeupek5ggoq == null ? getWakeUpEK5gGoQ.read() : getwakeupek5ggoq;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", getZEK5gGoQ.class, "zze"});
        }
        if (i2 == 3) {
            return new getZoomOutEK5gGoQ();
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
