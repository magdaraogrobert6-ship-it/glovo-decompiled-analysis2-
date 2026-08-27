package androidx.work.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import androidx.core.app.FrameMetricsAggregator;
import androidx.emoji2.text.EmojiProcessor;
import androidx.sqlite.SQLite;
import androidx.work.WorkerParameters;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d0$$ExternalSyntheticLambda4;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import coil3.compose.AsyncImagePainter$launchJob$1;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.zzw;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.mapbox.bindgen.Value;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.roadrunner.appperformance.tracker.AppStartToInteractiveTraceStopper;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import io.grpc.CallOptions$Builder;
import io.grpc.SynchronizationContext$1;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import io.sentry.android.core.write;
import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.MediaMetadataCompat;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import o.ImageBitmapx__hDUdefault;
import o.InterpolatableCompanion;
import o.Interval;
import o.IntervalTreeiterator1;
import o.LayoutCompat;
import o.LocaleListHelperMethods;
import o.LookaheadDelegateKt;
import o.ModifierNodeElement;
import o.PagereLwUrMk;
import o.ParentDataModifierDefaultImpls;
import o.SemanticsOwner;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.TouchBoundsExpansionKt;
import o.UriActionExternalSyntheticLambda4;
import o.acceptHits;
import o.access500;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessgetButton10cp;
import o.accessgetButton11cp;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetF2cp;
import o.accessgetGocp;
import o.accessgetInstancedelegatecp;
import o.accessgetOuterCoordinator;
import o.accessgetParentLayoutDirection;
import o.accessgetStrokecp;
import o.accessisMainThread;
import o.accessisRenderNodeCompatiblecp;
import o.accessremoveNodesInRange;
import o.accesssetCompositingStrategyaDBOjCEjd;
import o.accesssetRenderEffectjd;
import o.accesssetSpotShadowColor8_81llAjd;
import o.area;
import o.backgroundTimerFiredI;
import o.clamp;
import o.createFromParcel;
import o.createQuery;
import o.didInsert;
import o.didUpdate;
import o.dispatchOnPositionedCallbacks;
import o.disposeComposition;
import o.drawShadowerFMhIw;
import o.ensureSubtreeLookaheadReplaced;
import o.f8;
import o.forceMeasureTheSubtree;
import o.getAlignmentLinesMap;
import o.getAllSemanticsNodesToMap;
import o.getCanAffectPlacedParent;
import o.getCapKaPHkGw;
import o.getChildDelegatesui;
import o.getClipannotations;
import o.getColorsui_graphics;
import o.getContentViewGroupParentLayout;
import o.getCurrentAnimation;
import o.getDefaultShadowColor;
import o.getDetachedFromParentLookaheadPlacement;
import o.getDoubleOrNull;
import o.getDuringMeasureLayoutui;
import o.getHasComposition;
import o.getHasPendingMeasureOrLayout;
import o.getInspectorValues;
import o.getLastPositionnOccacui;
import o.getLayoutPendingForAlignment;
import o.getNotPlacedPlaceOrderuiannotations;
import o.getOuterCoordinatorui;
import o.getPerformMeasureBlockui;
import o.getPlacedOnceui;
import o.getQueryParameterslambda2;
import o.getSemanticsConfiguration;
import o.getShowLayoutBoundsannotations;
import o.getStrictnessusljTpc;
import o.getUncaughtExceptionHandlerui;
import o.getUnspecifiedrAG3T2kannotations;
import o.getWordBreakjp8hJ3c;
import o.graphicsLayerpANQ8Wgdefault;
import o.h9;
import o.hasFontAttributes;
import o.hasSameCornerRadius;
import o.igExternalSyntheticLambda2;
import o.invalidateIntrinsicsParent;
import o.isOpenInternalroom_runtime;
import o.isPlacedui;
import o.isSemanticsInvalidatedui;
import o.lambdaverifyPlayStorePurchase45;
import o.lookaheadReplaceui;
import o.markLayoutPending;
import o.maxLookaheadIntrinsicHeight;
import o.maxLookaheadIntrinsicWidth;
import o.measureAndLayoutdefault;
import o.minLookaheadIntrinsicHeight;
import o.notifySemanticsChangeui;
import o.o7ExternalSyntheticLambda3;
import o.onAnimationEndlambda0;
import o.onAnimationEndlambda1;
import o.onBackPressed;
import o.onCapabilitiesChanged;
import o.onContentCardDismissed;
import o.onNodePlacedui;
import o.placeSelfApparentToRealOffsetgyyYBsui;
import o.placeSelfMLgxB_4;
import o.publishErrorlambda1;
import o.q0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.remeasureIfNeededdefault;
import o.remeasureOnly;
import o.removeNodesInRange;
import o.requestBannersRefreshlambda1;
import o.requestLocationInitialization;
import o.requestLookaheadRelayout;
import o.requestOnPositionedCallback;
import o.requestRemeasuredefault;
import o.requestSingleLocationUpdatelambda1;
import o.requirePrecondition;
import o.retryInAppMessageandroid_sdk_base_release;
import o.scaleimpl;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCameraDistance;
import o.setFontAttributes;
import o.setFrom58bKbWc;
import o.setLayoutState;
import o.setOnAttachui;
import o.setPaddingBottom;
import o.setPresentationView;
import o.setRotationX;
import o.setScaleX;
import o.setTranslationX;
import o.setUseTempTrackingTableroom_runtime;
import o.setVerticalBias;
import o.setupDirectionalNavigationlambda2;
import o.sort;
import o.sourceInformationContextOfdefault;
import o.times7Ah8Wj8;
import o.transactionWithResultsuspendImpl;
import o.transferSessionPackageI;
import o.translateimpldefault;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerWrapper {
    public final getDefaultShadowColor IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public final WorkDatabase MediaDescriptionCompat;
    public final scaleimpl MediaMetadataCompat;
    public final setFrom58bKbWc MediaSessionCompatQueueItem;
    public final String MediaSessionCompatToken;
    public final onAnimationEndlambda0 PlaybackStateCompat;
    public final accessgetStrokecp PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final IntervalTreeiterator1 RemoteActionCompatParcelizer;
    public final Context read;
    public final getClipannotations serializer;
    public final graphicsLayerpANQ8Wgdefault write;

    public final class Builder {
        private static int MediaDescriptionCompat = 0;
        private static int RatingCompat = 1;
        public Object IconCompatParcelizer;
        public Object MediaBrowserCompatMediaItem;
        public Object MediaMetadataCompat;
        public Object MediaSessionCompatQueueItem;
        public Object RemoteActionCompatParcelizer;
        public Object read;
        public final /* synthetic */ int serializer;
        public Object write;

        public Builder(Context context) {
            String string;
            String strReplaceAll;
            this.serializer = 1;
            String str = ((getUncaughtExceptionHandlerui) placeSelfApparentToRealOffsetgyyYBsui.IconCompatParcelizer.write(context)).RemoteActionCompatParcelizer;
            this.write = str;
            File filesDir = context.getFilesDir();
            this.MediaSessionCompatQueueItem = filesDir;
            if (str.isEmpty()) {
                int i = 2 % 2;
                string = ".com.google.firebase.crashlytics.files.v1";
            } else {
                StringBuilder sb = new StringBuilder(".crashlytics.v3");
                sb.append(File.separator);
                if (str.length() > 40) {
                    int i2 = MediaDescriptionCompat + 117;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        strReplaceAll = accessgetOuterCoordinator.RemoteActionCompatParcelizer(str);
                        int i3 = 12 / 0;
                    } else {
                        strReplaceAll = accessgetOuterCoordinator.RemoteActionCompatParcelizer(str);
                    }
                } else {
                    strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", BundleUtil.UNDERLINE_TAG);
                    int i4 = 2 % 2;
                }
                sb.append(strReplaceAll);
                string = sb.toString();
                int i5 = MediaDescriptionCompat + 63;
                RatingCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            }
            File file = new File(filesDir, string);
            int iIconCompatParcelizer = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getCurrentAnimation.IconCompatParcelizer();
            read(-1281303028, new Object[]{file}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer, 1281303029, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer2);
            this.read = file;
            File file2 = new File(file, "open-sessions");
            int iIconCompatParcelizer3 = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer4 = getCurrentAnimation.IconCompatParcelizer();
            read(-1281303028, new Object[]{file2}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer3, 1281303029, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer4);
            this.MediaBrowserCompatMediaItem = file2;
            File file3 = new File(file, "reports");
            int iIconCompatParcelizer5 = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer6 = getCurrentAnimation.IconCompatParcelizer();
            read(-1281303028, new Object[]{file3}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer5, 1281303029, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer6);
            this.MediaMetadataCompat = file3;
            File file4 = new File(file, "priority-reports");
            int iIconCompatParcelizer7 = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer8 = getCurrentAnimation.IconCompatParcelizer();
            read(-1281303028, new Object[]{file4}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer7, 1281303029, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer8);
            this.IconCompatParcelizer = file4;
            File file5 = new File(file, "native-reports");
            int iIconCompatParcelizer9 = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer10 = getCurrentAnimation.IconCompatParcelizer();
            read(-1281303028, new Object[]{file5}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer9, 1281303029, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer10);
            this.RemoteActionCompatParcelizer = file5;
            int i7 = RatingCompat + 99;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i3;
            int i9 = ~(i7 | i8);
            int i10 = ~i;
            int i11 = i9 | (~(i10 | i3));
            int i12 = i8 | i4;
            int i13 = ~(i12 | i);
            int i14 = (~(i3 | i7)) | (~(i8 | i10)) | (~i12);
            int i15 = i4 + i + i6 + (1650861130 * i5) + ((-924421097) * i2);
            int i16 = i15 * i15;
            int i17 = (i4 * (-405912681)) + 1474035712 + ((-405912681) * i) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i6) + (986710016 * i5) + ((-948436992) * i2) + ((-1864630272) * i16);
            int i18 = ((i4 * (-959335331)) - 587927435) + (i * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i6 * (-959334869)) + (i5 * 22983790) + (i2 * 637852125) + (i16 * (-1124859904));
            return i17 + ((i18 * i18) * (-1807482880)) != 1 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
        }

        public maxLookaheadIntrinsicWidth write() {
            maxLookaheadIntrinsicWidth maxlookaheadintrinsicwidth;
            synchronized (this) {
                if (((String) this.write) == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (maxLookaheadIntrinsicWidth.serializer) {
                    Context context = (Context) this.RemoteActionCompatParcelizer;
                    String str = (String) this.write;
                    String str2 = (String) this.MediaSessionCompatQueueItem;
                    byte[] bArrWrite = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrWrite = TuplesKt.write(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(ff$$ExternalSyntheticOutline0.m("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("keysetName cannot be null");
                    }
                    String str3 = (String) this.read;
                    if (bArrWrite == null) {
                        if (str3 != null) {
                            this.MediaBrowserCompatMediaItem = MediaSessionCompatQueueItem();
                        }
                        this.IconCompatParcelizer = serializer();
                    } else if (str3 != null) {
                        this.IconCompatParcelizer = serializer(bArrWrite);
                    } else {
                        this.IconCompatParcelizer = new removeNodesInRange(3, (lookaheadReplaceui) ((Keyset) accessremoveNodesInRange.read(new removeNodesInRange(1, new ByteArrayInputStream(bArrWrite))).serializer).ComponentActivity());
                    }
                    maxlookaheadintrinsicwidth = new maxLookaheadIntrinsicWidth(this);
                }
            }
            return maxlookaheadintrinsicwidth;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            File file = (File) objArr[0];
            synchronized (Builder.class) {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return null;
                    }
                    file.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    file.delete();
                }
                if (!file.mkdirs()) {
                    SentryLogcatAdapter.read("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
                return null;
            }
        }

        public static remeasureIfNeededdefault read(remeasureIfNeededdefault remeasureifneededdefault, getPlacedOnceui getplacedonceui, Builder builder, Map map) {
            Map mapUnmodifiableMap;
            Map mapUnmodifiableMap2;
            Map mapUnmodifiableMap3;
            remeasureOnly remeasureonlyRemoteActionCompatParcelizer = remeasureifneededdefault.RemoteActionCompatParcelizer();
            String strRemoteActionCompatParcelizer = ((getPerformMeasureBlockui) getplacedonceui.read).RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer != null) {
                remeasureonlyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = new requestLookaheadRelayout(strRemoteActionCompatParcelizer);
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
            boolean zIsEmpty = map.isEmpty();
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) builder.MediaBrowserCompatMediaItem;
            if (zIsEmpty) {
                invalidateIntrinsicsParent invalidateintrinsicsparent = (invalidateIntrinsicsParent) ((AtomicMarkableReference) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write).getReference();
                synchronized (invalidateintrinsicsparent) {
                    mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(invalidateintrinsicsparent.IconCompatParcelizer));
                }
            } else {
                invalidateIntrinsicsParent invalidateintrinsicsparent2 = (invalidateIntrinsicsParent) ((AtomicMarkableReference) r8lambdalmkbrrgswwtv97obrsj7trj7ai.write).getReference();
                synchronized (invalidateintrinsicsparent2) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(invalidateintrinsicsparent2.IconCompatParcelizer));
                }
                HashMap map2 = new HashMap(mapUnmodifiableMap);
                int i = 0;
                for (Map.Entry entry : map.entrySet()) {
                    String strIconCompatParcelizer = invalidateIntrinsicsParent.IconCompatParcelizer(Fields.RotationZ, (String) entry.getKey());
                    if (map2.size() < 64 || map2.containsKey(strIconCompatParcelizer)) {
                        map2.put(strIconCompatParcelizer, invalidateIntrinsicsParent.IconCompatParcelizer(Fields.RotationZ, (String) entry.getValue()));
                    } else {
                        i++;
                    }
                }
                if (i > 0) {
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
                }
                mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
            }
            List listSerializer = serializer(mapUnmodifiableMap2);
            invalidateIntrinsicsParent invalidateintrinsicsparent3 = (invalidateIntrinsicsParent) ((AtomicMarkableReference) ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) builder.MediaMetadataCompat).write).getReference();
            synchronized (invalidateintrinsicsparent3) {
                mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(invalidateintrinsicsparent3.IconCompatParcelizer));
            }
            List listSerializer2 = serializer(mapUnmodifiableMap3);
            if (!listSerializer.isEmpty() || !listSerializer2.isEmpty()) {
                dispatchOnPositionedCallbacks dispatchonpositionedcallbacks = (dispatchOnPositionedCallbacks) remeasureifneededdefault.read;
                remeasureonlyRemoteActionCompatParcelizer.IconCompatParcelizer = new dispatchOnPositionedCallbacks(dispatchonpositionedcallbacks.read, listSerializer, listSerializer2, dispatchonpositionedcallbacks.write, dispatchonpositionedcallbacks.RemoteActionCompatParcelizer, dispatchonpositionedcallbacks.IconCompatParcelizer, dispatchonpositionedcallbacks.MediaBrowserCompatMediaItem);
            }
            return remeasureonlyRemoteActionCompatParcelizer.read();
        }

        public removeNodesInRange serializer() throws GeneralSecurityException, IOException {
            if (((acceptHits) this.MediaMetadataCompat) == null) {
                getAlignmentLinesMap.write("cannot read or generate keyset");
                return null;
            }
            removeNodesInRange removenodesinrange = new removeNodesInRange(3, Keyset.write());
            acceptHits accepthits = (acceptHits) this.MediaMetadataCompat;
            synchronized (removenodesinrange) {
                removenodesinrange.serializer(accepthits.read);
            }
            int iSerializer = sort.write((Keyset) removenodesinrange.read().serializer).write().serializer();
            synchronized (removenodesinrange) {
                for (int i = 0; i < ((Keyset) ((lookaheadReplaceui) removenodesinrange.serializer).read).IconCompatParcelizer(); i++) {
                    Keyset.Key keyIconCompatParcelizer = ((Keyset) ((lookaheadReplaceui) removenodesinrange.serializer).read).IconCompatParcelizer(i);
                    if (keyIconCompatParcelizer.serializer() == iSerializer) {
                        if (!keyIconCompatParcelizer.MediaDescriptionCompat().equals(isSemanticsInvalidatedui.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iSerializer);
                        }
                        lookaheadReplaceui lookaheadreplaceui = (lookaheadReplaceui) removenodesinrange.serializer;
                        lookaheadreplaceui.MediaMetadataCompat();
                        Keyset.RemoteActionCompatParcelizer((Keyset) lookaheadreplaceui.read, iSerializer);
                    }
                }
                throw new GeneralSecurityException("key not found: " + iSerializer);
            }
            Context context = (Context) this.RemoteActionCompatParcelizer;
            String str = (String) this.write;
            zzbv zzbvVar = new zzbv(context, str, (String) this.MediaSessionCompatQueueItem);
            if (((minLookaheadIntrinsicHeight) this.MediaBrowserCompatMediaItem) == null) {
                accessremoveNodesInRange.serializer(removenodesinrange.read(), zzbvVar);
                return removenodesinrange;
            }
            EmojiProcessor emojiProcessor = removenodesinrange.read();
            minLookaheadIntrinsicHeight minlookaheadintrinsicheight = (minLookaheadIntrinsicHeight) this.MediaBrowserCompatMediaItem;
            byte[] bArr = new byte[0];
            Keyset keyset = (Keyset) emojiProcessor.serializer;
            byte[] bArrIconCompatParcelizer = minlookaheadintrinsicheight.IconCompatParcelizer(keyset.ParcelableVolumeInfo(), bArr);
            try {
                if (!Keyset.read(minlookaheadintrinsicheight.serializer(bArrIconCompatParcelizer, bArr), getNotPlacedPlaceOrderuiannotations.read()).equals(keyset)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                getSemanticsConfiguration getsemanticsconfigurationRemoteActionCompatParcelizer = getOuterCoordinatorui.RemoteActionCompatParcelizer();
                getsemanticsconfigurationRemoteActionCompatParcelizer.read(setOnAttachui.RemoteActionCompatParcelizer(bArrIconCompatParcelizer, 0, bArrIconCompatParcelizer.length));
                getsemanticsconfigurationRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(sort.write(keyset));
                if (((SharedPreferences.Editor) zzbvVar.write).putString(str, TuplesKt.RemoteActionCompatParcelizer(((getOuterCoordinatorui) getsemanticsconfigurationRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()).ParcelableVolumeInfo())).commit()) {
                    return removenodesinrange;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Failed to write to SharedPreferences");
                return null;
            } catch (InvalidProtocolBufferException unused) {
                getAlignmentLinesMap.write("invalid keyset, corrupted key material");
                return null;
            }
        }

        public zzw serializer(String str, Executor executor) {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls;
            ArrayList<File> arrayList = ((ModifierNodeElement) this.MediaSessionCompatQueueItem).read();
            ArrayList<LookaheadDelegateKt> arrayList2 = new ArrayList();
            for (File file : arrayList) {
                try {
                    didInsert didinsert = ModifierNodeElement.read;
                    String strSerializer = ModifierNodeElement.serializer(file);
                    didinsert.getClass();
                    arrayList2.add(new LookaheadDelegateKt(didInsert.serializer(strSerializer), file.getName(), file));
                } catch (IOException e) {
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                    file.delete();
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (LookaheadDelegateKt lookaheadDelegateKt : arrayList2) {
                if (str == null || str.equals(lookaheadDelegateKt.RemoteActionCompatParcelizer)) {
                    getInspectorValues getinspectorvalues = (getInspectorValues) this.read;
                    if (lookaheadDelegateKt.write.MediaBrowserCompatMediaItem == null || lookaheadDelegateKt.write.read == null) {
                        placeSelfMLgxB_4 placeselfmlgxb_4FetchTrueFid = ((IdManager) this.IconCompatParcelizer).fetchTrueFid(true);
                        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced = lookaheadDelegateKt.write;
                        String str2 = placeselfmlgxb_4FetchTrueFid.read;
                        getCanAffectPlacedParent getcanaffectplacedparentIconCompatParcelizer = ensuresubtreelookaheadreplaced.IconCompatParcelizer();
                        getcanaffectplacedparentIconCompatParcelizer.RatingCompat = str2;
                        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced2 = getcanaffectplacedparentIconCompatParcelizer.read();
                        String str3 = placeselfmlgxb_4FetchTrueFid.IconCompatParcelizer;
                        getCanAffectPlacedParent getcanaffectplacedparentIconCompatParcelizer2 = ensuresubtreelookaheadreplaced2.IconCompatParcelizer();
                        getcanaffectplacedparentIconCompatParcelizer2.write = str3;
                        lookaheadDelegateKt = new LookaheadDelegateKt(getcanaffectplacedparentIconCompatParcelizer2.read(), lookaheadDelegateKt.RemoteActionCompatParcelizer, lookaheadDelegateKt.IconCompatParcelizer);
                    }
                    boolean z = str != null;
                    didUpdate didupdate = getinspectorvalues.write;
                    synchronized (didupdate.RemoteActionCompatParcelizer) {
                        parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
                        if (z) {
                            didupdate.IconCompatParcelizer.RemoteActionCompatParcelizer.getAndIncrement();
                            if (didupdate.RemoteActionCompatParcelizer.size() < didupdate.write) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                didupdate.RemoteActionCompatParcelizer.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                didupdate.MediaMetadataCompat.execute(new SynchronizationContext$1(15, didupdate, lookaheadDelegateKt, parentDataModifierDefaultImpls, false));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                parentDataModifierDefaultImpls.write(lookaheadDelegateKt);
                            } else {
                                didupdate.RemoteActionCompatParcelizer();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                didupdate.IconCompatParcelizer.serializer.getAndIncrement();
                                parentDataModifierDefaultImpls.write(lookaheadDelegateKt);
                            }
                        } else {
                            didupdate.serializer(lookaheadDelegateKt, parentDataModifierDefaultImpls);
                        }
                    }
                    arrayList3.add(parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.continueWith(executor, new Gson$$ExternalSyntheticBUOutline0(1, this)));
                }
            }
            return LazyKt__LazyJVMKt.write(arrayList3);
        }

        public static List serializer(Object[] objArr) {
            int i = 2 % 2;
            int i2 = RatingCompat + 25;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (objArr == null) {
                return Collections.EMPTY_LIST;
            }
            List listAsList = Arrays.asList(objArr);
            int i3 = MediaDescriptionCompat + 107;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return listAsList;
        }

        public static void IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 125;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT).set("com.mapbox.maps.experimental.opengl_persistent_buffer_mapping", Value.valueOf(false));
            int i4 = MediaDescriptionCompat + 37;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public File RemoteActionCompatParcelizer(String str, String str2) {
            int i = 2 % 2;
            File file = new File((File) this.MediaBrowserCompatMediaItem, str);
            file.mkdirs();
            File file2 = new File(file, str2);
            int i2 = MediaDescriptionCompat + 59;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 20 / 0;
            }
            return file2;
        }

        public static boolean write(File file) {
            int i = 2 % 2;
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                int i2 = MediaDescriptionCompat;
                int i3 = i2 + 27;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i2 + 93;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                for (File file2 : fileArrListFiles) {
                    write(file2);
                }
            }
            return file.delete();
        }

        public void write(String str) {
            int i = 2 % 2;
            File file = new File((File) this.MediaSessionCompatQueueItem, str);
            if (file.exists()) {
                int i2 = RatingCompat + 29;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 75 / 0;
                    if (!write(file)) {
                        return;
                    }
                } else if (!write(file)) {
                    return;
                }
                file.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
                int i4 = RatingCompat + 111;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        }

        public boolean read() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 23;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                ((Boolean) ((MediaMetadataCompat) this.RemoteActionCompatParcelizer).IconCompatParcelizer()).booleanValue();
                throw null;
            }
            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.MediaSessionCompatQueueItem;
            if (!((Boolean) ((MediaMetadataCompat) this.RemoteActionCompatParcelizer).IconCompatParcelizer()).booleanValue() || !sentryAndroidOptions.isEnableFramesTracking() || sentryAndroidOptions.isEnablePerformanceV2()) {
                return false;
            }
            int i3 = MediaDescriptionCompat + 45;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }

        public static ArrayList read(List list) {
            int i = 2 % 2;
            List<o7ExternalSyntheticLambda3> list2 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            int i2 = MediaDescriptionCompat + 91;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            for (o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 : list2) {
                arrayList.add(new f8(o7externalsyntheticlambda3.read, o7externalsyntheticlambda3.write));
            }
            int i4 = RatingCompat + 63;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return arrayList;
        }

        public void RemoteActionCompatParcelizer(Runnable runnable, String str) {
            int i = 2 % 2;
            int i2 = RatingCompat + 97;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            try {
                if (!(!io.sentry.android.core.internal.util.MediaMetadataCompat.read.IconCompatParcelizer())) {
                    runnable.run();
                    return;
                }
                ((Handler) ((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) this.MediaMetadataCompat).write).post(new j$$ExternalSyntheticLambda1(11, this, runnable, str));
            } catch (Throwable unused) {
                if (str != null) {
                    ((SentryAndroidOptions) this.MediaSessionCompatQueueItem).getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to execute ".concat(str), new Object[0]);
                    int i4 = MediaDescriptionCompat + 71;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
            }
        }

        public void read(Activity activity) {
            int i = 2 % 2;
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((RemoteActionCompatParcelizer) this.IconCompatParcelizer).serializer();
            try {
                if (!read()) {
                    int i2 = MediaDescriptionCompat + 45;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        uriActionExternalSyntheticLambda4Serializer.close();
                        return;
                    } else {
                        uriActionExternalSyntheticLambda4Serializer.close();
                        int i3 = 31 / 0;
                        return;
                    }
                }
                RemoteActionCompatParcelizer(new io.sentry.android.core.RemoteActionCompatParcelizer(this, activity, 0), "FrameMetricsAggregator.add");
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer != null) {
                    int i4 = MediaDescriptionCompat + 37;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        ((WeakHashMap) this.MediaBrowserCompatMediaItem).put(activity, writeVarRemoteActionCompatParcelizer);
                        int i5 = 85 / 0;
                    } else {
                        ((WeakHashMap) this.MediaBrowserCompatMediaItem).put(activity, writeVarRemoteActionCompatParcelizer);
                    }
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public minLookaheadIntrinsicHeight MediaSessionCompatQueueItem() throws KeyStoreException {
            int i = 2 % 2;
            maxLookaheadIntrinsicHeight maxlookaheadintrinsicheight = new maxLookaheadIntrinsicHeight();
            try {
                boolean z = maxLookaheadIntrinsicHeight.read((String) this.read);
                try {
                    return maxlookaheadintrinsicheight.IconCompatParcelizer((String) this.read);
                } catch (GeneralSecurityException | ProviderException e) {
                    if (!z) {
                        throw new KeyStoreException(ff$$ExternalSyntheticOutline0.m("the master key ", (String) this.read, " exists but is unusable"), e);
                    }
                    int i2 = MediaDescriptionCompat + 35;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    SentryLogcatAdapter.write("AndroidKeysetManager", "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                SentryLogcatAdapter.write("AndroidKeysetManager", "cannot use Android Keystore, it'll be disabled", e2);
                int i4 = RatingCompat + 93;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
        }

        public static String write(InputStream inputStream) throws IOException {
            int i = 2 % 2;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i2 = bufferedInputStream.read(bArr);
                        if (i2 == -1) {
                            String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            return string;
                        }
                        int i3 = MediaDescriptionCompat + 67;
                        RatingCompat = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            byteArrayOutputStream.write(bArr, 1, i2);
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                        int i4 = RatingCompat + 107;
                        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            int i = 0;
            remeasureIfNeededdefault remeasureifneededdefault = (remeasureIfNeededdefault) objArr[0];
            int i2 = 2 % 2;
            List list = ((setupDirectionalNavigationlambda2) ((Builder) objArr[1]).IconCompatParcelizer).read();
            ArrayList arrayList = new ArrayList();
            while (i < list.size()) {
                arrayList.add(((onNodePlacedui) list.get(i)).RemoteActionCompatParcelizer());
                i++;
                int i3 = MediaDescriptionCompat + 31;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            if (arrayList.isEmpty()) {
                int i5 = RatingCompat + 17;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return remeasureifneededdefault;
            }
            remeasureOnly remeasureonlyRemoteActionCompatParcelizer = remeasureifneededdefault.RemoteActionCompatParcelizer();
            requestOnPositionedCallback requestonpositionedcallback = new requestOnPositionedCallback();
            requestonpositionedcallback.serializer(arrayList);
            remeasureonlyRemoteActionCompatParcelizer.read = requestonpositionedcallback.RemoteActionCompatParcelizer();
            return remeasureonlyRemoteActionCompatParcelizer.read();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0062 A[LOOP:0: B:3:0x0017->B:16:0x0062, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:24:0x006b A[SYNTHETIC] */
        public static List serializer(Map map) {
            Map.Entry entry;
            String str;
            String str2;
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            arrayList.ensureCapacity(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                int i2 = MediaDescriptionCompat + 57;
                RatingCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    entry = (Map.Entry) it.next();
                    str = (String) entry.getKey();
                    int i3 = 25 / 0;
                    if (str == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null key");
                        return null;
                    }
                    str2 = (String) entry.getValue();
                    if (str2 != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null value");
                        int i4 = RatingCompat + 23;
                        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return null;
                    }
                    arrayList.add(new measureAndLayoutdefault(str, str2));
                } else {
                    entry = (Map.Entry) it.next();
                    str = (String) entry.getKey();
                    if (str == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null key");
                        return null;
                    }
                    str2 = (String) entry.getValue();
                    if (str2 != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null value");
                        int i6 = RatingCompat + 23;
                        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        return null;
                    }
                    arrayList.add(new measureAndLayoutdefault(str, str2));
                }
            }
            Collections.sort(arrayList, new LayoutNode$$ExternalSyntheticLambda1(5));
            return Collections.unmodifiableList(arrayList);
        }

        public static Builder write(Context context, IdManager idManager, Builder builder, CallOptions$Builder callOptions$Builder, getPlacedOnceui getplacedonceui, Builder builder2, zzbv zzbvVar, access500 access500Var, setLayoutState setlayoutstate, getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement, CrashlyticsWorkers crashlyticsWorkers) {
            int i = 2 % 2;
            getLayoutPendingForAlignment getlayoutpendingforalignment = new getLayoutPendingForAlignment(context, idManager, callOptions$Builder, zzbvVar, access500Var);
            ModifierNodeElement modifierNodeElement = new ModifierNodeElement(builder, access500Var, getdetachedfromparentlookaheadplacement);
            didInsert didinsert = getInspectorValues.RemoteActionCompatParcelizer;
            accessgetF2cp.RemoteActionCompatParcelizer(context);
            Builder builder3 = new Builder(getlayoutpendingforalignment, modifierNodeElement, new getInspectorValues(new didUpdate(accessgetF2cp.read().RemoteActionCompatParcelizer(new accessgetButton11cp(getInspectorValues.read, getInspectorValues.IconCompatParcelizer)).read("FIREBASE_CRASHLYTICS_REPORT", new accessgetButton10cp("json"), getInspectorValues.serializer), access500Var.write(), setlayoutstate)), getplacedonceui, builder2, idManager, crashlyticsWorkers, 4);
            int i2 = RatingCompat + 15;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return builder3;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0064 A[PHI: r5 r7
  0x0064: PHI (r5v3 int) = (r5v2 int), (r5v7 int) binds: [B:22:0x0062, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r7v2 int) = (r7v1 int), (r7v5 int) binds: [B:22:0x0062, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x006f A[PHI: r5 r6 r7
  0x006f: PHI (r5v6 int) = (r5v2 int), (r5v7 int) binds: [B:22:0x0062, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r6v9 int) = (r6v4 int), (r6v12 int) binds: [B:22:0x0062, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r7v4 int) = (r7v1 int), (r7v5 int) binds: [B:22:0x0062, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x0073  */
        /* JADX WARN: Code duplicated, block: B:35:0x0080 A[SYNTHETIC] */
        public write RemoteActionCompatParcelizer() {
            int i;
            int i2;
            SparseIntArray sparseIntArray;
            int iKeyAt;
            int iValueAt;
            int i3;
            int i4 = 2 % 2;
            if (!read() || !((Boolean) ((MediaMetadataCompat) this.RemoteActionCompatParcelizer).IconCompatParcelizer()).booleanValue()) {
                return null;
            }
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) ((MediaMetadataCompat) this.write).IconCompatParcelizer()).serializer.MediaMetadataCompat;
            int i5 = 0;
            if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
                i = 0;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
                int i6 = 0;
                while (i5 < sparseIntArray.size()) {
                    int i7 = MediaDescriptionCompat + 73;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        iKeyAt = sparseIntArray.keyAt(i5);
                        iValueAt = sparseIntArray.valueAt(i5);
                        i6 -= iValueAt;
                        if (iKeyAt > 179) {
                            i += iValueAt;
                            i3 = RatingCompat + 39;
                        } else if (iKeyAt > 16) {
                            int i8 = RatingCompat;
                            int i9 = i8 + 81;
                            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            i2 += iValueAt;
                            i3 = i8 + 57;
                        }
                        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                        int i11 = i3 % 2;
                    } else {
                        iKeyAt = sparseIntArray.keyAt(i5);
                        iValueAt = sparseIntArray.valueAt(i5);
                        i6 += iValueAt;
                        if (iKeyAt > 700) {
                            i += iValueAt;
                            i3 = RatingCompat + 39;
                        } else if (iKeyAt > 16) {
                            int i12 = RatingCompat;
                            int i13 = i12 + 81;
                            MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            i2 += iValueAt;
                            i3 = i12 + 57;
                        }
                        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                        int i15 = i3 % 2;
                    }
                    i5++;
                }
                i5 = i6;
            }
            return new write(i5, i2, i);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:32:0x0088  */
        /* JADX WARN: Code duplicated, block: B:35:0x0096  */
        public static final Object access$isDestinationPreviewAllowed(Builder builder, getStrictnessusljTpc getstrictnessusljtpc, hasFontAttributes hasfontattributes, ContinuationImpl continuationImpl) {
            setFontAttributes setfontattributes;
            int i = 2 % 2;
            Object obj = null;
            boolean z = true;
            if (!(continuationImpl instanceof setFontAttributes)) {
                setfontattributes = new setFontAttributes(builder, continuationImpl);
            } else {
                int i2 = MediaDescriptionCompat + 87;
                RatingCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = ((setFontAttributes) continuationImpl).serializer;
                    throw null;
                }
                setfontattributes = (setFontAttributes) continuationImpl;
                int i4 = setfontattributes.serializer;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    setfontattributes.serializer = i4 - Integer.MIN_VALUE;
                } else {
                    setfontattributes = new setFontAttributes(builder, continuationImpl);
                }
            }
            Object objInvoke = setfontattributes.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = setfontattributes.serializer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                if (getstrictnessusljtpc instanceof getWordBreakjp8hJ3c) {
                    SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) builder.MediaMetadataCompat;
                    accessgetGocp accessgetgocpSerializer = hasfontattributes.write().serializer();
                    setfontattributes.IconCompatParcelizer = (getWordBreakjp8hJ3c) getstrictnessusljtpc;
                    setfontattributes.serializer = 1;
                    objInvoke = saveHeatmapUrlImpl.invoke(accessgetgocpSerializer, setfontattributes);
                    if (objInvoke == coroutineSingletons) {
                        int i6 = MediaDescriptionCompat + 103;
                        RatingCompat = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            return coroutineSingletons;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
                if (!(getstrictnessusljtpc instanceof getWordBreakjp8hJ3c)) {
                    int i7 = RatingCompat + 35;
                    MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (!(getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getWordBreakjp8hJ3c getwordbreakjp8hj3c = setfontattributes.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            getstrictnessusljtpc = getwordbreakjp8hj3c;
            if (((Boolean) objInvoke).booleanValue()) {
                int i9 = RatingCompat + 123;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return Boolean.FALSE;
            }
            if (!(getstrictnessusljtpc instanceof getWordBreakjp8hJ3c)) {
                int i11 = RatingCompat + 35;
                MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (!(getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations)) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }

        public removeNodesInRange serializer(byte[] bArr) {
            int i = 2 % 2;
            int i2 = 3;
            int i3 = 1;
            try {
                this.MediaBrowserCompatMediaItem = new maxLookaheadIntrinsicHeight().IconCompatParcelizer((String) this.read);
                try {
                    removeNodesInRange removenodesinrange = new removeNodesInRange(i2, (lookaheadReplaceui) ((Keyset) EmojiProcessor.IconCompatParcelizer(new removeNodesInRange(i3, new ByteArrayInputStream(bArr)), (minLookaheadIntrinsicHeight) this.MediaBrowserCompatMediaItem).serializer).ComponentActivity());
                    int i4 = MediaDescriptionCompat + 23;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return removenodesinrange;
                    }
                    throw null;
                } catch (IOException | GeneralSecurityException e) {
                    try {
                        return new removeNodesInRange(i2, (lookaheadReplaceui) ((Keyset) accessremoveNodesInRange.read(new removeNodesInRange(i3, new ByteArrayInputStream(bArr))).serializer).ComponentActivity());
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                try {
                    removeNodesInRange removenodesinrange2 = new removeNodesInRange(i2, (lookaheadReplaceui) ((Keyset) accessremoveNodesInRange.read(new removeNodesInRange(i3, new ByteArrayInputStream(bArr))).serializer).ComponentActivity());
                    SentryLogcatAdapter.write("AndroidKeysetManager", "cannot use Android Keystore, it'll be disabled", e2);
                    return removenodesinrange2;
                } catch (IOException unused2) {
                    throw e2;
                }
            }
        }

        public Builder(Application application, SemanticsOwner semanticsOwner, AppStartToInteractiveTraceStopper appStartToInteractiveTraceStopper, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, transferSessionPackageI transfersessionpackagei) {
            this.serializer = 7;
            semanticsOwner.getClass();
            accessisrendernodecompatiblecp.getClass();
            transfersessionpackagei.getClass();
            this.write = application;
            this.MediaSessionCompatQueueItem = semanticsOwner;
            this.read = appStartToInteractiveTraceStopper;
            this.MediaBrowserCompatMediaItem = accessisrendernodecompatiblecp;
            this.MediaMetadataCompat = transfersessionpackagei;
            this.IconCompatParcelizer = new drawShadowerFMhIw(1, this);
            this.RemoteActionCompatParcelizer = new notifySemanticsChangeui();
        }

        public Builder(ComponentActivity componentActivity, schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release, requestLocationInitialization requestlocationinitialization, retryInAppMessageandroid_sdk_base_release retryinappmessageandroid_sdk_base_release, Path$Companion path$Companion, accessisMainThread accessismainthread) {
            this.serializer = 19;
            componentActivity.getClass();
            schedulepushdeliveryandroid_sdk_base_release.getClass();
            path$Companion.getClass();
            accessismainthread.getClass();
            this.write = componentActivity;
            this.MediaSessionCompatQueueItem = schedulepushdeliveryandroid_sdk_base_release;
            this.read = requestlocationinitialization;
            this.MediaBrowserCompatMediaItem = retryinappmessageandroid_sdk_base_release;
            this.MediaMetadataCompat = path$Companion;
            this.IconCompatParcelizer = accessismainthread;
            onBackPressed onbackpressedRegisterForActivityResult = componentActivity.registerForActivityResult(new times7Ah8Wj8(2), new SentryTracer$$ExternalSyntheticLambda1(4, this));
            onbackpressedRegisterForActivityResult.getClass();
            this.RemoteActionCompatParcelizer = onbackpressedRegisterForActivityResult;
        }

        public Builder(getDoubleOrNull getdoubleornull, setVerticalBias setverticalbias, setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, setVerticalBias setverticalbias2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, LayoutCompat layoutCompat) {
            this.serializer = 12;
            getdoubleornull.getClass();
            setverticalbias.getClass();
            setusetemptrackingtableroom_runtime.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
            layoutCompat.getClass();
            this.write = getdoubleornull;
            this.MediaSessionCompatQueueItem = setverticalbias;
            this.read = setusetemptrackingtableroom_runtime;
            this.MediaBrowserCompatMediaItem = setverticalbias2;
            this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.RemoteActionCompatParcelizer = layoutCompat;
        }

        public Builder(onCapabilitiesChanged oncapabilitieschanged, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, q0 q0Var, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, backgroundTimerFiredI backgroundtimerfiredi) {
            this.serializer = 16;
            oncapabilitieschanged.getClass();
            transactionwithresultsuspendimpl.getClass();
            lambdaverifyplaystorepurchase45.getClass();
            q0Var.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
            backgroundtimerfiredi.getClass();
            this.write = oncapabilitieschanged;
            this.MediaSessionCompatQueueItem = transactionwithresultsuspendimpl;
            this.read = lambdaverifyplaystorepurchase45;
            this.MediaBrowserCompatMediaItem = q0Var;
            this.MediaMetadataCompat = publisherrorlambda1;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.RemoteActionCompatParcelizer = backgroundtimerfiredi;
        }

        public Builder(Application application, h9 h9Var, getAllSemanticsNodesToMap getallsemanticsnodestomap, igExternalSyntheticLambda2 igexternalsyntheticlambda2, isOpenInternalroom_runtime isopeninternalroom_runtime, createQuery createquery, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
            this.serializer = 15;
            application.getClass();
            h9Var.getClass();
            getallsemanticsnodestomap.getClass();
            igexternalsyntheticlambda2.getClass();
            isopeninternalroom_runtime.getClass();
            createquery.getClass();
            getcontentviewgroupparentlayout.getClass();
            this.write = application;
            this.MediaSessionCompatQueueItem = h9Var;
            this.read = getallsemanticsnodestomap;
            this.MediaBrowserCompatMediaItem = igexternalsyntheticlambda2;
            this.MediaMetadataCompat = isopeninternalroom_runtime;
            this.IconCompatParcelizer = createquery;
            this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        }

        public Builder(requestBannersRefreshlambda1 requestbannersrefreshlambda1, requestBannersRefreshlambda1 requestbannersrefreshlambda2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, requestBannersRefreshlambda1 requestbannersrefreshlambda3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
            this.serializer = 18;
            requestbannersrefreshlambda1.getClass();
            requestbannersrefreshlambda2.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
            r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
            this.write = requestbannersrefreshlambda1;
            this.MediaSessionCompatQueueItem = requestbannersrefreshlambda2;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.MediaBrowserCompatMediaItem = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
            this.IconCompatParcelizer = requestbannersrefreshlambda3;
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
        }

        public Builder(setPaddingBottom setpaddingbottom, LocaleListHelperMethods localeListHelperMethods, LocaleListHelperMethods localeListHelperMethods2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, setPresentationView setpresentationview, setVerticalBias setverticalbias, LocaleListHelperMethods localeListHelperMethods3) {
            this.serializer = 10;
            setpaddingbottom.getClass();
            localeListHelperMethods.getClass();
            localeListHelperMethods2.getClass();
            requestsinglelocationupdatelambda1.getClass();
            setpresentationview.getClass();
            localeListHelperMethods3.getClass();
            this.write = setpaddingbottom;
            this.MediaSessionCompatQueueItem = localeListHelperMethods;
            this.read = localeListHelperMethods2;
            this.MediaBrowserCompatMediaItem = requestsinglelocationupdatelambda1;
            this.MediaMetadataCompat = setpresentationview;
            this.IconCompatParcelizer = setverticalbias;
            this.RemoteActionCompatParcelizer = localeListHelperMethods3;
        }

        public Builder(ImpressionStorageClient impressionStorageClient, disposeComposition disposecomposition, getShowLayoutBoundsannotations getshowlayoutboundsannotations, RateLimiterClient rateLimiterClient, TouchBoundsExpansionKt touchBoundsExpansionKt, getHasComposition gethascomposition, MetricsLoggerClient metricsLoggerClient, zzbv zzbvVar) {
            this.serializer = 6;
            this.write = impressionStorageClient;
            this.MediaSessionCompatQueueItem = disposecomposition;
            this.read = getshowlayoutboundsannotations;
            this.MediaBrowserCompatMediaItem = rateLimiterClient;
            this.MediaMetadataCompat = gethascomposition;
            this.IconCompatParcelizer = metricsLoggerClient;
            this.RemoteActionCompatParcelizer = zzbvVar;
        }

        public Builder(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, SentryAndroidOptions sentryAndroidOptions) {
            this.serializer = 20;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
            this.read = new ConcurrentHashMap();
            this.MediaBrowserCompatMediaItem = new WeakHashMap();
            this.IconCompatParcelizer = new RemoteActionCompatParcelizer();
            int i = 14;
            this.RemoteActionCompatParcelizer = new MediaMetadataCompat(new SentryTracer$$ExternalSyntheticLambda1(mediaBrowserCompatMediaItem, i, sentryAndroidOptions.getLogger()));
            this.write = new MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(i));
            this.MediaSessionCompatQueueItem = sentryAndroidOptions;
            this.MediaMetadataCompat = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        }

        public /* synthetic */ Builder(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
            this.serializer = i;
            this.write = obj;
            this.MediaSessionCompatQueueItem = obj2;
            this.read = obj3;
            this.MediaBrowserCompatMediaItem = obj4;
            this.MediaMetadataCompat = obj5;
            this.IconCompatParcelizer = obj6;
            this.RemoteActionCompatParcelizer = obj7;
        }

        public Builder(String str, Builder builder, CrashlyticsWorkers crashlyticsWorkers) {
            this.serializer = 5;
            this.MediaBrowserCompatMediaItem = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, false);
            this.MediaMetadataCompat = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(this, true);
            this.IconCompatParcelizer = new setupDirectionalNavigationlambda2();
            this.RemoteActionCompatParcelizer = new AtomicMarkableReference(null, false);
            this.read = str;
            this.write = new isPlacedui(builder);
            this.MediaSessionCompatQueueItem = crashlyticsWorkers;
        }

        public Builder() {
            this.serializer = 3;
            this.RemoteActionCompatParcelizer = null;
            this.write = null;
            this.MediaSessionCompatQueueItem = null;
            this.read = null;
            this.MediaBrowserCompatMediaItem = null;
            this.MediaMetadataCompat = null;
        }

        public Builder(Context context, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault, accessgetStrokecp accessgetstrokecp, getDefaultShadowColor getdefaultshadowcolor, WorkDatabase workDatabase, setFrom58bKbWc setfrom58bkbwc, ArrayList arrayList) {
            this.serializer = 0;
            context.getClass();
            getdefaultshadowcolor.getClass();
            this.write = graphicslayerpanq8wgdefault;
            this.MediaSessionCompatQueueItem = accessgetstrokecp;
            this.read = getdefaultshadowcolor;
            this.MediaBrowserCompatMediaItem = workDatabase;
            this.MediaMetadataCompat = setfrom58bkbwc;
            this.IconCompatParcelizer = arrayList;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.RemoteActionCompatParcelizer = applicationContext;
            new getClipannotations();
        }

        public Builder(clamp clampVar, clamp clampVar2, clamp clampVar3, clamp clampVar4, area areaVar, area areaVar2) {
            this.serializer = 2;
            this.RemoteActionCompatParcelizer = getCapKaPHkGw.write(150, new Extras$Key(13, this));
            this.write = clampVar;
            this.MediaSessionCompatQueueItem = clampVar2;
            this.read = clampVar3;
            this.MediaBrowserCompatMediaItem = clampVar4;
            this.MediaMetadataCompat = areaVar;
            this.IconCompatParcelizer = areaVar2;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:54:0x0136  */
        /* JADX WARN: Code duplicated, block: B:57:0x014e A[PHI: r15
  0x014e: PHI (r15v21 java.lang.Object) = (r15v20 java.lang.Object), (r15v1 java.lang.Object) binds: [B:55:0x014a, B:43:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:60:0x0158  */
        /* JADX WARN: Code duplicated, block: B:63:0x0165 A[PHI: r15
  0x0165: PHI (r15v30 java.lang.Object) = (r15v26 java.lang.Object), (r15v1 java.lang.Object) binds: [B:61:0x0162, B:42:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:65:0x0169  */
        /* JADX WARN: Code duplicated, block: B:67:0x0176  */
        /* JADX WARN: Code duplicated, block: B:72:0x01be  */
        /* JADX WARN: Code duplicated, block: B:9:0x002a  */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
        
            if (r15 == r6) goto L74;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.Builder.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        public void RemoteActionCompatParcelizer(Throwable th, Thread thread, String str, final getChildDelegatesui getchilddelegatesui, boolean z) {
            Boolean boolValueOf;
            int i;
            List listSerializer;
            int i2 = 2 % 2;
            final boolean zEquals = str.equals(CrashHianalyticsData.EVENT_ID_CRASH);
            getLayoutPendingForAlignment getlayoutpendingforalignment = (getLayoutPendingForAlignment) this.write;
            long j = getchilddelegatesui.IconCompatParcelizer;
            Context context = getlayoutpendingforalignment.serializer;
            int i3 = context.getResources().getConfiguration().orientation;
            zzbv zzbvVar = getlayoutpendingforalignment.MediaMetadataCompat;
            Stack stack = new Stack();
            int i4 = MediaDescriptionCompat + 27;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                stack.push(cause);
            }
            ImageLoader$Builder imageLoader$Builder = null;
            while (!stack.isEmpty()) {
                Throwable th2 = (Throwable) stack.pop();
                imageLoader$Builder = new ImageLoader$Builder(th2.getLocalizedMessage(), th2.getClass().getName(), zzbvVar.read(th2.getStackTrace()), imageLoader$Builder);
            }
            remeasureOnly remeasureonly = new remeasureOnly();
            remeasureonly.MediaSessionCompatQueueItem = str;
            remeasureonly.RatingCompat = j;
            remeasureonly.write = (byte) (remeasureonly.write | 1);
            markLayoutPending marklayoutpendingWrite = placeSelfApparentToRealOffsetgyyYBsui.IconCompatParcelizer.write(context);
            int i6 = ((getUncaughtExceptionHandlerui) marklayoutpendingWrite).IconCompatParcelizer;
            if (i6 > 0) {
                boolValueOf = Boolean.valueOf(i6 != 100);
            } else {
                boolValueOf = null;
            }
            ArrayList arrayList = placeSelfApparentToRealOffsetgyyYBsui.read(context);
            ArrayList arrayList2 = new ArrayList();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) imageLoader$Builder.read;
            String name = thread.getName();
            if (name != null) {
                List listSerializer2 = getLayoutPendingForAlignment.serializer(stackTraceElementArr, 4);
                if (listSerializer2 != null) {
                    arrayList2.add(new getHasPendingMeasureOrLayout(listSerializer2, 4, name));
                    if (z) {
                        for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); !(!it.hasNext()); it = it) {
                            int i7 = RatingCompat + 1;
                            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            Map.Entry<Thread, StackTraceElement[]> next = it.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread)) {
                                StackTraceElement[] stackTraceElementArr2 = zzbvVar.read(next.getValue());
                                String name2 = key.getName();
                                if (name2 == null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
                                    return;
                                }
                                int i9 = RatingCompat + 87;
                                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 != 0) {
                                    i = 0;
                                    listSerializer = getLayoutPendingForAlignment.serializer(stackTraceElementArr2, 0);
                                    if (listSerializer == null) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null frames");
                                        return;
                                    }
                                    arrayList2.add(new getHasPendingMeasureOrLayout(listSerializer, i, name2));
                                } else {
                                    i = 0;
                                    listSerializer = getLayoutPendingForAlignment.serializer(stackTraceElementArr2, 0);
                                    if (listSerializer == null) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null frames");
                                        return;
                                    }
                                    arrayList2.add(new getHasPendingMeasureOrLayout(listSerializer, i, name2));
                                }
                            }
                            zzbvVar = zzbvVar;
                        }
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                    forceMeasureTheSubtree forcemeasurethesubtreeRemoteActionCompatParcelizer = getLayoutPendingForAlignment.RemoteActionCompatParcelizer(imageLoader$Builder, 0);
                    getDuringMeasureLayoutui getduringmeasurelayoutui = getLayoutPendingForAlignment.read();
                    List listSerializer3 = getlayoutpendingforalignment.serializer();
                    if (listSerializer3 != null) {
                        remeasureonly.IconCompatParcelizer = new dispatchOnPositionedCallbacks(new requestRemeasuredefault(listUnmodifiableList, forcemeasurethesubtreeRemoteActionCompatParcelizer, null, getduringmeasurelayoutui, listSerializer3), null, null, boolValueOf, marklayoutpendingWrite, arrayList, i3);
                        remeasureonly.serializer = getlayoutpendingforalignment.read(i3);
                        remeasureIfNeededdefault remeasureifneededdefault = remeasureonly.read();
                        Map map = getchilddelegatesui.RemoteActionCompatParcelizer;
                        getPlacedOnceui getplacedonceui = (getPlacedOnceui) this.MediaBrowserCompatMediaItem;
                        Builder builder = (Builder) this.MediaMetadataCompat;
                        final getLastPositionnOccacui getlastpositionnoccacui = (getLastPositionnOccacui) read(403482092, new Object[]{read(remeasureifneededdefault, getplacedonceui, builder, map), builder}, getCurrentAnimation.IconCompatParcelizer(), getCurrentAnimation.IconCompatParcelizer(), -403482092, getCurrentAnimation.IconCompatParcelizer(), getCurrentAnimation.IconCompatParcelizer());
                        if (!z) {
                            ((CrashlyticsWorkers) this.RemoteActionCompatParcelizer).write.serializer(new Runnable() { // from class: o.onIntrinsicsQueried
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Log.isLoggable("FirebaseCrashlytics", 3);
                                    ((ModifierNodeElement) this.read.MediaSessionCompatQueueItem).serializer(getlastpositionnoccacui, getchilddelegatesui.read, zEquals);
                                }
                            });
                            return;
                        } else {
                            ((ModifierNodeElement) this.MediaSessionCompatQueueItem).serializer(getlastpositionnoccacui, getchilddelegatesui.read, zEquals);
                            return;
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null binaries");
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null frames");
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
        }

        /* JADX WARN: Code duplicated, block: B:17:0x009e  */
        /* JADX WARN: Code duplicated, block: B:19:0x00d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:7:0x0036  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5, types: [o.instance_delegatelambda0] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d8 -> B:21:0x00df). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static final java.lang.Object access$produceMapLayer(androidx.work.impl.WorkerWrapper.Builder r31, java.util.ArrayList r32, o.getNotificationChannels r33, java.lang.Integer r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 635
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.Builder.access$produceMapLayer(androidx.work.impl.WorkerWrapper$Builder, java.util.ArrayList, o.getNotificationChannels, java.lang.Integer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        public static void RemoteActionCompatParcelizer(File file) {
            int iIconCompatParcelizer = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getCurrentAnimation.IconCompatParcelizer();
            read(-1281303028, new Object[]{file}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer, 1281303029, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer2);
        }

        public static getLastPositionnOccacui write(remeasureIfNeededdefault remeasureifneededdefault, Builder builder) {
            int iIconCompatParcelizer = getCurrentAnimation.IconCompatParcelizer();
            int iIconCompatParcelizer2 = getCurrentAnimation.IconCompatParcelizer();
            return (getLastPositionnOccacui) read(403482092, new Object[]{remeasureifneededdefault, builder}, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer, -403482092, getCurrentAnimation.IconCompatParcelizer(), iIconCompatParcelizer2);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.serializer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        translateimpldefault translateimpldefaultVar = (translateimpldefault) this.MediaMetadataCompat;
        String str = this.MediaSessionCompatToken;
        translateimpldefaultVar.read(jCurrentTimeMillis, str);
        translateimpldefaultVar.RemoteActionCompatParcelizer(setTranslationX.ENQUEUED, str);
        translateimpldefaultVar.getClass();
        ((Number) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new d0$$ExternalSyntheticLambda4(str, 6))).intValue();
        translateimpldefaultVar.IconCompatParcelizer(this.MediaSessionCompatQueueItem.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, str);
        translateimpldefaultVar.getClass();
        TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new d0$$ExternalSyntheticLambda4(str, 7));
        translateimpldefaultVar.write(-1L, str);
    }

    public final void serializer(int i) {
        setTranslationX settranslationx = setTranslationX.ENQUEUED;
        translateimpldefault translateimpldefaultVar = (translateimpldefault) this.MediaMetadataCompat;
        String str = this.MediaSessionCompatToken;
        translateimpldefaultVar.RemoteActionCompatParcelizer(settranslationx, str);
        this.serializer.getClass();
        translateimpldefaultVar.read(System.currentTimeMillis(), str);
        translateimpldefaultVar.IconCompatParcelizer(this.MediaSessionCompatQueueItem.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, str);
        translateimpldefaultVar.write(-1L, str);
        translateimpldefaultVar.read(i, str);
    }

    public WorkerWrapper(Builder builder) {
        setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) builder.MediaMetadataCompat;
        this.MediaSessionCompatQueueItem = setfrom58bkbwc;
        this.read = (Context) builder.RemoteActionCompatParcelizer;
        String str = setfrom58bkbwc.RatingCompat;
        this.MediaSessionCompatToken = str;
        this.PlaybackStateCompatCustomAction = (accessgetStrokecp) builder.MediaSessionCompatQueueItem;
        graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = (graphicsLayerpANQ8Wgdefault) builder.write;
        this.write = graphicslayerpanq8wgdefault;
        this.serializer = graphicslayerpanq8wgdefault.IconCompatParcelizer;
        this.IconCompatParcelizer = (getDefaultShadowColor) builder.read;
        WorkDatabase workDatabase = (WorkDatabase) builder.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = workDatabase;
        this.MediaMetadataCompat = workDatabase.MediaMetadataCompat();
        this.RemoteActionCompatParcelizer = workDatabase.IconCompatParcelizer();
        ArrayList arrayList = (ArrayList) builder.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = arrayList;
        this.RatingCompat = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Work [ id=", str, ", tags={ "), onContentCardDismissed.IconCompatParcelizer(arrayList, ",", null, null, null, 62), " } ]");
        this.PlaybackStateCompat = JobKt.RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(setCameraDistance setcameradistance) {
        setcameradistance.getClass();
        String str = this.MediaSessionCompatToken;
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
        while (true) {
            boolean zIsEmpty = arrayList.isEmpty();
            scaleimpl scaleimplVar = this.MediaMetadataCompat;
            if (zIsEmpty) {
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujdWrite = ((accesssetRenderEffectjd) setcameradistance).write();
                accessgetambientshadowcolor0d7_kjujdWrite.getClass();
                translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVar;
                translateimpldefaultVar.IconCompatParcelizer(this.MediaSessionCompatQueueItem.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, str);
                translateimpldefaultVar.getClass();
                TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(accessgetambientshadowcolor0d7_kjujdWrite, 18, str));
                return;
            }
            String str2 = (String) onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList);
            translateimpldefault translateimpldefaultVar2 = (translateimpldefault) scaleimplVar;
            if (translateimpldefaultVar2.serializer(str2) != setTranslationX.CANCELLED) {
                translateimpldefaultVar2.RemoteActionCompatParcelizer(setTranslationX.FAILED, str2);
            }
            arrayList.addAll(((getColorsui_graphics) this.RemoteActionCompatParcelizer).read(str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public static final Object access$runWorker(final WorkerWrapper workerWrapper, ContinuationImpl continuationImpl) throws Throwable {
        InterpolatableCompanion interpolatableCompanion;
        setScaleX setscalex;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujdIconCompatParcelizer;
        String str = workerWrapper.MediaSessionCompatToken;
        accessgetStrokecp accessgetstrokecp = workerWrapper.PlaybackStateCompatCustomAction;
        WorkDatabase workDatabase = workerWrapper.MediaDescriptionCompat;
        graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = workerWrapper.write;
        getClipannotations getclipannotations = graphicslayerpanq8wgdefault.PlaybackStateCompatCustomAction;
        setFrom58bKbWc setfrom58bkbwc = workerWrapper.MediaSessionCompatQueueItem;
        if (continuationImpl instanceof InterpolatableCompanion) {
            interpolatableCompanion = (InterpolatableCompanion) continuationImpl;
            int i = interpolatableCompanion.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                interpolatableCompanion.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                interpolatableCompanion = new InterpolatableCompanion(workerWrapper, continuationImpl);
            }
        } else {
            interpolatableCompanion = new InterpolatableCompanion(workerWrapper, continuationImpl);
        }
        Object objWithContext = interpolatableCompanion.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = interpolatableCompanion.IconCompatParcelizer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                getclipannotations.getClass();
                final int i3 = 0;
                final boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue();
                final String str2 = setfrom58bkbwc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                String str3 = setfrom58bkbwc.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                String str4 = setfrom58bkbwc.MediaSessionCompatResultReceiverWrapper;
                if (zBooleanValue && str2 != null) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(setfrom58bkbwc.hashCode(), str2);
                }
                if (((Boolean) workDatabase.runInTransaction(new Callable(workerWrapper) { // from class: o.toPixelMap
                    public final /* synthetic */ androidx.work.impl.WorkerWrapper RemoteActionCompatParcelizer;

                    {
                        this.RemoteActionCompatParcelizer = workerWrapper;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4 = i3;
                        androidx.work.impl.WorkerWrapper workerWrapper2 = this.RemoteActionCompatParcelizer;
                        if (i4 != 0) {
                            scaleimpl scaleimplVar = workerWrapper2.MediaMetadataCompat;
                            String str5 = workerWrapper2.MediaSessionCompatToken;
                            translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVar;
                            boolean z = false;
                            if (translateimpldefaultVar.serializer(str5) == setTranslationX.ENQUEUED) {
                                translateimpldefaultVar.RemoteActionCompatParcelizer(setTranslationX.RUNNING, str5);
                                ((Number) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str5, 13))).intValue();
                                translateimpldefaultVar.read(-256, str5);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                        setFrom58bKbWc setfrom58bkbwc2 = workerWrapper2.MediaSessionCompatQueueItem;
                        setTranslationX settranslationx = setfrom58bkbwc2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        setTranslationX settranslationx2 = setTranslationX.ENQUEUED;
                        if (settranslationx != settranslationx2) {
                            String str6 = androidx.work.impl.WorkerWrapperKt.RemoteActionCompatParcelizer;
                            setRotationX.read().getClass();
                            return Boolean.TRUE;
                        }
                        if (setfrom58bkbwc2.read() || (setfrom58bkbwc2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == settranslationx2 && setfrom58bkbwc2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0)) {
                            workerWrapper2.serializer.getClass();
                            if (System.currentTimeMillis() < setfrom58bkbwc2.serializer()) {
                                setRotationX setrotationx = setRotationX.read();
                                String str7 = androidx.work.impl.WorkerWrapperKt.RemoteActionCompatParcelizer;
                                setrotationx.getClass();
                                return Boolean.TRUE;
                            }
                        }
                        return Boolean.FALSE;
                    }
                })).booleanValue()) {
                    return new requirePrecondition();
                }
                if (setfrom58bkbwc.read()) {
                    accessgetambientshadowcolor0d7_kjujdIconCompatParcelizer = setfrom58bkbwc.MediaSessionCompatToken;
                } else {
                    graphicslayerpanq8wgdefault.RemoteActionCompatParcelizer.getClass();
                    str4.getClass();
                    String str5 = accesssetCompositingStrategyaDBOjCEjd.serializer;
                    try {
                        Object objNewInstance = Class.forName(str4).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        setscalex = (setScaleX) objNewInstance;
                    } catch (Exception e) {
                        setRotationX.read().IconCompatParcelizer(accesssetCompositingStrategyaDBOjCEjd.serializer, "Trouble instantiating ".concat(str4), e);
                        setscalex = null;
                    }
                    if (setscalex == null) {
                        setRotationX.read().serializer(WorkerWrapperKt.RemoteActionCompatParcelizer, "Could not create Input Merger ".concat(str4));
                        return new ImageBitmapx__hDUdefault();
                    }
                    List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{setfrom58bkbwc.MediaSessionCompatToken}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    translateimpldefault translateimpldefaultVar = (translateimpldefault) workerWrapper.MediaMetadataCompat;
                    translateimpldefaultVar.getClass();
                    str.getClass();
                    ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((List) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str, 12)), list);
                    accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = new accessgetCompositingStrategyNrFUSIjd(0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListIconCompatParcelizer.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap = Collections.unmodifiableMap(((accessgetAmbientShadowColor0d7_KjUjd) it.next()).RemoteActionCompatParcelizer);
                        mapUnmodifiableMap.getClass();
                        linkedHashMap.putAll(mapUnmodifiableMap);
                    }
                    accessgetcompositingstrategynrfusijd.write(linkedHashMap);
                    accessgetambientshadowcolor0d7_kjujdIconCompatParcelizer = accessgetcompositingstrategynrfusijd.IconCompatParcelizer();
                }
                UUID uuidFromString = UUID.fromString(str);
                ArrayList arrayList = workerWrapper.MediaBrowserCompatMediaItem;
                int i4 = setfrom58bkbwc.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                Executor executor = graphicslayerpanq8wgdefault.read;
                TextAnnouncementContentCardView textAnnouncementContentCardView = graphicslayerpanq8wgdefault.MediaSessionCompatResultReceiverWrapper;
                hasSameCornerRadius hassamecornerradius = new hasSameCornerRadius(workDatabase, workerWrapper.IconCompatParcelizer, accessgetstrokecp);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.read = uuidFromString;
                workerParameters.RemoteActionCompatParcelizer = accessgetambientshadowcolor0d7_kjujdIconCompatParcelizer;
                new HashSet(arrayList);
                workerParameters.write = i4;
                workerParameters.IconCompatParcelizer = executor;
                workerParameters.MediaDescriptionCompat = textAnnouncementContentCardView;
                workerParameters.serializer = accessgetstrokecp;
                try {
                    final accesssetSpotShadowColor8_81llAjd accesssetspotshadowcolor8_81llajdRemoteActionCompatParcelizer = graphicslayerpanq8wgdefault.ParcelableVolumeInfo.RemoteActionCompatParcelizer(workerWrapper.read, str3, workerParameters);
                    final int i5 = 1;
                    accesssetspotshadowcolor8_81llajdRemoteActionCompatParcelizer.IconCompatParcelizer = true;
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = interpolatableCompanion.getContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
                    shortNewsContentCardViewViewHolder.getClass();
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) shortNewsContentCardViewViewHolder;
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda1
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) throws Throwable {
                            String str6;
                            Throwable th = (Throwable) obj;
                            if (th instanceof WorkerStoppedException) {
                                accesssetspotshadowcolor8_81llajdRemoteActionCompatParcelizer.read.compareAndSet(-256, ((WorkerStoppedException) th).serializer);
                            }
                            if (zBooleanValue && (str6 = str2) != null) {
                                WorkerWrapper workerWrapper2 = workerWrapper;
                                getClipannotations getclipannotations2 = workerWrapper2.write.PlaybackStateCompatCustomAction;
                                int iHashCode = workerWrapper2.MediaSessionCompatQueueItem.hashCode();
                                getclipannotations2.getClass();
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(iHashCode, str6);
                            }
                            return createFromParcel.INSTANCE;
                        }
                    });
                    Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(workerWrapper) { // from class: o.toPixelMap
                        public final /* synthetic */ androidx.work.impl.WorkerWrapper RemoteActionCompatParcelizer;

                        {
                            this.RemoteActionCompatParcelizer = workerWrapper;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i6 = i5;
                            androidx.work.impl.WorkerWrapper workerWrapper2 = this.RemoteActionCompatParcelizer;
                            if (i6 != 0) {
                                scaleimpl scaleimplVar = workerWrapper2.MediaMetadataCompat;
                                String str6 = workerWrapper2.MediaSessionCompatToken;
                                translateimpldefault translateimpldefaultVar2 = (translateimpldefault) scaleimplVar;
                                boolean z = false;
                                if (translateimpldefaultVar2.serializer(str6) == setTranslationX.ENQUEUED) {
                                    translateimpldefaultVar2.RemoteActionCompatParcelizer(setTranslationX.RUNNING, str6);
                                    ((Number) TuplesKt.write(translateimpldefaultVar2.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str6, 13))).intValue();
                                    translateimpldefaultVar2.read(-256, str6);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                            setFrom58bKbWc setfrom58bkbwc2 = workerWrapper2.MediaSessionCompatQueueItem;
                            setTranslationX settranslationx = setfrom58bkbwc2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            setTranslationX settranslationx2 = setTranslationX.ENQUEUED;
                            if (settranslationx != settranslationx2) {
                                String str7 = androidx.work.impl.WorkerWrapperKt.RemoteActionCompatParcelizer;
                                setRotationX.read().getClass();
                                return Boolean.TRUE;
                            }
                            if (setfrom58bkbwc2.read() || (setfrom58bkbwc2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == settranslationx2 && setfrom58bkbwc2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0)) {
                                workerWrapper2.serializer.getClass();
                                if (System.currentTimeMillis() < setfrom58bkbwc2.serializer()) {
                                    setRotationX setrotationx = setRotationX.read();
                                    String str8 = androidx.work.impl.WorkerWrapperKt.RemoteActionCompatParcelizer;
                                    setrotationx.getClass();
                                    return Boolean.TRUE;
                                }
                            }
                            return Boolean.FALSE;
                        }
                    });
                    objRunInTransaction.getClass();
                    if (!((Boolean) objRunInTransaction).booleanValue()) {
                        return new requirePrecondition();
                    }
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0.MediaDescriptionCompat()) {
                        return new requirePrecondition();
                    }
                    accessgetParentLayoutDirection accessgetparentlayoutdirection = accessgetstrokecp.write;
                    accessgetparentlayoutdirection.getClass();
                    int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                    CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{accessgetparentlayoutdirection}, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1915506938);
                    AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(workerWrapper, accesssetspotshadowcolor8_81llajdRemoteActionCompatParcelizer, hassamecornerradius, null, 8);
                    interpolatableCompanion.IconCompatParcelizer = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, asyncImagePainter$launchJob$1, interpolatableCompanion);
                    if (objWithContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable unused) {
                    String str6 = WorkerWrapperKt.RemoteActionCompatParcelizer;
                    setRotationX.read().serializer(str6, "Could not create Worker " + str3);
                    return new ImageBitmapx__hDUdefault();
                }
            } else if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setCameraDistance setcameradistance = (setCameraDistance) objWithContext;
            setcameradistance.getClass();
            return new Interval(setcameradistance);
        } catch (CancellationException e2) {
            String str7 = WorkerWrapperKt.RemoteActionCompatParcelizer;
            setRotationX.read().getClass();
            throw e2;
        } catch (Throwable th) {
            setRotationX.read().IconCompatParcelizer(WorkerWrapperKt.RemoteActionCompatParcelizer, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), workerWrapper.RatingCompat, " failed because it threw an exception/error"), th);
            return new ImageBitmapx__hDUdefault();
        }
    }
}
