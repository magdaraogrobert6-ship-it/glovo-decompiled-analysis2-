package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaFyeQZdkDmEYtgy0V6OzxNdEPxxo implements unregisterComponentCallback {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ int serializer;

    public r8lambdaFyeQZdkDmEYtgy0V6OzxNdEPxxo(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.serializer = i;
        if (i != 1) {
            this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
    }

    @Override // o.unregisterComponentCallback
    public final void RemoteActionCompatParcelizer(Object obj) {
        Object obj2;
        int i = 2 % 2;
        int i2 = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        Object obj3 = null;
        if (i2 != 0) {
            getRequiredTypeConverterClasses getrequiredtypeconverterclasses = (getRequiredTypeConverterClasses) obj;
            getrequiredtypeconverterclasses.getClass();
            if (getrequiredtypeconverterclasses.RemoteActionCompatParcelizer) {
                int i3 = RemoteActionCompatParcelizer + 115;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                getrequiredtypeconverterclasses.RemoteActionCompatParcelizer = true;
                obj3 = getrequiredtypeconverterclasses.serializer;
            }
            if (obj3 != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj3);
            }
            int i5 = IconCompatParcelizer + 7;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        BrazeImageUtilsExternalSyntheticLambda20 brazeImageUtilsExternalSyntheticLambda20 = (BrazeImageUtilsExternalSyntheticLambda20) obj;
        brazeImageUtilsExternalSyntheticLambda20.getClass();
        if (!(!brazeImageUtilsExternalSyntheticLambda20.RemoteActionCompatParcelizer)) {
            int i7 = IconCompatParcelizer + 9;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
            obj2 = null;
        } else {
            brazeImageUtilsExternalSyntheticLambda20.RemoteActionCompatParcelizer = true;
            obj2 = brazeImageUtilsExternalSyntheticLambda20.IconCompatParcelizer;
        }
        if (obj2 != null) {
            int i8 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2);
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2);
                throw null;
            }
        }
    }
}
