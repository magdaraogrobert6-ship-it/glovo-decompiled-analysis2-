package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setGooglePlayInstant implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read;
    public static final setGooglePlayInstant serializer;
    private static int write;

    static {
        setGooglePlayInstant setgoogleplayinstant = new setGooglePlayInstant();
        serializer = setgoogleplayinstant;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.rider.safety.log.data.entity.SafetyLogEventParam", setgoogleplayinstant, 2);
        oncloseactionlambda1.read("key", false);
        oncloseactionlambda1.read("value", false);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 95;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i3 + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {beforeinappmessageviewclosed, beforeinappmessageviewclosed};
        int i4 = RemoteActionCompatParcelizer + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setInstallBeginTimeInSeconds setinstallbegintimeinseconds = (setInstallBeginTimeInSeconds) obj;
        setinstallbegintimeinseconds.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, setinstallbegintimeinseconds.key);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, setinstallbegintimeinseconds.value);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = write + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x001c A[EDGE_INSN: B:22:0x001c->B:5:0x001c BREAK  A[LOOP:0: B:7:0x002b->B:28:0x002b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:5:0x001c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0038
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.setGraphicModalMaxWidthDp
    public final java.lang.Object deserialize(o.DefaultInAppMessageModalViewFactoryCompanion r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setGooglePlayInstant.RemoteActionCompatParcelizer
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            o.setGooglePlayInstant.write = r3
            int r1 = r1 % r0
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1e
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.setGooglePlayInstant.descriptor
            o.createInAppMessageViewlambda1 r13 = r13.serializer(r1)
            r13.getClass()
            r6 = r2
            r7 = r3
            r8 = r7
        L1c:
            r5 = r4
            goto L2b
        L1e:
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.setGooglePlayInstant.descriptor
            o.createInAppMessageViewlambda1 r13 = r13.serializer(r1)
            r13.getClass()
            r5 = r2
            r7 = r3
            r8 = r7
            r6 = r4
        L2b:
            if (r5 == 0) goto L5e
            int r9 = r13.read(r1)
            r10 = -1
            if (r9 == r10) goto L1c
            if (r9 == 0) goto L57
            if (r9 != r2) goto L53
            int r8 = o.setGooglePlayInstant.RemoteActionCompatParcelizer
            int r8 = r8 + 57
            int r9 = r8 % 128
            o.setGooglePlayInstant.write = r9
            int r8 = r8 % r0
            if (r8 == 0) goto L4c
            java.lang.String r6 = r13.MediaMetadataCompat(r1, r4)
            r8 = 3
            r11 = r8
            r8 = r6
            r6 = r11
            goto L2b
        L4c:
            java.lang.String r8 = r13.MediaMetadataCompat(r1, r2)
            r6 = r6 | 2
            goto L2b
        L53:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r9)
            return r3
        L57:
            java.lang.String r7 = r13.MediaMetadataCompat(r1, r4)
            r6 = r6 | 1
            goto L2b
        L5e:
            r13.write(r1)
            o.setInstallBeginTimeInSeconds r13 = new o.setInstallBeginTimeInSeconds
            r13.<init>(r6, r7, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setGooglePlayInstant.deserialize(o.DefaultInAppMessageModalViewFactoryCompanion):java.lang.Object");
    }
}
