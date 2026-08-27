package io.sentry.featureflags;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.protocol.MediaBrowserCompatMediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements write {
    public volatile CopyOnWriteArrayList serializer;

    @Override // io.sentry.featureflags.write
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final write clone() {
        serializer serializerVar = new serializer();
        new io.sentry.util.RemoteActionCompatParcelizer();
        serializerVar.serializer = new CopyOnWriteArrayList(this.serializer);
        return serializerVar;
    }

    @Override // io.sentry.featureflags.write
    public final MediaBrowserCompatMediaItem write() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.serializer.iterator();
        if (!it.hasNext()) {
            return new MediaBrowserCompatMediaItem(arrayList);
        }
        m1$$ExternalSyntheticOutline0.m(it.next());
        throw null;
    }
}
