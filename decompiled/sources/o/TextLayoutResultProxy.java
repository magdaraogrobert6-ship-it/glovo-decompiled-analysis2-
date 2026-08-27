package o;

/* JADX INFO: loaded from: classes.dex */
public final class TextLayoutResultProxy implements PlatformSelectionBehaviorsImpl {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ Object write;

    public TextLayoutResultProxy(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, androidx.compose.foundation.pager.PagerState pagerState) {
        this.write = platformSelectionBehaviorsImpl;
    }

    @Override // o.PlatformSelectionBehaviorsImpl
    public final float read(float f) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        if (i != 0) {
            return ((PlatformSelectionBehaviorsImpl) obj).read(f);
        }
        androidx.compose.foundation.gestures.DefaultScrollableState defaultScrollableState = (androidx.compose.foundation.gestures.DefaultScrollableState) obj;
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        float fFloatValue = ((Number) defaultScrollableState.serializer.invoke(Float.valueOf(f))).floatValue();
        ((onShowTranslationui) defaultScrollableState.RemoteActionCompatParcelizer).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((onShowTranslationui) defaultScrollableState.write).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }

    public TextLayoutResultProxy(androidx.compose.foundation.gestures.DefaultScrollableState defaultScrollableState) {
        this.write = defaultScrollableState;
    }
}
