package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.RootForTest;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onViewCreatedCallback;

        private Companion() {
        }

        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            onViewCreatedCallback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    boolean getHasPendingMeasureOrLayout();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}
