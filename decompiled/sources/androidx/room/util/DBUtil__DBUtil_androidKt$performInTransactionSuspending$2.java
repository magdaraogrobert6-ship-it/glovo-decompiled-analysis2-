package androidx.room.util;

import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.DialogFragment2;
import o.OnEventTrackingSucceededListener;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllowEnterTransitionOverlap;
import o.getAndroidLogLevel;
import o.lambdaremoveGlobalCallbackParameter25;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resolveClass;

/* JADX INFO: loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2((o.resolveClass) r6, (java.util.List) r5, r9, 4);
        r9 = androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.RatingCompat + 125;
        androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.write = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if ((r9 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r9 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        return new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2((o.getAndroidLogLevel) r6, (o.OnEventTrackingSucceededListener) r5, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1 != 3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(o.ShortNewsContentCardView r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.RatingCompat
            int r1 = r1 + 27
            int r2 = r1 % 128
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.write = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L23
            int r1 = r8.serializer
            java.lang.Object r5 = r8.read
            java.lang.Object r6 = r8.IconCompatParcelizer
            r7 = 72
            int r7 = r7 / r2
            if (r1 == 0) goto L68
            if (r1 == r4) goto L5e
            if (r1 == r0) goto L54
            if (r1 == r3) goto L4a
            goto L31
        L23:
            int r1 = r8.serializer
            java.lang.Object r5 = r8.read
            java.lang.Object r6 = r8.IconCompatParcelizer
            if (r1 == 0) goto L68
            if (r1 == r4) goto L5e
            if (r1 == r0) goto L54
            if (r1 == r3) goto L4a
        L31:
            o.resolveClass r6 = (o.resolveClass) r6
            java.util.List r5 = (java.util.List) r5
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r3 = 4
            r1.<init>(r6, r5, r9, r3)
            int r9 = androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.RatingCompat
            int r9 = r9 + 125
            int r3 = r9 % 128
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.write = r3
            int r9 = r9 % r0
            if (r9 == 0) goto L49
            r9 = 97
            int r9 = r9 / r2
        L49:
            return r1
        L4a:
            o.getAndroidLogLevel r6 = (o.getAndroidLogLevel) r6
            o.OnEventTrackingSucceededListener r5 = (o.OnEventTrackingSucceededListener) r5
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r0.<init>(r6, r5, r9, r3)
            return r0
        L54:
            com.roadrunner.login.logging.RouterLogger r6 = (com.roadrunner.login.logging.RouterLogger) r6
            o.getAllowEnterTransitionOverlap r5 = (o.getAllowEnterTransitionOverlap) r5
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r1.<init>(r6, r5, r9, r0)
            return r1
        L5e:
            androidx.cardview.widget.CardView$1 r6 = (androidx.cardview.widget.CardView$1) r6
            java.lang.String r5 = (java.lang.String) r5
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r0.<init>(r6, r5, r9, r4)
            return r0
        L68:
            androidx.room.RoomDatabase r6 = (androidx.room.RoomDatabase) r6
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r5 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r5
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r0.<init>(r6, r5, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2.create(o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 == 0) {
            return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                return i4 != 3 ? ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RatingCompat + 9;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        Object obj3 = this.read;
        Object obj4 = this.IconCompatParcelizer;
        Object obj5 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                int i4 = write + 51;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RoomDatabase roomDatabase = (RoomDatabase) obj4;
            PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(roomDatabase, (ShortNewsContentCardView) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3);
            this.RemoteActionCompatParcelizer = 1;
            Object objUseConnection = roomDatabase.useConnection(false, pausingDispatcherKt$whenStateAtLeast$2, this);
            if (objUseConnection != coroutineSingletons) {
                return objUseConnection;
            }
            int i5 = write + 101;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.RemoteActionCompatParcelizer;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                TokenRegistryApiRequest tokenRegistryApiRequest = (TokenRegistryApiRequest) ((CardView$1) obj4).RemoteActionCompatParcelizer;
                lambdaremoveGlobalCallbackParameter25 lambdaremoveglobalcallbackparameter25 = new lambdaremoveGlobalCallbackParameter25((String) obj3);
                this.RemoteActionCompatParcelizer = 1;
                Object objUpdatePushToken = tokenRegistryApiRequest.updatePushToken(lambdaremoveglobalcallbackparameter25, this);
                return objUpdatePushToken == coroutineSingletons2 ? coroutineSingletons2 : objUpdatePushToken;
            }
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = RatingCompat + 73;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            int i10 = write + 71;
            RatingCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = this.RemoteActionCompatParcelizer;
            if (i11 != 0) {
                if (i11 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DialogFragment2 dialogFragment2 = (DialogFragment2) ((RouterLogger) obj4).read;
            String str = ((getAllowEnterTransitionOverlap) obj3).read;
            this.RemoteActionCompatParcelizer = 1;
            Object objIconCompatParcelizer = dialogFragment2.IconCompatParcelizer(str, this);
            if (objIconCompatParcelizer != coroutineSingletons3) {
                return objIconCompatParcelizer;
            }
            int i12 = write + 105;
            RatingCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return coroutineSingletons3;
        }
        if (i2 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.RemoteActionCompatParcelizer;
            if (i14 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                return ShiftInfoDao.clearAndInsert$suspendImpl((getAndroidLogLevel) obj4, (OnEventTrackingSucceededListener) obj3, this) == coroutineSingletons4 ? coroutineSingletons4 : obj2;
            }
            if (i14 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = this.RemoteActionCompatParcelizer;
        if (i15 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            if (WorkOpportunityDao.clearAndInsert$suspendImpl((resolveClass) obj4, (List) obj3, this) == coroutineSingletons5) {
                obj2 = coroutineSingletons5;
            }
        } else if (i15 == 1) {
            int i16 = write + 125;
            RatingCompat = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj5.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i17 = RatingCompat + 101;
        write = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return obj2;
    }
}
