package o;

import android.util.DisplayMetrics;
import androidx.transition.Transition$1;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ActivityMetricsLifecycleCallback;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class getMantissa64annotations extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ drawCachedImageFqjB98A write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getMantissa64annotations(drawCachedImageFqjB98A drawcachedimagefqjb98a, int i) {
        super(0);
        this.IconCompatParcelizer = i;
        this.write = drawcachedimagefqjb98a;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        insertAt insertat;
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            drawCachedImageFqjB98A drawcachedimagefqjb98a = this.write;
            return new Extras$Key(16, new androidx.transition.TransitionValuesMaps(drawcachedimagefqjb98a.PlaybackStateCompatCustomAction, drawcachedimagefqjb98a.MediaSessionCompatQueueItem));
        }
        if (i != 1) {
            if (i == 2) {
                return new Transition$1((updateMatrix) this.write.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper());
            }
            drawCachedImageFqjB98A drawcachedimagefqjb98a2 = this.write;
            BlurFilter blurFilter = drawcachedimagefqjb98a2.MediaSessionCompatResultReceiverWrapper;
            updateMatrix updatematrix = (updateMatrix) drawcachedimagefqjb98a2.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
            DisplayMetrics displayMetrics = drawcachedimagefqjb98a2.read.getResources().getDisplayMetrics();
            displayMetrics.getClass();
            return new androidx.emoji2.text.EmojiProcessor(blurFilter, updatematrix, displayMetrics);
        }
        drawCachedImageFqjB98A drawcachedimagefqjb98a3 = this.write;
        coil3.memory.MemoryCacheService memoryCacheService = new coil3.memory.MemoryCacheService(drawcachedimagefqjb98a3.MediaSessionCompatResultReceiverWrapper);
        Set set = drawcachedimagefqjb98a3.write.serializer;
        CoroutineDispatcher coroutineDispatcher = drawcachedimagefqjb98a3.MediaSessionCompatQueueItem;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = drawcachedimagefqjb98a3.PlaybackStateCompatCustomAction;
        setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default = insertAt.serializer;
        accessgetVcp accessgetvcp = setInvalidateListenerui.serializer;
        setInvalidateListenerui setinvalidatelistenerui = setInvalidateListenerui.RemoteActionCompatParcelizer;
        if (setinvalidatelistenerui == null) {
            synchronized (accessgetvcp) {
                setinvalidatelistenerui = setInvalidateListenerui.RemoteActionCompatParcelizer;
                if (setinvalidatelistenerui == null) {
                    setinvalidatelistenerui = new setInvalidateListenerui();
                    setInvalidateListenerui.RemoteActionCompatParcelizer = setinvalidatelistenerui;
                }
            }
        }
        setInvalidateListenerui setinvalidatelistenerui2 = setinvalidatelistenerui;
        requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview = this.write.RatingCompat;
        getTintColor0d7_KjU gettintcolor0d7_kju = new getTintColor0d7_KjU(requestfocusbypassunfocusablecomposeview);
        androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(requestfocusbypassunfocusablecomposeview);
        FlingCancellationException flingCancellationException = new FlingCancellationException(7);
        io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new io.sentry.hints.PlaybackStateCompatCustomAction(6);
        new WeakHashMap();
        synchronized (setroundrectoutlinetnw_h78default) {
            insertAt insertat2 = insertAt.RemoteActionCompatParcelizer;
            if (insertat2 == null) {
                insertat2 = new insertAt(setinvalidatelistenerui2, requestfocusbypassunfocusablecomposeview, gettintcolor0d7_kju, emojiProcessor, flingCancellationException, playbackStateCompatCustomAction);
                insertAt.RemoteActionCompatParcelizer = insertat2;
            }
            insertat = insertat2;
        }
        return new ActivityMetricsLifecycleCallback(memoryCacheService, set, coroutineDispatcher, getcontentviewgroupparentlayout, null, null, new RootViewsSpy$Companion$install$1$1(3, this.write), null, insertat);
    }
}
