package com.sentiance.core.model.events;

import android.database.Cursor;
import android.util.SparseArray;
import androidx.biometric.CryptoObjectUtils;
import androidx.camera.core.FocusMeteringAction;
import androidx.collection.ObjectList$toString$1;
import androidx.compose.ui.graphics.Fields;
import androidx.recyclerview.widget.ChildHelper;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLite;
import androidx.transition.Transition$1;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.location.ut;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.core.routerefresh.PlannedRouteRefreshController$executePlannedRefresh$1;
import com.mapbox.navigation.core.routerefresh.PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1;
import com.mapbox.navigation.core.routerefresh.PlannedRouteRefreshController$scheduleUpdateRetry$1;
import com.mapbox.navigation.core.routerefresh.QueuedRequest;
import com.mapbox.navigation.core.routerefresh.RouteRefresherResult;
import com.mapbox.navigation.core.routerefresh.RouteRefresherStatus$Failure;
import com.mapbox.navigation.core.routerefresh.RoutesRefresherExecutorResult$Finished;
import com.mapbox.navigation.core.routerefresh.RoutesRefresherExecutorResult$ReplacedByNewer;
import com.mapbox.navigation.core.routerefresh.RoutesRefresherResult;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.BrazeExternalSyntheticLambda28;
import o.ShortNewsContentCardView;
import o.SimplePlacementScope;
import o.SubcomposeLayoutKt;
import o.SubcomposeLayoutPausableCompositionException;
import o.accessgetInstancedelegatecp;
import o.accessgetUnspecifiedSlotIdp;
import o.accessoutOfBoundsHit8NAm7pk;
import o.accesssetLastLayerDrawingWasSkippedp;
import o.accessswap;
import o.ancestorToLocal;
import o.asList;
import o.compileStatement;
import o.createFromParcel;
import o.getCieXyz;
import o.getDefaultNotificationAccentColorandroid_sdk_base_release;
import o.getFocusOwner;
import o.getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release;
import o.getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release;
import o.getLargeNotificationIconNameandroid_sdk_base_release;
import o.getLastMeasurementConstraintsmsEJaDkui;
import o.getMinimumTouchTargetSizeNHjbRc;
import o.getPageLeft;
import o.getPerformImeAction;
import o.getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release;
import o.getQueryParameterslambda2;
import o.getRectManager;
import o.getServerTargetandroid_sdk_base_release;
import o.getSessionTimeoutandroid_sdk_base_release;
import o.getUseEvaluationsCachefwf_client_release;
import o.hitNearFh5PU_I;
import o.isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release;
import o.isPushHtmlRenderingEnabledandroid_sdk_base_release;
import o.isPushWakeScreenForNotificationEnabledandroid_sdk_base_release;
import o.isSdkAuthEnabledandroid_sdk_base_release;
import o.maxHeightui;
import o.onContentCardDismissed;
import o.onEndApplyChanges;
import o.onLayoutModifierNodeChanged;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setAdmMessagingRegistrationEnabledandroid_sdk_base_release;
import o.setLastShapeui;
import o.setOffset;
import o.setWrappedui;
import o.specifiesCanFocusProperty;
import o.timesUQTWf7w;
import o.updateLayerParameters;
import o.visitNodes;

/* JADX INFO: loaded from: classes3.dex */
public final class I$b {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatResultReceiverWrapper;
    public Object PlaybackStateCompat;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public I$b() {
        this.IconCompatParcelizer = new accessgetUnspecifiedSlotIdp();
        this.read = new accessgetUnspecifiedSlotIdp();
        this.serializer = new accessgetUnspecifiedSlotIdp();
        this.write = new accessgetUnspecifiedSlotIdp();
        this.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(0.0f);
        this.MediaDescriptionCompat = new SubcomposeLayoutKt(0.0f);
        this.RatingCompat = new SubcomposeLayoutKt(0.0f);
        this.MediaMetadataCompat = new SubcomposeLayoutKt(0.0f);
        int i = 1;
        this.MediaBrowserCompatMediaItem = new Transition$1(i);
        this.MediaSessionCompatResultReceiverWrapper = new Transition$1(i);
        this.PlaybackStateCompat = new Transition$1(i);
        this.MediaSessionCompatQueueItem = new Transition$1(i);
    }

