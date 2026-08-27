package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getIdui_graphics extends ContinuationImpl {
    public String IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public String RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.write |= Integer.MIN_VALUE;
        return com.airbnb.lottie.compose.RememberLottieCompositionKt.lottieComposition(null, null, null, null, null, null, this);
    }

    public getIdui_graphics(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
