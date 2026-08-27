package o;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.transition.Transition$1;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.huawei.hms.framework.common.BundleUtil;
import io.grpc.CallOptions$Builder;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class checkChildrenPlaceOrderForUpdates {
    public static final io.sentry.cache.read IconCompatParcelizer;
    private static byte r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
    private static int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 0;
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 1;
    public static final Charset read;
    public final androidx.work.impl.WorkerWrapper.Builder ComponentActivity;
    public markNodeAndSubtreeAsPlaced MediaBrowserCompatMediaItem;
    public final CrashlyticsWorkers MediaDescriptionCompat;
    public final ComponentRegistry$Builder MediaMetadataCompat;
    public final androidx.work.impl.WorkerWrapper.Builder MediaSessionCompatQueueItem;
    public final getPlacedOnceui MediaSessionCompatToken;
    public final androidx.work.impl.WorkerWrapper.Builder ParcelableVolumeInfo;
    public final IdManager PlaybackStateCompat;
    public final getCachedAlignmentLinesMap PlaybackStateCompatCustomAction;
    public final zzbv RatingCompat;
    public final CallOptions$Builder RemoteActionCompatParcelizer;
    public final getDetachedFromParentLookaheadPlacement r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final Context serializer;
    public final positionIniSbpLlYui write;
    public final ParentDataModifierDefaultImpls ResultReceiver = new ParentDataModifierDefaultImpls();
    public final ParentDataModifierDefaultImpls MediaSessionCompatResultReceiverWrapper = new ParentDataModifierDefaultImpls();
    public final ParentDataModifierDefaultImpls r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ParentDataModifierDefaultImpls();

    public final void read() {
        try {
            String strIconCompatParcelizer = IconCompatParcelizer();
            if (strIconCompatParcelizer != null) {
                try {
                    ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.ComponentActivity.MediaMetadataCompat).IconCompatParcelizer("com.crashlytics.version-control-info", strIconCompatParcelizer);
                } catch (IllegalArgumentException e) {
                    Context context = this.serializer;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    SentryLogcatAdapter.read("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
            }
        } catch (IOException e2) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final String serializer() {
        NavigableSet navigableSetSerializer = ((ModifierNodeElement) this.ParcelableVolumeInfo.MediaSessionCompatQueueItem).serializer();
        if (navigableSetSerializer.isEmpty()) {
            return null;
        }
        return (String) navigableSetSerializer.first();
    }

    static {
        RemoteActionCompatParcelizer();
        IconCompatParcelizer = new io.sentry.cache.read(2);
        read = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    }

    public final boolean read(access500 access500Var) throws Throwable {
        CrashlyticsWorkers.checkBackgroundThread();
        markNodeAndSubtreeAsPlaced marknodeandsubtreeasplaced = this.MediaBrowserCompatMediaItem;
        if (marknodeandsubtreeasplaced != null && marknodeandsubtreeasplaced.RemoteActionCompatParcelizer.get()) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            read(true, access500Var, true);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return true;
        } catch (Exception e) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final void IconCompatParcelizer(Boolean bool, String str) {
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        java.util.Locale locale = java.util.Locale.US;
        IdManager idManager = this.PlaybackStateCompat;
        CallOptions$Builder callOptions$Builder = this.RemoteActionCompatParcelizer;
        MeasureAndLayoutDelegatePostponedRequest measureAndLayoutDelegatePostponedRequest = new MeasureAndLayoutDelegatePostponedRequest(idManager.RemoteActionCompatParcelizer, (String) callOptions$Builder.RatingCompat, (String) callOptions$Builder.IconCompatParcelizer, idManager.RemoteActionCompatParcelizer().write, getMeasurePending.determineFrom((String) callOptions$Builder.write).getId(), (zzbv) callOptions$Builder.MediaSessionCompatQueueItem);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        MeasureAndLayoutDelegateKt measureAndLayoutDelegateKt = new MeasureAndLayoutDelegateKt(accessgetOuterCoordinator.write());
        Context context = this.serializer;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        int iOrdinal = accessgetLayoutNode.getValue().ordinal();
        String str4 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jRemoteActionCompatParcelizer = accessgetOuterCoordinator.RemoteActionCompatParcelizer(context);
        boolean zSerializer = accessgetOuterCoordinator.serializer();
        int iRemoteActionCompatParcelizer = accessgetOuterCoordinator.RemoteActionCompatParcelizer();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.PRODUCT;
        isLookahead islookahead = new isLookahead(iOrdinal, iAvailableProcessors, jRemoteActionCompatParcelizer, blockCount * blockSize, zSerializer, iRemoteActionCompatParcelizer);
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = this.PlaybackStateCompatCustomAction;
        isForced isforced = new isForced(measureAndLayoutDelegatePostponedRequest, measureAndLayoutDelegateKt, islookahead);
        getcachedalignmentlinesmap.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        getcachedalignmentlinesmap.IconCompatParcelizer.IconCompatParcelizer(new accessgetLeftBracketcp(str, jCurrentTimeMillis, isforced));
        if (bool.booleanValue() && str != null) {
            androidx.work.impl.WorkerWrapper.Builder builder = this.ComponentActivity;
            synchronized (((String) builder.read)) {
                builder.read = str;
                invalidateIntrinsicsParent invalidateintrinsicsparent = (invalidateIntrinsicsParent) ((AtomicMarkableReference) ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) builder.MediaBrowserCompatMediaItem).write).getReference();
                synchronized (invalidateintrinsicsparent) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(invalidateintrinsicsparent.IconCompatParcelizer));
                }
                ((CrashlyticsWorkers) builder.MediaSessionCompatQueueItem).write.serializer(new r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(builder, str, mapUnmodifiableMap, ((setupDirectionalNavigationlambda2) builder.IconCompatParcelizer).read(), 3));
            }
        }
        getPlacedOnceui getplacedonceui = this.MediaSessionCompatToken;
        ((getPerformMeasureBlockui) getplacedonceui.read).read();
        getplacedonceui.read = getPlacedOnceui.IconCompatParcelizer;
        if (str != null) {
            getplacedonceui.read = new markNodeAndSubtreeAsNotPlacedui(((androidx.work.impl.WorkerWrapper.Builder) getplacedonceui.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(str, "userlog"));
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(str);
        androidx.work.impl.WorkerWrapper.Builder builder2 = this.ParcelableVolumeInfo;
        getLayoutPendingForAlignment getlayoutpendingforalignment = (getLayoutPendingForAlignment) builder2.write;
        Charset charset = traceMeasureLayout.PlaybackStateCompat;
        getCanAffectPlacedParent getcanaffectplacedparent = new getCanAffectPlacedParent();
        getcanaffectplacedparent.PlaybackStateCompatCustomAction = "20.0.4";
        CallOptions$Builder callOptions$Builder2 = getlayoutpendingforalignment.IconCompatParcelizer;
        String str7 = (String) callOptions$Builder2.serializer;
        if (str7 != null) {
            getcanaffectplacedparent.MediaMetadataCompat = str7;
            IdManager idManager2 = getlayoutpendingforalignment.write;
            String str8 = idManager2.RemoteActionCompatParcelizer().write;
            if (str8 != null) {
                getcanaffectplacedparent.MediaSessionCompatQueueItem = str8;
                getcanaffectplacedparent.RatingCompat = idManager2.RemoteActionCompatParcelizer().IconCompatParcelizer;
                getcanaffectplacedparent.write = idManager2.RemoteActionCompatParcelizer().read;
                String str9 = (String) callOptions$Builder2.RatingCompat;
                if (str9 != null) {
                    getcanaffectplacedparent.serializer = str9;
                    String str10 = (String) callOptions$Builder2.IconCompatParcelizer;
                    if (str10 != null) {
                        getcanaffectplacedparent.IconCompatParcelizer = str10;
                        getcanaffectplacedparent.MediaBrowserCompatMediaItem = 4;
                        getcanaffectplacedparent.MediaSessionCompatResultReceiverWrapper = (byte) (getcanaffectplacedparent.MediaSessionCompatResultReceiverWrapper | 1);
                        remeasureAndRelayoutIfNeeded remeasureandrelayoutifneeded = new remeasureAndRelayoutIfNeeded();
                        remeasureandrelayoutifneeded.RemoteActionCompatParcelizer = false;
                        byte b = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 2);
                        remeasureandrelayoutifneeded.MediaSessionCompatToken = jCurrentTimeMillis;
                        remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (b | 1);
                        if (str != null) {
                            remeasureandrelayoutifneeded.MediaDescriptionCompat = str;
                            String str11 = getLayoutPendingForAlignment.read;
                            if (str11 != null) {
                                remeasureandrelayoutifneeded.MediaBrowserCompatMediaItem = str11;
                                String str12 = idManager2.RemoteActionCompatParcelizer;
                                if (str12 != null) {
                                    String str13 = idManager2.RemoteActionCompatParcelizer().write;
                                    zzbv zzbvVar = (zzbv) callOptions$Builder2.MediaSessionCompatQueueItem;
                                    if (((zzbv) zzbvVar.RemoteActionCompatParcelizer) == null) {
                                        zzbvVar.RemoteActionCompatParcelizer = new zzbv(zzbvVar);
                                    }
                                    zzbv zzbvVar2 = (zzbv) zzbvVar.RemoteActionCompatParcelizer;
                                    String str14 = (String) zzbvVar2.write;
                                    if (zzbvVar2 == null) {
                                        zzbvVar.RemoteActionCompatParcelizer = new zzbv(zzbvVar);
                                    }
                                    remeasureandrelayoutifneeded.serializer = new remeasureIfNeeded(str12, str9, str10, str13, str14, (String) ((zzbv) zzbvVar.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer);
                                    updateRootConstraintsBRTryo0 updaterootconstraintsbrtryo0 = new updateRootConstraintsBRTryo0();
                                    updaterootconstraintsbrtryo0.RemoteActionCompatParcelizer = 3;
                                    updaterootconstraintsbrtryo0.IconCompatParcelizer = (byte) (updaterootconstraintsbrtryo0.IconCompatParcelizer | 1);
                                    if (str2 != null) {
                                        updaterootconstraintsbrtryo0.read = str2;
                                        if (str3 != null) {
                                            updaterootconstraintsbrtryo0.serializer = str3;
                                            updaterootconstraintsbrtryo0.write = accessgetOuterCoordinator.write();
                                            updaterootconstraintsbrtryo0.IconCompatParcelizer = (byte) (updaterootconstraintsbrtryo0.IconCompatParcelizer | 2);
                                            remeasureandrelayoutifneeded.MediaSessionCompatQueueItem = updaterootconstraintsbrtryo0.read();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            String str15 = Build.CPU_ABI;
                                            int iIntValue = (TextUtils.isEmpty(str15) || (num = (Integer) getLayoutPendingForAlignment.RemoteActionCompatParcelizer.get(str15.toLowerCase(locale))) == null) ? 7 : num.intValue();
                                            int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long jRemoteActionCompatParcelizer2 = accessgetOuterCoordinator.RemoteActionCompatParcelizer(getlayoutpendingforalignment.serializer);
                                            long blockCount2 = statFs2.getBlockCount();
                                            long blockSize2 = statFs2.getBlockSize();
                                            boolean zSerializer2 = accessgetOuterCoordinator.serializer();
                                            int iRemoteActionCompatParcelizer2 = accessgetOuterCoordinator.RemoteActionCompatParcelizer();
                                            remeasureLookaheadRootsInSubtree remeasurelookaheadrootsinsubtree = new remeasureLookaheadRootsInSubtree();
                                            remeasurelookaheadrootsinsubtree.read = iIntValue;
                                            byte b2 = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 1);
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = b2;
                                            if (str4 != 0) {
                                                remeasurelookaheadrootsinsubtree.IconCompatParcelizer = str4;
                                                remeasurelookaheadrootsinsubtree.RemoteActionCompatParcelizer = iAvailableProcessors2;
                                                remeasurelookaheadrootsinsubtree.MediaDescriptionCompat = jRemoteActionCompatParcelizer2;
                                                remeasurelookaheadrootsinsubtree.write = blockSize2 * blockCount2;
                                                remeasurelookaheadrootsinsubtree.RatingCompat = zSerializer2;
                                                remeasurelookaheadrootsinsubtree.MediaMetadataCompat = iRemoteActionCompatParcelizer2;
                                                remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
                                                if (str5 != null) {
                                                    remeasurelookaheadrootsinsubtree.serializer = str5;
                                                    if (str6 != 0) {
                                                        remeasurelookaheadrootsinsubtree.MediaBrowserCompatMediaItem = str6;
                                                        remeasureandrelayoutifneeded.IconCompatParcelizer = remeasurelookaheadrootsinsubtree.read();
                                                        remeasureandrelayoutifneeded.RatingCompat = 3;
                                                        remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 4);
                                                        getcanaffectplacedparent.ParcelableVolumeInfo = remeasureandrelayoutifneeded.serializer();
                                                        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced = getcanaffectplacedparent.read();
                                                        androidx.work.impl.WorkerWrapper.Builder builder3 = ((ModifierNodeElement) builder2.MediaSessionCompatQueueItem).MediaBrowserCompatMediaItem;
                                                        trackMeasurementByParent trackmeasurementbyparent = ensuresubtreelookaheadreplaced.ParcelableVolumeInfo;
                                                        if (trackmeasurementbyparent == null) {
                                                            Log.isLoggable("FirebaseCrashlytics", 3);
                                                            return;
                                                        }
                                                        String str16 = ((performMeasureAndLayout) trackmeasurementbyparent).MediaSessionCompatQueueItem;
                                                        try {
                                                            ModifierNodeElement.read.getClass();
                                                            ModifierNodeElement.read(builder3.RemoteActionCompatParcelizer(str16, "report"), didInsert.IconCompatParcelizer.IconCompatParcelizer(ensuresubtreelookaheadreplaced));
                                                            File fileRemoteActionCompatParcelizer = builder3.RemoteActionCompatParcelizer(str16, "start-time");
                                                            long j = ((performMeasureAndLayout) trackmeasurementbyparent).MediaSessionCompatToken;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(getPositionInRoot.write(new FileOutputStream(fileRemoteActionCompatParcelizer), fileRemoteActionCompatParcelizer), ModifierNodeElement.RemoteActionCompatParcelizer);
                                                            try {
                                                                outputStreamWriter.write("");
                                                                fileRemoteActionCompatParcelizer.setLastModified(j * 1000);
                                                                outputStreamWriter.close();
                                                                return;
                                                            } catch (Throwable th) {
                                                                try {
                                                                    outputStreamWriter.close();
                                                                    throw th;
                                                                } catch (Throwable th2) {
                                                                    th.addSuppressed(th2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (IOException unused) {
                                                            Log.isLoggable("FirebaseCrashlytics", 3);
                                                            return;
                                                        }
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null modelClass");
                                                    return;
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null manufacturer");
                                                return;
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null model");
                                            return;
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null buildVersion");
                                        return;
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null version");
                                    return;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null identifier");
                                return;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null generator");
                            return;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null identifier");
                        return;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null displayVersion");
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null buildVersion");
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null installationUuid");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null gmpAppId");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:137:0x04b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    public final void read(boolean z, access500 access500Var, boolean z2) throws Throwable {
        androidx.work.impl.WorkerWrapper.Builder builder;
        ArrayList arrayList;
        int i;
        String str;
        boolean z3;
        String str2;
        String strSubstring;
        String str3;
        File file;
        boolean z4;
        List listRemoteActionCompatParcelizer;
        ApplicationExitInfo next;
        String strWrite;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStreamWrite;
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = this.PlaybackStateCompatCustomAction;
        CrashlyticsWorkers.checkBackgroundThread();
        androidx.work.impl.WorkerWrapper.Builder builder2 = this.ParcelableVolumeInfo;
        ArrayList arrayList2 = new ArrayList(((ModifierNodeElement) builder2.MediaSessionCompatQueueItem).serializer());
        if (arrayList2.size() <= z) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        String str4 = (String) arrayList2.get(z == true ? 1 : 0);
        if (z2 && access500Var.write().read.IconCompatParcelizer) {
            androidx.work.impl.WorkerWrapper.Builder builder3 = this.MediaSessionCompatQueueItem;
            if (Build.VERSION.SDK_INT >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.serializer.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    getPlacedOnceui getplacedonceui = new getPlacedOnceui(builder3);
                    getplacedonceui.read = getPlacedOnceui.IconCompatParcelizer;
                    if (str4 != null) {
                        getplacedonceui.read = new markNodeAndSubtreeAsNotPlacedui(builder3.RemoteActionCompatParcelizer(str4, "userlog"));
                    }
                    CrashlyticsWorkers crashlyticsWorkers = this.MediaDescriptionCompat;
                    isPlacedui isplacedui = new isPlacedui(builder3);
                    androidx.work.impl.WorkerWrapper.Builder builder4 = new androidx.work.impl.WorkerWrapper.Builder(str4, builder3, crashlyticsWorkers);
                    ((invalidateIntrinsicsParent) ((AtomicMarkableReference) ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) builder4.MediaBrowserCompatMediaItem).write).getReference()).serializer(isplacedui.serializer(str4, false));
                    ((invalidateIntrinsicsParent) ((AtomicMarkableReference) ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) builder4.MediaMetadataCompat).write).getReference()).serializer(isplacedui.serializer(str4, true));
                    ((AtomicMarkableReference) builder4.RemoteActionCompatParcelizer).set(isplacedui.IconCompatParcelizer(str4), false);
                    setupDirectionalNavigationlambda2 setupdirectionalnavigationlambda2 = (setupDirectionalNavigationlambda2) builder4.IconCompatParcelizer;
                    File fileRemoteActionCompatParcelizer = builder3.RemoteActionCompatParcelizer(str4, "rollouts-state");
                    if (fileRemoteActionCompatParcelizer.exists() && fileRemoteActionCompatParcelizer.length() != 0) {
                        try {
                            fileInputStreamWrite = getActiveFocusTargetNode.write(fileRemoteActionCompatParcelizer, new FileInputStream(fileRemoteActionCompatParcelizer));
                            try {
                                try {
                                    listRemoteActionCompatParcelizer = isPlacedui.RemoteActionCompatParcelizer(accessgetOuterCoordinator.RemoteActionCompatParcelizer(fileInputStreamWrite));
                                    listRemoteActionCompatParcelizer.toString();
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    accessgetOuterCoordinator.IconCompatParcelizer(fileInputStreamWrite, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    isPlacedui.RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
                                    accessgetOuterCoordinator.IconCompatParcelizer(fileInputStreamWrite, "Failed to close rollouts state file.");
                                    listRemoteActionCompatParcelizer = Collections.EMPTY_LIST;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStreamWrite;
                                accessgetOuterCoordinator.IconCompatParcelizer(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStreamWrite = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            accessgetOuterCoordinator.IconCompatParcelizer(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } else {
                        if (fileRemoteActionCompatParcelizer.exists() && fileRemoteActionCompatParcelizer.delete()) {
                            fileRemoteActionCompatParcelizer.getAbsolutePath();
                        }
                        listRemoteActionCompatParcelizer = Collections.EMPTY_LIST;
                    }
                    setupdirectionalnavigationlambda2.write(listRemoteActionCompatParcelizer);
                    ModifierNodeElement modifierNodeElement = (ModifierNodeElement) builder2.MediaSessionCompatQueueItem;
                    long jLastModified = modifierNodeElement.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(str4, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        builder = builder2;
                        arrayList = arrayList2;
                    } else {
                        getLayoutPendingForAlignment getlayoutpendingforalignment = (getLayoutPendingForAlignment) builder2.write;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            strWrite = traceInputStream != null ? androidx.work.impl.WorkerWrapper.Builder.write(traceInputStream) : null;
                        } catch (IOException e3) {
                            SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e3, null);
                        }
                        getMeasuredByPlacedParent getmeasuredbyplacedparent = new getMeasuredByPlacedParent();
                        getmeasuredbyplacedparent.read(next.getImportance());
                        getmeasuredbyplacedparent.write(next.getProcessName());
                        getmeasuredbyplacedparent.RemoteActionCompatParcelizer(next.getReason());
                        ArrayList arrayList3 = arrayList2;
                        getmeasuredbyplacedparent.write(next.getTimestamp());
                        getmeasuredbyplacedparent.write(next.getPid());
                        getmeasuredbyplacedparent.RemoteActionCompatParcelizer(next.getPss());
                        getmeasuredbyplacedparent.IconCompatParcelizer(next.getRss());
                        getmeasuredbyplacedparent.RemoteActionCompatParcelizer(strWrite);
                        getLookaheadRemeasureCanAffectParentSize getlookaheadremeasurecanaffectparentsize = getmeasuredbyplacedparent.read();
                        int i2 = getlayoutpendingforalignment.serializer.getResources().getConfiguration().orientation;
                        remeasureOnly remeasureonly = new remeasureOnly();
                        remeasureonly.MediaSessionCompatQueueItem = "anr";
                        long j = getlookaheadremeasurecanaffectparentsize.MediaMetadataCompat;
                        remeasureonly.RatingCompat = j;
                        remeasureonly.write = (byte) (remeasureonly.write | 1);
                        CallOptions$Builder callOptions$Builder = getlayoutpendingforalignment.IconCompatParcelizer;
                        builder = builder2;
                        if (!getlayoutpendingforalignment.MediaSessionCompatQueueItem.write().read.write || ((ArrayList) callOptions$Builder.read).size() <= 0) {
                            arrayList = arrayList3;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = ((ArrayList) callOptions$Builder.read).iterator();
                            while (it2.hasNext()) {
                                accessgetLastPositionp accessgetlastpositionp = (accessgetLastPositionp) it2.next();
                                Iterator it3 = it2;
                                getRemeasureCanAffectParentSize getremeasurecanaffectparentsize = new getRemeasureCanAffectParentSize();
                                getremeasurecanaffectparentsize.RemoteActionCompatParcelizer(accessgetlastpositionp.read());
                                getremeasurecanaffectparentsize.serializer(accessgetlastpositionp.IconCompatParcelizer());
                                getremeasurecanaffectparentsize.read(accessgetlastpositionp.RemoteActionCompatParcelizer());
                                arrayList4.add(getremeasurecanaffectparentsize.write());
                                it2 = it3;
                                arrayList3 = arrayList3;
                            }
                            arrayList = arrayList3;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList4);
                        }
                        getMeasuredByPlacedParent getmeasuredbyplacedparent2 = new getMeasuredByPlacedParent();
                        getmeasuredbyplacedparent2.read(getlookaheadremeasurecanaffectparentsize.serializer);
                        getmeasuredbyplacedparent2.write(getlookaheadremeasurecanaffectparentsize.IconCompatParcelizer);
                        getmeasuredbyplacedparent2.RemoteActionCompatParcelizer(getlookaheadremeasurecanaffectparentsize.MediaSessionCompatQueueItem);
                        getmeasuredbyplacedparent2.write(j);
                        getmeasuredbyplacedparent2.write(getlookaheadremeasurecanaffectparentsize.write);
                        getmeasuredbyplacedparent2.RemoteActionCompatParcelizer(getlookaheadremeasurecanaffectparentsize.RemoteActionCompatParcelizer);
                        getmeasuredbyplacedparent2.IconCompatParcelizer(getlookaheadremeasurecanaffectparentsize.RatingCompat);
                        getmeasuredbyplacedparent2.RemoteActionCompatParcelizer(getlookaheadremeasurecanaffectparentsize.MediaDescriptionCompat);
                        getmeasuredbyplacedparent2.RemoteActionCompatParcelizer(listUnmodifiableList);
                        getLookaheadRemeasureCanAffectParentSize getlookaheadremeasurecanaffectparentsize2 = getmeasuredbyplacedparent2.read();
                        int i3 = getlookaheadremeasurecanaffectparentsize2.serializer;
                        boolean z5 = i3 != 100;
                        String str5 = getlookaheadremeasurecanaffectparentsize2.IconCompatParcelizer;
                        int i4 = getlookaheadremeasurecanaffectparentsize2.write;
                        str5.getClass();
                        measureAndLayout measureandlayout = new measureAndLayout();
                        measureandlayout.IconCompatParcelizer = str5;
                        measureandlayout.write = i4;
                        byte b = (byte) (measureandlayout.read | 1);
                        measureandlayout.serializer = i3;
                        measureandlayout.RemoteActionCompatParcelizer = false;
                        measureandlayout.read = (byte) (((byte) (b | 2)) | 4);
                        getUncaughtExceptionHandlerui getuncaughtexceptionhandlerui = measureandlayout.read();
                        getDuringMeasureLayoutui getduringmeasurelayoutui = getLayoutPendingForAlignment.read();
                        List listSerializer = getlayoutpendingforalignment.serializer();
                        if (listSerializer != null) {
                            remeasureonly.IconCompatParcelizer = new dispatchOnPositionedCallbacks(new requestRemeasuredefault(null, null, getlookaheadremeasurecanaffectparentsize2, getduringmeasurelayoutui, listSerializer), null, null, Boolean.valueOf(z5), getuncaughtexceptionhandlerui, null, i2);
                            remeasureonly.serializer = getlayoutpendingforalignment.read(i2);
                            remeasureIfNeededdefault remeasureifneededdefault = remeasureonly.read();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            modifierNodeElement.serializer((getLastPositionnOccacui) androidx.work.impl.WorkerWrapper.Builder.read(403482092, new Object[]{androidx.work.impl.WorkerWrapper.Builder.read(remeasureifneededdefault, getplacedonceui, builder4, Collections.EMPTY_MAP), builder4}, getCurrentAnimation.IconCompatParcelizer(), getCurrentAnimation.IconCompatParcelizer(), -403482092, getCurrentAnimation.IconCompatParcelizer(), getCurrentAnimation.IconCompatParcelizer()), str4, true);
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null binaries");
                            return;
                        }
                    }
                    i = 2;
                } else {
                    builder = builder2;
                    arrayList = arrayList2;
                    i = 2;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } else {
                builder = builder2;
                arrayList = arrayList2;
                i = 2;
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
        } else {
            builder = builder2;
            arrayList = arrayList2;
            i = 2;
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        if (z2 && getcachedalignmentlinesmap.IconCompatParcelizer()) {
            Log.isLoggable("FirebaseCrashlytics", i);
            getcachedalignmentlinesmap.read().getClass();
            str = null;
            SentryLogcatAdapter.write("FirebaseCrashlytics", "No minidump data found for session " + str4, null);
            SentryLogcatAdapter.write("FirebaseCrashlytics", "No native core present", null);
        } else {
            str = null;
        }
        if (z != 0) {
            z3 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer(str);
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ModifierNodeElement modifierNodeElement2 = (ModifierNodeElement) builder.MediaSessionCompatQueueItem;
        androidx.work.impl.WorkerWrapper.Builder builder5 = modifierNodeElement2.MediaBrowserCompatMediaItem;
        builder5.write(".com.google.firebase.crashlytics");
        builder5.write(".com.google.firebase.crashlytics-ndk");
        if (!((String) builder5.write).isEmpty()) {
            builder5.write(".com.google.firebase.crashlytics.files.v1");
            String str6 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = (File) builder5.MediaSessionCompatQueueItem;
            if (file2.exists()) {
                String[] list = file2.list(new r8lambda1rg5nswZ2w8tK6UoajTAHGu7Dc(1, str6));
                if (list != null) {
                    int length = list.length;
                    for (?? r13 = z3; r13 < length; r13++) {
                        builder5.write(list[r13]);
                    }
                }
            }
        }
        NavigableSet<String> navigableSetSerializer = modifierNodeElement2.serializer();
        if (str2 != null) {
            navigableSetSerializer.remove(str2);
        }
        if (navigableSetSerializer.size() > 8) {
            while (navigableSetSerializer.size() > 8) {
                String str7 = (String) navigableSetSerializer.last();
                Log.isLoggable("FirebaseCrashlytics", 3);
                androidx.work.impl.WorkerWrapper.Builder.write(new File((File) builder5.MediaBrowserCompatMediaItem, str7));
                navigableSetSerializer.remove(str7);
            }
        }
        for (String str8 : navigableSetSerializer) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            didInsert didinsert = ModifierNodeElement.read;
            io.sentry.cache.read readVar = ModifierNodeElement.serializer;
            File file3 = new File((File) builder5.MediaBrowserCompatMediaItem, str8);
            file3.mkdirs();
            List<File> listSerializer2 = androidx.work.impl.WorkerWrapper.Builder.serializer(file3.listFiles(readVar));
            if (listSerializer2.isEmpty()) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else {
                Collections.sort(listSerializer2);
                ArrayList arrayList5 = new ArrayList();
                boolean z6 = z3;
                for (File file4 : listSerializer2) {
                    try {
                        String strSerializer = ModifierNodeElement.serializer(file4);
                        didinsert.getClass();
                        try {
                            android.util.JsonReader jsonReader = new android.util.JsonReader(new StringReader(strSerializer));
                            try {
                                remeasureIfNeededdefault remeasureifneededdefaultWrite = didInsert.write(jsonReader);
                                jsonReader.close();
                                arrayList5.add(remeasureifneededdefaultWrite);
                                if (z6) {
                                    z4 = true;
                                } else {
                                    String name = file4.getName();
                                    if (name.startsWith("event") && name.endsWith(BundleUtil.UNDERLINE_TAG)) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                z6 = z4;
                            } catch (Throwable th3) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not add event to report for " + file4, e5);
                    }
                }
                if (arrayList5.isEmpty()) {
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not parse event files for session " + str8, null);
                } else {
                    String strIconCompatParcelizer = new isPlacedui(builder5).IconCompatParcelizer(str8);
                    accessgetPerformMeasureConstraintsp accessgetperformmeasureconstraintsp = modifierNodeElement2.MediaDescriptionCompat.RemoteActionCompatParcelizer;
                    synchronized (accessgetperformmeasureconstraintsp) {
                        if (Objects.equals(accessgetperformmeasureconstraintsp.RemoteActionCompatParcelizer, str8)) {
                            str3 = accessgetperformmeasureconstraintsp.serializer;
                        } else {
                            androidx.work.impl.WorkerWrapper.Builder builder6 = accessgetperformmeasureconstraintsp.IconCompatParcelizer;
                            io.sentry.cache.read readVar2 = accessgetPerformMeasureConstraintsp.read;
                            File file5 = new File((File) builder6.MediaBrowserCompatMediaItem, str8);
                            file5.mkdirs();
                            List listSerializer3 = androidx.work.impl.WorkerWrapper.Builder.serializer(file5.listFiles(readVar2));
                            if (listSerializer3.isEmpty()) {
                                SentryLogcatAdapter.write("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listSerializer3, accessgetPerformMeasureConstraintsp.write)).getName().substring(4);
                            }
                            str3 = strSubstring;
                        }
                    }
                    File fileRemoteActionCompatParcelizer2 = builder5.RemoteActionCompatParcelizer(str8, "report");
                    try {
                        String strSerializer2 = ModifierNodeElement.serializer(fileRemoteActionCompatParcelizer2);
                        didinsert.getClass();
                        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplacedIconCompatParcelizer = didInsert.serializer(strSerializer2).IconCompatParcelizer(strIconCompatParcelizer, jCurrentTimeMillis, z6);
                        getCanAffectPlacedParent getcanaffectplacedparentIconCompatParcelizer = ensuresubtreelookaheadreplacedIconCompatParcelizer.IconCompatParcelizer();
                        getcanaffectplacedparentIconCompatParcelizer.RemoteActionCompatParcelizer = str3;
                        trackMeasurementByParent trackmeasurementbyparent = ensuresubtreelookaheadreplacedIconCompatParcelizer.ParcelableVolumeInfo;
                        if (trackmeasurementbyparent != null) {
                            remeasureAndRelayoutIfNeeded remeasureandrelayoutifneeded = trackmeasurementbyparent.read();
                            remeasureandrelayoutifneeded.read = str3;
                            getcanaffectplacedparentIconCompatParcelizer.ParcelableVolumeInfo = remeasureandrelayoutifneeded.serializer();
                        }
                        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced = getcanaffectplacedparentIconCompatParcelizer.read();
                        trackMeasurementByParent trackmeasurementbyparent2 = ensuresubtreelookaheadreplaced.ParcelableVolumeInfo;
                        if (trackmeasurementbyparent2 != null) {
                            getCanAffectPlacedParent getcanaffectplacedparentIconCompatParcelizer2 = ensuresubtreelookaheadreplaced.IconCompatParcelizer();
                            remeasureAndRelayoutIfNeeded remeasureandrelayoutifneeded2 = trackmeasurementbyparent2.read();
                            remeasureandrelayoutifneeded2.MediaMetadataCompat = arrayList5;
                            getcanaffectplacedparentIconCompatParcelizer2.ParcelableVolumeInfo = remeasureandrelayoutifneeded2.serializer();
                            ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced2 = getcanaffectplacedparentIconCompatParcelizer2.read();
                            trackMeasurementByParent trackmeasurementbyparent3 = ensuresubtreelookaheadreplaced2.ParcelableVolumeInfo;
                            if (trackmeasurementbyparent3 != null) {
                                try {
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    if (z6) {
                                        file = new File((File) builder5.IconCompatParcelizer, ((performMeasureAndLayout) trackmeasurementbyparent3).MediaSessionCompatQueueItem);
                                    } else {
                                        file = new File((File) builder5.MediaMetadataCompat, ((performMeasureAndLayout) trackmeasurementbyparent3).MediaSessionCompatQueueItem);
                                    }
                                    ModifierNodeElement.read(file, didInsert.IconCompatParcelizer.IconCompatParcelizer(ensuresubtreelookaheadreplaced2));
                                } catch (IOException e6) {
                                    e = e6;
                                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not synthesize final report file for " + fileRemoteActionCompatParcelizer2, e);
                                }
                            }
                        } else {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        e = e6;
                    } catch (IOException e7) {
                        e = e7;
                    }
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not synthesize final report file for " + fileRemoteActionCompatParcelizer2, e);
                }
            }
            androidx.work.impl.WorkerWrapper.Builder.write(new File((File) builder5.MediaBrowserCompatMediaItem, str8));
            z3 = false;
        }
        r8lambdaWhXkHoUVHBvdcJBbOnYn9EgKi6M r8lambdawhxkhouvhbvdcjbbonyn9egki6m = modifierNodeElement2.MediaMetadataCompat.write().MediaMetadataCompat;
        ArrayList arrayList6 = modifierNodeElement2.read();
        int size = arrayList6.size();
        if (size <= 4) {
            return;
        }
        Iterator it4 = arrayList6.subList(4, size).iterator();
        while (it4.hasNext()) {
            ((File) it4.next()).delete();
        }
    }

    public final void serializer(zzw zzwVar) {
        zzw zzwVar2;
        zzw zzwVarRemoteActionCompatParcelizer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.ResultReceiver;
        androidx.work.impl.WorkerWrapper.Builder builder = ((ModifierNodeElement) this.ParcelableVolumeInfo.MediaSessionCompatQueueItem).MediaBrowserCompatMediaItem;
        if (androidx.work.impl.WorkerWrapper.Builder.serializer(((File) builder.MediaMetadataCompat).listFiles()).isEmpty() && androidx.work.impl.WorkerWrapper.Builder.serializer(((File) builder.IconCompatParcelizer).listFiles()).isEmpty() && androidx.work.impl.WorkerWrapper.Builder.serializer(((File) builder.RemoteActionCompatParcelizer).listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            parentDataModifierDefaultImpls.write(Boolean.FALSE);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        ComponentRegistry$Builder componentRegistry$Builder = this.MediaMetadataCompat;
        if (componentRegistry$Builder.read()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            parentDataModifierDefaultImpls.write(Boolean.FALSE);
            zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            parentDataModifierDefaultImpls.write(Boolean.TRUE);
            synchronized (componentRegistry$Builder.read) {
                zzwVar2 = ((ParentDataModifierDefaultImpls) componentRegistry$Builder.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
            }
            Task taskOnSuccessTask = zzwVar2.onSuccessTask(new Transition$1(24));
            Log.isLoggable("FirebaseCrashlytics", 3);
            zzwVarRemoteActionCompatParcelizer = setLayoutPendingForAlignment.RemoteActionCompatParcelizer(taskOnSuccessTask, this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer);
        }
        zzwVarRemoteActionCompatParcelizer.onSuccessTask(this.MediaDescriptionCompat.read, new zzbv(this, zzwVar, false, 18));
    }

    public checkChildrenPlaceOrderForUpdates(Context context, IdManager idManager, ComponentRegistry$Builder componentRegistry$Builder, androidx.work.impl.WorkerWrapper.Builder builder, zzbv zzbvVar, CallOptions$Builder callOptions$Builder, androidx.work.impl.WorkerWrapper.Builder builder2, getPlacedOnceui getplacedonceui, androidx.work.impl.WorkerWrapper.Builder builder3, getCachedAlignmentLinesMap getcachedalignmentlinesmap, positionIniSbpLlYui positioninisbpllyui, getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement, CrashlyticsWorkers crashlyticsWorkers) {
        new AtomicBoolean(false);
        this.serializer = context;
        this.PlaybackStateCompat = idManager;
        this.MediaMetadataCompat = componentRegistry$Builder;
        this.MediaSessionCompatQueueItem = builder;
        this.RatingCompat = zzbvVar;
        this.RemoteActionCompatParcelizer = callOptions$Builder;
        this.ComponentActivity = builder2;
        this.MediaSessionCompatToken = getplacedonceui;
        this.PlaybackStateCompatCustomAction = getcachedalignmentlinesmap;
        this.write = positioninisbpllyui;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getdetachedfromparentlookaheadplacement;
        this.ParcelableVolumeInfo = builder3;
        this.MediaDescriptionCompat = crashlyticsWorkers;
    }

    public static zzw write(checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates) {
        zzw zzwVarWrite;
        checkchildrenplaceorderforupdates.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : androidx.work.impl.WorkerWrapper.Builder.serializer(((File) checkchildrenplaceorderforupdates.MediaSessionCompatQueueItem.read).listFiles(IconCompatParcelizer))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    zzwVarWrite = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    zzwVarWrite = LazyKt__LazyJVMKt.write(new ScheduledThreadPoolExecutor(1), new forEachChildDelegate(checkchildrenplaceorderforupdates, j));
                }
                arrayList.add(zzwVarWrite);
            } catch (NumberFormatException unused2) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return LazyKt__LazyJVMKt.write(arrayList);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b A[PHI: r1 r2
  0x002b: PHI (r1v14 android.content.Context) = (r1v4 android.content.Context), (r1v21 android.content.Context) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r2v9 int) = (r2v2 int), (r2v14 int) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final String IconCompatParcelizer() throws IOException {
        Context context;
        int iWrite;
        String string;
        InputStream resourceAsStream;
        int i = 2 % 2;
        int i2 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 81;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            context = this.serializer;
            iWrite = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.version_control_info", "string");
            int i3 = 63 / 0;
            if (iWrite == 0) {
                string = null;
            } else {
                string = context.getResources().getString(iWrite);
                if (string.startsWith("%('")) {
                    Object[] objArr = new Object[1];
                    a(string.substring(3), objArr);
                    string = ((String) objArr[0]).intern();
                }
            }
        } else {
            context = this.serializer;
            iWrite = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.version_control_info", "string");
            if (iWrite == 0) {
                string = null;
            } else {
                string = context.getResources().getString(iWrite);
                if (string.startsWith("%('")) {
                    Object[] objArr2 = new Object[1];
                    a(string.substring(3), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
            }
        }
        if (string != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return Base64.encodeToString(string.getBytes(read), 0);
        }
        ClassLoader classLoader = checkChildrenPlaceOrderForUpdates.class.getClassLoader();
        if (classLoader == null) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                int i4 = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + 63;
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                resourceAsStream.close();
            }
            return null;
        }
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                while (true) {
                    int i6 = resourceAsStream.read(bArr);
                    if (i6 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    int i7 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 31;
                    r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    byteArrayOutputStream.write(bArr, 0, i6);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    static void RemoteActionCompatParcelizer() {
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (byte) -112;
    }
}
