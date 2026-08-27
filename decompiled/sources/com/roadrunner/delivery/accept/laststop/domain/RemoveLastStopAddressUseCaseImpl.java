package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ProcessLifecycleOwner;
import o.isItemDismissable;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoveLastStopAddressUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final LastStopRepositoryImpl write;

    public RemoveLastStopAddressUseCaseImpl(LastStopRepositoryImpl lastStopRepositoryImpl, IsFixableByRetry isFixableByRetry) {
        this.write = lastStopRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4906invokegIAlus(ProcessLifecycleOwner processLifecycleOwner, ContinuationImpl continuationImpl) {
        RemoveLastStopAddressUseCaseImpl$invoke$1 removeLastStopAddressUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof RemoveLastStopAddressUseCaseImpl$invoke$1) {
            removeLastStopAddressUseCaseImpl$invoke$1 = (RemoveLastStopAddressUseCaseImpl$invoke$1) continuationImpl;
            int i2 = removeLastStopAddressUseCaseImpl$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                removeLastStopAddressUseCaseImpl$invoke$1.write = i2 - Integer.MIN_VALUE;
            } else {
                removeLastStopAddressUseCaseImpl$invoke$1 = new RemoveLastStopAddressUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            removeLastStopAddressUseCaseImpl$invoke$1 = new RemoveLastStopAddressUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = removeLastStopAddressUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = removeLastStopAddressUseCaseImpl$invoke$1.write;
        Object obj2 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = read + 27;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
            obj2.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (processLifecycleOwner.url.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Remove last stop address endpoint url can't be empty");
            Timber.RemoteActionCompatParcelizer.write(illegalArgumentException);
            return new isItemDismissable(illegalArgumentException);
        }
        String str = processLifecycleOwner.url;
        String str2 = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        str2.getClass();
        removeLastStopAddressUseCaseImpl$invoke$1.write = 1;
        Object objM4903removeLastStopAddress0E7RQCE = this.write.m4903removeLastStopAddress0E7RQCE(str, str2, removeLastStopAddressUseCaseImpl$invoke$1);
        if (objM4903removeLastStopAddress0E7RQCE != coroutineSingletons) {
            return objM4903removeLastStopAddress0E7RQCE;
        }
        int i5 = IconCompatParcelizer + 15;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return coroutineSingletons;
        }
        obj2.hashCode();
        throw null;
    }
}
