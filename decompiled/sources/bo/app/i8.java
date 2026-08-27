package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class i8 {
    public i8() {
        m2.DUST_INITIATED.getClass();
    }

    public final int hashCode() {
        return m2.DUST_INITIATED.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        m2 m2Var = m2.SESSION_START;
        return true;
    }

    public final String toString() {
        return "FeatureFlagRefreshRequestedEvent(requestInitiatedBy=" + m2.DUST_INITIATED + ")";
    }
}
