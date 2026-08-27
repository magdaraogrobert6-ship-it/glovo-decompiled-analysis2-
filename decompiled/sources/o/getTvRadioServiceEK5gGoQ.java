package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvRadioServiceEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvRadioServiceEK5gGoQ zzd;
    private onPostFlingRZ2iAVYsuspendImpl zzb = setScopeui.read;

    public static getTvRadioServiceEK5gGoQ RemoteActionCompatParcelizer() {
        return zzd;
    }

    public final List write() {
        return this.zzb;
    }

    static {
        getTvRadioServiceEK5gGoQ gettvradioserviceek5ggoq = new getTvRadioServiceEK5gGoQ();
        zzd = gettvradioserviceek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvRadioServiceEK5gGoQ.class, gettvradioserviceek5ggoq);
    }

    public static getTvNetworkEK5gGoQ read() {
        return (getTvNetworkEK5gGoQ) zzd.ComponentDialog();
    }

    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzb;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zzb = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(arrayList, this.zzb);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", getTvPowerEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getTvRadioServiceEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvNetworkEK5gGoQ(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
