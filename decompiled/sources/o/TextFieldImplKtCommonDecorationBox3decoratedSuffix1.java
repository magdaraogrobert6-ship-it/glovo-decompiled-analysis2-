package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldImplKtCommonDecorationBox3decoratedSuffix1 {
    public final int read;
    public final int serializer;

    public final int hashCode() {
        return Integer.hashCode(this.read) + (Integer.hashCode(this.serializer) * 31);
    }

    public TextFieldImplKtCommonDecorationBox3decoratedSuffix1(int i, int i2) {
        this.serializer = i;
        this.read = i2;
        if (i < 0) {
            TriStateCheckbox.read("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        TriStateCheckbox.read("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldImplKtCommonDecorationBox3decoratedSuffix1)) {
            return false;
        }
        TextFieldImplKtCommonDecorationBox3decoratedSuffix1 textFieldImplKtCommonDecorationBox3decoratedSuffix1 = (TextFieldImplKtCommonDecorationBox3decoratedSuffix1) obj;
        return this.serializer == textFieldImplKtCommonDecorationBox3decoratedSuffix1.serializer && this.read == textFieldImplKtCommonDecorationBox3decoratedSuffix1.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.serializer);
        sb.append(", end=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
