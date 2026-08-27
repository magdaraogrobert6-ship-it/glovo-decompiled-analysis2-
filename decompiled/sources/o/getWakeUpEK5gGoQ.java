package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getWakeUpEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getWakeUpEK5gGoQ zzd;
    private onPostFlingRZ2iAVYsuspendImpl zzb = setScopeui.read;

    public static getWakeUpEK5gGoQ read() {
        return zzd;
    }

    public final List IconCompatParcelizer() {
        return this.zzb;
    }

    static {
        getWakeUpEK5gGoQ getwakeupek5ggoq = new getWakeUpEK5gGoQ();
        zzd = getwakeupek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getWakeUpEK5gGoQ.class, getwakeupek5ggoq);
    }

    public final int write() {
        return this.zzb.size();
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", getZoomInEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getWakeUpEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
