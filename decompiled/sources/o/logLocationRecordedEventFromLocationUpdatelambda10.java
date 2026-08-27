package o;

import com.roadrunner.startworking.oneclick.bullet.PolicyItemWithHyperLinkKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class logLocationRecordedEventFromLocationUpdatelambda10 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ logPushNotificationActionClickedlambda12 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ logLocationRecordedEventFromLocationUpdatelambda10(logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = logpushnotificationactionclickedlambda12;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12 = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            PolicyItemWithHyperLinkKt.PolicyItemWithHyperLink(logpushnotificationactionclickedlambda12, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        PolicyItemWithHyperLinkKt.TextWithHyperLink(logpushnotificationactionclickedlambda12, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaMetadataCompat + 125;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return createfromparcel;
    }
}
