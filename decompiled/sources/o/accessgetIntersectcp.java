package o;

import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import com.deliveryhero.perseus.PerseusApp;
import com.deliveryhero.perseus.logger.DatabaseInfoLogger;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.util.UrlUtils;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import okio.Okio;
import okio.Options;
import org.joda.time.DateTime;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetIntersectcp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ accessgetIntersectcp(int i) {
        this.serializer = i;
    }

    private final Object read(Object obj) {
        int i = 2 % 2;
        int i2 = read + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidx.datastore.core.CorruptionException corruptionException = (androidx.datastore.core.CorruptionException) obj;
        corruptionException.getClass();
        SentryLogcatAdapter.write("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException);
        accessscheduleScrollEventIfNeeded accessschedulescrolleventifneeded = SessionConfigsSerializer.IconCompatParcelizer;
        int i4 = IconCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return accessschedulescrolleventifneeded;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final Object serializer(Object obj) {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Throwable) obj, "Getting push token in push view model.", new Object[0]);
        } else {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Throwable) obj, "Getting push token in push view model.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    private final Object write(Object obj) {
        int i = 2 % 2;
        int i2 = read + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Throwable th = (Throwable) obj;
            th.getClass();
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Sending backlog queue status failed: ", th);
            return createFromParcel.INSTANCE;
        }
        Throwable th2 = (Throwable) obj;
        th2.getClass();
        getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Sending backlog queue status failed: ", th2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final Object RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        String str = (String) obj;
        str.getClass();
        Trace traceIconCompatParcelizer = Trace.IconCompatParcelizer(str);
        getAllSemanticsNodesdefault getallsemanticsnodesdefault = new getAllSemanticsNodesdefault(traceIconCompatParcelizer);
        traceIconCompatParcelizer.start();
        int i2 = read + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
        return getallsemanticsnodesdefault;
    }

    private final Object IconCompatParcelizer(Object obj) throws Exception {
        int i = 2 % 2;
        tintxETnrds tintxetnrds = (tintxETnrds) obj;
        tintxetnrds.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT COUNT(1) as totalEventCount, priority, eventAction FROM tracking_perseus_events group by eventAction, priority");
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = read + 69;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                arrayList.add(new horizontalLineToRelative(uncheckedColordefaultRemoteActionCompatParcelizer.read(2), (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(0), (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(1)));
            }
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
            int i4 = read + 37;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } catch (Throwable th) {
            uncheckedColordefaultRemoteActionCompatParcelizer.close();
            throw th;
        }
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        boolean z;
        long jSerializer;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int iSerializer = 0;
        switch (i2) {
            case 0:
                UncheckedColordefault uncheckedColordefault = (UncheckedColordefault) obj;
                uncheckedColordefault.getClass();
                return Boolean.valueOf(uncheckedColordefault.IconCompatParcelizer());
            case 1:
                return androidx.compose.ui.text.SaversKt.VerbatimTtsAnnotationSaver$lambda$1(obj);
            case 2:
                return androidx.compose.ui.text.SaversKt.UrlAnnotationSaver$lambda$1(obj);
            case 3:
                return androidx.compose.ui.text.SaversKt.ParagraphStyleSaver$lambda$1(obj);
            case 4:
                return androidx.compose.ui.text.SaversKt.SpanStyleSaver$lambda$1(obj);
            case 5:
                return androidx.compose.ui.text.input.TextFieldValue.Saver$lambda$1(obj);
            case 6:
                UncheckedColordefault uncheckedColordefault2 = (UncheckedColordefault) obj;
                uncheckedColordefault2.getClass();
                CaptionedImageContentCardView captionedImageContentCardView = new CaptionedImageContentCardView();
                while (uncheckedColordefault2.IconCompatParcelizer()) {
                    captionedImageContentCardView.add(Integer.valueOf((int) uncheckedColordefault2.serializer(0)));
                }
                return RangesKt.IconCompatParcelizer(captionedImageContentCardView);
            case 7:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        arrayList.add(uncheckedColordefaultRemoteActionCompatParcelizer.read(0));
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    return arrayList;
                } catch (Throwable th) {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    throw th;
                }
            case 8:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("DELETE FROM WorkProgress");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                }
            case 9:
                tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                tintxetnrds3.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer3 = tintxetnrds3.RemoteActionCompatParcelizer("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer();
                    return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds3})).intValue());
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.close();
                }
            case 10:
                tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                tintxetnrds4.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer4 = tintxetnrds4.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "id");
                    int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "state");
                    int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "worker_class_name");
                    int iWrite4 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "input_merger_class_name");
                    int iWrite5 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "input");
                    int iWrite6 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "output");
                    int iWrite7 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "initial_delay");
                    int iWrite8 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "interval_duration");
                    int iWrite9 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "flex_duration");
                    int iWrite10 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "run_attempt_count");
                    int iWrite11 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "backoff_policy");
                    int iWrite12 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "backoff_delay_duration");
                    int iWrite13 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "last_enqueue_time");
                    int iWrite14 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "minimum_retention_duration");
                    int iWrite15 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "schedule_requested_at");
                    int iWrite16 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "run_in_foreground");
                    int iWrite17 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "out_of_quota_policy");
                    int iWrite18 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "period_count");
                    int iWrite19 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "generation");
                    int iWrite20 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "next_schedule_time_override");
                    int iWrite21 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "next_schedule_time_override_generation");
                    int iWrite22 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "stop_reason");
                    int iWrite23 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "trace_tag");
                    int iWrite24 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "backoff_on_system_interruptions");
                    int iWrite25 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "required_network_type");
                    int iWrite26 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "required_network_request");
                    int iWrite27 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "requires_charging");
                    int iWrite28 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "requires_device_idle");
                    int iWrite29 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "requires_battery_not_low");
                    int iWrite30 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "requires_storage_not_low");
                    int iWrite31 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "trigger_content_update_delay");
                    int iWrite32 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "trigger_max_content_delay");
                    int iWrite33 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer4, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer4.IconCompatParcelizer()) {
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer4.read(iWrite);
                        int i3 = iWrite14;
                        int i4 = iWrite13;
                        setTranslationX settranslationxWrite = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite2));
                        String str3 = uncheckedColordefaultRemoteActionCompatParcelizer4.read(iWrite3);
                        String str4 = uncheckedColordefaultRemoteActionCompatParcelizer4.read(iWrite4);
                        byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer4.write(iWrite5);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd3 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer4.write(iWrite6)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite7);
                        long jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite8);
                        long jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite9);
                        int iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite10);
                        int i5 = iWrite5;
                        int i6 = iWrite4;
                        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite11));
                        long jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite12);
                        long jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i4);
                        long jSerializer7 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i3);
                        int i7 = iWrite15;
                        long jSerializer8 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i7);
                        iWrite15 = i7;
                        int i8 = iWrite3;
                        int i9 = iWrite16;
                        int i10 = iWrite;
                        boolean z2 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i9)) != 0;
                        int i11 = IconCompatParcelizer + 109;
                        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        int i13 = iWrite17;
                        setRotationZ setrotationzSerializer = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i13));
                        int i14 = iWrite18;
                        int iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i14);
                        int i15 = iWrite19;
                        int iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i15);
                        int i16 = iWrite20;
                        long jSerializer9 = uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i16);
                        iWrite20 = i16;
                        int i17 = iWrite21;
                        int i18 = iWrite2;
                        int iSerializer5 = (int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i17);
                        int i19 = iWrite22;
                        int i20 = iWrite12;
                        int iSerializer6 = (int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i19);
                        int i21 = iWrite23;
                        if (uncheckedColordefaultRemoteActionCompatParcelizer4.MediaSessionCompatQueueItem(i21)) {
                            int i22 = read + 53;
                            IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i22 % 2 != 0) {
                                throw null;
                            }
                            str = null;
                        } else {
                            str = uncheckedColordefaultRemoteActionCompatParcelizer4.read(i21);
                        }
                        Integer numValueOf = uncheckedColordefaultRemoteActionCompatParcelizer4.MediaSessionCompatQueueItem(iWrite24) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite24));
                        if (numValueOf != null) {
                            int i23 = read + 23;
                            IconCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i23 % 2 != 0) {
                                numValueOf.intValue();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite25));
                        int i24 = iWrite26;
                        drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer4.write(i24));
                        int i25 = iWrite11;
                        int i26 = iWrite27;
                        boolean z3 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i26)) != 0;
                        int i27 = read + 5;
                        IconCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i27 % 2 != 0) {
                            uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite28);
                            throw null;
                        }
                        iWrite27 = i26;
                        int i28 = iWrite28;
                        boolean z4 = !(((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i28)) == 0);
                        int i29 = read + 65;
                        IconCompatParcelizer = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i29 % 2 != 0) {
                            Object obj3 = null;
                            uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite29);
                            obj3.hashCode();
                            throw null;
                        }
                        int i30 = iWrite10;
                        int i31 = iWrite29;
                        boolean z5 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i31)) != 0;
                        int i32 = IconCompatParcelizer + 1;
                        read = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i32 % 2 == 0) {
                            uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite30);
                            throw null;
                        }
                        int i33 = iWrite9;
                        int i34 = iWrite30;
                        int i35 = iWrite32;
                        int i36 = iWrite33;
                        iWrite33 = i36;
                        arrayList2.add(new setFrom58bKbWc(str2, settranslationxWrite, str3, str4, accessgetambientshadowcolor0d7_kjujd2, accessgetambientshadowcolor0d7_kjujd3, jSerializer2, jSerializer3, jSerializer4, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer, setcompositingstrategyadbojceRemoteActionCompatParcelizer, z3, z4, z5, ((int) uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i34)) != 0, uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(iWrite31), uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(i35), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer4.write(i36))), iSerializer2, graphicsLayerScopeIconCompatParcelizer, jSerializer5, jSerializer6, jSerializer7, jSerializer8, z2, setrotationzSerializer, iSerializer3, iSerializer4, jSerializer9, iSerializer5, iSerializer6, str, boolValueOf));
                        iWrite29 = i31;
                        iWrite31 = iWrite31;
                        iWrite32 = i35;
                        iWrite9 = i33;
                        iWrite = i10;
                        iWrite14 = i3;
                        iWrite18 = i14;
                        iWrite2 = i18;
                        iWrite13 = i4;
                        iWrite3 = i8;
                        iWrite5 = i5;
                        iWrite19 = i15;
                        iWrite4 = i6;
                        iWrite21 = i17;
                        iWrite10 = i30;
                        iWrite16 = i9;
                        iWrite6 = iWrite6;
                        iWrite17 = i13;
                        iWrite24 = iWrite24;
                        iWrite28 = i28;
                        iWrite12 = i20;
                        iWrite22 = i19;
                        iWrite23 = i21;
                        iWrite26 = i24;
                        iWrite30 = i34;
                        iWrite11 = i25;
                        iWrite25 = iWrite25;
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer4.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.close();
                    throw th2;
                }
            case 11:
                tintxETnrds tintxetnrds5 = (tintxETnrds) obj;
                tintxetnrds5.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer5 = tintxetnrds5.RemoteActionCompatParcelizer("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    return Boolean.valueOf(uncheckedColordefaultRemoteActionCompatParcelizer5.IconCompatParcelizer() && ((int) uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(0)) != 0);
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer5.close();
                }
            case 12:
                tintxETnrds tintxetnrds6 = (tintxETnrds) obj;
                tintxetnrds6.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer6 = tintxetnrds6.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer6.RemoteActionCompatParcelizer(1, 200L);
                    int iWrite34 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "id");
                    int iWrite35 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "state");
                    int iWrite36 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "worker_class_name");
                    int iWrite37 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "input_merger_class_name");
                    int iWrite38 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "input");
                    int iWrite39 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "output");
                    int iWrite40 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "initial_delay");
                    int iWrite41 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "interval_duration");
                    int iWrite42 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "flex_duration");
                    int iWrite43 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "run_attempt_count");
                    int iWrite44 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "backoff_policy");
                    int iWrite45 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "backoff_delay_duration");
                    int iWrite46 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "last_enqueue_time");
                    int iWrite47 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "minimum_retention_duration");
                    int iWrite48 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "schedule_requested_at");
                    int iWrite49 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "run_in_foreground");
                    int iWrite50 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "out_of_quota_policy");
                    int iWrite51 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "period_count");
                    int iWrite52 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "generation");
                    int iWrite53 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "next_schedule_time_override");
                    int iWrite54 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "next_schedule_time_override_generation");
                    int iWrite55 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "stop_reason");
                    int iWrite56 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "trace_tag");
                    int iWrite57 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "backoff_on_system_interruptions");
                    int iWrite58 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "required_network_type");
                    int iWrite59 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "required_network_request");
                    int iWrite60 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "requires_charging");
                    int iWrite61 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "requires_device_idle");
                    int iWrite62 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "requires_battery_not_low");
                    int iWrite63 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "requires_storage_not_low");
                    int iWrite64 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "trigger_content_update_delay");
                    int iWrite65 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "trigger_max_content_delay");
                    int iWrite66 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer6, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer6.IconCompatParcelizer()) {
                        String str5 = uncheckedColordefaultRemoteActionCompatParcelizer6.read(iWrite34);
                        int i37 = iWrite47;
                        ArrayList arrayList4 = arrayList3;
                        setTranslationX settranslationxWrite2 = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite35));
                        String str6 = uncheckedColordefaultRemoteActionCompatParcelizer6.read(iWrite36);
                        String str7 = uncheckedColordefaultRemoteActionCompatParcelizer6.read(iWrite37);
                        byte[] bArrWrite2 = uncheckedColordefaultRemoteActionCompatParcelizer6.write(iWrite38);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd4 = accessgetAmbientShadowColor0d7_KjUjd.write;
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd5 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite2}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd6 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer6.write(iWrite39)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        long jSerializer10 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite40);
                        long jSerializer11 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite41);
                        long jSerializer12 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite42);
                        int iSerializer7 = (int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite43);
                        int i38 = iWrite38;
                        int i39 = iWrite37;
                        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer2 = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite44));
                        long jSerializer13 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite45);
                        long jSerializer14 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite46);
                        long jSerializer15 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i37);
                        int i40 = iWrite48;
                        long jSerializer16 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i40);
                        iWrite48 = i40;
                        int i41 = iWrite49;
                        boolean z6 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i41)) != 0;
                        int i42 = iWrite34;
                        setRotationZ setrotationzSerializer2 = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite50));
                        int i43 = iWrite51;
                        int iSerializer8 = (int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i43);
                        int i44 = iWrite50;
                        int i45 = iWrite52;
                        int iSerializer9 = (int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i45);
                        int i46 = iWrite53;
                        long jSerializer17 = uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i46);
                        iWrite53 = i46;
                        int i47 = iWrite54;
                        int i48 = iWrite35;
                        int iSerializer10 = (int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i47);
                        int i49 = iWrite40;
                        int i50 = iWrite55;
                        int i51 = iWrite39;
                        int iSerializer11 = (int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i50);
                        int i52 = iWrite56;
                        String str8 = uncheckedColordefaultRemoteActionCompatParcelizer6.MediaSessionCompatQueueItem(i52) ? null : uncheckedColordefaultRemoteActionCompatParcelizer6.read(i52);
                        int i53 = read + 67;
                        IconCompatParcelizer = i53 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i54 = i53 % 2;
                        int i55 = iWrite57;
                        Integer numValueOf2 = uncheckedColordefaultRemoteActionCompatParcelizer6.MediaSessionCompatQueueItem(i55) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i55));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i56 = iWrite45;
                        setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer2 = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite58));
                        int i57 = iWrite59;
                        drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer2 = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer6.write(i57));
                        int i58 = iWrite58;
                        int i59 = iWrite60;
                        int i60 = iWrite44;
                        int i61 = iWrite62;
                        int i62 = iWrite65;
                        int i63 = iWrite66;
                        iWrite66 = i63;
                        arrayList4.add(new setFrom58bKbWc(str5, settranslationxWrite2, str6, str7, accessgetambientshadowcolor0d7_kjujd5, accessgetambientshadowcolor0d7_kjujd6, jSerializer10, jSerializer11, jSerializer12, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer2, setcompositingstrategyadbojceRemoteActionCompatParcelizer2, ((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i59)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite61)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite62)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite63)) != 0, uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(iWrite64), uncheckedColordefaultRemoteActionCompatParcelizer6.serializer(i62), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer6.write(i63))), iSerializer7, graphicsLayerScopeIconCompatParcelizer2, jSerializer13, jSerializer14, jSerializer15, jSerializer16, z6, setrotationzSerializer2, iSerializer8, iSerializer9, jSerializer17, iSerializer10, iSerializer11, str8, boolValueOf2));
                        iWrite65 = i62;
                        iWrite34 = i42;
                        iWrite36 = iWrite36;
                        iWrite50 = i44;
                        iWrite51 = i43;
                        iWrite39 = i51;
                        iWrite55 = i50;
                        iWrite56 = i52;
                        iWrite57 = i55;
                        iWrite47 = i37;
                        iWrite37 = i39;
                        iWrite52 = i45;
                        iWrite41 = iWrite41;
                        iWrite64 = iWrite64;
                        iWrite49 = i41;
                        iWrite35 = i48;
                        iWrite40 = i49;
                        iWrite54 = i47;
                        arrayList3 = arrayList4;
                        iWrite38 = i38;
                        iWrite63 = iWrite63;
                        iWrite45 = i56;
                        iWrite58 = i58;
                        iWrite59 = i57;
                        iWrite60 = i59;
                        iWrite61 = iWrite61;
                        iWrite44 = i60;
                        iWrite62 = i61;
                        break;
                    }
                    return arrayList3;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer6.close();
                }
            case 13:
                tintxETnrds tintxetnrds7 = (tintxETnrds) obj;
                tintxetnrds7.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer7 = tintxetnrds7.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE state=1");
                try {
                    int iWrite67 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "id");
                    int iWrite68 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "state");
                    int iWrite69 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "worker_class_name");
                    int iWrite70 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "input_merger_class_name");
                    int iWrite71 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "input");
                    int iWrite72 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "output");
                    int iWrite73 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "initial_delay");
                    int iWrite74 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "interval_duration");
                    int iWrite75 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "flex_duration");
                    int iWrite76 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "run_attempt_count");
                    int iWrite77 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "backoff_policy");
                    int iWrite78 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "backoff_delay_duration");
                    int iWrite79 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "last_enqueue_time");
                    int iWrite80 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "minimum_retention_duration");
                    int iWrite81 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "schedule_requested_at");
                    int iWrite82 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "run_in_foreground");
                    int iWrite83 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "out_of_quota_policy");
                    int iWrite84 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "period_count");
                    int iWrite85 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "generation");
                    int iWrite86 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "next_schedule_time_override");
                    int iWrite87 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "next_schedule_time_override_generation");
                    int iWrite88 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "stop_reason");
                    int iWrite89 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "trace_tag");
                    int iWrite90 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "backoff_on_system_interruptions");
                    int iWrite91 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "required_network_type");
                    int iWrite92 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "required_network_request");
                    int iWrite93 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_charging");
                    int iWrite94 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_device_idle");
                    int iWrite95 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_battery_not_low");
                    int iWrite96 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_storage_not_low");
                    int iWrite97 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "trigger_content_update_delay");
                    int iWrite98 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "trigger_max_content_delay");
                    int iWrite99 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "content_uri_triggers");
                    ArrayList arrayList5 = new ArrayList();
                    while (!(!uncheckedColordefaultRemoteActionCompatParcelizer7.IconCompatParcelizer())) {
                        String str9 = uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite67);
                        ArrayList arrayList6 = arrayList5;
                        int i64 = iWrite79;
                        setTranslationX settranslationxWrite3 = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite68));
                        String str10 = uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite69);
                        String str11 = uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite70);
                        byte[] bArrWrite3 = uncheckedColordefaultRemoteActionCompatParcelizer7.write(iWrite71);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd7 = accessgetAmbientShadowColor0d7_KjUjd.write;
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd8 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite3}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd9 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer7.write(iWrite72)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        long jSerializer18 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite73);
                        long jSerializer19 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite74);
                        long jSerializer20 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite75);
                        int iSerializer12 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite76);
                        int i65 = iWrite71;
                        int i66 = iWrite70;
                        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer3 = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite77));
                        long jSerializer21 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite78);
                        long jSerializer22 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i64);
                        long jSerializer23 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite80);
                        int i67 = iWrite81;
                        long jSerializer24 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i67);
                        iWrite81 = i67;
                        int i68 = iWrite82;
                        boolean z7 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i68)) != 0;
                        int i69 = iWrite67;
                        setRotationZ setrotationzSerializer3 = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite83));
                        int i70 = iWrite84;
                        int iSerializer13 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i70);
                        int i71 = iWrite83;
                        int i72 = iWrite85;
                        int iSerializer14 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i72);
                        int i73 = iWrite86;
                        long jSerializer25 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i73);
                        iWrite86 = i73;
                        int i74 = iWrite87;
                        int i75 = iWrite68;
                        int iSerializer15 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i74);
                        int i76 = iWrite88;
                        int i77 = iWrite78;
                        int iSerializer16 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i76);
                        int i78 = iWrite89;
                        String str12 = uncheckedColordefaultRemoteActionCompatParcelizer7.MediaSessionCompatQueueItem(i78) ? null : uncheckedColordefaultRemoteActionCompatParcelizer7.read(i78);
                        Integer numValueOf3 = uncheckedColordefaultRemoteActionCompatParcelizer7.MediaSessionCompatQueueItem(iWrite90) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite90));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i79 = IconCompatParcelizer + 41;
                        read = i79 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i80 = i79 % 2;
                        int i81 = iWrite77;
                        int i82 = iWrite91;
                        setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer3 = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i82));
                        int i83 = iWrite92;
                        drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer3 = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer7.write(i83));
                        int i84 = iWrite93;
                        boolean z8 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i84)) != 0;
                        boolean z9 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite94)) != 0;
                        boolean z10 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite95)) != 0;
                        int i85 = iWrite94;
                        if (((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite96)) != 0) {
                            int i86 = IconCompatParcelizer + 37;
                            read = i86 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i87 = i86 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        int i88 = iWrite98;
                        int i89 = iWrite90;
                        int i90 = iWrite99;
                        iWrite99 = i90;
                        arrayList6.add(new setFrom58bKbWc(str9, settranslationxWrite3, str10, str11, accessgetambientshadowcolor0d7_kjujd8, accessgetambientshadowcolor0d7_kjujd9, jSerializer18, jSerializer19, jSerializer20, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer3, setcompositingstrategyadbojceRemoteActionCompatParcelizer3, z8, z9, z10, z, uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite97), uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(i88), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer7.write(i90))), iSerializer12, graphicsLayerScopeIconCompatParcelizer3, jSerializer21, jSerializer22, jSerializer23, jSerializer24, z7, setrotationzSerializer3, iSerializer13, iSerializer14, jSerializer25, iSerializer15, iSerializer16, str12, boolValueOf3));
                        arrayList5 = arrayList6;
                        iWrite98 = i88;
                        iWrite67 = i69;
                        iWrite69 = iWrite69;
                        iWrite83 = i71;
                        iWrite84 = i70;
                        iWrite77 = i81;
                        iWrite93 = i84;
                        iWrite94 = i85;
                        iWrite79 = i64;
                        iWrite70 = i66;
                        iWrite71 = i65;
                        iWrite85 = i72;
                        iWrite82 = i68;
                        iWrite96 = iWrite96;
                        iWrite68 = i75;
                        iWrite87 = i74;
                        iWrite89 = i78;
                        iWrite91 = i82;
                        iWrite92 = i83;
                        iWrite95 = iWrite95;
                        iWrite72 = iWrite72;
                        iWrite90 = i89;
                        iWrite97 = iWrite97;
                        iWrite78 = i77;
                        iWrite88 = i76;
                    }
                    return arrayList5;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer7.close();
                }
            case 14:
                return (dashPathEffectdefault) obj;
            case 15:
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                prepareInAppMessageWithZippedAssetHtmllambda3 prepareinappmessagewithzippedassethtmllambda3 = new prepareInAppMessageWithZippedAssetHtmllambda3();
                prepareInAppMessageWithZippedAssetHtmllambda3.read(prepareinappmessagewithzippedassethtmllambda3, displayInAppMessagelambda1.serializer(Calendar.class), new prepareInAppMessageWithHtmllambda0(new accesssetOldDependencyp(0)));
                prepareInAppMessageWithZippedAssetHtmllambda3.read(prepareinappmessagewithzippedassethtmllambda3, displayInAppMessagelambda1.serializer(DateTime.class), new prepareInAppMessageWithHtmllambda0(new accesssetOldDependencyp(1)));
                prepareInAppMessageWithZippedAssetHtmllambda3.read(prepareinappmessagewithzippedassethtmllambda3, displayInAppMessagelambda1.serializer(ZonedDateTime.class), new prepareInAppMessageWithHtmllambda0(new getOffscreenke2Ky5w(0)));
                ontouch.PlaybackStateCompat = prepareinappmessagewithzippedassethtmllambda3.RemoteActionCompatParcelizer();
                return createfromparcel;
            case 16:
                LinkedHashSet linkedHashSet = PerseusApp.write;
                return createfromparcel;
            case 17:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("issue happened when persisting configuration", th3);
                return createfromparcel;
            case 18:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("issue happened when persisting batch dispatch hits delay", th4);
                return createfromparcel;
            case 19:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Failed to persist client id", th5);
                return createfromparcel;
            case 20:
                tintxETnrds tintxetnrds8 = (tintxETnrds) obj;
                tintxetnrds8.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer8 = tintxetnrds8.RemoteActionCompatParcelizer("SELECT COUNT(payloadTimeStamp) FROM tracking_perseus_events");
                try {
                    if (uncheckedColordefaultRemoteActionCompatParcelizer8.IconCompatParcelizer()) {
                        int i91 = read + 57;
                        IconCompatParcelizer = i91 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i92 = i91 % 2;
                        iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer8.serializer(0);
                    }
                    return Integer.valueOf(iSerializer);
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer8.close();
                }
            case 21:
                return IconCompatParcelizer(obj);
            case 22:
                tintxETnrds tintxetnrds9 = (tintxETnrds) obj;
                tintxetnrds9.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer9 = tintxetnrds9.RemoteActionCompatParcelizer("SELECT timestamp FROM tracking_perseus_events ORDER BY timestamp ASC LIMIT 1");
                try {
                    if (uncheckedColordefaultRemoteActionCompatParcelizer9.IconCompatParcelizer()) {
                        jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer9.serializer(0);
                        break;
                    } else {
                        jSerializer = 0;
                    }
                    return Long.valueOf(jSerializer);
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer9.close();
                }
            case 23:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = getStrokeLineWidth.write;
                return createfromparcel;
            case 24:
                DatabaseInfoLogger databaseInfoLogger = (DatabaseInfoLogger) getPathFillTypeRgk1Os.read.MediaSessionCompatResultReceiverWrapper();
                Calendar calendar = Calendar.getInstance();
                calendar.getClass();
                databaseInfoLogger.getClass();
                BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(UrlUtils.serializer()), null, null, new PausingDispatcherKt$whenStateAtLeast$2(databaseInfoLogger, calendar, (Integer) obj, (ShortNewsContentCardView) null, 6), 3);
                return createfromparcel;
            case 25:
                return write(obj);
            case 26:
                return serializer(obj);
            case 27:
                return read(obj);
            case 28:
                return RemoteActionCompatParcelizer(obj);
            default:
                return LocalAuthDataSource.RemoteActionCompatParcelizer((onTouch) obj);
        }
    }
}
