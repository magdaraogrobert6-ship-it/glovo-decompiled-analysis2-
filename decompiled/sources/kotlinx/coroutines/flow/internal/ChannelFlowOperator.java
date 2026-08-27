package kotlinx.coroutines.flow.internal;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import androidx.sqlite.SQLite;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    public final Flow IconCompatParcelizer;

    public abstract Object flowCollect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) {
        Object objFlowCollect = flowCollect(new SendingCollector(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1), shortNewsContentCardView);
        return objFlowCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objFlowCollect : createFromParcel.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return this.IconCompatParcelizer + " -> " + super.toString();
    }

    public ChannelFlowOperator(int i, TextAnnouncementContentCardView textAnnouncementContentCardView, IInAppMessageViewWrapper iInAppMessageViewWrapper, Flow flow) {
        super(textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
        this.IconCompatParcelizer = flow;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba A[RETURN] */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect;
        FlowCollector undispatchedContextCollector = flowCollector;
        if (this.RemoteActionCompatParcelizer == -3) {
            TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
            Boolean bool = Boolean.FALSE;
            SaversKt$$ExternalSyntheticLambda7 saversKt$$ExternalSyntheticLambda7 = new SaversKt$$ExternalSyntheticLambda7(5);
            TextAnnouncementContentCardView textAnnouncementContentCardView = this.RatingCompat;
            TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = !((Boolean) textAnnouncementContentCardView.fold(bool, saversKt$$ExternalSyntheticLambda7)).booleanValue() ? context.plus(textAnnouncementContentCardView) : SQLite.IconCompatParcelizer(context, textAnnouncementContentCardView, false);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnouncementContentCardViewPlus, context}, getCieXyz.write())).booleanValue()) {
                Object objFlowCollect = flowCollect(flowCollector, shortNewsContentCardView);
                if (objFlowCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objFlowCollect;
                }
            } else {
                ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnouncementContentCardViewPlus.get(shortNewsContentCardViewCompanion), context.get(shortNewsContentCardViewCompanion)}, getCieXyz.write())).booleanValue()) {
                    TextAnnouncementContentCardView context2 = shortNewsContentCardView.getContext();
                    if (!(undispatchedContextCollector instanceof SendingCollector) && !(undispatchedContextCollector instanceof NopCollector)) {
                        undispatchedContextCollector = new UndispatchedContextCollector(undispatchedContextCollector, context2);
                    }
                    Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(textAnnouncementContentCardViewPlus, undispatchedContextCollector, ThreadContextKt.read(textAnnouncementContentCardViewPlus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), shortNewsContentCardView);
                    if (objWithContextUndispatched == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objWithContextUndispatched;
                    }
                } else {
                    objCollect = super.collect(flowCollector, shortNewsContentCardView);
                    if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(flowCollector, shortNewsContentCardView);
            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
