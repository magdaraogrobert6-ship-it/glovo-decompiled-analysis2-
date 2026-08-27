package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvTerrestrialDigitalEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvTerrestrialDigitalEK5gGoQ zzj;
    private int zzb;
    private onPostFlingRZ2iAVYsuspendImpl zzd = setScopeui.read;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    public final String IconCompatParcelizer() {
        return this.zze;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.zzb & 8) != 0;
    }

    public final long MediaDescriptionCompat() {
        return this.zzg;
    }

    public final long MediaMetadataCompat() {
        return this.zzf;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return (this.zzb & 4) != 0;
    }

    public final int RatingCompat() {
        return this.zzh;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.zzb & 2) != 0;
    }

    public final List serializer() {
        return this.zzd;
    }

    static {
        getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq = new getTvTerrestrialDigitalEK5gGoQ();
        zzj = gettvterrestrialdigitalek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvTerrestrialDigitalEK5gGoQ.class, gettvterrestrialdigitalek5ggoq);
    }

    public static getTvSatelliteBsEK5gGoQ read() {
        return (getTvSatelliteBsEK5gGoQ) zzj.ComponentDialog();
    }

    public final void PlaybackStateCompatCustomAction() {
        this.zzd = setScopeui.read;
    }

    public final getTvSatelliteServiceEK5gGoQ serializer(int i) {
        return (getTvSatelliteServiceEK5gGoQ) this.zzd.get(i);
    }

    public final int write() {
        return this.zzd.size();
    }

    public final /* synthetic */ void IconCompatParcelizer(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl = this.zzd;
        if (((KeyInputElement) onpostflingrz2iavysuspendimpl).write) {
            return;
        }
        int size = onpostflingrz2iavysuspendimpl.size();
        this.zzd = onpostflingrz2iavysuspendimpl.RemoteActionCompatParcelizer(size + size);
    }

    public final /* synthetic */ void read(int i) {
        MediaSessionCompatResultReceiverWrapper();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void serializer(int i, getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq) {
        MediaSessionCompatResultReceiverWrapper();
        this.zzd.set(i, gettvsatelliteserviceek5ggoq);
    }

    public final /* synthetic */ void write(Iterable iterable) {
        MediaSessionCompatResultReceiverWrapper();
        getOnPreKeyEvent.read(iterable, this.zzd);
    }

    public final /* synthetic */ void write(getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq) {
        gettvsatelliteserviceek5ggoq.getClass();
        MediaSessionCompatResultReceiverWrapper();
        this.zzd.add(gettvsatelliteserviceek5ggoq);
    }

    public final /* synthetic */ void IconCompatParcelizer(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void write(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", getTvSatelliteServiceEK5gGoQ.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new getTvTerrestrialDigitalEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvSatelliteBsEK5gGoQ(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
