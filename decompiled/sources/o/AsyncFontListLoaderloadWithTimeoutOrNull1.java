package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class AsyncFontListLoaderloadWithTimeoutOrNull1 implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 0;
    private static int serializer = 1;
    public static final AsyncFontListLoaderloadWithTimeoutOrNull1 write;

    static {
        AsyncFontListLoaderloadWithTimeoutOrNull1 asyncFontListLoaderloadWithTimeoutOrNull1 = new AsyncFontListLoaderloadWithTimeoutOrNull1();
        write = asyncFontListLoaderloadWithTimeoutOrNull1;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.roadrunner.delivery.common.data.model.AcceptDeliveryRequestBody.Issues", asyncFontListLoaderloadWithTimeoutOrNull1, 1);
        oncloseactionlambda1.read("pickup_payment_type", true);
        descriptor = oncloseactionlambda1;
        int i = RemoteActionCompatParcelizer + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 123;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i5 = i2 + 25;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = read + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new setGraphicModalMaxWidthDp[]{LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer)};
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = new setGraphicModalMaxWidthDp[1];
        setgraphicmodalmaxwidthdpArr[1] = LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer);
        return setgraphicmodalmaxwidthdpArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043 A[DONT_INVERT, PHI: r1 r6 r7
  0x0043: PHI (r1v8 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r1v4 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r1v9 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r6v5 o.DefaultInAppMessageSlideupViewFactory) = (r6v1 o.DefaultInAppMessageSlideupViewFactory), (r6v6 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v7 java.lang.String) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0039 A[PHI: r1 r6 r7
  0x0039: PHI (r1v5 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r1v4 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r1v9 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r6v2 o.DefaultInAppMessageSlideupViewFactory) = (r6v1 o.DefaultInAppMessageSlideupViewFactory), (r6v6 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v7 java.lang.String) binds: [B:8:0x0037, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        String str;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer;
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            AsyncFontListLoaderload2typeface1 asyncFontListLoaderload2typeface1 = (AsyncFontListLoaderload2typeface1) obj;
            asyncFontListLoaderload2typeface1.getClass();
            str = asyncFontListLoaderload2typeface1.paymentType;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i3 = 50 / 0;
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                int i4 = read + 103;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (str != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        } else {
            AsyncFontListLoaderload2typeface1 asyncFontListLoaderload2typeface2 = (AsyncFontListLoaderload2typeface1) obj;
            asyncFontListLoaderload2typeface2.getClass();
            str = asyncFontListLoaderload2typeface2.paymentType;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                int i6 = read + 103;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else if (str != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = null;
        int i2 = 0;
        boolean z = true;
        String str = null;
        while (!(!z)) {
            int i3 = IconCompatParcelizer + 65;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                obj.hashCode();
                throw null;
            }
            int i4 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i4 == -1) {
                int i5 = read + 51;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = false;
            } else {
                if (i4 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i4);
                    int i7 = IconCompatParcelizer + 31;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return null;
                }
                str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                i2 = 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new AsyncFontListLoaderload2typeface1(i2, str);
    }
}
