package o;

import bo.app.af$$ExternalSyntheticOutline1;
import coil3.Extras$Key;
import coil3.ImageLoader$Builder;

/* JADX INFO: loaded from: classes.dex */
public final class width implements Arrangement {
    public final Object IconCompatParcelizer;
    public final float read;
    public final float serializer;

    @Override // o.TrackpadScrollingLogic
    public final size3ABfNKs serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        Object obj = this.IconCompatParcelizer;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = obj == null ? null : (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(obj);
        int[] iArr = sizeVpY3zN4.serializer;
        float f = this.read;
        float f2 = this.serializer;
        PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1 pendingValue = transformGestureDetectorKtdetectTransformGestures2 != null ? new androidx.camera.view.PendingValue(transformGestureDetectorKtdetectTransformGestures2, f, f2) : new Extras$Key(f, f2);
        coil3.memory.MemoryCacheService memoryCacheService = new coil3.memory.MemoryCacheService();
        memoryCacheService.RemoteActionCompatParcelizer = new ImageLoader$Builder(pendingValue);
        return memoryCacheService;
    }

    public final int hashCode() {
        Object obj = this.IconCompatParcelizer;
        return Float.hashCode(this.serializer) + af$$ExternalSyntheticOutline1.m(this.read, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof width)) {
            return false;
        }
        width widthVar = (width) obj;
        if (widthVar.read != this.read || widthVar.serializer != this.serializer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{widthVar.IconCompatParcelizer, this.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ width(int i, Object obj) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    public width(float f, float f2, Object obj) {
        this.read = f;
        this.serializer = f2;
        this.IconCompatParcelizer = obj;
    }
}