    public void pause() {
        int i = 2 % 2;
        LoggerProviderKt.logI("Pausing refreshes", "RouteRefreshController");
        ContextScope contextScope = (ContextScope) this.PlaybackStateCompat;
        if (contextScope != null) {
            int i2 = ParcelableVolumeInfo + 55;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            YieldKt.write(contextScope, (CancellationException) null);
            MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper = (MapboxHistoryRecorderWrapper) this.MediaSessionCompatResultReceiverWrapper;
            mapboxHistoryRecorderWrapper.getClass();
            mapboxHistoryRecorderWrapper.historyRecorder.pushHistory("android_route_refresh_events", "{\"type\":\"PeriodicRouteRefresh.Paused\"}");
            int i4 = MediaSessionCompatToken + 109;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        this.PlaybackStateCompat = null;
    }

    public void resume(boolean z) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 11;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LoggerProviderKt.logI("Resuming refreshes", "RouteRefreshController");
        if (((ContextScope) this.PlaybackStateCompat) == null) {
            this.PlaybackStateCompat = CryptoObjectUtils.newChildScope((ContextScope) this.MediaDescriptionCompat);
            List list = (List) this.MediaSessionCompatQueueItem;
            if (list != null) {
                int i4 = MediaSessionCompatToken + 117;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0 ? ((getUseEvaluationsCachefwf_client_release) this.RatingCompat).write < 2 : ((getUseEvaluationsCachefwf_client_release) this.RatingCompat).write < 2) {
                    postAttempt(new PlannedRouteRefreshController$scheduleUpdateRetry$1(this, list, true, null), z);
                }
            }
        }
        int i5 = ParcelableVolumeInfo + 125;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public void postAttempt(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        int i = 2 % 2;
        MapboxHistoryRecorderWrapper mapboxHistoryRecorderWrapper = (MapboxHistoryRecorderWrapper) this.MediaSessionCompatResultReceiverWrapper;
        mapboxHistoryRecorderWrapper.getClass();
        mapboxHistoryRecorderWrapper.historyRecorder.pushHistory("android_route_refresh_events", "{\"type\":\"PeriodicRouteRefresh.RefreshAttemptScheduled\",\"resumeDelay\":" + z + '}');
        ContextScope contextScope = (ContextScope) this.PlaybackStateCompat;
        if (contextScope != null) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RoomDatabase.AnonymousClass1(z, this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (ShortNewsContentCardView) null), 3);
            int i2 = MediaSessionCompatToken + 109;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = MediaSessionCompatToken + 45;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void IconCompatParcelizer(setOffset setoffset) {
        int i = 2 % 2;
        getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc = (getMinimumTouchTargetSizeNHjbRc) this.IconCompatParcelizer;
        onLayoutModifierNodeChanged onlayoutmodifiernodechangedSerializer = getminimumtouchtargetsizenhjbrc.serializer(setoffset);
        this.read = onlayoutmodifiernodechangedSerializer;
        this.serializer = getminimumtouchtargetsizenhjbrc.write(setoffset, onlayoutmodifiernodechangedSerializer);
        x xVarRemoteActionCompatParcelizer = getminimumtouchtargetsizenhjbrc.RemoteActionCompatParcelizer(setoffset);
        this.write = xVarRemoteActionCompatParcelizer;
        LocalDocumentsView localDocumentsView = (LocalDocumentsView) this.RemoteActionCompatParcelizer;
        ChildHelper childHelper = (ChildHelper) this.serializer;
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged = (onLayoutModifierNodeChanged) this.read;
        this.MediaDescriptionCompat = new LocalDocumentsView(localDocumentsView, childHelper, xVarRemoteActionCompatParcelizer, onlayoutmodifiernodechanged);
        localDocumentsView.IconCompatParcelizer = onlayoutmodifiernodechanged;
        ut utVar = (ut) this.RatingCompat;
        LocalDocumentsView localDocumentsView2 = (LocalDocumentsView) this.MediaDescriptionCompat;
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged2 = (onLayoutModifierNodeChanged) this.read;
        utVar.RatingCompat = localDocumentsView2;
        utVar.MediaBrowserCompatMediaItem = onlayoutmodifiernodechanged2;
        utVar.write = true;
        int i2 = ParcelableVolumeInfo + 41;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SubcomposeLayoutPausableCompositionException IconCompatParcelizer() {
        int i = 2 % 2;
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = new SubcomposeLayoutPausableCompositionException(0);
        subcomposeLayoutPausableCompositionException.MediaMetadataCompat = (timesUQTWf7w) this.IconCompatParcelizer;
        subcomposeLayoutPausableCompositionException.PlaybackStateCompatCustomAction = (timesUQTWf7w) this.read;
        subcomposeLayoutPausableCompositionException.IconCompatParcelizer = (timesUQTWf7w) this.serializer;
        subcomposeLayoutPausableCompositionException.RemoteActionCompatParcelizer = (timesUQTWf7w) this.write;
        subcomposeLayoutPausableCompositionException.MediaDescriptionCompat = (SimplePlacementScope) this.RemoteActionCompatParcelizer;
        subcomposeLayoutPausableCompositionException.PlaybackStateCompat = (SimplePlacementScope) this.MediaDescriptionCompat;
        subcomposeLayoutPausableCompositionException.read = (SimplePlacementScope) this.RatingCompat;
        subcomposeLayoutPausableCompositionException.write = (SimplePlacementScope) this.MediaMetadataCompat;
        subcomposeLayoutPausableCompositionException.MediaBrowserCompatMediaItem = (Transition$1) this.MediaBrowserCompatMediaItem;
        subcomposeLayoutPausableCompositionException.RatingCompat = (Transition$1) this.MediaSessionCompatResultReceiverWrapper;
        subcomposeLayoutPausableCompositionException.serializer = (Transition$1) this.PlaybackStateCompat;
        subcomposeLayoutPausableCompositionException.MediaSessionCompatQueueItem = (Transition$1) this.MediaSessionCompatQueueItem;
        int i2 = MediaSessionCompatToken + 105;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return subcomposeLayoutPausableCompositionException;
    }

    public static boolean RemoteActionCompatParcelizer(setLastShapeui setlastshapeui, setLastShapeui setlastshapeui2, getFocusOwner getfocusowner) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 49;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
            if (setlastshapeui.write.serializer()) {
                return true;
            }
        } else if (setlastshapeui.write.serializer()) {
            return true;
        }
        if (setlastshapeui2.RatingCompat.read.IconCompatParcelizer - setlastshapeui.RatingCompat.read.IconCompatParcelizer >= 300 || setlastshapeui2.RemoteActionCompatParcelizer.read.IconCompatParcelizer - setlastshapeui.RemoteActionCompatParcelizer.read.IconCompatParcelizer >= 300) {
            return true;
        }
        if (getfocusowner == null) {
            int i4 = ParcelableVolumeInfo + 103;
            MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            int iRemoteActionCompatParcelizer = getfocusowner.IconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (getfocusowner.read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + getfocusowner.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + iRemoteActionCompatParcelizer > 0) {
                return true;
            }
        }
        return false;
    }

    public setLastShapeui RemoteActionCompatParcelizer(hitNearFh5PU_I hitnearfh5pu_i) {
        int i;
        setLastShapeui setlastshapeui;
        int i2 = 2 % 2;
        SparseArray sparseArray = (SparseArray) this.MediaSessionCompatResultReceiverWrapper;
        setLastShapeui setlastshapeui2 = ((SQLiteTargetCache) this.MediaBrowserCompatMediaItem).read(hitnearfh5pu_i);
        if (setlastshapeui2 != null) {
            i = setlastshapeui2.MediaSessionCompatQueueItem;
            setlastshapeui = new setLastShapeui(hitnearfh5pu_i, i, setlastshapeui2.read, setlastshapeui2.IconCompatParcelizer, setlastshapeui2.RatingCompat, setlastshapeui2.RemoteActionCompatParcelizer, setlastshapeui2.write, setlastshapeui2.serializer);
        } else {
            getLastMeasurementConstraintsmsEJaDkui getlastmeasurementconstraintsmsejadkui = new getLastMeasurementConstraintsmsEJaDkui();
            ((getMinimumTouchTargetSizeNHjbRc) this.IconCompatParcelizer).read(new WorkerKt$$ExternalSyntheticLambda2(this, getlastmeasurementconstraintsmsejadkui, hitnearfh5pu_i, 25), "Allocate target");
            i = getlastmeasurementconstraintsmsejadkui.RemoteActionCompatParcelizer;
            setlastshapeui = (setLastShapeui) getlastmeasurementconstraintsmsejadkui.write;
        }
        if (sparseArray.get(i) == null) {
            int i3 = MediaSessionCompatToken + 59;
            ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            sparseArray.put(i, setlastshapeui);
            ((HashMap) this.PlaybackStateCompat).put(hitnearfh5pu_i, Integer.valueOf(i));
            int i5 = MediaSessionCompatToken + 93;
            ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return setlastshapeui;
    }

    public I$b(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, compileStatement compilestatement, compileStatement compilestatement2, compileStatement compilestatement3, compileStatement compilestatement4, compileStatement compilestatement5, compileStatement compilestatement6, compileStatement compilestatement7, compileStatement compilestatement8, compileStatement compilestatement9, compileStatement compilestatement10, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8) {
        this.IconCompatParcelizer = brazeExternalSyntheticLambda28;
        this.read = compilestatement;
        this.serializer = compilestatement2;
        this.write = compilestatement3;
        this.RemoteActionCompatParcelizer = compilestatement4;
        this.MediaDescriptionCompat = compilestatement5;
        this.RatingCompat = compilestatement6;
        this.MediaMetadataCompat = compilestatement7;
        this.MediaBrowserCompatMediaItem = compilestatement8;
        this.MediaSessionCompatResultReceiverWrapper = compilestatement9;
        this.PlaybackStateCompat = compilestatement10;
        this.MediaSessionCompatQueueItem = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
    }

    public getDefaultNotificationAccentColorandroid_sdk_base_release write() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 67;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ((getLargeNotificationIconNameandroid_sdk_base_release) this.IconCompatParcelizer) != null ? 1 : 0;
        if (((getServerTargetandroid_sdk_base_release) this.read) != null) {
            i4++;
        }
        if (((getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release) this.serializer) != null) {
            i4++;
        }
        if (((getHandlePushDeepLinksAutomaticallyandroid_sdk_base_release) this.RemoteActionCompatParcelizer) != null) {
            i4++;
        }
        if (((getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release) this.MediaDescriptionCompat) != null) {
            i4++;
            int i5 = i2 + 69;
            MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (((Short) this.write) != null) {
            i4++;
        }
        if (((isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release) this.RatingCompat) != null) {
            i4++;
        }
        if (((isPushHtmlRenderingEnabledandroid_sdk_base_release) this.MediaMetadataCompat) != null) {
            int i7 = MediaSessionCompatToken + 53;
            ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                i4++;
            }
        }
        if (((isPushWakeScreenForNotificationEnabledandroid_sdk_base_release) this.MediaBrowserCompatMediaItem) != null) {
            int i8 = MediaSessionCompatToken + 111;
            ParcelableVolumeInfo = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i4++;
        }
        if (((setAdmMessagingRegistrationEnabledandroid_sdk_base_release) this.MediaSessionCompatResultReceiverWrapper) != null) {
            i4++;
        }
        if (((isSdkAuthEnabledandroid_sdk_base_release) this.PlaybackStateCompat) != null) {
            int i10 = ParcelableVolumeInfo + 29;
            MediaSessionCompatToken = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                i4++;
            }
        }
        if (((getSessionTimeoutandroid_sdk_base_release) this.MediaSessionCompatQueueItem) != null) {
            i4++;
        }
        if (i4 == 1) {
            return new getDefaultNotificationAccentColorandroid_sdk_base_release(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i4, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public BrazeCompanionExternalSyntheticLambda4 read() {
        int i = 2 % 2;
        if (((Long) this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
            return null;
        }
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 39;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (((Integer) this.read) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'latitude' is missing");
            return null;
        }
        int i5 = i2 + 7;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (((Integer) this.serializer) != null) {
            return new BrazeCompanionExternalSyntheticLambda4(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'longitude' is missing");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        if (o.setCarryoverInAppMessage.serializer(r8, o.MultiInstanceInvalidationClient.UAE.toString(), true) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.BrazeExternalSyntheticLambda28 read(o.accessgetTextTopcp r8) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.I$b.read(o.accessgetTextTopcp):o.BrazeExternalSyntheticLambda28");
    }

    public m IconCompatParcelizer(accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp, boolean z) {
        setLastShapeui setlastshapeui;
        asList aslistIconCompatParcelizer;
        SnapshotVersion snapshotVersion;
        boolean zRemoteActionCompatParcelizer;
        int i = 2 % 2;
        SQLiteTargetCache sQLiteTargetCache = (SQLiteTargetCache) this.MediaBrowserCompatMediaItem;
        hitNearFh5PU_I hitnearfh5pu_i = accesssetlastlayerdrawingwasskippedp.read();
        Integer num = (Integer) ((HashMap) this.PlaybackStateCompat).get(hitnearfh5pu_i);
        if (num != null) {
            int i2 = ParcelableVolumeInfo + 11;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setlastshapeui = (setLastShapeui) ((SparseArray) this.MediaSessionCompatResultReceiverWrapper).get(num.intValue());
        } else {
            setlastshapeui = sQLiteTargetCache.read(hitnearfh5pu_i);
        }
        SnapshotVersion snapshotVersion2 = SnapshotVersion.IconCompatParcelizer;
        asList aslist = visitNodes.IconCompatParcelizer;
        if (setlastshapeui != null) {
            snapshotVersion = setlastshapeui.RemoteActionCompatParcelizer;
            int i4 = setlastshapeui.MediaSessionCompatQueueItem;
            sQLiteTargetCache.getClass();
            aslistIconCompatParcelizer = visitNodes.IconCompatParcelizer;
            x xVar = sQLiteTargetCache.write.read("SELECT path FROM target_documents WHERE target_id = ?");
            xVar.IconCompatParcelizer(Integer.valueOf(i4));
            Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
            while (cursorIconCompatParcelizer.moveToNext()) {
                try {
                    aslistIconCompatParcelizer = aslistIconCompatParcelizer.IconCompatParcelizer(new visitNodes(updateLayerParameters.RemoteActionCompatParcelizer(cursorIconCompatParcelizer.getString(0))));
                    int i5 = MediaSessionCompatToken + 55;
                    ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    if (cursorIconCompatParcelizer != null) {
                        try {
                            cursorIconCompatParcelizer.close();
                            int i7 = ParcelableVolumeInfo + 93;
                            MediaSessionCompatToken = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorIconCompatParcelizer.close();
        } else {
            aslistIconCompatParcelizer = aslist;
            snapshotVersion = snapshotVersion2;
        }
        ut utVar = (ut) this.RatingCompat;
        accessswap accessswapVarSerializer = null;
        if (z) {
            int i9 = ParcelableVolumeInfo + 117;
            MediaSessionCompatToken = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                throw null;
            }
            snapshotVersion2 = snapshotVersion;
        }
        getRectManager.RemoteActionCompatParcelizer(utVar.write, "initialize() not called", new Object[0]);
        accessswap accessswapVarWrite = utVar.read(accesssetlastlayerdrawingwasskippedp);
        if (accessswapVarWrite == null) {
            if (!(!(accesssetlastlayerdrawingwasskippedp instanceof accessoutOfBoundsHit8NAm7pk))) {
                int i10 = ParcelableVolumeInfo + 117;
                MediaSessionCompatToken = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                Iterator it = ((accessoutOfBoundsHit8NAm7pk) accesssetlastlayerdrawingwasskippedp).read.IconCompatParcelizer().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zRemoteActionCompatParcelizer = true;
                        break;
                    }
                    int i12 = ParcelableVolumeInfo + 101;
                    MediaSessionCompatToken = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    specifiesCanFocusProperty specifiescanfocusproperty = (specifiesCanFocusProperty) it.next();
                    if (specifiescanfocusproperty.serializer.equals(MapboxMap.QFE_LIMIT) || (specifiescanfocusproperty instanceof maxHeightui)) {
                        zRemoteActionCompatParcelizer = false;
                        break;
                    }
                }
            } else {
                if (!(accesssetlastlayerdrawingwasskippedp instanceof ancestorToLocal)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i14 = ParcelableVolumeInfo + 49;
                MediaSessionCompatToken = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                zRemoteActionCompatParcelizer = ((ancestorToLocal) accesssetlastlayerdrawingwasskippedp).IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
            if ((!zRemoteActionCompatParcelizer) && !snapshotVersion2.equals(SnapshotVersion.IconCompatParcelizer)) {
                asList aslistRemoteActionCompatParcelizer = ut.RemoteActionCompatParcelizer(accesssetlastlayerdrawingwasskippedp, ((LocalDocumentsView) utVar.RatingCompat).serializer(aslistIconCompatParcelizer));
                if (!ut.serializer(accesssetlastlayerdrawingwasskippedp, aslistIconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), aslistRemoteActionCompatParcelizer, snapshotVersion2)) {
                    if (onEndApplyChanges.RemoteActionCompatParcelizer()) {
                        onEndApplyChanges.read("QueryEngine", "Re-using previous result from %s to execute query: %s", snapshotVersion2.toString(), accesssetlastlayerdrawingwasskippedp.toString());
                    }
                    setWrappedui setwrappedui = setWrappedui.RemoteActionCompatParcelizer;
                    Timestamp timestamp = snapshotVersion2.read;
                    long j = timestamp.IconCompatParcelizer;
                    int i16 = timestamp.RemoteActionCompatParcelizer + 1;
                    accessswapVarSerializer = utVar.serializer(aslistRemoteActionCompatParcelizer, accesssetlastlayerdrawingwasskippedp, new setWrappedui(new SnapshotVersion(((double) i16) == 1.0E9d ? new Timestamp(j + 1, 0) : new Timestamp(j, i16)), visitNodes.RemoteActionCompatParcelizer(), -1));
                }
            }
            if (accessswapVarSerializer != null) {
                accessswapVarWrite = accessswapVarSerializer;
            } else {
                Timestamp.Companion companion = new Timestamp.Companion(0);
                if (onEndApplyChanges.RemoteActionCompatParcelizer()) {
                    onEndApplyChanges.read("QueryEngine", "Using full collection scan to execute query: %s", accesssetlastlayerdrawingwasskippedp.toString());
                }
                accessswapVarWrite = ((LocalDocumentsView) utVar.RatingCompat).write(accesssetlastlayerdrawingwasskippedp, setWrappedui.RemoteActionCompatParcelizer, companion);
            }
        }
        return new m(accessswapVarWrite, 4, aslistIconCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c5  */
    public static final Object access$executePlannedRefresh(I$b i$b, List list, boolean z, ContinuationImpl continuationImpl) {
        PlannedRouteRefreshController$executePlannedRefresh$1 plannedRouteRefreshController$executePlannedRefresh$1;
        Iterator it;
        I$b i$b2 = i$b;
        List list2 = list;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 83;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!(continuationImpl instanceof PlannedRouteRefreshController$executePlannedRefresh$1)) {
                plannedRouteRefreshController$executePlannedRefresh$1 = new PlannedRouteRefreshController$executePlannedRefresh$1(i$b2, continuationImpl);
            } else {
                int i4 = i2 + 105;
                MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                plannedRouteRefreshController$executePlannedRefresh$1 = (PlannedRouteRefreshController$executePlannedRefresh$1) continuationImpl;
                int i6 = plannedRouteRefreshController$executePlannedRefresh$1.label;
                if ((i6 & Integer.MIN_VALUE) == 0) {
                    plannedRouteRefreshController$executePlannedRefresh$1 = new PlannedRouteRefreshController$executePlannedRefresh$1(i$b2, continuationImpl);
                } else {
                    int i7 = ParcelableVolumeInfo + 87;
                    MediaSessionCompatToken = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        plannedRouteRefreshController$executePlannedRefresh$1.label = i6 >> Integer.MIN_VALUE;
                    } else {
                        plannedRouteRefreshController$executePlannedRefresh$1.label = i6 - Integer.MIN_VALUE;
                    }
                }
            }
            Object result = plannedRouteRefreshController$executePlannedRefresh$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = plannedRouteRefreshController$executePlannedRefresh$1.label;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(result);
                N$b n$b = (N$b) i$b2.IconCompatParcelizer;
                PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1 plannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1 = new PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1(z, i$b2);
                plannedRouteRefreshController$executePlannedRefresh$1.L$0 = i$b2;
                plannedRouteRefreshController$executePlannedRefresh$1.L$1 = list2;
                plannedRouteRefreshController$executePlannedRefresh$1.label = 1;
                n$b.getClass();
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(plannedRouteRefreshController$executePlannedRefresh$1));
                cancellableContinuationImpl.read();
                cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ObjectList$toString$1(23, n$b));
                ObjectList$toString$1 objectList$toString$1 = new ObjectList$toString$1(24, cancellableContinuationImpl);
                QueuedRequest queuedRequest = (QueuedRequest) n$b.serializer;
                if (queuedRequest != null) {
                    queuedRequest.finishCallback.invoke(new getPerformImeAction() { // from class: com.mapbox.navigation.core.routerefresh.RoutesRefresherExecutorResult$ReplacedByNewer
                    });
                }
                n$b.serializer = new QueuedRequest(list2, plannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1, objectList$toString$1);
                n$b.runQueue();
                result = cancellableContinuationImpl.getResult();
                if (result == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i8 == 1) {
                List list3 = plannedRouteRefreshController$executePlannedRefresh$1.L$1;
                I$b i$b3 = plannedRouteRefreshController$executePlannedRefresh$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(result);
                list2 = list3;
                i$b2 = i$b3;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getPerformImeAction getperformimeaction = (getPerformImeAction) result;
            boolean z2 = getperformimeaction instanceof RoutesRefresherExecutorResult$ReplacedByNewer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (z2) {
                LoggerProviderKt.logW("Planned route refresh error: request is skipped as a newer one is available", "RouteRefreshController");
                return createfromparcel;
            }
            if (getperformimeaction instanceof RoutesRefresherExecutorResult$Finished) {
                Parser.Pair pair = (Parser.Pair) i$b2.RemoteActionCompatParcelizer;
                getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = (getUseEvaluationsCachefwf_client_release) i$b2.RatingCompat;
                FocusMeteringAction focusMeteringAction = (FocusMeteringAction) i$b2.write;
                x xVar = (x) i$b2.serializer;
                RoutesRefresherResult routesRefresherResult = ((RoutesRefresherExecutorResult$Finished) getperformimeaction).value;
                pair.getClass();
                routesRefresherResult.getClass();
                ArrayList arrayList = routesRefresherResult.alternativesRouteRefresherResults;
                RouteRefresherResult routeRefresherResult = routesRefresherResult.primaryRouteRefresherResult;
                getPageLeft getpageleft = routeRefresherResult.status;
                NavigationRoute navigationRoute = routeRefresherResult.route;
                LinkedHashSet linkedHashSet = (LinkedHashSet) pair.write;
                ArrayList arrayList2 = new ArrayList();
                RouteRefresherStatus$Failure routeRefresherStatus$Failure = RouteRefresherStatus$Failure.INSTANCE$2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpageleft, routeRefresherStatus$Failure}, getCieXyz.write())).booleanValue() && linkedHashSet.add(navigationRoute.id)) {
                    int i9 = MediaSessionCompatToken + 7;
                    ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        arrayList2.add(navigationRoute);
                    } else {
                        arrayList2.add(navigationRoute);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    RouteRefresherResult routeRefresherResult2 = (RouteRefresherResult) it2.next();
                    Iterator it3 = it2;
                    getPageLeft getpageleft2 = routeRefresherResult2.status;
                    NavigationRoute navigationRoute2 = routeRefresherResult2.route;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpageleft2, routeRefresherStatus$Failure}, getCieXyz.write())).booleanValue() && linkedHashSet.add(navigationRoute2.id)) {
                        arrayList2.add(navigationRoute2);
                    }
                    it2 = it3;
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it4 = ((CopyOnWriteArraySet) ((Vw$Vw) pair.RemoteActionCompatParcelizer).IconCompatParcelizer).iterator();
                    if (it4.hasNext()) {
                        throw ff$$ExternalSyntheticOutline0.m(it4);
                    }
                }
                String str = (String) ((SearchOptionsKt$validateLimit$1) i$b2.MediaBrowserCompatMediaItem).invoke();
                String str2 = routesRefresherResult.anySuccess() ? navigationRoute.id : null;
                ((p0) i$b2.MediaMetadataCompat).getClass();
                if (str != null) {
                    int i10 = ParcelableVolumeInfo + 97;
                    int i11 = i10 % Fields.SpotShadowColor;
                    MediaSessionCompatToken = i11;
                    if (i10 % 2 != 0) {
                        int i12 = 83 / 0;
                        if (str2 == null) {
                            int i13 = i11 + 7;
                            ParcelableVolumeInfo = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                        } else if (!str.equals(str2)) {
                            LoggerProviderKt.logW(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Skipping stale planned refresh result, as primary route changed since refresh started. Refreshed primary=", str2, ", current primary=", str, ". The next planned refresh will use the latest routes."), "RouteRefreshController");
                            return createfromparcel;
                        }
                    } else if (str2 == null) {
                        int i15 = i11 + 7;
                        ParcelableVolumeInfo = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                    } else if (!str.equals(str2)) {
                        LoggerProviderKt.logW(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Skipping stale planned refresh result, as primary route changed since refresh started. Refreshed primary=", str2, ", current primary=", str, ". The next planned refresh will use the latest routes."), "RouteRefreshController");
                        return createfromparcel;
                    }
                }
                if (routesRefresherResult.anySuccess()) {
                    xVar.getClass();
                    xVar.onNewState("FINISHED_SUCCESS", null);
                    focusMeteringAction.onRoutesRefreshed(routesRefresherResult);
                    List list4 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(((RouteRefresherResult) it5.next()).route);
                    }
                    ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList3, list4);
                    i$b2.MediaSessionCompatQueueItem = arrayListIconCompatParcelizer;
                    getuseevaluationscachefwf_client_release.write = 0;
                    i$b2.postAttempt(new AuthRepository$logoutUser$2(i$b2, arrayListIconCompatParcelizer, null, 7), false);
                    int i17 = ParcelableVolumeInfo + 29;
                    MediaSessionCompatToken = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 != 0) {
                        int i18 = 25 / 0;
                    }
                    return createfromparcel;
                }
                RouteRefresherStatus$Failure routeRefresherStatus$Failure2 = RouteRefresherStatus$Failure.INSTANCE;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpageleft, routeRefresherStatus$Failure2}, getCieXyz.write())).booleanValue()) {
                    int i19 = ParcelableVolumeInfo + 95;
                    MediaSessionCompatToken = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        if (!arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            do {
                                if (it.hasNext()) {
                                }
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((RouteRefresherResult) it.next()).status, routeRefresherStatus$Failure2}, getCieXyz.write())).booleanValue());
                            if (getuseevaluationscachefwf_client_release.write < 2) {
                                i$b2.postAttempt(new PlannedRouteRefreshController$scheduleUpdateRetry$1(i$b2, list2, false, null), false);
                                return createfromparcel;
                            }
                        }
                    } else {
                        int i20 = 49 / 0;
                        if (!arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            do {
                                if (it.hasNext()) {
                                }
                            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((RouteRefresherResult) it.next()).status, routeRefresherStatus$Failure2}, getCieXyz.write())).booleanValue());
                            if (getuseevaluationscachefwf_client_release.write < 2) {
                                i$b2.postAttempt(new PlannedRouteRefreshController$scheduleUpdateRetry$1(i$b2, list2, false, null), false);
                                return createfromparcel;
                            }
                        }
                    }
                } else if (getuseevaluationscachefwf_client_release.write < 2) {
                    i$b2.postAttempt(new PlannedRouteRefreshController$scheduleUpdateRetry$1(i$b2, list2, false, null), false);
                    return createfromparcel;
                }
                xVar.onNewState("FINISHED_FAILED", null);
                focusMeteringAction.onRoutesRefreshed(routesRefresherResult);
                getuseevaluationscachefwf_client_release.write = 0;
                i$b2.postAttempt(new AuthRepository$logoutUser$2(i$b2, list2, null, 7), false);
            }
            return createfromparcel;
        }
        boolean z3 = continuationImpl instanceof PlannedRouteRefreshController$executePlannedRefresh$1;
        obj.hashCode();
        throw null;
    }

    public I$b(int i) {
    }
}
