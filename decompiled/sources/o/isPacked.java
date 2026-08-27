package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isPacked implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final isPacked read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        isPacked ispacked = new isPacked();
        read = ispacked;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.helpcenter.data.bridge.ChatPayload", ispacked, 1);
        oncloseactionlambda1.read("chatId", false);
        descriptor = oncloseactionlambda1;
        int i = write + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer};
        int i4 = serializer + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        id idVar = (id) obj;
        idVar.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, idVar.chatId);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = IconCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e A[LOOP:0: B:7:0x002a->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EDGE_INSN: B:18:0x001c->B:5:0x001c BREAK  A[LOOP:0: B:7:0x002a->B:12:0x003e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:5:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x004b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.setGraphicModalMaxWidthDp
    public final java.lang.Object deserialize(o.DefaultInAppMessageModalViewFactoryCompanion r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.isPacked.serializer
            int r1 = r1 + 103
            int r2 = r1 % 128
            o.isPacked.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1e
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.isPacked.descriptor
            o.createInAppMessageViewlambda1 r11 = r11.serializer(r1)
            r11.getClass()
            r7 = r2
            r6 = r3
        L1c:
            r5 = r4
            goto L2a
        L1e:
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.isPacked.descriptor
            o.createInAppMessageViewlambda1 r11 = r11.serializer(r1)
            r11.getClass()
            r7 = r2
            r5 = r3
            r6 = r4
        L2a:
            if (r5 == 0) goto L4f
            int r8 = r11.read(r1)
            r9 = -1
            if (r8 == r9) goto L1c
            int r6 = o.isPacked.IconCompatParcelizer
            int r7 = r6 + 125
            int r9 = r7 % 128
            o.isPacked.serializer = r9
            int r7 = r7 % r0
            if (r8 != 0) goto L4b
            int r6 = r6 + 95
            int r7 = r6 % 128
            o.isPacked.serializer = r7
            int r6 = r6 % r0
            java.lang.String r7 = r11.MediaMetadataCompat(r1, r4)
            r6 = r3
            goto L2a
        L4b:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8)
            return r2
        L4f:
            r11.write(r1)
            o.id r11 = new o.id
            r11.<init>(r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isPacked.deserialize(o.DefaultInAppMessageModalViewFactoryCompanion):java.lang.Object");
    }
}
