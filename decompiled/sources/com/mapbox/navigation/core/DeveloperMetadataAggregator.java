package com.mapbox.navigation.core;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzmx;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DeveloperMetadataAggregator {
    public DeveloperMetadata currentMetadata;
    public final CopyOnWriteArraySet observers;

    public final void onCopilotSessionChanged(zzmx zzmxVar) {
        DeveloperMetadata developerMetadata = this.currentMetadata;
        String sessionId = zzmxVar.getSessionId();
        developerMetadata.getClass();
        sessionId.getClass();
        DeveloperMetadata developerMetadata2 = new DeveloperMetadata(sessionId);
        Object[] objArr = {this.currentMetadata, developerMetadata2};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.currentMetadata = developerMetadata2;
        Iterator it = this.observers.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    public DeveloperMetadataAggregator(String str) {
        str.getClass();
        this.observers = new CopyOnWriteArraySet();
        this.currentMetadata = new DeveloperMetadata(str);
    }
}
