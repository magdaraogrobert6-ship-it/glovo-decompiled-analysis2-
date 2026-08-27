package o;

/* JADX INFO: loaded from: classes.dex */
public interface ModalBottomSheetDialogWrapper {
    static androidx.compose.ui.Modifier IconCompatParcelizer(androidx.compose.ui.Modifier modifier, float f) {
        if (f <= 0.0d) {
            TooltipKtTooltipBoxwrappedContent1.read("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new show(f, true));
    }
}
