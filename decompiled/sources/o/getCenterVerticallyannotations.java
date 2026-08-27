package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getCenterVerticallyannotations {
    public static final void IconCompatParcelizer(androidx.compose.ui.text.AnnotatedString.Builder builder, String str, String str2) {
        if (str2.length() <= 0) {
            TriStateCheckbox.read("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation("androidx.compose.foundation.text.inlineContent", str);
        builder.append(str2);
        builder.pop();
    }
}
