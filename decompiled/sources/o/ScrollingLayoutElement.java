package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScrollingLayoutElement {
    public int RemoteActionCompatParcelizer;
    public int[] read;

    public final int RemoteActionCompatParcelizer(int i) {
        if (i >= 0 && i < this.RemoteActionCompatParcelizer) {
            return this.read[i];
        }
        ForEachGestureKt.serializer("Index must be between 0 and size");
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.read;
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.read;
        int i = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final int read() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return this.read[i - 1];
        }
        ForEachGestureKt.RemoteActionCompatParcelizer("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
            int i = scrollingLayoutElement.RemoteActionCompatParcelizer;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i == i2) {
                int[] iArr = this.read;
                int[] iArr2 = scrollingLayoutElement.read;
                Object[] objArr = {0, Integer.valueOf(i2)};
                int iWrite = BackspaceCommand.write();
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
                int i3 = ensuresubscribedtoinappmessageeventslambda7.write;
                int i4 = ensuresubscribedtoinappmessageeventslambda7.read;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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

    public static int RemoteActionCompatParcelizer(AnchoredDraggableKt anchoredDraggableKt, int i) {
        int i2 = anchoredDraggableKt.RemoteActionCompatParcelizer;
        if (i2 <= 0) {
            ForEachGestureKt.serializer("");
            throw null;
        }
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = anchoredDraggableKt.read[i5];
            if (i6 < i) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }
}
