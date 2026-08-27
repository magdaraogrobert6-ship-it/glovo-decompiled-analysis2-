package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class get1ASDuI8 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final get1ASDuI8 read;
    private static int serializer = 0;
    private static int write = 1;

    static {
        get1ASDuI8 get1asdui8 = new get1ASDuI8();
        read = get1asdui8;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.DeliveryRequestBody.Issues", get1asdui8, 2);
        oncloseactionlambda1.read("cash_collection", true);
        oncloseactionlambda1.read("pickup_payment_type", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = write + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        int i3 = 41 / 0;
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(runCachedBlocking.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer)};
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(runCachedBlocking.RemoteActionCompatParcelizer);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[4];
        setgraphicmodalmaxwidthdpArr[1] = setgraphicmodalmaxwidthdp;
        setgraphicmodalmaxwidthdpArr[1] = setgraphicmodalmaxwidthdp2;
        return setgraphicmodalmaxwidthdpArr;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = write + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            isPermanentFailureimpl ispermanentfailureimpl = (isPermanentFailureimpl) obj;
            ispermanentfailureimpl.getClass();
            String str = ispermanentfailureimpl.paymentType;
            AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult = ispermanentfailureimpl.cashCollection;
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda).read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            throw null;
        }
        isPermanentFailureimpl ispermanentfailureimpl2 = (isPermanentFailureimpl) obj;
        ispermanentfailureimpl2.getClass();
        String str2 = ispermanentfailureimpl2.paymentType;
        AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult2 = ispermanentfailureimpl2.cashCollection;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || asyncTypefaceCacheAsyncTypefaceResult2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 0, runCachedBlocking.RemoteActionCompatParcelizer, asyncTypefaceCacheAsyncTypefaceResult2);
            int i3 = write + 99;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda2, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i4 = serializer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = 0;
        AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult = null;
        String str = null;
        boolean z = true;
        while (z) {
            int i7 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i7 == -1) {
                z = false;
            } else if (i7 != 0) {
                int i8 = write + 77;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    if (i7 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i6 |= 2;
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i7);
                        return null;
                    }
                    str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i6 |= 2;
                }
            } else {
                asyncTypefaceCacheAsyncTypefaceResult = (AsyncTypefaceCacheAsyncTypefaceResult) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, runCachedBlocking.RemoteActionCompatParcelizer, asyncTypefaceCacheAsyncTypefaceResult);
                i6 |= 1;
                int i9 = serializer + 7;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 4 / 2;
                }
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        isPermanentFailureimpl ispermanentfailureimpl = new isPermanentFailureimpl(i6, asyncTypefaceCacheAsyncTypefaceResult, str);
        int i11 = serializer + 33;
        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return ispermanentfailureimpl;
    }
}
