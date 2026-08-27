package o;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManagercopy1 {
    public final boolean IconCompatParcelizer;
    public final long read;
    public final long serializer;

    public final TextFieldSelectionManagercopy1 write(TextFieldSelectionManagercopy1 textFieldSelectionManagercopy1) {
        return new TextFieldSelectionManagercopy1(androidx.compose.ui.geometry.Offset.m482plusMKHz9U(this.read, textFieldSelectionManagercopy1.read), Math.max(this.serializer, textFieldSelectionManagercopy1.serializer), this.IconCompatParcelizer || textFieldSelectionManagercopy1.IconCompatParcelizer);
    }

    public TextFieldSelectionManagercopy1(long j, long j2, boolean z) {
        this.read = j;
        this.serializer = j2;
        this.IconCompatParcelizer = z;
    }
}
