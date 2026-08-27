package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getTvInputHdmi1EK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvInputHdmi1EK5gGoQ zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private getScopeui zzl;
    private getScopeui zzm;

    public static getTvInputHdmi1EK5gGoQ IconCompatParcelizer() {
        return zzn;
    }

    public final boolean ComponentActivity() {
        return (this.zzb & 16) != 0;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.zzb & 1) != 0;
    }

    public final String MediaDescriptionCompat() {
        return this.zzd;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return (this.zzb & 2) != 0;
    }

    public final long MediaSessionCompatResultReceiverWrapper() {
        return this.zzg;
    }

    public final String MediaSessionCompatToken() {
        return this.zze;
    }

    public final String ParcelableVolumeInfo() {
        return this.zzf;
    }

    public final boolean PlaybackStateCompat() {
        return (this.zzb & 8) != 0;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        return (this.zzb & 4) != 0;
    }

    public final boolean ResultReceiver() {
        return (this.zzb & 64) != 0;
    }

    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.zzi;
    }

    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.zzh;
    }

    public final boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return (this.zzb & 32) != 0;
    }

    public final long r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        return this.zzk;
    }

    public final boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        return (this.zzb & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0;
    }

    public final String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        return this.zzj;
    }

    static {
        getTvInputHdmi1EK5gGoQ gettvinputhdmi1ek5ggoq = new getTvInputHdmi1EK5gGoQ();
        zzn = gettvinputhdmi1ek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvInputHdmi1EK5gGoQ.class, gettvinputhdmi1ek5ggoq);
    }

    public static getTvInputEK5gGoQ RemoteActionCompatParcelizer() {
        return (getTvInputEK5gGoQ) zzn.ComponentDialog();
    }

    public final getScopeui MediaMetadataCompat() {
        getScopeui getscopeui = this.zzl;
        if (!getscopeui.serializer) {
            this.zzl = getscopeui.serializer();
        }
        return this.zzl;
    }

    public final getScopeui RatingCompat() {
        getScopeui getscopeui = this.zzm;
        if (!getscopeui.serializer) {
            this.zzm = getscopeui.serializer();
        }
        return this.zzm;
    }

    public getTvInputHdmi1EK5gGoQ() {
        getScopeui getscopeui = getScopeui.read;
        this.zzl = getscopeui;
        this.zzm = getscopeui;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public final /* synthetic */ void IconCompatParcelizer(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void MediaDescriptionCompat(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void read() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void read(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void serializer() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void serializer(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void write() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void write(long j) {
        this.zzb |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
        this.zzk = j;
    }

    public final /* synthetic */ void write(String str) {
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
            return new NestedScrollDispatcherdispatchPostFling1(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", getTvDataServiceEK5gGoQ.IconCompatParcelizer, "zzm", getTvInputHdmi2EK5gGoQ.write});
        }
        if (i2 == 3) {
            return new getTvInputHdmi1EK5gGoQ();
        }
        if (i2 == 4) {
            return new getTvInputEK5gGoQ(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        throw null;
    }
}
