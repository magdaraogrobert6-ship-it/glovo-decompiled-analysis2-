package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setCustomLocationAttributelambda2 {
    public static final RequestBuilder IconCompatParcelizer;
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(setDateOfBirthlambda1.class.getName());

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        IconCompatParcelizer = ImageHeaderParserImageType.serializer("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static void serializer(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(java.util.Locale.US, str, objArr));
    }

    public static int read(GifDrawableTransformation gifDrawableTransformation) {
        return (gifDrawableTransformation.MediaBrowserCompatMediaItem() & 255) | ((gifDrawableTransformation.MediaBrowserCompatMediaItem() & 255) << 16) | ((gifDrawableTransformation.MediaBrowserCompatMediaItem() & 255) << 8);
    }

    public static int read(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        serializer("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
