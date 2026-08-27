package o;

import io.sentry.HostnameCache$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class isArgCountInBounds implements BrazeActionParserActionTypeCompanion, fromNullableFields, BrazeActionUtilsWhenMappings, ContainerStep, r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE {
    public static final isArgCountInBounds read = new isArgCountInBounds();
    public static final isArgCountInBounds serializer = new isArgCountInBounds();
    public static final isArgCountInBounds write = new isArgCountInBounds();
    public static final isArgCountInBounds IconCompatParcelizer = new isArgCountInBounds();

    @Override // o.ContainerStep
    public void IconCompatParcelizer() {
    }

    @Override // o.fromNullableFields
    public void IconCompatParcelizer(io.sentry.android.replay.serializer serializerVar) {
    }

    @Override // o.ContainerStep
    public void IconCompatParcelizer(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
    }

    @Override // o.fromNullableFields
    public void MediaBrowserCompatMediaItem() {
    }

    @Override // o.fromNullableFields
    public void MediaDescriptionCompat() {
    }

    @Override // o.fromNullableFields
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaMetadataCompat() {
        return io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
    }

    @Override // o.fromNullableFields
    public BrazeBaseFragmentActivity MediaSessionCompatQueueItem() {
        return r8lambdaTNtTDMxkDDgiI2m22ZXaLqsE.RemoteActionCompatParcelizer;
    }

    @Override // o.fromNullableFields
    public void PlaybackStateCompatCustomAction() {
    }

    @Override // o.fromNullableFields
    public void RatingCompat() {
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public void RemoteActionCompatParcelizer(long j) {
    }

    @Override // o.fromNullableFields
    public void RemoteActionCompatParcelizer(Boolean bool) {
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public boolean RemoteActionCompatParcelizer() {
        return false;
    }

    @Override // o.ContainerStep
    public boolean read() {
        return false;
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public void serializer() {
    }

    @Override // o.ContainerStep
    public ContentCardsActivity write(formatQueryBundleForLoglambda0 formatquerybundleforloglambda0, List list, SentryOptions sentryOptions) {
        return null;
    }

    @Override // o.ContainerStep
    public void write() {
    }

    @Override // o.r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE
    public io.sentry.transport.MediaDescriptionCompat serializer(SentryOptions sentryOptions, OkHttpCall$1 okHttpCall$1) {
        return new io.sentry.transport.RemoteActionCompatParcelizer(sentryOptions, new io.sentry.transport.PlaybackStateCompat(sentryOptions), sentryOptions.getTransportGate(), okHttpCall$1);
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public Future IconCompatParcelizer(Runnable runnable, long j) {
        return new FutureTask(new HostnameCache$$ExternalSyntheticLambda0(3));
    }

    @Override // o.BrazeActionUtilsWhenMappings
    public Future RemoteActionCompatParcelizer(Runnable runnable) {
        return new FutureTask(new HostnameCache$$ExternalSyntheticLambda0(3));
    }
}
