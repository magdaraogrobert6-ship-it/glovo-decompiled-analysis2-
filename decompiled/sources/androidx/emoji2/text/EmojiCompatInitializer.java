package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import o.MutableRect0a9Yr6o;
import o.MutableRectKt;
import o.accessgetPastecp;
import o.accessisRenderNodeCompatiblecp;
import o.accesssetHasRetrievedMethodcp;
import o.copyColorMatrixgBh15pIdefault;
import o.getDistanceSquaredimpl;
import o.setToSaturationimpl;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes4.dex */
public class EmojiCompatInitializer implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        getDistanceSquaredimpl getdistancesquaredimpl = new getDistanceSquaredimpl(new accesssetHasRetrievedMethodcp(context));
        getdistancesquaredimpl.read = 1;
        if (MutableRectKt.RemoteActionCompatParcelizer == null) {
            synchronized (MutableRectKt.write) {
                if (MutableRectKt.RemoteActionCompatParcelizer == null) {
                    MutableRectKt.RemoteActionCompatParcelizer = new MutableRectKt(getdistancesquaredimpl);
                }
            }
        }
        final supportsColorMatrixQuery lifecycle = ((accessisRenderNodeCompatiblecp) setToSaturationimpl.IconCompatParcelizer(context).read(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.IconCompatParcelizer(new DefaultLifecycleObserver(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
                MutableRect0a9Yr6o.serializer(Looper.getMainLooper()).postDelayed(new accessgetPastecp(1), 500L);
                lifecycle.read(this);
            }
        });
        return Boolean.TRUE;
    }
}
