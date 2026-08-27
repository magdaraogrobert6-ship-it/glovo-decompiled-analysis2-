package androidx.compose.foundation.interaction;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.ButtonDefaults;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class MutableInteractionSourceImpl {
    public final SharedFlowImpl serializer = SharedFlowKt.RemoteActionCompatParcelizer(0, 16, IInAppMessageViewWrapper.DROP_OLDEST, 1);

    public final Object emit(ButtonDefaults buttonDefaults, ShortNewsContentCardView shortNewsContentCardView) {
        Object objEmit = this.serializer.emit(buttonDefaults, shortNewsContentCardView);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : createFromParcel.INSTANCE;
    }

    public final boolean write(ButtonDefaults buttonDefaults) {
        return this.serializer.write(buttonDefaults);
    }
}
