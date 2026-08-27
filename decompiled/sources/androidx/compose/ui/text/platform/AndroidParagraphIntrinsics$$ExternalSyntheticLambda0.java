package androidx.compose.ui.text.platform;

import android.content.Context;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionBottomSheetContentKt;
import com.roadrunner.delivery.ontheway.destinationdetails.api.DestinationDetailsUiModel;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.compose.DestinationDetailsKt;
import com.roadrunner.delivery.ontheway.header.api.DestinationHeaderUiModel;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModel;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.compose.TripInformationKt;
import com.roadrunner.delivery.pickupdropoff.api.PickUpDropOffUiModel;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffComposableFactoryImplKt;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl;
import com.roadrunner.delivery.stacked.delivery.list.api.StackedDeliveryListUiModel;
import com.roadrunner.delivery.stacked.delivery.list.compose.v1.StackedDeliveryListV1Kt;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.api.presentation.WorkNowUiModel;
import com.roadrunner.freelancing.presentation.WorkNowRowKt;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostKt;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import com.roadrunner.instant.shifts.presentation.InstantShiftsKt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel;
import com.roadrunner.rider.state.futureshift.api.presentation.FutureShiftUiModel;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkKt;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.rider.state.ondemand.bonus.compose.OnDemandWithBonusKt;
import com.roadrunner.rider.state.ondemand.presentation.compose.OnDemandKt;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import kotlin.ranges.RangesKt;
import o.AdjustInstance9;
import o.AdjustPreinstallReferrerReceiver;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1;
import o.DragAndDropTargetModifierNode;
import o.LocaleList;
import o.Path;
import o.ScrollingView;
import o.VelocityKt;
import o.accessgetContentOrLtrcp;
import o.accessisMainThread;
import o.accessisRenderNodeCompatiblecp;
import o.checkSdkClickResponseI;
import o.createFromParcel;
import o.getAppVersion;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getLifecycleRegistry;
import o.getNewPassword;
import o.getPostalCode;
import o.getPreviouseUduSuoannotations;
import o.getQueryContext;
import o.getStoreIdFromSystem;
import o.getZero9UxMQ8Mannotations;
import o.hideTranslatedText;
import o.logPushStoryPageClickedlambda11;
import o.minusAH228Gc;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.remadjELrA;
import o.sendAttributionRequest;
import o.setBrush_12SF9DMlambda0;
import o.setFlags;
import o.setStableInsets;
import o.t1ExternalSyntheticLambda1;
import o.t6;
import o.unaryMinus9UxMQ8M;
import o.xb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidParagraphIntrinsics$$ExternalSyntheticLambda0 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AndroidParagraphIntrinsics$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:345:0x0750  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        Object obj5;
        Object obj6;
        int i4;
        Object obj7;
        int i5;
        Object obj8;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        Object obj9;
        int i12;
        int i13 = 2;
        int i14 = 2 % 2;
        int i15 = this.$r8$classId;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj10 = this.f$0;
        int i16 = 26;
        int i17 = 12;
        Object obj11 = null;
        final int i18 = 1;
        switch (i15) {
            case 0:
                return AndroidParagraphIntrinsics._init_$lambda$0((AndroidParagraphIntrinsics) obj10, (FontFamily) obj, (FontWeight) obj2, (FontStyle) obj3, (FontSynthesis) obj4);
            case 1:
                CreateHomeScope createHomeScope = (CreateHomeScope) obj10;
                LastStopSelectionBottomSheetUiModel lastStopSelectionBottomSheetUiModel = (LastStopSelectionBottomSheetUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                lastStopSelectionBottomSheetUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
                if ((iIntValue & 6) == 0) {
                    i = (((getPostalCode) getbirthdatefull).read(lastStopSelectionBottomSheetUiModel) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= ((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(i & 1, (i & 147) != 146)) {
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    getQueryContext getquerycontext = ((LastStopSelectionBottomSheetUiModelImpl) lastStopSelectionBottomSheetUiModel).read();
                    boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(createHomeScope);
                    boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
                    boolean z2 = (i & 112) == 32;
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((zIconCompatParcelizer | zIconCompatParcelizer2 | z2) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(createHomeScope, fragmentActivityRemoteActionCompatParcelizer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i16);
                        getpostalcode.write(objComponentActivity);
                    }
                    SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
                    LastStopSelectionBottomSheetContentKt.read(lastStopSelectionBottomSheetUiModel, null, getpostalcode, i & 14);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                LocaleList localeList = (LocaleList) obj10;
                DestinationDetailsUiModel destinationDetailsUiModel = (DestinationDetailsUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                destinationDetailsUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    int i19 = write + 93;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    if (((getPostalCode) getbirthdatefull2).read(destinationDetailsUiModel)) {
                        int i21 = write + 63;
                        serializer = i21 % Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        i13 = 4;
                    }
                    i2 = i13 | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? 32 : 16;
                }
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(13, localeList.serializer), true, -173052724);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
                    Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(4, localeList.IconCompatParcelizer), true, 345396908);
                        getpostalcode2.write(objComponentActivity3);
                    }
                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity3;
                    Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(5, localeList.read), true, -1558732806);
                        getpostalcode2.write(objComponentActivity4);
                    }
                    DestinationDetailsKt.read(destinationDetailsUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity4, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, getpostalcode2, (i2 & 14) | 3504 | ((i2 << 9) & 57344));
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                setBrush_12SF9DMlambda0 setbrush_12sf9dmlambda0 = (setBrush_12SF9DMlambda0) obj10;
                DestinationHeaderUiModel destinationHeaderUiModel = (DestinationHeaderUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                destinationHeaderUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = iIntValue3 | (((getPostalCode) getbirthdatefull3).read(destinationHeaderUiModel) ? 4 : 2);
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4) ? 32 : 16;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(i3 & 1, !((i3 & 147) == 146))) {
                    Context context = (Context) getpostalcode3.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                    getPreviouseUduSuoannotations getpreviouseudusuoannotations = setbrush_12sf9dmlambda0.IconCompatParcelizer;
                    boolean zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(setbrush_12sf9dmlambda0);
                    boolean zIconCompatParcelizer4 = getpostalcode3.IconCompatParcelizer(context);
                    Object objComponentActivity5 = getpostalcode3.ComponentActivity();
                    if ((zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity5 == androidContentCaptureManager) {
                        obj5 = objComponentActivity5;
                        ViewUtils$$ExternalSyntheticLambda6 viewUtils$$ExternalSyntheticLambda6 = new ViewUtils$$ExternalSyntheticLambda6(setbrush_12sf9dmlambda0, 24, context);
                        getpostalcode3.write(viewUtils$$ExternalSyntheticLambda6);
                        obj5 = viewUtils$$ExternalSyntheticLambda6;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                    boolean zIconCompatParcelizer5 = getpostalcode3.IconCompatParcelizer(setbrush_12sf9dmlambda0);
                    boolean zIconCompatParcelizer6 = getpostalcode3.IconCompatParcelizer(context);
                    Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                    if (!zIconCompatParcelizer5 && !zIconCompatParcelizer6) {
                        int i23 = serializer + 107;
                        write = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        if (objComponentActivity6 == androidContentCaptureManager) {
                            obj6 = objComponentActivity6;
                            Path path = new Path(setbrush_12sf9dmlambda0, context, i18);
                            getpostalcode3.write(path);
                            obj6 = path;
                        }
                    } else {
                        obj6 = objComponentActivity6;
                        Path path2 = new Path(setbrush_12sf9dmlambda0, context, i18);
                        getpostalcode3.write(path2);
                        obj6 = path2;
                    }
                    obj6 = objComponentActivity6;
                    DestinationHeaderKt.DestinationHeader(destinationHeaderUiModel, getpreviouseudusuoannotations, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, setbrush_12sf9dmlambda0.write, null, getpostalcode3, (i3 & 14) | ((i3 << 3) & 896));
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 4:
                accessgetContentOrLtrcp accessgetcontentorltrcp = (accessgetContentOrLtrcp) obj10;
                TripInformationUiModel tripInformationUiModel = (TripInformationUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                tripInformationUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i4 = iIntValue4 | (((getPostalCode) getbirthdatefull4).read(tripInformationUiModel) ? 4 : 2);
                } else {
                    i4 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i4 |= ((getPostalCode) getbirthdatefull4).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5) ? 32 : 16;
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode4.write(i4 & 1, (i4 & 147) != 146)) {
                    int i25 = serializer + 11;
                    write = i25 % Fields.SpotShadowColor;
                    if (i25 % 2 != 0) {
                        Context context2 = (Context) getpostalcode4.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                        getpostalcode4.IconCompatParcelizer(accessgetcontentorltrcp);
                        getpostalcode4.IconCompatParcelizer(context2);
                        getpostalcode4.ComponentActivity();
                        obj11.hashCode();
                        throw null;
                    }
                    Context context3 = (Context) getpostalcode4.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean zIconCompatParcelizer7 = getpostalcode4.IconCompatParcelizer(accessgetcontentorltrcp);
                    boolean zIconCompatParcelizer8 = getpostalcode4.IconCompatParcelizer(context3);
                    Object objComponentActivity7 = getpostalcode4.ComponentActivity();
                    if ((zIconCompatParcelizer7 | zIconCompatParcelizer8) || objComponentActivity7 == androidContentCaptureManager) {
                        obj7 = objComponentActivity7;
                        ViewUtils$$ExternalSyntheticLambda6 viewUtils$$ExternalSyntheticLambda7 = new ViewUtils$$ExternalSyntheticLambda6(accessgetcontentorltrcp, 28, context3);
                        getpostalcode4.write(viewUtils$$ExternalSyntheticLambda7);
                        obj7 = viewUtils$$ExternalSyntheticLambda7;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
                    boolean zIconCompatParcelizer9 = getpostalcode4.IconCompatParcelizer(accessgetcontentorltrcp);
                    boolean zIconCompatParcelizer10 = getpostalcode4.IconCompatParcelizer(context3);
                    Object objComponentActivity8 = getpostalcode4.ComponentActivity();
                    Object obj12 = objComponentActivity8;
                    if ((zIconCompatParcelizer9 | zIconCompatParcelizer10) || objComponentActivity8 == androidContentCaptureManager) {
                        Path path3 = new Path(accessgetcontentorltrcp, context3, i13);
                        getpostalcode4.write(path3);
                        obj12 = path3;
                    }
                    TripInformationKt.TripInformation(tripInformationUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj12, accessgetcontentorltrcp.IconCompatParcelizer, null, getpostalcode4, i4 & 126);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                ComposeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1 composeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1 = (ComposeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1) obj10;
                PickUpDropOffUiModel pickUpDropOffUiModel = (PickUpDropOffUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                pickUpDropOffUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6.getClass();
                if ((iIntValue5 & 6) == 0) {
                    int i26 = write + 77;
                    serializer = i26 % Fields.SpotShadowColor;
                    if (i26 % 2 == 0) {
                        ((getPostalCode) getbirthdatefull5).read(pickUpDropOffUiModel);
                        obj11.hashCode();
                        throw null;
                    }
                    i5 = (((getPostalCode) getbirthdatefull5).read(pickUpDropOffUiModel) ? 4 : 2) | iIntValue5;
                } else {
                    i5 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    int i27 = serializer + 69;
                    write = i27 % Fields.SpotShadowColor;
                    if (i27 % 2 != 0) {
                        ((getPostalCode) getbirthdatefull5).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6);
                        obj11.hashCode();
                        throw null;
                    }
                    i5 |= ((getPostalCode) getbirthdatefull5).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6) ? 32 : 16;
                }
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
                if (getpostalcode5.write(i5 & 1, (i5 & 147) != 146)) {
                    PickUpDropOffUiModelImpl pickUpDropOffUiModelImpl = (PickUpDropOffUiModelImpl) pickUpDropOffUiModel;
                    int i28 = i5 & 112;
                    PickUpDropOffComposableFactoryImplKt.read((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) ExtrasKt.write(pickUpDropOffUiModelImpl.PlaybackStateCompat, getpostalcode5, 0).getValue(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6, composeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1.IconCompatParcelizer, composeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1.serializer, composeViewAdapterFakeActivityResultRegistryOwner1activityResultRegistry1.RemoteActionCompatParcelizer, getpostalcode5, i28);
                    int i29 = i5 & 14;
                    boolean z3 = i29 == 4;
                    Object objComponentActivity9 = getpostalcode5.ComponentActivity();
                    if (z3 || objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(27, pickUpDropOffUiModel);
                        getpostalcode5.write(objComponentActivity9);
                    }
                    RangesKt.RemoteActionCompatParcelizer(pickUpDropOffUiModel, (accessisRenderNodeCompatiblecp) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, getpostalcode5, i29, 2);
                    getQueryContext getquerycontext2 = pickUpDropOffUiModelImpl.read;
                    i18 = i28 != 32 ? 0 : 1;
                    Object objComponentActivity10 = getpostalcode5.ComponentActivity();
                    if (i18 != 0 || objComponentActivity10 == androidContentCaptureManager) {
                        objComponentActivity10 = new getLifecycleRegistry(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6, 0);
                        getpostalcode5.write(objComponentActivity10);
                    }
                    SQLite.write(getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10, getpostalcode5, 8);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                remadjELrA remadjelra = (remadjELrA) obj10;
                StackedDeliveryListUiModel stackedDeliveryListUiModel = (StackedDeliveryListUiModel) obj;
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                stackedDeliveryListUiModel.getClass();
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2).getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((getPostalCode) getbirthdatefull6).read(stackedDeliveryListUiModel) ? 4 : 2;
                }
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode6.write(iIntValue6 & 1, (iIntValue6 & 131) != 130)) {
                    VelocityKt velocityKt = (VelocityKt) ExtrasKt.write(((StackedDeliveryListUiModelImpl) stackedDeliveryListUiModel).serializer(), getpostalcode6, 0).getValue();
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer2 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode6.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    if (velocityKt instanceof getZero9UxMQ8Mannotations) {
                        getpostalcode6.serializer(-821693521);
                        getpostalcode6.IconCompatParcelizer(false);
                    } else {
                        if (!(velocityKt instanceof unaryMinus9UxMQ8M)) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode6, -821695244, false);
                        }
                        getpostalcode6.serializer(297402618);
                        unaryMinus9UxMQ8M unaryminus9uxmq8m = (unaryMinus9UxMQ8M) velocityKt;
                        boolean zIconCompatParcelizer11 = getpostalcode6.IconCompatParcelizer(remadjelra);
                        boolean zIconCompatParcelizer12 = getpostalcode6.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
                        Object objComponentActivity11 = getpostalcode6.ComponentActivity();
                        if (!(!(zIconCompatParcelizer11 | zIconCompatParcelizer12))) {
                            obj8 = objComponentActivity11;
                            minusAH228Gc minusah228gc = new minusAH228Gc(remadjelra, fragmentActivityRemoteActionCompatParcelizer2, 0);
                            getpostalcode6.write(minusah228gc);
                            obj8 = minusah228gc;
                        } else {
                            int i30 = write + 75;
                            serializer = i30 % Fields.SpotShadowColor;
                            int i31 = i30 % 2;
                            if (objComponentActivity11 == androidContentCaptureManager) {
                                obj8 = objComponentActivity11;
                                minusAH228Gc minusah228gc2 = new minusAH228Gc(remadjelra, fragmentActivityRemoteActionCompatParcelizer2, 0);
                                getpostalcode6.write(minusah228gc2);
                                obj8 = minusah228gc2;
                            }
                        }
                        obj8 = objComponentActivity11;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8;
                        boolean zIconCompatParcelizer13 = getpostalcode6.IconCompatParcelizer(remadjelra);
                        boolean zIconCompatParcelizer14 = getpostalcode6.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer2);
                        Object objComponentActivity12 = getpostalcode6.ComponentActivity();
                        Object obj13 = objComponentActivity12;
                        if ((zIconCompatParcelizer13 | zIconCompatParcelizer14) || objComponentActivity12 == androidContentCaptureManager) {
                            checkSdkClickResponseI checksdkclickresponsei = new checkSdkClickResponseI(remadjelra, fragmentActivityRemoteActionCompatParcelizer2, i18);
                            getpostalcode6.write(checksdkclickresponsei);
                            obj13 = checksdkclickresponsei;
                        }
                        StackedDeliveryListV1Kt.StackedDeliveryListV1(unaryminus9uxmq8m, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj13, null, getpostalcode6, 0);
                        getpostalcode6.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                ScrollingView scrollingView = (ScrollingView) obj10;
                WorkNowUiModel workNowUiModel = (WorkNowUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                workNowUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i6 = (((getPostalCode) getbirthdatefull7).read(workNowUiModel) ? 4 : 2) | iIntValue7;
                } else {
                    i6 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i6 |= ((getPostalCode) getbirthdatefull7).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7) ? 32 : 16;
                }
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode7.write(i6 & 1, (i6 & 147) != 146)) {
                    WorkNowRowKt.WorkNow(scrollingView.serializer, scrollingView.write, workNowUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7, null, getpostalcode7, (i6 << 6) & 8064);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                setStableInsets setstableinsets = (setStableInsets) obj10;
                WorkNowWithInfraBoostUiModel workNowWithInfraBoostUiModel = (WorkNowWithInfraBoostUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                workNowWithInfraBoostUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i7 = (((getPostalCode) getbirthdatefull8).read(workNowWithInfraBoostUiModel) ? 4 : 2) | iIntValue8;
                } else {
                    i7 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i7 |= ((getPostalCode) getbirthdatefull8).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8) ? 32 : 16;
                }
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode8.write(i7 & 1, (i7 & 147) != 146)) {
                    WorkNowWithInfraBoostKt.WorkNowWithInfraBoost(setstableinsets.RemoteActionCompatParcelizer, setstableinsets.write, setstableinsets.IconCompatParcelizer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8, workNowWithInfraBoostUiModel, setstableinsets.read, null, getpostalcode8, ((i7 << 6) & 7168) | ((i7 << 12) & 57344));
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                final setFlags setflags = (setFlags) obj10;
                InstantShiftsUiModel instantShiftsUiModel = (InstantShiftsUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                instantShiftsUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9.getClass();
                if ((iIntValue9 & 6) == 0) {
                    int i32 = write + 103;
                    serializer = i32 % Fields.SpotShadowColor;
                    int i33 = i32 % 2;
                    i8 = (((getPostalCode) getbirthdatefull9).read(instantShiftsUiModel) ? 4 : 2) | iIntValue9;
                } else {
                    i8 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i8 |= ((getPostalCode) getbirthdatefull9).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9) ? 32 : 16;
                }
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode9.write(i8 & 1, (i8 & 147) != 146)) {
                    boolean zIconCompatParcelizer15 = getpostalcode9.IconCompatParcelizer(setflags);
                    boolean z4 = (i8 & 112) == 32;
                    Object objComponentActivity13 = getpostalcode9.ComponentActivity();
                    if (!zIconCompatParcelizer15 && !z4) {
                        int i34 = write + 117;
                        serializer = i34 % Fields.SpotShadowColor;
                        int i35 = i34 % 2;
                        if (objComponentActivity13 == androidContentCaptureManager) {
                            objComponentActivity13 = new Recomposer$$ExternalSyntheticLambda4(setflags, i16, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9);
                            getpostalcode9.write(objComponentActivity13);
                        }
                    } else {
                        objComponentActivity13 = new Recomposer$$ExternalSyntheticLambda4(setflags, i16, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9);
                        getpostalcode9.write(objComponentActivity13);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity13;
                    boolean zIconCompatParcelizer16 = getpostalcode9.IconCompatParcelizer(setflags);
                    Object objComponentActivity14 = getpostalcode9.ComponentActivity();
                    if (zIconCompatParcelizer16 || objComponentActivity14 == androidContentCaptureManager) {
                        final int i36 = 0;
                        objComponentActivity14 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.unScrap
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj14) {
                                int i37 = 2 % 2;
                                int i38 = RemoteActionCompatParcelizer + 29;
                                read = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i38 % 2 == 0) {
                                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                    throw null;
                                }
                                int i39 = i36;
                                createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                                setFlags setflags2 = setflags;
                                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj14;
                                if (i39 != 0) {
                                    fragmentActivity.getClass();
                                    r8lambda93S_WWydVO4tgS0mQqqSoxDXifE r8lambda93s_wwydvo4tgs0mqqqsoxdxife = setflags2.RemoteActionCompatParcelizer;
                                    div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    r8lambda93s_wwydvo4tgs0mqqqsoxdxife.write(fragmentActivity, supportFragmentManager);
                                    return createfromparcel3;
                                }
                                fragmentActivity.getClass();
                                setflags2.write.getClass();
                                fragmentActivity.getSupportFragmentManager().write("book_shift_confirmation_flow_request_key");
                                int i40 = read + 73;
                                RemoteActionCompatParcelizer = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i40 % 2 == 0) {
                                    return createfromparcel3;
                                }
                                throw null;
                            }
                        };
                        getpostalcode9.write(objComponentActivity14);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity14;
                    boolean zIconCompatParcelizer17 = getpostalcode9.IconCompatParcelizer(setflags);
                    Object objComponentActivity15 = getpostalcode9.ComponentActivity();
                    if (zIconCompatParcelizer17 || objComponentActivity15 == androidContentCaptureManager) {
                        objComponentActivity15 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.unScrap
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj14) {
                                int i37 = 2 % 2;
                                int i38 = RemoteActionCompatParcelizer + 29;
                                read = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i38 % 2 == 0) {
                                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                    throw null;
                                }
                                int i39 = i18;
                                createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                                setFlags setflags2 = setflags;
                                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj14;
                                if (i39 != 0) {
                                    fragmentActivity.getClass();
                                    r8lambda93S_WWydVO4tgS0mQqqSoxDXifE r8lambda93s_wwydvo4tgs0mqqqsoxdxife = setflags2.RemoteActionCompatParcelizer;
                                    div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    r8lambda93s_wwydvo4tgs0mqqqsoxdxife.write(fragmentActivity, supportFragmentManager);
                                    return createfromparcel3;
                                }
                                fragmentActivity.getClass();
                                setflags2.write.getClass();
                                fragmentActivity.getSupportFragmentManager().write("book_shift_confirmation_flow_request_key");
                                int i40 = read + 73;
                                RemoteActionCompatParcelizer = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i40 % 2 == 0) {
                                    return createfromparcel3;
                                }
                                throw null;
                            }
                        };
                        getpostalcode9.write(objComponentActivity15);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity15;
                    boolean zIconCompatParcelizer18 = getpostalcode9.IconCompatParcelizer(setflags);
                    Object objComponentActivity16 = getpostalcode9.ComponentActivity();
                    if (zIconCompatParcelizer18 || objComponentActivity16 == androidContentCaptureManager) {
                        objComponentActivity16 = new Updater$$ExternalSyntheticLambda1(i17, setflags);
                        getpostalcode9.write(objComponentActivity16);
                    }
                    InstantShiftsKt.InstantShifts(instantShiftsUiModel, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity16, null, getpostalcode9, i8 & 14);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 10:
                AdjustInstance9 adjustInstance9 = (AdjustInstance9) obj10;
                FutureShiftUiModel futureShiftUiModel = (FutureShiftUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                futureShiftUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i9 = (((getPostalCode) getbirthdatefull10).read(futureShiftUiModel) ? 4 : 2) | iIntValue10;
                } else {
                    i9 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i9 |= ((getPostalCode) getbirthdatefull10).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10) ? 32 : 16;
                }
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode10.write(i9 & 1, (i9 & 147) != 146)) {
                    AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{t6.read().write(adjustInstance9.RemoteActionCompatParcelizer), t1ExternalSyntheticLambda1.serializer().write(adjustInstance9.write)}, ExtrasKt.write(-806165834, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0(adjustInstance9, futureShiftUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10, UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode10.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext())), 11), getpostalcode10), getpostalcode10, 56);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                AdjustPreinstallReferrerReceiver adjustPreinstallReferrerReceiver = (AdjustPreinstallReferrerReceiver) obj10;
                OfferToWorkUiModel offerToWorkUiModel = (OfferToWorkUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                offerToWorkUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11.getClass();
                if ((iIntValue11 & 6) == 0) {
                    i10 = iIntValue11 | (((getPostalCode) getbirthdatefull11).read(offerToWorkUiModel) ? 4 : 2);
                } else {
                    i10 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i10 |= ((getPostalCode) getbirthdatefull11).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11) ? 32 : 16;
                }
                if ((i10 & 147) != 146) {
                    int i37 = write + 65;
                    serializer = i37 % Fields.SpotShadowColor;
                    if (i37 % 2 == 0) {
                        int i38 = 25 / 0;
                    }
                    z = true;
                } else {
                    z = false;
                }
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode11.write(i10 & 1, z)) {
                    OfferToWorkKt.OfferToWork(offerToWorkUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11, adjustPreinstallReferrerReceiver.write, null, getpostalcode11, i10 & 126);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 12:
                sendAttributionRequest sendattributionrequest = (sendAttributionRequest) obj10;
                OnDemandWithBonusUiModel onDemandWithBonusUiModel = (OnDemandWithBonusUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                onDemandWithBonusUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i11 = (((getPostalCode) getbirthdatefull12).read(onDemandWithBonusUiModel) ? 4 : 2) | iIntValue12;
                } else {
                    i11 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i11 |= ((getPostalCode) getbirthdatefull12).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12) ? 32 : 16;
                }
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode12.write(i11 & 1, (i11 & 147) != 146)) {
                    FragmentActivity fragmentActivityRemoteActionCompatParcelizer3 = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode12.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11 = sendattributionrequest.read;
                    getStoreIdFromSystem getstoreidfromsystem = sendattributionrequest.serializer;
                    xb xbVar = sendattributionrequest.IconCompatParcelizer;
                    accessisMainThread accessismainthread = sendattributionrequest.write;
                    boolean zIconCompatParcelizer19 = getpostalcode12.IconCompatParcelizer(sendattributionrequest);
                    boolean zIconCompatParcelizer20 = getpostalcode12.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer3);
                    Object objComponentActivity17 = getpostalcode12.ComponentActivity();
                    if ((zIconCompatParcelizer19 | zIconCompatParcelizer20) || objComponentActivity17 == androidContentCaptureManager) {
                        obj9 = objComponentActivity17;
                        checkSdkClickResponseI checksdkclickresponsei2 = new checkSdkClickResponseI(sendattributionrequest, fragmentActivityRemoteActionCompatParcelizer3, 0);
                        getpostalcode12.write(checksdkclickresponsei2);
                        obj9 = checksdkclickresponsei2;
                    }
                    OnDemandWithBonusKt.OnDemandWithBonus(onDemandWithBonusUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj9, logpushstorypageclickedlambda11, xbVar, accessismainthread, getstoreidfromsystem, null, getpostalcode12, i11 & 126);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                getAppVersion getappversion = (getAppVersion) obj10;
                OnDemandUiModel onDemandUiModel = (OnDemandUiModel) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                onDemandUiModel.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13.getClass();
                if ((iIntValue13 & 6) == 0) {
                    i12 = (((getPostalCode) getbirthdatefull13).read(onDemandUiModel) ? 4 : 2) | iIntValue13;
                } else {
                    i12 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i12 |= ((getPostalCode) getbirthdatefull13).IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13) ? 32 : 16;
                }
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull13;
                if (getpostalcode13.write(i12 & 1, (i12 & 147) != 146)) {
                    OnDemandKt.OnDemand(onDemandUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13, getappversion.serializer, getappversion.IconCompatParcelizer, null, getpostalcode13, i12 & 126);
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                final logPushStoryPageClickedlambda11 logpushstorypageclickedlambda12 = (logPushStoryPageClickedlambda11) obj10;
                StartWorkingNavigationUiModelImpl startWorkingNavigationUiModelImpl = (StartWorkingNavigationUiModelImpl) obj;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                int iIntValue14 = ((Integer) obj4).intValue();
                startWorkingNavigationUiModelImpl.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14.getClass();
                getPostalCode getpostalcode14 = (getPostalCode) ((getBirthDateFull) obj3);
                boolean z5 = getpostalcode14.read(logpushstorypageclickedlambda12);
                Object objComponentActivity18 = getpostalcode14.ComponentActivity();
                if (z5 || objComponentActivity18 == androidContentCaptureManager) {
                    final int i39 = 0;
                    objComponentActivity18 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.logPushStoryPageClickedlambda0
                        private static int serializer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj14, Object obj15) {
                            int i40 = 2 % 2;
                            int i41 = serializer + 123;
                            write = i41 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i41 % 2 == 0) {
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                Object obj16 = null;
                                obj16.hashCode();
                                throw null;
                            }
                            int i42 = i39;
                            createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                            logPushStoryPageClickedlambda11 logpushstorypageclickedlambda13 = logpushstorypageclickedlambda12;
                            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj14;
                            if (i42 != 0) {
                                EquipmentBottomSheetParams equipmentBottomSheetParams = (EquipmentBottomSheetParams) obj15;
                                fragmentActivity.getClass();
                                equipmentBottomSheetParams.getClass();
                                accessisMainThread accessismainthread2 = logpushstorypageclickedlambda13.RemoteActionCompatParcelizer;
                                div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                accessismainthread2.getClass();
                                MotionEventAdapterIndirectPointerEventData.read("START_WORKING_REQUEST_KEY", equipmentBottomSheetParams).RemoteActionCompatParcelizer(supportFragmentManager, "com.roadrunner.startworking.equipment.EquipmentBottomSheet");
                                return createfromparcel3;
                            }
                            StartWorkingNavAction startWorkingNavAction = (StartWorkingNavAction) obj15;
                            fragmentActivity.getClass();
                            startWorkingNavAction.getClass();
                            logpushstorypageclickedlambda13.write.getClass();
                            drawInto.RemoteActionCompatParcelizer(startWorkingNavAction).RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment");
                            int i43 = serializer + 91;
                            write = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i44 = i43 % 2;
                            return createfromparcel3;
                        }
                    };
                    getpostalcode14.write(objComponentActivity18);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity18;
                boolean z6 = getpostalcode14.read(logpushstorypageclickedlambda12);
                Object objComponentActivity19 = getpostalcode14.ComponentActivity();
                if (z6 || objComponentActivity19 == androidContentCaptureManager) {
                    final int i40 = 1;
                    objComponentActivity19 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.logPushStoryPageClickedlambda0
                        private static int serializer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj14, Object obj15) {
                            int i41 = 2 % 2;
                            int i42 = serializer + 123;
                            write = i42 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i42 % 2 == 0) {
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                Object obj16 = null;
                                obj16.hashCode();
                                throw null;
                            }
                            int i43 = i40;
                            createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                            logPushStoryPageClickedlambda11 logpushstorypageclickedlambda13 = logpushstorypageclickedlambda12;
                            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj14;
                            if (i43 != 0) {
                                EquipmentBottomSheetParams equipmentBottomSheetParams = (EquipmentBottomSheetParams) obj15;
                                fragmentActivity.getClass();
                                equipmentBottomSheetParams.getClass();
                                accessisMainThread accessismainthread2 = logpushstorypageclickedlambda13.RemoteActionCompatParcelizer;
                                div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                accessismainthread2.getClass();
                                MotionEventAdapterIndirectPointerEventData.read("START_WORKING_REQUEST_KEY", equipmentBottomSheetParams).RemoteActionCompatParcelizer(supportFragmentManager, "com.roadrunner.startworking.equipment.EquipmentBottomSheet");
                                return createfromparcel3;
                            }
                            StartWorkingNavAction startWorkingNavAction = (StartWorkingNavAction) obj15;
                            fragmentActivity.getClass();
                            startWorkingNavAction.getClass();
                            logpushstorypageclickedlambda13.write.getClass();
                            drawInto.RemoteActionCompatParcelizer(startWorkingNavAction).RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment");
                            int i44 = serializer + 91;
                            write = i44 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i45 = i44 % 2;
                            return createfromparcel3;
                        }
                    };
                    getpostalcode14.write(objComponentActivity19);
                }
                RangesKt.IconCompatParcelizer(startWorkingNavigationUiModelImpl, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity19, getpostalcode14, (iIntValue14 & 14) | ((iIntValue14 << 3) & 896));
                return createfromparcel;
        }
    }
}
