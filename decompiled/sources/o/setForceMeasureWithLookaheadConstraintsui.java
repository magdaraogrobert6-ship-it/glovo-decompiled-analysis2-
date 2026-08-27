package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class setForceMeasureWithLookaheadConstraintsui {
    public final int read;
    public final int serializer;
    public final String write;

    public setForceMeasureWithLookaheadConstraintsui(String str, int i, int i2) {
        this.write = str;
        this.serializer = i;
        this.read = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setForceMeasureWithLookaheadConstraintsui)) {
            return false;
        }
        setForceMeasureWithLookaheadConstraintsui setforcemeasurewithlookaheadconstraintsui = (setForceMeasureWithLookaheadConstraintsui) obj;
        return this.serializer == setforcemeasurewithlookaheadconstraintsui.serializer && this.read == setforcemeasurewithlookaheadconstraintsui.read && Objects.equals(this.write, setforcemeasurewithlookaheadconstraintsui.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentTypeBackfiller.BackfillKey(path=");
        sb.append(this.write);
        sb.append(", readTimeSeconds=");
        sb.append(this.serializer);
        sb.append(", readTimeNanos=");
        return af$$ExternalSyntheticOutline0.m(this.read, ")", sb);
    }

    public final int hashCode() {
        return Objects.hash(this.write, Integer.valueOf(this.serializer), Integer.valueOf(this.read));
    }
}
