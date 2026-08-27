package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class isInterested {
    public static final Object IconCompatParcelizer = new Object();

    public static final void read(accessprocessDragStart accessprocessdragstart) {
        int i = accessprocessdragstart.serializer;
        int[] iArr = accessprocessdragstart.IconCompatParcelizer;
        Object[] objArr = accessprocessdragstart.read;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != IconCompatParcelizer) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        accessprocessdragstart.write = false;
        accessprocessdragstart.serializer = i2;
    }

    public static final Object RemoteActionCompatParcelizer(accessprocessDragStart accessprocessdragstart, int i) {
        Object obj;
        accessprocessdragstart.getClass();
        int iSerializer = DragGestureNodestartListeningForEvents1.serializer(accessprocessdragstart.IconCompatParcelizer, accessprocessdragstart.serializer, i);
        if (iSerializer < 0 || (obj = accessprocessdragstart.read[iSerializer]) == IconCompatParcelizer) {
            return null;
        }
        return obj;
    }
}
