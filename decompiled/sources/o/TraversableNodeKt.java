package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.installations.FirebaseInstallations;
import io.reactivex.functions.Action;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TraversableNodeKt implements Action {
    public final /* synthetic */ DisplayCallbacksImpl read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ TraversableNodeKt(DisplayCallbacksImpl displayCallbacksImpl, createComposition createcomposition) {
        this.serializer = 1;
        this.read = displayCallbacksImpl;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        boolean zSerializer;
        int i = this.serializer;
        DisplayCallbacksImpl displayCallbacksImpl = this.read;
        boolean z = true;
        char c = 1;
        if (i != 0) {
            if (i != 1) {
                displayCallbacksImpl.MediaSessionCompatQueueItem = true;
                return;
            }
            final MetricsLoggerClient metricsLoggerClient = (MetricsLoggerClient) displayCallbacksImpl.MediaMetadataCompat;
            final internalOnMeasureui internalonmeasureui = (internalOnMeasureui) displayCallbacksImpl.read;
            metricsLoggerClient.getClass();
            if (!internalonmeasureui.serializer().MediaSessionCompatToken()) {
                zzw zzwVarWrite = ((FirebaseInstallations) metricsLoggerClient.MediaBrowserCompatMediaItem).write();
                Executor executor = metricsLoggerClient.serializer;
                final char c2 = c == true ? 1 : 0;
                zzwVarWrite.addOnSuccessListener(executor, new OnSuccessListener() { // from class: o.getViewAdapter
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        int i2 = c2;
                        internalOnMeasureui internalonmeasureui2 = internalonmeasureui;
                        MetricsLoggerClient metricsLoggerClient2 = metricsLoggerClient;
                        String str = (String) obj;
                        if (i2 != 0) {
                            OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = metricsLoggerClient2.RatingCompat;
                            observeReadsui observereadsui = observeReadsui.CLICK_EVENT_TYPE;
                            getEnableExtraAssertions getenableextraassertionsWrite = metricsLoggerClient2.write(internalonmeasureui2, str);
                            getenableextraassertionsWrite.RemoteActionCompatParcelizer(observereadsui);
                            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(((CampaignAnalytics) getenableextraassertionsWrite.serializer()).toByteArray());
                            return;
                        }
                        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 = metricsLoggerClient2.RatingCompat;
                        observeReadsui observereadsui2 = observeReadsui.IMPRESSION_EVENT_TYPE;
                        getEnableExtraAssertions getenableextraassertionsWrite2 = metricsLoggerClient2.write(internalonmeasureui2, str);
                        getenableextraassertionsWrite2.RemoteActionCompatParcelizer(observereadsui2);
                        onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer(((CampaignAnalytics) getenableextraassertionsWrite2.serializer()).toByteArray());
                    }
                });
                metricsLoggerClient.IconCompatParcelizer(internalonmeasureui, "fiam_action", true);
            }
            Iterator it = metricsLoggerClient.MediaMetadataCompat.RemoteActionCompatParcelizer.values().iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
            return;
        }
        final MetricsLoggerClient metricsLoggerClient2 = (MetricsLoggerClient) displayCallbacksImpl.MediaMetadataCompat;
        final internalOnMeasureui internalonmeasureui2 = (internalOnMeasureui) displayCallbacksImpl.read;
        metricsLoggerClient2.getClass();
        if (!internalonmeasureui2.serializer().MediaSessionCompatToken()) {
            final int i2 = 0;
            ((FirebaseInstallations) metricsLoggerClient2.MediaBrowserCompatMediaItem).write().addOnSuccessListener(metricsLoggerClient2.serializer, new OnSuccessListener() { // from class: o.getViewAdapter
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    int i3 = i2;
                    internalOnMeasureui internalonmeasureui3 = internalonmeasureui2;
                    MetricsLoggerClient metricsLoggerClient3 = metricsLoggerClient2;
                    String str = (String) obj;
                    if (i3 != 0) {
                        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = metricsLoggerClient3.RatingCompat;
                        observeReadsui observereadsui = observeReadsui.CLICK_EVENT_TYPE;
                        getEnableExtraAssertions getenableextraassertionsWrite = metricsLoggerClient3.write(internalonmeasureui3, str);
                        getenableextraassertionsWrite.RemoteActionCompatParcelizer(observereadsui);
                        onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(((CampaignAnalytics) getenableextraassertionsWrite.serializer()).toByteArray());
                        return;
                    }
                    OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 = metricsLoggerClient3.RatingCompat;
                    observeReadsui observereadsui2 = observeReadsui.IMPRESSION_EVENT_TYPE;
                    getEnableExtraAssertions getenableextraassertionsWrite2 = metricsLoggerClient3.write(internalonmeasureui3, str);
                    getenableextraassertionsWrite2.RemoteActionCompatParcelizer(observereadsui2);
                    onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer(((CampaignAnalytics) getenableextraassertionsWrite2.serializer()).toByteArray());
                }
            });
            int i3 = getOrAddAdapter.IconCompatParcelizer[internalonmeasureui2.MediaBrowserCompatMediaItem.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    zSerializer = MetricsLoggerClient.serializer(((onRtlPropertiesChanged) internalonmeasureui2).read);
                } else if (i3 == 3) {
                    zSerializer = MetricsLoggerClient.serializer(((getComposeViewContextui) internalonmeasureui2).serializer);
                } else if (i3 != 4) {
                    SentryLogcatAdapter.serializer("FIAM.Headless", "Unable to determine if impression should be counted as conversion.");
                    z = false;
                } else {
                    zSerializer = MetricsLoggerClient.serializer(((internalOnLayoutui) internalonmeasureui2).RemoteActionCompatParcelizer);
                }
                z = true ^ zSerializer;
            } else {
                isTransitionGroup istransitiongroup = (isTransitionGroup) internalonmeasureui2;
                boolean zSerializer2 = MetricsLoggerClient.serializer(istransitiongroup.IconCompatParcelizer);
                boolean zSerializer3 = MetricsLoggerClient.serializer(istransitiongroup.MediaMetadataCompat);
                if (zSerializer2 || zSerializer3) {
                    z = false;
                }
            }
            metricsLoggerClient2.IconCompatParcelizer(internalonmeasureui2, "fiam_impression", z);
        }
        Iterator it2 = metricsLoggerClient2.MediaMetadataCompat.write.values().iterator();
        if (it2.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it2);
        }
    }

    public /* synthetic */ TraversableNodeKt(DisplayCallbacksImpl displayCallbacksImpl, int i) {
        this.serializer = i;
        this.read = displayCallbacksImpl;
    }
}
