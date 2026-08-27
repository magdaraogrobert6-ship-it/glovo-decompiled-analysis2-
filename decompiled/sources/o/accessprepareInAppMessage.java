package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessprepareInAppMessage extends truncslo4al4 {
    public final resetTransientState serializer;
    public int write;

    @Override // o.truncslo4al4
    public final void RemoteActionCompatParcelizer() {
        this.read = false;
        CSSParseException cSSParseException = (CSSParseException) this.IconCompatParcelizer;
        cSSParseException.read("\n");
        int i = this.write;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.serializer.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper;
            str.getClass();
            cSSParseException.read(str);
        }
    }

    @Override // o.truncslo4al4
    public final void serializer() {
        this.read = true;
        this.write++;
    }

    @Override // o.truncslo4al4
    public final void read() {
        IconCompatParcelizer(' ');
    }

    public accessprepareInAppMessage(CSSParseException cSSParseException, resetTransientState resettransientstate) {
        super(cSSParseException);
        this.serializer = resettransientstate;
    }

    @Override // o.truncslo4al4
    public final void IconCompatParcelizer() {
        this.write--;
    }

    @Override // o.truncslo4al4
    public final void write() {
        if (this.read) {
            this.read = false;
        } else {
            RemoteActionCompatParcelizer();
        }
    }
}
