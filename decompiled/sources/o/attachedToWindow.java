package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class attachedToWindow implements assertConsistent {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public volatile assertConsistent read;
    public HashSet serializer = new HashSet();

    @Override // o.assertConsistent
    public final void serializer(Set set) {
        assertConsistent assertconsistent = this.read;
        if (assertconsistent == RemoteActionCompatParcelizer) {
            return;
        }
        if (assertconsistent != null) {
            assertconsistent.serializer(set);
        } else {
            synchronized (this) {
                this.serializer.addAll(set);
            }
        }
    }

    public attachedToWindow(String str, nodeToString nodetostring, updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreference) {
        updateplacedundermotionframeofreference.IconCompatParcelizer(new PreviewView$1$$ExternalSyntheticLambda2(this, str, nodetostring, 17));
    }
}
