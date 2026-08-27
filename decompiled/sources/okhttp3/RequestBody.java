package okhttp3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import o.HttpUrlFetcher;
import o.InAppMessageHtmlBaseView;
import o.ItemSingleChoiceBinding;
import o.RecyclableBufferedInputStream;
import o.RegistryNoImageHeaderParserException;
import o.RequestBuilder;
import o.getActiveFocusTargetNode;
import o.onItemDismisslambda0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.sourceInformationContextOfdefault;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RequestBody {
    public static final r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE Companion = new r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE();
    public static final RequestBody EMPTY;

    public long contentLength() {
        return -1L;
    }

    public abstract InAppMessageHtmlBaseView contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return this instanceof RequestBody$Companion$toRequestBody$2;
    }

    public abstract void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException);

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        requestBuilder.getClass();
        EMPTY = new RequestBody$Companion$toRequestBody$1(null, requestBuilder);
    }

    public static final RequestBody create(final RecyclableBufferedInputStream recyclableBufferedInputStream, final HttpUrlFetcher httpUrlFetcher, final InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        Companion.getClass();
        recyclableBufferedInputStream.getClass();
        httpUrlFetcher.getClass();
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
            @Override // okhttp3.RequestBody
            public final InAppMessageHtmlBaseView contentType() {
                return inAppMessageHtmlBaseView;
            }

            @Override // okhttp3.RequestBody
            public final long contentLength() {
                Long l = (Long) httpUrlFetcher.MediaMetadataCompat(recyclableBufferedInputStream).MediaBrowserCompatMediaItem;
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) throws IOException {
                ItemSingleChoiceBinding itemSingleChoiceBindingMediaSessionCompatToken = httpUrlFetcher.MediaSessionCompatToken(recyclableBufferedInputStream);
                try {
                    registryNoImageHeaderParserException.IconCompatParcelizer(itemSingleChoiceBindingMediaSessionCompatToken);
                    itemSingleChoiceBindingMediaSessionCompatToken.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        int i = sourceInformationContextOfdefault.read();
                        int i2 = sourceInformationContextOfdefault.read();
                        int i3 = sourceInformationContextOfdefault.read();
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{itemSingleChoiceBindingMediaSessionCompatToken, th}, i3);
                        throw th2;
                    }
                }
            }
        };
    }

    public static final RequestBody create(String str, InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        Companion.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str, inAppMessageHtmlBaseView);
    }

    @onItemDismisslambda0
    public static final RequestBody create(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, File file) {
        Companion.getClass();
        file.getClass();
        return new RequestBody$Companion$asRequestBody$1(inAppMessageHtmlBaseView, file);
    }

    @onItemDismisslambda0
    public static final RequestBody create(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str) {
        Companion.getClass();
        str.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str, inAppMessageHtmlBaseView);
    }

    @onItemDismisslambda0
    public static final RequestBody create(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, RequestBuilder requestBuilder) {
        Companion.getClass();
        requestBuilder.getClass();
        return new RequestBody$Companion$toRequestBody$1(inAppMessageHtmlBaseView, requestBuilder);
    }

    @onItemDismisslambda0
    public static final RequestBody create(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.write(inAppMessageHtmlBaseView, bArr, 0, bArr.length);
    }

    @onItemDismisslambda0
    public static final RequestBody create(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, byte[] bArr, int i) {
        Companion.getClass();
        bArr.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.write(inAppMessageHtmlBaseView, bArr, i, bArr.length);
    }

    public static final RequestBody create(final FileDescriptor fileDescriptor, final InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
            @Override // okhttp3.RequestBody
            public final InAppMessageHtmlBaseView contentType() {
                return inAppMessageHtmlBaseView;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) throws IOException {
                FileDescriptor fileDescriptor2 = fileDescriptor;
                FileInputStream fileInputStreamSerializer = getActiveFocusTargetNode.serializer(new FileInputStream(fileDescriptor2), fileDescriptor2);
                try {
                    registryNoImageHeaderParserException.MediaSessionCompatQueueItem().IconCompatParcelizer(Okio.RemoteActionCompatParcelizer(fileInputStreamSerializer));
                    fileInputStreamSerializer.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        int i = sourceInformationContextOfdefault.read();
                        int i2 = sourceInformationContextOfdefault.read();
                        int i3 = sourceInformationContextOfdefault.read();
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamSerializer, th}, i3);
                        throw th2;
                    }
                }
            }
        };
    }

    public static final RequestBody create(byte[] bArr) {
        r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = Companion;
        r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
        bArr.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(r8lambdaz90zxc5cr3ctjy9kwemhzodg3le, bArr, null, 0, 7);
    }

    public static final RequestBody create(byte[] bArr, InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = Companion;
        r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
        bArr.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(r8lambdaz90zxc5cr3ctjy9kwemhzodg3le, bArr, inAppMessageHtmlBaseView, 0, 6);
    }

    public static final RequestBody create(byte[] bArr, InAppMessageHtmlBaseView inAppMessageHtmlBaseView, int i) {
        r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = Companion;
        r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
        bArr.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(r8lambdaz90zxc5cr3ctjy9kwemhzodg3le, bArr, inAppMessageHtmlBaseView, i, 4);
    }

    public static final RequestBody create(byte[] bArr, InAppMessageHtmlBaseView inAppMessageHtmlBaseView, int i, int i2) {
        Companion.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.write(inAppMessageHtmlBaseView, bArr, i, i2);
    }

    public static final RequestBody create(RequestBuilder requestBuilder, InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        Companion.getClass();
        requestBuilder.getClass();
        return new RequestBody$Companion$toRequestBody$1(inAppMessageHtmlBaseView, requestBuilder);
    }

    public static final RequestBody create(File file, InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        Companion.getClass();
        file.getClass();
        return new RequestBody$Companion$asRequestBody$1(inAppMessageHtmlBaseView, file);
    }

    @onItemDismisslambda0
    public static final RequestBody create(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.write(inAppMessageHtmlBaseView, bArr, i, i2);
    }
}
