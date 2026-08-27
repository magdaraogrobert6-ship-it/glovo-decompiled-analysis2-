package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class getCutEK5gGoQ implements ServiceConnection {
    public final accessgetTvAudioDescriptionMixingVolumeUpcp RemoteActionCompatParcelizer;
    public getButtonL2EK5gGoQ read;
    public final Context write;
    public volatile boolean IconCompatParcelizer = false;
    public volatile boolean serializer = false;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.read = null;
            this.IconCompatParcelizer = false;
            this.serializer = false;
        }
    }

    public getCutEK5gGoQ(Context context, accessgetTvAudioDescriptionMixingVolumeUpcp accessgettvaudiodescriptionmixingvolumeupcp) {
        this.write = context;
        this.RemoteActionCompatParcelizer = accessgettvaudiodescriptionmixingvolumeupcp;
    }

    public final boolean IconCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            return true;
        }
        synchronized (this) {
            if (this.IconCompatParcelizer) {
                return true;
            }
            if (!this.serializer) {
                Intent intent = new Intent("ignored");
                intent.setAction(null);
                Context context = this.write;
                intent.setClassName(context.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService");
                if (!this.RemoteActionCompatParcelizer.read(context, intent, this, 1)) {
                    return false;
                }
                this.serializer = true;
            }
            while (this.serializer) {
                try {
                    wait();
                    this.serializer = false;
                } catch (InterruptedException e) {
                    getButtonThumbLeftEK5gGoQ.read("Error connecting to TagManagerService", e);
                    this.serializer = false;
                }
            }
            return this.IconCompatParcelizer;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        getButtonL2EK5gGoQ getbuttonmodeek5ggoq;
        synchronized (this) {
            if (iBinder == null) {
                getbuttonmodeek5ggoq = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                getbuttonmodeek5ggoq = iInterfaceQueryLocalInterface instanceof getButtonL2EK5gGoQ ? (getButtonL2EK5gGoQ) iInterfaceQueryLocalInterface : new getButtonModeEK5gGoQ(iBinder);
            }
            this.read = getbuttonmodeek5ggoq;
            this.IconCompatParcelizer = true;
            this.serializer = false;
            notifyAll();
        }
    }
}
