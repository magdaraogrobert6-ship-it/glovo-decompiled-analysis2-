package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.crashdetection.api.CrashDetectionState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TwoWheelerCrashModelExecutor")
public final class r8lambdaK_UM3kapjWm6fpUvoj3uFtSes extends r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY<r8lambdaQblfvuTAUwLJ6MnHOKE1qwkObM, r8lambdaY_tw5xdi3vE_VCye43O8vkd3Gv0> {
    private final float[][] read;

    @Override // o.r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY
    public final void MediaSessionCompatQueueItem() {
        int i = r8lambdaVE_zPOiqvDV1CHt6KyA20QVrsc0.write;
    }

    @Override // o.r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY
    public final r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA write(int i, r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk r8lambdamx_xxzgulojgjtf7uabdpxnqsk, long j, ArrayList arrayList) {
        r8lambdaY_tw5xdi3vE_VCye43O8vkd3Gv0 r8lambday_tw5xdi3ve_vcye43o8vkd3gv0 = (r8lambdaY_tw5xdi3vE_VCye43O8vkd3Gv0) r8lambdamx_xxzgulojgjtf7uabdpxnqsk;
        arrayList.getClass();
        long j2 = i;
        int i2 = r8lambdaVE_zPOiqvDV1CHt6KyA20QVrsc0.write;
        long jRatingCompat = ((long) r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.RatingCompat()) + (j2 * 9000) + j;
        Location location = new Location("");
        location.setLatitude(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.MediaSessionCompatQueueItem());
        location.setLongitude(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.MediaMetadataCompat());
        location.setTime(jRatingCompat);
        r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA.serializer serializerVar = new r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA.serializer();
        serializerVar.IconCompatParcelizer(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.MediaDescriptionCompat());
        serializerVar.IconCompatParcelizer(jRatingCompat);
        serializerVar.RemoteActionCompatParcelizer(location);
        serializerVar.serializer(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.MediaBrowserCompatMediaItem());
        serializerVar.write(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.write());
        serializerVar.read(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.RemoteActionCompatParcelizer());
        serializerVar.RemoteActionCompatParcelizer(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.IconCompatParcelizer());
        serializerVar.RemoteActionCompatParcelizer(CrashDetectionState.of(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.read()));
        serializerVar.serializer(r8lambday_tw5xdi3ve_vcye43o8vkd3gv0.serializer());
        serializerVar.write(arrayList);
        return new r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA(serializerVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaK_UM3kapjWm6fpUvoj3uFtSes(parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaVE_zPOiqvDV1CHt6KyA20QVrsc0 r8lambdave_zpoiqvdv1cht6kya20qvrsc0) {
        super(parselonglambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdave_zpoiqvdv1cht6kya20qvrsc0);
        parselonglambda0.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdave_zpoiqvdv1cht6kya20qvrsc0.getClass();
        float[][] fArr = new float[900][];
        for (int i = 0; i < 900; i++) {
            fArr[i] = new float[4];
        }
        this.read = fArr;
    }

    @Override // o.r8lambdaurmKs4Gj6XSBB3zS0bdHIWkbY
    public final r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY write(r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0) {
        long jMediaMetadataCompat = MediaMetadataCompat();
        r8lambdawsScXbU3AiTaDZl7q7ghvDoPto r8lambdawsscxbu3aitadzl7q7ghvdoptoSerializer = serializer();
        long jWrite = write(r8lambdawsscxbu3aitadzl7q7ghvdoptoSerializer.RemoteActionCompatParcelizer());
        MediaSessionCompatQueueItem();
        MediaSessionCompatQueueItem();
        r8lambdaQblfvuTAUwLJ6MnHOKE1qwkObM r8lambdaqblfvutauwlj6mnhoke1qwkobm = new r8lambdaQblfvuTAUwLJ6MnHOKE1qwkObM(r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.RemoteActionCompatParcelizer(9, r8lambdajyieMEPHfDZ0H9VbS9ICj8_yOE.serializer(write(), r8lambdaaig5zvykrh73tepxo0st1uppjw0), r8lambdaaig5zvykrh73tepxo0st1uppjw0), r8lambdawsscxbu3aitadzl7q7ghvdoptoSerializer.write((jWrite * 9000) + jMediaMetadataCompat, 9000L, 900), this.read);
        float[][] fArr = r8lambdaqblfvutauwlj6mnhoke1qwkobm.write;
        boolean z = false;
        boolean z2 = fArr.length == 900 && fArr[0].length == 4;
        float[][] fArr2 = r8lambdaqblfvutauwlj6mnhoke1qwkobm.RemoteActionCompatParcelizer;
        boolean z3 = fArr2.length == 900 && fArr2[0].length == 4;
        float[][] fArr3 = r8lambdaqblfvutauwlj6mnhoke1qwkobm.read;
        if (fArr3.length == 9 && fArr3[0].length == 5) {
            z = true;
        }
        if (z2 && z3 && z) {
            return r8lambdaqblfvutauwlj6mnhoke1qwkobm;
        }
        return null;
    }
}
