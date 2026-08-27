package androidx.compose.runtime;

import androidx.room.Room;
import coil3.ComponentRegistry$Builder;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ContentTypeCompanion;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.accessgetInAppMessageViewp;
import o.notifyViewEntered;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.sendContentCaptureTextUpdateEvent;

/* JADX INFO: loaded from: classes.dex */
public final class BroadcastFrameClock implements notifyViewEntered {
    public final sendContentCaptureTextUpdateEvent serializer;
    public final ComponentRegistry$Builder write = new ComponentRegistry$Builder();

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, this);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return Room.write(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return Room.read(this, textAnnouncementContentCardView);
    }

    @Override // o.notifyViewEntered
    public final Object withFrameNanos(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        ContentTypeCompanion contentTypeCompanion = new ContentTypeCompanion();
        contentTypeCompanion.IconCompatParcelizer = cancellableContinuationImpl;
        contentTypeCompanion.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetInAppMessageViewp(1, this.write.serializer(contentTypeCompanion, this.serializer)));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public BroadcastFrameClock(sendContentCaptureTextUpdateEvent sendcontentcapturetextupdateevent) {
        this.serializer = sendcontentcapturetextupdateevent;
    }
}
