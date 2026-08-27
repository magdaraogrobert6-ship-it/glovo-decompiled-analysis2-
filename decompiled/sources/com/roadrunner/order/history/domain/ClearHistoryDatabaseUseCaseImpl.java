package com.roadrunner.order.history.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.data.HistoryRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearHistoryDatabaseUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final HistoryRepository serializer;

    public ClearHistoryDatabaseUseCaseImpl(HistoryRepository historyRepository) {
        historyRepository.getClass();
        this.serializer = historyRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4999invokeIoAF18A(ContinuationImpl continuationImpl) {
        ClearHistoryDatabaseUseCaseImpl$invoke$1 clearHistoryDatabaseUseCaseImpl$invoke$1;
        Object objM4996clearDatabaseIoAF18A;
        int i = 2 % 2;
        int i2 = read + 31;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof ClearHistoryDatabaseUseCaseImpl$invoke$1) {
            clearHistoryDatabaseUseCaseImpl$invoke$1 = (ClearHistoryDatabaseUseCaseImpl$invoke$1) continuationImpl;
            int i4 = clearHistoryDatabaseUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                clearHistoryDatabaseUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                clearHistoryDatabaseUseCaseImpl$invoke$1 = new ClearHistoryDatabaseUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            clearHistoryDatabaseUseCaseImpl$invoke$1 = new ClearHistoryDatabaseUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = clearHistoryDatabaseUseCaseImpl$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = clearHistoryDatabaseUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            clearHistoryDatabaseUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 1;
            objM4996clearDatabaseIoAF18A = this.serializer.m4996clearDatabaseIoAF18A(clearHistoryDatabaseUseCaseImpl$invoke$1);
            if (objM4996clearDatabaseIoAF18A == coroutineSingletons) {
                int i6 = RemoteActionCompatParcelizer + 93;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4996clearDatabaseIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
            int i7 = RemoteActionCompatParcelizer + 45;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 5 / 4;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4996clearDatabaseIoAF18A);
        if (thSerializer != null) {
            int i9 = read + 1;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to clear history database", new Object[0]);
        }
        return objM4996clearDatabaseIoAF18A;
    }
}
