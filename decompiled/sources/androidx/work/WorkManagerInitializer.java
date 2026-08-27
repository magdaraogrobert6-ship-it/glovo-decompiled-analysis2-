package androidx.work;

import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import coil3.ImageLoader$Builder;
import java.util.Collections;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.graphicsLayerpANQ8Wgdefault;
import o.setRotationX;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }

    static {
        setRotationX.IconCompatParcelizer("WrkMgrInitializer");
    }

    public static WorkManagerImpl IconCompatParcelizer(Context context) {
        setRotationX.read().getClass();
        graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = new graphicsLayerpANQ8Wgdefault(new ImageLoader$Builder());
        context.getClass();
        WorkManagerImpl.serializer(context, graphicslayerpanq8wgdefault);
        return WorkManagerImpl.RemoteActionCompatParcelizer(context);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final /* synthetic */ Object create(Context context) {
        return IconCompatParcelizer(context);
    }
}
