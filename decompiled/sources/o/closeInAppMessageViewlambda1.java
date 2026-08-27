package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class closeInAppMessageViewlambda1 {
    public int write;

    public final int read() {
        return this.write;
    }

    public final void read(int i) {
        this.write = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.write);
    }

    public final void IconCompatParcelizer(int i) {
        this.write += i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof closeInAppMessageViewlambda1) && this.write == ((closeInAppMessageViewlambda1) obj).write;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("DeltaCounter(count="), this.write, ')');
    }
}
