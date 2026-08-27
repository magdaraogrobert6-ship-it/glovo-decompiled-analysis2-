package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.rxjava2.RxDataStore;
import bo.app.d0$$ExternalSyntheticLambda4;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.observers.BlockingMultiObserver;
import io.reactivex.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.util.ExceptionHelper;
import kotlinx.coroutines.flow.Flow;
import o.TextAnnouncementContentCardView;
import o.isRoot;
import o.onBackStartedlambda1;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog;
import o.r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4;

/* JADX INFO: loaded from: classes3.dex */
public final class RetryCountTrackerImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final RxDataStore read;

    public RetryCountTrackerImpl(RxDataStore rxDataStore) {
        this.read = rxDataStore;
    }

    public static isRoot serializer(String str) {
        int i = 2 % 2;
        isRoot isroot = new isRoot("retry_count_".concat(str));
        int i2 = IconCompatParcelizer + 113;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return isroot;
    }

    public final int write(String str) {
        int i = 2 % 2;
        RxDataStore rxDataStore = this.read;
        Flow flowSerializer = rxDataStore.serializer.read.serializer();
        TextAnnouncementContentCardView textAnnouncementContentCardView = rxDataStore.read.serializer;
        r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[] r8lambdaxxy0icvbkqrejyjmjwchaqi7z4Arr = onBackStartedlambda1.serializer;
        r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog r8lambdaw8l8p7bwyb0wtwnko8kzqkdckog = new r8lambdaW8L8P7bwyb0wtwnkO8kZQkDCkog(flowSerializer, prepareForActivityTransitionCarryover.read.plus(textAnnouncementContentCardView));
        int i2 = Flowable.write;
        FlowableElementAtSingle flowableElementAtSingle = new FlowableElementAtSingle(new FlowableMap(new FlowableFromPublisher(r8lambdaw8l8p7bwyb0wtwnko8kzqkdckog), new RetryWithDelay$$ExternalSyntheticLambda1(11, new d0$$ExternalSyntheticLambda4(this, str))), 0);
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver(1);
        flowableElementAtSingle.subscribe(blockingMultiObserver);
        if (blockingMultiObserver.getCount() != 0) {
            int i3 = IconCompatParcelizer + 5;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            try {
                blockingMultiObserver.await();
            } catch (InterruptedException e) {
                blockingMultiObserver.read = true;
                Disposable disposable = blockingMultiObserver.IconCompatParcelizer;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw ExceptionHelper.write(e);
            }
        }
        Throwable th = blockingMultiObserver.serializer;
        if (th != null) {
            throw ExceptionHelper.write(th);
        }
        int i5 = IconCompatParcelizer + 101;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object obj = blockingMultiObserver.RemoteActionCompatParcelizer;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        int i7 = serializer + 97;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return iIntValue;
    }
}
