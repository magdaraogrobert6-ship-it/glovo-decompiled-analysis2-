package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.ProcessLifecycleOwner;
import coil3.ImageLoader$Builder;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.MovePreviousSession;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.SemanticsPropertiesFillableData1;
import o.accessgetButton15cp;
import o.accessgetRelayoutTimep;
import o.accessgetResendMotionEventRunnablep;
import o.accessgetSystemPropertiesChangedRunnablecp;
import o.accessgetSystemPropertiesClasscp;
import o.accesssetAddChangeCallbackMethodcp;
import o.accesssetInstancecp;
import o.captureRulersIfNeededui;
import o.getColorIntegerOrNull;
import o.getHasMeasureResult;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getMeasureResultui;
import o.getRootannotations;
import o.isOutMostLookaheadRoot;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.notifyRulerValueChange;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(getMeasureResultui getmeasureresultui) {
        getmeasureresultui.read(accessgetSystemPropertiesChangedRunnablecp.class);
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder((FirebaseApp) getmeasureresultui.read(FirebaseApp.class), (accesssetInstancecp) getmeasureresultui.read(accesssetInstancecp.class), getmeasureresultui.write(RemoteConfigComponent.class), getmeasureresultui.write(accessgetButton15cp.class));
        return (FirebasePerformance) getColorIntegerOrNull.IconCompatParcelizer(new accessgetRelayoutTimep(new getRootannotations(imageLoader$Builder, 0), new getRootannotations(imageLoader$Builder, 2), new getRootannotations(imageLoader$Builder, 1), new getRootannotations(imageLoader$Builder, 3), new SemanticsPropertiesFillableData1(5, imageLoader$Builder), new SemanticsPropertiesFillableData1(4, imageLoader$Builder), new SemanticsPropertiesFillableData1(6, imageLoader$Builder), 0)).write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static accessgetSystemPropertiesChangedRunnablecp lambda$getComponents$0(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, getMeasureResultui getmeasureresultui) {
        AppStartTrace appStartTrace;
        FirebaseApp firebaseApp = (FirebaseApp) getmeasureresultui.read(FirebaseApp.class);
        isOutMostLookaheadRoot isoutmostlookaheadroot = (isOutMostLookaheadRoot) getmeasureresultui.write(isOutMostLookaheadRoot.class).write();
        Executor executor = (Executor) getmeasureresultui.write(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        accessgetSystemPropertiesChangedRunnablecp accessgetsystempropertieschangedrunnablecp = new accessgetSystemPropertiesChangedRunnablecp();
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
        accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.getClass();
        accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer.write = RangesKt.serializer(context);
        accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer.read.IconCompatParcelizer(context);
        AppStateMonitor appStateMonitor = AppStateMonitor.read();
        synchronized (appStateMonitor) {
            if (!appStateMonitor.MediaSessionCompatResultReceiverWrapper) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(appStateMonitor);
                    appStateMonitor.MediaSessionCompatResultReceiverWrapper = true;
                }
            }
        }
        accessgetSystemPropertiesClasscp accessgetsystempropertiesclasscp = new accessgetSystemPropertiesClasscp();
        synchronized (appStateMonitor.MediaDescriptionCompat) {
            appStateMonitor.MediaDescriptionCompat.add(accessgetsystempropertiesclasscp);
        }
        if (isoutmostlookaheadroot != null) {
            if (AppStartTrace.RemoteActionCompatParcelizer != null) {
                appStartTrace = AppStartTrace.RemoteActionCompatParcelizer;
            } else {
                moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8 = moveFocusInChildrenViewFocusFix3ESFkO8.write;
                getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = new getIntentArrayWithConfiguredBackStacklambda4(29);
                if (AppStartTrace.RemoteActionCompatParcelizer == null) {
                    synchronized (AppStartTrace.class) {
                        if (AppStartTrace.RemoteActionCompatParcelizer == null) {
                            AppStartTrace.RemoteActionCompatParcelizer = new AppStartTrace(movefocusinchildrenviewfocusfix3esfko8, getintentarraywithconfiguredbackstacklambda4, accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer(), new ThreadPoolExecutor(0, 1, AppStartTrace.IconCompatParcelizer + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                        }
                    }
                }
                appStartTrace = AppStartTrace.RemoteActionCompatParcelizer;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.PlaybackStateCompatCustomAction) {
                    ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.IconCompatParcelizer(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = appStartTrace.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 || AppStartTrace.isAnyAppProcessInForeground((Application) applicationContext2);
                        appStartTrace.PlaybackStateCompatCustomAction = true;
                        appStartTrace.MediaSessionCompatQueueItem = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new MovePreviousSession(10, appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return accessgetsystempropertieschangedrunnablecp;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<getHasMeasureResult> getComponents() {
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(notifyRulerValueChange.class, Executor.class);
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(FirebasePerformance.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(1, 1, RemoteConfigComponent.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(accesssetInstancecp.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(1, 1, accessgetButton15cp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(accessgetSystemPropertiesChangedRunnablecp.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(19);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite2 = getHasMeasureResult.write(accessgetSystemPropertiesChangedRunnablecp.class);
        capturerulersifneededuiWrite2.IconCompatParcelizer = EARLY_LIBRARY_NAME;
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.IconCompatParcelizer(isOutMostLookaheadRoot.class));
        capturerulersifneededuiWrite2.write(new provideRelativeRulerValue(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 1, 0));
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer(2);
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer = new accessgetResendMotionEventRunnablep(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 0);
        return Arrays.asList(gethasmeasureresultIconCompatParcelizer, capturerulersifneededuiWrite2.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "22.0.4"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
