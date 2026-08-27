package o;

import coil3.compose.AsyncImagePreviewHandler$Companion$Default$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class stampedPathEffect7aD1DOk extends ContinuationImpl {
    public final /* synthetic */ AsyncImagePreviewHandler$Companion$Default$1 IconCompatParcelizer;
    public ShaderKt RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stampedPathEffect7aD1DOk(AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = asyncImagePreviewHandler$Companion$Default$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.handle(null, null, this);
    }
}
