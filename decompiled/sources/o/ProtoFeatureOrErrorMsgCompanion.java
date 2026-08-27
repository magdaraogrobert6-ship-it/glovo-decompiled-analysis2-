package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class ProtoFeatureOrErrorMsgCompanion implements FwFClientKt {
    public final /* synthetic */ int RatingCompat;
    public static final ProtoFeatureOrErrorMsgCompanion serializer = new ProtoFeatureOrErrorMsgCompanion(1);
    public static final ProtoFeatureOrErrorMsgCompanion read = new ProtoFeatureOrErrorMsgCompanion(0);
    public static final ProtoFeatureOrErrorMsgCompanion RemoteActionCompatParcelizer = new ProtoFeatureOrErrorMsgCompanion(2);
    public static final ProtoFeatureOrErrorMsgCompanion write = new ProtoFeatureOrErrorMsgCompanion(3);
    public static final ProtoFeatureOrErrorMsgCompanion IconCompatParcelizer = new ProtoFeatureOrErrorMsgCompanion(4);
    public static final ProtoFeatureOrErrorMsgCompanion MediaMetadataCompat = new ProtoFeatureOrErrorMsgCompanion(5);
    public static final ProtoFeatureOrErrorMsgCompanion MediaBrowserCompatMediaItem = new ProtoFeatureOrErrorMsgCompanion(6);
    public static final ProtoFeatureOrErrorMsgCompanion MediaDescriptionCompat = new ProtoFeatureOrErrorMsgCompanion(7);
    public static final ProtoFeatureOrErrorMsgCompanion MediaSessionCompatQueueItem = new ProtoFeatureOrErrorMsgCompanion(8);

    public /* synthetic */ ProtoFeatureOrErrorMsgCompanion(int i) {
        this.RatingCompat = i;
    }

    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) throws IOException {
        switch (this.RatingCompat) {
            case 0:
                return Byte.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            case 1:
                return Boolean.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            case 2:
                String strMediaMetadataCompat = ((_get_messageWebView_lambda3) obj).MediaMetadataCompat();
                if (strMediaMetadataCompat.length() == 1) {
                    return Character.valueOf(strMediaMetadataCompat.charAt(0));
                }
                DrawableTransformation.RemoteActionCompatParcelizer(strMediaMetadataCompat.length(), "Expected body of length 1 for Character conversion but was ");
                return null;
            case 3:
                return Double.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            case 4:
                return Float.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            case 5:
                return Integer.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            case 6:
                return Long.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            case 7:
                return Short.valueOf(((_get_messageWebView_lambda3) obj).MediaMetadataCompat());
            default:
                return ((_get_messageWebView_lambda3) obj).MediaMetadataCompat();
        }
    }
}
