package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.room.Room;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidContentCaptureManager;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createTouchAwareListener;
import o.getCieXyz;
import o.isItemDismissable;
import o.notifyViewEntered;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiFrameClock implements notifyViewEntered {
    public static final int $stable = 8;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    @Override // o.TextAnnouncementContentCardView
    public <R> R fold(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return (R) Room.IconCompatParcelizer(this, r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.TextAnnouncementContentCardView
    public <E extends ShortNewsContentCardViewViewHolder> E get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return (E) Room.write(this, imageOnlyContentCardViewViewHolder);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // o.notifyViewEntered, o.ShortNewsContentCardViewViewHolder
    public /* bridge */ /* synthetic */ ImageOnlyContentCardViewViewHolder getKey() {
        return AndroidContentCaptureManager.IconCompatParcelizer;
    }

    @Override // o.TextAnnouncementContentCardView
    public TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return Room.read(this, textAnnouncementContentCardView);
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0064  */
    @Override // o.notifyViewEntered
    public <R> Object withFrameNanos(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        final AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = shortNewsContentCardView.getContext().get(ShortNewsContentCardViewCompanion.serializer);
            androidUiDispatcher = shortNewsContentCardViewViewHolder instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) shortNewsContentCardViewViewHolder : null;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object isitemdismissable;
                createTouchAwareListener createtouchawarelistener = cancellableContinuationImpl;
                try {
                    isitemdismissable = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
                createtouchawarelistener.resumeWith(isitemdismissable);
            }
        };
        if (androidUiDispatcher != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidUiDispatcher.getChoreographer(), getChoreographer()}, getCieXyz.write())).booleanValue()) {
                androidUiDispatcher.postFrameCallback$ui(frameCallback);
                cancellableContinuationImpl.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return createFromParcel.INSTANCE;
                    }

                    public final void invoke(Throwable th) {
                        androidUiDispatcher.removeFrameCallback$ui(frameCallback);
                    }
                });
            } else {
                getChoreographer().postFrameCallback(frameCallback);
                cancellableContinuationImpl.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(Throwable th) {
                        this.this$0.getChoreographer().removeFrameCallback(frameCallback);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return createFromParcel.INSTANCE;
                    }
                });
            }
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            cancellableContinuationImpl.IconCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(Throwable th) {
                    this.this$0.getChoreographer().removeFrameCallback(frameCallback);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return createFromParcel.INSTANCE;
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }
}
