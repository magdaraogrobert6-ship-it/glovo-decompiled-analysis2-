package o;

/* JADX INFO: loaded from: classes3.dex */
public final class CardExternalSyntheticLambda1 {
    private final long read;
    private final long serializer;

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return this.serializer;
    }

    public final int hashCode() {
        return Long.hashCode(this.read) + (Long.hashCode(this.serializer) * 31);
    }

    public CardExternalSyntheticLambda1(long j, long j2) {
        this.serializer = j;
        this.read = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExternalSyntheticLambda1)) {
            return false;
        }
        CardExternalSyntheticLambda1 cardExternalSyntheticLambda1 = (CardExternalSyntheticLambda1) obj;
        return this.serializer == cardExternalSyntheticLambda1.serializer && this.read == cardExternalSyntheticLambda1.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CwmScoreFormulaVariables(callDurationDuringTransport=");
        sb.append(this.serializer);
        sb.append(", transportDuration=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, ')');
    }
}
