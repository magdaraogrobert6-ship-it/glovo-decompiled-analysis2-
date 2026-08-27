package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b6 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ b6(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            b2ExternalSyntheticLambda15 b2externalsyntheticlambda15 = (b2ExternalSyntheticLambda15) obj;
            b2externalsyntheticlambda15.getClass();
            if (b2externalsyntheticlambda15 instanceof b4) {
                int i4 = write + 65;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((b4) b2externalsyntheticlambda15).write);
            } else {
                if (!(b2externalsyntheticlambda15 instanceof b5)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((b5) b2externalsyntheticlambda15).IconCompatParcelizer);
            }
            return createfromparcel2;
        }
        resetHasPositionalLayerTransformationsForSubtreeIfNeeded resethaspositionallayertransformationsforsubtreeifneeded = (resetHasPositionalLayerTransformationsForSubtreeIfNeeded) obj;
        resethaspositionallayertransformationsforsubtreeifneeded.getClass();
        if (resethaspositionallayertransformationsforsubtreeifneeded instanceof isDescendantOfui) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((isDescendantOfui) resethaspositionallayertransformationsforsubtreeifneeded).read);
        } else {
            if (!(resethaspositionallayertransformationsforsubtreeifneeded instanceof findFocusableNodeFromRectui)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i6 = IconCompatParcelizer + 81;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((findFocusableNodeFromRectui) resethaspositionallayertransformationsforsubtreeifneeded).serializer);
                obj2.hashCode();
                throw null;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((findFocusableNodeFromRectui) resethaspositionallayertransformationsforsubtreeifneeded).serializer);
        }
        return createfromparcel2;
    }
}
