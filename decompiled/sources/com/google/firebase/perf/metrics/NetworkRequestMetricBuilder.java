package com.google.firebase.perf.metrics;

import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o.createAppropriateViews;
import o.getAndroidViewsHandlerui;
import o.getWindowInfoannotations;
import o.hasChangedDevices;
import o.installLocalRetainedValuesStore;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.setHeightOnViewLayoutParams;
import o.setInAppMessageImageViewAttributes;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkRequestMetricBuilder extends AppStateUpdateHandler implements installLocalRetainedValuesStore {
    public static final getWindowInfoannotations serializer = getWindowInfoannotations.write();
    public final List IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public final moveFocusInChildrenViewFocusFix3ESFkO8 MediaDescriptionCompat;
    public final WeakReference RatingCompat;
    public final getAndroidViewsHandlerui RemoteActionCompatParcelizer;
    public final GaugeManager read;
    public boolean write;

    public final void IconCompatParcelizer(long j) {
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        getandroidviewshandlerui.RemoteActionCompatParcelizer();
        ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setTimeToResponseCompletedUs(j);
        if (SessionManager.getInstance().perfSession().read) {
            this.read.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().write);
        }
    }

    @Override // o.installLocalRetainedValuesStore
    public final void RemoteActionCompatParcelizer(PerfSession perfSession) {
        if (perfSession == null) {
            serializer.read("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        if (!((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).hasClientStartTimeUs() || ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).hasTimeToResponseCompletedUs()) {
            return;
        }
        this.IconCompatParcelizer.add(perfSession);
    }

    public final void read(long j) {
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        getandroidviewshandlerui.RemoteActionCompatParcelizer();
        ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setResponsePayloadBytes(j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    public final void serializer(String str) {
        NetworkRequestMetric.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (str != null) {
            NetworkRequestMetric.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = NetworkRequestMetric.RemoteActionCompatParcelizer.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.OPTIONS;
                    break;
                case "GET":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.GET;
                    break;
                case "PUT":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.PUT;
                    break;
                case "HEAD":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.HEAD;
                    break;
                case "POST":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.POST;
                    break;
                case "PATCH":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.PATCH;
                    break;
                case "TRACE":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.TRACE;
                    break;
                case "CONNECT":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.CONNECT;
                    break;
                case "DELETE":
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.DELETE;
                    break;
                default:
                    remoteActionCompatParcelizer = NetworkRequestMetric.RemoteActionCompatParcelizer.HTTP_METHOD_UNKNOWN;
                    break;
            }
            getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setHttpMethod(remoteActionCompatParcelizer);
        }
    }

    public final void write(int i) {
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        getandroidviewshandlerui.RemoteActionCompatParcelizer();
        ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setHttpResponseCode(i);
    }

    public final void write(long j) {
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        getandroidviewshandlerui.RemoteActionCompatParcelizer();
        ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setRequestPayloadBytes(j);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        setInAppMessageImageViewAttributes setinappmessageimageviewattributesRemoteActionCompatParcelizer;
        int iLastIndexOf;
        if (str != null) {
            setInAppMessageImageViewAttributes setinappmessageimageviewattributesRemoteActionCompatParcelizer2 = null;
            try {
                createAppropriateViews createappropriateviews = new createAppropriateViews();
                createappropriateviews.read(null, str);
                setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviews.RemoteActionCompatParcelizer();
            } catch (IllegalArgumentException unused) {
                setinappmessageimageviewattributesRemoteActionCompatParcelizer = null;
            }
            if (setinappmessageimageviewattributesRemoteActionCompatParcelizer != null) {
                createAppropriateViews createappropriateviewsMediaDescriptionCompat = setinappmessageimageviewattributesRemoteActionCompatParcelizer.MediaDescriptionCompat();
                createappropriateviewsMediaDescriptionCompat.MediaBrowserCompatMediaItem = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
                createappropriateviewsMediaDescriptionCompat.write = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
                createappropriateviewsMediaDescriptionCompat.read = null;
                createappropriateviewsMediaDescriptionCompat.IconCompatParcelizer = null;
                str = createappropriateviewsMediaDescriptionCompat.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        createAppropriateViews createappropriateviews2 = new createAppropriateViews();
                        createappropriateviews2.read(null, str);
                        setinappmessageimageviewattributesRemoteActionCompatParcelizer2 = createappropriateviews2.RemoteActionCompatParcelizer();
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (setinappmessageimageviewattributesRemoteActionCompatParcelizer2 != null && setinappmessageimageviewattributesRemoteActionCompatParcelizer2.read().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                        str = str.substring(0, iLastIndexOf);
                    } else {
                        str = str.substring(0, 2000);
                    }
                }
            }
            getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setUrl(str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkRequestMetricBuilder(moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8) {
        AppStateMonitor appStateMonitor = AppStateMonitor.read();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(appStateMonitor);
        this.RemoteActionCompatParcelizer = NetworkRequestMetric.newBuilder();
        this.RatingCompat = new WeakReference(this);
        this.MediaDescriptionCompat = movefocusinchildrenviewfocusfix3esfko8;
        this.read = gaugeManager;
        this.IconCompatParcelizer = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public final void IconCompatParcelizer(String str) {
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        if (str == null) {
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).clearResponseContentType();
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setResponseContentType(str);
            return;
        }
        serializer.read("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void RemoteActionCompatParcelizer() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.RatingCompat);
        unregisterForAppState();
        synchronized (this.IconCompatParcelizer) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.IconCompatParcelizer) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrSerializer = PerfSession.serializer(listUnmodifiableList);
        if (perfSessionArrSerializer != null) {
            getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
            List listAsList = Arrays.asList(perfSessionArrSerializer);
            getandroidviewshandlerui.RemoteActionCompatParcelizer();
            ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).addAllPerfSessions(listAsList);
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.RemoteActionCompatParcelizer.serializer();
        String str = this.MediaBrowserCompatMediaItem;
        if (str == null) {
            Pattern pattern = hasChangedDevices.RemoteActionCompatParcelizer;
        } else if (hasChangedDevices.RemoteActionCompatParcelizer.matcher(str).matches()) {
            serializer.read();
            return;
        }
        if (this.write) {
            return;
        }
        moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = this.MediaDescriptionCompat;
        movefocusinchildrenviewfocusfix3esfko8.MediaBrowserCompatMediaItem.execute(new WorkerKt$$ExternalSyntheticLambda2(movefocusinchildrenviewfocusfix3esfko8, networkRequestMetric, getAppState(), 29));
        this.write = true;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.RatingCompat);
        getAndroidViewsHandlerui getandroidviewshandlerui = this.RemoteActionCompatParcelizer;
        getandroidviewshandlerui.RemoteActionCompatParcelizer();
        ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setClientStartTimeUs(j);
        RemoteActionCompatParcelizer(perfSession);
        if (perfSession.read) {
            this.read.collectGaugeMetricOnce(perfSession.write);
        }
    }
}
