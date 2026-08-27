package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvAudioDescriptionMixingVolumeDownEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvAudioDescriptionMixingVolumeDownEK5gGoQ zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public final String IconCompatParcelizer() {
        return this.zzd;
    }

    public final int MediaMetadataCompat() {
        return this.zzg;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return (this.zzb & 8) != 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.zzb & 4) != 0;
    }

    public final boolean read() {
        return this.zze;
    }

    public final boolean serializer() {
        return (this.zzb & 2) != 0;
    }

    public final boolean write() {
        return this.zzf;
    }

    static {
        getTvAudioDescriptionMixingVolumeDownEK5gGoQ gettvaudiodescriptionmixingvolumedownek5ggoq = new getTvAudioDescriptionMixingVolumeDownEK5gGoQ();
        zzh = gettvaudiodescriptionmixingvolumedownek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvAudioDescriptionMixingVolumeDownEK5gGoQ.class, gettvaudiodescriptionmixingvolumedownek5ggoq);
    }

    public final /* synthetic */ void read(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new getTvAudioDescriptionMixingVolumeDownEK5gGoQ();
        }
        if (i2 == 4) {
            return new getTabEK5gGoQ(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
