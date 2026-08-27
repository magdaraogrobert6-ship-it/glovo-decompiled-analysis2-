package o;

import kotlin.TuplesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getGray0d7_KjUannotations extends ContinuationImpl {
    public boolean IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public androidx.room.RoomDatabase RemoteActionCompatParcelizer;
    public boolean read;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.write |= Integer.MIN_VALUE;
        return TuplesKt.performSuspending(null, false, false, null, this);
    }

    public getGray0d7_KjUannotations(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
