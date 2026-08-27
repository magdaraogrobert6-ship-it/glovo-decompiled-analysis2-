package kotlinx.coroutines;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.text.RegexKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.getDismissRunnable;
import o.onItemDismisslambda0;
import o.r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA;
import o.setActionHintVisible;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ShortNewsContentCardViewViewHolder {
    public static final getDismissRunnable read = new getDismissRunnable(ShortNewsContentCardViewCompanion.serializer, new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(3));

    public abstract void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable);

    public void dispatchYield(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        DispatchedContinuationKt.write(this, textAnnouncementContentCardView, runnable);
    }

    public boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return true;
    }

    @onItemDismisslambda0
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    public CoroutineDispatcher() {
        super(ShortNewsContentCardViewCompanion.serializer);
    }

    public final <T> ShortNewsContentCardView<T> interceptContinuation(ShortNewsContentCardView<? super T> shortNewsContentCardView) {
        return new DispatchedContinuation(this, shortNewsContentCardView);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + RegexKt.IconCompatParcelizer(this);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, o.TextAnnouncementContentCardView
    public <E extends ShortNewsContentCardViewViewHolder> E get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        E e;
        imageOnlyContentCardViewViewHolder.getClass();
        if (imageOnlyContentCardViewViewHolder instanceof setActionHintVisible) {
            setActionHintVisible setactionhintvisible = (setActionHintVisible) imageOnlyContentCardViewViewHolder;
            ImageOnlyContentCardViewViewHolder key = getKey();
            key.getClass();
            if ((key == setactionhintvisible || setactionhintvisible.read == key) && (e = (E) setactionhintvisible.write.invoke(this)) != null) {
                return e;
            }
        } else if (ShortNewsContentCardViewCompanion.serializer == imageOnlyContentCardViewViewHolder) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (((o.ShortNewsContentCardViewViewHolder) r3.write.invoke(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (o.ShortNewsContentCardViewCompanion.serializer == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
     */
    @Override // kotlin.coroutines.AbstractCoroutineContextElement, o.TextAnnouncementContentCardView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.TextAnnouncementContentCardView minusKey(o.ImageOnlyContentCardViewViewHolder r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof o.setActionHintVisible
            if (r0 == 0) goto L23
            o.setActionHintVisible r3 = (o.setActionHintVisible) r3
            o.ImageOnlyContentCardViewViewHolder r0 = r2.getKey()
            r0.getClass()
            if (r0 == r3) goto L18
            o.ImageOnlyContentCardViewViewHolder r1 = r3.read
            if (r1 != r0) goto L17
            goto L18
        L17:
            return r2
        L18:
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r3.write
            java.lang.Object r3 = r3.invoke(r2)
            o.ShortNewsContentCardViewViewHolder r3 = (o.ShortNewsContentCardViewViewHolder) r3
            if (r3 == 0) goto L2a
            goto L27
        L23:
            o.ShortNewsContentCardViewCompanion r0 = o.ShortNewsContentCardViewCompanion.serializer
            if (r0 != r3) goto L2a
        L27:
            o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r3 = o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write
            goto L2b
        L2a:
            r3 = r2
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineDispatcher.minusKey(o.ImageOnlyContentCardViewViewHolder):o.TextAnnouncementContentCardView");
    }

    public final void releaseInterceptedContinuation(ShortNewsContentCardView<?> shortNewsContentCardView) {
        shortNewsContentCardView.getClass();
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) shortNewsContentCardView;
        dispatchedContinuation.RemoteActionCompatParcelizer();
        CancellableContinuationImpl cancellableContinuationImpl = dispatchedContinuation.read();
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.IconCompatParcelizer();
        }
    }

    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.RemoteActionCompatParcelizer(i);
        return new LimitedDispatcher(this, i, str);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return coroutineDispatcher.limitedParallelism(i, str);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: limitedParallelism");
        return null;
    }

    @onItemDismisslambda0
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
