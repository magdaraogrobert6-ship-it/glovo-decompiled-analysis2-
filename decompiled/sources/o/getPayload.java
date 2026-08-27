package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPayload {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final decode IconCompatParcelizer;

    public getPayload(decode decodeVar) {
        this.IconCompatParcelizer = decodeVar;
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = write + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ff$$ExternalSyntheticOutline0.m("start_session_type", "on_demand", this.IconCompatParcelizer, "start_session_clicked");
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    public final void RemoteActionCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        str.getClass();
        this.IconCompatParcelizer.logEvent("go_online_clicked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("zone_id", str), new onViewAttachedToWindowlambda0("inside_zone", str2)));
        int i2 = write + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
