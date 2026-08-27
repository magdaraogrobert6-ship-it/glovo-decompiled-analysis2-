package com.roadrunner.rider.state.ondemand.goofflineinfo;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.input.KeyboardType;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.AmountTextInputState;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.ondemand.resumepause.OnDemandResumePauseFloatingContentKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import o.AndroidContentCaptureManager;
import o.AttributionHandler3;
import o.DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCenterHorizontally;
import o.getCreditCardExpirationMonth;
import o.getOsName;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletons$GoOfflineInformationComposableFactoryImplKt$$ExternalSyntheticLambda0 implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:119:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:185:0x033c  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        int i2;
        int i3;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5 = 2 % 2;
        int i6 = this.RemoteActionCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i6 == 0) {
            AttributionHandler3 attributionHandler3 = (AttributionHandler3) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            int iIntValue = ((Integer) obj6).intValue();
            attributionHandler3.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            GoOfflineInformationDialogKt.GoOfflineInformationDialog(attributionHandler3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, (getBirthDateFull) obj5, iIntValue & 8190);
            return createfromparcel;
        }
        Object obj7 = null;
        if (i6 == 1) {
            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl = (DeliveryAcceptButtonUiModelImpl) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj5;
            int iIntValue2 = ((Integer) obj6).intValue();
            deliveryAcceptButtonUiModelImpl.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            if ((iIntValue2 & 6) == 0) {
                i = (((getPostalCode) getbirthdatefull).read(deliveryAcceptButtonUiModelImpl) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                int i7 = IconCompatParcelizer + 73;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2);
                    Object obj8 = null;
                    obj8.hashCode();
                    throw null;
                }
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? 32 : 16;
            }
            if ((iIntValue2 & 384) == 0) {
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((iIntValue2 & 3072) == 0) {
                if (((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    int i8 = IconCompatParcelizer + 29;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 2048;
                } else {
                    i2 = Fields.RotationZ;
                }
                i |= i2;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i & 1, (i & 9363) != 9362)) {
                boolean z5 = (i & 896) == 256;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z5) {
                    objComponentActivity = new DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 1);
                    getpostalcode.write(objComponentActivity);
                } else {
                    int i10 = IconCompatParcelizer + 11;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new DBUtil__DBUtil_androidKtperformSuspendinglambda1inlinedinternalPerform1(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 1);
                        getpostalcode.write(objComponentActivity);
                    }
                }
                AcceptButtonComposableKt.write(deliveryAcceptButtonUiModelImpl, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, i & 7294);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i6 != 2) {
            getOsName getosname = (getOsName) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj5;
            int iIntValue3 = ((Integer) obj6).intValue();
            getosname.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            if ((iIntValue3 & 6) == 0) {
                i4 = (!((getPostalCode) getbirthdatefull2).read(getosname) ? 2 : 4) | iIntValue3;
            } else {
                i4 = iIntValue3;
            }
            if ((iIntValue3 & 48) == 0) {
                i4 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3) ? 32 : 16;
            }
            if ((iIntValue3 & 384) == 0) {
                i4 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((iIntValue3 & 3072) == 0) {
                i4 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i4 & 9363) != 9362) {
                int i12 = write + 1;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else {
                z4 = false;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(i4 & 1, z4)) {
                OnDemandResumePauseFloatingContentKt.OnDemandResumePauseFloatingContent(getosname, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode2, i4 & 8190);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        AmountTextInputState amountTextInputState = (AmountTextInputState) obj;
        r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8 = (r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj5;
        int iIntValue4 = ((Integer) obj6).intValue();
        amountTextInputState.getClass();
        r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        if ((iIntValue4 & 6) == 0) {
            i3 = (!((getPostalCode) getbirthdatefull3).read(amountTextInputState) ? 2 : 4) | iIntValue4;
        } else {
            i3 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            i3 |= ((iIntValue4 & 64) == 0 ? getpostalcode3.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8) : getpostalcode3.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8)) ^ true ? 16 : 32;
        }
        if ((iIntValue4 & 384) == 0) {
            i3 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((iIntValue4 & 3072) == 0) {
            int i13 = write + 123;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                obj7.hashCode();
                throw null;
            }
            i3 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i3 & 9363) != 9362) {
            int i14 = write + 75;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
        if (!getpostalcode4.write(i3 & 1, z)) {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            return createfromparcel;
        }
        Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
        String str2 = amountTextInputState.read;
        String str3 = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.amountTextInputTitle;
        String str4 = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.amountTextInputPlaceholder;
        String str5 = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.amountTextInputCurrencySymbol;
        boolean z6 = amountTextInputState.write;
        if (!amountTextInputState.IconCompatParcelizer) {
            str = amountTextInputState.serializer;
        } else {
            int i16 = IconCompatParcelizer + 87;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                String str6 = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.amountTextInputValidationErrorMessage;
                throw null;
            }
            str = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.amountTextInputValidationErrorMessage;
        }
        String str7 = str;
        getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(KeyboardType.Companion.m3316getDecimalPjHm6EE(), 0, 123);
        boolean z7 = (i3 & 896) == 256;
        boolean z8 = (i3 & 112) == 32 || ((i3 & 64) != 0 && getpostalcode4.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8));
        Object objComponentActivity2 = getpostalcode4.ComponentActivity();
        if (!z7 && !z8) {
            int i17 = IconCompatParcelizer + 69;
            write = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                throw null;
            }
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SessionDao_Impl$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 29, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                getpostalcode4.write(objComponentActivity2);
            }
        } else {
            objComponentActivity2 = new SessionDao_Impl$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 29, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
            getpostalcode4.write(objComponentActivity2);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
        if ((i3 & 14) == 4) {
            int i18 = IconCompatParcelizer + 37;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i3 & 7168) == 2048) {
            int i20 = write + 13;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        Object objComponentActivity3 = getpostalcode4.ComponentActivity();
        if ((z2 | z3) || objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(amountTextInputState, 1, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
            getpostalcode4.write(objComponentActivity3);
        }
        TextInputBigV2Kt.TextInputBigV2(str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifierWrite, false, str3, str4, null, null, z6, str7, null, false, 0, getcenterhorizontally, null, str5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, "amount_edittext_tag", "amount_edittext_error_tag", getpostalcode4, 384, 196608, 432, 750488);
        return createfromparcel;
    }
}
