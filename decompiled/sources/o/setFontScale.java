package o;

/* JADX INFO: loaded from: classes2.dex */
public enum setFontScale {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    public final /* synthetic */ char zzb() {
        return this.zzk;
    }

    setFontScale(char c) {
        this.zzk = c;
    }

    public static setFontScale zza(char c) {
        for (setFontScale setfontscale : values()) {
            if (setfontscale.zzk == c) {
                return setfontscale;
            }
        }
        return UNSET;
    }
}
