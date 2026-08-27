package bo.app;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import com.braze.models.Banner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.AlignmentCompanion;
import o.GraphicsLayerScope;
import o.UncheckedColordefault;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.drawOutlinehn5TExg;
import o.getAggregateChildKindSetui;
import o.getAndroidTypeannotations;
import o.getCoroutineScope;
import o.handleUrlOverridelambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCompositingStrategyaDBOjCE;
import o.setEnableExtraAssertions;
import o.setFrom58bKbWc;
import o.setRotationZ;
import o.setTranslationX;
import o.tintxETnrds;
import o.toolingGraphicsLayer;
import okio.Okio;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ k7$$ExternalSyntheticLambda2(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0265  */
    /* JADX WARN: Code duplicated, block: B:64:0x034e A[PHI: r4 r5 r17 r32
  0x034e: PHI (r4v27 int) = (r4v26 int), (r4v39 int) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r5v14 int) = (r5v13 int), (r5v21 int) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r17v1 boolean) = (r17v0 boolean), (r17v4 boolean) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]
  0x034e: PHI (r32v3 int) = (r32v2 int), (r32v7 int) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0352 A[PHI: r4 r5 r17 r32
  0x0352: PHI (r4v38 int) = (r4v26 int), (r4v39 int) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]
  0x0352: PHI (r5v20 int) = (r5v13 int), (r5v21 int) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]
  0x0352: PHI (r17v3 boolean) = (r17v0 boolean), (r17v4 boolean) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]
  0x0352: PHI (r32v6 int) = (r32v2 int), (r32v7 int) binds: [B:63:0x034c, B:58:0x033d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        boolean z;
        Boolean boolValueOf;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        int i5 = 2 % 2;
        int i6 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.f$0;
        switch (i6) {
            case 0:
                return k7.b(j, (rd) obj);
            case 1:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m254getSizeNHjbRc() >> 32)) / 2.0f;
                return cacheDrawScope.onDrawWithContent(new getAndroidTypeannotations(fIntBitsToFloat, AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, fIntBitsToFloat), ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, this.f$0, 0, 2, null)));
            case 2:
                ((SemanticsPropertyReceiver) obj).set(SelectionHandlesKt.read, new getAggregateChildKindSetui(AlignmentCompanion.Cursor, this.f$0, getCoroutineScope.Middle, true));
                return createfromparcel;
            case 3:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, j);
                    int iWrite = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "id");
                    int iWrite2 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "state");
                    int iWrite3 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "worker_class_name");
                    int iWrite4 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "input_merger_class_name");
                    int iWrite5 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "input");
                    int iWrite6 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "output");
                    int iWrite7 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "initial_delay");
                    int iWrite8 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "interval_duration");
                    int iWrite9 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "flex_duration");
                    int iWrite10 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "run_attempt_count");
                    int iWrite11 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "backoff_policy");
                    int iWrite12 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "backoff_delay_duration");
                    int iWrite13 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "last_enqueue_time");
                    int iWrite14 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "minimum_retention_duration");
                    int iWrite15 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "schedule_requested_at");
                    int iWrite16 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "run_in_foreground");
                    int iWrite17 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "out_of_quota_policy");
                    int iWrite18 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "period_count");
                    int iWrite19 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "generation");
                    int iWrite20 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "next_schedule_time_override");
                    int iWrite21 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "next_schedule_time_override_generation");
                    int iWrite22 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "stop_reason");
                    int iWrite23 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "trace_tag");
                    int iWrite24 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "backoff_on_system_interruptions");
                    int iWrite25 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "required_network_type");
                    int iWrite26 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "required_network_request");
                    int iWrite27 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "requires_charging");
                    int iWrite28 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "requires_device_idle");
                    int iWrite29 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "requires_battery_not_low");
                    int iWrite30 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "requires_storage_not_low");
                    int iWrite31 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "trigger_content_update_delay");
                    int iWrite32 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "trigger_max_content_delay");
                    int iWrite33 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (!(!uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer())) {
                        String str = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite);
                        int i7 = iWrite13;
                        ArrayList arrayList2 = arrayList;
                        setTranslationX settranslationxWrite = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite2));
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite3);
                        String str3 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite4);
                        byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer.write(iWrite5);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd3 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer.write(iWrite6)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite7);
                        long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite8);
                        long jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite9);
                        int iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite10);
                        int i8 = iWrite;
                        int i9 = iWrite2;
                        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite11));
                        long jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite12);
                        long jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i7);
                        long jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite14);
                        int i10 = iWrite15;
                        long jSerializer7 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i10);
                        int i11 = iWrite16;
                        if (((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i11)) != 0) {
                            int i12 = read + 113;
                            write = i12 % Fields.SpotShadowColor;
                            if (i12 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        int i13 = iWrite3;
                        setRotationZ setrotationzSerializer = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite17));
                        int i14 = iWrite18;
                        int i15 = iWrite4;
                        int iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i14);
                        int i16 = iWrite19;
                        int i17 = iWrite17;
                        int iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i16);
                        int i18 = iWrite20;
                        long jSerializer8 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i18);
                        int i19 = iWrite21;
                        int i20 = iWrite5;
                        int iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i19);
                        int i21 = iWrite12;
                        int i22 = iWrite22;
                        int i23 = iWrite11;
                        int iSerializer5 = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i22);
                        int i24 = iWrite23;
                        String str4 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(i24) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(i24);
                        Integer numValueOf = !(uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite24) ^ true) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite24));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i25 = read + 51;
                        write = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        int i27 = iWrite14;
                        int i28 = iWrite25;
                        setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i28));
                        int i29 = iWrite26;
                        drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer.write(i29));
                        int i30 = iWrite27;
                        boolean z5 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i30)) != 0;
                        int i31 = write + 113;
                        read = i31 % Fields.SpotShadowColor;
                        if (i31 % 2 == 0) {
                            i = i29;
                            i2 = iWrite28;
                            i3 = i30;
                            z2 = false;
                            int i32 = 47 / 0;
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i2)) != 0) {
                                i4 = 2;
                                z3 = true;
                            } else {
                                int i33 = read + 41;
                                write = i33 % Fields.SpotShadowColor;
                                i4 = 2;
                                int i34 = i33 % 2;
                                z3 = z2;
                            }
                        } else {
                            i = i29;
                            i2 = iWrite28;
                            z2 = false;
                            i3 = i30;
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i2)) != 0) {
                                i4 = 2;
                                z3 = true;
                            } else {
                                int i35 = read + 41;
                                write = i35 % Fields.SpotShadowColor;
                                i4 = 2;
                                int i36 = i35 % 2;
                                z3 = z2;
                            }
                        }
                        int i37 = read + 89;
                        int i38 = iWrite24;
                        write = i37 % Fields.SpotShadowColor;
                        int i39 = i37 % i4;
                        int i40 = iWrite29;
                        boolean z6 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i40)) != 0 ? true : z2;
                        if (((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite30)) != 0) {
                            int i41 = read + 53;
                            write = i41 % Fields.SpotShadowColor;
                            int i42 = i41 % 2;
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        int i43 = iWrite32;
                        int i44 = iWrite33;
                        iWrite33 = i44;
                        arrayList2.add(new setFrom58bKbWc(str, settranslationxWrite, str2, str3, accessgetambientshadowcolor0d7_kjujd2, accessgetambientshadowcolor0d7_kjujd3, jSerializer, jSerializer2, jSerializer3, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer, setcompositingstrategyadbojceRemoteActionCompatParcelizer, z5, z3, z6, z4, uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite31), uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i43), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer.write(i44))), iSerializer, graphicsLayerScopeIconCompatParcelizer, jSerializer4, jSerializer5, jSerializer6, jSerializer7, z, setrotationzSerializer, iSerializer2, iSerializer3, jSerializer8, iSerializer4, iSerializer5, str4, boolValueOf));
                        int i45 = write + 113;
                        read = i45 % Fields.SpotShadowColor;
                        int i46 = i45 % 2;
                        iWrite = i8;
                        arrayList = arrayList2;
                        iWrite31 = iWrite31;
                        iWrite32 = i43;
                        iWrite15 = i10;
                        iWrite3 = i13;
                        iWrite4 = i15;
                        iWrite17 = i17;
                        iWrite16 = i11;
                        iWrite5 = i20;
                        iWrite11 = i23;
                        iWrite21 = i19;
                        iWrite23 = i24;
                        iWrite25 = i28;
                        iWrite26 = i;
                        iWrite29 = i40;
                        iWrite13 = i7;
                        iWrite2 = i9;
                        iWrite18 = i14;
                        iWrite19 = i16;
                        iWrite20 = i18;
                        iWrite24 = i38;
                        iWrite30 = iWrite30;
                        iWrite22 = i22;
                        iWrite12 = i21;
                        int i47 = i3;
                        iWrite28 = i2;
                        iWrite14 = i27;
                        iWrite27 = i47;
                    }
                    return arrayList;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 4:
                return qd.b(j, (k7) obj);
            case 5:
                ((backwardFocusSearch) obj).write(setEnableExtraAssertions.IconCompatParcelizer, Long.valueOf(j));
                return null;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) / 2.0f;
                Iterator it = SQLite.read(Float.valueOf(0.66f * fIntBitsToFloat2), Float.valueOf(0.33f * fIntBitsToFloat2), Float.valueOf(fIntBitsToFloat2)).iterator();
                while (it.hasNext()) {
                    DrawScope.m1285drawCircleVaOC9Bg$default(drawScope, this.f$0, ((Number) it.next()).floatValue(), drawScope.mo1303getCenterF1C5BW0(), 0.0f, null, null, 0, 120, null);
                }
                return createfromparcel;
            default:
                Map map = (Map) obj;
                map.getClass();
                map.put(Banner.EXPIRATION, String.valueOf(j));
                return createfromparcel;
        }
    }
}
