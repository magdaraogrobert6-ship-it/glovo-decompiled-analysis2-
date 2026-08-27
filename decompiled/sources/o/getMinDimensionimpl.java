package o;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getMinDimensionimpl implements toAndroidColorSpace {
    public final /* synthetic */ div7Ah8Wj8 IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ supportsColorMatrixQuery read;
    public final /* synthetic */ isUnspecifieduvyYCjk serializer;

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        Bundle bundle;
        div7Ah8Wj8 div7ah8wj8 = this.IconCompatParcelizer;
        Map map = div7ah8wj8._init_lambda1;
        AndroidColorSpace_androidKt androidColorSpace_androidKt2 = AndroidColorSpace_androidKt.ON_START;
        String str = this.RemoteActionCompatParcelizer;
        if (androidColorSpace_androidKt == androidColorSpace_androidKt2 && (bundle = (Bundle) map.get(str)) != null) {
            this.serializer.onFragmentResult(bundle, str);
            map.remove(str);
            div7Ah8Wj8.RemoteActionCompatParcelizer(2);
        }
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            this.read.read(this);
            div7ah8wj8.accessensureViewModelStore.remove(str);
        }
    }

    public getMinDimensionimpl(div7Ah8Wj8 div7ah8wj8, String str, isUnspecifieduvyYCjk isunspecifieduvyycjk, supportsColorMatrixQuery supportscolormatrixquery) {
        this.IconCompatParcelizer = div7ah8wj8;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = isunspecifieduvyycjk;
        this.read = supportscolormatrixquery;
    }
}
