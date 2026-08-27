package o;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class getCoordinatesAccessedDuringModifierPlacement {
    public static final getCoordinatesAccessedDuringModifierPlacement write = new getCoordinatesAccessedDuringModifierPlacement(0, new int[0], new Object[0], false);
    public int IconCompatParcelizer = -1;
    public int[] MediaMetadataCompat;
    public Object[] RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;

    public final void IconCompatParcelizer(int i) {
        int[] iArr = this.MediaMetadataCompat;
        if (i > iArr.length) {
            int i2 = this.read;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.MediaMetadataCompat = Arrays.copyOf(iArr, i);
            this.RemoteActionCompatParcelizer = Arrays.copyOf(this.RemoteActionCompatParcelizer, i);
        }
    }

    public getCoordinatesAccessedDuringModifierPlacement(int i, int[] iArr, Object[] objArr, boolean z) {
        this.read = i;
        this.MediaMetadataCompat = iArr;
        this.RemoteActionCompatParcelizer = objArr;
        this.serializer = z;
    }

    public static getCoordinatesAccessedDuringModifierPlacement write() {
        return new getCoordinatesAccessedDuringModifierPlacement(0, new int[8], new Object[8], true);
    }

    public final void serializer(int i, Object obj) {
        if (!this.serializer) {
            getAlignmentLinesMap.write();
            return;
        }
        IconCompatParcelizer(this.read + 1);
        int[] iArr = this.MediaMetadataCompat;
        int i2 = this.read;
        iArr[i2] = i;
        this.RemoteActionCompatParcelizer[i2] = obj;
        this.read = i2 + 1;
    }

    public final void write(LayoutNode_foldedChildren1 layoutNode_foldedChildren1) throws CodedOutputStream$OutOfSpaceException {
        if (this.read == 0) {
            return;
        }
        layoutNode_foldedChildren1.getClass();
        markChildrenDirty markchildrendirty = markChildrenDirty.ASCENDING;
        for (int i = 0; i < this.read; i++) {
            int i2 = this.MediaMetadataCompat[i];
            Object obj = this.RemoteActionCompatParcelizer[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                layoutNode_foldedChildren1.serializer(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                layoutNode_foldedChildren1.RemoteActionCompatParcelizer(i3, (setOnAttachui) obj);
            } else if (i4 == 3) {
                setSemanticsInvalidatedui setsemanticsinvalidatedui = (setSemanticsInvalidatedui) layoutNode_foldedChildren1.RemoteActionCompatParcelizer;
                markChildrenDirty markchildrendirty2 = markChildrenDirty.ASCENDING;
                setsemanticsinvalidatedui.write(i3, 3);
                ((getCoordinatesAccessedDuringModifierPlacement) obj).write(layoutNode_foldedChildren1);
                setsemanticsinvalidatedui.write(i3, 4);
            } else {
                if (i4 != 5) {
                    DrawableTransformation.read((Throwable) com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.serializer());
                    return;
                }
                layoutNode_foldedChildren1.serializer(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.read;
        int[] iArr = this.MediaMetadataCompat;
        int iHashCode = 17;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        int i4 = this.read;
        for (int i5 = 0; i5 < i4; i5++) {
            iHashCode = (iHashCode * 31) + objArr[i5].hashCode();
        }
        return ((((i + 527) * 31) + i2) * 31) + iHashCode;
    }

    public final int IconCompatParcelizer() {
        int iSerializer;
        int iIconCompatParcelizer;
        int iWrite;
        int i = this.IconCompatParcelizer;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.read; i3++) {
            int i4 = this.MediaMetadataCompat[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.RemoteActionCompatParcelizer[i3]).getClass();
                    iWrite = setSemanticsInvalidatedui.write(i5);
                } else if (i6 == 2) {
                    iWrite = setSemanticsInvalidatedui.write(i5, (setOnAttachui) this.RemoteActionCompatParcelizer[i3]);
                } else if (i6 == 3) {
                    iSerializer = setSemanticsInvalidatedui.serializer(i5) * 2;
                    iIconCompatParcelizer = ((getCoordinatesAccessedDuringModifierPlacement) this.RemoteActionCompatParcelizer[i3]).IconCompatParcelizer();
                } else {
                    if (i6 != 5) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.serializer());
                        return 0;
                    }
                    ((Integer) this.RemoteActionCompatParcelizer[i3]).getClass();
                    iWrite = setSemanticsInvalidatedui.RemoteActionCompatParcelizer(i5);
                }
                i2 = iWrite + i2;
            } else {
                long jLongValue = ((Long) this.RemoteActionCompatParcelizer[i3]).longValue();
                iSerializer = setSemanticsInvalidatedui.serializer(i5);
                iIconCompatParcelizer = setSemanticsInvalidatedui.IconCompatParcelizer(jLongValue);
            }
            i2 = iIconCompatParcelizer + iSerializer + i2;
        }
        this.IconCompatParcelizer = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getCoordinatesAccessedDuringModifierPlacement)) {
            return false;
        }
        getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement = (getCoordinatesAccessedDuringModifierPlacement) obj;
        int i = this.read;
        if (i == getcoordinatesaccessedduringmodifierplacement.read) {
            int[] iArr = this.MediaMetadataCompat;
            int[] iArr2 = getcoordinatesaccessedduringmodifierplacement.MediaMetadataCompat;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.RemoteActionCompatParcelizer;
            Object[] objArr2 = getcoordinatesaccessedduringmodifierplacement.RemoteActionCompatParcelizer;
            int i3 = this.read;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }
}
