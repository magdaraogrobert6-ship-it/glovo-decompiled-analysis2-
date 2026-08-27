package o;

import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public final class FoodoraPermissionDeniedException {
    public r8lambdadeOzq815xUUwmlLYYvm_QV79QY MediaBrowserCompatMediaItem;
    public isContentCardsUnreadVisualIndicatorEnabled MediaMetadataCompat;
    public BitSet RemoteActionCompatParcelizer;
    public long serializer;
    public long[] write;
    public long[] MediaDescriptionCompat = new long[0];
    public SharedPreferencesManagerImpl[] read = SharedPreferencesManagerImpl.read;
    public PushDataType[] IconCompatParcelizer = PushDataType.serializer;

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("Archive with packed streams starting at offset ");
        sb.append(this.serializer);
        sb.append(", ");
        sb.append(Integer.toString(this.MediaDescriptionCompat.length));
        sb.append(" pack sizes, ");
        long[] jArr = this.write;
        String string2 = "(null)";
        if (jArr == null) {
            string = "(null)";
        } else {
            string = Integer.toString(jArr.length);
        }
        sb.append(string);
        sb.append(" CRCs, ");
        sb.append(Integer.toString(this.read.length));
        sb.append(" folders, ");
        PushDataType[] pushDataTypeArr = this.IconCompatParcelizer;
        if (pushDataTypeArr != null) {
            string2 = Integer.toString(pushDataTypeArr.length);
        }
        sb.append(string2);
        sb.append(" files and ");
        sb.append(this.MediaMetadataCompat);
        return sb.toString();
    }
}
