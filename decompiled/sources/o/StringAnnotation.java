package o;

import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class StringAnnotation implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ StringAnnotation(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, boolean z2, int i) {
        this.serializer = z;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = modifier;
        this.write = z2;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ StringAnnotation(boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = z;
        this.write = z2;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = modifier;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaDescriptionCompat;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            lerpDiscrete.write(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), (getBirthDateFull) obj, this.IconCompatParcelizer, this.read, this.serializer, this.write);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        AutoAcceptPreferencesToggleKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), (getBirthDateFull) obj, this.IconCompatParcelizer, this.read, this.serializer, this.write);
        int i6 = RatingCompat + 97;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
        }
        return createfromparcel;
    }
}
