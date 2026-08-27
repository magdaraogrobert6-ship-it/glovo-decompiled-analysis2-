package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getTvAudioDescriptionEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getTvAudioDescriptionEK5gGoQ zzd;
    private onPostFlingRZ2iAVYsuspendImpl zzb = setScopeui.read;

    static {
        getTvAudioDescriptionEK5gGoQ gettvaudiodescriptionek5ggoq = new getTvAudioDescriptionEK5gGoQ();
        zzd = gettvaudiodescriptionek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getTvAudioDescriptionEK5gGoQ.class, gettvaudiodescriptionek5ggoq);
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new getTvAudioDescriptionEK5gGoQ();
        }
        if (i2 == 4) {
            return new getSymbolEK5gGoQ(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
