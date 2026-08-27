package o;

import android.database.Cursor;
import androidx.room.RoomOpenHelper$Delegate;
import androidx.sqlite.db.SupportSQLiteOpenHelper$Callback;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class withSaveLayer extends SupportSQLiteOpenHelper$Callback {
    public final RoomOpenHelper$Delegate IconCompatParcelizer;
    public final List serializer;
    public lerpNullableFloatList write;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onCreate(UncheckedColor uncheckedColor) throws IOException {
        isUnspecified8_81llA isunspecified8_81lla = (isUnspecified8_81llA) uncheckedColor;
        Cursor cursorSerializer = isunspecified8_81lla.serializer(new colorResource("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (cursorSerializer.moveToFirst() && cursorSerializer.getInt(0) == 0) {
                z = true;
            }
            cursorSerializer.close();
            RoomOpenHelper$Delegate roomOpenHelper$Delegate = this.IconCompatParcelizer;
            roomOpenHelper$Delegate.createAllTables(uncheckedColor);
            if (!z) {
                rotateRaddefault rotateraddefaultOnValidateSchema = roomOpenHelper$Delegate.onValidateSchema(uncheckedColor);
                if (!rotateraddefaultOnValidateSchema.RemoteActionCompatParcelizer) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(rotateraddefaultOnValidateSchema.read, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            isunspecified8_81lla.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            isunspecified8_81lla.RemoteActionCompatParcelizer(drawInto.RemoteActionCompatParcelizer("94743e275c3fcfce8bc483b591df18c0"));
            roomOpenHelper$Delegate.onCreate(uncheckedColor);
            List list = this.serializer;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((skewRad) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i = sourceInformationContextOfdefault.read();
                int i2 = sourceInformationContextOfdefault.read();
                int i3 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorSerializer, th}, i3);
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onUpgrade(UncheckedColor uncheckedColor, int i, int i2) throws IOException {
        lerpNullableFloatList lerpnullablefloatlist = this.write;
        RoomOpenHelper$Delegate roomOpenHelper$Delegate = this.IconCompatParcelizer;
        if (lerpnullablefloatlist != null) {
            accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = lerpnullablefloatlist.PlaybackStateCompat;
            accessgetcompositingstrategynrfusijd.getClass();
            List listSerializer = LoadBalancer$Helper.serializer(accessgetcompositingstrategynrfusijd, i, i2);
            if (listSerializer != null) {
                roomOpenHelper$Delegate.onPreMigrate(uncheckedColor);
                Iterator it = listSerializer.iterator();
                while (it.hasNext()) {
                    ((getBlack0d7_KjUannotations) it.next()).RemoteActionCompatParcelizer(new C0172getimpl(uncheckedColor));
                }
                rotateRaddefault rotateraddefaultOnValidateSchema = roomOpenHelper$Delegate.onValidateSchema(uncheckedColor);
                if (!rotateraddefaultOnValidateSchema.RemoteActionCompatParcelizer) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(rotateraddefaultOnValidateSchema.read, "Migration didn't properly handle: ");
                    return;
                }
                roomOpenHelper$Delegate.onPostMigrate(uncheckedColor);
                uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                uncheckedColor.RemoteActionCompatParcelizer(drawInto.RemoteActionCompatParcelizer("94743e275c3fcfce8bc483b591df18c0"));
                return;
            }
        }
        lerpNullableFloatList lerpnullablefloatlist2 = this.write;
        if (lerpnullablefloatlist2 == null || LoadBalancer$Helper.write(lerpnullablefloatlist2, i, i2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (lerpnullablefloatlist2.read) {
            Cursor cursorSerializer = uncheckedColor.serializer("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                int iSerializer = getQueryParameterslambda2.serializer();
                BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
                while (cursorSerializer.moveToNext()) {
                    String string = cursorSerializer.getString(0);
                    string.getClass();
                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        baseContentCardViewExternalSyntheticLambda0.add(new onViewAttachedToWindowlambda0(string, Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cursorSerializer.getString(1), "view"}, getCieXyz.write())).booleanValue())));
                    }
                }
                BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0Serializer = androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                cursorSerializer.close();
                ListIterator listIterator = baseContentCardViewExternalSyntheticLambda0Serializer.listIterator(0);
                while (true) {
                    setOptionalCardImage setoptionalcardimage = (setOptionalCardImage) listIterator;
                    if (!setoptionalcardimage.hasNext()) {
                        break;
                    }
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) setoptionalcardimage.next();
                    String str = (String) onviewattachedtowindowlambda0.serializer;
                    if (((Boolean) onviewattachedtowindowlambda0.write).booleanValue()) {
                        uncheckedColor.RemoteActionCompatParcelizer("DROP VIEW IF EXISTS " + str);
                    } else {
                        uncheckedColor.RemoteActionCompatParcelizer("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorSerializer, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } else {
            roomOpenHelper$Delegate.dropAllTables(uncheckedColor);
        }
        List list = this.serializer;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((skewRad) it2.next()).getClass();
            }
        }
        roomOpenHelper$Delegate.createAllTables(uncheckedColor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public withSaveLayer(lerpNullableFloatList lerpnullablefloatlist, RoomOpenHelper$Delegate roomOpenHelper$Delegate) {
        super(roomOpenHelper$Delegate.serializer);
        lerpnullablefloatlist.getClass();
        this.serializer = lerpnullablefloatlist.RemoteActionCompatParcelizer;
        this.write = lerpnullablefloatlist;
        this.IconCompatParcelizer = roomOpenHelper$Delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onConfigure(UncheckedColor uncheckedColor) {
        uncheckedColor.getClass();
        super.onConfigure(uncheckedColor);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onDowngrade(UncheckedColor uncheckedColor, int i, int i2) throws IOException {
        uncheckedColor.getClass();
        onUpgrade(uncheckedColor, i, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public final void onOpen(UncheckedColor uncheckedColor) throws IOException {
        uncheckedColor.getClass();
        super.onOpen(uncheckedColor);
        Cursor cursorSerializer = uncheckedColor.serializer("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorSerializer.moveToFirst() && cursorSerializer.getInt(0) != 0;
            cursorSerializer.close();
            RoomOpenHelper$Delegate roomOpenHelper$Delegate = this.IconCompatParcelizer;
            if (z) {
                Cursor cursorSerializer2 = uncheckedColor.serializer(new colorResource("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 12, (Object) null));
                try {
                    String string = cursorSerializer2.moveToFirst() ? cursorSerializer2.getString(0) : null;
                    cursorSerializer2.close();
                    if (!"94743e275c3fcfce8bc483b591df18c0".equals(string) && !"7e7b6b9433a233b86855e980acbe0689".equals(string)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 94743e275c3fcfce8bc483b591df18c0, found: ", string));
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorSerializer2, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } else {
                rotateRaddefault rotateraddefaultOnValidateSchema = roomOpenHelper$Delegate.onValidateSchema(uncheckedColor);
                if (!rotateraddefaultOnValidateSchema.RemoteActionCompatParcelizer) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(rotateraddefaultOnValidateSchema.read, "Pre-packaged database has an invalid schema: ");
                    return;
                } else {
                    roomOpenHelper$Delegate.onPostMigrate(uncheckedColor);
                    uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    uncheckedColor.RemoteActionCompatParcelizer(drawInto.RemoteActionCompatParcelizer("94743e275c3fcfce8bc483b591df18c0"));
                }
            }
            roomOpenHelper$Delegate.onOpen(uncheckedColor);
            List list = this.serializer;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((skewRad) it.next()).read(uncheckedColor);
                }
            }
            this.write = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorSerializer, th3}, sourceInformationContextOfdefault.read());
                throw th4;
            }
        }
    }
}
