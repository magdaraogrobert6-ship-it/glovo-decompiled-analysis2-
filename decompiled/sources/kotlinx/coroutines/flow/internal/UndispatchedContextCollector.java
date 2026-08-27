package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    public final Object read;
    public final TextAnnouncementContentCardView serializer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(this.serializer, obj, this.read, this.write, shortNewsContentCardView);
        return objWithContextUndispatched == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithContextUndispatched : createFromParcel.INSTANCE;
    }

    public UndispatchedContextCollector(FlowCollector flowCollector, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.serializer = textAnnouncementContentCardView;
        this.read = ThreadContextKt.read(textAnnouncementContentCardView);
        this.write = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }
}
