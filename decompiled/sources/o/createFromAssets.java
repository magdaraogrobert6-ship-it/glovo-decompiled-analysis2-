package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class createFromAssets implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;

    public /* synthetic */ createFromAssets(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        this.read = i;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.serializer;
        if (i2 == 0) {
            TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = (TypefaceHelperMethodsApi28) obj;
            typefaceHelperMethodsApi28.getClass();
            if (!(typefaceHelperMethodsApi28 instanceof TypefaceHelperMethodsApi28)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(typefaceHelperMethodsApi28.serializer(), typefaceHelperMethodsApi28.write(), -1);
            return createfromparcel;
        }
        cacheDeeplink cachedeeplink = (cacheDeeplink) obj;
        cachedeeplink.getClass();
        if (!(cachedeeplink instanceof cacheDeeplink)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            int i3 = write + 23;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = RemoteActionCompatParcelizer + 21;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(cachedeeplink.RemoteActionCompatParcelizer(), cachedeeplink.read(), -1);
        return createfromparcel;
    }
}
