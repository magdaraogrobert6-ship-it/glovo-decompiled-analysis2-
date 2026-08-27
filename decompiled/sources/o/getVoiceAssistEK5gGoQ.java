package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getVoiceAssistEK5gGoQ extends SoftwareKeyboardInterceptionModifierKt {
    private static final getVoiceAssistEK5gGoQ zzf;
    private int zzb;
    private int zzd;
    private onPreFlingQWom1MosuspendImpl zze = dispatchPostScrollDzOQY0M.serializer;

    public final int RemoteActionCompatParcelizer() {
        return this.zzd;
    }

    public final boolean read() {
        return (this.zzb & 1) != 0;
    }

    public final List serializer() {
        return this.zze;
    }

    static {
        getVoiceAssistEK5gGoQ getvoiceassistek5ggoq = new getVoiceAssistEK5gGoQ();
        zzf = getvoiceassistek5ggoq;
        SoftwareKeyboardInterceptionModifierKt.write(getVoiceAssistEK5gGoQ.class, getvoiceassistek5ggoq);
    }

    public static getVolumeUpEK5gGoQ IconCompatParcelizer() {
        return (getVolumeUpEK5gGoQ) zzf.ComponentDialog();
    }

    public final long IconCompatParcelizer(int i) {
        return ((dispatchPostScrollDzOQY0M) this.zze).read(i);
    }

    public final int write() {
        return this.zze.size();
    }

    public final void read(List list) {
        List list2 = this.zze;
        if (!((KeyInputElement) list2).write) {
            int size = list2.size();
            this.zze = ((dispatchPostScrollDzOQY0M) list2).RemoteActionCompatParcelizer(size + size);
        }
        getOnPreKeyEvent.read(list, this.zze);
    }

    public final /* synthetic */ void serializer(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    @Override // o.SoftwareKeyboardInterceptionModifierKt
    public final Object RemoteActionCompatParcelizer(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NestedScrollDispatcherdispatchPostFling1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new getVoiceAssistEK5gGoQ();
        }
        if (i2 == 4) {
            return new getVolumeUpEK5gGoQ(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
