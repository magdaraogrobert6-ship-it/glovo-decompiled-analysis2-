package kotlinx.coroutines;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import com.huawei.location.logic.zp;
import com.huawei.location.ut;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.AlignmentHorizontal;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public Object IconCompatParcelizer;
    public final /* synthetic */ Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ int write = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(zp zpVar, ut utVar, AlignmentHorizontal alignmentHorizontal, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = zpVar;
        this.IconCompatParcelizer = utVar;
        this.RatingCompat = alignmentHorizontal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        Object obj2 = this.RatingCompat;
        if (i != 0) {
            JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1((zp) this.RemoteActionCompatParcelizer, (ut) this.IconCompatParcelizer, (AlignmentHorizontal) obj2, shortNewsContentCardView);
            jobSupport$children$1.read = obj;
            return jobSupport$children$1;
        }
        JobSupport$children$1 jobSupport$children$2 = new JobSupport$children$1(shortNewsContentCardView, (JobSupport) obj2);
        jobSupport$children$2.read = obj;
        return jobSupport$children$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        return i != 0 ? ((JobSupport$children$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((JobSupport$children$1) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117 A[PHI: r3 r4 r5
  0x0117: PHI (r3v12 kotlinx.coroutines.internal.LockFreeLinkedListNode) = (r3v9 kotlinx.coroutines.internal.LockFreeLinkedListNode), (r3v15 kotlinx.coroutines.internal.LockFreeLinkedListNode) binds: [B:70:0x0163, B:53:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r4v6 kotlinx.coroutines.internal.LockFreeLinkedListHead) = (r4v4 kotlinx.coroutines.internal.LockFreeLinkedListHead), (r4v8 kotlinx.coroutines.internal.LockFreeLinkedListHead) binds: [B:70:0x0163, B:53:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r5v9 kotlin.sequences.SequenceBuilderIterator) = (r5v7 kotlin.sequences.SequenceBuilderIterator), (r5v11 kotlin.sequences.SequenceBuilderIterator) binds: [B:70:0x0163, B:53:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0163 -> B:54:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0177 -> B:74:0x017b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(ShortNewsContentCardView shortNewsContentCardView, JobSupport jobSupport) {
        super(2, shortNewsContentCardView);
        this.RatingCompat = jobSupport;
    }
}
