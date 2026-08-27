package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.Channel$Factory;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.IInAppMessageViewWrapper;
import o.logUnregisterActivitylambda1;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class FlowKt__ShareKt {
    public static final SharingConfig read(Flow flow) {
        logUnregisterActivitylambda1.ResultReceiver.getClass();
        int i = Channel$Factory.serializer;
        if (1 >= i) {
            i = 1;
        }
        int i2 = i - 1;
        if (flow instanceof ChannelFlow) {
            ChannelFlow channelFlow = (ChannelFlow) flow;
            IInAppMessageViewWrapper iInAppMessageViewWrapper = channelFlow.MediaSessionCompatQueueItem;
            Flow flowIconCompatParcelizer = channelFlow.IconCompatParcelizer();
            if (flowIconCompatParcelizer != null) {
                int i3 = channelFlow.RemoteActionCompatParcelizer;
                if (i3 != -3 && i3 != -2 && i3 != 0) {
                    i2 = i3;
                } else if (iInAppMessageViewWrapper != IInAppMessageViewWrapper.SUSPEND || i3 == 0) {
                    i2 = 0;
                }
                return new SharingConfig(i2, channelFlow.RatingCompat, iInAppMessageViewWrapper, flowIconCompatParcelizer);
            }
        }
        return new SharingConfig(i2, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, IInAppMessageViewWrapper.SUSPEND, flow);
    }
}
