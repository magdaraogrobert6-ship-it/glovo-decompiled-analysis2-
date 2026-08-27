package com.roadrunner.database.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import com.roadrunner.database.Database;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearDatabaseUseCase {
    private static int read = 1;
    private static int write;
    public final ExecuteDatabaseRequest RemoteActionCompatParcelizer;
    public final Database serializer;

    public ClearDatabaseUseCase(Database database, ExecuteDatabaseRequest executeDatabaseRequest) {
        database.getClass();
        executeDatabaseRequest.getClass();
        this.serializer = database;
        this.RemoteActionCompatParcelizer = executeDatabaseRequest;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4895invokeIoAF18A(ContinuationImpl continuationImpl) {
        ClearDatabaseUseCase$invoke$1 clearDatabaseUseCase$invoke$1;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof ClearDatabaseUseCase$invoke$1) {
            int i5 = i2 + 123;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            clearDatabaseUseCase$invoke$1 = (ClearDatabaseUseCase$invoke$1) continuationImpl;
            int i7 = clearDatabaseUseCase$invoke$1.IconCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = read + 97;
                write = i8 % Fields.SpotShadowColor;
                clearDatabaseUseCase$invoke$1.IconCompatParcelizer = i8 % 2 != 0 ? i7 % Integer.MIN_VALUE : i7 - Integer.MIN_VALUE;
            } else {
                clearDatabaseUseCase$invoke$1 = new ClearDatabaseUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            clearDatabaseUseCase$invoke$1 = new ClearDatabaseUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = clearDatabaseUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = clearDatabaseUseCase$invoke$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 != 0) {
            if (i9 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ClearDatabaseUseCase$invoke$2 clearDatabaseUseCase$invoke$2 = new ClearDatabaseUseCase$invoke$2(this, shortNewsContentCardView, 0);
        clearDatabaseUseCase$invoke$1.IconCompatParcelizer = 1;
        Object objM4876invokegIAlus = this.RemoteActionCompatParcelizer.m4876invokegIAlus(clearDatabaseUseCase$invoke$2, clearDatabaseUseCase$invoke$1);
        return objM4876invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4876invokegIAlus;
    }
}
