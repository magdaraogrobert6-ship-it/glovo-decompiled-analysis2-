package io.sentry.compose.viewhierarchy;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import io.sentry.compose.serializer;
import io.sentry.protocol.fullyDrawnReporter_delegatelambda00;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda4;
import o.onCreateVirtualViewTranslationRequests;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeViewHierarchyExporter {
    public final BrazeActionParserExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public volatile serializer read;
    public final RemoteActionCompatParcelizer write;

    public ComposeViewHierarchyExporter(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        brazeActionParserExternalSyntheticLambda0.getClass();
        this.RemoteActionCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
        this.write = new RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean IconCompatParcelizer(fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00, View view) {
        if (!(view instanceof Owner)) {
            return false;
        }
        if (this.read == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
            try {
                if (this.read == null) {
                    this.read = new serializer(this.RemoteActionCompatParcelizer);
                }
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                    throw th2;
                }
            }
        }
        LayoutNode root = ((Owner) view).getRoot();
        serializer serializerVar = this.read;
        serializerVar.getClass();
        read(serializerVar, fullydrawnreporter_delegatelambda00, root);
        return true;
    }

    public static void read(serializer serializerVar, fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00, LayoutNode layoutNode) {
        if (layoutNode.isPlaced()) {
            fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda01 = new fullyDrawnReporter_delegatelambda00();
            Iterator<ModifierInfo> it = layoutNode.getModifierInfo().iterator();
            while (it.hasNext()) {
                String strSerializer = serializerVar.serializer(it.next().getModifier());
                if (strSerializer != null) {
                    fullydrawnreporter_delegatelambda01.MediaDescriptionCompat = strSerializer;
                }
            }
            Rect rectBoundsInParent = LayoutCoordinatesKt.boundsInParent(layoutNode.getCoordinates());
            fullydrawnreporter_delegatelambda01.ParcelableVolumeInfo = Double.valueOf(rectBoundsInParent.getLeft());
            fullydrawnreporter_delegatelambda01.MediaSessionCompatToken = Double.valueOf(rectBoundsInParent.getTop());
            fullydrawnreporter_delegatelambda01.read = Double.valueOf(rectBoundsInParent.getBottom() - rectBoundsInParent.getTop());
            fullydrawnreporter_delegatelambda01.MediaBrowserCompatMediaItem = Double.valueOf(rectBoundsInParent.getRight() - rectBoundsInParent.getLeft());
            String str = fullydrawnreporter_delegatelambda01.MediaDescriptionCompat;
            if (str == null) {
                str = "@Composable";
            }
            fullydrawnreporter_delegatelambda01.RatingCompat = str;
            if (fullydrawnreporter_delegatelambda00.IconCompatParcelizer == null) {
                fullydrawnreporter_delegatelambda00.IconCompatParcelizer = new ArrayList();
            }
            List list = fullydrawnreporter_delegatelambda00.IconCompatParcelizer;
            list.getClass();
            list.add(fullydrawnreporter_delegatelambda01);
            onCreateVirtualViewTranslationRequests zSortedChildren = layoutNode.getZSortedChildren();
            int i = zSortedChildren.read;
            for (int i2 = 0; i2 < i; i2++) {
                read(serializerVar, fullydrawnreporter_delegatelambda01, (LayoutNode) zSortedChildren.write[i2]);
            }
        }
    }
}
