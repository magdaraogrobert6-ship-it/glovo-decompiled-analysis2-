package o;

import android.app.Application;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.roadrunner.web.presentation.WebViewFragment;
import com.roadrunner.web.presentation.authWebView.AuthWebFragment;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.roadrunner.web.presentation.simpleWebView.SimpleWebViewFragment;
import com.sentiance.core.model.events.E$b;
import com.ui.common.widget.message_dialog.MessageDialogFragment$$ExternalSyntheticLambda0;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;
import leakcanary.ViewLocationHolderLeakFix$applyFix$2;
import org.koin.androidx.scope.ScopeActivity;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientbootstrapIfNeeded1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FwFClientbootstrapIfNeeded1(int i, Object obj) {
        super(0);
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.RemoteActionCompatParcelizer;
        int i3 = 0;
        switch (i2) {
            case 0:
                Scope scope = (Scope) obj;
                getConfigfwf_client_release getconfigfwf_client_release = scope.read;
                JsonObjectSerializer jsonObjectSerializer = getconfigfwf_client_release.read;
                StringBuilder sb = new StringBuilder("|- (-) Scope - id:'");
                String str = scope.MediaBrowserCompatMediaItem;
                sb.append(str);
                sb.append('\'');
                String string = sb.toString();
                jsonObjectSerializer.getClass();
                jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, string);
                ArrayList arrayList = scope.write;
                Iterator it = arrayList.iterator();
                while (!(!it.hasNext())) {
                    int i4 = IconCompatParcelizer + 1;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    getCachefwf_client_release getcachefwf_client_release = (getCachefwf_client_release) it.next();
                    getcachefwf_client_release.getClass();
                    getcachefwf_client_release.write.IconCompatParcelizer();
                }
                arrayList.clear();
                scope.RemoteActionCompatParcelizer = null;
                scope.serializer = true;
                FwFClientaddFeatureKeys1 fwFClientaddFeatureKeys1 = getconfigfwf_client_release.IconCompatParcelizer;
                fwFClientaddFeatureKeys1.getClass();
                io.sentry.util.ComponentActivity componentActivity = fwFClientaddFeatureKeys1.read.RemoteActionCompatParcelizer;
                componentActivity.getClass();
                Collection collectionValues = ((ConcurrentHashMap) componentActivity.write).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    int i6 = IconCompatParcelizer + 7;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    it2.next();
                }
                Iterator it3 = arrayList2.iterator();
                if (!(!it3.hasNext())) {
                    throw ff$$ExternalSyntheticOutline0.m(it3);
                }
                fwFClientaddFeatureKeys1.RemoteActionCompatParcelizer.remove(str);
                return createfromparcel;
            case 1:
                return (asFrameworkPaint) ((r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA) obj).invoke();
            case 2:
                return (VendorReviewFragment) obj;
            case 3:
                return (asFrameworkPaint) ((FwFClientbootstrapIfNeeded1) obj).invoke();
            case 4:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                int i8 = read + 95;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return webViewFragment;
                }
                throw null;
            case 5:
                return (asFrameworkPaint) ((FwFClientbootstrapIfNeeded1) obj).invoke();
            case 6:
                return (AuthWebFragment) obj;
            case 7:
                return (asFrameworkPaint) ((FwFClientbootstrapIfNeeded1) obj).invoke();
            case 8:
                return (RiderHiringWebViewFragment) obj;
            case 9:
                return (asFrameworkPaint) ((FwFClientbootstrapIfNeeded1) obj).invoke();
            case 10:
                return (SimpleWebViewFragment) obj;
            case 11:
                return (asFrameworkPaint) ((FwFClientbootstrapIfNeeded1) obj).invoke();
            case 12:
                return (asFrameworkPaint) ((MessageDialogFragment$$ExternalSyntheticLambda0) obj).invoke();
            case 13:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new parselambda0(2));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
                return new io.sentry.android.replay.util.write(scheduledExecutorServiceNewSingleThreadScheduledExecutor, ((io.sentry.android.replay.capture.RemoteActionCompatParcelizer) obj).RatingCompat);
            case 14:
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = ((io.sentry.android.replay.screenshot.write) obj).read;
                matrix.preScale(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.write, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RatingCompat);
                return matrix;
            case 15:
                E$b e$b = (E$b) obj;
                io.sentry.android.replay.video.IconCompatParcelizer iconCompatParcelizer = (io.sentry.android.replay.video.IconCompatParcelizer) e$b.RemoteActionCompatParcelizer;
                SentryOptions sentryOptions = (SentryOptions) e$b.read;
                String str2 = iconCompatParcelizer.IconCompatParcelizer;
                int iIntValue = iconCompatParcelizer.read;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) e$b.IconCompatParcelizer).getCodecInfo().getCapabilitiesForType(str2).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        objClamp.getClass();
                        iIntValue = ((Number) objClamp).intValue();
                    }
                    break;
                } catch (Throwable th) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str2, iconCompatParcelizer.MediaBrowserCompatMediaItem, iconCompatParcelizer.write);
                mediaFormatCreateVideoFormat.getClass();
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", iconCompatParcelizer.serializer);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case 16:
                setToHalfParentHeight.RemoteActionCompatParcelizer((Application) ((ViewLocationHolderLeakFix$applyFix$2) obj).write);
                return createfromparcel;
            case 17:
                ScopeActivity scopeActivity = (ScopeActivity) obj;
                getConfigfwf_client_release getconfigfwf_client_releaseSerializer = toLongimpl.serializer(scopeActivity);
                String strWrite = getFeatureKeys.write(scopeActivity);
                getconfigfwf_client_releaseSerializer.getClass();
                FwFClientaddFeatureKeys1 fwFClientaddFeatureKeys2 = getconfigfwf_client_releaseSerializer.IconCompatParcelizer;
                fwFClientaddFeatureKeys2.getClass();
                Scope scope2 = (Scope) fwFClientaddFeatureKeys2.RemoteActionCompatParcelizer.get(strWrite);
                if (scope2 != null) {
                    return scope2;
                }
                Scope scopeWrite = toLongimpl.serializer(scopeActivity).write(getFeatureKeys.write(scopeActivity), new setTimerfwf_client_release(displayInAppMessagelambda1.serializer(scopeActivity.getClass())), scopeActivity);
                scopeWrite.write.add(new getCachefwf_client_release(scopeActivity));
                scopeActivity.getLifecycle().IconCompatParcelizer(new addFeatureKeys(i3, scopeWrite));
                return scopeWrite;
            case 18:
                return (getCustomerProfileConfig) obj;
            default:
                return "| >> parameters " + ((getTrackingServicefwf_client_release) obj) + ' ';
        }
    }
}
