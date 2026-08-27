package com.sentiance.sdk.tile;

import androidx.work.impl.WorkerWrapper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.mapbox.search.SearchEngineImpl$search$3;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.mapbox.search.utils.LoggingCompletionCallback;
import com.qualtrics.digital.IQualtricsCallback;
import com.qualtrics.digital.Qualtrics;
import com.sentiance.sdk.OnInitCallback;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.diagnostics.GooglePlayServicesObserver;
import com.sentiance.sdk.events.EventUploadResult;
import com.sentiance.sdk.eventtimeline.api.EventTimelineUpdateListener;
import com.sentiance.sdk.ondevice.api.event.Event;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.serializer;
import io.sentry.android.ndk.read;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.AddToCustomAttributeArrayStep;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.StepDataExternalSyntheticLambda0;
import o.StepDataargs_delegatelambda0inlinediterator2;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetRepeatAfterp;
import o.doesKeyExistlambda0;
import o.forJsonPutlambda0;
import o.getEnabledannotations;
import o.getHoldoutVariationName;
import o.parseNonBlankStringlambda0;
import o.parsePayloadFieldsFromBundleparsePushStoryData;
import o.r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE;
import o.r8lambdalmSvIZk2OaypKCEb55V0vnTE72k;
import o.setInitialDataHoldouts;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ j$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, String str) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.IconCompatParcelizer;
        switch (i) {
            case 0:
                r8lambdalmSvIZk2OaypKCEb55V0vnTE72k r8lambdalmsvizk2oaypkceb55v0vnte72k = (r8lambdalmSvIZk2OaypKCEb55V0vnTE72k) obj3;
                r8lambdalmsvizk2oaypkceb55v0vnte72k.RatingCompat.IconCompatParcelizer((String) obj2, (String) obj, r8lambdalmsvizk2oaypkceb55v0vnte72k);
                return;
            case 1:
                AsyncOperationTaskImpl asyncOperationTaskImpl = (AsyncOperationTaskImpl) obj3;
                Exception exc = (Exception) obj;
                exc.getClass();
                asyncOperationTaskImpl.runIfNotCancelled(new SearchEngineImpl$search$3(asyncOperationTaskImpl, (LoggingCompletionCallback) obj2, exc, 3));
                return;
            case 2:
                AsyncOperationTaskImpl asyncOperationTaskImpl2 = (AsyncOperationTaskImpl) obj3;
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                asyncOperationTaskImpl2.runIfNotCancelled(new SearchEngineImpl$search$3(asyncOperationTaskImpl2, (CompoundCompletionCallback) obj2, exc2, 4));
                return;
            case 3:
                ((Qualtrics) obj3).lambda$evaluateIntercept$5((IQualtricsCallback) obj, (String) obj2);
                return;
            case 4:
                ((Sentiance) obj3).lambda$processInitFailure$37((String) obj2, (OnInitCallback.InitIssue) obj);
                return;
            case 5:
                IOException iOException = (IOException) obj;
                iOException.getClass();
                ((r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE) obj3).IconCompatParcelizer((r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38) obj2, iOException);
                return;
            case 6:
                LocationRequest locationRequest = (LocationRequest) obj2;
                locationRequest.getClass();
                ((GooglePlayServicesObserver) obj3).onRequestLocationUpdates(locationRequest, (Task) obj);
                return;
            case 7:
                forJsonPutlambda0.read((forJsonPutlambda0) obj3, (getEnabledannotations) obj2, (EventUploadResult.ResultType) obj);
                return;
            case 8:
                EventTimelineUpdateListener eventTimelineUpdateListener = (EventTimelineUpdateListener) obj2;
                EventTimelineUpdateListener eventTimelineUpdateListener2 = (EventTimelineUpdateListener) obj;
                int i2 = doesKeyExistlambda0.IconCompatParcelizer;
                for (Event event : (ArrayList) obj3) {
                    if (eventTimelineUpdateListener != null) {
                        eventTimelineUpdateListener.onEventTimelineUpdated(event);
                    }
                    if (!event.isProvisional() && eventTimelineUpdateListener2 != null) {
                        eventTimelineUpdateListener2.onEventTimelineUpdated(event);
                    }
                }
                return;
            case 9:
                parsePayloadFieldsFromBundleparsePushStoryData.serializer((parsePayloadFieldsFromBundleparsePushStoryData) obj3, (List) obj2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj);
                return;
            case 10:
                parseNonBlankStringlambda0.serializer((parseNonBlankStringlambda0) obj3, (Exception) obj, (String) obj2);
                return;
            case 11:
                WorkerWrapper.Builder builder = (WorkerWrapper.Builder) obj3;
                String str = (String) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) builder.MediaSessionCompatQueueItem).getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 12:
                serializer serializerVar = (serializer) obj3;
                SentryOptions sentryOptions = (SentryOptions) obj2;
                AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = (AddToCustomAttributeArrayStep) obj;
                ArrayList<StepDataExternalSyntheticLambda0> arrayList = serializerVar.MediaSessionCompatToken;
                if (serializerVar.read.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = serializerVar.MediaSessionCompatResultReceiverWrapper.serializer();
                try {
                    for (StepDataExternalSyntheticLambda0 stepDataExternalSyntheticLambda0 : arrayList) {
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = stepDataExternalSyntheticLambda0.read;
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = stepDataExternalSyntheticLambda0.serializer;
                        File file = stepDataExternalSyntheticLambda0.MediaMetadataCompat;
                        ConcurrentHashMap concurrentHashMap = stepDataExternalSyntheticLambda0.write;
                        double d = stepDataExternalSyntheticLambda0.IconCompatParcelizer;
                        arrayList2.add(new StepDataargs_delegatelambda0inlinediterator2(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, file, concurrentHashMap, Double.valueOf(d), stepDataExternalSyntheticLambda0.RemoteActionCompatParcelizer, sentryOptions));
                    }
                    arrayList.clear();
                    uriActionExternalSyntheticLambda4Serializer.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        addToCustomAttributeArrayStep.serializer((StepDataargs_delegatelambda0inlinediterator2) it.next());
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 13:
                ((read) obj3).write.getClass();
                NativeScope.nativeSetTag((String) obj2, (String) obj);
                return;
            case 14:
                FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1 = (FwFClientExtensionKtgetVariationsevalResults1) obj2;
                getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) obj;
                accessgetRepeatAfterp accessgetrepeatafterp = (accessgetRepeatAfterp) ((setInitialDataHoldouts) obj3).write;
                if (accessgetrepeatafterp.IconCompatParcelizer.read()) {
                    fwFClientExtensionKtgetVariationsevalResults1.onFailure(accessgetrepeatafterp, new IOException("Canceled"));
                    return;
                } else {
                    fwFClientExtensionKtgetVariationsevalResults1.onResponse(accessgetrepeatafterp, getholdoutvariationname);
                    return;
                }
            default:
                ((FwFClientExtensionKtgetVariationsevalResults1) obj2).onFailure((accessgetRepeatAfterp) ((setInitialDataHoldouts) obj3).write, (Throwable) obj);
                return;
        }
    }

    public /* synthetic */ j$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
    }
}
