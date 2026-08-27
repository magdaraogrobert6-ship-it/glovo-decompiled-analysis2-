package com.roadrunner.map.container.enabled.presentation;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.ExtensionWindowAreaStatusRequirements;
import o.M;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.e1;
import o.endRearDisplayPresentationSession;
import o.f8;
import o.fe;
import o.ff;
import o.ffExternalSyntheticLambda2;
import o.ffExternalSyntheticOutline0;
import o.fg;
import o.fh;
import o.g0ExternalSyntheticLambda1;
import o.g3;
import o.g6;
import o.gExternalSyntheticLambda0;
import o.gExternalSyntheticLambda1;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.getRearDisplayPresentation;
import o.getWindowAreaDisplayMetrics;
import o.getWindowAreaStatus;
import o.h5;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MapboxFragment$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ MapboxFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ MapboxFragment$$ExternalSyntheticLambda0(MapboxFragment mapboxFragment, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = mapboxFragment;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00eb  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object obj2;
        Iterator it;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxFragment mapboxFragment = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            CompassSettings.Builder builder = (CompassSettings.Builder) obj;
            builder.getClass();
            M m = mapboxFragment.IconCompatParcelizer;
            if (m == null) {
                removeNodeAtDepth.serializer("getCompassMargin");
                throw null;
            }
            float f = mapboxFragment.ParcelableVolumeInfo;
            setTransactionSuccessful settransactionsuccessful = m.IconCompatParcelizer;
            Application application = settransactionsuccessful.RemoteActionCompatParcelizer;
            Application application2 = settransactionsuccessful.RemoteActionCompatParcelizer;
            float dimensionPixelSize = application.getResources().getDimensionPixelSize(R.dimen.layout_spacing_05);
            float dimensionPixelSize2 = application2.getResources().getDimensionPixelSize(R.dimen.component_dimension_button_floating_icon_width);
            float dimensionPixelSize3 = application2.getResources().getDimensionPixelSize(R.dimen.layout_spacing_04);
            float dimensionPixelSize4 = application2.getResources().getDimensionPixelSize(R.dimen.layout_spacing_06);
            builder.marginTop = (dimensionPixelSize3 * 2.0f) + (dimensionPixelSize2 * 2.0f) + f + dimensionPixelSize;
            builder.marginRight = dimensionPixelSize4;
            return createfromparcel;
        }
        e1 e1Var = (e1) obj;
        e1Var.getClass();
        if (e1Var instanceof e1) {
            int i3 = write + 109;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ComponentRegistry$Builder componentRegistry$Builder = mapboxFragment.MediaDescriptionCompat;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            ComponentRegistry$Builder componentRegistry$Builder2 = mapboxFragment.MediaDescriptionCompat;
            if (componentRegistry$Builder2 == null) {
                return createfromparcel;
            }
            ArrayList arrayList = e1Var.read;
            g6 g6Var = e1Var.RemoteActionCompatParcelizer;
            double d = e1Var.IconCompatParcelizer;
            boolean z = e1Var.write;
            g6Var.getClass();
            h5 h5Var = (h5) componentRegistry$Builder2.RemoteActionCompatParcelizer;
            Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    ((g3) componentRegistry$Builder2.serializer).RemoteActionCompatParcelizer(arrayList2, g6Var, d, z);
                    return createfromparcel;
                }
                fe feVar = (fe) it2.next();
                boolean z2 = feVar instanceof ffExternalSyntheticOutline0;
                Iterable iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = instance_delegatelambda0.write;
                if (z2) {
                    it = it2;
                } else if (!(!(feVar instanceof fg))) {
                    it = it2;
                    List list = ((fg) feVar).IconCompatParcelizer;
                    iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = SQLite.read((f8) onContentCardDismissed.read(list), (f8) onContentCardDismissed.MediaDescriptionCompat(list));
                } else if (feVar instanceof g0ExternalSyntheticLambda1) {
                    getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) h5Var.read.serializer.read();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwindowareadisplaymetrics, getWindowAreaStatus.read}, getCieXyz.write())).booleanValue()) {
                        if (!(getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession)) {
                            it = it2;
                            if (!(getwindowareadisplaymetrics instanceof getRearDisplayPresentation)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                break;
                            }
                            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = ((getRearDisplayPresentation) getwindowareadisplaymetrics).RemoteActionCompatParcelizer;
                            iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new f8(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        } else {
                            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements2 = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                            it = it2;
                            iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new f8(extensionWindowAreaStatusRequirements2.serializer, extensionWindowAreaStatusRequirements2.read)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        }
                    } else {
                        it = it2;
                    }
                } else {
                    it = it2;
                    if (feVar instanceof gExternalSyntheticLambda0) {
                        iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{((gExternalSyntheticLambda0) feVar).MediaDescriptionCompat}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    } else if (feVar instanceof gExternalSyntheticLambda1) {
                        iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = ((gExternalSyntheticLambda1) feVar).MediaSessionCompatQueueItem;
                    } else if (!(!(feVar instanceof ff))) {
                        int i4 = IconCompatParcelizer + 89;
                        write = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(((ff) feVar).read);
                            throw null;
                        }
                        iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(((ff) feVar).read);
                    } else if (!(feVar instanceof fh)) {
                        if (!(feVar instanceof ffExternalSyntheticLambda2)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            break;
                        }
                        iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{((ffExternalSyntheticLambda2) feVar).write}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    } else {
                        iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{((fh) feVar).write}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        int i5 = IconCompatParcelizer + 73;
                        write = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    }
                }
                onContentCardDismissed.RemoteActionCompatParcelizer(iterableR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, (Collection) arrayList2);
                it2 = it;
            }
            obj2 = null;
        } else {
            obj2 = null;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        return obj2;
    }
}
