package bo.app;

import android.net.Uri;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.util.UtilsKt;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.foodora.courier.delivery.service.DeliveryService;
import com.foodora.courier.push.messages.services.GmsPushMessagingService;
import com.foodora.courier.push.messages.services.HmsPushMessagingService;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Value;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.home.CreateHomeScope;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import o.GraphicsLayerScope;
import o.UncheckedColordefault;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessgetMovecp;
import o.contains64DMado;
import o.createFromParcel;
import o.drawOutlinehn5TExg;
import o.getAutofillTree;
import o.getEnterdhqQ8s;
import o.getInsertedannotations;
import o.getRectManager;
import o.handleUrlOverridelambda1;
import o.onTouch;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCompositingStrategyaDBOjCE;
import o.setFrom58bKbWc;
import o.setRotationZ;
import o.setToggleableState;
import o.setTranslationX;
import o.specifiesCanFocusProperty;
import o.tintxETnrds;
import o.toolingGraphicsLayer;
import okio.Okio;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg$$ExternalSyntheticLambda5 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ hg$$ExternalSyntheticLambda5(CreateHomeScope createHomeScope, FragmentActivity fragmentActivity) {
        this.$r8$classId = 20;
    }

    public /* synthetic */ hg$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x040e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0419 A[Catch: all -> 0x0530, TryCatch #0 {all -> 0x0530, blocks: (B:84:0x01fd, B:85:0x02ee, B:89:0x0305, B:93:0x03b0, B:101:0x0410, B:103:0x0419, B:106:0x042a, B:110:0x0433, B:114:0x044a, B:120:0x047f, B:126:0x0499, B:131:0x04ae, B:135:0x04be, B:138:0x0532, B:96:0x03f8), top: B:160:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0425  */
    /* JADX WARN: Code duplicated, block: B:106:0x042a A[Catch: all -> 0x0530, TryCatch #0 {all -> 0x0530, blocks: (B:84:0x01fd, B:85:0x02ee, B:89:0x0305, B:93:0x03b0, B:101:0x0410, B:103:0x0419, B:106:0x042a, B:110:0x0433, B:114:0x044a, B:120:0x047f, B:126:0x0499, B:131:0x04ae, B:135:0x04be, B:138:0x0532, B:96:0x03f8), top: B:160:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0430  */
    /* JADX WARN: Code duplicated, block: B:109:0x0432  */
    /* JADX WARN: Code duplicated, block: B:112:0x043a  */
    /* JADX WARN: Code duplicated, block: B:117:0x046a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0479  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:123:0x0486  */
    /* JADX WARN: Code duplicated, block: B:124:0x0489  */
    /* JADX WARN: Code duplicated, block: B:128:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:130:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:145:0x0543  */
    /* JADX WARN: Code duplicated, block: B:148:0x0558 A[Catch: all -> 0x0569, TRY_LEAVE, TryCatch #1 {all -> 0x0569, blocks: (B:146:0x0550, B:148:0x0558), top: B:162:0x0550 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x055f  */
    /* JADX WARN: Code duplicated, block: B:156:0x056e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0577  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:164:0x0539 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[PHI: r7
  0x0055: PHI (r7v23 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[PHI: r7
  0x0063: PHI (r7v22 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[PHI: r7
  0x006f: PHI (r7v21 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[PHI: r7
  0x008b: PHI (r7v20 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167 A[PHI: r7
  0x0167: PHI (r7v19 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0174 A[PHI: r7
  0x0174: PHI (r7v18 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0181 A[PHI: r7
  0x0181: PHI (r7v17 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x018c A[PHI: r7
  0x018c: PHI (r7v16 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9 A[PHI: r7
  0x01b9: PHI (r7v15 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c3 A[PHI: r7
  0x01c3: PHI (r7v14 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cd A[PHI: r7
  0x01cd: PHI (r7v13 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v24 o.createFromParcel) binds: [B:9:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:92:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:95:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x03f8 A[Catch: all -> 0x0530, TRY_LEAVE, TryCatch #0 {all -> 0x0530, blocks: (B:84:0x01fd, B:85:0x02ee, B:89:0x0305, B:93:0x03b0, B:101:0x0410, B:103:0x0419, B:106:0x042a, B:110:0x0433, B:114:0x044a, B:120:0x047f, B:126:0x0499, B:131:0x04ae, B:135:0x04be, B:138:0x0532, B:96:0x03f8), top: B:160:0x01fd }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        createFromParcel createfromparcel;
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer;
        int iSerializer;
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2;
        int iWrite;
        int iWrite2;
        int iWrite3;
        int iWrite4;
        int iWrite5;
        int iWrite6;
        int iWrite7;
        int iWrite8;
        int iWrite9;
        int iWrite10;
        int iWrite11;
        int iWrite12;
        int iWrite13;
        int iWrite14;
        int iWrite15;
        int iWrite16;
        int iWrite17;
        int iWrite18;
        int iWrite19;
        int iWrite20;
        int iWrite21;
        int iWrite22;
        int iWrite23;
        int iWrite24;
        int iWrite25;
        int iWrite26;
        int iWrite27;
        int iWrite28;
        int iWrite29;
        int iWrite30;
        int iWrite31;
        int iWrite32;
        int iWrite33;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        String str;
        int i2;
        setTranslationX settranslationxWrite;
        String str2;
        String str3;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2;
        long jSerializer;
        long jSerializer2;
        long jSerializer3;
        int iSerializer2;
        int i3;
        int i4;
        GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer;
        long jSerializer4;
        long jSerializer5;
        long jSerializer6;
        int i5;
        long jSerializer7;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        setRotationZ setrotationzSerializer;
        int i10;
        int iSerializer3;
        int i11;
        int i12;
        int iSerializer4;
        int i13;
        long jSerializer8;
        int i14;
        int iSerializer5;
        int i15;
        int i16;
        int iSerializer6;
        int i17;
        String str4;
        int i18;
        int i19;
        Integer numValueOf;
        Boolean boolValueOf;
        int i20;
        boolean z2;
        boolean z3;
        int i21;
        boolean z4;
        boolean z5;
        boolean z6;
        contains64DMado contains64dmado;
        String str5;
        List list;
        List list2;
        final List list3;
        final int i22 = 2;
        int i23 = 2 % 2;
        int i24 = serializer + 39;
        read = i24 % Fields.SpotShadowColor;
        final int i25 = 3;
        final int i26 = 0;
        char c = 1;
        if (i24 % 2 != 0) {
            int i27 = this.$r8$classId;
            createfromparcel = createFromParcel.INSTANCE;
            switch (i27) {
                case 0:
                    return hg.a((File) obj);
                case 1:
                    tintxETnrds tintxetnrds = (tintxETnrds) obj;
                    tintxetnrds.getClass();
                    uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                    try {
                        if (!(!uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer())) {
                            iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(0);
                        } else {
                            iSerializer = 0;
                        }
                        uncheckedColordefaultRemoteActionCompatParcelizer.close();
                        return Integer.valueOf(iSerializer);
                    } catch (Throwable th) {
                        uncheckedColordefaultRemoteActionCompatParcelizer.close();
                        throw th;
                    }
                case 2:
                    tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                    tintxetnrds2.getClass();
                    uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                    try {
                        iWrite = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "id");
                        iWrite2 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "state");
                        iWrite3 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "worker_class_name");
                        iWrite4 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "input_merger_class_name");
                        iWrite5 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "input");
                        iWrite6 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "output");
                        iWrite7 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "initial_delay");
                        iWrite8 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "interval_duration");
                        iWrite9 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "flex_duration");
                        iWrite10 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "run_attempt_count");
                        iWrite11 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_policy");
                        iWrite12 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_delay_duration");
                        iWrite13 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "last_enqueue_time");
                        iWrite14 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "minimum_retention_duration");
                        iWrite15 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "schedule_requested_at");
                        iWrite16 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "run_in_foreground");
                        iWrite17 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "out_of_quota_policy");
                        iWrite18 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "period_count");
                        iWrite19 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "generation");
                        iWrite20 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "next_schedule_time_override");
                        iWrite21 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "next_schedule_time_override_generation");
                        iWrite22 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "stop_reason");
                        iWrite23 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trace_tag");
                        iWrite24 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_on_system_interruptions");
                        iWrite25 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "required_network_type");
                        iWrite26 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "required_network_request");
                        iWrite27 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_charging");
                        iWrite28 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_device_idle");
                        iWrite29 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_battery_not_low");
                        iWrite30 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_storage_not_low");
                        iWrite31 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trigger_content_update_delay");
                        iWrite32 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trigger_max_content_delay");
                        iWrite33 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "content_uri_triggers");
                        arrayList = new ArrayList();
                        while (true) {
                            arrayList2 = arrayList;
                            i = iWrite14;
                            if (!(!uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer())) {
                                uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                                return arrayList2;
                            }
                            int i28 = read + 11;
                            serializer = i28 % Fields.SpotShadowColor;
                            int i29 = i28 % 2;
                            str = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite);
                            i2 = iWrite13;
                            settranslationxWrite = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite2));
                            str2 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite3);
                            str3 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite4);
                            byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer2.write(iWrite5);
                            accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd3 = accessgetAmbientShadowColor0d7_KjUjd.write;
                            accessgetambientshadowcolor0d7_kjujd = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                            accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer2.write(iWrite6)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                            jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite7);
                            jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite8);
                            jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite9);
                            iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite10);
                            i3 = iWrite2;
                            i4 = iWrite3;
                            graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite11));
                            jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite12);
                            jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i2);
                            jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i);
                            i5 = iWrite15;
                            jSerializer7 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i5);
                            i6 = iWrite12;
                            i7 = iWrite16;
                            i8 = iWrite;
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i7)) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i9 = iWrite11;
                            setrotationzSerializer = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite17));
                            i10 = iWrite18;
                            iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i10);
                            i11 = iWrite19;
                            i12 = iWrite17;
                            iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i11);
                            i13 = iWrite20;
                            jSerializer8 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i13);
                            i14 = iWrite21;
                            iSerializer5 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i14);
                            i15 = iWrite22;
                            i16 = iWrite4;
                            iSerializer6 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i15);
                            i17 = iWrite23;
                            if (uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(i17)) {
                                str4 = null;
                            } else {
                                str4 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(i17);
                            }
                            i18 = read + 23;
                            serializer = i18 % Fields.SpotShadowColor;
                            if (i18 % 2 != 0) {
                                uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite24);
                                throw null;
                            }
                            i19 = iWrite24;
                            if (!uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(i19)) {
                                numValueOf = Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i19));
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                if (numValueOf.intValue() != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                boolValueOf = Boolean.valueOf(z6);
                            } else {
                                boolValueOf = null;
                            }
                            int i30 = serializer + 83;
                            read = i30 % Fields.SpotShadowColor;
                            int i31 = i30 % 2;
                            int i32 = iWrite25;
                            int i33 = iWrite6;
                            setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i32));
                            int i34 = iWrite26;
                            drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2.write(i34));
                            i20 = iWrite27;
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i20)) != 0) {
                                int i35 = read + 83;
                                serializer = i35 % Fields.SpotShadowColor;
                                int i36 = i35 % 2;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite28)) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            int i37 = read + 7;
                            serializer = i37 % Fields.SpotShadowColor;
                            int i38 = i37 % 2;
                            int i39 = iWrite7;
                            i21 = iWrite29;
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i21)) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite30)) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int i40 = iWrite32;
                            int i41 = iWrite33;
                            iWrite33 = i41;
                            arrayList2.add(new setFrom58bKbWc(str, settranslationxWrite, str2, str3, accessgetambientshadowcolor0d7_kjujd, accessgetambientshadowcolor0d7_kjujd2, jSerializer, jSerializer2, jSerializer3, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer, setcompositingstrategyadbojceRemoteActionCompatParcelizer, z2, z3, z4, z5, uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite31), uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i40), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2.write(i41))), iSerializer2, graphicsLayerScopeIconCompatParcelizer, jSerializer4, jSerializer5, jSerializer6, jSerializer7, z, setrotationzSerializer, iSerializer3, iSerializer4, jSerializer8, iSerializer5, iSerializer6, str4, boolValueOf));
                            iWrite32 = i40;
                            iWrite = i8;
                            iWrite11 = i9;
                            iWrite17 = i12;
                            iWrite16 = i7;
                            iWrite14 = i;
                            iWrite20 = i13;
                            iWrite29 = i21;
                            iWrite5 = iWrite5;
                            iWrite3 = i4;
                            iWrite12 = i6;
                            iWrite19 = i11;
                            iWrite21 = i14;
                            iWrite23 = i17;
                            iWrite31 = iWrite31;
                            iWrite30 = iWrite30;
                            iWrite4 = i16;
                            iWrite22 = i15;
                            iWrite6 = i33;
                            iWrite25 = i32;
                            iWrite26 = i34;
                            iWrite27 = i20;
                            iWrite2 = i3;
                            iWrite24 = i19;
                            iWrite28 = iWrite28;
                            iWrite7 = i39;
                            iWrite15 = i5;
                            arrayList = arrayList2;
                            iWrite13 = i2;
                            iWrite18 = i10;
                        }
                    } catch (Throwable th2) {
                        uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                        throw th2;
                    }
                    break;
                case 3:
                    return BannerJavascriptInterface._init_$lambda$0(((Double) obj).doubleValue());
                case 4:
                    getEnterdhqQ8s getenterdhqq8s = (getEnterdhqQ8s) obj;
                    int i42 = DeliveryService.serializer;
                    getenterdhqq8s.getClass();
                    getenterdhqq8s.write(true);
                    int i43 = read + 63;
                    serializer = i43 % Fields.SpotShadowColor;
                    int i44 = i43 % 2;
                    return createfromparcel;
                case 5:
                    Timber.RemoteActionCompatParcelizer.getClass();
                    return createfromparcel;
                case 6:
                    Timber.RemoteActionCompatParcelizer.getClass();
                    return createfromparcel;
                case 7:
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
                    onviewattachedtowindowlambda0.getClass();
                    Integer num = (Integer) onviewattachedtowindowlambda0.serializer;
                    Long l = (Long) onviewattachedtowindowlambda0.write;
                    num.getClass();
                    int iIntValue = num.intValue();
                    l.getClass();
                    return new accessgetMovecp(iIntValue, l.longValue());
                case 8:
                    onTouch ontouch = (onTouch) obj;
                    ontouch.getClass();
                    ontouch.MediaMetadataCompat = true;
                    return createfromparcel;
                case 9:
                    getEnterdhqQ8s getenterdhqq8s2 = (getEnterdhqQ8s) obj;
                    getenterdhqq8s2.getClass();
                    getenterdhqq8s2.write(true);
                    return createfromparcel;
                case 10:
                    getEnterdhqQ8s getenterdhqq8s3 = (getEnterdhqQ8s) obj;
                    int i45 = GmsPushMessagingService.serializer;
                    getenterdhqq8s3.getClass();
                    getenterdhqq8s3.write(true);
                    return createfromparcel;
                case 11:
                    getEnterdhqQ8s getenterdhqq8s4 = (getEnterdhqQ8s) obj;
                    int i46 = HmsPushMessagingService.RemoteActionCompatParcelizer;
                    getenterdhqq8s4.getClass();
                    getenterdhqq8s4.write(true);
                    return createfromparcel;
                case 12:
                    specifiesCanFocusProperty specifiescanfocusproperty = (specifiesCanFocusProperty) obj;
                    specifiescanfocusproperty.getClass();
                    return specifiescanfocusproperty.write();
                case 13:
                    contains64dmado = (contains64DMado) obj;
                    contains64dmado.getClass();
                    if (contains64dmado.IconCompatParcelizer == getInsertedannotations.ASCENDING) {
                        str5 = "asc";
                    } else {
                        str5 = "desc";
                    }
                    return contains64dmado.read.RemoteActionCompatParcelizer().concat(str5);
                case 14:
                    final List list4 = (List) obj;
                    list4.getClass();
                    final char c2 = c == true ? 1 : 0;
                    return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj2) {
                            Value valueIconCompatParcelizer;
                            ArrayValue arrayValue;
                            int i47 = c2;
                            List list5 = list4;
                            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                            int i48 = 0;
                            if (i47 == 0) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                HashMap map = new HashMap(list5.size() / 2);
                                int i49 = TuplesKt.read(0, list5.size() - 1, 2);
                                if (i49 >= 0) {
                                    while (true) {
                                        Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(i48)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer2 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer2.hasStringValue()) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(i48 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer3 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        String stringValue = valueIconCompatParcelizer2.getStringValue();
                                        stringValue.getClass();
                                        if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (i48 != i49) {
                                            i48 += 2;
                                        }
                                    }
                                }
                                return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                            }
                            if (i47 == 1) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                if (list5.size() != 2) {
                                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list5.size()));
                                    throw null;
                                }
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                                List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                                if (valuesList == null) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                lValueOf.getClass();
                                long jLongValue = lValueOf.longValue();
                                if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                if (jLongValue < 0) {
                                    jLongValue += (long) valuesList.size();
                                }
                                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                Value value = valuesList.get((int) jLongValue);
                                value.getClass();
                                return new getDrawOLwlOKwannotations(value);
                            }
                            if (i47 != 2) {
                                Iterator it = list5.iterator();
                                while (it.hasNext()) {
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                    Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                    int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                    if (i50 == -1 || i50 == 1) {
                                        i48 = 1;
                                    } else {
                                        if (i50 != 2) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                            return getBringIntoViewOLwlOKw.write;
                                        }
                                    }
                                }
                                return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                            }
                            Iterator it2 = list5.iterator();
                            while (it2.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                                int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                                if (i51 == -1 || i51 == 1) {
                                    i48 = 1;
                                } else {
                                    if (i51 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (valueIconCompatParcelizer8.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.read;
                                    }
                                }
                            }
                            return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                        }
                    };
                case 15:
                    final List list5 = (List) obj;
                    list5.getClass();
                    return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj2) {
                            Value valueIconCompatParcelizer;
                            ArrayValue arrayValue;
                            int i47 = i25;
                            List list6 = list5;
                            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                            int i48 = 0;
                            if (i47 == 0) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                HashMap map = new HashMap(list6.size() / 2);
                                int i49 = TuplesKt.read(0, list6.size() - 1, 2);
                                if (i49 >= 0) {
                                    while (true) {
                                        Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(i48)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer2 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer2.hasStringValue()) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(i48 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer3 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        String stringValue = valueIconCompatParcelizer2.getStringValue();
                                        stringValue.getClass();
                                        if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (i48 != i49) {
                                            i48 += 2;
                                        }
                                    }
                                }
                                return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                            }
                            if (i47 == 1) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                if (list6.size() != 2) {
                                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list6.size()));
                                    throw null;
                                }
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                                List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                                if (valuesList == null) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                lValueOf.getClass();
                                long jLongValue = lValueOf.longValue();
                                if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                if (jLongValue < 0) {
                                    jLongValue += (long) valuesList.size();
                                }
                                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                Value value = valuesList.get((int) jLongValue);
                                value.getClass();
                                return new getDrawOLwlOKwannotations(value);
                            }
                            if (i47 != 2) {
                                Iterator it = list6.iterator();
                                while (it.hasNext()) {
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                    Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                    int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                    if (i50 == -1 || i50 == 1) {
                                        i48 = 1;
                                    } else {
                                        if (i50 != 2) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                            return getBringIntoViewOLwlOKw.write;
                                        }
                                    }
                                }
                                return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                            }
                            Iterator it2 = list6.iterator();
                            while (it2.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                                int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                                if (i51 == -1 || i51 == 1) {
                                    i48 = 1;
                                } else {
                                    if (i51 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (valueIconCompatParcelizer8.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.read;
                                    }
                                }
                            }
                            return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                        }
                    };
                case 16:
                    final List list6 = (List) obj;
                    list6.getClass();
                    return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj2) {
                            Value valueIconCompatParcelizer;
                            ArrayValue arrayValue;
                            int i47 = i22;
                            List list7 = list6;
                            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                            int i48 = 0;
                            if (i47 == 0) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                HashMap map = new HashMap(list7.size() / 2);
                                int i49 = TuplesKt.read(0, list7.size() - 1, 2);
                                if (i49 >= 0) {
                                    while (true) {
                                        Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(i48)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer2 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer2.hasStringValue()) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(i48 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer3 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        String stringValue = valueIconCompatParcelizer2.getStringValue();
                                        stringValue.getClass();
                                        if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (i48 != i49) {
                                            i48 += 2;
                                        }
                                    }
                                }
                                return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                            }
                            if (i47 == 1) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                if (list7.size() != 2) {
                                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list7.size()));
                                    throw null;
                                }
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                                List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                                if (valuesList == null) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                lValueOf.getClass();
                                long jLongValue = lValueOf.longValue();
                                if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                if (jLongValue < 0) {
                                    jLongValue += (long) valuesList.size();
                                }
                                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                Value value = valuesList.get((int) jLongValue);
                                value.getClass();
                                return new getDrawOLwlOKwannotations(value);
                            }
                            if (i47 != 2) {
                                Iterator it = list7.iterator();
                                while (it.hasNext()) {
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                    Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                    int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                    if (i50 == -1 || i50 == 1) {
                                        i48 = 1;
                                    } else {
                                        if (i50 != 2) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                            return getBringIntoViewOLwlOKw.write;
                                        }
                                    }
                                }
                                return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                            }
                            Iterator it2 = list7.iterator();
                            while (it2.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                                int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                                if (i51 == -1 || i51 == 1) {
                                    i48 = 1;
                                } else {
                                    if (i51 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (valueIconCompatParcelizer8.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.read;
                                    }
                                }
                            }
                            return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                        }
                    };
                case 17:
                    list = (List) obj;
                    list.getClass();
                    if (list.size() == 1) {
                        return new GestureNodeKt$$ExternalSyntheticLambda0((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), 4);
                    }
                    getRectManager.write("IsNull function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
                    throw null;
                case 18:
                    list2 = (List) obj;
                    list2.getClass();
                    if (list2.size() == 1) {
                        return new GestureNodeKt$$ExternalSyntheticLambda0((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list2.get(0), i25);
                    }
                    getRectManager.write("IsNotNull function should have exactly 1 params, but %d were given.", Integer.valueOf(list2.size()));
                    throw null;
                case 19:
                    list3 = (List) obj;
                    list3.getClass();
                    if (list3.size() % 2 == 0) {
                        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj2) {
                                Value valueIconCompatParcelizer;
                                ArrayValue arrayValue;
                                int i47 = i26;
                                List list7 = list3;
                                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                                int i48 = 0;
                                if (i47 == 0) {
                                    nodeCoordinatorCompanionPointerInputSource1.getClass();
                                    HashMap map = new HashMap(list7.size() / 2);
                                    int i49 = TuplesKt.read(0, list7.size() - 1, 2);
                                    if (i49 >= 0) {
                                        while (true) {
                                            Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(i48)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                            if (valueIconCompatParcelizer2 == null) {
                                                return getBringIntoViewOLwlOKwannotations.serializer;
                                            }
                                            if (!valueIconCompatParcelizer2.hasStringValue()) {
                                                return getBringIntoViewOLwlOKwannotations.serializer;
                                            }
                                            Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(i48 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                            if (valueIconCompatParcelizer3 == null) {
                                                return getBringIntoViewOLwlOKwannotations.serializer;
                                            }
                                            String stringValue = valueIconCompatParcelizer2.getStringValue();
                                            stringValue.getClass();
                                            if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                                return getBringIntoViewOLwlOKwannotations.serializer;
                                            }
                                            if (i48 != i49) {
                                                i48 += 2;
                                            }
                                        }
                                    }
                                    return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                                }
                                if (i47 == 1) {
                                    nodeCoordinatorCompanionPointerInputSource1.getClass();
                                    if (list7.size() != 2) {
                                        getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list7.size()));
                                        throw null;
                                    }
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                                    List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                    if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                    Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                                    if (valuesList == null) {
                                        return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                    }
                                    lValueOf.getClass();
                                    long jLongValue = lValueOf.longValue();
                                    if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                        return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                    }
                                    if (jLongValue < 0) {
                                        jLongValue += (long) valuesList.size();
                                    }
                                    getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                    Value value = valuesList.get((int) jLongValue);
                                    value.getClass();
                                    return new getDrawOLwlOKwannotations(value);
                                }
                                if (i47 != 2) {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                        if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                        int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                        if (i50 == -1 || i50 == 1) {
                                            i48 = 1;
                                        } else {
                                            if (i50 != 2) {
                                                return getBringIntoViewOLwlOKwannotations.serializer;
                                            }
                                            if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                                return getBringIntoViewOLwlOKw.write;
                                            }
                                        }
                                    }
                                    return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                                }
                                Iterator it2 = list7.iterator();
                                while (it2.hasNext()) {
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                                    Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                                    int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                                    if (i51 == -1 || i51 == 1) {
                                        i48 = 1;
                                    } else {
                                        if (i51 != 2) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (valueIconCompatParcelizer8.getBooleanValue()) {
                                            return getBringIntoViewOLwlOKw.read;
                                        }
                                    }
                                }
                                return i48 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                            }
                        };
                    }
                    getRectManager.write("Function should have even number of params, but %d were given.", Integer.valueOf(list3.size()));
                    throw null;
                case 20:
                    String str6 = (String) obj;
                    str6.getClass();
                    Uri.parse(str6).getClass();
                    return createfromparcel;
                case 21:
                    i26 = 1;
                    break;
                case 22:
                    onTouch ontouch2 = (onTouch) obj;
                    ontouch2.getClass();
                    ontouch2.MediaDescriptionCompat = true;
                    return createfromparcel;
                case 23:
                    onTouch ontouch3 = (onTouch) obj;
                    ontouch3.getClass();
                    ontouch3.MediaDescriptionCompat = true;
                    ontouch3.MediaSessionCompatQueueItem = true;
                    return createfromparcel;
                case 24:
                    onTouch ontouch4 = (onTouch) obj;
                    ontouch4.getClass();
                    ontouch4.MediaDescriptionCompat = true;
                    ontouch4.MediaMetadataCompat = true;
                    ontouch4.MediaSessionCompatQueueItem = true;
                    return createfromparcel;
                case 25:
                    return LogoutActivity.serializer((OnBackPressedCallback) obj);
                case 26:
                    setToggleableState settoggleablestate = (setToggleableState) obj;
                    settoggleablestate.getClass();
                    return settoggleablestate.getType();
                case 27:
                    setToggleableState settoggleablestate2 = (setToggleableState) obj;
                    settoggleablestate2.getClass();
                    return settoggleablestate2.getType();
                case 28:
                    setToggleableState settoggleablestate3 = (setToggleableState) obj;
                    settoggleablestate3.getClass();
                    return settoggleablestate3.getType();
                default:
                    setToggleableState settoggleablestate4 = (setToggleableState) obj;
                    settoggleablestate4.getClass();
                    return settoggleablestate4.getType();
            }
            getAutofillTree getautofilltree = (getAutofillTree) obj;
            getautofilltree.getClass();
            return Boolean.valueOf(getautofilltree == getAutofillTree.Hidden ? i26 : 1);
        }
        int i47 = this.$r8$classId;
        createfromparcel = createFromParcel.INSTANCE;
        switch (i47) {
            case 0:
                return hg.a((File) obj);
            case 1:
                tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                tintxetnrds3.getClass();
                uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds3.RemoteActionCompatParcelizer("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                if (!(!uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer())) {
                    iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(0);
                } else {
                    iSerializer = 0;
                }
                uncheckedColordefaultRemoteActionCompatParcelizer.close();
                return Integer.valueOf(iSerializer);
            case 2:
                tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                tintxetnrds4.getClass();
                uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds4.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                iWrite = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "id");
                iWrite2 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "state");
                iWrite3 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "worker_class_name");
                iWrite4 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "input_merger_class_name");
                iWrite5 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "input");
                iWrite6 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "output");
                iWrite7 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "initial_delay");
                iWrite8 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "interval_duration");
                iWrite9 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "flex_duration");
                iWrite10 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "run_attempt_count");
                iWrite11 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_policy");
                iWrite12 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_delay_duration");
                iWrite13 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "last_enqueue_time");
                iWrite14 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "minimum_retention_duration");
                iWrite15 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "schedule_requested_at");
                iWrite16 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "run_in_foreground");
                iWrite17 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "out_of_quota_policy");
                iWrite18 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "period_count");
                iWrite19 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "generation");
                iWrite20 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "next_schedule_time_override");
                iWrite21 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "next_schedule_time_override_generation");
                iWrite22 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "stop_reason");
                iWrite23 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trace_tag");
                iWrite24 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_on_system_interruptions");
                iWrite25 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "required_network_type");
                iWrite26 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "required_network_request");
                iWrite27 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_charging");
                iWrite28 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_device_idle");
                iWrite29 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_battery_not_low");
                iWrite30 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_storage_not_low");
                iWrite31 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trigger_content_update_delay");
                iWrite32 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trigger_max_content_delay");
                iWrite33 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "content_uri_triggers");
                arrayList = new ArrayList();
                while (true) {
                    arrayList2 = arrayList;
                    i = iWrite14;
                    if (!(!uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer())) {
                        uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                        return arrayList2;
                    }
                    int i210 = read + 11;
                    serializer = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    str = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite);
                    i2 = iWrite13;
                    settranslationxWrite = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite2));
                    str2 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite3);
                    str3 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite4);
                    byte[] bArrWrite2 = uncheckedColordefaultRemoteActionCompatParcelizer2.write(iWrite5);
                    accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd4 = accessgetAmbientShadowColor0d7_KjUjd.write;
                    accessgetambientshadowcolor0d7_kjujd = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite2}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                    accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer2.write(iWrite6)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                    jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite7);
                    jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite8);
                    jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite9);
                    iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite10);
                    i3 = iWrite2;
                    i4 = iWrite3;
                    graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite11));
                    jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite12);
                    jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i2);
                    jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i);
                    i5 = iWrite15;
                    jSerializer7 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i5);
                    i6 = iWrite12;
                    i7 = iWrite16;
                    i8 = iWrite;
                    if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i7)) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i9 = iWrite11;
                    setrotationzSerializer = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite17));
                    i10 = iWrite18;
                    iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i10);
                    i11 = iWrite19;
                    i12 = iWrite17;
                    iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i11);
                    i13 = iWrite20;
                    jSerializer8 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i13);
                    i14 = iWrite21;
                    iSerializer5 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i14);
                    i15 = iWrite22;
                    i16 = iWrite4;
                    iSerializer6 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i15);
                    i17 = iWrite23;
                    if (uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(i17)) {
                        str4 = null;
                    } else {
                        str4 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(i17);
                    }
                    i18 = read + 23;
                    serializer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite24);
                        throw null;
                    }
                    i19 = iWrite24;
                    if (!uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(i19)) {
                        numValueOf = Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i19));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        if (numValueOf.intValue() != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolValueOf = Boolean.valueOf(z6);
                    } else {
                        boolValueOf = null;
                    }
                    int i310 = serializer + 83;
                    read = i310 % Fields.SpotShadowColor;
                    int i311 = i310 % 2;
                    int i312 = iWrite25;
                    int i313 = iWrite6;
                    setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer2 = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i312));
                    int i314 = iWrite26;
                    drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer2 = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2.write(i314));
                    i20 = iWrite27;
                    if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i20)) != 0) {
                        int i315 = read + 83;
                        serializer = i315 % Fields.SpotShadowColor;
                        int i316 = i315 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite28)) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i317 = read + 7;
                    serializer = i317 % Fields.SpotShadowColor;
                    int i318 = i317 % 2;
                    int i319 = iWrite7;
                    i21 = iWrite29;
                    if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i21)) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite30)) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int i48 = iWrite32;
                    int i49 = iWrite33;
                    iWrite33 = i49;
                    arrayList2.add(new setFrom58bKbWc(str, settranslationxWrite, str2, str3, accessgetambientshadowcolor0d7_kjujd, accessgetambientshadowcolor0d7_kjujd2, jSerializer, jSerializer2, jSerializer3, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer2, setcompositingstrategyadbojceRemoteActionCompatParcelizer2, z2, z3, z4, z5, uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite31), uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i48), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2.write(i49))), iSerializer2, graphicsLayerScopeIconCompatParcelizer, jSerializer4, jSerializer5, jSerializer6, jSerializer7, z, setrotationzSerializer, iSerializer3, iSerializer4, jSerializer8, iSerializer5, iSerializer6, str4, boolValueOf));
                    iWrite32 = i48;
                    iWrite = i8;
                    iWrite11 = i9;
                    iWrite17 = i12;
                    iWrite16 = i7;
                    iWrite14 = i;
                    iWrite20 = i13;
                    iWrite29 = i21;
                    iWrite5 = iWrite5;
                    iWrite3 = i4;
                    iWrite12 = i6;
                    iWrite19 = i11;
                    iWrite21 = i14;
                    iWrite23 = i17;
                    iWrite31 = iWrite31;
                    iWrite30 = iWrite30;
                    iWrite4 = i16;
                    iWrite22 = i15;
                    iWrite6 = i313;
                    iWrite25 = i312;
                    iWrite26 = i314;
                    iWrite27 = i20;
                    iWrite2 = i3;
                    iWrite24 = i19;
                    iWrite28 = iWrite28;
                    iWrite7 = i319;
                    iWrite15 = i5;
                    arrayList = arrayList2;
                    iWrite13 = i2;
                    iWrite18 = i10;
                }
                break;
            case 3:
                return BannerJavascriptInterface._init_$lambda$0(((Double) obj).doubleValue());
            case 4:
                getEnterdhqQ8s getenterdhqq8s5 = (getEnterdhqQ8s) obj;
                int i410 = DeliveryService.serializer;
                getenterdhqq8s5.getClass();
                getenterdhqq8s5.write(true);
                int i411 = read + 63;
                serializer = i411 % Fields.SpotShadowColor;
                int i412 = i411 % 2;
                return createfromparcel;
            case 5:
                Timber.RemoteActionCompatParcelizer.getClass();
                return createfromparcel;
            case 6:
                Timber.RemoteActionCompatParcelizer.getClass();
                return createfromparcel;
            case 7:
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) obj;
                onviewattachedtowindowlambda1.getClass();
                Integer num2 = (Integer) onviewattachedtowindowlambda1.serializer;
                Long l2 = (Long) onviewattachedtowindowlambda1.write;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                l2.getClass();
                return new accessgetMovecp(iIntValue2, l2.longValue());
            case 8:
                onTouch ontouch5 = (onTouch) obj;
                ontouch5.getClass();
                ontouch5.MediaMetadataCompat = true;
                return createfromparcel;
            case 9:
                getEnterdhqQ8s getenterdhqq8s6 = (getEnterdhqQ8s) obj;
                getenterdhqq8s6.getClass();
                getenterdhqq8s6.write(true);
                return createfromparcel;
            case 10:
                getEnterdhqQ8s getenterdhqq8s7 = (getEnterdhqQ8s) obj;
                int i413 = GmsPushMessagingService.serializer;
                getenterdhqq8s7.getClass();
                getenterdhqq8s7.write(true);
                return createfromparcel;
            case 11:
                getEnterdhqQ8s getenterdhqq8s8 = (getEnterdhqQ8s) obj;
                int i414 = HmsPushMessagingService.RemoteActionCompatParcelizer;
                getenterdhqq8s8.getClass();
                getenterdhqq8s8.write(true);
                return createfromparcel;
            case 12:
                specifiesCanFocusProperty specifiescanfocusproperty2 = (specifiesCanFocusProperty) obj;
                specifiescanfocusproperty2.getClass();
                return specifiescanfocusproperty2.write();
            case 13:
                contains64dmado = (contains64DMado) obj;
                contains64dmado.getClass();
                if (contains64dmado.IconCompatParcelizer == getInsertedannotations.ASCENDING) {
                    str5 = "asc";
                } else {
                    str5 = "desc";
                }
                return contains64dmado.read.RemoteActionCompatParcelizer().concat(str5);
            case 14:
                final List list7 = (List) obj;
                list7.getClass();
                final int c3 = c == true ? 1 : 0;
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        Value valueIconCompatParcelizer;
                        ArrayValue arrayValue;
                        int i415 = c3;
                        List list8 = list7;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        int i416 = 0;
                        if (i415 == 0) {
                            nodeCoordinatorCompanionPointerInputSource1.getClass();
                            HashMap map = new HashMap(list8.size() / 2);
                            int i417 = TuplesKt.read(0, list8.size() - 1, 2);
                            if (i417 >= 0) {
                                while (true) {
                                    Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list8.get(i416)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                    if (valueIconCompatParcelizer2 == null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (!valueIconCompatParcelizer2.hasStringValue()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list8.get(i416 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                    if (valueIconCompatParcelizer3 == null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    String stringValue = valueIconCompatParcelizer2.getStringValue();
                                    stringValue.getClass();
                                    if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (i416 != i417) {
                                        i416 += 2;
                                    }
                                }
                            }
                            return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                        }
                        if (i415 == 1) {
                            nodeCoordinatorCompanionPointerInputSource1.getClass();
                            if (list8.size() != 2) {
                                getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list8.size()));
                                throw null;
                            }
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list8.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                            List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list8.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                            if (valuesList == null) {
                                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                            }
                            lValueOf.getClass();
                            long jLongValue = lValueOf.longValue();
                            if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                            }
                            if (jLongValue < 0) {
                                jLongValue += (long) valuesList.size();
                            }
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            Value value = valuesList.get((int) jLongValue);
                            value.getClass();
                            return new getDrawOLwlOKwannotations(value);
                        }
                        if (i415 != 2) {
                            Iterator it = list8.iterator();
                            while (it.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                if (i50 == -1 || i50 == 1) {
                                    i416 = 1;
                                } else {
                                    if (i50 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.write;
                                    }
                                }
                            }
                            return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                        }
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                            int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                            if (i51 == -1 || i51 == 1) {
                                i416 = 1;
                            } else {
                                if (i51 != 2) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                if (valueIconCompatParcelizer8.getBooleanValue()) {
                                    return getBringIntoViewOLwlOKw.read;
                                }
                            }
                        }
                        return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                    }
                };
            case 15:
                final List list8 = (List) obj;
                list8.getClass();
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        Value valueIconCompatParcelizer;
                        ArrayValue arrayValue;
                        int i415 = i25;
                        List list9 = list8;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        int i416 = 0;
                        if (i415 == 0) {
                            nodeCoordinatorCompanionPointerInputSource1.getClass();
                            HashMap map = new HashMap(list9.size() / 2);
                            int i417 = TuplesKt.read(0, list9.size() - 1, 2);
                            if (i417 >= 0) {
                                while (true) {
                                    Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list9.get(i416)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                    if (valueIconCompatParcelizer2 == null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (!valueIconCompatParcelizer2.hasStringValue()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list9.get(i416 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                    if (valueIconCompatParcelizer3 == null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    String stringValue = valueIconCompatParcelizer2.getStringValue();
                                    stringValue.getClass();
                                    if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (i416 != i417) {
                                        i416 += 2;
                                    }
                                }
                            }
                            return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                        }
                        if (i415 == 1) {
                            nodeCoordinatorCompanionPointerInputSource1.getClass();
                            if (list9.size() != 2) {
                                getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list9.size()));
                                throw null;
                            }
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list9.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                            List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list9.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                            if (valuesList == null) {
                                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                            }
                            lValueOf.getClass();
                            long jLongValue = lValueOf.longValue();
                            if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                            }
                            if (jLongValue < 0) {
                                jLongValue += (long) valuesList.size();
                            }
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            Value value = valuesList.get((int) jLongValue);
                            value.getClass();
                            return new getDrawOLwlOKwannotations(value);
                        }
                        if (i415 != 2) {
                            Iterator it = list9.iterator();
                            while (it.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                if (i50 == -1 || i50 == 1) {
                                    i416 = 1;
                                } else {
                                    if (i50 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.write;
                                    }
                                }
                            }
                            return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                        }
                        Iterator it2 = list9.iterator();
                        while (it2.hasNext()) {
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                            int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                            if (i51 == -1 || i51 == 1) {
                                i416 = 1;
                            } else {
                                if (i51 != 2) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                if (valueIconCompatParcelizer8.getBooleanValue()) {
                                    return getBringIntoViewOLwlOKw.read;
                                }
                            }
                        }
                        return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                    }
                };
            case 16:
                final List list9 = (List) obj;
                list9.getClass();
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        Value valueIconCompatParcelizer;
                        ArrayValue arrayValue;
                        int i415 = i22;
                        List list10 = list9;
                        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                        int i416 = 0;
                        if (i415 == 0) {
                            nodeCoordinatorCompanionPointerInputSource1.getClass();
                            HashMap map = new HashMap(list10.size() / 2);
                            int i417 = TuplesKt.read(0, list10.size() - 1, 2);
                            if (i417 >= 0) {
                                while (true) {
                                    Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(i416)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                    if (valueIconCompatParcelizer2 == null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (!valueIconCompatParcelizer2.hasStringValue()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(i416 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                    if (valueIconCompatParcelizer3 == null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    String stringValue = valueIconCompatParcelizer2.getStringValue();
                                    stringValue.getClass();
                                    if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (i416 != i417) {
                                        i416 += 2;
                                    }
                                }
                            }
                            return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                        }
                        if (i415 == 1) {
                            nodeCoordinatorCompanionPointerInputSource1.getClass();
                            if (list10.size() != 2) {
                                getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list10.size()));
                                throw null;
                            }
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                            List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                            Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                            if (valuesList == null) {
                                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                            }
                            lValueOf.getClass();
                            long jLongValue = lValueOf.longValue();
                            if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                            }
                            if (jLongValue < 0) {
                                jLongValue += (long) valuesList.size();
                            }
                            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                            Value value = valuesList.get((int) jLongValue);
                            value.getClass();
                            return new getDrawOLwlOKwannotations(value);
                        }
                        if (i415 != 2) {
                            Iterator it = list10.iterator();
                            while (it.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                if (i50 == -1 || i50 == 1) {
                                    i416 = 1;
                                } else {
                                    if (i50 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.write;
                                    }
                                }
                            }
                            return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                        }
                        Iterator it2 = list10.iterator();
                        while (it2.hasNext()) {
                            getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                            if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                return getBringIntoViewOLwlOKwannotations.serializer;
                            }
                            Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                            Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                            int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                            if (i51 == -1 || i51 == 1) {
                                i416 = 1;
                            } else {
                                if (i51 != 2) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                if (valueIconCompatParcelizer8.getBooleanValue()) {
                                    return getBringIntoViewOLwlOKw.read;
                                }
                            }
                        }
                        return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                    }
                };
            case 17:
                list = (List) obj;
                list.getClass();
                if (list.size() == 1) {
                    return new GestureNodeKt$$ExternalSyntheticLambda0((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), 4);
                }
                getRectManager.write("IsNull function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
                throw null;
            case 18:
                list2 = (List) obj;
                list2.getClass();
                if (list2.size() == 1) {
                    return new GestureNodeKt$$ExternalSyntheticLambda0((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list2.get(0), i25);
                }
                getRectManager.write("IsNotNull function should have exactly 1 params, but %d were given.", Integer.valueOf(list2.size()));
                throw null;
            case 19:
                list3 = (List) obj;
                list3.getClass();
                if (list3.size() % 2 == 0) {
                    return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getKeyInputOLwlOKwannotations
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj2) {
                            Value valueIconCompatParcelizer;
                            ArrayValue arrayValue;
                            int i415 = i26;
                            List list10 = list3;
                            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
                            int i416 = 0;
                            if (i415 == 0) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                HashMap map = new HashMap(list10.size() / 2);
                                int i417 = TuplesKt.read(0, list10.size() - 1, 2);
                                if (i417 >= 0) {
                                    while (true) {
                                        Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(i416)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer2 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer2.hasStringValue()) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        Value valueIconCompatParcelizer3 = ((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(i416 + 1)).invoke(nodeCoordinatorCompanionPointerInputSource1)).IconCompatParcelizer();
                                        if (valueIconCompatParcelizer3 == null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        String stringValue = valueIconCompatParcelizer2.getStringValue();
                                        stringValue.getClass();
                                        if (map.put(stringValue, valueIconCompatParcelizer3) != null) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (i416 != i417) {
                                            i416 += 2;
                                        }
                                    }
                                }
                                return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(map));
                            }
                            if (i415 == 1) {
                                nodeCoordinatorCompanionPointerInputSource1.getClass();
                                if (list10.size() != 2) {
                                    getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list10.size()));
                                    throw null;
                                }
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer4 = getbringintoviewolwlokw.IconCompatParcelizer();
                                List<Value> valuesList = (valueIconCompatParcelizer4 == null || !valueIconCompatParcelizer4.hasArrayValue() || (valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer()) == null || (arrayValue = valueIconCompatParcelizer.getArrayValue()) == null) ? null : arrayValue.getValuesList();
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list10.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                Value valueIconCompatParcelizer5 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                if (valueIconCompatParcelizer5 == null || !valueIconCompatParcelizer5.hasIntegerValue()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer6 = getbringintoviewolwlokw2.IconCompatParcelizer();
                                Long lValueOf = valueIconCompatParcelizer6 != null ? Long.valueOf(valueIconCompatParcelizer6.getIntegerValue()) : null;
                                if (valuesList == null) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                lValueOf.getClass();
                                long jLongValue = lValueOf.longValue();
                                if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
                                    return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
                                }
                                if (jLongValue < 0) {
                                    jLongValue += (long) valuesList.size();
                                }
                                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                                Value value = valuesList.get((int) jLongValue);
                                value.getClass();
                                return new getDrawOLwlOKwannotations(value);
                            }
                            if (i415 != 2) {
                                Iterator it = list10.iterator();
                                while (it.hasNext()) {
                                    getBringIntoViewOLwlOKw getbringintoviewolwlokw3 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                    if (getbringintoviewolwlokw3.RemoteActionCompatParcelizer()) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    Value valueIconCompatParcelizer7 = getbringintoviewolwlokw3.IconCompatParcelizer();
                                    Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer7 != null ? valueIconCompatParcelizer7.getValueTypeCase() : null;
                                    int i50 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                                    if (i50 == -1 || i50 == 1) {
                                        i416 = 1;
                                    } else {
                                        if (i50 != 2) {
                                            return getBringIntoViewOLwlOKwannotations.serializer;
                                        }
                                        if (!valueIconCompatParcelizer7.getBooleanValue()) {
                                            return getBringIntoViewOLwlOKw.write;
                                        }
                                    }
                                }
                                return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.read;
                            }
                            Iterator it2 = list10.iterator();
                            while (it2.hasNext()) {
                                getBringIntoViewOLwlOKw getbringintoviewolwlokw4 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
                                if (getbringintoviewolwlokw4.RemoteActionCompatParcelizer()) {
                                    return getBringIntoViewOLwlOKwannotations.serializer;
                                }
                                Value valueIconCompatParcelizer8 = getbringintoviewolwlokw4.IconCompatParcelizer();
                                Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer8 != null ? valueIconCompatParcelizer8.getValueTypeCase() : null;
                                int i51 = valueTypeCase2 == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                                if (i51 == -1 || i51 == 1) {
                                    i416 = 1;
                                } else {
                                    if (i51 != 2) {
                                        return getBringIntoViewOLwlOKwannotations.serializer;
                                    }
                                    if (valueIconCompatParcelizer8.getBooleanValue()) {
                                        return getBringIntoViewOLwlOKw.read;
                                    }
                                }
                            }
                            return i416 != 0 ? getBringIntoViewOLwlOKw.IconCompatParcelizer : getBringIntoViewOLwlOKw.write;
                        }
                    };
                }
                getRectManager.write("Function should have even number of params, but %d were given.", Integer.valueOf(list3.size()));
                throw null;
            case 20:
                String str7 = (String) obj;
                str7.getClass();
                Uri.parse(str7).getClass();
                return createfromparcel;
            case 21:
                getAutofillTree getautofilltree2 = (getAutofillTree) obj;
                getautofilltree2.getClass();
                return Boolean.valueOf(getautofilltree2 == getAutofillTree.Hidden ? i26 : 1);
            case 22:
                onTouch ontouch6 = (onTouch) obj;
                ontouch6.getClass();
                ontouch6.MediaDescriptionCompat = true;
                return createfromparcel;
            case 23:
                onTouch ontouch7 = (onTouch) obj;
                ontouch7.getClass();
                ontouch7.MediaDescriptionCompat = true;
                ontouch7.MediaSessionCompatQueueItem = true;
                return createfromparcel;
            case 24:
                onTouch ontouch8 = (onTouch) obj;
                ontouch8.getClass();
                ontouch8.MediaDescriptionCompat = true;
                ontouch8.MediaMetadataCompat = true;
                ontouch8.MediaSessionCompatQueueItem = true;
                return createfromparcel;
            case 25:
                return LogoutActivity.serializer((OnBackPressedCallback) obj);
            case 26:
                setToggleableState settoggleablestate5 = (setToggleableState) obj;
                settoggleablestate5.getClass();
                return settoggleablestate5.getType();
            case 27:
                setToggleableState settoggleablestate6 = (setToggleableState) obj;
                settoggleablestate6.getClass();
                return settoggleablestate6.getType();
            case 28:
                setToggleableState settoggleablestate7 = (setToggleableState) obj;
                settoggleablestate7.getClass();
                return settoggleablestate7.getType();
            default:
                setToggleableState settoggleablestate8 = (setToggleableState) obj;
                settoggleablestate8.getClass();
                return settoggleablestate8.getType();
        }
    }
}
