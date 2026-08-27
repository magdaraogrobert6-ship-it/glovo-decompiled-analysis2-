package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setListener {
    private final double RemoteActionCompatParcelizer;
    private final double read;
    private final double write;

    public final double RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final double serializer() {
        return this.read;
    }

    public final double write() {
        return this.write;
    }

    public final int hashCode() {
        return Double.hashCode(this.RemoteActionCompatParcelizer) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, Double.hashCode(this.read) * 31, 31);
    }

    public setListener(double d, double d2, double d3) {
        this.read = d;
        this.write = d2;
        this.RemoteActionCompatParcelizer = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setListener)) {
            return false;
        }
        setListener setlistener = (setListener) obj;
        return Double.compare(this.read, setlistener.read) == 0 && Double.compare(this.write, setlistener.write) == 0 && Double.compare(this.RemoteActionCompatParcelizer, setlistener.RemoteActionCompatParcelizer) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttentionScoreFormulaVariables(noCallHandlingDuration=");
        sb.append(this.read);
        sb.append(", handHeldCallDuration=");
        sb.append(this.write);
        sb.append(", handsFreeCallDuration=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
