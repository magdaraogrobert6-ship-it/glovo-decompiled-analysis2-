package o;

import android.database.Cursor;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw extends r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE<setMessageFields> {

    public static class IconCompatParcelizer extends r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE.read<IconCompatParcelizer> {
    }

    @Override // o.r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE
    public final setMessageFields IconCompatParcelizer(Cursor cursor) throws IllegalStateException {
        InAppMessageFull.read().getClass();
        InAppMessageFull.write(cursor, com.braze.Constants.BRAZE_PUSH_TITLE_KEY);
        r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem().getClass();
        return new setMessageFields(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.serializer(cursor, "m"));
    }

    @Override // o.r8lambdaHFVSzUIXAKgG6BN1KCVPFpgANE
    public final Class<setMessageFields> read() {
        return setMessageFields.class;
    }
}
