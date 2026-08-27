package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FontFamilyResolver_androidKt implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final FontFamilyResolver_androidKt serializer;
    private static int write;

    static {
        FontFamilyResolver_androidKt fontFamilyResolver_androidKt = new FontFamilyResolver_androidKt();
        serializer = fontFamilyResolver_androidKt;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.OverlayComponent.OverlayInstruction.Config", fontFamilyResolver_androidKt, 1);
        oncloseactionlambda1.read("trim", true);
        descriptor = oncloseactionlambda1;
        int i = write + 45;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) emptyCacheFontFamilyResolver.$childSerializers[0].MediaSessionCompatResultReceiverWrapper())};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[0];
        setgraphicmodalmaxwidthdpArr[0] = LazyKt__LazyJVMKt.read((setGraphicModalMaxWidthDp) emptyCacheFontFamilyResolver.$childSerializers[1].MediaSessionCompatResultReceiverWrapper());
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0047 A[DONT_INVERT, PHI: r1 r3 r7 r8
  0x0047: PHI (r1v8 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r1v4 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r1v9 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r3v6 o.onViewDetachedFromWindowlambda1[]) = (r3v0 o.onViewDetachedFromWindowlambda1[]), (r3v7 o.onViewDetachedFromWindowlambda1[]) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r7v5 o.DefaultInAppMessageSlideupViewFactory) = (r7v1 o.DefaultInAppMessageSlideupViewFactory), (r7v6 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r8v8 com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim) = 
  (r8v2 com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim)
  (r8v10 com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim)
 binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003d A[PHI: r1 r3 r7 r8
  0x003d: PHI (r1v5 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r1v4 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r1v9 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r3v1 o.onViewDetachedFromWindowlambda1[]) = (r3v0 o.onViewDetachedFromWindowlambda1[]), (r3v7 o.onViewDetachedFromWindowlambda1[]) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r7v2 o.DefaultInAppMessageSlideupViewFactory) = (r7v1 o.DefaultInAppMessageSlideupViewFactory), (r7v6 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r8v3 com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim) = 
  (r8v2 com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim)
  (r8v10 com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim)
 binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            emptyCacheFontFamilyResolver emptycachefontfamilyresolver = (emptyCacheFontFamilyResolver) obj;
            emptycachefontfamilyresolver.getClass();
            overlayComponent$OverlayInstruction$Config$Trim = emptycachefontfamilyresolver.trim;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = emptyCacheFontFamilyResolver.$childSerializers;
            int i3 = 24 / 0;
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                int i4 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (overlayComponent$OverlayInstruction$Config$Trim != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), overlayComponent$OverlayInstruction$Config$Trim);
            int i6 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            emptyCacheFontFamilyResolver emptycachefontfamilyresolver2 = (emptyCacheFontFamilyResolver) obj;
            emptycachefontfamilyresolver2.getClass();
            overlayComponent$OverlayInstruction$Config$Trim = emptycachefontfamilyresolver2.trim;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onviewdetachedfromwindowlambda1Arr = emptyCacheFontFamilyResolver.$childSerializers;
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                int i8 = RemoteActionCompatParcelizer + 27;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else if (overlayComponent$OverlayInstruction$Config$Trim != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), overlayComponent$OverlayInstruction$Config$Trim);
            int i10 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = emptyCacheFontFamilyResolver.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$Trim = null;
        boolean z = true;
        int i2 = 0;
        while (!(!z)) {
            int i3 = IconCompatParcelizer + 27;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i5 != -1) {
                int i6 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 33 / 0;
                    if (i5 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        int i8 = IconCompatParcelizer + 121;
                        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return null;
                    }
                    overlayComponent$OverlayInstruction$Config$Trim = (OverlayComponent$OverlayInstruction$Config$Trim) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), overlayComponent$OverlayInstruction$Config$Trim);
                    i2 = 1;
                } else {
                    if (i5 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i5);
                        int i10 = IconCompatParcelizer + 121;
                        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        return null;
                    }
                    overlayComponent$OverlayInstruction$Config$Trim = (OverlayComponent$OverlayInstruction$Config$Trim) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr[0].MediaSessionCompatResultReceiverWrapper(), overlayComponent$OverlayInstruction$Config$Trim);
                    i2 = 1;
                }
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new emptyCacheFontFamilyResolver(i2, overlayComponent$OverlayInstruction$Config$Trim);
    }
}
