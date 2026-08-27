package androidx.room;

import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.transition.TransitionValuesMaps;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.models.FeatureFlag;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firestore.v1.Value;
import com.google.re2j.Parser;
import com.logistics.rider.glovo.R;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRoutesParser;
import com.mapbox.navigation.core.internal.congestions.model.CongestionSeverityType;
import com.mapbox.navigation.core.internal.congestions.processor.IncreaseTrafficUpdateActionHandler;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.internal.bindgen.SearchEngine;
import com.mapbox.search.internal.bindgen.UserRecordsLayer;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.custom.password.api.CustomPasswordLaunchData;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.freelancing.api.bonus.WorkNowWithBonusUiModel;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.login.presentation.signin.SignInViewModel$onSignInClicked$1;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.bonus.OnDemandWithBonusUiModelImpl;
import com.roadrunner.rider.state.searchshifts.api.presentation.SearchShiftsWithBonusUiModel;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusUiModelImpl;
import com.roadrunner.settings.SettingsViewModel;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import o.AdjustSessionSuccess;
import o.BrazeLogger;
import o.FontEj4NQ78default;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.PointerInteropFilterDispatchToViewState;
import o.QueryResultDefaultImpls;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.SemanticsPropertyKey;
import o.ShortNewsContentCardView;
import o.TextInputServiceAndroid_androidKt;
import o.TextInputServiceAndroidstopInput1;
import o.accessgetLOREM_IPSUM_SOURCEp;
import o.afterCommit;
import o.buildInstallReferrerSdkClickPackage;
import o.checkArithmeticNB67dxo;
import o.createFromParcel;
import o.d4ExternalSyntheticLambda2;
import o.decode;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getHasFixedWidthimpl;
import o.getIsTraversalGroup;
import o.getNoopState;
import o.getOffsetFromRectListForBjo55l4;
import o.getPayloadFromContentProviderDefault;
import o.getQueryContext;
import o.getTransaction;
import o.hasAllLocationsBeenRead;
import o.hideCurrentlyDisplayingInAppMessage;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.instantiateApplication;
import o.notifyItemChanged;
import o.offsetChildrenVertical;
import o.onBackPressed;
import o.onFailedToRecycleView;
import o.onItemDismiss;
import o.outerToInnerOffsetBjo55l4;
import o.r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U;
import o.r8lambdaC4x3_FR1RkvLSmBNZ_wkqomQW5Y;
import o.r8lambdaFeqavdgLqmQOJLvrFaEJOa9xxTc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ;
import o.removeNodeAtDepth;
import o.setAllowUrlStrategyFallback;
import o.setHttpsURLConnectionProvider;
import o.setMergingSemanticsOfDescendants;
import o.setSpan;
import o.setTextCompositionRangepsREZIo;
import o.subscribeToBannersDismissedEventandroid_sdk_base_release;
import o.toBitmapConfig1JJdX4A;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoomDatabase$createConnectionManager$2 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(SearchShiftsWithBonusUiModel searchShiftsWithBonusUiModel, int i) {
        super(2, 0, SearchShiftsWithBonusUiModel.class, searchShiftsWithBonusUiModel, "onCalendarButtonClicked", "onCalendarButtonClicked(ILjava/lang/String;)V");
        this.serializer = i;
        if (i != 28) {
        } else {
            super(2, 0, SearchShiftsWithBonusUiModel.class, searchShiftsWithBonusUiModel, "onBookSwipe", "onBookSwipe(Ljava/lang/String;Ljava/lang/String;)V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(int i, Object obj) {
        super(2, 0, setSpan.class, obj, "shouldNotFetchRoutes", "shouldNotFetchRoutes(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Z");
        this.serializer = i;
        if (i != 21) {
        } else {
            super(2, 0, outerToInnerOffsetBjo55l4.class, obj, "launchCustomPassword", "launchCustomPassword(Ljava/lang/String;Lcom/roadrunner/custom/password/api/CustomPasswordInvocationSite;)V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(RoomDatabase roomDatabase) {
        super(2, 1, LazyKt__LazyJVMKt.class, roomDatabase, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.serializer = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(LivenessDetectionActivity livenessDetectionActivity) {
        super(2, 0, LivenessDetectionActivity.class, livenessDetectionActivity, "navigateToFailScreen", "navigateToFailScreen(Lcom/roadrunner/liveness/api/analytics/LivenessFailureReason;Lcom/roadrunner/liveness/analytics/LivenessInvocationSite;)V");
        this.serializer = 18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(afterCommit aftercommit, int i) {
        super(2, 0, afterCommit.class, aftercommit, "setData", "setData(Ljava/lang/String;Ljava/lang/Object;)V");
        this.serializer = i;
        if (i != 8) {
        } else {
            super(2, 0, afterCommit.class, aftercommit, "setData", "setData(Ljava/lang/String;Ljava/lang/Object;)V");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(getTransaction gettransaction) {
        super(2, 0, getTransaction.class, gettransaction, "setData", "setData(Ljava/lang/String;Ljava/lang/Object;)V");
        this.serializer = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$createConnectionManager$2(LoginActivityViewModel loginActivityViewModel) {
        super(2, 0, LoginActivityViewModel.class, loginActivityViewModel, "continueLoginProcessAfterTwoFa", "continueLoginProcessAfterTwoFa(Ljava/lang/String;Lcom/roadrunner/auth/api/model/SignInState;)V");
        this.serializer = 22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomDatabase$createConnectionManager$2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.serializer = i3;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0325  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int iMin;
        int iMin2;
        hasAllLocationsBeenRead hasalllocationsbeenread;
        Integer num;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        z = false;
        z = false;
        boolean z = false;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i2) {
            case 0:
                return Options.Companion.RemoteActionCompatParcelizer((RoomDatabase) this.MediaMetadataCompat, (ShortNewsContentCardView) obj2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
            case 1:
                return Integer.valueOf(NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer((Value) obj, (Value) obj2));
            case 2:
                Integer num2 = (Integer) obj;
                int iIntValue = ((Number) obj2).intValue();
                TransitionValuesMaps transitionValuesMaps = ((IncreaseTrafficUpdateActionHandler) this.MediaMetadataCompat).congestionRangeGroup;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                CongestionSeverityType congestionSeverityTypeFromCongestionValue$navigation_release = transitionValuesMaps.fromCongestionValue$navigation_release(iIntValue2);
                CongestionSeverityType congestionSeverityTypeFromCongestionValue$navigation_release2 = transitionValuesMaps.fromCongestionValue$navigation_release(iIntValue);
                if (congestionSeverityTypeFromCongestionValue$navigation_release == congestionSeverityTypeFromCongestionValue$navigation_release2) {
                    iMin = iIntValue;
                } else if (congestionSeverityTypeFromCongestionValue$navigation_release2.compareTo(congestionSeverityTypeFromCongestionValue$navigation_release) < 0) {
                    iMin = iIntValue2;
                } else if (congestionSeverityTypeFromCongestionValue$navigation_release2.compareTo(congestionSeverityTypeFromCongestionValue$navigation_release) > 0) {
                    CongestionSeverityType.Companion companion = CongestionSeverityType.Companion;
                    int weight = congestionSeverityTypeFromCongestionValue$navigation_release.getWeight();
                    companion.getClass();
                    iMin = Math.min(iIntValue, transitionValuesMaps.fromCongestionSeverityType(CongestionSeverityType.Companion.fromWeightValue(weight + 1)).write);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("this can't happen as the branch above is always true");
                    return null;
                }
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(iMin, iIntValue, "near congestion: ", " because expected is ", " and current is ");
                    sbM.append(iIntValue2);
                    LoggerProviderKt.logD(sbM.toString(), "IncreaseTraffic");
                }
                return Integer.valueOf(iMin);
            case 3:
                Integer num3 = (Integer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                TransitionValuesMaps transitionValuesMaps2 = ((IncreaseTrafficUpdateActionHandler) this.MediaMetadataCompat).congestionRangeGroup;
                int iIntValue4 = num3 != null ? num3.intValue() : 0;
                CongestionSeverityType congestionSeverityTypeFromCongestionValue$navigation_release3 = transitionValuesMaps2.fromCongestionValue$navigation_release(iIntValue4);
                CongestionSeverityType.Companion companion2 = CongestionSeverityType.Companion;
                int weight2 = transitionValuesMaps2.fromCongestionValue$navigation_release(iIntValue3).getWeight();
                companion2.getClass();
                CongestionSeverityType congestionSeverityTypeFromWeightValue = CongestionSeverityType.Companion.fromWeightValue(weight2 - 1);
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7FromCongestionSeverityType = transitionValuesMaps2.fromCongestionSeverityType(congestionSeverityTypeFromWeightValue);
                if (congestionSeverityTypeFromCongestionValue$navigation_release3 == congestionSeverityTypeFromWeightValue) {
                    ensuresubscribedtoinappmessageeventslambda7FromCongestionSeverityType.getClass();
                    if (ensuresubscribedtoinappmessageeventslambda7FromCongestionSeverityType.write()) {
                        throw new NoSuchElementException("Progression " + ensuresubscribedtoinappmessageeventslambda7FromCongestionSeverityType + " is empty.");
                    }
                    int i4 = write + 87;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        iMin2 = ensuresubscribedtoinappmessageeventslambda7FromCongestionSeverityType.write;
                    } else {
                        int i5 = ensuresubscribedtoinappmessageeventslambda7FromCongestionSeverityType.write;
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                } else if (congestionSeverityTypeFromWeightValue.compareTo(congestionSeverityTypeFromCongestionValue$navigation_release3) < 0) {
                    iMin2 = iIntValue4;
                } else if (congestionSeverityTypeFromWeightValue.compareTo(congestionSeverityTypeFromCongestionValue$navigation_release3) > 0) {
                    iMin2 = Math.min(iIntValue3, transitionValuesMaps2.fromCongestionSeverityType(CongestionSeverityType.Companion.fromWeightValue(congestionSeverityTypeFromCongestionValue$navigation_release3.getWeight() + 1)).write);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("this can't happen as the branch above is always true");
                    return null;
                }
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                    int i6 = RemoteActionCompatParcelizer + 59;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    StringBuilder sbM2 = m1$$ExternalSyntheticOutline0.m(iMin2, iIntValue3, "far congestion: ", " because expected for near is ", " and current is ");
                    sbM2.append(iIntValue4);
                    LoggerProviderKt.logD(sbM2.toString(), "IncreaseTraffic");
                }
                return Integer.valueOf(iMin2);
            case 4:
                Object objMo4782parseDirectionsResponsegIAlus = ((NavigationRoutesParser) this.MediaMetadataCompat).mo4782parseDirectionsResponsegIAlus((ResponseToParse) obj, (ShortNewsContentCardView) obj2);
                return objMo4782parseDirectionsResponsegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo4782parseDirectionsResponsegIAlus : new onItemDismiss(objMo4782parseDirectionsResponsegIAlus);
            case 5:
                String str = (String) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                str.getClass();
                ((setMergingSemanticsOfDescendants) this.MediaMetadataCompat).getClass();
                UserRecordsLayer userRecordsLayerCreateUserLayer = SearchEngine.createUserLayer(str, iIntValue5);
                userRecordsLayerCreateUserLayer.getClass();
                return userRecordsLayerCreateUserLayer;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                obj2.getClass();
                afterCommit aftercommit = (afterCommit) this.MediaMetadataCompat;
                aftercommit.getClass();
                aftercommit.read.read(obj2, str2);
                return createfromparcel;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                obj2.getClass();
                getTransaction gettransaction = (getTransaction) this.MediaMetadataCompat;
                gettransaction.getClass();
                gettransaction.serializer.read(obj2, str3);
                return createfromparcel;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                obj2.getClass();
                afterCommit aftercommit2 = (afterCommit) this.MediaMetadataCompat;
                aftercommit2.getClass();
                aftercommit2.read.read(obj2, str4);
                return createfromparcel;
            case 9:
                String str5 = (String) obj;
                str5.getClass();
                obj2.getClass();
                getTransaction gettransaction2 = (getTransaction) this.MediaMetadataCompat;
                gettransaction2.getClass();
                gettransaction2.serializer.read(obj2, str5);
                return createfromparcel;
            case 10:
                String str6 = (String) obj;
                String str7 = (String) obj2;
                str6.getClass();
                str7.getClass();
                DeliveryNotesUiModelImpl deliveryNotesUiModelImpl = (DeliveryNotesUiModelImpl) ((DeliveryNotesUiModel) this.MediaMetadataCompat);
                getQueryContext getquerycontext = deliveryNotesUiModelImpl.write;
                Parser.Pair pair = deliveryNotesUiModelImpl.RemoteActionCompatParcelizer;
                ((decode) pair.RemoteActionCompatParcelizer).logEvent("deliveries_note_translation_click", ((FontEj4NQ78default) pair.write).write());
                PointerInteropFilterDispatchToViewState pointerInteropFilterDispatchToViewStateSerializer = deliveryNotesUiModelImpl.read.serializer(str7);
                if (pointerInteropFilterDispatchToViewStateSerializer instanceof r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ) {
                    getquerycontext.serializer(new TextInputServiceAndroid_androidKt(((r8lambdahZGhA0UmhfiIXsIUlX7d0MFuDJQ) pointerInteropFilterDispatchToViewStateSerializer).write));
                    return createfromparcel;
                }
                if (pointerInteropFilterDispatchToViewStateSerializer instanceof r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0) {
                    getquerycontext.serializer(new TextInputServiceAndroidstopInput1(((r8lambdaYAM2cpr9V1_3EfhFf4ccLsLAnN0) pointerInteropFilterDispatchToViewStateSerializer).read, str6));
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 11:
                r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) obj;
                r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k2 = (r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) obj2;
                if (((setSpan) this.MediaMetadataCompat).serializer) {
                    int i8 = write + 23;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaerwhggzq_gqgn8cultnvrcshm8k, r8lambdaerwhggzq_gqgn8cultnvrcshm8k2}, getCieXyz.write())).booleanValue();
                        int i9 = 24 / 0;
                        if (zBooleanValue) {
                            int i10 = RemoteActionCompatParcelizer + 111;
                            write = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            z = true;
                        }
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaerwhggzq_gqgn8cultnvrcshm8k, r8lambdaerwhggzq_gqgn8cultnvrcshm8k2}, getCieXyz.write())).booleanValue()) {
                            int i12 = RemoteActionCompatParcelizer + 111;
                            write = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                String str8 = (String) obj;
                String str9 = (String) obj2;
                str8.getClass();
                str9.getClass();
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cashPaymentTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl.serializer, null, null, new SignInDataStore$set$2(cashPaymentTaskUiModelImpl, str8, str9, null, 29), 3);
                return createfromparcel;
            case 13:
                String str10 = (String) obj;
                getNoopState getnoopstate = (getNoopState) obj2;
                str10.getClass();
                getnoopstate.getClass();
                CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = (CustomerUnavailableViewModelV2) this.MediaMetadataCompat;
                customerUnavailableViewModelV2.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(customerUnavailableViewModelV2), null, null, new NafathTimerDataStore$set$2(getnoopstate, customerUnavailableViewModelV2, str10, null, 1), 3);
                return createfromparcel;
            case 14:
                accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) obj;
                getHasFixedWidthimpl gethasfixedwidthimpl = (getHasFixedWidthimpl) obj2;
                accessgetlorem_ipsum_sourcep.getClass();
                gethasfixedwidthimpl.getClass();
                TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) this.MediaMetadataCompat;
                takePictureTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(takePictureTaskUiModelImpl.write, null, null, new ReconnectScheduler$schedule$1(accessgetlorem_ipsum_sourcep, takePictureTaskUiModelImpl, gethasfixedwidthimpl, null, 7), 3);
                return createfromparcel;
            case 15:
                TapToPayTaskUiItem$PaymentType tapToPayTaskUiItem$PaymentType = (TapToPayTaskUiItem$PaymentType) obj2;
                ((String) obj).getClass();
                tapToPayTaskUiItem$PaymentType.getClass();
                checkArithmeticNB67dxo checkarithmeticnb67dxo = (checkArithmeticNB67dxo) this.MediaMetadataCompat;
                checkarithmeticnb67dxo.getClass();
                BuildersKt.RemoteActionCompatParcelizer(checkarithmeticnb67dxo.RemoteActionCompatParcelizer, null, null, new PushEventPublisherImpl$emit$1(checkarithmeticnb67dxo, tapToPayTaskUiItem$PaymentType, shortNewsContentCardView, i3), 3);
                return createfromparcel;
            case 16:
                String str11 = (String) obj;
                String str12 = (String) obj2;
                str11.getClass();
                str12.getClass();
                WorkNowWithBonusUiModelImpl workNowWithBonusUiModelImpl = (WorkNowWithBonusUiModelImpl) ((WorkNowWithBonusUiModel) this.MediaMetadataCompat);
                workNowWithBonusUiModelImpl.getClass();
                workNowWithBonusUiModelImpl.serializer.serializer(new instantiateApplication(Integer.parseInt(str11), str12));
                return createfromparcel;
            case 17:
                ((notifyItemChanged) obj2).getClass();
                offsetChildrenVertical offsetchildrenvertical = (offsetChildrenVertical) this.MediaMetadataCompat;
                offsetchildrenvertical.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Throwable) obj, "Couldn't show RiderWrapped lottie Animation", new Object[0]);
                offsetchildrenvertical.MediaMetadataCompat.serializer(onFailedToRecycleView.write);
                return createfromparcel;
            case 18:
                RoomDatabaseperformClear11 roomDatabaseperformClear11 = (RoomDatabaseperformClear11) obj;
                RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2 = (RoomDatabaseExternalSyntheticLambda2) obj2;
                roomDatabaseperformClear11.getClass();
                roomDatabaseExternalSyntheticLambda2.getClass();
                LivenessDetectionActivity.read((LivenessDetectionActivity) this.MediaMetadataCompat, roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2);
                return createfromparcel;
            case 19:
                String str13 = (String) obj;
                str13.getClass();
                obj2.getClass();
                getTransaction gettransaction3 = (getTransaction) this.MediaMetadataCompat;
                gettransaction3.getClass();
                gettransaction3.serializer.read(obj2, str13);
                return createfromparcel;
            case 20:
                String str14 = (String) obj;
                str14.getClass();
                obj2.getClass();
                afterCommit aftercommit3 = (afterCommit) this.MediaMetadataCompat;
                aftercommit3.getClass();
                aftercommit3.read.read(obj2, str14);
                return createfromparcel;
            case 21:
                String str15 = (String) obj;
                insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy = (insertOrUpdateTransformedNodeSubhierarchy) obj2;
                insertorupdatetransformednodesubhierarchy.getClass();
                getOffsetFromRectListForBjo55l4 getoffsetfromrectlistforbjo55l4 = (getOffsetFromRectListForBjo55l4) ((outerToInnerOffsetBjo55l4) this.MediaMetadataCompat);
                getoffsetfromrectlistforbjo55l4.getClass();
                onBackPressed onbackpressed = getoffsetfromrectlistforbjo55l4.IconCompatParcelizer;
                if (onbackpressed != null) {
                    onbackpressed.write(new CustomPasswordLaunchData(str15, insertorupdatetransformednodesubhierarchy));
                    return createfromparcel;
                }
                removeNodeAtDepth.serializer("activityResultLauncher");
                throw null;
            case 22:
                String str16 = (String) obj;
                getIsTraversalGroup getistraversalgroup = (getIsTraversalGroup) obj2;
                str16.getClass();
                getistraversalgroup.getClass();
                ((LoginActivityViewModel) this.MediaMetadataCompat).read(str16, getistraversalgroup);
                return createfromparcel;
            case 23:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                SignInViewModel signInViewModel = (SignInViewModel) this.MediaMetadataCompat;
                BrazeLogger brazeLogger = signInViewModel.PlaybackStateCompatCustomAction;
                QueryResultDefaultImpls queryResultDefaultImpls = ((d4ExternalSyntheticLambda2) brazeLogger.write()).MediaSessionCompatQueueItem;
                if (queryResultDefaultImpls != null) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(signInViewModel), null, null, new SignInViewModel$onSignInClicked$1(hideCurrentlyDisplayingInAppMessage.read(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(queryResultDefaultImpls.write.write()).toString()).toString(), ((d4ExternalSyntheticLambda2) brazeLogger.write()).MediaDescriptionCompat.write(), signInViewModel, zBooleanValue2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null), 3);
                }
                return createfromparcel;
            case 24:
                ((setHttpsURLConnectionProvider) this.MediaMetadataCompat).RemoteActionCompatParcelizer.serializer(new setAllowUrlStrategyFallback(((Number) obj).intValue(), (String) obj2));
                return createfromparcel;
            case 25:
                int iIntValue6 = ((Number) obj).intValue();
                String str17 = (String) obj2;
                str17.getClass();
                OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl = (OnDemandWithBonusUiModelImpl) ((OnDemandWithBonusUiModel) this.MediaMetadataCompat);
                onDemandWithBonusUiModelImpl.getClass();
                onDemandWithBonusUiModelImpl.RemoteActionCompatParcelizer.serializer(new AdjustSessionSuccess(iIntValue6, str17));
                return createfromparcel;
            case 26:
                String str18 = (String) obj;
                String str19 = (String) obj2;
                str18.getClass();
                str19.getClass();
                buildInstallReferrerSdkClickPackage buildinstallreferrersdkclickpackage = (buildInstallReferrerSdkClickPackage) this.MediaMetadataCompat;
                buildinstallreferrersdkclickpackage.getClass();
                ff$$ExternalSyntheticOutline0.m("quest_status", str19, buildinstallreferrersdkclickpackage.MediaMetadataCompat.serializer, "quest_banner_clicked");
                buildinstallreferrersdkclickpackage.RemoteActionCompatParcelizer.read(Uri.parse(str18));
                return createfromparcel;
            case 27:
                int iIntValue7 = ((Number) obj).intValue();
                String str20 = (String) obj2;
                str20.getClass();
                SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl = (SearchShiftsWithBonusUiModelImpl) ((SearchShiftsWithBonusUiModel) this.MediaMetadataCompat);
                searchShiftsWithBonusUiModelImpl.getClass();
                searchShiftsWithBonusUiModelImpl.write.serializer(new getPayloadFromContentProviderDefault(iIntValue7, str20));
                return createfromparcel;
            case 28:
                String str21 = (String) obj;
                String str22 = (String) obj2;
                str21.getClass();
                str22.getClass();
                SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl2 = (SearchShiftsWithBonusUiModelImpl) ((SearchShiftsWithBonusUiModel) this.MediaMetadataCompat);
                searchShiftsWithBonusUiModelImpl2.getClass();
                Object obj3 = searchShiftsWithBonusUiModelImpl2.PlaybackStateCompatCustomAction.read();
                if (obj3 instanceof hasAllLocationsBeenRead) {
                    int i14 = RemoteActionCompatParcelizer + 51;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        hasalllocationsbeenread = (hasAllLocationsBeenRead) obj3;
                    } else {
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                } else {
                    hasalllocationsbeenread = null;
                }
                if (hasalllocationsbeenread != null && (num = hasalllocationsbeenread.read) != null) {
                    BuildersKt.RemoteActionCompatParcelizer(searchShiftsWithBonusUiModelImpl2.read, null, null, new MapboxTripSession$updateLegIndex$1(searchShiftsWithBonusUiModelImpl2, num.intValue(), hasalllocationsbeenread, str21, str22, null), 3);
                    int i15 = RemoteActionCompatParcelizer + 107;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                return createfromparcel;
            default:
                r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u = (r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue3 = bool.booleanValue();
                r8lambda7pyt14uieahlprgfczvsqchol6u.getClass();
                SettingsViewModel settingsViewModel = (SettingsViewModel) this.MediaMetadataCompat;
                subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = settingsViewModel.ComponentActivity;
                int i17 = r8lambdaFeqavdgLqmQOJLvrFaEJOa9xxTc.write[r8lambda7pyt14uieahlprgfczvsqchol6u.ordinal()];
                if (i17 == 1) {
                    decode decodeVar = subscribetobannersdismissedeventandroid_sdk_base_release.read;
                    Map mapSingletonMap = Collections.singletonMap(FeatureFlag.ENABLED, String.valueOf(zBooleanValue3));
                    mapSingletonMap.getClass();
                    decodeVar.logEvent("biometric_sign_in_enable", mapSingletonMap);
                    SemanticsPropertyKey semanticsPropertyKey = settingsViewModel.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    decode decodeVar2 = semanticsPropertyKey.write.write;
                    Map mapSingletonMap2 = Collections.singletonMap("should_launch", String.valueOf(zBooleanValue3));
                    mapSingletonMap2.getClass();
                    decodeVar2.logEvent("biometrics_setting", mapSingletonMap2);
                    setTextCompositionRangepsREZIo settextcompositionrangepsrezio = semanticsPropertyKey.serializer;
                    if (zBooleanValue3) {
                        SharedPreferences.Editor editorEdit = settextcompositionrangepsrezio.RemoteActionCompatParcelizer().edit();
                        editorEdit.putBoolean("SHARED_PREF_BIOMETRIC_SHOULD_LAUNCH_FLAG", true);
                        editorEdit.apply();
                    } else {
                        SharedPreferences.Editor editorEdit2 = settextcompositionrangepsrezio.RemoteActionCompatParcelizer().edit();
                        editorEdit2.putBoolean("SHARED_PREF_BIOMETRIC_SHOULD_LAUNCH_FLAG", false);
                        editorEdit2.apply();
                        if (!settextcompositionrangepsrezio.RemoteActionCompatParcelizer().contains("SHARED_PREF_IS_BIOMETRIC_DISABLED_IN_SETTINGS")) {
                            int i18 = RemoteActionCompatParcelizer + 81;
                            write = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            SharedPreferences.Editor editorEdit3 = settextcompositionrangepsrezio.RemoteActionCompatParcelizer().edit();
                            editorEdit3.putBoolean("SHARED_PREF_IS_BIOMETRIC_DISABLED_IN_SETTINGS", true);
                            editorEdit3.apply();
                        }
                    }
                    settingsViewModel.write.IconCompatParcelizer(bool);
                } else if (i17 == 2) {
                    decode decodeVar3 = subscribetobannersdismissedeventandroid_sdk_base_release.read;
                    Map mapSingletonMap3 = Collections.singletonMap(FeatureFlag.ENABLED, String.valueOf(zBooleanValue3));
                    mapSingletonMap3.getClass();
                    decodeVar3.logEvent("safety_tracking_enable", mapSingletonMap3);
                    if (settingsViewModel.read.RemoteActionCompatParcelizer()) {
                        settingsViewModel.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(settingsViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(R.string.preference_safety_tracking), zBooleanValue3);
                        if (!zBooleanValue3) {
                            ((RiderSafetyLifecycleManager) settingsViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).read();
                        }
                    } else {
                        settingsViewModel.ParcelableVolumeInfo.serializer(r8lambdaC4x3_FR1RkvLSmBNZ_wkqomQW5Y.IconCompatParcelizer);
                    }
                }
                return createfromparcel;
        }
    }
}
