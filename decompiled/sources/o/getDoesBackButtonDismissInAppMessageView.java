package o;

import android.content.Context;
import bo.app.hg$$ExternalSyntheticLambda5;
import com.roadrunner.appmigration.presentation.compose.AppMigrationKt;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.earningsMessage.api.EarningsMessageUiModel;
import com.roadrunner.delivery.accept.earningsMessage.presentation.EarningsMessageUiModelImpl;
import com.roadrunner.delivery.accept.earningsMessage.presentation.compose.EarningsMessageContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.rider.state.noorders.api.HomeNoOrdersUiModel;
import com.roadrunner.rider.state.noorders.presentation.RiderStateNoOrdersKt;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getDoesBackButtonDismissInAppMessageView implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ getDoesBackButtonDismissInAppMessageView(MutexImpl mutexImpl, getApplicationContext getapplicationcontext) {
        this.write = 6;
        this.read = mutexImpl;
    }

    public /* synthetic */ getDoesBackButtonDismissInAppMessageView(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.read;
        if (i5 == 0) {
            ((SemaphoreAndMutexImpl) obj4).IconCompatParcelizer();
            return createfromparcel;
        }
        int i6 = 3;
        int i7 = 4;
        boolean z = false;
        if (i5 == 1) {
            CreateHomeScope createHomeScope = (CreateHomeScope) obj4;
            SemanticsModifierDefaultImpls semanticsModifierDefaultImpls = (SemanticsModifierDefaultImpls) obj;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            semanticsModifierDefaultImpls.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= ((getPostalCode) getbirthdatefull).read(semanticsModifierDefaultImpls) ? 4 : 2;
            }
            if ((iIntValue & 19) != 18) {
                int i8 = RemoteActionCompatParcelizer + 101;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = true;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                int i10 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                androidx.fragment.app.FragmentActivity fragmentActivityRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(createHomeScope);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new SessionDao_Impl$$ExternalSyntheticLambda1(createHomeScope, i6, fragmentActivityRemoteActionCompatParcelizer);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(createHomeScope);
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new hg$$ExternalSyntheticLambda5(createHomeScope, fragmentActivityRemoteActionCompatParcelizer);
                    getpostalcode.write(objComponentActivity2);
                }
                AppMigrationKt.AppMigration(semanticsModifierDefaultImpls, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, iIntValue & 14);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i5 == 2) {
            r8lambdaRtIj5yf8tzAl9POZPGjtXWFBY8w r8lambdartij5yf8tzal9pozpgjtxwfby8w = (r8lambdaRtIj5yf8tzAl9POZPGjtXWFBY8w) obj4;
            EarningsMessageUiModel earningsMessageUiModel = (EarningsMessageUiModel) obj;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            earningsMessageUiModel.getClass();
            if ((iIntValue2 & 6) == 0) {
                if (((getPostalCode) getbirthdatefull2).read(earningsMessageUiModel)) {
                    int i12 = RemoteActionCompatParcelizer + 81;
                    IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    i7 = 2;
                }
                iIntValue2 |= i7;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                int i14 = IconCompatParcelizer + 99;
                RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    EarningsMessageContentKt.EarningsMessageContent(((EarningsMessageUiModelImpl) earningsMessageUiModel).RemoteActionCompatParcelizer(), r8lambdartij5yf8tzal9pozpgjtxwfby8w.read, null, getpostalcode2, 1);
                } else {
                    EarningsMessageContentKt.EarningsMessageContent(((EarningsMessageUiModelImpl) earningsMessageUiModel).RemoteActionCompatParcelizer(), r8lambdartij5yf8tzal9pozpgjtxwfby8w.read, null, getpostalcode2, 0);
                }
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i5 == 3) {
            r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm = (r8lambdatP2n_F9e4k2NvYif5gW5fjCaNlM) obj4;
            IconButtonKt iconButtonKt = (IconButtonKt) obj;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            iconButtonKt.getClass();
            if ((iIntValue3 & 6) == 0) {
                iIntValue3 |= ((getPostalCode) getbirthdatefull3).read(iconButtonKt) ^ true ? 2 : 4;
            }
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (!getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i15 = RemoteActionCompatParcelizer + 45;
                IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
            } else if (r8lambdatp2n_f9e4k2nvyif5gw5fjcanlm.read > 0) {
                getpostalcode3.serializer(-599770117);
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                companion.getClass();
                BadgeKt.RemoteActionCompatParcelizer(iconButtonKt, "", companion, getpostalcode3, (iIntValue3 & 14) | 432, 0);
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                getpostalcode3.serializer(-599665368);
                getpostalcode3.IconCompatParcelizer(false);
            }
            return createfromparcel;
        }
        if (i5 == 4) {
            AdjustLinkResolutionAdjustLinkResolutionCallback adjustLinkResolutionAdjustLinkResolutionCallback = (AdjustLinkResolutionAdjustLinkResolutionCallback) obj4;
            HomeNoOrdersUiModel homeNoOrdersUiModel = (HomeNoOrdersUiModel) obj;
            getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
            int iIntValue4 = ((Integer) obj3).intValue();
            homeNoOrdersUiModel.getClass();
            if ((iIntValue4 & 6) == 0) {
                if (((getPostalCode) getbirthdatefull4).read(homeNoOrdersUiModel)) {
                    int i17 = RemoteActionCompatParcelizer + 41;
                    IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = i17 % 2 == 0 ? 5 : 4;
                }
                iIntValue4 |= i;
            }
            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
            if (getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                RiderStateNoOrdersKt.read(adjustLinkResolutionAdjustLinkResolutionCallback.IconCompatParcelizer, homeNoOrdersUiModel, null, getpostalcode4, (iIntValue4 << 3) & 112);
            } else {
                getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i5 != 5) {
            MutexImpl mutexImpl = (MutexImpl) obj4;
            MutexImpl.write.set(mutexImpl, null);
            mutexImpl.write(null);
            return createfromparcel;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
        getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
        int iIntValue5 = ((Integer) obj3).intValue();
        modifier.getClass();
        if ((iIntValue5 & 6) == 0) {
            if (((getPostalCode) getbirthdatefull5).read(modifier)) {
                int i18 = RemoteActionCompatParcelizer + 89;
                IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    i6 = 4;
                }
            } else {
                i6 = 2;
            }
            iIntValue5 |= i6;
        }
        if ((iIntValue5 & 19) != 18) {
            int i19 = RemoteActionCompatParcelizer + 93;
            IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = true;
        }
        getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
        if (getpostalcode5.write(iIntValue5 & 1, z)) {
            float f = Dimensions.setCustomView;
            equalEnum.IconCompatParcelizer(com.logistics.rider.glovo.R.drawable.ic_bold_large_navigation_hamburger, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, f, f, getpostalcode5, 0, 24);
        } else {
            getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i21 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                int i22 = 5 / 2;
            }
        }
        return createfromparcel;
    }
}
