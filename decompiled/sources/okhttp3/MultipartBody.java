package okhttp3;

import androidx.sqlite.SQLite;
import java.io.EOFException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.InAppMessageHtmlBaseView;
import o.RegistryMissingComponentException;
import o.RegistryNoImageHeaderParserException;
import o.RequestBuilder;
import o.getInAppMessageEventMap;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;
import o.resetMessageMarginslambda00;

/* JADX INFO: loaded from: classes4.dex */
public final class MultipartBody extends RequestBody {
    public static final InAppMessageHtmlBaseView IconCompatParcelizer;
    public static final byte[] RemoteActionCompatParcelizer;
    public static final byte[] read;
    public static final InAppMessageHtmlBaseView serializer;
    public static final byte[] write;
    public final RequestBuilder MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public final InAppMessageHtmlBaseView MediaMetadataCompat;
    public final List RatingCompat;

    @Override // okhttp3.RequestBody
    public final InAppMessageHtmlBaseView contentType() {
        return this.MediaMetadataCompat;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) throws EOFException {
        IconCompatParcelizer(registryNoImageHeaderParserException, false);
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        List list = this.RatingCompat;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) it.next()).body.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    public MultipartBody(RequestBuilder requestBuilder, InAppMessageHtmlBaseView inAppMessageHtmlBaseView, List list) {
        requestBuilder.getClass();
        inAppMessageHtmlBaseView.getClass();
        this.MediaBrowserCompatMediaItem = requestBuilder;
        this.RatingCompat = list;
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        this.MediaMetadataCompat = SQLite.write(inAppMessageHtmlBaseView + "; boundary=" + requestBuilder.RatingCompat());
        this.MediaDescriptionCompat = -1L;
    }

    static {
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        IconCompatParcelizer = SQLite.write("multipart/mixed");
        SQLite.write("multipart/alternative");
        SQLite.write("multipart/digest");
        SQLite.write("multipart/parallel");
        serializer = SQLite.write("multipart/form-data");
        RemoteActionCompatParcelizer = new byte[]{58, 32};
        write = new byte[]{13, 10};
        read = new byte[]{45, 45};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long IconCompatParcelizer(RegistryNoImageHeaderParserException registryNoImageHeaderParserException, boolean z) throws EOFException {
        RegistryMissingComponentException registryMissingComponentException;
        RegistryNoImageHeaderParserException registryMissingComponentException2;
        if (z) {
            registryMissingComponentException2 = new RegistryMissingComponentException();
            registryMissingComponentException = registryMissingComponentException2;
        } else {
            registryMissingComponentException = 0;
            registryMissingComponentException2 = registryNoImageHeaderParserException;
        }
        List list = this.RatingCompat;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            RequestBuilder requestBuilder = this.MediaBrowserCompatMediaItem;
            byte[] bArr = read;
            byte[] bArr2 = write;
            if (i < size) {
                r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri = (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) list.get(i);
                resetMessageMarginslambda00 resetmessagemarginslambda00 = r8lambdacteglfiy2n5eeyl50py32ciczri.headers;
                RequestBody requestBody = r8lambdacteglfiy2n5eeyl50py32ciczri.body;
                registryMissingComponentException2.getClass();
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr);
                registryMissingComponentException2.IconCompatParcelizer(requestBuilder);
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr2);
                int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
                for (int i2 = 0; i2 < iRemoteActionCompatParcelizer; i2++) {
                    registryMissingComponentException2.read(resetmessagemarginslambda00.serializer(i2)).RemoteActionCompatParcelizer(RemoteActionCompatParcelizer).read(resetmessagemarginslambda00.read(i2)).RemoteActionCompatParcelizer(bArr2);
                }
                InAppMessageHtmlBaseView inAppMessageHtmlBaseViewContentType = requestBody.contentType();
                if (inAppMessageHtmlBaseViewContentType != null) {
                    registryMissingComponentException2.read("Content-Type: ").read(inAppMessageHtmlBaseViewContentType.mediaType).RemoteActionCompatParcelizer(bArr2);
                }
                long jContentLength = requestBody.contentLength();
                if (jContentLength == -1 && z) {
                    registryMissingComponentException.getClass();
                    registryMissingComponentException.serializer();
                    return -1L;
                }
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr2);
                if (z) {
                    j += jContentLength;
                } else {
                    requestBody.writeTo(registryMissingComponentException2);
                }
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr2);
                i++;
            } else {
                registryMissingComponentException2.getClass();
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr);
                registryMissingComponentException2.IconCompatParcelizer(requestBuilder);
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr);
                registryMissingComponentException2.RemoteActionCompatParcelizer(bArr2);
                if (!z) {
                    return j;
                }
                registryMissingComponentException.getClass();
                long j2 = j + registryMissingComponentException.size;
                registryMissingComponentException.serializer();
                return j2;
            }
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws EOFException {
        long j = this.MediaDescriptionCompat;
        if (j != -1) {
            return j;
        }
        long jIconCompatParcelizer = IconCompatParcelizer(null, true);
        this.MediaDescriptionCompat = jIconCompatParcelizer;
        return jIconCompatParcelizer;
    }
}
