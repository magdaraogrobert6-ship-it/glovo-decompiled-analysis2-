package com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$Editor;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.MatrixUtil;
import com.huawei.wisesecurity.ucs_credential.x;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.delivery.ontheway.address.presentation.DestinationAddressUiModelImpl;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.DestinationDetailsUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.DestinationHeaderUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderViewModel;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.navigator.ContactRiderArgs;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsViewModel;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import com.sentiance.core.model.events.H$b;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActualParagraph4FmOz70;
import o.BaselineShiftCompanion;
import o.CustomBulletSpan;
import o.DrawableTransformation;
import o.ForgottenCoroutineScopeException;
import o.ImageResources_androidKt;
import o.InfiniteAnimationPolicyDefaultImpls;
import o.IntOffsetCompanion;
import o.JoinedKey;
import o.LineHeightStyleTrim;
import o.MotionDurationScaleImplstartObservingSystemScaleFactor11;
import o.MutableSpanStyle;
import o.ParameterInformation;
import o.PlatformLocaleDelegate;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextAlignKt;
import o.accessgetContentOrRtlcp;
import o.accessgetEndcp;
import o.accessgetFalseyp;
import o.accessibleField;
import o.asExecutor;
import o.buildStyledTypefaceFO1MlWM;
import o.createFromParcel;
import o.extractFromIndyLambdaFields;
import o.getBaselineShift5SSeXJ0;
import o.getContentViewGroupParentLayout;
import o.getFontFamily;
import o.getFontFeatureSettings;
import o.getFontSizeXSAIIZE;
import o.getFontStyle4Lr2A7w;
import o.getFontSynthesisZQGJjVo;
import o.getFontWeight;
import o.getHeightD9Ej5fM;
import o.getLastLineBottomEVpEnUU;
import o.getLetterSpacingXSAIIZE;
import o.getMinimumlzQqcRY;
import o.getRtls_7Xco;
import o.getTextGeometricTransform;
import o.getTopD9Ej5fMannotations;
import o.isEditorFocused;
import o.isIncludeFontPaddingEnabled;
import o.isValidMotionEvent;
import o.lerp81ZRxRo;
import o.notifyFocusedRect;
import o.notifySubscribe;
import o.onMove;
import o.onPrimaryNavigationFragmentChanged;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.parseui_tooling;
import o.r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resolveTextDirectionHeuristicsHklW4sAdefault;
import o.sendSynthesizedKeyEvent;
import o.setBackground8_81llA;
import o.setBrush12SF9DM;
import o.setBrushSizeiaC8Vc4ui_text;
import o.setFontFamily;
import o.setParameterizedContentlambda1;
import o.setSpan;
import o.toSpan;
import o.unaryMinusXSAIIZE;
import o.valueOfE8nx0Ws;
import o.valueOfIgVj0fw;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class SwitcherUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        public final /* synthetic */ Object IconCompatParcelizer;
        public final /* synthetic */ int serializer;
        public /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.write = obj;
            this.IconCompatParcelizer = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.IconCompatParcelizer = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = read + 39;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.serializer;
            Object obj3 = this.IconCompatParcelizer;
            switch (i4) {
                case 0:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((TextAlignKt) obj3, shortNewsContentCardView, 0);
                    anonymousClass1.write = obj;
                    return anonymousClass1;
                case 1:
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1((DeliveryNotesUiModelImpl) obj3, shortNewsContentCardView, 1);
                    anonymousClass2.write = obj;
                    return anonymousClass2;
                case 2:
                    AnonymousClass1 anonymousClass3 = new AnonymousClass1((DestinationDetailsUiModelImpl) obj3, shortNewsContentCardView, i);
                    anonymousClass3.write = obj;
                    return anonymousClass3;
                case 3:
                    AnonymousClass1 anonymousClass4 = new AnonymousClass1((isIncludeFontPaddingEnabled) obj3, shortNewsContentCardView, 3);
                    anonymousClass4.write = obj;
                    int i5 = read + 65;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return anonymousClass4;
                    }
                    obj2.hashCode();
                    throw null;
                case 4:
                    return new AnonymousClass1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write, (ForgottenCoroutineScopeException) obj3, shortNewsContentCardView, 4);
                case 5:
                    AnonymousClass1 anonymousClass5 = new AnonymousClass1((resolveTextDirectionHeuristicsHklW4sAdefault) obj3, shortNewsContentCardView, 5);
                    anonymousClass5.write = obj;
                    return anonymousClass5;
                case 6:
                    AnonymousClass1 anonymousClass6 = new AnonymousClass1((DestinationHeaderUiModelImpl) obj3, shortNewsContentCardView, 6);
                    anonymousClass6.write = obj;
                    return anonymousClass6;
                case 7:
                    return new AnonymousClass1((setBrush12SF9DM) this.write, (setBrushSizeiaC8Vc4ui_text) obj3, shortNewsContentCardView, 7);
                case 8:
                    AnonymousClass1 anonymousClass7 = new AnonymousClass1((accessgetFalseyp) obj3, shortNewsContentCardView, 8);
                    anonymousClass7.write = obj;
                    return anonymousClass7;
                case 9:
                    AnonymousClass1 anonymousClass8 = new AnonymousClass1((setSpan) obj3, shortNewsContentCardView, 9);
                    anonymousClass8.write = obj;
                    return anonymousClass8;
                case 10:
                    AnonymousClass1 anonymousClass9 = new AnonymousClass1((CustomBulletSpan) obj3, shortNewsContentCardView, 10);
                    anonymousClass9.write = obj;
                    return anonymousClass9;
                case 11:
                    AnonymousClass1 anonymousClass10 = new AnonymousClass1((BaselineShiftCompanion) obj3, shortNewsContentCardView, 11);
                    anonymousClass10.write = obj;
                    return anonymousClass10;
                case 12:
                    AnonymousClass1 anonymousClass11 = new AnonymousClass1((getMinimumlzQqcRY) obj3, shortNewsContentCardView, 12);
                    anonymousClass11.write = obj;
                    return anonymousClass11;
                case 13:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((getLastLineBottomEVpEnUU) obj3, shortNewsContentCardView, 13);
                    anonymousClass12.write = obj;
                    return anonymousClass12;
                case 14:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((TripInformationUiModelImpl) obj3, shortNewsContentCardView, 14);
                    anonymousClass13.write = obj;
                    return anonymousClass13;
                case 15:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((valueOfE8nx0Ws) obj3, shortNewsContentCardView, 15);
                    anonymousClass14.write = obj;
                    return anonymousClass14;
                case 16:
                    return new AnonymousClass1((ContactRiderViewModel) this.write, (ContactRiderArgs) obj3, shortNewsContentCardView, 16);
                case 17:
                    return new AnonymousClass1((FullScreenDetailsViewModel) this.write, (FullscreenItemUi) obj3, shortNewsContentCardView, 17);
                case 18:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((PickupDropOffSingleDeliveryUiModelImpl) obj3, shortNewsContentCardView, 18);
                    anonymousClass15.write = obj;
                    return anonymousClass15;
                case 19:
                    return new AnonymousClass1((MapSafetyReportResponse) this.write, (List) obj3, shortNewsContentCardView, 19);
                case 20:
                    return new AnonymousClass1((CustomerUnavailableFragment) this.write, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 20);
                case 21:
                    return new AnonymousClass1((CustomerUnavailableFragmentV2) this.write, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 21);
                case 22:
                    return new AnonymousClass1((notifySubscribe) this.write, (accessibleField) obj3, shortNewsContentCardView, 22);
                case 23:
                    return new AnonymousClass1((CustomerUnavailableViewModel) this.write, (ParameterInformation) obj3, shortNewsContentCardView, 23);
                case 24:
                    return new AnonymousClass1((CustomerUnavailableViewModel) this.write, (JoinedKey) obj3, shortNewsContentCardView, 24);
                case 25:
                    return new AnonymousClass1((DatePickerTaskUiModelImpl) this.write, (extractFromIndyLambdaFields) obj3, shortNewsContentCardView, 25);
                case 26:
                    return new AnonymousClass1((H$b) this.write, (setParameterizedContentlambda1) obj3, shortNewsContentCardView, 26);
                case 27:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1((onViewAttachedToWindow) this.write, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 27);
                    int i6 = RemoteActionCompatParcelizer + 113;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return anonymousClass16;
                case 28:
                    return new AnonymousClass1((IntOffsetCompanion) this.write, (List) obj3, shortNewsContentCardView, 28);
                default:
                    return new AnonymousClass1((unaryMinusXSAIIZE) this.write, (String) obj3, shortNewsContentCardView, 29);
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 79;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i4) {
                case 0:
                    ((AnonymousClass1) create((valueOfIgVj0fw) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 1:
                    ((AnonymousClass1) create((asExecutor) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 2:
                    ((AnonymousClass1) create((onPrimaryNavigationFragmentChanged) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 3:
                    ((AnonymousClass1) create((PlatformLocaleDelegate) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 4:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 5:
                    ((AnonymousClass1) create((buildStyledTypefaceFO1MlWM) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 6:
                    ((AnonymousClass1) create((ActualParagraph4FmOz70) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 7:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 8:
                    ((AnonymousClass1) create((Float) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = read + 73;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return createfromparcel;
                case 9:
                    ((AnonymousClass1) create((List) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 10:
                    ((AnonymousClass1) create((toSpan) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 11:
                    ((AnonymousClass1) create((r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 12:
                    ((AnonymousClass1) create((LineHeightStyleTrim) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 13:
                    ((AnonymousClass1) create((accessgetEndcp) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i7 = read + 81;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        int i8 = 57 / 0;
                    }
                    return createfromparcel;
                case 14:
                    ((AnonymousClass1) create((accessgetContentOrRtlcp) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 15:
                    ((AnonymousClass1) create((getRtls_7Xco) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 16:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 17:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 18:
                    ((AnonymousClass1) create((List) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 19:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 20:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 21:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 22:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 23:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 24:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 25:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 26:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 27:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 28:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                default:
                    ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:132:0x047f  */
        /* JADX WARN: Code duplicated, block: B:148:0x04b4  */
        /* JADX WARN: Code duplicated, block: B:155:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:161:0x04d8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:162:0x04da  */
        /* JADX WARN: Code duplicated, block: B:163:0x04e7  */
        /* JADX WARN: Code duplicated, block: B:166:0x04ec  */
        /* JADX WARN: Code duplicated, block: B:167:0x04ef A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:168:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:169:0x04f6  */
        /* JADX WARN: Code duplicated, block: B:172:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:173:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:183:0x0517  */
        /* JADX WARN: Code duplicated, block: B:185:0x0543  */
        /* JADX WARN: Code duplicated, block: B:186:0x0551  */
        /* JADX WARN: Code duplicated, block: B:189:0x0558  */
        /* JADX WARN: Code duplicated, block: B:190:0x055a  */
        /* JADX WARN: Code duplicated, block: B:192:0x0562 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:193:0x0564  */
        /* JADX WARN: Code duplicated, block: B:195:0x0576  */
        /* JADX WARN: Code duplicated, block: B:196:0x0578  */
        /* JADX WARN: Code duplicated, block: B:198:0x0585  */
        /* JADX WARN: Code duplicated, block: B:200:0x058b  */
        /* JADX WARN: Code duplicated, block: B:218:0x05e3  */
        /* JADX WARN: Code duplicated, block: B:219:0x0612  */
        /* JADX WARN: Code duplicated, block: B:222:0x061d  */
        /* JADX WARN: Code duplicated, block: B:223:0x061f  */
        /* JADX WARN: Code duplicated, block: B:225:0x0628  */
        /* JADX WARN: Code duplicated, block: B:227:0x0634  */
        /* JADX WARN: Code duplicated, block: B:229:0x063e  */
        /* JADX WARN: Code duplicated, block: B:314:0x04bd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:317:0x04d3 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v7, types: [o.instance_delegatelambda0] */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v18 java.lang.Object, still in use, count: 2, list:
              (r7v18 java.lang.Object) from 0x05df: PHI (r7 I:??) = (r7v12 java.lang.Object), (r7v18 java.lang.Object) binds: [B:215:0x05de, B:324:0x05df] A[DONT_GENERATE, DONT_INLINE]
              (r7v18 java.lang.Object) from 0x05d3: CHECK_CAST (o.fastFilterNotNull) (r7v18 java.lang.Object)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.io.FileNotFoundException {
            /*
                Method dump skipped, instruction units count: 2438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitcherUiModelImpl$1(int i, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 25;
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitcherUiModelImpl$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        Object obj2 = this.read;
        int i4 = 1;
        switch (i3) {
            case 0:
                return new SwitcherUiModelImpl$1((TextAlignKt) obj2, shortNewsContentCardView, 0);
            case 1:
                return new SwitcherUiModelImpl$1((MidShiftIdVerificationCoordinator) obj2, shortNewsContentCardView, i4);
            case 2:
                return new SwitcherUiModelImpl$1((DestinationAddressUiModelImpl) obj2, shortNewsContentCardView, i);
            case 3:
                return new SwitcherUiModelImpl$1((CustomerChatFloatingButtonUiModel) obj2, shortNewsContentCardView, 3);
            case 4:
                return new SwitcherUiModelImpl$1((notifyFocusedRect) obj2, shortNewsContentCardView, 4);
            case 5:
                return new SwitcherUiModelImpl$1((sendSynthesizedKeyEvent) obj2, shortNewsContentCardView, 5);
            case 6:
                return new SwitcherUiModelImpl$1((isEditorFocused) obj2, shortNewsContentCardView, 6);
            case 7:
                return new SwitcherUiModelImpl$1((EntrancePictureIconUiModelImpl) obj2, shortNewsContentCardView, 7);
            case 8:
                return new SwitcherUiModelImpl$1((resolveTextDirectionHeuristicsHklW4sAdefault) obj2, shortNewsContentCardView, 8);
            case 9:
                return new SwitcherUiModelImpl$1((accessgetFalseyp) obj2, shortNewsContentCardView, 9);
            case 10:
                return new SwitcherUiModelImpl$1((CustomBulletSpan) obj2, shortNewsContentCardView, 10);
            case 11:
                return new SwitcherUiModelImpl$1((getMinimumlzQqcRY) obj2, shortNewsContentCardView, 11);
            case 12:
                return new SwitcherUiModelImpl$1((getLastLineBottomEVpEnUU) obj2, shortNewsContentCardView, 12);
            case 13:
                return new SwitcherUiModelImpl$1((TripInformationUiModelImpl) obj2, shortNewsContentCardView, 13);
            case 14:
                return new SwitcherUiModelImpl$1((valueOfE8nx0Ws) obj2, shortNewsContentCardView, 14);
            case 15:
                return new SwitcherUiModelImpl$1((BleScanningLifecycleObserverImpl) obj2, shortNewsContentCardView, 15);
            case 16:
                return new SwitcherUiModelImpl$1((PickUpDropOffUiModelImpl) obj2, shortNewsContentCardView, 16);
            case 17:
                return new SwitcherUiModelImpl$1((AcknowledgementTaskUiModelImpl) obj2, shortNewsContentCardView, 17);
            case 18:
                return new SwitcherUiModelImpl$1((CardCashPaymentTaskUiModelImpl) obj2, shortNewsContentCardView, 18);
            case 19:
                return new SwitcherUiModelImpl$1((parseui_tooling) obj2, shortNewsContentCardView, 19);
            case 20:
                SwitcherUiModelImpl$1 switcherUiModelImpl$1 = new SwitcherUiModelImpl$1((CustomerUnavailableTaskUiModelImpl) obj2, shortNewsContentCardView, 20);
                int i5 = serializer + 69;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return switcherUiModelImpl$1;
                }
                throw null;
            case 21:
                return new SwitcherUiModelImpl$1((DatePickerTaskUiModelImpl) obj2, shortNewsContentCardView, 21);
            case 22:
                SwitcherUiModelImpl$1 switcherUiModelImpl$2 = new SwitcherUiModelImpl$1((PinValidationTaskUiModelImpl) obj2, shortNewsContentCardView, 22);
                int i6 = serializer + 1;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return switcherUiModelImpl$2;
            case 23:
                return new SwitcherUiModelImpl$1((getTopD9Ej5fMannotations) obj2, shortNewsContentCardView, 23);
            case 24:
                return new SwitcherUiModelImpl$1((getHeightD9Ej5fM) obj2, shortNewsContentCardView, 24);
            case 25:
                return new SwitcherUiModelImpl$1(this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView);
            case 26:
                return new SwitcherUiModelImpl$1((PinScreenViewModel) obj2, shortNewsContentCardView, 26);
            case 27:
                return new SwitcherUiModelImpl$1((lerp81ZRxRo) obj2, shortNewsContentCardView, 27);
            case 28:
                return new SwitcherUiModelImpl$1((SignatureTaskUiModelImpl) obj2, shortNewsContentCardView, 28);
            default:
                return new SwitcherUiModelImpl$1((StackedDeliveryListUiModelImpl) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                Object objInvokeSuspend = ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = write + 105;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 15:
                return ((SwitcherUiModelImpl$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                Object objInvokeSuspend2 = ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i4 = write + 111;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 34 / 0;
                }
                return objInvokeSuspend2;
            case 27:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((SwitcherUiModelImpl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(800, r27) == r13) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:332:0x079b  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:337:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:340:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:342:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:351:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:353:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:355:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:379:0x0840  */
    /* JADX WARN: Code duplicated, block: B:381:0x0846  */
    /* JADX WARN: Code duplicated, block: B:385:0x084c  */
    /* JADX WARN: Code duplicated, block: B:388:0x0854 A[LOOP:31: B:384:0x084a->B:388:0x0854, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:390:0x085c  */
    /* JADX WARN: Code duplicated, block: B:393:0x0862  */
    /* JADX WARN: Code duplicated, block: B:432:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:434:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:436:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:441:0x0909  */
    /* JADX WARN: Code duplicated, block: B:442:0x090c  */
    /* JADX WARN: Code duplicated, block: B:588:0x07da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x08c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0859 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x085e A[EDGE_INSN: B:608:0x085e->B:391:0x085e BREAK  A[LOOP:31: B:384:0x084a->B:388:0x0854], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x08e9 A[SYNTHETIC] */
    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$tasks$qrpayment$presentation$screen$compose$RememberQrPainterKt$rememberQrPainter$1$1$bitmap$1(Object obj) throws WriterException {
        Charset charsetForName;
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo;
        int i;
        getTextGeometricTransform gettextgeometrictransformWrite;
        isValidMotionEvent isvalidmotionevent;
        getTextGeometricTransform gettextgeometrictransform;
        CharacterSetECI characterSetECI;
        int i2;
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        byte[][] bArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iAbs;
        byte[] bArr2;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        isValidMotionEvent isvalidmotionevent2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        byte[] bArr4;
        int i23;
        byte b;
        int i24;
        byte[] bArr5;
        char c;
        getFontSizeXSAIIZE getfontsizexsaiize;
        getFontSizeXSAIIZE getfontsizexsaiize2;
        getFontSizeXSAIIZE getfontsizexsaiize3;
        int i25;
        char c2;
        getFontSizeXSAIIZE getfontsizexsaiize4;
        int i26;
        int i27;
        boolean z;
        int i28 = 2;
        int i29 = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String str = (String) this.read;
        int i30 = this.RemoteActionCompatParcelizer;
        MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor11 = MotionDurationScaleImplstartObservingSystemScaleFactor11.CHARACTER_SET;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(motionDurationScaleImplstartObservingSystemScaleFactor11, Constants.ENCODING);
        MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor12 = MotionDurationScaleImplstartObservingSystemScaleFactor11.MARGIN;
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0(motionDurationScaleImplstartObservingSystemScaleFactor12, 0));
        MutableSpanStyle mutableSpanStyle = MutableSpanStyle.AZTEC;
        if (str.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Found empty contents");
            return null;
        }
        if (i30 < 0 || i30 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i30 + 'x' + i30);
        }
        getBaselineShift5SSeXJ0 getbaselineshift5ssexj0ValueOf = getBaselineShift5SSeXJ0.L;
        MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor13 = MotionDurationScaleImplstartObservingSystemScaleFactor11.ERROR_CORRECTION;
        if (mapRemoteActionCompatParcelizer.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor13)) {
            getbaselineshift5ssexj0ValueOf = getBaselineShift5SSeXJ0.valueOf(mapRemoteActionCompatParcelizer.get(motionDurationScaleImplstartObservingSystemScaleFactor13).toString());
        }
        int i31 = mapRemoteActionCompatParcelizer.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor12) ? Integer.parseInt(mapRemoteActionCompatParcelizer.get(motionDurationScaleImplstartObservingSystemScaleFactor12).toString()) : 4;
        Charset charset = Encoder.serializer;
        MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor14 = MotionDurationScaleImplstartObservingSystemScaleFactor11.GS1_FORMAT;
        boolean z2 = mapRemoteActionCompatParcelizer.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor14) && Boolean.parseBoolean(mapRemoteActionCompatParcelizer.get(motionDurationScaleImplstartObservingSystemScaleFactor14).toString());
        MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor15 = MotionDurationScaleImplstartObservingSystemScaleFactor11.QR_COMPACT;
        boolean z3 = mapRemoteActionCompatParcelizer.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor15) && Boolean.parseBoolean(mapRemoteActionCompatParcelizer.get(motionDurationScaleImplstartObservingSystemScaleFactor15).toString());
        boolean zContainsKey = mapRemoteActionCompatParcelizer.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor11);
        if (zContainsKey) {
            try {
                charsetForName = Charset.forName(mapRemoteActionCompatParcelizer.get(motionDurationScaleImplstartObservingSystemScaleFactor11).toString());
            } catch (UnsupportedCharsetException unused) {
                charsetForName = charset;
            }
        } else {
            charsetForName = charset;
        }
        if (z3) {
            getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo2 = getFontSynthesisZQGJjVo.TERMINATOR;
            if (charsetForName.equals(charset)) {
                charsetForName = null;
            }
            DiskLruCache$Editor diskLruCache$Editor = new DiskLruCache$Editor(str, charsetForName, z2, getbaselineshift5ssexj0ValueOf);
            getBaselineShift5SSeXJ0 getbaselineshift5ssexj0 = (getBaselineShift5SSeXJ0) diskLruCache$Editor.serializer;
            getTextGeometricTransform[] gettextgeometrictransformArr = {DiskLruCache$Editor.read(setFontFamily.SMALL), DiskLruCache$Editor.read(setFontFamily.MEDIUM), DiskLruCache$Editor.read(setFontFamily.LARGE)};
            x[] xVarArr = {diskLruCache$Editor.serializer(gettextgeometrictransformArr[0]), diskLruCache$Editor.serializer(gettextgeometrictransformArr[1]), diskLruCache$Editor.serializer(gettextgeometrictransformArr[2])};
            int i32 = 0;
            int i33 = Integer.MAX_VALUE;
            int i34 = -1;
            for (int i35 = 3; i32 < i35; i35 = 3) {
                x xVar = xVarArr[i32];
                int iRemoteActionCompatParcelizer = xVar.RemoteActionCompatParcelizer((getTextGeometricTransform) xVar.RemoteActionCompatParcelizer);
                if (Encoder.serializer(iRemoteActionCompatParcelizer, gettextgeometrictransformArr[i32], getbaselineshift5ssexj0) && iRemoteActionCompatParcelizer < i33) {
                    i33 = iRemoteActionCompatParcelizer;
                    i34 = i32;
                }
                i32++;
            }
            if (i34 < 0) {
                throw new WriterException("Data too big for any version");
            }
            x xVar2 = xVarArr[i34];
            isvalidmotionevent = new isValidMotionEvent();
            int i36 = serializer + 39;
            write = i36 % Fields.SpotShadowColor;
            int i37 = i36 % 2;
            for (setBackground8_81llA setbackground8_81lla : (ArrayList) xVar2.read) {
                int i38 = serializer + 67;
                write = i38 % Fields.SpotShadowColor;
                int i39 = i38 % i28;
                int i40 = setbackground8_81lla.IconCompatParcelizer;
                x xVar3 = setbackground8_81lla.serializer;
                DiskLruCache$Editor diskLruCache$Editor2 = (DiskLruCache$Editor) xVar3.IconCompatParcelizer;
                getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo3 = setbackground8_81lla.write;
                isvalidmotionevent.write(getfontsynthesiszqgjjvo3.getBits(), 4);
                int i41 = setbackground8_81lla.RemoteActionCompatParcelizer;
                if (i41 > 0) {
                    isvalidmotionevent.write(setbackground8_81lla.serializer(), getfontsynthesiszqgjjvo3.getCharacterCountBits((getTextGeometricTransform) xVar3.RemoteActionCompatParcelizer));
                }
                if (getfontsynthesiszqgjjvo3 == getFontSynthesisZQGJjVo.ECI) {
                    isvalidmotionevent.write(CharacterSetECI.getCharacterSetECI(((getFontFamily) diskLruCache$Editor2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer[i40].charset()).getValue(), 8);
                } else if (i41 > 0) {
                    String str2 = (String) diskLruCache$Editor2.write;
                    int i42 = setbackground8_81lla.read;
                    Encoder.read(str2.substring(i42, i41 + i42), getfontsynthesiszqgjjvo3, isvalidmotionevent, ((getFontFamily) diskLruCache$Editor2.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer[i40].charset());
                }
                i28 = 2;
            }
            gettextgeometrictransform = (getTextGeometricTransform) xVar2.RemoteActionCompatParcelizer;
        } else {
            Charset charset2 = getFontFeatureSettings.IconCompatParcelizer;
            if (charset2 != null && charset2.equals(charsetForName) && Encoder.IconCompatParcelizer(str)) {
                getfontsynthesiszqgjjvo = getFontSynthesisZQGJjVo.KANJI;
            } else {
                int i43 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    if (i43 >= str.length()) {
                        if (!z4) {
                            if (!z5) {
                                getfontsynthesiszqgjjvo = getFontSynthesisZQGJjVo.BYTE;
                                break;
                            }
                            getfontsynthesiszqgjjvo = getFontSynthesisZQGJjVo.NUMERIC;
                            break;
                        }
                        getfontsynthesiszqgjjvo = getFontSynthesisZQGJjVo.ALPHANUMERIC;
                        break;
                    }
                    char cCharAt = str.charAt(i43);
                    if (cCharAt < '0' || cCharAt > '9') {
                        int[] iArr = Encoder.RemoteActionCompatParcelizer;
                        if (cCharAt >= '`' || iArr[cCharAt] == -1) {
                            getfontsynthesiszqgjjvo = getFontSynthesisZQGJjVo.BYTE;
                            break;
                        }
                        z4 = true;
                    } else {
                        z5 = true;
                    }
                    i43++;
                }
            }
            isValidMotionEvent isvalidmotionevent3 = new isValidMotionEvent();
            getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo4 = getFontSynthesisZQGJjVo.BYTE;
            if (getfontsynthesiszqgjjvo == getfontsynthesiszqgjjvo4 && zContainsKey && (characterSetECI = CharacterSetECI.getCharacterSetECI(charsetForName)) != null) {
                int i44 = write + 35;
                serializer = i44 % Fields.SpotShadowColor;
                if (i44 % 2 == 0) {
                    isvalidmotionevent3.write(getFontSynthesisZQGJjVo.ECI.getBits(), 5);
                    isvalidmotionevent3.write(characterSetECI.getValue(), 105);
                    i = 4;
                } else {
                    i = 4;
                    isvalidmotionevent3.write(getFontSynthesisZQGJjVo.ECI.getBits(), 4);
                    isvalidmotionevent3.write(characterSetECI.getValue(), 8);
                }
            } else {
                i = 4;
            }
            if (z2) {
                isvalidmotionevent3.write(getFontSynthesisZQGJjVo.FNC1_FIRST_POSITION.getBits(), i);
            }
            isvalidmotionevent3.write(getfontsynthesiszqgjjvo.getBits(), i);
            isValidMotionEvent isvalidmotionevent4 = new isValidMotionEvent();
            Encoder.read(str, getfontsynthesiszqgjjvo, isvalidmotionevent4, charsetForName);
            MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor16 = MotionDurationScaleImplstartObservingSystemScaleFactor11.QR_VERSION;
            if (mapRemoteActionCompatParcelizer.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor16)) {
                getTextGeometricTransform gettextgeometrictransformWrite2 = getTextGeometricTransform.write(Integer.parseInt(mapRemoteActionCompatParcelizer.get(motionDurationScaleImplstartObservingSystemScaleFactor16).toString()));
                if (!Encoder.serializer(getfontsynthesiszqgjjvo.getCharacterCountBits(gettextgeometrictransformWrite2) + isvalidmotionevent3.RemoteActionCompatParcelizer + isvalidmotionevent4.RemoteActionCompatParcelizer, gettextgeometrictransformWrite2, getbaselineshift5ssexj0ValueOf)) {
                    throw new WriterException("Data too big for requested version");
                }
                gettextgeometrictransformWrite = gettextgeometrictransformWrite2;
            } else {
                getTextGeometricTransform gettextgeometrictransformWrite3 = getTextGeometricTransform.write(1);
                int i45 = isvalidmotionevent3.RemoteActionCompatParcelizer;
                int characterCountBits = getfontsynthesiszqgjjvo.getCharacterCountBits(gettextgeometrictransformWrite3);
                int i46 = isvalidmotionevent4.RemoteActionCompatParcelizer;
                int i47 = 1;
                while (true) {
                    if (i47 > 40) {
                        throw new WriterException("Data too big");
                    }
                    getTextGeometricTransform gettextgeometrictransformWrite4 = getTextGeometricTransform.write(i47);
                    if (Encoder.serializer(characterCountBits + i45 + i46, gettextgeometrictransformWrite4, getbaselineshift5ssexj0ValueOf)) {
                        int i48 = isvalidmotionevent3.RemoteActionCompatParcelizer;
                        int characterCountBits2 = getfontsynthesiszqgjjvo.getCharacterCountBits(gettextgeometrictransformWrite4);
                        int i49 = isvalidmotionevent4.RemoteActionCompatParcelizer;
                        int i50 = 1;
                        int i51 = 40;
                        while (true) {
                            if (i50 > i51) {
                                throw new WriterException("Data too big");
                            }
                            gettextgeometrictransformWrite = getTextGeometricTransform.write(i50);
                            if (Encoder.serializer(characterCountBits2 + i48 + i49, gettextgeometrictransformWrite, getbaselineshift5ssexj0ValueOf)) {
                                break;
                            }
                            i50++;
                            i30 = i30;
                            getbaselineshift5ssexj0ValueOf = getbaselineshift5ssexj0ValueOf;
                            i51 = 40;
                            mapRemoteActionCompatParcelizer = mapRemoteActionCompatParcelizer;
                            i31 = i31;
                        }
                    } else {
                        i47++;
                        i30 = i30;
                        getbaselineshift5ssexj0ValueOf = getbaselineshift5ssexj0ValueOf;
                        mapRemoteActionCompatParcelizer = mapRemoteActionCompatParcelizer;
                        i31 = i31;
                    }
                }
            }
            isvalidmotionevent = new isValidMotionEvent();
            int i52 = isvalidmotionevent3.RemoteActionCompatParcelizer;
            isvalidmotionevent.read(i52);
            for (int i53 = 0; i53 < i52; i53++) {
                int i54 = serializer + 99;
                write = i54 % Fields.SpotShadowColor;
                int i55 = i54 % 2;
                isvalidmotionevent.RemoteActionCompatParcelizer(isvalidmotionevent3.write(i53));
            }
            int iSerializer = getfontsynthesiszqgjjvo == getfontsynthesiszqgjjvo4 ? isvalidmotionevent4.serializer() : str.length();
            int characterCountBits3 = getfontsynthesiszqgjjvo.getCharacterCountBits(gettextgeometrictransformWrite);
            int i56 = 1 << characterCountBits3;
            if (iSerializer >= i56) {
                throw new WriterException(iSerializer + " is bigger than " + (i56 - 1));
            }
            isvalidmotionevent.write(iSerializer, characterCountBits3);
            int i57 = isvalidmotionevent4.RemoteActionCompatParcelizer;
            isvalidmotionevent.read(isvalidmotionevent.RemoteActionCompatParcelizer + i57);
            for (int i58 = 0; i58 < i57; i58++) {
                isvalidmotionevent.RemoteActionCompatParcelizer(isvalidmotionevent4.write(i58));
            }
            gettextgeometrictransform = gettextgeometrictransformWrite;
        }
        DeltaDecoder deltaDecoder = gettextgeometrictransform.IconCompatParcelizer[getbaselineshift5ssexj0ValueOf.ordinal()];
        int i59 = gettextgeometrictransform.RemoteActionCompatParcelizer;
        int i60 = deltaDecoder.write;
        InfiniteAnimationPolicyDefaultImpls[] infiniteAnimationPolicyDefaultImplsArr = (InfiniteAnimationPolicyDefaultImpls[]) deltaDecoder.serializer;
        int i61 = 0;
        for (InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls : infiniteAnimationPolicyDefaultImplsArr) {
            i61 += infiniteAnimationPolicyDefaultImpls.serializer;
        }
        int i62 = i59 - (i61 * i60);
        int i63 = i62 * 8;
        if (isvalidmotionevent.RemoteActionCompatParcelizer > i63) {
            throw new WriterException("data bits cannot fit in the QR Code" + isvalidmotionevent.RemoteActionCompatParcelizer + " > " + i63);
        }
        for (int i64 = 0; i64 < 4; i64++) {
            int i65 = write + 3;
            serializer = i65 % Fields.SpotShadowColor;
            if (i65 % 2 != 0) {
                z = false;
                if (isvalidmotionevent.RemoteActionCompatParcelizer >= i63) {
                    break;
                }
                isvalidmotionevent.RemoteActionCompatParcelizer(z);
            } else {
                z = false;
                int i66 = 97 / 0;
                if (isvalidmotionevent.RemoteActionCompatParcelizer >= i63) {
                    break;
                }
                isvalidmotionevent.RemoteActionCompatParcelizer(z);
            }
        }
        int i67 = isvalidmotionevent.RemoteActionCompatParcelizer & 7;
        if (i67 > 0) {
            while (i67 < 8) {
                isvalidmotionevent.RemoteActionCompatParcelizer(false);
                i67++;
            }
        }
        int iSerializer2 = isvalidmotionevent.serializer();
        for (int i68 = 0; i68 < i62 - iSerializer2; i68++) {
            if ((i68 & 1) == 0) {
                i27 = 236;
                i26 = 8;
            } else {
                i26 = 8;
                i27 = 17;
            }
            isvalidmotionevent.write(i27, i26);
        }
        if (isvalidmotionevent.RemoteActionCompatParcelizer != i63) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i69 = write + 111;
        serializer = i69 % Fields.SpotShadowColor;
        int i70 = i69 % 2;
        int i71 = 0;
        for (InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2 : infiniteAnimationPolicyDefaultImplsArr) {
            i71 += infiniteAnimationPolicyDefaultImpls2.serializer;
        }
        if (isvalidmotionevent.serializer() != i62) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i71);
        int i72 = 0;
        int i73 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        while (i72 < i71) {
            int[] iArr2 = new int[1];
            int i74 = i30;
            int[] iArr3 = new int[1];
            if (i72 >= i71) {
                throw new WriterException("Block ID too large");
            }
            int i75 = i59 % i71;
            int i76 = i71 - i75;
            int i77 = i59 / i71;
            int i78 = i62 / i71;
            int i79 = i78 + 1;
            int i80 = i31;
            int i81 = i77 - i78;
            getBaselineShift5SSeXJ0 getbaselineshift5ssexj1 = getbaselineshift5ssexj0ValueOf;
            int i82 = (i77 + 1) - i79;
            if (i81 != i82) {
                throw new WriterException("EC bytes mismatch");
            }
            Map map = mapRemoteActionCompatParcelizer;
            if (i71 != i76 + i75) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i59 != ((i79 + i82) * i75) + ((i78 + i81) * i76)) {
                throw new WriterException("Total bytes mismatch");
            }
            int i83 = write + 97;
            int i84 = i71;
            serializer = i83 % Fields.SpotShadowColor;
            int i85 = i83 % 2;
            if (i72 < i76) {
                c = 0;
                iArr2[0] = i78;
                iArr3[0] = i81;
            } else {
                c = 0;
                iArr2[0] = i79;
                iArr3[0] = i82;
            }
            int i86 = iArr2[c];
            byte[] bArr6 = new byte[i86];
            int i87 = i73 * 8;
            int i88 = 0;
            while (i88 < i86) {
                getTextGeometricTransform gettextgeometrictransform2 = gettextgeometrictransform;
                int i89 = i59;
                int i90 = 0;
                int i91 = 0;
                for (int i92 = 8; i91 < i92; i92 = 8) {
                    if (isvalidmotionevent.write(i87)) {
                        i90 |= 1 << (7 - i91);
                    }
                    i87++;
                    i91++;
                }
                bArr6[i88] = (byte) i90;
                i88++;
                gettextgeometrictransform = gettextgeometrictransform2;
                i59 = i89;
            }
            getTextGeometricTransform gettextgeometrictransform3 = gettextgeometrictransform;
            int i93 = i59;
            int i94 = iArr3[0];
            int i95 = i86 + i94;
            int[] iArr4 = new int[i95];
            for (int i96 = 0; i96 < i86; i96++) {
                iArr4[i96] = bArr6[i96] & 255;
            }
            getFontStyle4Lr2A7w getfontstyle4lr2a7w = getFontStyle4Lr2A7w.serializer;
            ArrayList arrayList2 = new ArrayList();
            isValidMotionEvent isvalidmotionevent5 = isvalidmotionevent;
            arrayList2.add(new getFontSizeXSAIIZE(getfontstyle4lr2a7w, new int[]{1}));
            if (i94 == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No error correction bytes");
                return null;
            }
            int i97 = i95 - i94;
            if (i97 <= 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No data bytes provided");
                return null;
            }
            if (i94 >= arrayList2.size()) {
                getFontSizeXSAIIZE getfontsizexsaiize5 = (getFontSizeXSAIIZE) af$$ExternalSyntheticOutline0.m(1, arrayList2);
                int size = arrayList2.size();
                while (size <= i94) {
                    int i98 = i62;
                    int i99 = i72;
                    int[] iArr5 = {1, getfontstyle4lr2a7w.write[(size - 1) + getfontstyle4lr2a7w.RemoteActionCompatParcelizer]};
                    if (iArr5[0] == 0) {
                        i25 = i73;
                        int i100 = 1;
                        while (i100 < 2 && iArr5[i100] == 0) {
                            i100++;
                        }
                        if (i100 == 2) {
                            c2 = 0;
                            iArr5 = new int[]{0};
                        } else {
                            c2 = 0;
                            int i101 = 2 - i100;
                            int[] iArr6 = new int[i101];
                            System.arraycopy(iArr5, i100, iArr6, 0, i101);
                            iArr5 = iArr6;
                        }
                    } else {
                        i25 = i73;
                        c2 = 0;
                    }
                    getFontSizeXSAIIZE getfontsizexsaiize6 = getfontsizexsaiize5;
                    getFontStyle4Lr2A7w getfontstyle4lr2a7w2 = getfontsizexsaiize6.serializer;
                    if (!getfontstyle4lr2a7w2.equals(getfontstyle4lr2a7w)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("GenericGFPolys do not have same GenericGF field");
                        return null;
                    }
                    if (getfontsizexsaiize6.read() || iArr5[c2] == 0) {
                        getfontsizexsaiize4 = getfontstyle4lr2a7w2.RatingCompat;
                    } else {
                        int[] iArr7 = getfontsizexsaiize6.write;
                        int length = iArr7.length;
                        int length2 = iArr5.length;
                        int[] iArr8 = new int[(length + length2) - 1];
                        int i102 = 0;
                        while (i102 < length) {
                            int i103 = length;
                            int i104 = iArr7[i102];
                            int[] iArr9 = iArr7;
                            int i105 = 0;
                            while (i105 < length2) {
                                int i106 = i102 + i105;
                                iArr8[i106] = iArr8[i106] ^ getfontstyle4lr2a7w2.write(i104, iArr5[i105]);
                                i105++;
                                length2 = length2;
                            }
                            i102++;
                            length = i103;
                            iArr7 = iArr9;
                        }
                        getfontsizexsaiize4 = new getFontSizeXSAIIZE(getfontstyle4lr2a7w2, iArr8);
                    }
                    arrayList2.add(getfontsizexsaiize4);
                    size++;
                    i62 = i98;
                    i72 = i99;
                    i73 = i25;
                    iArr2 = iArr2;
                    iMax3 = iMax3;
                    iMax2 = iMax2;
                    getfontsizexsaiize5 = getfontsizexsaiize4;
                    arrayList = arrayList;
                }
            }
            ArrayList arrayList3 = arrayList;
            int i107 = i62;
            int i108 = i72;
            int i109 = i73;
            int i110 = iMax2;
            int[] iArr10 = iArr2;
            int i111 = iMax3;
            getFontSizeXSAIIZE getfontsizexsaiize7 = (getFontSizeXSAIIZE) arrayList2.get(i94);
            int[] iArr11 = new int[i97];
            System.arraycopy(iArr4, 0, iArr11, 0, i97);
            if (i97 == 0) {
                DrawableTransformation.write();
                return null;
            }
            if (i97 > 1 && iArr11[0] == 0) {
                int i112 = 1;
                while (i112 < i97 && iArr11[i112] == 0) {
                    i112++;
                }
                if (i112 == i97) {
                    iArr11 = new int[]{0};
                } else {
                    int i113 = i97 - i112;
                    int[] iArr12 = new int[i113];
                    System.arraycopy(iArr11, i112, iArr12, 0, i113);
                    iArr11 = iArr12;
                }
            }
            if (i94 < 0) {
                DrawableTransformation.write();
                return null;
            }
            int length3 = iArr11.length;
            int[] iArr13 = new int[length3 + i94];
            for (int i114 = 0; i114 < length3; i114++) {
                iArr13[i114] = getfontstyle4lr2a7w.write(iArr11[i114], 1);
            }
            getFontSizeXSAIIZE getfontsizexsaiize8 = new getFontSizeXSAIIZE(getfontstyle4lr2a7w, iArr13);
            getFontStyle4Lr2A7w getfontstyle4lr2a7w3 = getfontsizexsaiize7.serializer;
            int[] iArr14 = getfontsizexsaiize7.write;
            boolean zEquals = getfontstyle4lr2a7w.equals(getfontstyle4lr2a7w3);
            getFontSizeXSAIIZE getfontsizexsaiize9 = getfontstyle4lr2a7w.RatingCompat;
            if (!zEquals) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("GenericGFPolys do not have same GenericGF field");
                return null;
            }
            if (getfontsizexsaiize7.read()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Divide by 0");
                return null;
            }
            int i115 = iArr14[(iArr14.length - 1) - getfontsizexsaiize7.RemoteActionCompatParcelizer()];
            if (i115 == 0) {
                throw new ArithmeticException();
            }
            int i116 = getfontstyle4lr2a7w.write[(getfontstyle4lr2a7w.MediaMetadataCompat - getfontstyle4lr2a7w.IconCompatParcelizer[i115]) - 1];
            getFontSizeXSAIIZE getfontsizexsaiizeSerializer = getfontsizexsaiize9;
            while (getfontsizexsaiize8.RemoteActionCompatParcelizer() >= getfontsizexsaiize7.RemoteActionCompatParcelizer() && !getfontsizexsaiize8.read()) {
                int iRemoteActionCompatParcelizer2 = getfontsizexsaiize8.RemoteActionCompatParcelizer() - getfontsizexsaiize7.RemoteActionCompatParcelizer();
                int iRemoteActionCompatParcelizer3 = getfontsizexsaiize8.RemoteActionCompatParcelizer();
                int[] iArr15 = getfontsizexsaiize8.write;
                int iWrite = getfontstyle4lr2a7w.write(iArr15[(iArr15.length - 1) - iRemoteActionCompatParcelizer3], i116);
                getFontStyle4Lr2A7w getfontstyle4lr2a7w4 = getfontsizexsaiize7.serializer;
                if (iRemoteActionCompatParcelizer2 < 0) {
                    DrawableTransformation.write();
                    return null;
                }
                if (iWrite == 0) {
                    getfontsizexsaiize2 = getfontstyle4lr2a7w4.RatingCompat;
                    getfontsizexsaiize = getfontsizexsaiize9;
                } else {
                    int length4 = iArr14.length;
                    int[] iArr16 = new int[length4 + iRemoteActionCompatParcelizer2];
                    int i117 = 0;
                    while (i117 < length4) {
                        iArr16[i117] = getfontstyle4lr2a7w4.write(iArr14[i117], iWrite);
                        i117++;
                        getfontsizexsaiize9 = getfontsizexsaiize9;
                    }
                    getfontsizexsaiize = getfontsizexsaiize9;
                    getfontsizexsaiize2 = new getFontSizeXSAIIZE(getfontstyle4lr2a7w4, iArr16);
                }
                if (iRemoteActionCompatParcelizer2 < 0) {
                    DrawableTransformation.write();
                    return null;
                }
                if (iWrite == 0) {
                    getfontsizexsaiize3 = getfontsizexsaiize;
                } else {
                    int[] iArr17 = new int[iRemoteActionCompatParcelizer2 + 1];
                    iArr17[0] = iWrite;
                    getfontsizexsaiize3 = new getFontSizeXSAIIZE(getfontstyle4lr2a7w, iArr17);
                }
                getfontsizexsaiizeSerializer = getfontsizexsaiizeSerializer.serializer(getfontsizexsaiize3);
                getfontsizexsaiize8 = getfontsizexsaiize8.serializer(getfontsizexsaiize2);
                getfontsizexsaiize7 = getfontsizexsaiize7;
                i116 = i116;
                getfontsizexsaiize9 = getfontsizexsaiize;
            }
            int[] iArr18 = new getFontSizeXSAIIZE[]{getfontsizexsaiizeSerializer, getfontsizexsaiize8}[1].write;
            int length5 = i94 - iArr18.length;
            for (int i118 = 0; i118 < length5; i118++) {
                iArr4[i97 + i118] = 0;
            }
            System.arraycopy(iArr18, 0, iArr4, i97 + length5, iArr18.length);
            byte[] bArr7 = new byte[i94];
            for (int i119 = 0; i119 < i94; i119++) {
                bArr7[i119] = (byte) iArr4[i86 + i119];
            }
            getFontWeight getfontweight = new getFontWeight(bArr6, bArr7);
            arrayList = arrayList3;
            arrayList.add(getfontweight);
            iMax2 = Math.max(i110, i86);
            iMax3 = Math.max(i111, i94);
            i73 = i109 + iArr10[0];
            i72 = i108 + 1;
            i30 = i74;
            i71 = i84;
            mapRemoteActionCompatParcelizer = map;
            gettextgeometrictransform = gettextgeometrictransform3;
            i59 = i93;
            i31 = i80;
            getbaselineshift5ssexj0ValueOf = getbaselineshift5ssexj1;
            isvalidmotionevent = isvalidmotionevent5;
            i62 = i107;
        }
        getTextGeometricTransform gettextgeometrictransform4 = gettextgeometrictransform;
        int i120 = i59;
        int i121 = i30;
        int i122 = i31;
        Map map2 = mapRemoteActionCompatParcelizer;
        getBaselineShift5SSeXJ0 getbaselineshift5ssexj2 = getbaselineshift5ssexj0ValueOf;
        int i123 = iMax2;
        int i124 = iMax3;
        if (i62 != i73) {
            throw new WriterException("Data bytes does not match offset");
        }
        isValidMotionEvent isvalidmotionevent6 = new isValidMotionEvent();
        for (int i125 = 0; i125 < i123; i125++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr8 = ((getFontWeight) it.next()).read;
                if (i125 < bArr8.length) {
                    isvalidmotionevent6.write(bArr8[i125], 8);
                }
            }
        }
        for (int i126 = 0; i126 < i124; i126++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr9 = ((getFontWeight) it2.next()).write;
                if (i126 < bArr9.length) {
                    isvalidmotionevent6.write(bArr9[i126], 8);
                }
            }
        }
        if (i120 != isvalidmotionevent6.serializer()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i120, "Interleaving error: ", " and ");
            sbM.append(isvalidmotionevent6.serializer());
            sbM.append(" differ.");
            throw new WriterException(sbM.toString());
        }
        int i127 = (gettextgeometrictransform4.serializer * 4) + 17;
        ImageResources_androidKt imageResources_androidKt = new ImageResources_androidKt(i127, i127, 6);
        int i128 = imageResources_androidKt.serializer;
        int i129 = imageResources_androidKt.RemoteActionCompatParcelizer;
        MotionDurationScaleImplstartObservingSystemScaleFactor11 motionDurationScaleImplstartObservingSystemScaleFactor17 = MotionDurationScaleImplstartObservingSystemScaleFactor11.QR_MASK_PATTERN;
        if (map2.containsKey(motionDurationScaleImplstartObservingSystemScaleFactor17) && (i3 = Integer.parseInt(map2.get(motionDurationScaleImplstartObservingSystemScaleFactor17).toString())) >= 0) {
            i2 = 8;
            i4 = i3 < 8 ? -1 : -1;
            if (i3 == i4) {
                i3 = i4;
                i6 = Integer.MAX_VALUE;
                i7 = 0;
                while (i7 < i2) {
                    getBaselineShift5SSeXJ0 getbaselineshift5ssexj3 = getbaselineshift5ssexj2;
                    MatrixUtil.serializer(isvalidmotionevent6, getbaselineshift5ssexj3, gettextgeometrictransform4, i7, imageResources_androidKt);
                    int iWrite2 = getLetterSpacingXSAIIZE.write(imageResources_androidKt, true);
                    int iWrite3 = getLetterSpacingXSAIIZE.write(imageResources_androidKt, false);
                    bArr = (byte[][]) imageResources_androidKt.read;
                    int i130 = 0;
                    for (i8 = 0; i8 < i128 - 1; i8++) {
                        bArr4 = bArr[i8];
                        i23 = 0;
                        while (i23 < i129 - 1) {
                            b = bArr4[i23];
                            i24 = i23 + 1;
                            int i131 = i3;
                            if (b == bArr4[i24]) {
                                bArr5 = bArr[i8 + 1];
                                if (b != bArr5[i23] && b == bArr5[i24]) {
                                    i130++;
                                }
                            }
                            i23 = i24;
                            i3 = i131;
                        }
                    }
                    i9 = i3;
                    i11 = 0;
                    for (i10 = 0; i10 < i128; i10++) {
                        i15 = 0;
                        while (i15 < i129) {
                            bArr3 = bArr[i10];
                            i16 = i15 + 6;
                            ImageResources_androidKt imageResources_androidKt2 = imageResources_androidKt;
                            if (i16 < i129) {
                                isvalidmotionevent2 = isvalidmotionevent6;
                                if (bArr3[i15] == 1 && bArr3[i15 + 1] == 0 && bArr3[i15 + 2] == 1 && bArr3[i15 + 3] == 1 && bArr3[i15 + 4] == 1 && bArr3[i15 + 5] == 0 && bArr3[i16] == 1) {
                                    int i132 = serializer + 53;
                                    write = i132 % Fields.SpotShadowColor;
                                    int i133 = i132 % 2;
                                    i19 = i15 - 4;
                                    if (i19 >= 0 && bArr3.length >= i15) {
                                        while (true) {
                                            if (i19 < i15) {
                                                if (bArr3[i19] == 1) {
                                                    i20 = i15 + 7;
                                                    i21 = i15 + 11;
                                                    if (i20 >= 0) {
                                                        while (true) {
                                                            if (i20 >= i21) {
                                                                i22 = i21;
                                                                if (bArr3[i20] == 1) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i20++;
                                                                i21 = i22;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i19++;
                                                }
                                            }
                                            i11++;
                                            break;
                                        }
                                    } else {
                                        i20 = i15 + 7;
                                        i21 = i15 + 11;
                                        if (i20 >= 0 && bArr3.length >= i21) {
                                            while (true) {
                                                if (i20 >= i21) {
                                                    i11++;
                                                    break;
                                                }
                                                i22 = i21;
                                                if (bArr3[i20] == 1) {
                                                    break;
                                                }
                                                i20++;
                                                i21 = i22;
                                            }
                                        }
                                    }
                                }
                            } else {
                                isvalidmotionevent2 = isvalidmotionevent6;
                            }
                            i17 = i10 + 6;
                            if (i17 < i128) {
                                byte b2 = 1;
                                if (bArr[i10][i15] != 1 && bArr[i10 + 1][i15] == 0 && bArr[i10 + 2][i15] == 1 && bArr[i10 + 3][i15] == 1 && bArr[i10 + 4][i15] == 1 && bArr[i10 + 5][i15] == 0 && bArr[i17][i15] == 1) {
                                    int i134 = i10 - 4;
                                    if (i134 >= 0 && bArr.length >= i10) {
                                        while (true) {
                                            if (i134 < i10) {
                                                if (bArr[i134][i15] == b2) {
                                                    i18 = i10 + 7;
                                                    int i135 = i10 + 11;
                                                    if (i18 < 0) {
                                                    }
                                                } else {
                                                    i134++;
                                                    b2 = 1;
                                                }
                                            }
                                            i11++;
                                            break;
                                            break;
                                        }
                                    }
                                    i18 = i10 + 7;
                                    int i136 = i10 + 11;
                                    if (i18 < 0 && bArr.length >= i136) {
                                        while (true) {
                                            if (i18 >= i136) {
                                                i11++;
                                                break;
                                            }
                                            if (bArr[i18][i15] == 1) {
                                                break;
                                            }
                                            i18++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            imageResources_androidKt = imageResources_androidKt2;
                            isvalidmotionevent6 = isvalidmotionevent2;
                        }
                    }
                    ImageResources_androidKt imageResources_androidKt3 = imageResources_androidKt;
                    isValidMotionEvent isvalidmotionevent7 = isvalidmotionevent6;
                    i13 = 0;
                    for (i12 = 0; i12 < i128; i12++) {
                        bArr2 = bArr[i12];
                        for (i14 = 0; i14 < i129; i14++) {
                            if (bArr2[i14] == 1) {
                                i13++;
                            }
                        }
                    }
                    int i137 = i128 * i129;
                    iAbs = (((Math.abs((i13 * 2) - i137) * 10) / i137) * 10) + (i11 * 40) + (i130 * 3) + iWrite3 + iWrite2;
                    if (iAbs < i6) {
                        i6 = iAbs;
                        i3 = i7;
                    } else {
                        i3 = i9;
                    }
                    i7++;
                    getbaselineshift5ssexj2 = getbaselineshift5ssexj3;
                    imageResources_androidKt = imageResources_androidKt3;
                    isvalidmotionevent6 = isvalidmotionevent7;
                    i2 = 8;
                }
            }
            MatrixUtil.serializer(isvalidmotionevent6, getbaselineshift5ssexj2, gettextgeometrictransform4, i3, imageResources_androidKt);
            int i138 = i122 * 2;
            int i139 = i129 + i138;
            int i140 = i138 + i128;
            iMax = Math.max(i121, i139);
            int iMax4 = Math.max(i121, i140);
            int iMin = Math.min(iMax / i139, iMax4 / i140);
            int i141 = (iMax - (i129 * iMin)) / 2;
            int i142 = (iMax4 - (i128 * iMin)) / 2;
            if (iMax >= 1 || iMax4 < 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Both dimensions must be greater than 0");
                return null;
            }
            int i143 = (iMax + 31) / 32;
            int[] iArr19 = new int[i143 * iMax4];
            int i144 = 0;
            while (i144 < i128) {
                int i145 = i141;
                int i146 = 0;
                while (i146 < i129) {
                    if (imageResources_androidKt.IconCompatParcelizer(i146, i144) == 1) {
                        if (i142 < 0 || i145 < 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Left and top must be nonnegative");
                            return null;
                        }
                        if (iMin < 1 || iMin < 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Height and width must be at least 1");
                            return null;
                        }
                        int i147 = i145 + iMin;
                        int i148 = i142 + iMin;
                        if (i148 > iMax4 || i147 > iMax) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The region must fit inside the matrix");
                            return null;
                        }
                        int i149 = i142;
                        while (i149 < i148) {
                            int i150 = i128;
                            for (int i151 = i145; i151 < i147; i151++) {
                                int i152 = (i151 / 32) + (i149 * i143);
                                iArr19[i152] = iArr19[i152] | (1 << (i151 & 31));
                            }
                            i149++;
                            i128 = i150;
                        }
                    }
                    i146++;
                    i145 += iMin;
                    i128 = i128;
                }
                i144++;
                i142 += iMin;
            }
            int[] iArr20 = new int[iMax * iMax4];
            for (int i153 = 0; i153 < iMax4; i153++) {
                for (int i154 = 0; i154 < iMax; i154++) {
                    int i155 = write;
                    int i156 = i155 + 35;
                    serializer = i156 % Fields.SpotShadowColor;
                    int i157 = i156 % 2;
                    if (((iArr19[(i154 / 32) + (i153 * i143)] >>> (i154 & 31)) & 1) != 0) {
                        int i158 = i155 + 71;
                        serializer = i158 % Fields.SpotShadowColor;
                        int i159 = i158 % 2;
                        i5 = -16777216;
                    } else {
                        i5 = -1;
                    }
                    iArr20[(i153 * iMax) + i154] = i5;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax4, Bitmap.Config.RGB_565);
            bitmapCreateBitmap.setPixels(iArr20, 0, iMax, 0, 0, iMax, iMax4);
            return bitmapCreateBitmap;
        }
        i2 = 8;
        i3 = -1;
        if (i3 == i4) {
            i3 = i4;
            i6 = Integer.MAX_VALUE;
            i7 = 0;
            while (i7 < i2) {
                getBaselineShift5SSeXJ0 getbaselineshift5ssexj4 = getbaselineshift5ssexj2;
                MatrixUtil.serializer(isvalidmotionevent6, getbaselineshift5ssexj4, gettextgeometrictransform4, i7, imageResources_androidKt);
                int iWrite4 = getLetterSpacingXSAIIZE.write(imageResources_androidKt, true);
                int iWrite5 = getLetterSpacingXSAIIZE.write(imageResources_androidKt, false);
                bArr = (byte[][]) imageResources_androidKt.read;
                int i1310 = 0;
                while (i8 < i128 - 1) {
                    bArr4 = bArr[i8];
                    i23 = 0;
                    while (i23 < i129 - 1) {
                        b = bArr4[i23];
                        i24 = i23 + 1;
                        int i1311 = i3;
                        if (b == bArr4[i24]) {
                            bArr5 = bArr[i8 + 1];
                            if (b != bArr5[i23]) {
                            }
                        }
                        i23 = i24;
                        i3 = i1311;
                    }
                }
                i9 = i3;
                i11 = 0;
                while (i10 < i128) {
                    i15 = 0;
                    while (i15 < i129) {
                        bArr3 = bArr[i10];
                        i16 = i15 + 6;
                        ImageResources_androidKt imageResources_androidKt4 = imageResources_androidKt;
                        if (i16 < i129) {
                            isvalidmotionevent2 = isvalidmotionevent6;
                            if (bArr3[i15] == 1) {
                                int i1312 = serializer + 53;
                                write = i1312 % Fields.SpotShadowColor;
                                int i1313 = i1312 % 2;
                                i19 = i15 - 4;
                                if (i19 >= 0) {
                                    i20 = i15 + 7;
                                    i21 = i15 + 11;
                                    if (i20 >= 0) {
                                        while (true) {
                                            if (i20 >= i21) {
                                                i11++;
                                                break;
                                            }
                                            i22 = i21;
                                            if (bArr3[i20] == 1) {
                                                break;
                                                break;
                                            }
                                            i20++;
                                            i21 = i22;
                                        }
                                    }
                                } else {
                                    i20 = i15 + 7;
                                    i21 = i15 + 11;
                                    if (i20 >= 0) {
                                        while (true) {
                                            if (i20 >= i21) {
                                                i11++;
                                                break;
                                            }
                                            i22 = i21;
                                            if (bArr3[i20] == 1) {
                                                break;
                                                break;
                                            }
                                            i20++;
                                            i21 = i22;
                                        }
                                    }
                                }
                            }
                        } else {
                            isvalidmotionevent2 = isvalidmotionevent6;
                        }
                        i17 = i10 + 6;
                        if (i17 < i128) {
                            byte b3 = 1;
                            if (bArr[i10][i15] != 1) {
                            }
                        }
                        i15++;
                        imageResources_androidKt = imageResources_androidKt4;
                        isvalidmotionevent6 = isvalidmotionevent2;
                    }
                }
                ImageResources_androidKt imageResources_androidKt5 = imageResources_androidKt;
                isValidMotionEvent isvalidmotionevent8 = isvalidmotionevent6;
                i13 = 0;
                while (i12 < i128) {
                    bArr2 = bArr[i12];
                    while (i14 < i129) {
                        if (bArr2[i14] == 1) {
                            i13++;
                        }
                    }
                }
                int i1314 = i128 * i129;
                iAbs = (((Math.abs((i13 * 2) - i1314) * 10) / i1314) * 10) + (i11 * 40) + (i1310 * 3) + iWrite5 + iWrite4;
                if (iAbs < i6) {
                    i6 = iAbs;
                    i3 = i7;
                } else {
                    i3 = i9;
                }
                i7++;
                getbaselineshift5ssexj2 = getbaselineshift5ssexj4;
                imageResources_androidKt = imageResources_androidKt5;
                isvalidmotionevent6 = isvalidmotionevent8;
                i2 = 8;
            }
        }
        MatrixUtil.serializer(isvalidmotionevent6, getbaselineshift5ssexj2, gettextgeometrictransform4, i3, imageResources_androidKt);
        int i1315 = i122 * 2;
        int i1316 = i129 + i1315;
        int i1410 = i1315 + i128;
        iMax = Math.max(i121, i1316);
        int iMax5 = Math.max(i121, i1410);
        int iMin2 = Math.min(iMax / i1316, iMax5 / i1410);
        int i1411 = (iMax - (i129 * iMin2)) / 2;
        int i1412 = (iMax5 - (i128 * iMin2)) / 2;
        if (iMax >= 1) {
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Both dimensions must be greater than 0");
        return null;
    }
}
