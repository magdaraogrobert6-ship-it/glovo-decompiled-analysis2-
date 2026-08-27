package o;

import coil3.ComponentRegistry$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.delivery.accept.laststop.domain.RemoveLastStopAddressUseCaseImpl;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.home.nest.divider.ObserveDivider;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;

/* JADX INFO: loaded from: classes3.dex */
public final class getStoreInfoFromClient implements decryptAndGetPasswordBWLJW6A {
    private static int MediaSessionCompatToken = 0;
    private static int ResultReceiver = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final dropAlpha MediaMetadataCompat;
    public final getTextPaint MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final isAdapterPositionOnScreen ParcelableVolumeInfo;
    public final getXiaomiReferrer PlaybackStateCompat;
    public final setGdprForgetMe PlaybackStateCompatCustomAction;
    public final ContextScope RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getVerticalAlign read;
    public final isAdapterPositionOnScreen serializer;
    public final isAdapterPositionOnScreen write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = ResultReceiver + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        if (i2 % 2 != 0) {
            stateFlow = this.MediaBrowserCompatMediaItem;
            int i4 = 64 / 0;
        } else {
            stateFlow = this.MediaBrowserCompatMediaItem;
        }
        int i5 = i3 + 19;
        ResultReceiver = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getStoreInfoFromClient(ContextScope contextScope, getVerticalAlign getverticalalign, dropAlpha dropalpha, getTextPaint gettextpaint, getXiaomiReferrer getxiaomireferrer, setGdprForgetMe setgdprforgetme, getQueryContext getquerycontext) {
        getverticalalign.getClass();
        dropalpha.getClass();
        gettextpaint.getClass();
        getxiaomireferrer.getClass();
        setgdprforgetme.getClass();
        getquerycontext.getClass();
        this.RatingCompat = contextScope;
        this.read = getverticalalign;
        this.MediaMetadataCompat = dropalpha;
        this.MediaSessionCompatQueueItem = gettextpaint;
        this.PlaybackStateCompat = getxiaomireferrer;
        this.PlaybackStateCompatCustomAction = setgdprforgetme;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(saveRawReferrerArray.serializer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        final int i = 0;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getSingletonInstance
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ getStoreInfoFromClient write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 65;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i;
                getStoreInfoFromClient getstoreinfofromclient = this.write;
                if (i4 == 0) {
                    getVerticalAlign getverticalalign2 = getstoreinfofromclient.read;
                    ContextScope contextScope2 = getstoreinfofromclient.RatingCompat;
                    AndroidFontResolveInterceptor androidFontResolveInterceptor = AndroidFontResolveInterceptor.STATUS;
                    ComponentRegistry$Builder componentRegistry$Builder = getverticalalign2.RemoteActionCompatParcelizer;
                    getOffsetX getoffsetx = new getOffsetX(androidFontResolveInterceptor, (unpackInt2) ((LayoutCompat) componentRegistry$Builder.write).write(), (unpackInt1) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (getSecondaryUpstream) ((LayoutCompat) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((LayoutCompat) componentRegistry$Builder.IconCompatParcelizer).write(), (DeliveryAcceptanceLogger) ((mergeJsonObjects) componentRegistry$Builder.serializer).write(), contextScope2);
                    int i5 = IconCompatParcelizer + 3;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return getoffsetx;
                    }
                    throw null;
                }
                if (i4 == 1) {
                    dropAlpha dropalpha2 = getstoreinfofromclient.MediaMetadataCompat;
                    ContextScope contextScope3 = getstoreinfofromclient.RatingCompat;
                    ProtobufEncoder protobufEncoder = dropalpha2.serializer;
                    hasSameNonLayoutAttributesui_text hassamenonlayoutattributesui_text = new hasSameNonLayoutAttributesui_text(contextScope3, (getSecondaryUpstream) ((mergeJsonObjects) protobufEncoder.write).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((mergeJsonObjects) protobufEncoder.serializer).write(), (SignInDataStore) ((SemanticsPropertiesLinkTestMarker1) protobufEncoder.RemoteActionCompatParcelizer).write());
                    int i6 = IconCompatParcelizer + 39;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return hassamenonlayoutattributesui_text;
                }
                if (i4 != 2) {
                    getXiaomiReferrer getxiaomireferrer2 = getstoreinfofromclient.PlaybackStateCompat;
                    ContextScope contextScope4 = getstoreinfofromclient.RatingCompat;
                    getxiaomireferrer2.getClass();
                    CallTracer callTracer = getxiaomireferrer2.write;
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    getSamsungCloudDevGoogleAdId getsamsungclouddevgoogleadid = (getSamsungCloudDevGoogleAdId) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.write).write();
                    objWrite2.getClass();
                    ToggleShiftExtensionUseCase toggleShiftExtensionUseCase = (ToggleShiftExtensionUseCase) objWrite2;
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
                    objWrite3.getClass();
                    return new invokeMethod(contextScope4, getsamsungclouddevgoogleadid, toggleShiftExtensionUseCase, (restoreChildFragmentState) objWrite3, (OtpLogger) ((requestBannersRefreshlambda1) callTracer.IconCompatParcelizer).write());
                }
                getTextPaint gettextpaint2 = getstoreinfofromclient.MediaSessionCompatQueueItem;
                ContextScope contextScope5 = getstoreinfofromclient.RatingCompat;
                gettextpaint2.getClass();
                MapDelegateProviderImpl mapDelegateProviderImpl = gettextpaint2.IconCompatParcelizer;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapboxMap).write();
                objWrite4.getClass();
                getPrimaryHorizontal getprimaryhorizontal = (getPrimaryHorizontal) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapCameraManagerDelegate).write();
                objWrite5.getClass();
                RemoveLastStopAddressUseCaseImpl removeLastStopAddressUseCaseImpl = (RemoveLastStopAddressUseCaseImpl) objWrite5;
                getQueryContext getquerycontext2 = new getQueryContext();
                ObserveDivider observeDivider = (ObserveDivider) ((lineEndToVisibleEnd) mapDelegateProviderImpl.mapProjectionDelegate).write();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapTransformDelegate).write();
                objWrite6.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapListenerDelegate).write();
                objWrite7.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite7;
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapStyleManagerDelegate).write();
                objWrite8.getClass();
                getRangeForRect getrangeforrect = (getRangeForRect) objWrite8;
                Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapInteractionDelegate).write();
                objWrite9.getClass();
                fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text = (fillLineHorizontalBoundsui_text) objWrite9;
                Object objWrite10 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write();
                objWrite10.getClass();
                LastStopSelectionCoordinator lastStopSelectionCoordinator = (LastStopSelectionCoordinator) objWrite10;
                Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapPluginProviderDelegate).write();
                objWrite11.getClass();
                Object objWrite12 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.indoorManager).write();
                objWrite12.getClass();
                return new LastStopOptionUiModelImpl(getprimaryhorizontal, removeLastStopAddressUseCaseImpl, getquerycontext2, observeDivider, fontVariationSettingTextUnit, settransactionsuccessful, getrangeforrect, filllinehorizontalboundsui_text, lastStopSelectionCoordinator, (DeliveryAcceptanceLogger) objWrite11, (DeliveryErrorProviderImpl) objWrite12, contextScope5);
            }
        });
        final int i2 = 1;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getSingletonInstance
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ getStoreInfoFromClient write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IconCompatParcelizer + 65;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj = null;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i2;
                getStoreInfoFromClient getstoreinfofromclient = this.write;
                if (i5 == 0) {
                    getVerticalAlign getverticalalign2 = getstoreinfofromclient.read;
                    ContextScope contextScope2 = getstoreinfofromclient.RatingCompat;
                    AndroidFontResolveInterceptor androidFontResolveInterceptor = AndroidFontResolveInterceptor.STATUS;
                    ComponentRegistry$Builder componentRegistry$Builder = getverticalalign2.RemoteActionCompatParcelizer;
                    getOffsetX getoffsetx = new getOffsetX(androidFontResolveInterceptor, (unpackInt2) ((LayoutCompat) componentRegistry$Builder.write).write(), (unpackInt1) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (getSecondaryUpstream) ((LayoutCompat) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((LayoutCompat) componentRegistry$Builder.IconCompatParcelizer).write(), (DeliveryAcceptanceLogger) ((mergeJsonObjects) componentRegistry$Builder.serializer).write(), contextScope2);
                    int i6 = IconCompatParcelizer + 3;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        return getoffsetx;
                    }
                    throw null;
                }
                if (i5 == 1) {
                    dropAlpha dropalpha2 = getstoreinfofromclient.MediaMetadataCompat;
                    ContextScope contextScope3 = getstoreinfofromclient.RatingCompat;
                    ProtobufEncoder protobufEncoder = dropalpha2.serializer;
                    hasSameNonLayoutAttributesui_text hassamenonlayoutattributesui_text = new hasSameNonLayoutAttributesui_text(contextScope3, (getSecondaryUpstream) ((mergeJsonObjects) protobufEncoder.write).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((mergeJsonObjects) protobufEncoder.serializer).write(), (SignInDataStore) ((SemanticsPropertiesLinkTestMarker1) protobufEncoder.RemoteActionCompatParcelizer).write());
                    int i7 = IconCompatParcelizer + 39;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return hassamenonlayoutattributesui_text;
                }
                if (i5 != 2) {
                    getXiaomiReferrer getxiaomireferrer2 = getstoreinfofromclient.PlaybackStateCompat;
                    ContextScope contextScope4 = getstoreinfofromclient.RatingCompat;
                    getxiaomireferrer2.getClass();
                    CallTracer callTracer = getxiaomireferrer2.write;
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    getSamsungCloudDevGoogleAdId getsamsungclouddevgoogleadid = (getSamsungCloudDevGoogleAdId) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.write).write();
                    objWrite2.getClass();
                    ToggleShiftExtensionUseCase toggleShiftExtensionUseCase = (ToggleShiftExtensionUseCase) objWrite2;
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
                    objWrite3.getClass();
                    return new invokeMethod(contextScope4, getsamsungclouddevgoogleadid, toggleShiftExtensionUseCase, (restoreChildFragmentState) objWrite3, (OtpLogger) ((requestBannersRefreshlambda1) callTracer.IconCompatParcelizer).write());
                }
                getTextPaint gettextpaint2 = getstoreinfofromclient.MediaSessionCompatQueueItem;
                ContextScope contextScope5 = getstoreinfofromclient.RatingCompat;
                gettextpaint2.getClass();
                MapDelegateProviderImpl mapDelegateProviderImpl = gettextpaint2.IconCompatParcelizer;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapboxMap).write();
                objWrite4.getClass();
                getPrimaryHorizontal getprimaryhorizontal = (getPrimaryHorizontal) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapCameraManagerDelegate).write();
                objWrite5.getClass();
                RemoveLastStopAddressUseCaseImpl removeLastStopAddressUseCaseImpl = (RemoveLastStopAddressUseCaseImpl) objWrite5;
                getQueryContext getquerycontext2 = new getQueryContext();
                ObserveDivider observeDivider = (ObserveDivider) ((lineEndToVisibleEnd) mapDelegateProviderImpl.mapProjectionDelegate).write();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapTransformDelegate).write();
                objWrite6.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapListenerDelegate).write();
                objWrite7.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite7;
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapStyleManagerDelegate).write();
                objWrite8.getClass();
                getRangeForRect getrangeforrect = (getRangeForRect) objWrite8;
                Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapInteractionDelegate).write();
                objWrite9.getClass();
                fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text = (fillLineHorizontalBoundsui_text) objWrite9;
                Object objWrite10 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write();
                objWrite10.getClass();
                LastStopSelectionCoordinator lastStopSelectionCoordinator = (LastStopSelectionCoordinator) objWrite10;
                Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapPluginProviderDelegate).write();
                objWrite11.getClass();
                Object objWrite12 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.indoorManager).write();
                objWrite12.getClass();
                return new LastStopOptionUiModelImpl(getprimaryhorizontal, removeLastStopAddressUseCaseImpl, getquerycontext2, observeDivider, fontVariationSettingTextUnit, settransactionsuccessful, getrangeforrect, filllinehorizontalboundsui_text, lastStopSelectionCoordinator, (DeliveryAcceptanceLogger) objWrite11, (DeliveryErrorProviderImpl) objWrite12, contextScope5);
            }
        });
        final int i3 = 2;
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getSingletonInstance
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ getStoreInfoFromClient write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IconCompatParcelizer + 65;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj = null;
                if (i5 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i6 = i3;
                getStoreInfoFromClient getstoreinfofromclient = this.write;
                if (i6 == 0) {
                    getVerticalAlign getverticalalign2 = getstoreinfofromclient.read;
                    ContextScope contextScope2 = getstoreinfofromclient.RatingCompat;
                    AndroidFontResolveInterceptor androidFontResolveInterceptor = AndroidFontResolveInterceptor.STATUS;
                    ComponentRegistry$Builder componentRegistry$Builder = getverticalalign2.RemoteActionCompatParcelizer;
                    getOffsetX getoffsetx = new getOffsetX(androidFontResolveInterceptor, (unpackInt2) ((LayoutCompat) componentRegistry$Builder.write).write(), (unpackInt1) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (getSecondaryUpstream) ((LayoutCompat) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((LayoutCompat) componentRegistry$Builder.IconCompatParcelizer).write(), (DeliveryAcceptanceLogger) ((mergeJsonObjects) componentRegistry$Builder.serializer).write(), contextScope2);
                    int i7 = IconCompatParcelizer + 3;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        return getoffsetx;
                    }
                    throw null;
                }
                if (i6 == 1) {
                    dropAlpha dropalpha2 = getstoreinfofromclient.MediaMetadataCompat;
                    ContextScope contextScope3 = getstoreinfofromclient.RatingCompat;
                    ProtobufEncoder protobufEncoder = dropalpha2.serializer;
                    hasSameNonLayoutAttributesui_text hassamenonlayoutattributesui_text = new hasSameNonLayoutAttributesui_text(contextScope3, (getSecondaryUpstream) ((mergeJsonObjects) protobufEncoder.write).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((mergeJsonObjects) protobufEncoder.serializer).write(), (SignInDataStore) ((SemanticsPropertiesLinkTestMarker1) protobufEncoder.RemoteActionCompatParcelizer).write());
                    int i8 = IconCompatParcelizer + 39;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return hassamenonlayoutattributesui_text;
                }
                if (i6 != 2) {
                    getXiaomiReferrer getxiaomireferrer2 = getstoreinfofromclient.PlaybackStateCompat;
                    ContextScope contextScope4 = getstoreinfofromclient.RatingCompat;
                    getxiaomireferrer2.getClass();
                    CallTracer callTracer = getxiaomireferrer2.write;
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    getSamsungCloudDevGoogleAdId getsamsungclouddevgoogleadid = (getSamsungCloudDevGoogleAdId) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.write).write();
                    objWrite2.getClass();
                    ToggleShiftExtensionUseCase toggleShiftExtensionUseCase = (ToggleShiftExtensionUseCase) objWrite2;
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
                    objWrite3.getClass();
                    return new invokeMethod(contextScope4, getsamsungclouddevgoogleadid, toggleShiftExtensionUseCase, (restoreChildFragmentState) objWrite3, (OtpLogger) ((requestBannersRefreshlambda1) callTracer.IconCompatParcelizer).write());
                }
                getTextPaint gettextpaint2 = getstoreinfofromclient.MediaSessionCompatQueueItem;
                ContextScope contextScope5 = getstoreinfofromclient.RatingCompat;
                gettextpaint2.getClass();
                MapDelegateProviderImpl mapDelegateProviderImpl = gettextpaint2.IconCompatParcelizer;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapboxMap).write();
                objWrite4.getClass();
                getPrimaryHorizontal getprimaryhorizontal = (getPrimaryHorizontal) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapCameraManagerDelegate).write();
                objWrite5.getClass();
                RemoveLastStopAddressUseCaseImpl removeLastStopAddressUseCaseImpl = (RemoveLastStopAddressUseCaseImpl) objWrite5;
                getQueryContext getquerycontext2 = new getQueryContext();
                ObserveDivider observeDivider = (ObserveDivider) ((lineEndToVisibleEnd) mapDelegateProviderImpl.mapProjectionDelegate).write();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapTransformDelegate).write();
                objWrite6.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapListenerDelegate).write();
                objWrite7.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite7;
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapStyleManagerDelegate).write();
                objWrite8.getClass();
                getRangeForRect getrangeforrect = (getRangeForRect) objWrite8;
                Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapInteractionDelegate).write();
                objWrite9.getClass();
                fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text = (fillLineHorizontalBoundsui_text) objWrite9;
                Object objWrite10 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write();
                objWrite10.getClass();
                LastStopSelectionCoordinator lastStopSelectionCoordinator = (LastStopSelectionCoordinator) objWrite10;
                Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapPluginProviderDelegate).write();
                objWrite11.getClass();
                Object objWrite12 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.indoorManager).write();
                objWrite12.getClass();
                return new LastStopOptionUiModelImpl(getprimaryhorizontal, removeLastStopAddressUseCaseImpl, getquerycontext2, observeDivider, fontVariationSettingTextUnit, settransactionsuccessful, getrangeforrect, filllinehorizontalboundsui_text, lastStopSelectionCoordinator, (DeliveryAcceptanceLogger) objWrite11, (DeliveryErrorProviderImpl) objWrite12, contextScope5);
            }
        });
        final int i4 = 3;
        this.ParcelableVolumeInfo = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getSingletonInstance
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ getStoreInfoFromClient write;

            {
                this.write = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = IconCompatParcelizer + 65;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                Object obj = null;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i7 = i4;
                getStoreInfoFromClient getstoreinfofromclient = this.write;
                if (i7 == 0) {
                    getVerticalAlign getverticalalign2 = getstoreinfofromclient.read;
                    ContextScope contextScope2 = getstoreinfofromclient.RatingCompat;
                    AndroidFontResolveInterceptor androidFontResolveInterceptor = AndroidFontResolveInterceptor.STATUS;
                    ComponentRegistry$Builder componentRegistry$Builder = getverticalalign2.RemoteActionCompatParcelizer;
                    getOffsetX getoffsetx = new getOffsetX(androidFontResolveInterceptor, (unpackInt2) ((LayoutCompat) componentRegistry$Builder.write).write(), (unpackInt1) ((mergeJsonObjects) componentRegistry$Builder.read).write(), (getSecondaryUpstream) ((LayoutCompat) componentRegistry$Builder.RemoteActionCompatParcelizer).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((LayoutCompat) componentRegistry$Builder.IconCompatParcelizer).write(), (DeliveryAcceptanceLogger) ((mergeJsonObjects) componentRegistry$Builder.serializer).write(), contextScope2);
                    int i8 = IconCompatParcelizer + 3;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        return getoffsetx;
                    }
                    throw null;
                }
                if (i7 == 1) {
                    dropAlpha dropalpha2 = getstoreinfofromclient.MediaMetadataCompat;
                    ContextScope contextScope3 = getstoreinfofromclient.RatingCompat;
                    ProtobufEncoder protobufEncoder = dropalpha2.serializer;
                    hasSameNonLayoutAttributesui_text hassamenonlayoutattributesui_text = new hasSameNonLayoutAttributesui_text(contextScope3, (getSecondaryUpstream) ((mergeJsonObjects) protobufEncoder.write).write(), (getDEFAULT_TEXT_DIRECTION_HEURISTICui_text) ((mergeJsonObjects) protobufEncoder.serializer).write(), (SignInDataStore) ((SemanticsPropertiesLinkTestMarker1) protobufEncoder.RemoteActionCompatParcelizer).write());
                    int i9 = IconCompatParcelizer + 39;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return hassamenonlayoutattributesui_text;
                }
                if (i7 != 2) {
                    getXiaomiReferrer getxiaomireferrer2 = getstoreinfofromclient.PlaybackStateCompat;
                    ContextScope contextScope4 = getstoreinfofromclient.RatingCompat;
                    getxiaomireferrer2.getClass();
                    CallTracer callTracer = getxiaomireferrer2.write;
                    Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
                    objWrite.getClass();
                    getSamsungCloudDevGoogleAdId getsamsungclouddevgoogleadid = (getSamsungCloudDevGoogleAdId) objWrite;
                    Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.write).write();
                    objWrite2.getClass();
                    ToggleShiftExtensionUseCase toggleShiftExtensionUseCase = (ToggleShiftExtensionUseCase) objWrite2;
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
                    objWrite3.getClass();
                    return new invokeMethod(contextScope4, getsamsungclouddevgoogleadid, toggleShiftExtensionUseCase, (restoreChildFragmentState) objWrite3, (OtpLogger) ((requestBannersRefreshlambda1) callTracer.IconCompatParcelizer).write());
                }
                getTextPaint gettextpaint2 = getstoreinfofromclient.MediaSessionCompatQueueItem;
                ContextScope contextScope5 = getstoreinfofromclient.RatingCompat;
                gettextpaint2.getClass();
                MapDelegateProviderImpl mapDelegateProviderImpl = gettextpaint2.IconCompatParcelizer;
                Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapboxMap).write();
                objWrite4.getClass();
                getPrimaryHorizontal getprimaryhorizontal = (getPrimaryHorizontal) objWrite4;
                Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapCameraManagerDelegate).write();
                objWrite5.getClass();
                RemoveLastStopAddressUseCaseImpl removeLastStopAddressUseCaseImpl = (RemoveLastStopAddressUseCaseImpl) objWrite5;
                getQueryContext getquerycontext2 = new getQueryContext();
                ObserveDivider observeDivider = (ObserveDivider) ((lineEndToVisibleEnd) mapDelegateProviderImpl.mapProjectionDelegate).write();
                Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapTransformDelegate).write();
                objWrite6.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite6;
                Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapListenerDelegate).write();
                objWrite7.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite7;
                Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapStyleManagerDelegate).write();
                objWrite8.getClass();
                getRangeForRect getrangeforrect = (getRangeForRect) objWrite8;
                Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapInteractionDelegate).write();
                objWrite9.getClass();
                fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text = (fillLineHorizontalBoundsui_text) objWrite9;
                Object objWrite10 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write();
                objWrite10.getClass();
                LastStopSelectionCoordinator lastStopSelectionCoordinator = (LastStopSelectionCoordinator) objWrite10;
                Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.mapPluginProviderDelegate).write();
                objWrite11.getClass();
                Object objWrite12 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mapDelegateProviderImpl.indoorManager).write();
                objWrite12.getClass();
                return new LastStopOptionUiModelImpl(getprimaryhorizontal, removeLastStopAddressUseCaseImpl, getquerycontext2, observeDivider, fontVariationSettingTextUnit, settransactionsuccessful, getrangeforrect, filllinehorizontalboundsui_text, lastStopSelectionCoordinator, (DeliveryAcceptanceLogger) objWrite11, (DeliveryErrorProviderImpl) objWrite12, contextScope5);
            }
        });
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RxConvertKt$asSingle$1(this, null, i3), 3);
    }
}
