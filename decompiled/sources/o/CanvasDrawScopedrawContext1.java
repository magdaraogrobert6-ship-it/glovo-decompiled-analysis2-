package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.util.UrlUtils;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasDrawScopedrawContext1 implements accessgetMaxp {
    public static final byte[] IconCompatParcelizer = "Exif\u0000\u0000".getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
    public static final byte[] serializer = "MPF".getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
    public static final int[] write = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int serializer(setGraphicsLayer setgraphicslayer, getF getf) {
        try {
            int iWrite = setgraphicslayer.write();
            if ((iWrite & 65496) != 65496 && iWrite != 19789 && iWrite != 18761) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setgraphicslayer, 225);
            if (iRemoteActionCompatParcelizer == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) getf.IconCompatParcelizer(byte[].class, iRemoteActionCompatParcelizer);
            try {
                return RemoteActionCompatParcelizer(setgraphicslayer, bArr, iRemoteActionCompatParcelizer);
            } finally {
                getf.IconCompatParcelizer(bArr);
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
            return -1;
        }
    }

    public static boolean IconCompatParcelizer(setGraphicsLayer setgraphicslayer, getF getf) {
        if (read(setgraphicslayer) != ImageHeaderParser$ImageType.JPEG) {
            return false;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setgraphicslayer, Constant.ERROR_WSS_SPEED_JUMP);
        while (iRemoteActionCompatParcelizer > 0) {
            byte[] bArr = (byte[]) getf.IconCompatParcelizer(byte[].class, iRemoteActionCompatParcelizer);
            try {
                if (setgraphicslayer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, bArr) != iRemoteActionCompatParcelizer) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else if (serializer(iRemoteActionCompatParcelizer, bArr, serializer)) {
                    getf.IconCompatParcelizer(bArr);
                    return true;
                }
                getf.IconCompatParcelizer(bArr);
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setgraphicslayer, Constant.ERROR_WSS_SPEED_JUMP);
            } catch (Throwable th) {
                getf.IconCompatParcelizer(bArr);
                throw th;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 2);
        return false;
    }

    public static boolean serializer(int i, byte[] bArr, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    public static int RemoteActionCompatParcelizer(setGraphicsLayer setgraphicslayer, byte[] bArr, int i) {
        ByteOrder byteOrder;
        if (setgraphicslayer.RemoteActionCompatParcelizer(i, bArr) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (!serializer(i, bArr, IconCompatParcelizer)) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
        if (s == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (s != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBuffer.order(byteOrder);
        int i2 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        int i3 = i2 + 6;
        short s2 = byteBuffer.remaining() - i3 >= 2 ? byteBuffer.getShort(i3) : (short) -1;
        for (int i4 = 0; i4 < s2; i4++) {
            int i5 = (i4 * 12) + i2 + 8;
            if (byteBuffer.remaining() - i5 >= 2 && byteBuffer.getShort(i5) == 274) {
                int i6 = i5 + 2;
                short s3 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                if (s3 < 1 || s3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i7 = i5 + 4;
                    int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                    if (i8 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i9 = i8 + write[s3];
                        if (i9 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i10 = i5 + 8;
                            if (i10 < 0 || i10 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                    if (byteBuffer.remaining() - i10 >= 2) {
                                        return byteBuffer.getShort(i10);
                                    }
                                    return -1;
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType read(setGraphicsLayer setgraphicslayer) {
        try {
            int iWrite = setgraphicslayer.write();
            if (iWrite == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iIconCompatParcelizer = (iWrite << 8) | setgraphicslayer.IconCompatParcelizer();
            if (iIconCompatParcelizer == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iIconCompatParcelizer2 = (iIconCompatParcelizer << 8) | setgraphicslayer.IconCompatParcelizer();
            if (iIconCompatParcelizer2 == -1991225785) {
                setgraphicslayer.serializer(21L);
                try {
                    return setgraphicslayer.IconCompatParcelizer() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iIconCompatParcelizer2 == 1380533830) {
                setgraphicslayer.serializer(4L);
                if (((setgraphicslayer.write() << 16) | setgraphicslayer.write()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iWrite2 = (setgraphicslayer.write() << 16) | setgraphicslayer.write();
                if ((iWrite2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iWrite2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    setgraphicslayer.serializer(4L);
                    return (setgraphicslayer.IconCompatParcelizer() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                setgraphicslayer.serializer(4L);
                short sIconCompatParcelizer = setgraphicslayer.IconCompatParcelizer();
                if ((sIconCompatParcelizer & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sIconCompatParcelizer & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((setgraphicslayer.write() << 16) | setgraphicslayer.write()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iWrite3 = (setgraphicslayer.write() << 16) | setgraphicslayer.write();
            if (iWrite3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iWrite3 == 1635150182;
            setgraphicslayer.serializer(4L);
            int i3 = iIconCompatParcelizer2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iWrite4 = (setgraphicslayer.write() << 16) | setgraphicslayer.write();
                    if (iWrite4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iWrite4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int RemoteActionCompatParcelizer(setGraphicsLayer setgraphicslayer, int i) {
        while (setgraphicslayer.IconCompatParcelizer() == 255) {
            short sIconCompatParcelizer = setgraphicslayer.IconCompatParcelizer();
            if (sIconCompatParcelizer == 218) {
                return -1;
            }
            if (sIconCompatParcelizer == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iWrite = setgraphicslayer.write() - 2;
            if (sIconCompatParcelizer == i) {
                return iWrite;
            }
            long j = iWrite;
            if (setgraphicslayer.serializer(j) != j) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    @Override // o.accessgetMaxp
    public final int write(ByteBuffer byteBuffer, getF getf) {
        getDefaultDensity getdefaultdensity = new getDefaultDensity(byteBuffer, 1);
        UrlUtils.serializer(getf, "Argument must not be null");
        return serializer(getdefaultdensity, getf);
    }

    @Override // o.accessgetMaxp
    public final int RemoteActionCompatParcelizer(InputStream inputStream, getF getf) {
        getExponentimpl getexponentimpl = new getExponentimpl(16, inputStream);
        UrlUtils.serializer(getf, "Argument must not be null");
        return serializer(getexponentimpl, getf);
    }

    @Override // o.accessgetMaxp
    public final boolean read(ByteBuffer byteBuffer, getF getf) {
        getDefaultDensity getdefaultdensity = new getDefaultDensity(byteBuffer, 1);
        UrlUtils.serializer(getf, "Argument must not be null");
        return IconCompatParcelizer(getdefaultdensity, getf);
    }

    @Override // o.accessgetMaxp
    public final boolean read(InputStream inputStream, getF getf) {
        UrlUtils.serializer(inputStream, "Argument must not be null");
        getExponentimpl getexponentimpl = new getExponentimpl(16, inputStream);
        UrlUtils.serializer(getf, "Argument must not be null");
        return IconCompatParcelizer(getexponentimpl, getf);
    }

    @Override // o.accessgetMaxp
    public final ImageHeaderParser$ImageType read(ByteBuffer byteBuffer) {
        UrlUtils.serializer(byteBuffer, "Argument must not be null");
        return read(new getDefaultDensity(byteBuffer, 1));
    }

    @Override // o.accessgetMaxp
    public final ImageHeaderParser$ImageType IconCompatParcelizer(InputStream inputStream) {
        return read(new getExponentimpl(16, inputStream));
    }
}
