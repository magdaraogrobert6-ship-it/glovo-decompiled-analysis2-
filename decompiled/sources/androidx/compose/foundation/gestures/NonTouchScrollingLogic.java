package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.math.MathKt;
import o.SelectionHandlewLIcFTc;
import o.ShortNewsContentCardView;
import o.TextFieldSizeElement;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdazYHaavZJjLuyVf1blLVNKvefrRs;

/* JADX INFO: loaded from: classes.dex */
public abstract class NonTouchScrollingLogic {
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaBrowserCompatMediaItem;
    public final TextFieldSizeElement MediaDescriptionCompat = new TextFieldSizeElement();
    public final ScrollingLogic MediaMetadataCompat;
    public boolean serializer;
    public Density write;

    public NonTouchScrollingLogic(ScrollingLogic scrollingLogic, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Density density) {
        this.MediaMetadataCompat = scrollingLogic;
        this.MediaBrowserCompatMediaItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.write = density;
    }

    public static void consume$foundation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            changes.get(i).consume();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object userScroll$foundation(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        SelectionHandlewLIcFTc selectionHandlewLIcFTc;
        if (continuationImpl instanceof SelectionHandlewLIcFTc) {
            selectionHandlewLIcFTc = (SelectionHandlewLIcFTc) continuationImpl;
            int i = selectionHandlewLIcFTc.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionHandlewLIcFTc.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                selectionHandlewLIcFTc = new SelectionHandlewLIcFTc(this, continuationImpl);
            }
        } else {
            selectionHandlewLIcFTc = new SelectionHandlewLIcFTc(this, continuationImpl);
        }
        Object obj = selectionHandlewLIcFTc.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionHandlewLIcFTc.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = true;
            BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView, 6);
            selectionHandlewLIcFTc.IconCompatParcelizer = 1;
            r8lambdazYHaavZJjLuyVf1blLVNKvefrRs r8lambdazyhaavzjjluyvf1bllvnkvefrrs = new r8lambdazYHaavZJjLuyVf1blLVNKvefrRs(selectionHandlewLIcFTc, selectionHandlewLIcFTc.getContext());
            if (MathKt.startUndspatched(r8lambdazyhaavzjjluyvf1bllvnkvefrrs, true, r8lambdazyhaavzjjluyvf1bllvnkvefrrs, blockRunner$maybeRun$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        this.serializer = false;
        return createFromParcel.INSTANCE;
    }
}
