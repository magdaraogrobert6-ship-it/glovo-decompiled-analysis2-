package o;

/* JADX INFO: loaded from: classes.dex */
public final class onBackPressedInput_delegatelambda0 extends computeHorizontalBoundsdefault {
    public final long IconCompatParcelizer;
    public final Object read;

    public final int hashCode() {
        return Long.hashCode(this.IconCompatParcelizer) + (this.read.hashCode() * 31);
    }

    public onBackPressedInput_delegatelambda0(long j, Object obj) {
        this.read = obj;
        this.IconCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onBackPressedInput_delegatelambda0)) {
            return false;
        }
        onBackPressedInput_delegatelambda0 onbackpressedinput_delegatelambda0 = (onBackPressedInput_delegatelambda0) obj;
        return this.read.equals(onbackpressedinput_delegatelambda0.read) && this.IconCompatParcelizer == onbackpressedinput_delegatelambda0.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.read);
        sb.append(", compositeKey=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.IconCompatParcelizer, ')');
    }
}
