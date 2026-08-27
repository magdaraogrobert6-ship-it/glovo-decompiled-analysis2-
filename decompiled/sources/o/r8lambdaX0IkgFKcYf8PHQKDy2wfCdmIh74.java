package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.huawei.hmf.tasks.a.d$a;
import io.socket.client.Manager$7;
import io.socket.engineio.client.Socket$2;
import io.socket.engineio.client.Socket$7$1;
import io.socket.engineio.client.transports.WebSocket$1;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        int i2 = 0;
        switch (i) {
            case 0:
                r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) ((Manager$7) obj).IconCompatParcelizer;
                if (r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompat) {
                    return;
                }
                r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("attempting reconnect");
                r8lambdach50szxgsvgzrle_f5bmf0a81gm.write("reconnect_attempt", Integer.valueOf(r8lambdach50szxgsvgzrle_f5bmf0a81gm.RemoteActionCompatParcelizer.serializer));
                if (r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompat) {
                    return;
                }
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(r8lambdach50szxgsvgzrle_f5bmf0a81gm, 18, new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(19, this)));
                return;
            case 1:
                getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = ((Socket$2) obj).serializer;
                if (getcustomcontentcardsviewbindinghandler.ResultReceiver == getSdkDataWipeEventSubscriber.CLOSED) {
                    return;
                }
                getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("ping timeout", (Exception) null);
                return;
            case 2:
                getDefaultContentCardsViewBindingHandler getdefaultcontentcardsviewbindinghandler = (getDefaultContentCardsViewBindingHandler) ((Socket$7$1) obj).write;
                if (getdefaultcontentcardsviewbindinghandler.serializer[0] || getSdkDataWipeEventSubscriber.CLOSED == getdefaultcontentcardsviewbindinghandler.RemoteActionCompatParcelizer.ResultReceiver) {
                    return;
                }
                getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer.fine("changing transport and sending upgrade packet");
                getdefaultcontentcardsviewbindinghandler.IconCompatParcelizer[0].run();
                getCustomContentCardsViewBindingHandler.read(getdefaultcontentcardsviewbindinghandler.RemoteActionCompatParcelizer, getdefaultcontentcardsviewbindinghandler.write[0]);
                ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 = new ContentCardsFragmentcontentCardsUpdate5("upgrade", null);
                getNetworkUnavailableJob getnetworkunavailablejob = getdefaultcontentcardsviewbindinghandler.write[0];
                getnetworkunavailablejob.getClass();
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getnetworkunavailablejob, 23, new ContentCardsFragmentcontentCardsUpdate5[]{contentCardsFragmentcontentCardsUpdate5}));
                getdefaultcontentcardsviewbindinghandler.RemoteActionCompatParcelizer.write("upgrade", getdefaultcontentcardsviewbindinghandler.write[0]);
                getdefaultcontentcardsviewbindinghandler.write[0] = null;
                getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler2 = getdefaultcontentcardsviewbindinghandler.RemoteActionCompatParcelizer;
                getcustomcontentcardsviewbindinghandler2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
                getcustomcontentcardsviewbindinghandler2.write();
                return;
            case 3:
                networkUnavailable networkunavailable = (networkUnavailable) obj;
                networkunavailable.MediaSessionCompatToken = true;
                networkunavailable.write("drain", new Object[0]);
                return;
            case 4:
                ((r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74) ((Socket$7$1) obj).write).run();
                return;
            case 5:
                setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber = ((WebSocket$1) obj).read;
                java.util.logging.Logger logger = setContentCardsUpdatedSubscriber.ParcelableVolumeInfo;
                setcontentcardsupdatedsubscriber.RatingCompat = onRefresh.CLOSED;
                setcontentcardsupdatedsubscriber.write("close", new Object[0]);
                return;
            case 6:
                setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber2 = (setContentCardsUpdatedSubscriber) ((r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74) obj).IconCompatParcelizer;
                setcontentcardsupdatedsubscriber2.MediaSessionCompatToken = true;
                setcontentcardsupdatedsubscriber2.write("drain", new Object[0]);
                return;
            case 7:
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.write(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(6, this));
                return;
            case 8:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                setImage.Companion.getClass();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getClass();
                ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
                if (threadGroup == null) {
                    removeNodeAtDepth.read();
                    throw null;
                }
                while (threadGroup.getParent() != null) {
                    threadGroup = threadGroup.getParent();
                    threadGroup.getClass();
                }
                Thread[] threadArr = new Thread[threadGroup.activeCount()];
                while (threadGroup.enumerate(threadArr, true) == threadArr.length) {
                    threadArr = new Thread[threadArr.length * 2];
                }
                ArrayList<HandlerThread> arrayList = new ArrayList();
                for (Thread thread : threadArr) {
                    HandlerThread handlerThread = thread instanceof HandlerThread ? (HandlerThread) thread : null;
                    if (handlerThread != null) {
                        arrayList.add(handlerThread);
                    }
                }
                ArrayList<onViewAttachedToWindowlambda0> arrayList2 = new ArrayList();
                for (HandlerThread handlerThread2 : arrayList) {
                    int threadId = handlerThread2.getThreadId();
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (threadId == -1 || linkedHashSet.contains(Integer.valueOf(threadId))) ? null : new onViewAttachedToWindowlambda0(Integer.valueOf(threadId), handlerThread2);
                    if (onviewattachedtowindowlambda0 != null) {
                        arrayList2.add(onviewattachedtowindowlambda0);
                    }
                }
                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 : arrayList2) {
                    int iIntValue = ((Number) onviewattachedtowindowlambda1.serializer).intValue();
                    HandlerThread handlerThread3 = (HandlerThread) onviewattachedtowindowlambda1.write;
                    Looper looper = handlerThread3.getLooper();
                    if (looper != null) {
                        linkedHashSet.add(Integer.valueOf(iIntValue));
                        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                        cancelpendingwebviewpause.IconCompatParcelizer = true;
                        Handler handler = new Handler(looper);
                        setTextViewColor settextviewcolor = setImage.Companion;
                        ConstraintSetForInlineDsl$applyTo$1 constraintSetForInlineDsl$applyTo$1 = new ConstraintSetForInlineDsl$applyTo$1(handlerThread3, cancelpendingwebviewpause, handler, 9);
                        settextviewcolor.getClass();
                        try {
                            handler.post(new setViewBackgroundColorFilter(constraintSetForInlineDsl$applyTo$1, i2));
                        } catch (RuntimeException unused) {
                        }
                    }
                }
                setImage.Companion.getClass();
                ((Handler) setImage.backgroundHandler$delegate.MediaSessionCompatResultReceiverWrapper()).postDelayed(this, ConstantsKt.DEFAULT_REQUEST_TIMEOUT);
                return;
            default:
                setToHalfParentHeight.RemoteActionCompatParcelizer(((IInAppMessageImmersiveView) obj).IconCompatParcelizer);
                return;
        }
    }
}
