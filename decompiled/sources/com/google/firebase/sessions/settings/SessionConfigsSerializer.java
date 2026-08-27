package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import io.sentry.SentryUUID;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import o.Focusability;
import o.RegistryNoModelLoaderAvailableException;
import o.accessscheduleScrollEventIfNeeded;
import o.createFromParcel;
import o.isVerticalSwipeInAllowedDirection;
import o.performRequestFocus;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionConfigsSerializer implements performRequestFocus {
    public static final SessionConfigsSerializer RemoteActionCompatParcelizer = new SessionConfigsSerializer();
    public static final accessscheduleScrollEventIfNeeded IconCompatParcelizer = new accessscheduleScrollEventIfNeeded(null, null, null, null, null);

    @Override // o.performRequestFocus
    public final /* bridge */ /* synthetic */ Object write() {
        return IconCompatParcelizer;
    }

    @Override // o.performRequestFocus
    public final Object RemoteActionCompatParcelizer(FileInputStream fileInputStream) throws CorruptionException {
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(SentryUUID.write(fileInputStream));
            isverticalswipeinalloweddirection.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = accessscheduleScrollEventIfNeeded.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            return (accessscheduleScrollEventIfNeeded) isverticalswipeinalloweddirection.serializer(strRemoteActionCompatParcelizer, setgraphicmodalmaxwidthdpSerializer);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session configs", e);
        }
    }

    @Override // o.performRequestFocus
    public final Object writeTo(Object obj, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, Focusability focusability) throws IOException {
        ((FileOutputStream) registryNoModelLoaderAvailableException.read).write(setCarryoverInAppMessage.RatingCompat(resetTransientState.read.RemoteActionCompatParcelizer(accessscheduleScrollEventIfNeeded.Companion.serializer(), (accessscheduleScrollEventIfNeeded) obj)));
        return createFromParcel.INSTANCE;
    }
}
