package o;

import java.io.Closeable;
import java.io.EOFException;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class _get_messageWebView_lambda1 implements Closeable {
    public final _get_messageWebView_lambda3 body;
    public final _get_messageWebView_lambda1 cacheResponse;
    public final int code;
    public final r8lambda0088L0EiZH2mqIpRPuXhwYCr8 exchange;
    public final applyDisplayCutoutMarginsToCloseButton handshake;
    public final resetMessageMarginslambda00 headers;
    public final boolean isSuccessful;
    public getMessageIconView lazyCacheControl;
    public final String message;
    public final _get_messageWebView_lambda1 networkResponse;
    public final _get_messageWebView_lambda1 priorResponse;
    public final r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc protocol;
    public final long receivedResponseAtMillis;
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 request;
    public final long sentRequestAtMillis;
    public final getMessageWebView trailersSource;

    public final r8lambdarYwWjKRktijBy60CMMjcRC1Oqk IconCompatParcelizer() {
        r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqk = new r8lambdarYwWjKRktijBy60CMMjcRC1Oqk(0);
        r8lambdarywwjkrktijby60cmmjcrc1oqk.serializer = -1;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.IconCompatParcelizer = _get_messageWebView_lambda3.EMPTY;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaSessionCompatToken = getMessageWebView.EMPTY;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaSessionCompatResultReceiverWrapper = this.request;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaSessionCompatQueueItem = this.protocol;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.serializer = this.code;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaBrowserCompatMediaItem = this.message;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.write = this.handshake;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaMetadataCompat = this.headers.serializer();
        r8lambdarywwjkrktijby60cmmjcrc1oqk.IconCompatParcelizer = this.body;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.RatingCompat = this.networkResponse;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.read = this.cacheResponse;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaDescriptionCompat = this.priorResponse;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.PlaybackStateCompatCustomAction = this.sentRequestAtMillis;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.PlaybackStateCompat = this.receivedResponseAtMillis;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.RemoteActionCompatParcelizer = this.exchange;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaSessionCompatToken = this.trailersSource;
        return r8lambdarywwjkrktijby60cmmjcrc1oqk;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.body.close();
    }

    public final _get_messageWebView_lambda4 read(long j) throws EOFException {
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = this.body;
        GifDrawableTransformation gifDrawableTransformationMediaDescriptionCompat = _get_messagewebview_lambda3.read().MediaDescriptionCompat();
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        gifDrawableTransformationMediaDescriptionCompat.write(j);
        long jMin = Math.min(j, gifDrawableTransformationMediaDescriptionCompat.bufferField.size);
        while (jMin > 0) {
            long jRemoteActionCompatParcelizer = gifDrawableTransformationMediaDescriptionCompat.RemoteActionCompatParcelizer(registryMissingComponentException, jMin);
            if (jRemoteActionCompatParcelizer == -1) {
                DrawableTransformation.IconCompatParcelizer();
                return null;
            }
            jMin -= jRemoteActionCompatParcelizer;
        }
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        return new _get_messageWebView_lambda4(_get_messagewebview_lambda3.write(), registryMissingComponentException.size, registryMissingComponentException);
    }

    public _get_messageWebView_lambda1(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc, String str, int i, applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton, resetMessageMarginslambda00 resetmessagemarginslambda00, _get_messageWebView_lambda3 _get_messagewebview_lambda3, _get_messageWebView_lambda1 _get_messagewebview_lambda1, _get_messageWebView_lambda1 _get_messagewebview_lambda2, _get_messageWebView_lambda1 _get_messagewebview_lambda4, long j, long j2, r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, getMessageWebView getmessagewebview) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        str.getClass();
        _get_messagewebview_lambda3.getClass();
        getmessagewebview.getClass();
        this.request = r8lambday113fdftsr5e4pzj6xssxltpl60;
        this.protocol = r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        this.message = str;
        this.code = i;
        this.handshake = applydisplaycutoutmarginstoclosebutton;
        this.headers = resetmessagemarginslambda00;
        this.body = _get_messagewebview_lambda3;
        this.networkResponse = _get_messagewebview_lambda1;
        this.cacheResponse = _get_messagewebview_lambda2;
        this.priorResponse = _get_messagewebview_lambda4;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = r8lambda0088l0eizh2mqiprpuxhwycr8;
        this.trailersSource = getmessagewebview;
        this.isSuccessful = 200 <= i && i < 300;
    }

    public static String RemoteActionCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1, String str) {
        _get_messagewebview_lambda1.getClass();
        String strWrite = _get_messagewebview_lambda1.headers.write(str);
        if (strWrite == null) {
            return null;
        }
        return strWrite;
    }

    public final getMessageIconView read() {
        getMessageIconView getmessageiconview = this.lazyCacheControl;
        if (getmessageiconview != null) {
            return getmessageiconview;
        }
        int i = getMessageIconView.$r8$clinit;
        getMessageIconView getmessageiconviewWrite = TuplesKt.write(this.headers);
        this.lazyCacheControl = getmessageiconviewWrite;
        return getmessageiconviewWrite;
    }

    public final String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url + '}';
    }
}
