package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.mapbox.common.HttpHeaders;
import io.grpc.Status;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class updateDisplayList {
    public static final HashSet write = new HashSet(Arrays.asList(HttpHeaders.DATE, "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));
    public final calculateLocalPositionMKHz9U IconCompatParcelizer;
    public final RemoteSerializer read;
    public final getTextInputService serializer;

    public static boolean serializer(Status status) {
        FirebaseFirestoreException.IconCompatParcelizer iconCompatParcelizerFromValue = FirebaseFirestoreException.IconCompatParcelizer.fromValue(status.PlaybackStateCompat.value());
        switch (setFrameRateFromParent.write[iconCompatParcelizerFromValue.ordinal()]) {
            case 1:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Treated status OK as error");
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                Gson$$ExternalSyntheticBUOutline0.m(iconCompatParcelizerFromValue, "Unknown gRPC status code: ");
                return false;
        }
    }

    public updateDisplayList(getTextInputService gettextinputservice, RemoteSerializer remoteSerializer, calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u) {
        this.serializer = gettextinputservice;
        this.read = remoteSerializer;
        this.IconCompatParcelizer = calculatelocalpositionmkhz9u;
    }
}
