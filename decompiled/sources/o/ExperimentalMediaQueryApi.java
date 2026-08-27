package o;

import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;

/* JADX INFO: loaded from: classes.dex */
public final class ExperimentalMediaQueryApi implements hashCodeimpl {
    public final /* synthetic */ ExperimentalComposeUiApi IconCompatParcelizer;
    public final long serializer;

    @Override // o.hashCodeimpl
    public final long IconCompatParcelizer(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = (androidx.compose.ui.layout.LayoutCoordinates) ((onShowTranslationui) this.IconCompatParcelizer.RemoteActionCompatParcelizer).getValue();
        if (layoutCoordinates2 != null) {
            return layoutCoordinates.mo2218localPositionOfR5De75A(layoutCoordinates2, this.serializer);
        }
        TriStateCheckbox.IconCompatParcelizer("Tried to open context menu before the anchor was placed.");
        DrawableTransformation.read();
        return 0L;
    }

    @Override // o.hashCodeimpl
    public final any serializer() {
        return zzpc.collectTextContextMenuData(this.IconCompatParcelizer);
    }

    public ExperimentalMediaQueryApi(ExperimentalComposeUiApi experimentalComposeUiApi, long j) {
        this.IconCompatParcelizer = experimentalComposeUiApi;
        this.serializer = j;
    }

    @Override // o.hashCodeimpl
    public final androidx.compose.ui.geometry.Rect RemoteActionCompatParcelizer(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return androidx.compose.ui.geometry.RectKt.m517Recttz77jQw(IconCompatParcelizer(layoutCoordinates), androidx.compose.ui.geometry.Size.Companion.m555getZeroNHjbRc());
    }
}
