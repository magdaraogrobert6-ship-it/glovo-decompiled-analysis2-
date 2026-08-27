package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidComposeViewonAttachedToWindow1 implements getInAppMessageManager {
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final AndroidComposeViewonAttachedToWindow1 read;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        AndroidComposeViewonAttachedToWindow1 androidComposeViewonAttachedToWindow1 = new AndroidComposeViewonAttachedToWindow1();
        read = androidComposeViewonAttachedToWindow1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.google.firebase.sessions.SessionData", androidComposeViewonAttachedToWindow1, 3);
        oncloseactionlambda1.read("sessionDetails", false);
        oncloseactionlambda1.read("backgroundTime", true);
        oncloseactionlambda1.read("processDataMap", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        return new setGraphicModalMaxWidthDp[]{AndroidComposeViewrequestFocusCurrent1.read, LazyKt__LazyJVMKt.read(AndroidComposeViewviewTreeOwners2.write), LazyKt__LazyJVMKt.read(AndroidComposeViewlocaleList2.$childSerializers[2])};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = AndroidComposeViewlocaleList2.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1 = null;
        r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq = null;
        Map map = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                androidComposeViewpointerIconService1 = (AndroidComposeViewpointerIconService1) createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, AndroidComposeViewrequestFocusCurrent1.read, androidComposeViewpointerIconService1);
                i |= 1;
            } else if (i2 == 1) {
                r8lambdaqacahjelyunmmyjvdipcgfmxzq = (r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, AndroidComposeViewviewTreeOwners2.write, r8lambdaqacahjelyunmmyjvdipcgfmxzq);
                i |= 2;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                map = (Map) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], map);
                i |= 4;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AndroidComposeViewlocaleList2(i, androidComposeViewpointerIconService1, r8lambdaqacahjelyunmmyjvdipcgfmxzq, map);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = (AndroidComposeViewlocaleList2) obj;
        androidComposeViewlocaleList2.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = AndroidComposeViewlocaleList2.$childSerializers;
        AndroidComposeViewrequestFocusCurrent1 androidComposeViewrequestFocusCurrent1 = AndroidComposeViewrequestFocusCurrent1.read;
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1 = androidComposeViewlocaleList2.sessionDetails;
        Map map = androidComposeViewlocaleList2.processDataMap;
        r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq = androidComposeViewlocaleList2.backgroundTime;
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, androidComposeViewrequestFocusCurrent1, androidComposeViewpointerIconService1);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || r8lambdaqacahjelyunmmyjvdipcgfmxzq != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, AndroidComposeViewviewTreeOwners2.write, r8lambdaqacahjelyunmmyjvdipcgfmxzq);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || map != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, setgraphicmodalmaxwidthdpArr[2], map);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
