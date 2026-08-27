package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getItalic_LCdwAannotations implements getInAppMessageManager {
    public static final getItalic_LCdwAannotations IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        getItalic_LCdwAannotations getitalic_lcdwaannotations = new getItalic_LCdwAannotations();
        IconCompatParcelizer = getitalic_lcdwaannotations;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.TakePicture.ImageOverlayV2", getitalic_lcdwaannotations, 1);
        oncloseactionlambda1.read("components", true);
        descriptor = oncloseactionlambda1;
        int i = read + 29;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 23;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i2 + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {getItalic_LCdwA.$childSerializers[0].MediaSessionCompatResultReceiverWrapper()};
        int i4 = serializer + 51;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getItalic_LCdwA getitalic_lcdwa = (getItalic_LCdwA) obj;
            getitalic_lcdwa.getClass();
            List list = getitalic_lcdwa.components;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = getItalic_LCdwA.$childSerializers;
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        getItalic_LCdwA getitalic_lcdwa2 = (getItalic_LCdwA) obj;
        getitalic_lcdwa2.getClass();
        List list2 = getitalic_lcdwa2.components;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer2 = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr2 = getItalic_LCdwA.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer2.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2)) {
            defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[0].MediaSessionCompatResultReceiverWrapper(), list2);
        } else {
            Object[] objArr = {list2, instance_delegatelambda0.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, (setGraphicModalMaxWidthDp) onviewdetachedfromwindowlambda1Arr2[0].MediaSessionCompatResultReceiverWrapper(), list2);
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer2.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        int i3 = serializer + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:5:0x001e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.setGraphicModalMaxWidthDp
    public final java.lang.Object deserialize(o.DefaultInAppMessageModalViewFactoryCompanion r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getItalic_LCdwAannotations.serializer
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.getItalic_LCdwAannotations.write = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L20
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.getItalic_LCdwAannotations.descriptor
            o.createInAppMessageViewlambda1 r12 = r12.serializer(r1)
            o.onViewDetachedFromWindowlambda1[] r5 = o.getItalic_LCdwA.$childSerializers
            r12.getClass()
            r8 = r2
            r7 = r3
        L1e:
            r6 = r4
            goto L2e
        L20:
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.getItalic_LCdwAannotations.descriptor
            o.createInAppMessageViewlambda1 r12 = r12.serializer(r1)
            o.onViewDetachedFromWindowlambda1[] r5 = o.getItalic_LCdwA.$childSerializers
            r12.getClass()
            r8 = r2
            r6 = r3
            r7 = r4
        L2e:
            r9 = r6 ^ 1
            if (r9 == 0) goto L3b
            r12.write(r1)
            o.getItalic_LCdwA r12 = new o.getItalic_LCdwA
            r12.<init>(r7, r8)
            return r12
        L3b:
            int r9 = r12.read(r1)
            r10 = -1
            if (r9 == r10) goto L6a
            int r7 = o.getItalic_LCdwAannotations.write
            int r7 = r7 + 21
            int r10 = r7 % 128
            o.getItalic_LCdwAannotations.serializer = r10
            int r7 = r7 % r0
            if (r7 == 0) goto L53
            r7 = 65
            int r7 = r7 / r4
            if (r9 != 0) goto L66
            goto L55
        L53:
            if (r9 != 0) goto L66
        L55:
            r7 = r5[r4]
            java.lang.Object r7 = r7.MediaSessionCompatResultReceiverWrapper()
            o.setGraphicModalMaxWidthDp r7 = (o.setGraphicModalMaxWidthDp) r7
            java.lang.Object r7 = r12.IconCompatParcelizer(r1, r4, r7, r8)
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            r7 = r3
            goto L2e
        L66:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r9)
            return r2
        L6a:
            int r6 = o.getItalic_LCdwAannotations.write
            int r6 = r6 + 73
            int r9 = r6 % 128
            o.getItalic_LCdwAannotations.serializer = r9
            int r6 = r6 % r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItalic_LCdwAannotations.deserialize(o.DefaultInAppMessageModalViewFactoryCompanion):java.lang.Object");
    }
}
