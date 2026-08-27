package o;

import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class formatQueryBundleForLoglambda0 implements getChildStepIteratorandroid_sdk_ui_release {
    public final handleCardClicklambda4 ComponentActivity;
    public final AtomicBoolean MediaBrowserCompatMediaItem;
    public volatile r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo MediaDescriptionCompat;
    public final AtomicBoolean MediaMetadataCompat;
    public final IBannerWebViewClientListener MediaSessionCompatResultReceiverWrapper;
    public final dismissSubscriberlambda0 MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public volatile java.util.Timer PlaybackStateCompat;
    public final io.sentry.util.RemoteActionCompatParcelizer PlaybackStateCompatCustomAction;
    public final ContainerStepgetChildStepIteratorinlinediterator2 RatingCompat;
    public final openUriWithActionView RemoteActionCompatParcelizer;
    public final io.sentry.util.RemoteActionCompatParcelizer r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final io.sentry.protocol.ensureViewModelStore r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public volatile r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo serializer;
    public final io.sentry.protocol.IconCompatParcelizer write;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    public final CopyOnWriteArrayList IconCompatParcelizer = new CopyOnWriteArrayList();
    public BannerWebViewClient MediaSessionCompatQueueItem = BannerWebViewClient.RemoteActionCompatParcelizer;

    @Override // o.getChildStepIteratorandroid_sdk_ui_release
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaSessionCompatToken() {
        return this.read;
    }

    @Override // o.getChildStepIteratorandroid_sdk_ui_release
    public final String PlaybackStateCompat() {
        return this.ParcelableVolumeInfo;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final boolean RatingCompat() {
        return false;
    }

    public final Boolean ComponentActivity() {
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = this.MediaSessionCompatResultReceiverWrapper.read.MediaSessionCompatQueueItem;
        if (_get_messagewebview_lambda0 == null) {
            return null;
        }
        return (Boolean) _get_messagewebview_lambda0.write;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final String IconCompatParcelizer() {
        return this.MediaSessionCompatResultReceiverWrapper.read.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(IBannerWebViewClientListener iBannerWebViewClientListener) {
        io.sentry.util.thread.IconCompatParcelizer threadChecker = this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getThreadChecker();
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (!r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys.equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer)) {
            Boolean bool = Boolean.TRUE;
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = iBannerWebViewClientListener.read.MediaSessionCompatQueueItem;
            if (bool.equals(_get_messagewebview_lambda0 == null ? null : (Boolean) _get_messagewebview_lambda0.write)) {
                iBannerWebViewClientListener.read(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys.toString(), "profiler_id");
            }
        }
        iBannerWebViewClientListener.read(String.valueOf(threadChecker.read()), "thread.id");
        iBannerWebViewClientListener.read(threadChecker.serializer(), "thread.name");
    }

    @Override // o.getChildStepIteratorandroid_sdk_ui_release
    public final void IconCompatParcelizer(defaultCardHandlinglambda0 defaultcardhandlinglambda0, boolean z, executelambda4 executelambda4Var) {
        if (this.MediaSessionCompatResultReceiverWrapper.write) {
            return;
        }
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer = this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.IconCompatParcelizer);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            IBannerWebViewClientListener iBannerWebViewClientListener = (IBannerWebViewClientListener) listIterator.previous();
            iBannerWebViewClientListener.MediaSessionCompatQueueItem = null;
            iBannerWebViewClientListener.write(defaultcardhandlinglambda0, createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer);
        }
        serializer(defaultcardhandlinglambda0, createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer, z, executelambda4Var);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void MediaBrowserCompatMediaItem() {
        dismissSubscriberlambda0 dismisssubscriberlambda0 = this.MediaSessionCompatToken;
        if (!dismisssubscriberlambda0.MediaBrowserCompatMediaItem()) {
            dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            dismisssubscriberlambda0.serializer.write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).IconCompatParcelizer(this);
        } catch (Throwable th) {
            dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final boolean MediaDescriptionCompat() {
        return this.MediaSessionCompatResultReceiverWrapper.write;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0 MediaMetadataCompat() {
        return this.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat();
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final defaultCardHandlinglambda0 MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatResultReceiverWrapper.read.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.getChildStepIteratorandroid_sdk_ui_release
    public final void MediaSessionCompatResultReceiverWrapper() {
        Long l;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            if (this.PlaybackStateCompat != null && (l = this.ComponentActivity.MediaDescriptionCompat) != null) {
                ResultReceiver();
                this.MediaMetadataCompat.set(true);
                this.MediaDescriptionCompat = new r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo(0, this);
                try {
                    this.PlaybackStateCompat.schedule(this.MediaDescriptionCompat, l.longValue());
                } catch (Throwable th) {
                    this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to schedule finish timer", th);
                    defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                    if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
                        defaultcardhandlinglambda0MediaSessionCompatQueueItem = defaultCardHandlinglambda0.OK;
                    }
                    write(defaultcardhandlinglambda0MediaSessionCompatQueueItem, (createBannerWebViewClientListenerandroid_sdk_ui_release) null);
                    this.MediaMetadataCompat.set(false);
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th2) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU ParcelableVolumeInfo() {
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0;
        if (!this.MediaSessionCompatToken.RemoteActionCompatParcelizer().isTraceSampling() || (getintentarraywithconfiguredbackstacklambda0 = this.MediaSessionCompatResultReceiverWrapper.read.read) == null) {
            return null;
        }
        RemoteActionCompatParcelizer(getintentarraywithconfiguredbackstacklambda0);
        return getintentarraywithconfiguredbackstacklambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.getChildStepIteratorandroid_sdk_ui_release
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 PlaybackStateCompatCustomAction() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.IconCompatParcelizer);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            IBannerWebViewClientListener iBannerWebViewClientListener = (IBannerWebViewClientListener) listIterator.previous();
            if (!iBannerWebViewClientListener.write) {
                return iBannerWebViewClientListener;
            }
        }
        return null;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final mergeJsonObjectslambda00 RemoteActionCompatParcelizer(List list) {
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0;
        if (!this.MediaSessionCompatToken.RemoteActionCompatParcelizer().isTraceSampling() || (getintentarraywithconfiguredbackstacklambda0 = this.MediaSessionCompatResultReceiverWrapper.read.read) == null) {
            return null;
        }
        RemoteActionCompatParcelizer(getintentarraywithconfiguredbackstacklambda0);
        return mergeJsonObjectslambda00.serializer(getintentarraywithconfiguredbackstacklambda0, list);
    }

    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 RemoteActionCompatParcelizer(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai) {
        boolean z = this.MediaSessionCompatResultReceiverWrapper.write;
        isArgStringlambda0 isargstringlambda0 = isArgStringlambda0.read;
        if (!z && this.RatingCompat.equals(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.serializer)) {
            dismissSubscriberlambda0 dismisssubscriberlambda0 = this.MediaSessionCompatToken;
            if (!io.sentry.util.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer((String) r8lambdalmkbrrgswwtv97obrsj7trj7ai.read, dismisssubscriberlambda0.RemoteActionCompatParcelizer().getIgnoredSpanOrigins())) {
                r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaMetadataCompat;
                String str = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaBrowserCompatMediaItem;
                String str2 = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.IconCompatParcelizer;
                CopyOnWriteArrayList copyOnWriteArrayList = this.IconCompatParcelizer;
                if (copyOnWriteArrayList.size() >= dismisssubscriberlambda0.RemoteActionCompatParcelizer().getMaxSpans()) {
                    dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return isargstringlambda0;
                }
                setNativeShader.read(r8lambdayq9qbmke5in5qopvpj_kuggks_k, "parentSpanId is required");
                setNativeShader.read(str, "operation is required");
                ResultReceiver();
                IBannerWebViewClientListener iBannerWebViewClientListener = new IBannerWebViewClientListener(this, this.MediaSessionCompatToken, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, r8lambdalmkbrrgswwtv97obrsj7trj7ai, new SentryTracer$$ExternalSyntheticLambda1(0, this));
                IconCompatParcelizer(iBannerWebViewClientListener);
                copyOnWriteArrayList.add(iBannerWebViewClientListener);
                openUriWithActionView openuriwithactionview = this.RemoteActionCompatParcelizer;
                if (openuriwithactionview != null) {
                    openuriwithactionview.serializer(iBannerWebViewClientListener);
                }
                return iBannerWebViewClientListener;
            }
        }
        return isargstringlambda0;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatResultReceiverWrapper.read;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void RemoteActionCompatParcelizer(String str, String str2) {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener.write) {
            this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The transaction is already finished. Tag %s cannot be set", str);
        } else {
            iBannerWebViewClientListener.RemoteActionCompatParcelizer(str, str2);
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void RemoteActionCompatParcelizer(Throwable th) {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener.write) {
            this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            iBannerWebViewClientListener.MediaMetadataCompat = th;
        }
    }

    public final void RemoteActionCompatParcelizer(getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0) {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        dismissSubscriberlambda0 dismisssubscriberlambda0 = this.MediaSessionCompatToken;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer();
        try {
            if (getintentarraywithconfiguredbackstacklambda0.serializer) {
                AtomicReference atomicReference = new AtomicReference();
                if (dismisssubscriberlambda0.MediaBrowserCompatMediaItem()) {
                    try {
                        atomicReference.set(dismisssubscriberlambda0.serializer.write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    } catch (Throwable th) {
                        dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th);
                    }
                } else {
                    dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                getintentarraywithconfiguredbackstacklambda0.serializer(iBannerWebViewClientListener.read.PlaybackStateCompat, (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) atomicReference.get(), dismisssubscriberlambda0.RemoteActionCompatParcelizer(), iBannerWebViewClientListener.read.MediaSessionCompatQueueItem, this.ParcelableVolumeInfo, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                getintentarraywithconfiguredbackstacklambda0.serializer = false;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th2) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void ResultReceiver() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            if (this.MediaDescriptionCompat != null) {
                this.MediaDescriptionCompat.cancel();
                this.MediaMetadataCompat.set(false);
                this.MediaDescriptionCompat = null;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        return !iBannerWebViewClientListener.read.MediaDescriptionCompat.equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer) ? iBannerWebViewClientListener.read.MediaDescriptionCompat : this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getContinuousProfiler().write();
    }

    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            if (this.serializer != null) {
                this.serializer.cancel();
                this.MediaBrowserCompatMediaItem.set(false);
                this.serializer = null;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 read(String str, String str2, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, ContainerStepgetChildStepIteratorinlinediterator2 containerStepgetChildStepIteratorinlinediterator2, r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai) {
        boolean z = this.MediaSessionCompatResultReceiverWrapper.write;
        isArgStringlambda0 isargstringlambda0 = isArgStringlambda0.read;
        if (z || !this.RatingCompat.equals(containerStepgetChildStepIteratorinlinediterator2)) {
            return isargstringlambda0;
        }
        int size = this.IconCompatParcelizer.size();
        dismissSubscriberlambda0 dismisssubscriberlambda0 = this.MediaSessionCompatToken;
        if (size < dismisssubscriberlambda0.RemoteActionCompatParcelizer().getMaxSpans()) {
            return this.MediaSessionCompatResultReceiverWrapper.read(str, str2, createbannerwebviewclientlistenerandroid_sdk_ui_release, containerStepgetChildStepIteratorinlinediterator2, r8lambdalmkbrrgswwtv97obrsj7trj7ai);
        }
        dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return isargstringlambda0;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void read(Object obj, String str) {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener.write) {
            this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            iBannerWebViewClientListener.read(obj, str);
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void read(defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener.write) {
            this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The transaction is already finished. Status %s cannot be set", defaultcardhandlinglambda0 == null ? "null" : defaultcardhandlinglambda0.name());
        } else {
            iBannerWebViewClientListener.read.MediaSessionCompatResultReceiverWrapper = defaultcardhandlinglambda0;
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final createBannerWebViewClientListenerandroid_sdk_ui_release serializer() {
        return this.MediaSessionCompatResultReceiverWrapper.MediaSessionCompatResultReceiverWrapper;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    public final void serializer(defaultCardHandlinglambda0 defaultcardhandlinglambda0, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, boolean z, executelambda4 executelambda4Var) {
        ContentCardsActivity contentCardsActivityWrite;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release2 = this.MediaSessionCompatResultReceiverWrapper.MediaSessionCompatResultReceiverWrapper;
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release == null) {
            createbannerwebviewclientlistenerandroid_sdk_ui_release = createbannerwebviewclientlistenerandroid_sdk_ui_release2;
        }
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release == null) {
            createbannerwebviewclientlistenerandroid_sdk_ui_release = this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        }
        Iterator it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((IBannerWebViewClientListener) it.next()).MediaBrowserCompatMediaItem.getClass();
        }
        this.MediaSessionCompatQueueItem = new BannerWebViewClient(true, defaultcardhandlinglambda0);
        if (this.MediaSessionCompatResultReceiverWrapper.write) {
            return;
        }
        if (this.ComponentActivity.MediaSessionCompatQueueItem) {
            ListIterator listIterator = this.IconCompatParcelizer.listIterator();
            while (listIterator.hasNext()) {
                IBannerWebViewClientListener iBannerWebViewClientListener = (IBannerWebViewClientListener) listIterator.next();
                if (!iBannerWebViewClientListener.write && iBannerWebViewClientListener.MediaSessionCompatResultReceiverWrapper == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        IBannerWebViewClientListener iBannerWebViewClientListener2 = this.MediaSessionCompatResultReceiverWrapper;
        iBannerWebViewClientListener2.MediaSessionCompatQueueItem = new SentryClient$$ExternalSyntheticLambda1(this, iBannerWebViewClientListener2.MediaSessionCompatQueueItem, atomicReference, 6);
        iBannerWebViewClientListener2.write(this.MediaSessionCompatQueueItem.read, createbannerwebviewclientlistenerandroid_sdk_ui_release);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(ComponentActivity())) {
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = this.MediaSessionCompatResultReceiverWrapper.read.MediaSessionCompatQueueItem;
            if (bool.equals(_get_messagewebview_lambda0 == null ? null : (Boolean) _get_messagewebview_lambda0.IconCompatParcelizer)) {
                contentCardsActivityWrite = this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getTransactionProfiler().write(this, (List) atomicReference.get(), this.MediaSessionCompatToken.RemoteActionCompatParcelizer());
            } else {
                contentCardsActivityWrite = null;
            }
        } else {
            contentCardsActivityWrite = null;
        }
        if (this.MediaSessionCompatToken.RemoteActionCompatParcelizer().isContinuousProfilingEnabled()) {
            StepDataargs_delegatelambda0inlinediterator1 profileLifecycle = this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getProfileLifecycle();
            StepDataargs_delegatelambda0inlinediterator1 stepDataargs_delegatelambda0inlinediterator1 = StepDataargs_delegatelambda0inlinediterator1.TRACE;
            if (profileLifecycle == stepDataargs_delegatelambda0inlinediterator1 && this.MediaSessionCompatResultReceiverWrapper.read.MediaDescriptionCompat.equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer)) {
                this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getContinuousProfiler().RemoteActionCompatParcelizer(stepDataargs_delegatelambda0inlinediterator1);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        dismissSubscriberlambda0 dismisssubscriberlambda0 = this.MediaSessionCompatToken;
        if (dismisssubscriberlambda0.MediaBrowserCompatMediaItem()) {
            try {
                BrazeActionUtils brazeActionUtilsWrite = dismisssubscriberlambda0.serializer.write((r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik) null);
                brazeActionUtilsWrite.RemoteActionCompatParcelizer(new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 24, brazeActionUtilsWrite));
            } catch (Throwable th) {
                dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'configureScope' callback.", th);
            }
        } else {
            dismisssubscriberlambda0.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore = new io.sentry.protocol.accessensureViewModelStore(this);
        if (this.PlaybackStateCompat != null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
            try {
                if (this.PlaybackStateCompat != null) {
                    ResultReceiver();
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    this.PlaybackStateCompat.cancel();
                    this.PlaybackStateCompat = null;
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (z && this.IconCompatParcelizer.isEmpty() && this.ComponentActivity.MediaDescriptionCompat != null) {
            this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Dropping idle transaction %s because it has no child spans", this.ParcelableVolumeInfo);
        } else {
            accessensureviewmodelstore.ResultReceiver.putAll(this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer);
            this.MediaSessionCompatToken.IconCompatParcelizer(accessensureviewmodelstore, ParcelableVolumeInfo(), executelambda4Var, contentCardsActivityWrite);
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final createBannerWebViewClientListenerandroid_sdk_ui_release write() {
        return this.MediaSessionCompatResultReceiverWrapper.MediaDescriptionCompat;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(String str) {
        IBannerWebViewClientListener iBannerWebViewClientListener = this.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener.write) {
            this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            iBannerWebViewClientListener.read.IconCompatParcelizer = str;
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(String str, Number number) {
        this.MediaSessionCompatResultReceiverWrapper.write(str, number);
    }

    public formatQueryBundleForLoglambda0(defaultCardHandling defaultcardhandling, dismissSubscriberlambda0 dismisssubscriberlambda0, handleCardClicklambda4 handlecardclicklambda4, openUriWithActionView openuriwithactionview) {
        this.PlaybackStateCompat = null;
        io.sentry.util.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
        this.PlaybackStateCompatCustomAction = remoteActionCompatParcelizer;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new io.sentry.util.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.MediaBrowserCompatMediaItem = atomicBoolean;
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = new io.sentry.protocol.IconCompatParcelizer();
        this.write = iconCompatParcelizer;
        IBannerWebViewClientListener iBannerWebViewClientListener = new IBannerWebViewClientListener(defaultcardhandling, this, dismisssubscriberlambda0, handlecardclicklambda4);
        this.MediaSessionCompatResultReceiverWrapper = iBannerWebViewClientListener;
        this.ParcelableVolumeInfo = defaultcardhandling.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.RatingCompat = defaultcardhandling.serializer;
        this.MediaSessionCompatToken = dismisssubscriberlambda0;
        Boolean bool = Boolean.TRUE;
        openuriwithactionview = bool.equals(ComponentActivity()) ? openuriwithactionview : null;
        this.RemoteActionCompatParcelizer = openuriwithactionview;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = defaultcardhandling.ResultReceiver;
        this.ComponentActivity = handlecardclicklambda4;
        IconCompatParcelizer(iBannerWebViewClientListener);
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (!r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys.equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer) && bool.equals(ComponentActivity())) {
            iconCompatParcelizer.IconCompatParcelizer(new StepDataCompanion(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgR8lambda54BeH8ZsBru0CXI2CCSP2syNys), "profile");
        }
        if (openuriwithactionview != null) {
            openuriwithactionview.serializer(this);
        }
        if (handlecardclicklambda4.MediaDescriptionCompat == null && handlecardclicklambda4.RatingCompat == null) {
            return;
        }
        boolean z = true;
        this.PlaybackStateCompat = new java.util.Timer(true);
        Long l = handlecardclicklambda4.RatingCompat;
        if (l != null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = remoteActionCompatParcelizer.serializer();
            try {
                if (this.PlaybackStateCompat != null) {
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    atomicBoolean.set(true);
                    this.serializer = new r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo(1, this);
                    try {
                        this.PlaybackStateCompat.schedule(this.serializer, l.longValue());
                    } catch (Throwable th) {
                        this.MediaSessionCompatToken.RemoteActionCompatParcelizer().getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to schedule finish timer", th);
                        defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                        if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
                            defaultcardhandlinglambda0MediaSessionCompatQueueItem = defaultCardHandlinglambda0.DEADLINE_EXCEEDED;
                        }
                        if (this.ComponentActivity.MediaDescriptionCompat == null) {
                            z = false;
                        }
                        IconCompatParcelizer(defaultcardhandlinglambda0MediaSessionCompatQueueItem, z, null);
                        this.MediaBrowserCompatMediaItem.set(false);
                    }
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(String str, Long l, r8lambdakdT06ZZBT3HezLLCifuU7PvlmY r8lambdakdt06zzbt3hezllcifuu7pvlmy) {
        this.MediaSessionCompatResultReceiverWrapper.write(str, l, r8lambdakdt06zzbt3hezllcifuu7pvlmy);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 read(String str, String str2, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, ContainerStepgetChildStepIteratorinlinediterator2 containerStepgetChildStepIteratorinlinediterator2) {
        return read(str, str2, createbannerwebviewclientlistenerandroid_sdk_ui_release, containerStepgetChildStepIteratorinlinediterator2, new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(0));
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 IconCompatParcelizer(String str, String str2) {
        return read(str, str2, null, ContainerStepgetChildStepIteratorinlinediterator2.SENTRY, new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(0));
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 IconCompatParcelizer(String str) {
        return IconCompatParcelizer(str, null);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void read() {
        write(MediaSessionCompatQueueItem(), (createBannerWebViewClientListenerandroid_sdk_ui_release) null);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        write(defaultcardhandlinglambda0, (createBannerWebViewClientListenerandroid_sdk_ui_release) null);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(defaultCardHandlinglambda0 defaultcardhandlinglambda0, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        serializer(defaultcardhandlinglambda0, createbannerwebviewclientlistenerandroid_sdk_ui_release, true, null);
    }
}
