package o;

import io.reactivex.disposables.Disposable;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambdai3KSD0UoUdgNsNEC4ClvZciqnX0 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ TextAnnouncementContentCardView IconCompatParcelizer;
    public final /* synthetic */ Disposable read;
    public final /* synthetic */ Runnable serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdai3KSD0UoUdgNsNEC4ClvZciqnX0(Disposable disposable, TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        super(1, TextStreamsKt.class, "task", "scheduleTask$task(Lio/reactivex/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.read = disposable;
        this.IconCompatParcelizer = textAnnouncementContentCardView;
        this.serializer = runnable;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.IconCompatParcelizer;
        Runnable runnable = this.serializer;
        return TextStreamsKt.access$scheduleTask$task(this.read, textAnnouncementContentCardView, runnable, (ShortNewsContentCardView) obj);
    }
}
