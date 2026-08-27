package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getStem3EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getStem3EK5gGoQ zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    public static getStem3EK5gGoQ read() {
        return zzi;
    }

    public final boolean IconCompatParcelizer() {
        return (this.zzb & 4) != 0;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.zzh;
    }

    public final boolean MediaDescriptionCompat() {
        return (this.zzb & 8) != 0;
    }

    public final String MediaMetadataCompat() {
        return this.zzf;
    }

    public final String MediaSessionCompatQueueItem() {
        return this.zzg;
    }

    public final int ParcelableVolumeInfo() {
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

    public final boolean RatingCompat() {
        return (this.zzb & 16) != 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.zzb & 2) != 0;
    }

    public final boolean serializer() {
        return (this.zzb & 1) != 0;
    }

    public final boolean write() {
        return this.zze;
    }

    static {
        getStem3EK5gGoQ getstem3ek5ggoq = new getStem3EK5gGoQ();
        zzi = getstem3ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getStem3EK5gGoQ.class, getstem3ek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.read, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new getStem3EK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
