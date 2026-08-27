package o;

import androidx.camera.core.ImageCapture$1;
import com.google.android.gms.net.zza;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class setNavigationIcon extends setContentInsetStartWithNavigation {
    public final Executor r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final Object r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new Object();
    public getCameraXConfig r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public getInflatedId r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    @Override // o.setContentInsetStartWithNavigation
    public final getInflatedId IconCompatParcelizer(getDefaultImageFormat getdefaultimageformat) {
        return getdefaultimageformat.write();
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) {
            getInflatedId getinflatedid = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (getinflatedid != null) {
                getinflatedid.close();
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void serializer(getInflatedId getinflatedid) {
        synchronized (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) {
            if (!this.write) {
                getinflatedid.close();
                return;
            }
            if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
                if (getinflatedid.read().serializer() <= this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer.read().serializer()) {
                    getinflatedid.close();
                } else {
                    getInflatedId getinflatedid2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (getinflatedid2 != null) {
                        getinflatedid2.close();
                    }
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getinflatedid;
                }
                return;
            }
            getCameraXConfig getcameraxconfig = new getCameraXConfig(getinflatedid, this);
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getcameraxconfig;
            DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getcameraxconfig);
            ImageCapture$1 imageCapture$1 = new ImageCapture$1(26, getcameraxconfig);
            drawModifierNodeKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new zza(drawModifierNodeKtRemoteActionCompatParcelizer, 1, imageCapture$1), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        }
    }

    public setNavigationIcon(Executor executor) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = executor;
    }
}
