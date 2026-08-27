package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final class isChangedToDowndefault {
    public final float IconCompatParcelizer;
    public final long read;
    public final float write;

    public final int hashCode() {
        return Long.hashCode(this.read) + af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, Float.hashCode(this.write) * 31, 31);
    }

    public final float read(long j) {
        long j2 = this.read;
        return (((Math.signum(this.write) * DraggableKtNoOpOnDragStarted1.read(j2 > 0 ? j / j2 : 1.0f).RemoteActionCompatParcelizer) * this.IconCompatParcelizer) / j2) * 1000.0f;
    }

    public final float write(long j) {
        long j2 = this.read;
        return Math.signum(this.write) * this.IconCompatParcelizer * DraggableKtNoOpOnDragStarted1.read(j2 > 0 ? j / j2 : 1.0f).IconCompatParcelizer;
    }

    public isChangedToDowndefault(float f, float f2, long j) {
        this.write = f;
        this.IconCompatParcelizer = f2;
        this.read = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isChangedToDowndefault)) {
            return false;
        }
        isChangedToDowndefault ischangedtodowndefault = (isChangedToDowndefault) obj;
        return Float.compare(this.write, ischangedtodowndefault.write) == 0 && Float.compare(this.IconCompatParcelizer, ischangedtodowndefault.IconCompatParcelizer) == 0 && this.read == ischangedtodowndefault.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
        sb.append(this.write);
        sb.append(", distance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", duration=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, ')');
    }
}
