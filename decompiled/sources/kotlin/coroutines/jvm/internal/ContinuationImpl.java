package kotlin.coroutines.jvm.internal;

import kotlinx.coroutines.CoroutineDispatcher;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambda2jFm_YVSiZ2AJwOQAaSn7ftD9E;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final TextAnnouncementContentCardView serializer;
    private transient ShortNewsContentCardView<Object> write;

    public ContinuationImpl(ShortNewsContentCardView shortNewsContentCardView) {
        this(shortNewsContentCardView, shortNewsContentCardView != null ? shortNewsContentCardView.getContext() : null);
    }

    @Override // o.ShortNewsContentCardView
    public TextAnnouncementContentCardView getContext() {
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.serializer;
        textAnnouncementContentCardView.getClass();
        return textAnnouncementContentCardView;
    }

    public final ShortNewsContentCardView<Object> intercepted() {
        ShortNewsContentCardView<Object> shortNewsContentCardViewInterceptContinuation = this.write;
        if (shortNewsContentCardViewInterceptContinuation == null) {
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) getContext().get(ShortNewsContentCardViewCompanion.serializer);
            if (coroutineDispatcher == null || (shortNewsContentCardViewInterceptContinuation = coroutineDispatcher.interceptContinuation(this)) == null) {
                shortNewsContentCardViewInterceptContinuation = this;
            }
            this.write = shortNewsContentCardViewInterceptContinuation;
        }
        return shortNewsContentCardViewInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        ShortNewsContentCardView<?> shortNewsContentCardView = this.write;
        if (shortNewsContentCardView != null && shortNewsContentCardView != this) {
            ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = getContext().get(ShortNewsContentCardViewCompanion.serializer);
            shortNewsContentCardViewViewHolder.getClass();
            ((CoroutineDispatcher) shortNewsContentCardViewViewHolder).releaseInterceptedContinuation(shortNewsContentCardView);
        }
        this.write = r8lambda2jFm_YVSiZ2AJwOQAaSn7ftD9E.RemoteActionCompatParcelizer;
    }

    public ContinuationImpl(ShortNewsContentCardView shortNewsContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = textAnnouncementContentCardView;
    }
}
