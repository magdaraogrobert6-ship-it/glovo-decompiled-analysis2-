package androidx.compose.ui.graphics.vector;

/* JADX INFO: loaded from: classes4.dex */
public interface VectorConfig {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig vectorConfig, VectorProperty<T> vectorProperty, T t) {
            return (T) VectorConfig.super.getOrDefault(vectorProperty, t);
        }
    }

    default <T> T getOrDefault(VectorProperty<T> vectorProperty, T t) {
        return t;
    }
}
