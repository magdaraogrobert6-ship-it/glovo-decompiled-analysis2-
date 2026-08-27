package o;

import com.roadrunner.rider.state.ondemand.outsideactivearea.OnDemandOutsideActiveAreaKt;
import com.roadrunner.rider.state.onpause.api.presentation.OnPauseUiModel;
import com.roadrunner.rider.state.onpause.presentation.OnPauseScreenKt;
import com.roadrunner.rider.state.quests.api.list.QuestListUiModel;
import com.roadrunner.rider.state.quests.presentation.banner.BannerKt;
import com.roadrunner.rider.state.quests.presentation.list.QuestListKt;
import com.roadrunner.rider.state.refresh.presentation.RefreshStateContentKt;
import com.roadrunner.rider.state.shiftextension.presentation.ShiftExtensionKt;
import com.roadrunner.rider.state.suspension.api.SuspensionUiModel;
import com.roadrunner.rider.state.suspension.presentation.SuspensionScreenKt;
import com.roadrunner.rrds.compose.component.screenstate.EmptyScreenKt;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;
import com.roadrunner.settings.subscreens.appearance.AppearanceViewModel;
import com.roadrunner.settings.ui.components.NavigationSettingsDialogKt;
import com.roadrunner.settings.ui.screens.AppearanceScreenKt;
import com.roadrunner.settings.ui.screens.ChatLanguageSelectorScreenKt;
import com.roadrunner.sidemenu.greeting.GreetingContentKt;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewContentKt;
import com.roadrunner.startworking.oneclick.bullet.PolicyItemWithHyperLinkKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdarMv397hzZJazOE3eMmLe0m6ePY0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(int i, int i2, Object obj, Object obj2) {
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
        this.serializer = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030 A[PHI: r2 r3 r4 r5
  0x0030: PHI (r2v18 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v17 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r4v33 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r5v33 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[PHI: r2 r3 r4 r5
  0x0045: PHI (r2v17 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r3v16 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r4v31 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r5v31 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x005a A[PHI: r2 r3 r4 r5
  0x005a: PHI (r2v16 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r3v15 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r4v29 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r5v29 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x006f A[PHI: r2 r3 r4 r5
  0x006f: PHI (r2v15 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r3v14 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r4v27 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r5v27 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[PHI: r2 r3 r4 r5
  0x0084: PHI (r2v14 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r3v13 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r4v25 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r5v25 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0099 A[PHI: r2 r3 r4 r5
  0x0099: PHI (r2v13 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r3v12 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r4v23 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0099: PHI (r5v23 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ae A[PHI: r2 r3 r4 r5
  0x00ae: PHI (r2v12 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r3v11 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r4v21 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r5v21 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3 A[PHI: r2 r3 r4 r5
  0x00c3: PHI (r2v11 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r3v10 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r4v19 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r5v19 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8 A[PHI: r2 r3 r4 r5
  0x00d8: PHI (r2v10 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r3v9 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r4v17 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r5v17 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ed A[PHI: r2 r3 r4 r5
  0x00ed: PHI (r2v9 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r3v8 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r4v15 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r5v15 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0102 A[PHI: r2 r3 r4 r5
  0x0102: PHI (r2v8 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0102: PHI (r3v7 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0102: PHI (r4v13 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0102: PHI (r5v13 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0117 A[PHI: r2 r3 r4 r5
  0x0117: PHI (r2v7 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r3v6 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r4v11 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r5v11 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x012c A[PHI: r2 r3 r4 r5
  0x012c: PHI (r2v6 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r3v5 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r4v9 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r5v9 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x014c  */
    /* JADX WARN: Code duplicated, block: B:39:0x014e A[PHI: r2 r3 r4 r5
  0x014e: PHI (r2v5 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r3v4 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r4v7 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r5v7 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0163 A[PHI: r2 r3 r4 r5
  0x0163: PHI (r2v4 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r3v3 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r4v5 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r5v5 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0178 A[PHI: r2 r3 r4 r5
  0x0178: PHI (r2v3 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r3v2 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r4v3 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r5v3 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x018d A[PHI: r2 r3 r4 r5
  0x018d: PHI (r2v2 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v19 o.createFromParcel) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r3v1 int) = (r3v0 int), (r3v18 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v35 java.lang.Object) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        createFromParcel createfromparcel;
        int i;
        Object obj3;
        Object obj4;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 45;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = this.RemoteActionCompatParcelizer;
            createfromparcel = createFromParcel.INSTANCE;
            i = this.serializer;
            obj3 = this.read;
            obj4 = this.IconCompatParcelizer;
            switch (i5) {
                case 0:
                    ((Integer) obj2).getClass();
                    GreetingContentKt.serializer((r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 1:
                    ((Integer) obj2).getClass();
                    OnDemandOutsideActiveAreaKt.OnDemandOutsideActiveAreaContent((setOnThirdPartySharingSettingsReadListener) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 2:
                    ((Integer) obj2).getClass();
                    OnPauseScreenKt.OnPauseScreen((OnPauseUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 3:
                    ((Integer) obj2).getClass();
                    BannerKt.Banner((buildInstallReferrerSdkClickPackage) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    i2 = MediaSessionCompatQueueItem + 53;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                case 4:
                    ((Integer) obj2).getClass();
                    QuestListKt.QuestList((QuestListUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 5:
                    ((Integer) obj2).getClass();
                    RefreshStateContentKt.RefreshStateContent((generateSendingParametersI) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 6:
                    ((Integer) obj2).getClass();
                    ShiftExtensionKt.ShiftExtension((invokeMethod) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 7:
                    ((Integer) obj2).getClass();
                    SuspensionScreenKt.SuspensionScreen((SuspensionUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 8:
                    ((Integer) obj2).getClass();
                    EmptyScreenKt.EmptyScreen((execSessionFailureCallbackCommand) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 9:
                    ((Integer) obj2).getClass();
                    TaskStatusIndicatorKt.write((fieldToDouble) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 10:
                    ((Integer) obj2).getClass();
                    NavigationSettingsDialogKt.NavigationSettingsDialog((r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 11:
                    ((Integer) obj2).getClass();
                    AppearanceScreenKt.AppearanceScreen((AppearanceViewModel) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 12:
                    ((Integer) obj2).getClass();
                    ChatLanguageSelectorScreenKt.ChatLanguageSelectorScreen((r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 13:
                    ((Integer) obj2).getClass();
                    PhotoIdPreviewContentKt.RemoteActionCompatParcelizer((_set_registeredPushToken_lambda1) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 14:
                    ((Integer) obj2).intValue();
                    PhotoIdPreviewContentKt.PhotoIdPreviewContent((_set_registeredPushToken_lambda10) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                case 15:
                    ((Integer) obj2).getClass();
                    lambda37.IconCompatParcelizer((lambda310) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
                default:
                    ((Integer) obj2).getClass();
                    PolicyItemWithHyperLinkKt.PolicyItem((logPushNotificationOpenedlambda10) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createfromparcel;
            }
        }
        int i6 = this.RemoteActionCompatParcelizer;
        createfromparcel = createFromParcel.INSTANCE;
        i = this.serializer;
        obj3 = this.read;
        obj4 = this.IconCompatParcelizer;
        int i7 = 97 / 0;
        switch (i6) {
            case 0:
                ((Integer) obj2).getClass();
                GreetingContentKt.serializer((r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 1:
                ((Integer) obj2).getClass();
                OnDemandOutsideActiveAreaKt.OnDemandOutsideActiveAreaContent((setOnThirdPartySharingSettingsReadListener) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 2:
                ((Integer) obj2).getClass();
                OnPauseScreenKt.OnPauseScreen((OnPauseUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                BannerKt.Banner((buildInstallReferrerSdkClickPackage) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                i2 = MediaSessionCompatQueueItem + 53;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 4:
                ((Integer) obj2).getClass();
                QuestListKt.QuestList((QuestListUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 5:
                ((Integer) obj2).getClass();
                RefreshStateContentKt.RefreshStateContent((generateSendingParametersI) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 6:
                ((Integer) obj2).getClass();
                ShiftExtensionKt.ShiftExtension((invokeMethod) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 7:
                ((Integer) obj2).getClass();
                SuspensionScreenKt.SuspensionScreen((SuspensionUiModel) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                EmptyScreenKt.EmptyScreen((execSessionFailureCallbackCommand) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                TaskStatusIndicatorKt.write((fieldToDouble) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                NavigationSettingsDialogKt.NavigationSettingsDialog((r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 11:
                ((Integer) obj2).getClass();
                AppearanceScreenKt.AppearanceScreen((AppearanceViewModel) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                ChatLanguageSelectorScreenKt.ChatLanguageSelectorScreen((r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 13:
                ((Integer) obj2).getClass();
                PhotoIdPreviewContentKt.RemoteActionCompatParcelizer((_set_registeredPushToken_lambda1) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 14:
                ((Integer) obj2).intValue();
                PhotoIdPreviewContentKt.PhotoIdPreviewContent((_set_registeredPushToken_lambda10) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            case 15:
                ((Integer) obj2).getClass();
                lambda37.IconCompatParcelizer((lambda310) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
            default:
                ((Integer) obj2).getClass();
                PolicyItemWithHyperLinkKt.PolicyItem((logPushNotificationOpenedlambda10) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                return createfromparcel;
        }
    }
}
