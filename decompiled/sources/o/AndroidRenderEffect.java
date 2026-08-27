package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidRenderEffect implements FlowCollector {
    public static final AndroidRenderEffect serializer = new AndroidRenderEffect();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return createFromParcel.INSTANCE;
    }
}
