package o;

import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.settings.ui.components.PreferenceItemKt;
import com.roadrunner.sidemenu.menuitems.MenuItemContentKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AccessibilityUtilKt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public final /* synthetic */ Object PlaybackStateCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ AccessibilityUtilKt(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, SwitchKt switchKt, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, constructorimpl constructorimplVar, boolean z, isNotGestureActionfoundation isnotgestureactionfoundation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, int i2) {
        this.serializer = modifier;
        this.read = lazyListState;
        this.MediaBrowserCompatMediaItem = switchKt;
        this.MediaSessionCompatQueueItem = vertical;
        this.RatingCompat = horizontal;
        this.MediaMetadataCompat = constructorimplVar;
        this.MediaDescriptionCompat = z;
        this.ParcelableVolumeInfo = isnotgestureactionfoundation;
        this.PlaybackStateCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ AccessibilityUtilKt(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Integer num, String str2, boolean z, String str3, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        this.read = annotatedString;
        this.serializer = modifier;
        this.MediaBrowserCompatMediaItem = str;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = num;
        this.MediaMetadataCompat = str2;
        this.MediaDescriptionCompat = z;
        this.ParcelableVolumeInfo = str3;
        this.PlaybackStateCompat = dragAndDropTargetModifierNode;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ AccessibilityUtilKt(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, int i, int i2) {
        this.read = generatepostbodystring;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.MediaDescriptionCompat = z;
        this.MediaSessionCompatQueueItem = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.ParcelableVolumeInfo = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.PlaybackStateCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ AccessibilityUtilKt(String str, String str2, r8lambdav9lEwuigriKPLoepmU9DzDAsGns r8lambdav9lewuigrikploepmu9dzdasgns, String str3, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, Integer num, String str4, int i, int i2) {
        this.read = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.MediaSessionCompatQueueItem = r8lambdav9lewuigrikploepmu9dzdasgns;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = z;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.ParcelableVolumeInfo = num;
        this.PlaybackStateCompat = str4;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.write;
        Object obj3 = this.PlaybackStateCompat;
        Object obj4 = this.ParcelableVolumeInfo;
        Object obj5 = this.MediaMetadataCompat;
        Object obj6 = this.RatingCompat;
        Object obj7 = this.MediaSessionCompatQueueItem;
        Object obj8 = this.MediaBrowserCompatMediaItem;
        Object obj9 = this.read;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(this.serializer, (androidx.compose.foundation.lazy.LazyListState) obj9, (SwitchKt) obj8, (androidx.compose.foundation.layout.Arrangement.Vertical) obj7, (androidx.compose.ui.Alignment.Horizontal) obj6, (constructorimpl) obj5, this.MediaDescriptionCompat, (isNotGestureActionfoundation) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            MessagePopUpKt.serializer((generatePOSTBodyString) obj9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, this.serializer, this.MediaDescriptionCompat, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.RemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i2 != 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            MenuItemContentKt.MenuItem((String) obj9, (String) obj8, (r8lambdav9lEwuigriKPLoepmU9DzDAsGns) obj7, (String) obj6, this.MediaDescriptionCompat, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, this.serializer, (Integer) obj4, (String) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.RemoteActionCompatParcelizer);
            int i4 = MediaSessionCompatToken + 29;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        PreferenceItemKt.PreferenceItem((androidx.compose.ui.text.AnnotatedString) obj9, this.serializer, (String) obj8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7, (Integer) obj6, (String) obj5, this.MediaDescriptionCompat, (String) obj4, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4, this.RemoteActionCompatParcelizer);
        int i6 = MediaSessionCompatToken + 101;
        MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        Object obj10 = null;
        obj10.hashCode();
        throw null;
    }
}
