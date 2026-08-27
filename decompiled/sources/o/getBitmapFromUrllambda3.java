package o;

import android.app.Notification;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.SubmitDetectionsCallback;
import com.sentiance.sdk.TokenResultCallback;
import com.sentiance.sdk.detectionupdates.UserActivityListener;
import com.sentiance.sdk.trip.StopTripCallback;
import com.sentiance.sdk.trip.TripTimeoutListener;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBitmapFromUrllambda3 implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Object read;
    public final /* synthetic */ Sentiance serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getBitmapFromUrllambda3(Sentiance sentiance, Object obj, int i) {
        this.write = i;
        this.serializer = sentiance;
        this.read = obj;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.write;
        Object obj = this.read;
        Sentiance sentiance = this.serializer;
        switch (i) {
            case 0:
                sentiance.lambda$addUserMetadataFields$43((Map) obj);
                break;
            case 1:
                sentiance.lambda$stopTrip$29((StopTripCallback) obj);
                break;
            case 2:
                sentiance.lambda$setUserActivityListener$45((UserActivityListener) obj);
                break;
            case 3:
                sentiance.lambda$removeUserMetadataField$42((String) obj);
                break;
            case 4:
                sentiance.lambda$getUserAccessToken$39((TokenResultCallback) obj);
                break;
            case 5:
                sentiance.lambda$setTripTimeoutListener$31((TripTimeoutListener) obj);
                break;
            case 6:
                sentiance.lambda$updateSdkNotification$26((Notification) obj);
                break;
            default:
                sentiance.lambda$submitDetections$15((SubmitDetectionsCallback) obj);
                break;
        }
    }
}
