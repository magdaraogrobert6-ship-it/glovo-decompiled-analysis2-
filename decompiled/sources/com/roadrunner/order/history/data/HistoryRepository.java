package com.roadrunner.order.history.data;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.data.database.HistoryDatabase;
import com.roadrunner.order.history.data.network.HistoryApiRequest;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.y3;
import o.y6;
import o.z0;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryRepository {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final y6 RemoteActionCompatParcelizer;
    public final HistoryApiRequest read;
    public final HistoryDatabase serializer;
    public final ExecuteDatabaseRequest write;

    public HistoryRepository(HistoryApiRequest historyApiRequest, y6 y6Var, HistoryDatabase historyDatabase, ExecuteDatabaseRequest executeDatabaseRequest) {
        historyApiRequest.getClass();
        y6Var.getClass();
        historyDatabase.getClass();
        executeDatabaseRequest.getClass();
        this.read = historyApiRequest;
        this.RemoteActionCompatParcelizer = y6Var;
        this.serializer = historyDatabase;
        this.write = executeDatabaseRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: clearDatabase-IoAF18A, reason: not valid java name */
    public final Object m4996clearDatabaseIoAF18A(ContinuationImpl continuationImpl) {
        HistoryRepository$clearDatabase$1 historyRepository$clearDatabase$1;
        int i = 2 % 2;
        if (continuationImpl instanceof HistoryRepository$clearDatabase$1) {
            historyRepository$clearDatabase$1 = (HistoryRepository$clearDatabase$1) continuationImpl;
            int i2 = historyRepository$clearDatabase$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                historyRepository$clearDatabase$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i3 = IconCompatParcelizer + 107;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                historyRepository$clearDatabase$1 = new HistoryRepository$clearDatabase$1(this, continuationImpl);
            }
        } else {
            historyRepository$clearDatabase$1 = new HistoryRepository$clearDatabase$1(this, continuationImpl);
        }
        Object obj = historyRepository$clearDatabase$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = historyRepository$clearDatabase$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ClearDatabaseUseCase$invoke$2 clearDatabaseUseCase$invoke$2 = new ClearDatabaseUseCase$invoke$2(this, shortNewsContentCardView, 6);
            historyRepository$clearDatabase$1.IconCompatParcelizer = 1;
            Object objM4876invokegIAlus = this.write.m4876invokegIAlus(clearDatabaseUseCase$invoke$2, historyRepository$clearDatabase$1);
            return objM4876invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4876invokegIAlus;
        }
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i6 = MediaDescriptionCompat + 23;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX INFO: renamed from: getHistory-0E7RQCE, reason: not valid java name */
    public final Object m4997getHistory0E7RQCE(long j, LocalDate localDate, ContinuationImpl continuationImpl) {
        HistoryRepository$getHistory$1 historyRepository$getHistory$1;
        Object objM4998getHistory0E7RQCE;
        Object obj;
        z0 z0Var;
        Throwable thSerializer;
        int i;
        int i2;
        long j2 = j;
        LocalDate localDate2 = localDate;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 3;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i5 % 2 == 0) {
            boolean z = continuationImpl instanceof HistoryRepository$getHistory$1;
            throw null;
        }
        int i6 = 1;
        if (!(continuationImpl instanceof HistoryRepository$getHistory$1)) {
            historyRepository$getHistory$1 = new HistoryRepository$getHistory$1(this, continuationImpl);
        } else {
            historyRepository$getHistory$1 = (HistoryRepository$getHistory$1) continuationImpl;
            int i7 = historyRepository$getHistory$1.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                historyRepository$getHistory$1.write = i7 - Integer.MIN_VALUE;
            } else {
                historyRepository$getHistory$1 = new HistoryRepository$getHistory$1(this, continuationImpl);
            }
        }
        Object obj3 = historyRepository$getHistory$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = historyRepository$getHistory$1.write;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            historyRepository$getHistory$1.serializer = localDate2;
            historyRepository$getHistory$1.IconCompatParcelizer = j2;
            historyRepository$getHistory$1.write = 1;
            objM4998getHistory0E7RQCE = this.read.m4998getHistory0E7RQCE(j2, localDate2, historyRepository$getHistory$1);
            if (objM4998getHistory0E7RQCE != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            j2 = historyRepository$getHistory$1.IconCompatParcelizer;
            localDate2 = historyRepository$getHistory$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            objM4998getHistory0E7RQCE = ((onItemDismiss) obj3).IconCompatParcelizer;
        } else {
            if (i8 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = historyRepository$getHistory$1.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
        }
        z0Var = (z0) obj3;
        if (z0Var != null) {
            i2 = IconCompatParcelizer + 37;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return z0Var;
            }
            obj2.hashCode();
            throw null;
        }
        thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            return new isItemDismissable(thSerializer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
        i = MediaDescriptionCompat + 115;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
        boolean z2 = objM4998getHistory0E7RQCE instanceof isItemDismissable;
        y6 y6Var = this.RemoteActionCompatParcelizer;
        if (!z2) {
            int i9 = IconCompatParcelizer + 73;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objM4998getHistory0E7RQCE);
            z0 z0Var2 = (z0) objM4998getHistory0E7RQCE;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{localDate2.toString("yyyy-MM-dd"), LocalDate.now().toString("yyyy-MM-dd")}, getCieXyz.write())).booleanValue()) {
                y6Var.getClass();
                z0Var2.getClass();
                y3 y3Var = (y3) y6Var;
                RoomDatabase roomDatabase = y3Var.IconCompatParcelizer;
                TuplesKt.write(roomDatabase, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new NafathLogger$$ExternalSyntheticLambda0(13));
                TuplesKt.write(roomDatabase, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new TncContentKt$$ExternalSyntheticLambda1(y3Var, i6, z0Var2));
            }
            return z0Var2;
        }
        historyRepository$getHistory$1.serializer = null;
        historyRepository$getHistory$1.read = objM4998getHistory0E7RQCE;
        historyRepository$getHistory$1.IconCompatParcelizer = j2;
        historyRepository$getHistory$1.write = 2;
        y3 y3Var2 = (y3) y6Var;
        Object objPerformSuspending = TuplesKt.performSuspending(y3Var2.IconCompatParcelizer, true, false, new TncContentKt$$ExternalSyntheticLambda1(localDate2, i3, y3Var2), historyRepository$getHistory$1);
        if (objPerformSuspending != coroutineSingletons) {
            Object obj4 = objM4998getHistory0E7RQCE;
            obj3 = objPerformSuspending;
            obj = obj4;
            z0Var = (z0) obj3;
            if (z0Var != null) {
                i2 = IconCompatParcelizer + 37;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return z0Var;
                }
                obj2.hashCode();
                throw null;
            }
            thSerializer = onItemDismiss.serializer(obj);
            if (thSerializer != null) {
                return new isItemDismissable(thSerializer);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            i = MediaDescriptionCompat + 115;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
        return coroutineSingletons;
    }
}
