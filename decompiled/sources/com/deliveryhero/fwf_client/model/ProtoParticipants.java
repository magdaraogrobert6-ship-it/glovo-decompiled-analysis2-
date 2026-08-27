package com.deliveryhero.fwf_client.model;

import coil3.util.UtilsKt;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public enum ProtoParticipants {
    PARTICIPANTS_UNSPECIFIED(0),
    PARTICIPANTS_ALL(1),
    PARTICIPANTS_ONLY_PARTICIPANTS(2),
    PARTICIPANTS_ONLY_NON_PARTICIPANTS(3);

    private final int value;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_client.model.ProtoParticipants.Companion.1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final setGraphicModalMaxWidthDp invoke() {
            ProtoParticipants[] protoParticipantsArrValues = ProtoParticipants.values();
            protoParticipantsArrValues.getClass();
            return new EnumSerializer("com.deliveryhero.fwf_client.model.ProtoParticipants", (Enum[]) protoParticipantsArrValues);
        }
    });

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }

        private final /* synthetic */ setGraphicModalMaxWidthDp get$cachedSerializer() {
            return (setGraphicModalMaxWidthDp) ProtoParticipants.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    ProtoParticipants(int i) {
        this.value = i;
    }
}
