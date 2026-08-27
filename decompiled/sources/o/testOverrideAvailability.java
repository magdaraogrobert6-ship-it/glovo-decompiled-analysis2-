package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.DeliveryConfirmationState$Analytics$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class testOverrideAvailability implements AnimatedContentComposeAnimationCompanion {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final double read;
    public final isInline serializer;
    public final getPositionannotations write;

    static {
        DeliveryConfirmationState$Analytics$Companion deliveryConfirmationState$Analytics$Companion = getPositionannotations.Companion;
        int i = MediaBrowserCompatMediaItem + 1;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public testOverrideAvailability(isInline isinline, String str, double d, getPositionannotations getpositionannotations) {
        isinline.getClass();
        str.getClass();
        this.serializer = isinline;
        this.RemoteActionCompatParcelizer = str;
        this.read = d;
        this.write = getpositionannotations;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 109;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31);
        getPositionannotations getpositionannotations = this.write;
        if (getpositionannotations == null) {
            int i4 = RatingCompat + 11;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getpositionannotations.hashCode();
        }
        return iRemoteActionCompatParcelizer + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenTransferChange(transferChangeItem=" + this.serializer + ", currencySymbol=" + this.RemoteActionCompatParcelizer + ", amountPayable=" + this.read + ", analytics=" + this.write + ")";
        int i2 = MediaDescriptionCompat + 45;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof testOverrideAvailability)) {
            return false;
        }
        testOverrideAvailability testoverrideavailability = (testOverrideAvailability) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, testoverrideavailability.serializer}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, testoverrideavailability.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (Double.compare(this.read, testoverrideavailability.read) != 0) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, testoverrideavailability.write}, getCieXyz.write())).booleanValue();
            }
            int i2 = RatingCompat;
            int i3 = i2 + 13;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RatingCompat;
        int i8 = i7 + 111;
        MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        int i10 = i7 + 101;
        MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
