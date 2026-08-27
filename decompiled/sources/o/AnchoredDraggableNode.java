package o;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableNode {
    public int RemoteActionCompatParcelizer;
    public long[] serializer;

    public final int hashCode() {
        long[] jArr = this.serializer;
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.serializer;
        int i = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void RemoteActionCompatParcelizer(long j) {
        int i = this.RemoteActionCompatParcelizer + 1;
        long[] jArr = this.serializer;
        if (jArr.length < i) {
            this.serializer = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.serializer;
        int i2 = this.RemoteActionCompatParcelizer;
        jArr2[i2] = j;
        this.RemoteActionCompatParcelizer = i2 + 1;
    }

    public AnchoredDraggableNode(int i) {
        this.serializer = i == 0 ? ContextMenuUiKt.serializer : new long[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnchoredDraggableNode) {
            AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) obj;
            int i = anchoredDraggableNode.RemoteActionCompatParcelizer;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i == i2) {
                long[] jArr = this.serializer;
                long[] jArr2 = anchoredDraggableNode.serializer;
                Object[] objArr = {0, Integer.valueOf(i2)};
                int iWrite = BackspaceCommand.write();
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
                int i3 = ensuresubscribedtoinappmessageeventslambda7.write;
                int i4 = ensuresubscribedtoinappmessageeventslambda7.read;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public /* synthetic */ AnchoredDraggableNode() {
        this(16);
    }
}
