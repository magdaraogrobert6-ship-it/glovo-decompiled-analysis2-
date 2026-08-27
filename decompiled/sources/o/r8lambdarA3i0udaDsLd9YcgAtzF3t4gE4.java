package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public enum r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);

    private static final r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4[] entryArray;
    private final int typeId;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final InAppMessageViewUtils Companion = new InAppMessageViewUtils();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return af$$ExternalSyntheticOutline0.m(sb, this.typeId, ')');
    }

    public final int wireIntWithTag(int i) {
        return (i << 3) | this.typeId;
    }

    r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4(int i) {
        this.typeId = i;
    }

    static {
        Object next;
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4[] r8lambdara3i0udadsld9ycgatzf3t4ge4Arr = new r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4[8];
        for (int i = 0; i < 8; i++) {
            Iterator<E> it = getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4) next).typeId != i);
            r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = (r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4) next;
            if (r8lambdara3i0udadsld9ycgatzf3t4ge4 == null) {
                r8lambdara3i0udadsld9ycgatzf3t4ge4 = INVALID;
            }
            r8lambdara3i0udadsld9ycgatzf3t4ge4Arr[i] = r8lambdara3i0udadsld9ycgatzf3t4ge4;
        }
        entryArray = r8lambdara3i0udadsld9ycgatzf3t4ge4Arr;
    }
}
