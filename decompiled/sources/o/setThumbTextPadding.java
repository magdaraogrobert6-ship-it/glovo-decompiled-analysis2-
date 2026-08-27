package o;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class setThumbTextPadding extends setSwitchMinWidth {
    @Override // o.setSwitchMinWidth
    public final Object write() {
        Object obj = this.read;
        coil3.util.UtilsKt.serializer(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // o.setSwitchMinWidth
    public final void IconCompatParcelizer(int i) {
        ((OutputConfiguration) write()).setMirrorMode(i);
    }

    @Override // o.setSwitchMinWidth
    public final void read(long j) {
        ((OutputConfiguration) write()).setDynamicRangeProfile(j);
    }

    @Override // o.setSwitchMinWidth
    public final void IconCompatParcelizer(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) write()).setStreamUseCase(j);
    }

    public setThumbTextPadding(Object obj) {
        super(obj);
    }
}
