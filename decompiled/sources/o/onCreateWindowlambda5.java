package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class onCreateWindowlambda5 implements getShortEdge {
    public static final onCreateWindowlambda5 read = new onCreateWindowlambda5();

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws IOException {
        setMessageHeaderTextColor getinappmessageimageview;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        clipCanvasToPath clipcanvastopath = inAppMessageModalView.write;
        synchronized (clipcanvastopath) {
            if (!clipcanvastopath.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (clipcanvastopath.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (clipcanvastopath.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
        }
        getRectf getrectf = clipcanvastopath.exchangeFinder;
        getrectf.getClass();
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseViewWrite = getrectf.write();
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = clipcanvastopath.client;
        inAppMessageImmersiveBaseViewWrite.getClass();
        int i = inAppMessageModalView.MediaMetadataCompat;
        Socket socket = inAppMessageImmersiveBaseViewWrite.socket;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = inAppMessageImmersiveBaseViewWrite.source;
        RegistryNoImageHeaderParserException registryNoImageHeaderParserException = inAppMessageImmersiveBaseViewWrite.sink;
        createHorizontalAnimation createhorizontalanimation = inAppMessageImmersiveBaseViewWrite.http2Connection;
        if (createhorizontalanimation != null) {
            getinappmessageimageview = new getMainActivityIntent(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, inAppMessageImmersiveBaseViewWrite, inAppMessageModalView, createhorizontalanimation);
        } else {
            socket.setSoTimeout(i);
            ApiErrorResponseCompanion apiErrorResponseCompanionRemoteActionCompatParcelizer = registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            apiErrorResponseCompanionRemoteActionCompatParcelizer.IconCompatParcelizer(j, timeUnit);
            registryNoImageHeaderParserException.RemoteActionCompatParcelizer().IconCompatParcelizer(inAppMessageModalView.MediaSessionCompatQueueItem, timeUnit);
            getinappmessageimageview = new getInAppMessageImageView(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, inAppMessageImmersiveBaseViewWrite, registryNoSourceEncoderAvailableException, registryNoImageHeaderParserException);
        }
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = new r8lambda0088L0EiZH2mqIpRPuXhwYCr8(clipcanvastopath, clipcanvastopath.eventListener, getrectf, getinappmessageimageview);
        clipcanvastopath.interceptorScopedExchange = r8lambda0088l0eizh2mqiprpuxhwycr8;
        clipcanvastopath.exchange = r8lambda0088l0eizh2mqiprpuxhwycr8;
        synchronized (clipcanvastopath) {
            clipcanvastopath.requestBodyOpen = true;
            clipcanvastopath.responseBodyOpen = true;
        }
        if (!clipcanvastopath.canceled) {
            return InAppMessageModalView.write(inAppMessageModalView, 0, r8lambda0088l0eizh2mqiprpuxhwycr8, null, 61).write(inAppMessageModalView.MediaDescriptionCompat);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Canceled");
        return null;
    }
}
