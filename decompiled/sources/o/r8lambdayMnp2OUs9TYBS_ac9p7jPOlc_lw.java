package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdayMnp2OUs9TYBS_ac9p7jPOlc_lw extends androidx.sqlite.SQLite {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final Object serializer;
    public final /* synthetic */ prepareInAppMessagelambda0 write;

    public r8lambdayMnp2OUs9TYBS_ac9p7jPOlc_lw(prepareInAppMessagelambda0 prepareinappmessagelambda0, String str) {
        this.write = prepareinappmessagelambda0;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = prepareinappmessagelambda0.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public void IconCompatParcelizer(String str) {
        if (this.IconCompatParcelizer != 1) {
            super.IconCompatParcelizer(str);
            return;
        }
        str.getClass();
        this.write.write(this.RemoteActionCompatParcelizer, new r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U(str, false, (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) this.serializer));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.IconCompatParcelizer != 0 ? this.write.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer : (prepareInAppMessageWithZippedAssetHtml) this.serializer;
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public void RemoteActionCompatParcelizer(byte b) {
        if (this.IconCompatParcelizer != 0) {
            super.RemoteActionCompatParcelizer(b);
        } else {
            read(String.valueOf(b & 255));
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public void read(int i) {
        if (this.IconCompatParcelizer != 0) {
            super.read(i);
        } else {
            read(Integer.toUnsignedString(i));
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public void read(short s) {
        if (this.IconCompatParcelizer != 0) {
            super.read(s);
        } else {
            read(String.valueOf(s & 65535));
        }
    }

    @Override // androidx.sqlite.SQLite, o.DefaultInAppMessageViewWrapperFactory
    public void serializer(long j) {
        if (this.IconCompatParcelizer != 0) {
            super.serializer(j);
        } else {
            read(Long.toUnsignedString(j));
        }
    }

    public void read(String str) {
        str.getClass();
        this.write.write(this.RemoteActionCompatParcelizer, new r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U(str, false, null));
    }

    public r8lambdayMnp2OUs9TYBS_ac9p7jPOlc_lw(prepareInAppMessagelambda0 prepareinappmessagelambda0, String str, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        this.write = prepareinappmessagelambda0;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }
}
