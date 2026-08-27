package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.crashdetection.api.CrashDetectionState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "CarCrashModelExecutor")
public final class r8lambda1owZ_4TkE0EYLOUCozvoOJ2FLWs extends r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY<r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs, BrazeGeofenceManager> {
    private final float[][] serializer;

    @Override // o.r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY
    public final void MediaSessionCompatQueueItem() {
        int i = r8lambda2bKkqxJZ0SIYHKXIK7froon_Bi4.serializer;
    }

    @Override // o.r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY
    public final r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA write(int i, r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk r8lambdamx_xxzgulojgjtf7uabdpxnqsk, long j, ArrayList arrayList) {
        BrazeGeofenceManager brazeGeofenceManager = (BrazeGeofenceManager) r8lambdamx_xxzgulojgjtf7uabdpxnqsk;
        arrayList.getClass();
        long j2 = i;
        int i2 = r8lambda2bKkqxJZ0SIYHKXIK7froon_Bi4.serializer;
        long jMediaSessionCompatQueueItem = ((long) brazeGeofenceManager.MediaSessionCompatQueueItem()) + (j2 * 9000) + j;
        Location location = new Location("");
        location.setLatitude(brazeGeofenceManager.RatingCompat());
        location.setLongitude(brazeGeofenceManager.MediaBrowserCompatMediaItem());
        location.setTime(jMediaSessionCompatQueueItem);
        r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA.serializer serializerVar = new r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA.serializer();
        serializerVar.IconCompatParcelizer(brazeGeofenceManager.MediaDescriptionCompat());
        serializerVar.IconCompatParcelizer(jMediaSessionCompatQueueItem);
        serializerVar.RemoteActionCompatParcelizer(location);
        serializerVar.serializer(brazeGeofenceManager.MediaMetadataCompat());
        serializerVar.write(brazeGeofenceManager.write());
        serializerVar.read(brazeGeofenceManager.read());
        serializerVar.RemoteActionCompatParcelizer(brazeGeofenceManager.RemoteActionCompatParcelizer());
        serializerVar.write(arrayList);
        serializerVar.RemoteActionCompatParcelizer(CrashDetectionState.of(brazeGeofenceManager.serializer()));
        serializerVar.serializer(brazeGeofenceManager.IconCompatParcelizer());
        return new r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA(serializerVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda1owZ_4TkE0EYLOUCozvoOJ2FLWs(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambda2bKkqxJZ0SIYHKXIK7froon_Bi4 r8lambda2bkkqxjz0siyhkxik7froon_bi4) {
        super(parselonglambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambda2bkkqxjz0siyhkxik7froon_bi4);
        parselonglambda0.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambda2bkkqxjz0siyhkxik7froon_bi4.getClass();
        float[][] fArr = new float[900][];
        for (int i = 0; i < 900; i++) {
            fArr[i] = new float[4];
        }
        this.serializer = fArr;
    }

    @Override // o.r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY
    public final r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY write(r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0) {
        long jMediaMetadataCompat = MediaMetadataCompat();
        r8lambdawsScXbU3AiTaDZl7q7ghvDoPto r8lambdawsscxbu3aitadzl7q7ghvdoptoSerializer = serializer();
        long jWrite = write(r8lambdawsscxbu3aitadzl7q7ghvdoptoSerializer.RemoteActionCompatParcelizer());
        MediaSessionCompatQueueItem();
        MediaSessionCompatQueueItem();
        r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs r8lambdaaqqaeoi18rmmjz20uldhfemqvs = new r8lambdaAqqaEOi18rmMjZ20ulDhFemQVs(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.RemoteActionCompatParcelizer(9, r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.serializer(write(), r8lambdaaig5zvykrh73tepxo0st1uppjw0), r8lambdaaig5zvykrh73tepxo0st1uppjw0), r8lambdawsscxbu3aitadzl7q7ghvdoptoSerializer.write((jWrite * 9000) + jMediaMetadataCompat, 9000L, 900), this.serializer);
        float[][] fArr = r8lambdaaqqaeoi18rmmjz20uldhfemqvs.IconCompatParcelizer;
        boolean z = false;
        boolean z2 = fArr.length == 900 && fArr[0].length == 4;
        float[][] fArr2 = r8lambdaaqqaeoi18rmmjz20uldhfemqvs.write;
        boolean z3 = fArr2.length == 900 && fArr2[0].length == 4;
        float[][] fArr3 = r8lambdaaqqaeoi18rmmjz20uldhfemqvs.read;
        if (fArr3.length == 9 && fArr3[0].length == 5) {
            z = true;
        }
        if (z2 && z3 && z) {
            return r8lambdaaqqaeoi18rmmjz20uldhfemqvs;
        }
        return null;
    }
}
