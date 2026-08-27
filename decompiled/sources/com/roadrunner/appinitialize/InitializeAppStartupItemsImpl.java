package com.roadrunner.appinitialize;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadAction;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.delivery.ontheway.routepreview.naver.data.NaverRoutePreviewRepository$getRoutePreview$1;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.face.verification.data.SelfieFlowRepository$uploadSelfie$2;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleUnsubscribeOn;
import io.sentry.SentryUUID;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.AndroidViewHolderlayoutNode12;
import o.AnnotatedStringBuilderMutableRange;
import o.AnnotatedStringBuilderMutableRangeCompanion;
import o.Bullet;
import o.BulletCompanion;
import o.FontVariationSettingInt;
import o.GraphicsLayerCompanion;
import o.ImageHeaderParserImageType;
import o.JvmAnnotatedString_jvmAndAndroidKt;
import o.LayoutCompat;
import o.PlaceholderSpanCompanionVerticalAlign;
import o.SemanticsPropertiesLinkTestMarker1;
import o.ShortNewsContentCardView;
import o.TextUnitType;
import o.accessgetDefaultPaddingcp;
import o.accessgetDefaultSizecp;
import o.accessgetOldDependencyp;
import o.accessgetRelativecp;
import o.accesslayoutAccordingTo;
import o.accessrequireViewFactoryHolder;
import o.accesstransactionWithWrapper;
import o.addSemanticsPropertiesFrom;
import o.copyCXVQc50default;
import o.copyF3nL8kk;
import o.copyw_4Rhrw;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEvents;
import o.executeAsOneOrNull;
import o.fromRange;
import o.getActiveFocusTargetNode;
import o.getBuilderui_text;
import o.getBulletListSettingStackui_text;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getDefaultSizeXSAIIZE;
import o.getDrawStyle;
import o.getHeadingrAG3T2k;
import o.getItem;
import o.getPaddingXSAIIZE;
import o.getPivotOffsetF1C5BW0;
import o.getWidthXSAIIZE;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.isHiddenannotations;
import o.isItemDismissable;
import o.lineEndToVisibleEnd;
import o.onBackStartedlambda1;
import o.onCapabilitiesChanged;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.processingInstruction;
import o.publishErrorlambda1;
import o.pushUrlAnnotation;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g;
import o.r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog;
import o.r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.removeNodeAtDepth;
import o.safeSetClipToOutline;
import o.setCarryoverInAppMessage;
import o.setRectOutlinetz77jQw;
import o.setRoundRectOutlineTNW_H78;
import o.sourceInformationContextOfdefault;
import o.subscribeToChangeUserEventslambda3;
import o.toAnnotatedString;
import o.toRange;
import o.toRangedefault;
import o.transactionWithWrapper;
import o.transferSessionPackageI;
import o.undelegateUnprotectedui;
import o.updateAdidI;
import o.withBulletListItem;
import okio.Path$Companion;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InitializeAppStartupItemsImpl {
    private static int read = 0;
    private static int write = 1;
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object serializer;

    public InitializeAppStartupItemsImpl(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, GetChatAssetDownloadAction getChatAssetDownloadAction) {
        this.RemoteActionCompatParcelizer = 15;
        initializeAppStartupItemsImpl.getClass();
        getChatAssetDownloadAction.getClass();
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
        this.serializer = getChatAssetDownloadAction;
    }

    public /* synthetic */ InitializeAppStartupItemsImpl(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
    }

    public InitializeAppStartupItemsImpl(getHeadingrAG3T2k getheadingrag3t2k) {
        this.RemoteActionCompatParcelizer = 26;
        this.IconCompatParcelizer = getheadingrag3t2k;
    }

    public InitializeAppStartupItemsImpl(processingInstruction processinginstruction, WebChatNativeCacheDataStore webChatNativeCacheDataStore) {
        this.RemoteActionCompatParcelizer = 14;
        processinginstruction.getClass();
        webChatNativeCacheDataStore.getClass();
        this.IconCompatParcelizer = processinginstruction;
        this.serializer = webChatNativeCacheDataStore;
    }

    public InitializeAppStartupItemsImpl(transferSessionPackageI transfersessionpackagei, AuthRepository authRepository) {
        this.RemoteActionCompatParcelizer = 7;
        transfersessionpackagei.getClass();
        authRepository.getClass();
        this.IconCompatParcelizer = transfersessionpackagei;
        this.serializer = authRepository;
    }

    public InitializeAppStartupItemsImpl(GraphicsLayerCompanion graphicsLayerCompanion, transferSessionPackageI transfersessionpackagei) {
        this.RemoteActionCompatParcelizer = 23;
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = graphicsLayerCompanion;
        this.serializer = transfersessionpackagei;
    }

    public InitializeAppStartupItemsImpl(PlaceholderSpanCompanionVerticalAlign placeholderSpanCompanionVerticalAlign, ExecuteApiRequest executeApiRequest, Path$Companion path$Companion) {
        this.RemoteActionCompatParcelizer = 20;
        this.IconCompatParcelizer = placeholderSpanCompanionVerticalAlign;
        this.serializer = executeApiRequest;
    }

    public InitializeAppStartupItemsImpl(accesstransactionWithWrapper accesstransactionwithwrapper, transactionWithWrapper transactionwithwrapper) {
        this.RemoteActionCompatParcelizer = 3;
        accesstransactionwithwrapper.getClass();
        transactionwithwrapper.getClass();
        this.IconCompatParcelizer = accesstransactionwithwrapper;
        this.serializer = transactionwithwrapper;
    }

    public InitializeAppStartupItemsImpl(ImageHeaderParserImageType imageHeaderParserImageType, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.RemoteActionCompatParcelizer = 10;
        imageHeaderParserImageType.getClass();
        initializeAppStartupItemsImpl.getClass();
        this.IconCompatParcelizer = imageHeaderParserImageType;
        this.serializer = initializeAppStartupItemsImpl;
    }

    public InitializeAppStartupItemsImpl(WebChatNativeCacheDataStore webChatNativeCacheDataStore, ChatAssetCacheManager chatAssetCacheManager) {
        this.RemoteActionCompatParcelizer = 13;
        webChatNativeCacheDataStore.getClass();
        chatAssetCacheManager.getClass();
        this.IconCompatParcelizer = webChatNativeCacheDataStore;
        this.serializer = chatAssetCacheManager;
    }

    public InitializeAppStartupItemsImpl(accessrequireViewFactoryHolder accessrequireviewfactoryholder, StateDataStoreImpl stateDataStoreImpl) {
        this.RemoteActionCompatParcelizer = 21;
        accessrequireviewfactoryholder.getClass();
        stateDataStoreImpl.getClass();
        this.IconCompatParcelizer = accessrequireviewfactoryholder;
        this.serializer = stateDataStoreImpl;
    }

    public InitializeAppStartupItemsImpl(AuthRepository authRepository, IsUserAuthenticatedWrapper isUserAuthenticatedWrapper) {
        this.RemoteActionCompatParcelizer = 6;
        authRepository.getClass();
        isUserAuthenticatedWrapper.getClass();
        this.IconCompatParcelizer = authRepository;
        this.serializer = isUserAuthenticatedWrapper;
    }

    public void read(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0) {
        int i = 2 % 2;
        int i2 = read + 1;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executeAsOneOrNull executeasoneornull = (executeAsOneOrNull) ((AppEventInfoChangeHandler) this.IconCompatParcelizer).MediaDescriptionCompat.get();
        if (executeasoneornull != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(executeasoneornull.IconCompatParcelizer, "brand");
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(executeasoneornull.MediaMetadataCompat.serializer, PushNotificationParserObj.COUNTRY_KEY);
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(ModuleDSLKt.read((Application) this.serializer).toString(), "device_class");
            int i4 = read + 47;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public InitializeAppStartupItemsImpl(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, TextUnitType textUnitType) {
        this.RemoteActionCompatParcelizer = 8;
        getpivotoffsetf1c5bw0.getClass();
        textUnitType.getClass();
        this.IconCompatParcelizer = getpivotoffsetf1c5bw0;
        this.serializer = textUnitType;
    }

    public InitializeAppStartupItemsImpl(undelegateUnprotectedui undelegateunprotectedui, getContentViewGroupParentLayout getcontentviewgroupparentlayout, inCompatibilityMode incompatibilitymode) {
        this.RemoteActionCompatParcelizer = 0;
        undelegateunprotectedui.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = undelegateunprotectedui;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public InitializeAppStartupItemsImpl(addSemanticsPropertiesFrom addsemanticspropertiesfrom, Application application) {
        this.RemoteActionCompatParcelizer = 2;
        addsemanticspropertiesfrom.getClass();
        application.getClass();
        this.IconCompatParcelizer = addsemanticspropertiesfrom;
        this.serializer = application;
    }

    public InitializeAppStartupItemsImpl(getBulletListSettingStackui_text getbulletlistsettingstackui_text, accessgetRelativecp accessgetrelativecp) {
        this.RemoteActionCompatParcelizer = 11;
        getbulletlistsettingstackui_text.getClass();
        accessgetrelativecp.getClass();
        this.IconCompatParcelizer = getbulletlistsettingstackui_text;
        this.serializer = accessgetrelativecp;
    }

    public InitializeAppStartupItemsImpl(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = 9;
        selfServiceCustomerChatRepositoryImpl.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = selfServiceCustomerChatRepositoryImpl;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public InitializeAppStartupItemsImpl(CreateHomeScope createHomeScope, inCompatibilityMode incompatibilitymode, getContentViewGroupParentLayout getcontentviewgroupparentlayout, subscribeToChangeUserEventslambda3 subscribetochangeusereventslambda3) {
        this.RemoteActionCompatParcelizer = 1;
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = createHomeScope;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public InitializeAppStartupItemsImpl(lineEndToVisibleEnd lineendtovisibleend, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1) {
        this.RemoteActionCompatParcelizer = 16;
        lineendtovisibleend.getClass();
        this.IconCompatParcelizer = lineendtovisibleend;
        this.serializer = semanticsPropertiesLinkTestMarker1;
    }

    public InitializeAppStartupItemsImpl(FontVariationSettingInt fontVariationSettingInt, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 18;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = fontVariationSettingInt;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public InitializeAppStartupItemsImpl(onCapabilitiesChanged oncapabilitieschanged, FontVariationSettingInt fontVariationSettingInt) {
        this.RemoteActionCompatParcelizer = 19;
        fontVariationSettingInt.getClass();
        this.IconCompatParcelizer = oncapabilitieschanged;
        this.serializer = fontVariationSettingInt;
    }

    public InitializeAppStartupItemsImpl(publishErrorlambda1 publisherrorlambda1, isHiddenannotations ishiddenannotations) {
        this.RemoteActionCompatParcelizer = 5;
        publisherrorlambda1.getClass();
        this.IconCompatParcelizer = publisherrorlambda1;
        this.serializer = ishiddenannotations;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX INFO: renamed from: getRoutePreview-BWLJW6A, reason: not valid java name */
    public Object m4857getRoutePreviewBWLJW6A(boolean z, AndroidViewHolderlayoutNode12 androidViewHolderlayoutNode12, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k, ContinuationImpl continuationImpl) {
        NaverRoutePreviewRepository$getRoutePreview$1 naverRoutePreviewRepository$getRoutePreview$1;
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boolean z2 = continuationImpl instanceof NaverRoutePreviewRepository$getRoutePreview$1;
            throw null;
        }
        if (continuationImpl instanceof NaverRoutePreviewRepository$getRoutePreview$1) {
            naverRoutePreviewRepository$getRoutePreview$1 = (NaverRoutePreviewRepository$getRoutePreview$1) continuationImpl;
            int i3 = naverRoutePreviewRepository$getRoutePreview$1.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = read + 11;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    naverRoutePreviewRepository$getRoutePreview$1.RemoteActionCompatParcelizer = i3 >> Integer.MIN_VALUE;
                } else {
                    naverRoutePreviewRepository$getRoutePreview$1.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
                }
            } else {
                naverRoutePreviewRepository$getRoutePreview$1 = new NaverRoutePreviewRepository$getRoutePreview$1(this, continuationImpl);
            }
        } else {
            naverRoutePreviewRepository$getRoutePreview$1 = new NaverRoutePreviewRepository$getRoutePreview$1(this, continuationImpl);
        }
        NaverRoutePreviewRepository$getRoutePreview$1 naverRoutePreviewRepository$getRoutePreview$2 = naverRoutePreviewRepository$getRoutePreview$1;
        Object obj = naverRoutePreviewRepository$getRoutePreview$2.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = naverRoutePreviewRepository$getRoutePreview$2.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
        SelfieFlowRepository$uploadSelfie$2 selfieFlowRepository$uploadSelfie$2 = new SelfieFlowRepository$uploadSelfie$2(this, androidViewHolderlayoutNode12, r8lambdaerwhggzq_gqgn8cultnvrcshm8k, z, null, 3);
        naverRoutePreviewRepository$getRoutePreview$2.RemoteActionCompatParcelizer = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(selfieFlowRepository$uploadSelfie$2, naverRoutePreviewRepository$getRoutePreview$2);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i6 = write + 39;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return coroutineSingletons;
    }

    public InitializeAppStartupItemsImpl(LayoutCompat layoutCompat, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 29;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = layoutCompat;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public InitializeAppStartupItemsImpl(zzz zzzVar, accessgetOldDependencyp accessgetolddependencyp) {
        this.RemoteActionCompatParcelizer = 12;
        zzzVar.getClass();
        accessgetolddependencyp.getClass();
        this.IconCompatParcelizer = zzzVar;
        this.serializer = accessgetolddependencyp;
    }

    public static SingleUnsubscribeOn IconCompatParcelizer(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, String str, Long l, int i) {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = write;
        int i5 = i4 + 121;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if ((i & 1) != 0) {
            int i7 = i4 + 13;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i9 = i4 + 29;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            l = null;
        }
        SharedFlowImpl sharedFlowImpl = ((ChatDeliveryRepositoryImpl) ((TextUnitType) initializeAppStartupItemsImpl.serializer)).RemoteActionCompatParcelizer;
        r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[] r8lambdaxxy0icvbkqrejyjmjwchaqi7z4Arr = onBackStartedlambda1.serializer;
        r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog r8lambdaw8l8p7bwyb0wtwnko8kzqkdckog = new r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog(sharedFlowImpl, prepareForActivityTransitionCarryover.read.plus(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write));
        int i11 = Flowable.write;
        SingleMap singleMap = new SingleMap(new FlowableElementAtSingle(new FlowableFromPublisher(r8lambdaw8l8p7bwyb0wtwnko8kzqkdckog), null), new RetryWithDelay$$ExternalSyntheticLambda1(i2, new SessionDao_Impl$$ExternalSyntheticLambda1(str, 11, l)));
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) ((getPivotOffsetF1C5BW0) initializeAppStartupItemsImpl.IconCompatParcelizer);
        SingleUnsubscribeOn singleUnsubscribeOn = new SingleUnsubscribeOn(singleMap.write(androidScheduleProvider.IconCompatParcelizer()), androidScheduleProvider.IconCompatParcelizer());
        int i12 = write + 69;
        read = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return singleUnsubscribeOn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: getAutoAcceptEarnings-gIAlu-s, reason: not valid java name */
    public Object m4856getAutoAcceptEarningsgIAlus(String str, ContinuationImpl continuationImpl) {
        AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1 autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        int i2 = read + 57;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1) {
            autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1 = (AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1) continuationImpl;
            int i4 = autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.read = i4 - Integer.MIN_VALUE;
            } else {
                autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1 = new AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1(this, continuationImpl);
                int i5 = read + 55;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1 = new AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1(this, continuationImpl);
            int i7 = read + 55;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 12);
            autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.read = 1;
            objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(authRepository$logoutUser$2, autoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        return thSerializer == null ? (copyCXVQc50default) objM4875invokegIAlus : new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer));
    }

    public toRange write(BlockRunner blockRunner, toAnnotatedString toannotatedstring, BufferedOutputStream bufferedOutputStream, boolean z, boolean z2, String str) {
        boolean zIsEqual;
        accessgetRelativecp accessgetrelativecp;
        int i;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        int i2 = 2 % 2;
        int i3 = write + 121;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            toannotatedstring.write();
            throw null;
        }
        String strWrite = toannotatedstring.write();
        if (strWrite == null) {
            zIsEqual = false;
        } else {
            Charset charset = ensureSubscribedToInAppMessageEvents.write;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            byte[] bytes2 = strWrite.getBytes(charset);
            bytes2.getClass();
            zIsEqual = MessageDigest.isEqual(bytes, bytes2);
        }
        if (!(!zIsEqual)) {
            try {
                return serializer(blockRunner, toannotatedstring, bufferedOutputStream, z, z2);
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to serve authenticated asset for ".concat(toannotatedstring.MediaDescriptionCompat()), new Object[0]);
                return new getItem(toannotatedstring.MediaDescriptionCompat());
            }
        }
        int i4 = read + 51;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            accessgetrelativecp = (accessgetRelativecp) this.serializer;
            i = 7573;
            str2 = "Not Found";
            str3 = "text/plain";
            j = 0;
            str4 = null;
            str5 = "no-cache";
        } else {
            accessgetrelativecp = (accessgetRelativecp) this.serializer;
            i = 404;
            str2 = "Not Found";
            str3 = "text/plain";
            j = 0;
            str4 = null;
            str5 = "no-cache";
        }
        accessgetrelativecp.serializer(bufferedOutputStream, i, str2, str3, j, str4, z, str5, null);
        return fromRange.write;
    }

    public getWidthXSAIIZE serializer(String str, Bullet bullet, accessgetDefaultSizecp accessgetdefaultsizecp) {
        int i = 2 % 2;
        String strRemoteActionCompatParcelizer = bullet.RemoteActionCompatParcelizer();
        String str2 = ((DateTimeFormatter) ((zzz) this.IconCompatParcelizer).serializer).format(Instant.now());
        str2.getClass();
        getPaddingXSAIIZE getpaddingxsaiize = new getPaddingXSAIIZE(bullet.write());
        accessgetDefaultPaddingcp accessgetdefaultpaddingcp = new accessgetDefaultPaddingcp(bullet.read(), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("sent_from", "mobile_sdk"), new onViewAttachedToWindowlambda0("user_type", "rider")));
        String strSerializer = bullet.serializer();
        Map mapSingletonMap = Collections.singletonMap("source", "native_wrapper");
        mapSingletonMap.getClass();
        BulletCompanion bulletCompanion = new BulletCompanion(strSerializer, mapSingletonMap);
        ((accessgetOldDependencyp) this.serializer).getClass();
        getDrawStyle getdrawstyle = new getDrawStyle(1);
        String strM = d$$ExternalSyntheticOutline0.m();
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.put("event_version", "1");
        Object obj = null;
        if (accessgetdefaultsizecp != null) {
            int i2 = write + 49;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        getWidthXSAIIZE getwidthxsaiize = new getWidthXSAIIZE(strRemoteActionCompatParcelizer, str2, new copyw_4Rhrw(strM, str, safesetcliptooutline.IconCompatParcelizer()), getdrawstyle, bulletCompanion, getpaddingxsaiize, accessgetdefaultpaddingcp);
        int i3 = write + 97;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return getwidthxsaiize;
        }
        obj.hashCode();
        throw null;
    }

    public toRange serializer(BlockRunner blockRunner, toAnnotatedString toannotatedstring, BufferedOutputStream bufferedOutputStream, boolean z, boolean z2) throws IOException {
        String strWrite;
        String str;
        int i = 2 % 2;
        getDefaultSizeXSAIIZE getdefaultsizexsaiizeIconCompatParcelizer = ((getBulletListSettingStackui_text) this.IconCompatParcelizer).IconCompatParcelizer(blockRunner, toannotatedstring.MediaDescriptionCompat(), toannotatedstring.MediaMetadataCompat());
        if (getdefaultsizexsaiizeIconCompatParcelizer == null || !getdefaultsizexsaiizeIconCompatParcelizer.write().exists()) {
            ((accessgetRelativecp) this.serializer).serializer(bufferedOutputStream, 404, "Not Found", "text/plain", 0L, null, z, "no-cache", null);
            getItem getitem = new getItem(toannotatedstring.MediaDescriptionCompat());
            int i2 = read + 121;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
            return getitem;
        }
        boolean zEquals = getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer().equals("text/html");
        toRangedefault torangedefault = toRangedefault.read;
        if (!zEquals) {
            String str2 = (String) ((HashMap) toannotatedstring.IconCompatParcelizer()).get(HttpHeaders.IF_NONE_MATCH);
            Object obj = null;
            if (str2 != null) {
                int i4 = read + 61;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                strWrite = hideCurrentlyDisplayingInAppMessage.write(str2, '\"');
            } else {
                int i6 = read + 15;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                strWrite = null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strWrite, getdefaultsizexsaiizeIconCompatParcelizer.write().getName()}, getCieXyz.write())).booleanValue()) {
                int i8 = write + 103;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer();
                    getdefaultsizexsaiizeIconCompatParcelizer.write().getName();
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer(), "text/html"}, getCieXyz.write())).booleanValue();
                    obj.hashCode();
                    throw null;
                }
                accessgetRelativecp accessgetrelativecp = (accessgetRelativecp) this.serializer;
                String strIconCompatParcelizer = getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer();
                String name = getdefaultsizexsaiizeIconCompatParcelizer.write().getName();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer(), "text/html"}, getCieXyz.write())).booleanValue()) {
                    int i9 = read + 35;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    str = "no-cache";
                } else {
                    str = "public, max-age=31536000, immutable";
                }
                accessgetrelativecp.serializer(bufferedOutputStream, 304, "Not Modified", strIconCompatParcelizer, 0L, name, z, str, null);
                return torangedefault;
            }
        }
        if (getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer().equals("text/html")) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Entry HTML request reached the LOCAL WEB SERVER — blocking it: ".concat(toannotatedstring.MediaDescriptionCompat()), new Object[0]);
            ((accessgetRelativecp) this.serializer).serializer(bufferedOutputStream, 404, "Not Found", "text/plain", 0L, null, z, "no-cache", null);
            AnnotatedStringBuilderMutableRangeCompanion annotatedStringBuilderMutableRangeCompanion = new AnnotatedStringBuilderMutableRangeCompanion(toannotatedstring.MediaDescriptionCompat());
            int i11 = write + 31;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return annotatedStringBuilderMutableRangeCompanion;
        }
        ((accessgetRelativecp) this.serializer).serializer(bufferedOutputStream, 200, "OK", getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer(), getdefaultsizexsaiizeIconCompatParcelizer.write().length(), getdefaultsizexsaiizeIconCompatParcelizer.write().getName(), z, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getdefaultsizexsaiizeIconCompatParcelizer.IconCompatParcelizer(), "text/html"}, getCieXyz.write())).booleanValue() ? "no-cache" : "public, max-age=31536000, immutable", null);
        if (!z2) {
            return torangedefault;
        }
        File fileWrite = getdefaultsizexsaiizeIconCompatParcelizer.write();
        FileInputStream fileInputStreamWrite = getActiveFocusTargetNode.write(fileWrite, new FileInputStream(fileWrite));
        try {
            SentryUUID.RemoteActionCompatParcelizer(fileInputStreamWrite, bufferedOutputStream);
            fileInputStreamWrite.close();
            return torangedefault;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamWrite, th}, sourceInformationContextOfdefault.read());
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x019f  */
    /* JADX WARN: Code duplicated, block: B:143:0x022e  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:184:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0208, code lost:
    
        if (r0.activateFromDisk(r4, r3) == r7) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.appinitialize.InitializeAppStartupItemsImpl.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Removed unreachable split cross block B:105:0x01bd */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public pushUrlAnnotation write(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream, BlockRunner blockRunner, String str) {
        Object isitemdismissable;
        boolean z;
        Object isitemdismissable2;
        String path;
        HashMap map;
        int i;
        int length;
        int i2 = 2 % 2;
        ((ImageHeaderParserImageType) this.IconCompatParcelizer).getClass();
        Serializable serializableSerializer = ImageHeaderParserImageType.serializer(bufferedInputStream);
        Throwable thSerializer = onItemDismiss.serializer(serializableSerializer);
        Object obj = null;
        ?? r7 = 0;
        if (thSerializer == null) {
            int i3 = write + 85;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str2 = (String) serializableSerializer;
            if (str2.length() == 0) {
                isitemdismissable = new isItemDismissable(new EOFException("Client closed connection before sending a request line"));
            } else {
                List listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str2, new char[]{' '});
                if (listRemoteActionCompatParcelizer.size() < 3) {
                    isitemdismissable = new isItemDismissable(new IOException("Malformed request line"));
                } else {
                    String str3 = (String) listRemoteActionCompatParcelizer.get(0);
                    String str4 = (String) listRemoteActionCompatParcelizer.get(1);
                    String str5 = (String) listRemoteActionCompatParcelizer.get(2);
                    String str6 = "/";
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str4, "/", false)) {
                        try {
                            try {
                                path = new URI(str4).getPath();
                                if (path != null) {
                                    int i5 = read + 5;
                                    write = i5 % Fields.SpotShadowColor;
                                    if (i5 % 2 == 0) {
                                        int i6 = 34 / 0;
                                        if (path.length() == 0) {
                                            path = "/";
                                        }
                                    } else if (path.length() == 0) {
                                        path = "/";
                                    }
                                } else {
                                    path = "/";
                                }
                                while (true) {
                                    Serializable serializableSerializer2 = ImageHeaderParserImageType.serializer(bufferedInputStream);
                                    Throwable thSerializer2 = onItemDismiss.serializer(serializableSerializer2);
                                    if (thSerializer2 != null) {
                                        isitemdismissable = new isItemDismissable(thSerializer2);
                                        break;
                                    }
                                    String str7 = (String) serializableSerializer2;
                                    if (str7.length() == 0) {
                                        isitemdismissable = new toAnnotatedString(str3, str6, str5, map);
                                        break;
                                    }
                                    i++;
                                    if (i > 32) {
                                        isitemdismissable = new isItemDismissable(new IOException("Request has more than 32 header lines"));
                                        break;
                                    }
                                    length += str7.length();
                                    if (length > 16384) {
                                        isitemdismissable = new isItemDismissable(new IOException("Request headers exceed 16384 bytes"));
                                        break;
                                    }
                                    int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str7, ':', (int) r7, (boolean) r7, 6);
                                    if (iWrite > 0) {
                                        String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str7.substring(r7, iWrite)).toString();
                                        Locale locale = Locale.US;
                                        locale.getClass();
                                        String lowerCase = string.toLowerCase(locale);
                                        lowerCase.getClass();
                                        map.put(lowerCase, hideCurrentlyDisplayingInAppMessage.read((CharSequence) str7.substring(iWrite + 1)).toString());
                                    }
                                    r7 = 0;
                                }
                            } catch (URISyntaxException unused) {
                            }
                            String path2 = new URI(null, null, path, null).normalize().getPath();
                            if (path2 == null || path2.length() == 0) {
                                path2 = "/";
                            }
                            List listRemoteActionCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(path2, new char[]{'/'});
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listRemoteActionCompatParcelizer2) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj2, ".."}, getCieXyz.write())).booleanValue()) {
                                    arrayList.add(obj2);
                                }
                            }
                            String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList, "/", null, null, null, 62);
                            if (strIconCompatParcelizer.length() == 0) {
                                int i7 = write + 23;
                                read = i7 % Fields.SpotShadowColor;
                                if (i7 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                            } else {
                                str6 = strIconCompatParcelizer;
                            }
                        } catch (URISyntaxException unused2) {
                        }
                        map = new HashMap();
                        i = 0;
                        length = 0;
                    } else {
                        isitemdismissable = new isItemDismissable(new IOException("Request target must be origin-form"));
                    }
                }
            }
        } else {
            isItemDismissable isitemdismissable3 = new isItemDismissable(thSerializer);
            int i8 = read + 115;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            isitemdismissable = isitemdismissable3;
        }
        Throwable thSerializer3 = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer3 != null) {
            return new AnnotatedStringBuilderMutableRange(thSerializer3);
        }
        toAnnotatedString toannotatedstring = (toAnnotatedString) isitemdismissable;
        if (toannotatedstring.RatingCompat()) {
            int i10 = write + 111;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                toannotatedstring.serializer();
                throw null;
            }
            if (toannotatedstring.serializer()) {
                z = false;
            } else {
                int i11 = write + 19;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (!toannotatedstring.read()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) this.serializer;
        initializeAppStartupItemsImpl.getClass();
        try {
            boolean z2 = toannotatedstring.read();
            isitemdismissable2 = fromRange.write;
            if (z2) {
                ((accessgetRelativecp) initializeAppStartupItemsImpl.serializer).serializer(bufferedOutputStream, 400, "Bad Request", "text/plain", 0L, null, false, "no-cache", null);
            } else {
                String strRemoteActionCompatParcelizer = toannotatedstring.RemoteActionCompatParcelizer();
                Locale locale2 = Locale.US;
                locale2.getClass();
                String upperCase = strRemoteActionCompatParcelizer.toUpperCase(locale2);
                upperCase.getClass();
                if (upperCase.equals("GET") || upperCase.equals("HEAD")) {
                    isitemdismissable2 = initializeAppStartupItemsImpl.write(blockRunner, toannotatedstring, bufferedOutputStream, z, setCarryoverInAppMessage.serializer(toannotatedstring.RemoteActionCompatParcelizer(), "GET", true), str);
                } else {
                    ((accessgetRelativecp) initializeAppStartupItemsImpl.serializer).serializer(bufferedOutputStream, 405, "Method Not Allowed", "text/plain", 0L, null, z, "no-cache", "GET, HEAD");
                }
            }
        } catch (Exception e) {
            isitemdismissable2 = new isItemDismissable(e);
        }
        Throwable thSerializer4 = onItemDismiss.serializer(isitemdismissable2);
        return thSerializer4 == null ? new getBuilderui_text(z, (toRange) isitemdismissable2) : new withBulletListItem(thSerializer4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public Object invoke(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g r8lambdavhx3byhz27ugwu4v_xslnk2u6g;
        int i = 2 % 2;
        if (!(!(continuationImpl instanceof r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g))) {
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g = (r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g) continuationImpl;
            int i2 = r8lambdavhx3byhz27ugwu4v_xslnk2u6g.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = read + 13;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                r8lambdavhx3byhz27ugwu4v_xslnk2u6g.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                r8lambdavhx3byhz27ugwu4v_xslnk2u6g = new r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g(this, continuationImpl);
            }
        } else {
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g = new r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g(this, continuationImpl);
        }
        r8lambdaVhx3BYhz27UgWu4V_XSlNK2u6g r8lambdavhx3byhz27ugwu4v_xslnk2u6g2 = r8lambdavhx3byhz27ugwu4v_xslnk2u6g;
        Object objInvoke = r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) this.IconCompatParcelizer;
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.serializer = str;
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.IconCompatParcelizer = str2;
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.read = str3;
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.write = str4;
            r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.RemoteActionCompatParcelizer = 1;
            objInvoke = initializeAppStartupItemsImpl.invoke(r8lambdavhx3byhz27ugwu4v_xslnk2u6g2);
            if (objInvoke == coroutineSingletons) {
                int i6 = write + 77;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 2;
                }
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = read + 1;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return objInvoke;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            int i9 = 89 / 0;
            return objInvoke;
        }
        str4 = r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.write;
        str3 = r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.read;
        str2 = r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.IconCompatParcelizer;
        str = r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (!((Boolean) objInvoke).booleanValue()) {
            return JvmAnnotatedString_jvmAndAndroidKt.read;
        }
        GetChatAssetDownloadAction getChatAssetDownloadAction = (GetChatAssetDownloadAction) this.serializer;
        r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.serializer = null;
        r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.IconCompatParcelizer = null;
        r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.read = null;
        r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.write = null;
        r8lambdavhx3byhz27ugwu4v_xslnk2u6g2.RemoteActionCompatParcelizer = 2;
        Object objInvoke2 = getChatAssetDownloadAction.invoke(str5, str6, str7, str8, r8lambdavhx3byhz27ugwu4v_xslnk2u6g2);
        if (objInvoke2 != coroutineSingletons) {
            int i10 = write + 43;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return objInvoke2;
            }
            throw null;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[RETURN] */
    public Object invoke(String str, ContinuationImpl continuationImpl) {
        copyF3nL8kk copyf3nl8kk;
        accesslayoutAccordingTo accesslayoutaccordingto;
        accesslayoutAccordingTo accesslayoutaccordingto2;
        int i = 2 % 2;
        if (continuationImpl instanceof copyF3nL8kk) {
            int i2 = read + 33;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            copyf3nl8kk = (copyF3nL8kk) continuationImpl;
            int i4 = copyf3nl8kk.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 5;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    copyf3nl8kk.write = i4 >> Integer.MIN_VALUE;
                } else {
                    copyf3nl8kk.write = i4 - Integer.MIN_VALUE;
                }
            } else {
                copyf3nl8kk = new copyF3nL8kk(this, continuationImpl);
            }
        } else {
            copyf3nl8kk = new copyF3nL8kk(this, continuationImpl);
        }
        Object obj = copyf3nl8kk.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = copyf3nl8kk.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accesslayoutaccordingto = new accesslayoutAccordingTo(str, onItemDismiss.serializer(str));
            if (str != null) {
                StateDataStoreImpl stateDataStoreImpl = (StateDataStoreImpl) this.serializer;
                copyf3nl8kk.IconCompatParcelizer = accesslayoutaccordingto;
                copyf3nl8kk.write = 1;
                if (stateDataStoreImpl.storeState(str, copyf3nl8kk) != coroutineSingletons) {
                    accesslayoutaccordingto2 = accesslayoutaccordingto;
                }
            } else {
                accessrequireViewFactoryHolder accessrequireviewfactoryholder = (accessrequireViewFactoryHolder) this.IconCompatParcelizer;
                Throwable th = accesslayoutaccordingto.read;
                copyf3nl8kk.IconCompatParcelizer = null;
                copyf3nl8kk.write = 2;
                ((StateProviderImpl) accessrequireviewfactoryholder).PlaybackStateCompatCustomAction.emit(th, copyf3nl8kk);
                if (createfromparcel != coroutineSingletons) {
                    return createfromparcel;
                }
            }
            return coroutineSingletons;
        }
        if (i6 != 1) {
            int i7 = write;
            int i8 = i7 + 89;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i6 != 2 : i6 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 65;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        accesslayoutaccordingto2 = copyf3nl8kk.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        accesslayoutaccordingto = accesslayoutaccordingto2;
        accessrequireViewFactoryHolder accessrequireviewfactoryholder2 = (accessrequireViewFactoryHolder) this.IconCompatParcelizer;
        Throwable th2 = accesslayoutaccordingto.read;
        copyf3nl8kk.IconCompatParcelizer = null;
        copyf3nl8kk.write = 2;
        ((StateProviderImpl) accessrequireviewfactoryholder2).PlaybackStateCompatCustomAction.emit(th2, copyf3nl8kk);
        if (createfromparcel != coroutineSingletons) {
            return coroutineSingletons;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030 A[PHI: r1 r3
  0x0030: PHI (r1v7 com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) = 
  (r1v6 com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl)
  (r1v23 com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl)
 binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v9 java.lang.String) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    public boolean serializer() {
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        String strSerializer;
        int i;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = read + 19;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.serializer);
            strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
            int i5 = 34 / 0;
            if (strSerializer != null) {
                if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_ACTIONABLE_CUSTOMER_CHAT_NOTIFICATION_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                    if (((setRoundRectOutlineTNW_H78) ((Gen2FunWithFlagsConfigRepository) ((GraphicsLayerCompanion) this.IconCompatParcelizer).write).serializer(setRectOutlinetz77jQw.write, displayInAppMessagelambda1.serializer(setRoundRectOutlineTNW_H78.class))) == setRoundRectOutlineTNW_H78.TREATMENT_1) {
                        i = read + 103;
                        int i6 = i % Fields.SpotShadowColor;
                        write = i6;
                        if (i % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        i2 = i6 + 29;
                        read = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i7 = 47 / 0;
                        }
                        return z;
                    }
                }
            }
        } else {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.serializer);
            strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
            if (strSerializer != null) {
                if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_ACTIONABLE_CUSTOMER_CHAT_NOTIFICATION_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                    if (((setRoundRectOutlineTNW_H78) ((Gen2FunWithFlagsConfigRepository) ((GraphicsLayerCompanion) this.IconCompatParcelizer).write).serializer(setRectOutlinetz77jQw.write, displayInAppMessagelambda1.serializer(setRoundRectOutlineTNW_H78.class))) == setRoundRectOutlineTNW_H78.TREATMENT_1) {
                        i = read + 103;
                        int i8 = i % Fields.SpotShadowColor;
                        write = i8;
                        if (i % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        i2 = i8 + 29;
                        read = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            int i9 = 47 / 0;
                        }
                        return z;
                    }
                }
            }
        }
        return false;
    }
}
