package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getMessageTextAlign {
    public static final onAfterClosed IconCompatParcelizer(getMessageExtras getmessageextras, String str, long j, long j2, TransportChangeType transportChangeType) {
        str.getClass();
        transportChangeType.getClass();
        ArrayList arrayListIconCompatParcelizer = setExpirationTimestamp.IconCompatParcelizer(getmessageextras.serializer(), j, j2);
        ArrayList<r8lambdaToWEBn4vVR9WqvyA_znNRwHzM> arrayList = new ArrayList();
        for (Object obj : arrayListIconCompatParcelizer) {
            r8lambdaToWEBn4vVR9WqvyA_znNRwHzM r8lambdatowebn4vvr9wqvya_znnrwhzm = (r8lambdaToWEBn4vVR9WqvyA_znNRwHzM) obj;
            if (transportChangeType.isMotorcycleTransport() || r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaMetadataCompat() != null) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        if (arrayList.isEmpty()) {
            getmessageextras.write().IconCompatParcelizer(String.format("Skipping the smooth score calculation for the transport %s: no harsh driving evaluations found.", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
            return null;
        }
        boolean zIsMotorcycleTransport = transportChangeType.isMotorcycleTransport();
        if (!arrayList.isEmpty()) {
            for (r8lambdaToWEBn4vVR9WqvyA_znNRwHzM r8lambdatowebn4vvr9wqvya_znnrwhzm2 : arrayList) {
                HarshDrivingEntryType harshDrivingEntryTypeRatingCompat = zIsMotorcycleTransport ? r8lambdatowebn4vvr9wqvya_znnrwhzm2.RatingCompat() : r8lambdatowebn4vvr9wqvya_znnrwhzm2.MediaMetadataCompat();
                if (harshDrivingEntryTypeRatingCompat != null && harshDrivingEntryTypeRatingCompat.isHarshEvent() && (i = i + 1) < 0) {
                    androidx.sqlite.SQLite.RemoteActionCompatParcelizer();
                    throw null;
                }
            }
        }
        return new onAfterClosed(i, arrayList.size());
    }
}
