package com.roadrunner.map.integration.mapbox.speedlimit;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.migrations.SharedPreferencesMigration;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.tripdata.speedlimit.api.MapboxSpeedInfoApi;
import com.mapbox.navigation.tripdata.speedlimit.model.PostedAndCurrentSpeedFormatter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.createFromParcel;
import o.ga;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.k6;
import o.nExternalSyntheticLambda2;
import o.nExternalSyntheticLambda6;
import o.prepareForActivityTransitionCarryover;
import o.transferSessionPackageI;
import o.typeParametersSerializers;
import o.waExternalSyntheticLambda3;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class SpeedLimitApi {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final k6 IconCompatParcelizer;
    public final DeferredCoroutine MediaBrowserCompatMediaItem;
    public final nExternalSyntheticLambda2 MediaMetadataCompat;
    public final getContentViewGroupParentLayout read;
    public final transferSessionPackageI serializer;
    public final isAdapterPositionOnScreen write = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(13, this));
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(12));
    public final isAdapterPositionOnScreen RatingCompat = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(13));

    public SpeedLimitApi(k6 k6Var, transferSessionPackageI transfersessionpackagei, nExternalSyntheticLambda2 nexternalsyntheticlambda2, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = k6Var;
        this.serializer = transfersessionpackagei;
        this.MediaMetadataCompat = nexternalsyntheticlambda2;
        this.read = getcontentviewgroupparentlayout;
        this.MediaBrowserCompatMediaItem = BuildersKt.write(getcontentviewgroupparentlayout, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, CoroutineStart.LAZY, new SharedPreferencesMigration.AnonymousClass3(2, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object onLocationMatcherResult$mapbox(LocationMatcherResult locationMatcherResult, ContinuationImpl continuationImpl) {
        nExternalSyntheticLambda6 nexternalsyntheticlambda6;
        int i = 2 % 2;
        if (continuationImpl instanceof nExternalSyntheticLambda6) {
            nexternalsyntheticlambda6 = (nExternalSyntheticLambda6) continuationImpl;
            int i2 = nexternalsyntheticlambda6.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nexternalsyntheticlambda6.read = i2 - Integer.MIN_VALUE;
            } else {
                nexternalsyntheticlambda6 = new nExternalSyntheticLambda6(this, continuationImpl);
            }
        } else {
            nexternalsyntheticlambda6 = new nExternalSyntheticLambda6(this, continuationImpl);
        }
        Object objAwaitInternal = nexternalsyntheticlambda6.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = nexternalsyntheticlambda6.read;
        if (i3 != 0) {
            int i4 = MediaDescriptionCompat + 93;
            int i5 = i4 % Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i5;
            int i6 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = i5 + 85;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            locationMatcherResult = nexternalsyntheticlambda6.write;
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitInternal);
            nexternalsyntheticlambda6.write = locationMatcherResult;
            nexternalsyntheticlambda6.read = 1;
            if (((Boolean) this.write.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                objAwaitInternal = this.MediaBrowserCompatMediaItem.awaitInternal(nexternalsyntheticlambda6);
                int i9 = MediaSessionCompatQueueItem + 35;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                objAwaitInternal = (MapboxSpeedInfoApi) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
            }
            if (objAwaitInternal == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        DeltaDecoder deltaDecoderUpdatePostedAndCurrentSpeed = ((MapboxSpeedInfoApi) objAwaitInternal).updatePostedAndCurrentSpeed(locationMatcherResult, (DistanceFormatterOptions) this.IconCompatParcelizer.read.MediaSessionCompatResultReceiverWrapper(), (PostedAndCurrentSpeedFormatter) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
        Integer postedSpeed = deltaDecoderUpdatePostedAndCurrentSpeed != null ? deltaDecoderUpdatePostedAndCurrentSpeed.getPostedSpeed() : null;
        MutableStateFlow mutableStateFlow = this.MediaMetadataCompat.write;
        if (postedSpeed == null) {
            mutableStateFlow.write(typeParametersSerializers.read);
        } else {
            mutableStateFlow.write(new ga(postedSpeed.intValue(), deltaDecoderUpdatePostedAndCurrentSpeed.getCurrentSpeed()));
        }
        return createFromParcel.INSTANCE;
    }
}
