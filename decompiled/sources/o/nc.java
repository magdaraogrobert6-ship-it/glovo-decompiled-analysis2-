package o;

import android.location.Address;
import android.location.Geocoder$GeocodeListener;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class nc implements Geocoder$GeocodeListener {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ CancellableContinuationImpl IconCompatParcelizer;
    public final /* synthetic */ NestFragment$$ExternalSyntheticLambda1 serializer;

    public nc(NestFragment$$ExternalSyntheticLambda1 nestFragment$$ExternalSyntheticLambda1, CancellableContinuationImpl cancellableContinuationImpl) {
        this.serializer = nestFragment$$ExternalSyntheticLambda1;
        this.IconCompatParcelizer = cancellableContinuationImpl;
    }

    public final void onError(String str) {
        int i = 2 % 2;
        int i2 = read + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("AndroidGeocoderWrapper: getFromLocation failed ", str), new Object[0]);
        this.serializer.invoke(ef.ANDROID, Boolean.FALSE);
        this.IconCompatParcelizer.resumeWith(null);
        int i4 = read + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void onGeocode(List list) {
        Address address;
        boolean z;
        String addressLine;
        int i = 2 % 2;
        int i2 = read + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z2 = false;
        boolean z3 = true;
        if (i2 % 2 == 0) {
            list.getClass();
            address = (Address) onContentCardDismissed.MediaMetadataCompat(list);
            if (address != null) {
                z = true;
                int i3 = read + 47;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                addressLine = address.getAddressLine(0);
            } else {
                z2 = true;
                addressLine = null;
                z = z2;
            }
        } else {
            list.getClass();
            address = (Address) onContentCardDismissed.MediaMetadataCompat(list);
            if (address != null) {
                z = false;
                int i5 = read + 47;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                addressLine = address.getAddressLine(0);
            } else {
                addressLine = null;
                z = z2;
            }
        }
        ef efVar = ef.ANDROID;
        if (addressLine != null) {
            int i7 = read + 21;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            z3 = z;
        }
        this.serializer.invoke(efVar, Boolean.valueOf(z3));
        this.IconCompatParcelizer.resumeWith(addressLine);
    }
}
