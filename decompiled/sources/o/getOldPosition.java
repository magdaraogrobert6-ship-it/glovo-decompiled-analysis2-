package o;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class getOldPosition implements clearReturnedFromScrapFlag {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final getLayoutPosition RemoteActionCompatParcelizer;
    public final Application serializer;
    public final getAdapterPosition write;

    public getOldPosition(getAdapterPosition getadapterposition, getLayoutPosition getlayoutposition, Application application) {
        this.write = getadapterposition;
        this.RemoteActionCompatParcelizer = getlayoutposition;
        this.serializer = application;
    }

    @Override // o.clearReturnedFromScrapFlag
    public final flagRemovedAndOffsetPosition serializer(String str) {
        String string;
        int i = 2 % 2;
        str.getClass();
        flagRemovedAndOffsetPosition flagremovedandoffsetpositionSerializer = this.RemoteActionCompatParcelizer.serializer(str);
        flagRemovedAndOffsetPosition flagremovedandoffsetpositionSerializer2 = this.write.serializer(str);
        boolean z = flagremovedandoffsetpositionSerializer.IconCompatParcelizer;
        boolean z2 = flagremovedandoffsetpositionSerializer2.IconCompatParcelizer;
        if ((!z) && (!z2)) {
            int i2 = read + 89;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            string = this.serializer.getResources().getString(com.logistics.rider.glovo.R.string.login_invalid_email_or_phone_message);
            int i4 = IconCompatParcelizer + 119;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            string = "";
        }
        string.getClass();
        flagRemovedAndOffsetPosition flagremovedandoffsetposition = new flagRemovedAndOffsetPosition(z2 | z, string);
        int i6 = IconCompatParcelizer + 13;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return flagremovedandoffsetposition;
    }
}
