package androidx.lifecycle;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
import androidx.room.TriggerBasedInvalidationTracker;
import com.deliveryhero.perseus.logger.DatabaseInfoLogger;
import com.roadrunner.home.bottomsheet.config.GetBottomSheetConfigurationType;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import java.util.Calendar;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.MutexImpl;
import o.ClipOpCompanion;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getTextAligne0LSkKk;
import o.isStateSaved;
import o.onViewAttachedToWindowlambda0;
import o.performStart;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.requestPermissions;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public int MediaMetadataCompat;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(requestPermissions requestpermissions, isStateSaved isstatesaved, GetBottomSheetConfigurationType getBottomSheetConfigurationType, performStart performstart, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 8;
        this.write = requestpermissions;
        this.serializer = isstatesaved;
        this.RemoteActionCompatParcelizer = getBottomSheetConfigurationType;
        this.IconCompatParcelizer = performstart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(getTextAligne0LSkKk gettextaligne0lskkk, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 7;
        this.IconCompatParcelizer = gettextaligne0lskkk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(RoomDatabase roomDatabase, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.read = 5;
        this.RemoteActionCompatParcelizer = roomDatabase;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PausingDispatcherKt$whenStateAtLeast$2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(MutexImpl mutexImpl, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 1;
        this.RemoteActionCompatParcelizer = mutexImpl;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                Object objInvokeSuspend = ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = MediaBrowserCompatMediaItem + 73;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            case 1:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((ClipOpCompanion) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                Object objInvokeSuspend2 = ((PausingDispatcherKt$whenStateAtLeast$2) create((onViewAttachedToWindowlambda0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i7 = MediaBrowserCompatMediaItem + 59;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objInvokeSuspend2;
            case 8:
                Object objInvokeSuspend3 = ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i9 = MediaDescriptionCompat + 69;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return objInvokeSuspend3;
            default:
                return ((PausingDispatcherKt$whenStateAtLeast$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 105;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.read;
        Object obj3 = this.IconCompatParcelizer;
        switch (i3) {
            case 0:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2((supportsColorMatrixQuery) this.serializer, (toColorLong8_81llA) this.RemoteActionCompatParcelizer, (SimpleActor$offer$2) obj3, shortNewsContentCardView, 0);
                pausingDispatcherKt$whenStateAtLeast$2.write = obj;
                return pausingDispatcherKt$whenStateAtLeast$2;
            case 1:
                return new PausingDispatcherKt$whenStateAtLeast$2((MutexImpl) this.RemoteActionCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, shortNewsContentCardView);
            case 2:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$3 = new PausingDispatcherKt$whenStateAtLeast$2((supportsColorMatrixQuery) this.serializer, (toColorLong8_81llA) this.RemoteActionCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, shortNewsContentCardView, 2);
                pausingDispatcherKt$whenStateAtLeast$3.write = obj;
                int i4 = MediaBrowserCompatMediaItem + 113;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return pausingDispatcherKt$whenStateAtLeast$3;
                }
                throw null;
            case 3:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$4 = new PausingDispatcherKt$whenStateAtLeast$2((RoomDatabase) this.serializer, (CancellableContinuationImpl) this.RemoteActionCompatParcelizer, (RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1) obj3, shortNewsContentCardView, 3);
                pausingDispatcherKt$whenStateAtLeast$4.write = obj;
                int i5 = MediaBrowserCompatMediaItem + 43;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return pausingDispatcherKt$whenStateAtLeast$4;
                }
                obj2.hashCode();
                throw null;
            case 4:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$5 = new PausingDispatcherKt$whenStateAtLeast$2((TriggerBasedInvalidationTracker) this.serializer, (int[]) this.RemoteActionCompatParcelizer, (String[]) obj3, shortNewsContentCardView, 4);
                pausingDispatcherKt$whenStateAtLeast$5.write = obj;
                return pausingDispatcherKt$whenStateAtLeast$5;
            case 5:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$6 = new PausingDispatcherKt$whenStateAtLeast$2((RoomDatabase) this.RemoteActionCompatParcelizer, shortNewsContentCardView, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3);
                pausingDispatcherKt$whenStateAtLeast$6.write = obj;
                return pausingDispatcherKt$whenStateAtLeast$6;
            case 6:
                return new PausingDispatcherKt$whenStateAtLeast$2((DatabaseInfoLogger) this.serializer, (Calendar) this.RemoteActionCompatParcelizer, (Integer) obj3, shortNewsContentCardView, 6);
            case 7:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$7 = new PausingDispatcherKt$whenStateAtLeast$2((getTextAligne0LSkKk) obj3, shortNewsContentCardView);
                pausingDispatcherKt$whenStateAtLeast$7.write = obj;
                return pausingDispatcherKt$whenStateAtLeast$7;
            case 8:
                PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$8 = new PausingDispatcherKt$whenStateAtLeast$2((requestPermissions) this.write, (isStateSaved) this.serializer, (GetBottomSheetConfigurationType) this.RemoteActionCompatParcelizer, (performStart) obj3, shortNewsContentCardView);
                int i6 = MediaDescriptionCompat + 125;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return pausingDispatcherKt$whenStateAtLeast$8;
            default:
                return new PausingDispatcherKt$whenStateAtLeast$2((IncogniaManagerImpl) this.serializer, (Map) this.RemoteActionCompatParcelizer, (String) obj3, shortNewsContentCardView, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0287 A[Catch: all -> 0x02a3, TryCatch #1 {all -> 0x02a3, blocks: (B:97:0x0243, B:101:0x0251, B:111:0x027f, B:113:0x0287, B:114:0x028a, B:116:0x028e, B:102:0x0258, B:108:0x026c, B:105:0x0261), top: B:288:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x028e A[Catch: all -> 0x02a3, TRY_LEAVE, TryCatch #1 {all -> 0x02a3, blocks: (B:97:0x0243, B:101:0x0251, B:111:0x027f, B:113:0x0287, B:114:0x028a, B:116:0x028e, B:102:0x0258, B:108:0x026c, B:105:0x0261), top: B:288:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029e  */
    /* JADX WARN: Code duplicated, block: B:160:0x036c  */
    /* JADX WARN: Code duplicated, block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a A[LOOP:0: B:58:0x0174->B:60:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0400, code lost:
    
        if (r5.collect(r8, r29) == r6) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
