package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda3;
import java.util.Collections;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.setRoundRectOutlineTNW_H78default;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstallerInitializer implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new MapboxRenderThread$$ExternalSyntheticLambda3(this, context.getApplicationContext()));
        return new setRoundRectOutlineTNW_H78default(5);
    }
}
