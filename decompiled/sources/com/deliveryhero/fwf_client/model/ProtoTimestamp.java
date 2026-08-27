package com.deliveryhero.fwf_client.model;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ProtoTimestamp {
    public static final Companion Companion = new Companion(null);
    private final long seconds;

    public final long component1() {
        return this.seconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final ProtoTimestamp copy(long j) {
        return new ProtoTimestamp(j);
    }

    public int hashCode() {
        return Long.hashCode(this.seconds);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return ProtoTimestamp$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ ProtoTimestamp copy$default(ProtoTimestamp protoTimestamp, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = protoTimestamp.seconds;
        }
        return protoTimestamp.copy(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProtoTimestamp) && this.seconds == ((ProtoTimestamp) obj).seconds;
    }

    @onItemDismisslambda0
    public /* synthetic */ ProtoTimestamp(int i, long j, onCloseClicked oncloseclicked) {
        if (1 == (i & 1)) {
            this.seconds = j;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ProtoTimestamp$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public String toString() {
        return m1$$ExternalSyntheticOutline0.m(this.seconds, "ProtoTimestamp(seconds=", ")");
    }

    public ProtoTimestamp(long j) {
        this.seconds = j;
    }
}
