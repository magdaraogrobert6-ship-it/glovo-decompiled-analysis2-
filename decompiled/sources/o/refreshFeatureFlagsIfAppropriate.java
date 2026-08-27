package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
final class refreshFeatureFlagsIfAppropriate extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ refreshFeatureFlagsIfAppropriatelambda1 IconCompatParcelizer;

    public refreshFeatureFlagsIfAppropriate(refreshFeatureFlagsIfAppropriatelambda1 refreshfeatureflagsifappropriatelambda1) {
        this.IconCompatParcelizer = refreshfeatureflagsifappropriatelambda1;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        refreshFeatureFlagsIfAppropriatelambda1 refreshfeatureflagsifappropriatelambda1 = this.IconCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = refreshfeatureflagsifappropriatelambda1.serializer;
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = refreshfeatureflagsifappropriatelambda1.write;
        setsoundifpresentandsupportedlambda1.getClass();
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(8);
        Integer num = r8lambdanpc69wzeqaei66oxsnhlebhusqi.serializer;
        if (num == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'steps' cannot be null");
            return null;
        }
        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = num;
        iscontentcardsunreadvisualindicatorenabled.read = r8lambdanpc69wzeqaei66oxsnhlebhusqi.MediaDescriptionCompat;
        Long l = r8lambdanpc69wzeqaei66oxsnhlebhusqi.read;
        if (l == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'start_time' cannot be null");
            return null;
        }
        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = l;
        Long l2 = r8lambdanpc69wzeqaei66oxsnhlebhusqi.RemoteActionCompatParcelizer;
        if (l2 != null) {
            iscontentcardsunreadvisualindicatorenabled.write = l2;
            return new Pair(setsoundifpresentandsupportedlambda1.write(iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer(), l), null);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'end_time' cannot be null");
        return null;
    }
}
