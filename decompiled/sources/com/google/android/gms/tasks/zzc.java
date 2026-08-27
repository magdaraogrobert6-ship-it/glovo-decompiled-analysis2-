package com.google.android.gms.tasks;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.cardview.widget.CardView$1;
import androidx.emoji2.text.EmojiProcessor;
import coil3.ImageLoader$Builder;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.cloudmessaging.zzj;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzr;
import com.huawei.hms.android.SystemUtils;
import io.sentry.SentryClient;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.TuplesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.DrawModifierNodeKt;
import o.FocusListener;
import o.Interpolatable;
import o.LayoutNodeSubcompositionsStateScopelayout1;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1;
import o.LayoutNodeSubcompositionsStatecreateMeasureResult1;
import o.LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1;
import o.LookaheadCapablePlaceablecaptureRulers1;
import o.LookaheadDelegate;
import o.LookaheadScopeImpl;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.MeasureScope;
import o.MeasureScopeDefaultImpls;
import o.MeasuringIntrinsicsDefaultIntrinsicMeasurable;
import o.NoWindowInsetsAnimation;
import o.OnFirstVisibleElement;
import o.OnVisibilityChangedNode;
import o.PausedPrecompositionImpl;
import o.PinnableContainer;
import o.Placeable;
import o.accessgetExtendedTouchPaddingNHjbRcjd;
import o.accessgetNinecp;
import o.accessgetNumPadDividecp;
import o.accessgetNumPadEntercp;
import o.accessgetNumPadInsertcp;
import o.accessgetScp;
import o.accessgetScrollLockcp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvMediaContextMenucp;
import o.accessgetWcp;
import o.accessplaceAtf8xVGno;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.getButton3EK5gGoQ;
import o.getButton5EK5gGoQ;
import o.getButton6EK5gGoQ;
import o.getButton7EK5gGoQ;
import o.getButtonThumbLeftEK5gGoQ;
import o.getButtonXEK5gGoQ;
import o.getButtonZEK5gGoQ;
import o.getCameraEK5gGoQ;
import o.getChannelUpEK5gGoQ;
import o.getDifferencertfAjoo;
import o.getF5EK5gGoQ;
import o.getLookaheadDelegate;
import o.getMeasuredWidth;
import o.getParentWidth;
import o.getSelectionEndui_text;
import o.getViewportBounds;
import o.getWindowEK5gGoQ;
import o.isAppSetIdReadingEnabled;
import o.isComplete;
import o.isItemDismissable;
import o.layoutdefault;
import o.localLookaheadPositionOfauaQtc;
import o.maxHeight;
import o.onLayoutRectChangeddefault;
import o.onMeasuredSizeChanged;
import o.onRenderProcessGone;
import o.premeasure0kLqBqw;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.resume;
import o.scale0AR0LA0default;
import o.setCallback;
import o.setComposedWithReusableContentHost;
import o.setFrom58bKbWc;
import o.setLastReportedResult;
import o.setMeasurementConstraintsBRTryo0;
import o.setNativeShader;
import o.setRotationX;
import o.setViewportBounds;
import o.triggerCallback;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc implements Runnable {
    public Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final Object write;

    public zzc(setViewportBounds setviewportbounds, getViewportBounds getviewportbounds) {
        this.read = 15;
        this.IconCompatParcelizer = getviewportbounds;
        Objects.requireNonNull(setviewportbounds);
        this.write = setviewportbounds;
    }

    private final void IconCompatParcelizer() {
        setViewportBounds setviewportbounds = (setViewportBounds) this.write;
        isComplete iscomplete = setviewportbounds.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (iscomplete == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = (zzr) this.IconCompatParcelizer;
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
            LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.onPanelClosed;
            if (setcomposedwithreusablecontenthost.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1)) {
                setviewportbounds.RemoteActionCompatParcelizer(iscomplete, null, zzrVar);
            }
            iscomplete.read(zzrVar);
            lookaheadScopeKtLookaheadScope221.read().MediaSessionCompatResultReceiverWrapper();
            lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1);
            setviewportbounds.RemoteActionCompatParcelizer(iscomplete, null, zzrVar);
            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e, "Failed to send app launch to the service");
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        setCallback setcallback = (setCallback) this.write;
        synchronized (setcallback) {
            setcallback.read = false;
            setViewportBounds setviewportbounds = setcallback.serializer;
            if (!setviewportbounds.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Connected to remote service");
                isComplete iscomplete = (isComplete) this.IconCompatParcelizer;
                setviewportbounds.MediaSessionCompatToken();
                setviewportbounds.write = iscomplete;
                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                setviewportbounds.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            }
        }
        setViewportBounds setviewportbounds2 = ((setCallback) this.write).serializer;
        ScheduledExecutorService scheduledExecutorService = setviewportbounds2.MediaDescriptionCompat;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            setviewportbounds2.MediaDescriptionCompat = null;
        }
    }

    private final void MediaDescriptionCompat() {
        accessplaceAtf8xVGno accessplaceatf8xvgno = (accessplaceAtf8xVGno) this.write;
        try {
            Task task = (Task) accessplaceatf8xvgno.serializer.then((Task) this.IconCompatParcelizer);
            if (task == null) {
                accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer((Exception) new NullPointerException("Continuation returned null"));
            } else {
                setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo0 = Placeable.write;
                task.addOnSuccessListener(setmeasurementconstraintsbrtryo0, accessplaceatf8xvgno);
                task.addOnFailureListener(setmeasurementconstraintsbrtryo0, accessplaceatf8xvgno);
                task.addOnCanceledListener(setmeasurementconstraintsbrtryo0, accessplaceatf8xvgno);
            }
        } catch (RuntimeExecutionException e) {
            if (!(e.getCause() instanceof Exception)) {
                accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer((Exception) e);
            } else {
                accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer((Exception) e.getCause());
            }
        } catch (Exception e2) {
            accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer(e2);
        }
    }

    private final void MediaMetadataCompat() {
        onMeasuredSizeChanged onmeasuredsizechanged = (onMeasuredSizeChanged) this.write;
        synchronized (onmeasuredsizechanged.RemoteActionCompatParcelizer) {
            OnFailureListener onFailureListener = (OnFailureListener) onmeasuredsizechanged.IconCompatParcelizer;
            if (onFailureListener != null) {
                Exception exception = ((Task) this.IconCompatParcelizer).getException();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(exception);
                onFailureListener.onFailure(exception);
            }
        }
    }

    private final void MediaSessionCompatQueueItem() {
        onMeasuredSizeChanged onmeasuredsizechanged = (onMeasuredSizeChanged) this.write;
        synchronized (onmeasuredsizechanged.RemoteActionCompatParcelizer) {
            OnSuccessListener onSuccessListener = (OnSuccessListener) onmeasuredsizechanged.IconCompatParcelizer;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(((Task) this.IconCompatParcelizer).getResult());
            }
        }
    }

    private final void MediaSessionCompatResultReceiverWrapper() {
        zzw zzwVar = (zzw) this.IconCompatParcelizer;
        try {
            zzwVar.read(((Callable) this.write).call());
        } catch (Exception e) {
            zzwVar.RemoteActionCompatParcelizer(e);
        } catch (Throwable th) {
            zzwVar.RemoteActionCompatParcelizer((Exception) new RuntimeException(th));
        }
    }

    private final void MediaSessionCompatToken() {
        onMeasuredSizeChanged onmeasuredsizechanged = (onMeasuredSizeChanged) this.write;
        try {
            Task taskThen = ((PausedPrecompositionImpl) onmeasuredsizechanged.RemoteActionCompatParcelizer).then(((Task) this.IconCompatParcelizer).getResult());
            if (taskThen == null) {
                ((zzw) onmeasuredsizechanged.IconCompatParcelizer).RemoteActionCompatParcelizer((Exception) new NullPointerException("Continuation returned null"));
            } else {
                setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo0 = Placeable.write;
                taskThen.addOnSuccessListener(setmeasurementconstraintsbrtryo0, onmeasuredsizechanged);
                taskThen.addOnFailureListener(setmeasurementconstraintsbrtryo0, onmeasuredsizechanged);
                taskThen.addOnCanceledListener(setmeasurementconstraintsbrtryo0, onmeasuredsizechanged);
            }
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                onmeasuredsizechanged.onFailure((Exception) e.getCause());
            } else {
                ((zzw) onmeasuredsizechanged.IconCompatParcelizer).RemoteActionCompatParcelizer((Exception) e);
            }
        } catch (CancellationException unused) {
            onmeasuredsizechanged.onCanceled();
        } catch (Exception e2) {
            ((zzw) onmeasuredsizechanged.IconCompatParcelizer).RemoteActionCompatParcelizer(e2);
        }
    }

    private final void RatingCompat() {
        onMeasuredSizeChanged onmeasuredsizechanged = (onMeasuredSizeChanged) this.write;
        synchronized (onmeasuredsizechanged.RemoteActionCompatParcelizer) {
            PinnableContainer pinnableContainer = (PinnableContainer) onmeasuredsizechanged.IconCompatParcelizer;
            if (pinnableContainer != null) {
                pinnableContainer.onComplete((Task) this.IconCompatParcelizer);
            }
        }
    }

    private final void RemoteActionCompatParcelizer() {
        zzp zzpVar = (zzp) this.IconCompatParcelizer;
        int i = ((accessgetNinecp) this.write).RemoteActionCompatParcelizer;
        synchronized (zzpVar) {
            accessgetNinecp accessgetninecp = (accessgetNinecp) zzpVar.write.get(i);
            if (accessgetninecp != null) {
                SentryLogcatAdapter.IconCompatParcelizer("MessengerIpcClient", "Timing out request: " + i);
                zzpVar.write.remove(i);
                accessgetninecp.serializer(new zzt("Timed out waiting for response", null));
                zzpVar.read();
            }
        }
    }

    private final void serializer() {
        setViewportBounds setviewportbounds = (setViewportBounds) this.write;
        isComplete iscomplete = setviewportbounds.write;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (iscomplete == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to send current screen to service");
            return;
        }
        try {
            getViewportBounds getviewportbounds = (getViewportBounds) this.IconCompatParcelizer;
            if (getviewportbounds == null) {
                iscomplete.serializer(null, null, 0L, lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getPackageName());
            } else {
                iscomplete.serializer(getviewportbounds.read, getviewportbounds.write, getviewportbounds.IconCompatParcelizer, lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getPackageName());
            }
            setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } catch (RemoteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e, "Failed to send current screen to the service");
        }
    }

    private final void write() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        resume resumeVarMediaMetadataCompat = lookaheadScopeKtLookaheadScope221.MediaMetadataCompat();
        String str = (String) this.write;
        String str2 = resumeVarMediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        resumeVarMediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
        if (z) {
            lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatQueueItem();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        ((java.lang.Runnable) r9.IconCompatParcelizer).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        o.LookaheadDelegate.serializer.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.IconCompatParcelizer), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r9.IconCompatParcelizer = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void read() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.write     // Catch: java.lang.Throwable -> L7d
            o.LookaheadDelegate r2 = (o.LookaheadDelegate) r2     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayDeque r2 = r2.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L23
            java.lang.Object r1 = r9.write     // Catch: java.lang.Throwable -> L7a
            o.LookaheadDelegate r1 = (o.LookaheadDelegate) r1     // Catch: java.lang.Throwable -> L7a
            o.LookaheadCapablePlaceablecaptureRulers1 r3 = r1.MediaSessionCompatQueueItem     // Catch: java.lang.Throwable -> L7a
            o.LookaheadCapablePlaceablecaptureRulers1 r4 = o.LookaheadCapablePlaceablecaptureRulers1.RUNNING     // Catch: java.lang.Throwable -> L7a
            if (r3 != r4) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L45
            goto L3e
        L19:
            long r5 = r1.read     // Catch: java.lang.Throwable -> L7a
            r7 = 1
            long r5 = r5 + r7
            r1.read = r5     // Catch: java.lang.Throwable -> L7a
            r1.MediaSessionCompatQueueItem = r4     // Catch: java.lang.Throwable -> L7a
            r1 = 1
        L23:
            java.lang.Object r3 = r9.write     // Catch: java.lang.Throwable -> L7a
            o.LookaheadDelegate r3 = (o.LookaheadDelegate) r3     // Catch: java.lang.Throwable -> L7a
            java.util.ArrayDeque r3 = r3.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7a
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7a
            r9.IconCompatParcelizer = r3     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L46
            java.lang.Object r1 = r9.write     // Catch: java.lang.Throwable -> L7a
            o.LookaheadDelegate r1 = (o.LookaheadDelegate) r1     // Catch: java.lang.Throwable -> L7a
            o.LookaheadCapablePlaceablecaptureRulers1 r3 = o.LookaheadCapablePlaceablecaptureRulers1.IDLE     // Catch: java.lang.Throwable -> L7a
            r1.MediaSessionCompatQueueItem = r3     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L45
        L3e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L45:
            return
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7d
            r0 = r0 | r2
            r2 = 0
            java.lang.Object r3 = r9.IconCompatParcelizer     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            r3.run()     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            goto L74
        L55:
            r1 = move-exception
            goto L77
        L57:
            r3 = move-exception
            java.util.logging.Logger r4 = o.LookaheadDelegate.serializer     // Catch: java.lang.Throwable -> L55
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r6.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r7 = r9.IconCompatParcelizer     // Catch: java.lang.Throwable -> L55
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L55
            r6.append(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L55
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L55
        L74:
            r9.IconCompatParcelizer = r2     // Catch: java.lang.Throwable -> L7d
            goto L2
        L77:
            r9.IconCompatParcelizer = r2     // Catch: java.lang.Throwable -> L7d
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7a:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r1 = move-exception
            if (r0 == 0) goto L87
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L87:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.zzc.read():void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029a A[Catch: IllegalStateException -> 0x02a9, TRY_LEAVE, TryCatch #16 {IllegalStateException -> 0x02a9, blocks: (B:95:0x026c, B:98:0x0296, B:100:0x029a), top: B:497:0x026c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:115:0x0300 A[Catch: NotFoundException -> 0x0305, TRY_LEAVE, TryCatch #1 {NotFoundException -> 0x0305, blocks: (B:112:0x02ef, B:115:0x0300), top: B:472:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0312  */
    /* JADX WARN: Code duplicated, block: B:122:0x0316  */
    /* JADX WARN: Code duplicated, block: B:124:0x031c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0327  */
    /* JADX WARN: Code duplicated, block: B:128:0x0331  */
    /* JADX WARN: Code duplicated, block: B:131:0x0345  */
    /* JADX WARN: Code duplicated, block: B:133:0x0349  */
    /* JADX WARN: Code duplicated, block: B:134:0x0370  */
    /* JADX WARN: Code duplicated, block: B:137:0x038d  */
    /* JADX WARN: Code duplicated, block: B:139:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:143:0x0408  */
    /* JADX WARN: Code duplicated, block: B:146:0x044a  */
    /* JADX WARN: Code duplicated, block: B:147:0x044c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0451  */
    /* JADX WARN: Code duplicated, block: B:152:0x045c  */
    /* JADX WARN: Code duplicated, block: B:153:0x045e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0460  */
    /* JADX WARN: Code duplicated, block: B:157:0x0493  */
    /* JADX WARN: Code duplicated, block: B:158:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:161:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:166:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x0500 A[PHI: r29 r30
  0x0500: PHI (r29v8 o.getMeasuredWidth) = (r29v6 o.getMeasuredWidth), (r29v9 o.getMeasuredWidth) binds: [B:165:0x04e5, B:163:0x04ca] A[DONT_GENERATE, DONT_INLINE]
  0x0500: PHI (r30v6 o.LookaheadScopeKtLookaheadScope221) = (r30v4 o.LookaheadScopeKtLookaheadScope221), (r30v7 o.LookaheadScopeKtLookaheadScope221) binds: [B:165:0x04e5, B:163:0x04ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x050e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x051c  */
    /* JADX WARN: Code duplicated, block: B:177:0x052b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0530  */
    /* JADX WARN: Code duplicated, block: B:181:0x0538  */
    /* JADX WARN: Code duplicated, block: B:184:0x0561  */
    /* JADX WARN: Code duplicated, block: B:187:0x0571  */
    /* JADX WARN: Code duplicated, block: B:190:0x0593  */
    /* JADX WARN: Code duplicated, block: B:192:0x05a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:197:0x05c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:210:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:212:0x0602  */
    /* JADX WARN: Code duplicated, block: B:214:0x0620  */
    /* JADX WARN: Code duplicated, block: B:218:0x064e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0660  */
    /* JADX WARN: Code duplicated, block: B:222:0x066d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0688  */
    /* JADX WARN: Code duplicated, block: B:229:0x068e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0698  */
    /* JADX WARN: Code duplicated, block: B:232:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:235:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:238:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:242:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:245:0x06db  */
    /* JADX WARN: Code duplicated, block: B:247:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:248:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:250:0x0701  */
    /* JADX WARN: Code duplicated, block: B:252:0x0721 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x072c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0748  */
    /* JADX WARN: Code duplicated, block: B:258:0x0758  */
    /* JADX WARN: Code duplicated, block: B:261:0x0769  */
    /* JADX WARN: Code duplicated, block: B:266:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:275:0x0805  */
    /* JADX WARN: Code duplicated, block: B:278:0x080e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0816  */
    /* JADX WARN: Code duplicated, block: B:284:0x0823  */
    /* JADX WARN: Code duplicated, block: B:288:0x0858  */
    /* JADX WARN: Code duplicated, block: B:290:0x0863  */
    /* JADX WARN: Code duplicated, block: B:292:0x0894  */
    /* JADX WARN: Code duplicated, block: B:295:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:298:0x08be  */
    /* JADX WARN: Code duplicated, block: B:472:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[LOOP:0: B:203:0x05dd->B:508:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a4 A[Catch: NameNotFoundException -> 0x01c6, TryCatch #3 {NameNotFoundException -> 0x01c6, blocks: (B:57:0x0199, B:59:0x01a4, B:61:0x01b0), top: B:474:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b0 A[Catch: NameNotFoundException -> 0x01c6, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x01c6, blocks: (B:57:0x0199, B:59:0x01a4, B:61:0x01b0), top: B:474:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0200  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code duplicated, block: B:86:0x0207  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0227  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0248  */
    /* JADX WARN: Code duplicated, block: B:92:0x0253  */
    /* JADX WARN: Code duplicated, block: B:93:0x025e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0294  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v160, types: [o.MultiContentMeasurePolicyImpl] */
    @Override // java.lang.Runnable
    public final void run() {
        accessgetScrollLockcp accessgetscrolllockcp;
        String str;
        String installerPackageName;
        String str2;
        String str3;
        String string;
        PackageInfo packageInfo;
        String str4;
        CharSequence applicationLabel;
        int i;
        int iIconCompatParcelizer;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221;
        Bundle bundleMediaMetadataCompat;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        OnFirstVisibleElement onFirstVisibleElement;
        zzgs zzgsVar;
        zzgs zzgsVar2;
        zzgs zzgsVar3;
        zzgs zzgsVar4;
        String strMediaSessionCompatResultReceiverWrapper;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final NoWindowInsetsAnimation noWindowInsetsAnimation;
        getWindowEK5gGoQ getwindowek5ggoqMediaSessionCompatQueueItem;
        getWindowEK5gGoQ getwindowek5ggoq;
        boolean zWrite;
        boolean z;
        onLayoutRectChangeddefault onlayoutrectchangeddefault;
        long j2;
        boolean z2;
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        getMeasuredWidth getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
        int i3;
        MeasureScopeDefaultImpls measureScopeDefaultImpls;
        MeasureScopeDefaultImpls measureScopeDefaultImpls2;
        MeasureScopeDefaultImpls measureScopeDefaultImpls3;
        getMeasuredWidth getmeasuredwidth;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222;
        getMeasuredWidth getmeasuredwidth2;
        int i4;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223;
        MeasureScopeDefaultImpls measureScopeDefaultImpls4;
        MeasureScopeDefaultImpls measureScopeDefaultImpls5;
        Bundle bundle;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write;
        Iterator it;
        Boolean boolRemoteActionCompatParcelizer;
        LookaheadScopeImpl lookaheadScopeImpl;
        long j3;
        MemoryCacheService memoryCacheService;
        onLayoutRectChangeddefault onlayoutrectchangeddefault2;
        boolean zWrite2;
        SharedPreferences sharedPreferences;
        String strComponentActivity;
        String string2;
        boolean zIsEmpty;
        Boolean boolValueOf;
        long jMax;
        zzgs zzgsVar5;
        Context context;
        Iterator it2;
        String str5;
        onLayoutRectChangeddefault onlayoutrectchangeddefault3;
        String str6;
        switch (this.read) {
            case 0:
                Task task = (Task) this.IconCompatParcelizer;
                boolean zIsCanceled = task.isCanceled();
                accessplaceAtf8xVGno accessplaceatf8xvgno = (accessplaceAtf8xVGno) this.write;
                if (zIsCanceled) {
                    accessplaceatf8xvgno.IconCompatParcelizer.read();
                    return;
                }
                try {
                    accessplaceatf8xvgno.IconCompatParcelizer.read(accessplaceatf8xvgno.serializer.then(task));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer((Exception) e.getCause());
                        return;
                    } else {
                        accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer((Exception) e);
                        return;
                    }
                } catch (Exception e2) {
                    accessplaceatf8xvgno.IconCompatParcelizer.RemoteActionCompatParcelizer(e2);
                    return;
                }
            case 1:
                DrawModifierNodeKt drawModifierNodeKt = (DrawModifierNodeKt) this.IconCompatParcelizer;
                boolean zIsCancelled = drawModifierNodeKt.isCancelled();
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.write;
                if (zIsCancelled) {
                    cancellableContinuationImpl.serializer((Throwable) null);
                    return;
                }
                Object[] objArr = false;
                while (true) {
                    try {
                        try {
                            Object obj = drawModifierNodeKt.get();
                            if (objArr != false) {
                                Thread.currentThread().interrupt();
                            }
                            cancellableContinuationImpl.resumeWith(obj);
                            return;
                        } catch (ExecutionException e3) {
                            Throwable cause = e3.getCause();
                            cause.getClass();
                            cancellableContinuationImpl.resumeWith(new isItemDismissable(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        objArr = true;
                    } catch (Throwable th) {
                        if (objArr != true) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    }
                }
                break;
            case 2:
                setRotationX setrotationx = setRotationX.read();
                int i5 = Interpolatable.IconCompatParcelizer;
                setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) this.IconCompatParcelizer;
                setrotationx.getClass();
                ((Interpolatable) this.write).write.serializer(setfrom58bkbwc);
                return;
            case 3:
                try {
                    ((Runnable) this.write).run();
                    synchronized (((getDifferencertfAjoo) this.IconCompatParcelizer).RemoteActionCompatParcelizer) {
                        ((getDifferencertfAjoo) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((getDifferencertfAjoo) this.IconCompatParcelizer).RemoteActionCompatParcelizer) {
                        ((getDifferencertfAjoo) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
                        throw th2;
                    }
                }
            case 4:
                zzp zzpVar = (zzp) this.IconCompatParcelizer;
                IBinder iBinder = (IBinder) this.write;
                synchronized (zzpVar) {
                    try {
                        if (iBinder == null) {
                            zzpVar.write("Null service connection");
                        } else {
                            try {
                                zzpVar.read = new CardView$1(iBinder);
                                zzpVar.serializer = 2;
                                ((ScheduledExecutorService) zzpVar.MediaMetadataCompat.read).execute(new zzj(zzpVar, 0));
                            } catch (RemoteException e4) {
                                zzpVar.write(e4.getMessage());
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 5:
                RemoteActionCompatParcelizer();
                return;
            case 6:
                ConnectionResult connectionResult = (ConnectionResult) this.IconCompatParcelizer;
                SentryClient sentryClient = (SentryClient) this.write;
                GoogleApiManager googleApiManager = (GoogleApiManager) sentryClient.serializer;
                accessgetScp accessgetscp = (accessgetScp) sentryClient.RemoteActionCompatParcelizer;
                zabk zabkVar = (zabk) googleApiManager.ParcelableVolumeInfo.get((accessgetNumPadDividecp) sentryClient.MediaBrowserCompatMediaItem);
                if (zabkVar == null) {
                    return;
                }
                if (!connectionResult.read()) {
                    zabkVar.RemoteActionCompatParcelizer(connectionResult, null);
                    return;
                }
                sentryClient.IconCompatParcelizer = true;
                if (accessgetscp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
                    if (!sentryClient.IconCompatParcelizer || (accessgetscrolllockcp = (accessgetScrollLockcp) sentryClient.MediaDescriptionCompat) == null) {
                        return;
                    }
                    accessgetscp.IconCompatParcelizer(accessgetscrolllockcp, (Set) sentryClient.write);
                    return;
                }
                try {
                    accessgetscp.IconCompatParcelizer(null, accessgetscp.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() ? accessgetscp.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e5) {
                    SentryLogcatAdapter.read("GoogleApiManager", "Failed to get service from broker. ", e5);
                    accessgetscp.RemoteActionCompatParcelizer("Failed to get service from broker.");
                    zabkVar.RemoteActionCompatParcelizer(new ConnectionResult(10, null, null), null);
                    return;
                }
            case 7:
                scale0AR0LA0default scale0ar0la0default = (scale0AR0LA0default) this.IconCompatParcelizer;
                accessgetNumPadInsertcp accessgetnumpadinsertcp = (accessgetNumPadInsertcp) this.write;
                accessgetNumPadEntercp accessgetnumpadentercp = (accessgetNumPadEntercp) scale0ar0la0default.RemoteActionCompatParcelizer;
                if (accessgetnumpadentercp == null) {
                    return;
                }
                accessgetnumpadinsertcp.write(accessgetnumpadentercp.write);
                return;
            case 8:
                getButton6EK5gGoQ getbutton6ek5ggoq = (getButton6EK5gGoQ) this.write;
                if (getbutton6ek5ggoq.ParcelableVolumeInfo == 2) {
                    getButton3EK5gGoQ getbutton3ek5ggoq = (getButton3EK5gGoQ) this.IconCompatParcelizer;
                    "Evaluating tags for event ".concat(String.valueOf(getbutton3ek5ggoq.serializer));
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    getbutton6ek5ggoq.PlaybackStateCompatCustomAction.serializer(getbutton3ek5ggoq);
                    return;
                }
                if (getbutton6ek5ggoq.ParcelableVolumeInfo == 1) {
                    getbutton6ek5ggoq.PlaybackStateCompat.add((getButton3EK5gGoQ) this.IconCompatParcelizer);
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    return;
                }
                if (getbutton6ek5ggoq.ParcelableVolumeInfo == 3) {
                    getButton3EK5gGoQ getbutton3ek5ggoq2 = (getButton3EK5gGoQ) this.IconCompatParcelizer;
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    if (!getbutton3ek5ggoq2.MediaMetadataCompat) {
                        "Discarded non-passthrough event ".concat(String.valueOf(((getButton3EK5gGoQ) this.IconCompatParcelizer).serializer));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        return;
                    }
                    try {
                        getbutton6ek5ggoq.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getbutton3ek5ggoq2.RemoteActionCompatParcelizer.getTime(), getbutton3ek5ggoq2.write, "app", getbutton3ek5ggoq2.serializer);
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        return;
                    } catch (RemoteException e6) {
                        getButton5EK5gGoQ.IconCompatParcelizer("Error logging event with measurement proxy:", e6, ((getButton6EK5gGoQ) this.write).IconCompatParcelizer);
                        return;
                    }
                }
                return;
            case 9:
                getF5EK5gGoQ getf5ek5ggoq = (getF5EK5gGoQ) this.IconCompatParcelizer;
                EmojiProcessor emojiProcessor = getf5ek5ggoq.IconCompatParcelizer.RemoteActionCompatParcelizer;
                getButton6EK5gGoQ getbutton6ek5ggoq2 = (getButton6EK5gGoQ) this.write;
                applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = getf5ek5ggoq.write;
                getButtonZEK5gGoQ getbuttonzek5ggoq = getbutton6ek5ggoq2.PlaybackStateCompatCustomAction;
                ImageLoader$Builder imageLoader$Builder = getbutton6ek5ggoq2.write;
                getbutton6ek5ggoq2.PlaybackStateCompatCustomAction = new getButtonZEK5gGoQ((Context) imageLoader$Builder.RemoteActionCompatParcelizer, (String) imageLoader$Builder.IconCompatParcelizer, emojiProcessor, applydisplaycutoutmarginstocontentarealambda0, (setLastReportedResult) imageLoader$Builder.read, (OnVisibilityChangedNode) imageLoader$Builder.serializer);
                getbutton6ek5ggoq2.ParcelableVolumeInfo = 2;
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                ArrayList<getButton3EK5gGoQ> arrayList = getbutton6ek5ggoq2.PlaybackStateCompat;
                if (arrayList != null) {
                    for (getButton3EK5gGoQ getbutton3ek5ggoq3 : arrayList) {
                        "Evaluating tags for pending event ".concat(String.valueOf(getbutton3ek5ggoq3.serializer));
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        getbutton6ek5ggoq2.PlaybackStateCompatCustomAction.serializer(getbutton3ek5ggoq3);
                    }
                    getbutton6ek5ggoq2.PlaybackStateCompat = null;
                }
                getButton7EK5gGoQ.write(getbutton6ek5ggoq2.PlaybackStateCompatCustomAction.serializer);
                if (getCameraEK5gGoQ.write == null) {
                    getCameraEK5gGoQ.write = new getCameraEK5gGoQ();
                }
                getCameraEK5gGoQ.write.write();
                "Runtime initialized successfully for container ".concat(String.valueOf(getbutton6ek5ggoq2.read));
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                long jIconCompatParcelizer = getbutton6ek5ggoq2.MediaSessionCompatToken.IconCompatParcelizer(7200000L, 259200000L) + 43200000 + getf5ek5ggoq.IconCompatParcelizer.IconCompatParcelizer;
                if (getbuttonzek5ggoq == null && getbutton6ek5ggoq2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && getf5ek5ggoq.serializer == 1) {
                    getbutton6ek5ggoq2.MediaDescriptionCompat.getClass();
                    if (jIconCompatParcelizer < System.currentTimeMillis()) {
                        EmojiProcessor emojiProcessor2 = getbutton6ek5ggoq2.MediaSessionCompatToken;
                        getButton6EK5gGoQ.IconCompatParcelizer(getbutton6ek5ggoq2, Math.max(0L, emojiProcessor2.MediaMetadataCompat().getLong("FORBIDDEN_COUNT", 0L)) != 0 ? emojiProcessor2.IconCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 600000L) + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM : 0L);
                        return;
                    }
                }
                getbutton6ek5ggoq2.MediaDescriptionCompat.getClass();
                getButton6EK5gGoQ.IconCompatParcelizer(getbutton6ek5ggoq2, Math.max(900000L, jIconCompatParcelizer - System.currentTimeMillis()));
                return;
            case 10:
                HashMap map = ((getChannelUpEK5gGoQ) this.write).read;
                if (map.isEmpty()) {
                    getButtonThumbLeftEK5gGoQ.write("TagManagerBackend emit called without loaded container.");
                    return;
                }
                for (getButton6EK5gGoQ getbutton6ek5ggoq3 : map.values()) {
                    getButton3EK5gGoQ getbutton3ek5ggoq4 = (getButton3EK5gGoQ) this.IconCompatParcelizer;
                    getbutton6ek5ggoq3.getClass();
                    getbutton6ek5ggoq3.MediaMetadataCompat.execute(new zzc(getbutton6ek5ggoq3, getbutton3ek5ggoq4, false, 8));
                }
                return;
            case 11:
                layoutdefault layoutdefaultVar = (layoutdefault) this.IconCompatParcelizer;
                layoutdefaultVar.MediaBrowserCompatMediaItem();
                if (accessgetWcp.read()) {
                    layoutdefaultVar.PlaybackStateCompat().write((Runnable) this);
                    return;
                }
                LayoutNodeSubcompositionsStatecreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasureResult1 = (LayoutNodeSubcompositionsStatecreateMeasureResult1) this.write;
                boolean z3 = layoutNodeSubcompositionsStatecreateMeasureResult1.IconCompatParcelizer != 0;
                layoutNodeSubcompositionsStatecreateMeasureResult1.IconCompatParcelizer = 0L;
                if (z3) {
                    layoutNodeSubcompositionsStatecreateMeasureResult1.serializer();
                    return;
                }
                return;
            case 12:
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) this.write;
                onRenderProcessGone onrenderprocessgone = (onRenderProcessGone) this.IconCompatParcelizer;
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
                LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope224.PlaybackStateCompatCustomAction;
                onLayoutRectChangeddefault onlayoutrectchangeddefault4 = lookaheadScopeKtLookaheadScope224.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
                setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope224.PlaybackStateCompat;
                ((LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                LayoutNodeSubcompositionsStateScopelayout1 layoutNodeSubcompositionsStateScopelayout1 = new LayoutNodeSubcompositionsStateScopelayout1(lookaheadScopeKtLookaheadScope224);
                layoutNodeSubcompositionsStateScopelayout1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                lookaheadScopeKtLookaheadScope224.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = layoutNodeSubcompositionsStateScopelayout1;
                zzdd zzddVar = (zzdd) onrenderprocessgone.IconCompatParcelizer;
                resume resumeVar = new resume(lookaheadScopeKtLookaheadScope224, onrenderprocessgone.RemoteActionCompatParcelizer, zzddVar == null ? 0L : zzddVar.serializer);
                resumeVar.read();
                lookaheadScopeKtLookaheadScope224.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = resumeVar;
                getParentWidth getparentwidth = new getParentWidth(lookaheadScopeKtLookaheadScope224);
                getparentwidth.read();
                lookaheadScopeKtLookaheadScope224.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getparentwidth;
                setViewportBounds setviewportbounds = new setViewportBounds(lookaheadScopeKtLookaheadScope224);
                setviewportbounds.read();
                lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = setviewportbounds;
                boolean z4 = onlayoutrectchangeddefault4.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope225 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (z4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                    return;
                }
                onlayoutrectchangeddefault4.MediaSessionCompatToken();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == 0) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == 0) {
                        getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Utils falling back to Random for random id");
                    }
                }
                onlayoutrectchangeddefault4.serializer.set(jNextLong);
                lookaheadScopeKtLookaheadScope225.MediaBrowserCompatMediaItem.incrementAndGet();
                onlayoutrectchangeddefault4.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
                if (lookaheadScopeKt.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                    return;
                }
                SharedPreferences sharedPreferences2 = ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = sharedPreferences2;
                boolean z5 = sharedPreferences2.getBoolean("has_been_opened", false);
                lookaheadScopeKt.MediaSessionCompatToken = z5;
                if (!z5) {
                    SharedPreferences.Editor editorEdit = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                lookaheadScopeKt.IconCompatParcelizer = new localLookaheadPositionOfauaQtc(lookaheadScopeKt, Math.max(0L, ((Long) premeasure0kLqBqw.removeMenuProvider.IconCompatParcelizer(null)).longValue()));
                ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                lookaheadScopeKt.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
                resume resumeVar2 = lookaheadScopeKtLookaheadScope224.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                if (resumeVar2.RemoteActionCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                    return;
                }
                String str7 = "";
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope226 = (LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope226.ParcelableVolumeInfo;
                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope226.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.PlaybackStateCompat.serializer("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(resumeVar2.MediaMetadataCompat), Long.valueOf(resumeVar2.MediaDescriptionCompat));
                Context context2 = lookaheadScopeKtLookaheadScope226.MediaDescriptionCompat;
                String packageName = context2.getPackageName();
                PackageManager packageManager = context2.getPackageManager();
                try {
                    if (packageManager != null) {
                        str = "Unknown";
                        try {
                            installerPackageName = packageManager.getInstallerPackageName(packageName);
                        } catch (IllegalArgumentException unused2) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(packageName), "Error retrieving app installer package name. appId");
                            installerPackageName = SystemUtils.UNKNOWN;
                        }
                        try {
                            if (installerPackageName != null) {
                                if ("com.android.vending".equals(installerPackageName)) {
                                    str2 = "";
                                }
                                packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                                if (packageInfo != null) {
                                    applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (!TextUtils.isEmpty(applicationLabel)) {
                                        string = applicationLabel.toString();
                                    } else {
                                        string = "Unknown";
                                    }
                                    try {
                                        str = packageInfo.versionName;
                                        i = packageInfo.versionCode;
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                        str3 = str;
                                        str = string;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                        getlookaheaddelegate4.serializer.serializer("Error retrieving package info. appId, appName", getLookaheadDelegate.RemoteActionCompatParcelizer(packageName), str);
                                        string = str;
                                        str2 = str2;
                                        str = str3;
                                        i = Integer.MIN_VALUE;
                                    }
                                    break;
                                } else {
                                    str4 = str2;
                                }
                                resumeVar2.read = packageName;
                                resumeVar2.serializer = str2;
                                resumeVar2.IconCompatParcelizer = str;
                                resumeVar2.write = i;
                                resumeVar2.MediaSessionCompatQueueItem = string;
                                resumeVar2.RatingCompat = 0L;
                                iIconCompatParcelizer = lookaheadScopeKtLookaheadScope226.IconCompatParcelizer();
                                if (iIconCompatParcelizer == 0) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.PlaybackStateCompat.RemoteActionCompatParcelizer("App measurement collection enabled");
                                } else if (iIconCompatParcelizer == 1) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement deactivated via the manifest");
                                } else if (iIconCompatParcelizer == 3) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (iIconCompatParcelizer == 4) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled via the manifest");
                                } else if (iIconCompatParcelizer == 6) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (iIconCompatParcelizer == 7) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled via the global data collection setting");
                                } else if (iIconCompatParcelizer != 8) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled");
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.write.RemoteActionCompatParcelizer("Invalid scion state in identity");
                                } else {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled due to denied storage consent");
                                }
                                resumeVar2.MediaSessionCompatToken = "";
                                str6 = (String) TuplesKt.RemoteActionCompatParcelizer(-1772022421, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{context2, lookaheadScopeKtLookaheadScope226.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 1772022425);
                                if (TextUtils.isEmpty(str6)) {
                                    str6 = str7;
                                }
                                resumeVar2.MediaSessionCompatToken = str6;
                                if (iIconCompatParcelizer == 0) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.PlaybackStateCompat.serializer("App measurement enabled for app package, google app id", resumeVar2.read, resumeVar2.MediaSessionCompatToken);
                                    break;
                                }
                                resumeVar2.MediaBrowserCompatMediaItem = null;
                                setComposedWithReusableContentHost setcomposedwithreusablecontenthost2 = lookaheadScopeKtLookaheadScope226.PlaybackStateCompat;
                                lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("analytics.safelisted_events");
                                bundleMediaMetadataCompat = setcomposedwithreusablecontenthost2.MediaMetadataCompat();
                                if (bundleMediaMetadataCompat != null) {
                                    if (bundleMediaMetadataCompat.containsKey("analytics.safelisted_events")) {
                                        numValueOf = Integer.valueOf(bundleMediaMetadataCompat.getInt("analytics.safelisted_events"));
                                    }
                                    if (numValueOf != null) {
                                        try {
                                            stringArray = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getResources().getStringArray(numValueOf.intValue());
                                            if (stringArray == null) {
                                                listAsList = Arrays.asList(stringArray);
                                            } else {
                                                listAsList = null;
                                            }
                                        } catch (Resources.NotFoundException e7) {
                                            getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                            getlookaheaddelegate5.serializer.serializer(e7, "Failed to load string array from metadata: resource not found");
                                        }
                                        break;
                                    } else {
                                        listAsList = null;
                                    }
                                    if (listAsList != null) {
                                        resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                                    } else if (listAsList.isEmpty()) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                        getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Safelisted event list is empty. Ignoring");
                                    } else {
                                        it2 = listAsList.iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                str5 = (String) it2.next();
                                                onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope226.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                                            } else {
                                                resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                                            }
                                        } while (onlayoutrectchangeddefault3.read("safelisted event", str5));
                                    }
                                    if (packageManager != null) {
                                        resumeVar2.MediaSessionCompatResultReceiverWrapper = ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context2}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() ? 1 : 0;
                                    } else {
                                        resumeVar2.MediaSessionCompatResultReceiverWrapper = 0;
                                    }
                                    ((LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                                    resumeVar2.RemoteActionCompatParcelizer = true;
                                    onFirstVisibleElement = new OnFirstVisibleElement(lookaheadScopeKtLookaheadScope224);
                                    onFirstVisibleElement.read();
                                    lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onFirstVisibleElement;
                                    if (!onFirstVisibleElement.RemoteActionCompatParcelizer) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                                        return;
                                    }
                                    onFirstVisibleElement.write = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
                                    ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                                    onFirstVisibleElement.RemoteActionCompatParcelizer = true;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
                                    zzgsVar2 = getlookaheaddelegate.MediaMetadataCompat;
                                    zzgsVar3 = getlookaheaddelegate.PlaybackStateCompat;
                                    zzgsVar4 = getlookaheaddelegate.serializer;
                                    setcomposedwithreusablecontenthost.read();
                                    zzgsVar2.serializer(133005L, "App measurement initialized, version");
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar2.RemoteActionCompatParcelizer("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    strMediaSessionCompatResultReceiverWrapper = resumeVar.MediaSessionCompatResultReceiverWrapper();
                                    if (onlayoutrectchangeddefault4.IconCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, setcomposedwithreusablecontenthost.serializer)) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar2.RemoteActionCompatParcelizer("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar2.RemoteActionCompatParcelizer("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strMediaSessionCompatResultReceiverWrapper)));
                                    }
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar.RemoteActionCompatParcelizer("Debug-level message logging enabled");
                                    i2 = lookaheadScopeKtLookaheadScope224.serializer;
                                    atomicInteger = lookaheadScopeKtLookaheadScope224.MediaBrowserCompatMediaItem;
                                    if (i2 != atomicInteger.get()) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar4.serializer("Not all components initialized", Integer.valueOf(lookaheadScopeKtLookaheadScope224.serializer), Integer.valueOf(atomicInteger.get()));
                                    }
                                    lookaheadScopeKtLookaheadScope224.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                                    j = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat;
                                    noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope224.ComponentActivity;
                                    LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
                                    lookaheadScopeKtLookaheadScope5.MediaSessionCompatToken();
                                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                    getwindowek5ggoqMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem();
                                    getwindowek5ggoq = getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
                                    accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                    zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00);
                                    if (getwindowek5ggoqMediaSessionCompatQueueItem == getwindowek5ggoq) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (zWrite) {
                                        onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                        if (onlayoutrectchangeddefault4.MediaSessionCompatQueueItem() == 1) {
                                            z2 = z;
                                        } else if (z) {
                                            z2 = true;
                                        } else {
                                            onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                            j2 = j;
                                        }
                                        onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                        IntentFilter intentFilter = new IntentFilter();
                                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                        j2 = j;
                                        FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter, null, 2);
                                        getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                                        getlookaheaddelegate6.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                                        if (z2) {
                                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                            lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                                        }
                                    } else if (z) {
                                        z2 = true;
                                        onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                        IntentFilter intentFilter2 = new IntentFilter();
                                        intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                        j2 = j;
                                        FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter2, null, 2);
                                        getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                                        getlookaheaddelegate7.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                                        if (z2) {
                                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                            lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                                        }
                                    } else {
                                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                        j2 = j;
                                    }
                                    r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt.RemoteActionCompatParcelizer;
                                    getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
                                    i3 = getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read;
                                    measureScopeDefaultImpls = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_storage", false);
                                    measureScopeDefaultImpls2 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_analytics_storage", false);
                                    measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                                    if (measureScopeDefaultImpls == measureScopeDefaultImpls3 || measureScopeDefaultImpls2 != measureScopeDefaultImpls3) {
                                        getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                                        lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                                        if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                            EnumMap enumMap = new EnumMap(MeasureScope.class);
                                            enumMap.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                            enumMap.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                            getmeasuredwidth2 = new getMeasuredWidth(enumMap, -10);
                                            i4 = 30;
                                        }
                                        if (getmeasuredwidth2 != null) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                                        } else {
                                            getmeasuredwidth2 = getmeasuredwidth;
                                        }
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                                        lookaheadScopeKt.MediaSessionCompatToken();
                                        int i6 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                                        measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                                        }
                                        measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                                        if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3 && getMeasuredWidth.serializer(-10, i6)) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            EnumMap enumMap2 = new EnumMap(MeasureScope.class);
                                            enumMap2.put(MeasureScope.AD_USER_DATA, measureScopeDefaultImpls5);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1(enumMap2, -10, (Boolean) null, (String) null), true);
                                        } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity()) && (i6 == 0 || i6 == i4)) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity()) && zzddVar != null && (bundle = zzddVar.read) != null && getMeasuredWidth.serializer(i4, i6)) {
                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                            while (it.hasNext()) {
                                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                                }
                                            }
                                        }
                                        boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                                        if (boolRemoteActionCompatParcelizer != null || boolRemoteActionCompatParcelizer.booleanValue()) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.MediaSessionCompatToken();
                                            getLookaheadDelegate getlookaheaddelegate8 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                                            getlookaheaddelegate8.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                            if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                                noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                                noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                        NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                        setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                                        getLookaheadDelegate getlookaheaddelegate9 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                                        if (!setcomposedwithreusablecontenthost3.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                                                                getlookaheaddelegate9.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                                MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                                accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                                measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                                                            getlookaheaddelegate9.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                            measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                                            lookaheadScopeKt2.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                                        }
                                        lookaheadScopeImpl = lookaheadScopeKt.write;
                                        if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                                            j3 = j2;
                                            lookaheadScopeImpl.serializer(j3);
                                        } else {
                                            j3 = j2;
                                        }
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        memoryCacheService = noWindowInsetsAnimation.read;
                                        if (memoryCacheService.MediaMetadataCompat() && memoryCacheService.MediaDescriptionCompat()) {
                                            LookaheadScopeKt lookaheadScopeKt3 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt3);
                                            lookaheadScopeKt3.ComponentActivity.IconCompatParcelizer(null);
                                        }
                                        if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                                            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                            if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                                strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                                lookaheadScopeKt.MediaSessionCompatToken();
                                                string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                                                zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                                                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                                if (!zIsEmpty && !zIsEmpty2) {
                                                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                                                    if (!strComponentActivity.equals(string2)) {
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                        zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                                        lookaheadScopeKt.MediaSessionCompatToken();
                                                        lookaheadScopeKt.MediaSessionCompatToken();
                                                        if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                                            boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                                        } else {
                                                            boolValueOf = null;
                                                        }
                                                        SharedPreferences.Editor editorEdit2 = lookaheadScopeKt.serializer().edit();
                                                        editorEdit2.clear();
                                                        editorEdit2.apply();
                                                        if (boolValueOf != null) {
                                                            lookaheadScopeKt.MediaSessionCompatToken();
                                                            SharedPreferences.Editor editorEdit3 = lookaheadScopeKt.serializer().edit();
                                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                            editorEdit3.apply();
                                                        }
                                                        lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                                        lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                                        lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                                        lookaheadScopeImpl.serializer(j3);
                                                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                                    }
                                                }
                                                String strComponentActivity2 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                                lookaheadScopeKt.MediaSessionCompatToken();
                                                SharedPreferences.Editor editorEdit4 = lookaheadScopeKt.serializer().edit();
                                                editorEdit4.putString("gmp_app_id", strComponentActivity2);
                                                editorEdit4.apply();
                                            }
                                            if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                                                r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                            }
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                                            try {
                                                lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused4) {
                                                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai2 = lookaheadScopeKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                                if (!TextUtils.isEmpty(r8lambdalmkbrrgswwtv97obrsj7trj7ai2.RatingCompat())) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Remote config removed with active feature rollouts");
                                                    r8lambdalmkbrrgswwtv97obrsj7trj7ai2.IconCompatParcelizer(null);
                                                }
                                            }
                                            if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                                zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                                                sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                if ((sharedPreferences != null || !sharedPreferences.contains("deferred_analytics_collection")) && !setcomposedwithreusablecontenthost.MediaSessionCompatQueueItem()) {
                                                    lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                                }
                                                if (zWrite2) {
                                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                    noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                                                }
                                                triggerCallback triggercallback = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                                                LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                                                triggercallback.serializer.MediaDescriptionCompat();
                                                lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                                                lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                                            }
                                            break;
                                        } else if (lookaheadScopeKtLookaheadScope224.write()) {
                                            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                            if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                                                zzgsVar5 = zzgsVar4;
                                            } else {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar5 = zzgsVar4;
                                                zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                                            }
                                            if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                                            if (!accessgetTvMediaContextMenucp.serializer(context).write() && !setcomposedwithreusablecontenthost.serializer()) {
                                                if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                                        } else {
                                            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                        }
                                        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                        if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                                            onlayoutrectchangeddefault2.MediaSessionCompatToken();
                                            if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                                                long jIntValue = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.MediaSessionCompatToken();
                                                if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                                                    noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                                                }
                                                noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                                            }
                                        }
                                        lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                                        return;
                                    }
                                    lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                                    getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        i4 = 30;
                                    } else {
                                        i4 = 30;
                                        if (i3 != 0 || i3 == 30 || i3 == 10 || i3 == 40) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                        }
                                    }
                                    getmeasuredwidth2 = null;
                                    if (getmeasuredwidth2 != null) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                                    } else {
                                        getmeasuredwidth2 = getmeasuredwidth;
                                    }
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                                    lookaheadScopeKt.MediaSessionCompatToken();
                                    int i7 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                                    measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                                    }
                                    measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                                    if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3) {
                                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                                it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                            while (it.hasNext()) {
                                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                            while (it.hasNext()) {
                                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                        while (it.hasNext()) {
                                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                            }
                                        }
                                    }
                                    boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                                    if (boolRemoteActionCompatParcelizer != null) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaSessionCompatToken();
                                        getLookaheadDelegate getlookaheaddelegate9 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                                        getlookaheaddelegate9.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                        if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                            noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                            noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                    NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                    setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                                    getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                                    if (!setcomposedwithreusablecontenthost3.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                                                            getlookaheaddelegate10.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                            measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                                                        getlookaheaddelegate10.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                        measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                                    }
                                                }
                                            };
                                        }
                                        LookaheadScopeKt lookaheadScopeKt4 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt4);
                                        lookaheadScopeKt4.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                                    } else {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaSessionCompatToken();
                                        getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                                        getlookaheaddelegate10.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                        if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                            noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                            noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                    NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                    setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                                    getLookaheadDelegate getlookaheaddelegate11 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                                    if (!setcomposedwithreusablecontenthost3.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate11);
                                                            getlookaheaddelegate11.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                            measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate11);
                                                        getlookaheaddelegate11.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                        measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                                    }
                                                }
                                            };
                                        }
                                        LookaheadScopeKt lookaheadScopeKt5 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt5);
                                        lookaheadScopeKt5.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                                    }
                                    lookaheadScopeImpl = lookaheadScopeKt.write;
                                    if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                                        j3 = j2;
                                        lookaheadScopeImpl.serializer(j3);
                                    } else {
                                        j3 = j2;
                                    }
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    memoryCacheService = noWindowInsetsAnimation.read;
                                    if (memoryCacheService.MediaMetadataCompat()) {
                                        LookaheadScopeKt lookaheadScopeKt6 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt6);
                                        lookaheadScopeKt6.ComponentActivity.IconCompatParcelizer(null);
                                    }
                                    if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                                        onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                        if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                            lookaheadScopeKt.MediaSessionCompatToken();
                                            string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                                            boolean zIsEmpty3 = TextUtils.isEmpty(string2);
                                            if (!zIsEmpty) {
                                                accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                                                if (!strComponentActivity.equals(string2)) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                                    lookaheadScopeKt.MediaSessionCompatToken();
                                                    lookaheadScopeKt.MediaSessionCompatToken();
                                                    if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                                        boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                                    } else {
                                                        boolValueOf = null;
                                                    }
                                                    SharedPreferences.Editor editorEdit5 = lookaheadScopeKt.serializer().edit();
                                                    editorEdit5.clear();
                                                    editorEdit5.apply();
                                                    if (boolValueOf != null) {
                                                        lookaheadScopeKt.MediaSessionCompatToken();
                                                        SharedPreferences.Editor editorEdit6 = lookaheadScopeKt.serializer().edit();
                                                        editorEdit6.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                        editorEdit6.apply();
                                                    }
                                                    lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                                    lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                                    lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                                    lookaheadScopeImpl.serializer(j3);
                                                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                                }
                                            }
                                            String strComponentActivity3 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                            lookaheadScopeKt.MediaSessionCompatToken();
                                            SharedPreferences.Editor editorEdit7 = lookaheadScopeKt.serializer().edit();
                                            editorEdit7.putString("gmp_app_id", strComponentActivity3);
                                            editorEdit7.apply();
                                        }
                                        if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                                            r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                        }
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                                        lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                                            sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            if (sharedPreferences != null) {
                                                lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                            } else {
                                                lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                            }
                                            if (zWrite2) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                                            }
                                            triggerCallback triggercallback2 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                                            LookaheadScopeKtLookaheadScope221.serializer(triggercallback2);
                                            triggercallback2.serializer.MediaDescriptionCompat();
                                            lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                                            lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                                        }
                                    } else if (lookaheadScopeKtLookaheadScope224.write()) {
                                        onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                        if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar5 = zzgsVar4;
                                            zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                                        } else {
                                            zzgsVar5 = zzgsVar4;
                                        }
                                        if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                                        if (!accessgetTvMediaContextMenucp.serializer(context).write()) {
                                            if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                                    } else {
                                        onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                    }
                                    accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                    if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                                        onlayoutrectchangeddefault2.MediaSessionCompatToken();
                                        if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                                            long jIntValue2 = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                                            long jNextInt2 = new Random().nextInt(5000);
                                            lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                            jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.MediaSessionCompatToken();
                                            if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                                                noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                                            }
                                            noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                                        }
                                    }
                                    lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                                    return;
                                }
                                getLookaheadDelegate getlookaheaddelegate11 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate11);
                                getlookaheaddelegate11.serializer.RemoteActionCompatParcelizer("Failed to load metadata: Metadata bundle is null");
                                numValueOf = null;
                                if (numValueOf != null) {
                                    stringArray = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    } else {
                                        listAsList = null;
                                    }
                                    break;
                                } else {
                                    listAsList = null;
                                }
                                if (listAsList != null) {
                                    resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                                } else if (listAsList.isEmpty()) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Safelisted event list is empty. Ignoring");
                                } else {
                                    it2 = listAsList.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            str5 = (String) it2.next();
                                            onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope226.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                                        } else {
                                            resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                                        }
                                    } while (onlayoutrectchangeddefault3.read("safelisted event", str5));
                                }
                                if (packageManager != null) {
                                    resumeVar2.MediaSessionCompatResultReceiverWrapper = ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context2}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() ? 1 : 0;
                                } else {
                                    resumeVar2.MediaSessionCompatResultReceiverWrapper = 0;
                                }
                                ((LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                                resumeVar2.RemoteActionCompatParcelizer = true;
                                onFirstVisibleElement = new OnFirstVisibleElement(lookaheadScopeKtLookaheadScope224);
                                onFirstVisibleElement.read();
                                lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onFirstVisibleElement;
                                if (!onFirstVisibleElement.RemoteActionCompatParcelizer) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                                    return;
                                }
                                onFirstVisibleElement.write = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
                                ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                                onFirstVisibleElement.RemoteActionCompatParcelizer = true;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
                                zzgsVar2 = getlookaheaddelegate.MediaMetadataCompat;
                                zzgsVar3 = getlookaheaddelegate.PlaybackStateCompat;
                                zzgsVar4 = getlookaheaddelegate.serializer;
                                setcomposedwithreusablecontenthost.read();
                                zzgsVar2.serializer(133005L, "App measurement initialized, version");
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar2.RemoteActionCompatParcelizer("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                strMediaSessionCompatResultReceiverWrapper = resumeVar.MediaSessionCompatResultReceiverWrapper();
                                if (onlayoutrectchangeddefault4.IconCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, setcomposedwithreusablecontenthost.serializer)) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar2.RemoteActionCompatParcelizer("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar2.RemoteActionCompatParcelizer("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strMediaSessionCompatResultReceiverWrapper)));
                                }
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar.RemoteActionCompatParcelizer("Debug-level message logging enabled");
                                i2 = lookaheadScopeKtLookaheadScope224.serializer;
                                atomicInteger = lookaheadScopeKtLookaheadScope224.MediaBrowserCompatMediaItem;
                                if (i2 != atomicInteger.get()) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar4.serializer("Not all components initialized", Integer.valueOf(lookaheadScopeKtLookaheadScope224.serializer), Integer.valueOf(atomicInteger.get()));
                                }
                                lookaheadScopeKtLookaheadScope224.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                                j = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat;
                                noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope224.ComponentActivity;
                                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
                                lookaheadScopeKtLookaheadScope6.MediaSessionCompatToken();
                                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                getwindowek5ggoqMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem();
                                getwindowek5ggoq = getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
                                accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00);
                                if (getwindowek5ggoqMediaSessionCompatQueueItem == getwindowek5ggoq) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (zWrite) {
                                    onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                    if (onlayoutrectchangeddefault4.MediaSessionCompatQueueItem() == 1) {
                                        z2 = z;
                                    } else if (z) {
                                        z2 = true;
                                    } else {
                                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                        j2 = j;
                                    }
                                    onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                    IntentFilter intentFilter3 = new IntentFilter();
                                    intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                    j2 = j;
                                    FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter3, null, 2);
                                    getLookaheadDelegate getlookaheaddelegate12 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate12);
                                    getlookaheaddelegate12.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                                    if (z2) {
                                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                        lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                                    }
                                } else if (z) {
                                    z2 = true;
                                    onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                    IntentFilter intentFilter4 = new IntentFilter();
                                    intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                    j2 = j;
                                    FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter4, null, 2);
                                    getLookaheadDelegate getlookaheaddelegate13 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate13);
                                    getlookaheaddelegate13.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                                    if (z2) {
                                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                        lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                                    }
                                } else {
                                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                    j2 = j;
                                }
                                r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt.RemoteActionCompatParcelizer;
                                getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
                                i3 = getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read;
                                measureScopeDefaultImpls = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_storage", false);
                                measureScopeDefaultImpls2 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_analytics_storage", false);
                                measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                                if (measureScopeDefaultImpls == measureScopeDefaultImpls3) {
                                    getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                                    lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                                    if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                        EnumMap enumMap3 = new EnumMap(MeasureScope.class);
                                        enumMap3.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                        enumMap3.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                        getmeasuredwidth2 = new getMeasuredWidth(enumMap3, -10);
                                        i4 = 30;
                                    } else {
                                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            i4 = 30;
                                            if (i3 != 0) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                            } else {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                            }
                                        } else {
                                            i4 = 30;
                                        }
                                        getmeasuredwidth2 = null;
                                    }
                                } else {
                                    getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                                    lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                                    if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                        EnumMap enumMap4 = new EnumMap(MeasureScope.class);
                                        enumMap4.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                        enumMap4.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                        getmeasuredwidth2 = new getMeasuredWidth(enumMap4, -10);
                                        i4 = 30;
                                    } else {
                                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            i4 = 30;
                                            if (i3 != 0) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                            } else {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                            }
                                        } else {
                                            i4 = 30;
                                        }
                                        getmeasuredwidth2 = null;
                                    }
                                }
                                if (getmeasuredwidth2 != null) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                                } else {
                                    getmeasuredwidth2 = getmeasuredwidth;
                                }
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                                lookaheadScopeKt.MediaSessionCompatToken();
                                int i8 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                                measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                                if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                                }
                                measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                                if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3) {
                                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                            while (it.hasNext()) {
                                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                        while (it.hasNext()) {
                                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                        while (it.hasNext()) {
                                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                    it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                    while (it.hasNext()) {
                                        if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                        }
                                    }
                                }
                                boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                                if (boolRemoteActionCompatParcelizer != null) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaSessionCompatToken();
                                    getLookaheadDelegate getlookaheaddelegate14 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate14);
                                    getlookaheaddelegate14.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                    if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                        noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                        noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                                getLookaheadDelegate getlookaheaddelegate15 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                                if (!setcomposedwithreusablecontenthost3.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate15);
                                                        getlookaheaddelegate15.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                        measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate15);
                                                    getlookaheaddelegate15.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                    MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                    measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                                }
                                            }
                                        };
                                    }
                                    LookaheadScopeKt lookaheadScopeKt7 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt7);
                                    lookaheadScopeKt7.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                                } else {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaSessionCompatToken();
                                    getLookaheadDelegate getlookaheaddelegate15 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate15);
                                    getlookaheaddelegate15.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                    if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                        noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                        noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                                setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                                getLookaheadDelegate getlookaheaddelegate16 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                                if (!setcomposedwithreusablecontenthost3.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate16);
                                                        getlookaheaddelegate16.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                        measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate16);
                                                    getlookaheaddelegate16.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                    MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                    measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                                }
                                            }
                                        };
                                    }
                                    LookaheadScopeKt lookaheadScopeKt8 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt8);
                                    lookaheadScopeKt8.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                                }
                                lookaheadScopeImpl = lookaheadScopeKt.write;
                                if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                                    j3 = j2;
                                    lookaheadScopeImpl.serializer(j3);
                                } else {
                                    j3 = j2;
                                }
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                memoryCacheService = noWindowInsetsAnimation.read;
                                if (memoryCacheService.MediaMetadataCompat()) {
                                    LookaheadScopeKt lookaheadScopeKt9 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt9);
                                    lookaheadScopeKt9.ComponentActivity.IconCompatParcelizer(null);
                                }
                                if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                    if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                        lookaheadScopeKt.MediaSessionCompatToken();
                                        string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                                        boolean zIsEmpty4 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty) {
                                            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                                            if (!strComponentActivity.equals(string2)) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                                lookaheadScopeKt.MediaSessionCompatToken();
                                                lookaheadScopeKt.MediaSessionCompatToken();
                                                if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                                    boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                                } else {
                                                    boolValueOf = null;
                                                }
                                                SharedPreferences.Editor editorEdit8 = lookaheadScopeKt.serializer().edit();
                                                editorEdit8.clear();
                                                editorEdit8.apply();
                                                if (boolValueOf != null) {
                                                    lookaheadScopeKt.MediaSessionCompatToken();
                                                    SharedPreferences.Editor editorEdit9 = lookaheadScopeKt.serializer().edit();
                                                    editorEdit9.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit9.apply();
                                                }
                                                lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                                lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                                lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                                lookaheadScopeImpl.serializer(j3);
                                                r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                            }
                                        }
                                        String strComponentActivity4 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                        lookaheadScopeKt.MediaSessionCompatToken();
                                        SharedPreferences.Editor editorEdit10 = lookaheadScopeKt.serializer().edit();
                                        editorEdit10.putString("gmp_app_id", strComponentActivity4);
                                        editorEdit10.apply();
                                    }
                                    if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                    }
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                                    lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                                        sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        if (sharedPreferences != null) {
                                            lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                        } else {
                                            lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                        }
                                        if (zWrite2) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                                        }
                                        triggerCallback triggercallback3 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                                        LookaheadScopeKtLookaheadScope221.serializer(triggercallback3);
                                        triggercallback3.serializer.MediaDescriptionCompat();
                                        lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                                        lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                                    }
                                } else if (lookaheadScopeKtLookaheadScope224.write()) {
                                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                    if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar5 = zzgsVar4;
                                        zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                                    } else {
                                        zzgsVar5 = zzgsVar4;
                                    }
                                    if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                                    if (!accessgetTvMediaContextMenucp.serializer(context).write()) {
                                        if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                                } else {
                                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                }
                                accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                                    onlayoutrectchangeddefault2.MediaSessionCompatToken();
                                    if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                                        long jIntValue3 = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                                        long jNextInt3 = new Random().nextInt(5000);
                                        lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                        jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaSessionCompatToken();
                                        if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                                            noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                                        }
                                        noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                                    }
                                }
                                lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                                return;
                            }
                            installerPackageName = "manual_install";
                            packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                            if (packageInfo != null) {
                                applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    string = applicationLabel.toString();
                                } else {
                                    string = "Unknown";
                                }
                                str = packageInfo.versionName;
                                i = packageInfo.versionCode;
                            } else {
                                str4 = str2;
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused5) {
                            str3 = "Unknown";
                        }
                        str2 = installerPackageName;
                        resumeVar2.read = packageName;
                        resumeVar2.serializer = str2;
                        resumeVar2.IconCompatParcelizer = str;
                        resumeVar2.write = i;
                        resumeVar2.MediaSessionCompatQueueItem = string;
                        resumeVar2.RatingCompat = 0L;
                        iIconCompatParcelizer = lookaheadScopeKtLookaheadScope226.IconCompatParcelizer();
                        if (iIconCompatParcelizer == 0) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.PlaybackStateCompat.RemoteActionCompatParcelizer("App measurement collection enabled");
                        } else if (iIconCompatParcelizer == 1) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement deactivated via the manifest");
                        } else if (iIconCompatParcelizer == 3) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iIconCompatParcelizer == 4) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled via the manifest");
                        } else if (iIconCompatParcelizer == 6) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iIconCompatParcelizer == 7) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled via the global data collection setting");
                        } else if (iIconCompatParcelizer != 8) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled");
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.write.RemoteActionCompatParcelizer("Invalid scion state in identity");
                        } else {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled due to denied storage consent");
                        }
                        resumeVar2.MediaSessionCompatToken = "";
                        str6 = (String) TuplesKt.RemoteActionCompatParcelizer(-1772022421, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{context2, lookaheadScopeKtLookaheadScope226.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 1772022425);
                        if (TextUtils.isEmpty(str6)) {
                            str6 = str7;
                        }
                        resumeVar2.MediaSessionCompatToken = str6;
                        if (iIconCompatParcelizer == 0) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.PlaybackStateCompat.serializer("App measurement enabled for app package, google app id", resumeVar2.read, resumeVar2.MediaSessionCompatToken);
                            break;
                        }
                        resumeVar2.MediaBrowserCompatMediaItem = null;
                        setComposedWithReusableContentHost setcomposedwithreusablecontenthost3 = lookaheadScopeKtLookaheadScope226.PlaybackStateCompat;
                        lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("analytics.safelisted_events");
                        bundleMediaMetadataCompat = setcomposedwithreusablecontenthost3.MediaMetadataCompat();
                        if (bundleMediaMetadataCompat != null) {
                            if (bundleMediaMetadataCompat.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleMediaMetadataCompat.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                stringArray = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getResources().getStringArray(numValueOf.intValue());
                                if (stringArray == null) {
                                    listAsList = Arrays.asList(stringArray);
                                } else {
                                    listAsList = null;
                                }
                                break;
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                            } else if (listAsList.isEmpty()) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Safelisted event list is empty. Ignoring");
                            } else {
                                it2 = listAsList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        str5 = (String) it2.next();
                                        onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope226.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                                    } else {
                                        resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                                    }
                                } while (onlayoutrectchangeddefault3.read("safelisted event", str5));
                            }
                            if (packageManager != null) {
                                resumeVar2.MediaSessionCompatResultReceiverWrapper = ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context2}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() ? 1 : 0;
                            } else {
                                resumeVar2.MediaSessionCompatResultReceiverWrapper = 0;
                            }
                            ((LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                            resumeVar2.RemoteActionCompatParcelizer = true;
                            onFirstVisibleElement = new OnFirstVisibleElement(lookaheadScopeKtLookaheadScope224);
                            onFirstVisibleElement.read();
                            lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onFirstVisibleElement;
                            if (!onFirstVisibleElement.RemoteActionCompatParcelizer) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                                return;
                            }
                            onFirstVisibleElement.write = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
                            ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                            onFirstVisibleElement.RemoteActionCompatParcelizer = true;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
                            zzgsVar2 = getlookaheaddelegate.MediaMetadataCompat;
                            zzgsVar3 = getlookaheaddelegate.PlaybackStateCompat;
                            zzgsVar4 = getlookaheaddelegate.serializer;
                            setcomposedwithreusablecontenthost.read();
                            zzgsVar2.serializer(133005L, "App measurement initialized, version");
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar2.RemoteActionCompatParcelizer("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strMediaSessionCompatResultReceiverWrapper = resumeVar.MediaSessionCompatResultReceiverWrapper();
                            if (onlayoutrectchangeddefault4.IconCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, setcomposedwithreusablecontenthost.serializer)) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar2.RemoteActionCompatParcelizer("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar2.RemoteActionCompatParcelizer("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strMediaSessionCompatResultReceiverWrapper)));
                            }
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar.RemoteActionCompatParcelizer("Debug-level message logging enabled");
                            i2 = lookaheadScopeKtLookaheadScope224.serializer;
                            atomicInteger = lookaheadScopeKtLookaheadScope224.MediaBrowserCompatMediaItem;
                            if (i2 != atomicInteger.get()) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar4.serializer("Not all components initialized", Integer.valueOf(lookaheadScopeKtLookaheadScope224.serializer), Integer.valueOf(atomicInteger.get()));
                            }
                            lookaheadScopeKtLookaheadScope224.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                            j = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat;
                            noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope224.ComponentActivity;
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
                            lookaheadScopeKtLookaheadScope7.MediaSessionCompatToken();
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                            getwindowek5ggoqMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem();
                            getwindowek5ggoq = getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
                            accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                            zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00);
                            if (getwindowek5ggoqMediaSessionCompatQueueItem == getwindowek5ggoq) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zWrite) {
                                onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                if (onlayoutrectchangeddefault4.MediaSessionCompatQueueItem() == 1) {
                                    z2 = z;
                                } else if (z) {
                                    z2 = true;
                                } else {
                                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                    j2 = j;
                                }
                                onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                j2 = j;
                                FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter5, null, 2);
                                getLookaheadDelegate getlookaheaddelegate16 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate16);
                                getlookaheaddelegate16.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                                if (z2) {
                                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                    lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                                }
                            } else if (z) {
                                z2 = true;
                                onlayoutrectchangeddefault4.MediaSessionCompatToken();
                                IntentFilter intentFilter6 = new IntentFilter();
                                intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                j2 = j;
                                FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter6, null, 2);
                                getLookaheadDelegate getlookaheaddelegate17 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate17);
                                getlookaheaddelegate17.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                                if (z2) {
                                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                    lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                                }
                            } else {
                                onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                j2 = j;
                            }
                            r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt.RemoteActionCompatParcelizer;
                            getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
                            i3 = getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read;
                            measureScopeDefaultImpls = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_storage", false);
                            measureScopeDefaultImpls2 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_analytics_storage", false);
                            measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                            if (measureScopeDefaultImpls == measureScopeDefaultImpls3) {
                                getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                                lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                                if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                    EnumMap enumMap5 = new EnumMap(MeasureScope.class);
                                    enumMap5.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                    enumMap5.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                    getmeasuredwidth2 = new getMeasuredWidth(enumMap5, -10);
                                    i4 = 30;
                                } else {
                                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        i4 = 30;
                                        if (i3 != 0) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                        } else {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                        }
                                    } else {
                                        i4 = 30;
                                    }
                                    getmeasuredwidth2 = null;
                                }
                            } else {
                                getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                                lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                                if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                    EnumMap enumMap6 = new EnumMap(MeasureScope.class);
                                    enumMap6.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                    enumMap6.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                    getmeasuredwidth2 = new getMeasuredWidth(enumMap6, -10);
                                    i4 = 30;
                                } else {
                                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        i4 = 30;
                                        if (i3 != 0) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                        } else {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                        }
                                    } else {
                                        i4 = 30;
                                    }
                                    getmeasuredwidth2 = null;
                                }
                            }
                            if (getmeasuredwidth2 != null) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                            } else {
                                getmeasuredwidth2 = getmeasuredwidth;
                            }
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                            lookaheadScopeKt.MediaSessionCompatToken();
                            int i9 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                            measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                            if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                            }
                            measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                            if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3) {
                                if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                        while (it.hasNext()) {
                                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                    it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                    while (it.hasNext()) {
                                        if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                    it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                    while (it.hasNext()) {
                                        if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                while (it.hasNext()) {
                                    if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                    }
                                }
                            }
                            boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                            if (boolRemoteActionCompatParcelizer != null) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaSessionCompatToken();
                                getLookaheadDelegate getlookaheaddelegate18 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate18);
                                getlookaheaddelegate18.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                    noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                    noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                            setComposedWithReusableContentHost setcomposedwithreusablecontenthost4 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                            getLookaheadDelegate getlookaheaddelegate19 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                            if (!setcomposedwithreusablecontenthost4.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate19);
                                                    getlookaheaddelegate19.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                    MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                    measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate19);
                                                getlookaheaddelegate19.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                            }
                                        }
                                    };
                                }
                                LookaheadScopeKt lookaheadScopeKt10 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt10);
                                lookaheadScopeKt10.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                            } else {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaSessionCompatToken();
                                getLookaheadDelegate getlookaheaddelegate19 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate19);
                                getlookaheaddelegate19.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                                if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                    noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                    noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                            setComposedWithReusableContentHost setcomposedwithreusablecontenthost4 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                            getLookaheadDelegate getlookaheaddelegate110 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                            if (!setcomposedwithreusablecontenthost4.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate110);
                                                    getlookaheaddelegate110.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                    MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                    measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate110);
                                                getlookaheaddelegate110.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                                measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                            }
                                        }
                                    };
                                }
                                LookaheadScopeKt lookaheadScopeKt11 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt11);
                                lookaheadScopeKt11.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                            }
                            lookaheadScopeImpl = lookaheadScopeKt.write;
                            if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                                j3 = j2;
                                lookaheadScopeImpl.serializer(j3);
                            } else {
                                j3 = j2;
                            }
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            memoryCacheService = noWindowInsetsAnimation.read;
                            if (memoryCacheService.MediaMetadataCompat()) {
                                LookaheadScopeKt lookaheadScopeKt12 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt12);
                                lookaheadScopeKt12.ComponentActivity.IconCompatParcelizer(null);
                            }
                            if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                                onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                    lookaheadScopeKt.MediaSessionCompatToken();
                                    string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                                    boolean zIsEmpty5 = TextUtils.isEmpty(string2);
                                    if (!zIsEmpty) {
                                        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                                        if (!strComponentActivity.equals(string2)) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                            zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                            lookaheadScopeKt.MediaSessionCompatToken();
                                            lookaheadScopeKt.MediaSessionCompatToken();
                                            if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                                boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                            } else {
                                                boolValueOf = null;
                                            }
                                            SharedPreferences.Editor editorEdit11 = lookaheadScopeKt.serializer().edit();
                                            editorEdit11.clear();
                                            editorEdit11.apply();
                                            if (boolValueOf != null) {
                                                lookaheadScopeKt.MediaSessionCompatToken();
                                                SharedPreferences.Editor editorEdit12 = lookaheadScopeKt.serializer().edit();
                                                editorEdit12.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                editorEdit12.apply();
                                            }
                                            lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                            lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                            lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                            lookaheadScopeImpl.serializer(j3);
                                            r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                        }
                                    }
                                    String strComponentActivity5 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                    lookaheadScopeKt.MediaSessionCompatToken();
                                    SharedPreferences.Editor editorEdit13 = lookaheadScopeKt.serializer().edit();
                                    editorEdit13.putString("gmp_app_id", strComponentActivity5);
                                    editorEdit13.apply();
                                }
                                if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                }
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                                lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                                    sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                    if (sharedPreferences != null) {
                                        lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                    } else {
                                        lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                    }
                                    if (zWrite2) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                                    }
                                    triggerCallback triggercallback4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                                    LookaheadScopeKtLookaheadScope221.serializer(triggercallback4);
                                    triggercallback4.serializer.MediaDescriptionCompat();
                                    lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                                    lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                                }
                            } else if (lookaheadScopeKtLookaheadScope224.write()) {
                                onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                                if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar5 = zzgsVar4;
                                    zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                                } else {
                                    zzgsVar5 = zzgsVar4;
                                }
                                if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                                if (!accessgetTvMediaContextMenucp.serializer(context).write()) {
                                    if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                                    }
                                }
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                            } else {
                                onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                            }
                            accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                            if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                                onlayoutrectchangeddefault2.MediaSessionCompatToken();
                                if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                                    long jIntValue4 = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                                    long jNextInt4 = new Random().nextInt(5000);
                                    lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                    jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaSessionCompatToken();
                                    if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                                        noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                                    }
                                    noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                                }
                            }
                            lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                            return;
                        }
                        getLookaheadDelegate getlookaheaddelegate110 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate110);
                        getlookaheaddelegate110.serializer.RemoteActionCompatParcelizer("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            } else {
                                listAsList = null;
                            }
                            break;
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                        } else if (listAsList.isEmpty()) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                            getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Safelisted event list is empty. Ignoring");
                        } else {
                            it2 = listAsList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    str5 = (String) it2.next();
                                    onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope226.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                                } else {
                                    resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                                }
                            } while (onlayoutrectchangeddefault3.read("safelisted event", str5));
                        }
                        if (packageManager != null) {
                            resumeVar2.MediaSessionCompatResultReceiverWrapper = ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context2}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() ? 1 : 0;
                        } else {
                            resumeVar2.MediaSessionCompatResultReceiverWrapper = 0;
                        }
                        ((LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                        resumeVar2.RemoteActionCompatParcelizer = true;
                        onFirstVisibleElement = new OnFirstVisibleElement(lookaheadScopeKtLookaheadScope224);
                        onFirstVisibleElement.read();
                        lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onFirstVisibleElement;
                        if (!onFirstVisibleElement.RemoteActionCompatParcelizer) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                            return;
                        }
                        onFirstVisibleElement.write = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
                        ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                        onFirstVisibleElement.RemoteActionCompatParcelizer = true;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
                        zzgsVar2 = getlookaheaddelegate.MediaMetadataCompat;
                        zzgsVar3 = getlookaheaddelegate.PlaybackStateCompat;
                        zzgsVar4 = getlookaheaddelegate.serializer;
                        setcomposedwithreusablecontenthost.read();
                        zzgsVar2.serializer(133005L, "App measurement initialized, version");
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar2.RemoteActionCompatParcelizer("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strMediaSessionCompatResultReceiverWrapper = resumeVar.MediaSessionCompatResultReceiverWrapper();
                        if (onlayoutrectchangeddefault4.IconCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, setcomposedwithreusablecontenthost.serializer)) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar2.RemoteActionCompatParcelizer("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar2.RemoteActionCompatParcelizer("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strMediaSessionCompatResultReceiverWrapper)));
                        }
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar.RemoteActionCompatParcelizer("Debug-level message logging enabled");
                        i2 = lookaheadScopeKtLookaheadScope224.serializer;
                        atomicInteger = lookaheadScopeKtLookaheadScope224.MediaBrowserCompatMediaItem;
                        if (i2 != atomicInteger.get()) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar4.serializer("Not all components initialized", Integer.valueOf(lookaheadScopeKtLookaheadScope224.serializer), Integer.valueOf(atomicInteger.get()));
                        }
                        lookaheadScopeKtLookaheadScope224.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                        j = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat;
                        noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope224.ComponentActivity;
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope8 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope8);
                        lookaheadScopeKtLookaheadScope8.MediaSessionCompatToken();
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                        getwindowek5ggoqMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem();
                        getwindowek5ggoq = getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
                        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                        zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00);
                        if (getwindowek5ggoqMediaSessionCompatQueueItem == getwindowek5ggoq) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zWrite) {
                            onlayoutrectchangeddefault4.MediaSessionCompatToken();
                            if (onlayoutrectchangeddefault4.MediaSessionCompatQueueItem() == 1) {
                                z2 = z;
                            } else if (z) {
                                z2 = true;
                            } else {
                                onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                                j2 = j;
                            }
                            onlayoutrectchangeddefault4.MediaSessionCompatToken();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                            j2 = j;
                            FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter7, null, 2);
                            getLookaheadDelegate getlookaheaddelegate111 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate111);
                            getlookaheaddelegate111.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                            if (z2) {
                                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                            }
                        } else if (z) {
                            z2 = true;
                            onlayoutrectchangeddefault4.MediaSessionCompatToken();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                            j2 = j;
                            FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter8, null, 2);
                            getLookaheadDelegate getlookaheaddelegate112 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate112);
                            getlookaheaddelegate112.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                            if (z2) {
                                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                            }
                        } else {
                            onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                            j2 = j;
                        }
                        r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt.RemoteActionCompatParcelizer;
                        getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
                        i3 = getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read;
                        measureScopeDefaultImpls = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_storage", false);
                        measureScopeDefaultImpls2 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_analytics_storage", false);
                        measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                        if (measureScopeDefaultImpls == measureScopeDefaultImpls3) {
                            getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                            lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                            if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                EnumMap enumMap7 = new EnumMap(MeasureScope.class);
                                enumMap7.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                enumMap7.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                getmeasuredwidth2 = new getMeasuredWidth(enumMap7, -10);
                                i4 = 30;
                            } else {
                                if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    i4 = 30;
                                    if (i3 != 0) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                    } else {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                    }
                                } else {
                                    i4 = 30;
                                }
                                getmeasuredwidth2 = null;
                            }
                        } else {
                            getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                            lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                            if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                                EnumMap enumMap8 = new EnumMap(MeasureScope.class);
                                enumMap8.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                                enumMap8.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                                getmeasuredwidth2 = new getMeasuredWidth(enumMap8, -10);
                                i4 = 30;
                            } else {
                                if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    i4 = 30;
                                    if (i3 != 0) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                    } else {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                    }
                                } else {
                                    i4 = 30;
                                }
                                getmeasuredwidth2 = null;
                            }
                        }
                        if (getmeasuredwidth2 != null) {
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                        } else {
                            getmeasuredwidth2 = getmeasuredwidth;
                        }
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                        lookaheadScopeKt.MediaSessionCompatToken();
                        int i10 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                        measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                        if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                        }
                        measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                        if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3) {
                            if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                    it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                    while (it.hasNext()) {
                                        if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                while (it.hasNext()) {
                                    if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                while (it.hasNext()) {
                                    if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                            while (it.hasNext()) {
                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                }
                            }
                        }
                        boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                        if (boolRemoteActionCompatParcelizer != null) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaSessionCompatToken();
                            getLookaheadDelegate getlookaheaddelegate113 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate113);
                            getlookaheaddelegate113.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                            if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        setComposedWithReusableContentHost setcomposedwithreusablecontenthost4 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                        getLookaheadDelegate getlookaheaddelegate114 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                        if (!setcomposedwithreusablecontenthost4.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate114);
                                                getlookaheaddelegate114.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate114);
                                            getlookaheaddelegate114.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                            measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                        }
                                    }
                                };
                            }
                            LookaheadScopeKt lookaheadScopeKt13 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt13);
                            lookaheadScopeKt13.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                        } else {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaSessionCompatToken();
                            getLookaheadDelegate getlookaheaddelegate114 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate114);
                            getlookaheaddelegate114.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                            if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                                noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                                noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        setComposedWithReusableContentHost setcomposedwithreusablecontenthost4 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                        getLookaheadDelegate getlookaheaddelegate115 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                        if (!setcomposedwithreusablecontenthost4.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate115);
                                                getlookaheaddelegate115.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                                MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                                accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                                measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate115);
                                            getlookaheaddelegate115.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                            measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                        }
                                    }
                                };
                            }
                            LookaheadScopeKt lookaheadScopeKt14 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt14);
                            lookaheadScopeKt14.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                        }
                        lookaheadScopeImpl = lookaheadScopeKt.write;
                        if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                            j3 = j2;
                            lookaheadScopeImpl.serializer(j3);
                        } else {
                            j3 = j2;
                        }
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        memoryCacheService = noWindowInsetsAnimation.read;
                        if (memoryCacheService.MediaMetadataCompat()) {
                            LookaheadScopeKt lookaheadScopeKt15 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt15);
                            lookaheadScopeKt15.ComponentActivity.IconCompatParcelizer(null);
                        }
                        if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                            if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                lookaheadScopeKt.MediaSessionCompatToken();
                                string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                                boolean zIsEmpty6 = TextUtils.isEmpty(string2);
                                if (!zIsEmpty) {
                                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                                    if (!strComponentActivity.equals(string2)) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                        zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                        lookaheadScopeKt.MediaSessionCompatToken();
                                        lookaheadScopeKt.MediaSessionCompatToken();
                                        if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                            boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                        } else {
                                            boolValueOf = null;
                                        }
                                        SharedPreferences.Editor editorEdit14 = lookaheadScopeKt.serializer().edit();
                                        editorEdit14.clear();
                                        editorEdit14.apply();
                                        if (boolValueOf != null) {
                                            lookaheadScopeKt.MediaSessionCompatToken();
                                            SharedPreferences.Editor editorEdit15 = lookaheadScopeKt.serializer().edit();
                                            editorEdit15.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit15.apply();
                                        }
                                        lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                        lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                        lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                        lookaheadScopeImpl.serializer(j3);
                                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                    }
                                }
                                String strComponentActivity6 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                                lookaheadScopeKt.MediaSessionCompatToken();
                                SharedPreferences.Editor editorEdit16 = lookaheadScopeKt.serializer().edit();
                                editorEdit16.putString("gmp_app_id", strComponentActivity6);
                                editorEdit16.apply();
                            }
                            if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                                r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                            }
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                            lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                                sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                if (sharedPreferences != null) {
                                    lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                } else {
                                    lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                                }
                                if (zWrite2) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                                }
                                triggerCallback triggercallback5 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                                LookaheadScopeKtLookaheadScope221.serializer(triggercallback5);
                                triggercallback5.serializer.MediaDescriptionCompat();
                                lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                                lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                            }
                        } else if (lookaheadScopeKtLookaheadScope224.write()) {
                            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                            if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar5 = zzgsVar4;
                                zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                            } else {
                                zzgsVar5 = zzgsVar4;
                            }
                            if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                            if (!accessgetTvMediaContextMenucp.serializer(context).write()) {
                                if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                                }
                            }
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                        } else {
                            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                        }
                        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                        if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                            onlayoutrectchangeddefault2.MediaSessionCompatToken();
                            if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                                long jIntValue5 = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                                long jNextInt5 = new Random().nextInt(5000);
                                lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                                jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaSessionCompatToken();
                                if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                                    noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                                }
                                noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                            }
                        }
                        lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                        return;
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    str4 = SystemUtils.UNKNOWN;
                    str7 = "";
                    str6 = (String) TuplesKt.RemoteActionCompatParcelizer(-1772022421, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{context2, lookaheadScopeKtLookaheadScope226.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 1772022425);
                    if (TextUtils.isEmpty(str6)) {
                        str6 = str7;
                    }
                    resumeVar2.MediaSessionCompatToken = str6;
                    if (iIconCompatParcelizer == 0) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.PlaybackStateCompat.serializer("App measurement enabled for app package, google app id", resumeVar2.read, resumeVar2.MediaSessionCompatToken);
                    }
                    break;
                } catch (IllegalStateException e8) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.serializer.serializer("Fetching Google App Id failed with exception. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(packageName), e8);
                }
                string = "Unknown";
                str2 = str4;
                str = "Unknown";
                i = Integer.MIN_VALUE;
                resumeVar2.read = packageName;
                resumeVar2.serializer = str2;
                resumeVar2.IconCompatParcelizer = str;
                resumeVar2.write = i;
                resumeVar2.MediaSessionCompatQueueItem = string;
                resumeVar2.RatingCompat = 0L;
                iIconCompatParcelizer = lookaheadScopeKtLookaheadScope226.IconCompatParcelizer();
                if (iIconCompatParcelizer == 0) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.PlaybackStateCompat.RemoteActionCompatParcelizer("App measurement collection enabled");
                } else if (iIconCompatParcelizer == 1) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement deactivated via the manifest");
                } else if (iIconCompatParcelizer == 3) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iIconCompatParcelizer == 4) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled via the manifest");
                } else if (iIconCompatParcelizer == 6) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iIconCompatParcelizer == 7) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled via the global data collection setting");
                } else if (iIconCompatParcelizer != 8) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled");
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.write.RemoteActionCompatParcelizer("Invalid scion state in identity");
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaMetadataCompat.RemoteActionCompatParcelizer("App measurement disabled due to denied storage consent");
                }
                resumeVar2.MediaSessionCompatToken = "";
                resumeVar2.MediaBrowserCompatMediaItem = null;
                setComposedWithReusableContentHost setcomposedwithreusablecontenthost4 = lookaheadScopeKtLookaheadScope226.PlaybackStateCompat;
                lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("analytics.safelisted_events");
                bundleMediaMetadataCompat = setcomposedwithreusablecontenthost4.MediaMetadataCompat();
                if (bundleMediaMetadataCompat != null) {
                    if (bundleMediaMetadataCompat.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleMediaMetadataCompat.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        } else {
                            listAsList = null;
                        }
                        break;
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                    } else if (listAsList.isEmpty()) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Safelisted event list is empty. Ignoring");
                    } else {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                str5 = (String) it2.next();
                                onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope226.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                            } else {
                                resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                            }
                        } while (onlayoutrectchangeddefault3.read("safelisted event", str5));
                    }
                    if (packageManager != null) {
                        resumeVar2.MediaSessionCompatResultReceiverWrapper = ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context2}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() ? 1 : 0;
                    } else {
                        resumeVar2.MediaSessionCompatResultReceiverWrapper = 0;
                    }
                    ((LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                    resumeVar2.RemoteActionCompatParcelizer = true;
                    onFirstVisibleElement = new OnFirstVisibleElement(lookaheadScopeKtLookaheadScope224);
                    onFirstVisibleElement.read();
                    lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onFirstVisibleElement;
                    if (!onFirstVisibleElement.RemoteActionCompatParcelizer) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                        return;
                    }
                    onFirstVisibleElement.write = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
                    ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                    onFirstVisibleElement.RemoteActionCompatParcelizer = true;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
                    zzgsVar2 = getlookaheaddelegate.MediaMetadataCompat;
                    zzgsVar3 = getlookaheaddelegate.PlaybackStateCompat;
                    zzgsVar4 = getlookaheaddelegate.serializer;
                    setcomposedwithreusablecontenthost.read();
                    zzgsVar2.serializer(133005L, "App measurement initialized, version");
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar2.RemoteActionCompatParcelizer("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strMediaSessionCompatResultReceiverWrapper = resumeVar.MediaSessionCompatResultReceiverWrapper();
                    if (onlayoutrectchangeddefault4.IconCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, setcomposedwithreusablecontenthost.serializer)) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar2.RemoteActionCompatParcelizer("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar2.RemoteActionCompatParcelizer("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strMediaSessionCompatResultReceiverWrapper)));
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar.RemoteActionCompatParcelizer("Debug-level message logging enabled");
                    i2 = lookaheadScopeKtLookaheadScope224.serializer;
                    atomicInteger = lookaheadScopeKtLookaheadScope224.MediaBrowserCompatMediaItem;
                    if (i2 != atomicInteger.get()) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar4.serializer("Not all components initialized", Integer.valueOf(lookaheadScopeKtLookaheadScope224.serializer), Integer.valueOf(atomicInteger.get()));
                    }
                    lookaheadScopeKtLookaheadScope224.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                    j = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat;
                    noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope224.ComponentActivity;
                    LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope9 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope9);
                    lookaheadScopeKtLookaheadScope9.MediaSessionCompatToken();
                    LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                    getwindowek5ggoqMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem();
                    getwindowek5ggoq = getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
                    accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                    zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00);
                    if (getwindowek5ggoqMediaSessionCompatQueueItem == getwindowek5ggoq) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zWrite) {
                        onlayoutrectchangeddefault4.MediaSessionCompatToken();
                        if (onlayoutrectchangeddefault4.MediaSessionCompatQueueItem() == 1) {
                            z2 = z;
                        } else if (z) {
                            z2 = true;
                        } else {
                            onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                            j2 = j;
                        }
                        onlayoutrectchangeddefault4.MediaSessionCompatToken();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                        j2 = j;
                        FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter9, null, 2);
                        getLookaheadDelegate getlookaheaddelegate115 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate115);
                        getlookaheaddelegate115.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                        if (z2) {
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                            lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                        }
                    } else if (z) {
                        z2 = true;
                        onlayoutrectchangeddefault4.MediaSessionCompatToken();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                        j2 = j;
                        FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter10, null, 2);
                        getLookaheadDelegate getlookaheaddelegate116 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate116);
                        getlookaheaddelegate116.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                        if (z2) {
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                            lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                        }
                    } else {
                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                        j2 = j;
                    }
                    r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt.RemoteActionCompatParcelizer;
                    getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
                    i3 = getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read;
                    measureScopeDefaultImpls = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_storage", false);
                    measureScopeDefaultImpls2 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_analytics_storage", false);
                    measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                    if (measureScopeDefaultImpls == measureScopeDefaultImpls3) {
                        getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                        lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                        if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                            EnumMap enumMap9 = new EnumMap(MeasureScope.class);
                            enumMap9.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                            enumMap9.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                            getmeasuredwidth2 = new getMeasuredWidth(enumMap9, -10);
                            i4 = 30;
                        } else {
                            if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                i4 = 30;
                                if (i3 != 0) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                } else {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                }
                            } else {
                                i4 = 30;
                            }
                            getmeasuredwidth2 = null;
                        }
                    } else {
                        getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                        lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                        if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                            EnumMap enumMap10 = new EnumMap(MeasureScope.class);
                            enumMap10.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                            enumMap10.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                            getmeasuredwidth2 = new getMeasuredWidth(enumMap10, -10);
                            i4 = 30;
                        } else {
                            if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                i4 = 30;
                                if (i3 != 0) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                } else {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                                }
                            } else {
                                i4 = 30;
                            }
                            getmeasuredwidth2 = null;
                        }
                    }
                    if (getmeasuredwidth2 != null) {
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                    } else {
                        getmeasuredwidth2 = getmeasuredwidth;
                    }
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                    lookaheadScopeKt.MediaSessionCompatToken();
                    int i11 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                    measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                    if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                    }
                    measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                    if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3) {
                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                                layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                                it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                                while (it.hasNext()) {
                                    if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                            while (it.hasNext()) {
                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                            while (it.hasNext()) {
                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                        while (it.hasNext()) {
                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                            }
                        }
                    }
                    boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                    if (boolRemoteActionCompatParcelizer != null) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.MediaSessionCompatToken();
                        getLookaheadDelegate getlookaheaddelegate117 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate117);
                        getlookaheaddelegate117.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                        if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                            noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                            noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    setComposedWithReusableContentHost setcomposedwithreusablecontenthost5 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                    getLookaheadDelegate getlookaheaddelegate118 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                    if (!setcomposedwithreusablecontenthost5.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate118);
                                            getlookaheaddelegate118.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                            measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate118);
                                        getlookaheaddelegate118.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                        measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                    }
                                }
                            };
                        }
                        LookaheadScopeKt lookaheadScopeKt16 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt16);
                        lookaheadScopeKt16.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                    } else {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.MediaSessionCompatToken();
                        getLookaheadDelegate getlookaheaddelegate118 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate118);
                        getlookaheaddelegate118.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                        if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                            noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                            noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    setComposedWithReusableContentHost setcomposedwithreusablecontenthost5 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                    getLookaheadDelegate getlookaheaddelegate119 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                    if (!setcomposedwithreusablecontenthost5.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate119);
                                            getlookaheaddelegate119.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                            MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                            measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate119);
                                        getlookaheaddelegate119.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                        measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                    }
                                }
                            };
                        }
                        LookaheadScopeKt lookaheadScopeKt17 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt17);
                        lookaheadScopeKt17.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                    }
                    lookaheadScopeImpl = lookaheadScopeKt.write;
                    if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                        j3 = j2;
                        lookaheadScopeImpl.serializer(j3);
                    } else {
                        j3 = j2;
                    }
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    memoryCacheService = noWindowInsetsAnimation.read;
                    if (memoryCacheService.MediaMetadataCompat()) {
                        LookaheadScopeKt lookaheadScopeKt18 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt18);
                        lookaheadScopeKt18.ComponentActivity.IconCompatParcelizer(null);
                    }
                    if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                        onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                        if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                            lookaheadScopeKt.MediaSessionCompatToken();
                            string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                            boolean zIsEmpty7 = TextUtils.isEmpty(string2);
                            if (!zIsEmpty) {
                                accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                                if (!strComponentActivity.equals(string2)) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                    lookaheadScopeKt.MediaSessionCompatToken();
                                    lookaheadScopeKt.MediaSessionCompatToken();
                                    if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                        boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    SharedPreferences.Editor editorEdit17 = lookaheadScopeKt.serializer().edit();
                                    editorEdit17.clear();
                                    editorEdit17.apply();
                                    if (boolValueOf != null) {
                                        lookaheadScopeKt.MediaSessionCompatToken();
                                        SharedPreferences.Editor editorEdit18 = lookaheadScopeKt.serializer().edit();
                                        editorEdit18.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                        editorEdit18.apply();
                                    }
                                    lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                    lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                    lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                    lookaheadScopeImpl.serializer(j3);
                                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                                }
                            }
                            String strComponentActivity7 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                            lookaheadScopeKt.MediaSessionCompatToken();
                            SharedPreferences.Editor editorEdit19 = lookaheadScopeKt.serializer().edit();
                            editorEdit19.putString("gmp_app_id", strComponentActivity7);
                            editorEdit19.apply();
                        }
                        if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                            r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                        }
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                        lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                            sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                            if (sharedPreferences != null) {
                                lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                            } else {
                                lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                            }
                            if (zWrite2) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                            }
                            triggerCallback triggercallback6 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                            LookaheadScopeKtLookaheadScope221.serializer(triggercallback6);
                            triggercallback6.serializer.MediaDescriptionCompat();
                            lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                            lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                        }
                    } else if (lookaheadScopeKtLookaheadScope224.write()) {
                        onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                        if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar5 = zzgsVar4;
                            zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                        } else {
                            zzgsVar5 = zzgsVar4;
                        }
                        if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                        if (!accessgetTvMediaContextMenucp.serializer(context).write()) {
                            if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                            }
                        }
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                    } else {
                        onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                    }
                    accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                    if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                        onlayoutrectchangeddefault2.MediaSessionCompatToken();
                        if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                            long jIntValue6 = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                            long jNextInt6 = new Random().nextInt(5000);
                            lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                            jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaSessionCompatToken();
                            if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                                noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                            }
                            noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                        }
                    }
                    lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                    return;
                }
                getLookaheadDelegate getlookaheaddelegate119 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate119);
                getlookaheaddelegate119.serializer.RemoteActionCompatParcelizer("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    } else {
                        listAsList = null;
                    }
                    break;
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                } else if (listAsList.isEmpty()) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.RatingCompat.RemoteActionCompatParcelizer("Safelisted event list is empty. Ignoring");
                } else {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            str5 = (String) it2.next();
                            onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope226.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                        } else {
                            resumeVar2.MediaBrowserCompatMediaItem = listAsList;
                        }
                    } while (onlayoutrectchangeddefault3.read("safelisted event", str5));
                }
                if (packageManager != null) {
                    resumeVar2.MediaSessionCompatResultReceiverWrapper = ((Boolean) setNativeShader.read(2109582589, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{context2}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -2109582586)).booleanValue() ? 1 : 0;
                } else {
                    resumeVar2.MediaSessionCompatResultReceiverWrapper = 0;
                }
                ((LookaheadScopeKtLookaheadScope221) resumeVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                resumeVar2.RemoteActionCompatParcelizer = true;
                onFirstVisibleElement = new OnFirstVisibleElement(lookaheadScopeKtLookaheadScope224);
                onFirstVisibleElement.read();
                lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onFirstVisibleElement;
                if (!onFirstVisibleElement.RemoteActionCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
                    return;
                }
                onFirstVisibleElement.write = (JobScheduler) ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getSystemService("jobscheduler");
                ((LookaheadScopeKtLookaheadScope221) onFirstVisibleElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
                onFirstVisibleElement.RemoteActionCompatParcelizer = true;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
                zzgsVar2 = getlookaheaddelegate.MediaMetadataCompat;
                zzgsVar3 = getlookaheaddelegate.PlaybackStateCompat;
                zzgsVar4 = getlookaheaddelegate.serializer;
                setcomposedwithreusablecontenthost.read();
                zzgsVar2.serializer(133005L, "App measurement initialized, version");
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar2.RemoteActionCompatParcelizer("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strMediaSessionCompatResultReceiverWrapper = resumeVar.MediaSessionCompatResultReceiverWrapper();
                if (onlayoutrectchangeddefault4.IconCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, setcomposedwithreusablecontenthost.serializer)) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar2.RemoteActionCompatParcelizer("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar2.RemoteActionCompatParcelizer("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strMediaSessionCompatResultReceiverWrapper)));
                }
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar.RemoteActionCompatParcelizer("Debug-level message logging enabled");
                i2 = lookaheadScopeKtLookaheadScope224.serializer;
                atomicInteger = lookaheadScopeKtLookaheadScope224.MediaBrowserCompatMediaItem;
                if (i2 != atomicInteger.get()) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar4.serializer("Not all components initialized", Integer.valueOf(lookaheadScopeKtLookaheadScope224.serializer), Integer.valueOf(atomicInteger.get()));
                }
                lookaheadScopeKtLookaheadScope224.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = true;
                j = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat;
                noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope224.ComponentActivity;
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope10 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope10);
                lookaheadScopeKtLookaheadScope10.MediaSessionCompatToken();
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                getwindowek5ggoqMediaSessionCompatQueueItem = lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem();
                getwindowek5ggoq = getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE;
                accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                zWrite = setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00);
                if (getwindowek5ggoqMediaSessionCompatQueueItem == getwindowek5ggoq) {
                    z = true;
                } else {
                    z = false;
                }
                if (zWrite) {
                    onlayoutrectchangeddefault4.MediaSessionCompatToken();
                    if (onlayoutrectchangeddefault4.MediaSessionCompatQueueItem() == 1) {
                        z2 = z;
                    } else if (z) {
                        z2 = true;
                    } else {
                        onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                        j2 = j;
                    }
                    onlayoutrectchangeddefault4.MediaSessionCompatToken();
                    IntentFilter intentFilter11 = new IntentFilter();
                    intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                    j2 = j;
                    FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter11, null, 2);
                    getLookaheadDelegate getlookaheaddelegate1110 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1110);
                    getlookaheaddelegate1110.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                    if (z2) {
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                        lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                    }
                } else if (z) {
                    z2 = true;
                    onlayoutrectchangeddefault4.MediaSessionCompatToken();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                    j2 = j;
                    FocusListener.read(lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat, new getButtonXEK5gGoQ(lookaheadScopeKtLookaheadScope225, false, 3), intentFilter12, null, 2);
                    getLookaheadDelegate getlookaheaddelegate1111 = lookaheadScopeKtLookaheadScope225.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1111);
                    getlookaheaddelegate1111.MediaSessionCompatToken.RemoteActionCompatParcelizer("Registered app receiver");
                    if (z2) {
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                        lookaheadScopeKtLookaheadScope224.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(((Long) premeasure0kLqBqw.serializer.IconCompatParcelizer(null)).longValue());
                    }
                } else {
                    onlayoutrectchangeddefault = onlayoutrectchangeddefault4;
                    j2 = j;
                }
                r8lambdalmkbrrgswwtv97obrsj7trj7ai = lookaheadScopeKt.RemoteActionCompatParcelizer;
                getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
                i3 = getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read;
                measureScopeDefaultImpls = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_storage", false);
                measureScopeDefaultImpls2 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_analytics_storage", false);
                measureScopeDefaultImpls3 = MeasureScopeDefaultImpls.UNINITIALIZED;
                if (measureScopeDefaultImpls == measureScopeDefaultImpls3) {
                    getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                    lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                    if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                        EnumMap enumMap11 = new EnumMap(MeasureScope.class);
                        enumMap11.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                        enumMap11.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                        getmeasuredwidth2 = new getMeasuredWidth(enumMap11, -10);
                        i4 = 30;
                    } else {
                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            i4 = 30;
                            if (i3 != 0) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                            } else {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                            }
                        } else {
                            i4 = 30;
                        }
                        getmeasuredwidth2 = null;
                    }
                } else {
                    getmeasuredwidth = getmeasuredwidthMediaSessionCompatResultReceiverWrapper;
                    lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope225;
                    if (getMeasuredWidth.serializer(-10, lookaheadScopeKt.serializer().getInt("consent_source", 100))) {
                        EnumMap enumMap12 = new EnumMap(MeasureScope.class);
                        enumMap12.put(MeasureScope.AD_STORAGE, measureScopeDefaultImpls);
                        enumMap12.put(MeasureScope.ANALYTICS_STORAGE, measureScopeDefaultImpls2);
                        getmeasuredwidth2 = new getMeasuredWidth(enumMap12, -10);
                        i4 = 30;
                    } else {
                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            i4 = 30;
                            if (i3 != 0) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                            } else {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(new getMeasuredWidth(-10), false);
                            }
                        } else {
                            i4 = 30;
                        }
                        getmeasuredwidth2 = null;
                    }
                }
                if (getmeasuredwidth2 != null) {
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2, true);
                } else {
                    getmeasuredwidth2 = getmeasuredwidth;
                }
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth2);
                lookaheadScopeKt.MediaSessionCompatToken();
                int i12 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).read;
                measureScopeDefaultImpls4 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_personalization_signals", true);
                if (measureScopeDefaultImpls4 != measureScopeDefaultImpls3) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar3.serializer(measureScopeDefaultImpls4, "Default ad personalization consent from Manifest");
                }
                measureScopeDefaultImpls5 = setcomposedwithreusablecontenthost.read("google_analytics_default_allow_ad_user_data", true);
                if (measureScopeDefaultImpls5 == measureScopeDefaultImpls3) {
                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                            layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                            it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                            while (it.hasNext()) {
                                if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                        while (it.hasNext()) {
                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                    if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                        it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                        while (it.hasNext()) {
                            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                                noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i4, bundle);
                    it = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
                    while (it.hasNext()) {
                        if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, true);
                        }
                    }
                }
                boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_tcf_data_enabled");
                if (boolRemoteActionCompatParcelizer != null) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    noWindowInsetsAnimation.MediaSessionCompatToken();
                    getLookaheadDelegate getlookaheaddelegate1112 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1112);
                    getlookaheaddelegate1112.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                    if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                        noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                        noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                setComposedWithReusableContentHost setcomposedwithreusablecontenthost5 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                getLookaheadDelegate getlookaheaddelegate1113 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                if (!setcomposedwithreusablecontenthost5.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1113);
                                        getlookaheaddelegate1113.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                        measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1113);
                                    getlookaheaddelegate1113.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                    MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                    measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                }
                            }
                        };
                    }
                    LookaheadScopeKt lookaheadScopeKt19 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt19);
                    lookaheadScopeKt19.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar.RemoteActionCompatParcelizer("TCF client enabled.");
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    noWindowInsetsAnimation.MediaSessionCompatToken();
                    getLookaheadDelegate getlookaheaddelegate1113 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1113);
                    getlookaheaddelegate1113.MediaSessionCompatToken.RemoteActionCompatParcelizer("Register tcfPrefChangeListener.");
                    if (noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                        noWindowInsetsAnimation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new MeasuringIntrinsicsDefaultIntrinsicMeasurable(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223);
                        noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.MultiContentMeasurePolicyImpl
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                NoWindowInsetsAnimation noWindowInsetsAnimation2 = noWindowInsetsAnimation;
                                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                setComposedWithReusableContentHost setcomposedwithreusablecontenthost5 = lookaheadScopeKtLookaheadScope227.PlaybackStateCompat;
                                getLookaheadDelegate getlookaheaddelegate1114 = lookaheadScopeKtLookaheadScope227.ParcelableVolumeInfo;
                                if (!setcomposedwithreusablecontenthost5.write(null, premeasure0kLqBqw.addOnMultiWindowModeChangedListener)) {
                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1114);
                                        getlookaheaddelegate1114.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                        MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                        accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable);
                                        measuringIntrinsicsDefaultIntrinsicMeasurable.RemoteActionCompatParcelizer(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate1114);
                                    getlookaheaddelegate1114.PlaybackStateCompat.RemoteActionCompatParcelizer("IABTCF_TCString change picked up in listener.");
                                    MeasuringIntrinsicsDefaultIntrinsicMeasurable measuringIntrinsicsDefaultIntrinsicMeasurable2 = noWindowInsetsAnimation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                                    accessgetSystemNavigationDowncp.IconCompatParcelizer(measuringIntrinsicsDefaultIntrinsicMeasurable2);
                                    measuringIntrinsicsDefaultIntrinsicMeasurable2.RemoteActionCompatParcelizer(500L);
                                }
                            }
                        };
                    }
                    LookaheadScopeKt lookaheadScopeKt110 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt110);
                    lookaheadScopeKt110.MediaMetadataCompat().registerOnSharedPreferenceChangeListener(noWindowInsetsAnimation.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    noWindowInsetsAnimation.MediaSessionCompatQueueItem();
                }
                lookaheadScopeImpl = lookaheadScopeKt.write;
                if (lookaheadScopeImpl.RemoteActionCompatParcelizer() == 0) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar3.serializer(Long.valueOf(j2), "Persisting first open");
                    j3 = j2;
                    lookaheadScopeImpl.serializer(j3);
                } else {
                    j3 = j2;
                }
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                memoryCacheService = noWindowInsetsAnimation.read;
                if (memoryCacheService.MediaMetadataCompat()) {
                    LookaheadScopeKt lookaheadScopeKt111 = ((LookaheadScopeKtLookaheadScope221) memoryCacheService.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt111);
                    lookaheadScopeKt111.ComponentActivity.IconCompatParcelizer(null);
                }
                if (lookaheadScopeKtLookaheadScope224.RemoteActionCompatParcelizer()) {
                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                    if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        strComponentActivity = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                        lookaheadScopeKt.MediaSessionCompatToken();
                        string2 = lookaheadScopeKt.serializer().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strComponentActivity);
                        boolean zIsEmpty8 = TextUtils.isEmpty(string2);
                        if (!zIsEmpty) {
                            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strComponentActivity);
                            if (!strComponentActivity.equals(string2)) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                zzgsVar2.RemoteActionCompatParcelizer("Rechecking which service to use due to a GMP App Id change");
                                lookaheadScopeKt.MediaSessionCompatToken();
                                lookaheadScopeKt.MediaSessionCompatToken();
                                if (lookaheadScopeKt.serializer().contains("measurement_enabled")) {
                                    boolValueOf = Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled", true));
                                } else {
                                    boolValueOf = null;
                                }
                                SharedPreferences.Editor editorEdit110 = lookaheadScopeKt.serializer().edit();
                                editorEdit110.clear();
                                editorEdit110.apply();
                                if (boolValueOf != null) {
                                    lookaheadScopeKt.MediaSessionCompatToken();
                                    SharedPreferences.Editor editorEdit111 = lookaheadScopeKt.serializer().edit();
                                    editorEdit111.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit111.apply();
                                }
                                lookaheadScopeKtLookaheadScope224.read().MediaSessionCompatQueueItem();
                                lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.ComponentActivity();
                                lookaheadScopeKtLookaheadScope224.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatQueueItem();
                                lookaheadScopeImpl.serializer(j3);
                                r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                            }
                        }
                        String strComponentActivity8 = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity();
                        lookaheadScopeKt.MediaSessionCompatToken();
                        SharedPreferences.Editor editorEdit112 = lookaheadScopeKt.serializer().edit();
                        editorEdit112.putString("gmp_app_id", strComponentActivity8);
                        editorEdit112.apply();
                    }
                    if (!lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
                        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(null);
                    }
                    LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                    noWindowInsetsAnimation.MediaMetadataCompat.set(r8lambdalmkbrrgswwtv97obrsj7trj7ai.RatingCompat());
                    lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    if (!TextUtils.isEmpty(lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().ComponentActivity())) {
                        zWrite2 = lookaheadScopeKtLookaheadScope224.write();
                        sharedPreferences = lookaheadScopeKt.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        if (sharedPreferences != null) {
                            lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                        } else {
                            lookaheadScopeKt.RemoteActionCompatParcelizer(!zWrite2);
                        }
                        if (zWrite2) {
                            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                            noWindowInsetsAnimation.MediaSessionCompatResultReceiverWrapper();
                        }
                        triggerCallback triggercallback7 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatToken;
                        LookaheadScopeKtLookaheadScope221.serializer(triggercallback7);
                        triggercallback7.serializer.MediaDescriptionCompat();
                        lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
                        lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat().serializer(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
                    }
                } else if (lookaheadScopeKtLookaheadScope224.write()) {
                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                    if (onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.INTERNET")) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar5 = zzgsVar4;
                        zzgsVar5.RemoteActionCompatParcelizer("App is missing INTERNET permission");
                    } else {
                        zzgsVar5 = zzgsVar4;
                    }
                    if (!onlayoutrectchangeddefault2.IconCompatParcelizer("android.permission.ACCESS_NETWORK_STATE")) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        zzgsVar5.RemoteActionCompatParcelizer("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    context = lookaheadScopeKtLookaheadScope224.MediaDescriptionCompat;
                    if (!accessgetTvMediaContextMenucp.serializer(context).write()) {
                        if (!onLayoutRectChangeddefault.IconCompatParcelizer(context)) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!onLayoutRectChangeddefault.RemoteActionCompatParcelizer(context)) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar5.RemoteActionCompatParcelizer("AppMeasurementService not registered/enabled");
                        }
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar5.RemoteActionCompatParcelizer("Uploading is not possible. App measurement disabled");
                } else {
                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                }
                accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                    onlayoutrectchangeddefault2.MediaSessionCompatToken();
                    if (onlayoutrectchangeddefault2.MediaSessionCompatQueueItem() == 1) {
                        long jIntValue7 = ((Integer) premeasure0kLqBqw.onNewIntent.IconCompatParcelizer(null)).intValue();
                        long jNextInt7 = new Random().nextInt(5000);
                        lookaheadScopeKtLookaheadScope224.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                        jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            zzgsVar3.serializer(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                        noWindowInsetsAnimation.MediaSessionCompatToken();
                        if (noWindowInsetsAnimation.PlaybackStateCompatCustomAction == null) {
                            noWindowInsetsAnimation.PlaybackStateCompatCustomAction = new maxHeight(noWindowInsetsAnimation, lookaheadScopeKtLookaheadScope223, 0);
                        }
                        noWindowInsetsAnimation.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(jMax);
                    }
                }
                lookaheadScopeKt.MediaDescriptionCompat.serializer(true);
                return;
            case 13:
                write();
                return;
            case 14:
                IconCompatParcelizer();
                return;
            case 15:
                serializer();
                return;
            case 16:
                MediaBrowserCompatMediaItem();
                return;
            case 17:
                MediaDescriptionCompat();
                return;
            case 18:
                RatingCompat();
                return;
            case 19:
                MediaMetadataCompat();
                return;
            case 20:
                MediaSessionCompatQueueItem();
                return;
            case 21:
                MediaSessionCompatToken();
                return;
            case 22:
                MediaSessionCompatResultReceiverWrapper();
                return;
            default:
                try {
                    read();
                    return;
                } catch (Error e9) {
                    synchronized (((LookaheadDelegate) this.write).RemoteActionCompatParcelizer) {
                        ((LookaheadDelegate) this.write).MediaSessionCompatQueueItem = LookaheadCapablePlaceablecaptureRulers1.IDLE;
                        throw e9;
                    }
                }
        }
    }

    public String toString() {
        if (this.read != 23) {
            return super.toString();
        }
        Runnable runnable = (Runnable) this.IconCompatParcelizer;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + ((LookaheadDelegate) this.write).MediaSessionCompatQueueItem + "}";
    }

    public /* synthetic */ zzc(Object obj, Object obj2, boolean z, int i) {
        this.read = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
    }

    public /* synthetic */ zzc(Object obj, int i, Object obj2) {
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    public zzc(LookaheadDelegate lookaheadDelegate) {
        this.read = 23;
        this.write = lookaheadDelegate;
    }
}
