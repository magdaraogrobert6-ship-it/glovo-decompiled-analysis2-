package o;

/* JADX INFO: loaded from: classes.dex */
public final class drawCircularIndicator42QJj7c implements ProgressIndicatorKt {
    public static final drawCircularIndicator42QJj7c write = new drawCircularIndicator42QJj7c();

    public final androidx.compose.ui.Modifier write(androidx.compose.ui.Modifier modifier) {
        return modifier.then(new TooltipStateImpl(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline()));
    }
}
