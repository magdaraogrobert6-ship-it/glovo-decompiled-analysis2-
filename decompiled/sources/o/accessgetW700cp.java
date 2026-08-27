package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.Analytics;
import com.roadrunner.delivery.destination.data.models.Analytics$$serializer;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class accessgetW700cp implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    public static final accessgetW700cp RemoteActionCompatParcelizer;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        accessgetW700cp accessgetw700cp = new accessgetW700cp();
        RemoteActionCompatParcelizer = accessgetw700cp;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.destination.data.models.Metadata", accessgetw700cp, 1);
        oncloseactionlambda1.read("analytics", true);
        descriptor = oncloseactionlambda1;
        int i = write + 13;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 53;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        int i2 = read + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(Analytics$$serializer.serializer)};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[1];
        setgraphicmodalmaxwidthdpArr[1] = LazyKt__LazyJVMKt.read(Analytics$$serializer.serializer);
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[DONT_INVERT, PHI: r1 r6 r7
  0x003a: PHI (r1v7 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r1v4 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r1v8 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r6v4 o.DefaultInAppMessageSlideupViewFactory) = (r6v1 o.DefaultInAppMessageSlideupViewFactory), (r6v5 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r7v7 com.roadrunner.delivery.destination.data.models.Analytics) = 
  (r7v2 com.roadrunner.delivery.destination.data.models.Analytics)
  (r7v9 com.roadrunner.delivery.destination.data.models.Analytics)
 binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        Analytics analytics;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer;
        int i = 2 % 2;
        int i2 = serializer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            accessgetW400cp accessgetw400cp = (accessgetW400cp) obj;
            accessgetw400cp.getClass();
            analytics = accessgetw400cp.analytics;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                if (analytics != null) {
                }
            }
            defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        accessgetW400cp accessgetw400cp2 = (accessgetW400cp) obj;
        accessgetw400cp2.getClass();
        analytics = accessgetw400cp2.analytics;
        r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        int i3 = 81 / 0;
        if (!defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (analytics != null) {
            }
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Analytics$$serializer.serializer, analytics);
        int i4 = serializer + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 3;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Analytics analytics = null;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            z = false;
            i = 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            createinappmessageviewlambda1Serializer.getClass();
            z = true;
            i = 0;
        }
        while (z) {
            int i4 = read + 119;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i6 != -1) {
                int i7 = serializer + 11;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    analytics.hashCode();
                    throw null;
                }
                if (i6 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i6);
                    return null;
                }
                analytics = (Analytics) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, Analytics$$serializer.serializer, analytics);
                i = 1;
            } else {
                z = false;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new accessgetW400cp(i, analytics);
    }
}
