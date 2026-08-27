package o;

import androidx.sqlite.db.SupportSQLiteOpenHelper$Callback;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasHolder extends SupportSQLiteOpenHelper$Callback {
    public final /* synthetic */ clipPathmtrdDEdefault RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanvasHolder(clipPathmtrdDEdefault clippathmtrddedefault, int i) {
        super(i);
        this.RemoteActionCompatParcelizer = clippathmtrddedefault;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onCreate(UncheckedColor uncheckedColor) {
        this.RemoteActionCompatParcelizer.read(new C0172getimpl(uncheckedColor));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onUpgrade(UncheckedColor uncheckedColor, int i, int i2) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(new C0172getimpl(uncheckedColor), i, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onDowngrade(UncheckedColor uncheckedColor, int i, int i2) {
        uncheckedColor.getClass();
        onUpgrade(uncheckedColor, i, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onOpen(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        C0172getimpl c0172getimpl = new C0172getimpl(uncheckedColor);
        clipPathmtrdDEdefault clippathmtrddedefault = this.RemoteActionCompatParcelizer;
        clippathmtrddedefault.write(c0172getimpl);
        clippathmtrddedefault.RatingCompat = uncheckedColor;
    }
}
