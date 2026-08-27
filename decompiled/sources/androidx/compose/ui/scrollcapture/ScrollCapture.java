package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRectKt;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.YieldKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {
    public static final int $stable = 0;
    private final PopulateViewStructure_androidKtpopulate7 scrollCaptureInProgress$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ScrollCaptureCandidate) obj);
            return createFromParcel.INSTANCE;
        }

        public final void invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
            ((onCreateVirtualViewTranslationRequests) this.MediaSessionCompatQueueItem).IconCompatParcelizer(scrollCaptureCandidate);
        }

        public AnonymousClass1(Object obj) {
            super(1, 8, onCreateVirtualViewTranslationRequests.class, obj, "add", "add(Ljava/lang/Object;)Z");
        }
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionEnded() {
        setScrollCaptureInProgress(false);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionStarted() {
        setScrollCaptureInProgress(true);
    }

    public final boolean getScrollCaptureInProgress() {
        return ((Boolean) this.scrollCaptureInProgress$delegate.getValue()).booleanValue();
    }

    public final void onScrollCaptureSearch(View view, SemanticsOwner semanticsOwner, TextAnnouncementContentCardView textAnnouncementContentCardView, Consumer<ScrollCaptureTarget> consumer) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new ScrollCaptureCandidate[16]);
        ScrollCapture_androidKt.visitScrollCaptureCandidates$default(semanticsOwner.getUnmergedRootSemanticsNode(), 0, new AnonymousClass1(oncreatevirtualviewtranslationrequests), 2, null);
        Arrays.sort(oncreatevirtualviewtranslationrequests.write, 0, oncreatevirtualviewtranslationrequests.read, setNativeShader.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture.onScrollCaptureSearch.2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getDepth());
            }
        }, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture.onScrollCaptureSearch.3
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().getHeight());
            }
        }));
        int i = oncreatevirtualviewtranslationrequests.read;
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (i != 0 ? oncreatevirtualviewtranslationrequests.write[i - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), this, view);
        Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(scrollCaptureCandidate.getCoordinates());
        long jM3830getTopLeftnOccac = scrollCaptureCandidate.getViewportBoundsInWindow().m3830getTopLeftnOccac();
        ScrollCaptureTarget scrollCaptureTargetM = ScrollCapture$$ExternalSyntheticApiModelOutline0.m(view, RectHelper_androidKt.toAndroidRect(IntRectKt.roundToIntRect(rectBoundsInRoot)), new Point(IntOffset.m3801getXimpl(jM3830getTopLeftnOccac), IntOffset.m3802getYimpl(jM3830getTopLeftnOccac)), composeScrollCaptureCallback);
        scrollCaptureTargetM.setScrollBounds(RectHelper_androidKt.toAndroidRect(scrollCaptureCandidate.getViewportBoundsInWindow()));
        consumer.accept(scrollCaptureTargetM);
    }

    private final void setScrollCaptureInProgress(boolean z) {
        this.scrollCaptureInProgress$delegate.setValue(Boolean.valueOf(z));
    }
}
