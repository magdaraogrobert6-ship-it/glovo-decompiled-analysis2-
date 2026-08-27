package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.login.logging.RouterLogger;
import io.grpc.CallOptions$Builder;
import io.grpc.internal.CallTracer;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class access500 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final Object IconCompatParcelizer;
    public final Object MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final Object MediaSessionCompatQueueItem;
    public final Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Object write;

    public getAdapters write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAdapters getadapters = (getAdapters) ((AtomicReference) this.MediaMetadataCompat).get();
        int i4 = MediaBrowserCompatMediaItem + 31;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getadapters;
    }

    public access500() {
        this.RatingCompat = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_heart, com.logistics.rider.glovo.R.color.success_main, "Heart");
        this.serializer = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_circle_with_tail_up, com.logistics.rider.glovo.R.color.alert_main, "Arrow With Tail Up");
        this.IconCompatParcelizer = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_bold_large_heavy, com.logistics.rider.glovo.R.color.secondary_main, "Big Order");
        this.MediaDescriptionCompat = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_bold_large_partly_cloudy_partly_cloudy, com.logistics.rider.glovo.R.color.component_background_chip_selected, "Bad Weather");
        this.write = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_umbrella_beach, com.logistics.rider.glovo.R.color.error_dark_02, "Holiday");
        this.MediaSessionCompatQueueItem = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_moon, com.logistics.rider.glovo.R.color.secondary_main, "Night");
        this.read = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_rain, com.logistics.rider.glovo.R.color.component_background_chip_selected, "Rain");
        this.MediaMetadataCompat = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_fire, com.logistics.rider.glovo.R.color.alert_main, "Rush Hour");
        this.RemoteActionCompatParcelizer = new constrainedMap(com.logistics.rider.glovo.R.drawable.ic_snowflake, com.logistics.rider.glovo.R.color.component_background_chip_selected, "Snow");
    }

    public getAdapters RemoteActionCompatParcelizer(getNameFallback getnamefallback) {
        int i = 2 % 2;
        getAdapters getadapters = null;
        try {
            if (!getNameFallback.SKIP_CACHE_LOOKUP.equals(getnamefallback)) {
                int i2 = ParcelableVolumeInfo + 93;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                JSONObject jSONObject = ((zzz) this.write).read();
                if (jSONObject != null) {
                    getAdapters getadaptersWrite = ((zzz) this.IconCompatParcelizer).write(jSONObject);
                    jSONObject.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    ((speculativeHit) this.MediaDescriptionCompat).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!getNameFallback.IGNORE_CACHE_EXPIRATION.equals(getnamefallback)) {
                        int i4 = ParcelableVolumeInfo + 77;
                        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            long j = getadaptersWrite.write;
                            getadapters.hashCode();
                            throw null;
                        }
                        if (getadaptersWrite.write < jCurrentTimeMillis) {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            return null;
                        }
                    }
                    try {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return getadaptersWrite;
                    } catch (Exception e) {
                        e = e;
                        getadapters = getadaptersWrite;
                        SentryLogcatAdapter.read("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return getadapters;
                    }
                }
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public /* synthetic */ access500(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.RatingCompat = obj;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj3;
        this.MediaDescriptionCompat = obj4;
        this.write = obj5;
        this.MediaSessionCompatQueueItem = obj6;
        this.read = obj7;
        this.MediaMetadataCompat = obj8;
        this.RemoteActionCompatParcelizer = obj9;
    }

    public access500(WindowInsetsCompatImpl20 windowInsetsCompatImpl20, changeUserlambda0 changeuserlambda0, readAndInitOrPropagateFailure readandinitorpropagatefailure, accessgetLineHeightSpans accessgetlineheightspans, AndroidAccessibilitySpannableString_androidKt androidAccessibilitySpannableString_androidKt, x9 x9Var, wgExternalSyntheticLambda0 wgexternalsyntheticlambda0, xe xeVar, getStartOrEndOffsetForRectWithinLine getstartorendoffsetforrectwithinline) {
        windowInsetsCompatImpl20.getClass();
        changeuserlambda0.getClass();
        readandinitorpropagatefailure.getClass();
        accessgetlineheightspans.getClass();
        androidAccessibilitySpannableString_androidKt.getClass();
        x9Var.getClass();
        wgexternalsyntheticlambda0.getClass();
        xeVar.getClass();
        getstartorendoffsetforrectwithinline.getClass();
        this.RatingCompat = windowInsetsCompatImpl20;
        this.serializer = changeuserlambda0;
        this.IconCompatParcelizer = readandinitorpropagatefailure;
        this.MediaDescriptionCompat = accessgetlineheightspans;
        this.write = androidAccessibilitySpannableString_androidKt;
        this.MediaSessionCompatQueueItem = x9Var;
        this.read = wgexternalsyntheticlambda0;
        this.MediaMetadataCompat = xeVar;
        this.RemoteActionCompatParcelizer = getstartorendoffsetforrectwithinline;
    }

    public access500(lineEndToVisibleEnd lineendtovisibleend, lineEndToVisibleEnd lineendtovisibleend2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, transformCanvas transformcanvas, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, lineEndToVisibleEnd lineendtovisibleend3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        lineendtovisibleend.getClass();
        lineendtovisibleend2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        transformcanvas.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.RatingCompat = lineendtovisibleend;
        this.serializer = lineendtovisibleend2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.MediaDescriptionCompat = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.write = transformcanvas;
        this.MediaSessionCompatQueueItem = semanticsPropertiesLinkTestMarker1;
        this.read = lineendtovisibleend3;
        this.MediaMetadataCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = convertstringjsonarraytolistlambda0;
    }

    public access500(setPaddingBottom setpaddingbottom, onCapabilitiesChanged oncapabilitieschanged, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, LocaleListHelperMethods localeListHelperMethods, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, transformCanvas transformcanvas, setPaddingBottom setpaddingbottom2, onCapabilitiesChanged oncapabilitieschanged2) {
        setpaddingbottom.getClass();
        oncapabilitieschanged.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        localeListHelperMethods.getClass();
        shouldShowHeatmap_Factory.getClass();
        transformcanvas.getClass();
        setpaddingbottom2.getClass();
        this.RatingCompat = setpaddingbottom;
        this.serializer = oncapabilitieschanged;
        this.IconCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = localeListHelperMethods;
        this.MediaSessionCompatQueueItem = shouldShowHeatmap_Factory;
        this.read = transformcanvas;
        this.MediaMetadataCompat = setpaddingbottom2;
        this.RemoteActionCompatParcelizer = oncapabilitieschanged2;
    }

    public access500(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, insertBasedOnParentOffset insertbasedonparentoffset, lineEndToVisibleEnd lineendtovisibleend, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, insertBasedOnParentOffset insertbasedonparentoffset2, lineEndToVisibleEnd lineendtovisibleend2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        insertbasedonparentoffset.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        insertbasedonparentoffset2.getClass();
        lineendtovisibleend2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.RatingCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = insertbasedonparentoffset;
        this.IconCompatParcelizer = lineendtovisibleend;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaSessionCompatQueueItem = convertstringjsonarraytolistlambda0;
        this.read = insertbasedonparentoffset2;
        this.MediaMetadataCompat = lineendtovisibleend2;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }

    public access500(Context context, getInspectableElements getinspectableelements, speculativeHit speculativehit, zzz zzzVar, zzz zzzVar2, mergeJsonObjectslambda00 mergejsonobjectslambda00, ComponentRegistry$Builder componentRegistry$Builder) {
        AtomicReference atomicReference = new AtomicReference();
        this.MediaMetadataCompat = atomicReference;
        this.RemoteActionCompatParcelizer = new AtomicReference(new ParentDataModifierDefaultImpls());
        this.RatingCompat = context;
        this.serializer = getinspectableelements;
        this.MediaDescriptionCompat = speculativehit;
        this.IconCompatParcelizer = zzzVar;
        this.write = zzzVar2;
        this.MediaSessionCompatQueueItem = mergejsonobjectslambda00;
        this.read = componentRegistry$Builder;
        atomicReference.set(getIntentArrayWithConfiguredBackStacklambda4.RemoteActionCompatParcelizer(speculativehit));
    }

    public r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ write(getContentViewGroupParentLayout getcontentviewgroupparentlayout, L l) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 109;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getcontentviewgroupparentlayout.getClass();
        l.getClass();
        int i4 = e0.serializer[l.ordinal()];
        if (i4 == 1) {
            x8 x8Var = new x8((CallTracer) ((isMenuVisible) ((wgExternalSyntheticLambda0) this.read).IconCompatParcelizer.IconCompatParcelizer).write(), getcontentviewgroupparentlayout);
            changeUserlambda0 changeuserlambda0 = (changeUserlambda0) this.serializer;
            changeuserlambda0.getClass();
            readAndInitOrPropagateAndThrowFailure readandinitorpropagateandthrowfailure = new readAndInitOrPropagateAndThrowFailure((CombinedScopeView) ((subscribeToFeatureFlagsUpdateslambda0) changeuserlambda0.RemoteActionCompatParcelizer.IconCompatParcelizer).write(), getcontentviewgroupparentlayout);
            WindowInsetsCompatImpl20 windowInsetsCompatImpl20 = (WindowInsetsCompatImpl20) this.RatingCompat;
            windowInsetsCompatImpl20.getClass();
            MetricsBatchProcessor metricsBatchProcessor = windowInsetsCompatImpl20.RemoteActionCompatParcelizer;
            Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.RemoteActionCompatParcelizer).write();
            objWrite.getClass();
            getRootStableInsets getrootstableinsets = (getRootStableInsets) ((insertTextAtCursordefault) metricsBatchProcessor.serializer).write();
            Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.write).write();
            objWrite2.getClass();
            CoreComponentFactory coreComponentFactory = (CoreComponentFactory) objWrite2;
            Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.read).write();
            objWrite3.getClass();
            vg vgVar = (vg) objWrite3;
            Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.MediaSessionCompatQueueItem).write();
            objWrite4.getClass();
            Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.IconCompatParcelizer).write();
            objWrite5.getClass();
            setSystemUiVisibility setsystemuivisibility = new setSystemUiVisibility((f2ExternalSyntheticLambda4) objWrite, getrootstableinsets, getcontentviewgroupparentlayout, coreComponentFactory, vgVar, (v4) objWrite4, (getActionList) objWrite5);
            CallOptions$Builder callOptions$Builder = ((x9) this.MediaSessionCompatQueueItem).serializer;
            x5 x5Var = new x5((f2ExternalSyntheticLambda4) ((mergeJsonObjects) callOptions$Builder.serializer).write(), (getSupportedCipherSuites) ((mergeJsonObjects) callOptions$Builder.RemoteActionCompatParcelizer).write(), (CombinedScopeView) ((SharedPreferencesMigration) callOptions$Builder.read).write(), getcontentviewgroupparentlayout, (s7) ((SimpleExecutableQuery) callOptions$Builder.write).write(), (vg) ((mergeJsonObjects) callOptions$Builder.MediaMetadataCompat).write(), (subscribeToBannersUpdateslambda2) ((mergeJsonObjects) callOptions$Builder.RatingCompat).write(), (checkSdkClickResponse) ((mergeJsonObjects) callOptions$Builder.IconCompatParcelizer).write(), (readFileContent) ((mergeJsonObjects) callOptions$Builder.MediaSessionCompatQueueItem).write());
            x8 x8Var2 = new x8((CallOptions$Builder) ((SemanticsPropertiesInvisibleToUser1) ((xe) this.MediaMetadataCompat).write.serializer).write(), getcontentviewgroupparentlayout);
            readAndInitOrPropagateFailure readandinitorpropagatefailure = (readAndInitOrPropagateFailure) this.IconCompatParcelizer;
            readandinitorpropagatefailure.getClass();
            readAndInitOrPropagateAndThrowFailure readandinitorpropagateandthrowfailure2 = new readAndInitOrPropagateAndThrowFailure((RouterLogger) ((onMeasureChild) readandinitorpropagatefailure.serializer.read).write(), getcontentviewgroupparentlayout);
            accessgetLineHeightSpans accessgetlineheightspans = (accessgetLineHeightSpans) this.MediaDescriptionCompat;
            accessgetlineheightspans.getClass();
            InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = accessgetlineheightspans.read;
            Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) initializeAppStartupItemsImpl.IconCompatParcelizer).write();
            objWrite6.getClass();
            x8 x8Var3 = new x8((VerticalPaddings) objWrite6, (ProtobufEncoder) ((SemanticsPropertiesLinkTestMarker1) initializeAppStartupItemsImpl.serializer).write(), getcontentviewgroupparentlayout);
            AndroidAccessibilitySpannableString_androidKt androidAccessibilitySpannableString_androidKt = (AndroidAccessibilitySpannableString_androidKt) this.write;
            androidAccessibilitySpannableString_androidKt.getClass();
            return removeNodeAtDepth.serializer(x8Var, readandinitorpropagateandthrowfailure, setsystemuivisibility, x5Var, x8Var2, readandinitorpropagateandthrowfailure2, x8Var3, new readAndInitOrPropagateAndThrowFailure((androidx.work.impl.WorkerWrapper.Builder) ((accessgetRelayoutTimep) androidAccessibilitySpannableString_androidKt.serializer.read).write(), getcontentviewgroupparentlayout));
        }
        int i5 = ParcelableVolumeInfo + 71;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (i4 == 2) {
            getStartOrEndOffsetForRectWithinLine getstartorendoffsetforrectwithinline = (getStartOrEndOffsetForRectWithinLine) this.RemoteActionCompatParcelizer;
            getstartorendoffsetforrectwithinline.getClass();
            r8lambda6cOFqnFCSVnq6uI5jphSUi9HNJU r8lambda6cofqnfcsvnq6ui5jphsui9hnju = getstartorendoffsetforrectwithinline.RemoteActionCompatParcelizer;
            Object objWrite7 = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.read.write();
            objWrite7.getClass();
            Object objWrite8 = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.RemoteActionCompatParcelizer.write();
            objWrite8.getClass();
            return removeNodeAtDepth.serializer(new TextLayout_androidKt((LastStopSelectionCoordinator) objWrite7, (f2ExternalSyntheticLambda4) objWrite8, getcontentviewgroupparentlayout));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x046a A[Catch: IOException -> 0x0474, TRY_LEAVE, TryCatch #1 {IOException -> 0x0474, blocks: (B:107:0x03fa, B:108:0x0409, B:110:0x0413, B:113:0x042b, B:115:0x042f, B:117:0x0435, B:126:0x0456, B:127:0x0460, B:128:0x046a), top: B:160:0x03fa }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0308  */
    /* JADX WARN: Code duplicated, block: B:78:0x030b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0311  */
    /* JADX WARN: Code duplicated, block: B:84:0x0325  */
    /* JADX WARN: Code duplicated, block: B:87:0x033b  */
    public void RemoteActionCompatParcelizer(accessgetEightcp accessgeteightcp, int i) {
        accessgetForwardcp accessgetforwardcp;
        SQLiteEventStore sQLiteEventStore;
        accessgetF4cp accessgetf4cp;
        String str;
        isEndBoundary isendboundaryIconCompatParcelizer;
        String str2;
        Integer numValueOf;
        String str3;
        accessgetButtonThumbRightcp accessgetbuttonthumbrightcp;
        String strConcat;
        int i2;
        final access500 access500Var = this;
        final accessgetEightcp accessgeteightcp2 = accessgeteightcp;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = MediaBrowserCompatMediaItem + 91;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        byte[] bArr = accessgeteightcp2.read;
        SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) access500Var.MediaSessionCompatQueueItem;
        accessgetForwardcp accessgetforwardcpIconCompatParcelizer = ((accessgetF9cp) access500Var.serializer).IconCompatParcelizer(accessgeteightcp2.serializer);
        if (accessgetF7cp.OK == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null status");
            return;
        }
        int i7 = ParcelableVolumeInfo + 55;
        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        long jMax = 0;
        while (true) {
            final int i9 = 0;
            if (!((Boolean) sQLiteEventStore2.serializer(new accessgetMediaFastForwardcp(access500Var) { // from class: o.accessgetLanguageSwitchcp
                public final /* synthetic */ access500 read;

                {
                    this.read = access500Var;
                }

                @Override // o.accessgetMediaFastForwardcp
                public final Object read() {
                    Boolean boolValueOf;
                    int i10 = i9;
                    accessgetEightcp accessgeteightcp3 = accessgeteightcp2;
                    access500 access500Var2 = this.read;
                    if (i10 != 0) {
                        SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) access500Var2.IconCompatParcelizer;
                        sQLiteEventStore3.getClass();
                        return (Iterable) sQLiteEventStore3.write(new JankStatsFrameTracker$$ExternalSyntheticLambda3(sQLiteEventStore3, 4, accessgeteightcp3));
                    }
                    SQLiteEventStore sQLiteEventStore4 = (SQLiteEventStore) access500Var2.IconCompatParcelizer;
                    SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = sQLiteEventStore4.IconCompatParcelizer();
                    sQLiteDatabaseIconCompatParcelizer.beginTransaction();
                    try {
                        Long lIconCompatParcelizer = SQLiteEventStore.IconCompatParcelizer(sQLiteDatabaseIconCompatParcelizer, accessgeteightcp3);
                        if (lIconCompatParcelizer == null) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            Cursor cursorRawQuery = sQLiteEventStore4.IconCompatParcelizer().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lIconCompatParcelizer.toString()});
                            try {
                                boolean zMoveToNext = cursorRawQuery.moveToNext();
                                cursorRawQuery.close();
                                boolValueOf = Boolean.valueOf(zMoveToNext);
                            } catch (Throwable th) {
                                cursorRawQuery.close();
                                throw th;
                            }
                        }
                        sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
                        sQLiteDatabaseIconCompatParcelizer.endTransaction();
                        return boolValueOf;
                    } catch (Throwable th2) {
                        sQLiteDatabaseIconCompatParcelizer.endTransaction();
                        throw th2;
                    }
                }
            })).booleanValue()) {
                sQLiteEventStore2.serializer(new accessgetLeftBracketcp(access500Var, accessgeteightcp2, jMax));
                return;
            }
            final int i10 = 1;
            Iterable iterable = (Iterable) sQLiteEventStore2.serializer(new accessgetMediaFastForwardcp(access500Var) { // from class: o.accessgetLanguageSwitchcp
                public final /* synthetic */ access500 read;

                {
                    this.read = access500Var;
                }

                @Override // o.accessgetMediaFastForwardcp
                public final Object read() {
                    Boolean boolValueOf;
                    int i11 = i10;
                    accessgetEightcp accessgeteightcp3 = accessgeteightcp2;
                    access500 access500Var2 = this.read;
                    if (i11 != 0) {
                        SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) access500Var2.IconCompatParcelizer;
                        sQLiteEventStore3.getClass();
                        return (Iterable) sQLiteEventStore3.write(new JankStatsFrameTracker$$ExternalSyntheticLambda3(sQLiteEventStore3, 4, accessgeteightcp3));
                    }
                    SQLiteEventStore sQLiteEventStore4 = (SQLiteEventStore) access500Var2.IconCompatParcelizer;
                    SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = sQLiteEventStore4.IconCompatParcelizer();
                    sQLiteDatabaseIconCompatParcelizer.beginTransaction();
                    try {
                        Long lIconCompatParcelizer = SQLiteEventStore.IconCompatParcelizer(sQLiteDatabaseIconCompatParcelizer, accessgeteightcp3);
                        if (lIconCompatParcelizer == null) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            Cursor cursorRawQuery = sQLiteEventStore4.IconCompatParcelizer().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lIconCompatParcelizer.toString()});
                            try {
                                boolean zMoveToNext = cursorRawQuery.moveToNext();
                                cursorRawQuery.close();
                                boolValueOf = Boolean.valueOf(zMoveToNext);
                            } catch (Throwable th) {
                                cursorRawQuery.close();
                                throw th;
                            }
                        }
                        sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
                        sQLiteDatabaseIconCompatParcelizer.endTransaction();
                        return boolValueOf;
                    } catch (Throwable th2) {
                        sQLiteDatabaseIconCompatParcelizer.endTransaction();
                        throw th2;
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (accessgetforwardcpIconCompatParcelizer == null) {
                RangesKt.serializer(accessgeteightcp2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                accessgetf4cp = new accessgetF4cp(accessgetF7cp.FATAL_ERROR, -1L);
                accessgetforwardcp = accessgetforwardcpIconCompatParcelizer;
                sQLiteEventStore = sQLiteEventStore2;
            } else {
                ArrayList<accessgetDvrcp> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                int i11 = ParcelableVolumeInfo + 87;
                MediaBrowserCompatMediaItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % i3 != 0) {
                    int i12 = 3 / i3;
                }
                while (it.hasNext()) {
                    arrayList.add(((accessgetMannerModecp) it.next()).write);
                }
                String str4 = "proto";
                if (bArr != null) {
                    SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) access500Var.RemoteActionCompatParcelizer;
                    Objects.requireNonNull(sQLiteEventStore3);
                    accessgetGravecp accessgetgravecp = (accessgetGravecp) sQLiteEventStore2.serializer(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(19, sQLiteEventStore3));
                    accessgetEndCallcp accessgetendcallcp = new accessgetEndCallcp();
                    accessgetendcallcp.write = new HashMap();
                    accessgetendcallcp.IconCompatParcelizer = Long.valueOf(((accessgetMediaPlaycp) access500Var.read).IconCompatParcelizer());
                    accessgetendcallcp.MediaDescriptionCompat = Long.valueOf(((accessgetMediaPlaycp) access500Var.MediaMetadataCompat).IconCompatParcelizer());
                    accessgetendcallcp.MediaMetadataCompat = "GDT_CLIENT_METRICS";
                    accessgetButton10cp accessgetbutton10cp = new accessgetButton10cp("proto");
                    accessgetgravecp.getClass();
                    ProtobufEncoder protobufEncoder = accessgetF11cp.write;
                    protobufEncoder.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        protobufEncoder.write(accessgetgravecp, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    accessgetendcallcp.read = new accessgetF1cp(accessgetbutton10cp, byteArrayOutputStream.toByteArray());
                    arrayList.add(((accessgetButton13cp) accessgetforwardcpIconCompatParcelizer).read(accessgetendcallcp.read()));
                }
                accessgetButton13cp accessgetbutton13cp = (accessgetButton13cp) accessgetforwardcpIconCompatParcelizer;
                HashMap map = new HashMap();
                for (accessgetDvrcp accessgetdvrcp : arrayList) {
                    String str5 = accessgetdvrcp.RatingCompat;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(accessgetdvrcp);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(accessgetdvrcp);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    accessgetDvrcp accessgetdvrcp2 = (accessgetDvrcp) ((List) entry.getValue()).get(i9);
                    accessgetDirectionCentercp accessgetdirectioncentercp = accessgetDirectionCentercp.DEFAULT;
                    long jIconCompatParcelizer = accessgetbutton13cp.MediaSessionCompatQueueItem.IconCompatParcelizer();
                    long jIconCompatParcelizer2 = accessgetbutton13cp.RatingCompat.IconCompatParcelizer();
                    accessgetForwardcp accessgetforwardcp2 = accessgetforwardcpIconCompatParcelizer;
                    Iterator it3 = it2;
                    accessgetButtonL1cp accessgetbuttonl1cp = new accessgetButtonL1cp(accessgetCameracp.ANDROID_FIREBASE, new accessgetButtonCcp(Integer.valueOf(accessgetdvrcp2.write("sdk-version")), accessgetdvrcp2.IconCompatParcelizer("model"), accessgetdvrcp2.IconCompatParcelizer("hardware"), accessgetdvrcp2.IconCompatParcelizer("device"), accessgetdvrcp2.IconCompatParcelizer("product"), accessgetdvrcp2.IconCompatParcelizer("os-uild"), accessgetdvrcp2.IconCompatParcelizer("manufacturer"), accessgetdvrcp2.IconCompatParcelizer(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT), accessgetdvrcp2.IconCompatParcelizer("locale"), accessgetdvrcp2.IconCompatParcelizer(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY), accessgetdvrcp2.IconCompatParcelizer("mcc_mnc"), accessgetdvrcp2.IconCompatParcelizer("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        accessgetDvrcp accessgetdvrcp3 = (accessgetDvrcp) it4.next();
                        accessgetF1cp accessgetf1cp = accessgetdvrcp3.RemoteActionCompatParcelizer;
                        Iterator it5 = it4;
                        accessgetButton10cp accessgetbutton10cp2 = accessgetf1cp.write;
                        byte[] bArr2 = accessgetf1cp.IconCompatParcelizer;
                        if (accessgetbutton10cp2.equals(new accessgetButton10cp(str4))) {
                            accessgetbuttonthumbrightcp = new accessgetButtonThumbRightcp();
                            accessgetbuttonthumbrightcp.RatingCompat = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (accessgetbutton10cp2.equals(new accessgetButton10cp("json"))) {
                                String str6 = new String(bArr2, Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                accessgetButtonThumbRightcp accessgetbuttonthumbrightcp2 = new accessgetButtonThumbRightcp();
                                accessgetbuttonthumbrightcp2.MediaSessionCompatQueueItem = str6;
                                accessgetbuttonthumbrightcp = accessgetbuttonthumbrightcp2;
                            } else {
                                sQLiteEventStore2 = sQLiteEventStore2;
                                String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat2, 5)) {
                                    SentryLogcatAdapter.IconCompatParcelizer(strConcat2, "Received event of unsupported encoding " + accessgetbutton10cp2 + ". Skipping...");
                                }
                            }
                            it4 = it5;
                            str4 = str3;
                            sQLiteEventStore2 = sQLiteEventStore2;
                        }
                        byte[] bArr3 = accessgetdvrcp3.MediaBrowserCompatMediaItem;
                        accessgetbuttonthumbrightcp.read = Long.valueOf(accessgetdvrcp3.write);
                        accessgetbuttonthumbrightcp.RemoteActionCompatParcelizer = Long.valueOf(accessgetdvrcp3.MediaMetadataCompat);
                        String str7 = (String) accessgetdvrcp3.IconCompatParcelizer.get("tz-offset");
                        accessgetbuttonthumbrightcp.MediaMetadataCompat = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        accessgetbuttonthumbrightcp.MediaBrowserCompatMediaItem = new accessgetCalculatorcp(accessgetDeletecp.forNumber(accessgetdvrcp3.write("net-type")), accessgetDirectionDowncp.forNumber(accessgetdvrcp3.write("mobile-subtype")));
                        Integer num = accessgetdvrcp3.read;
                        if (num != null) {
                            accessgetbuttonthumbrightcp.write = num;
                        }
                        Integer num2 = accessgetdvrcp3.MediaSessionCompatQueueItem;
                        if (num2 != null) {
                            accessgetButtonBcp accessgetbuttonbcp = new accessgetButtonBcp();
                            accessgetButtonXcp accessgetbuttonxcp = new accessgetButtonXcp();
                            accessgetButtonStartcp accessgetbuttonstartcp = new accessgetButtonStartcp();
                            accessgetbuttonstartcp.write(num2);
                            accessgetbuttonxcp.read(accessgetbuttonstartcp.RemoteActionCompatParcelizer());
                            accessgetbuttonbcp.write(accessgetbuttonxcp.read());
                            accessgetbuttonbcp.serializer(accessgetContactscp.EVENT_OVERRIDE);
                            accessgetbuttonthumbrightcp.IconCompatParcelizer = accessgetbuttonbcp.IconCompatParcelizer();
                        }
                        byte[] bArr4 = accessgetdvrcp3.serializer;
                        if (bArr4 == null) {
                            int i13 = MediaBrowserCompatMediaItem + 115;
                            ParcelableVolumeInfo = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i13 % 2 == 0) {
                                int i14 = 4 / 0;
                                if (bArr3 != null) {
                                }
                            } else if (bArr3 != null) {
                            }
                            if (accessgetbuttonthumbrightcp.read == null) {
                                strConcat = " eventTimeMs";
                            } else {
                                strConcat = "";
                            }
                            if (accessgetbuttonthumbrightcp.RemoteActionCompatParcelizer == null) {
                                int i15 = MediaBrowserCompatMediaItem + 67;
                                ParcelableVolumeInfo = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                                strConcat = strConcat.concat(" eventUptimeMs");
                            }
                            if (accessgetbuttonthumbrightcp.MediaMetadataCompat == null) {
                                int i17 = MediaBrowserCompatMediaItem + 125;
                                ParcelableVolumeInfo = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                strConcat = strConcat.concat(" timezoneOffsetSeconds");
                            }
                            if (strConcat.isEmpty()) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                                return;
                            }
                            arrayList4.add(new accessgetCcp(accessgetbuttonthumbrightcp.read.longValue(), accessgetbuttonthumbrightcp.write, accessgetbuttonthumbrightcp.IconCompatParcelizer, accessgetbuttonthumbrightcp.RemoteActionCompatParcelizer.longValue(), accessgetbuttonthumbrightcp.RatingCompat, accessgetbuttonthumbrightcp.MediaSessionCompatQueueItem, accessgetbuttonthumbrightcp.MediaMetadataCompat.longValue(), accessgetbuttonthumbrightcp.MediaBrowserCompatMediaItem, accessgetbuttonthumbrightcp.serializer));
                            it4 = it5;
                            str4 = str3;
                            sQLiteEventStore2 = sQLiteEventStore2;
                        }
                        accessgetButtonR2cp accessgetbuttonr2cp = new accessgetButtonR2cp();
                        if (bArr4 != null) {
                            accessgetbuttonr2cp.serializer(bArr4);
                        }
                        if (bArr3 != null) {
                            accessgetbuttonr2cp.read(bArr3);
                        }
                        accessgetbuttonthumbrightcp.serializer = accessgetbuttonr2cp.write();
                        if (accessgetbuttonthumbrightcp.read == null) {
                            strConcat = " eventTimeMs";
                        } else {
                            strConcat = "";
                        }
                        if (accessgetbuttonthumbrightcp.RemoteActionCompatParcelizer == null) {
                            int i19 = MediaBrowserCompatMediaItem + 67;
                            ParcelableVolumeInfo = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i110 = i19 % 2;
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (accessgetbuttonthumbrightcp.MediaMetadataCompat == null) {
                            int i111 = MediaBrowserCompatMediaItem + 125;
                            ParcelableVolumeInfo = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (strConcat.isEmpty()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                            return;
                        }
                        arrayList4.add(new accessgetCcp(accessgetbuttonthumbrightcp.read.longValue(), accessgetbuttonthumbrightcp.write, accessgetbuttonthumbrightcp.IconCompatParcelizer, accessgetbuttonthumbrightcp.RemoteActionCompatParcelizer.longValue(), accessgetbuttonthumbrightcp.RatingCompat, accessgetbuttonthumbrightcp.MediaSessionCompatQueueItem, accessgetbuttonthumbrightcp.MediaMetadataCompat.longValue(), accessgetbuttonthumbrightcp.MediaBrowserCompatMediaItem, accessgetbuttonthumbrightcp.serializer));
                        it4 = it5;
                        str4 = str3;
                        sQLiteEventStore2 = sQLiteEventStore2;
                    }
                    arrayList3.add(new accessgetButtonZcp(jIconCompatParcelizer, jIconCompatParcelizer2, accessgetbuttonl1cp, numValueOf, str2, arrayList4, accessgetdirectioncentercp));
                    accessgetforwardcpIconCompatParcelizer = accessgetforwardcp2;
                    it2 = it3;
                    str4 = str4;
                    i9 = 0;
                }
                accessgetforwardcp = accessgetforwardcpIconCompatParcelizer;
                sQLiteEventStore = sQLiteEventStore2;
                accessgetButtonL2cp accessgetbuttonl2cp = new accessgetButtonL2cp(arrayList3);
                URL urlWrite = accessgetbutton13cp.IconCompatParcelizer;
                if (bArr != null) {
                    try {
                        accessgetButton11cp accessgetbutton11cpWrite = accessgetButton11cp.write(bArr);
                        str = accessgetbutton11cpWrite.read;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = accessgetbutton11cpWrite.MediaSessionCompatQueueItem;
                        if (str8 != null) {
                            urlWrite = accessgetButton13cp.write(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        accessgetf4cp = new accessgetF4cp(accessgetF7cp.FATAL_ERROR, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i20 = 17;
                    androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(urlWrite, accessgetbuttonl2cp, str, i20);
                    OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(18, accessgetbutton13cp);
                    int i21 = 5;
                    do {
                        isendboundaryIconCompatParcelizer = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer(emojiProcessor);
                        URL url = (URL) isendboundaryIconCompatParcelizer.write;
                        if (url != null) {
                            RangesKt.serializer(url, "CctTransportBackend", "Following redirect to: %s");
                            emojiProcessor = new androidx.emoji2.text.EmojiProcessor(url, (accessgetButtonL2cp) emojiProcessor.read, (String) emojiProcessor.IconCompatParcelizer, i20);
                        } else {
                            emojiProcessor = null;
                        }
                        if (emojiProcessor == null) {
                            break;
                        } else {
                            i21--;
                        }
                    } while (i21 >= 1);
                    int i22 = isendboundaryIconCompatParcelizer.IconCompatParcelizer;
                    if (i22 == 200) {
                        accessgetf4cp = new accessgetF4cp(accessgetF7cp.OK, isendboundaryIconCompatParcelizer.read);
                    } else if (i22 < 500) {
                        int i23 = ParcelableVolumeInfo + 57;
                        MediaBrowserCompatMediaItem = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        if (i22 == 404) {
                            accessgetf4cp = new accessgetF4cp(accessgetF7cp.TRANSIENT_ERROR, -1L);
                        } else {
                            accessgetf4cp = i22 == 400 ? new accessgetF4cp(accessgetF7cp.INVALID_PAYLOAD, -1L) : new accessgetF4cp(accessgetF7cp.FATAL_ERROR, -1L);
                        }
                    } else {
                        accessgetf4cp = new accessgetF4cp(accessgetF7cp.TRANSIENT_ERROR, -1L);
                    }
                } catch (IOException e) {
                    RangesKt.serializer("CctTransportBackend", "Could not make request to the backend", e);
                    accessgetf4cp = new accessgetF4cp(accessgetF7cp.TRANSIENT_ERROR, -1L);
                }
            }
            accessgetF7cp accessgetf7cp = accessgetF7cp.TRANSIENT_ERROR;
            accessgetF7cp accessgetf7cp2 = accessgetf4cp.serializer;
            if (accessgetf7cp2 == accessgetf7cp) {
                sQLiteEventStore.serializer(new LookaheadCapablePlaceableResettableRulerScope(this, iterable, accessgeteightcp, jMax));
                ((androidx.emoji2.text.EmojiProcessor) this.MediaDescriptionCompat).IconCompatParcelizer(accessgeteightcp, i + 1, true);
                return;
            }
            SQLiteEventStore sQLiteEventStore4 = sQLiteEventStore;
            sQLiteEventStore4.serializer(new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, 2, iterable));
            if (accessgetf7cp2 == accessgetF7cp.OK) {
                jMax = Math.max(jMax, accessgetf4cp.write);
                if (bArr != null) {
                    sQLiteEventStore4.serializer(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(20, this));
                    int i25 = MediaBrowserCompatMediaItem + 43;
                    ParcelableVolumeInfo = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i2 = 2;
                    int i26 = i25 % 2;
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 2;
                if (accessgetf7cp2 == accessgetF7cp.INVALID_PAYLOAD) {
                    HashMap map2 = new HashMap();
                    Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        String str9 = ((accessgetMannerModecp) it6.next()).write.RatingCompat;
                        if (map2.containsKey(str9)) {
                            map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                        } else {
                            map2.put(str9, 1);
                        }
                    }
                    sQLiteEventStore4.serializer(new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, 3, map2));
                }
            }
            sQLiteEventStore2 = sQLiteEventStore4;
            access500Var = this;
            accessgeteightcp2 = accessgeteightcp;
            i3 = i2;
            accessgetforwardcpIconCompatParcelizer = accessgetforwardcp;
        }
    }
}
