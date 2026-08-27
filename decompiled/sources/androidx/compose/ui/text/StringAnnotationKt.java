package androidx.compose.ui.text;

/* JADX INFO: loaded from: classes.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range<String> unbox(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        item.getClass();
        return new AnnotatedString.Range<>(((StringAnnotation) item).m3029unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
