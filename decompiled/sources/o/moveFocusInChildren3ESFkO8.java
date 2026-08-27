package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class moveFocusInChildren3ESFkO8 implements Iterable, Serializable {
    public static final moveFocusInChildren3ESFkO8 IconCompatParcelizer = new moveFocusInChildren3ESFkO8(topLeft.read);
    public static final OneDimensionalFocusSearchKtgenerateAndSearchChildren1 RemoteActionCompatParcelizer;
    public final byte[] serializer;
    public int write = 0;

    public int RemoteActionCompatParcelizer() {
        return 0;
    }

    static {
        RemoteActionCompatParcelizer = pickChildForForwardSearch.write() ? new requestFocusForChildInRootBounds() : new com.huawei.hmf.tasks.a.j(9);
    }

    public static moveFocusInChildren3ESFkO8 read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            } else if (i3 < i) {
                DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Beginning index larger than ending index: ", i3, ", "));
            } else {
                DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i3, "End index: ", length, " >= "));
            }
        }
        return new moveFocusInChildren3ESFkO8(RemoteActionCompatParcelizer.read(bArr, i, i2));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(this);
    }

    public int write() {
        return this.serializer.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z = obj instanceof moveFocusInChildren3ESFkO8;
        if (z) {
            moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8 = (moveFocusInChildren3ESFkO8) obj;
            if (write() == movefocusinchildren3esfko8.write()) {
                if (write() == 0) {
                    return true;
                }
                if (z) {
                    int i = this.write;
                    int i2 = movefocusinchildren3esfko8.write;
                    if (i == 0 || i2 == 0 || i == i2) {
                        int iWrite = write();
                        if (iWrite <= movefocusinchildren3esfko8.write()) {
                            if (iWrite <= movefocusinchildren3esfko8.write()) {
                                byte[] bArr = movefocusinchildren3esfko8.serializer;
                                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                                int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
                                int iRemoteActionCompatParcelizer3 = movefocusinchildren3esfko8.RemoteActionCompatParcelizer();
                                while (iRemoteActionCompatParcelizer2 < iRemoteActionCompatParcelizer + iWrite) {
                                    if (this.serializer[iRemoteActionCompatParcelizer2] == bArr[iRemoteActionCompatParcelizer3]) {
                                        iRemoteActionCompatParcelizer2++;
                                        iRemoteActionCompatParcelizer3++;
                                    }
                                }
                                return true;
                            }
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(movefocusinchildren3esfko8.write(), ff$$ExternalSyntheticOutline0.m(iWrite, "Ran off end of other: 0, ", ", "));
                            return false;
                        }
                        FieldType$$ExternalSyntheticBUOutline0.RemoteActionCompatParcelizer(iWrite, write());
                        return false;
                    }
                } else {
                    return obj.equals(this);
                }
            }
        }
        return false;
    }

    public moveFocusInChildren3ESFkO8(byte[] bArr) {
        bArr.getClass();
        this.serializer = bArr;
    }

    public final int hashCode() {
        int i = this.write;
        if (i != 0) {
            return i;
        }
        int iWrite = write();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i2 = iWrite;
        for (int i3 = iRemoteActionCompatParcelizer; i3 < iRemoteActionCompatParcelizer + iWrite; i3++) {
            i2 = (i2 * 31) + this.serializer[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.write = i2;
        return i2;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(write()));
    }
}
