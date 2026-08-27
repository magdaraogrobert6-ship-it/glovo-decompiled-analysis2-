package com.roadrunner.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.encoders.json.JsonValueObjectEncoderContext;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import com.mapbox.common.module.MapboxHttpClient$$ExternalSyntheticLambda2;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.SpanStyleSaverlambda0;
import o.Utils_androidKtExternalSyntheticLambda2;
import o.access500;
import o.accessclearPlaceOrder;
import o.checkChildrenPlaceOrderForUpdates;
import o.clearPlaceOrder;
import o.createFromParcel;
import o.detachAndRemoveNode;
import o.div7Ah8Wj8;
import o.getLayoutPending;
import o.logTree;
import o.onCheckIsTextEditor;
import o.onItemDismiss;
import o.performingMeasureK40F9xA;
import o.r8lambda3H4Tap9xiqWyze7ofwvkGYD5exE;
import o.r8lambdaLZjsjPSXWRendXZH98LKrH6PSs;
import o.setLayoutPending;
import o.setMaxHeight;
import o.setRotationY;
import o.trackLookaheadMeasurementByParent;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CreateHomeScope implements performingMeasureK40F9xA, accessclearPlaceOrder, FlowableOnSubscribe, setMaxHeight {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public Object read;

    public CreateHomeScope(TasksRepository tasksRepository) {
        tasksRepository.getClass();
        this.read = tasksRepository;
    }

    public void serializer(access500 access500Var, Thread thread, Throwable th) {
        Task taskContinueWithTask;
        checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = (checkChildrenPlaceOrderForUpdates) this.read;
        synchronized (checkchildrenplaceorderforupdates) {
            Objects.toString(th);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            r8lambda3H4Tap9xiqWyze7ofwvkGYD5exE.IconCompatParcelizer();
            long jCurrentTimeMillis = System.currentTimeMillis();
            trackLookaheadMeasurementByParent tracklookaheadmeasurementbyparent = checkchildrenplaceorderforupdates.MediaDescriptionCompat.read;
            clearPlaceOrder clearplaceorder = new clearPlaceOrder(checkchildrenplaceorderforupdates, jCurrentTimeMillis, th, thread, access500Var);
            synchronized (tracklookaheadmeasurementbyparent.serializer) {
                taskContinueWithTask = tracklookaheadmeasurementbyparent.RemoteActionCompatParcelizer.continueWithTask(tracklookaheadmeasurementbyparent.read, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(9, clearplaceorder));
                tracklookaheadmeasurementbyparent.RemoteActionCompatParcelizer = taskContinueWithTask;
            }
            try {
                setLayoutPending.RemoteActionCompatParcelizer(taskContinueWithTask);
            } catch (TimeoutException unused) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public TraceMetric read() {
        List listUnmodifiableList;
        onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
        oncheckistexteditorNewBuilder.read(((Trace) this.read).MediaBrowserCompatMediaItem);
        oncheckistexteditorNewBuilder.read(((Trace) this.read).MediaSessionCompatResultReceiverWrapper.read);
        Trace trace = (Trace) this.read;
        oncheckistexteditorNewBuilder.write(trace.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(trace.read));
        for (Counter counter : ((Trace) this.read).write.values()) {
            oncheckistexteditorNewBuilder.write(counter.IconCompatParcelizer.get(), counter.RemoteActionCompatParcelizer);
        }
        ArrayList arrayList = ((Trace) this.read).PlaybackStateCompatCustomAction;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer(new CreateHomeScope((Trace) it.next()).read());
            }
        }
        Map<String, String> attributes = ((Trace) this.read).getAttributes();
        oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer();
        ((TraceMetric) oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer).getMutableCustomAttributesMap().putAll(attributes);
        Trace trace2 = (Trace) this.read;
        synchronized (trace2.MediaDescriptionCompat) {
            ArrayList arrayList2 = new ArrayList();
            for (PerfSession perfSession : trace2.MediaDescriptionCompat) {
                if (perfSession != null) {
                    arrayList2.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrSerializer = PerfSession.serializer(listUnmodifiableList);
        if (perfSessionArrSerializer != null) {
            List listAsList = Arrays.asList(perfSessionArrSerializer);
            oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer();
            ((TraceMetric) oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer).addAllPerfSessions(listAsList);
        }
        return (TraceMetric) oncheckistexteditorNewBuilder.serializer();
    }

    @Override // o.accessclearPlaceOrder
    public void read(getLayoutPending getlayoutpending) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 13;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.read = getlayoutpending;
            i = 4;
        } else {
            this.read = getlayoutpending;
            i = 3;
        }
        Log.isLoggable("FirebaseCrashlytics", i);
    }

    public /* synthetic */ CreateHomeScope(Object obj, Object obj2) {
        this.read = obj2;
    }

    public /* synthetic */ CreateHomeScope(Object obj) {
        this.read = obj;
    }

    public CreateHomeScope(zzz zzzVar) {
        zzzVar.getClass();
        this.read = zzzVar;
    }

    @Override // io.reactivex.FlowableOnSubscribe
    public void subscribe(FlowableEmitter flowableEmitter) {
        int i = 2 % 2;
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        AnalyticsEventsManager analyticsEventsManager = (AnalyticsEventsManager) this.read;
        logTree logtree = analyticsEventsManager.read;
        zzz zzzVar = new zzz();
        zzzVar.serializer = flowableEmitter;
        analyticsEventsManager.write = logtree.IconCompatParcelizer("fiam", zzzVar);
        int i2 = RemoteActionCompatParcelizer + 5;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void serializer(Context context, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        str2.getClass();
        FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(context);
        div7Ah8Wj8 supportFragmentManager = fragmentActivityRemoteActionCompatParcelizer.getSupportFragmentManager();
        supportFragmentManager.getClass();
        r8lambdaLZjsjPSXWRendXZH98LKrH6PSs.write((r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) this.read, fragmentActivityRemoteActionCompatParcelizer, supportFragmentManager, str2, str, str3);
        int i4 = serializer + 51;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public String IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        StringWriter stringWriter = new StringWriter();
        try {
            detachAndRemoveNode detachandremovenode = (detachAndRemoveNode) this.read;
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(stringWriter, detachandremovenode.MediaBrowserCompatMediaItem, detachandremovenode.MediaMetadataCompat, detachandremovenode.RemoteActionCompatParcelizer, detachandremovenode.RatingCompat);
            jsonValueObjectEncoderContext.RemoteActionCompatParcelizer(obj);
            jsonValueObjectEncoderContext.IconCompatParcelizer();
            jsonValueObjectEncoderContext.IconCompatParcelizer.flush();
        } catch (IOException unused) {
        }
        String string = stringWriter.toString();
        int i2 = serializer + 37;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public static String write(Bundle bundle, String str) throws JSONException {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = RemoteActionCompatParcelizer + 45;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 2 / 4;
        }
        for (String str2 : bundle.keySet()) {
            int i4 = RemoteActionCompatParcelizer + 91;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // o.performingMeasureK40F9xA
    public void RemoteActionCompatParcelizer(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        getLayoutPending getlayoutpending = (getLayoutPending) this.read;
        if (getlayoutpending != null) {
            try {
                String str2 = "$A$:" + write(bundle, str);
                CrashlyticsCore crashlyticsCore = getlayoutpending.read;
                crashlyticsCore.RatingCompat.read.serializer(new MapboxHttpClient$$ExternalSyntheticLambda2(crashlyticsCore, System.currentTimeMillis() - crashlyticsCore.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, str2, 1));
                return;
            } catch (JSONException unused) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
        int i3 = RemoteActionCompatParcelizer + 5;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public Object invoke(long j, String str, ContinuationImpl continuationImpl) {
        Utils_androidKtExternalSyntheticLambda2 utils_androidKtExternalSyntheticLambda2;
        Object objM4936getTasks0E7RQCE$implementation;
        int i = 2 % 2;
        if (!(continuationImpl instanceof Utils_androidKtExternalSyntheticLambda2)) {
            utils_androidKtExternalSyntheticLambda2 = new Utils_androidKtExternalSyntheticLambda2(this, continuationImpl);
        } else {
            int i2 = RemoteActionCompatParcelizer + 43;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((Utils_androidKtExternalSyntheticLambda2) continuationImpl).read;
                throw null;
            }
            utils_androidKtExternalSyntheticLambda2 = (Utils_androidKtExternalSyntheticLambda2) continuationImpl;
            int i4 = utils_androidKtExternalSyntheticLambda2.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                utils_androidKtExternalSyntheticLambda2.read = i4 - Integer.MIN_VALUE;
            } else {
                utils_androidKtExternalSyntheticLambda2 = new Utils_androidKtExternalSyntheticLambda2(this, continuationImpl);
            }
        }
        Object obj = utils_androidKtExternalSyntheticLambda2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = utils_androidKtExternalSyntheticLambda2.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("GetDeliveryTasksItemsUseCase: invoke called", new Object[0]);
            TasksRepository tasksRepository = (TasksRepository) this.read;
            utils_androidKtExternalSyntheticLambda2.read = 1;
            objM4936getTasks0E7RQCE$implementation = tasksRepository.m4936getTasks0E7RQCE$implementation(j, str, utils_androidKtExternalSyntheticLambda2);
            if (objM4936getTasks0E7RQCE$implementation == coroutineSingletons) {
                int i6 = serializer + 103;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4936getTasks0E7RQCE$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
            int i8 = serializer + 77;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objM4936getTasks0E7RQCE$implementation);
        return objM4936getTasks0E7RQCE$implementation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public Object invoke(String str, long j, String str2, long j2, ContinuationImpl continuationImpl) {
        SpanStyleSaverlambda0 spanStyleSaverlambda0;
        WorkManagerImpl workManagerImpl;
        int i = 2 % 2;
        int i2 = serializer + 25;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof SpanStyleSaverlambda0) {
            spanStyleSaverlambda0 = (SpanStyleSaverlambda0) continuationImpl;
            int i4 = spanStyleSaverlambda0.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                spanStyleSaverlambda0.serializer = i4 - Integer.MIN_VALUE;
            } else {
                spanStyleSaverlambda0 = new SpanStyleSaverlambda0(this, continuationImpl);
            }
        } else {
            spanStyleSaverlambda0 = new SpanStyleSaverlambda0(this, continuationImpl);
        }
        Object obj = spanStyleSaverlambda0.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = spanStyleSaverlambda0.serializer;
        if (i5 != 0) {
            int i6 = RemoteActionCompatParcelizer + 39;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            workManagerImpl = spanStyleSaverlambda0.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            WorkManagerImpl workManagerImpl2 = (WorkManagerImpl) this.read;
            spanStyleSaverlambda0.read = workManagerImpl2;
            spanStyleSaverlambda0.serializer = 1;
            setRotationY setrotationyRemoteActionCompatParcelizer = MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j, j2, str, str2);
            if (setrotationyRemoteActionCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
            workManagerImpl = workManagerImpl2;
            obj = setrotationyRemoteActionCompatParcelizer;
        }
        workManagerImpl.RemoteActionCompatParcelizer((setRotationY) obj);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i8 = serializer + 25;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 76 / 0;
        }
        return createfromparcel;
    }

    public CreateHomeScope() {
    }
}
