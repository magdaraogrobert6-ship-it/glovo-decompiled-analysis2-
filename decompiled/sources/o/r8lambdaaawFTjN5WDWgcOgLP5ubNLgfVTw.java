package o;

import com.roadrunner.delivery.accept.declinebutton.presentation.DeclineButtonContentKt;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageModalBottomSheetKt;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageSentCardKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.navigation.presentation.compose.NavigationCrowdsourcingKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.ContentSharingContentKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.PhotoSharedSuccessDialogKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.delivery.ontheway.entrancepicture.navigation.presentation.NavigationEntrancePictureKt;
import com.roadrunner.delivery.stacked.delivery.details.ui.compose.StackedDeliveryDetailsHeaderKt;
import com.roadrunner.opportunities.calendar.entrypoint.BonusCalendarButtonKt;
import com.roadrunner.rider.safety.permission.presentation.result.PermissionResultContentKt;
import com.roadrunner.settings.ui.components.SignOutKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, int i2) {
        this.write = i2;
        this.read = modifier;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = modifier;
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[PHI: r2 r3 r4 r5 r7
  0x003e: PHI (r2v17 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r3v16 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r4v16 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r5v16 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r7v24 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[PHI: r2 r3 r4 r5 r7
  0x0048: PHI (r2v16 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r3v15 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r4v15 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r5v15 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r7v23 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0052 A[PHI: r2 r3 r4 r5 r7
  0x0052: PHI (r2v15 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r3v14 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r4v14 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v14 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r7v22 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005c A[PHI: r2 r3 r4 r5 r7
  0x005c: PHI (r2v14 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r3v13 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r4v13 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r5v13 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r7v21 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0066 A[PHI: r2 r3 r4 r5 r7
  0x0066: PHI (r2v13 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r3v12 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r4v12 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r5v12 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r7v17 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0079 A[PHI: r2 r3 r4 r5 r7
  0x0079: PHI (r2v12 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r3v11 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r4v11 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r5v11 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r7v16 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0083 A[PHI: r2 r3 r4 r5 r7
  0x0083: PHI (r2v11 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r3v10 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r4v10 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r5v10 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r7v15 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x008d A[PHI: r2 r3 r4 r5 r7
  0x008d: PHI (r2v10 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r3v9 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r4v9 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r5v9 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x008d: PHI (r7v14 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0097 A[PHI: r2 r3 r4 r5 r7
  0x0097: PHI (r2v9 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r3v8 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r4v8 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r5v8 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r7v13 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[PHI: r2 r3 r4 r5 r7
  0x00a1: PHI (r2v8 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r3v7 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r4v7 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r5v7 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r7v12 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[PHI: r2 r3 r4 r5 r7
  0x00ab: PHI (r2v7 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r3v6 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r4v6 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r5v6 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r7v7 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[PHI: r2 r3 r4 r5 r7
  0x00c5: PHI (r2v6 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r3v5 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r4v5 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r5v5 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r7v6 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[PHI: r2 r3 r4 r5 r7
  0x00cf: PHI (r2v5 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r3v4 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r4v4 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r5v4 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r7v5 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[PHI: r2 r3 r4 r5 r7
  0x00d9: PHI (r2v4 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r3v3 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r4v3 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r5v3 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00d9: PHI (r7v4 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[PHI: r2 r3 r4 r5 r7
  0x00e3: PHI (r2v3 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r3v2 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r4v2 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r5v2 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r7v3 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed A[PHI: r2 r3 r4 r5 r7
  0x00ed: PHI (r2v2 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v18 o.createFromParcel) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r3v1 int) = (r3v0 int), (r3v17 int) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r4v1 androidx.compose.ui.Modifier) = (r4v0 androidx.compose.ui.Modifier), (r4v17 androidx.compose.ui.Modifier) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r5v1 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) = (r5v0 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0), (r5v17 o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r7v2 o.getBirthDateFull) = (r7v1 o.getBirthDateFull), (r7v25 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        createFromParcel createfromparcel;
        int i;
        androidx.compose.ui.Modifier modifier;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        getBirthDateFull getbirthdatefull;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaDescriptionCompat + 93;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = this.write;
            createfromparcel = createFromParcel.INSTANCE;
            i = this.IconCompatParcelizer;
            modifier = this.read;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            ((Integer) obj2).getClass();
            switch (i5) {
                case 0:
                    SignOutKt.SignOut(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 1:
                    lerpTextUnitInheritableC3pnCVY.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 2:
                    DeclineButtonContentKt.RemoteActionCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 3:
                    TextLayoutGetRangeForRectExtensions_androidKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 4:
                    OrderItemsBottomSheetKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    i2 = MediaDescriptionCompat + 25;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 5:
                    ActionableMessageModalBottomSheetKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 6:
                    ActionableMessageSentCardKt.SuccessAnimation(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 7:
                    NavigationCrowdsourcingKt.read(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 8:
                    ContentSharingContentKt.AddMoreImageCell(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 9:
                    PhotoSharedSuccessDialogKt.SuccessLottie(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 10:
                    EntrancePictureScreenKt.Header(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    int i6 = MediaDescriptionCompat + 5;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return createfromparcel;
                case 11:
                    NavigationEntrancePictureKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 12:
                    getSpanUnitR2X_6o.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 13:
                    StackedDeliveryDetailsHeaderKt.StackedDeliveryDetailsHeader(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                case 14:
                    BonusCalendarButtonKt.BonusCalendarButton(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
                default:
                    PermissionResultContentKt.PermissionResultContent(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    return createfromparcel;
            }
        }
        int i8 = this.write;
        createfromparcel = createFromParcel.INSTANCE;
        i = this.IconCompatParcelizer;
        modifier = this.read;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
        getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        int i9 = 62 / 0;
        switch (i8) {
            case 0:
                SignOutKt.SignOut(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 1:
                lerpTextUnitInheritableC3pnCVY.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 2:
                DeclineButtonContentKt.RemoteActionCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 3:
                TextLayoutGetRangeForRectExtensions_androidKt.write(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 4:
                OrderItemsBottomSheetKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                i2 = MediaDescriptionCompat + 25;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return createfromparcel;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            case 5:
                ActionableMessageModalBottomSheetKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 6:
                ActionableMessageSentCardKt.SuccessAnimation(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 7:
                NavigationCrowdsourcingKt.read(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 8:
                ContentSharingContentKt.AddMoreImageCell(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 9:
                PhotoSharedSuccessDialogKt.SuccessLottie(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 10:
                EntrancePictureScreenKt.Header(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                int i10 = MediaDescriptionCompat + 5;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return createfromparcel;
            case 11:
                NavigationEntrancePictureKt.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 12:
                getSpanUnitR2X_6o.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 13:
                StackedDeliveryDetailsHeaderKt.StackedDeliveryDetailsHeader(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            case 14:
                BonusCalendarButtonKt.BonusCalendarButton(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
            default:
                PermissionResultContentKt.PermissionResultContent(ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), getbirthdatefull, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return createfromparcel;
        }
    }
}
