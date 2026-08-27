package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Actual_androidKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((r5 instanceof o.getParagraphrAG3T2k) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r1 = r1 + 89;
        o.Actual_androidKt.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if ((r5 instanceof o.getParagraphrAG3T2k) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean RemoteActionCompatParcelizer(o.getStrictnessusljTpc r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r5.getClass()
            boolean r1 = r5 instanceof o.getHeadingrAG3T2kannotations
            r2 = 1
            if (r1 == r2) goto L2c
            int r1 = o.Actual_androidKt.IconCompatParcelizer
            int r3 = r1 + 109
            int r4 = r3 % 128
            o.Actual_androidKt.read = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 == 0) goto L1f
            boolean r5 = r5 instanceof o.getParagraphrAG3T2k
            r3 = 48
            int r3 = r3 / r4
            if (r5 == 0) goto L24
            goto L2c
        L1f:
            boolean r5 = r5 instanceof o.getParagraphrAG3T2k
            if (r5 == 0) goto L24
            goto L2c
        L24:
            int r1 = r1 + 89
            int r5 = r1 % 128
            o.Actual_androidKt.read = r5
            int r1 = r1 % r0
            return r4
        L2c:
            int r5 = o.Actual_androidKt.IconCompatParcelizer
            int r5 = r5 + 27
            int r1 = r5 % 128
            o.Actual_androidKt.read = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L38
            return r2
        L38:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Actual_androidKt.RemoteActionCompatParcelizer(o.getStrictnessusljTpc):boolean");
    }

    public static final void write(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2080741862);
        if ((i & 6) == 0) {
            int i5 = read + 63;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode.IconCompatParcelizer(textFieldSelectionManager)) {
                int i7 = IconCompatParcelizer;
                int i8 = i7 + 27;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i7 + 99;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            int i12 = IconCompatParcelizer + 3;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 = i;
        }
        boolean z = true;
        if ((i & 48) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 16 : 32;
        }
        if ((i2 & 19) != 18) {
            int i14 = read + 15;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            getTopLeft.serializer(textFieldSelectionManager, dragAndDropTargetModifierNode, getpostalcode, i2 & 126);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTopRight(textFieldSelectionManager, dragAndDropTargetModifierNode, i, 0);
        }
    }
}
