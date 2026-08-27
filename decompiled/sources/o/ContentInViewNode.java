package o;

import androidx.collection.ObjectList$toString$1;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInViewNode {
    public int IconCompatParcelizer;
    public Object[] read;
    public anchoredDrag serializer;

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0;
    }

    public final boolean write() {
        return this.IconCompatParcelizer == 0;
    }

    public final void IconCompatParcelizer() {
        onContentCardClicked.write(0, this.IconCompatParcelizer, null, this.read);
        this.IconCompatParcelizer = 0;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        if (i >= 0 && i < this.IconCompatParcelizer) {
            return this.read[i];
        }
        read(i);
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.read;
        int i = this.IconCompatParcelizer;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final Object read(int i, Object obj) {
        if (i < 0 || i >= this.IconCompatParcelizer) {
            read(i);
            throw null;
        }
        Object[] objArr = this.read;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void RemoteActionCompatParcelizer(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        onContentCardClicked.write(0, 0, length, objArr, objArr2);
        this.read = objArr2;
    }

    public final void read(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.IconCompatParcelizer) || i2 < 0 || i2 > i3) {
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbM.append(this.IconCompatParcelizer);
            ForEachGestureKt.serializer(sbM.toString());
            throw null;
        }
        if (i2 < i) {
            ForEachGestureKt.IconCompatParcelizer("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.read;
                onContentCardClicked.write(i, i2, i3, objArr, objArr);
            }
            int i4 = this.IconCompatParcelizer;
            int i5 = i4 - (i2 - i);
            onContentCardClicked.write(i5, i4, null, this.read);
            this.IconCompatParcelizer = i5;
        }
    }

    public final void read(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = this.IconCompatParcelizer;
        int size = list.size() + i;
        Object[] objArr = this.read;
        if (objArr.length < size) {
            RemoteActionCompatParcelizer(size, objArr);
        }
        Object[] objArr2 = this.read;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.IconCompatParcelizer = list.size() + this.IconCompatParcelizer;
    }

    public final String toString() {
        int i = 0;
        ObjectList$toString$1 objectList$toString$1 = new ObjectList$toString$1(i, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.read;
        int i2 = this.IconCompatParcelizer;
        while (i < i2) {
            Object obj = objArr[i];
            if (i == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) objectList$toString$1.invoke(obj));
            i++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final Object write(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.IconCompatParcelizer)) {
            Object[] objArr = this.read;
            Object obj = objArr[i];
            if (i != i2 - 1) {
                onContentCardClicked.write(i, i + 1, i2, objArr, objArr);
            }
            int i3 = this.IconCompatParcelizer - 1;
            this.IconCompatParcelizer = i3;
            objArr[i3] = null;
            return obj;
        }
        read(i);
        throw null;
    }

    public final void read(int i) {
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Index ", " must be in 0..");
        sbM.append(this.IconCompatParcelizer - 1);
        ForEachGestureKt.serializer(sbM.toString());
        throw null;
    }

    public final void read(Object obj) {
        int i = this.IconCompatParcelizer + 1;
        Object[] objArr = this.read;
        if (objArr.length < i) {
            RemoteActionCompatParcelizer(i, objArr);
        }
        Object[] objArr2 = this.read;
        int i2 = this.IconCompatParcelizer;
        objArr2[i2] = obj;
        this.IconCompatParcelizer = i2 + 1;
    }

    public ContentInViewNode(int i) {
        this.read = i == 0 ? DefaultFlingBehaviorperformFling2.read : new Object[i];
    }

    public final int RemoteActionCompatParcelizer(Object obj) {
        Object[] objArr = this.read;
        int i = 0;
        if (obj == null) {
            int i2 = this.IconCompatParcelizer;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.IconCompatParcelizer;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContentInViewNode) {
            ContentInViewNode contentInViewNode = (ContentInViewNode) obj;
            int i = contentInViewNode.IconCompatParcelizer;
            int i2 = this.IconCompatParcelizer;
            if (i == i2) {
                Object[] objArr = this.read;
                Object[] objArr2 = contentInViewNode.read;
                Object[] objArr3 = {0, Integer.valueOf(i2)};
                int iWrite = BackspaceCommand.write();
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr3, BackspaceCommand.write(), -281231677, iWrite);
                int i3 = ensuresubscribedtoinappmessageeventslambda7.write;
                int i4 = ensuresubscribedtoinappmessageeventslambda7.read;
                if (i3 > i4) {
                    return true;
                }
                while (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
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

    public final Object serializer() {
        if (!write()) {
            return this.read[0];
        }
        ForEachGestureKt.RemoteActionCompatParcelizer("ObjectList is empty.");
        throw null;
    }

    public final boolean write(Object obj) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        if (iRemoteActionCompatParcelizer < 0) {
            return false;
        }
        write(iRemoteActionCompatParcelizer);
        return true;
    }

    public /* synthetic */ ContentInViewNode() {
        this(16);
    }

    public final void serializer(ContentInViewNode contentInViewNode) {
        contentInViewNode.getClass();
        if (contentInViewNode.write()) {
            return;
        }
        int i = this.IconCompatParcelizer + contentInViewNode.IconCompatParcelizer;
        Object[] objArr = this.read;
        if (objArr.length < i) {
            RemoteActionCompatParcelizer(i, objArr);
        }
        onContentCardClicked.write(this.IconCompatParcelizer, 0, contentInViewNode.IconCompatParcelizer, contentInViewNode.read, this.read);
        this.IconCompatParcelizer += contentInViewNode.IconCompatParcelizer;
    }
}
