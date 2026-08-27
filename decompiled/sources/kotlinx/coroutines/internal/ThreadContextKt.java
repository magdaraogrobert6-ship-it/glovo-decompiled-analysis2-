package kotlinx.coroutines.internal;

import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadContextKt {
    public static final Symbol IconCompatParcelizer = new Symbol("NO_THREAD_ELEMENTS");
    public static final ThreadContextKt$$ExternalSyntheticLambda2 RemoteActionCompatParcelizer;
    public static final ThreadContextKt$$ExternalSyntheticLambda2 read;
    public static final ThreadContextKt$$ExternalSyntheticLambda2 write;

    public static final Object serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj) {
        if (obj == null) {
            obj = read(textAnnouncementContentCardView);
        }
        if (obj == 0) {
            return IconCompatParcelizer;
        }
        return obj instanceof Integer ? textAnnouncementContentCardView.fold(new ThreadState(((Number) obj).intValue(), textAnnouncementContentCardView), write) : ((ThreadLocalElement) obj).write();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2] */
    static {
        final int i = 1;
        read = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i2 = i;
                if (i2 == 0) {
                    ThreadState threadState = (ThreadState) obj;
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = (ShortNewsContentCardViewViewHolder) obj2;
                    if (shortNewsContentCardViewViewHolder instanceof ThreadLocalElement) {
                        ThreadLocalElement threadLocalElement = (ThreadLocalElement) shortNewsContentCardViewViewHolder;
                        TextAnnouncementContentCardView textAnnouncementContentCardView = threadState.IconCompatParcelizer;
                        Object objWrite = threadLocalElement.write();
                        Object[] objArr = threadState.serializer;
                        int i3 = threadState.write;
                        objArr[i3] = objWrite;
                        ThreadLocalElement[] threadLocalElementArr = threadState.RemoteActionCompatParcelizer;
                        threadState.write = i3 + 1;
                        threadLocalElementArr[i3] = threadLocalElement;
                    }
                    return threadState;
                }
                if (i2 == 1) {
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = (ShortNewsContentCardViewViewHolder) obj2;
                    if (!(shortNewsContentCardViewViewHolder2 instanceof ThreadLocalElement)) {
                        return obj;
                    }
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int iIntValue = num != null ? num.intValue() : 1;
                    return iIntValue == 0 ? shortNewsContentCardViewViewHolder2 : Integer.valueOf(iIntValue + 1);
                }
                ThreadLocalElement threadLocalElement2 = (ThreadLocalElement) obj;
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder3 = (ShortNewsContentCardViewViewHolder) obj2;
                if (threadLocalElement2 != null) {
                    return threadLocalElement2;
                }
                if (shortNewsContentCardViewViewHolder3 instanceof ThreadLocalElement) {
                    return (ThreadLocalElement) shortNewsContentCardViewViewHolder3;
                }
                return null;
            }
        };
        final int i2 = 2;
        RemoteActionCompatParcelizer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                if (i3 == 0) {
                    ThreadState threadState = (ThreadState) obj;
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = (ShortNewsContentCardViewViewHolder) obj2;
                    if (shortNewsContentCardViewViewHolder instanceof ThreadLocalElement) {
                        ThreadLocalElement threadLocalElement = (ThreadLocalElement) shortNewsContentCardViewViewHolder;
                        TextAnnouncementContentCardView textAnnouncementContentCardView = threadState.IconCompatParcelizer;
                        Object objWrite = threadLocalElement.write();
                        Object[] objArr = threadState.serializer;
                        int i4 = threadState.write;
                        objArr[i4] = objWrite;
                        ThreadLocalElement[] threadLocalElementArr = threadState.RemoteActionCompatParcelizer;
                        threadState.write = i4 + 1;
                        threadLocalElementArr[i4] = threadLocalElement;
                    }
                    return threadState;
                }
                if (i3 == 1) {
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = (ShortNewsContentCardViewViewHolder) obj2;
                    if (!(shortNewsContentCardViewViewHolder2 instanceof ThreadLocalElement)) {
                        return obj;
                    }
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int iIntValue = num != null ? num.intValue() : 1;
                    return iIntValue == 0 ? shortNewsContentCardViewViewHolder2 : Integer.valueOf(iIntValue + 1);
                }
                ThreadLocalElement threadLocalElement2 = (ThreadLocalElement) obj;
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder3 = (ShortNewsContentCardViewViewHolder) obj2;
                if (threadLocalElement2 != null) {
                    return threadLocalElement2;
                }
                if (shortNewsContentCardViewViewHolder3 instanceof ThreadLocalElement) {
                    return (ThreadLocalElement) shortNewsContentCardViewViewHolder3;
                }
                return null;
            }
        };
        final int i3 = 0;
        write = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: kotlinx.coroutines.internal.ThreadContextKt$$ExternalSyntheticLambda2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i4 = i3;
                if (i4 == 0) {
                    ThreadState threadState = (ThreadState) obj;
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = (ShortNewsContentCardViewViewHolder) obj2;
                    if (shortNewsContentCardViewViewHolder instanceof ThreadLocalElement) {
                        ThreadLocalElement threadLocalElement = (ThreadLocalElement) shortNewsContentCardViewViewHolder;
                        TextAnnouncementContentCardView textAnnouncementContentCardView = threadState.IconCompatParcelizer;
                        Object objWrite = threadLocalElement.write();
                        Object[] objArr = threadState.serializer;
                        int i5 = threadState.write;
                        objArr[i5] = objWrite;
                        ThreadLocalElement[] threadLocalElementArr = threadState.RemoteActionCompatParcelizer;
                        threadState.write = i5 + 1;
                        threadLocalElementArr[i5] = threadLocalElement;
                    }
                    return threadState;
                }
                if (i4 == 1) {
                    ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = (ShortNewsContentCardViewViewHolder) obj2;
                    if (!(shortNewsContentCardViewViewHolder2 instanceof ThreadLocalElement)) {
                        return obj;
                    }
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    int iIntValue = num != null ? num.intValue() : 1;
                    return iIntValue == 0 ? shortNewsContentCardViewViewHolder2 : Integer.valueOf(iIntValue + 1);
                }
                ThreadLocalElement threadLocalElement2 = (ThreadLocalElement) obj;
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder3 = (ShortNewsContentCardViewViewHolder) obj2;
                if (threadLocalElement2 != null) {
                    return threadLocalElement2;
                }
                if (shortNewsContentCardViewViewHolder3 instanceof ThreadLocalElement) {
                    return (ThreadLocalElement) shortNewsContentCardViewViewHolder3;
                }
                return null;
            }
        };
    }

    public static final Object read(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        Object objFold = textAnnouncementContentCardView.fold(0, read);
        objFold.getClass();
        return objFold;
    }

    public static final void write(TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj) {
        if (obj == IconCompatParcelizer) {
            return;
        }
        if (!(obj instanceof ThreadState)) {
            Object objFold = textAnnouncementContentCardView.fold(null, RemoteActionCompatParcelizer);
            objFold.getClass();
            ((ThreadLocalElement) objFold).write(obj);
            return;
        }
        ThreadState threadState = (ThreadState) obj;
        ThreadLocalElement[] threadLocalElementArr = threadState.RemoteActionCompatParcelizer;
        int length = threadLocalElementArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadLocalElement threadLocalElement = threadLocalElementArr[length];
            threadLocalElement.getClass();
            threadLocalElement.write(threadState.serializer[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
