package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
@InternalComposeUiApi
public final class SessionMutex<T> {
    private final AtomicReference<Session<T>> currentSessionHolder;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static <T> AtomicReference<Session<T>> m154constructorimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m156equalsimpl0(AtomicReference<Session<Object>> atomicReference, AtomicReference<Session<Object>> atomicReference2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{atomicReference, atomicReference2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m158hashCodeimpl(AtomicReference<Session<T>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicReference m161unboximpl() {
        return this.currentSessionHolder;
    }

    public static final class Session<T> {
        private final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 job;
        private final T value;

        public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 getJob() {
            return this.job;
        }

        public final T getValue() {
            return this.value;
        }

        public Session(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, T t) {
            this.job = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
            this.value = t;
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SessionMutex m152boximpl(AtomicReference atomicReference) {
        return new SessionMutex(atomicReference);
    }

    public boolean equals(Object obj) {
        return m155equalsimpl(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return m158hashCodeimpl(this.currentSessionHolder);
    }

    public String toString() {
        return m159toStringimpl(this.currentSessionHolder);
    }

    private /* synthetic */ SessionMutex(AtomicReference atomicReference) {
        this.currentSessionHolder = atomicReference;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> AtomicReference<Session<T>> m153constructorimpl() {
        return m154constructorimpl(new AtomicReference(null));
    }

    /* JADX INFO: renamed from: withSessionCancellingPrevious-impl, reason: not valid java name */
    public static final <R> Object m160withSessionCancellingPreviousimpl(AtomicReference<Session<T>> atomicReference, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        return YieldKt.coroutineScope(new SessionMutex$withSessionCancellingPrevious$2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, atomicReference, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null), shortNewsContentCardView);
    }

    /* JADX INFO: renamed from: getCurrentSession-impl, reason: not valid java name */
    public static final T m157getCurrentSessionimpl(AtomicReference<Session<T>> atomicReference) {
        Session<T> session = atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m159toStringimpl(AtomicReference<Session<T>> atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m155equalsimpl(AtomicReference<Session<T>> atomicReference, Object obj) {
        if (!(obj instanceof SessionMutex)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{atomicReference, ((SessionMutex) obj).m161unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
