package o;

import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.delivery.domain.ValidateAndSaveStateResponseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.heatmap.domain.ValidateAndSaveHeatmapResponseImpl;
import com.roadrunner.home.state.data.HomeRepositoryImpl;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.nafath.data.VerificationStatusRepository;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.state.provider.domain.ValidateAndSaveStatusResponseImpl;
import com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class addAnimatingView implements getColorIntegerOrNulllambda0 {
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 1;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final mergeJsonObjects ComponentActivity;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final mergeJsonObjects PlaybackStateCompat;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects ResultReceiver;
    public final mergeJsonObjects r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final mergeJsonObjects r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final mergeJsonObjects r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final mergeJsonObjects r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final mergeJsonObjects r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final mergeJsonObjects r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public addAnimatingView(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, getSharedElementTargetNames getsharedelementtargetnames, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, q0 q0Var, onMeasureChild onmeasurechild, AbsSavedState absSavedState, SharedPreferencesMigration sharedPreferencesMigration, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, mergeJsonObjects mergejsonobjects8, mergeJsonObjects mergejsonobjects9, mergeJsonObjects mergejsonobjects10, getSharedElementTargetNames getsharedelementtargetnames2, setPresentationView setpresentationview, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, getEditableText geteditabletext, transformCanvas transformcanvas, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker2) {
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RatingCompat = getsharedelementtargetnames;
        this.PlaybackStateCompat = mergejsonobjects;
        this.MediaSessionCompatToken = mergejsonobjects2;
        this.MediaSessionCompatResultReceiverWrapper = mergejsonobjects3;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = mergejsonobjects4;
        this.MediaMetadataCompat = mergejsonobjects5;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = q0Var;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onmeasurechild;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = absSavedState;
        this.ResultReceiver = sharedPreferencesMigration;
        this.RemoteActionCompatParcelizer = mergejsonobjects6;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mergejsonobjects7;
        this.ParcelableVolumeInfo = mergejsonobjects8;
        this.ComponentActivity = mergejsonobjects9;
        this.MediaBrowserCompatMediaItem = mergejsonobjects10;
        this.PlaybackStateCompatCustomAction = getsharedelementtargetnames2;
        this.read = setpresentationview;
        this.write = semanticsPropertiesLinkTestMarker1;
        this.serializer = geteditabletext;
        this.MediaDescriptionCompat = transformcanvas;
        this.MediaSessionCompatQueueItem = semanticsPropertiesLinkTestMarker2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        HomeRepositoryImpl homeRepositoryImpl = new HomeRepositoryImpl((ExecuteApiRequest) this.IconCompatParcelizer.write(), (hasPendingAdapterUpdates) this.RatingCompat.write(), (transferSessionPackageI) this.PlaybackStateCompat.write(), (getContentViewGroupParentLayout) this.MediaSessionCompatToken.write(), (OpportunitiesRepository) this.MediaSessionCompatResultReceiverWrapper.write(), (VerificationStatusRepository) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(), (InstantShiftRepository) this.MediaMetadataCompat.write(), (ValidateAndSaveStateResponseImpl) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write(), (ValidateAndSaveStatusResponseImpl) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write(), (ValidateAndSaveHeatmapResponseImpl) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(), (requestBannersRefreshlambda121) this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.write(), (forEachUnmergedChild) this.ResultReceiver.write(), (ConfirmationRepository) this.RemoteActionCompatParcelizer.write(), (EventMetadata) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(), (dispatchChildDetached) this.ParcelableVolumeInfo.write(), (QuickSessionsRepository) this.ComponentActivity.write(), (resetTransientState) this.MediaBrowserCompatMediaItem.write(), (getRecycledViewPool) this.PlaybackStateCompatCustomAction.write(), (Clock) this.read.write(), new MapApiError(), (FontVariationSetting) this.write.write(), (copyGSF8kmg) this.serializer.write(), (slant) this.MediaDescriptionCompat.write(), (TextPaintExtensions_androidKt) this.MediaSessionCompatQueueItem.write());
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 71;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return homeRepositoryImpl;
    }
}
