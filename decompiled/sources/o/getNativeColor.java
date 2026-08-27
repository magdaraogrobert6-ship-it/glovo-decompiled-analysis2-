package o;

/* JADX INFO: loaded from: classes.dex */
public class getNativeColor extends androidx.lifecycle.ViewModel {
    public static final getNativeStrokeCap read = new getNativeStrokeCap();
    public final accessprocessDragStart write = new accessprocessDragStart(0);
    public boolean IconCompatParcelizer = false;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        accessprocessDragStart accessprocessdragstart = this.write;
        int iWrite = accessprocessdragstart.write();
        for (int i = 0; i < iWrite; i++) {
            ((getNativeStrokeJoin) accessprocessdragstart.read(i)).write();
        }
        int i2 = accessprocessdragstart.serializer;
        Object[] objArr = accessprocessdragstart.read;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        accessprocessdragstart.serializer = 0;
        accessprocessdragstart.write = false;
    }
}
