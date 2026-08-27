package o;

import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class IBannerWebViewClientListener implements r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 {
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI MediaBrowserCompatMediaItem;
    public final createBannerWebViewClientListenerandroid_sdk_ui_release MediaDescriptionCompat;
    public Throwable MediaMetadataCompat;
    public r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E MediaSessionCompatQueueItem;
    public createBannerWebViewClientListenerandroid_sdk_ui_release MediaSessionCompatResultReceiverWrapper;
    public final formatQueryBundleForLoglambda0 PlaybackStateCompatCustomAction;
    public final AddToCustomAttributeArrayStep RatingCompat;
    public final r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 read;
    public boolean write = false;
    public final AtomicBoolean serializer = new AtomicBoolean(false);
    public final ConcurrentHashMap IconCompatParcelizer = new ConcurrentHashMap();
    public final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final boolean MediaDescriptionCompat() {
        return this.write;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final boolean RatingCompat() {
        return false;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void RemoteActionCompatParcelizer(Throwable th) {
        this.MediaMetadataCompat = th;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final createBannerWebViewClientListenerandroid_sdk_ui_release serializer() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final createBannerWebViewClientListenerandroid_sdk_ui_release write() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final String IconCompatParcelizer() {
        return this.read.IconCompatParcelizer;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0 MediaMetadataCompat() {
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = this.read;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat;
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatQueueItem;
        return new r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdayq9qbmke5in5qopvpj_kuggks_k, _get_messagewebview_lambda0 == null ? null : (Boolean) _get_messagewebview_lambda0.write);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final defaultCardHandlinglambda0 MediaSessionCompatQueueItem() {
        return this.read.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final mergeJsonObjectslambda00 RemoteActionCompatParcelizer(List list) {
        return this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(list);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void read(defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        this.read.MediaSessionCompatResultReceiverWrapper = defaultcardhandlinglambda0;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(String str) {
        this.read.IconCompatParcelizer = str;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void read(Object obj, String str) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    public IBannerWebViewClientListener(formatQueryBundleForLoglambda0 formatquerybundleforloglambda0, dismissSubscriberlambda0 dismisssubscriberlambda0, r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai, SentryTracer$$ExternalSyntheticLambda1 sentryTracer$$ExternalSyntheticLambda1) {
        new ConcurrentHashMap();
        new io.sentry.util.RemoteActionCompatParcelizer();
        this.read = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0;
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RatingCompat = (String) r8lambdalmkbrrgswwtv97obrsj7trj7ai.read;
        this.PlaybackStateCompatCustomAction = formatquerybundleforloglambda0;
        setNativeShader.read(dismisssubscriberlambda0, "Scopes are required");
        this.RatingCompat = dismisssubscriberlambda0;
        this.MediaBrowserCompatMediaItem = r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        this.MediaSessionCompatQueueItem = sentryTracer$$ExternalSyntheticLambda1;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release = (createBannerWebViewClientListenerandroid_sdk_ui_release) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write;
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release != null) {
            this.MediaDescriptionCompat = createbannerwebviewclientlistenerandroid_sdk_ui_release;
        } else {
            this.MediaDescriptionCompat = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 IconCompatParcelizer(String str, String str2) {
        if (this.write) {
            return isArgStringlambda0.read;
        }
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = this.read.ParcelableVolumeInfo;
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = this.PlaybackStateCompatCustomAction;
        formatquerybundleforloglambda0.getClass();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(0);
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper.read;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp1 = new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat, new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(), r8lambdayq9qbmke5in5qopvpj_kuggks_k, str, null, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatQueueItem, null, "manual");
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp1.IconCompatParcelizer = str2;
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp1.serializer = ContainerStepgetChildStepIteratorinlinediterator2.SENTRY;
        return formatquerybundleforloglambda0.RemoteActionCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp1, r8lambdalmkbrrgswwtv97obrsj7trj7ai);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void RemoteActionCompatParcelizer(String str, String str2) {
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = this.read;
        if (str == null) {
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.getClass();
            return;
        }
        ConcurrentHashMap concurrentHashMap = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompatCustomAction;
        if (str2 == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, str2);
        }
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(String str, Long l, r8lambdakdT06ZZBT3HezLLCifuU7PvlmY r8lambdakdt06zzbt3hezllcifuu7pvlmy) {
        if (this.write) {
            this.RatingCompat.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.RemoteActionCompatParcelizer.put(str, new io.sentry.protocol.PlaybackStateCompat(r8lambdakdt06zzbt3hezllcifuu7pvlmy.apiName(), l));
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = this.PlaybackStateCompatCustomAction;
        IBannerWebViewClientListener iBannerWebViewClientListener = formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener == this || iBannerWebViewClientListener.RemoteActionCompatParcelizer.containsKey(str)) {
            return;
        }
        formatquerybundleforloglambda0.write(str, l, r8lambdakdt06zzbt3hezllcifuu7pvlmy);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(defaultCardHandlinglambda0 defaultcardhandlinglambda0, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        List<IBannerWebViewClientListener> list;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release2;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release3;
        if (this.write || !this.serializer.compareAndSet(false, true)) {
            return;
        }
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = this.read;
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatResultReceiverWrapper = defaultcardhandlinglambda0;
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo;
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.RatingCompat;
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release == null) {
            createbannerwebviewclientlistenerandroid_sdk_ui_release = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        }
        this.MediaSessionCompatResultReceiverWrapper = createbannerwebviewclientlistenerandroid_sdk_ui_release;
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = this.MediaBrowserCompatMediaItem;
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.getClass();
        boolean z = r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer;
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = this.PlaybackStateCompatCustomAction;
        if (z) {
            IBannerWebViewClientListener iBannerWebViewClientListener = formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper;
            CopyOnWriteArrayList<IBannerWebViewClientListener> copyOnWriteArrayList = formatquerybundleforloglambda0.IconCompatParcelizer;
            if (!iBannerWebViewClientListener.read.ParcelableVolumeInfo.equals(r8lambdayq9qbmke5in5qopvpj_kuggks_k)) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (IBannerWebViewClientListener iBannerWebViewClientListener2 : copyOnWriteArrayList) {
                    r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2 = iBannerWebViewClientListener2.read.MediaMetadataCompat;
                    if (r8lambdayq9qbmke5in5qopvpj_kuggks_k2 != null && r8lambdayq9qbmke5in5qopvpj_kuggks_k2.equals(r8lambdayq9qbmke5in5qopvpj_kuggks_k)) {
                        arrayList.add(iBannerWebViewClientListener2);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release4 = null;
            createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release5 = null;
            for (IBannerWebViewClientListener iBannerWebViewClientListener3 : list) {
                if (createbannerwebviewclientlistenerandroid_sdk_ui_release4 == null || iBannerWebViewClientListener3.MediaDescriptionCompat.read(createbannerwebviewclientlistenerandroid_sdk_ui_release4) < 0) {
                    createbannerwebviewclientlistenerandroid_sdk_ui_release4 = iBannerWebViewClientListener3.MediaDescriptionCompat;
                }
                if (createbannerwebviewclientlistenerandroid_sdk_ui_release5 == null || ((createbannerwebviewclientlistenerandroid_sdk_ui_release3 = iBannerWebViewClientListener3.MediaSessionCompatResultReceiverWrapper) != null && createbannerwebviewclientlistenerandroid_sdk_ui_release3.read(createbannerwebviewclientlistenerandroid_sdk_ui_release5) > 0)) {
                    createbannerwebviewclientlistenerandroid_sdk_ui_release5 = iBannerWebViewClientListener3.MediaSessionCompatResultReceiverWrapper;
                }
            }
            if (r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer && createbannerwebviewclientlistenerandroid_sdk_ui_release5 != null && (((createbannerwebviewclientlistenerandroid_sdk_ui_release2 = this.MediaSessionCompatResultReceiverWrapper) == null || createbannerwebviewclientlistenerandroid_sdk_ui_release2.read(createbannerwebviewclientlistenerandroid_sdk_ui_release5) > 0) && this.MediaSessionCompatResultReceiverWrapper != null)) {
                this.MediaSessionCompatResultReceiverWrapper = createbannerwebviewclientlistenerandroid_sdk_ui_release5;
            }
        }
        Throwable th = this.MediaMetadataCompat;
        if (th != null) {
            addToCustomAttributeArrayStep.read(th, this, formatquerybundleforloglambda0.ParcelableVolumeInfo);
        }
        r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E r8lambdagmoklyzmbec7ze6brdiqowxqh1e = this.MediaSessionCompatQueueItem;
        if (r8lambdagmoklyzmbec7ze6brdiqowxqh1e != null) {
            r8lambdagmoklyzmbec7ze6brdiqowxqh1e.serializer(this);
        }
        this.write = true;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(String str, Number number) {
        if (this.write) {
            this.RatingCompat.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.RemoteActionCompatParcelizer.put(str, new io.sentry.protocol.PlaybackStateCompat(null, number));
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = this.PlaybackStateCompatCustomAction;
        IBannerWebViewClientListener iBannerWebViewClientListener = formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper;
        if (iBannerWebViewClientListener == this || iBannerWebViewClientListener.RemoteActionCompatParcelizer.containsKey(str)) {
            return;
        }
        formatquerybundleforloglambda0.write(str, number);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 read(String str, String str2, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, ContainerStepgetChildStepIteratorinlinediterator2 containerStepgetChildStepIteratorinlinediterator2, r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai) {
        if (this.write) {
            return isArgStringlambda0.read;
        }
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = this.read.ParcelableVolumeInfo;
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = this.PlaybackStateCompatCustomAction;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper.read;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp1 = new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat, new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(), r8lambdayq9qbmke5in5qopvpj_kuggks_k, str, null, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatQueueItem, null, "manual");
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp1.IconCompatParcelizer = str2;
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp1.serializer = containerStepgetChildStepIteratorinlinediterator2;
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.write = createbannerwebviewclientlistenerandroid_sdk_ui_release;
        return formatquerybundleforloglambda0.RemoteActionCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp1, r8lambdalmkbrrgswwtv97obrsj7trj7ai);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 IconCompatParcelizer(String str) {
        return IconCompatParcelizer(str, null);
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 read(String str, String str2, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, ContainerStepgetChildStepIteratorinlinediterator2 containerStepgetChildStepIteratorinlinediterator2) {
        return read("activity.load", str2, createbannerwebviewclientlistenerandroid_sdk_ui_release, containerStepgetChildStepIteratorinlinediterator2, new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(0));
    }

    public IBannerWebViewClientListener(defaultCardHandling defaultcardhandling, formatQueryBundleForLoglambda0 formatquerybundleforloglambda0, dismissSubscriberlambda0 dismisssubscriberlambda0, handleCardClicklambda4 handlecardclicklambda4) {
        new ConcurrentHashMap();
        new io.sentry.util.RemoteActionCompatParcelizer();
        this.read = defaultcardhandling;
        defaultcardhandling.RatingCompat = (String) handlecardclicklambda4.read;
        this.PlaybackStateCompatCustomAction = formatquerybundleforloglambda0;
        this.RatingCompat = dismisssubscriberlambda0;
        this.MediaSessionCompatQueueItem = null;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release = (createBannerWebViewClientListenerandroid_sdk_ui_release) handlecardclicklambda4.write;
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release != null) {
            this.MediaDescriptionCompat = createbannerwebviewclientlistenerandroid_sdk_ui_release;
        } else {
            this.MediaDescriptionCompat = dismisssubscriberlambda0.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        }
        this.MediaBrowserCompatMediaItem = handlecardclicklambda4;
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void write(defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        write(defaultcardhandlinglambda0, this.RatingCompat.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer());
    }

    @Override // o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0
    public final void read() {
        write(this.read.MediaSessionCompatResultReceiverWrapper);
    }
}
