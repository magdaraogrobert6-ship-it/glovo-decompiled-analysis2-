package o;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PathGeometryKtWhenMappings implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ PathGeometryKtWhenMappings(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i) {
        this.read = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.write;
        if (i != 0) {
            if (i != 1) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(obj);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
                return createfromparcel;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(obj);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
            return createfromparcel;
        }
        dashPathEffectdefault dashpatheffectdefault = (dashPathEffectdefault) obj;
        if (dashpatheffectdefault instanceof AsyncImagePainter$State$Loading) {
            return createfromparcel;
        }
        if (dashpatheffectdefault instanceof AsyncImagePainter$State$Success) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 == null) {
                return createfromparcel;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(dashpatheffectdefault);
            return createfromparcel;
        }
        if (dashpatheffectdefault instanceof AsyncImagePainter$State$Error) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
                return createfromparcel;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(dashpatheffectdefault);
            return createfromparcel;
        }
        if (dashpatheffectdefault instanceof PathEffect) {
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
