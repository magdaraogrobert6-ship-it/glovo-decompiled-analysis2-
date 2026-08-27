package androidx.compose.ui.tooling;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.BlockRunner$cancel$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.TextInputLayout;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.appmigration.presentation.compose.AppMigrationKt;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.opportunities.calendar.BonusCalendarScreenKt;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;
import com.roadrunner.recentdeliveries.presentation.components.DeliveryLocationKt;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.CountryCodePickerBottomSheetKt;
import com.roadrunner.rider.state.ondemand.presentation.compose.OnDemandWorkingKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AttributionHandler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.IconButtonKt;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SemanticsModifierDefaultImpls;
import o.ShortNewsContentCardView;
import o.SwitchKt;
import o.ValueInsets_androidKt;
import o.buildMapping;
import o.clearAndSetSemantics;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getDeviceManufacturer;
import o.getNativeTypefacePYhJU0U;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getTopimpl;
import o.getTraverseKey;
import o.handleUrlOverridelambda1;
import o.isValidParameter;
import o.jsonStringToMap;
import o.onViewAttachedToWindow;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.removeGlobalCallbackParameters;
import o.removeNodeAtDepth;
import o.setPushTokenI;
import o.startFirstSessionI;
import o.tc;
import o.teardownAllGlobalParametersS;
import o.toAndroidVertexModeJOOmi9M;
import o.wdefault;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PreviewActivity$$ExternalSyntheticLambda2 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.$r8$classId = 8;
        this.f$2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x04ec A[DONT_INVERT, PHI: r11
  0x04ec: PHI (r11v7 java.lang.Object) = (r11v6 java.lang.Object), (r11v11 java.lang.Object) binds: [B:128:0x04e9, B:125:0x04d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x068b  */
    /* JADX WARN: Code duplicated, block: B:54:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x03d1  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object objDrawWithContent;
        Object objComponentActivity;
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        Object obj7 = this.f$2;
        switch (i2) {
            case 0:
                return PreviewActivity.setParameterizedContent$lambda$0$2((String) obj6, (String) obj5, (Object[]) obj7, (getPlatformAndroidManager) obj4, (SwitchKt) obj, (getBirthDateFull) obj2, ((Integer) obj3).intValue());
            case 1:
                SolidColor solidColor = (SolidColor) obj6;
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj5;
                TextFieldValue textFieldValue = (TextFieldValue) obj7;
                OffsetMapping offsetMapping = (OffsetMapping) obj4;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
                getpostalcode.serializer(-84507373);
                boolean zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
                boolean zWrite = getpostalcode.write(zBooleanValue);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zWrite || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new getTraverseKey(zBooleanValue);
                    getpostalcode.write(objComponentActivity2);
                }
                getTraverseKey gettraversekey = (getTraverseKey) objComponentActivity2;
                boolean z2 = solidColor.m1081getValue0d7_KjU() != 16;
                if (((WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.write() && TextRange.m3070getCollapsedimpl(textFieldValue.m3330getSelectiond9O1mEE())) {
                    int i3 = read + 43;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (z2) {
                        getpostalcode.serializer(-707487962);
                        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                        TextRange textRangeM3064boximpl = TextRange.m3064boximpl(textFieldValue.m3330getSelectiond9O1mEE());
                        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettraversekey);
                        Object objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer || objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new BlockRunner$cancel$1(gettraversekey, (ShortNewsContentCardView) null, 9);
                            getpostalcode.write(objComponentActivity3);
                        }
                        getPhoneNumberNational.serializer(annotatedString, textRangeM3064boximpl, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3, getpostalcode);
                        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(gettraversekey);
                        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(offsetMapping);
                        boolean z3 = getpostalcode.read(textFieldValue);
                        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(legacyTextFieldState);
                        boolean z4 = getpostalcode.read(solidColor);
                        Object objComponentActivity4 = getpostalcode.ComponentActivity();
                        if ((zIconCompatParcelizer2 | zIconCompatParcelizer3 | z3 | zIconCompatParcelizer4 | z4) || objComponentActivity4 == androidContentCaptureManager) {
                            objComponentActivity4 = new toAndroidVertexModeJOOmi9M(gettraversekey, offsetMapping, textFieldValue, legacyTextFieldState, solidColor, 3);
                            getpostalcode.write(objComponentActivity4);
                        }
                        objDrawWithContent = DrawModifierKt.drawWithContent(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4);
                        z = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        z = false;
                        getpostalcode.serializer(-705473241);
                        getpostalcode.IconCompatParcelizer(false);
                        objDrawWithContent = Modifier.Companion;
                    }
                } else {
                    z = false;
                    getpostalcode.serializer(-705473241);
                    getpostalcode.IconCompatParcelizer(false);
                    objDrawWithContent = Modifier.Companion;
                }
                getpostalcode.IconCompatParcelizer(z);
                return objDrawWithContent;
            case 2:
                clearAndSetSemantics clearandsetsemantics = (clearAndSetSemantics) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                SemanticsModifierDefaultImpls semanticsModifierDefaultImpls = (SemanticsModifierDefaultImpls) obj7;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                boolean z5 = (iIntValue & 17) != 16;
                int i5 = IconCompatParcelizer + 95;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (getpostalcode2.write(1 & iIntValue, z5)) {
                    boolean z6 = getpostalcode2.read(semanticsModifierDefaultImpls);
                    Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if (z6 || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new MapboxNavigation.AnonymousClass15(0, semanticsModifierDefaultImpls, SemanticsModifierDefaultImpls.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0, 5);
                        getpostalcode2.write(objComponentActivity5);
                    }
                    AppMigrationKt.AppMigrationContainer(clearandsetsemantics, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode2, 0);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                getNativeTypefacePYhJU0U getnativetypefacepyhju0u = (getNativeTypefacePYhJU0U) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
                IconButtonKt iconButtonKt = (IconButtonKt) obj;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                iconButtonKt.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(iconButtonKt) ? 4 : 2;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int i7 = read + 75;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        getpostalcode3.ComponentActivity();
                        Object obj8 = null;
                        obj8.hashCode();
                        throw null;
                    }
                    Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                        getpostalcode3.write(objComponentActivity6);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity6;
                    if (getnativetypefacepyhju0u.serializer && getnativetypefacepyhju0u.write) {
                        int i8 = IconCompatParcelizer + 39;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            getpostalcode3.serializer(823556324);
                            boolean z7 = getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                            objComponentActivity = getpostalcode3.ComponentActivity();
                            int i9 = 43 / 0;
                            if (!z7) {
                                if (objComponentActivity == androidContentCaptureManager) {
                                }
                            }
                            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                            getpostalcode3.IconCompatParcelizer(false);
                        } else {
                            getpostalcode3.serializer(823556324);
                            boolean z8 = getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                            objComponentActivity = getpostalcode3.ComponentActivity();
                            if (!z8) {
                                if (objComponentActivity == androidContentCaptureManager) {
                                }
                            }
                            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                            getpostalcode3.IconCompatParcelizer(false);
                        }
                        objComponentActivity = new DeliveryNotesUiModelImpl.AnonymousClass1(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, populateViewStructure_androidKtpopulate8, null, 13);
                        getpostalcode3.write(objComponentActivity);
                        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                        getpostalcode3.IconCompatParcelizer(false);
                    } else {
                        getpostalcode3.serializer(823727382);
                        getpostalcode3.IconCompatParcelizer(false);
                    }
                    EntrancePictureIconKt.RemoteActionCompatParcelizer(iconButtonKt, ((Boolean) populateViewStructure_androidKtpopulate8.getValue()).booleanValue(), ExtrasKt.write(-1901191270, new r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(getnativetypefacepyhju0u, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, populateViewStructure_androidKtpopulate7, 2), getpostalcode3), getpostalcode3, (iIntValue2 & 14) | 384);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 4:
                BonusCalendarViewModel bonusCalendarViewModel = (BonusCalendarViewModel) obj6;
                wdefault wdefaultVar = (wdefault) obj5;
                Modifier modifier2 = (Modifier) obj7;
                onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) obj4;
                SwitchKt switchKt = (SwitchKt) obj;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                switchKt.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((getPostalCode) getbirthdatefull3).read(switchKt) ? 4 : 2;
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode4.write(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    tc tcVar = (tc) onviewattachedtowindow.getValue();
                    boolean zIconCompatParcelizer5 = getpostalcode4.IconCompatParcelizer(bonusCalendarViewModel);
                    Object objComponentActivity7 = getpostalcode4.ComponentActivity();
                    if (zIconCompatParcelizer5) {
                        NafathModalContentKt$NafathModal$1$1 nafathModalContentKt$NafathModal$1$1 = new NafathModalContentKt$NafathModal$1$1(0, bonusCalendarViewModel, BonusCalendarViewModel.class, "onNavigateBackClicked", "onNavigateBackClicked()V", 0, 19);
                        getpostalcode4.write(nafathModalContentKt$NafathModal$1$1);
                        objComponentActivity7 = nafathModalContentKt$NafathModal$1$1;
                    } else {
                        int i10 = read + 33;
                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        if (objComponentActivity7 == androidContentCaptureManager) {
                            NafathModalContentKt$NafathModal$1$1 nafathModalContentKt$NafathModal$1$2 = new NafathModalContentKt$NafathModal$1$1(0, bonusCalendarViewModel, BonusCalendarViewModel.class, "onNavigateBackClicked", "onNavigateBackClicked()V", 0, 19);
                            getpostalcode4.write(nafathModalContentKt$NafathModal$1$2);
                            objComponentActivity7 = nafathModalContentKt$NafathModal$1$2;
                        }
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity7);
                    boolean zIconCompatParcelizer6 = getpostalcode4.IconCompatParcelizer(bonusCalendarViewModel);
                    Object objComponentActivity8 = getpostalcode4.ComponentActivity();
                    if (zIconCompatParcelizer6 || objComponentActivity8 == androidContentCaptureManager) {
                        NafathModalContentKt$NafathModal$1$1 nafathModalContentKt$NafathModal$1$3 = new NafathModalContentKt$NafathModal$1$1(0, bonusCalendarViewModel, BonusCalendarViewModel.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 20);
                        getpostalcode4.write(nafathModalContentKt$NafathModal$1$3);
                        objComponentActivity8 = nafathModalContentKt$NafathModal$1$3;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity8);
                    boolean zIconCompatParcelizer7 = getpostalcode4.IconCompatParcelizer(bonusCalendarViewModel);
                    Object objComponentActivity9 = getpostalcode4.ComponentActivity();
                    if (zIconCompatParcelizer7 || objComponentActivity9 == androidContentCaptureManager) {
                        NestFragment.AnonymousClass1 anonymousClass1 = new NestFragment.AnonymousClass1(1, bonusCalendarViewModel, BonusCalendarViewModel.class, "onDateSelected", "onDateSelected(Lorg/joda/time/LocalDate;)V", 0, 28);
                        getpostalcode4.write(anonymousClass1);
                        objComponentActivity9 = anonymousClass1;
                    }
                    BonusCalendarScreenKt.BonusCalendarContent(tcVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity9), wdefaultVar, BackgroundKt.m20backgroundbw27NRU(PaddingKt.IconCompatParcelizer(modifier2, switchKt), ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), getpostalcode4, 0);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                final teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) obj6;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
                final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7;
                final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier.Companion companion = Modifier.Companion;
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getbirthdatefull4, 0);
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                int iHashCode = Long.hashCode(getpostalcode5.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode5.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getbirthdatefull4, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode5.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode5.ComponentActivity) {
                    int i12 = IconCompatParcelizer + 87;
                    read = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        getpostalcode5.serializer(constructor);
                        throw null;
                    }
                    getpostalcode5.serializer(constructor);
                } else {
                    getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, modalBottomSheetYbuCTN8Serializer, companion2.getSetMeasurePolicy());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, dragAndDropNodestartDragAndDropTransfer1Serializer, companion2.getSetResolvedCompositionLocals());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, Integer.valueOf(iHashCode), companion2.getSetCompositeKeyHash());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, companion2.getApplyOnDeactivatedNodeAssertion());
                AndroidContentCaptureManagerCompanion.write(getbirthdatefull4, modifierMaterializeModifier, companion2.getSetModifier());
                String str = teardownallglobalparameterss.MediaBrowserCompatMediaItem;
                int i13 = teardownallglobalparameterss.MediaSessionCompatQueueItem ? com.logistics.rider.glovo.R.drawable.ic_bold_small_arrow_up : com.logistics.rider.glovo.R.drawable.ic_bold_small_arrow_down;
                boolean z9 = getpostalcode5.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                boolean zIconCompatParcelizer8 = getpostalcode5.IconCompatParcelizer(teardownallglobalparameterss);
                Object objComponentActivity10 = getpostalcode5.ComponentActivity();
                if ((z9 | zIconCompatParcelizer8) || objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new setPushTokenI(r8lambdaunavo3sxub_pc9xroryotnrlvsm, teardownallglobalparameterss, 1);
                    getpostalcode5.write(objComponentActivity10);
                }
                TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity10, null, false, i13, null, null, null, getbirthdatefull4, 0, 236);
                AnimatedVisibilityKt.serializer(teardownallglobalparameterss.MediaSessionCompatQueueItem, null, null, null, null, ExtrasKt.write(114556714, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(3, teardownallglobalparameterss), getbirthdatefull4), getbirthdatefull4, 1572870, 30);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getbirthdatefull4, SizeKt.m75height3ABfNKs(companion, Dimensions.getAnimatedVisibility)});
                startFirstSessionI startfirstsessioni = teardownallglobalparameterss.MediaMetadataCompat;
                boolean z10 = getpostalcode5.read(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                boolean zIconCompatParcelizer9 = getpostalcode5.IconCompatParcelizer(teardownallglobalparameterss);
                Object objComponentActivity11 = getpostalcode5.ComponentActivity();
                if (!z10 && !zIconCompatParcelizer9) {
                    int i14 = IconCompatParcelizer + 49;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (objComponentActivity11 == androidContentCaptureManager) {
                        final int i16 = 0;
                        objComponentActivity11 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.shouldDisableThirdPartySharingWhenCoppaEnabled
                            private static int serializer = 0;
                            private static int write = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj9) {
                                int i17 = 2 % 2;
                                int i18 = write + 85;
                                serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i19 = i18 % 2;
                                int i20 = i16;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                teardownAllGlobalParametersS teardownallglobalparameterss2 = teardownallglobalparameterss;
                                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                                teardownEventMetadataS teardowneventmetadatas = (teardownEventMetadataS) obj9;
                                if (i20 != 0) {
                                    teardowneventmetadatas.getClass();
                                    long j = teardownallglobalparameterss2.RemoteActionCompatParcelizer;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(Long.valueOf(j), teardowneventmetadatas, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.CUSTOMER, launchThirdPartySharingResponseTasks.OPEN));
                                    int i21 = serializer + 119;
                                    write = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i21 % 2 != 0) {
                                        return createfromparcel2;
                                    }
                                    throw null;
                                }
                                teardowneventmetadatas.getClass();
                                long j2 = teardownallglobalparameterss2.RemoteActionCompatParcelizer;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(Long.valueOf(j2), teardowneventmetadatas, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.VENDOR, launchThirdPartySharingResponseTasks.OPEN));
                                int i22 = write + 93;
                                serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i22 % 2 == 0) {
                                    return createfromparcel2;
                                }
                                throw null;
                            }
                        };
                        getpostalcode5.write(objComponentActivity11);
                    }
                } else {
                    final int i17 = 0;
                    objComponentActivity11 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.shouldDisableThirdPartySharingWhenCoppaEnabled
                        private static int serializer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj9) {
                            int i18 = 2 % 2;
                            int i19 = write + 85;
                            serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i110 = i19 % 2;
                            int i20 = i17;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            teardownAllGlobalParametersS teardownallglobalparameterss2 = teardownallglobalparameterss;
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                            teardownEventMetadataS teardowneventmetadatas = (teardownEventMetadataS) obj9;
                            if (i20 != 0) {
                                teardowneventmetadatas.getClass();
                                long j = teardownallglobalparameterss2.RemoteActionCompatParcelizer;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(Long.valueOf(j), teardowneventmetadatas, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.CUSTOMER, launchThirdPartySharingResponseTasks.OPEN));
                                int i21 = serializer + 119;
                                write = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i21 % 2 != 0) {
                                    return createfromparcel2;
                                }
                                throw null;
                            }
                            teardowneventmetadatas.getClass();
                            long j2 = teardownallglobalparameterss2.RemoteActionCompatParcelizer;
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(Long.valueOf(j2), teardowneventmetadatas, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.VENDOR, launchThirdPartySharingResponseTasks.OPEN));
                            int i22 = write + 93;
                            serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i22 % 2 == 0) {
                                return createfromparcel2;
                            }
                            throw null;
                        }
                    };
                    getpostalcode5.write(objComponentActivity11);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity11;
                boolean z11 = getpostalcode5.read(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2);
                boolean zIconCompatParcelizer10 = getpostalcode5.IconCompatParcelizer(teardownallglobalparameterss);
                Object objComponentActivity12 = getpostalcode5.ComponentActivity();
                if ((z11 | zIconCompatParcelizer10) || objComponentActivity12 == androidContentCaptureManager) {
                    final int i18 = 0;
                    objComponentActivity12 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setOfflineModeI
                        private static int RemoteActionCompatParcelizer = 1;
                        private static int read;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj9, Object obj10) {
                            int i19 = 2 % 2;
                            int i20 = read + 49;
                            RemoteActionCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            Object obj11 = null;
                            if (i20 % 2 == 0) {
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                ((Double) obj9).doubleValue();
                                ((Double) obj10).doubleValue();
                                obj11.hashCode();
                                throw null;
                            }
                            int i21 = i18;
                            createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                            teardownAllGlobalParametersS teardownallglobalparameterss2 = teardownallglobalparameterss;
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                            Double d = (Double) obj9;
                            d.doubleValue();
                            Double d2 = (Double) obj10;
                            d2.doubleValue();
                            if (i21 == 0) {
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(d, d2, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.VENDOR, launchThirdPartySharingResponseTasks.OPEN));
                                return createfromparcel3;
                            }
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(d, d2, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.CUSTOMER, launchThirdPartySharingResponseTasks.OPEN));
                            int i22 = read + 117;
                            RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i22 % 2 != 0) {
                                return createfromparcel3;
                            }
                            throw null;
                        }
                    };
                    getpostalcode5.write(objComponentActivity12);
                }
                DeliveryLocationKt.DeliveryLocation(startfirstsessioni, com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_shop, true, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity12, null, getbirthdatefull4, 384);
                startFirstSessionI startfirstsessioni2 = teardownallglobalparameterss.serializer;
                boolean z12 = getpostalcode5.read(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                boolean zIconCompatParcelizer11 = getpostalcode5.IconCompatParcelizer(teardownallglobalparameterss);
                Object objComponentActivity13 = getpostalcode5.ComponentActivity();
                if ((z12 | zIconCompatParcelizer11) || objComponentActivity13 == androidContentCaptureManager) {
                    final int i19 = 1;
                    objComponentActivity13 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.shouldDisableThirdPartySharingWhenCoppaEnabled
                        private static int serializer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj9) {
                            int i110 = 2 % 2;
                            int i111 = write + 85;
                            serializer = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            int i20 = i19;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            teardownAllGlobalParametersS teardownallglobalparameterss2 = teardownallglobalparameterss;
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                            teardownEventMetadataS teardowneventmetadatas = (teardownEventMetadataS) obj9;
                            if (i20 != 0) {
                                teardowneventmetadatas.getClass();
                                long j = teardownallglobalparameterss2.RemoteActionCompatParcelizer;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(Long.valueOf(j), teardowneventmetadatas, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.CUSTOMER, launchThirdPartySharingResponseTasks.OPEN));
                                int i21 = serializer + 119;
                                write = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i21 % 2 != 0) {
                                    return createfromparcel2;
                                }
                                throw null;
                            }
                            teardowneventmetadatas.getClass();
                            long j2 = teardownallglobalparameterss2.RemoteActionCompatParcelizer;
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(Long.valueOf(j2), teardowneventmetadatas, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.VENDOR, launchThirdPartySharingResponseTasks.OPEN));
                            int i22 = write + 93;
                            serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i22 % 2 == 0) {
                                return createfromparcel2;
                            }
                            throw null;
                        }
                    };
                    getpostalcode5.write(objComponentActivity13);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity13;
                boolean z13 = getpostalcode5.read(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2);
                boolean zIconCompatParcelizer12 = getpostalcode5.IconCompatParcelizer(teardownallglobalparameterss);
                Object objComponentActivity14 = getpostalcode5.ComponentActivity();
                if ((z13 | zIconCompatParcelizer12) || objComponentActivity14 == androidContentCaptureManager) {
                    final int i20 = 1;
                    objComponentActivity14 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setOfflineModeI
                        private static int RemoteActionCompatParcelizer = 1;
                        private static int read;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj9, Object obj10) {
                            int i110 = 2 % 2;
                            int i21 = read + 49;
                            RemoteActionCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            Object obj11 = null;
                            if (i21 % 2 == 0) {
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                ((Double) obj9).doubleValue();
                                ((Double) obj10).doubleValue();
                                obj11.hashCode();
                                throw null;
                            }
                            int i22 = i20;
                            createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                            teardownAllGlobalParametersS teardownallglobalparameterss2 = teardownallglobalparameterss;
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                            Double d = (Double) obj9;
                            d.doubleValue();
                            Double d2 = (Double) obj10;
                            d2.doubleValue();
                            if (i22 == 0) {
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(d, d2, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.VENDOR, launchThirdPartySharingResponseTasks.OPEN));
                                return createfromparcel3;
                            }
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(d, d2, new launchSessionResponseTasksI(teardownallglobalparameterss2.MediaDescriptionCompat, teardownallglobalparameterss2.RemoteActionCompatParcelizer, launchSessionResponseListenerI.CUSTOMER, launchThirdPartySharingResponseTasks.OPEN));
                            int i23 = read + 117;
                            RemoteActionCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i23 % 2 != 0) {
                                return createfromparcel3;
                            }
                            throw null;
                        }
                    };
                    getpostalcode5.write(objComponentActivity14);
                }
                DeliveryLocationKt.DeliveryLocation(startfirstsessioni2, com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_user_circle, false, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity14, null, getbirthdatefull4, 384);
                getpostalcode5.IconCompatParcelizer(true);
                return createfromparcel;
            case 6:
                removeGlobalCallbackParameters removeglobalcallbackparameters = (removeGlobalCallbackParameters) obj6;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode6.write(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    int i21 = IconCompatParcelizer + 21;
                    read = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    CountryCodePickerBottomSheetKt.CountryCodePickerContent(removeglobalcallbackparameters, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, SizeKt.serializer(Modifier.Companion, 0.8f), false, getpostalcode6, 24576, 32);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                Modifier modifier3 = (Modifier) obj6;
                AttributionHandler attributionHandler = (AttributionHandler) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj4;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode7.write(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    int i23 = read + 7;
                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    Modifier modifierWrite = PaddingKt.write(modifier3, Dimensions.setTransitioning);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode7, 0);
                    int iHashCode2 = Long.hashCode(getpostalcode7.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode7.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode7, modifierWrite);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                    if (getpostalcode7.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode7.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode7.ComponentActivity) {
                        int i25 = read + 111;
                        IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        getpostalcode7.serializer(constructor2);
                    } else {
                        getpostalcode7.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode7, modalBottomSheetYbuCTN8Serializer2, getpostalcode7, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode7, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode7, Integer.valueOf(iHashCode2), getpostalcode7));
                    getDeviceManufacturer.read(0, getpostalcode7, null, attributionHandler.read);
                    Modifier.Companion companion4 = Modifier.Companion;
                    float f = Dimensions.setTabContainer;
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode7, SizeKt.m83size3ABfNKs(companion4, f)});
                    OnDemandWorkingKt.WorkAreaColumn(0, getpostalcode7, null, attributionHandler.serializer);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode7, SizeKt.m83size3ABfNKs(companion4, f)});
                    isValidParameter.RemoteActionCompatParcelizer(StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.status_stop_working, getpostalcode7, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k7, SizeKt.write(companion4, 1.0f), attributionHandler.IconCompatParcelizer, false, null, null, null, null, getpostalcode7, 384, 1008);
                    dragAndDropTargetModifierNode.invoke(getpostalcode7, 0);
                    getpostalcode7.IconCompatParcelizer(true);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                layoutInflater.getClass();
                viewGroup.getClass();
                new ContextThemeWrapper(layoutInflater.getContext(), com.logistics.rider.glovo.R.style.Theme_RoadRunner);
                View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.view_outlined_text_area, viewGroup, false);
                if (zBooleanValue2) {
                    viewGroup.addView(viewInflate);
                }
                getTopimpl gettopimpl = (getTopimpl) ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.text_area_edit_text, viewInflate);
                if (gettopimpl == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(com.logistics.rider.glovo.R.id.text_area_edit_text)));
                    return null;
                }
                TextInputLayout textInputLayout = (TextInputLayout) viewInflate;
                jsonStringToMap jsonstringtomap = new jsonStringToMap(textInputLayout, gettopimpl, textInputLayout);
                textInputLayout.setBoxStrokeWidth(0);
                textInputLayout.setBoxStrokeWidthFocused(0);
                textInputLayout.setHintEnabled(str2.length() == 0);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textInputLayout.getHint(), str3}, getCieXyz.write())).booleanValue()) {
                    textInputLayout.setHint(str3);
                }
                gettopimpl.addTextChangedListener(new ValueInsets_androidKt(1, r8lambdaunavo3sxub_pc9xroryotnrlvsm7));
                r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(textInputLayout);
                return jsonstringtomap;
        }
    }
}
