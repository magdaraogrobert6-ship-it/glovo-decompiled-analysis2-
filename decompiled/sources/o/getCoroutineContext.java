package o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getCoroutineContext {
    public int serializer = 0;
    public final HashMap IconCompatParcelizer = new HashMap();
    public boolean RemoteActionCompatParcelizer = true;
    public getClipMetadata write = getClipMetadata.serializer;
    public boolean read = false;

    public final getFocusOwner read() {
        asList aslist = visitNodes.IconCompatParcelizer;
        asList aslistIconCompatParcelizer = aslist;
        asList aslistIconCompatParcelizer2 = aslistIconCompatParcelizer;
        asList aslistIconCompatParcelizer3 = aslistIconCompatParcelizer2;
        for (Map.Entry entry : this.IconCompatParcelizer.entrySet()) {
            visitNodes visitnodes = (visitNodes) entry.getKey();
            nodeRemoved noderemoved = (nodeRemoved) entry.getValue();
            int i = getClipboard.RemoteActionCompatParcelizer[noderemoved.ordinal()];
            if (i == 1) {
                aslistIconCompatParcelizer = aslistIconCompatParcelizer.IconCompatParcelizer(visitnodes);
            } else if (i == 2) {
                aslistIconCompatParcelizer2 = aslistIconCompatParcelizer2.IconCompatParcelizer(visitnodes);
            } else {
                if (i != 3) {
                    getRectManager.write("Encountered invalid change type: %s", noderemoved);
                    throw null;
                }
                aslistIconCompatParcelizer3 = aslistIconCompatParcelizer3.IconCompatParcelizer(visitnodes);
            }
        }
        return new getFocusOwner(this.write, this.read, aslistIconCompatParcelizer, aslistIconCompatParcelizer2, aslistIconCompatParcelizer3);
    }
}
