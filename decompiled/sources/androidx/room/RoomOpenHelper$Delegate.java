package androidx.room;

import o.UncheckedColor;
import o.onItemDismisslambda0;
import o.rotateRaddefault;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RoomOpenHelper$Delegate {
    public final int serializer;

    public abstract void createAllTables(UncheckedColor uncheckedColor);

    public abstract void dropAllTables(UncheckedColor uncheckedColor);

    public abstract void onCreate(UncheckedColor uncheckedColor);

    public abstract void onOpen(UncheckedColor uncheckedColor);

    public abstract void onPostMigrate(UncheckedColor uncheckedColor);

    public abstract void onPreMigrate(UncheckedColor uncheckedColor);

    public abstract rotateRaddefault onValidateSchema(UncheckedColor uncheckedColor);

    public RoomOpenHelper$Delegate(int i) {
        this.serializer = i;
    }

    @onItemDismisslambda0
    public void validateMigration(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
