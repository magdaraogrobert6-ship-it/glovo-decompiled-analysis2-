package androidx.compose.ui.tooling.data;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.ScrollbarHelper;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopAddressManageBottomSheetKt;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopOptionKt;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesLinkUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesKt;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesLinkKt;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose.SwitcherKt$Switcher$2$1;
import com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.ConfirmButtonV1UiModel;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.compose.ConfirmButtonContentKt;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.compose.SingleDeliveryPageKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.api.presentation.PickUpDropOffTaskWrapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.TasksComposableV2Kt;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.nestnavbar.NestNavBarContainerKt;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.opportunities.calendar.BonusCalendarScreenKt;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode$pointerInputNode$1$7$1;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemsContentKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import com.sentiance.core.model.events.C$b;
import java.util.List;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKtanimateTo2;
import o.AndroidContentCaptureManager;
import o.AndroidUiFrameClock;
import o.DensityDefaultImpls;
import o.DividerItemDecoration;
import o.DragAndDropTargetModifierNode;
import o.ImageHeaderParserImageType;
import o.Inspectablelambda0;
import o.IntOffsetCompanion;
import o.IntSize;
import o.IntSizeCompanion;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextIndent;
import o.accessgetInfinitycp;
import o.accessisRenderNodeCompatiblecp;
import o.allAnimations;
import o.b3;
import o.compositeOverOWjLjI;
import o.constructorimpldefault;
import o.copyiSbpLlY;
import o.createAnimation;
import o.createFromParcel;
import o.createTransitionInfolambda1;
import o.createTransitionInfolambda2;
import o.ensureOpenSession;
import o.findComposableMethod;
import o.getActionViewIntentlambda0;
import o.getAnimatedProperties;
import o.getAnimationObject;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDensityannotations;
import o.getEm;
import o.getFontScaleannotations;
import o.getLifecycleRegistry;
import o.getNewPassword;
import o.getOrBuildCachedDrawBlock;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getSuspendingTransactionContext;
import o.getTopD9Ej5fMannotations;
import o.getTransactionExecutor;
import o.getTransitions;
import o.getYD9Ej5fM;
import o.getYD9Ej5fMannotations;
import o.getZeroMYxV2XQ;
import o.hasBounds;
import o.i2;
import o.isAdapterPositionOnScreen;
import o.isMainThread;
import o.isUnspecifiedjoFl9Iannotations;
import o.onBackPressedDispatcher_delegatelambda010;
import o.plusCBMgk4;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.r8lambdarhobHpPgW3fYGaomIOtfm02vDE;
import o.r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4;
import o.registerInAppMessageManagerlambda0;
import o.roundToIntRect;
import o.saveInteger;
import o.setDelegateForTestingui_text;
import o.t7;
import o.takeOrElsegVKV90s;
import o.times7Ah8Wj8;
import o.timesYEO4UFw;
import o.toIntSizeuvyYCjk;
import o.u4;
import o.widthMask;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SlotTreeKt$$ExternalSyntheticLambda0 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SlotTreeKt$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0054  */
    private final Object read(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        C$b c$b = (C$b) this.f$0;
        BonusCalendarViewModel bonusCalendarViewModel = (BonusCalendarViewModel) obj;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
        int iIntValue = ((Integer) obj4).intValue();
        bonusCalendarViewModel.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj3);
        FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
        u4 u4Var = (u4) ((isAdapterPositionOnScreen) c$b.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(c$b);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        boolean z = zIconCompatParcelizer | zIconCompatParcelizer2;
        int i2 = 0;
        if (z) {
            objComponentActivity = new t7(c$b, fragmentActivityRemoteActionCompatParcelizer, i2);
            getpostalcode.write(objComponentActivity);
        } else {
            int i3 = RemoteActionCompatParcelizer + 31;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new t7(c$b, fragmentActivityRemoteActionCompatParcelizer, i2);
                getpostalcode.write(objComponentActivity);
            }
        }
        BonusCalendarScreenKt.serializer(u4Var, bonusCalendarViewModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, getpostalcode, (iIntValue << 3) & 1008);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = RemoteActionCompatParcelizer + 99;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x004a  */
    private final Object IconCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        Object obj5;
        Object obj6;
        int i = 2;
        int i2 = 2 % 2;
        C$b c$b = (C$b) this.f$0;
        saveInteger saveinteger = (saveInteger) obj;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
        int iIntValue = ((Integer) obj4).intValue();
        saveinteger.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj3);
        FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(c$b);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        boolean z = zIconCompatParcelizer | zIconCompatParcelizer2;
        int i3 = 1;
        if (z) {
            obj5 = objComponentActivity;
            t7 t7Var = new t7(c$b, fragmentActivityRemoteActionCompatParcelizer, i3);
            getpostalcode.write(t7Var);
            obj5 = t7Var;
        } else {
            int i4 = read + 59;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (objComponentActivity == androidContentCaptureManager) {
                obj5 = objComponentActivity;
                t7 t7Var2 = new t7(c$b, fragmentActivityRemoteActionCompatParcelizer, i3);
                getpostalcode.write(t7Var2);
                obj5 = t7Var2;
            }
        }
        obj5 = objComponentActivity;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(c$b);
        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (!zIconCompatParcelizer3 && !zIconCompatParcelizer4) {
            int i6 = read + 93;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                obj6 = objComponentActivity2;
                throw null;
            }
            if (objComponentActivity2 == androidContentCaptureManager) {
                TncContentKt$$ExternalSyntheticLambda1 tncContentKt$$ExternalSyntheticLambda1 = new TncContentKt$$ExternalSyntheticLambda1(c$b, 11, fragmentActivityRemoteActionCompatParcelizer);
                getpostalcode.write(tncContentKt$$ExternalSyntheticLambda1);
                obj6 = tncContentKt$$ExternalSyntheticLambda1;
            }
        } else {
            TncContentKt$$ExternalSyntheticLambda1 tncContentKt$$ExternalSyntheticLambda2 = new TncContentKt$$ExternalSyntheticLambda1(c$b, 11, fragmentActivityRemoteActionCompatParcelizer);
            getpostalcode.write(tncContentKt$$ExternalSyntheticLambda2);
            obj6 = tncContentKt$$ExternalSyntheticLambda2;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6;
        boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(c$b);
        boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
        if (((iIntValue & 112) ^ 48) <= 32 || !getpostalcode.read(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
            if ((iIntValue & 48) == 32) {
                int i7 = read + 43;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i3 = 0;
            }
        }
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        Object obj7 = objComponentActivity3;
        if ((i3 | (zIconCompatParcelizer5 ? 1 : 0) | (zIconCompatParcelizer6 ? 1 : 0)) != 0 || objComponentActivity3 == androidContentCaptureManager) {
            b3 b3Var = new b3(c$b, fragmentActivityRemoteActionCompatParcelizer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 10);
            getpostalcode.write(b3Var);
            obj7 = b3Var;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
        boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(c$b);
        boolean zIconCompatParcelizer8 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
        Object objComponentActivity4 = getpostalcode.ComponentActivity();
        Object obj8 = objComponentActivity4;
        if ((zIconCompatParcelizer7 | zIconCompatParcelizer8) || objComponentActivity4 == androidContentCaptureManager) {
            t7 t7Var3 = new t7(c$b, fragmentActivityRemoteActionCompatParcelizer, i);
            getpostalcode.write(t7Var3);
            obj8 = t7Var3;
        }
        ScrollbarHelper.NestRiderStateSummary(saveinteger, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (g0) c$b.write, getpostalcode, (iIntValue & 14) | ((iIntValue << 6) & 7168));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$takepicture$presentation$TakePictureTaskComposableFactoryV1Impl$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 47;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        toIntSizeuvyYCjk tointsizeuvyycjk = (toIntSizeuvyYCjk) this.f$0;
        final TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) obj;
        Boolean bool = (Boolean) obj2;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        takePictureTaskUiModelImpl.getClass();
        if ((iIntValue & 6) == 0) {
            if (((getPostalCode) getbirthdatefull).read(takePictureTaskUiModelImpl)) {
                int i7 = RemoteActionCompatParcelizer;
                int i8 = i7 + 121;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i7 + 81;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((getPostalCode) getbirthdatefull).read(bool) ? 32 : 16;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 147) != 146)) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(takePictureTaskUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode, 0);
            FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            times7Ah8Wj8 times7ah8wj8 = new times7Ah8Wj8(i3);
            int i12 = i & 14;
            if (i12 == 4) {
                int i13 = read + 29;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            int i15 = 11;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(i15, takePictureTaskUiModelImpl);
                getpostalcode.write(objComponentActivity);
            }
            onBackPressedDispatcher_delegatelambda010.write(times7ah8wj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            getTransactionExecutor gettransactionexecutor = tointsizeuvyycjk.read;
            if (i12 == 4) {
                int i16 = RemoteActionCompatParcelizer + 11;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z2) {
                int i18 = RemoteActionCompatParcelizer + 111;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    final int i20 = 0;
                    objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.timesO0kMr_c
                        private static int IconCompatParcelizer = 1;
                        private static int read;

                        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
                        
                            return r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
                        
                            r7 = r3.serializer();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
                        
                            if (r7 != null) goto L14;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
                        
                            r1 = o.timesO0kMr_c.read + 117;
                            o.timesO0kMr_c.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            r1 = r1 % 2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
                        
                            r0 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl.IconCompatParcelizer(r7);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
                        
                            if (r0 != null) goto L17;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
                        
                            r3.IconCompatParcelizer.serializer(new o.IntRectCompanion(r7.cameraTagsData, r0.photoData.imagePath, r7, r3.MediaDescriptionCompat, r3.RatingCompat));
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
                        
                            return r2;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                        
                            r3.write();
                         */
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r11 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = o.timesO0kMr_c.read
                                int r1 = r1 + 45
                                int r2 = r1 % 128
                                o.timesO0kMr_c.IconCompatParcelizer = r2
                                int r1 = r1 % r0
                                if (r1 != 0) goto L1b
                                int r1 = r2
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl r3 = r1
                                r4 = 60
                                int r4 = r4 / 0
                                if (r1 == 0) goto L27
                                goto L23
                            L1b:
                                int r1 = r2
                                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                                com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl r3 = r1
                                if (r1 == 0) goto L27
                            L23:
                                r3.write()
                                return r2
                            L27:
                                o.accessgetLOREM_IPSUM_SOURCEp r7 = r3.serializer()
                                if (r7 != 0) goto L37
                                int r1 = o.timesO0kMr_c.read
                                int r1 = r1 + 117
                                int r3 = r1 % 128
                                o.timesO0kMr_c.IconCompatParcelizer = r3
                                int r1 = r1 % r0
                                goto L53
                            L37:
                                o.getMinHeightimpl r0 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl.IconCompatParcelizer(r7)
                                if (r0 != 0) goto L3e
                                goto L53
                            L3e:
                                o.getQueryContext r1 = r3.IconCompatParcelizer
                                java.lang.String r5 = r7.cameraTagsData
                                o.getHasFixedHeightimpl r0 = r0.photoData
                                java.lang.String r6 = r0.imagePath
                                long r8 = r3.MediaDescriptionCompat
                                java.lang.String r10 = r3.RatingCompat
                                o.IntRectCompanion r0 = new o.IntRectCompanion
                                r4 = r0
                                r4.<init>(r5, r6, r7, r8, r10)
                                r1.serializer(r0)
                            L53:
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.timesO0kMr_c.invoke():java.lang.Object");
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                final int i21 = 0;
                objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.timesO0kMr_c
                    private static int IconCompatParcelizer = 1;
                    private static int read;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final java.lang.Object invoke() {
                        /*
                            r11 = this;
                            r0 = 2
                            int r1 = r0 % r0
                            int r1 = o.timesO0kMr_c.read
                            int r1 = r1 + 45
                            int r2 = r1 % 128
                            o.timesO0kMr_c.IconCompatParcelizer = r2
                            int r1 = r1 % r0
                            if (r1 != 0) goto L1b
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl r3 = r1
                            r4 = 60
                            int r4 = r4 / 0
                            if (r1 == 0) goto L27
                            goto L23
                        L1b:
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl r3 = r1
                            if (r1 == 0) goto L27
                        L23:
                            r3.write()
                            return r2
                        L27:
                            o.accessgetLOREM_IPSUM_SOURCEp r7 = r3.serializer()
                            if (r7 != 0) goto L37
                            int r1 = o.timesO0kMr_c.read
                            int r1 = r1 + 117
                            int r3 = r1 % 128
                            o.timesO0kMr_c.IconCompatParcelizer = r3
                            int r1 = r1 % r0
                            goto L53
                        L37:
                            o.getMinHeightimpl r0 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl.IconCompatParcelizer(r7)
                            if (r0 != 0) goto L3e
                            goto L53
                        L3e:
                            o.getQueryContext r1 = r3.IconCompatParcelizer
                            java.lang.String r5 = r7.cameraTagsData
                            o.getHasFixedHeightimpl r0 = r0.photoData
                            java.lang.String r6 = r0.imagePath
                            long r8 = r3.MediaDescriptionCompat
                            java.lang.String r10 = r3.RatingCompat
                            o.IntRectCompanion r0 = new o.IntRectCompanion
                            r4 = r0
                            r4.<init>(r5, r6, r7, r8, r10)
                            r1.serializer(r0)
                        L53:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.timesO0kMr_c.invoke():java.lang.Object");
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            if (i12 == 4) {
                int i22 = read + 75;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity3 == androidContentCaptureManager) {
                final int i24 = 1;
                objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.timesO0kMr_c
                    private static int IconCompatParcelizer = 1;
                    private static int read;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final java.lang.Object invoke() {
                        /*
                            r11 = this;
                            r0 = 2
                            int r1 = r0 % r0
                            int r1 = o.timesO0kMr_c.read
                            int r1 = r1 + 45
                            int r2 = r1 % 128
                            o.timesO0kMr_c.IconCompatParcelizer = r2
                            int r1 = r1 % r0
                            if (r1 != 0) goto L1b
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl r3 = r1
                            r4 = 60
                            int r4 = r4 / 0
                            if (r1 == 0) goto L27
                            goto L23
                        L1b:
                            int r1 = r2
                            o.createFromParcel r2 = o.createFromParcel.INSTANCE
                            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl r3 = r1
                            if (r1 == 0) goto L27
                        L23:
                            r3.write()
                            return r2
                        L27:
                            o.accessgetLOREM_IPSUM_SOURCEp r7 = r3.serializer()
                            if (r7 != 0) goto L37
                            int r1 = o.timesO0kMr_c.read
                            int r1 = r1 + 117
                            int r3 = r1 % 128
                            o.timesO0kMr_c.IconCompatParcelizer = r3
                            int r1 = r1 % r0
                            goto L53
                        L37:
                            o.getMinHeightimpl r0 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl.IconCompatParcelizer(r7)
                            if (r0 != 0) goto L3e
                            goto L53
                        L3e:
                            o.getQueryContext r1 = r3.IconCompatParcelizer
                            java.lang.String r5 = r7.cameraTagsData
                            o.getHasFixedHeightimpl r0 = r0.photoData
                            java.lang.String r6 = r0.imagePath
                            long r8 = r3.MediaDescriptionCompat
                            java.lang.String r10 = r3.RatingCompat
                            o.IntRectCompanion r0 = new o.IntRectCompanion
                            r4 = r0
                            r4.<init>(r5, r6, r7, r8, r10)
                            r1.serializer(r0)
                        L53:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.timesO0kMr_c.invoke():java.lang.Object");
                    }
                };
                getpostalcode.write(objComponentActivity3);
            }
            getSuspendingTransactionContext.write(gettransactionexecutor, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, false, getpostalcode, 8, 20);
            getQueryContext getquerycontext = takePictureTaskUiModelImpl.IconCompatParcelizer;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(tointsizeuvyycjk);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            if (i12 == 4) {
                int i25 = RemoteActionCompatParcelizer + 113;
                read = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((z4 | zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new NestScreenKt$$ExternalSyntheticLambda0(tointsizeuvyycjk, fragmentActivityRemoteActionCompatParcelizer, takePictureTaskUiModelImpl, 5);
                getpostalcode.write(objComponentActivity4);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 8);
            IntSizeCompanion intSizeCompanion = (IntSizeCompanion) populateViewStructure_androidKtpopulate7Write.getValue();
            if (intSizeCompanion instanceof roundToIntRect) {
                getpostalcode.serializer(1781394402);
                PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((roundToIntRect) intSizeCompanion).serializer.write(), bool, null, ExtrasKt.write(1367688131, new NestFragment$$ExternalSyntheticLambda1(20, takePictureTaskUiModelImpl), getpostalcode), getpostalcode, (i & 112) | 3072);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(intSizeCompanion instanceof IntSize)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 611651074, false);
                }
                int i27 = read + 7;
                RemoteActionCompatParcelizer = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                getpostalcode.serializer(611671737);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:322:0x08cf  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final int i13 = 2;
        int i14 = 2 % 2;
        int i15 = this.$r8$classId;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.f$0;
        int i16 = 10;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i17 = 8;
        int i18 = 4;
        switch (i15) {
            case 0:
                return SlotTreeKt.mapTree$lambda$0((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (getOrBuildCachedDrawBlock) obj, (SourceContext) obj2, (List) obj3, (List) obj4);
            case 1:
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj5;
                AnchoredDraggableKtanimateTo2 anchoredDraggableKtanimateTo2 = (AnchoredDraggableKtanimateTo2) obj;
                ((Integer) obj2).getClass();
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2) ? 4 : 2;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, (iIntValue & 131) != 130)) {
                    dragAndDropTargetModifierNode.invoke(anchoredDraggableKtanimateTo2, getpostalcode, Integer.valueOf(14 & iIntValue));
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((compositeOverOWjLjI) obj5).bindTo(new constructorimpldefault(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 3:
                zzz zzzVar = (zzz) obj5;
                LastStopOptionUiModelImpl lastStopOptionUiModelImpl = (LastStopOptionUiModelImpl) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                int iIntValue2 = ((Integer) obj4).intValue();
                lastStopOptionUiModelImpl.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
                getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj3);
                FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(lastStopOptionUiModelImpl.MediaDescriptionCompat, getpostalcode2, 0);
                getQueryContext getquerycontext = lastStopOptionUiModelImpl.MediaSessionCompatToken;
                boolean z3 = (((iIntValue2 & 112) ^ 48) > 32 && getpostalcode2.read(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) || (iIntValue2 & 48) == 32;
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(zzzVar);
                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if ((zIconCompatParcelizer | z3 | zIconCompatParcelizer2) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, zzzVar, fragmentActivityRemoteActionCompatParcelizer, 25);
                    getpostalcode2.write(objComponentActivity);
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 8);
                int i19 = 14 & iIntValue2;
                LastStopOptionKt.LastStopOption(lastStopOptionUiModelImpl, getpostalcode2, i19);
                if (((Boolean) populateViewStructure_androidKtpopulate7Write.getValue()).booleanValue()) {
                    getpostalcode2.serializer(-700284835);
                    LastStopAddressManageBottomSheetKt.LastStopAddressManageBottomSheet(lastStopOptionUiModelImpl, null, getpostalcode2, i19);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-700214682);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                return createfromparcel;
            case 4:
                ensureOpenSession ensureopensession = (ensureOpenSession) obj5;
                DeliveryNotesUiModel deliveryNotesUiModel = (DeliveryNotesUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                deliveryNotesUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i = iIntValue3 | (((getPostalCode) getbirthdatefull2).read(deliveryNotesUiModel) ? 4 : 2);
                } else {
                    i = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? 32 : 16;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode3.write(i & 1, (i & 147) != 146)) {
                    DeliveryNotesKt.DeliveryNotes(deliveryNotesUiModel, ensureopensession.serializer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, null, getpostalcode3, (i & 14) | ((i << 3) & 896));
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) obj5;
                DeliveryNotesLinkUiModel deliveryNotesLinkUiModel = (DeliveryNotesLinkUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                deliveryNotesLinkUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (((getPostalCode) getbirthdatefull3).read(deliveryNotesLinkUiModel) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3) ? 32 : 16;
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode4.write(i2 & 1, (i2 & 147) != 146)) {
                    Context context = (Context) getpostalcode4.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean zIconCompatParcelizer3 = getpostalcode4.IconCompatParcelizer(context);
                    boolean zIconCompatParcelizer4 = getpostalcode4.IconCompatParcelizer(saveHeatmapUrlImpl);
                    Object objComponentActivity2 = getpostalcode4.ComponentActivity();
                    if ((zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new PagerDefaults$$ExternalSyntheticLambda0(context, 11, saveHeatmapUrlImpl);
                        getpostalcode4.write(objComponentActivity2);
                    }
                    DeliveryNotesLinkKt.DeliveryNotesLink(deliveryNotesLinkUiModel, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, null, getpostalcode4, (i2 & 14) | ((i2 << 3) & 896));
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                setDelegateForTestingui_text setdelegatefortestingui_text = (setDelegateForTestingui_text) obj5;
                NavigationButtonUiModelImpl navigationButtonUiModelImpl = (NavigationButtonUiModelImpl) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                navigationButtonUiModelImpl.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i3 = (((getPostalCode) getbirthdatefull4).read(navigationButtonUiModelImpl) ? 4 : 2) | iIntValue5;
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i3 |= ((getPostalCode) getbirthdatefull4).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4) ? 32 : 16;
                }
                if ((i3 & 147) != 146) {
                    int i20 = read + 55;
                    RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode5.write(i3 & 1, z)) {
                    Activity activityWrite = UtilsKt.write((Context) getpostalcode5.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    boolean zIconCompatParcelizer5 = getpostalcode5.IconCompatParcelizer(setdelegatefortestingui_text);
                    boolean zIconCompatParcelizer6 = getpostalcode5.IconCompatParcelizer(activityWrite);
                    Object objComponentActivity3 = getpostalcode5.ComponentActivity();
                    if ((zIconCompatParcelizer5 | zIconCompatParcelizer6) || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(setdelegatefortestingui_text, activityWrite);
                        getpostalcode5.write(objComponentActivity3);
                    }
                    NavigationButtonKt.NavigationButton(navigationButtonUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode5, i3 & 126);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                findComposableMethod findcomposablemethod = (findComposableMethod) obj5;
                ConfirmButtonV1UiModel confirmButtonV1UiModel = (ConfirmButtonV1UiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                confirmButtonV1UiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i4 = (((getPostalCode) getbirthdatefull5).read(confirmButtonV1UiModel) ? 4 : 2) | iIntValue6;
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    int i22 = read + 71;
                    RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    i4 |= ((getPostalCode) getbirthdatefull5).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5) ? 32 : 16;
                }
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode6.write(i4 & 1, (i4 & 147) != 146)) {
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer2 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode6.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    getQueryContext getquerycontext2 = ((ConfirmButtonV1UiModelImpl) confirmButtonV1UiModel).RemoteActionCompatParcelizer;
                    boolean zIconCompatParcelizer7 = getpostalcode6.IconCompatParcelizer(findcomposablemethod);
                    boolean zIconCompatParcelizer8 = getpostalcode6.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
                    int i24 = i4 & 14;
                    boolean z4 = i24 == 4;
                    boolean z5 = (i4 & 112) == 32;
                    Object objComponentActivity4 = getpostalcode6.ComponentActivity();
                    if ((z5 | zIconCompatParcelizer7 | zIconCompatParcelizer8 | z4) || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new NavControllerImpl$$ExternalSyntheticLambda0(findcomposablemethod, fragmentActivityRemoteActionCompatParcelizer2, confirmButtonV1UiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5, 8);
                        getpostalcode6.write(objComponentActivity4);
                    }
                    SQLite.write(getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode6, 8);
                    boolean zBooleanValue = ((Boolean) ExtrasKt.write(findcomposablemethod.serializer.serializer, getpostalcode6, 0).getValue()).booleanValue();
                    if (i24 == 4) {
                        int i25 = RemoteActionCompatParcelizer + 77;
                        read = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object objComponentActivity5 = getpostalcode6.ComponentActivity();
                    if (z2 || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new SwitcherKt$Switcher$2$1(0, confirmButtonV1UiModel, ConfirmButtonV1UiModel.class, "onShowDoubleConfirmation", "onShowDoubleConfirmation()V", 0, 6);
                        getpostalcode6.write(objComponentActivity5);
                    }
                    ConfirmButtonContentKt.write(confirmButtonV1UiModel, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5), PaddingKt.write(Modifier.Companion, Dimensions.setActionBarVisibilityCallback), getpostalcode6, i24);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                SignInDataStore signInDataStore = (SignInDataStore) obj5;
                PickupDropOffSingleDeliveryUiModel pickupDropOffSingleDeliveryUiModel = (PickupDropOffSingleDeliveryUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                pickupDropOffSingleDeliveryUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6.getClass();
                if ((iIntValue7 & 6) == 0) {
                    int i27 = RemoteActionCompatParcelizer + 77;
                    read = i27 % Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    i5 = (((getPostalCode) getbirthdatefull6).read(pickupDropOffSingleDeliveryUiModel) ? 4 : 2) | iIntValue7;
                } else {
                    i5 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i5 |= ((getPostalCode) getbirthdatefull6).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6) ? 32 : 16;
                }
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode7.write(i5 & 1, (i5 & 147) != 146)) {
                    PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl = (PickupDropOffSingleDeliveryUiModelImpl) pickupDropOffSingleDeliveryUiModel;
                    TextIndent textIndent = (TextIndent) ExtrasKt.write(pickupDropOffSingleDeliveryUiModelImpl.MediaMetadataCompat, getpostalcode7, 0).getValue();
                    if (textIndent != null) {
                        getpostalcode7.serializer(263265558);
                        SingleDeliveryPageKt.SingleDeliveryPage(textIndent, (getActionViewIntentlambda0) signInDataStore.serializer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6, (i2) signInDataStore.RemoteActionCompatParcelizer, (findComposableMethod) signInDataStore.read, null, getpostalcode7, (i5 << 3) & 896);
                        getpostalcode7.IconCompatParcelizer(false);
                    } else {
                        getpostalcode7.serializer(263572551);
                        getpostalcode7.IconCompatParcelizer(false);
                    }
                    int i29 = i5 & 14;
                    boolean z6 = i29 == 4;
                    Object objComponentActivity6 = getpostalcode7.ComponentActivity();
                    if (z6 || objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(28, pickupDropOffSingleDeliveryUiModel);
                        getpostalcode7.write(objComponentActivity6);
                    }
                    RangesKt.RemoteActionCompatParcelizer(pickupDropOffSingleDeliveryUiModel, (accessisRenderNodeCompatiblecp) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode7, i29, 2);
                    getQueryContext getquerycontext3 = pickupDropOffSingleDeliveryUiModelImpl.read;
                    boolean z7 = (i5 & 112) == 32;
                    Object objComponentActivity7 = getpostalcode7.ComponentActivity();
                    if (z7) {
                        objComponentActivity7 = new getLifecycleRegistry(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6, 3);
                        getpostalcode7.write(objComponentActivity7);
                    } else {
                        int i30 = read + 97;
                        RemoteActionCompatParcelizer = i30 % Fields.SpotShadowColor;
                        if (i30 % 2 != 0) {
                            throw null;
                        }
                        if (objComponentActivity7 == androidContentCaptureManager) {
                            objComponentActivity7 = new getLifecycleRegistry(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6, 3);
                            getpostalcode7.write(objComponentActivity7);
                        }
                    }
                    SQLite.write(getquerycontext3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7, getpostalcode7, 8);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                AndroidUiFrameClock androidUiFrameClock = (AndroidUiFrameClock) obj5;
                DatePickerTaskUiModelImpl datePickerTaskUiModelImpl = (DatePickerTaskUiModelImpl) obj;
                Boolean bool = (Boolean) obj2;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                datePickerTaskUiModelImpl.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i6 = (((getPostalCode) getbirthdatefull7).read(datePickerTaskUiModelImpl) ? 4 : 2) | iIntValue8;
                } else {
                    i6 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    int i31 = RemoteActionCompatParcelizer + 27;
                    read = i31 % Fields.SpotShadowColor;
                    if (i31 % 2 == 0) {
                        ((getPostalCode) getbirthdatefull7).read(bool);
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    if (((getPostalCode) getbirthdatefull7).read(bool)) {
                        int i32 = RemoteActionCompatParcelizer + 115;
                        read = i32 % Fields.SpotShadowColor;
                        i7 = i32 % 2 == 0 ? 124 : 32;
                    } else {
                        i7 = 16;
                    }
                    i6 |= i7;
                }
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode8.write(i6 & 1, (i6 & 147) != 146)) {
                    int i33 = read + 103;
                    RemoteActionCompatParcelizer = i33 % Fields.SpotShadowColor;
                    int i34 = i33 % 2;
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(datePickerTaskUiModelImpl.ParcelableVolumeInfo, getpostalcode8, 0);
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer3 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode8.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    getQueryContext getquerycontext4 = datePickerTaskUiModelImpl.write;
                    boolean z8 = getpostalcode8.read(androidUiFrameClock);
                    boolean zIconCompatParcelizer9 = getpostalcode8.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer3);
                    boolean z9 = (i6 & 14) == 4;
                    Object objComponentActivity8 = getpostalcode8.ComponentActivity();
                    if ((z9 | z8 | zIconCompatParcelizer9) || objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new NestScreenKt$$ExternalSyntheticLambda0(androidUiFrameClock, fragmentActivityRemoteActionCompatParcelizer3, datePickerTaskUiModelImpl, 1);
                        getpostalcode8.write(objComponentActivity8);
                    }
                    SQLite.write(getquerycontext4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode8, 8);
                    createTransitionInfolambda1 createtransitioninfolambda1 = (createTransitionInfolambda1) populateViewStructure_androidKtpopulate7Write2.getValue();
                    if (createtransitioninfolambda1 instanceof allAnimations) {
                        getpostalcode8.serializer(-27760971);
                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((allAnimations) createtransitioninfolambda1).IconCompatParcelizer.write(), bool, null, ExtrasKt.write(1858115415, new NestFragment$$ExternalSyntheticLambda1(11, datePickerTaskUiModelImpl), getpostalcode8), getpostalcode8, (i6 & 112) | 3072);
                        getpostalcode8.IconCompatParcelizer(false);
                    } else {
                        if (!(createtransitioninfolambda1 instanceof createTransitionInfolambda2)) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode8, 276196620, false);
                        }
                        getpostalcode8.serializer(276211021);
                        getpostalcode8.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 10:
                RouterLogger routerLogger = (RouterLogger) obj5;
                accessgetInfinitycp accessgetinfinitycp = (accessgetInfinitycp) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean zBooleanValue2 = bool2.booleanValue();
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                accessgetinfinitycp.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i8 = (((getPostalCode) getbirthdatefull8).read(accessgetinfinitycp) ? 4 : 2) | iIntValue9;
                } else {
                    i8 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i8 |= ((getPostalCode) getbirthdatefull8).write(zBooleanValue2) ? 32 : 16;
                }
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode9.write(i8 & 1, (i8 & 147) != 146)) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = ExtrasKt.write(accessgetinfinitycp.MediaSessionCompatQueueItem, getpostalcode9, 0);
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer4 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode9.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    getTransactionExecutor gettransactionexecutor = (getTransactionExecutor) routerLogger.read;
                    boolean z10 = (i8 & 14) == 4;
                    Object objComponentActivity9 = getpostalcode9.ComponentActivity();
                    if (z10 || objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = new SwitcherKt$Switcher$2$1(0, accessgetinfinitycp, accessgetInfinitycp.class, "launchScanner", "launchScanner()V", 0, 23);
                        getpostalcode9.write(objComponentActivity9);
                    }
                    getSuspendingTransactionContext.write(gettransactionexecutor, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity9), null, null, false, getpostalcode9, 8, 28);
                    getQueryContext getquerycontext5 = accessgetinfinitycp.read;
                    boolean zIconCompatParcelizer10 = getpostalcode9.IconCompatParcelizer(routerLogger);
                    boolean zIconCompatParcelizer11 = getpostalcode9.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer4);
                    Object objComponentActivity10 = getpostalcode9.ComponentActivity();
                    if ((zIconCompatParcelizer10 | zIconCompatParcelizer11) || objComponentActivity10 == androidContentCaptureManager) {
                        objComponentActivity10 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(routerLogger, i17, fragmentActivityRemoteActionCompatParcelizer4);
                        getpostalcode9.write(objComponentActivity10);
                    }
                    SQLite.write(getquerycontext5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10, getpostalcode9, 8);
                    getDensityannotations getdensityannotations = (getDensityannotations) populateViewStructure_androidKtpopulate7Write3.getValue();
                    if (getdensityannotations instanceof DensityDefaultImpls) {
                        getpostalcode9.serializer(-857218924);
                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((DensityDefaultImpls) getdensityannotations).IconCompatParcelizer.write(), bool2, null, ExtrasKt.write(855952503, new NestFragment$$ExternalSyntheticLambda1(12, accessgetinfinitycp), getpostalcode9), getpostalcode9, (i8 & 112) | 3072);
                        getpostalcode9.IconCompatParcelizer(false);
                    } else {
                        if (!(getdensityannotations instanceof widthMask)) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode9, 1496365415, false);
                        }
                        getpostalcode9.serializer(1496383629);
                        getpostalcode9.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                i2 i2Var = (i2) obj5;
                PickUpDropOffTasksUiModelV2 pickUpDropOffTasksUiModelV2 = (PickUpDropOffTasksUiModelV2) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                pickUpDropOffTasksUiModelV2.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7.getClass();
                if ((iIntValue10 & 6) == 0) {
                    if (((getPostalCode) getbirthdatefull9).read(pickUpDropOffTasksUiModelV2)) {
                        int i35 = read + 41;
                        RemoteActionCompatParcelizer = i35 % Fields.SpotShadowColor;
                        int i36 = i35 % 2;
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    i9 = i10 | iIntValue10;
                } else {
                    i9 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i9 |= !((getPostalCode) getbirthdatefull9).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7) ? 16 : 32;
                }
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode10.write(i9 & 1, (i9 & 147) != 146)) {
                    Object objComponentActivity11 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity11 == androidContentCaptureManager) {
                        ((Path$Companion) i2Var.RemoteActionCompatParcelizer).getClass();
                        objComponentActivity11 = getEm.serializer;
                        getpostalcode10.write(objComponentActivity11);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity11;
                    Object objComponentActivity12 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity12 == androidContentCaptureManager) {
                        getAnimatedProperties getanimatedproperties = (getAnimatedProperties) i2Var.MediaMetadataCompat;
                        getanimatedproperties.getClass();
                        objComponentActivity12 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(20, getanimatedproperties), true, -1604530662);
                        getpostalcode10.write(objComponentActivity12);
                    }
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity12;
                    Object objComponentActivity13 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity13 == androidContentCaptureManager) {
                        getTransitions gettransitions = (getTransitions) i2Var.serializer;
                        gettransitions.getClass();
                        objComponentActivity13 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(21, gettransitions), true, 2096651134);
                        getpostalcode10.write(objComponentActivity13);
                    }
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity13;
                    Object objComponentActivity14 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity14 == androidContentCaptureManager) {
                        toIntSizeuvyYCjk tointsizeuvyycjk = (toIntSizeuvyYCjk) ((timesYEO4UFw) i2Var.IconCompatParcelizer);
                        tointsizeuvyycjk.getClass();
                        objComponentActivity14 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(14, tointsizeuvyycjk), true, -2028411595);
                        getpostalcode10.write(objComponentActivity14);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity14;
                    Object objComponentActivity15 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity15 == androidContentCaptureManager) {
                        ((isMainThread) i2Var.MediaDescriptionCompat).getClass();
                        objComponentActivity15 = Inspectablelambda0.serializer;
                        getpostalcode10.write(objComponentActivity15);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity15;
                    Object objComponentActivity16 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity16 == androidContentCaptureManager) {
                        AndroidUiFrameClock androidUiFrameClock2 = (AndroidUiFrameClock) i2Var.write;
                        androidUiFrameClock2.getClass();
                        objComponentActivity16 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(9, androidUiFrameClock2), true, 1220397769);
                        getpostalcode10.write(objComponentActivity16);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity16;
                    Object objComponentActivity17 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity17 == androidContentCaptureManager) {
                        ((ImageHeaderParserImageType) i2Var.ParcelableVolumeInfo).getClass();
                        objComponentActivity17 = isUnspecifiedjoFl9Iannotations.serializer;
                        getpostalcode10.write(objComponentActivity17);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity17;
                    Object objComponentActivity18 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity18 == androidContentCaptureManager) {
                        final isMainThread ismainthread = (isMainThread) i2Var.MediaSessionCompatResultReceiverWrapper;
                        ismainthread.getClass();
                        final int i37 = 0;
                        objComponentActivity18 = new DragAndDropTargetModifierNode(new r8lambdagdus9EWsajL31FKA79xR2Pb0c4E() { // from class: o.getCenterLeftnOccac
                            private static int read = 1;
                            private static int serializer;

                            /* JADX WARN: Code duplicated, block: B:158:0x037b  */
                            /* JADX WARN: Code duplicated, block: B:29:0x0092  */
                            /* JADX WARN: Code duplicated, block: B:31:0x009d  */
                            /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
                            /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                            @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
                            public final Object serializer(Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int i38;
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                int i39;
                                int i40;
                                boolean z14;
                                int i41;
                                int i42;
                                boolean z15;
                                int i43;
                                int i44;
                                int i45;
                                int i46 = 2 % 2;
                                int i47 = i37;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                Object obj11 = ismainthread;
                                if (i47 == 0) {
                                    isMainThread ismainthread2 = (isMainThread) obj11;
                                    SignatureTaskUiModelImpl signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) obj6;
                                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                    Boolean bool3 = (Boolean) obj8;
                                    getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj9;
                                    int iIntValue11 = ((Integer) obj10).intValue();
                                    signatureTaskUiModelImpl.getClass();
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10.getClass();
                                    if ((iIntValue11 & 6) == 0) {
                                        i38 = (((getPostalCode) getbirthdatefull10).read(signatureTaskUiModelImpl) ? 4 : 2) | iIntValue11;
                                    } else {
                                        i38 = iIntValue11;
                                    }
                                    if ((iIntValue11 & 48) == 0) {
                                        i38 |= ((getPostalCode) getbirthdatefull10).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10) ? 32 : 16;
                                    }
                                    if ((iIntValue11 & 384) == 0) {
                                        if (((getPostalCode) getbirthdatefull10).read(bool3)) {
                                            i39 = androidx.compose.ui.graphics.Fields.RotationX;
                                        } else {
                                            int i48 = serializer + 111;
                                            read = i48 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i48 % 2 == 0) {
                                                int i49 = 3 / 4;
                                            }
                                            i39 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        }
                                        i38 |= i39;
                                    }
                                    getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                                    if (getpostalcode11.write(i38 & 1, (i38 & 1171) != 1170)) {
                                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = coil3.ExtrasKt.write(signatureTaskUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode11, 0);
                                        androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer5 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode11.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                        getQueryContext getquerycontext6 = signatureTaskUiModelImpl.read;
                                        boolean zIconCompatParcelizer12 = getpostalcode11.IconCompatParcelizer(ismainthread2);
                                        boolean zIconCompatParcelizer13 = getpostalcode11.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer5);
                                        if ((i38 & 14) == 4) {
                                            int i50 = serializer + 25;
                                            read = i50 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i51 = i50 % 2;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if ((i38 & 112) == 32) {
                                            int i52 = read + 61;
                                            serializer = i52 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i52 % 2 != 0) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        Object objComponentActivity19 = getpostalcode11.ComponentActivity();
                                        if ((z11 | zIconCompatParcelizer12 | zIconCompatParcelizer13 | z12) || objComponentActivity19 == androidContentCaptureManager2) {
                                            objComponentActivity19 = new NavControllerImpl$$ExternalSyntheticLambda0(ismainthread2, fragmentActivityRemoteActionCompatParcelizer5, signatureTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10, 13);
                                            getpostalcode11.write(objComponentActivity19);
                                        }
                                        androidx.sqlite.SQLite.write(getquerycontext6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity19, getpostalcode11, 8);
                                        getCenternOccac getcenternoccac = (getCenternOccac) populateViewStructure_androidKtpopulate7Write4.getValue();
                                        if (getcenternoccac instanceof containsgyyYBs) {
                                            getpostalcode11.serializer(200491203);
                                            PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((containsgyyYBs) getcenternoccac).RemoteActionCompatParcelizer.write(), bool3, null, coil3.ExtrasKt.write(-1403269839, new NestFragment$$ExternalSyntheticLambda1(19, signatureTaskUiModelImpl), getpostalcode11), getpostalcode11, ((i38 >> 3) & 112) | 3072);
                                            getpostalcode11.IconCompatParcelizer(false);
                                        } else {
                                            if (!(getcenternoccac instanceof getBottomRightnOccac)) {
                                                throw d$$ExternalSyntheticOutline0.m(getpostalcode11, 976296315, false);
                                            }
                                            int i53 = serializer + 115;
                                            read = i53 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i53 % 2 == 0) {
                                                getpostalcode11.serializer(976311367);
                                                z13 = true;
                                            } else {
                                                getpostalcode11.serializer(976311367);
                                                z13 = false;
                                            }
                                            getpostalcode11.IconCompatParcelizer(z13);
                                        }
                                    } else {
                                        getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createfromparcel2;
                                }
                                if (i47 == 1) {
                                    getAnimationObject getanimationobject = (getAnimationObject) obj11;
                                    CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = (CardCashPaymentTaskUiModelImpl) obj6;
                                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                    Boolean bool4 = (Boolean) obj8;
                                    getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj9;
                                    int iIntValue12 = ((Integer) obj10).intValue();
                                    cardCashPaymentTaskUiModelImpl.getClass();
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11.getClass();
                                    if ((iIntValue12 & 6) == 0) {
                                        if (((getPostalCode) getbirthdatefull11).read(cardCashPaymentTaskUiModelImpl)) {
                                            int i54 = serializer + 69;
                                            read = i54 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i55 = i54 % 2;
                                            i41 = 4;
                                        } else {
                                            i41 = 2;
                                        }
                                        i40 = i41 | iIntValue12;
                                    } else {
                                        i40 = iIntValue12;
                                    }
                                    if ((iIntValue12 & 48) == 0) {
                                        i40 |= ((getPostalCode) getbirthdatefull11).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11) ^ true ? 16 : 32;
                                    }
                                    if ((iIntValue12 & 384) == 0) {
                                        i40 |= ((getPostalCode) getbirthdatefull11).read(bool4) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    }
                                    getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                                    if (getpostalcode12.write(i40 & 1, (i40 & 1171) != 1170)) {
                                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write5 = coil3.ExtrasKt.write(cardCashPaymentTaskUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode12, 0);
                                        addFeatureKeys addfeaturekeys = new addFeatureKeys(1, getanimationobject);
                                        androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer6 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode12.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                        boolean zIconCompatParcelizer14 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                                        boolean z16 = getpostalcode12.read(addfeaturekeys);
                                        Object objComponentActivity20 = getpostalcode12.ComponentActivity();
                                        if ((zIconCompatParcelizer14 | z16) || objComponentActivity20 == androidContentCaptureManager2) {
                                            objComponentActivity20 = new SessionDao_Impl$$ExternalSyntheticLambda1(fragmentActivityRemoteActionCompatParcelizer6, 25, addfeaturekeys);
                                            getpostalcode12.write(objComponentActivity20);
                                        }
                                        getPhoneNumberNational.serializer(createfromparcel2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity20, getpostalcode12);
                                        getQueryContext getquerycontext7 = cardCashPaymentTaskUiModelImpl.serializer;
                                        boolean zIconCompatParcelizer15 = getpostalcode12.IconCompatParcelizer(getanimationobject);
                                        boolean zIconCompatParcelizer16 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                                        if ((i40 & 14) == 4) {
                                            int i56 = serializer + 15;
                                            read = i56 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i57 = i56 % 2;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        boolean z17 = (i40 & 112) == 32;
                                        Object objComponentActivity21 = getpostalcode12.ComponentActivity();
                                        if ((z14 | zIconCompatParcelizer15 | zIconCompatParcelizer16 | z17) || objComponentActivity21 == androidContentCaptureManager2) {
                                            objComponentActivity21 = new NavControllerImpl$$ExternalSyntheticLambda0(getanimationobject, fragmentActivityRemoteActionCompatParcelizer6, cardCashPaymentTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11, 10);
                                            getpostalcode12.write(objComponentActivity21);
                                        }
                                        androidx.sqlite.SQLite.write(getquerycontext7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity21, getpostalcode12, 8);
                                        allChildren allchildren = (allChildren) populateViewStructure_androidKtpopulate7Write5.getValue();
                                        if (allchildren instanceof getLocation) {
                                            getpostalcode12.serializer(-2008353017);
                                            PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getLocation) allchildren).IconCompatParcelizer.write(), bool4, null, coil3.ExtrasKt.write(-954710159, new NestFragment$$ExternalSyntheticLambda1(5, cardCashPaymentTaskUiModelImpl), getpostalcode12), getpostalcode12, ((i40 >> 3) & 112) | 3072);
                                            getpostalcode12.IconCompatParcelizer(false);
                                        } else {
                                            if (!(allchildren instanceof ViewInfoUtil_androidKt)) {
                                                throw d$$ExternalSyntheticOutline0.m(getpostalcode12, 212306249, false);
                                            }
                                            getpostalcode12.serializer(212342567);
                                            getpostalcode12.IconCompatParcelizer(false);
                                        }
                                    } else {
                                        getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createfromparcel2;
                                }
                                RouterLogger routerLogger2 = (RouterLogger) obj11;
                                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) obj6;
                                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                Boolean bool5 = (Boolean) obj8;
                                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj9;
                                int iIntValue13 = ((Integer) obj10).intValue();
                                cashPaymentTaskUiModelImpl.getClass();
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12.getClass();
                                if ((iIntValue13 & 6) == 0) {
                                    if (((getPostalCode) getbirthdatefull12).read(cashPaymentTaskUiModelImpl)) {
                                        int i58 = serializer + 101;
                                        read = i58 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i59 = i58 % 2;
                                        i45 = 4;
                                    } else {
                                        i45 = 2;
                                    }
                                    i42 = i45 | iIntValue13;
                                } else {
                                    i42 = iIntValue13;
                                }
                                if ((iIntValue13 & 48) == 0) {
                                    i42 |= ((getPostalCode) getbirthdatefull12).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12) ? 32 : 16;
                                }
                                if ((iIntValue13 & 384) == 0) {
                                    int i60 = serializer + 75;
                                    read = i60 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i60 % 2 == 0) {
                                        int i61 = 87 / 0;
                                        if (((getPostalCode) getbirthdatefull12).read(bool5)) {
                                            i43 = read + 71;
                                            serializer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i43 % 2 != 0) {
                                                i44 = 29809;
                                            } else {
                                                i44 = androidx.compose.ui.graphics.Fields.RotationX;
                                            }
                                        } else {
                                            i44 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        }
                                    } else if (((getPostalCode) getbirthdatefull12).read(bool5)) {
                                        i43 = read + 71;
                                        serializer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i43 % 2 != 0) {
                                            i44 = 29809;
                                        } else {
                                            i44 = androidx.compose.ui.graphics.Fields.RotationX;
                                        }
                                    } else {
                                        i44 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    }
                                    i42 |= i44;
                                }
                                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull12;
                                if (!(!getpostalcode13.write(i42 & 1, (i42 & 1171) != 1170))) {
                                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write6 = coil3.ExtrasKt.write(cashPaymentTaskUiModelImpl.MediaSessionCompatToken, getpostalcode13, 0);
                                    androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer7 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode13.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                    getQueryContext getquerycontext8 = cashPaymentTaskUiModelImpl.read;
                                    boolean zIconCompatParcelizer17 = getpostalcode13.IconCompatParcelizer(routerLogger2);
                                    boolean zIconCompatParcelizer18 = getpostalcode13.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer7);
                                    if ((i42 & 14) == 4) {
                                        int i62 = serializer + 121;
                                        read = i62 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i63 = i62 % 2;
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    boolean z18 = (i42 & 112) == 32;
                                    Object objComponentActivity22 = getpostalcode13.ComponentActivity();
                                    if ((z15 | zIconCompatParcelizer17 | zIconCompatParcelizer18 | z18) || objComponentActivity22 == androidContentCaptureManager2) {
                                        objComponentActivity22 = new NavControllerImpl$$ExternalSyntheticLambda0(routerLogger2, fragmentActivityRemoteActionCompatParcelizer7, cashPaymentTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12, 12);
                                        getpostalcode13.write(objComponentActivity22);
                                    }
                                    androidx.sqlite.SQLite.write(getquerycontext8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity22, getpostalcode13, 8);
                                    AnimatedVisibilityComposeAnimation_androidKt animatedVisibilityComposeAnimation_androidKt = (AnimatedVisibilityComposeAnimation_androidKt) populateViewStructure_androidKtpopulate7Write6.getValue();
                                    if (animatedVisibilityComposeAnimation_androidKt instanceof getChildTransitionannotations) {
                                        getpostalcode13.serializer(2062412410);
                                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getChildTransitionannotations) animatedVisibilityComposeAnimation_androidKt).serializer.write(), bool5, null, coil3.ExtrasKt.write(88827985, new NestFragment$$ExternalSyntheticLambda1(6, cashPaymentTaskUiModelImpl), getpostalcode13), getpostalcode13, ((i42 >> 3) & 112) | 3072);
                                        getpostalcode13.IconCompatParcelizer(false);
                                    } else {
                                        if (!(animatedVisibilityComposeAnimation_androidKt instanceof AnimationSearch)) {
                                            throw d$$ExternalSyntheticOutline0.m(getpostalcode13, -487662486, false);
                                        }
                                        getpostalcode13.serializer(-487632089);
                                        getpostalcode13.IconCompatParcelizer(false);
                                    }
                                } else {
                                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }
                                return createfromparcel2;
                            }
                        }, true, -1058200797);
                        getpostalcode10.write(objComponentActivity18);
                    }
                    r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e = (r8lambdagdus9EWsajL31FKA79xR2Pb0c4E) objComponentActivity18;
                    Object objComponentActivity19 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity19 == androidContentCaptureManager) {
                        final RouterLogger routerLogger2 = (RouterLogger) i2Var.MediaSessionCompatQueueItem;
                        routerLogger2.getClass();
                        objComponentActivity19 = new DragAndDropTargetModifierNode(new r8lambdagdus9EWsajL31FKA79xR2Pb0c4E() { // from class: o.getCenterLeftnOccac
                            private static int read = 1;
                            private static int serializer;

                            /* JADX WARN: Code duplicated, block: B:158:0x037b  */
                            /* JADX WARN: Code duplicated, block: B:29:0x0092  */
                            /* JADX WARN: Code duplicated, block: B:31:0x009d  */
                            /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
                            /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                            @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
                            public final Object serializer(Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int i38;
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                int i39;
                                int i40;
                                boolean z14;
                                int i41;
                                int i42;
                                boolean z15;
                                int i43;
                                int i44;
                                int i45;
                                int i46 = 2 % 2;
                                int i47 = i13;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                Object obj11 = routerLogger2;
                                if (i47 == 0) {
                                    isMainThread ismainthread2 = (isMainThread) obj11;
                                    SignatureTaskUiModelImpl signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) obj6;
                                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                    Boolean bool3 = (Boolean) obj8;
                                    getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj9;
                                    int iIntValue11 = ((Integer) obj10).intValue();
                                    signatureTaskUiModelImpl.getClass();
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10.getClass();
                                    if ((iIntValue11 & 6) == 0) {
                                        i38 = (((getPostalCode) getbirthdatefull10).read(signatureTaskUiModelImpl) ? 4 : 2) | iIntValue11;
                                    } else {
                                        i38 = iIntValue11;
                                    }
                                    if ((iIntValue11 & 48) == 0) {
                                        i38 |= ((getPostalCode) getbirthdatefull10).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10) ? 32 : 16;
                                    }
                                    if ((iIntValue11 & 384) == 0) {
                                        if (((getPostalCode) getbirthdatefull10).read(bool3)) {
                                            i39 = androidx.compose.ui.graphics.Fields.RotationX;
                                        } else {
                                            int i48 = serializer + 111;
                                            read = i48 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i48 % 2 == 0) {
                                                int i49 = 3 / 4;
                                            }
                                            i39 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        }
                                        i38 |= i39;
                                    }
                                    getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                                    if (getpostalcode11.write(i38 & 1, (i38 & 1171) != 1170)) {
                                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = coil3.ExtrasKt.write(signatureTaskUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode11, 0);
                                        androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer5 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode11.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                        getQueryContext getquerycontext6 = signatureTaskUiModelImpl.read;
                                        boolean zIconCompatParcelizer12 = getpostalcode11.IconCompatParcelizer(ismainthread2);
                                        boolean zIconCompatParcelizer13 = getpostalcode11.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer5);
                                        if ((i38 & 14) == 4) {
                                            int i50 = serializer + 25;
                                            read = i50 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i51 = i50 % 2;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if ((i38 & 112) == 32) {
                                            int i52 = read + 61;
                                            serializer = i52 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i52 % 2 != 0) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        Object objComponentActivity110 = getpostalcode11.ComponentActivity();
                                        if ((z11 | zIconCompatParcelizer12 | zIconCompatParcelizer13 | z12) || objComponentActivity110 == androidContentCaptureManager2) {
                                            objComponentActivity110 = new NavControllerImpl$$ExternalSyntheticLambda0(ismainthread2, fragmentActivityRemoteActionCompatParcelizer5, signatureTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10, 13);
                                            getpostalcode11.write(objComponentActivity110);
                                        }
                                        androidx.sqlite.SQLite.write(getquerycontext6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity110, getpostalcode11, 8);
                                        getCenternOccac getcenternoccac = (getCenternOccac) populateViewStructure_androidKtpopulate7Write4.getValue();
                                        if (getcenternoccac instanceof containsgyyYBs) {
                                            getpostalcode11.serializer(200491203);
                                            PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((containsgyyYBs) getcenternoccac).RemoteActionCompatParcelizer.write(), bool3, null, coil3.ExtrasKt.write(-1403269839, new NestFragment$$ExternalSyntheticLambda1(19, signatureTaskUiModelImpl), getpostalcode11), getpostalcode11, ((i38 >> 3) & 112) | 3072);
                                            getpostalcode11.IconCompatParcelizer(false);
                                        } else {
                                            if (!(getcenternoccac instanceof getBottomRightnOccac)) {
                                                throw d$$ExternalSyntheticOutline0.m(getpostalcode11, 976296315, false);
                                            }
                                            int i53 = serializer + 115;
                                            read = i53 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i53 % 2 == 0) {
                                                getpostalcode11.serializer(976311367);
                                                z13 = true;
                                            } else {
                                                getpostalcode11.serializer(976311367);
                                                z13 = false;
                                            }
                                            getpostalcode11.IconCompatParcelizer(z13);
                                        }
                                    } else {
                                        getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createfromparcel2;
                                }
                                if (i47 == 1) {
                                    getAnimationObject getanimationobject = (getAnimationObject) obj11;
                                    CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = (CardCashPaymentTaskUiModelImpl) obj6;
                                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                    Boolean bool4 = (Boolean) obj8;
                                    getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj9;
                                    int iIntValue12 = ((Integer) obj10).intValue();
                                    cardCashPaymentTaskUiModelImpl.getClass();
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11.getClass();
                                    if ((iIntValue12 & 6) == 0) {
                                        if (((getPostalCode) getbirthdatefull11).read(cardCashPaymentTaskUiModelImpl)) {
                                            int i54 = serializer + 69;
                                            read = i54 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i55 = i54 % 2;
                                            i41 = 4;
                                        } else {
                                            i41 = 2;
                                        }
                                        i40 = i41 | iIntValue12;
                                    } else {
                                        i40 = iIntValue12;
                                    }
                                    if ((iIntValue12 & 48) == 0) {
                                        i40 |= ((getPostalCode) getbirthdatefull11).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11) ^ true ? 16 : 32;
                                    }
                                    if ((iIntValue12 & 384) == 0) {
                                        i40 |= ((getPostalCode) getbirthdatefull11).read(bool4) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    }
                                    getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                                    if (getpostalcode12.write(i40 & 1, (i40 & 1171) != 1170)) {
                                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write5 = coil3.ExtrasKt.write(cardCashPaymentTaskUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode12, 0);
                                        addFeatureKeys addfeaturekeys = new addFeatureKeys(1, getanimationobject);
                                        androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer6 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode12.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                        boolean zIconCompatParcelizer14 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                                        boolean z16 = getpostalcode12.read(addfeaturekeys);
                                        Object objComponentActivity20 = getpostalcode12.ComponentActivity();
                                        if ((zIconCompatParcelizer14 | z16) || objComponentActivity20 == androidContentCaptureManager2) {
                                            objComponentActivity20 = new SessionDao_Impl$$ExternalSyntheticLambda1(fragmentActivityRemoteActionCompatParcelizer6, 25, addfeaturekeys);
                                            getpostalcode12.write(objComponentActivity20);
                                        }
                                        getPhoneNumberNational.serializer(createfromparcel2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity20, getpostalcode12);
                                        getQueryContext getquerycontext7 = cardCashPaymentTaskUiModelImpl.serializer;
                                        boolean zIconCompatParcelizer15 = getpostalcode12.IconCompatParcelizer(getanimationobject);
                                        boolean zIconCompatParcelizer16 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                                        if ((i40 & 14) == 4) {
                                            int i56 = serializer + 15;
                                            read = i56 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i57 = i56 % 2;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        boolean z17 = (i40 & 112) == 32;
                                        Object objComponentActivity21 = getpostalcode12.ComponentActivity();
                                        if ((z14 | zIconCompatParcelizer15 | zIconCompatParcelizer16 | z17) || objComponentActivity21 == androidContentCaptureManager2) {
                                            objComponentActivity21 = new NavControllerImpl$$ExternalSyntheticLambda0(getanimationobject, fragmentActivityRemoteActionCompatParcelizer6, cardCashPaymentTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11, 10);
                                            getpostalcode12.write(objComponentActivity21);
                                        }
                                        androidx.sqlite.SQLite.write(getquerycontext7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity21, getpostalcode12, 8);
                                        allChildren allchildren = (allChildren) populateViewStructure_androidKtpopulate7Write5.getValue();
                                        if (allchildren instanceof getLocation) {
                                            getpostalcode12.serializer(-2008353017);
                                            PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getLocation) allchildren).IconCompatParcelizer.write(), bool4, null, coil3.ExtrasKt.write(-954710159, new NestFragment$$ExternalSyntheticLambda1(5, cardCashPaymentTaskUiModelImpl), getpostalcode12), getpostalcode12, ((i40 >> 3) & 112) | 3072);
                                            getpostalcode12.IconCompatParcelizer(false);
                                        } else {
                                            if (!(allchildren instanceof ViewInfoUtil_androidKt)) {
                                                throw d$$ExternalSyntheticOutline0.m(getpostalcode12, 212306249, false);
                                            }
                                            getpostalcode12.serializer(212342567);
                                            getpostalcode12.IconCompatParcelizer(false);
                                        }
                                    } else {
                                        getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createfromparcel2;
                                }
                                RouterLogger routerLogger3 = (RouterLogger) obj11;
                                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) obj6;
                                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                Boolean bool5 = (Boolean) obj8;
                                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj9;
                                int iIntValue13 = ((Integer) obj10).intValue();
                                cashPaymentTaskUiModelImpl.getClass();
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12.getClass();
                                if ((iIntValue13 & 6) == 0) {
                                    if (((getPostalCode) getbirthdatefull12).read(cashPaymentTaskUiModelImpl)) {
                                        int i58 = serializer + 101;
                                        read = i58 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i59 = i58 % 2;
                                        i45 = 4;
                                    } else {
                                        i45 = 2;
                                    }
                                    i42 = i45 | iIntValue13;
                                } else {
                                    i42 = iIntValue13;
                                }
                                if ((iIntValue13 & 48) == 0) {
                                    i42 |= ((getPostalCode) getbirthdatefull12).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12) ? 32 : 16;
                                }
                                if ((iIntValue13 & 384) == 0) {
                                    int i60 = serializer + 75;
                                    read = i60 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i60 % 2 == 0) {
                                        int i61 = 87 / 0;
                                        if (((getPostalCode) getbirthdatefull12).read(bool5)) {
                                            i43 = read + 71;
                                            serializer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i43 % 2 != 0) {
                                                i44 = 29809;
                                            } else {
                                                i44 = androidx.compose.ui.graphics.Fields.RotationX;
                                            }
                                        } else {
                                            i44 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        }
                                    } else if (((getPostalCode) getbirthdatefull12).read(bool5)) {
                                        i43 = read + 71;
                                        serializer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i43 % 2 != 0) {
                                            i44 = 29809;
                                        } else {
                                            i44 = androidx.compose.ui.graphics.Fields.RotationX;
                                        }
                                    } else {
                                        i44 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    }
                                    i42 |= i44;
                                }
                                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull12;
                                if (!(!getpostalcode13.write(i42 & 1, (i42 & 1171) != 1170))) {
                                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write6 = coil3.ExtrasKt.write(cashPaymentTaskUiModelImpl.MediaSessionCompatToken, getpostalcode13, 0);
                                    androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer7 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode13.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                    getQueryContext getquerycontext8 = cashPaymentTaskUiModelImpl.read;
                                    boolean zIconCompatParcelizer17 = getpostalcode13.IconCompatParcelizer(routerLogger3);
                                    boolean zIconCompatParcelizer18 = getpostalcode13.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer7);
                                    if ((i42 & 14) == 4) {
                                        int i62 = serializer + 121;
                                        read = i62 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i63 = i62 % 2;
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    boolean z18 = (i42 & 112) == 32;
                                    Object objComponentActivity22 = getpostalcode13.ComponentActivity();
                                    if ((z15 | zIconCompatParcelizer17 | zIconCompatParcelizer18 | z18) || objComponentActivity22 == androidContentCaptureManager2) {
                                        objComponentActivity22 = new NavControllerImpl$$ExternalSyntheticLambda0(routerLogger3, fragmentActivityRemoteActionCompatParcelizer7, cashPaymentTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12, 12);
                                        getpostalcode13.write(objComponentActivity22);
                                    }
                                    androidx.sqlite.SQLite.write(getquerycontext8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity22, getpostalcode13, 8);
                                    AnimatedVisibilityComposeAnimation_androidKt animatedVisibilityComposeAnimation_androidKt = (AnimatedVisibilityComposeAnimation_androidKt) populateViewStructure_androidKtpopulate7Write6.getValue();
                                    if (animatedVisibilityComposeAnimation_androidKt instanceof getChildTransitionannotations) {
                                        getpostalcode13.serializer(2062412410);
                                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getChildTransitionannotations) animatedVisibilityComposeAnimation_androidKt).serializer.write(), bool5, null, coil3.ExtrasKt.write(88827985, new NestFragment$$ExternalSyntheticLambda1(6, cashPaymentTaskUiModelImpl), getpostalcode13), getpostalcode13, ((i42 >> 3) & 112) | 3072);
                                        getpostalcode13.IconCompatParcelizer(false);
                                    } else {
                                        if (!(animatedVisibilityComposeAnimation_androidKt instanceof AnimationSearch)) {
                                            throw d$$ExternalSyntheticOutline0.m(getpostalcode13, -487662486, false);
                                        }
                                        getpostalcode13.serializer(-487632089);
                                        getpostalcode13.IconCompatParcelizer(false);
                                    }
                                } else {
                                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }
                                return createfromparcel2;
                            }
                        }, true, -630674365);
                        getpostalcode10.write(objComponentActivity19);
                    }
                    r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e2 = (r8lambdagdus9EWsajL31FKA79xR2Pb0c4E) objComponentActivity19;
                    Object objComponentActivity20 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity20 == androidContentCaptureManager) {
                        final getAnimationObject getanimationobject = (getAnimationObject) ((hasBounds) i2Var.MediaBrowserCompatMediaItem);
                        getanimationobject.getClass();
                        final int i38 = 1;
                        objComponentActivity20 = new DragAndDropTargetModifierNode(new r8lambdagdus9EWsajL31FKA79xR2Pb0c4E() { // from class: o.getCenterLeftnOccac
                            private static int read = 1;
                            private static int serializer;

                            /* JADX WARN: Code duplicated, block: B:158:0x037b  */
                            /* JADX WARN: Code duplicated, block: B:29:0x0092  */
                            /* JADX WARN: Code duplicated, block: B:31:0x009d  */
                            /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
                            /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                            @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
                            public final Object serializer(Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                                int i39;
                                boolean z11;
                                boolean z12;
                                boolean z13;
                                int i310;
                                int i40;
                                boolean z14;
                                int i41;
                                int i42;
                                boolean z15;
                                int i43;
                                int i44;
                                int i45;
                                int i46 = 2 % 2;
                                int i47 = i38;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                Object obj11 = getanimationobject;
                                if (i47 == 0) {
                                    isMainThread ismainthread2 = (isMainThread) obj11;
                                    SignatureTaskUiModelImpl signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) obj6;
                                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                    Boolean bool3 = (Boolean) obj8;
                                    getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj9;
                                    int iIntValue11 = ((Integer) obj10).intValue();
                                    signatureTaskUiModelImpl.getClass();
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10.getClass();
                                    if ((iIntValue11 & 6) == 0) {
                                        i39 = (((getPostalCode) getbirthdatefull10).read(signatureTaskUiModelImpl) ? 4 : 2) | iIntValue11;
                                    } else {
                                        i39 = iIntValue11;
                                    }
                                    if ((iIntValue11 & 48) == 0) {
                                        i39 |= ((getPostalCode) getbirthdatefull10).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10) ? 32 : 16;
                                    }
                                    if ((iIntValue11 & 384) == 0) {
                                        if (((getPostalCode) getbirthdatefull10).read(bool3)) {
                                            i310 = androidx.compose.ui.graphics.Fields.RotationX;
                                        } else {
                                            int i48 = serializer + 111;
                                            read = i48 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i48 % 2 == 0) {
                                                int i49 = 3 / 4;
                                            }
                                            i310 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        }
                                        i39 |= i310;
                                    }
                                    getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                                    if (getpostalcode11.write(i39 & 1, (i39 & 1171) != 1170)) {
                                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = coil3.ExtrasKt.write(signatureTaskUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode11, 0);
                                        androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer5 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode11.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                        getQueryContext getquerycontext6 = signatureTaskUiModelImpl.read;
                                        boolean zIconCompatParcelizer12 = getpostalcode11.IconCompatParcelizer(ismainthread2);
                                        boolean zIconCompatParcelizer13 = getpostalcode11.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer5);
                                        if ((i39 & 14) == 4) {
                                            int i50 = serializer + 25;
                                            read = i50 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i51 = i50 % 2;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if ((i39 & 112) == 32) {
                                            int i52 = read + 61;
                                            serializer = i52 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i52 % 2 != 0) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        Object objComponentActivity110 = getpostalcode11.ComponentActivity();
                                        if ((z11 | zIconCompatParcelizer12 | zIconCompatParcelizer13 | z12) || objComponentActivity110 == androidContentCaptureManager2) {
                                            objComponentActivity110 = new NavControllerImpl$$ExternalSyntheticLambda0(ismainthread2, fragmentActivityRemoteActionCompatParcelizer5, signatureTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10, 13);
                                            getpostalcode11.write(objComponentActivity110);
                                        }
                                        androidx.sqlite.SQLite.write(getquerycontext6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity110, getpostalcode11, 8);
                                        getCenternOccac getcenternoccac = (getCenternOccac) populateViewStructure_androidKtpopulate7Write4.getValue();
                                        if (getcenternoccac instanceof containsgyyYBs) {
                                            getpostalcode11.serializer(200491203);
                                            PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((containsgyyYBs) getcenternoccac).RemoteActionCompatParcelizer.write(), bool3, null, coil3.ExtrasKt.write(-1403269839, new NestFragment$$ExternalSyntheticLambda1(19, signatureTaskUiModelImpl), getpostalcode11), getpostalcode11, ((i39 >> 3) & 112) | 3072);
                                            getpostalcode11.IconCompatParcelizer(false);
                                        } else {
                                            if (!(getcenternoccac instanceof getBottomRightnOccac)) {
                                                throw d$$ExternalSyntheticOutline0.m(getpostalcode11, 976296315, false);
                                            }
                                            int i53 = serializer + 115;
                                            read = i53 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i53 % 2 == 0) {
                                                getpostalcode11.serializer(976311367);
                                                z13 = true;
                                            } else {
                                                getpostalcode11.serializer(976311367);
                                                z13 = false;
                                            }
                                            getpostalcode11.IconCompatParcelizer(z13);
                                        }
                                    } else {
                                        getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createfromparcel2;
                                }
                                if (i47 == 1) {
                                    getAnimationObject getanimationobject2 = (getAnimationObject) obj11;
                                    CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = (CardCashPaymentTaskUiModelImpl) obj6;
                                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                    Boolean bool4 = (Boolean) obj8;
                                    getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj9;
                                    int iIntValue12 = ((Integer) obj10).intValue();
                                    cardCashPaymentTaskUiModelImpl.getClass();
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11.getClass();
                                    if ((iIntValue12 & 6) == 0) {
                                        if (((getPostalCode) getbirthdatefull11).read(cardCashPaymentTaskUiModelImpl)) {
                                            int i54 = serializer + 69;
                                            read = i54 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i55 = i54 % 2;
                                            i41 = 4;
                                        } else {
                                            i41 = 2;
                                        }
                                        i40 = i41 | iIntValue12;
                                    } else {
                                        i40 = iIntValue12;
                                    }
                                    if ((iIntValue12 & 48) == 0) {
                                        i40 |= ((getPostalCode) getbirthdatefull11).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11) ^ true ? 16 : 32;
                                    }
                                    if ((iIntValue12 & 384) == 0) {
                                        i40 |= ((getPostalCode) getbirthdatefull11).read(bool4) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    }
                                    getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                                    if (getpostalcode12.write(i40 & 1, (i40 & 1171) != 1170)) {
                                        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write5 = coil3.ExtrasKt.write(cardCashPaymentTaskUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode12, 0);
                                        addFeatureKeys addfeaturekeys = new addFeatureKeys(1, getanimationobject2);
                                        androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer6 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode12.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                        boolean zIconCompatParcelizer14 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                                        boolean z16 = getpostalcode12.read(addfeaturekeys);
                                        Object objComponentActivity21 = getpostalcode12.ComponentActivity();
                                        if ((zIconCompatParcelizer14 | z16) || objComponentActivity21 == androidContentCaptureManager2) {
                                            objComponentActivity21 = new SessionDao_Impl$$ExternalSyntheticLambda1(fragmentActivityRemoteActionCompatParcelizer6, 25, addfeaturekeys);
                                            getpostalcode12.write(objComponentActivity21);
                                        }
                                        getPhoneNumberNational.serializer(createfromparcel2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity21, getpostalcode12);
                                        getQueryContext getquerycontext7 = cardCashPaymentTaskUiModelImpl.serializer;
                                        boolean zIconCompatParcelizer15 = getpostalcode12.IconCompatParcelizer(getanimationobject2);
                                        boolean zIconCompatParcelizer16 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                                        if ((i40 & 14) == 4) {
                                            int i56 = serializer + 15;
                                            read = i56 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i57 = i56 % 2;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        boolean z17 = (i40 & 112) == 32;
                                        Object objComponentActivity22 = getpostalcode12.ComponentActivity();
                                        if ((z14 | zIconCompatParcelizer15 | zIconCompatParcelizer16 | z17) || objComponentActivity22 == androidContentCaptureManager2) {
                                            objComponentActivity22 = new NavControllerImpl$$ExternalSyntheticLambda0(getanimationobject2, fragmentActivityRemoteActionCompatParcelizer6, cardCashPaymentTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11, 10);
                                            getpostalcode12.write(objComponentActivity22);
                                        }
                                        androidx.sqlite.SQLite.write(getquerycontext7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity22, getpostalcode12, 8);
                                        allChildren allchildren = (allChildren) populateViewStructure_androidKtpopulate7Write5.getValue();
                                        if (allchildren instanceof getLocation) {
                                            getpostalcode12.serializer(-2008353017);
                                            PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getLocation) allchildren).IconCompatParcelizer.write(), bool4, null, coil3.ExtrasKt.write(-954710159, new NestFragment$$ExternalSyntheticLambda1(5, cardCashPaymentTaskUiModelImpl), getpostalcode12), getpostalcode12, ((i40 >> 3) & 112) | 3072);
                                            getpostalcode12.IconCompatParcelizer(false);
                                        } else {
                                            if (!(allchildren instanceof ViewInfoUtil_androidKt)) {
                                                throw d$$ExternalSyntheticOutline0.m(getpostalcode12, 212306249, false);
                                            }
                                            getpostalcode12.serializer(212342567);
                                            getpostalcode12.IconCompatParcelizer(false);
                                        }
                                    } else {
                                        getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createfromparcel2;
                                }
                                RouterLogger routerLogger3 = (RouterLogger) obj11;
                                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) obj6;
                                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                                Boolean bool5 = (Boolean) obj8;
                                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj9;
                                int iIntValue13 = ((Integer) obj10).intValue();
                                cashPaymentTaskUiModelImpl.getClass();
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12.getClass();
                                if ((iIntValue13 & 6) == 0) {
                                    if (((getPostalCode) getbirthdatefull12).read(cashPaymentTaskUiModelImpl)) {
                                        int i58 = serializer + 101;
                                        read = i58 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i59 = i58 % 2;
                                        i45 = 4;
                                    } else {
                                        i45 = 2;
                                    }
                                    i42 = i45 | iIntValue13;
                                } else {
                                    i42 = iIntValue13;
                                }
                                if ((iIntValue13 & 48) == 0) {
                                    i42 |= ((getPostalCode) getbirthdatefull12).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12) ? 32 : 16;
                                }
                                if ((iIntValue13 & 384) == 0) {
                                    int i60 = serializer + 75;
                                    read = i60 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i60 % 2 == 0) {
                                        int i61 = 87 / 0;
                                        if (((getPostalCode) getbirthdatefull12).read(bool5)) {
                                            i43 = read + 71;
                                            serializer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i43 % 2 != 0) {
                                                i44 = 29809;
                                            } else {
                                                i44 = androidx.compose.ui.graphics.Fields.RotationX;
                                            }
                                        } else {
                                            i44 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        }
                                    } else if (((getPostalCode) getbirthdatefull12).read(bool5)) {
                                        i43 = read + 71;
                                        serializer = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i43 % 2 != 0) {
                                            i44 = 29809;
                                        } else {
                                            i44 = androidx.compose.ui.graphics.Fields.RotationX;
                                        }
                                    } else {
                                        i44 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    }
                                    i42 |= i44;
                                }
                                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull12;
                                if (!(!getpostalcode13.write(i42 & 1, (i42 & 1171) != 1170))) {
                                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write6 = coil3.ExtrasKt.write(cashPaymentTaskUiModelImpl.MediaSessionCompatToken, getpostalcode13, 0);
                                    androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer7 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode13.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                                    getQueryContext getquerycontext8 = cashPaymentTaskUiModelImpl.read;
                                    boolean zIconCompatParcelizer17 = getpostalcode13.IconCompatParcelizer(routerLogger3);
                                    boolean zIconCompatParcelizer18 = getpostalcode13.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer7);
                                    if ((i42 & 14) == 4) {
                                        int i62 = serializer + 121;
                                        read = i62 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i63 = i62 % 2;
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    boolean z18 = (i42 & 112) == 32;
                                    Object objComponentActivity23 = getpostalcode13.ComponentActivity();
                                    if ((z15 | zIconCompatParcelizer17 | zIconCompatParcelizer18 | z18) || objComponentActivity23 == androidContentCaptureManager2) {
                                        objComponentActivity23 = new NavControllerImpl$$ExternalSyntheticLambda0(routerLogger3, fragmentActivityRemoteActionCompatParcelizer7, cashPaymentTaskUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12, 12);
                                        getpostalcode13.write(objComponentActivity23);
                                    }
                                    androidx.sqlite.SQLite.write(getquerycontext8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity23, getpostalcode13, 8);
                                    AnimatedVisibilityComposeAnimation_androidKt animatedVisibilityComposeAnimation_androidKt = (AnimatedVisibilityComposeAnimation_androidKt) populateViewStructure_androidKtpopulate7Write6.getValue();
                                    if (animatedVisibilityComposeAnimation_androidKt instanceof getChildTransitionannotations) {
                                        getpostalcode13.serializer(2062412410);
                                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getChildTransitionannotations) animatedVisibilityComposeAnimation_androidKt).serializer.write(), bool5, null, coil3.ExtrasKt.write(88827985, new NestFragment$$ExternalSyntheticLambda1(6, cashPaymentTaskUiModelImpl), getpostalcode13), getpostalcode13, ((i42 >> 3) & 112) | 3072);
                                        getpostalcode13.IconCompatParcelizer(false);
                                    } else {
                                        if (!(animatedVisibilityComposeAnimation_androidKt instanceof AnimationSearch)) {
                                            throw d$$ExternalSyntheticOutline0.m(getpostalcode13, -487662486, false);
                                        }
                                        getpostalcode13.serializer(-487632089);
                                        getpostalcode13.IconCompatParcelizer(false);
                                    }
                                } else {
                                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }
                                return createfromparcel2;
                            }
                        }, true, 2011391843);
                        getpostalcode10.write(objComponentActivity20);
                    }
                    r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e3 = (r8lambdagdus9EWsajL31FKA79xR2Pb0c4E) objComponentActivity20;
                    Object objComponentActivity21 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity21 == androidContentCaptureManager) {
                        RouterLogger routerLogger3 = (RouterLogger) i2Var.RatingCompat;
                        routerLogger3.getClass();
                        objComponentActivity21 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(12, routerLogger3), true, -136718763);
                        getpostalcode10.write(objComponentActivity21);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity21;
                    Object objComponentActivity22 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity22 == androidContentCaptureManager) {
                        ProtobufEncoder protobufEncoder = (ProtobufEncoder) i2Var.read;
                        protobufEncoder.getClass();
                        objComponentActivity22 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(13, protobufEncoder), true, -234519882);
                        getpostalcode10.write(objComponentActivity22);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity22;
                    Object objComponentActivity23 = getpostalcode10.ComponentActivity();
                    if (objComponentActivity23 == androidContentCaptureManager) {
                        RouterLogger routerLogger4 = (RouterLogger) i2Var.PlaybackStateCompatCustomAction;
                        routerLogger4.getClass();
                        objComponentActivity23 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(i16, routerLogger4), true, -1562686999);
                        getpostalcode10.write(objComponentActivity23);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity23;
                    int i39 = i9 & 14;
                    boolean z11 = i39 == 4;
                    Object objComponentActivity24 = getpostalcode10.ComponentActivity();
                    if (!(!z11) || objComponentActivity24 == androidContentCaptureManager) {
                        objComponentActivity24 = new RetryWithDelay$$ExternalSyntheticLambda0(6, pickUpDropOffTasksUiModelV2);
                        getpostalcode10.write(objComponentActivity24);
                    }
                    RangesKt.RemoteActionCompatParcelizer(pickUpDropOffTasksUiModelV2, (accessisRenderNodeCompatiblecp) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity24, getpostalcode10, i39, 2);
                    PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = (PickUpDropOffTasksUiModelV2Impl) pickUpDropOffTasksUiModelV2;
                    getQueryContext getquerycontext6 = pickUpDropOffTasksUiModelV2Impl.IconCompatParcelizer;
                    boolean zIconCompatParcelizer12 = getpostalcode10.IconCompatParcelizer(i2Var);
                    boolean z12 = (i9 & 112) == 32;
                    Object objComponentActivity25 = getpostalcode10.ComponentActivity();
                    if ((zIconCompatParcelizer12 | z12) || objComponentActivity25 == androidContentCaptureManager) {
                        objComponentActivity25 = new getLifecycleRegistry(4, i2Var, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7);
                        getpostalcode10.write(objComponentActivity25);
                    }
                    SQLite.write(getquerycontext6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity25, getpostalcode10, 8);
                    TasksComposableV2Kt.TasksComposableV2(pickUpDropOffTasksUiModelV2, new takeOrElsegVKV90s(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3, r8lambdagdus9ewsajl31fka79xr2pb0c4e3, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5, r8lambdagdus9ewsajl31fka79xr2pb0c4e, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, r8lambdagdus9ewsajl31fka79xr2pb0c4e2, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7, ((Boolean) ExtrasKt.write(((createAnimation) i2Var.PlaybackStateCompat).serializer, getpostalcode10, 0).getValue()).booleanValue(), ((Boolean) ExtrasKt.write(pickUpDropOffTasksUiModelV2Impl.PlaybackStateCompatCustomAction, getpostalcode10, 0).getValue()).booleanValue(), null, getpostalcode10, i39 | ((i9 << 3) & 896));
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 12:
                RouterLogger routerLogger5 = (RouterLogger) obj5;
                getTopD9Ej5fMannotations gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) obj;
                Boolean bool3 = (Boolean) obj2;
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                gettopd9ej5fmannotations.getClass();
                if ((iIntValue11 & 6) == 0) {
                    i11 = (((getPostalCode) getbirthdatefull10).read(gettopd9ej5fmannotations) ? 4 : 2) | iIntValue11;
                } else {
                    i11 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i11 |= ((getPostalCode) getbirthdatefull10).read(bool3) ? 32 : 16;
                }
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                if (!(!getpostalcode11.write(i11 & 1, (i11 & 147) != 146))) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write4 = ExtrasKt.write(gettopd9ej5fmannotations.MediaSessionCompatResultReceiverWrapper, getpostalcode11, 0);
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer5 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode11.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    int i40 = i11 & 14;
                    boolean z13 = i40 == 4;
                    Object objComponentActivity26 = getpostalcode11.ComponentActivity();
                    if (z13 || objComponentActivity26 == androidContentCaptureManager) {
                        objComponentActivity26 = new SwitcherUiModelImpl$1(gettopd9ej5fmannotations, shortNewsContentCardView, 23);
                        getpostalcode11.write(objComponentActivity26);
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode11, gettopd9ej5fmannotations, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity26);
                    getQueryContext getquerycontext7 = gettopd9ej5fmannotations.serializer;
                    boolean zIconCompatParcelizer13 = getpostalcode11.IconCompatParcelizer(routerLogger5);
                    boolean zIconCompatParcelizer14 = getpostalcode11.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer5);
                    boolean z14 = i40 == 4;
                    Object objComponentActivity27 = getpostalcode11.ComponentActivity();
                    if ((zIconCompatParcelizer13 | zIconCompatParcelizer14 | z14) || objComponentActivity27 == androidContentCaptureManager) {
                        objComponentActivity27 = new NestScreenKt$$ExternalSyntheticLambda0(routerLogger5, fragmentActivityRemoteActionCompatParcelizer5, gettopd9ej5fmannotations, i18);
                        getpostalcode11.write(objComponentActivity27);
                    }
                    SQLite.write(getquerycontext7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity27, getpostalcode11, 8);
                    getYD9Ej5fMannotations getyd9ej5fmannotations = (getYD9Ej5fMannotations) populateViewStructure_androidKtpopulate7Write4.getValue();
                    if (getyd9ej5fmannotations instanceof getYD9Ej5fM) {
                        getpostalcode11.serializer(-1358885329);
                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((getYD9Ej5fM) getyd9ej5fmannotations).IconCompatParcelizer.write(), bool3, null, ExtrasKt.write(593828323, new NestFragment$$ExternalSyntheticLambda1(14, gettopd9ej5fmannotations), getpostalcode11), getpostalcode11, (i11 & 112) | 3072);
                        getpostalcode11.IconCompatParcelizer(false);
                    } else {
                        if (!(getyd9ej5fmannotations instanceof plusCBMgk4)) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode11, 1757277839, false);
                        }
                        getpostalcode11.serializer(1757312793);
                        getpostalcode11.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                ProtobufEncoder protobufEncoder2 = (ProtobufEncoder) obj5;
                IntOffsetCompanion intOffsetCompanion = (IntOffsetCompanion) obj;
                Boolean bool4 = (Boolean) obj2;
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                intOffsetCompanion.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i12 = (((getPostalCode) getbirthdatefull11).read(intOffsetCompanion) ? 4 : 2) | iIntValue12;
                } else {
                    i12 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i12 |= ((getPostalCode) getbirthdatefull11).read(bool4) ? 32 : 16;
                }
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode12.write(i12 & 1, (i12 & 147) != 146)) {
                    int i41 = read + 77;
                    RemoteActionCompatParcelizer = i41 % Fields.SpotShadowColor;
                    int i42 = i41 % 2;
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write5 = ExtrasKt.write(intOffsetCompanion.write, getpostalcode12, 0);
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer6 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode12.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    getTransactionExecutor gettransactionexecutor2 = (getTransactionExecutor) protobufEncoder2.write;
                    boolean z15 = (i12 & 14) == 4;
                    Object objComponentActivity28 = getpostalcode12.ComponentActivity();
                    if (z15 || objComponentActivity28 == androidContentCaptureManager) {
                        objComponentActivity28 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, intOffsetCompanion, IntOffsetCompanion.class, "launchScanner", "launchScanner()V", 0, 8);
                        getpostalcode12.write(objComponentActivity28);
                    }
                    getSuspendingTransactionContext.write(gettransactionexecutor2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity28), null, null, false, getpostalcode12, 8, 28);
                    getQueryContext getquerycontext8 = intOffsetCompanion.read;
                    boolean zIconCompatParcelizer15 = getpostalcode12.IconCompatParcelizer(protobufEncoder2);
                    boolean zIconCompatParcelizer16 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer6);
                    Object objComponentActivity29 = getpostalcode12.ComponentActivity();
                    if ((zIconCompatParcelizer15 | zIconCompatParcelizer16) || objComponentActivity29 == androidContentCaptureManager) {
                        objComponentActivity29 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(protobufEncoder2, i16, fragmentActivityRemoteActionCompatParcelizer6);
                        getpostalcode12.write(objComponentActivity29);
                    }
                    SQLite.write(getquerycontext8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity29, getpostalcode12, 8);
                    getFontScaleannotations getfontscaleannotations = (getFontScaleannotations) populateViewStructure_androidKtpopulate7Write5.getValue();
                    if (getfontscaleannotations instanceof copyiSbpLlY) {
                        getpostalcode12.serializer(1330690872);
                        PickUpDropOffTaskWrapperKt.PickUpDropOffTaskWrapper(((copyiSbpLlY) getfontscaleannotations).RemoteActionCompatParcelizer.write(), bool4, null, ExtrasKt.write(496027204, new NestFragment$$ExternalSyntheticLambda1(16, intOffsetCompanion), getpostalcode12), getpostalcode12, (i12 & 112) | 3072);
                        getpostalcode12.IconCompatParcelizer(false);
                    } else {
                        if (!(getfontscaleannotations instanceof getZeroMYxV2XQ)) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode12, -2035287120, false);
                        }
                        getpostalcode12.serializer(-2035267046);
                        getpostalcode12.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 14:
                return invoke$com$roadrunner$delivery$pickupdropoff$tasks$takepicture$presentation$TakePictureTaskComposableFactoryV1Impl$$ExternalSyntheticLambda0(obj, obj2, obj3, obj4);
            case 15:
                SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) obj5;
                DividerItemDecoration dividerItemDecoration = (DividerItemDecoration) obj;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                int iIntValue13 = ((Integer) obj4).intValue();
                dividerItemDecoration.getClass();
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
                getPostalCode getpostalcode13 = (getPostalCode) ((getBirthDateFull) obj3);
                FragmentActivity fragmentActivityRemoteActionCompatParcelizer7 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode13.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                getQueryContext getquerycontext9 = dividerItemDecoration.MediaMetadataCompat;
                boolean zIconCompatParcelizer17 = getpostalcode13.IconCompatParcelizer(sendTestPushUseCase);
                boolean zIconCompatParcelizer18 = getpostalcode13.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer7);
                Object objComponentActivity30 = getpostalcode13.ComponentActivity();
                if ((zIconCompatParcelizer17 | zIconCompatParcelizer18) || objComponentActivity30 == androidContentCaptureManager) {
                    objComponentActivity30 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(sendTestPushUseCase, 17, fragmentActivityRemoteActionCompatParcelizer7);
                    getpostalcode13.write(objComponentActivity30);
                }
                NestNavBarContainerKt.NestNavBarContainer(dividerItemDecoration, getquerycontext9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity30, null, getpostalcode13, (iIntValue13 & 14) | 64 | ((iIntValue13 << 3) & 896));
                return createfromparcel;
            case 16:
                return read(obj, obj2, obj3, obj4);
            case 17:
                return IconCompatParcelizer(obj, obj2, obj3, obj4);
            case 18:
                ZoomableNode zoomableNode = (ZoomableNode) obj5;
                Offset offset = (Offset) obj;
                Offset offset2 = (Offset) obj2;
                float fFloatValue = ((Float) obj3).floatValue();
                long jLongValue = ((Long) obj4).longValue();
                if (zoomableNode.MediaSessionCompatQueueItem) {
                    BuildersKt.RemoteActionCompatParcelizer(zoomableNode.getCoroutineScope(), null, null, new ZoomableNode$pointerInputNode$1$7$1(zoomableNode, offset2, fFloatValue, offset, jLongValue, null), 3);
                }
                return createfromparcel;
            default:
                r8lambdarhobHpPgW3fYGaomIOtfm02vDE r8lambdarhobhppgw3fygaomiotfm02vde = (r8lambdarhobHpPgW3fYGaomIOtfm02vDE) obj;
                Modifier modifier = (Modifier) obj2;
                int iIntValue14 = ((Integer) obj4).intValue();
                r8lambdarhobhppgw3fygaomiotfm02vde.getClass();
                modifier.getClass();
                FrequentlyUsedItemsContentKt.RemoteActionCompatParcelizer(r8lambdarhobhppgw3fygaomiotfm02vde, ((r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) obj5).RemoteActionCompatParcelizer, modifier, (getBirthDateFull) obj3, (iIntValue14 & 14) | ((iIntValue14 << 3) & 896));
                return createfromparcel;
        }
    }
}
