package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.IconCompatParcelizer;
import io.sentry.protocol.RemoteActionCompatParcelizer;
import io.sentry.protocol.addObserverForBackInvoker;
import io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryBaseEvent {
    public List IconCompatParcelizer;
    public r8lambda7IJBVrN0sHyidCAZufWEJFc7yY MediaBrowserCompatMediaItem;
    public AbstractMap MediaDescriptionCompat;
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public transient Throwable MediaSessionCompatToken;
    public addObserverForBackInvoker ParcelableVolumeInfo;
    public r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 PlaybackStateCompat;
    public AbstractMap PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public final IconCompatParcelizer read;
    public String serializer;
    public RemoteActionCompatParcelizer write;

    public final Throwable IconCompatParcelizer() {
        Throwable th = this.MediaSessionCompatToken;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).RemoteActionCompatParcelizer : th;
    }

    public SentryBaseEvent(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.read = new IconCompatParcelizer();
        this.MediaMetadataCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
    }

    public final void IconCompatParcelizer(String str, String str2) {
        if (this.PlaybackStateCompatCustomAction == null) {
            this.PlaybackStateCompatCustomAction = new HashMap();
        }
        if (str == null) {
            return;
        }
        AbstractMap abstractMap = this.PlaybackStateCompatCustomAction;
        if (str2 != null) {
            abstractMap.put(str, str2);
        } else if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public SentryBaseEvent() {
        this(new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg());
    }
}
