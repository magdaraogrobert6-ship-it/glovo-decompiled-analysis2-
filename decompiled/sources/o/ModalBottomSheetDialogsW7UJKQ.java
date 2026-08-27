package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ModalBottomSheetDialogsW7UJKQ implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode read;

    public /* synthetic */ ModalBottomSheetDialogsW7UJKQ(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = dragAndDropTargetModifierNode;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z2 = false;
        if (i2 == 0) {
            if ((iIntValue & 3) != 2) {
                int i3 = IconCompatParcelizer + 83;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z2 = true;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z2)) {
                int i5 = IconCompatParcelizer + 93;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                dragAndDropTargetModifierNode.invoke(drawCircularIndicator42QJj7c.write, getpostalcode, 6);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            if ((iIntValue & 3) != 2) {
                int i7 = IconCompatParcelizer + 15;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        if (i2 == 2) {
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
            if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                int i9 = IconCompatParcelizer + 39;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                coil3.util.UtilsKt.serializer(false, dragAndDropTargetModifierNode, (getBirthDateFull) getpostalcode3, 0);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 != 3) {
            if ((iIntValue & 3) != 2) {
                int i11 = write + 83;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z2 = true;
            }
            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull;
            if (getpostalcode4.write(iIntValue & 1, z2)) {
                dragAndDropTargetModifierNode.invoke(getpostalcode4, 6);
            } else {
                getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull;
        if (getpostalcode5.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i13 = write + 73;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            dragAndDropTargetModifierNode.invoke(getpostalcode5, 0);
        } else {
            getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        int i15 = write + 105;
        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
