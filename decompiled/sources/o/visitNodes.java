package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class visitNodes implements Comparable {
    public static final asList IconCompatParcelizer;
    public static final wg$$ExternalSyntheticLambda0 write;
    public final shareWithSiblings RemoteActionCompatParcelizer;

    public static boolean serializer(shareWithSiblings sharewithsiblings) {
        return sharewithsiblings.IconCompatParcelizer.size() % 2 == 0;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(visitNodes visitnodes) {
        return this.RemoteActionCompatParcelizer.compareTo(visitnodes.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public final String write() {
        shareWithSiblings sharewithsiblings = this.RemoteActionCompatParcelizer;
        return sharewithsiblings.RemoteActionCompatParcelizer(sharewithsiblings.IconCompatParcelizer.size() - 2);
    }

    public visitNodes(shareWithSiblings sharewithsiblings) {
        getRectManager.RemoteActionCompatParcelizer(serializer(sharewithsiblings), "Not a document key path: %s", sharewithsiblings);
        this.RemoteActionCompatParcelizer = sharewithsiblings;
    }

    static {
        wg$$ExternalSyntheticLambda0 wg__externalsyntheticlambda0 = new wg$$ExternalSyntheticLambda0(12);
        write = wg__externalsyntheticlambda0;
        IconCompatParcelizer = new asList(Collections.EMPTY_LIST, wg__externalsyntheticlambda0);
    }

    public static visitNodes IconCompatParcelizer(String str) {
        shareWithSiblings sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(str);
        boolean z = false;
        if (sharewithsiblingsIconCompatParcelizer.IconCompatParcelizer.size() > 4 && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(0).equals("projects") && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(2).equals("databases") && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(4).equals("documents")) {
            z = true;
        }
        getRectManager.RemoteActionCompatParcelizer(z, "Tried to parse an invalid key: %s", sharewithsiblingsIconCompatParcelizer);
        return new visitNodes((shareWithSiblings) sharewithsiblingsIconCompatParcelizer.read());
    }

    public static visitNodes RemoteActionCompatParcelizer() {
        List list = Collections.EMPTY_LIST;
        shareWithSiblings sharewithsiblings = shareWithSiblings.serializer;
        return new visitNodes(list.isEmpty() ? shareWithSiblings.serializer : new shareWithSiblings(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || visitNodes.class != obj.getClass()) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((visitNodes) obj).RemoteActionCompatParcelizer);
    }
}
