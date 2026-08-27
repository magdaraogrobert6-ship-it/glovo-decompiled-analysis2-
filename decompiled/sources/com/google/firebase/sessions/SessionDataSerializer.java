package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import io.sentry.SentryUUID;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import o.AndroidComposeViewlocaleList2;
import o.AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1;
import o.Focusability;
import o.RegistryNoModelLoaderAvailableException;
import o.createFromParcel;
import o.isVerticalSwipeInAllowedDirection;
import o.performRequestFocus;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionDataSerializer implements performRequestFocus {
    public final AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1 read;

    @Override // o.performRequestFocus
    public final Object RemoteActionCompatParcelizer(FileInputStream fileInputStream) throws CorruptionException {
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(SentryUUID.write(fileInputStream));
            isverticalswipeinalloweddirection.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = AndroidComposeViewlocaleList2.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            return (AndroidComposeViewlocaleList2) isverticalswipeinalloweddirection.serializer(strRemoteActionCompatParcelizer, setgraphicmodalmaxwidthdpSerializer);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    @Override // o.performRequestFocus
    public final Object write() {
        return new AndroidComposeViewlocaleList2(this.read.RemoteActionCompatParcelizer(null), null, null);
    }

    @Override // o.performRequestFocus
    public final Object writeTo(Object obj, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, Focusability focusability) throws IOException {
        ((FileOutputStream) registryNoModelLoaderAvailableException.read).write(setCarryoverInAppMessage.RatingCompat(resetTransientState.read.RemoteActionCompatParcelizer(AndroidComposeViewlocaleList2.Companion.serializer(), (AndroidComposeViewlocaleList2) obj)));
        return createFromParcel.INSTANCE;
    }

    public SessionDataSerializer(AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1 androidComposeViewrequestFocusViewFocusFixfocusSearchResult1) {
        androidComposeViewrequestFocusViewFocusFixfocusSearchResult1.getClass();
        this.read = androidComposeViewrequestFocusViewFocusFixfocusSearchResult1;
    }
}
