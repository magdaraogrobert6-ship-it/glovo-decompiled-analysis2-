package com.deliveryhero.contract.model;

import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultInAppMessageSlideupViewFactory;
import o.RenderNodeVerificationHelper23;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public abstract class PhoneCallType {
    public static final Companion Companion = new Companion();
    private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, RenderNodeVerificationHelper23.RemoteActionCompatParcelizer);

    @Serializable
    public final class Masked extends PhoneCallType {
        public static final Masked INSTANCE = new Masked();
        private static final /* synthetic */ onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, RenderNodeVerificationHelper23.write);

        private Masked() {
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return get$cachedSerializer();
        }

        private final /* synthetic */ setGraphicModalMaxWidthDp get$cachedSerializer() {
            return (setGraphicModalMaxWidthDp) $cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    @Serializable
    public final class None extends PhoneCallType {
        public static final None INSTANCE = new None();
        public static final /* synthetic */ onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, RenderNodeVerificationHelper23.IconCompatParcelizer);

        public final setGraphicModalMaxWidthDp serializer() {
            return (setGraphicModalMaxWidthDp) $cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    @Serializable
    public final class Normal extends PhoneCallType {
        public static final Normal INSTANCE = new Normal();
        private static final /* synthetic */ onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, RenderNodeVerificationHelper23.serializer);

        private Normal() {
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return get$cachedSerializer();
        }

        private final /* synthetic */ setGraphicModalMaxWidthDp get$cachedSerializer() {
            return (setGraphicModalMaxWidthDp) $cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    public static final /* synthetic */ void write$Self(PhoneCallType phoneCallType, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
    }

    public final class Companion {
        public final setGraphicModalMaxWidthDp serializer() {
            return (setGraphicModalMaxWidthDp) PhoneCallType.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }
}
