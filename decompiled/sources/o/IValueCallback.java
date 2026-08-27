package o;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.Writer$FieldOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class IValueCallback {
    public static final IValueCallback write = new IValueCallback(0, new int[0], new Object[0], false);
    public int IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public Object[] read;
    public int[] serializer;

    public IValueCallback(int i, int[] iArr, Object[] objArr, boolean z) {
        this.RemoteActionCompatParcelizer = -1;
        this.IconCompatParcelizer = i;
        this.serializer = iArr;
        this.read = objArr;
        this.MediaDescriptionCompat = z;
    }

    public final void read(accessisOfflinep accessisofflinep) {
        if (this.IconCompatParcelizer == 0) {
            return;
        }
        accessisofflinep.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            int i2 = this.serializer[i];
            Object obj = this.read[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                accessisofflinep.serializer(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                accessisofflinep.RemoteActionCompatParcelizer(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                accessisofflinep.RemoteActionCompatParcelizer(i3, (ByteString) obj);
            } else if (i4 == 3) {
                setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) accessisofflinep.RemoteActionCompatParcelizer;
                Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.ASCENDING;
                setruntimeappconfigurationprovider.write(i3, 3);
                ((IValueCallback) obj).read(accessisofflinep);
                setruntimeappconfigurationprovider.write(i3, 4);
            } else {
                if (i4 != 5) {
                    DrawableTransformation.read((Throwable) com.sentiance.protobuf.InvalidProtocolBufferException.IconCompatParcelizer());
                    return;
                }
                accessisofflinep.write(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int[] iArr = this.serializer;
        int iHashCode = 17;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        Object[] objArr = this.read;
        int i4 = this.IconCompatParcelizer;
        for (int i5 = 0; i5 < i4; i5++) {
            iHashCode = (iHashCode * 31) + objArr[i5].hashCode();
        }
        return ((((i + 527) * 31) + i2) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IValueCallback)) {
            return false;
        }
        IValueCallback iValueCallback = (IValueCallback) obj;
        int i = this.IconCompatParcelizer;
        if (i == iValueCallback.IconCompatParcelizer) {
            int[] iArr = this.serializer;
            int[] iArr2 = iValueCallback.serializer;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.read;
            Object[] objArr2 = iValueCallback.read;
            int i3 = this.IconCompatParcelizer;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int read() {
        int iSerializer;
        int i;
        int iSerializer2;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.IconCompatParcelizer; i4++) {
            int i5 = this.serializer[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        ByteString byteString = (ByteString) this.read[i4];
                        int iSerializer3 = setRuntimeAppConfigurationProvider.serializer(i6);
                        int iSerializer4 = byteString.serializer();
                        i3 = setRuntimeAppConfigurationProvider.read(iSerializer4) + iSerializer4 + iSerializer3 + i3;
                    } else if (i7 == 3) {
                        iSerializer = setRuntimeAppConfigurationProvider.serializer(i6) * 2;
                        i = ((IValueCallback) this.read[i4]).read();
                    } else {
                        if (i7 != 5) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(com.sentiance.protobuf.InvalidProtocolBufferException.IconCompatParcelizer());
                            return 0;
                        }
                        ((Integer) this.read[i4]).getClass();
                        iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i6) + 4;
                    }
                } else {
                    ((Long) this.read[i4]).getClass();
                    iSerializer2 = setRuntimeAppConfigurationProvider.serializer(i6) + 8;
                }
                i3 = iSerializer2 + i3;
            } else {
                long jLongValue = ((Long) this.read[i4]).longValue();
                iSerializer = setRuntimeAppConfigurationProvider.serializer(i6);
                i = setRuntimeAppConfigurationProvider.read(jLongValue);
            }
            i3 = i + iSerializer + i3;
        }
        this.RemoteActionCompatParcelizer = i3;
        return i3;
    }

    public IValueCallback() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean RemoteActionCompatParcelizer(int i, com.sentiance.protobuf.u uVar) throws com.sentiance.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        int i2;
        serializer();
        int i3 = i & 7;
        if (i3 == 0) {
            write(i, Long.valueOf(uVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()));
            return true;
        }
        if (i3 == 1) {
            write(i, Long.valueOf(uVar.ResultReceiver()));
            return true;
        }
        if (i3 == 2) {
            write(i, uVar.MediaSessionCompatToken());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw com.sentiance.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
            }
            write(i, Integer.valueOf(uVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
            return true;
        }
        IValueCallback iValueCallback = new IValueCallback();
        do {
            i2 = uVar.read();
            if (i2 == 0) {
                break;
            }
        } while (iValueCallback.RemoteActionCompatParcelizer(i2, uVar));
        uVar.RemoteActionCompatParcelizer(4 | ((i >>> 3) << 3));
        write(i, iValueCallback);
        return true;
    }

    public final void serializer() {
        if (this.MediaDescriptionCompat) {
            return;
        }
        getAlignmentLinesMap.write();
    }

    public final void write(int i, Object obj) {
        serializer();
        serializer(this.IconCompatParcelizer + 1);
        int[] iArr = this.serializer;
        int i2 = this.IconCompatParcelizer;
        iArr[i2] = i;
        this.read[i2] = obj;
        this.IconCompatParcelizer = i2 + 1;
    }

    public final void serializer(int i) {
        int[] iArr = this.serializer;
        if (i > iArr.length) {
            int i2 = this.IconCompatParcelizer;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.serializer = Arrays.copyOf(iArr, i);
            this.read = Arrays.copyOf(this.read, i);
        }
    }

    public static IValueCallback IconCompatParcelizer(IValueCallback iValueCallback, IValueCallback iValueCallback2) {
        int i = iValueCallback.IconCompatParcelizer + iValueCallback2.IconCompatParcelizer;
        int[] iArrCopyOf = Arrays.copyOf(iValueCallback.serializer, i);
        System.arraycopy(iValueCallback2.serializer, 0, iArrCopyOf, iValueCallback.IconCompatParcelizer, iValueCallback2.IconCompatParcelizer);
        Object[] objArrCopyOf = Arrays.copyOf(iValueCallback.read, i);
        System.arraycopy(iValueCallback2.read, 0, objArrCopyOf, iValueCallback.IconCompatParcelizer, iValueCallback2.IconCompatParcelizer);
        return new IValueCallback(i, iArrCopyOf, objArrCopyOf, true);
    }
}
