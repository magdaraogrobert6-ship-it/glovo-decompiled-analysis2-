package o;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import kotlin.LazyKt__LazyJVMKt;
import okio.Okio;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PagereLwUrMk implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String serializer;

    public /* synthetic */ PagereLwUrMk(String str, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        setFrom58bKbWc setfrom58bkbwc;
        setTranslationX settranslationxWrite;
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.serializer;
        switch (i) {
            case 0:
                androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m2833setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.Companion.m2818getImageo7Vup1c());
                return createfromparcel;
            case 1:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, str);
                    return Boolean.valueOf(uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer() && ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(0)) != 0);
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 2:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                        arrayList.add(uncheckedColordefaultRemoteActionCompatParcelizer2.read(0));
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                    return arrayList;
                } catch (Throwable th) {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                    throw th;
                }
            case 3:
                tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                tintxetnrds3.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer3 = tintxetnrds3.RemoteActionCompatParcelizer("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer(1, str);
                    return Boolean.valueOf(uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer() && ((int) uncheckedColordefaultRemoteActionCompatParcelizer3.serializer(0)) != 0);
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.close();
                }
            case 4:
                tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                tintxetnrds4.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer4 = tintxetnrds4.RemoteActionCompatParcelizer("SELECT long_value FROM Preference where `key`=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.IconCompatParcelizer(1, str);
                    if (uncheckedColordefaultRemoteActionCompatParcelizer4.IconCompatParcelizer() && !uncheckedColordefaultRemoteActionCompatParcelizer4.MediaSessionCompatQueueItem(0)) {
                        lValueOf = Long.valueOf(uncheckedColordefaultRemoteActionCompatParcelizer4.serializer(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.close();
                }
            case 5:
                tintxETnrds tintxetnrds5 = (tintxETnrds) obj;
                tintxetnrds5.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer5 = tintxetnrds5.RemoteActionCompatParcelizer("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer5.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer5.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer5.close();
                }
            case 6:
                tintxETnrds tintxetnrds6 = (tintxETnrds) obj;
                tintxetnrds6.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer6 = tintxetnrds6.RemoteActionCompatParcelizer("DELETE from WorkProgress where work_spec_id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer6.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer6.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer6.close();
                }
            case 7:
                tintxETnrds tintxetnrds7 = (tintxETnrds) obj;
                tintxetnrds7.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer7 = tintxetnrds7.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer7.IconCompatParcelizer(1, str);
                    int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "id");
                    int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "state");
                    int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "worker_class_name");
                    int iWrite4 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "input_merger_class_name");
                    int iWrite5 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "input");
                    int iWrite6 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "output");
                    int iWrite7 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "initial_delay");
                    int iWrite8 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "interval_duration");
                    int iWrite9 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "flex_duration");
                    int iWrite10 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "run_attempt_count");
                    int iWrite11 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "backoff_policy");
                    int iWrite12 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "backoff_delay_duration");
                    int iWrite13 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "last_enqueue_time");
                    int iWrite14 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "minimum_retention_duration");
                    int iWrite15 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "schedule_requested_at");
                    int iWrite16 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "run_in_foreground");
                    int iWrite17 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "out_of_quota_policy");
                    int iWrite18 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "period_count");
                    int iWrite19 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "generation");
                    int iWrite20 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "next_schedule_time_override");
                    int iWrite21 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "next_schedule_time_override_generation");
                    int iWrite22 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "stop_reason");
                    int iWrite23 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "trace_tag");
                    int iWrite24 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "backoff_on_system_interruptions");
                    int iWrite25 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "required_network_type");
                    int iWrite26 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "required_network_request");
                    int iWrite27 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_charging");
                    int iWrite28 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_device_idle");
                    int iWrite29 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_battery_not_low");
                    int iWrite30 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "requires_storage_not_low");
                    int iWrite31 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "trigger_content_update_delay");
                    int iWrite32 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "trigger_max_content_delay");
                    int iWrite33 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer7, "content_uri_triggers");
                    if (uncheckedColordefaultRemoteActionCompatParcelizer7.IconCompatParcelizer()) {
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite);
                        setTranslationX settranslationxWrite2 = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite2));
                        String str3 = uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite3);
                        String str4 = uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite4);
                        byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer7.write(iWrite5);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd3 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer7.write(iWrite6)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                        long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite7);
                        long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite8);
                        long jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite9);
                        int iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite10);
                        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite11));
                        long jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite12);
                        long jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite13);
                        long jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite14);
                        long jSerializer7 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite15);
                        boolean z = ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite16)) != 0;
                        setRotationZ setrotationzSerializer = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite17));
                        int iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite18);
                        int iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite19);
                        long jSerializer8 = uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite20);
                        int iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite21);
                        int iSerializer5 = (int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite22);
                        String str5 = uncheckedColordefaultRemoteActionCompatParcelizer7.MediaSessionCompatQueueItem(iWrite23) ? null : uncheckedColordefaultRemoteActionCompatParcelizer7.read(iWrite23);
                        Integer numValueOf = uncheckedColordefaultRemoteActionCompatParcelizer7.MediaSessionCompatQueueItem(r24) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite24));
                        setfrom58bkbwc = new setFrom58bKbWc(str2, settranslationxWrite2, str3, str4, accessgetambientshadowcolor0d7_kjujd2, accessgetambientshadowcolor0d7_kjujd3, jSerializer, jSerializer2, jSerializer3, new toolingGraphicsLayer(Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer7.write(iWrite26)), Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite25)), ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite27)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite28)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite29)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite30)) != 0, uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite31), uncheckedColordefaultRemoteActionCompatParcelizer7.serializer(iWrite32), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer7.write(iWrite33))), iSerializer, graphicsLayerScopeIconCompatParcelizer, jSerializer4, jSerializer5, jSerializer6, jSerializer7, z, setrotationzSerializer, iSerializer2, iSerializer3, jSerializer8, iSerializer4, iSerializer5, str5, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        setfrom58bkbwc = null;
                    }
                    return setfrom58bkbwc;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer7.close();
                }
            case 8:
                tintxETnrds tintxetnrds8 = (tintxETnrds) obj;
                tintxetnrds8.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer8 = tintxetnrds8.RemoteActionCompatParcelizer("DELETE FROM workspec WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer8.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer8.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer8.close();
                }
            case 9:
                tintxETnrds tintxetnrds9 = (tintxETnrds) obj;
                tintxetnrds9.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer9 = tintxetnrds9.RemoteActionCompatParcelizer("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer9.IconCompatParcelizer(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer9.IconCompatParcelizer()) {
                        String str6 = uncheckedColordefaultRemoteActionCompatParcelizer9.read(0);
                        setTranslationX settranslationxWrite3 = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer9.serializer(1));
                        str6.getClass();
                        settranslationxWrite3.getClass();
                        timesAssign58bKbWc timesassign58bkbwc = new timesAssign58bKbWc();
                        timesassign58bkbwc.write = str6;
                        timesassign58bkbwc.IconCompatParcelizer = settranslationxWrite3;
                        arrayList2.add(timesassign58bkbwc);
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer9.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    uncheckedColordefaultRemoteActionCompatParcelizer9.close();
                    throw th2;
                }
            case 10:
                tintxETnrds tintxetnrds10 = (tintxETnrds) obj;
                tintxetnrds10.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer10 = tintxetnrds10.RemoteActionCompatParcelizer("SELECT state FROM workspec WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer10.IconCompatParcelizer(1, str);
                    if (uncheckedColordefaultRemoteActionCompatParcelizer10.IconCompatParcelizer()) {
                        Integer numValueOf2 = uncheckedColordefaultRemoteActionCompatParcelizer10.MediaSessionCompatQueueItem(0) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer10.serializer(0));
                        settranslationxWrite = numValueOf2 != null ? Options.Companion.write(numValueOf2.intValue()) : null;
                        break;
                    }
                    return settranslationxWrite;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer10.close();
                }
            case 11:
                tintxETnrds tintxetnrds11 = (tintxETnrds) obj;
                tintxetnrds11.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer11 = tintxetnrds11.RemoteActionCompatParcelizer("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer11.IconCompatParcelizer(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer11.IconCompatParcelizer()) {
                        arrayList3.add(uncheckedColordefaultRemoteActionCompatParcelizer11.read(0));
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer11.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    uncheckedColordefaultRemoteActionCompatParcelizer11.close();
                    throw th3;
                }
            case 12:
                tintxETnrds tintxetnrds12 = (tintxETnrds) obj;
                tintxetnrds12.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer12 = tintxetnrds12.RemoteActionCompatParcelizer("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer12.IconCompatParcelizer(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer12.IconCompatParcelizer()) {
                        byte[] bArrWrite2 = uncheckedColordefaultRemoteActionCompatParcelizer12.write(0);
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd4 = accessgetAmbientShadowColor0d7_KjUjd.write;
                        arrayList4.add((accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite2}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089));
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer12.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    uncheckedColordefaultRemoteActionCompatParcelizer12.close();
                    throw th4;
                }
            case 13:
                tintxETnrds tintxetnrds13 = (tintxETnrds) obj;
                tintxetnrds13.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer13 = tintxetnrds13.RemoteActionCompatParcelizer("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer13.IconCompatParcelizer(1, str);
                    uncheckedColordefaultRemoteActionCompatParcelizer13.IconCompatParcelizer();
                    return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds13})).intValue());
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer13.close();
                }
            default:
                tintxETnrds tintxetnrds14 = (tintxETnrds) obj;
                tintxetnrds14.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer14 = tintxetnrds14.RemoteActionCompatParcelizer("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer14.IconCompatParcelizer(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer14.IconCompatParcelizer()) {
                        arrayList5.add(uncheckedColordefaultRemoteActionCompatParcelizer14.read(0));
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer14.close();
                    return arrayList5;
                } catch (Throwable th5) {
                    uncheckedColordefaultRemoteActionCompatParcelizer14.close();
                    throw th5;
                }
        }
    }
}
