package o;

/* JADX INFO: loaded from: classes4.dex */
public final class displayPreparedInAppMessage extends truncslo4al4 {
    public final boolean write;

    public displayPreparedInAppMessage(CSSParseException cSSParseException, boolean z) {
        super(cSSParseException);
        this.write = z;
    }

    @Override // o.truncslo4al4
    public final void write(String str) {
        str.getClass();
        if (this.write) {
            super.write(str);
        } else {
            ((CSSParseException) this.IconCompatParcelizer).read(str);
        }
    }
}
