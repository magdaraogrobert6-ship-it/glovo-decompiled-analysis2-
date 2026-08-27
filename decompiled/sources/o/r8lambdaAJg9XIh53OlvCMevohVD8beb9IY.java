package o;

import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaAJg9XIh53OlvCMevohVD8beb9IY extends getAssetFileStringContents {
    private final r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY write;

    public r8lambdaAJg9XIh53OlvCMevohVD8beb9IY(r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY r8lambda5tpt37vcbval7sy9hqiuvbjtzky, populatePushStoryPage populatepushstorypage) {
        super(new isRemoteUri("LocationClustering", populatepushstorypage.read(), populatepushstorypage.IconCompatParcelizer(), populatepushstorypage.write()));
        this.write = r8lambda5tpt37vcbval7sy9hqiuvbjtzky;
    }

    @Override // o.getAssetFileStringContents
    public final downloadFileToPathlambda2 serializer(List<float[]> list) {
        r8lambdaHRoBInzy5p0D_Sd1bkVgpTt9zlE r8lambdahrobinzy5p0d_sd1bkvgptt9zleSerializer = this.write.serializer(new r8lambda8N6k8H5ys5SdUjcAGprIIBW8zs8(list));
        return r8lambdahrobinzy5p0d_sd1bkvgptt9zleSerializer == null ? new downloadFileToPathlambda6(InferenceResult$Failure$InferenceError.GENERIC) : new isLocalUri(r8lambdahrobinzy5p0d_sd1bkvgptt9zleSerializer.read());
    }
}
