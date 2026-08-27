package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl;
import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class toOpaque8_81llA extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final toOpaque8_81llA IconCompatParcelizer;
    public static final toOpaque8_81llA RemoteActionCompatParcelizer;
    public static final toOpaque8_81llA read;
    public static final toOpaque8_81llA serializer;
    public static final toOpaque8_81llA write;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ toOpaque8_81llA(int i, int i2) {
        super(i);
        this.MediaBrowserCompatMediaItem = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.MediaBrowserCompatMediaItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            syncClientfwf_client_release syncclientfwf_client_release = (syncClientfwf_client_release) obj;
            syncclientfwf_client_release.getClass();
            getEmptyPath getemptypath = getEmptyPath.read;
            getTimerfwf_client_release gettimerfwf_client_release = getTimerfwf_client_release.Singleton;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getSizeNHjbRcui.class);
            removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release = FwFClientaddFeatureKeys1.IconCompatParcelizer;
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, null, getemptypath, gettimerfwf_client_release);
            getSerializerfwf_client_release getserializerfwf_client_release = new getSerializerfwf_client_release(getexposurehandlerfwf_client_release);
            syncclientfwf_client_release.read(getserializerfwf_client_release);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2 = displayInAppMessagelambda1.serializer(getAutoMirrorui.class);
            getexposurehandlerfwf_client_release.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2);
            String strWrite = getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2, null, removecustomerprofileattributesfwf_client_release);
            HashMap map = syncclientfwf_client_release.write;
            map.put(strWrite, getserializerfwf_client_release);
            getEmptyPath getemptypath2 = getEmptyPath.ComponentActivity;
            getTimerfwf_client_release gettimerfwf_client_release2 = getTimerfwf_client_release.Factory;
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release2 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(getViewportSizeNHjbRcui.class), null, getemptypath2, gettimerfwf_client_release2);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release2);
            syncclientfwf_client_release.read(getmetricproviderfwf_client_release);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer3 = displayInAppMessagelambda1.serializer(getInvalidateCallbackui.class);
            getexposurehandlerfwf_client_release2.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release2.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer3);
            map.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer3, null, removecustomerprofileattributesfwf_client_release), getmetricproviderfwf_client_release);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release3 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(setAutoMirrorui.class), null, getEmptyPath.write, gettimerfwf_client_release2);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release2 = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release3);
            syncclientfwf_client_release.read(getmetricproviderfwf_client_release2);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer4 = displayInAppMessagelambda1.serializer(setCompositionui.class);
            getexposurehandlerfwf_client_release3.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release3.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer4);
            map.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer4, null, removecustomerprofileattributesfwf_client_release), getmetricproviderfwf_client_release2);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release4 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(setNameui.class), null, getEmptyPath.serializer, gettimerfwf_client_release2);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release3 = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release4);
            syncclientfwf_client_release.read(getmetricproviderfwf_client_release3);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer5 = displayInAppMessagelambda1.serializer(getVectorui.class);
            getexposurehandlerfwf_client_release4.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release4.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer5);
            map.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer5, null, removecustomerprofileattributesfwf_client_release), getmetricproviderfwf_client_release3);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release5 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(getNameui.class), null, getEmptyPath.IconCompatParcelizer, gettimerfwf_client_release2);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release4 = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release5);
            syncclientfwf_client_release.read(getmetricproviderfwf_client_release4);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer6 = displayInAppMessagelambda1.serializer(getCompositionui.class);
            getexposurehandlerfwf_client_release5.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release5.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer6);
            map.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer6, null, removecustomerprofileattributesfwf_client_release), getmetricproviderfwf_client_release4);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release6 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(WebChatEventsTrackerImpl.class), null, getEmptyPath.MediaDescriptionCompat, gettimerfwf_client_release2);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release5 = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release6);
            syncclientfwf_client_release.read(getmetricproviderfwf_client_release5);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer7 = displayInAppMessagelambda1.serializer(VectorPainter.class);
            getexposurehandlerfwf_client_release6.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release6.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer7);
            map.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer7, null, removecustomerprofileattributesfwf_client_release), getmetricproviderfwf_client_release5);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release7 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(accesssetDrawInvalidation.class), null, getEmptyPath.RatingCompat, gettimerfwf_client_release2);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release6 = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release7);
            syncclientfwf_client_release.read(getmetricproviderfwf_client_release6);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer8 = displayInAppMessagelambda1.serializer(getDrawInvalidation.class);
            getexposurehandlerfwf_client_release7.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release7.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer8);
            map.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer8, null, removecustomerprofileattributesfwf_client_release), getmetricproviderfwf_client_release6);
            return createfromparcel;
        }
        if (i == 1) {
            syncClientfwf_client_release syncclientfwf_client_release2 = (syncClientfwf_client_release) obj;
            syncclientfwf_client_release2.getClass();
            getEmptyPath getemptypath3 = getEmptyPath.RemoteActionCompatParcelizer;
            getTimerfwf_client_release gettimerfwf_client_release3 = getTimerfwf_client_release.Singleton;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer9 = displayInAppMessagelambda1.serializer(PathNodeCurveTo.class);
            removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release2 = FwFClientaddFeatureKeys1.IconCompatParcelizer;
            ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer9, null, getemptypath3, gettimerfwf_client_release3), syncclientfwf_client_release2);
            ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, displayInAppMessagelambda1.serializer(PathNodeClose.class), null, getEmptyPath.PlaybackStateCompat, gettimerfwf_client_release3), syncclientfwf_client_release2);
            ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, displayInAppMessagelambda1.serializer(VectorGroup.class), null, getEmptyPath.PlaybackStateCompatCustomAction, gettimerfwf_client_release3), syncclientfwf_client_release2);
            getEmptyPath getemptypath4 = getEmptyPath.ParcelableVolumeInfo;
            getTimerfwf_client_release gettimerfwf_client_release4 = getTimerfwf_client_release.Factory;
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release8 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, displayInAppMessagelambda1.serializer(invokekLtJ_vA.class), null, getemptypath4, gettimerfwf_client_release4);
            getMetricProviderfwf_client_release getmetricproviderfwf_client_release7 = new getMetricProviderfwf_client_release(getexposurehandlerfwf_client_release8);
            syncclientfwf_client_release2.read(getmetricproviderfwf_client_release7);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer10 = displayInAppMessagelambda1.serializer(VectorComposeKtPath28.class);
            getexposurehandlerfwf_client_release8.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release8.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer10);
            String strWrite2 = getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer10, null, removecustomerprofileattributesfwf_client_release2);
            HashMap map2 = syncclientfwf_client_release2.write;
            map2.put(strWrite2, getmetricproviderfwf_client_release7);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release9 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, displayInAppMessagelambda1.serializer(HelpcenterRemoteDataSourceImpl.class), null, getEmptyPath.MediaSessionCompatResultReceiverWrapper, gettimerfwf_client_release3);
            getSerializerfwf_client_release getserializerfwf_client_release2 = new getSerializerfwf_client_release(getexposurehandlerfwf_client_release9);
            syncclientfwf_client_release2.read(getserializerfwf_client_release2);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer11 = displayInAppMessagelambda1.serializer(isMoreThanHalf.class);
            getexposurehandlerfwf_client_release9.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release9.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer11);
            map2.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer11, null, removecustomerprofileattributesfwf_client_release2), getserializerfwf_client_release2);
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release10 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, displayInAppMessagelambda1.serializer(ChatRepositoryImpl.class), null, getEmptyPath.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, gettimerfwf_client_release3);
            getSerializerfwf_client_release getserializerfwf_client_release3 = new getSerializerfwf_client_release(getexposurehandlerfwf_client_release10);
            syncclientfwf_client_release2.read(getserializerfwf_client_release3);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer12 = displayInAppMessagelambda1.serializer(rgbEqualOWjLjI.class);
            getexposurehandlerfwf_client_release10.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release10.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer12);
            map2.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer12, null, removecustomerprofileattributesfwf_client_release2), getserializerfwf_client_release3);
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release2, displayInAppMessagelambda1.serializer(VectorComposeKtPath23.class), null, getEmptyPath.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, gettimerfwf_client_release4), syncclientfwf_client_release2);
            return createfromparcel;
        }
        if (i == 2) {
            syncClientfwf_client_release syncclientfwf_client_release3 = (syncClientfwf_client_release) obj;
            syncclientfwf_client_release3.getClass();
            getEmptyPath getemptypath5 = getEmptyPath.ResultReceiver;
            getTimerfwf_client_release gettimerfwf_client_release5 = getTimerfwf_client_release.Singleton;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer13 = displayInAppMessagelambda1.serializer(VectorPainterKt.class);
            removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release3 = FwFClientaddFeatureKeys1.IconCompatParcelizer;
            getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release11 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release3, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer13, null, getemptypath5, gettimerfwf_client_release5);
            getSerializerfwf_client_release getserializerfwf_client_release4 = new getSerializerfwf_client_release(getexposurehandlerfwf_client_release11);
            syncclientfwf_client_release3.read(getserializerfwf_client_release4);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer14 = displayInAppMessagelambda1.serializer(configureVectorPainterT4PVSW8.class);
            getexposurehandlerfwf_client_release11.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release11.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer14);
            syncclientfwf_client_release3.write.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer14, null, removecustomerprofileattributesfwf_client_release3), getserializerfwf_client_release4);
            return createfromparcel;
        }
        if (i != 3) {
            syncClientfwf_client_release syncclientfwf_client_release4 = (syncClientfwf_client_release) obj;
            syncclientfwf_client_release4.getClass();
            getEmptyPath getemptypath6 = getEmptyPath.MediaBrowserCompatMediaItem;
            getTimerfwf_client_release gettimerfwf_client_release6 = getTimerfwf_client_release.Singleton;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer15 = displayInAppMessagelambda1.serializer(WebViewManager.class);
            removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release4 = FwFClientaddFeatureKeys1.IconCompatParcelizer;
            ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release4, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer15, null, getemptypath6, gettimerfwf_client_release6), syncclientfwf_client_release4);
            ff$$ExternalSyntheticOutline0.m(new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release4, displayInAppMessagelambda1.serializer(obtainSizePxVpY3zN4.class), null, getEmptyPath.MediaSessionCompatToken, gettimerfwf_client_release6), syncclientfwf_client_release4);
            return createfromparcel;
        }
        syncClientfwf_client_release syncclientfwf_client_release5 = (syncClientfwf_client_release) obj;
        syncclientfwf_client_release5.getClass();
        getEmptyPath getemptypath7 = getEmptyPath.MediaMetadataCompat;
        getTimerfwf_client_release gettimerfwf_client_release7 = getTimerfwf_client_release.Singleton;
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer16 = displayInAppMessagelambda1.serializer(ChatUrlProviderImpl.class);
        removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release5 = FwFClientaddFeatureKeys1.IconCompatParcelizer;
        getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release12 = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release5, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer16, null, getemptypath7, gettimerfwf_client_release7);
        getSerializerfwf_client_release getserializerfwf_client_release5 = new getSerializerfwf_client_release(getexposurehandlerfwf_client_release12);
        syncclientfwf_client_release5.read(getserializerfwf_client_release5);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer17 = displayInAppMessagelambda1.serializer(getBitmapConfig_sVssgQui.class);
        getexposurehandlerfwf_client_release12.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release12.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer17);
        syncclientfwf_client_release5.write.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer17, null, removecustomerprofileattributesfwf_client_release5), getserializerfwf_client_release5);
        return createfromparcel;
    }

    static {
        int i = 1;
        IconCompatParcelizer = new toOpaque8_81llA(i, i);
        read = new toOpaque8_81llA(i, 2);
        serializer = new toOpaque8_81llA(i, 0);
        RemoteActionCompatParcelizer = new toOpaque8_81llA(i, 3);
        write = new toOpaque8_81llA(i, 4);
    }
}
