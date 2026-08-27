package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes4.dex */
public final class getMainActivityIntent implements setMessageHeaderTextColor {
    public final InAppMessageImmersiveBaseView IconCompatParcelizer;
    public volatile isActivityRegisteredInManifestlambda0 MediaBrowserCompatMediaItem;
    public final r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc MediaMetadataCompat;
    public final createHorizontalAnimation MediaSessionCompatQueueItem;
    public volatile boolean RemoteActionCompatParcelizer;
    public final InAppMessageModalView read;
    public static final List write = setWebViewContent.read(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List serializer = setWebViewContent.read(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    @Override // o.setMessageHeaderTextColor
    public final r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.setMessageHeaderTextColor
    public final void read() {
        this.RemoteActionCompatParcelizer = true;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        if (isactivityregisteredinmanifestlambda0 != null) {
            isactivityregisteredinmanifestlambda0.IconCompatParcelizer(InAppMessageSlideupView.CANCEL);
        }
    }

    @Override // o.setMessageHeaderTextColor
    public final ItemSingleChoiceBinding IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        isactivityregisteredinmanifestlambda0.getClass();
        return isactivityregisteredinmanifestlambda0.MediaBrowserCompatMediaItem;
    }

    @Override // o.setMessageHeaderTextColor
    public final void serializer() {
        this.MediaSessionCompatQueueItem.IconCompatParcelizer();
    }

    @Override // o.setMessageHeaderTextColor
    public final void write() {
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        isactivityregisteredinmanifestlambda0.getClass();
        isactivityregisteredinmanifestlambda0.MediaDescriptionCompat.close();
    }

    public getMainActivityIntent(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, InAppMessageModalView inAppMessageModalView, createHorizontalAnimation createhorizontalanimation) {
        createhorizontalanimation.getClass();
        this.IconCompatParcelizer = inAppMessageImmersiveBaseView;
        this.read = inAppMessageModalView;
        this.MediaSessionCompatQueueItem = createhorizontalanimation;
        List list = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.protocols;
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.H2_PRIOR_KNOWLEDGE;
        this.MediaMetadataCompat = list.contains(r8lambdacwme7obcpvw4lrr1hr7xiufmyc) ? r8lambdacwme7obcpvw4lrr1hr7xiufmyc : r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2;
    }

    @Override // o.setMessageHeaderTextColor
    public final void read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) throws IOException {
        int i;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0;
        boolean z;
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        if (this.MediaBrowserCompatMediaItem != null) {
            return;
        }
        boolean z2 = r8lambday113fdftsr5e4pzj6xssxltpl60.body != null;
        resetMessageMarginslambda00 resetmessagemarginslambda00 = r8lambday113fdftsr5e4pzj6xssxltpl60.headers;
        ArrayList arrayList = new ArrayList(resetmessagemarginslambda00.RemoteActionCompatParcelizer() + 4);
        arrayList.add(new AnimationUtils(AnimationUtils.TARGET_METHOD, r8lambday113fdftsr5e4pzj6xssxltpl60.method));
        RequestBuilder requestBuilder = AnimationUtils.TARGET_PATH;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        setinappmessageimageviewattributes.getClass();
        String str = setinappmessageimageviewattributes.read();
        String strRemoteActionCompatParcelizer = setinappmessageimageviewattributes.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            str = str + '?' + strRemoteActionCompatParcelizer;
        }
        arrayList.add(new AnimationUtils(requestBuilder, str));
        String strWrite = resetmessagemarginslambda00.write("Host");
        if (strWrite != null) {
            arrayList.add(new AnimationUtils(AnimationUtils.TARGET_AUTHORITY, strWrite));
        }
        arrayList.add(new AnimationUtils(AnimationUtils.TARGET_SCHEME, setinappmessageimageviewattributes.scheme));
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        for (int i2 = 0; i2 < iRemoteActionCompatParcelizer; i2++) {
            String strSerializer = resetmessagemarginslambda00.serializer(i2);
            java.util.Locale locale = java.util.Locale.US;
            locale.getClass();
            String lowerCase = strSerializer.toLowerCase(locale);
            lowerCase.getClass();
            if (!write.contains(lowerCase) || (lowerCase.equals("te") && resetmessagemarginslambda00.read(i2).equals("trailers"))) {
                arrayList.add(new AnimationUtils(lowerCase, resetmessagemarginslambda00.read(i2)));
            }
        }
        createHorizontalAnimation createhorizontalanimation = this.MediaSessionCompatQueueItem;
        createhorizontalanimation.getClass();
        boolean z3 = !z2;
        synchronized (createhorizontalanimation.writer) {
            synchronized (createhorizontalanimation) {
                if (createhorizontalanimation.nextStreamId > 1073741823) {
                    createhorizontalanimation.RemoteActionCompatParcelizer(InAppMessageSlideupView.REFUSED_STREAM);
                }
                if (createhorizontalanimation.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                i = createhorizontalanimation.nextStreamId;
                createhorizontalanimation.nextStreamId = i + 2;
                isactivityregisteredinmanifestlambda0 = new isActivityRegisteredInManifestlambda0(i, createhorizontalanimation, z3, false, null);
                z = !z2 || createhorizontalanimation.writeBytesTotal >= createhorizontalanimation.writeBytesMaximum || isactivityregisteredinmanifestlambda0.MediaSessionCompatResultReceiverWrapper >= isactivityregisteredinmanifestlambda0.ParcelableVolumeInfo;
                if (isactivityregisteredinmanifestlambda0.read()) {
                    createhorizontalanimation.streams.put(Integer.valueOf(i), isactivityregisteredinmanifestlambda0);
                }
            }
            createhorizontalanimation.writer.serializer(z3, i, arrayList);
        }
        if (z) {
            createhorizontalanimation.writer.RemoteActionCompatParcelizer();
        }
        this.MediaBrowserCompatMediaItem = isactivityregisteredinmanifestlambda0;
        boolean z4 = this.RemoteActionCompatParcelizer;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda1 = this.MediaBrowserCompatMediaItem;
        if (z4) {
            isactivityregisteredinmanifestlambda1.getClass();
            isactivityregisteredinmanifestlambda1.IconCompatParcelizer(InAppMessageSlideupView.CANCEL);
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Canceled");
            return;
        }
        isactivityregisteredinmanifestlambda1.getClass();
        getQueryParameterslambda0 getqueryparameterslambda0 = isactivityregisteredinmanifestlambda1.RatingCompat;
        long j = this.read.MediaMetadataCompat;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        getqueryparameterslambda0.IconCompatParcelizer(j, timeUnit);
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda2 = this.MediaBrowserCompatMediaItem;
        isactivityregisteredinmanifestlambda2.getClass();
        isactivityregisteredinmanifestlambda2.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.read.MediaSessionCompatQueueItem, timeUnit);
    }

    @Override // o.setMessageHeaderTextColor
    public final DateTimeConverter write(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, long j) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        isactivityregisteredinmanifestlambda0.getClass();
        return isactivityregisteredinmanifestlambda0.MediaDescriptionCompat;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    @Override // o.setMessageHeaderTextColor
    public final r8lambdarYwWjKRktijBy60CMMjcRC1Oqk IconCompatParcelizer(boolean z) throws IOException {
        resetMessageMarginslambda00 resetmessagemarginslambda00;
        boolean z2;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        if (isactivityregisteredinmanifestlambda0 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("stream wasn't created");
            return null;
        }
        synchronized (isactivityregisteredinmanifestlambda0) {
            while (true) {
                if (!isactivityregisteredinmanifestlambda0.read.isEmpty() || isactivityregisteredinmanifestlambda0.serializer() != null) {
                    break;
                }
                if (!z) {
                    isactivityregisteredinmanifestlambda0.RemoteActionCompatParcelizer.getClass();
                    UriUtilsExternalSyntheticLambda0 uriUtilsExternalSyntheticLambda0 = isactivityregisteredinmanifestlambda0.MediaDescriptionCompat;
                    z2 = uriUtilsExternalSyntheticLambda0.serializer || uriUtilsExternalSyntheticLambda0.read;
                }
                if (z2) {
                    isactivityregisteredinmanifestlambda0.RatingCompat.IconCompatParcelizer();
                }
                try {
                    try {
                        isactivityregisteredinmanifestlambda0.wait();
                        if (z2) {
                            isactivityregisteredinmanifestlambda0.RatingCompat.RemoteActionCompatParcelizer();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        isactivityregisteredinmanifestlambda0.RatingCompat.RemoteActionCompatParcelizer();
                    }
                    throw th;
                }
            }
            if (isactivityregisteredinmanifestlambda0.read.isEmpty()) {
                IOException iOException = isactivityregisteredinmanifestlambda0.IconCompatParcelizer;
                if (iOException != null) {
                    throw iOException;
                }
                InAppMessageSlideupView inAppMessageSlideupViewSerializer = isactivityregisteredinmanifestlambda0.serializer();
                inAppMessageSlideupViewSerializer.getClass();
                throw new StreamResetException(inAppMessageSlideupViewSerializer);
            }
            Object objRemoveFirst = isactivityregisteredinmanifestlambda0.read.removeFirst();
            objRemoveFirst.getClass();
            resetmessagemarginslambda00 = (resetMessageMarginslambda00) objRemoveFirst;
        }
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = this.MediaMetadataCompat;
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        ArrayList arrayList = new ArrayList(20);
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = null;
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            String strSerializer = resetmessagemarginslambda00.serializer(i);
            String str = resetmessagemarginslambda00.read(i);
            if (strSerializer.equals(":status")) {
                resizegraphicframeifappropriate = UrlUtils.read("HTTP/1.1 ".concat(str));
            } else if (!serializer.contains(strSerializer)) {
                arrayList.add(strSerializer);
                arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString());
            }
        }
        if (resizegraphicframeifappropriate == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqk = new r8lambdarYwWjKRktijBy60CMMjcRC1Oqk();
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaSessionCompatQueueItem = r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.serializer = resizegraphicframeifappropriate.serializer;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaBrowserCompatMediaItem = (String) resizegraphicframeifappropriate.write;
        r8lambdarywwjkrktijby60cmmjcrc1oqk.MediaMetadataCompat = new resetMessageMarginslambda00((String[]) arrayList.toArray(new String[0])).serializer();
        if (z && r8lambdarywwjkrktijby60cmmjcrc1oqk.serializer == 100) {
            return null;
        }
        return r8lambdarywwjkrktijby60cmmjcrc1oqk;
    }

    @Override // o.setMessageHeaderTextColor
    public final boolean IconCompatParcelizer() {
        boolean z;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        if (isactivityregisteredinmanifestlambda0 != null) {
            synchronized (isactivityregisteredinmanifestlambda0) {
                getQueryParameterslambda2 getqueryparameterslambda2 = isactivityregisteredinmanifestlambda0.MediaBrowserCompatMediaItem;
                z = getqueryparameterslambda2.read && getqueryparameterslambda2.RemoteActionCompatParcelizer.RatingCompat();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // o.setMessageHeaderTextColor
    public final long read(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        if (r8lambdap5NIwcfORIsaQELQLeY6t8PSkNM.IconCompatParcelizer(_get_messagewebview_lambda1)) {
            return setWebViewContent.read(_get_messagewebview_lambda1);
        }
        return 0L;
    }
}
