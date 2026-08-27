package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class requestLookaheadRelayout extends MeasurePassDelegateWhenMappings {
    public final String write;

    public final int hashCode() {
        return this.write.hashCode() ^ 1000003;
    }

    public requestLookaheadRelayout(String str) {
        this.write = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeasurePassDelegateWhenMappings)) {
            return false;
        }
        return this.write.equals(((requestLookaheadRelayout) ((MeasurePassDelegateWhenMappings) obj)).write);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Log{content="), this.write, "}");
    }
}
