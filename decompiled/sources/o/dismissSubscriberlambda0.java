package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.CombinedScopeView;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class dismissSubscriberlambda0 implements AddToCustomAttributeArrayStep {
    public final BrazeActionUtils IconCompatParcelizer;
    public final BrazeActionUtils MediaDescriptionCompat;
    public final BrazeActionUtils RemoteActionCompatParcelizer;
    public final io.sentry.logger.serializer read;
    public final CombinedScopeView serializer;
    public final openUriWithActionView write;

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.logger.RemoteActionCompatParcelizer MediaDescriptionCompat() {
        return this.read;
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, executelambda4 executelambda4Var, ContentCardsActivity contentCardsActivity) {
        BrazeActionUtils brazeActionUtils = this.serializer;
        ArrayList arrayList = accessensureviewmodelstore.ComponentActivity;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        if (accessensureviewmodelstore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", accessensureviewmodelstore.MediaMetadataCompat);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        Boolean bool = Boolean.TRUE;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = accessensureviewmodelstore.read.MediaSessionCompatQueueItem();
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem == null ? null : r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.MediaSessionCompatQueueItem;
        if (bool.equals(Boolean.valueOf(_get_messagewebview_lambda0 != null ? ((Boolean) _get_messagewebview_lambda0.write).booleanValue() : false))) {
            try {
                return brazeActionUtils.MediaSessionCompatQueueItem().read(accessensureviewmodelstore, r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, brazeActionUtils, executelambda4Var, contentCardsActivity);
            } catch (Throwable th) {
                RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while capturing transaction with id: " + accessensureviewmodelstore.MediaMetadataCompat, th);
                return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
            }
        }
        RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction %s was dropped due to sampling decision.", accessensureviewmodelstore.MediaMetadataCompat);
        if (RemoteActionCompatParcelizer().getBackpressureMonitor().serializer() > 0) {
            io.sentry.clientreport.IconCompatParcelizer clientReportRecorder = RemoteActionCompatParcelizer().getClientReportRecorder();
            io.sentry.clientreport.read readVar = io.sentry.clientreport.read.BACKPRESSURE;
            clientReportRecorder.IconCompatParcelizer(readVar, openUriWithActionViewFromPush.Transaction);
            RemoteActionCompatParcelizer().getClientReportRecorder().read(readVar, openUriWithActionViewFromPush.Span, arrayList.size() + 1);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        io.sentry.clientreport.IconCompatParcelizer clientReportRecorder2 = RemoteActionCompatParcelizer().getClientReportRecorder();
        io.sentry.clientreport.read readVar2 = io.sentry.clientreport.read.SAMPLE_RATE;
        clientReportRecorder2.IconCompatParcelizer(readVar2, openUriWithActionViewFromPush.Transaction);
        RemoteActionCompatParcelizer().getClientReportRecorder().read(readVar2, openUriWithActionViewFromPush.Span, arrayList.size() + 1);
        return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final boolean MediaBrowserCompatMediaItem() {
        return this.serializer.MediaSessionCompatQueueItem().RemoteActionCompatParcelizer();
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final boolean RatingCompat() {
        return this.serializer.MediaSessionCompatQueueItem().serializer();
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final SentryOptions RemoteActionCompatParcelizer() {
        return ((BrazeActionUtils) this.serializer.RemoteActionCompatParcelizer).ResultReceiver();
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg RemoteActionCompatParcelizer(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        BrazeActionUtils brazeActionUtils = this.serializer;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer;
        }
        if (bannerViewExternalSyntheticLambda2 == null) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer;
        }
        try {
            brazeActionUtils.write(bannerViewExternalSyntheticLambda2);
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer = brazeActionUtils.MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, brazeActionUtils, executelambda4Var);
            brazeActionUtils.IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer;
        } catch (Throwable th) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while capturing event with id: " + bannerViewExternalSyntheticLambda2.MediaMetadataCompat, th);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgRemoteActionCompatParcelizer;
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read(onCustomEventAction oncustomeventaction, executelambda4 executelambda4Var) {
        BrazeActionUtils brazeActionUtils = this.serializer;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        try {
            return brazeActionUtils.MediaSessionCompatQueueItem().write(oncustomeventaction, brazeActionUtils, executelambda4Var);
        } catch (Throwable th) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while capturing replay", th);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final AddToCustomAttributeArrayStep read(String str) {
        return new dismissSubscriberlambda0(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), this.IconCompatParcelizer);
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void read(Throwable th, IBannerWebViewClientListener iBannerWebViewClientListener, String str) {
        this.serializer.RemoteActionCompatParcelizer(th, iBannerWebViewClientListener, str);
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final getChildStepIteratorandroid_sdk_ui_release serializer(defaultCardHandling defaultcardhandling, handleCardClicklambda4 handlecardclicklambda4) {
        Double dValueOf;
        defaultcardhandling.RatingCompat = (String) handlecardclicklambda4.read;
        boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = secondArg_delegatelambda0.IconCompatParcelizer;
        if (!zMediaBrowserCompatMediaItem) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(defaultcardhandling.RatingCompat, RemoteActionCompatParcelizer().getIgnoredSpanOrigins())) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", defaultcardhandling.RatingCompat);
        } else if (!RemoteActionCompatParcelizer().getInstrumenter().equals(defaultcardhandling.serializer)) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", defaultcardhandling.serializer, RemoteActionCompatParcelizer().getInstrumenter());
        } else if (RemoteActionCompatParcelizer().isTracingEnabled()) {
            getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0 = defaultcardhandling.read;
            if (getintentarraywithconfiguredbackstacklambda0 == null || (dValueOf = getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat) == null) {
                Double d = ((getIntentArrayWithConfiguredBackStacklambda0) this.serializer.ComponentActivity().read).MediaDescriptionCompat;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            _get_messageWebView_lambda0 _get_messagewebview_lambda0Serializer = RemoteActionCompatParcelizer().getInternalTracesSampler().serializer(new OkHttpCall$1(defaultcardhandling, dValueOf));
            Boolean bool = (Boolean) _get_messagewebview_lambda0Serializer.write;
            defaultcardhandling.IconCompatParcelizer(_get_messagewebview_lambda0Serializer);
            runOnUserandroid_sdk_ui_release spanFactory = RemoteActionCompatParcelizer().getSpanFactory();
            if (bool.booleanValue() && RemoteActionCompatParcelizer().isContinuousProfilingEnabled()) {
                StepDataargs_delegatelambda0inlinediterator1 profileLifecycle = RemoteActionCompatParcelizer().getProfileLifecycle();
                StepDataargs_delegatelambda0inlinediterator1 stepDataargs_delegatelambda0inlinediterator1 = StepDataargs_delegatelambda0inlinediterator1.TRACE;
                if (profileLifecycle == stepDataargs_delegatelambda0inlinediterator1 && defaultcardhandling.MediaDescriptionCompat.equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer)) {
                    RemoteActionCompatParcelizer().getContinuousProfiler().RemoteActionCompatParcelizer(stepDataargs_delegatelambda0inlinediterator1, RemoteActionCompatParcelizer().getInternalTracesSampler());
                }
            }
            getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseRemoteActionCompatParcelizer = spanFactory.RemoteActionCompatParcelizer(defaultcardhandling, this, handlecardclicklambda4, this.write);
            if (bool.booleanValue() && ((Boolean) _get_messagewebview_lambda0Serializer.IconCompatParcelizer).booleanValue()) {
                ContainerStep transactionProfiler = RemoteActionCompatParcelizer().getTransactionProfiler();
                if (!transactionProfiler.read()) {
                    transactionProfiler.write();
                    transactionProfiler.IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_releaseRemoteActionCompatParcelizer);
                } else if (handlecardclicklambda4.MediaMetadataCompat) {
                    transactionProfiler.IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_releaseRemoteActionCompatParcelizer);
                }
            }
            getchildstepiteratorandroid_sdk_ui_release = getchildstepiteratorandroid_sdk_ui_releaseRemoteActionCompatParcelizer;
        } else {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU.ON == ((r8lambdaaMcmwVrYRO5d5jdf3Z38wSINaiU) handlecardclicklambda4.serializer)) {
            getchildstepiteratorandroid_sdk_ui_release.MediaBrowserCompatMediaItem();
        }
        return getchildstepiteratorandroid_sdk_ui_release;
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        try {
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite = this.serializer.MediaSessionCompatQueueItem().write(okHttpCall$1, executelambda4Var);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite != null ? r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite : r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        } catch (Throwable th) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while capturing envelope.", th);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.transport.PlaybackStateCompat write() {
        return this.serializer.MediaSessionCompatQueueItem().IconCompatParcelizer();
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg serializer(StepDataargs_delegatelambda0inlinediterator2 stepDataargs_delegatelambda0inlinediterator2) {
        setNativeShader.read(stepDataargs_delegatelambda0inlinediterator2, "profilingContinuousData is required");
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        try {
            return this.serializer.MediaSessionCompatQueueItem().IconCompatParcelizer(stepDataargs_delegatelambda0inlinediterator2);
        } catch (Throwable th) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while capturing profile chunk with id: " + stepDataargs_delegatelambda0inlinediterator2.IconCompatParcelizer, th);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
    }

    public dismissSubscriberlambda0(BrazeActionUtils brazeActionUtils, BrazeActionUtils brazeActionUtils2, BrazeActionUtils brazeActionUtils3) {
        this.serializer = new CombinedScopeView(brazeActionUtils3, brazeActionUtils2, brazeActionUtils, 0);
        this.MediaDescriptionCompat = brazeActionUtils;
        this.RemoteActionCompatParcelizer = brazeActionUtils2;
        this.IconCompatParcelizer = brazeActionUtils3;
        SentryOptions sentryOptionsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        setNativeShader.read(sentryOptionsRemoteActionCompatParcelizer, "SentryOptions is required.");
        if (sentryOptionsRemoteActionCompatParcelizer.getDsn() == null || sentryOptionsRemoteActionCompatParcelizer.getDsn().isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
            throw null;
        }
        this.write = sentryOptionsRemoteActionCompatParcelizer.getCompositePerformanceCollector();
        this.read = new io.sentry.logger.serializer(this);
    }

    @Override // o.AddToCustomAttributeArrayStep
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final parseEncodedActionToJsonandroid_sdk_ui_release clone() {
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new isBrazeActionUri((dismissSubscriberlambda0) read("scopes clone"));
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final getChildStepIteratorandroid_sdk_ui_release MediaMetadataCompat() {
        if (MediaBrowserCompatMediaItem()) {
            return this.serializer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }
        RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void RemoteActionCompatParcelizer(r8lambdaaCm2JcMru73kJeywi54SW2Mni8U r8lambdaacm2jcmru73kjeywi54sw2mni8u) {
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            r8lambdaacm2jcmru73kjeywi54sw2mni8u.write(this.serializer.write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null));
        } catch (Throwable th) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 read() {
        if (MediaBrowserCompatMediaItem()) {
            return this.serializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void read(long j) {
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.serializer.MediaSessionCompatQueueItem().read(j);
        } catch (Throwable th) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void IconCompatParcelizer(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1, executelambda4 executelambda4Var) {
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (getintentarraywithconfiguredbackstacklambda1 == null) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.serializer.read(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void MediaSessionCompatQueueItem() {
        byte b = 0;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        CombinedScopeView combinedScopeView = this.serializer;
        OkHttpCall$1 okHttpCall$1R8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = combinedScopeView.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        if (okHttpCall$1R8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        logHtmlClicklambda0 loghtmlclicklambda0 = (logHtmlClicklambda0) okHttpCall$1R8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write;
        if (loghtmlclicklambda0 != null) {
            combinedScopeView.MediaSessionCompatQueueItem().serializer(loghtmlclicklambda0, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new io.sentry.hints.MediaSessionCompatQueueItem(b, b)));
        }
        combinedScopeView.MediaSessionCompatQueueItem().serializer((logHtmlClicklambda0) okHttpCall$1R8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new io.sentry.hints.PlaybackStateCompatCustomAction(b)));
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void serializer() {
        byte b = 0;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        CombinedScopeView combinedScopeView = this.serializer;
        logHtmlClicklambda0 loghtmlclicklambda0Serializer = combinedScopeView.serializer();
        if (loghtmlclicklambda0Serializer != null) {
            combinedScopeView.MediaSessionCompatQueueItem().serializer(loghtmlclicklambda0Serializer, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new io.sentry.hints.MediaSessionCompatQueueItem(b, b)));
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void serializer(boolean z) {
        int i = 0;
        if (!MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (LogCustomEventStep logCustomEventStep : RemoteActionCompatParcelizer().getIntegrations()) {
                if (logCustomEventStep instanceof Closeable) {
                    try {
                        ((Closeable) logCustomEventStep).close();
                    } catch (Throwable th) {
                        RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to close the integration {}.", logCustomEventStep, th);
                    }
                }
            }
            boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            CombinedScopeView combinedScopeView = this.serializer;
            if (zMediaBrowserCompatMediaItem) {
                try {
                    combinedScopeView.write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).PlaybackStateCompatCustomAction();
                } catch (Throwable th2) {
                    RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th2);
                }
            } else {
                RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik = r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik.ISOLATION;
            if (MediaBrowserCompatMediaItem()) {
                try {
                    combinedScopeView.write(r8lambdacr4tgcnfsm4f1f1q1igncb5rik).PlaybackStateCompatCustomAction();
                } catch (Throwable th3) {
                    RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            RemoteActionCompatParcelizer().getBackpressureMonitor().write();
            RemoteActionCompatParcelizer().getTransactionProfiler().IconCompatParcelizer();
            RemoteActionCompatParcelizer().getContinuousProfiler().write(true);
            RemoteActionCompatParcelizer().getCompositePerformanceCollector().IconCompatParcelizer();
            RemoteActionCompatParcelizer().getConnectionStatusProvider().close();
            BrazeActionUtilsWhenMappings executorService = RemoteActionCompatParcelizer().getExecutorService();
            if (z) {
                try {
                    executorService.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, i, executorService));
                } catch (RejectedExecutionException e) {
                    RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer().getShutdownTimeoutMillis());
                }
            } else {
                executorService.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer().getShutdownTimeoutMillis());
            }
            r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik2 = r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik.CURRENT;
            if (MediaBrowserCompatMediaItem()) {
                try {
                    combinedScopeView.write(r8lambdacr4tgcnfsm4f1f1q1igncb5rik2).MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(z);
                } catch (Throwable th4) {
                    RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik3 = r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik.ISOLATION;
            if (MediaBrowserCompatMediaItem()) {
                try {
                    combinedScopeView.write(r8lambdacr4tgcnfsm4f1f1q1igncb5rik3).MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(z);
                } catch (Throwable th5) {
                    RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik4 = r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik.GLOBAL;
            if (!MediaBrowserCompatMediaItem()) {
                RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                combinedScopeView.write(r8lambdacr4tgcnfsm4f1f1q1igncb5rik4).MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(z);
            } catch (Throwable th6) {
                RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th6);
            }
        } catch (Throwable th7) {
            RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while closing the Scopes.", th7);
        }
    }

    @Override // o.AddToCustomAttributeArrayStep
    public final void read(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1) {
        IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, new executelambda4());
    }
}
