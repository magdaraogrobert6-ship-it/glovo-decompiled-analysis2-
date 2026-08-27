package o;

import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzs;

/* JADX INFO: loaded from: classes4.dex */
public final class getNavigateNextEK5gGoQ extends zzs {
    public scale0AR0LA0default RemoteActionCompatParcelizer;

    public final void read(scale0AR0LA0default scale0ar0la0default) {
        synchronized (this) {
            scale0AR0LA0default scale0ar0la0default2 = this.RemoteActionCompatParcelizer;
            if (scale0ar0la0default2 != scale0ar0la0default) {
                scale0ar0la0default2.RemoteActionCompatParcelizer = null;
                this.RemoteActionCompatParcelizer = scale0ar0la0default;
            }
        }
    }

    public final void serializer() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = null;
        }
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) {
        scale0AR0LA0default scale0ar0la0default;
        synchronized (this) {
            scale0ar0la0default = this.RemoteActionCompatParcelizer;
        }
        scale0ar0la0default.write(new PinnableContainerKtLocalPinnableContainer1(2, deviceOrientation));
    }

    public getNavigateNextEK5gGoQ(scale0AR0LA0default scale0ar0la0default) {
        this.RemoteActionCompatParcelizer = scale0ar0la0default;
    }
}
