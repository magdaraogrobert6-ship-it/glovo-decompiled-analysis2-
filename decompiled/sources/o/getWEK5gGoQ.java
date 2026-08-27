package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getWEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getWEK5gGoQ zzg;
    private onPreFlingQWom1MosuspendImpl zzb;
    private onPreFlingQWom1MosuspendImpl zzd;
    private onPostFlingRZ2iAVYsuspendImpl zze;
    private onPostFlingRZ2iAVYsuspendImpl zzf;

    public static getWEK5gGoQ RemoteActionCompatParcelizer() {
        return zzg;
    }

    public final List IconCompatParcelizer() {
        return this.zzb;
    }

    public final List MediaMetadataCompat() {
        return this.zzf;
    }

    public final onPostFlingRZ2iAVYsuspendImpl MediaSessionCompatQueueItem() {
        return this.zze;
    }

    public final List write() {
        return this.zzd;
    }

    static {
        getWEK5gGoQ getwek5ggoq = new getWEK5gGoQ();
        zzg = getwek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getWEK5gGoQ.class, getwek5ggoq);
    }

    public static getVolumeDownEK5gGoQ serializer() {
        return (getVolumeDownEK5gGoQ) zzg.ComponentDialog();
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.zzf.size();
    }

    public final int MediaDescriptionCompat() {
        return this.zze.size();
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        this.zzf = setScopeui.read;
    }

    public final void MediaSessionCompatToken() {
        this.zzb = dispatchPostScrollDzOQY0M.serializer;
    }

    public final void ParcelableVolumeInfo() {
        this.zze = setScopeui.read;
    }

    public final void PlaybackStateCompat() {
        this.zzd = dispatchPostScrollDzOQY0M.serializer;
    }

    public final int RatingCompat() {
        return this.zzd.size();
    }

    public final int read() {
        return this.zzb.size();
    }

    public getWEK5gGoQ() {
        dispatchPostScrollDzOQY0M dispatchpostscrolldzoqy0m = dispatchPostScrollDzOQY0M.serializer;
        this.zzb = dispatchpostscrolldzoqy0m;
        this.zzd = dispatchpostscrolldzoqy0m;
        setScopeui setscopeui = setScopeui.read;
        this.zze = setscopeui;
        this.zzf = setscopeui;
    }

    public final void IconCompatParcelizer(Iterable iterable) {
        List list = this.zzb;
        if (!((KeyInputElement) list).write) {
            int size = list.size();
            this.zzb = ((dispatchPostScrollDzOQY0M) list).RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(iterable, this.zzb);
    }

    public final void RemoteActionCompatParcelizer(Iterable iterable) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzf;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zzf = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(iterable, this.zzf);
    }

    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zze;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zze = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(arrayList, this.zze);
    }

    public final void serializer(List list) {
        List list2 = this.zzd;
        if (!((KeyInputElement) list2).write) {
            int size = list2.size();
            this.zzd = ((dispatchPostScrollDzOQY0M) list2).RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(list, this.zzd);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", getTvSatelliteCsEK5gGoQ.class, "zzf", getVoiceAssistEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getWEK5gGoQ();
        }
        if (i2 == 4) {
            return new getVolumeDownEK5gGoQ(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
