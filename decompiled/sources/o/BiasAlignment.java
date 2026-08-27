package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public abstract class BiasAlignment {
    public static final ImageResources_androidKt write = new ImageResources_androidKt(0, 0, 2, androidx.compose.ui.text.input.OffsetMapping.Companion.getIdentity());

    public static final androidx.compose.ui.text.input.TransformedText serializer(androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.text.input.TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        int length = annotatedString.length();
        int length2 = transformedTextFilter.getText().length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            serializer(transformedTextFilter.getOffsetMapping().originalToTransformed(i), length2, i);
        }
        serializer(transformedTextFilter.getOffsetMapping().originalToTransformed(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            RemoteActionCompatParcelizer(transformedTextFilter.getOffsetMapping().transformedToOriginal(i2), length, i2);
        }
        RemoteActionCompatParcelizer(transformedTextFilter.getOffsetMapping().transformedToOriginal(length2), length, length2);
        return new androidx.compose.ui.text.input.TransformedText(transformedTextFilter.getText(), new ImageResources_androidKt(annotatedString.length(), transformedTextFilter.getText().length(), 2, transformedTextFilter.getOffsetMapping()));
    }

    public static final void RemoteActionCompatParcelizer(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
            sbM.append(i2);
            sbM.append(']');
            TriStateCheckbox.RemoteActionCompatParcelizer(sbM.toString());
        }
    }

    public static final void serializer(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
            sbM.append(i2);
            sbM.append(']');
            TriStateCheckbox.RemoteActionCompatParcelizer(sbM.toString());
        }
    }
}
