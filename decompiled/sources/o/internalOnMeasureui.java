package o;

import com.huawei.location.ut;

/* JADX INFO: loaded from: classes2.dex */
public abstract class internalOnMeasureui {
    public final com.google.firebase.inappmessaging.model.MessageType MediaBrowserCompatMediaItem;
    public final ut MediaDescriptionCompat;

    public final com.google.firebase.inappmessaging.model.MessageType IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final ut serializer() {
        return this.MediaDescriptionCompat;
    }

    public onAttachedToWindow write() {
        return null;
    }

    public internalOnMeasureui(ut utVar, com.google.firebase.inappmessaging.model.MessageType messageType) {
        this.MediaDescriptionCompat = utVar;
        this.MediaBrowserCompatMediaItem = messageType;
    }
}
