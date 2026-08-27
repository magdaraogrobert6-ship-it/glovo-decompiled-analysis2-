package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE {
    public static final String write(androidx.compose.ui.layout.Measurable measurable) {
        String string;
        Object layoutId = androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable);
        if (layoutId == null) {
            measurable.getParentData();
            layoutId = null;
        }
        return (layoutId == null || (string = layoutId.toString()) == null) ? "null" : string;
    }
}
