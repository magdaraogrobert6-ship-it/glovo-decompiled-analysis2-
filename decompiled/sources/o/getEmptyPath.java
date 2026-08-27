package o;

import android.content.Context;
import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class getEmptyPath extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final getEmptyPath ComponentActivity;
    public static final getEmptyPath IconCompatParcelizer;
    public static final getEmptyPath MediaBrowserCompatMediaItem;
    public static final getEmptyPath MediaDescriptionCompat;
    public static final getEmptyPath MediaMetadataCompat;
    public static final getEmptyPath MediaSessionCompatQueueItem;
    public static final getEmptyPath MediaSessionCompatResultReceiverWrapper;
    public static final getEmptyPath MediaSessionCompatToken;
    public static final getEmptyPath ParcelableVolumeInfo;
    public static final getEmptyPath PlaybackStateCompat;
    public static final getEmptyPath PlaybackStateCompatCustomAction;
    public static final getEmptyPath RatingCompat;
    public static final getEmptyPath RemoteActionCompatParcelizer;
    public static final getEmptyPath ResultReceiver;
    public static final getEmptyPath r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final getEmptyPath r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final getEmptyPath read;
    public static final getEmptyPath serializer;
    public static final getEmptyPath write;
    public final /* synthetic */ int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getEmptyPath(int i, int i2) {
        super(i);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws accessstartTrackingTable {
        switch (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            case 0:
                Scope scope = (Scope) obj;
                scope.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new getSizeNHjbRcui((setOutlineAmbientShadowColor) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null));
            case 1:
                Scope scope2 = (Scope) obj;
                scope2.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = com.deliveryhero.chatsdk.provider.Provider.INSTANCE.getClient$customerchat_release().read();
                try {
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer = new getAppropriateImageUrl(new File(((Context) scope2.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(Context.class), null)).getCacheDir(), "http_cache"), 52428800L);
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new com.deliveryhero.chatsdk.network.http.UserAgentHeaderInterceptor((applyLayoutDirection) scope2.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null)));
                    getClassLogTag getclasslogtag = new getClassLogTag(0);
                    r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig = r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY;
                    r8lambdachmlgysnqdplvu9y_ksrct5sdig.getClass();
                    getclasslogtag.RemoteActionCompatParcelizer = r8lambdachmlgysnqdplvu9y_ksrct5sdig;
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(getclasslogtag);
                    r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                    getIdentifiersValidationsEnabled defaultRetrofitBuilder = com.deliveryhero.chatsdk.provider.RetrofitBuilderKt.getDefaultRetrofitBuilder();
                    defaultRetrofitBuilder.getClass();
                    defaultRetrofitBuilder.read = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
                    return (PathNodeCurveTo) defaultRetrofitBuilder.write().write(PathNodeCurveTo.class);
                } catch (Exception unused) {
                    throw new accessstartTrackingTable("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 11);
                }
            case 2:
                Scope scope3 = (Scope) obj;
                scope3.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2 = com.deliveryhero.chatsdk.provider.Provider.INSTANCE.getClient$customerchat_release().read();
                getClassLogTag getclasslogtag2 = new getClassLogTag(0);
                r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig2 = r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY;
                r8lambdachmlgysnqdplvu9y_ksrct5sdig2.getClass();
                getclasslogtag2.RemoteActionCompatParcelizer = r8lambdachmlgysnqdplvu9y_ksrct5sdig2;
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(getclasslogtag2);
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new com.deliveryhero.chatsdk.network.http.HelpCenterHttpAuthInterceptor((setOutlineAmbientShadowColor) scope3.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (onImageAvailable) scope3.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null)));
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new com.deliveryhero.chatsdk.network.http.UserAgentHeaderInterceptor((applyLayoutDirection) scope3.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null)));
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2.IconCompatParcelizer = new com.deliveryhero.chatsdk.network.http.TokenRefreshAuthenticator((setOutlineAmbientShadowColor) scope3.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (onImageAvailable) scope3.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null));
                r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq2);
                getIdentifiersValidationsEnabled defaultRetrofitBuilder2 = com.deliveryhero.chatsdk.provider.RetrofitBuilderKt.getDefaultRetrofitBuilder();
                defaultRetrofitBuilder2.getClass();
                defaultRetrofitBuilder2.read = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1;
                return (PathNodeClose) defaultRetrofitBuilder2.write().write(PathNodeClose.class);
            case 3:
                Scope scope4 = (Scope) obj;
                scope4.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq3 = com.deliveryhero.chatsdk.provider.Provider.INSTANCE.getClient$customerchat_release().read();
                getClassLogTag getclasslogtag3 = new getClassLogTag(0);
                r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig r8lambdachmlgysnqdplvu9y_ksrct5sdig3 = r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY;
                r8lambdachmlgysnqdplvu9y_ksrct5sdig3.getClass();
                getclasslogtag3.RemoteActionCompatParcelizer = r8lambdachmlgysnqdplvu9y_ksrct5sdig3;
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(getclasslogtag3);
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new com.deliveryhero.chatsdk.network.http.HelpCenterHttpAuthInterceptor((setOutlineAmbientShadowColor) scope4.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (onImageAvailable) scope4.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null)));
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new com.deliveryhero.chatsdk.network.http.UserAgentHeaderInterceptor((applyLayoutDirection) scope4.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null)));
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq3.IconCompatParcelizer = new com.deliveryhero.chatsdk.network.http.TokenRefreshAuthenticator((setOutlineAmbientShadowColor) scope4.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (onImageAvailable) scope4.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null));
                r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg2 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq3);
                getIdentifiersValidationsEnabled defaultRetrofitBuilder3 = com.deliveryhero.chatsdk.provider.RetrofitBuilderKt.getDefaultRetrofitBuilder();
                defaultRetrofitBuilder3.getClass();
                defaultRetrofitBuilder3.read = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg2;
                return (VectorGroup) defaultRetrofitBuilder3.write().write(VectorGroup.class);
            case 4:
                Scope scope5 = (Scope) obj;
                scope5.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new invokekLtJ_vA((VectorGroup) scope5.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorGroup.class), null), (setOutlineAmbientShadowColor) scope5.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (isMoreThanHalf) scope5.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(isMoreThanHalf.class), null), (setOutlineSpotShadowColor) scope5.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null));
            case 5:
                Scope scope6 = (Scope) obj;
                scope6.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                setOutlineAmbientShadowColor setoutlineambientshadowcolor = (setOutlineAmbientShadowColor) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null);
                return new HelpcenterRemoteDataSourceImpl((setOutlineSpotShadowColor) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null), (PathNodeCurveTo) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(PathNodeCurveTo.class), null), (PathNodeClose) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(PathNodeClose.class), null), setoutlineambientshadowcolor, (getDefaultTintBlendMode) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getDefaultTintBlendMode.class), null), (ChatIdCacheHelper) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(ChatIdCacheHelper.class), null));
            case 6:
                Scope scope7 = (Scope) obj;
                scope7.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new ChatRepositoryImpl((isMoreThanHalf) scope7.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(isMoreThanHalf.class), null), (setOutlineSpotShadowColor) scope7.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null));
            case 7:
                Scope scope8 = (Scope) obj;
                scope8.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new VectorComposeKtPath23((setOutlineAmbientShadowColor) scope8.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null));
            case 8:
                Scope scope9 = (Scope) obj;
                scope9.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new VectorPainterKt((onImageAvailable) scope9.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null), (getAutoMirrorui) scope9.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getAutoMirrorui.class), null));
            case 9:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new getViewportSizeNHjbRcui();
            case 10:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new setAutoMirrorui();
            case 11:
                Scope scope10 = (Scope) obj;
                scope10.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new setNameui((setOutlineAmbientShadowColor) scope10.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null));
            case 12:
                Scope scope11 = (Scope) obj;
                scope11.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new getNameui((setOutlineAmbientShadowColor) scope11.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null));
            case 13:
                Scope scope12 = (Scope) obj;
                scope12.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new WebChatEventsTrackerImpl((com.deliveryhero.customerchat.eventTracking.AnalyticsImpl) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(com.deliveryhero.customerchat.eventTracking.AnalyticsImpl.class), null), (getDrawInvalidation) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getDrawInvalidation.class), null), (com.deliveryhero.customerchat.fwf.FeatureFlagProvider) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(com.deliveryhero.customerchat.fwf.FeatureFlagProvider.class), null), (setOutlineSpotShadowColor) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null));
            case 14:
                Scope scope13 = (Scope) obj;
                scope13.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new accesssetDrawInvalidation((createDropShadowPainter) scope13.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(createDropShadowPainter.class), null), (invalidateChildInParent) scope13.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(invalidateChildInParent.class), null));
            case 15:
                Scope scope14 = (Scope) obj;
                scope14.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                getInvalidateCallbackui getinvalidatecallbackui = (getInvalidateCallbackui) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getInvalidateCallbackui.class), null);
                getBitmapConfig_sVssgQui getbitmapconfig_svssgqui = (getBitmapConfig_sVssgQui) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getBitmapConfig_sVssgQui.class), null);
                return new WebChatViewmodel(getinvalidatecallbackui, (getAutoMirrorui) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getAutoMirrorui.class), null), (updateLayerProperties) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(updateLayerProperties.class), null), getbitmapconfig_svssgqui, (setOutlineSpotShadowColor) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null), (getVectorui) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getVectorui.class), null), (onImageAvailable) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null), (VectorPainter) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorPainter.class), null), (setOutlineAmbientShadowColor) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (setCompositionui) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setCompositionui.class), null), (GraphicsLayerImplCompanionDefaultDrawBlock1) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(GraphicsLayerImplCompanionDefaultDrawBlock1.class), null), (WebViewManager) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(WebViewManager.class), null), (GraphicsLayerKt) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(GraphicsLayerKt.class), null), (com.deliveryhero.customerchat.fwf.FeatureFlagProvider) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(com.deliveryhero.customerchat.fwf.FeatureFlagProvider.class), null), (obtainSizePxVpY3zN4) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(obtainSizePxVpY3zN4.class), null), (VectorComposeKtPath23) scope14.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorComposeKtPath23.class), null));
            case 16:
                Scope scope15 = (Scope) obj;
                scope15.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new ChatUrlProviderImpl((setOutlineAmbientShadowColor) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (VectorComposeKtPath28) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorComposeKtPath28.class), null), (getCompositionui) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getCompositionui.class), null), (VectorGroupiterator1) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorGroupiterator1.class), null), (accessgetOrDefaultjd) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(accessgetOrDefaultjd.class), null), (applyLayoutDirection) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null), (VectorPainter) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorPainter.class), null));
            case 17:
                Scope scope16 = (Scope) obj;
                scope16.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new WebViewManager((setOutlineAmbientShadowColor) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (getBitmapConfig_sVssgQui) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getBitmapConfig_sVssgQui.class), null), (accessgetOrDefaultjd) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(accessgetOrDefaultjd.class), null), (setOutlineSpotShadowColor) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null), (onImageAvailable) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null), new accessgetWcp(8), (rgbEqualOWjLjI) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(rgbEqualOWjLjI.class), null), (obtainSizePxVpY3zN4) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(obtainSizePxVpY3zN4.class), null), (VectorComposeKtPath23) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorComposeKtPath23.class), null));
            default:
                Scope scope17 = (Scope) obj;
                scope17.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new obtainSizePxVpY3zN4((getInvalidateCallbackui) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getInvalidateCallbackui.class), null), (setOutlineSpotShadowColor) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null), (setCompositionui) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setCompositionui.class), null), (onImageAvailable) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null), (VectorPainter) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(VectorPainter.class), null), (setOutlineAmbientShadowColor) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null));
        }
    }

    static {
        int i = 2;
        RemoteActionCompatParcelizer = new getEmptyPath(i, 1);
        PlaybackStateCompat = new getEmptyPath(i, i);
        PlaybackStateCompatCustomAction = new getEmptyPath(i, 3);
        ParcelableVolumeInfo = new getEmptyPath(i, 4);
        MediaSessionCompatResultReceiverWrapper = new getEmptyPath(i, 5);
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getEmptyPath(i, 6);
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new getEmptyPath(i, 7);
        ResultReceiver = new getEmptyPath(i, 8);
        read = new getEmptyPath(i, 0);
        ComponentActivity = new getEmptyPath(i, 9);
        write = new getEmptyPath(i, 10);
        serializer = new getEmptyPath(i, 11);
        IconCompatParcelizer = new getEmptyPath(i, 12);
        MediaDescriptionCompat = new getEmptyPath(i, 13);
        RatingCompat = new getEmptyPath(i, 14);
        MediaSessionCompatQueueItem = new getEmptyPath(i, 15);
        MediaMetadataCompat = new getEmptyPath(i, 16);
        MediaBrowserCompatMediaItem = new getEmptyPath(i, 17);
        MediaSessionCompatToken = new getEmptyPath(i, 18);
    }
}
