package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class ad {
    public final long a;

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public ad(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad) && this.a == ((ad) obj).a;
    }

    public final String toString() {
        return m1$$ExternalSyntheticOutline0.m(this.a, "PushMaxRequestSuccessEvent(lastUpdateTime=", ")");
    }
}
