package o;

import com.google.firebase.sessions.Time$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidComposeViewviewTreeOwners2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ {
    public static final Time$Companion Companion = new Object() { // from class: com.google.firebase.sessions.Time$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return AndroidComposeViewviewTreeOwners2.write;
        }
    };
    public final long ms;
    public final long seconds;
    public final long us;

    public final int hashCode() {
        return Long.hashCode(this.ms);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ) && this.ms == ((r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ) obj).ms;
    }

    public final String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(new StringBuilder("Time(ms="), this.ms, ')');
    }

    public /* synthetic */ r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ(int i, long j, long j2, long j3) {
        if (1 == (i & 1)) {
            this.ms = j;
            this.us = (i & 2) == 0 ? j * 1000 : j2;
            if ((i & 4) == 0) {
                this.seconds = j / 1000;
                return;
            } else {
                this.seconds = j3;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidComposeViewviewTreeOwners2.write.getDescriptor());
        throw null;
    }

    public r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ(long j) {
        this.ms = j;
        this.us = j * 1000;
        this.seconds = j / 1000;
    }
}
