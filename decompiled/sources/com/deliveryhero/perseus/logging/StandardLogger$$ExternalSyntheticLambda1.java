package com.deliveryhero.perseus.logging;

import android.content.Context;
import android.util.Log;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.room.RoomDatabase$closeBarrier$1;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.deliverydetails.api.DeliveryDetailsUiModel;
import com.roadrunner.delivery.accept.deliverydetails.presentation.compose.DeliveryDetailsContentKt;
import com.roadrunner.delivery.accept.earnings.api.EarningsUiModel;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;
import com.roadrunner.delivery.accept.individualEarnings.api.presentation.IndividualEarningsUiModel;
import com.roadrunner.delivery.accept.individualEarnings.presentation.IndividualEarningsUiModelImpl;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.EarningsComposableKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapPin.composable.LastStopMapPinKt;
import com.roadrunner.delivery.accept.newordertitle.api.NewOrderTitleUiModel;
import com.roadrunner.delivery.accept.newordertitle.presentation.compose.NewOrderTitleContentKt;
import com.roadrunner.delivery.accept.orderitems.api.OrderItemsNavigationUiModel;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsNavigationKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.delivery.accept.tags.api.TagsUiModel;
import com.roadrunner.delivery.accept.tags.presentation.TagsUiModelImpl;
import com.roadrunner.delivery.accept.tags.presentation.compose.TagsContentKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.freelancing.api.presentation.empty.FreelancingAvailabilityUiModel;
import com.roadrunner.freelancing.api.presentation.outsideactivearea.OutsideActiveAreaUiModel;
import com.roadrunner.freelancing.api.presentation.tab.WorkOpportunityTypeSelectorUiModel;
import com.roadrunner.freelancing.presentation.empty.FreelancingAvailabilityUiModelImpl;
import com.roadrunner.freelancing.presentation.empty.OpportunityInfoContentKt;
import com.roadrunner.freelancing.presentation.outsideactivearea.OutsideActiveAreaKt;
import com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorKt;
import com.roadrunner.location.toggle.api.bottomsheet.EnableLocationUiModel;
import com.roadrunner.location.toggle.presentation.bottomsheet.EnableLocationKt;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.map.navigateview.NavigationInformationKt;
import com.roadrunner.map.navigateview.api.NavigateViewUiModel;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.overlay.bubble.banner.OverlayVisibilityBannerUiModel;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerKt;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.roadrunner.rider.state.cashblock.api.presentation.CashBlockUiModel;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt;
import com.roadrunner.rider.state.finishedshift.api.presentation.FinishedShiftUiModel;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftKt;
import com.roadrunner.rider.state.ondemand.api.outsideactivearea.OnDemandOutsideActiveAreaUiModel;
import com.roadrunner.rider.state.ondemand.outsideactivearea.OnDemandOutsideActiveAreaKt;
import com.roadrunner.rider.state.onpause.api.presentation.OnPauseUiModel;
import com.roadrunner.rider.state.onpause.presentation.OnPauseScreenKt;
import com.roadrunner.rider.state.quests.api.list.QuestListUiModel;
import com.roadrunner.rider.state.quests.presentation.list.QuestListKt;
import com.roadrunner.rider.state.suspension.api.SuspensionUiModel;
import com.roadrunner.rider.state.suspension.presentation.SuspensionScreenKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.AsyncImagePreviewHandlerCompanionDefault1;
import o.BackspaceCommand;
import o.C0215z;
import o.EditingBufferCompanion;
import o.PopulateViewStructure_androidKtpopulate7;
import o.StaticLayoutFactory33;
import o.V;
import o.buildMapping;
import o.createFromParcel;
import o.eg;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEndOffsetForRectWithinRun;
import o.getExtraData;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class StandardLogger$$ExternalSyntheticLambda1 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;

    public /* synthetic */ StandardLogger$$ExternalSyntheticLambda1(int i) {
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x029f  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = this.read;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z2 = false;
        switch (i3) {
            case 0:
                return Integer.valueOf(Log.i((String) obj, (String) obj2, (Throwable) obj3));
            case 1:
                DeliveryDetailsUiModel deliveryDetailsUiModel = (DeliveryDetailsUiModel) obj;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                deliveryDetailsUiModel.getClass();
                if ((iIntValue & 6) == 0) {
                    int i4 = IconCompatParcelizer + 5;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    iIntValue |= ((getPostalCode) getbirthdatefull).read(deliveryDetailsUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                    DeliveryDetailsContentKt.RemoteActionCompatParcelizer(deliveryDetailsUiModel, (Modifier) null, getpostalcode, iIntValue & 14);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                EarningsUiModel earningsUiModel = (EarningsUiModel) obj;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                earningsUiModel.getClass();
                if ((iIntValue2 & 6) == 0) {
                    int i6 = IconCompatParcelizer + 87;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(earningsUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    EarningsContentKt.EarningsContent(earningsUiModel, null, getpostalcode2, iIntValue2 & 14);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                IndividualEarningsUiModel individualEarningsUiModel = (IndividualEarningsUiModel) obj;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                individualEarningsUiModel.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((getPostalCode) getbirthdatefull3).read(individualEarningsUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    StaticLayoutFactory33 staticLayoutFactory33 = (StaticLayoutFactory33) ExtrasKt.write(((IndividualEarningsUiModelImpl) individualEarningsUiModel).RemoteActionCompatParcelizer(), getpostalcode3, 0).getValue();
                    z = (iIntValue3 & 14) == 4;
                    Object objComponentActivity = getpostalcode3.ComponentActivity();
                    if (z || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new ReportPictureUseCase$invoke$2(individualEarningsUiModel);
                        getpostalcode3.write(objComponentActivity);
                    }
                    EarningsComposableKt.serializer(staticLayoutFactory33, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode3, 0);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 4:
                getEndOffsetForRectWithinRun getendoffsetforrectwithinrun = (getEndOffsetForRectWithinRun) obj;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                getendoffsetforrectwithinrun.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((getPostalCode) getbirthdatefull4).read(getendoffsetforrectwithinrun) ? 4 : 2;
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    int i8 = IconCompatParcelizer + 69;
                    serializer = i8 % Fields.SpotShadowColor;
                    LastStopMapPinKt.LastStopMapPin(getendoffsetforrectwithinrun, null, getpostalcode4, i8 % 2 == 0 ? iIntValue4 & 11 : iIntValue4 & 14);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                NewOrderTitleUiModel newOrderTitleUiModel = (NewOrderTitleUiModel) obj;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                newOrderTitleUiModel.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((getPostalCode) getbirthdatefull5).read(newOrderTitleUiModel) ? 4 : 2;
                }
                if ((iIntValue5 & 19) != 18) {
                    int i9 = IconCompatParcelizer + 91;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z2 = true;
                }
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode5.write(iIntValue5 & 1, z2)) {
                    NewOrderTitleContentKt.serializer(newOrderTitleUiModel, null, getpostalcode5, iIntValue5 & 14);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                OrderItemsNavigationUiModel orderItemsNavigationUiModel = (OrderItemsNavigationUiModel) obj;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                orderItemsNavigationUiModel.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((getPostalCode) getbirthdatefull6).read(orderItemsNavigationUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode6.write(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    int i11 = iIntValue6 & 14;
                    z2 = i11 == 4;
                    Object objComponentActivity2 = getpostalcode6.ComponentActivity();
                    if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(orderItemsNavigationUiModel);
                        getpostalcode6.write(objComponentActivity2);
                    }
                    OrderItemsNavigationKt.RemoteActionCompatParcelizer(orderItemsNavigationUiModel, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode6, i11);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                TagsUiModel tagsUiModel = (TagsUiModel) obj;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                tagsUiModel.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((getPostalCode) getbirthdatefull7).read(tagsUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode7.write(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    int i12 = serializer + 31;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    TagsContentKt.IconCompatParcelizer(((TagsUiModelImpl) tagsUiModel).write(), null, getpostalcode7, 0);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                EditingBufferCompanion editingBufferCompanion = (EditingBufferCompanion) obj;
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                editingBufferCompanion.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((getPostalCode) getbirthdatefull8).read(editingBufferCompanion) ? 4 : 2;
                }
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode8.write(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    int i14 = IconCompatParcelizer + 81;
                    serializer = i14 % Fields.SpotShadowColor;
                    ActionableMessageModalBottomSheetKt.ActionableMessageModalBottomSheet(editingBufferCompanion, null, getpostalcode8, i14 % 2 == 0 ? iIntValue8 & 46 : iIntValue8 & 14);
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                FreelancingAvailabilityUiModel freelancingAvailabilityUiModel = (FreelancingAvailabilityUiModel) obj;
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                freelancingAvailabilityUiModel.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((getPostalCode) getbirthdatefull9).read(freelancingAvailabilityUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode9.write(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    OpportunityInfoContentKt.serializer((getExtraData) ExtrasKt.write(((FreelancingAvailabilityUiModelImpl) freelancingAvailabilityUiModel).RatingCompat, getpostalcode9, 0).getValue(), null, getpostalcode9, 0);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 10:
                OutsideActiveAreaUiModel outsideActiveAreaUiModel = (OutsideActiveAreaUiModel) obj;
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                outsideActiveAreaUiModel.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((getPostalCode) getbirthdatefull10).read(outsideActiveAreaUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode10.write(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    OutsideActiveAreaKt.OutsideActiveArea(outsideActiveAreaUiModel, getpostalcode10, iIntValue10 & 14);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                WorkOpportunityTypeSelectorUiModel workOpportunityTypeSelectorUiModel = (WorkOpportunityTypeSelectorUiModel) obj;
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                workOpportunityTypeSelectorUiModel.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((getPostalCode) getbirthdatefull11).read(workOpportunityTypeSelectorUiModel) ? 4 : 2;
                }
                if ((iIntValue11 & 19) != 18) {
                    int i15 = IconCompatParcelizer + 45;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z2 = true;
                }
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode11.write(iIntValue11 & 1, z2)) {
                    WorkOpportunityTypeSelectorKt.WorkOpportunityTypeSelector(workOpportunityTypeSelectorUiModel, null, getpostalcode11, iIntValue11 & 14);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 12:
                EnableLocationUiModel enableLocationUiModel = (EnableLocationUiModel) obj;
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                enableLocationUiModel.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((getPostalCode) getbirthdatefull12).read(enableLocationUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode12.write(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    int i17 = serializer + 33;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    EnableLocationKt.EnableLocation(enableLocationUiModel, null, getpostalcode12, i17 % 2 != 0 ? iIntValue12 & 33 : iIntValue12 & 14);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                String str = (String) obj;
                Throwable th = (Throwable) obj2;
                ((Integer) obj3).intValue();
                str.getClass();
                if (th != null) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Failed to execute Perseus event print callback. ".concat(str), new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.getClass();
                }
                return createfromparcel;
            case 14:
                C0215z c0215z = (C0215z) obj;
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                c0215z.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((getPostalCode) getbirthdatefull13).read(c0215z) ? 4 : 2;
                }
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull13;
                if (getpostalcode13.write(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    z = (iIntValue13 & 14) == 4;
                    Object objComponentActivity3 = getpostalcode13.ComponentActivity();
                    if (z || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new RoomDatabase$closeBarrier$1(0, c0215z, C0215z.class, "onRecenterMapClicked", "onRecenterMapClicked()V", 0, 15);
                        getpostalcode13.write(objComponentActivity3);
                    }
                    V.IconCompatParcelizer(0, getpostalcode13, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3));
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 15:
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((eg) obj).getClass();
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull14;
                if (!getpostalcode14.write(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 16:
                NavigateViewUiModel navigateViewUiModel = (NavigateViewUiModel) obj;
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                navigateViewUiModel.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((getPostalCode) getbirthdatefull15).read(navigateViewUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull15;
                if (getpostalcode15.write(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    int i18 = iIntValue15 & 14;
                    z2 = i18 == 4;
                    Object objComponentActivity4 = getpostalcode15.ComponentActivity();
                    if (z2 || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new NafathModalContentKt$NafathModal$1$1(navigateViewUiModel);
                        getpostalcode15.write(objComponentActivity4);
                    }
                    NavigationInformationKt.NavigationInformation(navigateViewUiModel, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), null, getpostalcode15, i18);
                } else {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 17:
                OverlayVisibilityBannerUiModel overlayVisibilityBannerUiModel = (OverlayVisibilityBannerUiModel) obj;
                getBirthDateFull getbirthdatefull16 = (getBirthDateFull) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                overlayVisibilityBannerUiModel.getClass();
                if ((iIntValue16 & 6) == 0) {
                    if (((getPostalCode) getbirthdatefull16).read(overlayVisibilityBannerUiModel)) {
                        int i19 = IconCompatParcelizer + 57;
                        serializer = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        i = 4;
                    } else {
                        i = 2;
                    }
                    iIntValue16 |= i;
                }
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull16;
                if (getpostalcode16.write(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(((OverlayVisibilityBannerUiModelImpl) overlayVisibilityBannerUiModel).write(), getpostalcode16, 0);
                    Context context = (Context) getpostalcode16.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                    int i21 = iIntValue16 & 14;
                    boolean z3 = i21 == 4;
                    Object objComponentActivity5 = getpostalcode16.ComponentActivity();
                    if (z3 || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new TncContentKt$$ExternalSyntheticLambda2(6, overlayVisibilityBannerUiModel);
                        getpostalcode16.write(objComponentActivity5);
                    }
                    RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{overlayVisibilityBannerUiModel, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode16, Integer.valueOf(i21)}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
                    AsyncImagePreviewHandlerCompanionDefault1 asyncImagePreviewHandlerCompanionDefault1 = (AsyncImagePreviewHandlerCompanionDefault1) populateViewStructure_androidKtpopulate7Write.getValue();
                    z = i21 == 4;
                    boolean zIconCompatParcelizer = getpostalcode16.IconCompatParcelizer(context);
                    Object objComponentActivity6 = getpostalcode16.ComponentActivity();
                    if (!zIconCompatParcelizer && !z) {
                        int i22 = serializer + 53;
                        IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                        if (i22 % 2 != 0) {
                            throw null;
                        }
                        if (objComponentActivity6 == androidContentCaptureManager) {
                            objComponentActivity6 = new OtpNavigationKt$$ExternalSyntheticLambda4(overlayVisibilityBannerUiModel, 15, context);
                            getpostalcode16.write(objComponentActivity6);
                        }
                    } else {
                        objComponentActivity6 = new OtpNavigationKt$$ExternalSyntheticLambda4(overlayVisibilityBannerUiModel, 15, context);
                        getpostalcode16.write(objComponentActivity6);
                    }
                    OverlayVisibilityBannerKt.OverlayVisibilityBanner(asyncImagePreviewHandlerCompanionDefault1, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6, getpostalcode16, 0);
                } else {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 18:
                CashBlockUiModel cashBlockUiModel = (CashBlockUiModel) obj;
                getBirthDateFull getbirthdatefull17 = (getBirthDateFull) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                cashBlockUiModel.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= ((getPostalCode) getbirthdatefull17).read(cashBlockUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull17;
                if (getpostalcode17.write(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    CashBlockKt.CashBlock(cashBlockUiModel, getpostalcode17, iIntValue17 & 14);
                } else {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 19:
                FinishedShiftUiModel finishedShiftUiModel = (FinishedShiftUiModel) obj;
                getBirthDateFull getbirthdatefull18 = (getBirthDateFull) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                finishedShiftUiModel.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= ((getPostalCode) getbirthdatefull18).read(finishedShiftUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode18 = (getPostalCode) getbirthdatefull18;
                if (getpostalcode18.write(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    FinishedShiftKt.serializer(finishedShiftUiModel, null, getpostalcode18, iIntValue18 & 14);
                } else {
                    getpostalcode18.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 20:
                OnDemandOutsideActiveAreaUiModel onDemandOutsideActiveAreaUiModel = (OnDemandOutsideActiveAreaUiModel) obj;
                getBirthDateFull getbirthdatefull19 = (getBirthDateFull) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                onDemandOutsideActiveAreaUiModel.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= ((getPostalCode) getbirthdatefull19).read(onDemandOutsideActiveAreaUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode19 = (getPostalCode) getbirthdatefull19;
                if (getpostalcode19.write(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    OnDemandOutsideActiveAreaKt.OnDemandOutsideActiveArea(onDemandOutsideActiveAreaUiModel, getpostalcode19, iIntValue19 & 14);
                } else {
                    getpostalcode19.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 21:
                OnPauseUiModel onPauseUiModel = (OnPauseUiModel) obj;
                getBirthDateFull getbirthdatefull20 = (getBirthDateFull) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                onPauseUiModel.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= ((getPostalCode) getbirthdatefull20).read(onPauseUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode20 = (getPostalCode) getbirthdatefull20;
                if (getpostalcode20.write(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    OnPauseScreenKt.OnPauseScreen(onPauseUiModel, null, getpostalcode20, iIntValue20 & 14);
                } else {
                    getpostalcode20.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 22:
                QuestListUiModel questListUiModel = (QuestListUiModel) obj;
                getBirthDateFull getbirthdatefull21 = (getBirthDateFull) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                questListUiModel.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= ((getPostalCode) getbirthdatefull21).read(questListUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode21 = (getPostalCode) getbirthdatefull21;
                if (getpostalcode21.write(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    QuestListKt.QuestList(questListUiModel, null, getpostalcode21, iIntValue21 & 14);
                } else {
                    getpostalcode21.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 23:
                getBirthDateFull getbirthdatefull22 = (getBirthDateFull) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode22 = (getPostalCode) getbirthdatefull22;
                if (getpostalcode22.write(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_essentials_flag, getpostalcode22, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode22.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), getpostalcode22, Painter.$stable | 48, 4);
                } else {
                    getpostalcode22.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 24:
                getBirthDateFull getbirthdatefull23 = (getBirthDateFull) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode23 = (getPostalCode) getbirthdatefull23;
                if (getpostalcode23.write(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_essentials_flag, getpostalcode23, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode23.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), getpostalcode23, Painter.$stable | 48, 4);
                } else {
                    getpostalcode23.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                SuspensionUiModel suspensionUiModel = (SuspensionUiModel) obj;
                getBirthDateFull getbirthdatefull24 = (getBirthDateFull) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                suspensionUiModel.getClass();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= ((getPostalCode) getbirthdatefull24).read(suspensionUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode24 = (getPostalCode) getbirthdatefull24;
                if (getpostalcode24.write(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    SuspensionScreenKt.SuspensionScreen(suspensionUiModel, null, getpostalcode24, iIntValue24 & 14);
                } else {
                    getpostalcode24.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
        }
    }
}
