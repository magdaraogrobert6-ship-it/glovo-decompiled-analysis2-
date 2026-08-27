package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getUnknownEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getUnknownEK5gGoQ zzf;
    private int zzb;
    private int zzd = 1;
    private onPostFlingRZ2iAVYsuspendImpl zze = setScopeui.read;

    static {
        getUnknownEK5gGoQ getunknownek5ggoq = new getUnknownEK5gGoQ();
        zzf = getunknownek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getUnknownEK5gGoQ.class, getunknownek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", getSwitchCharsetEK5gGoQ.PlaybackStateCompat, "zze", getTvTerrestrialAnalogEK5gGoQ.class});
        }
        if (i2 == 3) {
            return new getUnknownEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
