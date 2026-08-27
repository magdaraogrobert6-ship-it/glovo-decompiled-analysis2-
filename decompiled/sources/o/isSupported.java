package o;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isSupported extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final isSupported write = new isSupported(1, DefaultContentCardsUpdateHandlerCompanionCREATOR1.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && markOnScreenCardsAsReadlambda1.write(applicationContext)) {
            try {
                return new RectangleShapeKtRectangleShape1(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return RenderEffect.IconCompatParcelizer;
    }

    public isSupported(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
