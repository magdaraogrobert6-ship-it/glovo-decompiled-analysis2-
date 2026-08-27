package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InAppMessageHtmlBaseViewCompanion {
    public static final byte[] read = new byte[0];
    public static final Options serializer;

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        serializer = Options.Companion.serializer(ImageHeaderParserImageType.write("efbbbf"), ImageHeaderParserImageType.write("feff"), ImageHeaderParserImageType.write("fffe0000"), ImageHeaderParserImageType.write("fffe"), ImageHeaderParserImageType.write("0000feff"));
    }

    public static final int RemoteActionCompatParcelizer(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int write(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final void IconCompatParcelizer(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void IconCompatParcelizer(HttpUrlFetcher httpUrlFetcher, RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        httpUrlFetcher.getClass();
        try {
            IOException iOException = null;
            for (RecyclableBufferedInputStream recyclableBufferedInputStream2 : httpUrlFetcher.RatingCompat(recyclableBufferedInputStream)) {
                try {
                    if (httpUrlFetcher.MediaMetadataCompat(recyclableBufferedInputStream2).read) {
                        IconCompatParcelizer(httpUrlFetcher, recyclableBufferedInputStream2);
                    }
                    httpUrlFetcher.IconCompatParcelizer(recyclableBufferedInputStream2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String[] IconCompatParcelizer(Comparator comparator, String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int write(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        registryNoSourceEncoderAvailableException.getClass();
        return (registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem() & 255) | ((registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem() & 255) << 16) | ((registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem() & 255) << 8);
    }

    public static final void write(onCreateWindowlambda4 oncreatewindowlambda4, RecyclableBufferedInputStream recyclableBufferedInputStream) {
        oncreatewindowlambda4.getClass();
        recyclableBufferedInputStream.getClass();
        try {
            oncreatewindowlambda4.IconCompatParcelizer.IconCompatParcelizer(recyclableBufferedInputStream);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final boolean write(Comparator comparator, String[] strArr, String[] strArr2) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    try {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        DrawableTransformation.write(e.getMessage());
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean read(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int serializer(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int write(int i, String str, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (hideCurrentlyDisplayingInAppMessage.read(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int RemoteActionCompatParcelizer(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int RemoteActionCompatParcelizer(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (removeNodeAtDepth.serializer(cCharAt, 31) <= 0 || removeNodeAtDepth.serializer(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int read(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return RemoteActionCompatParcelizer(c, i, i2, str);
    }

    public static final int RemoteActionCompatParcelizer(char c, int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final void read(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "length=", ", offset=");
            sbM.append(j2);
            sbM.append(", count=");
            sbM.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbM.toString());
        }
    }
}
