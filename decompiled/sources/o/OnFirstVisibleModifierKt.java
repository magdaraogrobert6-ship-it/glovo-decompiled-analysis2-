package o;

/* JADX INFO: loaded from: classes2.dex */
public enum OnFirstVisibleModifierKt {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    public final int zza() {
        return this.zzg;
    }

    OnFirstVisibleModifierKt(int i) {
        this.zzg = i;
    }

    public static OnFirstVisibleModifierKt zzb(int i) {
        for (OnFirstVisibleModifierKt onFirstVisibleModifierKt : values()) {
            if (onFirstVisibleModifierKt.zzg == i) {
                return onFirstVisibleModifierKt;
            }
        }
        return UNKNOWN;
    }
}
