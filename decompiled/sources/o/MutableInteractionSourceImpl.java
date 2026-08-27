package o;

import coil3.ImageLoader$Builder;

/* JADX INFO: loaded from: classes.dex */
public interface MutableInteractionSourceImpl extends TrackpadScrollingLogic {
    float getValueFromNanos(long j, float f, float f2, float f3);

    float getVelocityFromNanos(long j, float f, float f2, float f3);

    long read(float f, float f2, float f3);

    @Override // o.TrackpadScrollingLogic
    default size3ABfNKs serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        return new ImageLoader$Builder(this);
    }

    default float IconCompatParcelizer(float f, float f2, float f3) {
        return getVelocityFromNanos(read(f, f2, f3), f, f2, f3);
    }
}
