package o;

/* JADX INFO: loaded from: classes.dex */
public final class PaddingValuesModifier {
    public final String RemoteActionCompatParcelizer;
    public final requiredSizeInqDBjuR0default read;
    public final PopulateViewStructure_androidKtpopulate7 serializer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
    public final /* synthetic */ androidx.compose.animation.core.Transition write;

    public PaddingValuesModifier(androidx.compose.animation.core.Transition transition, requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, String str) {
        this.write = transition;
        this.read = requiredsizeinqdbjur0default;
        this.RemoteActionCompatParcelizer = str;
    }

    public final PaddingValuesa9UjIt4default RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        onShowTranslationui onshowtranslationui = (onShowTranslationui) this.serializer;
        PaddingValuesa9UjIt4default paddingValuesa9UjIt4default = (PaddingValuesa9UjIt4default) onshowtranslationui.getValue();
        androidx.compose.animation.core.Transition transition = this.write;
        if (paddingValuesa9UjIt4default == null) {
            Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(transition.MediaSessionCompatToken.IconCompatParcelizer());
            Object objInvoke2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(transition.MediaSessionCompatToken.IconCompatParcelizer());
            requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = this.read;
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(objInvoke2);
            transformGestureDetectorKtdetectTransformGestures2.read();
            requiredSize3ABfNKs requiredsize3abfnks = new requiredSize3ABfNKs(transition, objInvoke, transformGestureDetectorKtdetectTransformGestures2, requiredsizeinqdbjur0default, this.RemoteActionCompatParcelizer);
            PaddingValuesa9UjIt4default paddingValuesa9UjIt4default2 = new PaddingValuesa9UjIt4default(this, requiredsize3abfnks, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            onshowtranslationui.setValue(paddingValuesa9UjIt4default2);
            transition.RemoteActionCompatParcelizer.add(requiredsize3abfnks);
            paddingValuesa9UjIt4default = paddingValuesa9UjIt4default2;
        }
        paddingValuesa9UjIt4default.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        paddingValuesa9UjIt4default.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        paddingValuesa9UjIt4default.IconCompatParcelizer(transition.IconCompatParcelizer());
        return paddingValuesa9UjIt4default;
    }
}
