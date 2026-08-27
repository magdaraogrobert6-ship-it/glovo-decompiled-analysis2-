package androidx.compose.ui.text.input;

import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.accessgetIntersectcp;
import o.getCieXyz;
import o.invalidateShadow;
import o.removeNodeAtDepth;
import o.setBlock;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final invalidateShadow Saver;
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m3329getCompositionMzsxiRA() {
        return this.composition;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m3330getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Saver$lambda$0(setBlock setblock, TextFieldValue textFieldValue) {
        return SQLite.write(SaversKt.save(textFieldValue.annotatedString, SaversKt.getAnnotatedStringSaver(), setblock), SaversKt.save(TextRange.m3064boximpl(textFieldValue.selection), SaversKt.getSaver(TextRange.Companion), setblock));
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int iHashCode = this.annotatedString.hashCode();
        int iM3077hashCodeimpl = TextRange.m3077hashCodeimpl(this.selection);
        TextRange textRange = this.composition;
        return ((iM3077hashCodeimpl + (iHashCode * 31)) * 31) + (textRange != null ? TextRange.m3077hashCodeimpl(textRange.m3080unboximpl()) : 0);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final invalidateShadow getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    static {
        int i = 5;
        Saver = new CardView$1(new SaversKt$$ExternalSyntheticLambda7(2), i, new accessgetIntersectcp(i));
    }

    private TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m3082coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m3064boximpl(TextRangeKt.m3082coerceIn8ffj60Q(textRange.m3080unboximpl(), 0, getText().length())) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Saver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        invalidateShadow annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
        Boolean bool = Boolean.FALSE;
        TextRange textRange = null;
        AnnotatedString annotatedString = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? (AnnotatedString) annotatedStringSaver.restore(obj2) : null;
        annotatedString.getClass();
        Object obj3 = list.get(1);
        invalidateShadow saver = SaversKt.getSaver(TextRange.Companion);
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textRange = (TextRange) saver.restore(obj3);
        }
        textRange.getClass();
        return new TextFieldValue(annotatedString, textRange.m3080unboximpl(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m3325copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m3327copy3r_uNRQ(annotatedString, j, textRange);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (TextRange.m3069equalsimpl0(this.selection, textFieldValue.selection)) {
            Object[] objArr = {this.composition, textFieldValue.composition};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.annotatedString, textFieldValue.annotatedString};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m3079toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m3328copy3r_uNRQ(String str, long j, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m3327copy3r_uNRQ(AnnotatedString annotatedString, long j, TextRange textRange) {
        return new TextFieldValue(annotatedString, j, textRange, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m3326copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m3328copy3r_uNRQ(str, j, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? TextRange.Companion.m3081getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Companion.m3081getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (DefaultConstructorMarker) null);
    }
}
