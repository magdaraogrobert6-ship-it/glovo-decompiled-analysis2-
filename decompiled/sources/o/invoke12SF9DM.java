package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firebase.sessions.ProcessData$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidComposeViewfocusSearchsearchResult1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class invoke12SF9DM {
    public static final ProcessData$Companion Companion = new Object() { // from class: com.google.firebase.sessions.ProcessData$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return AndroidComposeViewfocusSearchsearchResult1.serializer;
        }
    };
    public final int pid;
    public final String uuid;

    public final int hashCode() {
        return this.uuid.hashCode() + (Integer.hashCode(this.pid) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof invoke12SF9DM)) {
            return false;
        }
        invoke12SF9DM invoke12sf9dm = (invoke12SF9DM) obj;
        if (this.pid != invoke12sf9dm.pid) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.uuid, invoke12sf9dm.uuid}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.pid);
        sb.append(", uuid=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.uuid, ')');
    }

    public /* synthetic */ invoke12SF9DM(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.pid = i2;
            this.uuid = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidComposeViewfocusSearchsearchResult1.serializer.getDescriptor());
            throw null;
        }
    }

    public invoke12SF9DM(int i, String str) {
        str.getClass();
        this.pid = i;
        this.uuid = str;
    }
}
