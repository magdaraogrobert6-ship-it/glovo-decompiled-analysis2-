package o;

import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class deleteDataStoreFilelambda2 extends getAssetFileStringContents {
    private final deleteSharedPreferencesFile write;

    public deleteDataStoreFilelambda2(deleteSharedPreferencesFile deletesharedpreferencesfile, populatePushStoryPage populatepushstorypage) {
        super(new isRemoteUri("VisitEssentials", populatepushstorypage.read(), populatepushstorypage.IconCompatParcelizer(), populatepushstorypage.write()));
        this.write = deletesharedpreferencesfile;
    }

    @Override // o.getAssetFileStringContents
    public final downloadFileToPathlambda2 serializer(List<float[]> list) {
        r8lambdaI2JAG4pt0hsPppV8ZuIPfl7LIl8 r8lambdai2jag4pt0hspppv8zuipfl7lil8Serializer = this.write.serializer(new r8lambdaZpsmHbmLPqrOx8Ep95TrDGqbHC8(list));
        return r8lambdai2jag4pt0hspppv8zuipfl7lil8Serializer == null ? new downloadFileToPathlambda6(InferenceResult$Failure$InferenceError.GENERIC) : new isLocalUri(r8lambdai2jag4pt0hspppv8zuipfl7lil8Serializer.write());
    }

    public final float[] serializer() {
        return r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.write.MediaSessionCompatToken(), new float[0]);
    }
}
