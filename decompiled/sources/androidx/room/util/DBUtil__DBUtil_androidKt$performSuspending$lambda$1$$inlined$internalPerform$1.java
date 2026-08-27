package androidx.room.util;

import androidx.room.RoomDatabase;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ClipOp;
import o.ClipOpCompanion;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ RoomDatabase IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaMetadataCompat;
    public ClipOp RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(boolean z, boolean z2, RoomDatabase roomDatabase, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
        this.IconCompatParcelizer = roomDatabase;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ClipOpCompanion clipOpCompanion = (ClipOpCompanion) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1) create(clipOpCompanion, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1) create(clipOpCompanion, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e A[DONT_INVERT, PHI: r1 r14
  0x009e: PHI (r1v24 o.ClipOpCompanion) = (r1v21 o.ClipOpCompanion), (r1v30 o.ClipOpCompanion) binds: [B:33:0x009b, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r14v36 java.lang.Object) = (r14v34 java.lang.Object), (r14v0 java.lang.Object) binds: [B:33:0x009b, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f A[DONT_INVERT, PHI: r1 r14
  0x015f: PHI (r1v9 o.ClipOpCompanion) = (r1v6 o.ClipOpCompanion), (r1v15 o.ClipOpCompanion) binds: [B:75:0x015c, B:54:0x00ef] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r14v15 java.lang.Object) = (r14v13 java.lang.Object), (r14v0 java.lang.Object) binds: [B:75:0x015c, B:54:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r14.sync$room_runtime(r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        if (r14.sync$room_runtime(r13) == r0) goto L80;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.write != 0) {
            DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, this.read, 1);
            dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.MediaMetadataCompat = obj;
            return dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
        }
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$2 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, this.read, 0);
        dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$2.MediaMetadataCompat = obj;
        return dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$2;
    }
}
