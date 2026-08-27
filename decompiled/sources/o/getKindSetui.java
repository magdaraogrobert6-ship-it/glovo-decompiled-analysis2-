package o;

import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderButtonsKt;
import com.roadrunner.recentdeliveries.presentation.components.CollapsedDeliveryKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getKindSetui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getKindSetui(androidx.compose.ui.Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = modifier;
        this.read = dragAndDropTargetModifierNode;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.serializer;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.read;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        switch (i2) {
            case 0:
                androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 1:
                accessmaterializeImpl.write(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 2:
                accessmaterializeImpl.RemoteActionCompatParcelizer(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 3:
                materialize.IconCompatParcelizer(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            case 4:
                androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i4 = IconCompatParcelizer + 65;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel;
            case 5:
                androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                int i6 = IconCompatParcelizer + 59;
                MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return createfromparcel;
            case 6:
                DestinationHeaderButtonsKt.HeaderButtonContainer(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
            default:
                CollapsedDeliveryKt.Circle(modifier, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
                return createfromparcel;
        }
    }
}
