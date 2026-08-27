package com.roadrunner.home.nest;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.activity.result.ActivityResult;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Instruction;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Tag;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Trim;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.navigation.QrPaymentScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.InAppCameraWithTagsArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.home.nest.riderstatistics.RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.futureshift.api.presentation.FutureShiftUiModel;
import com.roadrunner.rider.state.futureshift.presentation.FutureShiftUiModelImpl;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import o.ActivityHandler12;
import o.ActivityHandler15;
import o.ActivityHandler16;
import o.AdjustInstance1;
import o.AdjustSessionSuccess;
import o.AdjustSigner;
import o.AnchoredDraggableKtrestartable2;
import o.AndroidUiFrameClock;
import o.BlockRunner;
import o.BrazeLogger;
import o.C0158device;
import o.C0183locale;
import o.Constraints;
import o.DpOffsetCompanion;
import o.DragAndDropTargetModifierNode;
import o.FoodoraMigrationException;
import o.ImageHeaderParserImageType;
import o.IntRectCompanion;
import o.IntRectVbeCjmY;
import o.IntRectar5cAso;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RgbCompanionExternalSyntheticLambda0;
import o.accessgetAltRightcp;
import o.accessgetInstancedelegatecp;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.accessisMainThread;
import o.b2;
import o.backgroundColor;
import o.convertSpToDp;
import o.copya9UjIt4;
import o.createFromParcel;
import o.createTransitionInfolambda0;
import o.d4ExternalSyntheticLambda2;
import o.d7;
import o.ddefault;
import o.div7Ah8Wj8;
import o.extractFromIndyLambdaFields;
import o.getAbsoluteAdapterPosition;
import o.getBoolean;
import o.getBottomCenter;
import o.getCieXyz;
import o.getContentCaptureSessionui;
import o.getContentViewGroupParentLayout;
import o.getGlobalPositionAwareOLwlOKwannotations;
import o.getPersonNamePrefix;
import o.getRootInfoui;
import o.getRouternavigation_release;
import o.getSignerInstance;
import o.getTopD9Ej5fMannotations;
import o.getTopimpl;
import o.getUseTempTrackingTableroom_runtime;
import o.getWEAR_OS_SMALL_ROUNDannotations;
import o.getXD9Ej5fM;
import o.isPresent;
import o.jsonStringToMap;
import o.minusCBMgk4;
import o.onPostExecute;
import o.onViewAttachedToWindow;
import o.onViewDetachedFromWindowlambda1;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeGlobalCallbackParameters;
import o.removeNodeAtDepth;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.setFitsSystemWindows;
import o.setRegistrationDataProviderandroid_sdk_base_release;
import o.setSendingReferrersAsNotSent;
import o.toIntSizeuvyYCjk;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NestScreenKt$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ NestScreenKt$$ExternalSyntheticLambda0(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, populate populateVar, populate populateVar2) {
        this.write = 3;
        this.read = populateViewStructure_androidKtpopulate7;
        this.serializer = populateVar;
        this.RemoteActionCompatParcelizer = populateVar2;
    }

    public /* synthetic */ NestScreenKt$$ExternalSyntheticLambda0(RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.write = 7;
        this.serializer = rgbCompanionExternalSyntheticLambda0;
        this.read = populateViewStructure_androidKtpopulate7;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public /* synthetic */ NestScreenKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.write = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
    }

    public /* synthetic */ NestScreenKt$$ExternalSyntheticLambda0(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Object obj, Object obj2, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = obj;
        this.read = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0318  */
    /* JADX WARN: Code duplicated, block: B:107:0x0322  */
    /* JADX WARN: Code duplicated, block: B:10:0x0033 A[PHI: r8 r9 r10 r11
  0x0033: PHI (r8v19 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r9v59 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r10v41 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r11v39 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x036d A[PHI: r8 r9 r10 r11
  0x036d: PHI (r8v7 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x036d: PHI (r9v31 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x036d: PHI (r10v17 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x036d: PHI (r11v15 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0382  */
    /* JADX WARN: Code duplicated, block: B:115:0x0386  */
    /* JADX WARN: Code duplicated, block: B:117:0x038e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0392  */
    /* JADX WARN: Code duplicated, block: B:120:0x039a  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:124:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b5 A[PHI: r8 r9 r10 r11
  0x03b5: PHI (r8v6 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x03b5: PHI (r9v16 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x03b5: PHI (r10v15 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x03b5: PHI (r11v13 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:130:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:133:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:140:0x0408  */
    /* JADX WARN: Code duplicated, block: B:142:0x0414  */
    /* JADX WARN: Code duplicated, block: B:145:0x042a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0434  */
    /* JADX WARN: Code duplicated, block: B:149:0x043e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:151:0x0442  */
    /* JADX WARN: Code duplicated, block: B:153:0x044c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x044e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0450  */
    /* JADX WARN: Code duplicated, block: B:157:0x045b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0464  */
    /* JADX WARN: Code duplicated, block: B:160:0x046c  */
    /* JADX WARN: Code duplicated, block: B:161:0x046f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0472  */
    /* JADX WARN: Code duplicated, block: B:164:0x0479  */
    /* JADX WARN: Code duplicated, block: B:166:0x0483  */
    /* JADX WARN: Code duplicated, block: B:168:0x0487  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:172:0x04aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:175:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:179:0x04be  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:182:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:186:0x04de  */
    /* JADX WARN: Code duplicated, block: B:189:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:190:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:193:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:194:0x0500  */
    /* JADX WARN: Code duplicated, block: B:197:0x0507  */
    /* JADX WARN: Code duplicated, block: B:200:0x051e A[LOOP:2: B:198:0x0518->B:200:0x051e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x0530  */
    /* JADX WARN: Code duplicated, block: B:204:0x0537  */
    /* JADX WARN: Code duplicated, block: B:206:0x055f  */
    /* JADX WARN: Code duplicated, block: B:208:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[PHI: r8 r9 r10 r11
  0x0064: PHI (r8v18 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r9v57 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r10v39 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r11v37 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x05f0 A[PHI: r8 r9 r10 r11
  0x05f0: PHI (r8v5 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x05f0: PHI (r9v14 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x05f0: PHI (r10v13 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x05f0: PHI (r11v11 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:213:0x0604  */
    /* JADX WARN: Code duplicated, block: B:214:0x0618  */
    /* JADX WARN: Code duplicated, block: B:216:0x061c  */
    /* JADX WARN: Code duplicated, block: B:218:0x064d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0652 A[PHI: r8 r9 r10 r11
  0x0652: PHI (r8v4 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0652: PHI (r9v12 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0652: PHI (r10v10 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0652: PHI (r11v8 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:222:0x0688 A[PHI: r8 r9 r10 r11
  0x0688: PHI (r8v3 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0688: PHI (r9v10 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0688: PHI (r10v8 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0688: PHI (r11v6 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x06ae A[PHI: r8 r9 r10 r11
  0x06ae: PHI (r8v2 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x06ae: PHI (r9v6 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x06ae: PHI (r10v5 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x06ae: PHI (r11v5 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:226:0x06da  */
    /* JADX WARN: Code duplicated, block: B:228:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:230:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:231:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:233:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:235:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:236:0x0703  */
    /* JADX WARN: Code duplicated, block: B:239:0x0734 A[PHI: r9 r10 r11
  0x0734: PHI (r9v4 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0734: PHI (r10v3 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0734: PHI (r11v3 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:241:0x074d  */
    /* JADX WARN: Code duplicated, block: B:243:0x075a  */
    /* JADX WARN: Code duplicated, block: B:244:0x076c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0789 A[PHI: r8 r9 r10 r11
  0x0789: PHI (r8v1 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0789: PHI (r9v1 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0789: PHI (r10v1 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0789: PHI (r11v1 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x079b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x079d  */
    /* JADX WARN: Code duplicated, block: B:254:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:255:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:256:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:259:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:260:? A[LOOP:0: B:105:0x031c->B:260:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[PHI: r8 r9 r10 r11
  0x00ca: PHI (r8v17 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r9v55 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r10v37 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r11v35 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4 A[PHI: r8 r9 r10 r11
  0x00e4: PHI (r8v16 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r9v52 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r10v35 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r11v33 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e A[PHI: r8 r9 r10 r11
  0x012e: PHI (r8v15 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x012e: PHI (r9v48 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x012e: PHI (r10v33 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x012e: PHI (r11v31 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189 A[PHI: r8 r9 r10 r11
  0x0189: PHI (r8v14 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0189: PHI (r9v46 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0189: PHI (r10v31 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0189: PHI (r11v29 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b3 A[PHI: r8 r9 r10 r11
  0x01b3: PHI (r8v13 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r9v43 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r10v29 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x01b3: PHI (r11v27 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ef A[PHI: r8 r9 r10 r11
  0x01ef: PHI (r8v12 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x01ef: PHI (r9v41 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x01ef: PHI (r10v27 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x01ef: PHI (r11v25 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0204  */
    /* JADX WARN: Code duplicated, block: B:75:0x020d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0215  */
    /* JADX WARN: Code duplicated, block: B:79:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x0225 A[PHI: r8 r9 r10 r11
  0x0225: PHI (r8v11 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0225: PHI (r9v39 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0225: PHI (r10v25 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0225: PHI (r11v23 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x027a  */
    /* JADX WARN: Code duplicated, block: B:85:0x028b A[PHI: r8 r9 r10 r11
  0x028b: PHI (r8v10 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r9v37 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r10v23 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r11v21 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x029b  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a7 A[PHI: r8 r9 r10 r11
  0x02a7: PHI (r8v9 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r9v35 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r10v21 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r11v19 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f7 A[PHI: r8 r9 r10 r11
  0x02f7: PHI (r8v8 o.createFromParcel) = (r8v0 o.createFromParcel), (r8v20 o.createFromParcel) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x02f7: PHI (r9v33 java.lang.Object) = (r9v0 java.lang.Object), (r9v61 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x02f7: PHI (r10v19 java.lang.Object) = (r10v0 java.lang.Object), (r10v43 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x02f7: PHI (r11v17 java.lang.Object) = (r11v0 java.lang.Object), (r11v41 java.lang.Object) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        createFromParcel createfromparcel;
        Object obj2;
        Object obj3;
        Object obj4;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release;
        int i;
        getRouternavigation_release getrouternavigation_release;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        int i2;
        FragmentActivity fragmentActivity;
        extractFromIndyLambdaFields extractfromindylambdafields;
        long j;
        final SuspendingWorkUseCase$$ExternalSyntheticLambda0 suspendingWorkUseCase$$ExternalSyntheticLambda0;
        long j2;
        Long lValueOf;
        long jCurrentTimeMillis;
        int i3;
        RouterLogger routerLogger;
        FragmentActivity fragmentActivity2;
        getTopD9Ej5fMannotations gettopd9ej5fmannotations;
        getXD9Ej5fM getxd9ej5fm;
        toIntSizeuvyYCjk tointsizeuvyycjk;
        FragmentActivity fragmentActivity3;
        TakePictureTaskUiModelImpl takePictureTaskUiModelImpl;
        IntRectVbeCjmY intRectVbeCjmY;
        int i4;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        List<backgroundColor> list;
        Constraints constraints;
        InAppCameraOverlay tags;
        String str;
        Integer numValueOf;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        int iHashCode;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0183locale c0183locale;
        InAppCameraOverlayItem$Instruction.Config config;
        OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim;
        InAppCameraOverlayItem$Instruction.Config.write writeVar;
        int i5;
        int i6;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2;
        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
        setFitsSystemWindows setfitssystemwindows;
        int i7;
        RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5;
        Map map;
        List listSerializer;
        Iterator it2;
        accessgetAltRightcp accessgetaltrightcp;
        RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda1;
        Context context;
        accessgetAltRightcp accessgetaltrightcp2;
        Intent intent;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        d4ExternalSyntheticLambda2 d4externalsyntheticlambda2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8;
        d7 d7Var;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        b2 b2Var;
        String str2;
        ActivityHandler15 activityHandler15;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        FragmentActivity fragmentActivity4;
        FutureShiftUiModel futureShiftUiModel;
        setSendingReferrersAsNotSent setsendingreferrersasnotsent;
        int i8;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        OnDemandWithBonusUiModel onDemandWithBonusUiModel;
        getSignerInstance getsignerinstance;
        String str3;
        String str4;
        TextInputLayout textInputLayout;
        getTopimpl gettopimpl;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl2;
        FocusState focusState;
        int i9;
        int i10 = 2 % 2;
        int i11 = IconCompatParcelizer + 99;
        RatingCompat = i11 % Fields.SpotShadowColor;
        int i12 = 7;
        int i13 = 3;
        int i14 = 1;
        Object obj5 = null;
        if (i11 % 2 == 0) {
            int i15 = this.write;
            createfromparcel = createFromParcel.INSTANCE;
            obj2 = this.read;
            obj3 = this.serializer;
            obj4 = this.RemoteActionCompatParcelizer;
            switch (i15) {
                case 0:
                    getrouternavigation_release = (getRouternavigation_release) obj3;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                    populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj2;
                    ((getPersonNamePrefix) obj).getClass();
                    if (!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                        i2 = IconCompatParcelizer + 95;
                        RatingCompat = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                            ((getRootInfoui) getrouternavigation_release.MediaMetadataCompat.RemoteActionCompatParcelizer).write("nest_time_to_interactive");
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                        ((getRootInfoui) getrouternavigation_release.MediaMetadataCompat.RemoteActionCompatParcelizer).write("nest_time_to_interactive");
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                    }
                    return new BlockRunner(0);
                case 1:
                    fragmentActivity = (FragmentActivity) obj4;
                    DatePickerTaskUiModelImpl datePickerTaskUiModelImpl = (DatePickerTaskUiModelImpl) obj2;
                    createTransitionInfolambda0 createtransitioninfolambda0 = (createTransitionInfolambda0) obj;
                    createtransitioninfolambda0.getClass();
                    ((AndroidUiFrameClock) obj3).getClass();
                    extractfromindylambdafields = createtransitioninfolambda0.IconCompatParcelizer;
                    j = datePickerTaskUiModelImpl.MediaDescriptionCompat;
                    suspendingWorkUseCase$$ExternalSyntheticLambda0 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(datePickerTaskUiModelImpl, i12, createtransitioninfolambda0);
                    extractfromindylambdafields.getClass();
                    if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(String.valueOf(j)) == null) {
                        final Calendar calendar = Calendar.getInstance();
                        j2 = extractfromindylambdafields.dateInMillis;
                        if (j2 != 0) {
                            i3 = IconCompatParcelizer + 75;
                            RatingCompat = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                Long.valueOf(j2);
                                throw null;
                            }
                            lValueOf = Long.valueOf(j2);
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            jCurrentTimeMillis = lValueOf.longValue();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        calendar.setTimeInMillis(jCurrentTimeMillis);
                        DatePickerDialog datePickerDialog = new DatePickerDialog(fragmentActivity, new DatePickerDialog.OnDateSetListener() { // from class: o.createTransitionInfolambda3
                            private static int IconCompatParcelizer = 1;
                            private static int write;

                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i16, int i17, int i18) {
                                int i19 = 2 % 2;
                                int i20 = write + 115;
                                IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i21 = i20 % 2;
                                Calendar calendar2 = calendar;
                                calendar2.set(i16, i17, i18);
                                suspendingWorkUseCase$$ExternalSyntheticLambda0.invoke(Long.valueOf(calendar2.getTimeInMillis()));
                                int i22 = write + 87;
                                IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i23 = i22 % 2;
                            }
                        }, calendar.get(1), calendar.get(2), calendar.get(5));
                        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                        datePickerDialog.show();
                    }
                    return createfromparcel;
                case 2:
                    String str5 = (String) obj4;
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                    layoutCoordinates.getClass();
                    ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3).invoke(str5, Float.valueOf(LayoutCoordinatesKt.boundsInParent(layoutCoordinates).getLeft()));
                    ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(str5, LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null));
                    return createfromparcel;
                case 3:
                    LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                    layoutCoordinates2.getClass();
                    ((PopulateViewStructure_androidKtpopulate7) obj2).setValue(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates2, false, 1, null));
                    ((getContentCaptureSessionui) ((populate) obj3)).IconCompatParcelizer((int) (layoutCoordinates2.mo2217getSizeYbymL2g() >> 32));
                    ((getContentCaptureSessionui) ((populate) obj4)).IconCompatParcelizer((int) (layoutCoordinates2.mo2217getSizeYbymL2g() & 4294967295L));
                    return createfromparcel;
                case 4:
                    routerLogger = (RouterLogger) obj3;
                    fragmentActivity2 = (FragmentActivity) obj4;
                    gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) obj2;
                    getxd9ej5fm = (getXD9Ej5fM) obj;
                    getxd9ej5fm.getClass();
                    routerLogger.getClass();
                    if (getxd9ej5fm instanceof minusCBMgk4) {
                        CashPaymentTaskUiItem.Reasons reasons = ((minusCBMgk4) getxd9ej5fm).write;
                        copya9UjIt4 copya9ujit4 = new copya9UjIt4(gettopd9ej5fmannotations, 1);
                        ((ImageHeaderParserImageType) routerLogger.read).getClass();
                        ImageHeaderParserImageType.serializer(fragmentActivity2, reasons, copya9ujit4);
                    } else {
                        if (getxd9ej5fm instanceof DpOffsetCompanion) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        DpOffsetCompanion dpOffsetCompanion = (DpOffsetCompanion) getxd9ej5fm;
                        long j3 = dpOffsetCompanion.write;
                        String str6 = dpOffsetCompanion.read;
                        String str7 = dpOffsetCompanion.RemoteActionCompatParcelizer;
                        accessisMainThread accessismainthread = (accessisMainThread) routerLogger.serializer;
                        QrPaymentScreenArgs qrPaymentScreenArgs = new QrPaymentScreenArgs(j3, str6, str7);
                        accessismainthread.getClass();
                        QrPaymentScreenFragment qrPaymentScreenFragment = new QrPaymentScreenFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("args_qr_payment_screen", qrPaymentScreenArgs);
                        qrPaymentScreenFragment.setArguments(bundle);
                        qrPaymentScreenFragment.RemoteActionCompatParcelizer(fragmentActivity2.getSupportFragmentManager(), "QrPaymentScreenFragment");
                    }
                    return createfromparcel;
                case 5:
                    tointsizeuvyycjk = (toIntSizeuvyYCjk) obj3;
                    fragmentActivity3 = (FragmentActivity) obj4;
                    takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) obj2;
                    intRectVbeCjmY = (IntRectVbeCjmY) obj;
                    intRectVbeCjmY.getClass();
                    tointsizeuvyycjk.getClass();
                    takePictureTaskUiModelImpl.getClass();
                    if (intRectVbeCjmY instanceof IntRectar5cAso) {
                        if (intRectVbeCjmY instanceof IntRectCompanion) {
                            i4 = IconCompatParcelizer + 25;
                            RatingCompat = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) tointsizeuvyycjk.RemoteActionCompatParcelizer;
                                firebaseRemoteConfigImpl2.getClass();
                                int i16 = 95 / 0;
                                if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_NEW_IN_APP_CAMERA_MODULE_ENABLED)) {
                                    IntRectCompanion intRectCompanion = (IntRectCompanion) intRectVbeCjmY;
                                    String str8 = intRectCompanion.IconCompatParcelizer;
                                    accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = intRectCompanion.write;
                                    list = accessgetlorem_ipsum_sourcep.overlayItems;
                                    constraints = accessgetlorem_ipsum_sourcep.imageOverlay;
                                    if (list != null) {
                                        arrayList3 = new ArrayList();
                                        arrayList4 = new ArrayList();
                                        for (backgroundColor backgroundcolor : list) {
                                            if (backgroundcolor instanceof getWEAR_OS_SMALL_ROUNDannotations) {
                                                getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations = (getWEAR_OS_SMALL_ROUNDannotations) backgroundcolor;
                                                int i17 = getwear_os_small_roundannotations.icon;
                                                String str9 = getwear_os_small_roundannotations.text;
                                                c0183locale = getwear_os_small_roundannotations.config;
                                                if (c0183locale != null) {
                                                    overlayItems$Instruction$Config$Trim = c0183locale.trim;
                                                    if (overlayItems$Instruction$Config$Trim != null) {
                                                        i5 = convertSpToDp.IconCompatParcelizer[overlayItems$Instruction$Config$Trim.ordinal()];
                                                        if (i5 != 1) {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.START;
                                                        } else if (i5 != 2) {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.CENTER;
                                                        } else if (i5 == i13) {
                                                            i6 = IconCompatParcelizer + 83;
                                                            RatingCompat = i6 % Fields.SpotShadowColor;
                                                            if (i6 % 2 == 0) {
                                                                writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                                int i18 = 75 / 0;
                                                            } else {
                                                                writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                            }
                                                        } else {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                        }
                                                    } else {
                                                        writeVar = null;
                                                    }
                                                    config = new InAppCameraOverlayItem$Instruction.Config(writeVar);
                                                } else {
                                                    config = null;
                                                }
                                                arrayList3.add(new InAppCameraOverlayItem$Instruction(i17, str9, config));
                                                i13 = 3;
                                            } else if (backgroundcolor instanceof C0158device) {
                                                C0158device c0158device = (C0158device) backgroundcolor;
                                                arrayList4.add(new InAppCameraOverlayItem$Tag(c0158device.title, c0158device.tags));
                                                i13 = 3;
                                            } else {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            }
                                        }
                                        tags = new InAppCameraOverlay.Structured(new InAppCameraOverlayState(arrayList3, arrayList4));
                                    } else if (constraints != null) {
                                        str = constraints.icon;
                                        if (str == null) {
                                            numValueOf = null;
                                        } else {
                                            iHashCode = str.hashCode();
                                            if (iHashCode != -1039210502) {
                                                if (iHashCode != 3347807) {
                                                    int i19 = RatingCompat + 121;
                                                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                                                    int i20 = i19 % 2;
                                                    if (iHashCode != 1082290744 && str.equals("receipt")) {
                                                        numValueOf = Integer.valueOf(R.drawable.ic_bold_large_receipt_receipt);
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                } else if (str.equals("menu")) {
                                                    numValueOf = Integer.valueOf(R.drawable.ic_bold_large_book_book_flip);
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (str.equals("shopping_bag_check")) {
                                                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_essentials_shopping_bag_check);
                                            } else {
                                                numValueOf = null;
                                            }
                                        }
                                        String str10 = constraints.title;
                                        list2 = constraints.tags;
                                        if (list2 != null) {
                                            List list3 = list2;
                                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                                            it = list3.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InAppCameraOverlay.TagItem((String) it.next(), null));
                                            }
                                            arrayList = arrayList2;
                                        } else {
                                            arrayList = null;
                                        }
                                        tags = new InAppCameraOverlay.Tags(numValueOf, str10, arrayList);
                                    } else {
                                        tags = InAppCameraOverlay.None.read;
                                    }
                                    InAppCameraArgs inAppCameraArgs = new InAppCameraArgs(str8, tags, false, false);
                                    tointsizeuvyycjk.write.getClass();
                                    FoodoraMigrationException.RemoteActionCompatParcelizer(inAppCameraArgs).RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                    fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new ArrivalProgressObserver$$ExternalSyntheticLambda0(takePictureTaskUiModelImpl, 20, fragmentActivity3));
                                } else {
                                    IntRectCompanion intRectCompanion2 = (IntRectCompanion) intRectVbeCjmY;
                                    String str11 = intRectCompanion2.read;
                                    String str12 = intRectCompanion2.IconCompatParcelizer;
                                    long j4 = intRectCompanion2.serializer;
                                    String str13 = intRectCompanion2.RemoteActionCompatParcelizer;
                                    String str14 = intRectCompanion2.write.taskId;
                                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureSuccess", "onPhotoCaptureSuccess()V", 0, 14);
                                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureCanceled", "onPhotoCaptureCanceled()V", 0, 15);
                                    InAppCameraWithTagsArgs inAppCameraWithTagsArgs = new InAppCameraWithTagsArgs(j4, str13, str14);
                                    tointsizeuvyycjk.serializer.getClass();
                                    str11.getClass();
                                    str12.getClass();
                                    InAppCameraWithTagsFragment inAppCameraWithTagsFragment = new InAppCameraWithTagsFragment();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putSerializable("PictureTags", str11);
                                    bundle2.putSerializable("pictureOutputFilePath", str12);
                                    bundle2.putParcelable("InAppCameraWithTagsFragmentArgs", inAppCameraWithTagsArgs);
                                    inAppCameraWithTagsFragment.setArguments(bundle2);
                                    inAppCameraWithTagsFragment.RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                    fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new PreviewView$1$$ExternalSyntheticLambda2(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, fragmentActivity3, 23));
                                }
                            } else {
                                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) tointsizeuvyycjk.RemoteActionCompatParcelizer;
                                firebaseRemoteConfigImpl.getClass();
                                if (!(!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NEW_IN_APP_CAMERA_MODULE_ENABLED))) {
                                    IntRectCompanion intRectCompanion3 = (IntRectCompanion) intRectVbeCjmY;
                                    String str15 = intRectCompanion3.IconCompatParcelizer;
                                    accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep2 = intRectCompanion3.write;
                                    list = accessgetlorem_ipsum_sourcep2.overlayItems;
                                    constraints = accessgetlorem_ipsum_sourcep2.imageOverlay;
                                    if (list != null) {
                                        arrayList3 = new ArrayList();
                                        arrayList4 = new ArrayList();
                                        while (r12.hasNext()) {
                                            if (backgroundcolor instanceof getWEAR_OS_SMALL_ROUNDannotations) {
                                                getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations2 = (getWEAR_OS_SMALL_ROUNDannotations) backgroundcolor;
                                                int i110 = getwear_os_small_roundannotations2.icon;
                                                String str16 = getwear_os_small_roundannotations2.text;
                                                c0183locale = getwear_os_small_roundannotations2.config;
                                                if (c0183locale != null) {
                                                    overlayItems$Instruction$Config$Trim = c0183locale.trim;
                                                    if (overlayItems$Instruction$Config$Trim != null) {
                                                        i5 = convertSpToDp.IconCompatParcelizer[overlayItems$Instruction$Config$Trim.ordinal()];
                                                        if (i5 != 1) {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.START;
                                                        } else if (i5 != 2) {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.CENTER;
                                                        } else if (i5 == i13) {
                                                            i6 = IconCompatParcelizer + 83;
                                                            RatingCompat = i6 % Fields.SpotShadowColor;
                                                            if (i6 % 2 == 0) {
                                                                writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                                int i111 = 75 / 0;
                                                            } else {
                                                                writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                            }
                                                        } else {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                        }
                                                    } else {
                                                        writeVar = null;
                                                    }
                                                    config = new InAppCameraOverlayItem$Instruction.Config(writeVar);
                                                } else {
                                                    config = null;
                                                }
                                                arrayList3.add(new InAppCameraOverlayItem$Instruction(i110, str16, config));
                                                i13 = 3;
                                            } else if (backgroundcolor instanceof C0158device) {
                                                C0158device c0158device2 = (C0158device) backgroundcolor;
                                                arrayList4.add(new InAppCameraOverlayItem$Tag(c0158device2.title, c0158device2.tags));
                                                i13 = 3;
                                            } else {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            }
                                        }
                                        tags = new InAppCameraOverlay.Structured(new InAppCameraOverlayState(arrayList3, arrayList4));
                                    } else if (constraints != null) {
                                        str = constraints.icon;
                                        if (str == null) {
                                            numValueOf = null;
                                        } else {
                                            iHashCode = str.hashCode();
                                            if (iHashCode != -1039210502) {
                                                if (iHashCode != 3347807) {
                                                    int i112 = RatingCompat + 121;
                                                    IconCompatParcelizer = i112 % Fields.SpotShadowColor;
                                                    int i21 = i112 % 2;
                                                    if (iHashCode != 1082290744) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = Integer.valueOf(R.drawable.ic_bold_large_receipt_receipt);
                                                    }
                                                } else if (str.equals("menu")) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf(R.drawable.ic_bold_large_book_book_flip);
                                                }
                                            } else if (str.equals("shopping_bag_check")) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_essentials_shopping_bag_check);
                                            }
                                        }
                                        String str17 = constraints.title;
                                        list2 = constraints.tags;
                                        if (list2 != null) {
                                            List list4 = list2;
                                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                                            it = list4.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InAppCameraOverlay.TagItem((String) it.next(), null));
                                            }
                                            arrayList = arrayList2;
                                        } else {
                                            arrayList = null;
                                        }
                                        tags = new InAppCameraOverlay.Tags(numValueOf, str17, arrayList);
                                    } else {
                                        tags = InAppCameraOverlay.None.read;
                                    }
                                    InAppCameraArgs inAppCameraArgs2 = new InAppCameraArgs(str15, tags, false, false);
                                    tointsizeuvyycjk.write.getClass();
                                    FoodoraMigrationException.RemoteActionCompatParcelizer(inAppCameraArgs2).RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                    fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new ArrivalProgressObserver$$ExternalSyntheticLambda0(takePictureTaskUiModelImpl, 20, fragmentActivity3));
                                } else {
                                    IntRectCompanion intRectCompanion4 = (IntRectCompanion) intRectVbeCjmY;
                                    String str18 = intRectCompanion4.read;
                                    String str19 = intRectCompanion4.IconCompatParcelizer;
                                    long j5 = intRectCompanion4.serializer;
                                    String str110 = intRectCompanion4.RemoteActionCompatParcelizer;
                                    String str111 = intRectCompanion4.write.taskId;
                                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureSuccess", "onPhotoCaptureSuccess()V", 0, 14);
                                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureCanceled", "onPhotoCaptureCanceled()V", 0, 15);
                                    InAppCameraWithTagsArgs inAppCameraWithTagsArgs2 = new InAppCameraWithTagsArgs(j5, str110, str111);
                                    tointsizeuvyycjk.serializer.getClass();
                                    str18.getClass();
                                    str19.getClass();
                                    InAppCameraWithTagsFragment inAppCameraWithTagsFragment2 = new InAppCameraWithTagsFragment();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putSerializable("PictureTags", str18);
                                    bundle3.putSerializable("pictureOutputFilePath", str19);
                                    bundle3.putParcelable("InAppCameraWithTagsFragmentArgs", inAppCameraWithTagsArgs2);
                                    inAppCameraWithTagsFragment2.setArguments(bundle3);
                                    inAppCameraWithTagsFragment2.RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                    fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new PreviewView$1$$ExternalSyntheticLambda2(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4, fragmentActivity3, 23));
                                }
                            }
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        return null;
                    }
                    tointsizeuvyycjk.read.write();
                    return createfromparcel;
                case 6:
                    darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj3;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                    setfitssystemwindows = (setFitsSystemWindows) obj;
                    setfitssystemwindows.getClass();
                    if (setfitssystemwindows.equals(setFitsSystemWindows.RemoteActionCompatParcelizer)) {
                        darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
                    } else if (setfitssystemwindows.equals(setFitsSystemWindows.serializer)) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke();
                    } else {
                        if (setfitssystemwindows.equals(setFitsSystemWindows.write)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        i7 = IconCompatParcelizer + 59;
                        RatingCompat = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
                            obj5.hashCode();
                            throw null;
                        }
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
                    }
                    return createfromparcel;
                case 7:
                    rgbCompanionExternalSyntheticLambda0 = (RgbCompanionExternalSyntheticLambda0) obj3;
                    populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj2;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                    map = (Map) obj;
                    map.getClass();
                    listSerializer = rgbCompanionExternalSyntheticLambda0.serializer();
                    if ((listSerializer instanceof Collection) || !listSerializer.isEmpty()) {
                        it2 = listSerializer.iterator();
                        while (it2.hasNext()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it2.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                        populateViewStructure_androidKtpopulate8.setValue(Boolean.FALSE);
                        ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) rgbCompanionExternalSyntheticLambda0.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.IDLE);
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke();
                    } else {
                        populateViewStructure_androidKtpopulate8.setValue(Boolean.FALSE);
                        ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) rgbCompanionExternalSyntheticLambda0.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.IDLE);
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke();
                    }
                    return createfromparcel;
                case 8:
                    accessgetaltrightcp = (accessgetAltRightcp) obj3;
                    rgbCompanionExternalSyntheticLambda1 = (RgbCompanionExternalSyntheticLambda0) obj4;
                    context = (Context) obj2;
                    accessgetaltrightcp2 = (accessgetAltRightcp) obj;
                    accessgetaltrightcp2.getClass();
                    if (!accessgetaltrightcp2.read()) {
                        if (accessgetaltrightcp2.IconCompatParcelizer()) {
                            accessgetaltrightcp.RemoteActionCompatParcelizer();
                        } else {
                            ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) rgbCompanionExternalSyntheticLambda1.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.IDLE);
                            context.getClass();
                            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                            if (!(context instanceof Activity)) {
                                intent.setFlags(268435456);
                            }
                            context.startActivity(intent);
                        }
                    }
                    return createfromparcel;
                case 9:
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                    getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj3;
                    bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) obj2;
                    if (((Boolean) obj).booleanValue()) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k6.invoke();
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl, null, 3), 3);
                    }
                    return createfromparcel;
                case 10:
                    SignInViewModel signInViewModel = (SignInViewModel) obj3;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                    String str20 = (String) obj;
                    str20.getClass();
                    BrazeLogger brazeLogger = signInViewModel.PlaybackStateCompatCustomAction;
                    brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(d4ExternalSyntheticLambda2.RemoteActionCompatParcelizer((d4ExternalSyntheticLambda2) brazeLogger.write(), new getBoolean(null, 0, str20, signInViewModel.read.serializer(getAbsoluteAdapterPosition.write), new NafathModalContentKt$NafathModal$1$1(0, signInViewModel, SignInViewModel.class, "clearAuthErrorOnInputsChanged", "clearAuthErrorOnInputsChanged()V", 0, 8), false, 35), null, false, null, 510));
                    d4externalsyntheticlambda2 = (d4ExternalSyntheticLambda2) ((onViewAttachedToWindow) obj2).getValue();
                    if (d4externalsyntheticlambda2 != null) {
                        int i22 = IconCompatParcelizer + 65;
                        RatingCompat = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        d4externalsyntheticlambda2.RatingCompat.invoke(r8lambdaunavo3sxub_pc9xroryotnrlvsm, Boolean.TRUE);
                    }
                    return createfromparcel;
                case 11:
                    getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) obj3;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                    d7Var = (d7) obj;
                    d7Var.getClass();
                    if (d7Var.equals(d7.read)) {
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k7, null, 7), 3);
                    } else {
                        if (d7Var.equals(d7.write)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k8, null, 8), 3);
                    }
                    return createfromparcel;
                case 12:
                    removeGlobalCallbackParameters removeglobalcallbackparameters = (removeGlobalCallbackParameters) obj3;
                    AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2 = (AnchoredDraggableKtrestartable2) obj;
                    anchoredDraggableKtrestartable2.getClass();
                    AnchoredDraggableKtrestartable2.serializer(3, anchoredDraggableKtrestartable2, new DragAndDropTargetModifierNode(new PagerDefaults$$ExternalSyntheticLambda0(removeglobalcallbackparameters, 19, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4), true, 1203308056));
                    List list5 = removeglobalcallbackparameters.RemoteActionCompatParcelizer;
                    anchoredDraggableKtrestartable2.serializer(list5.size(), null, new getGlobalPositionAwareOLwlOKwannotations(list5, 6), new DragAndDropTargetModifierNode(new RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3(list5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, i14, removeglobalcallbackparameters), true, 2039820996));
                    return createfromparcel;
                case 13:
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                    b2Var = (b2) obj4;
                    str2 = (String) obj2;
                    activityHandler15 = (ActivityHandler15) obj;
                    activityHandler15.getClass();
                    if (activityHandler15 instanceof ActivityHandler12) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((ActivityHandler12) activityHandler15).RemoteActionCompatParcelizer);
                    } else {
                        if (activityHandler15.equals(ActivityHandler16.serializer)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        b2Var.invoke(str2);
                    }
                    return createfromparcel;
                case 14:
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                    fragmentActivity4 = (FragmentActivity) obj4;
                    futureShiftUiModel = (FutureShiftUiModel) obj2;
                    setsendingreferrersasnotsent = (setSendingReferrersAsNotSent) obj;
                    setsendingreferrersasnotsent.getClass();
                    if (setsendingreferrersasnotsent.equals(onPostExecute.serializer)) {
                        div7Ah8Wj8 supportFragmentManager = fragmentActivity4.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(supportFragmentManager);
                    } else {
                        if (setsendingreferrersasnotsent instanceof AdjustInstance1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        i8 = RatingCompat + 121;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            ((StartWorkingNavigationUiModelImpl) ((FutureShiftUiModelImpl) futureShiftUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((AdjustInstance1) setsendingreferrersasnotsent).read);
                            obj5.hashCode();
                            throw null;
                        }
                        ((StartWorkingNavigationUiModelImpl) ((FutureShiftUiModelImpl) futureShiftUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((AdjustInstance1) setsendingreferrersasnotsent).read);
                    }
                    return createfromparcel;
                case 15:
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4;
                    onDemandWithBonusUiModel = (OnDemandWithBonusUiModel) obj2;
                    getsignerinstance = (getSignerInstance) obj;
                    getsignerinstance.getClass();
                    if (getsignerinstance instanceof AdjustSessionSuccess) {
                        AdjustSessionSuccess adjustSessionSuccess = (AdjustSessionSuccess) getsignerinstance;
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(adjustSessionSuccess.write), adjustSessionSuccess.IconCompatParcelizer);
                    } else if (getsignerinstance instanceof AdjustSigner) {
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((AdjustSigner) getsignerinstance).IconCompatParcelizer, ddefault.IconCompatParcelizer, 0);
                    } else {
                        if (getsignerinstance instanceof isPresent) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        ((StartWorkingNavigationUiModelImpl) ((OnDemandWithBonusUiModelImpl) onDemandWithBonusUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(StartWorkingNavAction.StartOnDemand.serializer);
                    }
                    return createfromparcel;
                case 16:
                    ((getBottomCenter) obj).getClass();
                    FocusManager.clearFocus$default((FocusManager) obj3, false, 1, null);
                    ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4).invoke((String) ((PopulateViewStructure_androidKtpopulate7) obj2).getValue());
                    return createfromparcel;
                case 17:
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                    str3 = (String) obj4;
                    str4 = (String) obj2;
                    jsonStringToMap jsonstringtomap = (jsonStringToMap) obj;
                    jsonstringtomap.getClass();
                    textInputLayout = jsonstringtomap.serializer;
                    textInputLayout.setHintEnabled(str3.length() == 0);
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textInputLayout.getHint(), str4}, getCieXyz.write())).booleanValue()) {
                        textInputLayout.setHint(str4);
                    }
                    gettopimpl = jsonstringtomap.RemoteActionCompatParcelizer;
                    if (!String.valueOf(gettopimpl.getText()).equals(str3)) {
                        gettopimpl.setText(str3);
                    }
                    if (gettopimpl.getImportantForAutofill() != 2) {
                        gettopimpl.setImportantForAutofill(2);
                    }
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(textInputLayout);
                    return createfromparcel;
                case 18:
                    getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) obj3;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                    bringIntoViewRequesterImpl2 = (BringIntoViewRequesterImpl) obj2;
                    focusState = (FocusState) obj;
                    focusState.getClass();
                    if (focusState.isFocused()) {
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl2, null, 0), 3);
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm4 != null) {
                        i9 = IconCompatParcelizer + 111;
                        RatingCompat = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(focusState);
                            throw null;
                        }
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(focusState);
                    }
                    return createfromparcel;
                default:
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                    schedulepushdeliveryandroid_sdk_base_release = (schedulePushDeliveryandroid_sdk_base_release) obj2;
                    ActivityResult activityResult = (ActivityResult) obj;
                    activityResult.getClass();
                    i = activityResult.write;
                    if (i != -1) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    } else if (i != 0) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                    } else if (i == 42) {
                        ((setRegistrationDataProviderandroid_sdk_base_release) schedulepushdeliveryandroid_sdk_base_release).write();
                    }
                    return createfromparcel;
            }
        }
        int i24 = this.write;
        createfromparcel = createFromParcel.INSTANCE;
        obj2 = this.read;
        obj3 = this.serializer;
        obj4 = this.RemoteActionCompatParcelizer;
        switch (i24) {
            case 0:
                getrouternavigation_release = (getRouternavigation_release) obj3;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj2;
                ((getPersonNamePrefix) obj).getClass();
                if (!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                    i2 = IconCompatParcelizer + 95;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                        ((getRootInfoui) getrouternavigation_release.MediaMetadataCompat.RemoteActionCompatParcelizer).write("nest_time_to_interactive");
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                        Object obj7 = null;
                        obj7.hashCode();
                        throw null;
                    }
                    populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                    ((getRootInfoui) getrouternavigation_release.MediaMetadataCompat.RemoteActionCompatParcelizer).write("nest_time_to_interactive");
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                }
                return new BlockRunner(0);
            case 1:
                fragmentActivity = (FragmentActivity) obj4;
                DatePickerTaskUiModelImpl datePickerTaskUiModelImpl2 = (DatePickerTaskUiModelImpl) obj2;
                createTransitionInfolambda0 createtransitioninfolambda1 = (createTransitionInfolambda0) obj;
                createtransitioninfolambda1.getClass();
                ((AndroidUiFrameClock) obj3).getClass();
                extractfromindylambdafields = createtransitioninfolambda1.IconCompatParcelizer;
                j = datePickerTaskUiModelImpl2.MediaDescriptionCompat;
                suspendingWorkUseCase$$ExternalSyntheticLambda0 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(datePickerTaskUiModelImpl2, i12, createtransitioninfolambda1);
                extractfromindylambdafields.getClass();
                if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(String.valueOf(j)) == null) {
                    final Calendar calendar2 = Calendar.getInstance();
                    j2 = extractfromindylambdafields.dateInMillis;
                    if (j2 != 0) {
                        i3 = IconCompatParcelizer + 75;
                        RatingCompat = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            Long.valueOf(j2);
                            throw null;
                        }
                        lValueOf = Long.valueOf(j2);
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jCurrentTimeMillis = lValueOf.longValue();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    calendar2.setTimeInMillis(jCurrentTimeMillis);
                    DatePickerDialog datePickerDialog2 = new DatePickerDialog(fragmentActivity, new DatePickerDialog.OnDateSetListener() { // from class: o.createTransitionInfolambda3
                        private static int IconCompatParcelizer = 1;
                        private static int write;

                        @Override // android.app.DatePickerDialog.OnDateSetListener
                        public final void onDateSet(DatePicker datePicker, int i113, int i114, int i115) {
                            int i116 = 2 % 2;
                            int i25 = write + 115;
                            IconCompatParcelizer = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i26 = i25 % 2;
                            Calendar calendar3 = calendar2;
                            calendar3.set(i113, i114, i115);
                            suspendingWorkUseCase$$ExternalSyntheticLambda0.invoke(Long.valueOf(calendar3.getTimeInMillis()));
                            int i27 = write + 87;
                            IconCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                        }
                    }, calendar2.get(1), calendar2.get(2), calendar2.get(5));
                    datePickerDialog2.getDatePicker().setMaxDate(System.currentTimeMillis());
                    datePickerDialog2.show();
                }
                return createfromparcel;
            case 2:
                String str21 = (String) obj4;
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                layoutCoordinates3.getClass();
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3).invoke(str21, Float.valueOf(LayoutCoordinatesKt.boundsInParent(layoutCoordinates3).getLeft()));
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(str21, LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates3, false, 1, null));
                return createfromparcel;
            case 3:
                LayoutCoordinates layoutCoordinates4 = (LayoutCoordinates) obj;
                layoutCoordinates4.getClass();
                ((PopulateViewStructure_androidKtpopulate7) obj2).setValue(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates4, false, 1, null));
                ((getContentCaptureSessionui) ((populate) obj3)).IconCompatParcelizer((int) (layoutCoordinates4.mo2217getSizeYbymL2g() >> 32));
                ((getContentCaptureSessionui) ((populate) obj4)).IconCompatParcelizer((int) (layoutCoordinates4.mo2217getSizeYbymL2g() & 4294967295L));
                return createfromparcel;
            case 4:
                routerLogger = (RouterLogger) obj3;
                fragmentActivity2 = (FragmentActivity) obj4;
                gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) obj2;
                getxd9ej5fm = (getXD9Ej5fM) obj;
                getxd9ej5fm.getClass();
                routerLogger.getClass();
                if (getxd9ej5fm instanceof minusCBMgk4) {
                    CashPaymentTaskUiItem.Reasons reasons2 = ((minusCBMgk4) getxd9ej5fm).write;
                    copya9UjIt4 copya9ujit5 = new copya9UjIt4(gettopd9ej5fmannotations, 1);
                    ((ImageHeaderParserImageType) routerLogger.read).getClass();
                    ImageHeaderParserImageType.serializer(fragmentActivity2, reasons2, copya9ujit5);
                } else {
                    if (getxd9ej5fm instanceof DpOffsetCompanion) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    DpOffsetCompanion dpOffsetCompanion2 = (DpOffsetCompanion) getxd9ej5fm;
                    long j6 = dpOffsetCompanion2.write;
                    String str22 = dpOffsetCompanion2.read;
                    String str23 = dpOffsetCompanion2.RemoteActionCompatParcelizer;
                    accessisMainThread accessismainthread2 = (accessisMainThread) routerLogger.serializer;
                    QrPaymentScreenArgs qrPaymentScreenArgs2 = new QrPaymentScreenArgs(j6, str22, str23);
                    accessismainthread2.getClass();
                    QrPaymentScreenFragment qrPaymentScreenFragment2 = new QrPaymentScreenFragment();
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("args_qr_payment_screen", qrPaymentScreenArgs2);
                    qrPaymentScreenFragment2.setArguments(bundle4);
                    qrPaymentScreenFragment2.RemoteActionCompatParcelizer(fragmentActivity2.getSupportFragmentManager(), "QrPaymentScreenFragment");
                }
                return createfromparcel;
            case 5:
                tointsizeuvyycjk = (toIntSizeuvyYCjk) obj3;
                fragmentActivity3 = (FragmentActivity) obj4;
                takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) obj2;
                intRectVbeCjmY = (IntRectVbeCjmY) obj;
                intRectVbeCjmY.getClass();
                tointsizeuvyycjk.getClass();
                takePictureTaskUiModelImpl.getClass();
                if (intRectVbeCjmY instanceof IntRectar5cAso) {
                    if (intRectVbeCjmY instanceof IntRectCompanion) {
                        i4 = IconCompatParcelizer + 25;
                        RatingCompat = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) tointsizeuvyycjk.RemoteActionCompatParcelizer;
                            firebaseRemoteConfigImpl2.getClass();
                            int i113 = 95 / 0;
                            if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_NEW_IN_APP_CAMERA_MODULE_ENABLED)) {
                                IntRectCompanion intRectCompanion5 = (IntRectCompanion) intRectVbeCjmY;
                                String str112 = intRectCompanion5.IconCompatParcelizer;
                                accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep3 = intRectCompanion5.write;
                                list = accessgetlorem_ipsum_sourcep3.overlayItems;
                                constraints = accessgetlorem_ipsum_sourcep3.imageOverlay;
                                if (list != null) {
                                    arrayList3 = new ArrayList();
                                    arrayList4 = new ArrayList();
                                    while (r12.hasNext()) {
                                        if (backgroundcolor instanceof getWEAR_OS_SMALL_ROUNDannotations) {
                                            getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations3 = (getWEAR_OS_SMALL_ROUNDannotations) backgroundcolor;
                                            int i114 = getwear_os_small_roundannotations3.icon;
                                            String str113 = getwear_os_small_roundannotations3.text;
                                            c0183locale = getwear_os_small_roundannotations3.config;
                                            if (c0183locale != null) {
                                                overlayItems$Instruction$Config$Trim = c0183locale.trim;
                                                if (overlayItems$Instruction$Config$Trim != null) {
                                                    i5 = convertSpToDp.IconCompatParcelizer[overlayItems$Instruction$Config$Trim.ordinal()];
                                                    if (i5 != 1) {
                                                        writeVar = InAppCameraOverlayItem$Instruction.Config.write.START;
                                                    } else if (i5 != 2) {
                                                        writeVar = InAppCameraOverlayItem$Instruction.Config.write.CENTER;
                                                    } else if (i5 == i13) {
                                                        i6 = IconCompatParcelizer + 83;
                                                        RatingCompat = i6 % Fields.SpotShadowColor;
                                                        if (i6 % 2 == 0) {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                            int i115 = 75 / 0;
                                                        } else {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                        }
                                                    } else {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    }
                                                } else {
                                                    writeVar = null;
                                                }
                                                config = new InAppCameraOverlayItem$Instruction.Config(writeVar);
                                            } else {
                                                config = null;
                                            }
                                            arrayList3.add(new InAppCameraOverlayItem$Instruction(i114, str113, config));
                                            i13 = 3;
                                        } else if (backgroundcolor instanceof C0158device) {
                                            C0158device c0158device3 = (C0158device) backgroundcolor;
                                            arrayList4.add(new InAppCameraOverlayItem$Tag(c0158device3.title, c0158device3.tags));
                                            i13 = 3;
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        }
                                    }
                                    tags = new InAppCameraOverlay.Structured(new InAppCameraOverlayState(arrayList3, arrayList4));
                                } else if (constraints != null) {
                                    str = constraints.icon;
                                    if (str == null) {
                                        numValueOf = null;
                                    } else {
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1039210502) {
                                            if (iHashCode != 3347807) {
                                                int i116 = RatingCompat + 121;
                                                IconCompatParcelizer = i116 % Fields.SpotShadowColor;
                                                int i25 = i116 % 2;
                                                if (iHashCode != 1082290744) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf(R.drawable.ic_bold_large_receipt_receipt);
                                                }
                                            } else if (str.equals("menu")) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_book_book_flip);
                                            }
                                        } else if (str.equals("shopping_bag_check")) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(R.drawable.ic_bold_large_essentials_shopping_bag_check);
                                        }
                                    }
                                    String str114 = constraints.title;
                                    list2 = constraints.tags;
                                    if (list2 != null) {
                                        List list6 = list2;
                                        arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                                        it = list6.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(new InAppCameraOverlay.TagItem((String) it.next(), null));
                                        }
                                        arrayList = arrayList2;
                                    } else {
                                        arrayList = null;
                                    }
                                    tags = new InAppCameraOverlay.Tags(numValueOf, str114, arrayList);
                                } else {
                                    tags = InAppCameraOverlay.None.read;
                                }
                                InAppCameraArgs inAppCameraArgs3 = new InAppCameraArgs(str112, tags, false, false);
                                tointsizeuvyycjk.write.getClass();
                                FoodoraMigrationException.RemoteActionCompatParcelizer(inAppCameraArgs3).RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new ArrivalProgressObserver$$ExternalSyntheticLambda0(takePictureTaskUiModelImpl, 20, fragmentActivity3));
                            } else {
                                IntRectCompanion intRectCompanion6 = (IntRectCompanion) intRectVbeCjmY;
                                String str115 = intRectCompanion6.read;
                                String str116 = intRectCompanion6.IconCompatParcelizer;
                                long j7 = intRectCompanion6.serializer;
                                String str117 = intRectCompanion6.RemoteActionCompatParcelizer;
                                String str118 = intRectCompanion6.write.taskId;
                                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureSuccess", "onPhotoCaptureSuccess()V", 0, 14);
                                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureCanceled", "onPhotoCaptureCanceled()V", 0, 15);
                                InAppCameraWithTagsArgs inAppCameraWithTagsArgs3 = new InAppCameraWithTagsArgs(j7, str117, str118);
                                tointsizeuvyycjk.serializer.getClass();
                                str115.getClass();
                                str116.getClass();
                                InAppCameraWithTagsFragment inAppCameraWithTagsFragment3 = new InAppCameraWithTagsFragment();
                                Bundle bundle5 = new Bundle();
                                bundle5.putSerializable("PictureTags", str115);
                                bundle5.putSerializable("pictureOutputFilePath", str116);
                                bundle5.putParcelable("InAppCameraWithTagsFragmentArgs", inAppCameraWithTagsArgs3);
                                inAppCameraWithTagsFragment3.setArguments(bundle5);
                                inAppCameraWithTagsFragment3.RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new PreviewView$1$$ExternalSyntheticLambda2(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6, fragmentActivity3, 23));
                            }
                        } else {
                            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) tointsizeuvyycjk.RemoteActionCompatParcelizer;
                            firebaseRemoteConfigImpl.getClass();
                            if (!(!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NEW_IN_APP_CAMERA_MODULE_ENABLED))) {
                                IntRectCompanion intRectCompanion7 = (IntRectCompanion) intRectVbeCjmY;
                                String str119 = intRectCompanion7.IconCompatParcelizer;
                                accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep4 = intRectCompanion7.write;
                                list = accessgetlorem_ipsum_sourcep4.overlayItems;
                                constraints = accessgetlorem_ipsum_sourcep4.imageOverlay;
                                if (list != null) {
                                    arrayList3 = new ArrayList();
                                    arrayList4 = new ArrayList();
                                    while (r12.hasNext()) {
                                        if (backgroundcolor instanceof getWEAR_OS_SMALL_ROUNDannotations) {
                                            getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations4 = (getWEAR_OS_SMALL_ROUNDannotations) backgroundcolor;
                                            int i117 = getwear_os_small_roundannotations4.icon;
                                            String str1110 = getwear_os_small_roundannotations4.text;
                                            c0183locale = getwear_os_small_roundannotations4.config;
                                            if (c0183locale != null) {
                                                overlayItems$Instruction$Config$Trim = c0183locale.trim;
                                                if (overlayItems$Instruction$Config$Trim != null) {
                                                    i5 = convertSpToDp.IconCompatParcelizer[overlayItems$Instruction$Config$Trim.ordinal()];
                                                    if (i5 != 1) {
                                                        writeVar = InAppCameraOverlayItem$Instruction.Config.write.START;
                                                    } else if (i5 != 2) {
                                                        writeVar = InAppCameraOverlayItem$Instruction.Config.write.CENTER;
                                                    } else if (i5 == i13) {
                                                        i6 = IconCompatParcelizer + 83;
                                                        RatingCompat = i6 % Fields.SpotShadowColor;
                                                        if (i6 % 2 == 0) {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                            int i118 = 75 / 0;
                                                        } else {
                                                            writeVar = InAppCameraOverlayItem$Instruction.Config.write.END;
                                                        }
                                                    } else {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    }
                                                } else {
                                                    writeVar = null;
                                                }
                                                config = new InAppCameraOverlayItem$Instruction.Config(writeVar);
                                            } else {
                                                config = null;
                                            }
                                            arrayList3.add(new InAppCameraOverlayItem$Instruction(i117, str1110, config));
                                            i13 = 3;
                                        } else if (backgroundcolor instanceof C0158device) {
                                            C0158device c0158device4 = (C0158device) backgroundcolor;
                                            arrayList4.add(new InAppCameraOverlayItem$Tag(c0158device4.title, c0158device4.tags));
                                            i13 = 3;
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        }
                                    }
                                    tags = new InAppCameraOverlay.Structured(new InAppCameraOverlayState(arrayList3, arrayList4));
                                } else if (constraints != null) {
                                    str = constraints.icon;
                                    if (str == null) {
                                        numValueOf = null;
                                    } else {
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1039210502) {
                                            if (iHashCode != 3347807) {
                                                int i119 = RatingCompat + 121;
                                                IconCompatParcelizer = i119 % Fields.SpotShadowColor;
                                                int i26 = i119 % 2;
                                                if (iHashCode != 1082290744) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf(R.drawable.ic_bold_large_receipt_receipt);
                                                }
                                            } else if (str.equals("menu")) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = Integer.valueOf(R.drawable.ic_bold_large_book_book_flip);
                                            }
                                        } else if (str.equals("shopping_bag_check")) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(R.drawable.ic_bold_large_essentials_shopping_bag_check);
                                        }
                                    }
                                    String str1111 = constraints.title;
                                    list2 = constraints.tags;
                                    if (list2 != null) {
                                        List list7 = list2;
                                        arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                                        it = list7.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(new InAppCameraOverlay.TagItem((String) it.next(), null));
                                        }
                                        arrayList = arrayList2;
                                    } else {
                                        arrayList = null;
                                    }
                                    tags = new InAppCameraOverlay.Tags(numValueOf, str1111, arrayList);
                                } else {
                                    tags = InAppCameraOverlay.None.read;
                                }
                                InAppCameraArgs inAppCameraArgs4 = new InAppCameraArgs(str119, tags, false, false);
                                tointsizeuvyycjk.write.getClass();
                                FoodoraMigrationException.RemoteActionCompatParcelizer(inAppCameraArgs4).RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new ArrivalProgressObserver$$ExternalSyntheticLambda0(takePictureTaskUiModelImpl, 20, fragmentActivity3));
                            } else {
                                IntRectCompanion intRectCompanion8 = (IntRectCompanion) intRectVbeCjmY;
                                String str1112 = intRectCompanion8.read;
                                String str1113 = intRectCompanion8.IconCompatParcelizer;
                                long j8 = intRectCompanion8.serializer;
                                String str1114 = intRectCompanion8.RemoteActionCompatParcelizer;
                                String str1115 = intRectCompanion8.write.taskId;
                                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$8 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureSuccess", "onPhotoCaptureSuccess()V", 0, 14);
                                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$9 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "onPhotoCaptureCanceled", "onPhotoCaptureCanceled()V", 0, 15);
                                InAppCameraWithTagsArgs inAppCameraWithTagsArgs4 = new InAppCameraWithTagsArgs(j8, str1114, str1115);
                                tointsizeuvyycjk.serializer.getClass();
                                str1112.getClass();
                                str1113.getClass();
                                InAppCameraWithTagsFragment inAppCameraWithTagsFragment4 = new InAppCameraWithTagsFragment();
                                Bundle bundle6 = new Bundle();
                                bundle6.putSerializable("PictureTags", str1112);
                                bundle6.putSerializable("pictureOutputFilePath", str1113);
                                bundle6.putParcelable("InAppCameraWithTagsFragmentArgs", inAppCameraWithTagsArgs4);
                                inAppCameraWithTagsFragment4.setArguments(bundle6);
                                inAppCameraWithTagsFragment4.RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "InAppCameraWithTagsFragment");
                                fragmentActivity3.getSupportFragmentManager().read("InAppCameraWithTagsFragment", fragmentActivity3, new PreviewView$1$$ExternalSyntheticLambda2(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$9, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$8, fragmentActivity3, 23));
                            }
                        }
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    }
                    return null;
                }
                tointsizeuvyycjk.read.write();
                return createfromparcel;
            case 6:
                darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj3;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                setfitssystemwindows = (setFitsSystemWindows) obj;
                setfitssystemwindows.getClass();
                if (setfitssystemwindows.equals(setFitsSystemWindows.RemoteActionCompatParcelizer)) {
                    darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
                } else if (setfitssystemwindows.equals(setFitsSystemWindows.serializer)) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke();
                } else {
                    if (setfitssystemwindows.equals(setFitsSystemWindows.write)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    i7 = IconCompatParcelizer + 59;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
                        obj5.hashCode();
                        throw null;
                    }
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
                }
                return createfromparcel;
            case 7:
                rgbCompanionExternalSyntheticLambda0 = (RgbCompanionExternalSyntheticLambda0) obj3;
                populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj2;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                map = (Map) obj;
                map.getClass();
                listSerializer = rgbCompanionExternalSyntheticLambda0.serializer();
                if (listSerializer instanceof Collection) {
                    it2 = listSerializer.iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it2.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    populateViewStructure_androidKtpopulate8.setValue(Boolean.FALSE);
                    ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) rgbCompanionExternalSyntheticLambda0.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.IDLE);
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke();
                } else {
                    it2 = listSerializer.iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it2.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    populateViewStructure_androidKtpopulate8.setValue(Boolean.FALSE);
                    ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) rgbCompanionExternalSyntheticLambda0.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.IDLE);
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke();
                }
                return createfromparcel;
            case 8:
                accessgetaltrightcp = (accessgetAltRightcp) obj3;
                rgbCompanionExternalSyntheticLambda1 = (RgbCompanionExternalSyntheticLambda0) obj4;
                context = (Context) obj2;
                accessgetaltrightcp2 = (accessgetAltRightcp) obj;
                accessgetaltrightcp2.getClass();
                if (!accessgetaltrightcp2.read()) {
                    if (accessgetaltrightcp2.IconCompatParcelizer()) {
                        accessgetaltrightcp.RemoteActionCompatParcelizer();
                    } else {
                        ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) rgbCompanionExternalSyntheticLambda1.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).setValue(getUseTempTrackingTableroom_runtime.IDLE);
                        context.getClass();
                        intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                        if (!(context instanceof Activity)) {
                            intent.setFlags(268435456);
                        }
                        context.startActivity(intent);
                    }
                }
                return createfromparcel;
            case 9:
                r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj3;
                bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) obj2;
                if (((Boolean) obj).booleanValue()) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k6.invoke();
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl, null, 3), 3);
                }
                return createfromparcel;
            case 10:
                SignInViewModel signInViewModel2 = (SignInViewModel) obj3;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                String str24 = (String) obj;
                str24.getClass();
                BrazeLogger brazeLogger2 = signInViewModel2.PlaybackStateCompatCustomAction;
                brazeLogger2.IconCompatParcelizer.RemoteActionCompatParcelizer(d4ExternalSyntheticLambda2.RemoteActionCompatParcelizer((d4ExternalSyntheticLambda2) brazeLogger2.write(), new getBoolean(null, 0, str24, signInViewModel2.read.serializer(getAbsoluteAdapterPosition.write), new NafathModalContentKt$NafathModal$1$1(0, signInViewModel2, SignInViewModel.class, "clearAuthErrorOnInputsChanged", "clearAuthErrorOnInputsChanged()V", 0, 8), false, 35), null, false, null, 510));
                d4externalsyntheticlambda2 = (d4ExternalSyntheticLambda2) ((onViewAttachedToWindow) obj2).getValue();
                if (d4externalsyntheticlambda2 != null) {
                    int i27 = IconCompatParcelizer + 65;
                    RatingCompat = i27 % Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    d4externalsyntheticlambda2.RatingCompat.invoke(r8lambdaunavo3sxub_pc9xroryotnrlvsm, Boolean.TRUE);
                }
                return createfromparcel;
            case 11:
                getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) obj3;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                d7Var = (d7) obj;
                d7Var.getClass();
                if (d7Var.equals(d7.read)) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k7, null, 7), 3);
                } else {
                    if (d7Var.equals(d7.write)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k8, null, 8), 3);
                }
                return createfromparcel;
            case 12:
                removeGlobalCallbackParameters removeglobalcallbackparameters2 = (removeGlobalCallbackParameters) obj3;
                AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable3 = (AnchoredDraggableKtrestartable2) obj;
                anchoredDraggableKtrestartable3.getClass();
                AnchoredDraggableKtrestartable2.serializer(3, anchoredDraggableKtrestartable3, new DragAndDropTargetModifierNode(new PagerDefaults$$ExternalSyntheticLambda0(removeglobalcallbackparameters2, 19, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4), true, 1203308056));
                List list8 = removeglobalcallbackparameters2.RemoteActionCompatParcelizer;
                anchoredDraggableKtrestartable3.serializer(list8.size(), null, new getGlobalPositionAwareOLwlOKwannotations(list8, 6), new DragAndDropTargetModifierNode(new RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3(list8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, i14, removeglobalcallbackparameters2), true, 2039820996));
                return createfromparcel;
            case 13:
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                b2Var = (b2) obj4;
                str2 = (String) obj2;
                activityHandler15 = (ActivityHandler15) obj;
                activityHandler15.getClass();
                if (activityHandler15 instanceof ActivityHandler12) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((ActivityHandler12) activityHandler15).RemoteActionCompatParcelizer);
                } else {
                    if (activityHandler15.equals(ActivityHandler16.serializer)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    b2Var.invoke(str2);
                }
                return createfromparcel;
            case 14:
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                fragmentActivity4 = (FragmentActivity) obj4;
                futureShiftUiModel = (FutureShiftUiModel) obj2;
                setsendingreferrersasnotsent = (setSendingReferrersAsNotSent) obj;
                setsendingreferrersasnotsent.getClass();
                if (setsendingreferrersasnotsent.equals(onPostExecute.serializer)) {
                    div7Ah8Wj8 supportFragmentManager2 = fragmentActivity4.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(supportFragmentManager2);
                } else {
                    if (setsendingreferrersasnotsent instanceof AdjustInstance1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    i8 = RatingCompat + 121;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        ((StartWorkingNavigationUiModelImpl) ((FutureShiftUiModelImpl) futureShiftUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((AdjustInstance1) setsendingreferrersasnotsent).read);
                        obj5.hashCode();
                        throw null;
                    }
                    ((StartWorkingNavigationUiModelImpl) ((FutureShiftUiModelImpl) futureShiftUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((AdjustInstance1) setsendingreferrersasnotsent).read);
                }
                return createfromparcel;
            case 15:
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4;
                onDemandWithBonusUiModel = (OnDemandWithBonusUiModel) obj2;
                getsignerinstance = (getSignerInstance) obj;
                getsignerinstance.getClass();
                if (getsignerinstance instanceof AdjustSessionSuccess) {
                    AdjustSessionSuccess adjustSessionSuccess2 = (AdjustSessionSuccess) getsignerinstance;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(adjustSessionSuccess2.write), adjustSessionSuccess2.IconCompatParcelizer);
                } else if (getsignerinstance instanceof AdjustSigner) {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((AdjustSigner) getsignerinstance).IconCompatParcelizer, ddefault.IconCompatParcelizer, 0);
                } else {
                    if (getsignerinstance instanceof isPresent) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    ((StartWorkingNavigationUiModelImpl) ((OnDemandWithBonusUiModelImpl) onDemandWithBonusUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(StartWorkingNavAction.StartOnDemand.serializer);
                }
                return createfromparcel;
            case 16:
                ((getBottomCenter) obj).getClass();
                FocusManager.clearFocus$default((FocusManager) obj3, false, 1, null);
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4).invoke((String) ((PopulateViewStructure_androidKtpopulate7) obj2).getValue());
                return createfromparcel;
            case 17:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                str3 = (String) obj4;
                str4 = (String) obj2;
                jsonStringToMap jsonstringtomap2 = (jsonStringToMap) obj;
                jsonstringtomap2.getClass();
                textInputLayout = jsonstringtomap2.serializer;
                textInputLayout.setHintEnabled(str3.length() == 0);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textInputLayout.getHint(), str4}, getCieXyz.write())).booleanValue()) {
                    textInputLayout.setHint(str4);
                }
                gettopimpl = jsonstringtomap2.RemoteActionCompatParcelizer;
                if (!String.valueOf(gettopimpl.getText()).equals(str3)) {
                    gettopimpl.setText(str3);
                }
                if (gettopimpl.getImportantForAutofill() != 2) {
                    gettopimpl.setImportantForAutofill(2);
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(textInputLayout);
                return createfromparcel;
            case 18:
                getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) obj3;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                bringIntoViewRequesterImpl2 = (BringIntoViewRequesterImpl) obj2;
                focusState = (FocusState) obj;
                focusState.getClass();
                if (focusState.isFocused()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new TextInputBigV2Kt$MainText$1$1$1(bringIntoViewRequesterImpl2, null, 0), 3);
                }
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm4 != null) {
                    i9 = IconCompatParcelizer + 111;
                    RatingCompat = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(focusState);
                        throw null;
                    }
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(focusState);
                }
                return createfromparcel;
            default:
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                schedulepushdeliveryandroid_sdk_base_release = (schedulePushDeliveryandroid_sdk_base_release) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                activityResult2.getClass();
                i = activityResult2.write;
                if (i != -1) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                } else if (i != 0) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                } else if (i == 42) {
                    ((setRegistrationDataProviderandroid_sdk_base_release) schedulepushdeliveryandroid_sdk_base_release).write();
                }
                return createfromparcel;
        }
    }
}
