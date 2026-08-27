package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class MutationInterruptedException {
    public final int IconCompatParcelizer;
    public final int serializer;

    public final int hashCode() {
        return Integer.hashCode(this.serializer) + (Integer.hashCode(this.IconCompatParcelizer) * 31);
    }

    public MutationInterruptedException(int i, int i2) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutationInterruptedException)) {
            return false;
        }
        MutationInterruptedException mutationInterruptedException = (MutationInterruptedException) obj;
        return this.IconCompatParcelizer == mutationInterruptedException.IconCompatParcelizer && this.serializer == mutationInterruptedException.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", encodeRate=");
        return af$$ExternalSyntheticOutline0.m(sb, this.serializer, ')');
    }
}
