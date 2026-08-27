package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import okhttp3.RequestBody;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageImageView implements setMessageHeaderTextColor {
    public static final resetMessageMarginslambda00 read;
    public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final RegistryNoSourceEncoderAvailableException RatingCompat;
    public final r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c RemoteActionCompatParcelizer;
    public final resizeGraphicFrameIfAppropriatelambda0 serializer;
    public final RegistryNoImageHeaderParserException write;

    @Override // o.setMessageHeaderTextColor
    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem == 6;
    }

    @Override // o.setMessageHeaderTextColor
    public final r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.setMessageHeaderTextColor
    public final ItemSingleChoiceBinding IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        if (!r8lambdap5NIwcfORIsaQELQLeY6t8PSkNM.IconCompatParcelizer(_get_messagewebview_lambda1)) {
            return serializer(r8lambday113fdftsr5e4pzj6xssxltpl60.url, 0L);
        }
        if ("chunked".equalsIgnoreCase(_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Transfer-Encoding"))) {
            setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
            int i = this.MediaBrowserCompatMediaItem;
            if (i == 4) {
                this.MediaBrowserCompatMediaItem = 5;
                return new setInAppMessageImageView(this, setinappmessageimageviewattributes);
            }
            DrawableTransformation.read(i, "state: ");
            return null;
        }
        long j = setWebViewContent.read(_get_messagewebview_lambda1);
        if (j != -1) {
            return serializer(r8lambday113fdftsr5e4pzj6xssxltpl60.url, j);
        }
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes2 = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        int i2 = this.MediaBrowserCompatMediaItem;
        if (i2 != 4) {
            DrawableTransformation.read(i2, "state: ");
            return null;
        }
        this.MediaBrowserCompatMediaItem = 5;
        this.RemoteActionCompatParcelizer.RatingCompat();
        setinappmessageimageviewattributes2.getClass();
        return new InAppMessageModalViewExternalSyntheticLambda1(this, setinappmessageimageviewattributes2);
    }

    @Override // o.setMessageHeaderTextColor
    public final r8lambdarYwWjKRktijBy60CMMjcRC1Oqk IconCompatParcelizer(boolean z) throws IOException {
        resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = this.serializer;
        int i = this.MediaBrowserCompatMediaItem;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            DrawableTransformation.read(i, "state: ");
            return null;
        }
        try {
            String strSerializer = ((RegistryNoSourceEncoderAvailableException) resizegraphicframeifappropriatelambda0.serializer).serializer(resizegraphicframeifappropriatelambda0.write);
            resizegraphicframeifappropriatelambda0.write -= (long) strSerializer.length();
            resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = UrlUtils.read(strSerializer);
            int i2 = resizegraphicframeifappropriate.serializer;
            r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqk = new r8lambdarYwWjKRktijBy60CMMjcRC1Oqk();
            r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = (r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc) resizegraphicframeifappropriate.read;
            r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
            r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaSessionCompatQueueItem = r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
            r8lambdarywwjkrktijby60cmmjcrc1oqk.serializer = i2;
            r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaBrowserCompatMediaItem = (String) resizegraphicframeifappropriate.write;
            applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
            while (true) {
                String strSerializer2 = ((RegistryNoSourceEncoderAvailableException) resizegraphicframeifappropriatelambda0.serializer).serializer(resizegraphicframeifappropriatelambda0.write);
                resizegraphicframeifappropriatelambda0.write -= (long) strSerializer2.length();
                if (strSerializer2.length() == 0) {
                    break;
                }
                applydisplaycutoutmarginstocontentarealambda0.serializer(strSerializer2);
            }
            r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaMetadataCompat = applydisplaycutoutmarginstocontentarealambda0.read().serializer();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.MediaBrowserCompatMediaItem = 3;
                return r8lambdarywwjkrktijby60cmmjcrc1oqk;
            }
            if (102 > i2 || i2 >= 200) {
                this.MediaBrowserCompatMediaItem = 4;
                return r8lambdarywwjkrktijby60cmmjcrc1oqk;
            }
            this.MediaBrowserCompatMediaItem = 3;
            return r8lambdarywwjkrktijby60cmmjcrc1oqk;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.RemoteActionCompatParcelizer.MediaMetadataCompat().address.url.MediaSessionCompatQueueItem()), e);
        }
    }

    @Override // o.setMessageHeaderTextColor
    public final void read() {
        this.RemoteActionCompatParcelizer.read();
    }

    @Override // o.setMessageHeaderTextColor
    public final void serializer() {
        this.write.flush();
    }

    @Override // o.setMessageHeaderTextColor
    public final void write() {
        this.write.flush();
    }

    public getInAppMessageImageView(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c r8lambdar1c7uo5jlailqwouhjeywopeq4c, RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        registryNoSourceEncoderAvailableException.getClass();
        registryNoImageHeaderParserException.getClass();
        this.IconCompatParcelizer = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        this.RemoteActionCompatParcelizer = r8lambdar1c7uo5jlailqwouhjeywopeq4c;
        this.RatingCompat = registryNoSourceEncoderAvailableException;
        this.write = registryNoImageHeaderParserException;
        this.serializer = new resizeGraphicFrameIfAppropriatelambda0(registryNoSourceEncoderAvailableException);
    }

    public final void IconCompatParcelizer(resetMessageMarginslambda00 resetmessagemarginslambda00, String str) {
        resetmessagemarginslambda00.getClass();
        int i = this.MediaBrowserCompatMediaItem;
        if (i != 0) {
            DrawableTransformation.read(i, "state: ");
            return;
        }
        RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.write;
        registryNoImageHeaderParserException.read(str).read("\r\n");
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        for (int i2 = 0; i2 < iRemoteActionCompatParcelizer; i2++) {
            registryNoImageHeaderParserException.read(resetmessagemarginslambda00.serializer(i2)).read(": ").read(resetmessagemarginslambda00.read(i2)).read("\r\n");
        }
        registryNoImageHeaderParserException.read("\r\n");
        this.MediaBrowserCompatMediaItem = 1;
    }

    @Override // o.setMessageHeaderTextColor
    public final void read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        Proxy.Type type = this.RemoteActionCompatParcelizer.MediaMetadataCompat().proxy.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(r8lambday113fdftsr5e4pzj6xssxltpl60.method);
        sb.append(' ');
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        if (setinappmessageimageviewattributes.MediaBrowserCompatMediaItem() || type != Proxy.Type.HTTP) {
            String str = setinappmessageimageviewattributes.read();
            String strRemoteActionCompatParcelizer = setinappmessageimageviewattributes.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer != null) {
                str = str + '?' + strRemoteActionCompatParcelizer;
            }
            sb.append(str);
        } else {
            sb.append(setinappmessageimageviewattributes);
        }
        sb.append(" HTTP/1.1");
        IconCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.headers, sb.toString());
    }

    @Override // o.setMessageHeaderTextColor
    public final DateTimeConverter write(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, long j) throws ProtocolException {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("Transfer-Encoding"))) {
            int i = this.MediaBrowserCompatMediaItem;
            if (i == 1) {
                this.MediaBrowserCompatMediaItem = 2;
                return new resetMessageMarginslambda0(this);
            }
            DrawableTransformation.read(i, "state: ");
            return null;
        }
        if (j == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        int i2 = this.MediaBrowserCompatMediaItem;
        if (i2 == 1) {
            this.MediaBrowserCompatMediaItem = 2;
            return new RequestManager(this);
        }
        DrawableTransformation.read(i2, "state: ");
        return null;
    }

    static {
        resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
        read = Options.Companion.serializer("OkHttp-Response-Body", "Truncated");
    }

    public final r8lambdasOt4_ejMke8sdyQbVxt_ItYJc2c serializer(setInAppMessageImageViewAttributes setinappmessageimageviewattributes, long j) {
        int i = this.MediaBrowserCompatMediaItem;
        if (i == 4) {
            this.MediaBrowserCompatMediaItem = 5;
            return new r8lambdasOt4_ejMke8sdyQbVxt_ItYJc2c(this, setinappmessageimageviewattributes, j);
        }
        DrawableTransformation.read(i, "state: ");
        return null;
    }

    public final void RemoteActionCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        long j = setWebViewContent.read(_get_messagewebview_lambda1);
        if (j == -1) {
            return;
        }
        r8lambdasOt4_ejMke8sdyQbVxt_ItYJc2c r8lambdasot4_ejmke8sdyqbvxt_ityjc2cSerializer = serializer(_get_messagewebview_lambda1.request.url, j);
        setWebViewContent.RemoteActionCompatParcelizer(r8lambdasot4_ejmke8sdyqbvxt_ityjc2cSerializer, Integer.MAX_VALUE);
        r8lambdasot4_ejmke8sdyqbvxt_ityjc2cSerializer.close();
    }

    @Override // o.setMessageHeaderTextColor
    public final long read(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        if (!r8lambdap5NIwcfORIsaQELQLeY6t8PSkNM.IconCompatParcelizer(_get_messagewebview_lambda1)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1, "Transfer-Encoding"))) {
            return -1L;
        }
        return setWebViewContent.read(_get_messagewebview_lambda1);
    }
}
