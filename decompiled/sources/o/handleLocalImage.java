package o;

/* JADX INFO: loaded from: classes4.dex */
public final class handleLocalImage extends truncslo4al4 {
    public final boolean RemoteActionCompatParcelizer;

    public handleLocalImage(CSSParseException cSSParseException, boolean z) {
        super(cSSParseException);
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // o.truncslo4al4
    public final void serializer(short s) {
        if (this.RemoteActionCompatParcelizer) {
            write(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((CSSParseException) this.IconCompatParcelizer).read(strValueOf);
    }

    @Override // o.truncslo4al4
    public final void serializer(long j) {
        boolean z = this.RemoteActionCompatParcelizer;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            write(unsignedString);
        } else {
            unsignedString.getClass();
            ((CSSParseException) this.IconCompatParcelizer).read(unsignedString);
        }
    }

    @Override // o.truncslo4al4
    public final void read(byte b) {
        if (this.RemoteActionCompatParcelizer) {
            write(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((CSSParseException) this.IconCompatParcelizer).read(strValueOf);
    }

    @Override // o.truncslo4al4
    public final void write(int i) {
        boolean z = this.RemoteActionCompatParcelizer;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            write(unsignedString);
        } else {
            unsignedString.getClass();
            ((CSSParseException) this.IconCompatParcelizer).read(unsignedString);
        }
    }
}
