package o;

import com.deliveryhero.fwf_http.ConstantKt;
import java.util.ArrayList;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoFeatureMsg {
    public InAppMessageHtmlBaseView IconCompatParcelizer;
    public final applyDisplayCutoutMarginsToContentArealambda0 MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final r8lambdadeOzq815xUUwmlLYYvm_QV79QY MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public String MediaSessionCompatToken;
    public final _get_messageWebView_lambda0 ParcelableVolumeInfo = new _get_messageWebView_lambda0(0);
    public createAppropriateViews PlaybackStateCompat;
    public final FormBody.Builder RatingCompat;
    public final setInAppMessageImageViewAttributes read;
    public RequestBody write;
    public static final char[] serializer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public final void IconCompatParcelizer(String str, String str2, boolean z) {
        if (ConstantKt.CONTENT_TYPE_HEADER.equalsIgnoreCase(str)) {
            try {
                getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                this.IconCompatParcelizer = androidx.sqlite.SQLite.write(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Malformed content type: ", str2), e);
            }
        }
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = this.MediaBrowserCompatMediaItem;
        if (z) {
            applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer(str, str2);
        } else {
            applydisplaycutoutmarginstocontentarealambda0.write(str, str2);
        }
    }

    public ProtoFeatureMsg(String str, setInAppMessageImageViewAttributes setinappmessageimageviewattributes, String str2, resetMessageMarginslambda00 resetmessagemarginslambda00, InAppMessageHtmlBaseView inAppMessageHtmlBaseView, boolean z, boolean z2, boolean z3) {
        this.MediaSessionCompatQueueItem = str;
        this.read = setinappmessageimageviewattributes;
        this.MediaSessionCompatToken = str2;
        this.IconCompatParcelizer = inAppMessageHtmlBaseView;
        this.MediaDescriptionCompat = z;
        if (resetmessagemarginslambda00 != null) {
            this.MediaBrowserCompatMediaItem = resetmessagemarginslambda00.serializer();
        } else {
            this.MediaBrowserCompatMediaItem = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
        }
        if (z2) {
            this.RatingCompat = new FormBody.Builder(0);
        } else if (z3) {
            r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY();
            this.MediaMetadataCompat = r8lambdadeozq815xuuwmllyyvm_qv79qy;
            r8lambdadeozq815xuuwmllyyvm_qv79qy.IconCompatParcelizer(MultipartBody.serializer);
        }
    }

    public final void serializer(String str, String str2, boolean z) {
        createAppropriateViews createappropriateviews;
        String str3 = this.MediaSessionCompatToken;
        if (str3 != null) {
            setInAppMessageImageViewAttributes setinappmessageimageviewattributes = this.read;
            setinappmessageimageviewattributes.getClass();
            try {
                createappropriateviews = new createAppropriateViews();
                createappropriateviews.read(setinappmessageimageviewattributes, str3);
            } catch (IllegalArgumentException unused) {
                createappropriateviews = null;
            }
            this.PlaybackStateCompat = createappropriateviews;
            if (createappropriateviews == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(setinappmessageimageviewattributes);
                getOffVariationName.serializer(sb, ", Relative: ", this.MediaSessionCompatToken);
                return;
            }
            this.MediaSessionCompatToken = null;
        }
        createAppropriateViews createappropriateviews2 = this.PlaybackStateCompat;
        if (!z) {
            createappropriateviews2.write(str, str2);
            return;
        }
        createappropriateviews2.getClass();
        str.getClass();
        if (((ArrayList) createappropriateviews2.read) == null) {
            createappropriateviews2.read = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) createappropriateviews2.read;
        arrayList.getClass();
        arrayList.add(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, 0, 0, 83, " \"'<>#&="));
        ArrayList arrayList2 = (ArrayList) createappropriateviews2.read;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str2, 0, 0, 83, " \"'<>#&=") : null);
    }
}
