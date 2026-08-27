package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBlack0d7_KjUannotations {
    public final int RemoteActionCompatParcelizer;
    public final int serializer;

    public getBlack0d7_KjUannotations(int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }

    public void RemoteActionCompatParcelizer(tintxETnrds tintxetnrds) {
        tintxetnrds.getClass();
        if (!(tintxetnrds instanceof C0172getimpl)) {
            throw new getCardAtIndex("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        write(((C0172getimpl) tintxetnrds).read);
    }

    public void write(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        throw new getCardAtIndex("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
