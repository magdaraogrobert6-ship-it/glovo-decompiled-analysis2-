package io.sentry.metrics;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker$startWork$1;
import androidx.work.impl.WorkManagerImpl;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.components.DependencyException;
import com.logistics.rider.glovo.R;
import com.mapbox.navigator.MapboxNavigationNativeInitializer;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$ScreenType;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.map.integration.mapbox.InitialiseMapBoxNavigation$initializeOnIo$1;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.grpc.internal.CallTracer;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.transport.ResultReceiver;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AbsSavedState;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AdjustPurchaseVerificationResult;
import o.EnumColumnAdapter;
import o.FocusListener;
import o.LayoutHelperBidiRun;
import o.LookaheadCapablePlaceableCompanion;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.OnRemeasuredModifier;
import o.OnVisibilityChangedNode;
import o.ShortNewsContentCardView;
import o.TextUnitSaverlambda0;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTextBottomcp;
import o.accessrequireViewFactoryHolder;
import o.backgroundTimerFiredI;
import o.convertStringJsonArrayToListlambda0;
import o.createFromParcel;
import o.createQuery;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.ensureSubDecor;
import o.executeAsList;
import o.executelambda4;
import o.gdprForgetMeI;
import o.getAlignmentLinesMap;
import o.getAllSemanticsNodesToMap;
import o.getAndroidBold;
import o.getAndroidTypefaceStyle;
import o.getColorIntegerOrNulllambda0;
import o.getContentViewGroupParentLayout;
import o.getDeleteEK5gGoQ;
import o.getDoubleOrNull;
import o.getError;
import o.getHasMeasureResult;
import o.getIterationDuration;
import o.getLiveRegiondelegate;
import o.getMeasureResultui;
import o.getScrollRange;
import o.getSharedElementTargetNames;
import o.getSupportCompoundDrawablesTintMode;
import o.getTailui;
import o.getXmlParser;
import o.h6;
import o.h8;
import o.hasNestedScrollingParent;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.indexForKey;
import o.insertBasedOnParentOffset;
import o.insertTextAtCursordefault;
import o.invalidateMeasurement;
import o.invalidateSemanticsui;
import o.isAutomaticGeofenceRequestsEnabled;
import o.isCurrentlyDisplayingInAppMessage;
import o.isOpenInternalroom_runtime;
import o.lambdaverifyPlayStorePurchase45;
import o.lineEndToVisibleEnd;
import o.loadCachedui_text;
import o.mergeJsonObjects;
import o.newTransaction;
import o.o1;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.postAnimationRunner;
import o.prepareForActivityTransitionCarryover;
import o.provideRelativeRulerValue;
import o.publishErrorlambda1;
import o.q0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I;
import o.r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo;
import o.requestBannersRefreshlambda1;
import o.requestRemeasureui;
import o.setBannerHeightlambda0;
import o.setLastReportedResult;
import o.setNativePathEffect;
import o.setNativeStrokeCapCSYIeUk;
import o.setOnAttachui;
import o.setOnSessionTrackingFailedListener;
import o.setPrevious;
import o.setRotationY;
import o.setSupportBackgroundTintList;
import o.setToSaturationimpl;
import o.setVerticalBias;
import o.transactionWithResultsuspendImpl;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.updatePlacedUnderMotionFrameOfReference;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public class MetricsBatchProcessor implements getMeasureResultui, IconCompatParcelizer {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public Object IconCompatParcelizer;
    public final Object MediaSessionCompatQueueItem;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Object write;

    public setNativeStrokeCapCSYIeUk RemoteActionCompatParcelizer(long j, setNativePathEffect setnativepatheffect) {
        synchronized (((ArrayList) this.IconCompatParcelizer)) {
            if (((ArrayList) this.IconCompatParcelizer).isEmpty()) {
                setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk = new setNativeStrokeCapCSYIeUk();
                setnativestrokecapcsyieuk.serializer = j;
                setnativestrokecapcsyieuk.IconCompatParcelizer = -1L;
                setnativestrokecapcsyieuk.read = setnativepatheffect;
                return setnativestrokecapcsyieuk;
            }
            setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk2 = (setNativeStrokeCapCSYIeUk) ((ArrayList) this.IconCompatParcelizer).remove(0);
            setnativestrokecapcsyieuk2.serializer = j;
            setnativestrokecapcsyieuk2.IconCompatParcelizer = -1L;
            setnativestrokecapcsyieuk2.read = setnativepatheffect;
            return setnativestrokecapcsyieuk2;
        }
    }

    public void RemoteActionCompatParcelizer(String str, ArrayList arrayList, long j) {
        synchronized (((ArrayList) this.serializer)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk = (setNativeStrokeCapCSYIeUk) arrayList.get(i);
                if (setnativestrokecapcsyieuk.read.RemoteActionCompatParcelizer.equals(str) && setnativestrokecapcsyieuk.IconCompatParcelizer < 0) {
                    setnativestrokecapcsyieuk.IconCompatParcelizer = j;
                }
            }
        }
    }

    public MetricsBatchProcessor(int i) {
        if (i != 3) {
            this.RemoteActionCompatParcelizer = new int[]{2131230861, 2131230859, 2131230785};
            this.serializer = new int[]{2131230809, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            this.write = new int[]{2131230858, 2131230860, 2131230802, R.drawable.abc_text_cursor_material, 2131230855, 2131230856, 2131230857};
            this.read = new int[]{2131230834, R.drawable.abc_cab_background_internal_bg, 2131230833};
            this.MediaSessionCompatQueueItem = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            this.IconCompatParcelizer = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            return;
        }
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.serializer = new ArrayList();
        this.write = new ArrayList();
        this.read = new ArrayList();
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.IconCompatParcelizer = new ArrayList();
    }

    public void read(long j, long j2, ArrayList arrayList) {
        arrayList.getClass();
        synchronized (((ArrayList) this.serializer)) {
            arrayList.clear();
            RemoteActionCompatParcelizer(j, j2, arrayList, (ArrayList) this.RemoteActionCompatParcelizer);
            RemoteActionCompatParcelizer(j, j2, arrayList, (ArrayList) this.serializer);
        }
    }

    public void RemoteActionCompatParcelizer(long j, long j2, List list, ArrayList arrayList) {
        ArrayList arrayList2;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk = (setNativeStrokeCapCSYIeUk) arrayList.get(size);
                long j3 = setnativestrokecapcsyieuk.IconCompatParcelizer;
                if (j3 > 0 && j3 < j) {
                    setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk2 = (setNativeStrokeCapCSYIeUk) arrayList.remove(size);
                    setnativestrokecapcsyieuk2.getClass();
                    synchronized (((ArrayList) this.IconCompatParcelizer)) {
                        try {
                            ((ArrayList) this.IconCompatParcelizer).add(setnativestrokecapcsyieuk2);
                        } catch (OutOfMemoryError unused) {
                            ((ArrayList) this.IconCompatParcelizer).clear();
                            ((ArrayList) this.IconCompatParcelizer).add(setnativestrokecapcsyieuk2);
                        }
                    }
                } else if (setnativestrokecapcsyieuk.serializer < j2) {
                    ((ArrayList) this.write).add(setnativestrokecapcsyieuk);
                    if (arrayList.equals((ArrayList) this.serializer) && setnativestrokecapcsyieuk.IconCompatParcelizer == -1) {
                        setnativestrokecapcsyieuk.IconCompatParcelizer = j;
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (((ArrayList) this.write).size() <= 0) {
            return;
        }
        int size2 = ((ArrayList) this.write).size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            if (((ArrayList) this.MediaSessionCompatQueueItem).contains(Integer.valueOf(i3))) {
                ((ArrayList) this.read).add(Integer.valueOf(i3));
            } else {
                setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk3 = (setNativeStrokeCapCSYIeUk) ((ArrayList) this.write).get(i3);
                int size3 = ((ArrayList) this.write).size();
                for (int i4 = i3 + 1; i4 < size3; i4++) {
                    setNativeStrokeCapCSYIeUk setnativestrokecapcsyieuk4 = (setNativeStrokeCapCSYIeUk) ((ArrayList) this.write).get(i4);
                    if (setnativestrokecapcsyieuk3.read.RemoteActionCompatParcelizer.equals(setnativestrokecapcsyieuk4.read.RemoteActionCompatParcelizer)) {
                        if (setnativestrokecapcsyieuk3.serializer < setnativestrokecapcsyieuk4.serializer) {
                            ((ArrayList) this.read).add(Integer.valueOf(i3));
                            break;
                        }
                        ((ArrayList) this.MediaSessionCompatQueueItem).add(Integer.valueOf(i4));
                    }
                }
            }
        }
        int size4 = ((ArrayList) this.read).size() - 1;
        while (true) {
            arrayList2 = (ArrayList) this.write;
            if (-1 >= size4) {
                break;
            }
            arrayList2.remove(((Number) ((ArrayList) this.read).get(size4)).intValue());
            size4--;
        }
        int size5 = arrayList2.size();
        while (true) {
            ArrayList arrayList3 = (ArrayList) this.write;
            if (i2 >= size5) {
                arrayList3.clear();
                ((ArrayList) this.read).clear();
                ((ArrayList) this.MediaSessionCompatQueueItem).clear();
                return;
            }
            list.add(((setNativeStrokeCapCSYIeUk) arrayList3.get(i2)).read);
            i2++;
        }
    }

    public static boolean serializer(int[] iArr, int i) {
        int length;
        int i2;
        int i3 = 2 % 2;
        int i4 = RatingCompat + 65;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            length = iArr.length;
            i2 = 1;
        } else {
            length = iArr.length;
            i2 = 0;
        }
        while (i2 < length) {
            int i5 = RatingCompat;
            int i6 = i5 + 89;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (iArr[i2] == i) {
                int i8 = i5 + 119;
                MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                return i8 % 2 == 0;
            }
            i2++;
        }
        int i9 = RatingCompat + 47;
        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void RemoteActionCompatParcelizer(Drawable drawable, int i, PorterDuff.Mode mode) {
        int i2 = 2 % 2;
        Drawable drawableMutate = drawable.mutate();
        Object obj = null;
        if (mode == null) {
            int i3 = RatingCompat + 51;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                PorterDuff.Mode mode2 = ensureSubDecor.RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            mode = ensureSubDecor.RemoteActionCompatParcelizer;
        }
        drawableMutate.setColorFilter(ensureSubDecor.RemoteActionCompatParcelizer(i, mode));
        int i4 = RatingCompat + 27;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void write(MetricsBatchProcessor metricsBatchProcessor, setToSaturationimpl settosaturationimpl) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                metricsBatchProcessor.getClass();
                int i3 = MapboxNavigationNativeInitializer.$r8$clinit;
                settosaturationimpl.read(MapboxNavigationNativeInitializer.class);
                throw null;
            }
            metricsBatchProcessor.getClass();
            int i4 = MapboxNavigationNativeInitializer.$r8$clinit;
            settosaturationimpl.read(MapboxNavigationNativeInitializer.class);
            int i5 = MediaBrowserCompatMediaItem + 65;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Failed to load MapboxNavigationNativeInitializer", new Object[0]);
        }
    }

    @Override // o.getMeasureResultui
    public AbstractComposeViewExternalSyntheticLambda0 IconCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        int i = 2 % 2;
        if (!((Set) this.serializer).contains(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
            getAlignmentLinesMap.serializer("Attempting to request an undeclared dependency Provider<", lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, ">.");
            return null;
        }
        int i2 = RatingCompat + 115;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer = ((getMeasureResultui) this.IconCompatParcelizer).IconCompatParcelizer(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        int i4 = MediaBrowserCompatMediaItem + 69;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer;
    }

    @Override // o.getMeasureResultui
    public AbstractComposeViewExternalSyntheticLambda0 RemoteActionCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        int i = 2 % 2;
        if (!((Set) this.MediaSessionCompatQueueItem).contains(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
            getAlignmentLinesMap.serializer("Attempting to request an undeclared dependency Provider<Set<", lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, ">>.");
            return null;
        }
        int i2 = RatingCompat + 121;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0RemoteActionCompatParcelizer = ((getMeasureResultui) this.IconCompatParcelizer).RemoteActionCompatParcelizer(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        int i4 = MediaBrowserCompatMediaItem + 17;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return abstractComposeViewExternalSyntheticLambda0RemoteActionCompatParcelizer;
    }

    @Override // o.getMeasureResultui
    public Set read(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 123;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((Set) this.read).contains(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
            throw null;
        }
        if (!((Set) this.read).contains(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1)) {
            getAlignmentLinesMap.serializer("Attempting to request an undeclared dependency Set<", lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, ">.");
            return null;
        }
        Set set = ((getMeasureResultui) this.IconCompatParcelizer).read(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        int i3 = MediaBrowserCompatMediaItem + 93;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return set;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = io.sentry.metrics.MetricsBatchProcessor.MediaBrowserCompatMediaItem + 81;
        io.sentry.metrics.MetricsBatchProcessor.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return ((o.getMeasureResultui) r5.IconCompatParcelizer).serializer(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        ((o.getMeasureResultui) r5.IconCompatParcelizer).serializer(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (((java.util.Set) r5.write).contains(r6) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (((java.util.Set) r5.write).contains(r6) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        o.getAlignmentLinesMap.serializer("Attempting to request an undeclared dependency Deferred<", r6, ">.");
     */
    @Override // o.getMeasureResultui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.updatePlacedUnderMotionFrameOfReference serializer(o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.sentry.metrics.MetricsBatchProcessor.RatingCompat
            int r1 = r1 + 73
            int r2 = r1 % 128
            io.sentry.metrics.MetricsBatchProcessor.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r5.write
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r6)
            r4 = 90
            int r4 = r4 / 0
            if (r1 == r3) goto L31
            goto L29
        L1f:
            java.lang.Object r1 = r5.write
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r6)
            if (r1 == r3) goto L31
        L29:
            java.lang.String r0 = "Attempting to request an undeclared dependency Deferred<"
            java.lang.String r1 = ">."
            o.getAlignmentLinesMap.serializer(r0, r6, r1)
            return r2
        L31:
            int r1 = io.sentry.metrics.MetricsBatchProcessor.MediaBrowserCompatMediaItem
            int r1 = r1 + 81
            int r3 = r1 % 128
            io.sentry.metrics.MetricsBatchProcessor.RatingCompat = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L45
            java.lang.Object r0 = r5.IconCompatParcelizer
            o.getMeasureResultui r0 = (o.getMeasureResultui) r0
            o.updatePlacedUnderMotionFrameOfReference r6 = r0.serializer(r6)
            return r6
        L45:
            java.lang.Object r0 = r5.IconCompatParcelizer
            o.getMeasureResultui r0 = (o.getMeasureResultui) r0
            r0.serializer(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.metrics.MetricsBatchProcessor.serializer(o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1):o.updatePlacedUnderMotionFrameOfReference");
    }

    @Override // o.getMeasureResultui
    public updatePlacedUnderMotionFrameOfReference serializer(Class cls) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreferenceSerializer = serializer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
        int i4 = MediaBrowserCompatMediaItem + 59;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return updateplacedundermotionframeofreferenceSerializer;
        }
        throw null;
    }

    @Override // o.getMeasureResultui
    public AbstractComposeViewExternalSyntheticLambda0 write(Class cls) {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer = IconCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
        int i4 = MediaBrowserCompatMediaItem + 29;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return abstractComposeViewExternalSyntheticLambda0IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[DONT_INVERT] */
    public static MetricsBatchProcessor IconCompatParcelizer(String str, setOnAttachui setonattachui, invalidateSemanticsui invalidatesemanticsui, requestRemeasureui requestremeasureui, Integer num) throws GeneralSecurityException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
            if (requestremeasureui == requestRemeasureui.RAW) {
                if (num == null) {
                    getAlignmentLinesMap.write("Keys with output prefix type raw should not have an id requirement.");
                    return null;
                }
                int i4 = MediaBrowserCompatMediaItem + 17;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (num == null) {
                getAlignmentLinesMap.write("Keys with output prefix type different from raw should have an id requirement.");
                return null;
            }
        } else if (requestremeasureui == requestRemeasureui.RAW) {
            if (num == null) {
                getAlignmentLinesMap.write("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
            int i6 = MediaBrowserCompatMediaItem + 17;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else if (num == null) {
            getAlignmentLinesMap.write("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        MetricsBatchProcessor metricsBatchProcessor = new MetricsBatchProcessor(str, setonattachui, invalidatesemanticsui, requestremeasureui, num);
        int i8 = MediaBrowserCompatMediaItem + 107;
        RatingCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return metricsBatchProcessor;
    }

    public static ColorStateList serializer(Context context, int i) {
        int i2 = 2 % 2;
        int iIconCompatParcelizer = setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorControlHighlight);
        int iWrite = setSupportBackgroundTintList.write(context, R.attr.colorButtonNormal);
        int[] iArr = setSupportBackgroundTintList.write;
        int[] iArr2 = setSupportBackgroundTintList.read;
        int iRemoteActionCompatParcelizer = setPrevious.RemoteActionCompatParcelizer(iIconCompatParcelizer, i);
        ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, iArr2, setSupportBackgroundTintList.serializer, setSupportBackgroundTintList.RemoteActionCompatParcelizer}, new int[]{iWrite, iRemoteActionCompatParcelizer, setPrevious.RemoteActionCompatParcelizer(iIconCompatParcelizer, i), i});
        int i3 = MediaBrowserCompatMediaItem + 105;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return colorStateList;
    }

    @Override // io.sentry.metrics.IconCompatParcelizer
    public void RemoteActionCompatParcelizer(long j) {
        ResultReceiver resultReceiver;
        long nanos;
        int i = 2 % 2;
        int i2 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                read(true);
                JsonObjectSerializer jsonObjectSerializer = (JsonObjectSerializer) this.IconCompatParcelizer;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                resultReceiver = (ResultReceiver) jsonObjectSerializer.jsonReflectionObjectSerializer;
                nanos = timeUnit.toNanos(j);
            } else {
                read(true);
                JsonObjectSerializer jsonObjectSerializer2 = (JsonObjectSerializer) this.IconCompatParcelizer;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                resultReceiver = (ResultReceiver) jsonObjectSerializer2.jsonReflectionObjectSerializer;
                nanos = timeUnit2.toNanos(j);
            }
            resultReceiver.tryAcquireSharedNanos(1, nanos);
        } catch (InterruptedException e) {
            ((SentryOptions) this.RemoteActionCompatParcelizer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }

    public void serializer(boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat + 57;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CallTracer callTracer = (CallTracer) this.read;
        if (z) {
            read(true);
            callTracer.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(26, this));
            int i4 = RatingCompat + 103;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        callTracer.RemoteActionCompatParcelizer(((SentryOptions) this.RemoteActionCompatParcelizer).getShutdownTimeoutMillis());
        int i6 = MediaBrowserCompatMediaItem + 9;
        RatingCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 4 / 4;
        }
        while (!((ConcurrentLinkedQueue) this.write).isEmpty()) {
            int i8 = MediaBrowserCompatMediaItem + 119;
            RatingCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                serializer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            serializer();
        }
    }

    @Override // o.getMeasureResultui
    public Object read(Class cls) {
        int i = 2 % 2;
        if (!((Set) this.RemoteActionCompatParcelizer).contains(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls))) {
            throw new DependencyException(d$$ExternalSyntheticOutline0.m(cls, "Attempting to request an undeclared dependency ", "."));
        }
        int i2 = RatingCompat + 109;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((getMeasureResultui) this.IconCompatParcelizer).read(cls);
            cls.equals(getTailui.class);
            throw null;
        }
        Object obj = ((getMeasureResultui) this.IconCompatParcelizer).read(cls);
        if (!(!cls.equals(getTailui.class))) {
            return new LookaheadCapablePlaceableCompanion();
        }
        int i3 = MediaBrowserCompatMediaItem + 103;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return obj;
    }

    @Override // o.getMeasureResultui
    public Object write(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(!((Set) this.RemoteActionCompatParcelizer).contains(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1))) {
            int i4 = MediaBrowserCompatMediaItem + 53;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return ((getMeasureResultui) this.IconCompatParcelizer).write(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        }
        getAlignmentLinesMap.serializer("Attempting to request an undeclared dependency ", lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, ".");
        return null;
    }

    public void read(boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((io.sentry.util.RemoteActionCompatParcelizer) this.MediaSessionCompatQueueItem).serializer();
        try {
            try {
                ((CallTracer) this.read).IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(29, this), z ^ true ? 5000 : 0);
            } catch (RejectedExecutionException e) {
                ((SentryOptions) this.RemoteActionCompatParcelizer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Metrics batch processor flush task rejected", e);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
                int i4 = MediaBrowserCompatMediaItem + 15;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public static final Object access$fireAcknowledgeWorker(MetricsBatchProcessor metricsBatchProcessor, String str, long j, String str2, long j2, ContinuationImpl continuationImpl) {
        TextUnitSaverlambda0 textUnitSaverlambda0;
        WorkManagerImpl workManagerImpl;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            metricsBatchProcessor.getClass();
            boolean z = continuationImpl instanceof TextUnitSaverlambda0;
            obj.hashCode();
            throw null;
        }
        metricsBatchProcessor.getClass();
        if (continuationImpl instanceof TextUnitSaverlambda0) {
            textUnitSaverlambda0 = (TextUnitSaverlambda0) continuationImpl;
            int i3 = textUnitSaverlambda0.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = RatingCompat + 17;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                textUnitSaverlambda0.serializer = i3 - Integer.MIN_VALUE;
            } else {
                textUnitSaverlambda0 = new TextUnitSaverlambda0(metricsBatchProcessor, continuationImpl);
            }
        } else {
            textUnitSaverlambda0 = new TextUnitSaverlambda0(metricsBatchProcessor, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = textUnitSaverlambda0.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = textUnitSaverlambda0.serializer;
        if (i6 != 0) {
            int i7 = RatingCompat + 91;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            workManagerImpl = textUnitSaverlambda0.write;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            workManagerImpl = (WorkManagerImpl) metricsBatchProcessor.write;
            textUnitSaverlambda0.write = workManagerImpl;
            textUnitSaverlambda0.serializer = 1;
            objRemoteActionCompatParcelizer = MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j, j2, str, str2);
            if (objRemoteActionCompatParcelizer == obj2) {
                return obj2;
            }
        }
        workManagerImpl.RemoteActionCompatParcelizer((setRotationY) objRemoteActionCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    public Object clear(ContinuationImpl continuationImpl) {
        getAndroidBold getandroidbold;
        int i = 2 % 2;
        if (!(continuationImpl instanceof getAndroidBold)) {
            getandroidbold = new getAndroidBold(this, continuationImpl);
        } else {
            int i2 = RatingCompat + 97;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getandroidbold = (getAndroidBold) continuationImpl;
            int i4 = getandroidbold.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaBrowserCompatMediaItem + 69;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getandroidbold.serializer = i4 - Integer.MIN_VALUE;
            } else {
                getandroidbold = new getAndroidBold(this, continuationImpl);
            }
        }
        Object obj = getandroidbold.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getandroidbold.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PushWithAppStateDataStoreImpl pushWithAppStateDataStoreImpl = (PushWithAppStateDataStoreImpl) this.RemoteActionCompatParcelizer;
            getandroidbold.serializer = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(pushWithAppStateDataStoreImpl.serializer, new PhotoIdUiModelImpl$1$1(pushWithAppStateDataStoreImpl, shortNewsContentCardView, 6), getandroidbold);
            if (objSerializer != coroutineSingletons) {
                int i8 = MediaBrowserCompatMediaItem + 39;
                RatingCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                objSerializer = createfromparcel;
            }
            if (objSerializer == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = RatingCompat + 81;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        loadCachedui_text loadcachedui_text = (loadCachedui_text) this.serializer;
        loadcachedui_text.read = null;
        loadcachedui_text.write = null;
        return createfromparcel;
    }

    public void serializer() {
        int i = 2 % 2;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.write;
        ArrayList arrayList = new ArrayList(1000);
        do {
            setBannerHeightlambda0 setbannerheightlambda0 = (setBannerHeightlambda0) concurrentLinkedQueue.poll();
            if (setbannerheightlambda0 != null) {
                arrayList.add(setbannerheightlambda0);
                int i2 = MediaBrowserCompatMediaItem + 67;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        SentryClient sentryClient = (SentryClient) this.serializer;
        r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 r8lambdaezx9vf3n2mjvwrdqvqgqjgg8 = new r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8(arrayList);
        sentryClient.getClass();
        int i4 = 0;
        try {
            sentryClient.IconCompatParcelizer(sentryClient.read(r8lambdaezx9vf3n2mjvwrdqvqgqjgg8), (executelambda4) null);
        } catch (IOException e) {
            ((SentryOptions) sentryClient.RemoteActionCompatParcelizer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing metrics failed.", new Object[0]);
        }
        while (i4 < arrayList.size()) {
            int i5 = RatingCompat + 107;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ResultReceiver resultReceiver = (ResultReceiver) ((JsonObjectSerializer) this.IconCompatParcelizer).jsonReflectionObjectSerializer;
                int i6 = ResultReceiver.read;
                resultReceiver.releaseShared(1);
                i4 += 127;
            } else {
                ResultReceiver resultReceiver2 = (ResultReceiver) ((JsonObjectSerializer) this.IconCompatParcelizer).jsonReflectionObjectSerializer;
                int i7 = ResultReceiver.read;
                resultReceiver2.releaseShared(1);
                i4++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public static final Object access$waitForMapboxInitialization(MetricsBatchProcessor metricsBatchProcessor, ContinuationImpl continuationImpl) {
        h8 h8Var;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        igExternalSyntheticLambda2 igexternalsyntheticlambda2 = (igExternalSyntheticLambda2) metricsBatchProcessor.write;
        int i4 = 1;
        if (!(!(continuationImpl instanceof h8))) {
            h8Var = (h8) continuationImpl;
            int i5 = h8Var.read;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                h8Var.read = i5 - Integer.MIN_VALUE;
            } else {
                h8Var = new h8(metricsBatchProcessor, continuationImpl);
            }
        } else {
            h8Var = new h8(metricsBatchProcessor, continuationImpl);
        }
        Object obj = h8Var.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = h8Var.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            igExternalSyntheticLambda7 igexternalsyntheticlambda7 = (igExternalSyntheticLambda7) igexternalsyntheticlambda2.write.read();
            if (igexternalsyntheticlambda7 != igExternalSyntheticLambda7.NAVIGATION_INITIALIZED && igexternalsyntheticlambda7 != igExternalSyntheticLambda7.NONE) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("waiting for Map SDK initialization to complete", new Object[0]);
                GetAppStateImpl$invoke$$inlined$map$1 getAppStateImpl$invoke$$inlined$map$1 = new GetAppStateImpl$invoke$$inlined$map$1(igexternalsyntheticlambda2.write, i4);
                h8Var.read = 1;
                if (FlowKt.first(getAppStateImpl$invoke$$inlined$map$1, h8Var) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
        int i7 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0 ? i6 != 1 : i6 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Map SDK initialization is complete", new Object[0]);
        return createFromParcel.INSTANCE;
    }

    public void read() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 113;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.MediaSessionCompatQueueItem);
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NAVER_MAPS_ENABLED)) {
            return;
        }
        int i5 = h6.write[((createQuery) this.read).write().ordinal()];
        int i6 = 3;
        int i7 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 1) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, MainDispatcherLoader.read, null, new InitialiseMapBoxNavigation$initializeOnIo$1(this, shortNewsContentCardView, i6), 2);
            return;
        }
        if (i5 == 2) {
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new InitialiseMapBoxNavigation$initializeOnIo$1(this, shortNewsContentCardView, 0), 2);
            return;
        }
        if (i5 == 3) {
            DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new InitialiseMapBoxNavigation$initializeOnIo$1(this, shortNewsContentCardView, i), 2);
            return;
        }
        int i8 = RatingCompat + 13;
        MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i5 == 4) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, null, new InitialiseMapBoxNavigation$initializeOnIo$1(this, shortNewsContentCardView, i7), 2);
            int i10 = RatingCompat + 33;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return;
        }
        if (i5 != 5) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        ((TraceTimeMeasurementWithPerformanceKit) ((getAllSemanticsNodesToMap) this.serializer)).read("asti_init_mapbox_navigation", new NetworkingCoreModule$$ExternalSyntheticLambda2(9, this));
        int i12 = MediaBrowserCompatMediaItem + 5;
        RatingCompat = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public MetricsBatchProcessor(Context context, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        ComponentRegistry$Builder componentRegistry$Builder = new ComponentRegistry$Builder(context);
        ExecutorService executorService = IntPair.read(context);
        ScheduledExecutorService scheduledExecutorService = getDeleteEK5gGoQ.write;
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(setlastreportedresult);
        this.MediaSessionCompatQueueItem = setlastreportedresult;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(onVisibilityChangedNode);
        this.IconCompatParcelizer = onVisibilityChangedNode;
        this.serializer = componentRegistry$Builder;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(executorService);
        this.write = executorService;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(scheduledExecutorService);
        this.read = scheduledExecutorService;
    }

    public MetricsBatchProcessor(Set set, String str, String str2) {
        Set setUnmodifiableSet;
        if (set == null) {
            setUnmodifiableSet = Collections.EMPTY_SET;
            int i = RatingCompat + 17;
            MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.RemoteActionCompatParcelizer = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.write = str;
        this.read = str2;
        this.MediaSessionCompatQueueItem = OnRemeasuredModifier.write;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!(!it.hasNext())) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        int i4 = MediaBrowserCompatMediaItem + 17;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        this.serializer = Collections.unmodifiableSet(hashSet);
        int i6 = MediaBrowserCompatMediaItem + 101;
        RatingCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public MetricsBatchProcessor(accessrequireViewFactoryHolder accessrequireviewfactoryholder, GetAcknowledgmentParamsImpl getAcknowledgmentParamsImpl, WorkManagerImpl workManagerImpl, MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, StateV3$$ExternalSyntheticLambda0 stateV3$$ExternalSyntheticLambda0, transferSessionPackageI transfersessionpackagei) {
        this.RemoteActionCompatParcelizer = accessrequireviewfactoryholder;
        this.serializer = getAcknowledgmentParamsImpl;
        this.write = workManagerImpl;
        this.read = stateV3$$ExternalSyntheticLambda0;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.IconCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new StateV3$ScreenType[]{StateV3$ScreenType.Accept, StateV3$ScreenType.AutoAccept});
    }

    public MetricsBatchProcessor(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, insertTextAtCursordefault inserttextatcursordefault, getScrollRange getscrollrange, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, newTransaction newtransaction, setVerticalBias setverticalbias) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        getscrollrange.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        newtransaction.getClass();
        setverticalbias.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = inserttextatcursordefault;
        this.write = getscrollrange;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.MediaSessionCompatQueueItem = newtransaction;
        this.IconCompatParcelizer = setverticalbias;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    public static LayerDrawable serializer(getSupportCompoundDrawablesTintMode getsupportcompounddrawablestintmode, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int i2 = 2 % 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableRemoteActionCompatParcelizer = getsupportcompounddrawablestintmode.RemoteActionCompatParcelizer(context, R.drawable.abc_star_black_48dp);
        Drawable drawableRemoteActionCompatParcelizer2 = getsupportcompounddrawablestintmode.RemoteActionCompatParcelizer(context, R.drawable.abc_star_half_black_48dp);
        if (drawableRemoteActionCompatParcelizer instanceof BitmapDrawable) {
            int i3 = MediaBrowserCompatMediaItem + 69;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (drawableRemoteActionCompatParcelizer.getIntrinsicWidth() == dimensionPixelSize) {
                int i5 = RatingCompat + 35;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (drawableRemoteActionCompatParcelizer.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable = (BitmapDrawable) drawableRemoteActionCompatParcelizer;
                    bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableRemoteActionCompatParcelizer.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    drawableRemoteActionCompatParcelizer.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                    bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                }
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableRemoteActionCompatParcelizer.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableRemoteActionCompatParcelizer.draw(canvas2);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap2);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap2);
            }
        } else {
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
            drawableRemoteActionCompatParcelizer.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableRemoteActionCompatParcelizer.draw(canvas3);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap3);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap3);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if (!(!(drawableRemoteActionCompatParcelizer2 instanceof BitmapDrawable)) && drawableRemoteActionCompatParcelizer2.getIntrinsicWidth() == dimensionPixelSize && drawableRemoteActionCompatParcelizer2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableRemoteActionCompatParcelizer2;
            int i7 = MediaBrowserCompatMediaItem + 123;
            RatingCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 4 % 4;
            }
        } else {
            Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas4 = new Canvas(bitmapCreateBitmap4);
            drawableRemoteActionCompatParcelizer2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableRemoteActionCompatParcelizer2.draw(canvas4);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap4);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public MetricsBatchProcessor(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4, postAnimationRunner postanimationrunner) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        transactionwithresultsuspendimpl.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.write = transactionwithresultsuspendimpl;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
        this.IconCompatParcelizer = postanimationrunner;
    }

    public MetricsBatchProcessor(AbsSavedState absSavedState, o1 o1Var, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        absSavedState.getClass();
        o1Var.getClass();
        shouldShowHeatmap_Factory.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.RemoteActionCompatParcelizer = absSavedState;
        this.serializer = o1Var;
        this.write = shouldShowHeatmap_Factory;
        this.read = mergejsonobjects;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
    }

    public MetricsBatchProcessor(PushWithAppStateDataStoreImpl pushWithAppStateDataStoreImpl, loadCachedui_text loadcachedui_text, getError geterror, EnumColumnAdapter enumColumnAdapter, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = pushWithAppStateDataStoreImpl;
        this.serializer = loadcachedui_text;
        this.write = geterror;
        this.read = enumColumnAdapter;
        this.MediaSessionCompatQueueItem = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 0, null, 7);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 28), 3);
    }

    public MetricsBatchProcessor(lineEndToVisibleEnd lineendtovisibleend, lineEndToVisibleEnd lineendtovisibleend2, lineEndToVisibleEnd lineendtovisibleend3, LayoutHelperBidiRun layoutHelperBidiRun, hasNestedScrollingParent hasnestedscrollingparent, q0 q0Var) {
        lineendtovisibleend.getClass();
        lineendtovisibleend2.getClass();
        lineendtovisibleend3.getClass();
        hasnestedscrollingparent.getClass();
        q0Var.getClass();
        this.RemoteActionCompatParcelizer = lineendtovisibleend;
        this.serializer = lineendtovisibleend2;
        this.write = lineendtovisibleend3;
        this.read = layoutHelperBidiRun;
        this.MediaSessionCompatQueueItem = hasnestedscrollingparent;
        this.IconCompatParcelizer = q0Var;
    }

    public MetricsBatchProcessor(insertBasedOnParentOffset insertbasedonparentoffset, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, requestBannersRefreshlambda1 requestbannersrefreshlambda1, AbsSavedState absSavedState, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        insertbasedonparentoffset.getClass();
        shouldShowHeatmap_Factory.getClass();
        requestbannersrefreshlambda1.getClass();
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = insertbasedonparentoffset;
        this.serializer = shouldShowHeatmap_Factory;
        this.write = requestbannersrefreshlambda1;
        this.read = absSavedState;
        this.MediaSessionCompatQueueItem = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public MetricsBatchProcessor(AdjustPurchaseVerificationResult adjustPurchaseVerificationResult, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, publishErrorlambda1 publisherrorlambda1, backgroundTimerFiredI backgroundtimerfiredi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getDoubleOrNull getdoubleornull) {
        adjustPurchaseVerificationResult.getClass();
        publisherrorlambda1.getClass();
        backgroundtimerfiredi.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        getdoubleornull.getClass();
        this.RemoteActionCompatParcelizer = adjustPurchaseVerificationResult;
        this.serializer = lambdaverifyplaystorepurchase45;
        this.write = publisherrorlambda1;
        this.read = backgroundtimerfiredi;
        this.MediaSessionCompatQueueItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = getdoubleornull;
    }

    public MetricsBatchProcessor(getXmlParser getxmlparser, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, backgroundTimerFiredI backgroundtimerfiredi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        getxmlparser.getClass();
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        backgroundtimerfiredi.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = getxmlparser;
        this.serializer = lambdaverifyplaystorepurchase45;
        this.write = publisherrorlambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaSessionCompatQueueItem = backgroundtimerfiredi;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public MetricsBatchProcessor(indexForKey indexforkey, requestBannersRefreshlambda1 requestbannersrefreshlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, getSharedElementTargetNames getsharedelementtargetnames, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        indexforkey.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        lambdaverifyplaystorepurchase45.getClass();
        getsharedelementtargetnames.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.RemoteActionCompatParcelizer = indexforkey;
        this.serializer = requestbannersrefreshlambda1;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = lambdaverifyplaystorepurchase45;
        this.MediaSessionCompatQueueItem = getsharedelementtargetnames;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public MetricsBatchProcessor(Application application, getAllSemanticsNodesToMap getallsemanticsnodestomap, igExternalSyntheticLambda2 igexternalsyntheticlambda2, isOpenInternalroom_runtime isopeninternalroom_runtime, createQuery createquery, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        igexternalsyntheticlambda2.getClass();
        transfersessionpackagei.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.RemoteActionCompatParcelizer = application;
        this.serializer = getallsemanticsnodestomap;
        this.write = igexternalsyntheticlambda2;
        this.read = createquery;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
    }

    public MetricsBatchProcessor(getIterationDuration getiterationduration, getIterationDuration getiterationduration2, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, accessgetTextBottomcp accessgettextbottomcp, getIterationDuration getiterationduration3, getIterationDuration getiterationduration4) {
        getiterationduration.getClass();
        getiterationduration2.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        getiterationduration3.getClass();
        getiterationduration4.getClass();
        this.RemoteActionCompatParcelizer = getiterationduration;
        this.serializer = getiterationduration2;
        this.write = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.read = accessgettextbottomcp;
        this.MediaSessionCompatQueueItem = getiterationduration3;
        this.IconCompatParcelizer = getiterationduration4;
    }

    public MetricsBatchProcessor(getHasMeasureResult gethasmeasureresult, getMeasureResultui getmeasureresultui) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<provideRelativeRulerValue> set = gethasmeasureresult.read;
        Set set2 = gethasmeasureresult.RatingCompat;
        int i = 2 % 2;
        for (provideRelativeRulerValue providerelativerulervalue : set) {
            int i2 = MediaBrowserCompatMediaItem + 21;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = providerelativerulervalue.IconCompatParcelizer;
            int i5 = providerelativerulervalue.write;
            boolean z = false;
            if (i4 == 0) {
                int i6 = RatingCompat + 85;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    z = true;
                }
            }
            LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = providerelativerulervalue.serializer;
            if (z) {
                if (i5 == 2) {
                    hashSet4.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
                } else {
                    hashSet.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
                }
            } else if (i4 == 2) {
                int i7 = MediaBrowserCompatMediaItem + 11;
                RatingCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                hashSet3.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
                int i9 = RatingCompat + 65;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else if (i5 == 2) {
                hashSet5.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
            } else {
                hashSet2.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
            }
        }
        if (!set2.isEmpty()) {
            int i11 = MediaBrowserCompatMediaItem + 121;
            RatingCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                hashSet.add(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(getTailui.class));
                throw null;
            }
            hashSet.add(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(getTailui.class));
        }
        this.RemoteActionCompatParcelizer = Collections.unmodifiableSet(hashSet);
        this.serializer = Collections.unmodifiableSet(hashSet2);
        this.write = Collections.unmodifiableSet(hashSet3);
        this.read = Collections.unmodifiableSet(hashSet4);
        this.MediaSessionCompatQueueItem = Collections.unmodifiableSet(hashSet5);
        this.IconCompatParcelizer = getmeasureresultui;
    }

    public MetricsBatchProcessor(SentryOptions sentryOptions, SentryClient sentryClient) {
        this.MediaSessionCompatQueueItem = new io.sentry.util.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = new JsonObjectSerializer((byte) 0, 13);
        this.RemoteActionCompatParcelizer = sentryOptions;
        this.serializer = sentryClient;
        this.write = new ConcurrentLinkedQueue();
        this.read = new CallTracer(sentryOptions);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a A[PHI: r1 r5 r6
  0x005a: PHI (r1v21 int[][]) = (r1v20 int[][]), (r1v25 int[][]) binds: [B:20:0x0058, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r5v2 int[]) = (r5v1 int[]), (r5v6 int[]) binds: [B:20:0x0058, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r6v1 android.content.res.ColorStateList) = (r6v0 android.content.res.ColorStateList), (r6v4 android.content.res.ColorStateList) binds: [B:20:0x0058, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public ColorStateList IconCompatParcelizer(Context context, int i) {
        ColorStateList colorStateListRemoteActionCompatParcelizer;
        int[] iArr;
        int[][] iArr2;
        int i2 = 2 % 2;
        int i3 = RatingCompat;
        int i4 = i3 + 21;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (i == R.drawable.abc_edit_text_material) {
            return FocusListener.write(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230851) {
            return FocusListener.write(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int i5 = i3 + 59;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                iArr2 = new int[5][];
                iArr = new int[4];
                colorStateListRemoteActionCompatParcelizer = setSupportBackgroundTintList.RemoteActionCompatParcelizer(context, R.attr.colorSwitchThumbNormal);
                if (colorStateListRemoteActionCompatParcelizer != null) {
                    if (colorStateListRemoteActionCompatParcelizer.isStateful()) {
                        int[] iArr3 = setSupportBackgroundTintList.write;
                        iArr2[0] = iArr3;
                        iArr[0] = colorStateListRemoteActionCompatParcelizer.getColorForState(iArr3, 0);
                        iArr2[1] = setSupportBackgroundTintList.IconCompatParcelizer;
                        iArr[1] = setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorControlActivated);
                        iArr2[2] = setSupportBackgroundTintList.RemoteActionCompatParcelizer;
                        iArr[2] = colorStateListRemoteActionCompatParcelizer.getDefaultColor();
                    }
                }
                return new ColorStateList(iArr2, iArr);
            }
            colorStateListRemoteActionCompatParcelizer = setSupportBackgroundTintList.RemoteActionCompatParcelizer(context, R.attr.colorSwitchThumbNormal);
            iArr = new int[3];
            iArr2 = new int[3][];
            if (colorStateListRemoteActionCompatParcelizer != null) {
                if (colorStateListRemoteActionCompatParcelizer.isStateful()) {
                    int[] iArr4 = setSupportBackgroundTintList.write;
                    iArr2[0] = iArr4;
                    iArr[0] = colorStateListRemoteActionCompatParcelizer.getColorForState(iArr4, 0);
                    iArr2[1] = setSupportBackgroundTintList.IconCompatParcelizer;
                    iArr[1] = setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorControlActivated);
                    iArr2[2] = setSupportBackgroundTintList.RemoteActionCompatParcelizer;
                    iArr[2] = colorStateListRemoteActionCompatParcelizer.getDefaultColor();
                }
            }
            return new ColorStateList(iArr2, iArr);
            iArr2[0] = setSupportBackgroundTintList.write;
            iArr[0] = setSupportBackgroundTintList.write(context, R.attr.colorSwitchThumbNormal);
            iArr2[1] = setSupportBackgroundTintList.IconCompatParcelizer;
            iArr[1] = setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorControlActivated);
            iArr2[2] = setSupportBackgroundTintList.RemoteActionCompatParcelizer;
            iArr[2] = setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorSwitchThumbNormal);
            return new ColorStateList(iArr2, iArr);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            ColorStateList colorStateListSerializer = serializer(context, setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorButtonNormal));
            int i6 = RatingCompat + 31;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return colorStateListSerializer;
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return serializer(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            int i8 = i3 + 37;
            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return serializer(context, setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorAccent));
            }
            serializer(context, setSupportBackgroundTintList.IconCompatParcelizer(context, R.attr.colorAccent));
            obj.hashCode();
            throw null;
        }
        if (i != 2131230846 && i != R.drawable.abc_spinner_textfield_background_material) {
            if (!serializer((int[]) this.serializer, i)) {
                if (serializer((int[]) this.MediaSessionCompatQueueItem, i)) {
                    int i9 = RatingCompat + 45;
                    MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    ColorStateList colorStateListWrite = FocusListener.write(context, R.color.abc_tint_default);
                    int i11 = MediaBrowserCompatMediaItem + 41;
                    RatingCompat = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        return colorStateListWrite;
                    }
                    throw null;
                }
                if (serializer((int[]) this.IconCompatParcelizer, i)) {
                    return FocusListener.write(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return FocusListener.write(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int i12 = MediaBrowserCompatMediaItem + 85;
            RatingCompat = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                return setSupportBackgroundTintList.RemoteActionCompatParcelizer(context, R.attr.colorControlNormal);
            }
            setSupportBackgroundTintList.RemoteActionCompatParcelizer(context, R.attr.colorControlNormal);
            obj.hashCode();
            throw null;
        }
        return FocusListener.write(context, R.color.abc_tint_spinner);
    }

    public MetricsBatchProcessor(String str, setOnAttachui setonattachui, invalidateSemanticsui invalidatesemanticsui, requestRemeasureui requestremeasureui, Integer num) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = invalidateMeasurement.IconCompatParcelizer(str);
        this.write = setonattachui;
        this.read = invalidatesemanticsui;
        this.MediaSessionCompatQueueItem = requestremeasureui;
        this.IconCompatParcelizer = num;
    }

    public /* synthetic */ MetricsBatchProcessor(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5) {
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.serializer = mergejsonobjects2;
        this.write = mergejsonobjects3;
        this.read = getcolorintegerornulllambda0;
        this.MediaSessionCompatQueueItem = mergejsonobjects4;
        this.IconCompatParcelizer = mergejsonobjects5;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038 A[PHI: r5 r7
  0x0038: PHI (r5v7 o.getAndroidTypefaceStyle) = (r5v6 o.getAndroidTypefaceStyle), (r5v9 o.getAndroidTypefaceStyle) binds: [B:10:0x0036, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r7v14 int) = (r7v13 int), (r7v16 int) binds: [B:10:0x0036, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String, java.util.Set, o.setOnSessionTrackingFailedListener] */
    public static final Object access$checkForAndLogGhostOrder(MetricsBatchProcessor metricsBatchProcessor, Set set, ContinuationImpl continuationImpl) throws Throwable {
        getAndroidTypefaceStyle getandroidtypefacestyle;
        setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener;
        String str;
        Object objWithContext;
        String str2;
        int i;
        Set set2 = set;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 67;
        int i5 = i4 % Fields.SpotShadowColor;
        RatingCompat = i5;
        int i6 = i4 % 2;
        int i7 = 0;
        if (continuationImpl instanceof getAndroidTypefaceStyle) {
            int i8 = i5 + 73;
            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getandroidtypefacestyle = (getAndroidTypefaceStyle) continuationImpl;
                i = getandroidtypefacestyle.RemoteActionCompatParcelizer;
                int i9 = 58 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getandroidtypefacestyle.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    getandroidtypefacestyle = new getAndroidTypefaceStyle(metricsBatchProcessor, continuationImpl);
                }
            } else {
                getandroidtypefacestyle = (getAndroidTypefaceStyle) continuationImpl;
                i = getandroidtypefacestyle.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getandroidtypefacestyle.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    getandroidtypefacestyle = new getAndroidTypefaceStyle(metricsBatchProcessor, continuationImpl);
                }
            }
        } else {
            getandroidtypefacestyle = new getAndroidTypefaceStyle(metricsBatchProcessor, continuationImpl);
        }
        Object obj = getandroidtypefacestyle.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = getandroidtypefacestyle.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            loadCachedui_text loadcachedui_text = (loadCachedui_text) metricsBatchProcessor.serializer;
            setonsessiontrackingfailedlistener = loadcachedui_text.read;
            str = loadcachedui_text.write;
            PushWithAppStateDataStoreImpl pushWithAppStateDataStoreImpl = (PushWithAppStateDataStoreImpl) metricsBatchProcessor.RemoteActionCompatParcelizer;
            getandroidtypefacestyle.IconCompatParcelizer = set2;
            getandroidtypefacestyle.read = setonsessiontrackingfailedlistener;
            getandroidtypefacestyle.write = str;
            getandroidtypefacestyle.RemoteActionCompatParcelizer = 1;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ShiftZoneMapLayerUiModelImpl$1(pushWithAppStateDataStoreImpl, shortNewsContentCardView, 4), getandroidtypefacestyle);
            if (objWithContext != obj2) {
            }
        }
        if (i10 != 1) {
            int i11 = RatingCompat + 59;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i10 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i13 = MediaBrowserCompatMediaItem + 87;
            RatingCompat = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                return null;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        String str3 = getandroidtypefacestyle.write;
        setonsessiontrackingfailedlistener = getandroidtypefacestyle.read;
        Set set3 = getandroidtypefacestyle.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        str = str3;
        set2 = set3;
        objWithContext = obj;
        List list = (List) objWithContext;
        if (setonsessiontrackingfailedlistener != setOnSessionTrackingFailedListener.PUSH_NOTIFICATION || !disableThirdPartySharingForCoppaEnabledI.RemoteActionCompatParcelizer(str)) {
            return createfromparcel;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gdprForgetMeI gdprforgetmei = (gdprForgetMeI) it.next();
            String strRemoteActionCompatParcelizer = gdprforgetmei.IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (!onContentCardDismissed.write(set2, strRemoteActionCompatParcelizer)) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ghost order is happened because delivery id doesn't match", new Object[i7]);
                String str4 = gdprforgetmei.IconCompatParcelizer().read();
                String str5 = gdprforgetmei.read() ? "background" : "foreground";
                long epochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
                if (gdprforgetmei.read()) {
                    str2 = "push_notification_click_background_ghost_order";
                } else {
                    int i14 = MediaBrowserCompatMediaItem + 25;
                    RatingCompat = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % i2;
                    str2 = "push_notification_foreground_ghost_order";
                }
                EnumColumnAdapter enumColumnAdapter = (EnumColumnAdapter) metricsBatchProcessor.read;
                executeAsList executeaslist = executeAsList.OA;
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n                ", str2, "\n                courier_id: ", ((getLiveRegiondelegate) ((getError) metricsBatchProcessor.write)).serializer(), "\n                delivery_id: ");
                c8$$ExternalSyntheticOutline0.m(sbM, strRemoteActionCompatParcelizer, "\n                message_id: ", str4, "\n                received_at: ");
                sbM.append(epochMilli);
                sbM.append("\n                push_category: ");
                sbM.append(str);
                sbM.append("\n                state: ");
                sbM.append(str5);
                sbM.append("\n            ");
                EnumColumnAdapter.serializer(enumColumnAdapter, str2, executeaslist, isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString()));
            }
            set2 = set2;
            it = it;
            createfromparcel = createfromparcel;
            i2 = 2;
            i7 = 0;
            shortNewsContentCardView = null;
        }
        createFromParcel createfromparcel2 = createfromparcel;
        ?? r1 = shortNewsContentCardView;
        getandroidtypefacestyle.IconCompatParcelizer = r1;
        getandroidtypefacestyle.read = r1;
        getandroidtypefacestyle.write = r1;
        getandroidtypefacestyle.RemoteActionCompatParcelizer = 2;
        return metricsBatchProcessor.clear(getandroidtypefacestyle) == obj2 ? obj2 : createfromparcel2;
    }
}
