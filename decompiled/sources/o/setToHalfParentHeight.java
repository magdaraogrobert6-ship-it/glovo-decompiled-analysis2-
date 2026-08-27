package o;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class setToHalfParentHeight {
    public static onViewAttachedToWindowlambda0 read;
    public static boolean write;

    public static final void RemoteActionCompatParcelizer(Application application) {
        if (write) {
            return;
        }
        try {
            if (read == null) {
                FrameLayout frameLayout = new FrameLayout(application);
                for (int i = 0; i < 32; i++) {
                    frameLayout.addView(new View(application));
                }
                read = new onViewAttachedToWindowlambda0(frameLayout, new ArrayList());
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = read;
            if (onviewattachedtowindowlambda0 == null) {
                removeNodeAtDepth.read();
                throw null;
            }
            ((ViewGroup) onviewattachedtowindowlambda0.serializer).addChildrenForAccessibility((ArrayList) onviewattachedtowindowlambda0.write);
        } catch (Throwable unused) {
            write = true;
        }
    }
}
