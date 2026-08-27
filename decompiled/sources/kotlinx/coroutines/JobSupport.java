package kotlinx.coroutines;

import androidx.room.Room;
import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.RegexKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import o.DefaultInAppMessageViewWrapperWhenMappings;
import o.DefaultInAppMessageViewWrappercreateAnimationListener1;
import o.DefaultInAppMessageViewWrappercreateDismissCallbacks1;
import o.DefaultInAppMessageViewWrapperopen2;
import o.DrawableTransformation;
import o.IconCompatParcelizer;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.SweepGradientShader9KIMszodefault;
import o.TextAnnouncementContentCardView;
import o.addDismissRunnable;
import o.createButtonClickListeners;
import o.createFromParcel;
import o.getClickableInAppMessageView;
import o.getClosingAnimation;
import o.markOnScreenCardsAsRead;
import o.markOnScreenCardsAsReadlambda1;
import o.onAnimationEndlambda1;
import o.onDismiss;
import o.onTouchEnded;
import o.onTouchStartedOrContinued;
import o.r8lambdaGtNxjtRprTFdEVMdYSwlcRLGos;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk;
import o.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto;
import o.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAutolambda0;
import o.resumeWebviewIfNecessarylambda0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportant;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;
import o.setCloseButton;
import o.setContentViewGroupParentLayout;
import o.setPreviouslyFocusedView;
import o.verifyOrientationStatuslambda2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public class JobSupport implements setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 {
    public static final /* synthetic */ long MediaDescriptionCompat;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaMetadataCompat = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long RatingCompat;
    public static final /* synthetic */ AtomicReferenceFieldUpdater serializer;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public void IconCompatParcelizer(Object obj) {
        RemoteActionCompatParcelizer(obj);
    }

    public void K_() {
    }

    public boolean MediaBrowserCompatMediaItem() {
        return true;
    }

    public boolean MediaMetadataCompat() {
        return this instanceof CompletableDeferredImpl;
    }

    public boolean PlaybackStateCompatCustomAction() {
        return this instanceof addDismissRunnable;
    }

    public void RemoteActionCompatParcelizer(Object obj) {
    }

    public void RemoteActionCompatParcelizer(CancellationException cancellationException) {
        MediaDescriptionCompat(cancellationException);
    }

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, this);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return Room.write(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.ShortNewsContentCardViewViewHolder
    public final ImageOnlyContentCardViewViewHolder getKey() {
        return onAnimationEndlambda1.RemoteActionCompatParcelizer;
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return Room.read(this, textAnnouncementContentCardView);
    }

    public Object read() {
        return RatingCompat();
    }

    public void read(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void read(DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1, Throwable th) {
        defaultInAppMessageViewWrappercreateDismissCallbacks1.IconCompatParcelizer(4);
        Object objRatingCompat = defaultInAppMessageViewWrappercreateDismissCallbacks1.RatingCompat();
        objRatingCompat.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeMediaBrowserCompatMediaItem = (LockFreeLinkedListNode) objRatingCompat; !lockFreeLinkedListNodeMediaBrowserCompatMediaItem.equals(defaultInAppMessageViewWrappercreateDismissCallbacks1); lockFreeLinkedListNodeMediaBrowserCompatMediaItem = lockFreeLinkedListNodeMediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem()) {
            if ((lockFreeLinkedListNodeMediaBrowserCompatMediaItem instanceof JobNode) && ((JobNode) lockFreeLinkedListNodeMediaBrowserCompatMediaItem).write()) {
                try {
                    ((JobNode) lockFreeLinkedListNodeMediaBrowserCompatMediaItem).write(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        markOnScreenCardsAsReadlambda1.read(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeMediaBrowserCompatMediaItem + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            read(completionHandlerException);
        }
        RemoteActionCompatParcelizer(th);
    }

    public boolean read(Throwable th) {
        return false;
    }

    public void serializer(Object obj) {
    }

    public String IconCompatParcelizer() {
        return "Job was cancelled";
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:29:0x005a, B:31:0x0063, B:32:0x0067), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005a A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:29:0x005a, B:31:0x0063, B:32:0x0067), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:29:0x005a, B:31:0x0063, B:32:0x0067), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean MediaDescriptionCompat(Object obj) {
        Throwable thMediaMetadataCompat;
        Object objParcelableVolumeInfo;
        Throwable thSerializer;
        Symbol symbol;
        DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings;
        Object objIconCompatParcelizer;
        Object objIconCompatParcelizer2 = JobKt.RemoteActionCompatParcelizer;
        if (MediaMetadataCompat()) {
            do {
                Object objParcelableVolumeInfo2 = ParcelableVolumeInfo();
                if (objParcelableVolumeInfo2 instanceof DefaultInAppMessageViewWrapperWhenMappings) {
                    if (objParcelableVolumeInfo2 instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) {
                        if (r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.IconCompatParcelizer.get((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo2) == 1) {
                        }
                    }
                    objIconCompatParcelizer2 = IconCompatParcelizer(objParcelableVolumeInfo2, new getClosingAnimation(MediaMetadataCompat(obj), false));
                }
                objIconCompatParcelizer2 = JobKt.RemoteActionCompatParcelizer;
                break;
            } while (objIconCompatParcelizer2 == JobKt.serializer);
            if (objIconCompatParcelizer2 != JobKt.IconCompatParcelizer) {
                if (objIconCompatParcelizer2 == JobKt.RemoteActionCompatParcelizer) {
                    thMediaMetadataCompat = null;
                    while (true) {
                        objParcelableVolumeInfo = ParcelableVolumeInfo();
                        if (objParcelableVolumeInfo instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) {
                            synchronized (objParcelableVolumeInfo) {
                                if (((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).write() == JobKt.MediaSessionCompatQueueItem) {
                                    symbol = JobKt.MediaBrowserCompatMediaItem;
                                } else {
                                    boolean zIconCompatParcelizer = ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).IconCompatParcelizer();
                                    if (thMediaMetadataCompat == null) {
                                        thMediaMetadataCompat = MediaMetadataCompat(obj);
                                    }
                                    ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).read(thMediaMetadataCompat);
                                    thSerializer = zIconCompatParcelizer ? null : ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).serializer();
                                    if (thSerializer != null) {
                                        read(((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).RatingCompat, thSerializer);
                                    }
                                    symbol = JobKt.RemoteActionCompatParcelizer;
                                }
                            }
                        } else if (objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) {
                            if (thMediaMetadataCompat == null) {
                                thMediaMetadataCompat = MediaMetadataCompat(obj);
                            }
                            defaultInAppMessageViewWrapperWhenMappings = (DefaultInAppMessageViewWrapperWhenMappings) objParcelableVolumeInfo;
                            if (defaultInAppMessageViewWrapperWhenMappings.F_()) {
                                objIconCompatParcelizer = IconCompatParcelizer(objParcelableVolumeInfo, new getClosingAnimation(thMediaMetadataCompat, false));
                                if (objIconCompatParcelizer != JobKt.RemoteActionCompatParcelizer) {
                                    DrawableTransformation.read(objParcelableVolumeInfo, "Cannot happen in ");
                                    return false;
                                }
                                if (objIconCompatParcelizer != JobKt.serializer) {
                                    objIconCompatParcelizer2 = objIconCompatParcelizer;
                                    break;
                                }
                            } else if (serializer(defaultInAppMessageViewWrapperWhenMappings, thMediaMetadataCompat)) {
                                symbol = JobKt.RemoteActionCompatParcelizer;
                            }
                        } else {
                            symbol = JobKt.MediaBrowserCompatMediaItem;
                        }
                        objIconCompatParcelizer2 = symbol;
                        break;
                    }
                }
                if (objIconCompatParcelizer2 != JobKt.RemoteActionCompatParcelizer && objIconCompatParcelizer2 != JobKt.IconCompatParcelizer) {
                    if (objIconCompatParcelizer2 == JobKt.MediaBrowserCompatMediaItem) {
                        return false;
                    }
                    RemoteActionCompatParcelizer(objIconCompatParcelizer2);
                    return true;
                }
            }
        } else {
            if (objIconCompatParcelizer2 == JobKt.RemoteActionCompatParcelizer) {
                thMediaMetadataCompat = null;
                while (true) {
                    objParcelableVolumeInfo = ParcelableVolumeInfo();
                    if (objParcelableVolumeInfo instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) {
                        synchronized (objParcelableVolumeInfo) {
                            if (((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).write() == JobKt.MediaSessionCompatQueueItem) {
                                symbol = JobKt.MediaBrowserCompatMediaItem;
                            } else {
                                boolean zIconCompatParcelizer2 = ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).IconCompatParcelizer();
                                if (thMediaMetadataCompat == null) {
                                    thMediaMetadataCompat = MediaMetadataCompat(obj);
                                }
                                ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).read(thMediaMetadataCompat);
                                if (zIconCompatParcelizer2) {
                                }
                                if (thSerializer != null) {
                                    read(((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).RatingCompat, thSerializer);
                                }
                                symbol = JobKt.RemoteActionCompatParcelizer;
                            }
                        }
                    } else if (objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) {
                        if (thMediaMetadataCompat == null) {
                            thMediaMetadataCompat = MediaMetadataCompat(obj);
                        }
                        defaultInAppMessageViewWrapperWhenMappings = (DefaultInAppMessageViewWrapperWhenMappings) objParcelableVolumeInfo;
                        if (defaultInAppMessageViewWrapperWhenMappings.F_()) {
                            objIconCompatParcelizer = IconCompatParcelizer(objParcelableVolumeInfo, new getClosingAnimation(thMediaMetadataCompat, false));
                            if (objIconCompatParcelizer != JobKt.RemoteActionCompatParcelizer) {
                                DrawableTransformation.read(objParcelableVolumeInfo, "Cannot happen in ");
                                return false;
                            }
                            if (objIconCompatParcelizer != JobKt.serializer) {
                                objIconCompatParcelizer2 = objIconCompatParcelizer;
                                break;
                            }
                        } else if (serializer(defaultInAppMessageViewWrapperWhenMappings, thMediaMetadataCompat)) {
                            symbol = JobKt.RemoteActionCompatParcelizer;
                        }
                    } else {
                        symbol = JobKt.MediaBrowserCompatMediaItem;
                    }
                    objIconCompatParcelizer2 = symbol;
                    break;
                }
            }
            if (objIconCompatParcelizer2 != JobKt.RemoteActionCompatParcelizer) {
                if (objIconCompatParcelizer2 == JobKt.MediaBrowserCompatMediaItem) {
                    return false;
                }
                RemoteActionCompatParcelizer(objIconCompatParcelizer2);
                return true;
            }
        }
        return true;
    }

    public final createButtonClickListeners MediaSessionCompatResultReceiverWrapper() {
        serializer.getClass();
        return (createButtonClickListeners) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RatingCompat);
    }

    public final Object ParcelableVolumeInfo() {
        MediaMetadataCompat.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaDescriptionCompat);
    }

    public final int RatingCompat(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof setContentViewGroupParentLayout;
        long j = MediaDescriptionCompat;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaMetadataCompat;
        if (z) {
            if (((setContentViewGroupParentLayout) obj).serializer) {
                return 0;
            }
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = markOnScreenCardsAsRead.serializer;
                if (unsafe2.compareAndSwapObject(this, MediaDescriptionCompat, obj, JobKt.write)) {
                    K_();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof setPreviouslyFocusedView)) {
            return 0;
        }
        DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1 = ((setPreviouslyFocusedView) obj).write;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            if (unsafe.compareAndSwapObject(this, MediaDescriptionCompat, obj, defaultInAppMessageViewWrappercreateDismissCallbacks1)) {
                K_();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final setAndStartAnimation RemoteActionCompatParcelizer(boolean z, JobNode jobNode) {
        boolean zIconCompatParcelizer;
        jobNode.RatingCompat = this;
        while (true) {
            Object objParcelableVolumeInfo = ParcelableVolumeInfo();
            if (!(objParcelableVolumeInfo instanceof setContentViewGroupParentLayout)) {
                boolean z2 = objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings;
                onDismiss ondismiss = onDismiss.serializer;
                if (z2) {
                    DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings = (DefaultInAppMessageViewWrapperWhenMappings) objParcelableVolumeInfo;
                    DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1 = defaultInAppMessageViewWrapperWhenMappings.read();
                    if (defaultInAppMessageViewWrappercreateDismissCallbacks1 == null) {
                        write((JobNode) objParcelableVolumeInfo);
                    } else {
                        if (jobNode.write()) {
                            r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk = defaultInAppMessageViewWrapperWhenMappings instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk ? (r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) defaultInAppMessageViewWrapperWhenMappings : null;
                            Throwable thSerializer = r8lambdazrf3eyf8xtupigvrzsqqmztlk != null ? r8lambdazrf3eyf8xtupigvrzsqqmztlk.serializer() : null;
                            if (thSerializer == null) {
                                zIconCompatParcelizer = defaultInAppMessageViewWrappercreateDismissCallbacks1.IconCompatParcelizer(jobNode, 5);
                            } else if (z) {
                                jobNode.write(thSerializer);
                                return ondismiss;
                            }
                        } else {
                            zIconCompatParcelizer = defaultInAppMessageViewWrappercreateDismissCallbacks1.IconCompatParcelizer(jobNode, 1);
                        }
                        if (zIconCompatParcelizer) {
                            break;
                        }
                    }
                } else if (z) {
                    Object objParcelableVolumeInfo2 = ParcelableVolumeInfo();
                    getClosingAnimation getclosinganimation = objParcelableVolumeInfo2 instanceof getClosingAnimation ? (getClosingAnimation) objParcelableVolumeInfo2 : null;
                    jobNode.write(getclosinganimation != null ? getclosinganimation.IconCompatParcelizer : null);
                }
                return ondismiss;
            }
            setContentViewGroupParentLayout setcontentviewgroupparentlayout = (setContentViewGroupParentLayout) objParcelableVolumeInfo;
            boolean z3 = setcontentviewgroupparentlayout.serializer;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaMetadataCompat;
            if (!z3) {
                DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks2 = new DefaultInAppMessageViewWrappercreateDismissCallbacks1();
                DefaultInAppMessageViewWrapperWhenMappings setpreviouslyfocusedview = defaultInAppMessageViewWrappercreateDismissCallbacks2;
                if (!z3) {
                    setpreviouslyfocusedview = new setPreviouslyFocusedView(defaultInAppMessageViewWrappercreateDismissCallbacks2);
                }
                IconCompatParcelizer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, setcontentviewgroupparentlayout, setpreviouslyfocusedview);
            } else if (r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(atomicReferenceFieldUpdater, this, setcontentviewgroupparentlayout, jobNode)) {
                break;
            }
        }
        return jobNode;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final createButtonClickListeners serializer(JobSupport jobSupport) {
        getClickableInAppMessageView getclickableinappmessageview = new getClickableInAppMessageView(jobSupport);
        getclickableinappmessageview.RatingCompat = this;
        while (true) {
            Object objParcelableVolumeInfo = ParcelableVolumeInfo();
            if (objParcelableVolumeInfo instanceof setContentViewGroupParentLayout) {
                setContentViewGroupParentLayout setcontentviewgroupparentlayout = (setContentViewGroupParentLayout) objParcelableVolumeInfo;
                boolean z = setcontentviewgroupparentlayout.serializer;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaMetadataCompat;
                if (!z) {
                    DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1 = new DefaultInAppMessageViewWrappercreateDismissCallbacks1();
                    DefaultInAppMessageViewWrapperWhenMappings setpreviouslyfocusedview = defaultInAppMessageViewWrappercreateDismissCallbacks1;
                    if (!z) {
                        setpreviouslyfocusedview = new setPreviouslyFocusedView(defaultInAppMessageViewWrappercreateDismissCallbacks1);
                    }
                    IconCompatParcelizer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, setcontentviewgroupparentlayout, setpreviouslyfocusedview);
                } else if (af$$ExternalSyntheticOutline1.RemoteActionCompatParcelizer(atomicReferenceFieldUpdater, this, setcontentviewgroupparentlayout, getclickableinappmessageview)) {
                    break;
                }
            } else {
                boolean z2 = objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings;
                onDismiss ondismiss = onDismiss.serializer;
                Throwable thSerializer = null;
                if (!z2) {
                    Object objParcelableVolumeInfo2 = ParcelableVolumeInfo();
                    getClosingAnimation getclosinganimation = objParcelableVolumeInfo2 instanceof getClosingAnimation ? (getClosingAnimation) objParcelableVolumeInfo2 : null;
                    getclickableinappmessageview.write(getclosinganimation != null ? getclosinganimation.IconCompatParcelizer : null);
                    return ondismiss;
                }
                DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks2 = ((DefaultInAppMessageViewWrapperWhenMappings) objParcelableVolumeInfo).read();
                if (defaultInAppMessageViewWrappercreateDismissCallbacks2 != null) {
                    if (defaultInAppMessageViewWrappercreateDismissCallbacks2.IconCompatParcelizer(getclickableinappmessageview, 7)) {
                        break;
                    }
                    boolean zIconCompatParcelizer = defaultInAppMessageViewWrappercreateDismissCallbacks2.IconCompatParcelizer(getclickableinappmessageview, 3);
                    Object objParcelableVolumeInfo3 = ParcelableVolumeInfo();
                    if (objParcelableVolumeInfo3 instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) {
                        thSerializer = ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo3).serializer();
                    } else {
                        getClosingAnimation getclosinganimation2 = objParcelableVolumeInfo3 instanceof getClosingAnimation ? (getClosingAnimation) objParcelableVolumeInfo3 : null;
                        if (getclosinganimation2 != null) {
                            thSerializer = getclosinganimation2.IconCompatParcelizer;
                        }
                    }
                    getclickableinappmessageview.write(thSerializer);
                    if (zIconCompatParcelizer) {
                        break;
                    }
                    return ondismiss;
                }
                write((JobNode) objParcelableVolumeInfo);
            }
        }
        return getclickableinappmessageview;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J_() + '{' + read(ParcelableVolumeInfo()) + '}');
        sb.append('@');
        sb.append(RegexKt.IconCompatParcelizer(this));
        return sb.toString();
    }

    public final void write(JobNode jobNode) {
        Unsafe unsafe;
        long j;
        jobNode.IconCompatParcelizer(new DefaultInAppMessageViewWrappercreateDismissCallbacks1());
        LockFreeLinkedListNode lockFreeLinkedListNodeMediaBrowserCompatMediaItem = jobNode.MediaBrowserCompatMediaItem();
        do {
            MediaMetadataCompat.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            j = MediaDescriptionCompat;
            if (unsafe.compareAndSwapObject(this, j, jobNode, lockFreeLinkedListNodeMediaBrowserCompatMediaItem)) {
                return;
            }
        } while (unsafe.getObjectVolatile(this, j) == jobNode);
    }

    public final void write(createButtonClickListeners createbuttonclicklisteners) {
        serializer.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, RatingCompat, createbuttonclicklisteners);
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final resumeWebviewIfNecessarylambda0 H_() {
        return new verifyOrientationStatuslambda2(2, new JobSupport$children$1(null, this));
    }

    public static String read(Object obj) {
        if (!(obj instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk)) {
            if (obj instanceof DefaultInAppMessageViewWrapperWhenMappings) {
                return ((DefaultInAppMessageViewWrapperWhenMappings) obj).F_() ? "Active" : "New";
            }
            return obj instanceof getClosingAnimation ? "Cancelled" : "Completed";
        }
        r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk = (r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) obj;
        if (r8lambdazrf3eyf8xtupigvrzsqqmztlk.IconCompatParcelizer()) {
            return "Cancelling";
        }
        return r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.IconCompatParcelizer.get(r8lambdazrf3eyf8xtupigvrzsqqmztlk) == 1 ? "Completing" : "Active";
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public boolean I_() {
        Object objParcelableVolumeInfo = ParcelableVolumeInfo();
        return (objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) && ((DefaultInAppMessageViewWrapperWhenMappings) objParcelableVolumeInfo).F_();
    }

    public final Object IconCompatParcelizer(Object obj, Object obj2) {
        if (!(obj instanceof DefaultInAppMessageViewWrapperWhenMappings)) {
            return JobKt.RemoteActionCompatParcelizer;
        }
        if (((obj instanceof setContentViewGroupParentLayout) || (obj instanceof JobNode)) && !(obj instanceof getClickableInAppMessageView) && !(obj2 instanceof getClosingAnimation)) {
            DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings = (DefaultInAppMessageViewWrapperWhenMappings) obj;
            if (!SweepGradientShader9KIMszodefault.IconCompatParcelizer(MediaMetadataCompat, this, defaultInAppMessageViewWrapperWhenMappings, obj2 instanceof DefaultInAppMessageViewWrapperWhenMappings ? new resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto((DefaultInAppMessageViewWrapperWhenMappings) obj2) : obj2)) {
                return JobKt.serializer;
            }
            serializer(obj2);
            serializer(defaultInAppMessageViewWrapperWhenMappings, obj2);
            return obj2;
        }
        DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings2 = (DefaultInAppMessageViewWrapperWhenMappings) obj;
        DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer = IconCompatParcelizer(defaultInAppMessageViewWrapperWhenMappings2);
        if (defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer == null) {
            return JobKt.serializer;
        }
        r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk = defaultInAppMessageViewWrapperWhenMappings2 instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk ? (r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) defaultInAppMessageViewWrapperWhenMappings2 : null;
        if (r8lambdazrf3eyf8xtupigvrzsqqmztlk == null) {
            r8lambdazrf3eyf8xtupigvrzsqqmztlk = new r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk(defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer, null);
        }
        synchronized (r8lambdazrf3eyf8xtupigvrzsqqmztlk) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk.IconCompatParcelizer;
            if (atomicIntegerFieldUpdater.get(r8lambdazrf3eyf8xtupigvrzsqqmztlk) == 1) {
                return JobKt.RemoteActionCompatParcelizer;
            }
            atomicIntegerFieldUpdater.set(r8lambdazrf3eyf8xtupigvrzsqqmztlk, 1);
            if (r8lambdazrf3eyf8xtupigvrzsqqmztlk != defaultInAppMessageViewWrapperWhenMappings2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaMetadataCompat;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, defaultInAppMessageViewWrapperWhenMappings2, r8lambdazrf3eyf8xtupigvrzsqqmztlk)) {
                    if (atomicReferenceFieldUpdater.get(this) != defaultInAppMessageViewWrapperWhenMappings2) {
                        return JobKt.serializer;
                    }
                }
            }
            boolean zIconCompatParcelizer = r8lambdazrf3eyf8xtupigvrzsqqmztlk.IconCompatParcelizer();
            getClosingAnimation getclosinganimation = obj2 instanceof getClosingAnimation ? (getClosingAnimation) obj2 : null;
            if (getclosinganimation != null) {
                r8lambdazrf3eyf8xtupigvrzsqqmztlk.read(getclosinganimation.IconCompatParcelizer);
            }
            Throwable thSerializer = zIconCompatParcelizer ? null : r8lambdazrf3eyf8xtupigvrzsqqmztlk.serializer();
            if (thSerializer != null) {
                read(defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer, thSerializer);
            }
            getClickableInAppMessageView getclickableinappmessageview = read((LockFreeLinkedListNode) defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer);
            if (getclickableinappmessageview != null && serializer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, getclickableinappmessageview, obj2)) {
                return JobKt.IconCompatParcelizer;
            }
            defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer.IconCompatParcelizer(2);
            getClickableInAppMessageView getclickableinappmessageview2 = read((LockFreeLinkedListNode) defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer);
            return (getclickableinappmessageview2 == null || !serializer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, getclickableinappmessageview2, obj2)) ? serializer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, obj2) : JobKt.IconCompatParcelizer;
        }
    }

    public String J_() {
        return getClass().getSimpleName();
    }

    public final Object MediaBrowserCompatMediaItem(Object obj) {
        Object objIconCompatParcelizer;
        do {
            objIconCompatParcelizer = IconCompatParcelizer(ParcelableVolumeInfo(), obj);
            if (objIconCompatParcelizer == JobKt.RemoteActionCompatParcelizer) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                getClosingAnimation getclosinganimation = obj instanceof getClosingAnimation ? (getClosingAnimation) obj : null;
                throw new IllegalStateException(str, getclosinganimation != null ? getclosinganimation.IconCompatParcelizer : null);
            }
        } while (objIconCompatParcelizer == JobKt.serializer);
        return objIconCompatParcelizer;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final boolean MediaDescriptionCompat() {
        Object objParcelableVolumeInfo = ParcelableVolumeInfo();
        if (objParcelableVolumeInfo instanceof getClosingAnimation) {
            return true;
        }
        return (objParcelableVolumeInfo instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) && ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).IconCompatParcelizer();
    }

    public final Throwable MediaMetadataCompat(Object obj) {
        Throwable thSerializer;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        JobSupport jobSupport = (JobSupport) obj;
        Object objParcelableVolumeInfo = jobSupport.ParcelableVolumeInfo();
        if (objParcelableVolumeInfo instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) {
            thSerializer = ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).serializer();
        } else if (objParcelableVolumeInfo instanceof getClosingAnimation) {
            thSerializer = ((getClosingAnimation) objParcelableVolumeInfo).IconCompatParcelizer;
        } else {
            if (objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) {
                DrawableTransformation.read(objParcelableVolumeInfo, "Cannot be cancelling child in this state: ");
                return null;
            }
            thSerializer = null;
        }
        CancellationException cancellationException = thSerializer instanceof CancellationException ? (CancellationException) thSerializer : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(read(objParcelableVolumeInfo)), thSerializer, jobSupport) : cancellationException;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final boolean MediaSessionCompatQueueItem() {
        int iRatingCompat;
        do {
            iRatingCompat = RatingCompat(ParcelableVolumeInfo());
            if (iRatingCompat == 0) {
                return false;
            }
        } while (iRatingCompat != 1);
        return true;
    }

    public final boolean MediaSessionCompatQueueItem(Object obj) {
        Object objIconCompatParcelizer;
        do {
            objIconCompatParcelizer = IconCompatParcelizer(ParcelableVolumeInfo(), obj);
            if (objIconCompatParcelizer == JobKt.RemoteActionCompatParcelizer) {
                return false;
            }
            if (objIconCompatParcelizer == JobKt.IconCompatParcelizer) {
                return true;
            }
        } while (objIconCompatParcelizer == JobKt.serializer);
        RemoteActionCompatParcelizer(objIconCompatParcelizer);
        return true;
    }

    public final boolean PlaybackStateCompat() {
        return !(ParcelableVolumeInfo() instanceof DefaultInAppMessageViewWrapperWhenMappings);
    }

    public final Object RatingCompat() {
        Object objParcelableVolumeInfo = ParcelableVolumeInfo();
        if (objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("This job has not completed yet");
            return null;
        }
        if (objParcelableVolumeInfo instanceof getClosingAnimation) {
            throw ((getClosingAnimation) objParcelableVolumeInfo).IconCompatParcelizer;
        }
        return JobKt.IconCompatParcelizer(objParcelableVolumeInfo);
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final setAndStartAnimation RemoteActionCompatParcelizer(boolean z, boolean z2, JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1) {
        JobNode resetallviewgroupchildrentopreviousaccessibilityflagorautolambda0;
        if (z) {
            resetallviewgroupchildrentopreviousaccessibilityflagorautolambda0 = new setAllViewGroupChildrenAsNonAccessibilityImportant(jobKt__JobKt$invokeOnCompletion$1);
        } else {
            resetallviewgroupchildrentopreviousaccessibilityflagorautolambda0 = new resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAutolambda0(jobKt__JobKt$invokeOnCompletion$1);
        }
        return RemoteActionCompatParcelizer(z2, resetallviewgroupchildrentopreviousaccessibilityflagorautolambda0);
    }

    public final void RemoteActionCompatParcelizer(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        onDismiss ondismiss = onDismiss.serializer;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 == null) {
            write(ondismiss);
            return;
        }
        setallviewgroupchildrenasnonaccessibilityimportantlambda0.MediaSessionCompatQueueItem();
        createButtonClickListeners createbuttonclicklistenersSerializer = setallviewgroupchildrenasnonaccessibilityimportantlambda0.serializer(this);
        write(createbuttonclicklistenersSerializer);
        if (PlaybackStateCompat()) {
            createbuttonclicklistenersSerializer.RemoteActionCompatParcelizer();
            write(ondismiss);
        }
    }

    public final Object awaitInternal(ShortNewsContentCardView shortNewsContentCardView) {
        Object objParcelableVolumeInfo;
        do {
            objParcelableVolumeInfo = ParcelableVolumeInfo();
            if (!(objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings)) {
                if (objParcelableVolumeInfo instanceof getClosingAnimation) {
                    throw ((getClosingAnimation) objParcelableVolumeInfo).IconCompatParcelizer;
                }
                return JobKt.IconCompatParcelizer(objParcelableVolumeInfo);
            }
        } while (RatingCompat(objParcelableVolumeInfo) < 0);
        DefaultInAppMessageViewWrappercreateAnimationListener1 defaultInAppMessageViewWrappercreateAnimationListener1 = new DefaultInAppMessageViewWrappercreateAnimationListener1(LoadBalancer$Helper.intercepted(shortNewsContentCardView), this);
        defaultInAppMessageViewWrappercreateAnimationListener1.read();
        defaultInAppMessageViewWrappercreateAnimationListener1.IconCompatParcelizer((onTouchEnded) new setCloseButton(0, JobKt.RemoteActionCompatParcelizer(this, new DefaultInAppMessageViewWrapperopen2(defaultInAppMessageViewWrappercreateAnimationListener1))));
        Object result = defaultInAppMessageViewWrappercreateAnimationListener1.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final Object join(ContinuationImpl continuationImpl) {
        Object objParcelableVolumeInfo;
        createFromParcel createfromparcel;
        do {
            objParcelableVolumeInfo = ParcelableVolumeInfo();
            boolean z = objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings;
            createfromparcel = createFromParcel.INSTANCE;
            if (!z) {
                JobKt.RemoteActionCompatParcelizer(continuationImpl.getContext());
                return createfromparcel;
            }
        } while (RatingCompat(objParcelableVolumeInfo) < 0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(continuationImpl));
        cancellableContinuationImpl.read();
        cancellableContinuationImpl.IconCompatParcelizer((onTouchEnded) new setCloseButton(0, JobKt.RemoteActionCompatParcelizer(this, new onTouchStartedOrContinued(cancellableContinuationImpl))));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (result != coroutineSingletons) {
            result = createfromparcel;
        }
        return result == coroutineSingletons ? result : createfromparcel;
    }

    public final boolean serializer(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk, getClickableInAppMessageView getclickableinappmessageview, Object obj) {
        while (getclickableinappmessageview.serializer.RemoteActionCompatParcelizer(false, new r8lambdaGtNxjtRprTFdEVMdYSwlcRLGos(this, r8lambdazrf3eyf8xtupigvrzsqqmztlk, getclickableinappmessageview, obj)) == onDismiss.serializer) {
            getclickableinappmessageview = read((LockFreeLinkedListNode) getclickableinappmessageview);
            if (getclickableinappmessageview == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final CancellationException write() {
        CancellationException cancellationException;
        Object objParcelableVolumeInfo = ParcelableVolumeInfo();
        if (objParcelableVolumeInfo instanceof r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) {
            Throwable thSerializer = ((r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk) objParcelableVolumeInfo).serializer();
            if (thSerializer == null) {
                DrawableTransformation.read(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thSerializer instanceof CancellationException ? (CancellationException) thSerializer : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thSerializer, this) : cancellationException;
        }
        if (objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) {
            DrawableTransformation.read(this, "Job is still new or active: ");
            return null;
        }
        if (!(objParcelableVolumeInfo instanceof getClosingAnimation)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((getClosingAnimation) objParcelableVolumeInfo).IconCompatParcelizer;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(IconCompatParcelizer(), th, this) : cancellationException;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public void write(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(IconCompatParcelizer(), null, this);
        }
        RemoteActionCompatParcelizer(cancellationException);
    }

    public JobSupport(boolean z) {
        this._state$volatile = z ? JobKt.write : JobKt.read;
    }

    public boolean serializer(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return MediaDescriptionCompat(th) && MediaBrowserCompatMediaItem();
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        MediaDescriptionCompat = unsafe.objectFieldOffset(JobSupport.class.getDeclaredField("_state$volatile"));
        serializer = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
        RatingCompat = unsafe.objectFieldOffset(JobSupport.class.getDeclaredField("_parentHandle$volatile"));
    }

    public static getClickableInAppMessageView read(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.G_()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.MediaSessionCompatQueueItem();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.MediaBrowserCompatMediaItem();
            if (!lockFreeLinkedListNode.G_()) {
                if (lockFreeLinkedListNode instanceof getClickableInAppMessageView) {
                    return (getClickableInAppMessageView) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof DefaultInAppMessageViewWrappercreateDismissCallbacks1) {
                    return null;
                }
            }
        }
    }

    public final DefaultInAppMessageViewWrappercreateDismissCallbacks1 IconCompatParcelizer(DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings) {
        DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1 = defaultInAppMessageViewWrapperWhenMappings.read();
        if (defaultInAppMessageViewWrappercreateDismissCallbacks1 != null) {
            return defaultInAppMessageViewWrappercreateDismissCallbacks1;
        }
        if (defaultInAppMessageViewWrapperWhenMappings instanceof setContentViewGroupParentLayout) {
            return new DefaultInAppMessageViewWrappercreateDismissCallbacks1();
        }
        if (defaultInAppMessageViewWrapperWhenMappings instanceof JobNode) {
            write((JobNode) defaultInAppMessageViewWrapperWhenMappings);
            return null;
        }
        DrawableTransformation.read(defaultInAppMessageViewWrapperWhenMappings, "State should have list: ");
        return null;
    }

    public final Object serializer(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk, Object obj) {
        Throwable thIconCompatParcelizer;
        Unsafe unsafe;
        long j;
        getClosingAnimation getclosinganimation = obj instanceof getClosingAnimation ? (getClosingAnimation) obj : null;
        Throwable th = getclosinganimation != null ? getclosinganimation.IconCompatParcelizer : null;
        synchronized (r8lambdazrf3eyf8xtupigvrzsqqmztlk) {
            r8lambdazrf3eyf8xtupigvrzsqqmztlk.IconCompatParcelizer();
            ArrayList<Throwable> arrayListWrite = r8lambdazrf3eyf8xtupigvrzsqqmztlk.write(th);
            thIconCompatParcelizer = IconCompatParcelizer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, arrayListWrite);
            if (thIconCompatParcelizer != null && arrayListWrite.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListWrite.size()));
                for (Throwable th2 : arrayListWrite) {
                    if (th2 != thIconCompatParcelizer && th2 != thIconCompatParcelizer && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        markOnScreenCardsAsReadlambda1.read(thIconCompatParcelizer, th2);
                    }
                }
            }
        }
        if (thIconCompatParcelizer != null && thIconCompatParcelizer != th) {
            obj = new getClosingAnimation(thIconCompatParcelizer, false);
        }
        if (thIconCompatParcelizer != null && (RemoteActionCompatParcelizer(thIconCompatParcelizer) || read(thIconCompatParcelizer))) {
            obj.getClass();
            getClosingAnimation.write.compareAndSet((getClosingAnimation) obj, 0, 1);
        }
        serializer(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaMetadataCompat;
        Object resetallviewgroupchildrentopreviousaccessibilityflagorauto = obj instanceof DefaultInAppMessageViewWrapperWhenMappings ? new resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto((DefaultInAppMessageViewWrapperWhenMappings) obj) : obj;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            j = MediaDescriptionCompat;
            if (unsafe.compareAndSwapObject(this, j, r8lambdazrf3eyf8xtupigvrzsqqmztlk, resetallviewgroupchildrentopreviousaccessibilityflagorauto)) {
                break;
            }
        } while (unsafe.getObjectVolatile(this, j) == r8lambdazrf3eyf8xtupigvrzsqqmztlk);
        serializer((DefaultInAppMessageViewWrapperWhenMappings) r8lambdazrf3eyf8xtupigvrzsqqmztlk, obj);
        return obj;
    }

    public final void serializer(DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings, Object obj) {
        createButtonClickListeners createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        if (createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper != null) {
            createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
            write(onDismiss.serializer);
        }
        CompletionHandlerException completionHandlerException = null;
        getClosingAnimation getclosinganimation = obj instanceof getClosingAnimation ? (getClosingAnimation) obj : null;
        Throwable th = getclosinganimation != null ? getclosinganimation.IconCompatParcelizer : null;
        if (defaultInAppMessageViewWrapperWhenMappings instanceof JobNode) {
            try {
                ((JobNode) defaultInAppMessageViewWrapperWhenMappings).write(th);
                return;
            } catch (Throwable th2) {
                read(new CompletionHandlerException("Exception in completion handler " + defaultInAppMessageViewWrapperWhenMappings + " for " + this, th2));
                return;
            }
        }
        DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1 = defaultInAppMessageViewWrapperWhenMappings.read();
        if (defaultInAppMessageViewWrappercreateDismissCallbacks1 != null) {
            defaultInAppMessageViewWrappercreateDismissCallbacks1.IconCompatParcelizer(1);
            Object objRatingCompat = defaultInAppMessageViewWrappercreateDismissCallbacks1.RatingCompat();
            objRatingCompat.getClass();
            for (LockFreeLinkedListNode lockFreeLinkedListNodeMediaBrowserCompatMediaItem = (LockFreeLinkedListNode) objRatingCompat; !lockFreeLinkedListNodeMediaBrowserCompatMediaItem.equals(defaultInAppMessageViewWrappercreateDismissCallbacks1); lockFreeLinkedListNodeMediaBrowserCompatMediaItem = lockFreeLinkedListNodeMediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem()) {
                if (lockFreeLinkedListNodeMediaBrowserCompatMediaItem instanceof JobNode) {
                    try {
                        ((JobNode) lockFreeLinkedListNodeMediaBrowserCompatMediaItem).write(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            markOnScreenCardsAsReadlambda1.read(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeMediaBrowserCompatMediaItem + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                read(completionHandlerException);
            }
        }
    }

    public final Throwable IconCompatParcelizer(r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (r8lambdazrf3eyf8xtupigvrzsqqmztlk.IconCompatParcelizer()) {
                return new JobCancellationException(IconCompatParcelizer(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final boolean RemoteActionCompatParcelizer(Throwable th) {
        if (PlaybackStateCompatCustomAction()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        createButtonClickListeners createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        if (createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper == null || createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper == onDismiss.serializer) {
            return z;
        }
        return createbuttonclicklistenersMediaSessionCompatResultReceiverWrapper.read(th) || z;
    }

    public final boolean serializer(DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings, Throwable th) {
        Unsafe unsafe;
        long j;
        DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer = IconCompatParcelizer(defaultInAppMessageViewWrapperWhenMappings);
        if (defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer == null) {
            return false;
        }
        r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk = new r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk(defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer, th);
        do {
            MediaMetadataCompat.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            j = MediaDescriptionCompat;
            if (unsafe.compareAndSwapObject(this, j, defaultInAppMessageViewWrapperWhenMappings, r8lambdazrf3eyf8xtupigvrzsqqmztlk)) {
                read(defaultInAppMessageViewWrappercreateDismissCallbacks1IconCompatParcelizer, th);
                return true;
            }
        } while (unsafe.getObjectVolatile(this, j) == defaultInAppMessageViewWrapperWhenMappings);
        return false;
    }

    @Override // o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final setAndStartAnimation IconCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return RemoteActionCompatParcelizer(true, new resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAutolambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
