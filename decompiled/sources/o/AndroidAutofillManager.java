package o;

import com.roadrunner.biometrics.presentation.compose.BiometricContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionBottomSheetContentKt;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionLocationContentKt;
import com.roadrunner.diagnostics.presentation.view.CheckStatusKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;
import io.socket.emitter.Emitter;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidAutofillManager implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ AndroidAutofillManager(saveLayerAlpha savelayeralpha, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i2) {
        this.read = 9;
        this.IconCompatParcelizer = savelayeralpha;
        this.serializer = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(onRelease onrelease, Object obj, int i, Object obj2, int i2) {
        this.read = 2;
        this.IconCompatParcelizer = onrelease;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = i;
        this.write = obj2;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(androidx.compose.ui.Modifier modifier, BasicTextFieldKt basicTextFieldKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, int i2) {
        this.read = 1;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = basicTextFieldKt;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(int i, Object obj, Object obj2, androidx.compose.ui.Modifier modifier, int i2, int i3) {
        this.read = i3;
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(Object obj, int i, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i2) {
        this.read = 3;
        this.IconCompatParcelizer = obj;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = lazyLayoutPinnedItemList;
        this.write = dragAndDropTargetModifierNode;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(Object obj, Object obj2, androidx.compose.ui.Modifier modifier, int i, int i2, int i3) {
        this.read = i3;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.RemoteActionCompatParcelizer = modifier;
        this.serializer = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.read = i3;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.write = obj3;
        this.serializer = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ AndroidAutofillManager(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, int i2) {
        this.read = 4;
        this.write = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = i;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        int i3 = this.MediaMetadataCompat;
        int i4 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = this.write;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                androidx.compose.material3.SnackbarHostKt.read((androidx.compose.material3.SnackbarHostState) obj3, (androidx.compose.ui.Modifier) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                return createfromparcel;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.contextmenu.ContextMenuUiKt.write((androidx.compose.ui.Modifier) obj4, (BasicTextFieldKt) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                return createfromparcel;
            case 2:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                moveTodefault.serializer((onRelease) obj3, this.RemoteActionCompatParcelizer, this.serializer, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                int i5 = MediaSessionCompatQueueItem + 31;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 63 / 0;
                }
                return createfromparcel;
            case 3:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                recordGeofenceTransitionlambda0.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.serializer, (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList) obj4, (DragAndDropTargetModifierNode) obj5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                return createfromparcel;
            case 4:
                int iIntValue = ((Integer) obj2).intValue();
                return androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding$lambda$1((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (androidx.compose.ui.Modifier) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.serializer, this.MediaMetadataCompat, (getBirthDateFull) obj, iIntValue);
            case 5:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
                RangesKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (accessisRenderNodeCompatiblecp) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.MediaMetadataCompat);
                return createfromparcel;
            case 6:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                BiometricContentKt.BiometricInformation(this.serializer, (String) obj3, (String) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4);
                return createfromparcel;
            case 7:
                ((Integer) obj2).getClass();
                SingleEarningsContentKt.serializer((accesssetStaticLayoutConstructorcp) obj3, (androidx.compose.ui.Modifier) obj4, (SwitchKt) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                return createfromparcel;
            case 8:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                LastStopSelectionBottomSheetContentKt.RecentLocationItem(this.serializer, (getDrawFilter) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer5);
                return createfromparcel;
            case 9:
                ((Integer) obj2).getClass();
                int iRemoteActionCompatParcelizer6 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                LastStopSelectionLocationContentKt.LastStopSelectionLocationContent((saveLayerAlpha) obj3, this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer6);
                return createfromparcel;
            case 10:
                ((Integer) obj2).getClass();
                CheckStatusKt.CheckStatus((Emitter) obj3, (androidx.compose.ui.Modifier) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                int i7 = RatingCompat + 83;
                MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 11:
                ((Integer) obj2).getClass();
                TertiaryKt.RemoteActionCompatParcelizer((String) obj3, (androidx.compose.ui.text.TextStyle) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                return createfromparcel;
            case 12:
                ((Integer) obj2).getClass();
                BadgeKt.RemoteActionCompatParcelizer((IconButtonKt) obj3, (String) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                int i8 = MediaSessionCompatQueueItem + 119;
                RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            default:
                ((Integer) obj2).getClass();
                AdjustBridgeInstance.IconCompatParcelizer((androidx.compose.material3.SnackbarHostState) obj3, (onViewAttachedToWindow) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), this.MediaMetadataCompat);
                return createfromparcel;
        }
    }
}
