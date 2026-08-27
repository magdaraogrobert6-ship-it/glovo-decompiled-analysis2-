package com.roadrunner.settings;

import android.os.Build;
import androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.R;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.delivery.accept.individualEarnings.presentation.IndividualEarningsUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.data.GetConfirmationStateImpl;
import com.roadrunner.freelancing.presentation.empty.FreelancingAvailabilityUiModelImpl;
import com.roadrunner.home.floatinglayer.config.GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$extractValue$1;
import com.roadrunner.location.core.domain.ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.map.integration.mapbox.camera.CalculateSafeAreaUseCase;
import com.roadrunner.map.integration.mapbox.camera.CalculateSafeAreaUseCase$invoke$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockUiModelImpl;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftUiModelImpl;
import com.roadrunner.rider.state.onpause.presentation.OnPauseUiModelImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.quests.presentation.list.QuestListUiModelImpl;
import com.roadrunner.rider.state.suspension.presentation.SuspensionUiModelImpl;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import com.sentiance.core.model.events.N$b;
import io.sentry.CombinedScopeView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import o.AdjustBridgeInstance5;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.ConstraintReferenceIncorrectConstraintException;
import o.FocusTargetInteropNoderetrievePinnableContainer1;
import o.FocusTargetPropertiesNode;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory33;
import o.StaticLayoutFactoryDefaultCompanion;
import o.accessgetOldDependencyp;
import o.accessgetStaticLayoutConstructor;
import o.accessgetStaticLayoutConstructorcp;
import o.accesssetInitializedcp;
import o.accesssetStaticLayoutConstructorcp;
import o.addDuration;
import o.buildCompositionParentHierarchy;
import o.copyGSF8kmgdefault;
import o.createFromParcel;
import o.deleteSurroundingTextInCodePoints;
import o.dismissBannerlambda1;
import o.dispatchRestoreInstanceState;
import o.drawChild;
import o.ensureBottomGlow;
import o.ensureRightGlow;
import o.ensureTopGlow;
import o.exceptionLabel;
import o.getAsciiPjHm6EE;
import o.getCieXyz;
import o.getDecimalPjHm6EE;
import o.getHeadingrAG3T2kannotations;
import o.getHuaweiAdsReferrer;
import o.getInstallSessionBackoffStrategy;
import o.getLicenseVerificationTracked;
import o.getMaxWidth;
import o.getPackageInfo;
import o.getQueryParameterslambda2;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.getStrictnessusljTpc;
import o.hasSameNonLayoutAttributesui_text;
import o.hideCurrentlyDisplayingInAppMessage;
import o.ia;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.lambda38;
import o.loadAsync;
import o.logBannerClicklambda0;
import o.logCustomEventlambda0;
import o.od;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg;
import o.r8lambda4mcHd0D6k0eMpYL9iOXKDTJNTnM;
import o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao;
import o.r8lambda5_PQMw30AYpvgDY5yFJI1wIvaeg;
import o.r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4;
import o.r8lambda5kWZVrTTOf4XktrICuq14WHMSQA;
import o.r8lambda5weVaLnJrZw3JZ5gurH6kjpdo;
import o.r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4;
import o.r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI;
import o.r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ;
import o.r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U;
import o.r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c;
import o.r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA;
import o.r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs;
import o.r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM;
import o.r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI;
import o.r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w;
import o.r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.r8lambdacqEJOAZiJRBqYtVLdvjougzNXbY;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;
import o.setUpdateBlock;
import o.shouldDumpInternalState;
import o.trackThirdPartySharingI;
import o.unpackInt1;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsViewModel$special$$inlined$combine$1$3(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(3, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x053d  */
    /* JADX WARN: Code duplicated, block: B:259:0x057a  */
    /* JADX WARN: Code duplicated, block: B:288:0x066f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean boolValueOf;
        ArrayList arrayList;
        r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao r8lambda5hzxmaf3xnzh0fawlqisitz7ao;
        r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer;
        Map mapSerializer;
        ArrayList arrayList2;
        String strIconCompatParcelizer;
        Object accesssetinitializedcp;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        Flow getNestScope$invoke$$inlined$map$1;
        getAsciiPjHm6EE getasciipjhm6ee;
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3;
        Object obj2;
        Object objWithContext;
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        Object[] objArr = 0;
        switch (this.read) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.write;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector = (FlowCollector) this.serializer;
                    Object[] objArr2 = (Object[]) this.RemoteActionCompatParcelizer;
                    Object obj3 = objArr2[0];
                    Object obj4 = objArr2[1];
                    Object obj5 = objArr2[2];
                    Object obj6 = objArr2[3];
                    Object obj7 = objArr2[4];
                    Object obj8 = objArr2[5];
                    Map map = (Map) objArr2[6];
                    Set set = (Set) obj8;
                    Boolean bool = (Boolean) obj7;
                    boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                    r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao = (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj4;
                    String str = (String) obj3;
                    SettingsViewModel settingsViewModel = (SettingsViewModel) this.IconCompatParcelizer;
                    r8lambda5_PQMw30AYpvgDY5yFJI1wIvaeg r8lambda5_pqmw30aypvgdy5yfji1wivaeg = settingsViewModel.RemoteActionCompatParcelizer;
                    if (settingsViewModel.MediaMetadataCompat.read.IconCompatParcelizer()) {
                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) settingsViewModel.MediaBrowserCompatMediaItem;
                        firebaseRemoteConfigImpl.getClass();
                        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_BIOMETRICS_ENABLED)) {
                            boolValueOf = Boolean.valueOf(settingsViewModel.MediaSessionCompatQueueItem.serializer.serializer());
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        boolValueOf = null;
                    }
                    boolean zBooleanValue2 = bool != null ? bool.booleanValue() : ((SettingsViewModel) this.IconCompatParcelizer).read.RemoteActionCompatParcelizer();
                    r8lambda5_pqmw30aypvgdy5yfji1wivaeg.getClass();
                    r8lambdanyj3ixzjgs1drw4t7o1og6tkao.getClass();
                    set.getClass();
                    map.getClass();
                    if (str == null) {
                        str = (String) onContentCardDismissed.MediaMetadataCompat(((FirebaseRemoteConfigImpl) r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer());
                    }
                    setTransactionSuccessful settransactionsuccessful = r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat;
                    BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RemoteActionCompatParcelizer;
                    if (((trackThirdPartySharingI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(611636138, R.serializer(), R.serializer(), -611636136, R.serializer(), R.serializer(), new Object[]{firebaseRemoteConfigImpl2})) != trackThirdPartySharingI.NOT_AVAILABLE && !firebaseRemoteConfigImpl2.RemoteActionCompatParcelizer().isEmpty() && str != null) {
                        r8lambda5weVaLnJrZw3JZ5gurH6kjpdo r8lambda5wevalnjrzw3jz5gurh6kjpdo = r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.CHAT_LANGUAGE;
                        String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_chat_language_title);
                        String displayLanguage = new Locale(str).getDisplayLanguage();
                        displayLanguage.getClass();
                        baseContentCardViewExternalSyntheticLambda0.add(new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5wevalnjrzw3jz5gurh6kjpdo, com.logistics.rider.glovo.R.drawable.ic_bold_large_chat_chat_support, strIconCompatParcelizer2, displayLanguage, null));
                    }
                    if (r8lambda5_pqmw30aypvgdy5yfji1wivaeg.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer()) {
                        r8lambda5weVaLnJrZw3JZ5gurH6kjpdo r8lambda5wevalnjrzw3jz5gurh6kjpdo2 = r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.APPEARANCE;
                        String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_appearance_title);
                        int i6 = r8lambda4mcHd0D6k0eMpYL9iOXKDTJNTnM.IconCompatParcelizer[((ConstraintReferenceIncorrectConstraintException) r8lambda5_pqmw30aypvgdy5yfji1wivaeg.IconCompatParcelizer).RemoteActionCompatParcelizer().ordinal()];
                        if (i6 == 1) {
                            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_appearance_ui_mode_light);
                        } else if (i6 == 2) {
                            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_appearance_ui_mode_dark);
                        } else {
                            if (i6 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_appearance_ui_mode_system);
                        }
                        baseContentCardViewExternalSyntheticLambda0.add(new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5wevalnjrzw3jz5gurh6kjpdo2, com.logistics.rider.glovo.R.drawable.ic_circle_half_filled, strIconCompatParcelizer3, strIconCompatParcelizer, null));
                    }
                    baseContentCardViewExternalSyntheticLambda0.add(new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.NAVIGATION, com.logistics.rider.glovo.R.drawable.ic_bold_large_map_navigate, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_navigation_title), null, (String) map.get(r8lambdaFqEZAUBkFnfJgz2iX0ulE6_FGM.NAVIGATION)));
                    baseContentCardViewExternalSyntheticLambda0.add(new r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4(r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4.DEVICE_SETTINGS, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_device_settings_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_device_settings_info)));
                    if (boolValueOf != null) {
                        baseContentCardViewExternalSyntheticLambda0.add(new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.BIOMETRIC_AUTHENTICATION, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_human_recognition), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_biometric_sign_in_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_biometric_sign_in_description), boolValueOf.booleanValue()));
                    }
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) r8lambda5_pqmw30aypvgdy5yfji1wivaeg.MediaMetadataCompat.RemoteActionCompatParcelizer;
                    firebaseRemoteConfigImpl3.getClass();
                    if (firebaseRemoteConfigImpl3.RemoteActionCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_PHASE2_ENABLED) && firebaseRemoteConfigImpl3.RemoteActionCompatParcelizer(updateAdidI.IS_SAFETY_OPTION_AVAILABLE_IN_SETTINGS)) {
                        baseContentCardViewExternalSyntheticLambda0.add(new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.SAFETY, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_safety_good), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_safety_tracking_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_safety_tracking_description), zBooleanValue2));
                    }
                    BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                    if (r8lambdanyj3ixzjgs1drw4t7o1og6tkao.promotions != null) {
                        r8lambdaJ_QfP3gOiW8g_GLIRW39GJgv5OI r8lambdaj_qfp3goiw8g_glirw39gjgv5oi = r8lambda5_pqmw30aypvgdy5yfji1wivaeg.MediaDescriptionCompat.read;
                        Map map2 = r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.serializer;
                        map2.getClass();
                        synchronized (map2) {
                            Map map3 = r8lambdaj_qfp3goiw8g_glirw39gjgv5oi.serializer;
                            map3.getClass();
                            mapSerializer = onMove.serializer(map3);
                        }
                        if (mapSerializer.isEmpty()) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = new ArrayList(mapSerializer.size());
                            for (Iterator it = mapSerializer.entrySet().iterator(); it.hasNext(); it = it) {
                                r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w = (r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w) ((Map.Entry) it.next()).getValue();
                                arrayList2.add(new r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ(r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.iconUrl, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.label, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.timeRange, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.value, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.type, !set.contains(r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.type)));
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    setTransactionSuccessful settransactionsuccessful2 = r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat;
                    BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda1 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
                    if (((FirebaseRemoteConfigImpl) r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_USERCENTRICS_SETTINGS_ENABLED.getFirebaseFlagName())) {
                        baseContentCardViewExternalSyntheticLambda1.add(new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.DATA_PRIVACY_SETTINGS, com.logistics.rider.glovo.R.drawable.ic_shield_switch, settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_privacy_settings_title), null, null));
                    }
                    List list = r8lambdanyj3ixzjgs1drw4t7o1og6tkao.legalItems;
                    ArrayList<r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI> arrayList3 = new ArrayList();
                    for (Object obj9 : list) {
                        String str2 = ((r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI) obj9).link;
                        if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                            arrayList3.add(obj9);
                        }
                    }
                    for (r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI r8lambdaml5nqy1s6pyvxo4nai_kgbegi : arrayList3) {
                        String str3 = r8lambdaml5nqy1s6pyvxo4nai_kgbegi.label;
                        String str4 = r8lambdaml5nqy1s6pyvxo4nai_kgbegi.icon;
                        String str5 = r8lambdaml5nqy1s6pyvxo4nai_kgbegi.link;
                        if (str5 == null) {
                            str5 = "";
                        }
                        baseContentCardViewExternalSyntheticLambda1.add(new r8lambda5kWZVrTTOf4XktrICuq14WHMSQA(str3, str4, str5));
                    }
                    baseContentCardViewExternalSyntheticLambda1.add(new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.OPEN_SOURCE_LICENSES, com.logistics.rider.glovo.R.drawable.ic_bold_large_file_common_text, settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_open_source_licenses_title), null, null));
                    r8lambda5_pqmw30aypvgdy5yfji1wivaeg.write.getClass();
                    BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer2 = SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda1);
                    r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva = new r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA(r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notification_check_title), r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notification_check_description), r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notification_check_button_title));
                    setTransactionSuccessful settransactionsuccessful3 = r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat;
                    String strM = r8lambdanyj3ixzjgs1drw4t7o1og6tkao.feedback.link;
                    if (strM == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strM)) {
                        r8lambda5hzxmaf3xnzh0fawlqisitz7ao = null;
                    } else {
                        r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva2 = new r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_feedback_title), settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_feedback_description), settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_feedback_button_title));
                        r8lambdacqEJOAZiJRBqYtVLdvjougzNXbY r8lambdacqejoazijrbqytvldvjougznxby = r8lambda5_pqmw30aypvgdy5yfji1wivaeg.read;
                        accessgetOldDependencyp accessgetolddependencyp = r8lambdacqejoazijrbqytvldvjougznxby.RemoteActionCompatParcelizer;
                        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strM, (CharSequence) "tweety/web/survey", false) && (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) r8lambdacqejoazijrbqytvldvjougznxby.read).RemoteActionCompatParcelizer.serializer()) != null) {
                            long j = r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read;
                            accessgetolddependencyp.getClass();
                            String str6 = ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) accessgetolddependencyp).serializer;
                            String displayLanguage2 = Locale.getDefault().getDisplayLanguage();
                            String str7 = Build.BRAND;
                            String str8 = Build.MODEL;
                            StringBuilder sb = new StringBuilder();
                            sb.append(strM);
                            sb.append("?rider_id=");
                            sb.append(j);
                            sb.append("&app_version=v4.2634.5&platform=Android&os_version=");
                            c8$$ExternalSyntheticOutline0.m(sb, str6, "&locale=", displayLanguage2, "&device_brand=");
                            strM = d$$ExternalSyntheticOutline0.m(sb, str7, "&device_model=", str8);
                        }
                        r8lambda5hzxmaf3xnzh0fawlqisitz7ao = new r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao(r8lambdacwu8ozate7jouiaqjprnuskxva2, strM);
                    }
                    r8lambda5_pqmw30aypvgdy5yfji1wivaeg.write.getClass();
                    setTransactionSuccessful settransactionsuccessful4 = r8lambda5_pqmw30aypvgdy5yfji1wivaeg.RatingCompat;
                    String str9 = String.format(settransactionsuccessful4.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_version_description), Arrays.copyOf(new Object[]{"v4.2634.5"}, 1));
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str9, "v4.2634.5", 0, false, 6);
                    builder.append(str9.substring(0, iWrite));
                    int iPushStyle = builder.pushStyle(new SpanStyle(r8lambda5_pqmw30aypvgdy5yfji1wivaeg.serializer.IconCompatParcelizer().setOnMenuItemClickListener(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(str9.substring(iWrite, iWrite + 9));
                        builder.pop(iPushStyle);
                        r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs r8lambdafenlu5aljx2clfzrg4te2qepkfs = new r8lambdaFEnLU5alJx2ClfZRg4tE2QEPKfs(baseContentCardViewExternalSyntheticLambda0Serializer, arrayList, baseContentCardViewExternalSyntheticLambda0Serializer2, r8lambdacwu8ozate7jouiaqjprnuskxva, r8lambda5hzxmaf3xnzh0fawlqisitz7ao, new r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg(builder.toAnnotatedString(), settransactionsuccessful4.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_app_update_label_new_version_available), settransactionsuccessful4.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_app_update_button_update_now), zBooleanValue));
                        this.serializer = null;
                        this.RemoteActionCompatParcelizer = null;
                        this.write = 1;
                        if (flowCollector.emit(r8lambdafenlu5aljx2clfzrg4te2qepkfs, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                } else {
                    if (i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.write;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.serializer;
                    loadAsync loadasync = (loadAsync) this.RemoteActionCompatParcelizer;
                    SignInDataStore signInDataStore = ((hasSameNonLayoutAttributesui_text) this.IconCompatParcelizer).MediaSessionCompatQueueItem;
                    signInDataStore.getClass();
                    loadasync.getClass();
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl4 = (FirebaseRemoteConfigImpl) ((unpackInt1) signInDataStore.read).read;
                    firebaseRemoteConfigImpl4.getClass();
                    Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$4 = !firebaseRemoteConfigImpl4.IconCompatParcelizer(updateAdidI.IS_AUTO_ACCEPT_HOSTS_ENABLED) ? new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(copyGSF8kmgdefault.IconCompatParcelizer) : new GetNestScope$invoke$$inlined$map$1(new ObserveDivider$invoke$$inlined$extractValue$1(new SettingsViewModel$special$$inlined$map$1(((NestComponentRepositoryImpl) signInDataStore.serializer).IconCompatParcelizer, i, "auto_accept"), i4), signInDataStore, loadasync, i4);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector2, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$4, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 2:
                IndividualEarningsUiModelImpl individualEarningsUiModelImpl = (IndividualEarningsUiModelImpl) this.IconCompatParcelizer;
                FocusTargetPropertiesNode focusTargetPropertiesNode = (FocusTargetPropertiesNode) this.serializer;
                setUpdateBlock setupdateblock = (setUpdateBlock) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.write;
                if (i8 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessgetStaticLayoutConstructor accessgetstaticlayoutconstructor = individualEarningsUiModelImpl.IconCompatParcelizer;
                    Object obj10 = individualEarningsUiModelImpl.RatingCompat.read();
                    accessgetStaticLayoutConstructorcp accessgetstaticlayoutconstructorcp = obj10 instanceof accessgetStaticLayoutConstructorcp ? (accessgetStaticLayoutConstructorcp) obj10 : null;
                    Integer num = accessgetstaticlayoutconstructorcp != null ? new Integer(accessgetstaticlayoutconstructorcp.serializer) : null;
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    AnalyticsServiceImpl analyticsServiceImpl = accessgetstaticlayoutconstructor.serializer;
                    StaticLayoutFactoryDefaultCompanion staticLayoutFactoryDefaultCompanion = StaticLayoutFactoryDefaultCompanion.IconCompatParcelizer;
                    if (focusTargetPropertiesNode == null) {
                        accesssetinitializedcp = staticLayoutFactoryDefaultCompanion;
                    } else {
                        FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer1 = focusTargetPropertiesNode.overview;
                        List list2 = focusTargetPropertiesNode.individualEarnings;
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcpIconCompatParcelizer = analyticsServiceImpl.IconCompatParcelizer(focusTargetInteropNoderetrievePinnableContainer1, setupdateblock);
                            if (accesssetstaticlayoutconstructorcpIconCompatParcelizer != null) {
                                accesssetinitializedcp = new accesssetInitializedcp(accesssetstaticlayoutconstructorcpIconCompatParcelizer);
                            } else {
                                accesssetinitializedcp = staticLayoutFactoryDefaultCompanion;
                            }
                        } else {
                            ArrayList<FocusTargetInteropNoderetrievePinnableContainer1> arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list2 != null ? list2 : instance_delegatelambda0.write, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{focusTargetInteropNoderetrievePinnableContainer1}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            for (FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer2 : arrayListIconCompatParcelizer) {
                                arrayList4.add(new AdjustBridgeInstance5(String.valueOf(focusTargetInteropNoderetrievePinnableContainer2.tagName)));
                                arrayList5.add(analyticsServiceImpl.IconCompatParcelizer(focusTargetInteropNoderetrievePinnableContainer2, setupdateblock));
                            }
                            if (num == null) {
                                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new Integer(0), onContentCardDismissed.read(0, arrayList5));
                            } else {
                                int iIntValue = num.intValue();
                                onviewattachedtowindowlambda0 = iIntValue < arrayList5.size() ? new onViewAttachedToWindowlambda0(new Integer(iIntValue), arrayList5.get(iIntValue)) : null;
                                if (onviewattachedtowindowlambda0 == null) {
                                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new Integer(0), onContentCardDismissed.read(0, arrayList5));
                                }
                            }
                            accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = (accesssetStaticLayoutConstructorcp) onviewattachedtowindowlambda0.write;
                            if (accesssetstaticlayoutconstructorcp == null && arrayList4.isEmpty()) {
                                accesssetinitializedcp = staticLayoutFactoryDefaultCompanion;
                            } else {
                                accesssetinitializedcp = new accessgetStaticLayoutConstructorcp(((Number) onviewattachedtowindowlambda0.serializer).intValue(), removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList4), removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList5), accesssetstaticlayoutconstructorcp);
                            }
                        }
                    }
                    if (accesssetinitializedcp == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accesssetinitializedcp = obj;
                }
                StaticLayoutFactory33 staticLayoutFactory33 = (StaticLayoutFactory33) accesssetinitializedcp;
                individualEarningsUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(staticLayoutFactory33);
                individualEarningsUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(!(staticLayoutFactory33 instanceof StaticLayoutFactoryDefaultCompanion)));
                return createFromParcel.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.write;
                if (i9 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector3 = (FlowCollector) this.serializer;
                    String str10 = (String) this.RemoteActionCompatParcelizer;
                    Flow flowSerializer = str10 == null ? FlowKt.serializer() : ((CrowdSourcingFloatingImageButtonUiModelImpl) this.IconCompatParcelizer).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(str10);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector3, flowSerializer, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.write;
                if (i10 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector4 = (FlowCollector) this.serializer;
                    String str11 = (String) this.RemoteActionCompatParcelizer;
                    Flow flowSerializer2 = str11 == null ? FlowKt.serializer() : ((CrowdSourcingFloatingImageCameraOnlyUiModelImpl) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper.read(str11);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector4, flowSerializer2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i10 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 5:
                deleteSurroundingTextInCodePoints deletesurroundingtextincodepoints = (deleteSurroundingTextInCodePoints) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.write;
                if (i11 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector5 = (FlowCollector) this.serializer;
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) this.RemoteActionCompatParcelizer;
                    getDecimalPjHm6EE getdecimalpjhm6ee = (getDecimalPjHm6EE) onviewattachedtowindowlambda1.serializer;
                    Integer num2 = (Integer) onviewattachedtowindowlambda1.write;
                    List list4 = getdecimalpjhm6ee.write;
                    Flow getNestScope$invoke$$inlined$map$2 = ((list4 == null || list4.isEmpty()) && num2 != null) ? new GetNestScope$invoke$$inlined$map$1(FlowKt.serializer(new ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1(deletesurroundingtextincodepoints.write.read, num2.intValue(), 1)), deletesurroundingtextincodepoints, getdecimalpjhm6ee, i3) : FlowKt.read(new NavHostKt$NavHost$29$1(deletesurroundingtextincodepoints, getdecimalpjhm6ee, null, 22));
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector5, getNestScope$invoke$$inlined$map$2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.write;
                if (i12 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector6 = (FlowCollector) this.serializer;
                    getDecimalPjHm6EE getdecimalpjhm6ee2 = (getDecimalPjHm6EE) this.RemoteActionCompatParcelizer;
                    List list5 = getdecimalpjhm6ee2.write;
                    String str12 = (list5 == null || (getasciipjhm6ee = (getAsciiPjHm6EE) onContentCardDismissed.MediaMetadataCompat(list5)) == null) ? null : getasciipjhm6ee.read;
                    List list6 = getdecimalpjhm6ee2.write;
                    if (list6 == null || list6.isEmpty() || str12 == null || getdecimalpjhm6ee2.RemoteActionCompatParcelizer == null || !getdecimalpjhm6ee2.serializer) {
                        getNestScope$invoke$$inlined$map$1 = FlowKt.read(new NonTouchScrollingLogicKt$busyReceive$2$job$1(i3, i4, objArr == true ? 1 : 0));
                    } else {
                        SignInDataStore signInDataStore2 = (SignInDataStore) this.IconCompatParcelizer;
                        getNestScope$invoke$$inlined$map$1 = new GetNestScope$invoke$$inlined$map$1(FlowKt.serializer(new SignInDataStore$get$$inlined$map$1(((r8lambdalVQGMqHtfjmEwPaE6dqnfDBlU) signInDataStore2.RemoteActionCompatParcelizer).read, signInDataStore2, 11)), getdecimalpjhm6ee2, str12, i2);
                    }
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector6, getNestScope$invoke$$inlined$map$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i12 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 7:
                FlowCollector flowCollector7 = (FlowCollector) this.serializer;
                Throwable th2 = (Throwable) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.write;
                if (i13 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th2, "ConfirmButtonV1UiModelImpl: Failed to observe local tasks.", new Object[0]);
                    buildCompositionParentHierarchy buildcompositionparenthierarchyRemoteActionCompatParcelizer = buildCompositionParentHierarchy.RemoteActionCompatParcelizer((buildCompositionParentHierarchy) this.IconCompatParcelizer, true);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (flowCollector7.emit(buildcompositionparenthierarchyRemoteActionCompatParcelizer, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 8:
                FlowCollector flowCollector8 = (FlowCollector) this.serializer;
                Throwable th3 = (Throwable) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.write;
                if (i14 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Timber.RemoteActionCompatParcelizer.read(th3, "Get confirmation failed", new Object[0]);
                    getMaxWidth getmaxwidth = new getMaxWidth(th3);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = th3;
                    this.write = 1;
                    if (flowCollector8.emit(getmaxwidth, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i14 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                ((GetConfirmationStateImpl) this.IconCompatParcelizer).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th3);
                return createFromParcel.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.write;
                if (i15 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector9 = (FlowCollector) this.serializer;
                    Flow flowIconCompatParcelizer = ((Boolean) this.RemoteActionCompatParcelizer).booleanValue() ? ((FreelancingAvailabilityUiModelImpl) this.IconCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer() : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(shouldDumpInternalState.read);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector9, flowIconCompatParcelizer, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i15 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.write;
                if (i16 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector10 = (FlowCollector) this.serializer;
                    getStrictnessusljTpc getstrictnessusljtpc = (getStrictnessusljTpc) this.RemoteActionCompatParcelizer;
                    CalculateSafeAreaUseCase calculateSafeAreaUseCase = ((ia) this.IconCompatParcelizer).write;
                    FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = calculateSafeAreaUseCase.MediaMetadataCompat.RemoteActionCompatParcelizer;
                    getstrictnessusljtpc.getClass();
                    Flow settingsViewModel$special$$inlined$map$1 = ((getstrictnessusljtpc instanceof getHeadingrAG3T2kannotations) && ((getHeadingrAG3T2kannotations) getstrictnessusljtpc).IconCompatParcelizer) ? FlowKt.read(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, calculateSafeAreaUseCase.RemoteActionCompatParcelizer.read, calculateSafeAreaUseCase.IconCompatParcelizer.read, new CalculateSafeAreaUseCase$invoke$1(calculateSafeAreaUseCase, getstrictnessusljtpc, null)) : new SettingsViewModel$special$$inlined$map$1(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, 10, calculateSafeAreaUseCase);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector10, settingsViewModel$special$$inlined$map$1, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i16 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.write;
                if (i17 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector11 = (FlowCollector) this.serializer;
                    Flow flowRemoteActionCompatParcelizer = ((dispatchRestoreInstanceState) this.RemoteActionCompatParcelizer) != null ? ((CashBlockUiModelImpl) this.IconCompatParcelizer).read.RemoteActionCompatParcelizer() : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(getInstallSessionBackoffStrategy.IconCompatParcelizer);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector11, flowRemoteActionCompatParcelizer, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i17 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.write;
                if (i18 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector12 = (FlowCollector) this.serializer;
                    Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$5 = ((drawChild) this.RemoteActionCompatParcelizer) != null ? ((FinishedShiftUiModelImpl) this.IconCompatParcelizer).IconCompatParcelizer.read() : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(Boolean.FALSE);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector12, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$5, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i18 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.write;
                if (i19 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector13 = (FlowCollector) this.serializer;
                    Flow flowRemoteActionCompatParcelizer2 = ((ensureRightGlow) this.RemoteActionCompatParcelizer) != null ? ((OnPauseUiModelImpl) this.IconCompatParcelizer).MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer() : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(getPackageInfo.RemoteActionCompatParcelizer);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector13, flowRemoteActionCompatParcelizer2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i19 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.write;
                if (i20 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector14 = (FlowCollector) this.serializer;
                    Flow flowMediaBrowserCompatMediaItem = ((ensureTopGlow) this.RemoteActionCompatParcelizer) != null ? ((QuestListUiModelImpl) this.IconCompatParcelizer).RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(addDuration.serializer);
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector14, flowMediaBrowserCompatMediaItem, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.write;
                if (i21 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector15 = (FlowCollector) this.serializer;
                    if (((exceptionLabel) this.RemoteActionCompatParcelizer) != null) {
                        CombinedScopeView combinedScopeView = ((SuspensionUiModelImpl) this.IconCompatParcelizer).IconCompatParcelizer;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new GetMapScope$invoke$$inlined$map$1(((GetRiderStatusImpl) combinedScopeView.RemoteActionCompatParcelizer).IconCompatParcelizer(), combinedScopeView, 15);
                    } else {
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(getLicenseVerificationTracked.RemoteActionCompatParcelizer);
                    }
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector15, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i21 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.write;
                if (i22 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector16 = (FlowCollector) this.serializer;
                    if (((ensureBottomGlow) this.RemoteActionCompatParcelizer) != null) {
                        StartingAreaNavigateViewUiModelImpl startingAreaNavigateViewUiModelImpl = (StartingAreaNavigateViewUiModelImpl) this.IconCompatParcelizer;
                        getHuaweiAdsReferrer gethuaweiadsreferrer = startingAreaNavigateViewUiModelImpl.RemoteActionCompatParcelizer;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3 = FlowKt.serializer(FlowKt.RemoteActionCompatParcelizer(new GetMapScope$invoke$$inlined$map$1(gethuaweiadsreferrer.IconCompatParcelizer.write(), gethuaweiadsreferrer, 13), new GetRhFloatingLayerConfiguration$invoke$$inlined$flatMapLatest$1(null, startingAreaNavigateViewUiModelImpl)));
                    } else {
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(od.write);
                    }
                    this.serializer = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.write = 1;
                    if (FlowKt.emitAll(flowCollector16, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$3, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i22 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createFromParcel.INSTANCE;
            default:
                dismissBannerlambda1 dismissbannerlambda1 = (dismissBannerlambda1) this.serializer;
                lambda38 lambda38Var = (lambda38) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.write;
                if (i23 != 0) {
                    if (i23 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objWithContext = obj;
                        return (dismissBannerlambda1) objWithContext;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                    return obj2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda38Var, logCustomEventlambda0.write}, getCieXyz.write())).booleanValue()) {
                    return dismissbannerlambda1;
                }
                if (!(lambda38Var instanceof logBannerClicklambda0)) {
                    obj2 = null;
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return obj2;
                }
                N$b n$b = (N$b) this.IconCompatParcelizer;
                this.serializer = null;
                this.RemoteActionCompatParcelizer = null;
                this.write = 1;
                ((inCompatibilityMode) ((isOpenInternalroom_runtime) n$b.serializer)).getClass();
                objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new PhotoIdUiModelImpl$1$1(dismissbannerlambda1, (logBannerClicklambda0) lambda38Var, null, 24), this);
                if (objWithContext == coroutineSingletons18) {
                    return coroutineSingletons18;
                }
                return (dismissBannerlambda1) objWithContext;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsViewModel$special$$inlined$combine$1$3(ShortNewsContentCardView shortNewsContentCardView, Object obj, int i) {
        super(3, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.IconCompatParcelizer;
        int i4 = 0;
        switch (i3) {
            case 0:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$3 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (SettingsViewModel) obj4, i4);
                settingsViewModel$special$$inlined$combine$1$3.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$3.RemoteActionCompatParcelizer = (Object[]) obj2;
                return settingsViewModel$special$$inlined$combine$1$3.invokeSuspend(createfromparcel);
            case 1:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$4 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (hasSameNonLayoutAttributesui_text) obj4, 1);
                settingsViewModel$special$$inlined$combine$1$4.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$4.RemoteActionCompatParcelizer = obj2;
                Object objInvokeSuspend = settingsViewModel$special$$inlined$combine$1$4.invokeSuspend(createfromparcel);
                int i5 = MediaSessionCompatQueueItem + 115;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            case 2:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$5 = new SettingsViewModel$special$$inlined$combine$1$3((IndividualEarningsUiModelImpl) obj4, (ShortNewsContentCardView) obj3, i);
                settingsViewModel$special$$inlined$combine$1$5.serializer = (FocusTargetPropertiesNode) obj;
                settingsViewModel$special$$inlined$combine$1$5.RemoteActionCompatParcelizer = (setUpdateBlock) obj2;
                Object objInvokeSuspend2 = settingsViewModel$special$$inlined$combine$1$5.invokeSuspend(createfromparcel);
                int i7 = MediaSessionCompatQueueItem + 47;
                RatingCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return objInvokeSuspend2;
                }
                throw null;
            case 3:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$6 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (CrowdSourcingFloatingImageButtonUiModelImpl) obj4, 3);
                settingsViewModel$special$$inlined$combine$1$6.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$6.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$6.invokeSuspend(createfromparcel);
            case 4:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$7 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (CrowdSourcingFloatingImageCameraOnlyUiModelImpl) obj4, 4);
                settingsViewModel$special$$inlined$combine$1$7.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$7.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$7.invokeSuspend(createfromparcel);
            case 5:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$8 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (deleteSurroundingTextInCodePoints) obj4, 5);
                settingsViewModel$special$$inlined$combine$1$8.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$8.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$8.invokeSuspend(createfromparcel);
            case 6:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$9 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (SignInDataStore) obj4, 6);
                settingsViewModel$special$$inlined$combine$1$9.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$9.RemoteActionCompatParcelizer = obj2;
                Object objInvokeSuspend3 = settingsViewModel$special$$inlined$combine$1$9.invokeSuspend(createfromparcel);
                int i8 = RatingCompat + 79;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 49 / 0;
                }
                return objInvokeSuspend3;
            case 7:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$10 = new SettingsViewModel$special$$inlined$combine$1$3((buildCompositionParentHierarchy) obj4, (ShortNewsContentCardView) obj3, 7);
                settingsViewModel$special$$inlined$combine$1$10.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$10.RemoteActionCompatParcelizer = (Throwable) obj2;
                return settingsViewModel$special$$inlined$combine$1$10.invokeSuspend(createfromparcel);
            case 8:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$11 = new SettingsViewModel$special$$inlined$combine$1$3((GetConfirmationStateImpl) obj4, (ShortNewsContentCardView) obj3, 8);
                settingsViewModel$special$$inlined$combine$1$11.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$11.RemoteActionCompatParcelizer = (Throwable) obj2;
                return settingsViewModel$special$$inlined$combine$1$11.invokeSuspend(createfromparcel);
            case 9:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$12 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (FreelancingAvailabilityUiModelImpl) obj4, 9);
                settingsViewModel$special$$inlined$combine$1$12.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$12.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$12.invokeSuspend(createfromparcel);
            case 10:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$13 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (ia) obj4, 10);
                settingsViewModel$special$$inlined$combine$1$13.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$13.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$13.invokeSuspend(createfromparcel);
            case 11:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$14 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (CashBlockUiModelImpl) obj4, 11);
                settingsViewModel$special$$inlined$combine$1$14.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$14.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$14.invokeSuspend(createfromparcel);
            case 12:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$15 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (FinishedShiftUiModelImpl) obj4, 12);
                settingsViewModel$special$$inlined$combine$1$15.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$15.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$15.invokeSuspend(createfromparcel);
            case 13:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$16 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (OnPauseUiModelImpl) obj4, 13);
                settingsViewModel$special$$inlined$combine$1$16.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$16.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$16.invokeSuspend(createfromparcel);
            case 14:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$17 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (QuestListUiModelImpl) obj4, 14);
                settingsViewModel$special$$inlined$combine$1$17.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$17.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$17.invokeSuspend(createfromparcel);
            case 15:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$18 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (SuspensionUiModelImpl) obj4, 15);
                settingsViewModel$special$$inlined$combine$1$18.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$18.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$18.invokeSuspend(createfromparcel);
            case 16:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$19 = new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) obj3, (StartingAreaNavigateViewUiModelImpl) obj4, 16);
                settingsViewModel$special$$inlined$combine$1$19.serializer = (FlowCollector) obj;
                settingsViewModel$special$$inlined$combine$1$19.RemoteActionCompatParcelizer = obj2;
                return settingsViewModel$special$$inlined$combine$1$19.invokeSuspend(createfromparcel);
            default:
                SettingsViewModel$special$$inlined$combine$1$3 settingsViewModel$special$$inlined$combine$1$20 = new SettingsViewModel$special$$inlined$combine$1$3((N$b) obj4, (ShortNewsContentCardView) obj3, 17);
                settingsViewModel$special$$inlined$combine$1$20.serializer = (dismissBannerlambda1) obj;
                settingsViewModel$special$$inlined$combine$1$20.RemoteActionCompatParcelizer = (lambda38) obj2;
                return settingsViewModel$special$$inlined$combine$1$20.invokeSuspend(createfromparcel);
        }
    }
}
