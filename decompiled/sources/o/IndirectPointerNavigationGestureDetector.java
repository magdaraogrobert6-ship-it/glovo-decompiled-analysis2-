package o;

import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.nio.ByteBuffer;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IndirectPointerNavigationGestureDetector {
    public static final DelayKt write;

    public static int read(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int write(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int read(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return write(b, bArr[i]);
        }
        if (i3 == 2) {
            return read(b, bArr[i], bArr[i + 1]);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
        return 0;
    }

    public static String write(ByteBuffer byteBuffer, int i, int i2) {
        DelayKt delayKt = write;
        delayKt.getClass();
        if (byteBuffer.hasArray()) {
            return delayKt.RemoteActionCompatParcelizer(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? delayKt.RemoteActionCompatParcelizer(byteBuffer, i, i2) : DelayKt.serializer(byteBuffer, i, i2);
    }

    static {
        write = (setDirty.IconCompatParcelizer && setDirty.write && !updateInterceptor.RemoteActionCompatParcelizer()) ? new cancelCurrentEventStream(1) : new cancelCurrentEventStream(0);
    }

    public static int serializer(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new Utf8$UnpairedSurrogateException(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer(((long) i2) + 4294967296L, "UTF-8 length does not fit in int: ");
        return 0;
    }
}
