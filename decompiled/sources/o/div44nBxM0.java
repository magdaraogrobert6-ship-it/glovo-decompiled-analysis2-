package o;

/* JADX INFO: loaded from: classes2.dex */
public final class div44nBxM0 extends io.sentry.util.network.IconCompatParcelizer {
    @Override // io.sentry.util.network.IconCompatParcelizer
    public final float getValue(getScaleXannotations getscalexannotations) {
        return getscalexannotations.serializer * 10000.0f;
    }

    @Override // io.sentry.util.network.IconCompatParcelizer
    public final void setValue(getScaleXannotations getscalexannotations, float f) {
        getscalexannotations.serializer = f / 10000.0f;
        getscalexannotations.invalidateSelf();
    }
}
