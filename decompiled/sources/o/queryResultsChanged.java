package o;

import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import io.sentry.CombinedScopeView;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class queryResultsChanged implements r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ CombinedScopeView read;

    public /* synthetic */ queryResultsChanged(CombinedScopeView combinedScopeView) {
        this.read = combinedScopeView;
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        int i2 = write + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            brazeActionUtils.getClass();
            brazeActionUtils.IconCompatParcelizer("brand", ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.read.RemoteActionCompatParcelizer).write);
        } else {
            brazeActionUtils.getClass();
            brazeActionUtils.IconCompatParcelizer("brand", ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.read.RemoteActionCompatParcelizer).write);
            int i3 = 4 / 0;
        }
    }

    public void IconCompatParcelizer(SentryOptions sentryOptions) {
        int i = 2 % 2;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        sentryAndroidOptions.getClass();
        CombinedScopeView combinedScopeView = this.read;
        sentryAndroidOptions.setRelease(combinedScopeView.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
        String strR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = combinedScopeView.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = strR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.getBytes(charset);
        bytes.getClass();
        sentryAndroidOptions.setProguardUuid(UUID.nameUUIDFromBytes(bytes).toString());
        QueryListener queryListener = (QueryListener) combinedScopeView.write;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) queryListener.read;
        double dWrite = firebaseRemoteConfigImpl.IconCompatParcelizer.write("sentry_performance_trace_sampling_rate_v2") / 100000.0d;
        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = firebaseRemoteConfigImpl.IconCompatParcelizer;
        double dWrite2 = firebaseRemoteConfigProvider.write("sentry_performance_profile_session_sampling_rate_v2") / 100000.0d;
        boolean zIconCompatParcelizer = firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_SENTRY_USER_INTERACTIONS_ENABLED.getFirebaseFlagName());
        Set setRemoteActionCompatParcelizer = firebaseRemoteConfigProvider.RemoteActionCompatParcelizer("android_sentry_span_filters");
        Set setRemoteActionCompatParcelizer2 = firebaseRemoteConfigProvider.RemoteActionCompatParcelizer("sentry_transaction_filters");
        Set setRemoteActionCompatParcelizer3 = firebaseRemoteConfigProvider.RemoteActionCompatParcelizer("sentry_important_traces");
        double dWrite3 = firebaseRemoteConfigProvider.write("sentry_core_tti_trace_sampling_rate_v2") / 100000.0d;
        double dWrite4 = firebaseRemoteConfigProvider.write("sentry_important_trace_sampling_rate_v2") / 100000.0d;
        sentryAndroidOptions.setProfilesSampler(null);
        sentryAndroidOptions.setProfilesSampleRate(null);
        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dWrite2));
        sentryAndroidOptions.setProfileLifecycle(StepDataargs_delegatelambda0inlinediterator1.TRACE);
        sentryAndroidOptions.setEnableNdk(firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_SENTRY_NDK_ENABLED.getFirebaseFlagName()));
        updateAdidI updateadidi = updateAdidI.IS_SENTRY_TOMBSTONE_ENABLED;
        sentryAndroidOptions.setTombstoneEnabled(firebaseRemoteConfigProvider.IconCompatParcelizer(updateadidi.getFirebaseFlagName()));
        sentryAndroidOptions.setReportHistoricalTombstones(firebaseRemoteConfigProvider.IconCompatParcelizer(updateadidi.getFirebaseFlagName()));
        sentryAndroidOptions.setTracesSampler(new RollbackException(dWrite3, setRemoteActionCompatParcelizer3, dWrite4, dWrite));
        sentryAndroidOptions.setEnableAppStartProfiling(true);
        sentryAndroidOptions.setBeforeSendTransaction(new JankStatsFrameTracker$$ExternalSyntheticLambda3(setRemoteActionCompatParcelizer2, 18, setRemoteActionCompatParcelizer));
        sentryAndroidOptions.setBeforeSend(new PerseusInitializerImpl$$ExternalSyntheticLambda0(22, queryListener));
        sentryAndroidOptions.setAttachScreenshot(false);
        sentryAndroidOptions.setAttachViewHierarchy(firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_SENTRY_ATTACH_VIEW_HIERARCHY_ENABLED.getFirebaseFlagName()));
        sentryAndroidOptions.setCollectAdditionalContext(firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_SENTRY_ADDITIONAL_CONTEXT_ENABLED.getFirebaseFlagName()));
        sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(true);
        sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(true);
        sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(true);
        sentryAndroidOptions.setEnablePerformanceV2(true);
        sentryAndroidOptions.setEnableSystemEventBreadcrumbs(true);
        sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(zIconCompatParcelizer);
        sentryAndroidOptions.setEnableUserInteractionTracing(zIconCompatParcelizer);
        int i2 = IconCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
