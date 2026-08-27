package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public setContentCardsUnreadVisualIndicatorEnabled RatingCompat() {
        int i = ((r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4) this.serializer) != null ? 1 : 0;
        if (((setApiKeyandroid_sdk_base_release) this.RemoteActionCompatParcelizer) != null) {
            i++;
        }
        if (((removeFromSubscriptionGrouplambda0) this.MediaBrowserCompatMediaItem) != null) {
            i++;
        }
        if (((getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) this.IconCompatParcelizer) != null) {
            i++;
        }
        if (((setCustomWebViewActivityClass) this.write) != null) {
            i++;
        }
        if (((setCustomUserAttributelambda5) this.read) != null) {
            i++;
        }
        if (i == 1) {
            return new setContentCardsUnreadVisualIndicatorEnabled(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    public r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls(unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0) {
        this.serializer = unsetlocationcustomattributelambda0.read;
        this.RemoteActionCompatParcelizer = unsetlocationcustomattributelambda0.write;
        this.MediaBrowserCompatMediaItem = unsetlocationcustomattributelambda0.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = unsetlocationcustomattributelambda0.IconCompatParcelizer;
        this.write = unsetlocationcustomattributelambda0.MediaDescriptionCompat;
        this.read = unsetlocationcustomattributelambda0.MediaMetadataCompat;
    }

    public r8lambdacHkwrG2CFDKAOsabUOrbFFKX88 serializer() {
        if (((Integer) this.IconCompatParcelizer) != null) {
            if (((Integer) this.write) != null) {
                if (((Integer) this.read) != null) {
                    return new r8lambdacHkwrG2CFDKAOsabUOrbFFKX88(this);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'longitude' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'latitude' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp_offset' is missing");
        return null;
    }

    public setHomeCitylambda1 read() {
        if (((Integer) this.IconCompatParcelizer) != null) {
            if (((Integer) this.write) != null) {
                return new setHomeCitylambda1(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'longitude' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'latitude' is missing");
        return null;
    }

    public getGoodNetworkIntervalandroid_sdk_base_release write() {
        if (((Integer) this.IconCompatParcelizer) != null) {
            if (((Integer) this.write) != null) {
                return new getGoodNetworkIntervalandroid_sdk_base_release(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'mega_longitude' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'mega_latitude' is missing");
        return null;
    }

    public removeFromSubscriptionGrouplambda0 RemoteActionCompatParcelizer() {
        if (((setHomeCitylambda1) this.serializer) != null) {
            if (((Long) this.RemoteActionCompatParcelizer) != null) {
                return new removeFromSubscriptionGrouplambda0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
        return null;
    }

    public unsetLocationCustomAttributelambda0 IconCompatParcelizer() {
        if (((String) this.serializer) != null) {
            if (((String) this.RemoteActionCompatParcelizer) != null) {
                return new unsetLocationCustomAttributelambda0(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'secret_key' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'access_key' is missing");
        return null;
    }

    public r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls() {
    }
}
