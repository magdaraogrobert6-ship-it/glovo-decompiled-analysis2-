package o;

import com.google.android.gms.internal.measurement.zzmq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollNode {
    public static final NestedScrollNode RemoteActionCompatParcelizer = new NestedScrollNode(0, new int[0], new Object[0], false);
    public int[] IconCompatParcelizer;
    public boolean MediaSessionCompatQueueItem;
    public int read;
    public Object[] serializer;
    public int write = -1;

    public final void IconCompatParcelizer(int i) {
        int[] iArr = this.IconCompatParcelizer;
        if (i > iArr.length) {
            int i2 = this.read;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.IconCompatParcelizer = Arrays.copyOf(iArr, i);
            this.serializer = Arrays.copyOf(this.serializer, i);
        }
    }

    public NestedScrollNode(int i, int[] iArr, Object[] objArr, boolean z) {
        this.read = i;
        this.IconCompatParcelizer = iArr;
        this.serializer = objArr;
        this.MediaSessionCompatQueueItem = z;
    }

    public static NestedScrollNode read() {
        return new NestedScrollNode(0, new int[8], new Object[8], true);
    }

    public final void IconCompatParcelizer(int i, Object obj) {
        if (!this.MediaSessionCompatQueueItem) {
            getAlignmentLinesMap.write();
            return;
        }
        IconCompatParcelizer(this.read + 1);
        int[] iArr = this.IconCompatParcelizer;
        int i2 = this.read;
        iArr[i2] = i;
        this.serializer[i2] = obj;
        this.read = i2 + 1;
    }

    public final int hashCode() {
        int i = this.read;
        int[] iArr = this.IconCompatParcelizer;
        int iHashCode = 17;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        Object[] objArr = this.serializer;
        int i4 = this.read;
        for (int i5 = 0; i5 < i4; i5++) {
            iHashCode = (iHashCode * 31) + objArr[i5].hashCode();
        }
        return ((((i + 527) * 31) + i2) * 31) + iHashCode;
    }

    public final void IconCompatParcelizer(getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq) {
        if (this.read != 0) {
            for (int i = 0; i < this.read; i++) {
                int i2 = this.IconCompatParcelizer[i];
                Object obj = this.serializer[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).write(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).RemoteActionCompatParcelizer(i4, (onPreviewKeyEvent) obj);
                } else if (i3 == 3) {
                    ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).read(i4, 3);
                    ((NestedScrollNode) obj).IconCompatParcelizer(getzenkakuhankaruek5ggoq);
                    ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).read(i4, 4);
                } else {
                    if (i3 != 5) {
                        DrawableTransformation.read((Throwable) new zzmq());
                        return;
                    }
                    ((KeyInputModifierKt) getzenkakuhankaruek5ggoq.write).IconCompatParcelizer(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NestedScrollNode)) {
            NestedScrollNode nestedScrollNode = (NestedScrollNode) obj;
            int i = this.read;
            if (i == nestedScrollNode.read) {
                int[] iArr = this.IconCompatParcelizer;
                int[] iArr2 = nestedScrollNode.IconCompatParcelizer;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.serializer;
                Object[] objArr2 = nestedScrollNode.serializer;
                int i3 = this.read;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int write() {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int iIconCompatParcelizer3;
        int i = this.write;
        if (i != -1) {
            return i;
        }
        int iRemoteActionCompatParcelizer = 0;
        for (int i2 = 0; i2 < this.read; i2++) {
            int i3 = this.IconCompatParcelizer[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        onPreviewKeyEvent onpreviewkeyevent = (onPreviewKeyEvent) this.serializer[i2];
                        int iIconCompatParcelizer4 = KeyInputModifierKt.IconCompatParcelizer(i4 << 3);
                        int iRemoteActionCompatParcelizer2 = onpreviewkeyevent.RemoteActionCompatParcelizer();
                        iRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer2, iIconCompatParcelizer4, iRemoteActionCompatParcelizer);
                    } else if (i5 == 3) {
                        int iIconCompatParcelizer5 = KeyInputModifierKt.IconCompatParcelizer(i4 << 3);
                        iIconCompatParcelizer = iIconCompatParcelizer5 + iIconCompatParcelizer5;
                        iIconCompatParcelizer2 = ((NestedScrollNode) this.serializer[i2]).write();
                    } else {
                        if (i5 != 5) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(new zzmq());
                            return 0;
                        }
                        ((Integer) this.serializer[i2]).getClass();
                        iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.serializer[i2]).getClass();
                    iIconCompatParcelizer3 = KeyInputModifierKt.IconCompatParcelizer(i4 << 3) + 8;
                }
                iRemoteActionCompatParcelizer = iIconCompatParcelizer3 + iRemoteActionCompatParcelizer;
            } else {
                long jLongValue = ((Long) this.serializer[i2]).longValue();
                iIconCompatParcelizer = KeyInputModifierKt.IconCompatParcelizer(i4 << 3);
                iIconCompatParcelizer2 = KeyInputModifierKt.IconCompatParcelizer(jLongValue);
            }
            iRemoteActionCompatParcelizer = iIconCompatParcelizer2 + iIconCompatParcelizer + iRemoteActionCompatParcelizer;
        }
        this.write = iRemoteActionCompatParcelizer;
        return iRemoteActionCompatParcelizer;
    }
}
