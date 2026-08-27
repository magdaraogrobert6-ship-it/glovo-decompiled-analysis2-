package o;

import android.net.Uri;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BackspaceCommand implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static int MediaBrowserCompatMediaItem = 0;
    public static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ setNavigationOnClickListener RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Uri write;

    public /* synthetic */ BackspaceCommand(Uri uri, setNavigationOnClickListener setnavigationonclicklistener, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = uri;
        this.RemoteActionCompatParcelizer = setnavigationonclicklistener;
        this.read = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 101;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.read;
        setNavigationOnClickListener setnavigationonclicklistener = this.RemoteActionCompatParcelizer;
        Uri uri = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            InAppCameraWithTagsKt.read(uri, setnavigationonclicklistener, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt.write(uri, setnavigationonclicklistener, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaSessionCompatQueueItem + 33;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }

    public static int write() {
        int i = MediaDescriptionCompat;
        int i2 = i % 6973025;
        MediaDescriptionCompat = i + 1;
        if (i2 != 0) {
            return MediaBrowserCompatMediaItem;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        MediaBrowserCompatMediaItem = iMaxMemory;
        return iMaxMemory;
    }
}
