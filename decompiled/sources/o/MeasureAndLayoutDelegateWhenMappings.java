package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasureAndLayoutDelegateWhenMappings extends isInLookaheadPass {
    public final String read;

    public final int hashCode() {
        return this.read.hashCode() ^ 1000003;
    }

    public MeasureAndLayoutDelegateWhenMappings(String str) {
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isInLookaheadPass)) {
            return false;
        }
        return this.read.equals(((MeasureAndLayoutDelegateWhenMappings) ((isInLookaheadPass) obj)).read);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("User{identifier="), this.read, "}");
    }
}
