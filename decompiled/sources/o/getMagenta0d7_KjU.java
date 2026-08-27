package o;

import androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$Companion;
import bo.app.b$$ExternalSyntheticLambda3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getInAppMessageManager;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class getMagenta0d7_KjU<T> {
    public static final onCloseActionlambda1 $cachedDescriptor;
    public final List keys;
    public final List values;
    public static final SparseArraySerializer$SparseArraySurrogate$Companion Companion = new Object() { // from class: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$Companion
        public final <T> setGraphicModalMaxWidthDp serializer(final setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
            setgraphicmodalmaxwidthdp.getClass();
            return new getInAppMessageManager() { // from class: o.getNativeColorFilterui_graphics
                private final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;

                @Override // o.setGraphicModalMaxWidthDp
                public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
                    return this.descriptor;
                }

                @Override // o.setGraphicModalMaxWidthDp
                public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
                    r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.descriptor;
                    createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getMagenta0d7_KjU.$childSerializers;
                    createinappmessageviewlambda1Serializer.getClass();
                    boolean z = true;
                    int i = 0;
                    List list = null;
                    List list2 = null;
                    while (z) {
                        int i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                        if (i2 == -1) {
                            z = false;
                        } else if (i2 == 0) {
                            list = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), list);
                            i |= 1;
                        } else {
                            if (i2 != 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                                return null;
                            }
                            list2 = (List) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0), list2);
                            i |= 2;
                        }
                    }
                    createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    return new getMagenta0d7_KjU(list, list2, i);
                }

                @Override // o.setGraphicModalMaxWidthDp
                public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
                    getMagenta0d7_KjU getmagenta0d7_kju = (getMagenta0d7_KjU) obj;
                    getmagenta0d7_kju.getClass();
                    r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.descriptor;
                    DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) getMagenta0d7_KjU.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), getmagenta0d7_kju.keys);
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0), getmagenta0d7_kju.values);
                    defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // o.getInAppMessageManager
                public final setGraphicModalMaxWidthDp[] childSerializers() {
                    return new setGraphicModalMaxWidthDp[]{getMagenta0d7_KjU.$childSerializers[0].MediaSessionCompatResultReceiverWrapper(), new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0)};
                }

                @Override // o.getInAppMessageManager
                public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
                    return new setGraphicModalMaxWidthDp[]{setgraphicmodalmaxwidthdp};
                }

                {
                    onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                    oncloseactionlambda1.read("keys", false);
                    oncloseactionlambda1.read("values", false);
                    this.descriptor = oncloseactionlambda1;
                }
            };
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new b$$ExternalSyntheticLambda3(1)), null};

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$Companion] */
    static {
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        oncloseactionlambda1.read("keys", false);
        oncloseactionlambda1.read("values", false);
        $cachedDescriptor = oncloseactionlambda1;
    }

    public /* synthetic */ getMagenta0d7_KjU(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.keys = list;
            this.values = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, $cachedDescriptor);
            throw null;
        }
    }
}
