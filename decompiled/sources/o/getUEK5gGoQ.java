package o;

import com.google.android.gms.internal.measurement.zzmb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getUEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getUEK5gGoQ zzh;
    private int zzb;
    private onPostFlingRZ2iAVYsuspendImpl zzd = setScopeui.read;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    public final String IconCompatParcelizer() {
        return this.zze;
    }

    public final boolean MediaDescriptionCompat() {
        return (this.zzb & 2) != 0;
    }

    public final String RatingCompat() {
        return this.zzf;
    }

    public final List read() {
        return this.zzd;
    }

    public final boolean write() {
        return (this.zzb & 1) != 0;
    }

    static {
        getUEK5gGoQ getuek5ggoq = new getUEK5gGoQ();
        zzh = getuek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getUEK5gGoQ.class, getuek5ggoq);
    }

    public static getVEK5gGoQ serializer() {
        return (getVEK5gGoQ) zzh.ComponentDialog();
    }

    public static getVEK5gGoQ serializer(getUEK5gGoQ getuek5ggoq) {
        zzmb zzmbVarComponentDialog = zzh.ComponentDialog();
        zzmbVarComponentDialog.serializer(getuek5ggoq);
        return (getVEK5gGoQ) zzmbVarComponentDialog;
    }

    public final void MediaSessionCompatQueueItem() {
        this.zzd = setScopeui.read;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.zzd.size();
    }

    public final getTvZoomModeEK5gGoQ serializer(int i) {
        return (getTvZoomModeEK5gGoQ) this.zzd.get(i);
    }

    public final /* synthetic */ void IconCompatParcelizer(int i, getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq) {
        MediaBrowserCompatMediaItem();
        this.zzd.set(i, gettvzoommodeek5ggoq);
    }

    public final /* synthetic */ void IconCompatParcelizer(ArrayList arrayList) {
        MediaBrowserCompatMediaItem();
        getOnPreKeyEvent.read(arrayList, this.zzd);
    }

    public final void MediaBrowserCompatMediaItem() {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzd;
        if (((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            return;
        }
        int size = onpostflingrz2iavysuspendimpl.size();
        this.zzd = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
    }

    public final /* synthetic */ void read(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void read(getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq) {
        MediaBrowserCompatMediaItem();
        this.zzd.add(gettvzoommodeek5ggoq);
    }

    public final /* synthetic */ void serializer(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", getTvZoomModeEK5gGoQ.class, "zze", "zzf", "zzg", getSwitchCharsetEK5gGoQ.PlaybackStateCompatCustomAction});
        }
        if (i2 == 3) {
            return new getUEK5gGoQ();
        }
        if (i2 == 4) {
            return new getVEK5gGoQ(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
