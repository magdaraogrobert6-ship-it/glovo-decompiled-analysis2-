package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdamu9PbpArBtWlKmW4p9QSsBEPQ_w {
    public final getMd5Hash IconCompatParcelizer;
    public final getMethodQuietlylambda1 MediaMetadataCompat;
    public final setWebViewClientStateListener RatingCompat;
    public final shouldSkip RemoteActionCompatParcelizer;
    public final int read;
    public final setMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release serializer;
    public final handleUrlOverride write;

    public r8lambdamu9PbpArBtWlKmW4p9QSsBEPQ_w(Integer num, handleUrlOverride handleurloverride, getMethodQuietlylambda1 getmethodquietlylambda1, setWebViewClientStateListener setwebviewclientstatelistener, setMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release setmaxunpackedzipentrysizebytesandroid_sdk_base_release, getMd5Hash getmd5hash, shouldSkip shouldskip) {
        this.read = num.intValue();
        TextStreamsKt.serializer(handleurloverride, "proxyDetector not set");
        this.write = handleurloverride;
        this.MediaMetadataCompat = getmethodquietlylambda1;
        this.RatingCompat = setwebviewclientstatelistener;
        this.serializer = setmaxunpackedzipentrysizebytesandroid_sdk_base_release;
        this.IconCompatParcelizer = getmd5hash;
        this.RemoteActionCompatParcelizer = shouldskip;
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer("defaultPort", String.valueOf(this.read));
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "proxyDetector");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaMetadataCompat, "syncContext");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RatingCompat, "serviceConfigParser");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "scheduledExecutorService");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "channelLogger");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "executor");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) null, "overrideAuthority");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
