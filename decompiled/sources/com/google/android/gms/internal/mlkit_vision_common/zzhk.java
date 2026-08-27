package com.google.android.gms.internal.mlkit_vision_common;

import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlDataStoreHelperImpl;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.VectorComposeKtPath27;
import o.VectorGroupiterator1;
import o.createFromParcel;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhk {
    public static Object updateChatUrl$default(VectorGroupiterator1 vectorGroupiterator1, String str, VectorComposeKtPath27 vectorComposeKtPath27) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ChatUrlDataStoreHelperImpl chatUrlDataStoreHelperImpl = (ChatUrlDataStoreHelperImpl) vectorGroupiterator1;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathTimerManager$observeCountdown$1(chatUrlDataStoreHelperImpl, str, jCurrentTimeMillis, (ShortNewsContentCardView) null, 3), vectorComposeKtPath27);
        return objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithContext : createFromParcel.INSTANCE;
    }
}
