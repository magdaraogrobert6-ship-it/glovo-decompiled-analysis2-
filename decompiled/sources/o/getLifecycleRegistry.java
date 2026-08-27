package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLifecycleRegistry implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getLifecycleRegistry(int i, Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    public /* synthetic */ getLifecycleRegistry(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i2 == 0) {
            TextGeometricTransformKt textGeometricTransformKt = (TextGeometricTransformKt) obj;
            textGeometricTransformKt.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(textGeometricTransformKt.write, ddefault.IconCompatParcelizer, 0);
            int i3 = IconCompatParcelizer + 61;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return createfromparcel;
            }
            throw null;
        }
        if (i2 == 1) {
            AnyOverlaplambda0 anyOverlaplambda0 = (AnyOverlaplambda0) obj;
            anyOverlaplambda0.getClass();
            if (!(anyOverlaplambda0 instanceof AnyOverlaplambda0)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i4 = IconCompatParcelizer + 37;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(anyOverlaplambda0.serializer, ddefault.serializer, -1);
            return createfromparcel;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                InspectableKtExternalSyntheticLambda0 inspectableKtExternalSyntheticLambda0 = (InspectableKtExternalSyntheticLambda0) obj;
                inspectableKtExternalSyntheticLambda0.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(inspectableKtExternalSyntheticLambda0.IconCompatParcelizer, ddefault.IconCompatParcelizer, 0);
                return createfromparcel;
            }
            TextGeometricTransformKt textGeometricTransformKt2 = (TextGeometricTransformKt) obj;
            textGeometricTransformKt2.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(textGeometricTransformKt2.write, ddefault.IconCompatParcelizer, 0);
            return createfromparcel;
        }
        TextInputServiceAndroidbaseInputConnection2 textInputServiceAndroidbaseInputConnection2 = (TextInputServiceAndroidbaseInputConnection2) obj;
        textInputServiceAndroidbaseInputConnection2.getClass();
        if (!(!(textInputServiceAndroidbaseInputConnection2 instanceof TextInputServiceAndroidcreateInputConnection1))) {
            int i6 = write + 57;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                TextInputServiceAndroidcreateInputConnection1 textInputServiceAndroidcreateInputConnection1 = (TextInputServiceAndroidcreateInputConnection1) textInputServiceAndroidbaseInputConnection2;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(textInputServiceAndroidcreateInputConnection1.IconCompatParcelizer, textInputServiceAndroidcreateInputConnection1.RemoteActionCompatParcelizer, "special_instructions");
                obj2.hashCode();
                throw null;
            }
            TextInputServiceAndroidcreateInputConnection1 textInputServiceAndroidcreateInputConnection2 = (TextInputServiceAndroidcreateInputConnection1) textInputServiceAndroidbaseInputConnection2;
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(textInputServiceAndroidcreateInputConnection2.IconCompatParcelizer, textInputServiceAndroidcreateInputConnection2.RemoteActionCompatParcelizer, "special_instructions");
            int i7 = write + 105;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return createfromparcel;
    }
}
