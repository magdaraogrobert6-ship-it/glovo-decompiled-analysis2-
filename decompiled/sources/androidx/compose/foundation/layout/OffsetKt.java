package androidx.compose.foundation.layout;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import o.ModalBottomSheet_androidKtModalBottomSheetDialogdialog111;
import o.OneRowSnackbarkKq0p4A;
import o.SheetDefaultsKt;
import o.SnackbarHostState;
import o.SnackbarsDKtq54;
import o.animateElevation;
import o.getBirthDateFull;
import o.getNewPassword;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.showSnackbar;

/* JADX INFO: loaded from: classes.dex */
public abstract class OffsetKt {
    public static final ModalBottomSheet_androidKtModalBottomSheetDialogdialog111 read = new ModalBottomSheet_androidKtModalBottomSheetDialogdialog111(0, 0);

    public static final SheetDefaultsKt read(animateElevation animateelevation, getBirthDateFull getbirthdatefull) {
        return new SheetDefaultsKt(animateelevation, (Density) ((getPostalCode) getbirthdatefull).write((getNewPassword) CompositionLocalsKt.getLocalDensity()));
    }

    public static final Modifier read(Modifier modifier, float f, float f2) {
        return modifier.then(new SnackbarsDKtq54(f, f2, new OneRowSnackbarkKq0p4A(f, f2)));
    }

    public static final Modifier RemoteActionCompatParcelizer(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new showSnackbar(r8lambdaunavo3sxub_pc9xroryotnrlvsm, new SnackbarHostState(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0), true));
    }

    public static final Modifier read(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new showSnackbar(r8lambdaunavo3sxub_pc9xroryotnrlvsm, new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 2), false));
    }

    public static ModalBottomSheet_androidKtModalBottomSheetDialogdialog111 RemoteActionCompatParcelizer(int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return new ModalBottomSheet_androidKtModalBottomSheetDialogdialog111(0, i);
    }
}
