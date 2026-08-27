package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getZEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getZEK5gGoQ zzj;
    private int zzb;
    private int zzd;
    private onPostFlingRZ2iAVYsuspendImpl zze = setScopeui.read;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    public final String IconCompatParcelizer() {
        return this.zzf;
    }

    public final double MediaDescriptionCompat() {
        return this.zzi;
    }

    public final boolean MediaMetadataCompat() {
        return this.zzh;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return (this.zzb & 16) != 0;
    }

    public final int RatingCompat() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.zzg;
    }

    public final List read() {
        return this.zze;
    }

    public final boolean serializer() {
        return (this.zzb & 4) != 0;
    }

    public final boolean write() {
        return (this.zzb & 8) != 0;
    }

    static {
        getZEK5gGoQ getzek5ggoq = new getZEK5gGoQ();
        zzj = getzek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getZEK5gGoQ.class, getzek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.MediaBrowserCompatMediaItem, "zze", getZEK5gGoQ.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new getZEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
