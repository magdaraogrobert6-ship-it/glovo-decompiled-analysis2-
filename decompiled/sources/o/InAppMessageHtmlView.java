package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.Socket;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageHtmlView {
    public final InAppMessageModalView IconCompatParcelizer;
    public final clipCanvasToPath write;

    public final void RemoteActionCompatParcelizer(InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView) {
        inAppMessageImmersiveBaseView.getClass();
    }

    public final Socket IconCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3) {
        this.write.plansToCancel.add(inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3);
    }

    public final InAppMessageImmersiveBaseView read() {
        return this.write.connection;
    }

    public final void serializer(InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3) {
        this.write.plansToCancel.remove(inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3);
    }

    public final boolean serializer() {
        return !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer.MediaDescriptionCompat.method, "GET"}, getCieXyz.write())).booleanValue();
    }

    public final boolean write() {
        return this.write.canceled;
    }

    public InAppMessageHtmlView(clipCanvasToPath clipcanvastopath, InAppMessageImageView inAppMessageImageView, InAppMessageModalView inAppMessageModalView) {
        this.write = clipcanvastopath;
        this.IconCompatParcelizer = inAppMessageModalView;
    }

    public final void IconCompatParcelizer(setWebViewContentdefault setwebviewcontentdefault, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc) {
        setwebviewcontentdefault.getClass();
        clipCanvasToPath clipcanvastopath = this.write;
        clipcanvastopath.eventListener.connectEnd(clipcanvastopath, setwebviewcontentdefault.socketAddress, setwebviewcontentdefault.proxy, r8lambdacwme7obcpvw4lrr1hr7xiufmyc);
    }

    public final void read(setWebViewContentdefault setwebviewcontentdefault, IOException iOException) {
        setwebviewcontentdefault.getClass();
        clipCanvasToPath clipcanvastopath = this.write;
        clipcanvastopath.eventListener.connectFailed(clipcanvastopath, setwebviewcontentdefault.socketAddress, setwebviewcontentdefault.proxy, null, iOException);
    }

    public final void serializer(r8lambda_bWawdAasft8AkGttqAQu77625c r8lambda_bwawdaasft8akgttqaqu77625c) {
        r8lambda_bwawdaasft8akgttqaqu77625c.getClass();
        clipCanvasToPath clipcanvastopath = this.write;
        clipcanvastopath.eventListener.connectionAcquired(clipcanvastopath, r8lambda_bwawdaasft8akgttqaqu77625c);
    }

    public final void write(InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView) {
        inAppMessageImmersiveBaseView.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        clipCanvasToPath clipcanvastopath = this.write;
        if (clipcanvastopath.connection != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
        } else {
            clipcanvastopath.connection = inAppMessageImmersiveBaseView;
            inAppMessageImmersiveBaseView.calls.add(new r8lambda95pWSri5vrWW7AWxwibPFKul6nM(clipcanvastopath, clipcanvastopath.callStackTrace));
        }
    }
}
