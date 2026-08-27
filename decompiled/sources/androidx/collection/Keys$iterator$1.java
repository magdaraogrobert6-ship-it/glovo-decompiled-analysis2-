package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.ContextMenuItem;
import o.ShortNewsContentCardView;
import o.accessprocessDragCancel;
import o.awaitHorizontalPointerSlopOrCancellationgDDlDlE;
import o.createFromParcel;
import o.onVirtualViewTranslationResponses;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class Keys$iterator$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public long[] MediaSessionCompatQueueItem;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public long RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Keys$iterator$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.ParcelableVolumeInfo = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = this.ParcelableVolumeInfo;
        if (i == 0) {
            Keys$iterator$1 keys$iterator$1 = new Keys$iterator$1((ContextMenuItem) obj2, shortNewsContentCardView, 0);
            keys$iterator$1.MediaBrowserCompatMediaItem = obj;
            return keys$iterator$1;
        }
        int i2 = 1;
        if (i == 1) {
            Keys$iterator$1 keys$iterator$2 = new Keys$iterator$1((ContextMenuItem) obj2, shortNewsContentCardView, i2);
            keys$iterator$2.MediaBrowserCompatMediaItem = obj;
            return keys$iterator$2;
        }
        int i3 = 2;
        if (i == 2) {
            Keys$iterator$1 keys$iterator$3 = new Keys$iterator$1((awaitHorizontalPointerSlopOrCancellationgDDlDlE) obj2, shortNewsContentCardView, i3);
            keys$iterator$3.MediaBrowserCompatMediaItem = obj;
            return keys$iterator$3;
        }
        int i4 = 3;
        if (i != 3) {
            Keys$iterator$1 keys$iterator$4 = new Keys$iterator$1((onVirtualViewTranslationResponses) obj2, shortNewsContentCardView, 4);
            keys$iterator$4.MediaBrowserCompatMediaItem = obj;
            return keys$iterator$4;
        }
        Keys$iterator$1 keys$iterator$5 = new Keys$iterator$1((accessprocessDragCancel) obj2, shortNewsContentCardView, i4);
        keys$iterator$5.MediaBrowserCompatMediaItem = obj;
        return keys$iterator$5;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SequenceBuilderIterator sequenceBuilderIterator = (SequenceBuilderIterator) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i == 0) {
            return ((Keys$iterator$1) create(sequenceBuilderIterator, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i == 1) {
            return ((Keys$iterator$1) create(sequenceBuilderIterator, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 2) {
            return i != 3 ? ((Keys$iterator$1) create(sequenceBuilderIterator, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((Keys$iterator$1) create(sequenceBuilderIterator, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((Keys$iterator$1) create(sequenceBuilderIterator, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8 A[DONT_INVERT, PHI: r3 r4 r5 r6 r7
  0x00a8: PHI (r3v51 long[]) = (r3v49 long[]), (r3v53 long[]) binds: [B:18:0x0063, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r4v47 kotlin.sequences.SequenceBuilderIterator) = (r4v45 kotlin.sequences.SequenceBuilderIterator), (r4v49 kotlin.sequences.SequenceBuilderIterator) binds: [B:18:0x0063, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r5v47 java.lang.Object[]) = (r5v45 java.lang.Object[]), (r5v49 java.lang.Object[]) binds: [B:18:0x0063, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r6v24 int) = (r6v22 int), (r6v26 int) binds: [B:18:0x0063, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a8: PHI (r7v34 int) = (r7v32 int), (r7v37 int) binds: [B:18:0x0063, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0287 -> B:106:0x0288). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x02ea -> B:121:0x02fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0325 -> B:128:0x032a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0329 -> B:128:0x032a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x033d -> B:133:0x0344). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:29:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:20:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:12:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:26:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f9 -> B:54:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00fb -> B:45:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0116 -> B:37:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0134 -> B:51:0x0138). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0192 -> B:79:0x01da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0194 -> B:70:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01af -> B:62:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01cd -> B:76:0x01d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x022c -> B:95:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0247 -> B:87:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0273 -> B:101:0x0277). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Keys$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
