package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class generateEotflambda1 implements Appendable {
    public boolean serializer = true;
    public final Appendable write;

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.serializer;
        Appendable appendable = this.write;
        boolean z2 = false;
        if (z) {
            this.serializer = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.serializer = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }

    public generateEotflambda1(Appendable appendable) {
        this.write = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.serializer;
        Appendable appendable = this.write;
        if (z) {
            this.serializer = false;
            appendable.append("  ");
        }
        this.serializer = c == '\n';
        appendable.append(c);
        return this;
    }
}
