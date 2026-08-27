package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvSatelliteServiceEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvSatelliteServiceEK5gGoQ zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private onPostFlingRZ2iAVYsuspendImpl zzi = setScopeui.read;

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.zzb & 4) != 0;
    }

    public final long MediaDescriptionCompat() {
        return this.zzf;
    }

    public final float MediaMetadataCompat() {
        return this.zzg;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return (this.zzb & 16) != 0;
    }

    public final List MediaSessionCompatResultReceiverWrapper() {
        return this.zzi;
    }

    public final double PlaybackStateCompatCustomAction() {
        return this.zzh;
    }

    public final boolean RatingCompat() {
        return (this.zzb & 8) != 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.zzb & 2) != 0;
    }

    public final String read() {
        return this.zzd;
    }

    public final String serializer() {
        return this.zze;
    }

    public final boolean write() {
        return (this.zzb & 1) != 0;
    }

    static {
        getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq = new getTvSatelliteServiceEK5gGoQ();
        zzj = gettvsatelliteserviceek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvSatelliteServiceEK5gGoQ.class, gettvsatelliteserviceek5ggoq);
    }

    public static getTvTimerProgrammingEK5gGoQ IconCompatParcelizer() {
        return (getTvTimerProgrammingEK5gGoQ) zzj.ComponentDialog();
    }

    public final void ComponentActivity() {
        this.zzi = setScopeui.read;
    }

    public final int MediaSessionCompatToken() {
        return this.zzi.size();
    }

    public final /* synthetic */ void IconCompatParcelizer(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final void RemoteActionCompatParcelizer(getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzi;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zzi = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        this.zzi.add(gettvsatelliteserviceek5ggoq);
    }

    public final /* synthetic */ void write(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final void write(ArrayList arrayList) {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzi;
        if (!((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            int size = onpostflingrz2iavysuspendimpl.size();
            this.zzi = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(arrayList, this.zzi);
    }

    public final /* synthetic */ void ParcelableVolumeInfo() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void PlaybackStateCompat() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void ResultReceiver() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final /* synthetic */ void write(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    public final /* synthetic */ void write(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", getTvSatelliteServiceEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getTvSatelliteServiceEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvTimerProgrammingEK5gGoQ(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
