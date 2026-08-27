package kotlinx.coroutines.internal;

import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ConcurrentLinkedListKt {
    public static final Symbol IconCompatParcelizer = new Symbol("CLOSED");

    public static final Object RemoteActionCompatParcelizer(Segment segment, long j, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        while (true) {
            if (segment.RatingCompat >= j && !segment.MediaDescriptionCompat()) {
                return segment;
            }
            Object objIconCompatParcelizer = segment.IconCompatParcelizer();
            Symbol symbol = IconCompatParcelizer;
            if (objIconCompatParcelizer == symbol) {
                return symbol;
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) objIconCompatParcelizer);
            if (segment2 == null) {
                segment2 = (Segment) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Long.valueOf(segment.RatingCompat + 1), segment);
                if (segment.read(segment2)) {
                    if (segment.MediaDescriptionCompat()) {
                        segment.MediaBrowserCompatMediaItem();
                    }
                }
            }
            segment = segment2;
        }
    }
}
