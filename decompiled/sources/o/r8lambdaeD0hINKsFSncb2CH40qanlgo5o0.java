package o;

import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class r8lambdaeD0hINKsFSncb2CH40qanlgo5o0 extends setGoodNetworkDataFlushInterval {
    public static final r8lambdaf_wtlW_Q2vMIFVFv9RP0ZRduM8 Companion = new r8lambdaf_wtlW_Q2vMIFVFv9RP0ZRduM8();
    public static final setGraphicModalMaxWidthDp[] b;
    public final InferenceResult$Failure$InferenceError a;

    static {
        InferenceResult$Failure$InferenceError[] inferenceResult$Failure$InferenceErrorArrValues = InferenceResult$Failure$InferenceError.values();
        inferenceResult$Failure$InferenceErrorArrValues.getClass();
        b = new setGraphicModalMaxWidthDp[]{new EnumSerializer("com.sentiance.tflitemodel.InferenceResult.Failure.InferenceError", (Enum[]) inferenceResult$Failure$InferenceErrorArrValues)};
    }

    public r8lambdaeD0hINKsFSncb2CH40qanlgo5o0(InferenceResult$Failure$InferenceError inferenceResult$Failure$InferenceError) {
        inferenceResult$Failure$InferenceError.getClass();
        this.a = inferenceResult$Failure$InferenceError;
    }
}
