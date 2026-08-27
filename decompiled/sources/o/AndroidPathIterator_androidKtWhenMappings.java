package o;

import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopOptionKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureCommonKt;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogContentKt;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.ProductItemKt;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenDetailUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.compose.FullScreenDetailsContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.compose.AcknowledgmentContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose.CardCashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose.TransferChangeScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose.QrPaymentKt;
import com.roadrunner.freelancing.api.presentation.outsideactivearea.OutsideActiveAreaUiModel;
import com.roadrunner.freelancing.presentation.outsideactivearea.OutsideActiveAreaKt;
import com.roadrunner.heatmap.presentation.info.HeatmapInformationDialogKt;
import com.roadrunner.nafath.NafathModalContentKt;
import com.roadrunner.rider.state.cashblock.api.presentation.CashBlockUiModel;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt;
import com.roadrunner.rider.state.ondemand.api.outsideactivearea.OnDemandOutsideActiveAreaUiModel;
import com.roadrunner.rider.state.ondemand.outsideactivearea.OnDemandOutsideActiveAreaKt;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryColumnKt;
import org.bouncycastle.asn1.ASN1Util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidPathIterator_androidKtWhenMappings implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ AndroidPathIterator_androidKtWhenMappings(int i, fieldToDouble fieldtodouble) {
        this.write = 29;
        this.IconCompatParcelizer = i;
        this.read = fieldtodouble;
    }

    public /* synthetic */ AndroidPathIterator_androidKtWhenMappings(Object obj, int i, int i2) {
        this.write = i2;
        this.read = obj;
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x02de  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long presenter;
        String strValueOf;
        androidx.compose.ui.Modifier modifier;
        long j;
        androidx.compose.ui.text.font.FontWeight fontWeight;
        androidx.compose.ui.text.font.FontFamily fontFamily;
        long j2;
        androidx.compose.ui.text.style.TextAlign textAlign;
        long j3;
        int i;
        boolean z2;
        int i2;
        int i3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 123;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i7 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj3 = this.read;
        int i8 = this.IconCompatParcelizer;
        switch (i7) {
            case 0:
                ((Integer) obj2).getClass();
                ASN1Util.serializer((setPath) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 1:
                ((Integer) obj2).getClass();
                ((ArrangementHorizontal) obj3).write((getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 2:
                BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = (BasicTooltipKtanchorSemantics111) obj3;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    int i9 = serializer + 43;
                    RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(1 & iIntValue, z)) {
                    TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1Write = basicTooltipKtanchorSemantics111.read.serializer.write(i8);
                    ((AnchoredDraggableKtrestartable21) textFieldImplKtCommonDecorationBox3containerWithId1Write.write).RemoteActionCompatParcelizer.invoke(basicTooltipKtanchorSemantics111.IconCompatParcelizer, Integer.valueOf(i8 - textFieldImplKtCommonDecorationBox3containerWithId1Write.serializer), getpostalcode, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel2;
            case 3:
                GapComposerKtExternalSyntheticLambda0 gapComposerKtExternalSyntheticLambda0 = (GapComposerKtExternalSyntheticLambda0) obj3;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1Write2 = gapComposerKtExternalSyntheticLambda0.write.read().write(i8);
                    ((invokecomroadrunnerdeliveryonthewaycrowdsourcinggallerypresentationGalleryFragmentExternalSyntheticLambda1) textFieldImplKtCommonDecorationBox3containerWithId1Write2.write).serializer.invoke(ParcelableSnapshotMutableLongState.IconCompatParcelizer, Integer.valueOf(i8 - textFieldImplKtCommonDecorationBox3containerWithId1Write2.serializer), getpostalcode2, 0);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i10 = RemoteActionCompatParcelizer + 65;
                    serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
                return createfromparcel2;
            case 4:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.CoreTextFieldKt.IconCompatParcelizer((androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 5:
                ((Integer) obj2).getClass();
                ((androidx.compose.foundation.text.TextLinkScope) obj3).LinksComposables((getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 6:
                ((Integer) obj2).getClass();
                ((ZIndexElement) obj3).Content((getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 7:
                ((Integer) obj2).intValue();
                LastStopOptionKt.LastStopOption((LastStopOptionUiModelImpl) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 8:
                ((Integer) obj2).intValue();
                AutoAcceptOptionKt.AutoAcceptOption((getOffsetX) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 9:
                ((Integer) obj2).intValue();
                com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageKt.read((isNestedScrollingEnabled) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 10:
                ((Integer) obj2).getClass();
                EntrancePictureCommonKt.PicturesCounter((Integer) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 11:
                ((Integer) obj2).getClass();
                TimeChangedBlockingDialogContentKt.TimeChangedBlockingDialogTitleAndDescription((TextGeometricTransformCompanion) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 12:
                ((Integer) obj2).intValue();
                ProductItemKt.ProductItem((r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 13:
                ((Integer) obj2).intValue();
                ProductItemKt.ExtraItem((r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 14:
                ((Integer) obj2).intValue();
                FullScreenDetailsContentKt.RemoteActionCompatParcelizer((FullscreenDetailUi) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 15:
                ((Integer) obj2).intValue();
                FullScreenDetailsContentKt.write((r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 16:
                ((Integer) obj2).intValue();
                AcknowledgmentContentKt.Check((TransitionBasedSearchInfo) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 17:
                ((Integer) obj2).intValue();
                CardCashPaymentKt.Progress((getEnterjXw82LU) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 18:
                ((Integer) obj2).intValue();
                TransferChangeScreenKt.write((r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 19:
                ((Integer) obj2).getClass();
                UnsupportedComposeAnimation.read((mapTreeWithStitching) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 20:
                ((Integer) obj2).intValue();
                QrPaymentKt.RemoteActionCompatParcelizer((C0195provider) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 21:
                ((Integer) obj2).intValue();
                scroll.serializer((WrapPreviewlambda0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 22:
                ((Integer) obj2).intValue();
                OutsideActiveAreaKt.OutsideActiveArea((OutsideActiveAreaUiModel) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 23:
                ((Integer) obj2).intValue();
                HeatmapInformationDialogKt.HeatmapDemandInformation((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 24:
                ((Integer) obj2).intValue();
                NafathModalContentKt.NafathPendingContent((pf) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 25:
                ((Integer) obj2).intValue();
                CashBlockKt.CashBlock((CashBlockUiModel) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 26:
                ((Integer) obj2).intValue();
                OnDemandOutsideActiveAreaKt.OnDemandOutsideActiveArea((OnDemandOutsideActiveAreaUiModel) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            case 27:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3).invoke(str, str2, String.valueOf(i8));
                return createfromparcel2;
            case 28:
                ((Integer) obj2).intValue();
                NestRiderStateSummaryColumnKt.read((SdkClickHandler1) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i8 | 1));
                return createfromparcel2;
            default:
                fieldToDouble fieldtodouble = (fieldToDouble) obj3;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    androidx.compose.ui.text.TextStyle textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    if (jsonArrayToArray.RemoteActionCompatParcelizer[fieldtodouble.ordinal()] == 1) {
                        getpostalcode3.serializer(-295772663);
                        presenter = ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                        getpostalcode3.IconCompatParcelizer(false);
                    } else {
                        getpostalcode3.serializer(-295771734);
                        presenter = ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                        getpostalcode3.IconCompatParcelizer(false);
                    }
                    long j4 = presenter;
                    int i12 = RemoteActionCompatParcelizer + 31;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        strValueOf = String.valueOf(i8);
                        modifier = null;
                        j = 1;
                        fontWeight = null;
                        fontFamily = null;
                        j2 = 0;
                        textAlign = null;
                        j3 = 0;
                        i = 1;
                        z2 = false;
                        i2 = 1;
                        i3 = 1;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
                        i4 = 1;
                    } else {
                        strValueOf = String.valueOf(i8);
                        modifier = null;
                        j = 0;
                        fontWeight = null;
                        fontFamily = null;
                        j2 = 0;
                        textAlign = null;
                        j3 = 0;
                        i = 0;
                        z2 = false;
                        i2 = 0;
                        i3 = 0;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
                        i4 = 0;
                    }
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(strValueOf, modifier, j4, j, fontWeight, fontFamily, j2, textAlign, j3, i, z2, i2, i3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getpostalcode3, i4, 0, 131066);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel2;
        }
    }
}
