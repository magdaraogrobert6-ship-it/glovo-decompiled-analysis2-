package o;

import io.sentry.SentryUUID;
import java.nio.charset.Charset;
import o.InAppMessageHtmlBaseView;
import o.RegistryNoImageHeaderParserException;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE {
    public static RequestBody$Companion$toRequestBody$3 serializer(String str, InAppMessageHtmlBaseView inAppMessageHtmlBaseView) {
        str.getClass();
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0Serializer = SentryUUID.serializer(inAppMessageHtmlBaseView);
        Charset charset = (Charset) onviewattachedtowindowlambda0Serializer.serializer;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView2 = (InAppMessageHtmlBaseView) onviewattachedtowindowlambda0Serializer.write;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return write(inAppMessageHtmlBaseView2, bytes, 0, bytes.length);
    }

    public static /* synthetic */ RequestBody$Companion$toRequestBody$3 RemoteActionCompatParcelizer(r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le, byte[] bArr, InAppMessageHtmlBaseView inAppMessageHtmlBaseView, int i, int i2) {
        if ((i2 & 1) != 0) {
            inAppMessageHtmlBaseView = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
        return write(inAppMessageHtmlBaseView, bArr, i, length);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.RequestBody$Companion$toRequestBody$3] */
    public static RequestBody$Companion$toRequestBody$3 write(final InAppMessageHtmlBaseView inAppMessageHtmlBaseView, final byte[] bArr, final int i, final int i2) {
        bArr.getClass();
        InAppMessageHtmlBaseViewCompanion.read(bArr.length, i, i2);
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
            @Override // okhttp3.RequestBody
            public final long contentLength() {
                return i2;
            }

            @Override // okhttp3.RequestBody
            public final InAppMessageHtmlBaseView contentType() {
                return inAppMessageHtmlBaseView;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
                registryNoImageHeaderParserException.RemoteActionCompatParcelizer(bArr, i, i2);
            }
        };
    }
}
