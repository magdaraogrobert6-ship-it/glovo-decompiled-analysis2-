package o;

import android.content.Context;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import io.sentry.util.UrlUtils;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewLayerContainer extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final ViewLayerContainer ComponentActivity;
    public static final ViewLayerContainer IconCompatParcelizer;
    public static final ViewLayerContainer MediaBrowserCompatMediaItem;
    public static final ViewLayerContainer MediaDescriptionCompat;
    public static final ViewLayerContainer MediaMetadataCompat;
    public static final ViewLayerContainer MediaSessionCompatQueueItem;
    public static final ViewLayerContainer MediaSessionCompatResultReceiverWrapper;
    public static final ViewLayerContainer MediaSessionCompatToken;
    public static final ViewLayerContainer ParcelableVolumeInfo;
    public static final ViewLayerContainer PlaybackStateCompat;
    public static final ViewLayerContainer PlaybackStateCompatCustomAction;
    public static final ViewLayerContainer RatingCompat;
    public static final ViewLayerContainer RemoteActionCompatParcelizer;
    public static final ViewLayerContainer ResultReceiver;
    public static final ViewLayerContainer r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final ViewLayerContainer r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final ViewLayerContainer r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final ViewLayerContainer r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public static final ViewLayerContainer r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public static final ViewLayerContainer r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public static final ViewLayerContainer r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public static final ViewLayerContainer r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public static final ViewLayerContainer r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public static final ViewLayerContainer r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public static final ViewLayerContainer r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public static final ViewLayerContainer r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public static final ViewLayerContainer read;
    public static final ViewLayerContainer serializer;
    public static final ViewLayerContainer write;
    public final /* synthetic */ int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewLayerContainer(int i, int i2) {
        super(i);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws accessstartTrackingTable {
        switch (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            case 0:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new GraphicsLayerImplCompanionDefaultDrawBlock1();
            case 1:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new createDropShadowPainter();
            case 2:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new getLayerOutlineProviderui_graphics();
            case 3:
                Scope scope = (Scope) obj;
                scope.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new GraphicsLayerImplCompanion((drawLayer) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(drawLayer.class), new removeCustomerProfileAttributesfwf_client_release("native")), (applyClip) scope.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyClip.class), null));
            case 4:
                Scope scope2 = (Scope) obj;
                scope2.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new GraphicsLayerKt((drawLayer) scope2.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(drawLayer.class), new removeCustomerProfileAttributesfwf_client_release("web")), (applyClip) scope2.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyClip.class), null));
            case 5:
                Scope scope3 = (Scope) obj;
                scope3.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                MediaSessionCompatQueueItem.serializer(scope3.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(component2NHjbRc.class), null));
                throw null;
            case 6:
                getTrackingServicefwf_client_release gettrackingservicefwf_client_release = (getTrackingServicefwf_client_release) obj2;
                ((Scope) obj).getClass();
                gettrackingservicefwf_client_release.getClass();
                return new GraphicsViewLayer((androidx.activity.result.ActivityResultRegistry) gettrackingservicefwf_client_release.RemoteActionCompatParcelizer(displayInAppMessagelambda1.serializer(androidx.activity.result.ActivityResultRegistry.class)));
            case 7:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new accessgetPlaceholderCanvascp();
            case 8:
                Scope scope4 = (Scope) obj;
                scope4.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                DelayKt.write(scope4);
                return new getSupportsSoftwareRendering();
            case 9:
                Scope scope5 = (Scope) obj;
                scope5.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new discardDisplayList(DelayKt.write(scope5));
            case 10:
                Scope scope6 = (Scope) obj;
                scope6.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl(DelayKt.write(scope6), (setOutlineSpotShadowColor) scope6.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null));
            case 11:
                Scope scope7 = (Scope) obj;
                scope7.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new GraphicsLayerImpl((calculateMatrix) scope7.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(calculateMatrix.class), null));
            case 12:
                Scope scope8 = (Scope) obj;
                scope8.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new requiresCompositingLayer((calculateMatrix) scope8.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(calculateMatrix.class), null), (setTopLeftgyyYBs) scope8.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setTopLeftgyyYBs.class), null));
            case 13:
                Scope scope9 = (Scope) obj;
                scope9.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.deliveryhero.chatui.domain.imageselection.usecase.CacheGalleryImageUseCaseImpl((calculateMatrix) scope9.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(calculateMatrix.class), null), (setTopLeftgyyYBs) scope9.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setTopLeftgyyYBs.class), null));
            case 14:
                Scope scope10 = (Scope) obj;
                scope10.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.deliveryhero.chatui.domain.imageselection.usecase.CacheGalleryImageUseCaseImpl((getHasDisplayList) scope10.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getHasDisplayList.class), null));
            case 15:
                Scope scope11 = (Scope) obj;
                scope11.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new toContentCaptureSession((setTopLeftgyyYBs) scope11.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setTopLeftgyyYBs.class), null), (getSupportsSoftwareRendering) scope11.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getSupportsSoftwareRendering.class), null));
            case 16:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.huawei.hmf.tasks.a.j(18);
            case 17:
                Scope scope12 = (Scope) obj;
                scope12.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.deliveryhero.customerchat.service.ChatService((setOutlineAmbientShadowColor) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (onImageAvailable) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null), (rgbEqualOWjLjI) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(rgbEqualOWjLjI.class), null), (setOutlineSpotShadowColor) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineSpotShadowColor.class), null), (WebViewManager) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(WebViewManager.class), null), (getDefaultTintBlendMode) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(getDefaultTintBlendMode.class), null), (ChatIdCacheHelper) scope12.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(ChatIdCacheHelper.class), null));
            case 18:
                Scope scope13 = (Scope) obj;
                scope13.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new setPositionH0pRuoY((onImageAvailable) scope13.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null));
            case 19:
                Scope scope14 = (Scope) obj;
                scope14.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(onbackinvokedlambda0Serializer, DefaultIoScheduler.RemoteActionCompatParcelizer));
            case 20:
                Scope scope15 = (Scope) obj;
                scope15.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.deliveryhero.chatui.view.root.CustomerChatViewModel((LayerSnapshotV21) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(LayerSnapshotV21.class), null), (rgbEqualOWjLjI) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(rgbEqualOWjLjI.class), null), (onImageAvailable) scope15.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(onImageAvailable.class), null));
            case 21:
                Scope scope16 = (Scope) obj;
                scope16.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new ViewLayerVerificationHelper28((Context) scope16.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(Context.class), null));
            case 22:
                Scope scope17 = (Scope) obj;
                scope17.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new LayerSnapshotImpl((ViewLayerVerificationHelper28) scope17.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(ViewLayerVerificationHelper28.class), null));
            case 23:
                ((Scope) obj).getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new setOutlineSpotShadowColor();
            case 24:
                Scope scope18 = (Scope) obj;
                scope18.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new com.deliveryhero.customerchat.fwf.FeatureFlagProvider((setOutlineAmbientShadowColor) scope18.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null), (clearCache) scope18.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(clearCache.class), null), (applyLayoutDirection) scope18.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(applyLayoutDirection.class), null), (isIdentityannotations) scope18.write(null, displayInAppMessagelambda1.serializer(isIdentityannotations.class), null));
            case 25:
                Scope scope19 = (Scope) obj;
                scope19.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                setOutlineAmbientShadowColor setoutlineambientshadowcolor = (setOutlineAmbientShadowColor) scope19.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(setOutlineAmbientShadowColor.class), null);
                r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0();
                getAccount getaccount = new getAccount(new getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations(new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8()));
                r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.read();
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new setHtmlPageFinishedListener(1, setoutlineambientshadowcolor));
                r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled.write("https://client-api.fwf.deliveryhero.net/v3/");
                getidentifiersvalidationsenabled.read = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1;
                getidentifiersvalidationsenabled.write(getaccount);
                Object objWrite = getidentifiersvalidationsenabled.write().write(clearCache.class);
                objWrite.getClass();
                return (clearCache) objWrite;
            case 26:
                Scope scope20 = (Scope) obj;
                scope20.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                MediaSessionCompatQueueItem.serializer(scope20.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(component2NHjbRc.class), null));
                throw null;
            case 27:
                Scope scope21 = (Scope) obj;
                scope21.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return enableVerboseLogging.IconCompatParcelizer((Context) scope21.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(Context.class), null));
            default:
                Scope scope22 = (Scope) obj;
                scope22.getClass();
                ((getTrackingServicefwf_client_release) obj2).getClass();
                return new obtainDropShadowRenderereZhPAX0((LayerSnapshotV21) scope22.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(LayerSnapshotV21.class), null));
        }
    }

    static {
        int i = 2;
        write = new ViewLayerContainer(i, 1);
        PlaybackStateCompatCustomAction = new ViewLayerContainer(i, i);
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new ViewLayerContainer(i, 3);
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ViewLayerContainer(i, 4);
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ViewLayerContainer(i, 5);
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new ViewLayerContainer(i, 6);
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new ViewLayerContainer(i, 7);
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new ViewLayerContainer(i, 8);
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new ViewLayerContainer(i, 9);
        serializer = new ViewLayerContainer(i, 10);
        RemoteActionCompatParcelizer = new ViewLayerContainer(i, 11);
        IconCompatParcelizer = new ViewLayerContainer(i, 12);
        MediaBrowserCompatMediaItem = new ViewLayerContainer(i, 13);
        MediaDescriptionCompat = new ViewLayerContainer(i, 14);
        RatingCompat = new ViewLayerContainer(i, 15);
        MediaSessionCompatQueueItem = new ViewLayerContainer(i, 16);
        MediaMetadataCompat = new ViewLayerContainer(i, 17);
        MediaSessionCompatResultReceiverWrapper = new ViewLayerContainer(i, 18);
        PlaybackStateCompat = new ViewLayerContainer(i, 19);
        MediaSessionCompatToken = new ViewLayerContainer(i, 20);
        read = new ViewLayerContainer(i, 0);
        ParcelableVolumeInfo = new ViewLayerContainer(i, 21);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ViewLayerContainer(i, 22);
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ViewLayerContainer(i, 23);
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new ViewLayerContainer(i, 24);
        ResultReceiver = new ViewLayerContainer(i, 25);
        ComponentActivity = new ViewLayerContainer(i, 26);
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new ViewLayerContainer(i, 27);
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ViewLayerContainer(i, 28);
    }
}
