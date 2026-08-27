package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class getPushID implements Closeable {
    public static final int[] read;
    public static final int[] write;
    public getChatType MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final InputStream MediaSessionCompatQueueItem;
    public static final short[] RemoteActionCompatParcelizer = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    public static final int[] IconCompatParcelizer = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    public static final int[] serializer = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public final InternalPointerEvent RatingCompat = new InternalPointerEvent(2);
    public getTangenttuRUvjQ MediaBrowserCompatMediaItem = new getChatStatus();

    static {
        int[] iArr = new int[288];
        read = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, androidx.compose.ui.graphics.Fields.RotationX, 9);
        Arrays.fill(iArr, androidx.compose.ui.graphics.Fields.RotationX, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        write = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public static RetryWithDelay read(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Invalid code ", " in literal table"));
                return null;
            }
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        RetryWithDelay retryWithDelay = new RetryWithDelay(0);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                RetryWithDelay retryWithDelay2 = retryWithDelay;
                int i9 = i7;
                while (true) {
                    int i10 = retryWithDelay2.write;
                    if (i9 < 0) {
                        retryWithDelay2.RemoteActionCompatParcelizer = i5;
                        retryWithDelay2.IconCompatParcelizer = null;
                        retryWithDelay2.read = null;
                        iArr3[i7] = iArr3[i7] + 1;
                        break;
                    }
                    if (((1 << i9) & i8) == 0) {
                        if (((RetryWithDelay) retryWithDelay2.IconCompatParcelizer) == null && retryWithDelay2.RemoteActionCompatParcelizer == -1) {
                            retryWithDelay2.IconCompatParcelizer = new RetryWithDelay(i10 + 1);
                        }
                        retryWithDelay2 = (RetryWithDelay) retryWithDelay2.IconCompatParcelizer;
                    } else {
                        if (((RetryWithDelay) retryWithDelay2.read) == null && retryWithDelay2.RemoteActionCompatParcelizer == -1) {
                            retryWithDelay2.read = new RetryWithDelay(i10 + 1);
                        }
                        retryWithDelay2 = (RetryWithDelay) retryWithDelay2.read;
                    }
                    if (retryWithDelay2 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("node doesn't exist in Huffman tree");
                        return null;
                    }
                    i9--;
                }
            }
        }
        return retryWithDelay;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.MediaBrowserCompatMediaItem = new getChatStatus();
        this.MediaDescriptionCompat = null;
    }

    public final int serializer(byte[] bArr, int i, int i2) throws IOException {
        long jSerializer;
        while (true) {
            if (this.MediaMetadataCompat && !this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()) {
                return -1;
            }
            if (this.MediaBrowserCompatMediaItem.serializer() == EnumC0167getChatId.INITIAL) {
                this.MediaMetadataCompat = serializer(this.MediaDescriptionCompat, 1) == 1;
                int i3 = 2;
                int iSerializer = (int) serializer(this.MediaDescriptionCompat, 2);
                if (iSerializer == 0) {
                    getChatType getchattype = this.MediaDescriptionCompat;
                    int i4 = getchattype.RemoteActionCompatParcelizer % 8;
                    if (i4 > 0) {
                        getchattype.read(i4);
                    }
                    long jSerializer2 = serializer(this.MediaDescriptionCompat, 16);
                    if ((65535 & (jSerializer2 ^ 65535)) != serializer(this.MediaDescriptionCompat, 16)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Illegal LEN / NLEN values");
                        return 0;
                    }
                    this.MediaBrowserCompatMediaItem = new getTotalUnreadMessageCount(this, jSerializer2);
                } else if (iSerializer == 1) {
                    this.MediaBrowserCompatMediaItem = new UnreadCountDetailsChat(this, EnumC0167getChatId.FIXED_CODES, read, write);
                } else {
                    if (iSerializer != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(iSerializer, "Unsupported compression: "));
                        return 0;
                    }
                    int[][] iArr = {new int[(int) (serializer(this.MediaDescriptionCompat, 5) + 257)], new int[(int) (serializer(this.MediaDescriptionCompat, 5) + 1)]};
                    getChatType getchattype2 = this.MediaDescriptionCompat;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iSerializer2 = (int) (serializer(getchattype2, 4) + 4);
                    int[] iArr4 = new int[19];
                    for (int i5 = 0; i5 < iSerializer2; i5++) {
                        iArr4[serializer[i5]] = (int) serializer(getchattype2, 3);
                    }
                    RetryWithDelay retryWithDelay = read(iArr4);
                    int length = iArr2.length + iArr3.length;
                    int[] iArr5 = new int[length];
                    int i6 = 0;
                    int iSerializer3 = 0;
                    int i7 = -1;
                    while (i6 < length) {
                        if (iSerializer3 > 0) {
                            iArr5[i6] = i7;
                            iSerializer3--;
                            i6++;
                        } else {
                            int i8 = read(getchattype2, retryWithDelay);
                            if (i8 >= 16) {
                                long j = 3;
                                switch (i8) {
                                    case 16:
                                        iSerializer3 = (int) (serializer(getchattype2, i3) + 3);
                                        break;
                                    case 17:
                                        jSerializer = serializer(getchattype2, 3);
                                        iSerializer3 = (int) (jSerializer + j);
                                        i7 = 0;
                                        break;
                                    case 18:
                                        jSerializer = serializer(getchattype2, 7);
                                        j = 11;
                                        iSerializer3 = (int) (jSerializer + j);
                                        i7 = 0;
                                        break;
                                    default:
                                        break;
                                }
                            } else {
                                iArr5[i6] = i8;
                                i6++;
                                i7 = i8;
                            }
                            getchattype2 = getchattype2;
                            i3 = 2;
                        }
                    }
                    System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                    System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                    this.MediaBrowserCompatMediaItem = new UnreadCountDetailsChat(this, EnumC0167getChatId.DYNAMIC_CODES, iArr[0], iArr[1]);
                }
            } else {
                int iSerializer4 = this.MediaBrowserCompatMediaItem.serializer(bArr, i, i2);
                if (iSerializer4 != 0) {
                    return iSerializer4;
                }
            }
        }
    }

    public static int read(getChatType getchattype, RetryWithDelay retryWithDelay) {
        Object obj;
        while (retryWithDelay != null && retryWithDelay.RemoteActionCompatParcelizer == -1) {
            if (serializer(getchattype, 1) == 0) {
                obj = retryWithDelay.IconCompatParcelizer;
            } else {
                obj = retryWithDelay.read;
            }
            retryWithDelay = (RetryWithDelay) obj;
        }
        if (retryWithDelay != null) {
            return retryWithDelay.RemoteActionCompatParcelizer;
        }
        return -1;
    }

    public getPushID(InputStream inputStream) {
        this.MediaDescriptionCompat = new getChatType(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.MediaSessionCompatQueueItem = inputStream;
    }

    public static long serializer(getChatType getchattype, int i) throws IOException {
        long jIconCompatParcelizer = getchattype.IconCompatParcelizer(i);
        if (jIconCompatParcelizer != -1) {
            return jIconCompatParcelizer;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }
}
