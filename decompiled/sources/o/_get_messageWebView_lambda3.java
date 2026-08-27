package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class _get_messageWebView_lambda3 implements Closeable {
    public static final _get_messageWebView_lambda4 EMPTY;
    public finishWebViewDisplaylambda0 reader;

    public abstract long IconCompatParcelizer();

    public abstract RegistryNoSourceEncoderAvailableException read();

    public abstract InAppMessageHtmlBaseView write();

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        requestBuilder.getClass();
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        registryMissingComponentException.serializer(requestBuilder);
        EMPTY = new _get_messageWebView_lambda4(null, requestBuilder.data.length, registryMissingComponentException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(read());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:25:0x0005 }] */
    public final String MediaMetadataCompat() {
        String strIconCompatParcelizer;
        Charset charsetSerializer;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = read();
        Throwable th = null;
        try {
            InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = write();
            if (inAppMessageHtmlBaseViewWrite != null) {
                getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                charsetSerializer = inAppMessageHtmlBaseViewWrite.serializer(null);
                if (charsetSerializer == null) {
                    charsetSerializer = ensureSubscribedToInAppMessageEvents.write;
                }
            } else {
                charsetSerializer = ensureSubscribedToInAppMessageEvents.write;
            }
            strIconCompatParcelizer = registryNoSourceEncoderAvailableException.IconCompatParcelizer(setWebViewContent.serializer(registryNoSourceEncoderAvailableException, charsetSerializer));
            try {
                registryNoSourceEncoderAvailableException.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (registryNoSourceEncoderAvailableException != null) {
                try {
                    registryNoSourceEncoderAvailableException.close();
                } catch (Throwable th4) {
                    markOnScreenCardsAsReadlambda1.read(th3, th4);
                }
            }
            strIconCompatParcelizer = null;
            th = th3;
        }
        if (th == null) {
            return strIconCompatParcelizer;
        }
        throw th;
    }

    public final byte[] serializer() throws Throwable {
        byte[] bArrPlaybackStateCompat;
        long jIconCompatParcelizer = IconCompatParcelizer();
        Throwable th = null;
        if (jIconCompatParcelizer > 2147483647L) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(jIconCompatParcelizer, "Cannot buffer entire body for content length: "));
            return null;
        }
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = read();
        try {
            bArrPlaybackStateCompat = registryNoSourceEncoderAvailableException.PlaybackStateCompat();
            try {
                registryNoSourceEncoderAvailableException.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (registryNoSourceEncoderAvailableException != null) {
                try {
                    registryNoSourceEncoderAvailableException.close();
                } catch (Throwable th4) {
                    markOnScreenCardsAsReadlambda1.read(th3, th4);
                }
            }
            bArrPlaybackStateCompat = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        int length = bArrPlaybackStateCompat.length;
        if (jIconCompatParcelizer == -1 || jIconCompatParcelizer == length) {
            return bArrPlaybackStateCompat;
        }
        throw new IOException("Content-Length (" + jIconCompatParcelizer + ") and stream length (" + length + ") disagree");
    }
}
