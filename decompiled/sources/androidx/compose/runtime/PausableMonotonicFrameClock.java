package androidx.compose.runtime;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.checkForContentCapturePropertyChanges;
import o.createFromParcel;
import o.createFromText;
import o.notifyViewEntered;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements notifyViewEntered {
    public final notifyViewEntered RemoteActionCompatParcelizer;
    public final r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI serializer = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(1);

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

    public PausableMonotonicFrameClock(notifyViewEntered notifyviewentered) {
        this.RemoteActionCompatParcelizer = notifyviewentered;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.notifyViewEntered
    public final Object withFrameNanos(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        checkForContentCapturePropertyChanges checkforcontentcapturepropertychanges;
        boolean z;
        Object result;
        if (shortNewsContentCardView instanceof checkForContentCapturePropertyChanges) {
            checkforcontentcapturepropertychanges = (checkForContentCapturePropertyChanges) shortNewsContentCardView;
            int i = checkforcontentcapturepropertychanges.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkforcontentcapturepropertychanges.serializer = i - Integer.MIN_VALUE;
            } else {
                checkforcontentcapturepropertychanges = new checkForContentCapturePropertyChanges(this, shortNewsContentCardView);
            }
        } else {
            checkforcontentcapturepropertychanges = new checkForContentCapturePropertyChanges(this, shortNewsContentCardView);
        }
        Object obj = checkforcontentcapturepropertychanges.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkforcontentcapturepropertychanges.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = this.serializer;
            checkforcontentcapturepropertychanges.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            checkforcontentcapturepropertychanges.serializer = 1;
            synchronized (r8lambdalmkbrrgswwtv97obrsj7trj7ai.write) {
                z = r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer;
            }
            if (z) {
                result = createFromParcel.INSTANCE;
            } else {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(checkforcontentcapturepropertychanges));
                cancellableContinuationImpl.read();
                synchronized (r8lambdalmkbrrgswwtv97obrsj7trj7ai.write) {
                    ((ArrayList) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).add(cancellableContinuationImpl);
                }
                cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new createFromText(r8lambdalmkbrrgswwtv97obrsj7trj7ai, 0, cancellableContinuationImpl));
                result = cancellableContinuationImpl.getResult();
                if (result != coroutineSingletons) {
                    result = createFromParcel.INSTANCE;
                }
            }
            if (result != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm = checkforcontentcapturepropertychanges.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        notifyViewEntered notifyviewentered = this.RemoteActionCompatParcelizer;
        checkforcontentcapturepropertychanges.IconCompatParcelizer = null;
        checkforcontentcapturepropertychanges.serializer = 2;
        Object objWithFrameNanos = notifyviewentered.withFrameNanos(r8lambdaunavo3sxub_pc9xroryotnrlvsm, checkforcontentcapturepropertychanges);
        return objWithFrameNanos == coroutineSingletons ? coroutineSingletons : objWithFrameNanos;
    }
}
