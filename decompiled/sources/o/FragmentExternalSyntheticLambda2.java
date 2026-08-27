package o;

import com.roadrunner.home.expandedbubblelayer.presentation.compose.DefaultExtraLargeBubbleContentKt;
import com.roadrunner.home.expandedbubblelayer.presentation.compose.DefaultLargeBubbleContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class FragmentExternalSyntheticLambda2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ setAllowReturnTransitionOverlap read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ FragmentExternalSyntheticLambda2(setAllowReturnTransitionOverlap setallowreturntransitionoverlap, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.read = setallowreturntransitionoverlap;
        this.write = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.write;
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            DefaultExtraLargeBubbleContentKt.DefaultExtraLargeBubbleContent(setallowreturntransitionoverlap, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        DefaultLargeBubbleContentKt.DefaultLargeBubbleContent(setallowreturntransitionoverlap, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaDescriptionCompat + 101;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
