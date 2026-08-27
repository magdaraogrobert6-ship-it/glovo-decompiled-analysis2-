package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedFlowKt {
    public static final Symbol write = new Symbol("NO_VALUE");

    public static final void serializer(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final Flow IconCompatParcelizer(SharedFlow sharedFlow, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return ((i == 0 || i == -3) && iInAppMessageViewWrapper == IInAppMessageViewWrapper.SUSPEND) ? sharedFlow : new ChannelFlowOperatorImpl(i, textAnnouncementContentCardView, iInAppMessageViewWrapper, sharedFlow);
    }

    public static final SharedFlowImpl RemoteActionCompatParcelizer(int i, int i2, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        if (i < 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 >= 0) {
            if (i <= 0 && i2 <= 0 && iInAppMessageViewWrapper != IInAppMessageViewWrapper.SUSPEND) {
                DrawableTransformation.serializer(iInAppMessageViewWrapper, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                return null;
            }
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i, i3, iInAppMessageViewWrapper);
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i2, "extraBufferCapacity cannot be negative, but was "));
        return null;
    }

    public static /* synthetic */ SharedFlowImpl RemoteActionCompatParcelizer(int i, int i2, IInAppMessageViewWrapper iInAppMessageViewWrapper, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            iInAppMessageViewWrapper = IInAppMessageViewWrapper.SUSPEND;
        }
        return RemoteActionCompatParcelizer(i, i2, iInAppMessageViewWrapper);
    }
}
