package o;

import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;

/* JADX INFO: loaded from: classes4.dex */
public final class downloadFileToPathlambda6 extends downloadFileToPathlambda2 {
    public final InferenceResult$Failure$InferenceError RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public downloadFileToPathlambda6(InferenceResult$Failure$InferenceError inferenceResult$Failure$InferenceError) {
        inferenceResult$Failure$InferenceError.getClass();
        this.RemoteActionCompatParcelizer = inferenceResult$Failure$InferenceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof downloadFileToPathlambda6) && this.RemoteActionCompatParcelizer == ((downloadFileToPathlambda6) obj).RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Failure(error=" + this.RemoteActionCompatParcelizer + ')';
    }
}
