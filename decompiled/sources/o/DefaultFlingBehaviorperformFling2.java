package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class DefaultFlingBehaviorperformFling2 {
    public static final Object[] read = new Object[0];
    public static final ContentInViewNode write = new ContentInViewNode(0);

    public static final void read(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            ForEachGestureKt.serializer("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void RemoteActionCompatParcelizer(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            ForEachGestureKt.IconCompatParcelizer("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            ForEachGestureKt.serializer("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        ForEachGestureKt.serializer("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
