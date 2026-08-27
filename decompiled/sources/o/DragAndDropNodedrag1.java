package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropNodedrag1 {
    public int write;

    public final int hashCode() {
        return Integer.hashCode(this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DragAndDropNodedrag1) && this.write == ((DragAndDropNodedrag1) obj).write;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("DeltaCounter(count="), this.write, ')');
    }
}
