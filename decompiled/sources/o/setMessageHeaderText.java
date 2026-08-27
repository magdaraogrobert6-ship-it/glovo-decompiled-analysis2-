package o;

import io.grpc.LoadBalancer$Helper;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.math.MathKt;
import okhttp3.EventListener;
import okhttp3.RequestBody;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes4.dex */
public final class setMessageHeaderText implements getShortEdge {
    public final boolean RemoteActionCompatParcelizer;

    public setMessageHeaderText(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:104:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:106:0x01be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws IOException {
        boolean z;
        r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1IconCompatParcelizer;
        int i;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1IconCompatParcelizer2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = inAppMessageModalView.IconCompatParcelizer;
        r8lambda0088l0eizh2mqiprpuxhwycr8.getClass();
        setMessageHeaderTextColor setmessageheadertextcolor = r8lambda0088l0eizh2mqiprpuxhwycr8.codec;
        EventListener eventListener = r8lambda0088l0eizh2mqiprpuxhwycr8.eventListener;
        clipCanvasToPath clipcanvastopath = r8lambda0088l0eizh2mqiprpuxhwycr8.call;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqk = null;
        iOException = null;
        IOException iOException = null;
        try {
            try {
                eventListener.requestHeadersStart(clipcanvastopath);
                setmessageheadertextcolor.read(r8lambday113fdftsr5e4pzj6xssxltpl60);
                eventListener.requestHeadersEnd(clipcanvastopath, r8lambday113fdftsr5e4pzj6xssxltpl60);
                if (!LoadBalancer$Helper.serializer(r8lambday113fdftsr5e4pzj6xssxltpl60.method) || requestBody == null) {
                    clipcanvastopath.RemoteActionCompatParcelizer(r8lambda0088l0eizh2mqiprpuxhwycr8, true, false, null);
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer = null;
                } else {
                    if ("100-continue".equalsIgnoreCase(r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("Expect"))) {
                        try {
                            setmessageheadertextcolor.serializer();
                            r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer = r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer(true);
                            try {
                                eventListener.responseHeadersStart(clipcanvastopath);
                                z = false;
                            } catch (IOException e) {
                                e = e;
                                r8lambdarywwjkrktijby60cmmjcrc1oqk = r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer;
                                z = z2;
                                r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer = r8lambdarywwjkrktijby60cmmjcrc1oqk;
                                iOException = e;
                                if (!(iOException instanceof ConnectionShutdownException)) {
                                    throw iOException;
                                }
                                if (r8lambda0088l0eizh2mqiprpuxhwycr8.hasFailure) {
                                    throw iOException;
                                }
                                z2 = z;
                            }
                        } catch (IOException e2) {
                            eventListener.requestFailed(clipcanvastopath, e2);
                            r8lambda0088l0eizh2mqiprpuxhwycr8.read(e2);
                            throw e2;
                        }
                    } else {
                        z = true;
                        r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer = null;
                    }
                    try {
                        if (r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer != null) {
                            clipcanvastopath.RemoteActionCompatParcelizer(r8lambda0088l0eizh2mqiprpuxhwycr8, true, false, null);
                            if (r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer().http2Connection == null) {
                                setmessageheadertextcolor.RemoteActionCompatParcelizer().RatingCompat();
                            }
                        } else if (requestBody.isDuplex()) {
                            try {
                                setmessageheadertextcolor.serializer();
                                requestBody.writeTo(new SingleRequest(r8lambda0088l0eizh2mqiprpuxhwycr8.read(r8lambday113fdftsr5e4pzj6xssxltpl60, true)));
                            } catch (IOException e3) {
                                eventListener.requestFailed(clipcanvastopath, e3);
                                r8lambda0088l0eizh2mqiprpuxhwycr8.read(e3);
                                throw e3;
                            }
                        } else {
                            SingleRequest singleRequest = new SingleRequest(r8lambda0088l0eizh2mqiprpuxhwycr8.read(r8lambday113fdftsr5e4pzj6xssxltpl60, false));
                            requestBody.writeTo(singleRequest);
                            singleRequest.close();
                        }
                        z2 = z;
                    } catch (IOException e4) {
                        e = e4;
                        iOException = e;
                        if (!(iOException instanceof ConnectionShutdownException)) {
                            throw iOException;
                        }
                        if (r8lambda0088l0eizh2mqiprpuxhwycr8.hasFailure) {
                            throw iOException;
                        }
                        z2 = z;
                    }
                }
                if (requestBody == null || !requestBody.isDuplex()) {
                    try {
                        setmessageheadertextcolor.write();
                    } catch (IOException e5) {
                        eventListener.requestFailed(clipcanvastopath, e5);
                        r8lambda0088l0eizh2mqiprpuxhwycr8.read(e5);
                        throw e5;
                    }
                }
                while (true) {
                    if (i != 100 && (102 > i || i >= 200)) {
                        break;
                    }
                    r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2 = r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer(false);
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2.getClass();
                    if (z2) {
                        eventListener.responseHeadersStart(clipcanvastopath);
                    }
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2.MediaSessionCompatResultReceiverWrapper = r8lambday113fdftsr5e4pzj6xssxltpl60;
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2.write = r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer().handshake;
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2.PlaybackStateCompatCustomAction = jCurrentTimeMillis;
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2.PlaybackStateCompat = System.currentTimeMillis();
                    _get_messagewebview_lambda1IconCompatParcelizer = r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer2.IconCompatParcelizer();
                    i = _get_messagewebview_lambda1IconCompatParcelizer.code;
                }
            } catch (IOException e6) {
                e = e6;
            }
            if (r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer == null) {
                try {
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer = r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer(false);
                    r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer.getClass();
                    if (z2) {
                        eventListener.responseHeadersStart(clipcanvastopath);
                        z2 = false;
                    }
                } catch (IOException e7) {
                    e = e7;
                    if (iOException != null) {
                        throw e;
                    }
                    markOnScreenCardsAsReadlambda1.read(iOException, e);
                    throw iOException;
                }
            }
            r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = r8lambday113fdftsr5e4pzj6xssxltpl60;
            r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer.write = r8lambda0088l0eizh2mqiprpuxhwycr8.RemoteActionCompatParcelizer().handshake;
            r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction = jCurrentTimeMillis;
            r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer.PlaybackStateCompat = System.currentTimeMillis();
            _get_messagewebview_lambda1IconCompatParcelizer = r8lambdarywwjkrktijby60cmmjcrc1oqkRemoteActionCompatParcelizer.IconCompatParcelizer();
            i = _get_messagewebview_lambda1IconCompatParcelizer.code;
            eventListener.responseHeadersEnd(clipcanvastopath, _get_messagewebview_lambda1IconCompatParcelizer);
            try {
                if (this.RemoteActionCompatParcelizer && i == 101) {
                    _get_messagewebview_lambda1IconCompatParcelizer2 = MathKt.IconCompatParcelizer(_get_messagewebview_lambda1IconCompatParcelizer);
                } else {
                    r8lambdaBwuvjAiGH2v7c3MZWG0e3UE_aVk r8lambdabwuvjaigh2v7c3mzwg0e3ue_avkIconCompatParcelizer = r8lambda0088l0eizh2mqiprpuxhwycr8.IconCompatParcelizer(_get_messagewebview_lambda1IconCompatParcelizer);
                    r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer = _get_messagewebview_lambda1IconCompatParcelizer.IconCompatParcelizer();
                    r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer = r8lambdabwuvjaigh2v7c3mzwg0e3ue_avkIconCompatParcelizer;
                    r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.MediaSessionCompatToken = new AndroidUiFrameClock();
                    _get_messagewebview_lambda1IconCompatParcelizer2 = r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer();
                }
                r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = _get_messagewebview_lambda1IconCompatParcelizer2.request;
                r8lambday113fdftsr5e4pzj6xssxltpl61.getClass();
                if ("close".equalsIgnoreCase(r8lambday113fdftsr5e4pzj6xssxltpl61.headers.write("Connection")) || "close".equalsIgnoreCase(_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1IconCompatParcelizer2, "Connection"))) {
                    setmessageheadertextcolor.RemoteActionCompatParcelizer().RatingCompat();
                }
                if ((i != 204 && i != 205) || _get_messagewebview_lambda1IconCompatParcelizer2.body.IconCompatParcelizer() <= 0) {
                    return _get_messagewebview_lambda1IconCompatParcelizer2;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + _get_messagewebview_lambda1IconCompatParcelizer2.body.IconCompatParcelizer());
            } catch (IOException e8) {
                e = e8;
                if (iOException != null) {
                    throw e;
                }
                markOnScreenCardsAsReadlambda1.read(iOException, e);
                throw iOException;
            }
        } catch (IOException e9) {
            eventListener.requestFailed(clipcanvastopath, e9);
            r8lambda0088l0eizh2mqiprpuxhwycr8.read(e9);
            throw e9;
        }
    }
}
