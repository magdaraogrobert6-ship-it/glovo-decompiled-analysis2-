package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fastFirstOrNull implements getInAppMessageManager {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    private static int read = 1;
    public static final fastFirstOrNull serializer;
    private static int write;

    static {
        fastFirstOrNull fastfirstornull = new fastFirstOrNull();
        serializer = fastfirstornull;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("bags_and_items", fastfirstornull, 2);
        oncloseactionlambda1.read("bags", true);
        oncloseactionlambda1.read("items", true);
        descriptor = oncloseactionlambda1;
        int i = IconCompatParcelizer + 17;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        int i4 = i3 + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = {LazyKt__LazyJVMKt.read(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer), LazyKt__LazyJVMKt.read(fastForEachIndexed.RemoteActionCompatParcelizer)};
        int i4 = read + 7;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setgraphicmodalmaxwidthdpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0047 A[DONT_INVERT, PHI: r1 r3 r7 r8
  0x0047: PHI (r1v8 o.fastFirst) = (r1v4 o.fastFirst), (r1v9 o.fastFirst) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r3v4 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r3v0 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r3v5 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r7v5 o.DefaultInAppMessageSlideupViewFactory) = (r7v1 o.DefaultInAppMessageSlideupViewFactory), (r7v6 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r8v7 java.lang.String) = (r8v2 java.lang.String), (r8v9 java.lang.String) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003d A[PHI: r1 r3 r7 r8
  0x003d: PHI (r1v5 o.fastFirst) = (r1v4 o.fastFirst), (r1v9 o.fastFirst) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r3v1 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) = (r3v0 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA), (r3v5 o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r7v2 o.DefaultInAppMessageSlideupViewFactory) = (r7v1 o.DefaultInAppMessageSlideupViewFactory), (r7v6 o.DefaultInAppMessageSlideupViewFactory) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v9 java.lang.String) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        fastFirst fastfirst;
        String str;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            fastFlatMap fastflatmap = (fastFlatMap) obj;
            fastflatmap.getClass();
            fastfirst = fastflatmap.items;
            str = fastflatmap.bags;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            int i3 = 52 / 0;
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                int i4 = RemoteActionCompatParcelizer + 5;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (str != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        } else {
            fastFlatMap fastflatmap2 = (fastFlatMap) obj;
            fastflatmap2.getClass();
            fastfirst = fastflatmap2.items;
            str = fastflatmap2.bags;
            r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
            defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                int i6 = RemoteActionCompatParcelizer + 5;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else if (str != null) {
            }
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || fastfirst != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, fastForEachIndexed.RemoteActionCompatParcelizer, fastfirst);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        fastFirst fastfirst = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            int i3 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i3 == -1) {
                z = false;
            } else if (i3 != 0) {
                int i4 = RemoteActionCompatParcelizer + 79;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i5;
                int i6 = i4 % 2;
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i3);
                    return null;
                }
                int i7 = i5 + 75;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                fastfirst = (fastFirst) (i7 % 2 != 0 ? createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, fastForEachIndexed.RemoteActionCompatParcelizer, fastfirst) : createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, fastForEachIndexed.RemoteActionCompatParcelizer, fastfirst));
                i2 |= 2;
            } else {
                str = (String) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                i2 |= 1;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        fastFlatMap fastflatmap = new fastFlatMap(i2, str, fastfirst);
        int i8 = read + 37;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return fastflatmap;
    }
}
