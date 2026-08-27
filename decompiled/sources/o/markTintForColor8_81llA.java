package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class markTintForColor8_81llA extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.emoji2.text.EmojiProcessor read;
    public androidx.emoji2.text.EmojiProcessor serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public markTintForColor8_81llA(androidx.emoji2.text.EmojiProcessor emojiProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = emojiProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.reportImageLoadingTimeTrace(null, this);
    }
}
