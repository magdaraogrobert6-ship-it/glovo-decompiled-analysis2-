package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public final class MultiContentMeasurePolicyKt {
    public static final MeasurePolicy createMeasurePolicy(MultiContentMeasurePolicy multiContentMeasurePolicy) {
        return new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
    }
}
