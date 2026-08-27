package o;

import bo.app.ah$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
public final class createFromListIndex implements updateBuffersOnDisappeared, CoroutineExceptionHandler {
    public final TextAnnouncementContentCardView IconCompatParcelizer;
    public final ContextScope RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU serializer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, this);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return androidx.room.Room.write(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.ShortNewsContentCardViewViewHolder
    public final ImageOnlyContentCardViewViewHolder getKey() {
        return getOnBackInvokedCallback.RemoteActionCompatParcelizer;
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return androidx.room.Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return androidx.room.Room.read(this, textAnnouncementContentCardView);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) throws Throwable {
        getRectangleGoahg getrectanglegoahg = (getRectangleGoahg) textAnnouncementContentCardView.get(getRectangleGoahg.write);
        if (getrectanglegoahg != null) {
            getLayoutDirection.read(th, new ah$$ExternalSyntheticLambda0(getrectanglegoahg, 16, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.IconCompatParcelizer.get(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(textAnnouncementContentCardView, th);
    }

    public createFromListIndex(TextAnnouncementContentCardView textAnnouncementContentCardView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.IconCompatParcelizer = textAnnouncementContentCardView;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView.plus(this));
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.RemoteActionCompatParcelizer((CancellationException) new androidx.compose.runtime.LeftCompositionCancellationException());
        }
        this.serializer = null;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.RemoteActionCompatParcelizer((CancellationException) new androidx.compose.runtime.LeftCompositionCancellationException());
        }
        this.serializer = null;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write(DefaultInAppMessageViewWrapperCompanion.RemoteActionCompatParcelizer("Old job was still running!", null));
        }
        this.serializer = BuildersKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, null, null, this.write, 3);
    }
}
