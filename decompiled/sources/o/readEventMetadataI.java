package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class readEventMetadataI implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    public static final readEventMetadataI serializer;
    private static int write = 1;

    static {
        readEventMetadataI readeventmetadatai = new readEventMetadataI();
        serializer = readeventmetadatai;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.recentdeliveries.data.model.Tag", readeventmetadatai, 2);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read("label", false);
        descriptor = oncloseactionlambda1;
        int i = read + 97;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 55;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[2];
            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
            setgraphicmodalmaxwidthdpArr[0] = beforeinappmessageviewclosed;
        } else {
            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
            setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2};
        }
        int i3 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        readConfigFile readconfigfile = (readConfigFile) obj;
        readconfigfile.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, readconfigfile.key);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, readconfigfile.label);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = RemoteActionCompatParcelizer + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x001c A[EDGE_INSN: B:23:0x001c->B:5:0x001c BREAK  A[LOOP:0: B:7:0x002b->B:28:0x002b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:5:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0041
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
            int r1 = o.readEventMetadataI.IconCompatParcelizer
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            o.readEventMetadataI.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1e
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.readEventMetadataI.descriptor
            o.createInAppMessageViewlambda1 r12 = r12.serializer(r1)
            r12.getClass()
            r6 = r2
            r7 = r3
            r8 = r7
        L1c:
            r5 = r4
            goto L2b
        L1e:
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.readEventMetadataI.descriptor
            o.createInAppMessageViewlambda1 r12 = r12.serializer(r1)
            r12.getClass()
            r5 = r2
            r7 = r3
            r8 = r7
            r6 = r4
        L2b:
            if (r5 == 0) goto L58
            int r9 = r12.read(r1)
            r10 = -1
            if (r9 == r10) goto L1c
            if (r9 == 0) goto L51
            int r8 = o.readEventMetadataI.IconCompatParcelizer
            int r8 = r8 + 57
            int r10 = r8 % 128
            o.readEventMetadataI.RemoteActionCompatParcelizer = r10
            int r8 = r8 % r0
            if (r8 == 0) goto L44
            if (r9 != 0) goto L4d
            goto L46
        L44:
            if (r9 != r2) goto L4d
        L46:
            java.lang.String r8 = r12.MediaMetadataCompat(r1, r2)
            r6 = r6 | 2
            goto L2b
        L4d:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r9)
            return r3
        L51:
            java.lang.String r7 = r12.MediaMetadataCompat(r1, r4)
            r6 = r6 | 1
            goto L2b
        L58:
            r12.write(r1)
            o.readConfigFile r12 = new o.readConfigFile
            r12.<init>(r6, r7, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.readEventMetadataI.deserialize(o.DefaultInAppMessageModalViewFactoryCompanion):java.lang.Object");
    }
}
