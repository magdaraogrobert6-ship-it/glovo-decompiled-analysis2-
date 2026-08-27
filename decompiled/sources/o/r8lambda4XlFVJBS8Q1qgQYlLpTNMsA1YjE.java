package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda4XlFVJBS8Q1qgQYlLpTNMsA1YjE extends ParcelFileDescriptorRewinderInternalRewinder {
    public final /* synthetic */ r8lambdamrRUyRDhX_6xLfo9jIAfF753450 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaMkSjJB1nMG37oUW_yupQha4 read;
    public boolean serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda4XlFVJBS8Q1qgQYlLpTNMsA1YjE(ItemSingleChoiceBinding itemSingleChoiceBinding, r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4, r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450) {
        super(itemSingleChoiceBinding);
        this.read = r8lambdamksjjb1nmg37ouw_yupqha4;
        this.RemoteActionCompatParcelizer = r8lambdamrruyrdhx_6xlfo9jiaff753450;
    }

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.serializer) {
            return;
        }
        this.serializer = true;
        r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = this.read;
        r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = this.RemoteActionCompatParcelizer;
        synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
            int i = r8lambdamrruyrdhx_6xlfo9jiaff753450.RatingCompat - 1;
            r8lambdamrruyrdhx_6xlfo9jiaff753450.RatingCompat = i;
            if (i == 0 && r8lambdamrruyrdhx_6xlfo9jiaff753450.MediaMetadataCompat) {
                r8lambdamksjjb1nmg37ouw_yupqha4.IconCompatParcelizer(r8lambdamrruyrdhx_6xlfo9jiaff753450);
            }
        }
    }
}
