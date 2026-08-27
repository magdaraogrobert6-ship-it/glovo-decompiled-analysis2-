package o;

/* JADX INFO: loaded from: classes2.dex */
public enum MeasureScopeDefaultImpls {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String zze;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    MeasureScopeDefaultImpls(String str) {
        this.zze = str;
    }
}
