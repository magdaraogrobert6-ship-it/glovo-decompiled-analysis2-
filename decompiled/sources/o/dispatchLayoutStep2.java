package o;

import coil3.network.NetworkHeaders$Builder;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class dispatchLayoutStep2 implements setGraphicModalMaxWidthDp {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final getScrollState IconCompatParcelizer;
    public final setWasCloseMessageCalled read;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA serializer;
    public final setGraphicModalMaxWidthDp write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 17;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = this.serializer;
            int i4 = 75 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = this.serializer;
        }
        int i5 = i2 + 1;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    public dispatchLayoutStep2(getScrollState getscrollstate) {
        getscrollstate.getClass();
        this.IconCompatParcelizer = getscrollstate;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = dispatchLayoutStep1.Companion.serializer();
        this.write = setgraphicmodalmaxwidthdpSerializer;
        setWasCloseMessageCalled setwasclosemessagecalledSerializer = LazyKt__LazyJVMKt.serializer(setgraphicmodalmaxwidthdpSerializer);
        this.read = setwasclosemessagecalledSerializer;
        this.serializer = (InAppMessageJavascriptInterfaceCompanion) setwasclosemessagecalledSerializer.write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List list = (List) obj;
        list.getClass();
        this.read.serialize(defaultInAppMessageViewWrapperFactory, list);
        int i4 = MediaDescriptionCompat + 47;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x001d A[SYNTHETIC] */
    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) throws Exception {
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer;
        dispatchLayoutStep1 dispatchlayoutstep1;
        int i = 2 % 2;
        getScrollState getscrollstate = this.IconCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.write;
        setTouchListener settouchlistener = (setTouchListener) defaultInAppMessageModalViewFactoryCompanion;
        try {
            requestDisallowParentIntercept requestdisallowparentinterceptIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(settouchlistener.read());
            ArrayList arrayList = new ArrayList();
            for (SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection : requestdisallowparentinterceptIconCompatParcelizer.content) {
                try {
                    dispatchlayoutstep1 = (dispatchLayoutStep1) settouchlistener.serializer().IconCompatParcelizer(setgraphicmodalmaxwidthdp, swipeDismissTouchListenerVerticalDismissDirection);
                } catch (SerializationException unused) {
                    Object obj = TouchAwareSwipeDismissTouchListener.RemoteActionCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection).get("type");
                    r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 r8lambdagbekcaskecamm7h9dyqnzofon0 = obj instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 ? (r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) obj : null;
                    String strIconCompatParcelizer = r8lambdagbekcaskecamm7h9dyqnzofon0 != null ? r8lambdagbekcaskecamm7h9dyqnzofon0.IconCompatParcelizer() : null;
                    dispatchLayoutStep1.Companion.getClass();
                    boolean zWrite = onContentCardDismissed.write(dispatchLayoutStep1.criticalComponents, strIconCompatParcelizer);
                    resetTransientState resettransientstateSerializer = settouchlistener.serializer();
                    resettransientstateSerializer.getClass();
                    if (strIconCompatParcelizer == null) {
                        r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = null;
                    } else {
                        try {
                            NetworkHeaders$Builder networkHeaders$Builder = new NetworkHeaders$Builder(5);
                            TouchAwareSwipeDismissTouchListenerITouchListener.IconCompatParcelizer(networkHeaders$Builder, strIconCompatParcelizer);
                            r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(resettransientstateSerializer.IconCompatParcelizer(setgraphicmodalmaxwidthdp, (SwipeDismissTouchListenerVerticalDismissDirection) networkHeaders$Builder.read()).getClass());
                            int i2 = MediaDescriptionCompat + 103;
                            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                        } catch (Exception unused2) {
                            r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = null;
                            getscrollstate.RemoteActionCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, zWrite);
                            if (zWrite) {
                                int i4 = MediaDescriptionCompat + 23;
                                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i5 = i4 % 2;
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer != null) {
                                    r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.write();
                                    throw null;
                                }
                            }
                            dispatchlayoutstep1 = null;
                            if (dispatchlayoutstep1 != null) {
                                int i6 = MediaDescriptionCompat + 39;
                                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                arrayList.add(dispatchlayoutstep1);
                            }
                        }
                    }
                    getscrollstate.RemoteActionCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, zWrite);
                    if (zWrite) {
                        int i8 = MediaDescriptionCompat + 23;
                        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer != null) {
                            r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.write();
                            throw null;
                        }
                    }
                    dispatchlayoutstep1 = null;
                } catch (Exception e) {
                    throw e;
                }
                if (dispatchlayoutstep1 != null) {
                    int i10 = MediaDescriptionCompat + 39;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    arrayList.add(dispatchlayoutstep1);
                }
            }
            return arrayList;
        } catch (Exception unused3) {
            getscrollstate.RemoteActionCompatParcelizer(null, true);
            return instance_delegatelambda0.write;
        }
    }
}
