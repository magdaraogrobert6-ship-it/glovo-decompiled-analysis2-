package com.deliveryhero.fwf_tracking.model;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_logger.ILogger;
import com.deliveryhero.fwf_tracking.FwFTrackingServiceKt;
import com.deliveryhero.fwf_util.FwFSerializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PerseusDataRequestApi {
    private final List<PerseusHit> hits;
    public static final Companion Companion = new Companion(null);
    private static final setGraphicModalMaxWidthDp[] $childSerializers = {new setWasCloseMessageCalled(PerseusHit$$serializer.INSTANCE, 0)};

    public final List<PerseusHit> component1() {
        return this.hits;
    }

    public final List<PerseusHit> getHits() {
        return this.hits;
    }

    public int hashCode() {
        return this.hits.hashCode();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return PerseusDataRequestApi$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerseusDataRequestApi copy$default(PerseusDataRequestApi perseusDataRequestApi, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = perseusDataRequestApi.hits;
        }
        return perseusDataRequestApi.copy(list);
    }

    public final String encode(ILogger iLogger, FwFSerializer fwFSerializer) {
        String encodingError;
        iLogger.getClass();
        fwFSerializer.getClass();
        try {
            resetTransientState resettransientstate = fwFSerializer.json;
            resettransientstate.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
            return resettransientstate.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, this);
        } catch (SerializationException e) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e));
            m1$$ExternalSyntheticOutline0.m("Encoding perseus hits failed - ", encodingError, iLogger, FwFTrackingServiceKt.MODULE_NAME);
            return null;
        } catch (IllegalArgumentException e2) {
            encodingError = fwFSerializer.getEncodingError(String.valueOf(e2));
            m1$$ExternalSyntheticOutline0.m("Encoding perseus hits failed - ", encodingError, iLogger, FwFTrackingServiceKt.MODULE_NAME);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerseusDataRequestApi)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hits, ((PerseusDataRequestApi) obj).hits}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public /* synthetic */ PerseusDataRequestApi(int i, List list, onCloseClicked oncloseclicked) {
        if (1 == (i & 1)) {
            this.hits = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, PerseusDataRequestApi$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final PerseusDataRequestApi copy(List<PerseusHit> list) {
        list.getClass();
        return new PerseusDataRequestApi(list);
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read("PerseusDataRequestApi(hits=", ")", this.hits);
    }

    public PerseusDataRequestApi(List<PerseusHit> list) {
        list.getClass();
        this.hits = list;
    }
}
