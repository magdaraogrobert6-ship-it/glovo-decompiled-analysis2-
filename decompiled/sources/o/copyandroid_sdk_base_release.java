package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class copyandroid_sdk_base_release extends getLatitudeannotations<requestGeofenceRefresh> {
    private final getCooldownEnterSeconds write;

    public abstract void IconCompatParcelizer(getLongitudeannotations<requestGeofenceRefresh> getlongitudeannotations);

    public abstract void write(getLongitudeannotations<requestGeofenceRefresh> getlongitudeannotations);

    public copyandroid_sdk_base_release(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, String str, getCooldownEnterSeconds getcooldownenterseconds) {
        super(clearandroid_sdk_base_releaseVar, str);
        this.write = getcooldownenterseconds;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<requestGeofenceRefresh> getlongitudeannotations) {
        write(getlongitudeannotations);
        if (this.write.serializer((Long) null)) {
            IconCompatParcelizer(getlongitudeannotations);
        }
    }
}
