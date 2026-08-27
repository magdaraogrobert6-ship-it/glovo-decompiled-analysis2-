package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageModalView implements getMessageHeaderTextView {
    public final r8lambda0088L0EiZH2mqIpRPuXhwYCr8 IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public int read;
    public final int serializer;
    public final clipCanvasToPath write;

    public InAppMessageModalView(clipCanvasToPath clipcanvastopath, ArrayList arrayList, int i, r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, int i2, int i3, int i4) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        this.write = clipcanvastopath;
        this.MediaBrowserCompatMediaItem = arrayList;
        this.serializer = i;
        this.IconCompatParcelizer = r8lambda0088l0eizh2mqiprpuxhwycr8;
        this.MediaDescriptionCompat = r8lambday113fdftsr5e4pzj6xssxltpl60;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaMetadataCompat = i3;
        this.MediaSessionCompatQueueItem = i4;
    }

    public final _get_messageWebView_lambda1 write(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        ArrayList arrayList = this.MediaBrowserCompatMediaItem;
        int size = arrayList.size();
        int i = this.serializer;
        if (i >= size) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return null;
        }
        this.read++;
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = this.IconCompatParcelizer;
        if (r8lambda0088l0eizh2mqiprpuxhwycr8 != null) {
            if (!r8lambda0088l0eizh2mqiprpuxhwycr8.finder.RemoteActionCompatParcelizer().read(r8lambday113fdftsr5e4pzj6xssxltpl60.url)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.read != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        InAppMessageModalView inAppMessageModalViewWrite = write(this, i2, null, r8lambday113fdftsr5e4pzj6xssxltpl60, 58);
        getShortEdge getshortedge = (getShortEdge) arrayList.get(i);
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Intercept = getshortedge.intercept(inAppMessageModalViewWrite);
        if (_get_messagewebview_lambda1Intercept == null) {
            throw new NullPointerException("interceptor " + getshortedge + " returned null");
        }
        if (r8lambda0088l0eizh2mqiprpuxhwycr8 == null || i2 >= arrayList.size() || inAppMessageModalViewWrite.read == 1) {
            return _get_messagewebview_lambda1Intercept;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read("network interceptor ", getshortedge, " must call proceed() exactly once");
        return null;
    }

    public static InAppMessageModalView write(InAppMessageModalView inAppMessageModalView, int i, r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, int i2) {
        if ((i2 & 1) != 0) {
            i = inAppMessageModalView.serializer;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            r8lambda0088l0eizh2mqiprpuxhwycr8 = inAppMessageModalView.IconCompatParcelizer;
        }
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr9 = r8lambda0088l0eizh2mqiprpuxhwycr8;
        if ((i2 & 4) != 0) {
            r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        }
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = r8lambday113fdftsr5e4pzj6xssxltpl60;
        int i4 = inAppMessageModalView.RemoteActionCompatParcelizer;
        int i5 = inAppMessageModalView.MediaMetadataCompat;
        int i6 = inAppMessageModalView.MediaSessionCompatQueueItem;
        r8lambday113fdftsr5e4pzj6xssxltpl61.getClass();
        return new InAppMessageModalView(inAppMessageModalView.write, inAppMessageModalView.MediaBrowserCompatMediaItem, i3, r8lambda0088l0eizh2mqiprpuxhwycr9, r8lambday113fdftsr5e4pzj6xssxltpl61, i4, i5, i6);
    }
}
