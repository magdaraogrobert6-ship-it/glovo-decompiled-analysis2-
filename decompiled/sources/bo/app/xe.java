package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class xe {
    public final int a;
    public final int b;

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(this.a, this.b, "RateLimitEndpointConfig(capacity=", ", refillRate=", ")");
    }

    public xe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return this.a == xeVar.a && this.b == xeVar.b;
    }
}
