package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getStem2EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getStem2EK5gGoQ zzi;
    private int zzb;
    private int zzd;
    private onPostFlingRZ2iAVYsuspendImpl zze;
    private onPostFlingRZ2iAVYsuspendImpl zzf;
    private boolean zzg;
    private boolean zzh;

    public final boolean IconCompatParcelizer() {
        return (this.zzb & 1) != 0;
    }

    public final List read() {
        return this.zze;
    }

    public final onPostFlingRZ2iAVYsuspendImpl serializer() {
        return this.zzf;
    }

    public final int write() {
        return this.zzd;
    }

    static {
        getStem2EK5gGoQ getstem2ek5ggoq = new getStem2EK5gGoQ();
        zzi = getstem2ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getStem2EK5gGoQ.class, getstem2ek5ggoq);
    }

    public final int MediaMetadataCompat() {
        return this.zzf.size();
    }

    public final int RemoteActionCompatParcelizer() {
        return this.zze.size();
    }

    public final getSpacebarEK5gGoQ serializer(int i) {
        return (getSpacebarEK5gGoQ) this.zzf.get(i);
    }

    public final getSystemNavigationUpEK5gGoQ write(int i) {
        return (getSystemNavigationUpEK5gGoQ) this.zze.get(i);
    }

    public getStem2EK5gGoQ() {
        setScopeui setscopeui = setScopeui.read;
        this.zze = setscopeui;
        this.zzf = setscopeui;
    }

    public final void RemoteActionCompatParcelizer(int i, getSpacebarEK5gGoQ getspacebarek5ggoq) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzf;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zzf = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        this.zzf.set(i, getspacebarek5ggoq);
    }

    public final void read(int i, getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zze;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zze = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        this.zze.set(i, getsystemnavigationupek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", getSystemNavigationUpEK5gGoQ.class, "zzf", getSpacebarEK5gGoQ.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new getStem2EK5gGoQ();
        }
        if (i2 == 4) {
            return new getStem1EK5gGoQ(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
