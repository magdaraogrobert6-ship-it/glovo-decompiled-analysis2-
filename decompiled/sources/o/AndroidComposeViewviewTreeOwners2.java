package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidComposeViewviewTreeOwners2 implements getInAppMessageManager {
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final AndroidComposeViewviewTreeOwners2 write;

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        onDismissed ondismissed = onDismissed.write;
        return new setGraphicModalMaxWidthDp[]{ondismissed, ondismissed, ondismissed};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        AndroidComposeViewviewTreeOwners2 androidComposeViewviewTreeOwners2 = new AndroidComposeViewviewTreeOwners2();
        write = androidComposeViewviewTreeOwners2;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.google.firebase.sessions.Time", androidComposeViewviewTreeOwners2, 3);
        oncloseactionlambda1.read("ms", false);
        oncloseactionlambda1.read("us", true);
        oncloseactionlambda1.read("seconds", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        long jSerializer = 0;
        long jSerializer2 = 0;
        long jSerializer3 = 0;
        boolean z = true;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                jSerializer = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                i |= 1;
            } else if (i2 == 1) {
                jSerializer2 = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                jSerializer3 = createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ(i, jSerializer, jSerializer2, jSerializer3);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq = (r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ) obj;
        r8lambdaqacahjelyunmmyjvdipcgfmxzq.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        long j = r8lambdaqacahjelyunmmyjvdipcgfmxzq.ms;
        long j2 = r8lambdaqacahjelyunmmyjvdipcgfmxzq.seconds;
        long j3 = r8lambdaqacahjelyunmmyjvdipcgfmxzq.us;
        defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, j);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || j3 != j * 1000) {
            defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, j3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || j2 != j / 1000) {
            defaultInAppMessageSlideupViewFactorySerializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, j2);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
