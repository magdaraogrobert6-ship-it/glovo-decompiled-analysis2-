package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class equalString implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode RemoteActionCompatParcelizer;

    public /* synthetic */ equalString(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = read + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i4 != 0) {
            if ((iIntValue & 3) != 2) {
                int i5 = read + 67;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z2)) {
                dragAndDropTargetModifierNode.invoke(getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if ((iIntValue & 3) != 2) {
            int i7 = write + 1;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (getpostalcode2.write(iIntValue & 1, z)) {
            dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
