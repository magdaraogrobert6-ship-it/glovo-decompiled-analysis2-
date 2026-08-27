package o;

import android.content.Context;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.footer.implementation.presentation.DeliveryAcceptFooterContentKt;
import com.roadrunner.freelancing.api.bonus.WorkNowWithBonusUiModel;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusKt;
import com.roadrunner.rider.state.searchshifts.api.presentation.SearchShiftsWithBonusUiModel;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class computeVerticalScrollRange implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ computeVerticalScrollRange(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = this.IconCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj7 = this.write;
        int i7 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = 16;
        if (i6 == 0) {
            ViewKtallViews1 viewKtallViews1 = (ViewKtallViews1) obj7;
            WorkNowWithBonusUiModel workNowWithBonusUiModel = (WorkNowWithBonusUiModel) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj5;
            int iIntValue = ((Integer) obj6).intValue();
            workNowWithBonusUiModel.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            if ((iIntValue & 6) == 0) {
                i = iIntValue | (((getPostalCode) getbirthdatefull).read(workNowWithBonusUiModel) ? 4 : 2);
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                int i9 = serializer + 35;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.RotationX : 128;
            }
            if ((iIntValue & 3072) == 0) {
                i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (!getpostalcode.write(i & 1, (i & 9363) != 9362)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                return createfromparcel;
            }
            androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            getStableInsets getstableinsets = viewKtallViews1.IconCompatParcelizer;
            getTappableElementInsets gettappableelementinsets = viewKtallViews1.RatingCompat;
            logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11 = viewKtallViews1.read;
            xb xbVar = viewKtallViews1.serializer;
            accessisMainThread accessismainthread = viewKtallViews1.write;
            getActionList getactionlist = viewKtallViews1.RemoteActionCompatParcelizer;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(viewKtallViews1);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new checkSdkClickResponseI(viewKtallViews1, fragmentActivityRemoteActionCompatParcelizer, 2);
                getpostalcode.write(objComponentActivity);
            }
            WorkNowWithBonusKt.WorkNowWithBonus(getstableinsets, gettappableelementinsets, logpushstorypageclickedlambda11, xbVar, accessismainthread, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, workNowWithBonusUiModel, getactionlist, null, getpostalcode, ((i << 15) & 267911168) | ((i << 27) & 1879048192), 0);
            return createfromparcel;
        }
        if (i6 == 1) {
            accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = (accessstripNonMetricAffectingCharacterStyleSpans) obj7;
            accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp = (accessgetStripNonMetricAffectingCharSpansp) obj;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj5;
            int iIntValue2 = ((Integer) obj6).intValue();
            accessgetstripnonmetricaffectingcharspansp.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            if ((iIntValue2 & 6) == 0) {
                i2 = iIntValue2 | (((getPostalCode) getbirthdatefull2).read(accessgetstripnonmetricaffectingcharspansp) ? 4 : 2);
            } else {
                i2 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                if (!((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2)) {
                    i3 = 16;
                } else {
                    int i11 = serializer + 1;
                    RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i3 = 32;
                }
                i2 |= i3;
            }
            if ((iIntValue2 & 384) == 0) {
                i2 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? androidx.compose.ui.graphics.Fields.RotationX : 128;
            }
            if ((iIntValue2 & 3072) == 0) {
                i2 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
                int i13 = RemoteActionCompatParcelizer + 81;
                serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                int i15 = i2 << 9;
                DeliveryAcceptFooterContentKt.DeliveryAcceptFooterContent(accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans.serializer, accessstripnonmetricaffectingcharacterstylespans.RemoteActionCompatParcelizer, accessstripnonmetricaffectingcharacterstylespans.write, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode2, (i2 & 14) | (57344 & i15) | (458752 & i15) | (i15 & 3670016));
                int i16 = RemoteActionCompatParcelizer + 19;
                serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        waitTime waittime = (waitTime) obj7;
        SearchShiftsWithBonusUiModel searchShiftsWithBonusUiModel = (SearchShiftsWithBonusUiModel) obj;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj5;
        int iIntValue3 = ((Integer) obj6).intValue();
        searchShiftsWithBonusUiModel.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        if ((iIntValue3 & 6) == 0) {
            i4 = iIntValue3 | (((getPostalCode) getbirthdatefull3).read(searchShiftsWithBonusUiModel) ? 4 : 2);
        } else {
            i4 = iIntValue3;
        }
        if ((iIntValue3 & 48) == 0) {
            if (((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3)) {
                int i18 = RemoteActionCompatParcelizer + 75;
                serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i8 = 32;
            }
            i4 |= i8;
        }
        if ((iIntValue3 & 384) == 0) {
            int i20 = RemoteActionCompatParcelizer + 113;
            serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i21 = i20 % 2;
            if (((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3)) {
                int i22 = RemoteActionCompatParcelizer + 101;
                serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i23 = i22 % 2;
                i7 = androidx.compose.ui.graphics.Fields.RotationX;
            }
            i4 |= i7;
        }
        if ((iIntValue3 & 3072) == 0) {
            i4 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
        if (getpostalcode3.write(i4 & 1, (i4 & 9363) != 9362)) {
            int i24 = RemoteActionCompatParcelizer + 77;
            serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i25 = i24 % 2;
            androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer2 = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode3.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            xb xbVar2 = waittime.RemoteActionCompatParcelizer;
            accessisMainThread accessismainthread2 = waittime.IconCompatParcelizer;
            boolean zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(waittime);
            boolean zIconCompatParcelizer4 = getpostalcode3.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
            Object objComponentActivity2 = getpostalcode3.ComponentActivity();
            if ((zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SealedClassSerializer$$ExternalSyntheticLambda0(waittime, 13, fragmentActivityRemoteActionCompatParcelizer2);
                getpostalcode3.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            boolean zIconCompatParcelizer5 = getpostalcode3.IconCompatParcelizer(waittime);
            boolean zIconCompatParcelizer6 = getpostalcode3.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
            Object objComponentActivity3 = getpostalcode3.ComponentActivity();
            if ((zIconCompatParcelizer5 | zIconCompatParcelizer6) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new IInAppMessageViewWrapperFactory(waittime, 2, fragmentActivityRemoteActionCompatParcelizer2);
                getpostalcode3.write(objComponentActivity3);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3;
            boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(waittime);
            boolean zIconCompatParcelizer8 = getpostalcode3.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
            Object objComponentActivity4 = getpostalcode3.ComponentActivity();
            if ((zIconCompatParcelizer7 | zIconCompatParcelizer8) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new Updater$$ExternalSyntheticLambda1(waittime, fragmentActivityRemoteActionCompatParcelizer2);
                getpostalcode3.write(objComponentActivity4);
            }
            int i26 = i4 << 15;
            SearchShiftsWithBonusKt.SearchShiftsWithBonus(searchShiftsWithBonusUiModel, xbVar2, accessismainthread2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode3, (i4 & 14) | (i26 & 3670016) | (29360128 & i26) | (i26 & 234881024));
        } else {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i27 = serializer + 5;
            RemoteActionCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i28 = i27 % 2;
        }
        return createfromparcel;
    }
}
