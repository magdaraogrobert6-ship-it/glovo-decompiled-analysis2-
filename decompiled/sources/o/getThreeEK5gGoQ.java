package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getThreeEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getThreeEK5gGoQ zzg;
    private int zzb;
    private String zzd = "";
    private onPostFlingRZ2iAVYsuspendImpl zze = setScopeui.read;
    private boolean zzf;

    public final String serializer() {
        return this.zzd;
    }

    static {
        getThreeEK5gGoQ getthreeek5ggoq = new getThreeEK5gGoQ();
        zzg = getthreeek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getThreeEK5gGoQ.class, getthreeek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", getTvInputComponent1EK5gGoQ.class, "zzf"});
        }
        if (i2 == 3) {
            return new getThreeEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
