package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.ProcessLifecycleOwner;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.AndroidColorSpace_androidKt;
import o.AndroidGraphicsContext_androidKt;
import o.EnumC0151autofill;
import o.accessclearShadowCache;
import o.accesssetAddChangeCallbackMethodcp;
import o.accesssetGetBooleanMethodcp;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getWindowInfoannotations;
import o.isOutMostLookaheadRoot;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.onCheckIsTextEditor;
import o.packZIaKswc;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.sendHoverExitEventlambda0;
import o.sendMotionEvent8iAsVTc;
import o.sendSimulatedEvent;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, accessclearShadowCache {
    public static volatile AppStartTrace RemoteActionCompatParcelizer;
    public static ThreadPoolExecutor read;
    public final Timer MediaBrowserCompatMediaItem;
    public final accesssetAddChangeCallbackMethodcp MediaMetadataCompat;
    public Application MediaSessionCompatQueueItem;
    public final onCheckIsTextEditor RatingCompat;
    public PerfSession r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final Timer r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final moveFocusInChildrenViewFocusFix3ESFkO8 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public static final Timer write = new Timer();
    public static final long IconCompatParcelizer = 60000000;
    public static final long serializer = 50000;
    public boolean PlaybackStateCompatCustomAction = false;
    public boolean MediaSessionCompatToken = false;
    public Timer r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
    public Timer MediaSessionCompatResultReceiverWrapper = null;
    public Timer r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
    public Timer r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    public Timer ParcelableVolumeInfo = null;
    public Timer MediaDescriptionCompat = null;
    public Timer r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
    public Timer r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
    public Timer ComponentActivity = null;
    public boolean PlaybackStateCompat = false;
    public int ResultReceiver = 0;
    public final DrawCounter r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new DrawCounter();
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = false;

    /* JADX INFO: loaded from: classes4.dex */
    public final class DrawCounter implements ViewTreeObserver.OnDrawListener {
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.ResultReceiver++;
        }

        public DrawCounter() {
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this) {
            Timer timer = this.MediaSessionCompatResultReceiverWrapper;
            if (timer != null) {
                if (Build.VERSION.SDK_INT < 34 || timer.read() > serializer) {
                    this.PlaybackStateCompat = true;
                }
                this.MediaSessionCompatResultReceiverWrapper = null;
            }
            if (!this.PlaybackStateCompat && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 || isAnyAppProcessInForeground(this.MediaSessionCompatQueueItem);
                new WeakReference(activity);
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new Timer();
                if (getStartTimerCompat().IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) > IconCompatParcelizer) {
                    this.MediaSessionCompatToken = true;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        View viewFindViewById;
        synchronized (this) {
            if (!this.PlaybackStateCompat && !this.MediaSessionCompatToken) {
                accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp = this.MediaMetadataCompat;
                accesssetaddchangecallbackmethodcp.getClass();
                sendMotionEvent8iAsVTc sendmotionevent8iasvtcSerializer = accesssetaddchangecallbackmethodcp.serializer(accesssetGetBooleanMethodcp.read());
                final int i = 0;
                boolean zBooleanValue = sendmotionevent8iasvtcSerializer.serializer() ? ((Boolean) sendmotionevent8iasvtcSerializer.RemoteActionCompatParcelizer()).booleanValue() : false;
                if (zBooleanValue && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    sendHoverExitEventlambda0.IconCompatParcelizer(viewFindViewById, new Runnable(this) { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0
                        public final /* synthetic */ AppStartTrace IconCompatParcelizer;

                        {
                            this.IconCompatParcelizer = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            AppStartTrace appStartTrace = this.IconCompatParcelizer;
                            if (i2 == 0) {
                                onCheckIsTextEditor oncheckistexteditor = appStartTrace.RatingCompat;
                                if (appStartTrace.ComponentActivity != null) {
                                    return;
                                }
                                appStartTrace.ComponentActivity = new Timer();
                                onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder.read("_experiment_onDrawFoQ");
                                oncheckistexteditorNewBuilder.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.ComponentActivity));
                                oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder.serializer());
                                if (appStartTrace.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                                    onCheckIsTextEditor oncheckistexteditorNewBuilder2 = TraceMetric.newBuilder();
                                    oncheckistexteditorNewBuilder2.read("_experiment_procStart_to_classLoad");
                                    oncheckistexteditorNewBuilder2.read(appStartTrace.getStartTimerCompat().read);
                                    oncheckistexteditorNewBuilder2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.getClassLoadTimeCompat()));
                                    oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder2.serializer());
                                }
                                String str = appStartTrace.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 ? "true" : "false";
                                oncheckistexteditor.RemoteActionCompatParcelizer();
                                ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                oncheckistexteditor.write(appStartTrace.ResultReceiver, "onDrawCount");
                                com.google.firebase.perf.v1.PerfSession perfSessionSerializer = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                                oncheckistexteditor.RemoteActionCompatParcelizer();
                                ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer);
                                appStartTrace.logExperimentTrace(oncheckistexteditor);
                                return;
                            }
                            if (i2 == 1) {
                                onCheckIsTextEditor oncheckistexteditor2 = appStartTrace.RatingCompat;
                                if (appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
                                    return;
                                }
                                appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Timer();
                                oncheckistexteditor2.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditor2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                                appStartTrace.logExperimentTrace(oncheckistexteditor2);
                                return;
                            }
                            if (i2 == 2) {
                                onCheckIsTextEditor oncheckistexteditor3 = appStartTrace.RatingCompat;
                                if (appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                                    return;
                                }
                                appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new Timer();
                                onCheckIsTextEditor oncheckistexteditorNewBuilder3 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder3.read("_experiment_preDrawFoQ");
                                oncheckistexteditorNewBuilder3.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder3.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                                oncheckistexteditor3.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder3.serializer());
                                appStartTrace.logExperimentTrace(oncheckistexteditor3);
                                return;
                            }
                            Timer timer = AppStartTrace.write;
                            onCheckIsTextEditor oncheckistexteditorNewBuilder4 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder4.read(packZIaKswc.APP_START_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder4.read(appStartTrace.getClassLoadTimeCompat().read);
                            oncheckistexteditorNewBuilder4.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                            ArrayList arrayList = new ArrayList(3);
                            onCheckIsTextEditor oncheckistexteditorNewBuilder5 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder5.read(packZIaKswc.ON_CREATE_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder5.read(appStartTrace.getClassLoadTimeCompat().read);
                            oncheckistexteditorNewBuilder5.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
                            arrayList.add((TraceMetric) oncheckistexteditorNewBuilder5.serializer());
                            if (appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
                                onCheckIsTextEditor oncheckistexteditorNewBuilder6 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder6.read(packZIaKswc.ON_START_TRACE_NAME.toString());
                                oncheckistexteditorNewBuilder6.read(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read);
                                oncheckistexteditorNewBuilder6.write(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                                arrayList.add((TraceMetric) oncheckistexteditorNewBuilder6.serializer());
                                onCheckIsTextEditor oncheckistexteditorNewBuilder7 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder7.read(packZIaKswc.ON_RESUME_TRACE_NAME.toString());
                                oncheckistexteditorNewBuilder7.read(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read);
                                oncheckistexteditorNewBuilder7.write(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                                arrayList.add((TraceMetric) oncheckistexteditorNewBuilder7.serializer());
                            }
                            oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addAllSubtraces(arrayList);
                            com.google.firebase.perf.v1.PerfSession perfSessionSerializer2 = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                            oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer2);
                            appStartTrace.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer((TraceMetric) oncheckistexteditorNewBuilder4.serializer(), EnumC0151autofill.FOREGROUND_BACKGROUND);
                        }
                    });
                    final int i2 = 1;
                    final int i3 = 2;
                    sendSimulatedEvent.RemoteActionCompatParcelizer(viewFindViewById, new Runnable(this) { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0
                        public final /* synthetic */ AppStartTrace IconCompatParcelizer;

                        {
                            this.IconCompatParcelizer = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            AppStartTrace appStartTrace = this.IconCompatParcelizer;
                            if (i4 == 0) {
                                onCheckIsTextEditor oncheckistexteditor = appStartTrace.RatingCompat;
                                if (appStartTrace.ComponentActivity != null) {
                                    return;
                                }
                                appStartTrace.ComponentActivity = new Timer();
                                onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder.read("_experiment_onDrawFoQ");
                                oncheckistexteditorNewBuilder.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.ComponentActivity));
                                oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder.serializer());
                                if (appStartTrace.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                                    onCheckIsTextEditor oncheckistexteditorNewBuilder2 = TraceMetric.newBuilder();
                                    oncheckistexteditorNewBuilder2.read("_experiment_procStart_to_classLoad");
                                    oncheckistexteditorNewBuilder2.read(appStartTrace.getStartTimerCompat().read);
                                    oncheckistexteditorNewBuilder2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.getClassLoadTimeCompat()));
                                    oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder2.serializer());
                                }
                                String str = appStartTrace.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 ? "true" : "false";
                                oncheckistexteditor.RemoteActionCompatParcelizer();
                                ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                oncheckistexteditor.write(appStartTrace.ResultReceiver, "onDrawCount");
                                com.google.firebase.perf.v1.PerfSession perfSessionSerializer = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                                oncheckistexteditor.RemoteActionCompatParcelizer();
                                ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer);
                                appStartTrace.logExperimentTrace(oncheckistexteditor);
                                return;
                            }
                            if (i4 == 1) {
                                onCheckIsTextEditor oncheckistexteditor2 = appStartTrace.RatingCompat;
                                if (appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
                                    return;
                                }
                                appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Timer();
                                oncheckistexteditor2.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditor2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                                appStartTrace.logExperimentTrace(oncheckistexteditor2);
                                return;
                            }
                            if (i4 == 2) {
                                onCheckIsTextEditor oncheckistexteditor3 = appStartTrace.RatingCompat;
                                if (appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                                    return;
                                }
                                appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new Timer();
                                onCheckIsTextEditor oncheckistexteditorNewBuilder3 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder3.read("_experiment_preDrawFoQ");
                                oncheckistexteditorNewBuilder3.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder3.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                                oncheckistexteditor3.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder3.serializer());
                                appStartTrace.logExperimentTrace(oncheckistexteditor3);
                                return;
                            }
                            Timer timer = AppStartTrace.write;
                            onCheckIsTextEditor oncheckistexteditorNewBuilder4 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder4.read(packZIaKswc.APP_START_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder4.read(appStartTrace.getClassLoadTimeCompat().read);
                            oncheckistexteditorNewBuilder4.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                            ArrayList arrayList = new ArrayList(3);
                            onCheckIsTextEditor oncheckistexteditorNewBuilder5 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder5.read(packZIaKswc.ON_CREATE_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder5.read(appStartTrace.getClassLoadTimeCompat().read);
                            oncheckistexteditorNewBuilder5.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
                            arrayList.add((TraceMetric) oncheckistexteditorNewBuilder5.serializer());
                            if (appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
                                onCheckIsTextEditor oncheckistexteditorNewBuilder6 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder6.read(packZIaKswc.ON_START_TRACE_NAME.toString());
                                oncheckistexteditorNewBuilder6.read(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read);
                                oncheckistexteditorNewBuilder6.write(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                                arrayList.add((TraceMetric) oncheckistexteditorNewBuilder6.serializer());
                                onCheckIsTextEditor oncheckistexteditorNewBuilder7 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder7.read(packZIaKswc.ON_RESUME_TRACE_NAME.toString());
                                oncheckistexteditorNewBuilder7.read(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read);
                                oncheckistexteditorNewBuilder7.write(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                                arrayList.add((TraceMetric) oncheckistexteditorNewBuilder7.serializer());
                            }
                            oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addAllSubtraces(arrayList);
                            com.google.firebase.perf.v1.PerfSession perfSessionSerializer2 = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                            oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer2);
                            appStartTrace.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer((TraceMetric) oncheckistexteditorNewBuilder4.serializer(), EnumC0151autofill.FOREGROUND_BACKGROUND);
                        }
                    }, new Runnable(this) { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0
                        public final /* synthetic */ AppStartTrace IconCompatParcelizer;

                        {
                            this.IconCompatParcelizer = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            AppStartTrace appStartTrace = this.IconCompatParcelizer;
                            if (i4 == 0) {
                                onCheckIsTextEditor oncheckistexteditor = appStartTrace.RatingCompat;
                                if (appStartTrace.ComponentActivity != null) {
                                    return;
                                }
                                appStartTrace.ComponentActivity = new Timer();
                                onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder.read("_experiment_onDrawFoQ");
                                oncheckistexteditorNewBuilder.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.ComponentActivity));
                                oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder.serializer());
                                if (appStartTrace.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                                    onCheckIsTextEditor oncheckistexteditorNewBuilder2 = TraceMetric.newBuilder();
                                    oncheckistexteditorNewBuilder2.read("_experiment_procStart_to_classLoad");
                                    oncheckistexteditorNewBuilder2.read(appStartTrace.getStartTimerCompat().read);
                                    oncheckistexteditorNewBuilder2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.getClassLoadTimeCompat()));
                                    oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder2.serializer());
                                }
                                String str = appStartTrace.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 ? "true" : "false";
                                oncheckistexteditor.RemoteActionCompatParcelizer();
                                ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                                oncheckistexteditor.write(appStartTrace.ResultReceiver, "onDrawCount");
                                com.google.firebase.perf.v1.PerfSession perfSessionSerializer = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                                oncheckistexteditor.RemoteActionCompatParcelizer();
                                ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer);
                                appStartTrace.logExperimentTrace(oncheckistexteditor);
                                return;
                            }
                            if (i4 == 1) {
                                onCheckIsTextEditor oncheckistexteditor2 = appStartTrace.RatingCompat;
                                if (appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
                                    return;
                                }
                                appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Timer();
                                oncheckistexteditor2.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditor2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                                appStartTrace.logExperimentTrace(oncheckistexteditor2);
                                return;
                            }
                            if (i4 == 2) {
                                onCheckIsTextEditor oncheckistexteditor3 = appStartTrace.RatingCompat;
                                if (appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                                    return;
                                }
                                appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new Timer();
                                onCheckIsTextEditor oncheckistexteditorNewBuilder3 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder3.read("_experiment_preDrawFoQ");
                                oncheckistexteditorNewBuilder3.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder3.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                                oncheckistexteditor3.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder3.serializer());
                                appStartTrace.logExperimentTrace(oncheckistexteditor3);
                                return;
                            }
                            Timer timer = AppStartTrace.write;
                            onCheckIsTextEditor oncheckistexteditorNewBuilder4 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder4.read(packZIaKswc.APP_START_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder4.read(appStartTrace.getClassLoadTimeCompat().read);
                            oncheckistexteditorNewBuilder4.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                            ArrayList arrayList = new ArrayList(3);
                            onCheckIsTextEditor oncheckistexteditorNewBuilder5 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder5.read(packZIaKswc.ON_CREATE_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder5.read(appStartTrace.getClassLoadTimeCompat().read);
                            oncheckistexteditorNewBuilder5.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
                            arrayList.add((TraceMetric) oncheckistexteditorNewBuilder5.serializer());
                            if (appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
                                onCheckIsTextEditor oncheckistexteditorNewBuilder6 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder6.read(packZIaKswc.ON_START_TRACE_NAME.toString());
                                oncheckistexteditorNewBuilder6.read(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read);
                                oncheckistexteditorNewBuilder6.write(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                                arrayList.add((TraceMetric) oncheckistexteditorNewBuilder6.serializer());
                                onCheckIsTextEditor oncheckistexteditorNewBuilder7 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder7.read(packZIaKswc.ON_RESUME_TRACE_NAME.toString());
                                oncheckistexteditorNewBuilder7.read(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read);
                                oncheckistexteditorNewBuilder7.write(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                                arrayList.add((TraceMetric) oncheckistexteditorNewBuilder7.serializer());
                            }
                            oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addAllSubtraces(arrayList);
                            com.google.firebase.perf.v1.PerfSession perfSessionSerializer2 = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                            oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer2);
                            appStartTrace.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer((TraceMetric) oncheckistexteditorNewBuilder4.serializer(), EnumC0151autofill.FOREGROUND_BACKGROUND);
                        }
                    });
                }
                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                    return;
                }
                new WeakReference(activity);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new Timer();
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = SessionManager.getInstance().perfSession();
                getWindowInfoannotations getwindowinfoannotationsWrite = getWindowInfoannotations.write();
                activity.getClass();
                getClassLoadTimeCompat().IconCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                getwindowinfoannotationsWrite.read();
                final int i4 = 3;
                read.execute(new Runnable(this) { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0
                    public final /* synthetic */ AppStartTrace IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        AppStartTrace appStartTrace = this.IconCompatParcelizer;
                        if (i5 == 0) {
                            onCheckIsTextEditor oncheckistexteditor = appStartTrace.RatingCompat;
                            if (appStartTrace.ComponentActivity != null) {
                                return;
                            }
                            appStartTrace.ComponentActivity = new Timer();
                            onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder.read("_experiment_onDrawFoQ");
                            oncheckistexteditorNewBuilder.read(appStartTrace.getStartTimerCompat().read);
                            oncheckistexteditorNewBuilder.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.ComponentActivity));
                            oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder.serializer());
                            if (appStartTrace.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
                                onCheckIsTextEditor oncheckistexteditorNewBuilder2 = TraceMetric.newBuilder();
                                oncheckistexteditorNewBuilder2.read("_experiment_procStart_to_classLoad");
                                oncheckistexteditorNewBuilder2.read(appStartTrace.getStartTimerCompat().read);
                                oncheckistexteditorNewBuilder2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.getClassLoadTimeCompat()));
                                oncheckistexteditor.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder2.serializer());
                            }
                            String str = appStartTrace.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 ? "true" : "false";
                            oncheckistexteditor.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
                            oncheckistexteditor.write(appStartTrace.ResultReceiver, "onDrawCount");
                            com.google.firebase.perf.v1.PerfSession perfSessionSerializer = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                            oncheckistexteditor.RemoteActionCompatParcelizer();
                            ((TraceMetric) oncheckistexteditor.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer);
                            appStartTrace.logExperimentTrace(oncheckistexteditor);
                            return;
                        }
                        if (i5 == 1) {
                            onCheckIsTextEditor oncheckistexteditor2 = appStartTrace.RatingCompat;
                            if (appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
                                return;
                            }
                            appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Timer();
                            oncheckistexteditor2.read(appStartTrace.getStartTimerCompat().read);
                            oncheckistexteditor2.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                            appStartTrace.logExperimentTrace(oncheckistexteditor2);
                            return;
                        }
                        if (i5 == 2) {
                            onCheckIsTextEditor oncheckistexteditor3 = appStartTrace.RatingCompat;
                            if (appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                                return;
                            }
                            appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new Timer();
                            onCheckIsTextEditor oncheckistexteditorNewBuilder3 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder3.read("_experiment_preDrawFoQ");
                            oncheckistexteditorNewBuilder3.read(appStartTrace.getStartTimerCompat().read);
                            oncheckistexteditorNewBuilder3.write(appStartTrace.getStartTimerCompat().IconCompatParcelizer(appStartTrace.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                            oncheckistexteditor3.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder3.serializer());
                            appStartTrace.logExperimentTrace(oncheckistexteditor3);
                            return;
                        }
                        Timer timer = AppStartTrace.write;
                        onCheckIsTextEditor oncheckistexteditorNewBuilder4 = TraceMetric.newBuilder();
                        oncheckistexteditorNewBuilder4.read(packZIaKswc.APP_START_TRACE_NAME.toString());
                        oncheckistexteditorNewBuilder4.read(appStartTrace.getClassLoadTimeCompat().read);
                        oncheckistexteditorNewBuilder4.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                        ArrayList arrayList = new ArrayList(3);
                        onCheckIsTextEditor oncheckistexteditorNewBuilder5 = TraceMetric.newBuilder();
                        oncheckistexteditorNewBuilder5.read(packZIaKswc.ON_CREATE_TRACE_NAME.toString());
                        oncheckistexteditorNewBuilder5.read(appStartTrace.getClassLoadTimeCompat().read);
                        oncheckistexteditorNewBuilder5.write(appStartTrace.getClassLoadTimeCompat().IconCompatParcelizer(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
                        arrayList.add((TraceMetric) oncheckistexteditorNewBuilder5.serializer());
                        if (appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
                            onCheckIsTextEditor oncheckistexteditorNewBuilder6 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder6.read(packZIaKswc.ON_START_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder6.read(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read);
                            oncheckistexteditorNewBuilder6.write(appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                            arrayList.add((TraceMetric) oncheckistexteditorNewBuilder6.serializer());
                            onCheckIsTextEditor oncheckistexteditorNewBuilder7 = TraceMetric.newBuilder();
                            oncheckistexteditorNewBuilder7.read(packZIaKswc.ON_RESUME_TRACE_NAME.toString());
                            oncheckistexteditorNewBuilder7.read(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read);
                            oncheckistexteditorNewBuilder7.write(appStartTrace.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(appStartTrace.r8lambda54BeH8ZsBru0CXI2CCSP2syNys));
                            arrayList.add((TraceMetric) oncheckistexteditorNewBuilder7.serializer());
                        }
                        oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                        ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addAllSubtraces(arrayList);
                        com.google.firebase.perf.v1.PerfSession perfSessionSerializer2 = appStartTrace.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer();
                        oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer();
                        ((TraceMetric) oncheckistexteditorNewBuilder4.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer2);
                        appStartTrace.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer((TraceMetric) oncheckistexteditorNewBuilder4.serializer(), EnumC0151autofill.FOREGROUND_BACKGROUND);
                    }
                });
                if (!zBooleanValue) {
                    unregisterActivityLifecycleCallbacks();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        synchronized (this) {
            if (!this.PlaybackStateCompat && this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null && !this.MediaSessionCompatToken) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new Timer();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void unregisterActivityLifecycleCallbacks() {
        synchronized (this) {
            if (this.PlaybackStateCompatCustomAction) {
                ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.read(this);
                this.MediaSessionCompatQueueItem.unregisterActivityLifecycleCallbacks(this);
                this.PlaybackStateCompatCustomAction = false;
            }
        }
    }

    public static boolean isAnyAppProcessInForeground(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strRemoteActionCompatParcelizer))) {
                return true;
            }
        }
        return false;
    }

    public AppStartTrace(moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4, accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = movefocusinchildrenviewfocusfix3esfko8;
        this.MediaMetadataCompat = accesssetaddchangecallbackmethodcp;
        read = threadPoolExecutor;
        onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
        oncheckistexteditorNewBuilder.read("_experiment_app_start_ttid");
        this.RatingCompat = oncheckistexteditorNewBuilder;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new Timer((micros - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        isOutMostLookaheadRoot isoutmostlookaheadroot = (isOutMostLookaheadRoot) FirebaseApp.write().write(isOutMostLookaheadRoot.class);
        if (isoutmostlookaheadroot != null) {
            long micros2 = timeUnit.toMicros(isoutmostlookaheadroot.serializer);
            timer = new Timer((micros2 - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros2);
        }
        this.MediaBrowserCompatMediaItem = timer;
    }

    public final void logExperimentTrace(onCheckIsTextEditor oncheckistexteditor) {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null || this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null || this.ComponentActivity == null) {
            return;
        }
        read.execute(new w4$$ExternalSyntheticLambda0(this, 28, oncheckistexteditor));
        unregisterActivityLifecycleCallbacks();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.PlaybackStateCompat || this.MediaSessionCompatToken) {
            return;
        }
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcp = this.MediaMetadataCompat;
        accesssetaddchangecallbackmethodcp.getClass();
        sendMotionEvent8iAsVTc sendmotionevent8iasvtcSerializer = accesssetaddchangecallbackmethodcp.serializer(accesssetGetBooleanMethodcp.read());
        if (sendmotionevent8iasvtcSerializer.serializer() && ((Boolean) sendmotionevent8iasvtcSerializer.RemoteActionCompatParcelizer()).booleanValue() && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
    }

    @Keep
    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.PlaybackStateCompat || this.MediaSessionCompatToken || this.MediaDescriptionCompat != null) {
            return;
        }
        this.MediaDescriptionCompat = new Timer();
        onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
        oncheckistexteditorNewBuilder.read("_experiment_firstBackgrounding");
        oncheckistexteditorNewBuilder.read(getStartTimerCompat().read);
        oncheckistexteditorNewBuilder.write(getStartTimerCompat().IconCompatParcelizer(this.MediaDescriptionCompat));
        this.RatingCompat.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder.serializer());
    }

    @Keep
    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_START)
    public void onAppEnteredForeground() {
        if (this.PlaybackStateCompat || this.MediaSessionCompatToken || this.ParcelableVolumeInfo != null) {
            return;
        }
        this.ParcelableVolumeInfo = new Timer();
        onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
        oncheckistexteditorNewBuilder.read("_experiment_firstForegrounding");
        oncheckistexteditorNewBuilder.read(getStartTimerCompat().read);
        oncheckistexteditorNewBuilder.write(getStartTimerCompat().IconCompatParcelizer(this.ParcelableVolumeInfo));
        this.RatingCompat.RemoteActionCompatParcelizer((TraceMetric) oncheckistexteditorNewBuilder.serializer());
    }

    public final Timer getClassLoadTimeCompat() {
        Timer timer = this.MediaBrowserCompatMediaItem;
        return timer != null ? timer : write;
    }

    public final Timer getStartTimerCompat() {
        Timer timer = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        return timer != null ? timer : getClassLoadTimeCompat();
    }
}
