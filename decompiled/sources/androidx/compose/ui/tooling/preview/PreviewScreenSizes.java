package androidx.compose.ui.tooling.preview;

import androidx.compose.ui.text.android.LayoutCompat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Preview.Container({@Preview(device = Devices.PHONE, name = "Phone", showSystemUi = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING), @Preview(device = "spec:width=411dp,height=891dp,orientation=landscape,dpi=420", name = "Phone - Landscape", showSystemUi = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING), @Preview(device = Devices.FOLDABLE, name = "Unfolded Foldable", showSystemUi = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING), @Preview(device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait", name = "Tablet", showSystemUi = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING), @Preview(device = Devices.TABLET, name = "Tablet - Landscape", showSystemUi = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING), @Preview(device = Devices.DESKTOP, name = "Desktop", showSystemUi = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface PreviewScreenSizes {
}
