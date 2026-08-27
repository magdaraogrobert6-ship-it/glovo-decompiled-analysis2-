package o;

import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardComponentsKt;
import com.roadrunner.face.verification.presentation.identitypopup.compose.IdentityPopupContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setOnHierarchyChangeListener implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ setOnHierarchyChangeListener(String str, String str2, String str3, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.serializer = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaMetadataCompat;
        if (i3 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            ActionableMessageCardComponentsKt.Message(this.read, this.write, this.IconCompatParcelizer, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        IdentityPopupContentKt.serializer(this.read, this.write, this.IconCompatParcelizer, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i5 = MediaDescriptionCompat + 47;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
