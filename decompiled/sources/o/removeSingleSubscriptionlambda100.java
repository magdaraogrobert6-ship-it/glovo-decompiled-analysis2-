package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.tnc.TncUiModelImpl$observeTncStatus$1;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class removeSingleSubscriptionlambda100 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ refreshFeatureFlagslambda0 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ removeSingleSubscriptionlambda100(refreshFeatureFlagslambda0 refreshfeatureflagslambda0, int i) {
        this.write = i;
        this.serializer = refreshfeatureflagslambda0;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        String str;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        refreshFeatureFlagslambda0 refreshfeatureflagslambda0 = this.serializer;
        boolean z = false;
        z = false;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i2 == 0) {
            requestBannersRefreshlambda13 requestbannersrefreshlambda13 = (requestBannersRefreshlambda13) obj;
            if (requestbannersrefreshlambda13 != null) {
                int i3 = read + 109;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str = requestbannersrefreshlambda13.url;
            } else {
                str = null;
            }
            refreshfeatureflagslambda0.serializer = str;
            if (requestbannersrefreshlambda13 != null) {
                r8lambda52ctlEduwkfz3l8UwwWKdau6wdM r8lambda52ctleduwkfz3l8uwwwkdau6wdm = refreshfeatureflagslambda0.MediaSessionCompatQueueItem;
                if (r8lambda52ctleduwkfz3l8uwwwkdau6wdm.write.millis() - r8lambda52ctleduwkfz3l8uwwwkdau6wdm.IconCompatParcelizer.get() >= TimeUnit.MINUTES.toMillis(((FirebaseRemoteConfigImpl) r8lambda52ctleduwkfz3l8uwwwkdau6wdm.RemoteActionCompatParcelizer).IconCompatParcelizer.write("tnc_webview_skip_buffer_interval"))) {
                    z = true;
                }
            }
            refreshfeatureflagslambda0.write.IconCompatParcelizer(Boolean.valueOf(z));
            if (z) {
                refreshfeatureflagslambda0.read.serializer(new requestContentCardsRefreshlambda0(requestbannersrefreshlambda13.url));
            } else {
                refreshfeatureflagslambda0.IconCompatParcelizer.IconCompatParcelizer.read.IconCompatParcelizer(null);
            }
            int i5 = read + 39;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            refreshfeatureflagslambda0.write.IconCompatParcelizer(Boolean.valueOf(((getItemAnimator) obj) != null));
            BuildersKt.RemoteActionCompatParcelizer(refreshfeatureflagslambda0.RemoteActionCompatParcelizer, null, null, new TncUiModelImpl$observeTncStatus$1(refreshfeatureflagslambda0, shortNewsContentCardView2, z ? 1 : 0), 3);
            return createfromparcel;
        }
        r8lambdaB7lTIYT0cAH9MiUxCtgCibXo3iw r8lambdab7ltiyt0cah9miuxctgcibxo3iw = (r8lambdaB7lTIYT0cAH9MiUxCtgCibXo3iw) obj;
        getQueryContext getquerycontext = refreshfeatureflagslambda0.read;
        requestBannersRefreshlambda120 requestbannersrefreshlambda120 = refreshfeatureflagslambda0.IconCompatParcelizer;
        r8lambda52ctlEduwkfz3l8UwwWKdau6wdM r8lambda52ctleduwkfz3l8uwwwkdau6wdm2 = refreshfeatureflagslambda0.MediaSessionCompatQueueItem;
        removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = refreshfeatureflagslambda0.MediaBrowserCompatMediaItem;
        if (r8lambdab7ltiyt0cah9miuxctgcibxo3iw instanceof r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U) {
            int i7 = read + 117;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 = ((r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U) r8lambdab7ltiyt0cah9miuxctgcibxo3iw).serializer;
            if (r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 != r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.SERVER_SIDE && r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 != r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.COMMUNICATION_TIMEOUT) {
                return createfromparcel;
            }
            r8lambda52ctleduwkfz3l8uwwwkdau6wdm2.IconCompatParcelizer.set(r8lambda52ctleduwkfz3l8uwwwkdau6wdm2.write.millis());
            requestbannersrefreshlambda120.IconCompatParcelizer.read.IconCompatParcelizer(null);
            String strName = r8lambda9wmzxq0wdyigcpoxrobdieyxrv8.name();
            LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("status", String.valueOf(false)));
            if (strName != null) {
                int i9 = RemoteActionCompatParcelizer + 79;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    linkedHashMapIconCompatParcelizer.put("reason", strName);
                    shortNewsContentCardView2.hashCode();
                    throw null;
                }
                linkedHashMapIconCompatParcelizer.put("reason", strName);
            }
            removesinglesubscriptionlambda101.RemoteActionCompatParcelizer.logEvent("tnc_consent_webview_status", linkedHashMapIconCompatParcelizer);
            return createfromparcel;
        }
        if (!(!(r8lambdab7ltiyt0cah9miuxctgcibxo3iw instanceof r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0))) {
            r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0 r8lambdadgzfnzek_ynxssj7dowrjatonk0 = (r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0) r8lambdab7ltiyt0cah9miuxctgcibxo3iw;
            requestContentCardsRefreshlambda1 requestcontentcardsrefreshlambda1 = requestbannersrefreshlambda120.IconCompatParcelizer;
            int i10 = removeSingleSubscriptionlambda0.IconCompatParcelizer[r8lambdadgzfnzek_ynxssj7dowrjatonk0.write.ordinal()];
            if (i10 == 1) {
                requestcontentcardsrefreshlambda1.read.IconCompatParcelizer(null);
                removesinglesubscriptionlambda101.IconCompatParcelizer(requestBannersRefreshlambda0.SUCCESS, false, null);
                return createfromparcel;
            }
            int i11 = read;
            int i12 = i11 + 13;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (i10 == 2) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdadgzfnzek_ynxssj7dowrjatonk0.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                    removesinglesubscriptionlambda101.IconCompatParcelizer(requestBannersRefreshlambda0.FAILED, false, r8lambdadgzfnzek_ynxssj7dowrjatonk0.serializer);
                    requestcontentcardsrefreshlambda1.read.IconCompatParcelizer(null);
                    r8lambda52ctleduwkfz3l8uwwwkdau6wdm2.IconCompatParcelizer.set(r8lambda52ctleduwkfz3l8uwwwkdau6wdm2.write.millis());
                    return createfromparcel;
                }
                String str2 = refreshfeatureflagslambda0.serializer;
                if (str2 == null) {
                    return createfromparcel;
                }
                getquerycontext.serializer(new requestContentCardsRefreshlambda0(str2));
                return createfromparcel;
            }
            int i14 = i11 + 61;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (i10 == 3) {
                String str3 = refreshfeatureflagslambda0.serializer;
                if (str3 == null) {
                    return createfromparcel;
                }
                getquerycontext.serializer(new requestContentCardsRefreshlambda0(str3));
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        return null;
    }
}
