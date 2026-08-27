package o;

import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI extends r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE {
    public final InferenceResult$Failure$InferenceError serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI(InferenceResult$Failure$InferenceError inferenceResult$Failure$InferenceError) {
        inferenceResult$Failure$InferenceError.getClass();
        this.serializer = inferenceResult$Failure$InferenceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI) && this.serializer == ((r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI) obj).serializer;
    }

    public final String toString() {
        return "Failure(error=" + this.serializer + ')';
    }
}
