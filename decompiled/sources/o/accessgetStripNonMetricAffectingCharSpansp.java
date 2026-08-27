package o;

import androidx.work.CoroutineWorker$startWork$1;
import coil3.ComponentRegistry$Builder;
import coil3.ImageLoader$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.acceptbutton.presentation.GetAcceptDetails;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.backToBackOrder.domain.GetBackToBackOrdersDataImpl;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.accept.payatpickup.implementation.domain.StoreSelectedPaymentOption;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import java.time.Clock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetStripNonMetricAffectingCharSpansp implements jumpToPositionForSmoothScroller {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final getRangeForRect MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final TextRangeCompanion MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final StateFlow RatingCompat;
    public final TextIndentSaverlambda1 RemoteActionCompatParcelizer;
    public final getWidthPx read;
    public final isAdapterPositionOnScreen serializer;
    public final MutableStateFlow write;

    @Override // o.jumpToPositionForSmoothScroller
    public final StateFlow write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 29;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RatingCompat;
        }
        throw null;
    }

    public accessgetStripNonMetricAffectingCharSpansp(TextIndentSaverlambda1 textIndentSaverlambda1, TextRangeCompanion textRangeCompanion, getWidthPx getwidthpx, getRangeForRect getrangeforrect, boolean z, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.RemoteActionCompatParcelizer = textIndentSaverlambda1;
        this.MediaSessionCompatQueueItem = textRangeCompanion;
        this.read = getwidthpx;
        this.MediaDescriptionCompat = getrangeforrect;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        final int i = 0;
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.accessshouldIncreaseMaxIntrinsic
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ accessgetStripNonMetricAffectingCharSpansp serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 61;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp = this.serializer;
                if (i5 != 0) {
                    if (i5 == 1) {
                        TextRangeCompanion textRangeCompanion2 = accessgetstripnonmetricaffectingcharspansp.MediaSessionCompatQueueItem;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                        getcontentviewgroupparentlayout2.getClass();
                        ProtobufEncoder protobufEncoder = textRangeCompanion2.IconCompatParcelizer;
                        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
                        objWrite.getClass();
                        getCollapsedimpl getcollapsedimpl = (getCollapsedimpl) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) protobufEncoder.serializer).write();
                        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.RemoteActionCompatParcelizer).write();
                        objWrite2.getClass();
                        return new packWithCheck((getReversedimpl) objWrite, getcollapsedimpl, (isOpenInternalroom_runtime) objWrite2, getcontentviewgroupparentlayout2);
                    }
                    getWidthPx getwidthpx2 = accessgetstripnonmetricaffectingcharspansp.read;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                    getcontentviewgroupparentlayout3.getClass();
                    InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = getwidthpx2.write;
                    ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) ((onCapabilitiesChanged) initializeAppStartupItemsImpl.IconCompatParcelizer).write();
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) initializeAppStartupItemsImpl.serializer).write();
                    objWrite3.getClass();
                    getHeightPx getheightpx = new getHeightPx(getcontentviewgroupparentlayout3, imageLoader$Builder, (StoreSelectedPaymentOption) objWrite3);
                    int i6 = IconCompatParcelizer + 109;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return getheightpx;
                }
                TextIndentSaverlambda1 textIndentSaverlambda2 = accessgetstripnonmetricaffectingcharspansp.RemoteActionCompatParcelizer;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                boolean z2 = accessgetstripnonmetricaffectingcharspansp.MediaSessionCompatResultReceiverWrapper;
                getcontentviewgroupparentlayout4.getClass();
                TextDecorationSaverlambda1 textDecorationSaverlambda1 = textIndentSaverlambda2.read;
                Object objWrite4 = textDecorationSaverlambda1.MediaSessionCompatResultReceiverWrapper.write();
                objWrite4.getClass();
                ShadowSaverlambda0 shadowSaverlambda0 = (ShadowSaverlambda0) objWrite4;
                Object objWrite5 = textDecorationSaverlambda1.MediaSessionCompatToken.write();
                objWrite5.getClass();
                LocaleSaverlambda0 localeSaverlambda0 = (LocaleSaverlambda0) objWrite5;
                Object objWrite6 = textDecorationSaverlambda1.IconCompatParcelizer.write();
                objWrite6.getClass();
                LineHeightStyleSaverlambda1 lineHeightStyleSaverlambda1 = (LineHeightStyleSaverlambda1) objWrite6;
                Object objWrite7 = textDecorationSaverlambda1.ParcelableVolumeInfo.write();
                objWrite7.getClass();
                GetAcceptDetails getAcceptDetails = (GetAcceptDetails) objWrite7;
                Object objWrite8 = textDecorationSaverlambda1.read.write();
                objWrite8.getClass();
                AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl = (AcceptDeliveriesUseCaseImpl) objWrite8;
                Object objWrite9 = textDecorationSaverlambda1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write();
                objWrite9.getClass();
                UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite9;
                Object objWrite10 = textDecorationSaverlambda1.MediaDescriptionCompat.write();
                objWrite10.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite10;
                Object objWrite11 = textDecorationSaverlambda1.ResultReceiver.write();
                objWrite11.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite11;
                getQueryContext getquerycontext = new getQueryContext();
                Object objWrite12 = textDecorationSaverlambda1.write.write();
                objWrite12.getClass();
                DeliveryAcceptanceLogger deliveryAcceptanceLogger = (DeliveryAcceptanceLogger) objWrite12;
                Object objWrite13 = textDecorationSaverlambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
                objWrite13.getClass();
                DefaultForegroundSoundManager defaultForegroundSoundManager = (DefaultForegroundSoundManager) objWrite13;
                Object objWrite14 = textDecorationSaverlambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.write();
                objWrite14.getClass();
                getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = (getKeyboardTap5zf0vsI) objWrite14;
                Object objWrite15 = textDecorationSaverlambda1.ComponentActivity.write();
                objWrite15.getClass();
                getNeedsDensity getneedsdensity = (getNeedsDensity) objWrite15;
                ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) textDecorationSaverlambda1.MediaSessionCompatQueueItem.write();
                Object objWrite16 = textDecorationSaverlambda1.RatingCompat.write();
                objWrite16.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite16;
                Object objWrite17 = textDecorationSaverlambda1.MediaBrowserCompatMediaItem.write();
                objWrite17.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite17;
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite18 = textDecorationSaverlambda1.PlaybackStateCompat.write();
                objWrite18.getClass();
                clearTmpDetachFlag cleartmpdetachflag = (clearTmpDetachFlag) objWrite18;
                Object objWrite19 = textDecorationSaverlambda1.RemoteActionCompatParcelizer.write();
                objWrite19.getClass();
                BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl = (BackToBackOrdersDataRepositoryImpl) objWrite19;
                Object objWrite20 = textDecorationSaverlambda1.PlaybackStateCompatCustomAction.write();
                objWrite20.getClass();
                GetBackToBackOrdersDataImpl getBackToBackOrdersDataImpl = (GetBackToBackOrdersDataImpl) objWrite20;
                Object objWrite21 = textDecorationSaverlambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
                objWrite21.getClass();
                copyO0kMr_c copyo0kmr_c = (copyO0kMr_c) objWrite21;
                Object objWrite22 = textDecorationSaverlambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write();
                objWrite22.getClass();
                createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder = (createGraphemeClusterSegmentFinder) objWrite22;
                Object objWrite23 = textDecorationSaverlambda1.MediaMetadataCompat.write();
                objWrite23.getClass();
                Object objWrite24 = textDecorationSaverlambda1.serializer.write();
                objWrite24.getClass();
                return new DeliveryAcceptButtonUiModelImpl(getcontentviewgroupparentlayout4, z2, shadowSaverlambda0, localeSaverlambda0, lineHeightStyleSaverlambda1, getAcceptDetails, acceptDeliveriesUseCaseImpl, updateStateUseCaseImpl, fontVariationSettingTextUnit, settransactionsuccessful, getquerycontext, deliveryAcceptanceLogger, defaultForegroundSoundManager, getkeyboardtap5zf0vsi, getneedsdensity, componentRegistry$Builder, transfersessionpackagei, isopeninternalroom_runtime, getactionviewintentlambda0, cleartmpdetachflag, backToBackOrdersDataRepositoryImpl, getBackToBackOrdersDataImpl, copyo0kmr_c, creategraphemeclustersegmentfinder, (DeliveryErrorProviderImpl) objWrite23, (Clock) objWrite24);
            }
        });
        final int i2 = 1;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.accessshouldIncreaseMaxIntrinsic
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ accessgetStripNonMetricAffectingCharSpansp serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 61;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp = this.serializer;
                if (i6 != 0) {
                    if (i6 == 1) {
                        TextRangeCompanion textRangeCompanion2 = accessgetstripnonmetricaffectingcharspansp.MediaSessionCompatQueueItem;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                        getcontentviewgroupparentlayout2.getClass();
                        ProtobufEncoder protobufEncoder = textRangeCompanion2.IconCompatParcelizer;
                        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
                        objWrite.getClass();
                        getCollapsedimpl getcollapsedimpl = (getCollapsedimpl) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) protobufEncoder.serializer).write();
                        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.RemoteActionCompatParcelizer).write();
                        objWrite2.getClass();
                        return new packWithCheck((getReversedimpl) objWrite, getcollapsedimpl, (isOpenInternalroom_runtime) objWrite2, getcontentviewgroupparentlayout2);
                    }
                    getWidthPx getwidthpx2 = accessgetstripnonmetricaffectingcharspansp.read;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                    getcontentviewgroupparentlayout3.getClass();
                    InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = getwidthpx2.write;
                    ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) ((onCapabilitiesChanged) initializeAppStartupItemsImpl.IconCompatParcelizer).write();
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) initializeAppStartupItemsImpl.serializer).write();
                    objWrite3.getClass();
                    getHeightPx getheightpx = new getHeightPx(getcontentviewgroupparentlayout3, imageLoader$Builder, (StoreSelectedPaymentOption) objWrite3);
                    int i7 = IconCompatParcelizer + 109;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return getheightpx;
                }
                TextIndentSaverlambda1 textIndentSaverlambda2 = accessgetstripnonmetricaffectingcharspansp.RemoteActionCompatParcelizer;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                boolean z2 = accessgetstripnonmetricaffectingcharspansp.MediaSessionCompatResultReceiverWrapper;
                getcontentviewgroupparentlayout4.getClass();
                TextDecorationSaverlambda1 textDecorationSaverlambda1 = textIndentSaverlambda2.read;
                Object objWrite4 = textDecorationSaverlambda1.MediaSessionCompatResultReceiverWrapper.write();
                objWrite4.getClass();
                ShadowSaverlambda0 shadowSaverlambda0 = (ShadowSaverlambda0) objWrite4;
                Object objWrite5 = textDecorationSaverlambda1.MediaSessionCompatToken.write();
                objWrite5.getClass();
                LocaleSaverlambda0 localeSaverlambda0 = (LocaleSaverlambda0) objWrite5;
                Object objWrite6 = textDecorationSaverlambda1.IconCompatParcelizer.write();
                objWrite6.getClass();
                LineHeightStyleSaverlambda1 lineHeightStyleSaverlambda1 = (LineHeightStyleSaverlambda1) objWrite6;
                Object objWrite7 = textDecorationSaverlambda1.ParcelableVolumeInfo.write();
                objWrite7.getClass();
                GetAcceptDetails getAcceptDetails = (GetAcceptDetails) objWrite7;
                Object objWrite8 = textDecorationSaverlambda1.read.write();
                objWrite8.getClass();
                AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl = (AcceptDeliveriesUseCaseImpl) objWrite8;
                Object objWrite9 = textDecorationSaverlambda1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write();
                objWrite9.getClass();
                UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite9;
                Object objWrite10 = textDecorationSaverlambda1.MediaDescriptionCompat.write();
                objWrite10.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite10;
                Object objWrite11 = textDecorationSaverlambda1.ResultReceiver.write();
                objWrite11.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite11;
                getQueryContext getquerycontext = new getQueryContext();
                Object objWrite12 = textDecorationSaverlambda1.write.write();
                objWrite12.getClass();
                DeliveryAcceptanceLogger deliveryAcceptanceLogger = (DeliveryAcceptanceLogger) objWrite12;
                Object objWrite13 = textDecorationSaverlambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
                objWrite13.getClass();
                DefaultForegroundSoundManager defaultForegroundSoundManager = (DefaultForegroundSoundManager) objWrite13;
                Object objWrite14 = textDecorationSaverlambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.write();
                objWrite14.getClass();
                getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = (getKeyboardTap5zf0vsI) objWrite14;
                Object objWrite15 = textDecorationSaverlambda1.ComponentActivity.write();
                objWrite15.getClass();
                getNeedsDensity getneedsdensity = (getNeedsDensity) objWrite15;
                ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) textDecorationSaverlambda1.MediaSessionCompatQueueItem.write();
                Object objWrite16 = textDecorationSaverlambda1.RatingCompat.write();
                objWrite16.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite16;
                Object objWrite17 = textDecorationSaverlambda1.MediaBrowserCompatMediaItem.write();
                objWrite17.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite17;
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite18 = textDecorationSaverlambda1.PlaybackStateCompat.write();
                objWrite18.getClass();
                clearTmpDetachFlag cleartmpdetachflag = (clearTmpDetachFlag) objWrite18;
                Object objWrite19 = textDecorationSaverlambda1.RemoteActionCompatParcelizer.write();
                objWrite19.getClass();
                BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl = (BackToBackOrdersDataRepositoryImpl) objWrite19;
                Object objWrite20 = textDecorationSaverlambda1.PlaybackStateCompatCustomAction.write();
                objWrite20.getClass();
                GetBackToBackOrdersDataImpl getBackToBackOrdersDataImpl = (GetBackToBackOrdersDataImpl) objWrite20;
                Object objWrite21 = textDecorationSaverlambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
                objWrite21.getClass();
                copyO0kMr_c copyo0kmr_c = (copyO0kMr_c) objWrite21;
                Object objWrite22 = textDecorationSaverlambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write();
                objWrite22.getClass();
                createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder = (createGraphemeClusterSegmentFinder) objWrite22;
                Object objWrite23 = textDecorationSaverlambda1.MediaMetadataCompat.write();
                objWrite23.getClass();
                Object objWrite24 = textDecorationSaverlambda1.serializer.write();
                objWrite24.getClass();
                return new DeliveryAcceptButtonUiModelImpl(getcontentviewgroupparentlayout4, z2, shadowSaverlambda0, localeSaverlambda0, lineHeightStyleSaverlambda1, getAcceptDetails, acceptDeliveriesUseCaseImpl, updateStateUseCaseImpl, fontVariationSettingTextUnit, settransactionsuccessful, getquerycontext, deliveryAcceptanceLogger, defaultForegroundSoundManager, getkeyboardtap5zf0vsi, getneedsdensity, componentRegistry$Builder, transfersessionpackagei, isopeninternalroom_runtime, getactionviewintentlambda0, cleartmpdetachflag, backToBackOrdersDataRepositoryImpl, getBackToBackOrdersDataImpl, copyo0kmr_c, creategraphemeclustersegmentfinder, (DeliveryErrorProviderImpl) objWrite23, (Clock) objWrite24);
            }
        });
        final int i3 = 2;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.accessshouldIncreaseMaxIntrinsic
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ accessgetStripNonMetricAffectingCharSpansp serializer;

            {
                this.serializer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = read + 61;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp = this.serializer;
                if (i7 != 0) {
                    if (i7 == 1) {
                        TextRangeCompanion textRangeCompanion2 = accessgetstripnonmetricaffectingcharspansp.MediaSessionCompatQueueItem;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                        getcontentviewgroupparentlayout2.getClass();
                        ProtobufEncoder protobufEncoder = textRangeCompanion2.IconCompatParcelizer;
                        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
                        objWrite.getClass();
                        getCollapsedimpl getcollapsedimpl = (getCollapsedimpl) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) protobufEncoder.serializer).write();
                        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.RemoteActionCompatParcelizer).write();
                        objWrite2.getClass();
                        return new packWithCheck((getReversedimpl) objWrite, getcollapsedimpl, (isOpenInternalroom_runtime) objWrite2, getcontentviewgroupparentlayout2);
                    }
                    getWidthPx getwidthpx2 = accessgetstripnonmetricaffectingcharspansp.read;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                    getcontentviewgroupparentlayout3.getClass();
                    InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = getwidthpx2.write;
                    ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) ((onCapabilitiesChanged) initializeAppStartupItemsImpl.IconCompatParcelizer).write();
                    Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) initializeAppStartupItemsImpl.serializer).write();
                    objWrite3.getClass();
                    getHeightPx getheightpx = new getHeightPx(getcontentviewgroupparentlayout3, imageLoader$Builder, (StoreSelectedPaymentOption) objWrite3);
                    int i8 = IconCompatParcelizer + 109;
                    read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return getheightpx;
                }
                TextIndentSaverlambda1 textIndentSaverlambda2 = accessgetstripnonmetricaffectingcharspansp.RemoteActionCompatParcelizer;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = accessgetstripnonmetricaffectingcharspansp.IconCompatParcelizer;
                boolean z2 = accessgetstripnonmetricaffectingcharspansp.MediaSessionCompatResultReceiverWrapper;
                getcontentviewgroupparentlayout4.getClass();
                TextDecorationSaverlambda1 textDecorationSaverlambda1 = textIndentSaverlambda2.read;
                Object objWrite4 = textDecorationSaverlambda1.MediaSessionCompatResultReceiverWrapper.write();
                objWrite4.getClass();
                ShadowSaverlambda0 shadowSaverlambda0 = (ShadowSaverlambda0) objWrite4;
                Object objWrite5 = textDecorationSaverlambda1.MediaSessionCompatToken.write();
                objWrite5.getClass();
                LocaleSaverlambda0 localeSaverlambda0 = (LocaleSaverlambda0) objWrite5;
                Object objWrite6 = textDecorationSaverlambda1.IconCompatParcelizer.write();
                objWrite6.getClass();
                LineHeightStyleSaverlambda1 lineHeightStyleSaverlambda1 = (LineHeightStyleSaverlambda1) objWrite6;
                Object objWrite7 = textDecorationSaverlambda1.ParcelableVolumeInfo.write();
                objWrite7.getClass();
                GetAcceptDetails getAcceptDetails = (GetAcceptDetails) objWrite7;
                Object objWrite8 = textDecorationSaverlambda1.read.write();
                objWrite8.getClass();
                AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl = (AcceptDeliveriesUseCaseImpl) objWrite8;
                Object objWrite9 = textDecorationSaverlambda1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write();
                objWrite9.getClass();
                UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite9;
                Object objWrite10 = textDecorationSaverlambda1.MediaDescriptionCompat.write();
                objWrite10.getClass();
                FontVariationSettingTextUnit fontVariationSettingTextUnit = (FontVariationSettingTextUnit) objWrite10;
                Object objWrite11 = textDecorationSaverlambda1.ResultReceiver.write();
                objWrite11.getClass();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite11;
                getQueryContext getquerycontext = new getQueryContext();
                Object objWrite12 = textDecorationSaverlambda1.write.write();
                objWrite12.getClass();
                DeliveryAcceptanceLogger deliveryAcceptanceLogger = (DeliveryAcceptanceLogger) objWrite12;
                Object objWrite13 = textDecorationSaverlambda1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
                objWrite13.getClass();
                DefaultForegroundSoundManager defaultForegroundSoundManager = (DefaultForegroundSoundManager) objWrite13;
                Object objWrite14 = textDecorationSaverlambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.write();
                objWrite14.getClass();
                getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = (getKeyboardTap5zf0vsI) objWrite14;
                Object objWrite15 = textDecorationSaverlambda1.ComponentActivity.write();
                objWrite15.getClass();
                getNeedsDensity getneedsdensity = (getNeedsDensity) objWrite15;
                ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) textDecorationSaverlambda1.MediaSessionCompatQueueItem.write();
                Object objWrite16 = textDecorationSaverlambda1.RatingCompat.write();
                objWrite16.getClass();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite16;
                Object objWrite17 = textDecorationSaverlambda1.MediaBrowserCompatMediaItem.write();
                objWrite17.getClass();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) objWrite17;
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite18 = textDecorationSaverlambda1.PlaybackStateCompat.write();
                objWrite18.getClass();
                clearTmpDetachFlag cleartmpdetachflag = (clearTmpDetachFlag) objWrite18;
                Object objWrite19 = textDecorationSaverlambda1.RemoteActionCompatParcelizer.write();
                objWrite19.getClass();
                BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl = (BackToBackOrdersDataRepositoryImpl) objWrite19;
                Object objWrite20 = textDecorationSaverlambda1.PlaybackStateCompatCustomAction.write();
                objWrite20.getClass();
                GetBackToBackOrdersDataImpl getBackToBackOrdersDataImpl = (GetBackToBackOrdersDataImpl) objWrite20;
                Object objWrite21 = textDecorationSaverlambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
                objWrite21.getClass();
                copyO0kMr_c copyo0kmr_c = (copyO0kMr_c) objWrite21;
                Object objWrite22 = textDecorationSaverlambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write();
                objWrite22.getClass();
                createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder = (createGraphemeClusterSegmentFinder) objWrite22;
                Object objWrite23 = textDecorationSaverlambda1.MediaMetadataCompat.write();
                objWrite23.getClass();
                Object objWrite24 = textDecorationSaverlambda1.serializer.write();
                objWrite24.getClass();
                return new DeliveryAcceptButtonUiModelImpl(getcontentviewgroupparentlayout4, z2, shadowSaverlambda0, localeSaverlambda0, lineHeightStyleSaverlambda1, getAcceptDetails, acceptDeliveriesUseCaseImpl, updateStateUseCaseImpl, fontVariationSettingTextUnit, settransactionsuccessful, getquerycontext, deliveryAcceptanceLogger, defaultForegroundSoundManager, getkeyboardtap5zf0vsi, getneedsdensity, componentRegistry$Builder, transfersessionpackagei, isopeninternalroom_runtime, getactionviewintentlambda0, cleartmpdetachflag, backToBackOrdersDataRepositoryImpl, getBackToBackOrdersDataImpl, copyo0kmr_c, creategraphemeclustersegmentfinder, (DeliveryErrorProviderImpl) objWrite23, (Clock) objWrite24);
            }
        });
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 22), 3);
    }
}
