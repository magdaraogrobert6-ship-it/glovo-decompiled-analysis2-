package com.deliveryhero.customerchat.datastore;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import io.sentry.SentryUUID;
import java.io.FileInputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import o.Focusability;
import o.RegistryNoModelLoaderAvailableException;
import o.ShortNewsContentCardView;
import o.applyAlpha;
import o.createFromParcel;
import o.isVerticalSwipeInAllowedDirection;
import o.performRequestFocus;
import o.prepareForActivityTransitionCarryover;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
public final class UserPropertiesSerializer implements performRequestFocus {
    public final applyAlpha serializer;

    @Override // o.performRequestFocus
    public final Object write() {
        return this.serializer;
    }

    @Override // o.performRequestFocus
    public final Object RemoteActionCompatParcelizer(FileInputStream fileInputStream) {
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = applyAlpha.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            return isverticalswipeinalloweddirection.serializer(setCarryoverInAppMessage.RemoteActionCompatParcelizer(SentryUUID.write(fileInputStream)), setgraphicmodalmaxwidthdpSerializer);
        } catch (SerializationException unused) {
            return this.serializer;
        }
    }

    @Override // o.performRequestFocus
    public final Object writeTo(Object obj, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, Focusability focusability) throws Throwable {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new FlowLiveDataConversions$asFlow$1$1(registryNoModelLoaderAvailableException, (applyAlpha) obj, (ShortNewsContentCardView) null, 6), focusability);
        return objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithContext : createFromParcel.INSTANCE;
    }

    public UserPropertiesSerializer(applyAlpha applyalpha) {
        this.serializer = applyalpha;
    }
}
