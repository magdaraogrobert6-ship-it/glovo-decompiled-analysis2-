package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class InspectableModifierEnd {
    public final int IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public final isActive MediaSessionCompatQueueItem;
    public int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final ArrayDeque serializer = new ArrayDeque();
    public final String write;

    public final String toString() {
        return this.write;
    }

    public InspectableModifierEnd(String str, isActive isactive, int i, boolean z) {
        this.write = str;
        this.MediaSessionCompatQueueItem = isactive;
        this.RemoteActionCompatParcelizer = i;
        int i2 = isactive.serializer;
        int i3 = 0;
        while (true) {
            onSingleTapUp onsingletapup = ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[i2];
            int i4 = onsingletapup.IconCompatParcelizer;
            if (i4 != 3) {
                if (i4 == 4) {
                    i3 |= onsingletapup.write;
                } else if (i4 == 5) {
                    i3 = -1;
                    break;
                } else if (i4 != 7) {
                    break;
                }
            }
            i2 = onsingletapup.RemoteActionCompatParcelizer;
        }
        this.IconCompatParcelizer = i3;
        this.read = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x0231  */
    /* JADX WARN: Code duplicated, block: B:134:0x0235  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0249  */
    /* JADX WARN: Code duplicated, block: B:141:0x0254  */
    /* JADX WARN: Code duplicated, block: B:144:0x0259  */
    /* JADX WARN: Code duplicated, block: B:146:0x025e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0267 A[LOOP:3: B:147:0x0262->B:150:0x0267, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0277  */
    /* JADX WARN: Code duplicated, block: B:166:0x0296  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:180:0x0304  */
    /* JADX WARN: Code duplicated, block: B:182:0x0308  */
    /* JADX WARN: Code duplicated, block: B:183:0x030a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0319  */
    /* JADX WARN: Code duplicated, block: B:191:0x0327  */
    /* JADX WARN: Code duplicated, block: B:193:0x032c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0335  */
    /* JADX WARN: Code duplicated, block: B:227:0x0393  */
    /* JADX WARN: Code duplicated, block: B:228:0x039e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0185  */
    /* JADX WARN: Code duplicated, block: B:98:0x018d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0233, code lost:
    
        if (r2 != 10) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0240, code lost:
    
        if (r2 == r5.read[0]) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0243, code lost:
    
        r31 = r11;
        r25 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IconCompatParcelizer(o.onInfiniteOperation r30, int r31, int r32, int r33, int[] r34, int r35) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.InspectableModifierEnd.IconCompatParcelizer(o.onInfiniteOperation, int, int, int, int[], int):boolean");
    }
}
