package o;

import android.content.Intent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.internal.EnumSerializer;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp;
        OnIsEnabledListener onIsEnabledListener;
        Boolean boolValueOf;
        String str;
        int i = 2 % 2;
        int i2 = serializer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj2 = this.read;
        switch (i3) {
            case 0:
                ((IOException) obj).getClass();
                TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
                ((r8lambdaMkSjJB1nMG37oUW_yupQha4) obj2).hasJournalErrors = true;
                return createfromparcel2;
            case 1:
                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = (r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) obj2;
                r8lambdaucgighn8fiyv_vccodeafjfpedk.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer((getUnregisteredInAppMessageannotations) r8lambdaucgighn8fiyv_vccodeafjfpedk);
                if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
                    setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
                } else {
                    DrawableTransformation.serializer(r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.read(r8lambdaucgighn8fiyv_vccodeafjfpedk));
                    setgraphicmodalmaxwidthdp = null;
                }
                return setgraphicmodalmaxwidthdp;
            case 2:
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                ontouch.MediaDescriptionCompat = true;
                Object objWrite = ((qdExternalSyntheticLambda0) obj2).serializer.write();
                objWrite.getClass();
                ontouch.PlaybackStateCompat = (prepareInAppMessageWithZippedAssetHtml) objWrite;
                return createfromparcel2;
            case 3:
                getSignedData getsigneddata = (getSignedData) obj2;
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT * FROM status LIMIT 1");
                try {
                    int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "id");
                    int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "status_type");
                    int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "status_text");
                    int iWrite4 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "description");
                    int iWrite5 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "action_type");
                    int iWrite6 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "action_text");
                    int iWrite7 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "action_url");
                    int iWrite8 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "timestamp");
                    if (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        int i4 = RemoteActionCompatParcelizer + 47;
                        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite);
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite2);
                        getsigneddata.getClass();
                        onIsEnabledListener = new OnIsEnabledListener(jSerializer, getSignedData.serializer(str2), uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite3), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite4) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite4), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite5) ? null : getSignedData.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite5)), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite6) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite6), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite7) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite7), uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite8));
                        break;
                    } else {
                        onIsEnabledListener = null;
                    }
                    return onIsEnabledListener;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 4:
                resolveClass resolveclass = (resolveClass) obj2;
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM work_opportunity");
                try {
                    int iWrite9 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "id");
                    int iWrite10 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "type");
                    int iWrite11 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "description");
                    int iWrite12 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "zone_name");
                    int iWrite13 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "zone_geo_json");
                    int iWrite14 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "center_geo_json");
                    int iWrite15 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "bonus_types");
                    int iWrite16 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "bonus_multiplier");
                    int iWrite17 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "calender_enabled");
                    int iWrite18 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "subzones");
                    int iWrite19 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "start_time");
                    ArrayList arrayList = new ArrayList();
                    while (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                        String str3 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite9);
                        String str4 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite10);
                        resolveclass.getClass();
                        onServiceConnected onserviceconnected = resolveClass.read(str4);
                        String str5 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite11);
                        String str6 = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite12) ? null : uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite12);
                        String str7 = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite13) ? null : uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite13);
                        String str8 = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite14) ? null : uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite14);
                        String str9 = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite15) ? null : uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite15);
                        String str10 = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite16) ? null : uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite16);
                        Integer numValueOf = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite17) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite17));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            int i6 = serializer + 83;
                            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i7 = i6 % 2;
                            boolValueOf = null;
                        }
                        List listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = DelayKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite18));
                        if (uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite19)) {
                            int i8 = serializer + 37;
                            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i8 % 2 != 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            str = null;
                        } else {
                            str = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite19);
                        }
                        arrayList.add(new OnLastDeeplinkReadListener(str3, onserviceconnected, str5, str6, str7, str8, str9, str10, boolValueOf, listR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, str));
                        break;
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                    return arrayList;
                } catch (Throwable th) {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                    throw th;
                }
            case 5:
                androidx.work.impl.WorkerWrapper.Builder builder = (androidx.work.impl.WorkerWrapper.Builder) obj2;
                onBackPressed onbackpressed = (onBackPressed) builder.RemoteActionCompatParcelizer;
                androidx.activity.ComponentActivity componentActivity = (androidx.activity.ComponentActivity) builder.write;
                runGuardedForResultandroid_sdk_base_release runguardedforresultandroid_sdk_base_release = (runGuardedForResultandroid_sdk_base_release) obj;
                runguardedforresultandroid_sdk_base_release.getClass();
                if (runguardedforresultandroid_sdk_base_release instanceof setExternalIEventMessengerandroid_sdk_base_release) {
                    accessisMainThread accessismainthread = (accessisMainThread) builder.IconCompatParcelizer;
                    IdentityVerificationParams identityVerificationParamsSerializer = ((setExternalIEventMessengerandroid_sdk_base_release) runguardedforresultandroid_sdk_base_release).serializer();
                    accessismainthread.getClass();
                    componentActivity.getClass();
                    onbackpressed.getClass();
                    Intent intent = new Intent(componentActivity, (Class<?>) IdentityVerificationActivity.class);
                    intent.putExtra("identity-verification-params", identityVerificationParamsSerializer);
                    onbackpressed.write(intent);
                } else if (runguardedforresultandroid_sdk_base_release instanceof setDeviceIdProviderandroid_sdk_base_release) {
                    Path$Companion path$Companion = (Path$Companion) builder.MediaMetadataCompat;
                    boolean zSerializer = ((setDeviceIdProviderandroid_sdk_base_release) runguardedforresultandroid_sdk_base_release).serializer();
                    path$Companion.getClass();
                    componentActivity.getClass();
                    onbackpressed.getClass();
                    Intent intentPutExtra = new Intent(componentActivity, (Class<?>) LivenessDetectionActivity.class).putExtra("is_dismissable", zSerializer);
                    intentPutExtra.getClass();
                    onbackpressed.write(intentPutExtra);
                } else {
                    if (!runguardedforresultandroid_sdk_base_release.equals(setConfigurationProviderandroid_sdk_base_release.read)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i9 = serializer + 5;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    ((requestLocationInitialization) builder.read).invoke();
                }
                return createfromparcel2;
            case 6:
                resetLayoutParamsIfAppropriate resetlayoutparamsifappropriate = (resetLayoutParamsIfAppropriate) obj2;
                r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = (r8lambdaXTprrz59IiooUoChp937ds3kuBc) obj;
                r8lambdaxtprrz59iioouochp937ds3kubc.getClass();
                r8lambdaxtprrz59iioouochp937ds3kubc.write("type", beforeInAppMessageViewClosed.read);
                r8lambdaxtprrz59iioouochp937ds3kubc.write("value", RangesKt.read("kotlinx.serialization.Polymorphic<" + ((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) resetlayoutparamsifappropriate.read).IconCompatParcelizer() + '>', createInAppMessageViewlambda10.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0]));
                List list = resetlayoutparamsifappropriate.RemoteActionCompatParcelizer;
                list.getClass();
                r8lambdaxtprrz59iioouochp937ds3kubc.write = list;
                return createfromparcel2;
            default:
                r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc2 = (r8lambdaXTprrz59IiooUoChp937ds3kuBc) obj;
                r8lambdaxtprrz59iioouochp937ds3kubc2.getClass();
                List list2 = (List) ((EnumSerializer) obj2).write;
                list2.getClass();
                r8lambdaxtprrz59iioouochp937ds3kubc2.write = list2;
                return createfromparcel2;
        }
    }
}
