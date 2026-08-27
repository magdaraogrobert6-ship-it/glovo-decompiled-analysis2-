package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetFarcp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ accessgetFarcp(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        Object obj2 = this.read;
        if (i == 0) {
            androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) obj2);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.m2833setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.Companion.m2818getImageo7Vup1c());
            return createFromParcel.INSTANCE;
        }
        androidx.compose.ui.text.TextLinkStyles textLinkStyles = (androidx.compose.ui.text.TextLinkStyles) obj2;
        androidx.compose.ui.text.AnnotatedString.Range range = (androidx.compose.ui.text.AnnotatedString.Range) obj;
        androidx.compose.ui.text.AnnotatedString.Annotation annotation = (androidx.compose.ui.text.AnnotatedString.Annotation) range.getItem();
        if (annotation instanceof androidx.compose.ui.text.LinkAnnotation.Url) {
            androidx.compose.ui.text.LinkAnnotation.Url url = (androidx.compose.ui.text.LinkAnnotation.Url) annotation;
            if (url.getStyles() == null) {
                return androidx.compose.ui.text.AnnotatedString.Range.copy$default(range, androidx.compose.ui.text.LinkAnnotation.Url.copy$default(url, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        if (!(annotation instanceof androidx.compose.ui.text.LinkAnnotation.Clickable)) {
            return range;
        }
        androidx.compose.ui.text.LinkAnnotation.Clickable clickable = (androidx.compose.ui.text.LinkAnnotation.Clickable) annotation;
        return clickable.getStyles() == null ? androidx.compose.ui.text.AnnotatedString.Range.copy$default(range, androidx.compose.ui.text.LinkAnnotation.Clickable.copy$default(clickable, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null) : range;
    }
}
