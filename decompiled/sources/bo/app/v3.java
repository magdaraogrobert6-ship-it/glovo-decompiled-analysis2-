package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class v3 {
    public v3() {
        m2.DUST_INITIATED.getClass();
    }

    public final int hashCode() {
        return m2.DUST_INITIATED.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        m2 m2Var = m2.SESSION_START;
        return true;
    }

    public final String toString() {
        return "ContentCardRefreshRequestedEvent(requestInitiatedBy=" + m2.DUST_INITIATED + ")";
    }
}
