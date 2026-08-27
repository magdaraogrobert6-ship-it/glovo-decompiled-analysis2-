package o;

import com.roadrunner.delivery.common.data.model.tasks.UtccComponent$UnknownComponent$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getAxisName implements getInAppMessageManager {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final getAxisName read;
    private static int serializer = 1;
    private static int write = 1;

    static {
        getAxisName getaxisname = new getAxisName();
        read = getaxisname;
        descriptor = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.tasks.UtccComponent.UnknownComponent", getaxisname, 0);
        int i = write + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return new setGraphicModalMaxWidthDp[0];
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((grade) obj).getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        UtccComponent$UnknownComponent$Companion utccComponent$UnknownComponent$Companion = grade.Companion;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i4 = serializer + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r3 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r3 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r6.write(r1);
        r6 = new o.grade();
        r1 = o.getAxisName.IconCompatParcelizer + 35;
        o.getAxisName.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // o.setGraphicModalMaxWidthDp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(o.DefaultInAppMessageModalViewFactoryCompanion r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getAxisName.serializer
            int r1 = r1 + 81
            int r2 = r1 % 128
            o.getAxisName.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -1
            if (r1 == 0) goto L23
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.getAxisName.descriptor
            o.createInAppMessageViewlambda1 r6 = r6.serializer(r1)
            r6.getClass()
            int r3 = r6.read(r1)
            r4 = 31
            int r4 = r4 / 0
            if (r3 != r2) goto L44
            goto L32
        L23:
            o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r1 = o.getAxisName.descriptor
            o.createInAppMessageViewlambda1 r6 = r6.serializer(r1)
            r6.getClass()
            int r3 = r6.read(r1)
            if (r3 != r2) goto L44
        L32:
            r6.write(r1)
            o.grade r6 = new o.grade
            r6.<init>()
            int r1 = o.getAxisName.IconCompatParcelizer
            int r1 = r1 + 35
            int r2 = r1 % 128
            o.getAxisName.serializer = r2
            int r1 = r1 % r0
            return r6
        L44:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r3)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAxisName.deserialize(o.DefaultInAppMessageModalViewFactoryCompanion):java.lang.Object");
    }
}
