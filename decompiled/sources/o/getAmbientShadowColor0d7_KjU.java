package o;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAmbientShadowColor0d7_KjU extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((androidx.window.layout.adapter.extensions.MulticastConsumer) this.MediaMetadataCompat).accept(windowLayoutInfo);
        return createFromParcel.INSTANCE;
    }

    public getAmbientShadowColor0d7_KjU(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
    }
}
