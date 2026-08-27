package o;

import android.app.Application;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.logout.LogoutUserUseCaseImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.ontheway.destination.domain.GetDestinationAddressImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache;
import com.sentiance.core.model.events.E$b;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class isContainerannotations implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ isContainerannotations(int i, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5) {
        this.write = i;
        this.serializer = getcolorintegerornulllambda0;
        this.read = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
        this.MediaBrowserCompatMediaItem = mergejsonobjects3;
        this.IconCompatParcelizer = mergejsonobjects4;
        this.MediaDescriptionCompat = mergejsonobjects5;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.write;
        mergeJsonObjects mergejsonobjects = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects2 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects4 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects5 = this.read;
        mergeJsonObjects mergejsonobjects6 = this.serializer;
        if (i2 == 0) {
            LogoutUserUseCaseImpl logoutUserUseCaseImpl = new LogoutUserUseCaseImpl((AuthRepository) mergejsonobjects6.write(), (getTextSelectionRangedelegate) mergejsonobjects5.write(), (boundingRectInRoot) mergejsonobjects4.write(), (scrollByOffset) mergejsonobjects3.write(), (AppEventInfoChangeHandler) mergejsonobjects2.write(), (getDisabled) mergejsonobjects.write());
            int i3 = MediaSessionCompatQueueItem + 101;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return logoutUserUseCaseImpl;
            }
            throw null;
        }
        if (i2 != 1) {
            return new E$b((waitForUserDependencyThreadlambda1) mergejsonobjects6.write(), (VendorReviewConfigCache) mergejsonobjects5.write(), (Clock) mergejsonobjects4.write(), (ExecuteApiRequest) mergejsonobjects3.write(), (androidx.work.impl.WorkManagerImpl) mergejsonobjects2.write(), (BrazeExternalSyntheticLambda5) getCurrentUser.IconCompatParcelizer.write(), (transferSessionPackageI) mergejsonobjects.write());
        }
        GetDestinationAddressImpl getDestinationAddressImpl = new GetDestinationAddressImpl((isOpenInternalroom_runtime) mergejsonobjects6.write(), (setTransactionSuccessful) mergejsonobjects5.write(), (transferSessionPackageI) mergejsonobjects4.write(), (oa) mergejsonobjects3.write(), (getLanguage) mergejsonobjects2.write(), (Application) mergejsonobjects.write());
        int i4 = MediaMetadataCompat + 33;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getDestinationAddressImpl;
    }
}
