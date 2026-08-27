package com.roadrunner.tnc;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SnackbarKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.fragment.app.FragmentActivity;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.recentdeliveries.presentation.components.DeliveryItemsKt;
import com.roadrunner.rider.state.currentshift.presentation.CurrentShiftV2Kt;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import com.roadrunner.sidemenu.accordion.AccordionContentKt;
import com.roadrunner.sidemenu.menuitems.MenuItemContentKt;
import com.roadrunner.sidemenu.photoId.PhotoIdContainerKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ReferrerDetails;
import o.TextFieldDefaults;
import o._get_deviceId_lambda0;
import o.accessgetInstancedelegatecp;
import o.accessnotifyInvalidation;
import o.buildMapping;
import o.checkSdkClickResponseI;
import o.createFromParcel;
import o.ddefault;
import o.disableAppSetIdReading;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getOnAttributionChangedListener;
import o.getPostalCode;
import o.getQueryContext;
import o.handleUrlOverridelambda1;
import o.isInitialized;
import o.markAsRead;
import o.onContentCardDismissed;
import o.onFailure;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.onVirtualViewTranslationResponseslambda0;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.q4ExternalSyntheticLambda9;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdakakRSJ0yRWnWIggdAd9IDPYuM;
import o.r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc;
import o.r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8;
import o.r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4;
import o.readContentProvider;
import o.recordGeofenceTransitionlambda0;
import o.recordGeofenceTransitionlambda1;
import o.reenqueueInAppMessagelambda0;
import o.refreshFeatureFlagslambda0;
import o.registerFacebookSDKJSInterface;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setApplicationContext;
import o.setCurrentSemanticsNodesui;
import o.setHttpsURLConnectionProvider;
import o.setRootAutofillId;
import o.setWebView;
import o.supportingTextPaddinga9UjIt4material3default;
import o.teardownAllGlobalParametersS;
import o.u6;
import o.xb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TncComposableFactoryImpl$$ExternalSyntheticLambda0 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ TncComposableFactoryImpl$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0302  */
    /* JADX WARN: Code duplicated, block: B:103:0x030c  */
    /* JADX WARN: Code duplicated, block: B:106:0x031a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0353  */
    /* JADX WARN: Code duplicated, block: B:115:0x035f  */
    /* JADX WARN: Code duplicated, block: B:117:0x036b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0375  */
    /* JADX WARN: Code duplicated, block: B:125:0x0385  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c A[PHI: r11 r12 r13
  0x003c: PHI (r11v13 o.AndroidContentCaptureManager) = (r11v0 o.AndroidContentCaptureManager), (r11v16 o.AndroidContentCaptureManager) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r12v16 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r13v21 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:138:0x03cc A[LOOP:2: B:136:0x03c6->B:138:0x03cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x041e A[LOOP:1: B:141:0x03e7->B:146:0x041e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0424  */
    /* JADX WARN: Code duplicated, block: B:150:0x0427  */
    /* JADX WARN: Code duplicated, block: B:153:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x043a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0452  */
    /* JADX WARN: Code duplicated, block: B:158:0x0456 A[PHI: r11 r12 r13
  0x0456: PHI (r11v9 o.AndroidContentCaptureManager) = (r11v0 o.AndroidContentCaptureManager), (r11v16 o.AndroidContentCaptureManager) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0456: PHI (r12v7 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0456: PHI (r13v9 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:161:0x0497  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a9 A[PHI: r12 r13
  0x04a9: PHI (r12v4 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x04a9: PHI (r13v7 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:167:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:170:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:172:0x04dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x04df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:176:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:177:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:178:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:179:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:180:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:183:0x052d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0534  */
    /* JADX WARN: Code duplicated, block: B:186:0x0538  */
    /* JADX WARN: Code duplicated, block: B:189:0x0570  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086 A[PHI: r12 r13
  0x0086: PHI (r12v15 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0086: PHI (r13v19 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:190:0x0574  */
    /* JADX WARN: Code duplicated, block: B:193:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:194:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:197:0x06af  */
    /* JADX WARN: Code duplicated, block: B:199:0x0702  */
    /* JADX WARN: Code duplicated, block: B:200:0x0712  */
    /* JADX WARN: Code duplicated, block: B:202:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:204:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:206:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:209:0x07c7 A[PHI: r12 r13
  0x07c7: PHI (r12v3 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x07c7: PHI (r13v5 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a3 A[PHI: r11 r12 r13
  0x00a3: PHI (r11v11 o.AndroidContentCaptureManager) = (r11v0 o.AndroidContentCaptureManager), (r11v16 o.AndroidContentCaptureManager) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r12v11 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r13v17 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x07e9 A[PHI: r12 r13
  0x07e9: PHI (r12v2 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x07e9: PHI (r13v3 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:213:0x0812  */
    /* JADX WARN: Code duplicated, block: B:217:0x0837  */
    /* JADX WARN: Code duplicated, block: B:218:0x0843  */
    /* JADX WARN: Code duplicated, block: B:221:0x0858  */
    /* JADX WARN: Code duplicated, block: B:222:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:226:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:229:0x0909  */
    /* JADX WARN: Code duplicated, block: B:233:0x090f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0911  */
    /* JADX WARN: Code duplicated, block: B:237:0x091c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:240:0x0928  */
    /* JADX WARN: Code duplicated, block: B:242:0x0948  */
    /* JADX WARN: Code duplicated, block: B:244:0x094c A[PHI: r12 r13
  0x094c: PHI (r12v1 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x094c: PHI (r13v1 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0422 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[LOOP:3: B:118:0x036f->B:254:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0145  */
    /* JADX WARN: Code duplicated, block: B:40:0x016a A[PHI: r12 r13
  0x016a: PHI (r12v10 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x016a: PHI (r13v15 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0189 A[PHI: r12 r13
  0x0189: PHI (r12v9 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0189: PHI (r13v13 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01be  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x0204  */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:68:0x0220  */
    /* JADX WARN: Code duplicated, block: B:70:0x0238  */
    /* JADX WARN: Code duplicated, block: B:72:0x023c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0252  */
    /* JADX WARN: Code duplicated, block: B:75:0x0256  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0028 A[PHI: r12 r13
  0x0028: PHI (r12v18 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r13v24 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:85:0x02bf A[PHI: r11 r12 r13
  0x02bf: PHI (r11v10 o.AndroidContentCaptureManager) = (r11v0 o.AndroidContentCaptureManager), (r11v16 o.AndroidContentCaptureManager) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x02bf: PHI (r12v8 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x02bf: PHI (r13v11 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:8:0x002b A[PHI: r11 r12 r13
  0x002b: PHI (r11v14 o.AndroidContentCaptureManager) = (r11v0 o.AndroidContentCaptureManager), (r11v16 o.AndroidContentCaptureManager) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r12v17 o.createFromParcel) = (r12v0 o.createFromParcel), (r12v19 o.createFromParcel) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r13v23 java.lang.Object) = (r13v0 java.lang.Object), (r13v26 java.lang.Object) binds: [B:10:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0300  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AndroidContentCaptureManager androidContentCaptureManager;
        createFromParcel createfromparcel;
        Object obj4;
        onFailure onfailure;
        ddefault ddefaultVar;
        Context context;
        disableAppSetIdReading disableappsetidreading;
        int iIntValue;
        boolean z;
        getPostalCode getpostalcode;
        boolean zWrite;
        getAddressCountry getaddresscountry;
        int i;
        int i2;
        Modifier.Companion companion;
        float f;
        FlingCancellationException flingCancellationException;
        Alignment.Companion companion2;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        float f2;
        int i3;
        float f3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3;
        TextAlign.Companion companion4;
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui;
        boolean z2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4;
        int i4;
        NetworkBody networkBody;
        getPostalCode getpostalcode2;
        FragmentActivity fragmentActivityRemoteActionCompatParcelizer;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity;
        ReferrerDetails referrerDetails;
        String str;
        getBirthDateFull getbirthdatefull;
        int iIntValue2;
        boolean z3;
        getPostalCode getpostalcode3;
        Iterator it;
        Object next;
        markAsRead markasread;
        ArrayList arrayList;
        readContentProvider readcontentprovider;
        String str2;
        String str3;
        boolean z4;
        Object objComponentActivity2;
        int i5;
        ArrayList arrayList2;
        Iterator it2;
        Iterator it3;
        int i6;
        int i7;
        boolean z5;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity3;
        int i8;
        int i9;
        onViewAttachedToWindow onviewattachedtowindow;
        setRootAutofillId setrootautofillid;
        getBirthDateFull getbirthdatefull2;
        int iIntValue3;
        boolean z6;
        getPostalCode getpostalcode4;
        Object value;
        setWebView setwebview;
        boolean z7;
        long lifecycle;
        long actionView;
        r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum;
        getPostalCode getpostalcode5;
        boolean zIconCompatParcelizer4;
        Object objComponentActivity4;
        boolean zIconCompatParcelizer5;
        Object objComponentActivity5;
        boolean zIconCompatParcelizer6;
        Object objComponentActivity6;
        boolean zIconCompatParcelizer7;
        Object objComponentActivity7;
        GetAppStateImpl getAppStateImpl;
        getPostalCode getpostalcode6;
        FragmentActivity fragmentActivityRemoteActionCompatParcelizer2;
        boolean zIconCompatParcelizer8;
        boolean zIconCompatParcelizer9;
        Object objComponentActivity8;
        reenqueueInAppMessagelambda0 reenqueueinappmessagelambda0;
        refreshFeatureFlagslambda0 refreshfeatureflagslambda0;
        getBirthDateFull getbirthdatefull3;
        int iIntValue4;
        boolean z8;
        getPostalCode getpostalcode7;
        boolean zIconCompatParcelizer10;
        Object objComponentActivity9;
        accessnotifyInvalidation accessnotifyinvalidation;
        int iIntValue5;
        int i10;
        boolean z9;
        getPostalCode getpostalcode8;
        int i11 = 2 % 2;
        int i12 = serializer + 85;
        read = i12 % Fields.SpotShadowColor;
        int i13 = 4;
        int i14 = 17;
        Object obj5 = null;
        int i15 = 0;
        if (i12 % 2 == 0) {
            int i16 = this.write;
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            createfromparcel = createFromParcel.INSTANCE;
            obj4 = this.RemoteActionCompatParcelizer;
            switch (i16) {
                case 0:
                    reenqueueinappmessagelambda0 = (reenqueueInAppMessagelambda0) obj4;
                    refreshfeatureflagslambda0 = (refreshFeatureFlagslambda0) obj;
                    getbirthdatefull3 = (getBirthDateFull) obj2;
                    iIntValue4 = ((Integer) obj3).intValue();
                    refreshfeatureflagslambda0.getClass();
                    if ((iIntValue4 & 6) == 0) {
                        int i17 = serializer + 83;
                        read = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        iIntValue4 |= ((getPostalCode) getbirthdatefull3).read(refreshfeatureflagslambda0) ? 4 : 2;
                    }
                    if ((iIntValue4 & 19) != 18) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    getpostalcode7 = (getPostalCode) getbirthdatefull3;
                    if (getpostalcode7.write(iIntValue4 & 1, z8)) {
                        zIconCompatParcelizer10 = getpostalcode7.IconCompatParcelizer(reenqueueinappmessagelambda0);
                        objComponentActivity9 = getpostalcode7.ComponentActivity();
                        if (zIconCompatParcelizer10 || objComponentActivity9 == androidContentCaptureManager) {
                            objComponentActivity9 = new recordGeofenceTransitionlambda1(2, reenqueueinappmessagelambda0, reenqueueInAppMessagelambda0.class, "navigateToAuthWeb", "navigateToAuthWeb(Lcom/roadrunner/tnc/api/TncAction$OpenAuthWebView;Landroidx/fragment/app/FragmentActivity;)V", 0, 0);
                            getpostalcode7.write(objComponentActivity9);
                        }
                        recordGeofenceTransitionlambda0.RemoteActionCompatParcelizer(refreshfeatureflagslambda0, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity9), getpostalcode7, iIntValue4 & 14);
                    } else {
                        getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                case 1:
                    accessnotifyinvalidation = (accessnotifyInvalidation) obj4;
                    getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                    iIntValue5 = ((Integer) obj3).intValue();
                    ((ModalBottomSheetDialogWrapper) obj).getClass();
                    if ((iIntValue5 & 17) != 16) {
                        int i19 = serializer + 1;
                        read = i19 % Fields.SpotShadowColor;
                        i10 = 2;
                        int i20 = i19 % 2;
                        z9 = true;
                    } else {
                        i10 = 2;
                        z9 = false;
                    }
                    int i21 = serializer + 55;
                    read = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % i10;
                    getpostalcode8 = (getPostalCode) getbirthdatefull4;
                    if (getpostalcode8.write(1 & iIntValue5, z9)) {
                        Modifier.Companion companion5 = Modifier.Companion;
                        float f4 = Dimensions.setMenu;
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode8, SizeKt.m75height3ABfNKs(companion5, f4)});
                        TextKt.m131TextNvy7gAk(accessnotifyinvalidation.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode8.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper(), 0L, FontWeight.Companion.getSemiBold(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode8, 1572864, 0, 131002);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode8, SizeKt.m75height3ABfNKs(companion5, f4)});
                    } else {
                        getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                case 2:
                    onfailure = (onFailure) obj4;
                    String str4 = (String) obj;
                    ddefaultVar = (ddefault) obj2;
                    int iIntValue6 = ((Integer) obj3).intValue();
                    str4.getClass();
                    ddefaultVar.getClass();
                    context = onfailure.IconCompatParcelizer;
                    Toast.makeText(context, str4, iIntValue6).show();
                    if (ddefaultVar.equals(ddefault.IconCompatParcelizer)) {
                        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = onfailure.ParcelableVolumeInfo;
                        context.getClass();
                        q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(q4externalsyntheticlambda9, context, null, null, 28);
                    }
                    return createfromparcel;
                case 3:
                    ((Integer) obj3).getClass();
                    ((AnimatedVisibilityScope) obj).getClass();
                    DeliveryItemsKt.DeliveryItems(removeNodeAtDepth.RemoteActionCompatParcelizer(((teardownAllGlobalParametersS) obj4).write), null, (getBirthDateFull) obj2, 0);
                    return createfromparcel;
                case 4:
                    disableappsetidreading = (disableAppSetIdReading) obj4;
                    getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                    iIntValue = ((Integer) obj3).intValue();
                    ((ModalBottomSheetDialogWrapper) obj).getClass();
                    if ((iIntValue & 17) != 16) {
                        z = true;
                    } else {
                        z = false;
                    }
                    getpostalcode = (getPostalCode) getbirthdatefull5;
                    zWrite = getpostalcode.write(iIntValue & 1, z);
                    getaddresscountry = getpostalcode.read;
                    if (zWrite) {
                        i = getOnAttributionChangedListener.write[disableappsetidreading.MediaBrowserCompatMediaItem.ordinal()];
                        if (i != 1) {
                            i2 = R.drawable.ic_emoji_grin;
                        } else if (i != 2) {
                            i2 = R.drawable.ic_emoji_sad;
                        } else {
                            if (i == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            i4 = serializer + 81;
                            read = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                            i2 = R.drawable.ic_emoji_slightly_smiling;
                        }
                        companion = Modifier.Companion;
                        Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                        f = Dimensions.setHideOnContentScrollEnabled;
                        Modifier modifierWrite2 = PaddingKt.write(modifierWrite, f);
                        flingCancellationException = Arrangement.MediaDescriptionCompat;
                        companion2 = Alignment.Companion;
                        modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                        companion3 = ComposeUiNode.Companion;
                        constructor = companion3.getConstructor();
                        if (getaddresscountry != null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        Modifier modifierWrite3 = SizeKt.write(companion, 1.0f);
                        playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
                        int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
                        constructor2 = companion3.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor2);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                        f2 = Dimensions.setLogo;
                        Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion, f2);
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(i2, getpostalcode, 0);
                        String str5 = disableappsetidreading.MediaMetadataCompat;
                        i3 = Painter.$stable;
                        ImageKt.Image(painterPainterResource, str5, modifierM83size3ABfNKs, null, null, 0.0f, null, getpostalcode, i3, 120);
                        f3 = Dimensions.setMenu;
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f3)});
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
                        int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
                        constructor3 = companion3.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor3);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                        String str6 = disableappsetidreading.MediaMetadataCompat;
                        TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                        companion4 = TextAlign.Companion;
                        int iM3516getStarte0LSkKk = companion4.m3516getStarte0LSkKk();
                        setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                        TextKt.m131TextNvy7gAk(str6, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 130042);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f3)});
                        TextKt.m131TextNvy7gAk(disableappsetidreading.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 130042);
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(true);
                        if (disableappsetidreading.IconCompatParcelizer != null) {
                            getpostalcode.serializer(-2105432543);
                            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                            Modifier modifierWrite4 = SizeKt.write(companion, 1.0f);
                            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
                            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite4);
                            constructor4 = companion3.getConstructor();
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                int i23 = serializer + 23;
                                read = i23 % Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                getpostalcode.serializer(constructor4);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_emoji_light_bulb, getpostalcode, 0), disableappsetidreading.IconCompatParcelizer, SizeKt.m83size3ABfNKs(companion, f2), null, null, 0.0f, null, getpostalcode, i3, 120);
                            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f3)});
                            TextKt.m131TextNvy7gAk(disableappsetidreading.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 130042);
                            z2 = true;
                            getpostalcode.IconCompatParcelizer(true);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            createfromparcel = createfromparcel;
                            z2 = true;
                            getpostalcode.serializer(-2104586863);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        getpostalcode.IconCompatParcelizer(z2);
                    } else {
                        createfromparcel = createfromparcel;
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                case 5:
                    networkBody = (NetworkBody) obj4;
                    setHttpsURLConnectionProvider sethttpsurlconnectionprovider = (setHttpsURLConnectionProvider) obj;
                    int iIntValue7 = ((Integer) obj3).intValue();
                    sethttpsurlconnectionprovider.getClass();
                    getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj2);
                    fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    xb xbVar = (xb) networkBody.IconCompatParcelizer;
                    u6 u6Var = (u6) networkBody.RemoteActionCompatParcelizer;
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(networkBody);
                    zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    if (!(zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new checkSdkClickResponseI(networkBody, fragmentActivityRemoteActionCompatParcelizer, 3);
                        getpostalcode2.write(objComponentActivity);
                    }
                    CurrentShiftV2Kt.CurrentShiftV2(sethttpsurlconnectionprovider, xbVar, u6Var, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, null, getpostalcode2, iIntValue7 & 14);
                    return createfromparcel;
                case 6:
                    referrerDetails = (ReferrerDetails) obj4;
                    str = (String) obj;
                    getbirthdatefull = (getBirthDateFull) obj2;
                    iIntValue2 = ((Integer) obj3).intValue();
                    str.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        i9 = serializer + 93;
                        read = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            int i25 = 97 / 0;
                            if (!((getPostalCode) getbirthdatefull).read(str)) {
                                i13 = 2;
                            }
                        } else if (!((getPostalCode) getbirthdatefull).read(str)) {
                            i13 = 2;
                        }
                        iIntValue2 |= i13;
                    }
                    if ((iIntValue2 & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    getpostalcode3 = (getPostalCode) getbirthdatefull;
                    if (getpostalcode3.write(iIntValue2 & 1, z3)) {
                        it = referrerDetails.RemoteActionCompatParcelizer.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            markasread = (markAsRead) next;
                            if (markasread != null) {
                                arrayList = markasread.write;
                                if (str.equals(referrerDetails.IconCompatParcelizer())) {
                                    str2 = (String) ((onShowTranslationui) referrerDetails.write).getValue();
                                } else {
                                    for (Object obj6 : arrayList) {
                                        if (((readContentProvider) obj6).read) {
                                            obj5 = obj6;
                                            readcontentprovider = (readContentProvider) obj5;
                                            if (readcontentprovider == null) {
                                                int i26 = serializer + 23;
                                                read = i26 % Fields.SpotShadowColor;
                                                int i27 = i26 % 2;
                                                readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                            }
                                            str2 = readcontentprovider.IconCompatParcelizer.read;
                                        }
                                    }
                                    readcontentprovider = (readContentProvider) obj5;
                                    if (readcontentprovider == null) {
                                        int i28 = serializer + 23;
                                        read = i28 % Fields.SpotShadowColor;
                                        int i29 = i28 % 2;
                                        readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                    }
                                    str2 = readcontentprovider.IconCompatParcelizer.read;
                                }
                                str3 = str2;
                                z4 = getpostalcode3.read((Object) arrayList);
                                objComponentActivity2 = getpostalcode3.ComponentActivity();
                                i5 = 10;
                                if (z4) {
                                    arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                    }
                                    objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                    getpostalcode3.write(objComponentActivity2);
                                } else {
                                    i8 = serializer + 97;
                                    read = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 == 0) {
                                        int i30 = 51 / 0;
                                        if (objComponentActivity2 == androidContentCaptureManager) {
                                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                            it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                            }
                                            objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                            getpostalcode3.write(objComponentActivity2);
                                        }
                                    } else if (objComponentActivity2 == androidContentCaptureManager) {
                                        arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                        it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                        }
                                        objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                        getpostalcode3.write(objComponentActivity2);
                                    }
                                }
                                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objComponentActivity2;
                                it3 = arrayList.iterator();
                                i6 = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        i6 = -1;
                                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((readContentProvider) it3.next()).IconCompatParcelizer.read, str3}, getCieXyz.write())).booleanValue()) {
                                        i6++;
                                    }
                                }
                                if (i6 < 0) {
                                    i7 = 0;
                                } else {
                                    i7 = i6;
                                }
                                z5 = getpostalcode3.read(referrerDetails);
                                zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(arrayList);
                                objComponentActivity3 = getpostalcode3.ComponentActivity();
                                if (!(z5 | zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                                    objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                                    getpostalcode3.write(objComponentActivity3);
                                }
                                DualColumnTimePickerKt.TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str3, i7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, getpostalcode3, 0, 16);
                            }
                        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((markAsRead) next).serializer.read, str}, getCieXyz.write())).booleanValue());
                        markasread = (markAsRead) next;
                        if (markasread != null) {
                            arrayList = markasread.write;
                            if (str.equals(referrerDetails.IconCompatParcelizer())) {
                                str2 = (String) ((onShowTranslationui) referrerDetails.write).getValue();
                            } else {
                                while (r0.hasNext()) {
                                    if (((readContentProvider) obj6).read) {
                                        obj5 = obj6;
                                        readcontentprovider = (readContentProvider) obj5;
                                        if (readcontentprovider == null) {
                                            int i210 = serializer + 23;
                                            read = i210 % Fields.SpotShadowColor;
                                            int i211 = i210 % 2;
                                            readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                        }
                                        str2 = readcontentprovider.IconCompatParcelizer.read;
                                    }
                                }
                                readcontentprovider = (readContentProvider) obj5;
                                if (readcontentprovider == null) {
                                    int i212 = serializer + 23;
                                    read = i212 % Fields.SpotShadowColor;
                                    int i213 = i212 % 2;
                                    readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                }
                                str2 = readcontentprovider.IconCompatParcelizer.read;
                            }
                            str3 = str2;
                            z4 = getpostalcode3.read((Object) arrayList);
                            objComponentActivity2 = getpostalcode3.ComponentActivity();
                            i5 = 10;
                            if (z4) {
                                i8 = serializer + 97;
                                read = i8 % Fields.SpotShadowColor;
                                if (i8 % 2 == 0) {
                                    int i31 = 51 / 0;
                                    if (objComponentActivity2 == androidContentCaptureManager) {
                                        arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                        it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                        }
                                        objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                        getpostalcode3.write(objComponentActivity2);
                                    }
                                } else if (objComponentActivity2 == androidContentCaptureManager) {
                                    arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                    }
                                    objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                    getpostalcode3.write(objComponentActivity2);
                                }
                            } else {
                                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                }
                                objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                getpostalcode3.write(objComponentActivity2);
                            }
                            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objComponentActivity2;
                            it3 = arrayList.iterator();
                            i6 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    i6 = -1;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((readContentProvider) it3.next()).IconCompatParcelizer.read, str3}, getCieXyz.write())).booleanValue()) {
                                    i6++;
                                }
                            }
                            if (i6 < 0) {
                                i7 = 0;
                            } else {
                                i7 = i6;
                            }
                            z5 = getpostalcode3.read(referrerDetails);
                            zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(arrayList);
                            objComponentActivity3 = getpostalcode3.ComponentActivity();
                            if (z5 || zIconCompatParcelizer3) {
                                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                                getpostalcode3.write(objComponentActivity3);
                            } else {
                                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                                getpostalcode3.write(objComponentActivity3);
                            }
                            DualColumnTimePickerKt.TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, str3, i7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, getpostalcode3, 0, 16);
                        }
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                case 7:
                    onviewattachedtowindow = (onViewAttachedToWindow) obj4;
                    setrootautofillid = (setRootAutofillId) obj;
                    getbirthdatefull2 = (getBirthDateFull) obj2;
                    iIntValue3 = ((Integer) obj3).intValue();
                    setrootautofillid.getClass();
                    if ((iIntValue3 & 6) == 0) {
                        iIntValue3 |= ((getPostalCode) getbirthdatefull2).read(setrootautofillid) ? 4 : 2;
                    }
                    if ((iIntValue3 & 19) != 18) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    getpostalcode4 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode4.write(iIntValue3 & 1, z6)) {
                        value = onviewattachedtowindow.getValue();
                        if (value != null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("snackbarType cannot be null while calling RoadrunnerSnackbarHost");
                            return null;
                        }
                        setwebview = (setWebView) value;
                        Modifier modifierWrite5 = PaddingKt.write(Modifier.Companion, Dimensions.getActionBarHideOffset);
                        z7 = setwebview instanceof setApplicationContext;
                        if (z7) {
                            getpostalcode4.serializer(-705914109);
                            lifecycle = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getViewModelStore();
                            getpostalcode4.IconCompatParcelizer(false);
                        } else if (setwebview instanceof isInitialized) {
                            getpostalcode4.serializer(-705911387);
                            lifecycle = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getOnBackPressedDispatcher();
                            getpostalcode4.IconCompatParcelizer(false);
                        } else {
                            if (setwebview instanceof registerFacebookSDKJSInterface) {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode4, -705915485, false);
                            }
                            getpostalcode4.serializer(-705908605);
                            lifecycle = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getLifecycle();
                            getpostalcode4.IconCompatParcelizer(false);
                        }
                        long j = lifecycle;
                        if (z7) {
                            getpostalcode4.serializer(-1375179682);
                            actionView = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSplitBackground();
                            getpostalcode4.IconCompatParcelizer(false);
                        } else if (setwebview instanceof isInitialized) {
                            getpostalcode4.serializer(-1375177152);
                            actionView = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setStackedBackground();
                            getpostalcode4.IconCompatParcelizer(false);
                        } else {
                            if (setwebview instanceof registerFacebookSDKJSInterface) {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode4, -1375181070, false);
                            }
                            int i32 = read + 73;
                            serializer = i32 % Fields.SpotShadowColor;
                            int i33 = i32 % 2;
                            getpostalcode4.serializer(-1375174562);
                            actionView = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getActionView();
                            getpostalcode4.IconCompatParcelizer(false);
                        }
                        SnackbarKt.serializer(modifierWrite5, ExtrasKt.write(-106020066, new SnackbarKt$$ExternalSyntheticLambda2(setrootautofillid, i15, setwebview), getpostalcode4), null, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding), j, actionView, 0L, 0L, ExtrasKt.write(-354830554, new StringsKt__StringsKt$$ExternalSyntheticLambda1(i14, setrootautofillid), getpostalcode4), getpostalcode4, 805306416, 396);
                    } else {
                        getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                case 8:
                    r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk r8lambdafoipryykxsg19oxlsccw3x8q4qk = (r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) obj;
                    int iIntValue8 = ((Integer) obj3).intValue();
                    r8lambdafoipryykxsg19oxlsccw3x8q4qk.getClass();
                    AccordionContentKt.serializer(r8lambdafoipryykxsg19oxlsccw3x8q4qk, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) ((GetAppStateImpl) obj4).serializer, null, (getBirthDateFull) obj2, iIntValue8 & 14);
                    return createfromparcel;
                case 9:
                    r8lambdakakrsj0yrwnwiggdad9idpyum = (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) obj4;
                    r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc r8lambdalr5sl_tss1jct7wrmz_9di0rarc = (r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) obj;
                    int iIntValue9 = ((Integer) obj3).intValue();
                    r8lambdalr5sl_tss1jct7wrmz_9di0rarc.getClass();
                    getpostalcode5 = (getPostalCode) ((getBirthDateFull) obj2);
                    zIconCompatParcelizer4 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                    objComponentActivity4 = getpostalcode5.ComponentActivity();
                    if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                        recordGeofenceTransitionlambda1 recordgeofencetransitionlambda1 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToAuthWeb", "navigateToAuthWeb(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenAuthWebView;Landroidx/fragment/app/FragmentActivity;)V", 0, 2);
                        getpostalcode5.write(recordgeofencetransitionlambda1);
                        objComponentActivity4 = recordgeofencetransitionlambda1;
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
                    zIconCompatParcelizer5 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                    objComponentActivity5 = getpostalcode5.ComponentActivity();
                    if (zIconCompatParcelizer5 || objComponentActivity5 == androidContentCaptureManager) {
                        recordGeofenceTransitionlambda1 recordgeofencetransitionlambda2 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToDeepLink", "navigateToDeepLink(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenDeepLink;Landroidx/fragment/app/FragmentActivity;)V", 0, 3);
                        getpostalcode5.write(recordgeofencetransitionlambda2);
                        objComponentActivity5 = recordgeofencetransitionlambda2;
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                    zIconCompatParcelizer6 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                    objComponentActivity6 = getpostalcode5.ComponentActivity();
                    if (zIconCompatParcelizer6 || objComponentActivity6 == androidContentCaptureManager) {
                        recordGeofenceTransitionlambda1 recordgeofencetransitionlambda3 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToExternalUrl", "navigateToExternalUrl(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenExternalUrl;Landroidx/fragment/app/FragmentActivity;)V", 0, 4);
                        getpostalcode5.write(recordgeofencetransitionlambda3);
                        objComponentActivity6 = recordgeofencetransitionlambda3;
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity6);
                    zIconCompatParcelizer7 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                    objComponentActivity7 = getpostalcode5.ComponentActivity();
                    if (zIconCompatParcelizer7 || objComponentActivity7 == androidContentCaptureManager) {
                        JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "openSettingsScreen", "openSettingsScreen(Landroidx/fragment/app/FragmentActivity;)V", 0, 11);
                        getpostalcode5.write(jobKt__JobKt$invokeOnCompletion$1);
                        objComponentActivity7 = jobKt__JobKt$invokeOnCompletion$1;
                    }
                    onVirtualViewTranslationResponseslambda0.read(r8lambdalr5sl_tss1jct7wrmz_9di0rarc, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity7), getpostalcode5, iIntValue9 & 14);
                    return createfromparcel;
                case 10:
                    r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8 r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8 = (r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8) obj;
                    int iIntValue10 = ((Integer) obj3).intValue();
                    r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.getClass();
                    MenuItemContentKt.serializer(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8, ((r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) obj4).RemoteActionCompatParcelizer, null, (getBirthDateFull) obj2, iIntValue10 & 14);
                    return createfromparcel;
                case 11:
                    getAppStateImpl = (GetAppStateImpl) obj4;
                    _get_deviceId_lambda0 _get_deviceid_lambda0 = (_get_deviceId_lambda0) obj;
                    int iIntValue11 = ((Integer) obj3).intValue();
                    _get_deviceid_lambda0.getClass();
                    getpostalcode6 = (getPostalCode) ((getBirthDateFull) obj2);
                    fragmentActivityRemoteActionCompatParcelizer2 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode6.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    getQueryContext getquerycontext = _get_deviceid_lambda0.read;
                    zIconCompatParcelizer8 = getpostalcode6.IconCompatParcelizer(getAppStateImpl);
                    zIconCompatParcelizer9 = getpostalcode6.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
                    objComponentActivity8 = getpostalcode6.ComponentActivity();
                    if (!(zIconCompatParcelizer8 | zIconCompatParcelizer9) || objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new TncContentKt$$ExternalSyntheticLambda1(getAppStateImpl, i14, fragmentActivityRemoteActionCompatParcelizer2);
                        getpostalcode6.write(objComponentActivity8);
                    }
                    PhotoIdContainerKt.PhotoIdContainer(_get_deviceid_lambda0, getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode6, (iIntValue11 & 14) | 64);
                    return createfromparcel;
                default:
                    ((AbstractMap$$ExternalSyntheticLambda0) obj4).invoke((Throwable) obj);
                    return createfromparcel;
            }
        }
        int i34 = this.write;
        androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createfromparcel = createFromParcel.INSTANCE;
        obj4 = this.RemoteActionCompatParcelizer;
        switch (i34) {
            case 0:
                reenqueueinappmessagelambda0 = (reenqueueInAppMessagelambda0) obj4;
                refreshfeatureflagslambda0 = (refreshFeatureFlagslambda0) obj;
                getbirthdatefull3 = (getBirthDateFull) obj2;
                iIntValue4 = ((Integer) obj3).intValue();
                refreshfeatureflagslambda0.getClass();
                if ((iIntValue4 & 6) == 0) {
                    int i110 = serializer + 83;
                    read = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    iIntValue4 |= ((getPostalCode) getbirthdatefull3).read(refreshfeatureflagslambda0) ? 4 : 2;
                }
                if ((iIntValue4 & 19) != 18) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                getpostalcode7 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode7.write(iIntValue4 & 1, z8)) {
                    zIconCompatParcelizer10 = getpostalcode7.IconCompatParcelizer(reenqueueinappmessagelambda0);
                    objComponentActivity9 = getpostalcode7.ComponentActivity();
                    if (zIconCompatParcelizer10) {
                        objComponentActivity9 = new recordGeofenceTransitionlambda1(2, reenqueueinappmessagelambda0, reenqueueInAppMessagelambda0.class, "navigateToAuthWeb", "navigateToAuthWeb(Lcom/roadrunner/tnc/api/TncAction$OpenAuthWebView;Landroidx/fragment/app/FragmentActivity;)V", 0, 0);
                        getpostalcode7.write(objComponentActivity9);
                    } else {
                        objComponentActivity9 = new recordGeofenceTransitionlambda1(2, reenqueueinappmessagelambda0, reenqueueInAppMessagelambda0.class, "navigateToAuthWeb", "navigateToAuthWeb(Lcom/roadrunner/tnc/api/TncAction$OpenAuthWebView;Landroidx/fragment/app/FragmentActivity;)V", 0, 0);
                        getpostalcode7.write(objComponentActivity9);
                    }
                    recordGeofenceTransitionlambda0.RemoteActionCompatParcelizer(refreshfeatureflagslambda0, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity9), getpostalcode7, iIntValue4 & 14);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 1:
                accessnotifyinvalidation = (accessnotifyInvalidation) obj4;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                iIntValue5 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                if ((iIntValue5 & 17) != 16) {
                    int i112 = serializer + 1;
                    read = i112 % Fields.SpotShadowColor;
                    i10 = 2;
                    int i214 = i112 % 2;
                    z9 = true;
                } else {
                    i10 = 2;
                    z9 = false;
                }
                int i215 = serializer + 55;
                read = i215 % Fields.SpotShadowColor;
                int i216 = i215 % i10;
                getpostalcode8 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode8.write(1 & iIntValue5, z9)) {
                    Modifier.Companion companion6 = Modifier.Companion;
                    float f5 = Dimensions.setMenu;
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode8, SizeKt.m75height3ABfNKs(companion6, f5)});
                    TextKt.m131TextNvy7gAk(accessnotifyinvalidation.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode8.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).WindowCallbackWrapper(), 0L, FontWeight.Companion.getSemiBold(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode8, 1572864, 0, 131002);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode8, SizeKt.m75height3ABfNKs(companion6, f5)});
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                onfailure = (onFailure) obj4;
                String str7 = (String) obj;
                ddefaultVar = (ddefault) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                str7.getClass();
                ddefaultVar.getClass();
                context = onfailure.IconCompatParcelizer;
                Toast.makeText(context, str7, iIntValue12).show();
                if (ddefaultVar.equals(ddefault.IconCompatParcelizer)) {
                    q4ExternalSyntheticLambda9 q4externalsyntheticlambda10 = onfailure.ParcelableVolumeInfo;
                    context.getClass();
                    q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(q4externalsyntheticlambda10, context, null, null, 28);
                }
                return createfromparcel;
            case 3:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                DeliveryItemsKt.DeliveryItems(removeNodeAtDepth.RemoteActionCompatParcelizer(((teardownAllGlobalParametersS) obj4).write), null, (getBirthDateFull) obj2, 0);
                return createfromparcel;
            case 4:
                disableappsetidreading = (disableAppSetIdReading) obj4;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj2;
                iIntValue = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                if ((iIntValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                getpostalcode = (getPostalCode) getbirthdatefull7;
                zWrite = getpostalcode.write(iIntValue & 1, z);
                getaddresscountry = getpostalcode.read;
                if (zWrite) {
                    i = getOnAttributionChangedListener.write[disableappsetidreading.MediaBrowserCompatMediaItem.ordinal()];
                    if (i != 1) {
                        i2 = R.drawable.ic_emoji_grin;
                    } else if (i != 2) {
                        i2 = R.drawable.ic_emoji_sad;
                    } else {
                        if (i == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        i4 = serializer + 81;
                        read = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        i2 = R.drawable.ic_emoji_slightly_smiling;
                    }
                    companion = Modifier.Companion;
                    Modifier modifierWrite6 = SizeKt.write(companion, 1.0f);
                    f = Dimensions.setHideOnContentScrollEnabled;
                    Modifier modifierWrite7 = PaddingKt.write(modifierWrite6, f);
                    flingCancellationException = Arrangement.MediaDescriptionCompat;
                    companion2 = Alignment.Companion;
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite7);
                    companion3 = ComposeUiNode.Companion;
                    constructor = companion3.getConstructor();
                    if (getaddresscountry != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    Modifier modifierWrite8 = SizeKt.write(companion, 1.0f);
                    playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
                    int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite8);
                    constructor2 = companion3.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
                    f2 = Dimensions.setLogo;
                    Modifier modifierM83size3ABfNKs2 = SizeKt.m83size3ABfNKs(companion, f2);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(i2, getpostalcode, 0);
                    String str8 = disableappsetidreading.MediaMetadataCompat;
                    i3 = Painter.$stable;
                    ImageKt.Image(painterPainterResource2, str8, modifierM83size3ABfNKs2, null, null, 0.0f, null, getpostalcode, i3, 120);
                    f3 = Dimensions.setMenu;
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f3)});
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
                    int iHashCode6 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer6 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
                    constructor3 = companion3.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor3);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer6);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier6, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode6), getpostalcode));
                    String str9 = disableappsetidreading.MediaMetadataCompat;
                    TextStyle textStyle2 = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    companion4 = TextAlign.Companion;
                    int iM3516getStarte0LSkKk2 = companion4.m3516getStarte0LSkKk();
                    setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str9, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk2), 0L, 0, false, 0, 0, null, textStyle2, getpostalcode, 0, 0, 130042);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f3)});
                    TextKt.m131TextNvy7gAk(disableappsetidreading.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 130042);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(true);
                    if (disableappsetidreading.IconCompatParcelizer != null) {
                        getpostalcode.serializer(-2105432543);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                        Modifier modifierWrite9 = SizeKt.write(companion, 1.0f);
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer4 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
                        int iHashCode7 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer7 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite9);
                        constructor4 = companion3.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            int i217 = serializer + 23;
                            read = i217 % Fields.SpotShadowColor;
                            int i218 = i217 % 2;
                            getpostalcode.serializer(constructor4);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer7);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier7, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode7), getpostalcode));
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_emoji_light_bulb, getpostalcode, 0), disableappsetidreading.IconCompatParcelizer, SizeKt.m83size3ABfNKs(companion, f2), null, null, 0.0f, null, getpostalcode, i3, 120);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f3)});
                        TextKt.m131TextNvy7gAk(disableappsetidreading.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 130042);
                        z2 = true;
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        createfromparcel = createfromparcel;
                        z2 = true;
                        getpostalcode.serializer(-2104586863);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(z2);
                } else {
                    createfromparcel = createfromparcel;
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                networkBody = (NetworkBody) obj4;
                setHttpsURLConnectionProvider sethttpsurlconnectionprovider2 = (setHttpsURLConnectionProvider) obj;
                int iIntValue13 = ((Integer) obj3).intValue();
                sethttpsurlconnectionprovider2.getClass();
                getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj2);
                fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                xb xbVar2 = (xb) networkBody.IconCompatParcelizer;
                u6 u6Var2 = (u6) networkBody.RemoteActionCompatParcelizer;
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(networkBody);
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer || zIconCompatParcelizer2) {
                    objComponentActivity = new checkSdkClickResponseI(networkBody, fragmentActivityRemoteActionCompatParcelizer, 3);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    objComponentActivity = new checkSdkClickResponseI(networkBody, fragmentActivityRemoteActionCompatParcelizer, 3);
                    getpostalcode2.write(objComponentActivity);
                }
                CurrentShiftV2Kt.CurrentShiftV2(sethttpsurlconnectionprovider2, xbVar2, u6Var2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, null, getpostalcode2, iIntValue13 & 14);
                return createfromparcel;
            case 6:
                referrerDetails = (ReferrerDetails) obj4;
                str = (String) obj;
                getbirthdatefull = (getBirthDateFull) obj2;
                iIntValue2 = ((Integer) obj3).intValue();
                str.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i9 = serializer + 93;
                    read = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        int i219 = 97 / 0;
                        if (!((getPostalCode) getbirthdatefull).read(str)) {
                            i13 = 2;
                        }
                    } else if (!((getPostalCode) getbirthdatefull).read(str)) {
                        i13 = 2;
                    }
                    iIntValue2 |= i13;
                }
                if ((iIntValue2 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                getpostalcode3 = (getPostalCode) getbirthdatefull;
                if (getpostalcode3.write(iIntValue2 & 1, z3)) {
                    it = referrerDetails.RemoteActionCompatParcelizer.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        markasread = (markAsRead) next;
                        if (markasread != null) {
                            arrayList = markasread.write;
                            if (str.equals(referrerDetails.IconCompatParcelizer())) {
                                str2 = (String) ((onShowTranslationui) referrerDetails.write).getValue();
                            } else {
                                while (r0.hasNext()) {
                                    if (((readContentProvider) obj6).read) {
                                        obj5 = obj6;
                                        readcontentprovider = (readContentProvider) obj5;
                                        if (readcontentprovider == null) {
                                            int i2110 = serializer + 23;
                                            read = i2110 % Fields.SpotShadowColor;
                                            int i2111 = i2110 % 2;
                                            readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                        }
                                        str2 = readcontentprovider.IconCompatParcelizer.read;
                                    }
                                }
                                readcontentprovider = (readContentProvider) obj5;
                                if (readcontentprovider == null) {
                                    int i2112 = serializer + 23;
                                    read = i2112 % Fields.SpotShadowColor;
                                    int i2113 = i2112 % 2;
                                    readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                }
                                str2 = readcontentprovider.IconCompatParcelizer.read;
                            }
                            str3 = str2;
                            z4 = getpostalcode3.read((Object) arrayList);
                            objComponentActivity2 = getpostalcode3.ComponentActivity();
                            i5 = 10;
                            if (z4) {
                                i8 = serializer + 97;
                                read = i8 % Fields.SpotShadowColor;
                                if (i8 % 2 == 0) {
                                    int i35 = 51 / 0;
                                    if (objComponentActivity2 == androidContentCaptureManager) {
                                        arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                        it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                        }
                                        objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                        getpostalcode3.write(objComponentActivity2);
                                    }
                                } else if (objComponentActivity2 == androidContentCaptureManager) {
                                    arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                    }
                                    objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                    getpostalcode3.write(objComponentActivity2);
                                }
                            } else {
                                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                }
                                objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                getpostalcode3.write(objComponentActivity2);
                            }
                            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objComponentActivity2;
                            it3 = arrayList.iterator();
                            i6 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    i6 = -1;
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((readContentProvider) it3.next()).IconCompatParcelizer.read, str3}, getCieXyz.write())).booleanValue()) {
                                    i6++;
                                }
                            }
                            if (i6 < 0) {
                                i7 = 0;
                            } else {
                                i7 = i6;
                            }
                            z5 = getpostalcode3.read(referrerDetails);
                            zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(arrayList);
                            objComponentActivity3 = getpostalcode3.ComponentActivity();
                            if (z5 || zIconCompatParcelizer3) {
                                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                                getpostalcode3.write(objComponentActivity3);
                            } else {
                                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                                getpostalcode3.write(objComponentActivity3);
                            }
                            DualColumnTimePickerKt.TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk3, str3, i7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, getpostalcode3, 0, 16);
                        }
                    } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((markAsRead) next).serializer.read, str}, getCieXyz.write())).booleanValue());
                    markasread = (markAsRead) next;
                    if (markasread != null) {
                        arrayList = markasread.write;
                        if (str.equals(referrerDetails.IconCompatParcelizer())) {
                            str2 = (String) ((onShowTranslationui) referrerDetails.write).getValue();
                        } else {
                            while (r0.hasNext()) {
                                if (((readContentProvider) obj6).read) {
                                    obj5 = obj6;
                                    readcontentprovider = (readContentProvider) obj5;
                                    if (readcontentprovider == null) {
                                        int i2114 = serializer + 23;
                                        read = i2114 % Fields.SpotShadowColor;
                                        int i2115 = i2114 % 2;
                                        readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                                    }
                                    str2 = readcontentprovider.IconCompatParcelizer.read;
                                }
                            }
                            readcontentprovider = (readContentProvider) obj5;
                            if (readcontentprovider == null) {
                                int i2116 = serializer + 23;
                                read = i2116 % Fields.SpotShadowColor;
                                int i2117 = i2116 % 2;
                                readcontentprovider = (readContentProvider) onContentCardDismissed.read((List) arrayList);
                            }
                            str2 = readcontentprovider.IconCompatParcelizer.read;
                        }
                        str3 = str2;
                        z4 = getpostalcode3.read((Object) arrayList);
                        objComponentActivity2 = getpostalcode3.ComponentActivity();
                        i5 = 10;
                        if (z4) {
                            i8 = serializer + 97;
                            read = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 == 0) {
                                int i36 = 51 / 0;
                                if (objComponentActivity2 == androidContentCaptureManager) {
                                    arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                    it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                    }
                                    objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                    getpostalcode3.write(objComponentActivity2);
                                }
                            } else if (objComponentActivity2 == androidContentCaptureManager) {
                                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                                }
                                objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                                getpostalcode3.write(objComponentActivity2);
                            }
                        } else {
                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((readContentProvider) it2.next()).IconCompatParcelizer);
                            }
                            objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList2);
                            getpostalcode3.write(objComponentActivity2);
                        }
                        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk4 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objComponentActivity2;
                        it3 = arrayList.iterator();
                        i6 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                i6 = -1;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((readContentProvider) it3.next()).IconCompatParcelizer.read, str3}, getCieXyz.write())).booleanValue()) {
                                i6++;
                            }
                        }
                        if (i6 < 0) {
                            i7 = 0;
                        } else {
                            i7 = i6;
                        }
                        z5 = getpostalcode3.read(referrerDetails);
                        zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(arrayList);
                        objComponentActivity3 = getpostalcode3.ComponentActivity();
                        if (z5 || zIconCompatParcelizer3) {
                            objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                            getpostalcode3.write(objComponentActivity3);
                        } else {
                            objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda1(referrerDetails, i5, arrayList);
                            getpostalcode3.write(objComponentActivity3);
                        }
                        DualColumnTimePickerKt.TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk4, str3, i7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, getpostalcode3, 0, 16);
                    }
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                onviewattachedtowindow = (onViewAttachedToWindow) obj4;
                setrootautofillid = (setRootAutofillId) obj;
                getbirthdatefull2 = (getBirthDateFull) obj2;
                iIntValue3 = ((Integer) obj3).intValue();
                setrootautofillid.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((getPostalCode) getbirthdatefull2).read(setrootautofillid) ? 4 : 2;
                }
                if ((iIntValue3 & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                getpostalcode4 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode4.write(iIntValue3 & 1, z6)) {
                    value = onviewattachedtowindow.getValue();
                    if (value != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("snackbarType cannot be null while calling RoadrunnerSnackbarHost");
                        return null;
                    }
                    setwebview = (setWebView) value;
                    Modifier modifierWrite10 = PaddingKt.write(Modifier.Companion, Dimensions.getActionBarHideOffset);
                    z7 = setwebview instanceof setApplicationContext;
                    if (z7) {
                        getpostalcode4.serializer(-705914109);
                        lifecycle = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getViewModelStore();
                        getpostalcode4.IconCompatParcelizer(false);
                    } else if (setwebview instanceof isInitialized) {
                        getpostalcode4.serializer(-705911387);
                        lifecycle = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getOnBackPressedDispatcher();
                        getpostalcode4.IconCompatParcelizer(false);
                    } else {
                        if (setwebview instanceof registerFacebookSDKJSInterface) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode4, -705915485, false);
                        }
                        getpostalcode4.serializer(-705908605);
                        lifecycle = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getLifecycle();
                        getpostalcode4.IconCompatParcelizer(false);
                    }
                    long j2 = lifecycle;
                    if (z7) {
                        getpostalcode4.serializer(-1375179682);
                        actionView = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSplitBackground();
                        getpostalcode4.IconCompatParcelizer(false);
                    } else if (setwebview instanceof isInitialized) {
                        getpostalcode4.serializer(-1375177152);
                        actionView = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setStackedBackground();
                        getpostalcode4.IconCompatParcelizer(false);
                    } else {
                        if (setwebview instanceof registerFacebookSDKJSInterface) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode4, -1375181070, false);
                        }
                        int i37 = read + 73;
                        serializer = i37 % Fields.SpotShadowColor;
                        int i38 = i37 % 2;
                        getpostalcode4.serializer(-1375174562);
                        actionView = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getActionView();
                        getpostalcode4.IconCompatParcelizer(false);
                    }
                    SnackbarKt.serializer(modifierWrite10, ExtrasKt.write(-106020066, new SnackbarKt$$ExternalSyntheticLambda2(setrootautofillid, i15, setwebview), getpostalcode4), null, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding), j2, actionView, 0L, 0L, ExtrasKt.write(-354830554, new StringsKt__StringsKt$$ExternalSyntheticLambda1(i14, setrootautofillid), getpostalcode4), getpostalcode4, 805306416, 396);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk r8lambdafoipryykxsg19oxlsccw3x8q4qk2 = (r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) obj;
                int iIntValue14 = ((Integer) obj3).intValue();
                r8lambdafoipryykxsg19oxlsccw3x8q4qk2.getClass();
                AccordionContentKt.serializer(r8lambdafoipryykxsg19oxlsccw3x8q4qk2, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) ((GetAppStateImpl) obj4).serializer, null, (getBirthDateFull) obj2, iIntValue14 & 14);
                return createfromparcel;
            case 9:
                r8lambdakakrsj0yrwnwiggdad9idpyum = (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) obj4;
                r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc r8lambdalr5sl_tss1jct7wrmz_9di0rarc2 = (r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) obj;
                int iIntValue15 = ((Integer) obj3).intValue();
                r8lambdalr5sl_tss1jct7wrmz_9di0rarc2.getClass();
                getpostalcode5 = (getPostalCode) ((getBirthDateFull) obj2);
                zIconCompatParcelizer4 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                objComponentActivity4 = getpostalcode5.ComponentActivity();
                if (zIconCompatParcelizer4) {
                    recordGeofenceTransitionlambda1 recordgeofencetransitionlambda4 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToAuthWeb", "navigateToAuthWeb(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenAuthWebView;Landroidx/fragment/app/FragmentActivity;)V", 0, 2);
                    getpostalcode5.write(recordgeofencetransitionlambda4);
                    objComponentActivity4 = recordgeofencetransitionlambda4;
                } else {
                    recordGeofenceTransitionlambda1 recordgeofencetransitionlambda5 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToAuthWeb", "navigateToAuthWeb(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenAuthWebView;Landroidx/fragment/app/FragmentActivity;)V", 0, 2);
                    getpostalcode5.write(recordgeofencetransitionlambda5);
                    objComponentActivity4 = recordgeofencetransitionlambda5;
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
                zIconCompatParcelizer5 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                objComponentActivity5 = getpostalcode5.ComponentActivity();
                if (zIconCompatParcelizer5) {
                    recordGeofenceTransitionlambda1 recordgeofencetransitionlambda6 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToDeepLink", "navigateToDeepLink(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenDeepLink;Landroidx/fragment/app/FragmentActivity;)V", 0, 3);
                    getpostalcode5.write(recordgeofencetransitionlambda6);
                    objComponentActivity5 = recordgeofencetransitionlambda6;
                } else {
                    recordGeofenceTransitionlambda1 recordgeofencetransitionlambda7 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToDeepLink", "navigateToDeepLink(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenDeepLink;Landroidx/fragment/app/FragmentActivity;)V", 0, 3);
                    getpostalcode5.write(recordgeofencetransitionlambda7);
                    objComponentActivity5 = recordgeofencetransitionlambda7;
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                zIconCompatParcelizer6 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                objComponentActivity6 = getpostalcode5.ComponentActivity();
                if (zIconCompatParcelizer6) {
                    recordGeofenceTransitionlambda1 recordgeofencetransitionlambda8 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToExternalUrl", "navigateToExternalUrl(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenExternalUrl;Landroidx/fragment/app/FragmentActivity;)V", 0, 4);
                    getpostalcode5.write(recordgeofencetransitionlambda8);
                    objComponentActivity6 = recordgeofencetransitionlambda8;
                } else {
                    recordGeofenceTransitionlambda1 recordgeofencetransitionlambda9 = new recordGeofenceTransitionlambda1(2, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "navigateToExternalUrl", "navigateToExternalUrl(Lcom/roadrunner/sidemenu/deeplink/MenuItemAction$OpenExternalUrl;Landroidx/fragment/app/FragmentActivity;)V", 0, 4);
                    getpostalcode5.write(recordgeofencetransitionlambda9);
                    objComponentActivity6 = recordgeofencetransitionlambda9;
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity6);
                zIconCompatParcelizer7 = getpostalcode5.IconCompatParcelizer(r8lambdakakrsj0yrwnwiggdad9idpyum);
                objComponentActivity7 = getpostalcode5.ComponentActivity();
                if (zIconCompatParcelizer7) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "openSettingsScreen", "openSettingsScreen(Landroidx/fragment/app/FragmentActivity;)V", 0, 11);
                    getpostalcode5.write(jobKt__JobKt$invokeOnCompletion$2);
                    objComponentActivity7 = jobKt__JobKt$invokeOnCompletion$2;
                } else {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$3 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdakakrsj0yrwnwiggdad9idpyum, r8lambdakakRSJ0yRWnWIggdAd9IDPYuM.class, "openSettingsScreen", "openSettingsScreen(Landroidx/fragment/app/FragmentActivity;)V", 0, 11);
                    getpostalcode5.write(jobKt__JobKt$invokeOnCompletion$3);
                    objComponentActivity7 = jobKt__JobKt$invokeOnCompletion$3;
                }
                onVirtualViewTranslationResponseslambda0.read(r8lambdalr5sl_tss1jct7wrmz_9di0rarc2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity7), getpostalcode5, iIntValue15 & 14);
                return createfromparcel;
            case 10:
                r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8 r8lambdavfhls1yxrgujqvmnjrm6vmsl_h9 = (r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8) obj;
                int iIntValue16 = ((Integer) obj3).intValue();
                r8lambdavfhls1yxrgujqvmnjrm6vmsl_h9.getClass();
                MenuItemContentKt.serializer(r8lambdavfhls1yxrgujqvmnjrm6vmsl_h9, ((r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) obj4).RemoteActionCompatParcelizer, null, (getBirthDateFull) obj2, iIntValue16 & 14);
                return createfromparcel;
            case 11:
                getAppStateImpl = (GetAppStateImpl) obj4;
                _get_deviceId_lambda0 _get_deviceid_lambda1 = (_get_deviceId_lambda0) obj;
                int iIntValue17 = ((Integer) obj3).intValue();
                _get_deviceid_lambda1.getClass();
                getpostalcode6 = (getPostalCode) ((getBirthDateFull) obj2);
                fragmentActivityRemoteActionCompatParcelizer2 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode6.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                getQueryContext getquerycontext2 = _get_deviceid_lambda1.read;
                zIconCompatParcelizer8 = getpostalcode6.IconCompatParcelizer(getAppStateImpl);
                zIconCompatParcelizer9 = getpostalcode6.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
                objComponentActivity8 = getpostalcode6.ComponentActivity();
                if (zIconCompatParcelizer8 || zIconCompatParcelizer9) {
                    objComponentActivity8 = new TncContentKt$$ExternalSyntheticLambda1(getAppStateImpl, i14, fragmentActivityRemoteActionCompatParcelizer2);
                    getpostalcode6.write(objComponentActivity8);
                } else {
                    objComponentActivity8 = new TncContentKt$$ExternalSyntheticLambda1(getAppStateImpl, i14, fragmentActivityRemoteActionCompatParcelizer2);
                    getpostalcode6.write(objComponentActivity8);
                }
                PhotoIdContainerKt.PhotoIdContainer(_get_deviceid_lambda1, getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode6, (iIntValue17 & 14) | 64);
                return createfromparcel;
            default:
                ((AbstractMap$$ExternalSyntheticLambda0) obj4).invoke((Throwable) obj);
                return createfromparcel;
        }
    }
}
